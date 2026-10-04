package com.huawei.agconnect.credential.obs;

import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.common.api.BackendService;
import com.huawei.agconnect.common.api.BaseResponse;
import com.huawei.agconnect.common.api.Logger;
import com.huawei.agconnect.core.service.auth.AuthProvider;
import com.huawei.agconnect.core.service.auth.CredentialsProvider;
import com.huawei.agconnect.core.service.auth.Token;
import com.huawei.agconnect.https.adapter.JsonAdapterFactory;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o0O00OOO.OooO;
import o0O00OOO.OooO0o;
import okhttp3.Authenticator;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;

/* JADX INFO: renamed from: com.huawei.agconnect.credential.obs.v */
/* JADX INFO: loaded from: classes8.dex */
final class C17644v implements Authenticator {

    /* JADX INFO: renamed from: a */
    private static final String f52192a = "AGCAuthenticator";

    /* JADX INFO: renamed from: b */
    private AGConnectInstance f52193b;

    /* JADX INFO: renamed from: c */
    private BackendService.Options f52194c;

    public C17644v(BackendService.Options options) {
        this.f52193b = options.getApp();
        this.f52194c = options;
    }

    @Override // okhttp3.Authenticator
    public Request authenticate(Route route, Response response) throws IOException {
        Logger.m75329i(f52192a, "authenticate");
        BaseResponse baseResponse = (BaseResponse) new JsonAdapterFactory().responseBodyAdapter(BaseResponse.class).adapter(response.f124262OooOoo);
        Request.Builder builderOooO00o = response.f124258OooOo0o.OooO00o();
        boolean z = false;
        if (baseResponse != null) {
            int code = baseResponse.getRet().getCode();
            if (code == 205524993 && !this.f52194c.isClientTokenRefreshed()) {
                this.f52194c.setClientTokenRefreshed(true);
                OooO0o<Token> tokens = ((CredentialsProvider) this.f52193b.getService(CredentialsProvider.class)).getTokens(true);
                try {
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    String tokenString = ((Token) OooO.OooO00o(tokens, 3L)).getTokenString();
                    builderOooO00o.f124246OooO0OO.OooO0Oo("Authorization");
                    builderOooO00o.OooO00o("Authorization", "Bearer " + tokenString);
                    z = true;
                } catch (InterruptedException | ExecutionException | TimeoutException e) {
                    throw new IOException(e.getMessage());
                }
            }
            if (code == 205524994 && !this.f52194c.isAccessTokenRefreshed()) {
                if (((AuthProvider) this.f52193b.getService(AuthProvider.class)) == null) {
                    throw new IOException("Please intergrate agconnect-auth in project");
                }
                this.f52194c.setAccessTokenRefreshed(true);
                OooO0o<Token> tokens2 = ((AuthProvider) this.f52193b.getService(AuthProvider.class)).getTokens(true);
                try {
                    TimeUnit timeUnit2 = TimeUnit.SECONDS;
                    Token token = (Token) OooO.OooO00o(tokens2, 3L);
                    builderOooO00o.f124246OooO0OO.OooO0Oo("access_token");
                    builderOooO00o.OooO00o("access_token", token.getTokenString());
                    z = true;
                } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                    throw new IOException(e2.getMessage());
                }
            }
        }
        if (z) {
            return builderOooO00o.OooO0O0();
        }
        return null;
    }
}
