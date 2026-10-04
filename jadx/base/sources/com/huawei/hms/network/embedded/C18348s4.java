package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.grs.GrsUtils;
import com.huawei.hms.framework.common.hianalytics.HianalyticsHelper;
import com.huawei.hms.framework.network.grs.GrsManager;
import com.huawei.hms.network.embedded.C18321q3;
import com.huawei.hms.network.httpclient.Interceptor;
import com.huawei.hms.network.httpclient.RequestFinishedInfo;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.hms.network.httpclient.ResponseBody;
import com.huawei.hms.network.httpclient.Submit;
import com.huawei.hms.network.httpclient.websocket.WebSocket;
import com.huawei.hms.network.inner.api.InterceptorNetworkService;
import com.huawei.hms.network.inner.api.NetworkKitInnerImpl;
import com.huawei.hms.network.inner.api.NetworkService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.s4 */
/* JADX INFO: loaded from: classes9.dex */
public class C18348s4 {

    /* JADX INFO: renamed from: a */
    public final C18225j3 f56097a;

    /* JADX INFO: renamed from: b */
    public final C18308p3 f56098b;

    /* JADX INFO: renamed from: c */
    public final WebSocket f56099c;

    /* JADX INFO: renamed from: d */
    public final AbstractC18129c5 f56100d;

    /* JADX INFO: renamed from: e */
    public C18321q3.d f56101e;

    /* JADX INFO: renamed from: f */
    public final C18414x5 f56102f;

    /* JADX INFO: renamed from: g */
    public RequestFinishedInfo f56103g;
    public C18401w5 requestContext = new C18401w5();

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.s4$a */
    public class a extends C18414x5 {
        public a() {
        }

        @Override // com.huawei.hms.network.embedded.C18414x5
        public void timedOut() {
            C18348s4.this.cancel();
        }
    }

    public C18348s4(Submit<ResponseBody> submit, C18225j3 c18225j3, C18321q3.d dVar, WebSocket webSocket) {
        this.f56097a = c18225j3;
        this.f56101e = dVar;
        this.f56099c = webSocket;
        this.f56100d = webSocket == null ? c18225j3.getEventListenerFactory().create(submit) : AbstractC18129c5.NONE;
        this.f56098b = new C18308p3(this.requestContext, c18225j3);
        a aVar = new a();
        this.f56102f = aVar;
        aVar.timeout(dVar.getNetConfig().getCallTimeout(), TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: a */
    public IOException m79487a(IOException iOException) {
        return !this.f56102f.exit() ? iOException : C18127c3.m78090c("Timeout", iOException);
    }

    public void cancel() {
        this.f56100d.cancel();
        this.f56098b.cancel();
    }

    public Response<ResponseBody> execute() throws IOException {
        this.f56100d.callStart();
        this.f56102f.enter();
        m79485a();
        this.requestContext.setRequest(request());
        this.f56097a.getPolicyExecutor().beginRequest(this.requestContext);
        if (this.f56097a.getTrustManager() == null || this.f56097a.getSslSocketFactory() == null) {
            throw C18127c3.m78091d("The trustManager or sslSocketFactory of httpClient is null");
        }
        this.f56100d.acquireRequestStart();
        this.f56100d.acquireRequestEnd(request());
        ArrayList arrayList = new ArrayList(this.f56097a.getInterceptors());
        ArrayList arrayList2 = new ArrayList(this.f56097a.getNetworkInterceptors());
        for (NetworkService networkService : NetworkKitInnerImpl.getInstance().getAll()) {
            if (networkService instanceof InterceptorNetworkService) {
                InterceptorNetworkService interceptorNetworkService = (InterceptorNetworkService) networkService;
                boolean zIsNetworkInterceptor = interceptorNetworkService.isNetworkInterceptor();
                Interceptor interceptor = interceptorNetworkService.getInterceptor();
                if (zIsNetworkInterceptor) {
                    arrayList2.add(interceptor);
                } else {
                    arrayList.add(interceptor);
                }
            }
        }
        arrayList.add(this.f56098b);
        if (this.f56099c == null) {
            arrayList.add(new C18412x3(this.f56097a.getCache()));
            arrayList.add(new C18388v5());
        }
        arrayList.add(new C18213i5());
        arrayList.addAll(arrayList2);
        arrayList.add(new C18169f3(this.f56099c));
        try {
            Response<ResponseBody> responseProceed = new C18321q3.b(new C18239k3(this.f56097a, this.requestContext, arrayList, this.f56100d, 0, null)).proceed(request());
            m79486a(responseProceed);
            this.requestContext.setResponse(responseProceed);
            this.f56097a.getPolicyExecutor().endRequest(this.requestContext);
            this.f56100d.callEnd(responseProceed);
            return responseProceed;
        } catch (Throwable th) {
            IOException iOExceptionM79484a = m79484a(th);
            m79486a(iOExceptionM79484a);
            this.requestContext.setThrowable(iOExceptionM79484a);
            this.f56097a.getPolicyExecutor().endRequest(this.requestContext);
            this.f56100d.callFailed(iOExceptionM79484a);
            throw iOExceptionM79484a;
        }
    }

    public C18225j3 getClient() {
        return this.f56097a;
    }

    public RequestFinishedInfo getFinishedInfo() {
        return this.f56103g;
    }

    public WebSocket getWebSocket() {
        return this.f56099c;
    }

    public boolean isCanceled() {
        return this.f56098b.isCanceled();
    }

    public C18321q3.d request() {
        return this.f56101e;
    }

    /* JADX INFO: renamed from: a */
    private IOException m79484a(Throwable th) {
        if (th instanceof IOException) {
            return m79487a((IOException) th);
        }
        IOException iOExceptionM78088b = C18127c3.m78088b(th.getMessage(), th);
        HianalyticsHelper.getInstance().reportException(th, "crash");
        return iOExceptionM78088b;
    }

    /* JADX INFO: renamed from: a */
    private void m79485a() {
        String url = this.f56101e.getUrl();
        if (GrsUtils.isGRSSchema(url)) {
            try {
                this.f56101e = new C18321q3.d(this.f56101e.newBuilder().url(GrsManager.parseGrs(url)).build());
            } catch (IOException unused) {
                Logger.m76960e("grsconvert", "convert grs to http url failed!");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    private <T> void m79486a(T t) {
        if (this.f56098b.getRequestTask() == null) {
            this.f56103g = null;
        } else {
            RequestFinishedInfo requestFinishedInfo = this.f56098b.getRequestTask().getRequestFinishedInfo();
            this.f56103g = requestFinishedInfo;
            if (requestFinishedInfo instanceof AbstractC18387v4) {
                if (t instanceof Response) {
                    ((AbstractC18387v4) requestFinishedInfo).setResponse((Response) t);
                } else if (t instanceof Exception) {
                    ((AbstractC18387v4) requestFinishedInfo).setException((Exception) t);
                }
            }
        }
        this.requestContext.setRequestFinishedInfo(this.f56103g);
    }
}
