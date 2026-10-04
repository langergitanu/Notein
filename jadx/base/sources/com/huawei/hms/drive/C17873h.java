package com.huawei.hms.drive;

import android.content.Context;
import com.huawei.cloud.base.util.Logger;
import com.huawei.hms.drive.C17795be;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: com.huawei.hms.drive.h */
/* JADX INFO: loaded from: classes6.dex */
public class C17873h implements InterfaceC17875j {

    /* JADX INFO: renamed from: a */
    private static final Logger f53406a = Logger.getLogger("DefaultOkHttpClientFactory");

    /* JADX INFO: renamed from: b */
    private static Context f53407b;

    /* JADX INFO: renamed from: com.huawei.hms.drive.h$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private static C17795be f53408a;
    }

    public C17873h(Context context) {
        f53407b = context;
    }

    /* JADX INFO: renamed from: c */
    private static Context m76785c() {
        return f53407b;
    }

    /* JADX INFO: renamed from: a */
    public C17795be m76787a(int i, int i2) {
        C17795be.a aVar = new C17795be.a();
        aVar.m76240b(true);
        aVar.m76237a(true);
        long j = i;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aVar.m76232a(j, timeUnit);
        long j2 = i2;
        aVar.m76239b(j2, timeUnit);
        aVar.m76241c(j2, timeUnit);
        aVar.m76233a(new C17780aq(8, 5L, TimeUnit.MINUTES));
        aVar.m76242d(59L, timeUnit);
        try {
            aVar.m76236a(m76788a(), m76789b());
            aVar.m76235a(C17886u.f53472b);
        } catch (IOException | IllegalAccessException | GeneralSecurityException e) {
            f53406a.m75688d(e.toString());
        }
        C17789az c17789az = new C17789az();
        c17789az.m76039a(64);
        c17789az.m76091b(8);
        c17789az.m76092c(10);
        c17789az.m76093d(8);
        aVar.m76234a(c17789az);
        return aVar.m76238a();
    }

    /* JADX INFO: renamed from: b */
    public X509TrustManager m76789b() throws GeneralSecurityException, IOException {
        return new C17888w(m76785c());
    }

    /* JADX INFO: renamed from: a */
    public SSLSocketFactory m76788a() throws IllegalAccessException, GeneralSecurityException, IOException {
        return C17886u.m76879a(m76785c());
    }

    @Override // com.huawei.hms.drive.InterfaceC17875j
    /* JADX INFO: renamed from: a */
    public C17795be mo76786a(int i) throws IOException, ClassCastException {
        C17795be c17795be;
        synchronized (C17873h.class) {
            try {
                if (a.f53408a == null) {
                    C17795be unused = a.f53408a = m76787a(i, i);
                }
                c17795be = a.f53408a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c17795be;
    }
}
