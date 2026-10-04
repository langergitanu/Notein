package com.huawei.agconnect.https;

import com.huawei.agconnect.https.connector.HttpsPlatform;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import o0O00OOO.OooO0o;
import o0O00Oo.OooO;
import okhttp3.OkHttpClient;
import okhttp3.Response;

/* JADX INFO: renamed from: com.huawei.agconnect.https.d */
/* JADX INFO: loaded from: classes8.dex */
public class C17663d implements Service {

    /* JADX INFO: renamed from: a */
    private OkHttpClient f52251a;

    /* JADX INFO: renamed from: b */
    private Executor f52252b;

    public C17663d(OkHttpClient okHttpClient, Executor executor) {
        this.f52251a = okHttpClient;
        this.f52252b = executor;
    }

    @Override // com.huawei.agconnect.https.Service
    public OooO0o<HttpsResult> execute(final Method method) {
        return OooO.OooO00o(new Callable<HttpsResult>() { // from class: com.huawei.agconnect.https.d.1
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public HttpsResult call() throws Exception {
                if (!HttpsPlatform.getInstance().getConnector().hasActiveNetwork()) {
                    throw new HttpsException(false, "There's no network");
                }
                try {
                    Response responseExecute = C17663d.this.f52251a.OooO00o(method.create().OooO0O0()).execute();
                    return new HttpsResult(true, responseExecute.f124259OooOoO, responseExecute);
                } catch (IOException e) {
                    throw new HttpsException(true, e);
                }
            }
        }, this.f52252b);
    }
}
