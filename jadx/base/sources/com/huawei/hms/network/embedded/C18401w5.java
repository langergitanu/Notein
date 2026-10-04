package com.huawei.hms.network.embedded;

import com.huawei.hms.network.embedded.C18321q3;
import com.huawei.hms.network.httpclient.Request;
import com.huawei.hms.network.httpclient.RequestFinishedInfo;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.hms.network.httpclient.ResponseBody;
import com.huawei.hms.network.inner.api.RequestContext;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.w5 */
/* JADX INFO: loaded from: classes9.dex */
public class C18401w5 extends RequestContext {

    /* JADX INFO: renamed from: a */
    public Request f56537a;

    /* JADX INFO: renamed from: b */
    public Response<ResponseBody> f56538b;

    /* JADX INFO: renamed from: c */
    public Throwable f56539c;

    /* JADX INFO: renamed from: d */
    public RequestFinishedInfo f56540d;

    @Override // com.huawei.hms.network.inner.api.RequestContext
    public Request request() {
        return this.f56537a;
    }

    @Override // com.huawei.hms.network.inner.api.RequestContext
    public RequestFinishedInfo requestFinishedInfo() {
        return this.f56540d;
    }

    @Override // com.huawei.hms.network.inner.api.RequestContext
    public Response<ResponseBody> response() {
        return this.f56538b;
    }

    public void setRequest(Request request) {
        if (request == null || (request instanceof C18321q3.d)) {
            this.f56537a = request;
        } else {
            this.f56537a = new C18321q3.d(request);
        }
    }

    public void setRequestFinishedInfo(RequestFinishedInfo requestFinishedInfo) {
        this.f56540d = requestFinishedInfo;
    }

    public void setResponse(Response<ResponseBody> response) {
        if (response == null || (response instanceof C18321q3.f)) {
            this.f56538b = response;
        } else {
            this.f56538b = new C18321q3.f(response);
        }
    }

    public void setThrowable(Throwable th) {
        this.f56539c = th;
    }

    @Override // com.huawei.hms.network.inner.api.RequestContext
    public Throwable throwable() {
        return this.f56539c;
    }
}
