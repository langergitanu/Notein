package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.embedded.C18321q3;
import com.huawei.hms.network.httpclient.Callback;
import com.huawei.hms.network.httpclient.RequestFinishedInfo;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.hms.network.httpclient.ResponseBody;
import com.huawei.hms.network.httpclient.Submit;
import com.huawei.hms.network.httpclient.websocket.WebSocket;
import java.io.IOException;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.e3 */
/* JADX INFO: loaded from: classes9.dex */
public class C18155e3 extends Submit<ResponseBody> {

    /* JADX INFO: renamed from: c */
    public static final String f54608c = "BuildInSubmit";

    /* JADX INFO: renamed from: a */
    public final C18348s4 f54609a;

    /* JADX INFO: renamed from: b */
    public boolean f54610b;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.e3$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public Callback<ResponseBody> f54611a;

        public a(Callback<ResponseBody> callback) {
            this.f54611a = callback;
        }

        public Submit<ResponseBody> get() {
            return C18155e3.this;
        }

        @Override // java.lang.Runnable
        public void run() {
            AutoCloseable autoCloseable = null;
            try {
                Response<ResponseBody> responseExecute = C18155e3.this.f54609a.execute();
                if (C18155e3.this.isCanceled()) {
                    throw C18127c3.m78085a("Canceled");
                }
                this.f54611a.onResponse(get(), responseExecute);
            } catch (IOException e) {
                if (0 != 0) {
                    try {
                        autoCloseable.close();
                    } catch (IOException unused) {
                        Logger.m76968w(C18155e3.f54608c, "close response catch IOException", e);
                    }
                }
                if (0 != 0) {
                    Logger.m76968w(C18155e3.f54608c, "catch Exception", e);
                } else {
                    this.f54611a.onFailure(get(), e);
                }
            }
        }
    }

    public C18155e3(C18225j3 c18225j3, C18321q3.d dVar, WebSocket webSocket) {
        this.f54609a = new C18348s4(this, c18225j3, dVar, webSocket);
    }

    @Override // com.huawei.hms.network.httpclient.Submit
    public void cancel() {
        this.f54609a.cancel();
    }

    @Override // com.huawei.hms.network.httpclient.Submit
    /* JADX INFO: renamed from: clone */
    public Submit<ResponseBody> mo80715clone() {
        return new C18155e3(this.f54609a.getClient(), this.f54609a.request(), this.f54609a.getWebSocket());
    }

    @Override // com.huawei.hms.network.httpclient.Submit
    public void enqueue(Callback<ResponseBody> callback) {
        if (callback == null) {
            throw new NullPointerException("callback cannot be null");
        }
        synchronized (this) {
            if (this.f54610b) {
                throw new IllegalStateException("Already Executed");
            }
            this.f54610b = true;
        }
        C18281n3.getInstance().execute(new a(new C18321q3.a(callback)));
    }

    @Override // com.huawei.hms.network.httpclient.Submit
    public Response<ResponseBody> execute() throws IOException {
        synchronized (this) {
            if (this.f54610b) {
                throw new IllegalStateException("Already Executed");
            }
            this.f54610b = true;
        }
        return this.f54609a.execute();
    }

    @Override // com.huawei.hms.network.httpclient.Submit
    public RequestFinishedInfo getRequestFinishedInfo() {
        return this.f54609a.getFinishedInfo();
    }

    @Override // com.huawei.hms.network.httpclient.Submit
    public boolean isCanceled() {
        return this.f54609a.isCanceled();
    }

    @Override // com.huawei.hms.network.httpclient.Submit
    public synchronized boolean isExecuted() {
        return this.f54610b;
    }

    @Override // com.huawei.hms.network.httpclient.Submit
    public C18321q3.d request() {
        return this.f54609a.request();
    }
}
