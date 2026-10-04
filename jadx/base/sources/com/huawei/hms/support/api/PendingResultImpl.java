package com.huawei.hms.support.api;

import OooOO0.OooO0OO;
import Oooo0.C20856OooooOo;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import androidx.core.database.OooO00o;
import androidx.datastore.preferences.protobuf.C21791OooO0o0;
import com.huawei.hms.adapter.BaseAdapter;
import com.huawei.hms.common.internal.TransactionIdCreater;
import com.huawei.hms.core.aidl.AbstractMessageEntity;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.client.InnerPendingResult;
import com.huawei.hms.support.api.client.Result;
import com.huawei.hms.support.api.client.ResultCallback;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.api.transport.DatagramTransport;
import com.huawei.hms.support.gentyref.GenericTypeReflector;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtil;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Util;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import o00oO0O.o0OoOo0;

/* JADX INFO: loaded from: classes9.dex */
public abstract class PendingResultImpl<R extends Result, T extends IMessageEntity> extends InnerPendingResult<R> {
    private static final String TAG = "PendingResultImpl";
    private WeakReference<ApiClient> api;
    private CountDownLatch countLatch;
    protected DatagramTransport transport = null;
    private R result = null;
    private String url = null;
    private String transId = null;
    private boolean isNeedReport = true;

    /* JADX INFO: renamed from: com.huawei.hms.support.api.PendingResultImpl$a */
    public class C18457a implements DatagramTransport.InterfaceC18470a {
        public C18457a() {
        }

