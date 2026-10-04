package com.huawei.hms.common;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.hms.adapter.BinderAdapter;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.Api.ApiOptions;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.common.internal.BaseHmsClient;
import com.huawei.hms.common.internal.BindResolveClients;
import com.huawei.hms.common.internal.ClientSettings;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.RequestHeader;
import com.huawei.hms.common.internal.RequestManager;
import com.huawei.hms.common.internal.ResolveClientBean;
import com.huawei.hms.common.internal.ResponseHeader;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.common.internal.TaskApiCallWrapper;
import com.huawei.hms.common.internal.TransactionIdCreater;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.InterfaceC17759d;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.hianalytics.C18472b;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.HMSBIInitializer;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.Util;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import o0O00OOO.C25834OooO0oO;
import o0O00OOO.OooO0o;
import o0O00Oo.C25840OooO0oo;

/* JADX INFO: loaded from: classes6.dex */
public class HuaweiApi<TOption extends Api.ApiOptions> {
    private static final String TAG = "HuaweiApi";
    private String innerHmsPkg;
    private boolean isUseInnerHms;
    private WeakReference<Activity> mActivity;
    private String mAppID;
    private AbstractClientBuilder<?, TOption> mClientBuilder;
    private Context mContext;
    private String mHostAppid;
    private int mKitSdkVersion;
    private TOption mOption;
    private SubAppInfo mSubAppInfo;
    private RequestManager requestManager;
    private int apiLevel = 1;
    private boolean isFirstReqSent = false;

    public class RequestHandler<OptionsT extends Api.ApiOptions> implements BaseHmsClient.ConnectionCallbacks, BaseHmsClient.OnConnectionFailedListener {
        private final HuaweiApi<OptionsT> mApi;
        private final AnyClient mClient;
        private ResolveClientBean mResolveClientBean;
        public final Queue<TaskApiCallbackWrapper> callbackWaitQueue = new LinkedList();
        private final Queue<TaskApiCallbackWrapper> callbackRunQueue = new LinkedList();
        private ConnectionResult mConnectionResult = null;

        public RequestHandler(HuaweiApi<OptionsT> huaweiApi) {
            this.mApi = huaweiApi;
            this.mClient = huaweiApi.getClient(null, this);
        }

        private String errorReason(ConnectionResult connectionResult) {
            if (!Util.isAvailableLibExist(this.mApi.getContext())) {
                int errorCode = connectionResult.getErrorCode();
                return errorCode != -1 ? errorCode != 8 ? errorCode != 10 ? "unknown errorReason" : "application configuration error, please developer check configuration" : "internal error" : "get update result, but has other error codes";
            }
            int errorCode2 = connectionResult.getErrorCode();
            if (errorCode2 == -1) {
                return "get update result, but has other error codes";
            }
            if (errorCode2 == 3) {
                return "HuaWei Mobile Service is disabled";
            }
            if (errorCode2 == 8) {
                return "internal error";
            }
            if (errorCode2 == 10) {
                return "application configuration error, please developer check configuration";
            }
            if (errorCode2 == 13) {
                return "update cancelled";
            }
            if (errorCode2 == 21) {
                return "device is too old to be support";
            }
            switch (errorCode2) {
                case 25:
                    return "failed to get update result";
                case 26:
                    return "update failed, because no activity incoming, can't pop update page";
                case 27:
                    return "there is already an update popup at the front desk, but it hasn't been clicked or it is not effective for a while";
                default:
                    return "unknown errorReason";
            }
        }

        private String getTransactionId(String str, String str2) {
            return TextUtils.isEmpty(str) ? TransactionIdCreater.getId(this.mApi.getAppID(), str2) : str;
        }

        private void innerConnected() {
            this.mConnectionResult = null;
            this.callbackRunQueue.clear();
            Iterator<TaskApiCallbackWrapper> it = this.callbackWaitQueue.iterator();
            while (it.hasNext()) {
                postMessage(it.next());
            }
            this.callbackWaitQueue.clear();
        }

