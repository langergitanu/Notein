package com.huawei.agconnect.credential.obs;

import com.huawei.agconnect.datastore.annotation.DefaultCrypto;
import com.huawei.agconnect.datastore.core.CryptoUtil;
import com.huawei.agconnect.datastore.core.SharedPrefUtil;

/* JADX INFO: renamed from: com.huawei.agconnect.credential.obs.j */
/* JADX INFO: loaded from: classes8.dex */
public class C17632j {

    /* JADX INFO: renamed from: a */
    private static C17632j f52171a;

    /* JADX INFO: renamed from: b */
    private SharedPrefUtil f52172b = SharedPrefUtil.getInstance();

    /* JADX INFO: renamed from: c */
    private CryptoUtil f52173c;

    private C17632j() {
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C17632j m75570a() {
        try {
            if (f52171a == null) {
                f52171a = new C17632j();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f52171a;
    }

    /* JADX INFO: renamed from: b */
    public void m75572b() {
        m75574c();
    }

    /* JADX INFO: renamed from: c */
    public void m75574c() {
        this.f52172b.remove("com.huawei.appgallery.datastore", "key");
    }

    /* JADX INFO: renamed from: d */
    public void m75576d(C17631i c17631i) {
        if (c17631i != null) {
            c17631i.randomKey = (String) this.f52172b.get("com.huawei.appgallery.datastore", "key", String.class, c17631i.randomKey, DefaultCrypto.class);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m75571a(C17631i c17631i) {
        m75573b(c17631i);
    }

    /* JADX INFO: renamed from: b */
    public void m75573b(C17631i c17631i) {
        if (c17631i != null) {
            this.f52172b.put("com.huawei.appgallery.datastore", "key", String.class, c17631i.randomKey, DefaultCrypto.class);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m75575c(C17631i c17631i) {
        m75576d(c17631i);
    }
}
