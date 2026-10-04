package com.alibaba.sdk.android.oss.network;

import java.io.IOException;
import java.io.InputStream;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;

/* JADX INFO: loaded from: classes.dex */
public class NetworkProgressHelper {
    public static ProgressTouchableRequestBody addProgressRequestBody(InputStream inputStream, long j, String str, ExecutionContext executionContext) {
        return new ProgressTouchableRequestBody(inputStream, j, str, executionContext);
    }

    public static OkHttpClient addProgressResponseListener(OkHttpClient okHttpClient, final ExecutionContext executionContext) {
        OkHttpClient.Builder builderOooO0O0 = okHttpClient.OooO0O0();
        builderOooO0O0.f124205OooO0Oo.add(new Interceptor() { // from class: com.alibaba.sdk.android.oss.network.NetworkProgressHelper.1
            @Override // okhttp3.Interceptor
            public Response intercept(Interceptor.Chain chain) throws IOException {
                Response responseOooO00o = chain.OooO00o(chain.getF124446OooO0o0());
                Response.Builder builderOooOOO0 = responseOooO00o.OooOOO0();
                builderOooOOO0.f124277OooO0oO = new ProgressTouchableResponseBody(responseOooO00o.f124262OooOoo, executionContext);
                return builderOooOOO0.OooO00o();
            }
        });
        return new OkHttpClient(builderOooO0O0);
    }
}
