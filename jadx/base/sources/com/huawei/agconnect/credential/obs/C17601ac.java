package com.huawei.agconnect.credential.obs;

import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.core.service.auth.CredentialsProvider;
import com.huawei.agconnect.core.service.auth.Token;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o0O00OOO.OooO;
import o0O00OOO.OooO0o;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: renamed from: com.huawei.agconnect.credential.obs.ac */
/* JADX INFO: loaded from: classes8.dex */
final class C17601ac implements Interceptor {

    /* JADX INFO: renamed from: a */
    private static final String f52098a = "ClientTokenInterceptor";

    /* JADX INFO: renamed from: b */
    private AGConnectInstance f52099b;

    public C17601ac(AGConnectInstance aGConnectInstance) {
        this.f52099b = aGConnectInstance;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        OooO0o<Token> tokens = ((CredentialsProvider) this.f52099b.getService(CredentialsProvider.class)).getTokens();
        try {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            Token token = (Token) OooO.OooO00o(tokens, 5L);
            Request.Builder builderOooO00o = chain.getF124446OooO0o0().OooO00o();
            builderOooO00o.OooO00o("Authorization", "Bearer " + token.getTokenString());
            return chain.OooO00o(builderOooO00o.OooO0O0());
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            throw new IOException(e.getMessage());
        }
    }
}
