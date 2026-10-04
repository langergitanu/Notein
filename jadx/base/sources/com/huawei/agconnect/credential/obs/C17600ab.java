package com.huawei.agconnect.credential.obs;

import android.content.Context;
import com.huawei.agconnect.common.api.Logger;
import com.huawei.agconnect.https.OKHttpBuilder;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import o0O00oO0.C25848OooO0o0;
import o0O00oO0.C25849OooO0oO;
import okhttp3.Authenticator;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* JADX INFO: renamed from: com.huawei.agconnect.credential.obs.ab */
/* JADX INFO: loaded from: classes8.dex */
public class C17600ab {

    /* JADX INFO: renamed from: a */
    static final long f52095a = 5000;

    /* JADX INFO: renamed from: b */
    private static final String f52096b = "ClientImpl";

    /* JADX INFO: renamed from: c */
    private OKHttpBuilder f52097c;

    public C17600ab(Context context, List<Interceptor> list, boolean z) {
        this.f52097c = m75426a(context);
        if (list != null && list.size() > 0) {
            Iterator<Interceptor> it = list.iterator();
            while (it.hasNext()) {
                this.f52097c.addInterceptor(it.next());
            }
        }
        if (z) {
            this.f52097c.connectTimeout(5000L).readTimeout(5000L).writeTimeout(5000L);
        }
    }

    /* JADX INFO: renamed from: a */
    public C17600ab m75427a(Authenticator authenticator) {
        if (authenticator != null) {
            this.f52097c.authenticator(authenticator);
        }
        return this;
    }

    /* JADX INFO: renamed from: a */
    private OKHttpBuilder m75426a(Context context) {
        OKHttpBuilder oKHttpBuilder;
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                this.f52097c = new OKHttpBuilder().sslSocketFactory(C25848OooO0o0.OooO00o(context), new C25849OooO0oO(context));
                            } catch (CertificateException e) {
                                Logger.m75328e(f52096b, "CertificateException", e);
                                oKHttpBuilder = new OKHttpBuilder();
                                this.f52097c = oKHttpBuilder;
                                return this.f52097c;
                            }
                        } catch (IllegalAccessException e2) {
                            Logger.m75328e(f52096b, "IllegalAccessException", e2);
                            oKHttpBuilder = new OKHttpBuilder();
                            this.f52097c = oKHttpBuilder;
                            return this.f52097c;
                        }
                    } catch (KeyStoreException e3) {
                        Logger.m75328e(f52096b, "KeyStoreException", e3);
                        oKHttpBuilder = new OKHttpBuilder();
                        this.f52097c = oKHttpBuilder;
                        return this.f52097c;
                    }
                } catch (KeyManagementException e4) {
                    Logger.m75328e(f52096b, "KeyManagementException", e4);
                    oKHttpBuilder = new OKHttpBuilder();
                    this.f52097c = oKHttpBuilder;
                    return this.f52097c;
                }
            } catch (IOException e5) {
                Logger.m75328e(f52096b, "IOException", e5);
                oKHttpBuilder = new OKHttpBuilder();
                this.f52097c = oKHttpBuilder;
                return this.f52097c;
            } catch (NoSuchAlgorithmException e6) {
                Logger.m75328e(f52096b, "NoSuchAlgorithmException", e6);
                oKHttpBuilder = new OKHttpBuilder();
                this.f52097c = oKHttpBuilder;
                return this.f52097c;
            }
            return this.f52097c;
        } catch (Throwable th) {
            this.f52097c = new OKHttpBuilder();
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public OkHttpClient m75428a() {
        return this.f52097c.build();
    }

    /* JADX INFO: renamed from: a */
    public OkHttpClient m75429a(long j, TimeUnit timeUnit) {
        return this.f52097c.buildWithTimeOut(j, timeUnit);
    }
}