        private void innerConnectionFailed(ConnectionResult connectionResult) {
            this.mConnectionResult = connectionResult;
            Iterator<TaskApiCallbackWrapper> it = this.callbackWaitQueue.iterator();
            boolean z = true;
            while (it.hasNext()) {
                TaskApiCallWrapper apiCallWrapper = it.next().getApiCallWrapper();
                ResponseHeader responseHeader = new ResponseHeader(1, CommonCode.ErrorCode.CLIENT_API_INVALID, "Connection Failed:" + errorReason(connectionResult) + "(" + connectionResult.getErrorCode() + ")");
                responseHeader.setTransactionId(apiCallWrapper.getTaskApiCall().getTransactionId());
                C18472b.m80116a(this.mApi.getContext(), responseHeader, String.valueOf(this.mApi.getKitSdkVersion()));
                if (this.mConnectionResult.getResolution() != null && z) {
                    responseHeader.setParcelable(this.mConnectionResult.getResolution());
                    if (Util.isAvailableLibExist(this.mApi.getContext()) && this.mConnectionResult.getErrorCode() == 26) {
                        responseHeader.setResolution(CommonCode.Resolution.HAS_RESOLUTION);
                    }
                    z = false;
                }
                int errorCode = this.mConnectionResult.getErrorCode();
                if (errorCode == 30 || errorCode == 31) {
                    responseHeader.setErrorCode(errorCode);
                }
                apiCallWrapper.getTaskApiCall().onResponse(this.mClient, responseHeader, null, apiCallWrapper.getTaskCompletionSource());
            }
            this.callbackWaitQueue.clear();
            this.callbackRunQueue.clear();
            this.mConnectionResult = null;
            this.mClient.disconnect();
        }

        private void innerConnectionSuspended() {
            HMSLog.m80174i(HuaweiApi.TAG, "wait queue size = " + this.callbackWaitQueue.size());
            HMSLog.m80174i(HuaweiApi.TAG, "run queue size = " + this.callbackRunQueue.size());
            Iterator<TaskApiCallbackWrapper> it = this.callbackWaitQueue.iterator();
            while (it.hasNext()) {
                sendConnectionSuspended(it.next());
            }
            Iterator<TaskApiCallbackWrapper> it2 = this.callbackRunQueue.iterator();
            while (it2.hasNext()) {
                sendConnectionSuspended(it2.next());
            }
            this.callbackWaitQueue.clear();
            this.callbackRunQueue.clear();
            this.mConnectionResult = null;
            this.mClient.disconnect();
        }

        private void sendConnectionSuspended(TaskApiCallbackWrapper taskApiCallbackWrapper) {
            TaskApiCallWrapper apiCallWrapper = taskApiCallbackWrapper.getApiCallWrapper();
            ResponseHeader responseHeader = new ResponseHeader(1, CommonCode.ErrorCode.CLIENT_API_INVALID, "Connection Suspended");
            responseHeader.setTransactionId(apiCallWrapper.getTaskApiCall().getTransactionId());
            apiCallWrapper.getTaskApiCall().onResponse(this.mClient, responseHeader, null, apiCallWrapper.getTaskCompletionSource());
        }

        private TaskApiCallbackWrapper wrapperRequest(final TaskApiCallWrapper taskApiCallWrapper) {
            return new TaskApiCallbackWrapper(taskApiCallWrapper, new AnyClient.CallBack() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.1
                private AtomicBoolean isFirstRsp = new AtomicBoolean(true);

                @Override // com.huawei.hms.common.internal.AnyClient.CallBack
                public void onCallback(IMessageEntity iMessageEntity, String str) {
                    if (!(iMessageEntity instanceof ResponseHeader)) {
                        HMSLog.m80172e(HuaweiApi.TAG, "header is not instance of ResponseHeader");
                        return;
                    }
                    ResponseHeader responseHeader = (ResponseHeader) iMessageEntity;
                    if (responseHeader.getErrorCode() == 11) {
                        RequestHandler.this.disconnect();
                        HMSLog.m80174i(HuaweiApi.TAG, "unbind service");
                    }
                    if (!TextUtils.isEmpty(responseHeader.getResolution())) {
                        HMSLog.m80172e(HuaweiApi.TAG, "Response has resolution: " + responseHeader.getResolution());
                    }
                    if (this.isFirstRsp.compareAndSet(true, false)) {
                        C18472b.m80116a(RequestHandler.this.mApi.getContext(), responseHeader, String.valueOf(RequestHandler.this.mApi.getKitSdkVersion()));
                    }
                    taskApiCallWrapper.getTaskApiCall().onResponse(RequestHandler.this.mClient, responseHeader, str, taskApiCallWrapper.getTaskCompletionSource());
                }
            });
        }

        public synchronized void connect(int i, TaskApiCallbackWrapper taskApiCallbackWrapper) {
            if (this.mClient.isConnected()) {
                HMSLog.m80169d(HuaweiApi.TAG, "client is connected");
                return;
            }
            if (this.mClient.isConnecting()) {
                HMSLog.m80169d(HuaweiApi.TAG, "client is isConnecting");
                return;
            }
            if (this.mApi.getActivity() != null) {
                if (this.mResolveClientBean == null) {
                    this.mResolveClientBean = new ResolveClientBean(this.mClient, i);
                }
                if (BindResolveClients.getInstance().isClientRegistered(this.mResolveClientBean)) {
                    HMSLog.m80174i(HuaweiApi.TAG, "mResolveClientBean has already register, return!");
                    return;
                }
                BindResolveClients.getInstance().register(this.mResolveClientBean);
            }
            this.mClient.connect(i);
        }

