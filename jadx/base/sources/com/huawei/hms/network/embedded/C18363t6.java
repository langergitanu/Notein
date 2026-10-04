package com.huawei.hms.network.embedded;

import com.huawei.hms.network.embedded.C18141d3;
import com.huawei.hms.network.embedded.C18321q3;
import com.huawei.hms.network.httpclient.Callback;
import com.huawei.hms.network.httpclient.HttpClient;
import com.huawei.hms.network.httpclient.Request;
import com.huawei.hms.network.httpclient.RequestFinishedInfo;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.hms.network.httpclient.ResponseBody;
import com.huawei.hms.network.httpclient.Submit;
import java.io.IOException;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.t6 */
/* JADX INFO: loaded from: classes9.dex */
public class C18363t6<T> extends Submit<T> {

    /* JADX INFO: renamed from: g */
    public static final String f56231g = "RealSubmit";

    /* JADX INFO: renamed from: a */
    public final C18389v6<T, ?> f56232a;

    /* JADX INFO: renamed from: b */
    public final Object[] f56233b;

    /* JADX INFO: renamed from: c */
    public HttpClient f56234c;

    /* JADX INFO: renamed from: d */
    public C18321q3.h<T> f56235d;

    /* JADX INFO: renamed from: e */
    public volatile boolean f56236e;

    /* JADX INFO: renamed from: f */
    public boolean f56237f;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.t6$a */
    public class a extends Callback<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Callback f56238a;

        public a(Callback callback) {
            this.f56238a = callback;
        }

        @Override // com.huawei.hms.network.httpclient.Callback
        public void onFailure(Submit<T> submit, Throwable th) {
            this.f56238a.onFailure(submit, th);
        }

        @Override // com.huawei.hms.network.httpclient.Callback
        public void onResponse(Submit<T> submit, Response<T> response) {
            try {
                this.f56238a.onResponse(submit, C18363t6.this.m79556a(response));
            } catch (Exception e) {
                this.f56238a.onFailure(submit, e);
            }
        }
    }

    public C18363t6(HttpClient httpClient, C18389v6<T, ?> c18389v6, Object[] objArr) {
        this.f56234c = httpClient;
        this.f56232a = c18389v6;
        this.f56233b = objArr;
    }

    /* JADX INFO: renamed from: a */
    private C18321q3.h<T> m79554a() throws IOException {
        HttpClient httpClient = this.f56234c;
        Submit<ResponseBody> submitNewSubmit = httpClient.newSubmit(this.f56232a.m79697a(httpClient, this.f56233b));
        if (submitNewSubmit != null) {
            return submitNewSubmit instanceof C18321q3.h ? (C18321q3.h) submitNewSubmit : new C18321q3.h<>(submitNewSubmit);
        }
        throw new IOException("create submit error");
    }

    @Override // com.huawei.hms.network.httpclient.Submit
    public void cancel() {
        this.f56236e = true;
        C18321q3.h<T> hVar = this.f56235d;
        if (hVar != null) {
            hVar.cancel();
        }
    }

    @Override // com.huawei.hms.network.httpclient.Submit
    /* JADX INFO: renamed from: clone */
    public Submit<T> mo80715clone() {
        return new C18363t6(this.f56234c, this.f56232a, this.f56233b);
    }

    @Override // com.huawei.hms.network.httpclient.Submit
    public void enqueue(Callback<T> callback) {
        if (callback == null) {
            throw new NullPointerException("callback cannot be null");
        }
        synchronized (this) {
            if (this.f56237f) {
                throw new IllegalStateException("Already Executed");
            }
            this.f56237f = true;
        }
        try {
            if (this.f56236e) {
                throw C18127c3.m78085a("Canceled");
            }
            if (this.f56235d == null) {
                this.f56235d = m79554a();
            }
            this.f56235d.enqueue(new a(callback));
        } catch (Exception e) {
            callback.onFailure(this, e);
        }
    }

    @Override // com.huawei.hms.network.httpclient.Submit
    public Response<T> execute() throws IOException {
        synchronized (this) {
            if (this.f56237f) {
                throw new IllegalStateException("Already Executed");
            }
            this.f56237f = true;
        }
        if (this.f56236e) {
            throw C18127c3.m78085a("Canceled");
        }
        if (this.f56235d == null) {
            this.f56235d = m79554a();
        }
        return m79556a(this.f56235d.execute());
    }

    @Override // com.huawei.hms.network.httpclient.Submit
    public RequestFinishedInfo getRequestFinishedInfo() {
        C18321q3.h<T> hVar = this.f56235d;
        if (hVar == null) {
            return null;
        }
        return hVar.getRequestFinishedInfo();
    }

    @Override // com.huawei.hms.network.httpclient.Submit
    public boolean isCanceled() {
        if (this.f56236e) {
            return true;
        }
        C18321q3.h<T> hVar = this.f56235d;
        return hVar != null && hVar.isCanceled();
    }

    @Override // com.huawei.hms.network.httpclient.Submit
    public synchronized boolean isExecuted() {
        return this.f56237f;
    }

    @Override // com.huawei.hms.network.httpclient.Submit
    public synchronized Request request() throws IOException {
        try {
            if (this.f56235d == null) {
                this.f56235d = m79554a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f56235d.request();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public Response<T> m79556a(Response<ResponseBody> response) throws IOException {
        C18141d3.b bVar = new C18141d3.b();
        bVar.headers(response.getHeaders());
        bVar.code(response.getCode());
        bVar.message(response.getMessage());
        bVar.url(response.getUrl());
        bVar.errorBody(response.getErrorBody());
        if (response.getBody() != null) {
            C18389v6<T, ?> c18389v6 = this.f56232a;
            bVar.body(c18389v6 != null ? c18389v6.m79698a(response.getBody()) : null);
        }
        return bVar.build();
    }
}
