package com.huawei.agconnect.common.network;

import com.huawei.agconnect.datastore.annotation.DefaultCrypto;
import com.huawei.agconnect.datastore.core.CryptoUtil;
import com.huawei.agconnect.datastore.core.SharedPrefUtil;

/* JADX INFO: renamed from: com.huawei.agconnect.common.network.c */
/* JADX INFO: loaded from: classes8.dex */
public class C17575c {

    /* JADX INFO: renamed from: a */
    private static C17575c f51978a;

    /* JADX INFO: renamed from: b */
    private SharedPrefUtil f51979b = SharedPrefUtil.getInstance();

    /* JADX INFO: renamed from: c */
    private CryptoUtil f51980c;

    private C17575c() {
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C17575c m75338a() {
        try {
            if (f51978a == null) {
                f51978a = new C17575c();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f51978a;
    }

    /* JADX INFO: renamed from: b */
    public void m75340b() {
        m75342c();
    }

    /* JADX INFO: renamed from: c */
    public void m75342c() {
        this.f51979b.remove("AGConnectAccessNetwork", "enableAccessNetwork");
    }

    /* JADX INFO: renamed from: d */
    public void m75344d(C17574b c17574b) {
        if (c17574b != null) {
            c17574b.enableAccessNetwork = ((Boolean) this.f51979b.get("AGConnectAccessNetwork", "enableAccessNetwork", Boolean.class, Boolean.valueOf(c17574b.enableAccessNetwork), DefaultCrypto.class)).booleanValue();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m75339a(C17574b c17574b) {
        m75341b(c17574b);
    }

    /* JADX INFO: renamed from: b */
    public void m75341b(C17574b c17574b) {
        if (c17574b != null) {
            this.f51979b.put("AGConnectAccessNetwork", "enableAccessNetwork", Boolean.class, Boolean.valueOf(c17574b.enableAccessNetwork), DefaultCrypto.class);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m75343c(C17574b c17574b) {
        m75344d(c17574b);
    }
}
