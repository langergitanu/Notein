package com.huawei.agconnect.credential.obs;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.annotation.Singleton;
import com.huawei.agconnect.common.api.BackendService;
import com.huawei.agconnect.common.api.Logger;
import com.huawei.agconnect.core.service.auth.CredentialsProvider;
import com.huawei.agconnect.core.service.auth.Token;
import com.huawei.agconnect.exception.AGCServerException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import o0O00OOO.C25834OooO0oO;
import o0O00OOO.C25835OooO0oo;
import o0O00OOO.OooO0OO;
import o0O00OOO.OooO0o;

/* JADX INFO: renamed from: com.huawei.agconnect.credential.obs.ao */
/* JADX INFO: loaded from: classes8.dex */
@Singleton
public class C17613ao implements CredentialsProvider {

    /* JADX INFO: renamed from: a */
    private static final String f52123a = "CredentialsProviderImpl";

    /* JADX INFO: renamed from: b */
    private static final long f52124b = 3600000;

    /* JADX INFO: renamed from: c */
    private final Executor f52125c;

    /* JADX INFO: renamed from: d */
    private final String f52126d;

    /* JADX INFO: renamed from: e */
    private C17611am f52127e = new C17611am();

    /* JADX INFO: renamed from: f */
    private long f52128f;

    /* JADX INFO: renamed from: g */
    private final AGConnectInstance f52129g;

    public C17613ao(Context context, AGConnectInstance aGConnectInstance) {
        this.f52129g = aGConnectInstance;
        String identifier = aGConnectInstance.getOptions().getIdentifier();
        this.f52126d = identifier;
        C17612an.m75474a().m75484d(this.f52127e, identifier);
        C17612an.m75474a().m75485e(this.f52127e, identifier);
        C17612an.m75474a().m75486f(this.f52127e, identifier);
        this.f52125c = Executors.newSingleThreadExecutor();
    }

    @Override // com.huawei.agconnect.core.service.auth.CredentialsProvider
    public OooO0o<Token> getTokens() {
        return getTokens(false);
    }

    @Override // com.huawei.agconnect.core.service.auth.CredentialsProvider
    public OooO0o<Token> getTokens(final boolean z) {
        final C25834OooO0oO c25834OooO0oO = new C25834OooO0oO();
        if (m75493a(z)) {
            this.f52125c.execute(new Runnable() { // from class: com.huawei.agconnect.credential.obs.ao.1
                @Override // java.lang.Runnable
                public void run() {
                    if (C17613ao.this.m75493a(z)) {
                        C17613ao.this.m75491a((C25834OooO0oO<Token>) c25834OooO0oO);
                    } else {
                        c25834OooO0oO.OooO0O0(C17613ao.this.f52127e);
                    }
                }
            });
        } else {
            c25834OooO0oO.OooO0O0(this.f52127e);
        }
        return c25834OooO0oO.f88150OooO00o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m75491a(final C25834OooO0oO<Token> c25834OooO0oO) {
        IllegalArgumentException illegalArgumentException;
        C17608aj c17608aj = new C17608aj(this.f52129g);
        if (TextUtils.isEmpty(c17608aj.getClientId())) {
            illegalArgumentException = new IllegalArgumentException("client token request miss client id, please check whether the 'agconnect-services.json' is configured correctly");
        } else {
            if (!TextUtils.isEmpty(c17608aj.getClientSecret())) {
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                BackendService.sendRequest(c17608aj, 1, C17609ak.class, new BackendService.Options.Builder().app(this.f52129g).clientToken(false).build()).OooO0O0(C25835OooO0oo.f88151OooO0Oo.f88152OooO00o, new OooO0OO<C17609ak>() { // from class: com.huawei.agconnect.credential.obs.ao.2
                    @Override // o0O00OOO.OooO0OO
                    public void onComplete(OooO0o<C17609ak> oooO0o) {
                        Logger.m75329i(C17613ao.f52123a, "onComplete");
                        if (!oooO0o.OooO()) {
                            c25834OooO0oO.OooO00o(oooO0o.OooO0o());
                            countDownLatch.countDown();
                            return;
                        }
                        C17609ak c17609akOooO0oO = oooO0o.OooO0oO();
                        if (c17609akOooO0oO.getRet() != null && c17609akOooO0oO.getRet().getCode() != 0) {
                            c25834OooO0oO.OooO00o(new AGCServerException(c17609akOooO0oO.getRet().getMsg(), c17609akOooO0oO.getRet().getCode()));
                            countDownLatch.countDown();
                            return;
                        }
                        C17613ao.this.f52127e = new C17611am(c17609akOooO0oO.getAccessToken(), c17609akOooO0oO.getExpiresIn());
                        C17612an.m75474a().m75476a(C17613ao.this.f52127e, C17613ao.this.f52126d);
                        C17612an.m75474a().m75480b(C17613ao.this.f52127e, C17613ao.this.f52126d);
                        C17612an.m75474a().m75482c(C17613ao.this.f52127e, C17613ao.this.f52126d);
                        countDownLatch.countDown();
                        C17613ao.this.f52128f = SystemClock.elapsedRealtime();
                        c25834OooO0oO.OooO0O0(C17613ao.this.f52127e);
                    }
                });
                try {
                    if (countDownLatch.await(5L, TimeUnit.SECONDS)) {
                        return;
                    }
                    Logger.m75327e(f52123a, "await failed");
                    return;
                } catch (InterruptedException unused) {
                    Logger.m75327e(f52123a, "await InterruptedException");
                    return;
                }
            }
            illegalArgumentException = new IllegalArgumentException("client token request miss client secret, please check whether the 'agconnect-services.json' is configured correctly");
        }
        c25834OooO0oO.OooO00o(illegalArgumentException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public boolean m75493a(boolean z) {
        C17611am c17611am = this.f52127e;
        if (c17611am == null || !c17611am.m75473a()) {
            return true;
        }
        if (z) {
            return this.f52128f == 0 || SystemClock.elapsedRealtime() - this.f52128f > 3600000;
        }
        return false;
    }
}
