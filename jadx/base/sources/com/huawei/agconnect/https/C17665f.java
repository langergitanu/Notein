package com.huawei.agconnect.https;

import okhttp3.Request;

/* JADX INFO: renamed from: com.huawei.agconnect.https.f */
/* JADX INFO: loaded from: classes8.dex */
class C17665f<HttpsRequest> {

    /* JADX INFO: renamed from: a */
    private HttpsRequest f52258a;

    private C17665f(HttpsRequest httpsrequest) {
        this.f52258a = httpsrequest;
    }

    /* JADX INFO: renamed from: a */
    public static <HttpsRequest> C17665f m75649a(HttpsRequest httpsrequest) {
        return new C17665f(httpsrequest);
    }

    /* JADX INFO: renamed from: a */
    public Request.Builder m75650a() {
        return AbstractC17653a.m75627a(this.f52258a);
    }
}
