package com.huawei.agconnect.https;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: renamed from: com.huawei.agconnect.https.g */
/* JADX INFO: loaded from: classes8.dex */
class C17666g implements Interceptor {

    /* JADX INFO: renamed from: a */
    private int f52259a;

    /* JADX INFO: renamed from: b */
    private int f52260b;

    public C17666g(int i) {
        this.f52259a = i;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Response responseOooO00o;
        int i;
        Request request = chain.request();
        while (true) {
            responseOooO00o = chain.OooO00o(request);
            if (responseOooO00o.OooO0OO() || (i = this.f52260b) >= this.f52259a) {
                break;
            }
            this.f52260b = i + 1;
        }
        return responseOooO00o;
    }
}