        public void disconnect() {
            this.mClient.disconnect();
        }

        public AnyClient getClient() {
            return this.mClient;
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.ConnectionCallbacks
        public void onConnected() {
            HMSLog.m80174i(HuaweiApi.TAG, "onConnected");
            BindResolveClients.getInstance().unRegister(this.mResolveClientBean);
            this.mResolveClientBean = null;
            innerConnected();
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.OnConnectionFailedListener
        public void onConnectionFailed(ConnectionResult connectionResult) {
            HMSLog.m80174i(HuaweiApi.TAG, "onConnectionFailed");
            BindResolveClients.getInstance().unRegister(this.mResolveClientBean);
            this.mResolveClientBean = null;
            innerConnectionFailed(connectionResult);
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.ConnectionCallbacks
        public void onConnectionSuspended(int i) {
            HMSLog.m80174i(HuaweiApi.TAG, "onConnectionSuspended");
            BindResolveClients.getInstance().unRegister(this.mResolveClientBean);
            this.mResolveClientBean = null;
            innerConnectionSuspended();
        }

        public void postMessage(final TaskApiCallbackWrapper taskApiCallbackWrapper) {
            RequestManager.addToConnectedReqMap(taskApiCallbackWrapper.getApiCallWrapper().getTaskApiCall().getTransactionId(), this);
            this.callbackRunQueue.add(taskApiCallbackWrapper);
            String uri = taskApiCallbackWrapper.getApiCallWrapper().getTaskApiCall().getUri();
            final RequestHeader requestHeader = new RequestHeader();
            requestHeader.setSrvName(uri.split("\\.")[0]);
            requestHeader.setApiName(uri);
            requestHeader.setAppID(this.mApi.getAppID() + "|" + this.mApi.getSubAppID());
            requestHeader.setPkgName(this.mApi.getContext().getPackageName());
            requestHeader.setSessionId(this.mClient.getSessionId());
            TaskApiCall taskApiCall = taskApiCallbackWrapper.getApiCallWrapper().getTaskApiCall();
            requestHeader.setTransactionId(getTransactionId(taskApiCall.getTransactionId(), uri));
            requestHeader.setParcelable(taskApiCall.getParcelable());
            requestHeader.setKitSdkVersion(this.mApi.getKitSdkVersion());
            requestHeader.setApiLevel(Math.max(this.mApi.getApiLevel(), taskApiCall.getApiLevel()));
            this.mClient.post(requestHeader, taskApiCall.getRequestJson(), new AnyClient.CallBack() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.2
                @Override // com.huawei.hms.common.internal.AnyClient.CallBack
                public void onCallback(IMessageEntity iMessageEntity, String str) {
                    AnyClient.CallBack callBack = taskApiCallbackWrapper.getCallBack();
                    if (callBack != null) {
                        callBack.onCallback(iMessageEntity, str);
                    }
                    RequestManager.removeReqByTransId(requestHeader.getTransactionId());
                    RequestHandler.this.callbackRunQueue.remove(taskApiCallbackWrapper);
                }
            });
        }

        public void sendRequest(TaskApiCallWrapper taskApiCallWrapper) {
            HMSLog.m80174i(HuaweiApi.TAG, "sendRequest");
            TaskApiCallbackWrapper taskApiCallbackWrapperWrapperRequest = wrapperRequest(taskApiCallWrapper);
            if (this.mClient.isConnected()) {
                HMSLog.m80174i(HuaweiApi.TAG, "isConnected:true.");
                BinderAdapter adapter = ((BaseHmsClient) this.mClient).getAdapter();
                adapter.updateDelayTask();
                ((HmsClient) this.mClient).setService(InterfaceC17759d.a.m75899a(adapter.getServiceBinder()));
                postMessage(taskApiCallbackWrapperWrapperRequest);
                return;
            }
            HMSLog.m80174i(HuaweiApi.TAG, "isConnected:false.");
            this.callbackWaitQueue.add(taskApiCallbackWrapperWrapperRequest);
            RequestManager.addRequestToQueue(this);
            ConnectionResult connectionResult = this.mConnectionResult;
            if (connectionResult == null || connectionResult.getErrorCode() == 0) {
                connect(taskApiCallWrapper.getTaskApiCall().getMinApkVersion(), taskApiCallbackWrapperWrapperRequest);
                return;
            }
            HMSLog.m80174i(HuaweiApi.TAG, "onConnectionFailed, ErrorCode:" + this.mConnectionResult.getErrorCode());
            onConnectionFailed(this.mConnectionResult);
        }
    }

    public static class TaskApiCallbackWrapper {
        private final TaskApiCallWrapper mApiCallWrapper;
        private final AnyClient.CallBack mCallBack;

        public TaskApiCallbackWrapper(TaskApiCallWrapper taskApiCallWrapper, AnyClient.CallBack callBack) {
            this.mApiCallWrapper = taskApiCallWrapper;
            this.mCallBack = callBack;
        }

        public TaskApiCallWrapper getApiCallWrapper() {
            return this.mApiCallWrapper;
        }

        public AnyClient.CallBack getCallBack() {
            return this.mCallBack;
        }
    }

    public HuaweiApi(Activity activity, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i) {
        Checker.checkNonNull(activity, "Null activity is not permitted.");
        this.mActivity = new WeakReference<>(activity);
        init(activity, api, toption, abstractClientBuilder, i, null);
    }

    private void init(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i, String str) {
        this.mContext = context.getApplicationContext();
        this.mOption = toption;
        this.mClientBuilder = abstractClientBuilder;
        setHostAppId(context);
        this.mSubAppInfo = new SubAppInfo("");
        this.mKitSdkVersion = i;
        if (!TextUtils.isEmpty(str)) {
            if (str.equals(this.mHostAppid)) {
                HMSLog.m80172e(TAG, "subAppId is host appid");
            } else {
                HMSLog.m80174i(TAG, "subAppId is ".concat(str));
                this.mSubAppInfo = new SubAppInfo(str);
            }
        }
        initBI(context);
    }

    private void initBI(Context context) {
        HMSBIInitializer.getInstance(context).initBI();
    }

    private void innerDisconnect(HuaweiApi<?> huaweiApi, C25834OooO0oO<Boolean> c25834OooO0oO) {
        HMSLog.m80174i(TAG, "innerDisconnect.");
        try {
            huaweiApi.getClient(null, null).disconnect();
            c25834OooO0oO.OooO0O0(Boolean.TRUE);
        } catch (Exception e) {
            HMSLog.m80175w(TAG, "disconnect the binder failed for:" + e.getMessage());
        }
    }

    private <TResult, TClient extends AnyClient> OooO0o<TResult> sendRequest(TaskApiCall<TClient, TResult> taskApiCall) {
        taskApiCall.getToken();
        C25834OooO0oO c25834OooO0oO = new C25834OooO0oO();
        new RequestHandler(this).sendRequest(new TaskApiCallWrapper(taskApiCall, c25834OooO0oO));
        return c25834OooO0oO.f88150OooO00o;
    }

    private void setHostAppId(Context context) {
        String appId = Util.getAppId(context);
        this.mHostAppid = appId;
        this.mAppID = appId;
    }

    @Deprecated
    public OooO0o<Boolean> disconnectService() {
        C25834OooO0oO<Boolean> c25834OooO0oO = new C25834OooO0oO<>();
        innerDisconnect(this, c25834OooO0oO);
        return c25834OooO0oO.f88150OooO00o;
    }

    public <TResult, TClient extends AnyClient> OooO0o<TResult> doWrite(TaskApiCall<TClient, TResult> taskApiCall) {
        this.isFirstReqSent = true;
        if (taskApiCall != null) {
            C18472b.m80117a(this.mContext, taskApiCall.getUri(), TextUtils.isEmpty(this.mSubAppInfo.getSubAppID()) ? this.mAppID : this.mSubAppInfo.getSubAppID(), taskApiCall.getTransactionId(), String.valueOf(getKitSdkVersion()));
            if (this.requestManager == null) {
                this.requestManager = RequestManager.getInstance();
            }
            return sendRequest(taskApiCall);
        }
        HMSLog.m80172e(TAG, "in doWrite:taskApiCall is null");
        C25840OooO0oo c25840OooO0oo = new C25840OooO0oo();
        ApiException apiException = new ApiException(Status.FAILURE);
        synchronized (c25840OooO0oo.f88175OooO00o) {
            try {
                if (!c25840OooO0oo.f88176OooO0O0) {
                    c25840OooO0oo.f88176OooO0O0 = true;
                    c25840OooO0oo.f88178OooO0Oo = apiException;
                    c25840OooO0oo.f88175OooO00o.notifyAll();
                    c25840OooO0oo.OooOO0o();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c25840OooO0oo;
    }

    public Activity getActivity() {
        WeakReference<Activity> weakReference = this.mActivity;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int getApiLevel() {
        return this.apiLevel;
    }

    public String getAppID() {
        return this.mAppID;
    }

    public AnyClient getClient(Looper looper, RequestHandler requestHandler) {
        return this.mClientBuilder.buildClient(this.mContext, getClientSetting(), requestHandler, requestHandler);
    }

    public ClientSettings getClientSetting() {
        ClientSettings clientSettings = new ClientSettings(this.mContext.getPackageName(), this.mContext.getClass().getName(), getScopes(), this.mHostAppid, null, this.mSubAppInfo);
        if (!this.isUseInnerHms) {
            this.innerHmsPkg = HMSPackageManager.getInstance(this.mContext).getHMSPackageNameForMultiService();
            HMSLog.m80174i(TAG, "No setInnerHms, hms pkg name is " + this.innerHmsPkg);
        }
        clientSettings.setInnerHmsPkg(this.innerHmsPkg);
        clientSettings.setUseInnerHms(this.isUseInnerHms);
        WeakReference<Activity> weakReference = this.mActivity;
        if (weakReference != null) {
            clientSettings.setCpActivity(weakReference.get());
        }
        return clientSettings;
    }

    public Context getContext() {
        return this.mContext;
    }

    public int getKitSdkVersion() {
        return this.mKitSdkVersion;
    }

    public TOption getOption() {
        return this.mOption;
    }

    public List<Scope> getScopes() {
        return Collections.EMPTY_LIST;
    }

    public String getSubAppID() {
        return this.mSubAppInfo.getSubAppID();
    }

    public void setApiLevel(int i) {
        this.apiLevel = i;
    }

    public void setInnerHms() {
        this.innerHmsPkg = this.mContext.getPackageName();
        this.isUseInnerHms = true;
        HMSLog.m80174i(TAG, "<setInnerHms> init inner hms pkg info:" + this.innerHmsPkg);
    }

    public void setKitSdkVersion(int i) {
        this.mKitSdkVersion = i;
    }

    public void setSubAppId(String str) throws ApiException {
        if (!setSubAppInfo(new SubAppInfo(str))) {
            throw new ApiException(Status.FAILURE);
        }
    }

    @Deprecated
    public boolean setSubAppInfo(SubAppInfo subAppInfo) {
        HMSLog.m80174i(TAG, "Enter setSubAppInfo");
        SubAppInfo subAppInfo2 = this.mSubAppInfo;
        if (subAppInfo2 != null && !TextUtils.isEmpty(subAppInfo2.getSubAppID())) {
            HMSLog.m80172e(TAG, "subAppInfo is already set");
            return false;
        }
        if (subAppInfo == null) {
            HMSLog.m80172e(TAG, "subAppInfo is null");
            return false;
        }
        String subAppID = subAppInfo.getSubAppID();
        if (TextUtils.isEmpty(subAppID)) {
            HMSLog.m80172e(TAG, "subAppId is empty");
            return false;
        }
        if (subAppID.equals(this.mHostAppid)) {
            HMSLog.m80172e(TAG, "subAppId is host appid");
            return false;
        }
        if (this.isFirstReqSent) {
            HMSLog.m80172e(TAG, "Client has sent request to Huawei Mobile Services, setting subAppId is not allowed");
            return false;
        }
        this.mSubAppInfo = new SubAppInfo(subAppInfo);
        return true;
    }

    public HuaweiApi(Activity activity, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i, String str) {
        Checker.checkNonNull(activity, "Null activity is not permitted.");
        this.mActivity = new WeakReference<>(activity);
        init(activity, api, toption, abstractClientBuilder, i, str);
    }

    public HuaweiApi(Activity activity, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder) {
        Checker.checkNonNull(activity, "Null activity is not permitted.");
        this.mActivity = new WeakReference<>(activity);
        init(activity, api, toption, abstractClientBuilder, 0, null);
    }

    public HuaweiApi(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i) {
        Checker.checkNonNull(context, "Null context is not permitted.");
        init(context, api, toption, abstractClientBuilder, i, null);
    }

    public HuaweiApi(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i, String str) {
        Checker.checkNonNull(context, "Null context is not permitted.");
        init(context, api, toption, abstractClientBuilder, i, str);
    }

    public HuaweiApi(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder) {
        Checker.checkNonNull(context, "Null context is not permitted.");
        init(context, api, toption, abstractClientBuilder, 0, null);
    }
}
