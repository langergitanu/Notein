package com.huawei.agconnect.credential.obs;

import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.core.service.auth.AuthProvider;
import com.huawei.agconnect.core.service.auth.Token;
import com.huawei.hms.support.feature.result.CommonConstant;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o0O00OOO.OooO;
import o0O00OOO.OooO0o;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: renamed from: com.huawei.agconnect.credential.obs.x */
/* JADX INFO: loaded from: classes8.dex */
final class C17646x implements Interceptor {

    /* JADX INFO: renamed from: a */
    private AGConnectInstance f52206a;

    /* JADX INFO: renamed from: b */
    private boolean f52207b;

    /* JADX INFO: renamed from: c */
    private boolean f52208c;

    public C17646x(AGConnectInstance aGConnectInstance, boolean z, boolean z2) {
        this.f52206a = aGConnectInstance;
        this.f52207b = z;
        this.f52208c = z2;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request.Builder builderOooO00o;
        if (((AuthProvider) this.f52206a.getService(AuthProvider.class)) == null) {
            if (this.f52207b) {
                throw new IOException("Please intergrate agconnect-auth in project");
            }
            return chain.OooO00o(chain.getF124446OooO0o0());
        }
        OooO0o<Token> tokens = ((AuthProvider) this.f52206a.getService(AuthProvider.class)).getTokens();
        try {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            Token token = (Token) OooO.OooO00o(tokens, 5L);
            if (token == null) {
                if (this.f52207b) {
                    throw new IOException("no user is signed");
                }
                return chain.OooO00o(chain.getF124446OooO0o0());
            }
            Request f124446OooO0o0 = chain.getF124446OooO0o0();
            if (this.f52208c) {
                builderOooO00o = f124446OooO0o0.OooO00o();
                builderOooO00o.OooO00o("access_token", token.getTokenString());
                builderOooO00o.OooO00o(CommonConstant.KEY_ACCESS_TOKEN, token.getTokenString());
            } else {
                builderOooO00o = f124446OooO0o0.OooO00o();
                builderOooO00o.OooO00o("access_token", token.getTokenString());
            }
            return chain.OooO00o(builderOooO00o.OooO0O0());
        } catch (InterruptedException e) {
            e = e;
            throw new IOException(e.getMessage());
        } catch (ExecutionException e2) {
            e = e2;
            throw new IOException(e.getMessage());
        } catch (TimeoutException e3) {
            e = e3;
            throw new IOException(e.getMessage());
        }
    }
}