        @Override // com.huawei.hms.support.api.transport.DatagramTransport.InterfaceC18470a
        /* JADX INFO: renamed from: a */
        public void mo80100a(int i, IMessageEntity iMessageEntity) {
            PendingResultImpl.this.setResult(i, iMessageEntity);
            PendingResultImpl.this.countLatch.countDown();
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.support.api.PendingResultImpl$b */
    public class C18458b implements DatagramTransport.InterfaceC18470a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AtomicBoolean f56898a;

        public C18458b(AtomicBoolean atomicBoolean) {
            this.f56898a = atomicBoolean;
        }

        @Override // com.huawei.hms.support.api.transport.DatagramTransport.InterfaceC18470a
        /* JADX INFO: renamed from: a */
        public void mo80100a(int i, IMessageEntity iMessageEntity) {
            if (!this.f56898a.get()) {
                PendingResultImpl.this.setResult(i, iMessageEntity);
            }
            PendingResultImpl.this.countLatch.countDown();
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.support.api.PendingResultImpl$c */
    public class C18459c implements DatagramTransport.InterfaceC18470a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ HandlerC18460d f56900a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ResultCallback f56901b;

        public C18459c(HandlerC18460d handlerC18460d, ResultCallback resultCallback) {
            this.f56900a = handlerC18460d;
            this.f56901b = resultCallback;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.huawei.hms.support.api.transport.DatagramTransport.InterfaceC18470a
        /* JADX INFO: renamed from: a */
        public void mo80100a(int i, IMessageEntity iMessageEntity) {
            PendingResultImpl.this.setResult(i, iMessageEntity);
            this.f56900a.m80101a(this.f56901b, PendingResultImpl.this.result);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.support.api.PendingResultImpl$d */
    public static class HandlerC18460d<R extends Result> extends Handler {
        public HandlerC18460d(Looper looper) {
            super(looper);
        }

        /* JADX INFO: renamed from: a */
        public void m80101a(ResultCallback<? super R> resultCallback, R r) {
            sendMessage(obtainMessage(1, new Pair(resultCallback, r)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public void m80102b(ResultCallback<? super R> resultCallback, R r) {
            resultCallback.onResult(r);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            Pair pair = (Pair) message.obj;
            m80102b((ResultCallback) pair.first, (Result) pair.second);
        }
    }

    public PendingResultImpl(ApiClient apiClient, String str, IMessageEntity iMessageEntity) {
        init(apiClient, str, iMessageEntity, getResponseType(), 0);
    }

    private void biReportEvent(int i, int i2) {
        SubAppInfo subAppInfo;
        HMSLog.m80174i(TAG, "biReportEvent ====== ");
        ApiClient apiClient = this.api.get();
        if (apiClient == null || this.url == null || HiAnalyticsUtil.getInstance().hasError(apiClient.getContext())) {
            return;
        }
        HashMap map = new HashMap();
        map.put("package", apiClient.getPackageName());
        map.put(HiAnalyticsConstant.HaKey.BI_KEY_BASE_VERSION, "6.4.0.302");
        if (i2 == 1) {
            map.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, HiAnalyticsConstant.Direction.REQUEST);
        } else {
            map.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, HiAnalyticsConstant.Direction.RESPONSE);
            map.put("result", String.valueOf(i));
            R r = this.result;
            if (r != null && r.getStatus() != null) {
                map.put(HiAnalyticsConstant.HaKey.BI_KEY_RESULT, String.valueOf(this.result.getStatus().getStatusCode()));
            }
        }
        map.put("version", "0");
        String appId = Util.getAppId(apiClient.getContext());
        if (TextUtils.isEmpty(appId) && (subAppInfo = apiClient.getSubAppInfo()) != null) {
            appId = subAppInfo.getSubAppID();
        }
        map.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, appId);
        if (TextUtils.isEmpty(this.transId)) {
            String id = TransactionIdCreater.getId(appId, this.url);
            this.transId = id;
            map.put(HiAnalyticsConstant.HaKey.BI_KEY_TRANSID, id);
        } else {
            map.put(HiAnalyticsConstant.HaKey.BI_KEY_TRANSID, this.transId);
            this.transId = null;
        }
        String[] strArrSplit = this.url.split("\\.");
        if (strArrSplit.length >= 2) {
            map.put("service", strArrSplit[0]);
            map.put("apiName", strArrSplit[1]);
        }
        map.put("callTime", String.valueOf(System.currentTimeMillis()));
        map.put(HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, Util.getSystemProperties("ro.logsystem.usertype", ""));
        HiAnalyticsUtil.getInstance().onEvent(apiClient.getContext(), HiAnalyticsConstant.HMS_SDK_BASE_CALL_AIDL, map);
    }

    private void init(ApiClient apiClient, String str, IMessageEntity iMessageEntity, Class<T> cls, int i) {
        HMSLog.m80174i(TAG, "init uri:" + str);
        this.url = str;
        if (apiClient == null) {
            HMSLog.m80172e(TAG, "client is null");
            return;
        }
        this.api = new WeakReference<>(apiClient);
        this.countLatch = new CountDownLatch(1);
        try {
            this.transport = (DatagramTransport) Class.forName(apiClient.getTransportName()).getConstructor(String.class, IMessageEntity.class, Class.class, Integer.TYPE).newInstance(str, iMessageEntity, cls, Integer.valueOf(i));
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            HMSLog.m80172e(TAG, "gen transport error:" + e.getMessage());
            throw new IllegalStateException(OooO0OO.OooO0Oo(e, new StringBuilder("Instancing transport exception, ")), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResult(int i, IMessageEntity iMessageEntity) {
        Status status;
        C21791OooO0o0.OooO0OO(i, "setResult:", TAG);
        Status commonStatus = iMessageEntity instanceof AbstractMessageEntity ? ((AbstractMessageEntity) iMessageEntity).getCommonStatus() : null;
        if (i == 0) {
            this.result = (R) onComplete(iMessageEntity);
        } else {
            this.result = (R) onError(i);
        }
        if (this.isNeedReport) {
            biReportEvent(i, 2);
        }
        R r = this.result;
        if (r == null || (status = r.getStatus()) == null || commonStatus == null) {
            return;
        }
        int statusCode = status.getStatusCode();
        String statusMessage = status.getStatusMessage();
        int statusCode2 = commonStatus.getStatusCode();
        String statusMessage2 = commonStatus.getStatusMessage();
        if (statusCode == statusCode2) {
            if (!TextUtils.isEmpty(statusMessage) || TextUtils.isEmpty(statusMessage2)) {
                return;
            }
            HMSLog.m80174i(TAG, OooO00o.OooO00o("rstStatus msg (", statusMessage, ") is not equal commonStatus msg (", statusMessage2, ")"));
            this.result.setStatus(new Status(statusCode, statusMessage2, status.getResolution()));
            return;
        }
        HMSLog.m80172e(TAG, C20856OooooOo.OooO0O0("rstStatus code (", statusCode, ") is not equal commonStatus code (", ")", statusCode2));
        HMSLog.m80172e(TAG, "rstStatus msg (" + statusMessage + ") is not equal commonStatus msg (" + statusMessage2 + ")");
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public final R await() {
        HMSLog.m80174i(TAG, "await");
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return (R) awaitOnAnyThread();
        }
        HMSLog.m80172e(TAG, "await in main thread");
        throw new IllegalStateException("await must not be called on the UI thread");
    }

    @Override // com.huawei.hms.support.api.client.InnerPendingResult
    public final R awaitOnAnyThread() {
        HMSLog.m80174i(TAG, "awaitOnAnyThread");
        WeakReference<ApiClient> weakReference = this.api;
        if (weakReference == null) {
            HMSLog.m80172e(TAG, "api is null");
            setResult(CommonCode.ErrorCode.CLIENT_API_INVALID, null);
            return this.result;
        }
        ApiClient apiClient = weakReference.get();
        if (!checkApiClient(apiClient)) {
            HMSLog.m80172e(TAG, "client invalid");
            setResult(CommonCode.ErrorCode.CLIENT_API_INVALID, null);
            return this.result;
        }
        if (this.isNeedReport) {
            biReportEvent(0, 1);
        }
        this.transport.send(apiClient, new C18457a());
        try {
            this.countLatch.await();
        } catch (InterruptedException unused) {
            HMSLog.m80172e(TAG, "await in anythread InterruptedException");
            setResult(CommonCode.ErrorCode.INTERNAL_ERROR, null);
        }
        return this.result;
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    @Deprecated
    public void cancel() {
    }

    public boolean checkApiClient(ApiClient apiClient) {
        return true;
    }

    public Class<T> getResponseType() {
        Type type;
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass == null || (type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[1]) == null) {
            return null;
        }
        return (Class) type;
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    @Deprecated
    public boolean isCanceled() {
        return false;
    }

    public abstract R onComplete(T t);

    public R onError(int i) {
        Type genericSuperclass = getClass().getGenericSuperclass();
        Type type = genericSuperclass != null ? ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0] : null;
        Class<?> type2 = type != null ? GenericTypeReflector.getType(type) : null;
        if (type2 != null) {
            try {
                R r = (R) type2.newInstance();
                this.result = r;
                r.setStatus(new Status(i));
            } catch (Exception e) {
                HMSLog.m80172e(TAG, "on Error:" + e.getMessage());
                return null;
            }
        }
        return this.result;
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public void setResultCallback(ResultCallback<R> resultCallback) {
        this.isNeedReport = !(resultCallback instanceof BaseAdapter.BaseRequestResultCallback);
        setResultCallback(Looper.getMainLooper(), resultCallback);
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public final void setResultCallback(Looper looper, ResultCallback<R> resultCallback) {
        HMSLog.m80174i(TAG, "setResultCallback");
        if (looper == null) {
            looper = Looper.myLooper();
        }
        HandlerC18460d handlerC18460d = new HandlerC18460d(looper);
        WeakReference<ApiClient> weakReference = this.api;
        if (weakReference == null) {
            HMSLog.m80172e(TAG, "api is null");
            setResult(CommonCode.ErrorCode.CLIENT_API_INVALID, null);
            return;
        }
        ApiClient apiClient = weakReference.get();
        if (!checkApiClient(apiClient)) {
            HMSLog.m80172e(TAG, "client is invalid");
            setResult(CommonCode.ErrorCode.CLIENT_API_INVALID, null);
            handlerC18460d.m80101a(resultCallback, this.result);
        } else {
            if (this.isNeedReport) {
                biReportEvent(0, 1);
            }
            this.transport.post(apiClient, new C18459c(handlerC18460d, resultCallback));
        }
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public R await(long j, TimeUnit timeUnit) {
        StringBuilder sbOooO00o = o0OoOo0.OooO00o(j, "await timeout:", " unit:");
        sbOooO00o.append(timeUnit.toString());
        HMSLog.m80174i(TAG, sbOooO00o.toString());
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return (R) awaitOnAnyThread(j, timeUnit);
        }
        HMSLog.m80174i(TAG, "await in main thread");
        throw new IllegalStateException("await must not be called on the UI thread");
    }

    public PendingResultImpl(ApiClient apiClient, String str, IMessageEntity iMessageEntity, Class<T> cls) {
        init(apiClient, str, iMessageEntity, cls, 0);
    }

    public PendingResultImpl(ApiClient apiClient, String str, IMessageEntity iMessageEntity, int i) {
        init(apiClient, str, iMessageEntity, getResponseType(), i);
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    @Deprecated
    public void setResultCallback(ResultCallback<R> resultCallback, long j, TimeUnit timeUnit) {
        setResultCallback(resultCallback);
    }

    @Override // com.huawei.hms.support.api.client.InnerPendingResult
    public final R awaitOnAnyThread(long j, TimeUnit timeUnit) {
        StringBuilder sbOooO00o = o0OoOo0.OooO00o(j, "awaitOnAnyThread timeout:", " unit:");
        sbOooO00o.append(timeUnit.toString());
        HMSLog.m80174i(TAG, sbOooO00o.toString());
        WeakReference<ApiClient> weakReference = this.api;
        if (weakReference == null) {
            HMSLog.m80172e(TAG, "api is null");
            setResult(CommonCode.ErrorCode.CLIENT_API_INVALID, null);
            return this.result;
        }
        ApiClient apiClient = weakReference.get();
        if (!checkApiClient(apiClient)) {
            HMSLog.m80172e(TAG, "client invalid");
            setResult(CommonCode.ErrorCode.CLIENT_API_INVALID, null);
            return this.result;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        if (this.isNeedReport) {
            biReportEvent(0, 1);
        }
        this.transport.post(apiClient, new C18458b(atomicBoolean));
        try {
            if (!this.countLatch.await(j, timeUnit)) {
                atomicBoolean.set(true);
                setResult(CommonCode.ErrorCode.EXECUTE_TIMEOUT, null);
            }
        } catch (InterruptedException unused) {
            HMSLog.m80172e(TAG, "awaitOnAnyThread InterruptedException");
            setResult(CommonCode.ErrorCode.INTERNAL_ERROR, null);
        }
        return this.result;
    }
}
