package com.huawei.hms.network.embedded;

import com.huawei.hms.network.embedded.C18321q3;
import com.huawei.hms.network.httpclient.HttpClient;
import com.huawei.hms.network.httpclient.Interceptor;
import com.huawei.hms.network.httpclient.Request;
import com.huawei.hms.network.httpclient.RequestFinishedInfo;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.hms.network.httpclient.ResponseBody;
import com.huawei.hms.network.inner.api.RequestContext;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.k3 */
/* JADX INFO: loaded from: classes9.dex */
public class C18239k3 extends Interceptor.Chain {

    /* JADX INFO: renamed from: a */
    public final int f55404a;

    /* JADX INFO: renamed from: b */
    public HttpClient f55405b;

    /* JADX INFO: renamed from: c */
    public List<Interceptor> f55406c;

    /* JADX INFO: renamed from: d */
    public AbstractC18129c5 f55407d;

    /* JADX INFO: renamed from: e */
    public InterfaceC18267m3 f55408e;

    /* JADX INFO: renamed from: f */
    public RequestContext f55409f;

    public C18239k3(HttpClient httpClient, RequestContext requestContext, List<Interceptor> list, AbstractC18129c5 abstractC18129c5, int i, InterfaceC18267m3 interfaceC18267m3) {
        this.f55405b = httpClient;
        this.f55409f = requestContext;
        this.f55406c = list;
        this.f55404a = i;
        this.f55407d = abstractC18129c5;
        this.f55408e = interfaceC18267m3;
    }

    /* JADX INFO: renamed from: a */
    public C18321q3.f<ResponseBody> m78963a(RequestContext requestContext, InterfaceC18267m3 interfaceC18267m3) throws IOException {
        if (this.f55404a >= this.f55406c.size()) {
            throw new AssertionError();
        }
        C18321q3.b bVar = new C18321q3.b(new C18239k3(this.f55405b, requestContext, this.f55406c, this.f55407d, this.f55404a + 1, interfaceC18267m3));
        Interceptor interceptor = this.f55406c.get(this.f55404a);
        Response<ResponseBody> responseIntercept = interceptor.intercept(bVar);
        if (responseIntercept != null) {
            return responseIntercept instanceof C18321q3.f ? (C18321q3.f) responseIntercept : new C18321q3.f<>(responseIntercept);
        }
        throw new NullPointerException("interceptor " + interceptor + " returned null");
    }

    public HttpClient getClient() {
        return this.f55405b;
    }

    public AbstractC18129c5 getRCEventListener() {
        return this.f55407d;
    }

    public InterfaceC18267m3 getRequestTask() {
        return this.f55408e;
    }

    @Override // com.huawei.hms.network.httpclient.Interceptor.Chain
    public Response<ResponseBody> proceed(Request request) throws IOException {
        ((C18401w5) this.f55409f).setRequest(request);
        return m78963a(this.f55409f, this.f55408e);
    }

    @Override // com.huawei.hms.network.httpclient.Interceptor.Chain
    public C18321q3.d request() {
        return (C18321q3.d) this.f55409f.request();
    }

    @Override // com.huawei.hms.network.httpclient.Interceptor.Chain
    public RequestFinishedInfo requestFinishedInfo() {
        InterfaceC18267m3 interfaceC18267m3 = this.f55408e;
        if (interfaceC18267m3 != null) {
            return interfaceC18267m3.getRequestFinishedInfo();
        }
        return null;
    }
}
