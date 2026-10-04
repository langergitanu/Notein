package com.huawei.hms.adapter;

import OooO0o.C20424OooO0Oo;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.datastore.preferences.protobuf.C21791OooO0o0;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.adapter.AvailableAdapter;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.adapter.p574ui.BaseResolutionAdapter;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.adapter.sysobs.SystemObserver;
import com.huawei.hms.common.internal.RequestHeader;
import com.huawei.hms.common.internal.ResponseHeader;
import com.huawei.hms.common.internal.ResponseWrap;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.framework.common.ExceptionCode;
import com.huawei.hms.support.api.PendingResultImpl;
import com.huawei.hms.support.api.ResolveResult;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.client.PendingResult;
import com.huawei.hms.support.api.client.ResultCallback;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtil;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.kpms.KpmsConstant;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.JsonUtil;
import com.huawei.hms.utils.Util;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class BaseAdapter {
    private static final String HMS_SESSION_INVALID = "com.huawei.hms.core.action.SESSION_INVALID";
    private static final String TAG = "BaseAdapter";
    private WeakReference<Activity> activityWeakReference;
    private WeakReference<ApiClient> api;
    private Context appContext;
    private BaseCallBack baseCallBackReplay;
    private BaseCallBack callback;
    private String jsonHeaderReplay;
    private String jsonObjectReplay;
    private SystemObserver observer;
    private Parcelable parcelableReplay;
    private RequestHeader requestHeader = new RequestHeader();
    private ResponseHeader responseHeader = new ResponseHeader();
    private String transactionId;

    public interface BaseCallBack {
        void onComplete(String str, String str2, Parcelable parcelable);

        void onError(String str);
    }

    public class BaseRequestResultCallback implements ResultCallback<ResolveResult<CoreBaseResponse>> {
        private AtomicBoolean isFirstRsp = new AtomicBoolean(true);

        public BaseRequestResultCallback() {
        }

        private void handleSolutionForHms(final BaseCallBack baseCallBack) {
            if (!Util.isAvailableLibExist(BaseAdapter.this.appContext)) {
                HMSLog.m80174i(BaseAdapter.TAG, "handleSolutionForHms: no Available lib exist");
                baseCallBack.onError(BaseAdapter.this.getResponseHeaderForError(-9));
                return;
            }
            Activity cpActivity = BaseAdapter.this.getCpActivity();
            if (cpActivity == null || cpActivity.isFinishing()) {
                HMSLog.m80172e(BaseAdapter.TAG, "activity is null");
                BaseAdapter baseAdapter = BaseAdapter.this;
                baseCallBack.onError(baseAdapter.buildResponseWrap(-3, baseAdapter.buildBodyStr(-3)).toJson());
            } else {
                HMSLog.m80174i(BaseAdapter.TAG, "start handleSolutionForHMS");
                AvailableAdapter availableAdapter = new AvailableAdapter(ExceptionCode.CRASH_EXCEPTION);
                availableAdapter.setCalledBySolutionInstallHms(true);
                availableAdapter.startResolution(cpActivity, new AvailableAdapter.AvailableCallBack() { // from class: com.huawei.hms.adapter.BaseAdapter.BaseRequestResultCallback.1
                    @Override // com.huawei.hms.adapter.AvailableAdapter.AvailableCallBack
                    public void onComplete(int i) {
                        C21791OooO0o0.OooO0OO(i, "complete handleSolutionForHMS, result: ", BaseAdapter.TAG);
                        if (i != 0) {
                            BaseAdapter baseAdapter2 = BaseAdapter.this;
                            baseCallBack.onError(baseAdapter2.buildResponseWrap(i, baseAdapter2.buildBodyStr(i)).toJson());
                        } else {
                            HMSPackageManager.getInstance(BaseAdapter.this.appContext).resetMultiServiceState();
                            BaseAdapter baseAdapter3 = BaseAdapter.this;
                            baseCallBack.onError(baseAdapter3.buildResponseWrap(11, baseAdapter3.buildBodyStr(11)).toJson());
                            BaseAdapter.this.sendBroadcastAfterResolutionHms();
                        }
                    }
                });
            }
        }

        private void handleSolutionIntent(BaseCallBack baseCallBack, CoreBaseResponse coreBaseResponse) {
            HMSLog.m80174i(BaseAdapter.TAG, "baseCallBack.onComplete");
            PendingIntent pendingIntent = coreBaseResponse.getPendingIntent();
            if (pendingIntent != null) {
                baseCallBack.onComplete(coreBaseResponse.getJsonHeader(), coreBaseResponse.getJsonBody(), pendingIntent);
                return;
            }
            Intent intent = coreBaseResponse.getIntent();
            if (intent != null) {
                baseCallBack.onComplete(coreBaseResponse.getJsonHeader(), coreBaseResponse.getJsonBody(), intent);
            } else {
                baseCallBack.onComplete(coreBaseResponse.getJsonHeader(), coreBaseResponse.getJsonBody(), null);
            }
        }

        private void resolutionResult(String str, BaseCallBack baseCallBack, CoreBaseResponse coreBaseResponse, int i) {
            if (!CommonCode.Resolution.HAS_RESOLUTION_FROM_APK.equals(str)) {
                if (!"installHMS".equals(str)) {
                    handleSolutionIntent(baseCallBack, coreBaseResponse);
                    return;
                } else {
                    HMSLog.m80174i(BaseAdapter.TAG, "has resolutin: installHMS, but base-sdk can't support to install HMS");
                    handleSolutionForHms(baseCallBack);
                    return;
                }
            }
            Activity cpActivity = BaseAdapter.this.getCpActivity();
            HMSLog.m80174i(BaseAdapter.TAG, "activity is: " + cpActivity);
            if (cpActivity == null || cpActivity.isFinishing()) {
                HMSLog.m80172e(BaseAdapter.TAG, "activity null");
                handleSolutionIntent(baseCallBack, coreBaseResponse);
                return;
            }
            PendingIntent pendingIntent = coreBaseResponse.getPendingIntent();
            if (pendingIntent != null) {
                if (Util.isAvailableLibExist(BaseAdapter.this.appContext)) {
                    BaseAdapter.this.startResolution(cpActivity, pendingIntent);
                    return;
                } else {
                    baseCallBack.onError(BaseAdapter.this.getResponseHeaderForError(-9));
                    return;
                }
            }
            Intent intent = coreBaseResponse.getIntent();
            if (intent != null) {
                if (Util.isAvailableLibExist(BaseAdapter.this.appContext)) {
                    BaseAdapter.this.startResolution(cpActivity, intent);
                    return;
                } else {
                    baseCallBack.onError(BaseAdapter.this.getResponseHeaderForError(-9));
                    return;
                }
            }
            if (i == 2) {
                BaseAdapter baseAdapter = BaseAdapter.this;
                baseCallBack.onError(baseAdapter.getResponseHeaderForError(baseAdapter.responseHeader.getErrorCode()));
            } else {
                HMSLog.m80172e(BaseAdapter.TAG, "hasResolution is true but NO_SOLUTION");
                baseCallBack.onError(BaseAdapter.this.getResponseHeaderForError(-4));
            }
        }

        @Override // com.huawei.hms.support.api.client.ResultCallback
        public void onResult(ResolveResult<CoreBaseResponse> resolveResult) {
            BaseCallBack callBack = BaseAdapter.this.getCallBack();
            if (callBack == null) {
                HMSLog.m80172e(BaseAdapter.TAG, "onResult baseCallBack null");
                return;
            }
            if (resolveResult == null) {
                HMSLog.m80172e(BaseAdapter.TAG, "result null");
                callBack.onError(BaseAdapter.this.getResponseHeaderForError(-1));
                return;
            }
            CoreBaseResponse value = resolveResult.getValue();
            if (value == null) {
                HMSLog.m80172e(BaseAdapter.TAG, "response null");
                callBack.onError(BaseAdapter.this.getResponseHeaderForError(-1));
                return;
            }
            if (TextUtils.isEmpty(value.getJsonHeader())) {
                HMSLog.m80172e(BaseAdapter.TAG, "jsonHeader null");
                callBack.onError(BaseAdapter.this.getResponseHeaderForError(-1));
                return;
            }
            JsonUtil.jsonToEntity(value.getJsonHeader(), BaseAdapter.this.responseHeader);
            if (this.isFirstRsp.compareAndSet(true, false)) {
                BaseAdapter baseAdapter = BaseAdapter.this;
                baseAdapter.biReportRequestReturnIpc(baseAdapter.appContext, BaseAdapter.this.responseHeader);
            }
            String resolution = BaseAdapter.this.responseHeader.getResolution();
            int statusCode = BaseAdapter.this.responseHeader.getStatusCode();
            HMSLog.m80174i(BaseAdapter.TAG, "api is: " + BaseAdapter.this.responseHeader.getApiName() + ", resolution: " + resolution + ", status_code: " + statusCode);
            resolutionResult(resolution, callBack, value, statusCode);
        }
    }

    public static class MPendingResultImpl extends PendingResultImpl<ResolveResult<CoreBaseResponse>, CoreBaseResponse> {
        public MPendingResultImpl(ApiClient apiClient, String str, IMessageEntity iMessageEntity) {
            super(apiClient, str, iMessageEntity);
        }

        @Override // com.huawei.hms.support.api.PendingResultImpl
        public ResolveResult<CoreBaseResponse> onComplete(CoreBaseResponse coreBaseResponse) {
            ResolveResult<CoreBaseResponse> resolveResult = new ResolveResult<>(coreBaseResponse);
            resolveResult.setStatus(Status.SUCCESS);
            return resolveResult;
        }
    }

    public BaseAdapter(ApiClient apiClient) {
        this.api = new WeakReference<>(apiClient);
        this.appContext = apiClient.getContext().getApplicationContext();
        HMSLog.m80174i(TAG, "In constructor, WeakReference is " + this.api);
    }

    private void biReportRequestEntryIpc(Context context, RequestHeader requestHeader) {
        Map<String, String> mapFromRequestHeader = HiAnalyticsUtil.getInstance().getMapFromRequestHeader(requestHeader);
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, HiAnalyticsConstant.Direction.REQUEST);
        mapFromRequestHeader.put("version", HiAnalyticsUtil.versionCodeToName(String.valueOf(requestHeader.getKitSdkVersion())));
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, Util.getSystemProperties("ro.logsystem.usertype", ""));
        HiAnalyticsUtil.getInstance().onNewEvent(context, HiAnalyticsConstant.HMS_SDK_BASE_CALL_AIDL, mapFromRequestHeader);
    }

    private void biReportRequestEntrySolution(Context context, RequestHeader requestHeader) {
        Map<String, String> mapFromRequestHeader = HiAnalyticsUtil.getInstance().getMapFromRequestHeader(requestHeader);
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, HiAnalyticsConstant.Direction.REQUEST);
        mapFromRequestHeader.put("version", HiAnalyticsUtil.versionCodeToName(String.valueOf(requestHeader.getKitSdkVersion())));
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, Util.getSystemProperties("ro.logsystem.usertype", ""));
        HiAnalyticsUtil.getInstance().onNewEvent(context, HiAnalyticsConstant.HMS_SDK_BASE_START_RESOLUTION, mapFromRequestHeader);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void biReportRequestReturnIpc(Context context, ResponseHeader responseHeader) {
        HiAnalyticsUtil.getInstance();
        Map<String, String> mapFromRequestHeader = HiAnalyticsUtil.getMapFromRequestHeader(responseHeader);
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, HiAnalyticsConstant.Direction.RESPONSE);
        mapFromRequestHeader.put("version", HiAnalyticsUtil.versionCodeToName(String.valueOf(this.requestHeader.getKitSdkVersion())));
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, Util.getSystemProperties("ro.logsystem.usertype", ""));
        HiAnalyticsUtil.getInstance().onNewEvent(context, HiAnalyticsConstant.HMS_SDK_BASE_CALL_AIDL, mapFromRequestHeader);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void biReportRequestReturnSolution(Context context, ResponseHeader responseHeader, long j) {
        HiAnalyticsUtil.getInstance();
        Map<String, String> mapFromRequestHeader = HiAnalyticsUtil.getMapFromRequestHeader(responseHeader);
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, HiAnalyticsConstant.Direction.RESPONSE);
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_WAITTIME, String.valueOf(j));
        mapFromRequestHeader.put("version", HiAnalyticsUtil.versionCodeToName(String.valueOf(this.requestHeader.getKitSdkVersion())));
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, Util.getSystemProperties("ro.logsystem.usertype", ""));
        HiAnalyticsUtil.getInstance().onNewEvent(context, HiAnalyticsConstant.HMS_SDK_BASE_START_RESOLUTION, mapFromRequestHeader);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String buildBodyStr(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorCode", i);
        } catch (JSONException e) {
            HMSLog.m80172e(TAG, "buildBodyStr failed: " + e.getMessage());
        }
        return jSONObject.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ResponseWrap buildResponseWrap(int i, String str) {
        setResponseHeader(i);
        ResponseWrap responseWrap = new ResponseWrap(this.responseHeader);
        responseWrap.setBody(str);
        return responseWrap;
    }

    private BaseCallBack getBaseCallBackReplay() {
        return this.baseCallBackReplay;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public BaseCallBack getCallBack() {
        BaseCallBack baseCallBack = this.callback;
        if (baseCallBack != null) {
            return baseCallBack;
        }
        HMSLog.m80172e(TAG, "callback null");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Activity getCpActivity() {
        if (this.activityWeakReference == null) {
            HMSLog.m80174i(TAG, "activityWeakReference is " + this.activityWeakReference);
            return null;
        }
        ApiClient apiClient = this.api.get();
        if (apiClient == null) {
            HMSLog.m80174i(TAG, "tmpApi is null");
            return null;
        }
        HMSLog.m80174i(TAG, "activityWeakReference has " + this.activityWeakReference.get());
        return Util.getActiveActivity(this.activityWeakReference.get(), apiClient.getContext());
    }

    private String getJsonHeaderReplay() {
        return this.jsonHeaderReplay;
    }

    private String getJsonObjectReplay() {
        return this.jsonObjectReplay;
    }

    private Parcelable getParcelableReplay() {
        return this.parcelableReplay;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getResponseHeaderForError(int i) {
        setResponseHeader(i);
        return this.responseHeader.toJson();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasExtraPrivacyResult(Intent intent, BaseCallBack baseCallBack) {
        if (!intent.hasExtra(CommonCode.MapKey.PRIVACY_STATEMENT_CONFIRM_RESULT)) {
            return false;
        }
        if (intent.getIntExtra(CommonCode.MapKey.PRIVACY_STATEMENT_CONFIRM_RESULT, 1001) == 1001) {
            HMSLog.m80174i(TAG, "privacy_statement_confirm_result agreed, replay request");
            replayRequest();
            return true;
        }
        HMSLog.m80174i(TAG, "privacy_statement_confirm_result rejected");
        baseCallBack.onError(buildResponseWrap(CommonCode.BusInterceptor.PRIVACY_CNCEL_ERROR_CODE, buildBodyStr(CommonCode.BusInterceptor.PRIVACY_CNCEL_ERROR_CODE)).toJson());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasExtraUpdateResult(Intent intent, BaseCallBack baseCallBack) {
        if (!intent.hasExtra(KpmsConstant.KIT_UPDATE_RESULT)) {
            return false;
        }
        int intExtra = intent.getIntExtra(KpmsConstant.KIT_UPDATE_RESULT, 0);
        C21791OooO0o0.OooO0OO(intExtra, "kit_update_result is ", TAG);
        if (intExtra == 1) {
            HMSLog.m80172e(TAG, "kit update success,replay request");
            replayRequest();
        } else {
            HMSLog.m80172e(TAG, "kit update failed");
            baseCallBack.onError(buildResponseWrap(-10, buildBodyStr(intExtra)).toJson());
        }
        return true;
    }

    private void initObserver() {
        this.observer = new SystemObserver() { // from class: com.huawei.hms.adapter.BaseAdapter.1
            @Override // com.huawei.hms.adapter.sysobs.SystemObserver
            public boolean onNoticeResult(int i) {
                return false;
            }

            @Override // com.huawei.hms.adapter.sysobs.SystemObserver
            public boolean onSolutionResult(Intent intent, String str) {
                if (TextUtils.isEmpty(str)) {
                    HMSLog.m80172e(BaseAdapter.TAG, "onSolutionResult but id is null");
                    BaseCallBack callBack = BaseAdapter.this.getCallBack();
                    if (callBack == null) {
                        HMSLog.m80172e(BaseAdapter.TAG, "onSolutionResult baseCallBack null");
                        return true;
                    }
                    callBack.onError(BaseAdapter.this.getResponseHeaderForError(-6));
                    return true;
                }
                if (!str.equals(BaseAdapter.this.transactionId)) {
                    return false;
                }
                HMSLog.m80174i(BaseAdapter.TAG, "onSolutionResult + id is :".concat(str));
                BaseCallBack callBack2 = BaseAdapter.this.getCallBack();
                if (callBack2 == null) {
                    HMSLog.m80172e(BaseAdapter.TAG, "onResult baseCallBack null");
                    return true;
                }
                if (intent == null) {
                    HMSLog.m80172e(BaseAdapter.TAG, "onSolutionResult but data is null");
                    String responseHeaderForError = BaseAdapter.this.getResponseHeaderForError(-7);
                    BaseAdapter baseAdapter = BaseAdapter.this;
                    baseAdapter.biReportRequestReturnSolution(baseAdapter.appContext, BaseAdapter.this.responseHeader, 0L);
                    callBack2.onError(responseHeaderForError);
                    return true;
                }
                if (BaseAdapter.this.hasExtraUpdateResult(intent, callBack2) || BaseAdapter.this.hasExtraPrivacyResult(intent, callBack2)) {
                    return true;
                }
                HMSLog.m80172e(BaseAdapter.TAG, "onComplete for on activity result");
                BaseAdapter.this.onCompleteResult(intent, callBack2);
                return true;
            }

            @Override // com.huawei.hms.adapter.sysobs.SystemObserver
            public boolean onUpdateResult(int i) {
                return false;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCompleteResult(Intent intent, BaseCallBack baseCallBack) {
        long jLongValue;
        String stringExtra = intent.getStringExtra(CommonCode.MapKey.JSON_HEADER);
        String stringExtra2 = intent.getStringExtra(CommonCode.MapKey.JSON_BODY);
        Object infoFromJsonobject = JsonUtil.getInfoFromJsonobject(stringExtra, "status_code");
        Object infoFromJsonobject2 = JsonUtil.getInfoFromJsonobject(stringExtra, "error_code");
        if (intent.hasExtra(CommonCode.MapKey.HMS_FOREGROUND_RES_UI)) {
            Object infoFromJsonobject3 = JsonUtil.getInfoFromJsonobject(intent.getStringExtra(CommonCode.MapKey.HMS_FOREGROUND_RES_UI), "uiDuration");
            jLongValue = infoFromJsonobject3 instanceof Long ? ((Long) infoFromJsonobject3).longValue() : 0L;
        }
        if ((infoFromJsonobject instanceof Integer) && (infoFromJsonobject2 instanceof Integer)) {
            int iIntValue = ((Integer) infoFromJsonobject).intValue();
            getResponseHeaderForError(((Integer) infoFromJsonobject2).intValue());
            this.responseHeader.setStatusCode(iIntValue);
            biReportRequestReturnSolution(this.appContext, this.responseHeader, jLongValue);
        } else {
            getResponseHeaderForError(-8);
            biReportRequestReturnSolution(this.appContext, this.responseHeader, jLongValue);
        }
        baseCallBack.onComplete(stringExtra, stringExtra2, null);
    }

    private void replayRequest() {
        if (this.jsonHeaderReplay == null || this.baseCallBackReplay == null) {
            return;
        }
        this.responseHeader = null;
        this.responseHeader = new ResponseHeader();
        baseRequest(getJsonHeaderReplay(), getJsonObjectReplay(), getParcelableReplay(), getBaseCallBackReplay());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendBroadcastAfterResolutionHms() {
        if (this.appContext == null) {
            HMSLog.m80172e(TAG, "sendBroadcastAfterResolutionHms, context is null");
            return;
        }
        Intent intent = new Intent(HMS_SESSION_INVALID);
        intent.setPackage(this.appContext.getPackageName());
        this.appContext.sendBroadcast(intent);
    }

    private void setBaseCallBackReplay(BaseCallBack baseCallBack) {
        this.baseCallBackReplay = baseCallBack;
    }

    private void setJsonHeaderReplay(String str) {
        this.jsonHeaderReplay = str;
    }

    private void setJsonObjectReplay(String str) {
        this.jsonObjectReplay = str;
    }

    private void setParcelableReplay(Parcelable parcelable) {
        this.parcelableReplay = parcelable;
    }

    private void setReplayData(String str, String str2, Parcelable parcelable, BaseCallBack baseCallBack) {
        setJsonHeaderReplay(str);
        setJsonObjectReplay(str2);
        setParcelableReplay(parcelable);
        setBaseCallBackReplay(baseCallBack);
    }

    private void setResponseHeader(int i) {
        this.responseHeader.setTransactionId(this.requestHeader.getTransactionId());
        this.responseHeader.setAppID(this.requestHeader.getAppID());
        this.responseHeader.setApiName(this.requestHeader.getApiName());
        this.responseHeader.setSrvName(this.requestHeader.getSrvName());
        this.responseHeader.setPkgName(this.requestHeader.getPkgName());
        this.responseHeader.setStatusCode(1);
        this.responseHeader.setErrorCode(i);
        this.responseHeader.setErrorReason("Core error");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startResolution(Activity activity, Parcelable parcelable) {
        HMSLog.m80174i(TAG, "startResolution");
        RequestHeader requestHeader = this.requestHeader;
        if (requestHeader != null) {
            biReportRequestEntrySolution(this.appContext, requestHeader);
        }
        if (this.observer == null) {
            initObserver();
        }
        SystemManager.getSystemNotifier().registerObserver(this.observer);
        Intent intentStartBridgeActivity = BridgeActivity.getIntentStartBridgeActivity(activity, BaseResolutionAdapter.class.getName());
        Bundle bundle = new Bundle();
        bundle.putParcelable("resolution", parcelable);
        intentStartBridgeActivity.putExtras(bundle);
        intentStartBridgeActivity.putExtra("transaction_id", this.transactionId);
        activity.startActivity(intentStartBridgeActivity);
    }

    public void baseRequest(String str, String str2, Parcelable parcelable, BaseCallBack baseCallBack) {
        setReplayData(str, str2, parcelable, baseCallBack);
        if (this.api == null) {
            HMSLog.m80172e(TAG, "client is null");
            baseCallBack.onError(getResponseHeaderForError(-2));
            return;
        }
        this.callback = baseCallBack;
        JsonUtil.jsonToEntity(str, this.requestHeader);
        CoreBaseRequest coreBaseRequest = new CoreBaseRequest();
        coreBaseRequest.setJsonObject(str2);
        coreBaseRequest.setJsonHeader(str);
        coreBaseRequest.setParcelable(parcelable);
        String apiName = this.requestHeader.getApiName();
        if (TextUtils.isEmpty(apiName)) {
            HMSLog.m80172e(TAG, "get uri null");
            baseCallBack.onError(getResponseHeaderForError(-5));
            return;
        }
        String transactionId = this.requestHeader.getTransactionId();
        this.transactionId = transactionId;
        if (TextUtils.isEmpty(transactionId)) {
            HMSLog.m80172e(TAG, "get transactionId null");
            baseCallBack.onError(getResponseHeaderForError(-6));
            return;
        }
        StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("in baseRequest + uri is :", apiName, ", transactionId is : ");
        sbOooO0o0.append(this.transactionId);
        HMSLog.m80174i(TAG, sbOooO0o0.toString());
        biReportRequestEntryIpc(this.appContext, this.requestHeader);
        baseRequest(this.api.get(), apiName, coreBaseRequest).setResultCallback(new BaseRequestResultCallback());
    }

    public BaseAdapter(ApiClient apiClient, Activity activity) {
        this.api = new WeakReference<>(apiClient);
        this.activityWeakReference = new WeakReference<>(activity);
        this.appContext = activity.getApplicationContext();
        HMSLog.m80174i(TAG, "In constructor, activityWeakReference is " + this.activityWeakReference + ", activity is " + this.activityWeakReference.get());
    }

    private PendingResult<ResolveResult<CoreBaseResponse>> baseRequest(ApiClient apiClient, String str, CoreBaseRequest coreBaseRequest) {
        return new MPendingResultImpl(apiClient, str, coreBaseRequest);
    }
}
