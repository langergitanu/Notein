package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.NetworkUtil;
import com.huawei.hms.network.embedded.C18321q3;
import com.huawei.hms.network.httpclient.Interceptor;
import com.huawei.hms.network.httpclient.Request;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.hms.network.httpclient.ResponseBody;
import com.huawei.hms.network.inner.api.DnsNetworkService;
import com.huawei.hms.network.inner.api.NetworkKitInnerImpl;
import com.huawei.hms.network.inner.api.NetworkService;
import com.huawei.hms.network.inner.api.RequestContext;
import java.io.IOException;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.p3 */
/* JADX INFO: loaded from: classes9.dex */
public class C18308p3 extends Interceptor {

    /* JADX INFO: renamed from: h */
    public static final String f55857h = "RetryInterceptor";

    /* JADX INFO: renamed from: i */
    public static final int f55858i = 429;

    /* JADX INFO: renamed from: a */
    public int f55859a = 0;

    /* JADX INFO: renamed from: b */
    public long f55860b = 0;

    /* JADX INFO: renamed from: c */
    public volatile boolean f55861c;

    /* JADX INFO: renamed from: d */
    public InterfaceC18267m3 f55862d;

    /* JADX INFO: renamed from: e */
    public final C18225j3 f55863e;

    /* JADX INFO: renamed from: f */
    public final C18401w5 f55864f;

    /* JADX INFO: renamed from: g */
    public final DnsNetworkService f55865g;

    public C18308p3(RequestContext requestContext, C18225j3 c18225j3) {
        this.f55864f = (C18401w5) requestContext;
        this.f55863e = c18225j3;
        NetworkService service = NetworkKitInnerImpl.getInstance().getService("dns");
        if (!(service instanceof DnsNetworkService)) {
            throw new IllegalStateException("DNS service is not available");
        }
        this.f55865g = (DnsNetworkService) service;
    }

    /* JADX INFO: renamed from: a */
    private void m79341a(Request request) {
        this.f55864f.setThrowable(null);
        this.f55864f.setResponse(null);
    }

    public void cancel() {
        this.f55861c = true;
        InterfaceC18267m3 interfaceC18267m3 = this.f55862d;
        if (interfaceC18267m3 != null) {
            interfaceC18267m3.cancel();
        }
    }

    public InterfaceC18267m3 getRequestTask() {
        return this.f55862d;
    }

    @Override // com.huawei.hms.network.httpclient.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Response<ResponseBody> responseProceed;
        C18321q3.d dVar;
        C18321q3.b bVar = (C18321q3.b) chain;
        AbstractC18129c5 rCEventListener = bVar.getRCEventListener();
        Request request = chain.request();
        this.f55864f.setRequest(request);
        this.f55865g.beginEachRequest(this.f55864f);
        while (!isCanceled()) {
            this.f55862d = this.f55863e.m78867a(request).newTask();
            try {
                if (this.f55859a == 0) {
                    this.f55860b = C18334r3.requestDiscreteControl(request);
                }
                Logger.m76965v(f55857h, "waitingTime: " + this.f55860b);
                rCEventListener.retryInterceptorStart(request, this.f55862d, this.f55860b);
                m79341a(request);
                responseProceed = bVar.proceed(this.f55864f, this.f55862d);
                m79342a(responseProceed);
                rCEventListener.retryInterceptorEnd(responseProceed, this.f55863e);
                dVar = (C18321q3.d) request;
            } catch (IOException e) {
                rCEventListener.retryInterceptorFailed(e);
                m79343a(e);
                if (!m79344a(request, this.f55863e)) {
                    Logger.m76967w(f55857h, "intercept IOException end");
                    throw e;
                }
                Logger.m76968w(f55857h, "intercept IOException, retry " + this.f55859a + ", code = " + C18214i6.getErrorCodeFromException(e), e);
                this.f55860b = C18334r3.enableRetryIntervalBackoff(request, this.f55859a);
                this.f55859a = this.f55859a + 1;
            }
            if (!m79344a(request, this.f55863e) || !dVar.getNetConfig().enableTrafficControlWith429() || responseProceed.getCode() != 429) {
                return responseProceed;
            }
            this.f55860b = C18334r3.enableTrafficControlWith429(request, responseProceed);
            this.f55859a++;
        }
        throw C18127c3.m78085a("Canceled");
    }

    public boolean isCanceled() {
        if (this.f55861c) {
            return true;
        }
        InterfaceC18267m3 interfaceC18267m3 = this.f55862d;
        return interfaceC18267m3 != null && interfaceC18267m3.isCanceled();
    }

    /* JADX INFO: renamed from: a */
    private void m79342a(Response<ResponseBody> response) {
        this.f55864f.setResponse(response);
        this.f55865g.endEachRequest(this.f55864f);
    }

    /* JADX INFO: renamed from: a */
    private void m79343a(IOException iOException) {
        this.f55864f.setThrowable(iOException);
        this.f55865g.endEachRequest(this.f55864f);
    }

    /* JADX INFO: renamed from: a */
    private boolean m79344a(Request request, C18225j3 c18225j3) {
        if (!(request instanceof C18321q3.d)) {
            return false;
        }
        C18321q3.d dVar = (C18321q3.d) request;
        return dVar.getNetConfig().getRetryTimeOnConnectionFailure() > 0 && this.f55859a < dVar.getNetConfig().getRetryTimeOnConnectionFailure() && (c18225j3.disableWeakNetworkRetry() || NetworkUtil.netWork(ContextHolder.getAppContext()) != -1);
    }
}
