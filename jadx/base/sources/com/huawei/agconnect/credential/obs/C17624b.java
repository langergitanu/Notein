package com.huawei.agconnect.credential.obs;

import com.huawei.agconnect.common.api.AgcCrypto;
import com.huawei.agconnect.datastore.core.CryptoUtil;
import com.huawei.agconnect.datastore.core.SharedPrefUtil;

/* JADX INFO: renamed from: com.huawei.agconnect.credential.obs.b */
/* JADX INFO: loaded from: classes8.dex */
public class C17624b {

    /* JADX INFO: renamed from: a */
    private static C17624b f52151a;

    /* JADX INFO: renamed from: b */
    private SharedPrefUtil f52152b = SharedPrefUtil.getInstance();

    /* JADX INFO: renamed from: c */
    private CryptoUtil f52153c;

    private C17624b() {
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C17624b m75515a() {
        try {
            if (f52151a == null) {
                f52151a = new C17624b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f52151a;
    }

    /* JADX INFO: renamed from: b */
    public void m75517b() {
        m75519c();
    }

    /* JADX INFO: renamed from: c */
    public void m75519c() {
        this.f52152b.remove("com.huawei.agconnect", C17625c.f52154a);
    }

    /* JADX INFO: renamed from: d */
    public void m75521d(C17598a c17598a) {
        if (c17598a != null) {
            c17598a.aaidString = (String) this.f52152b.get("com.huawei.agconnect", C17625c.f52154a, String.class, c17598a.aaidString, AgcCrypto.class);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m75516a(C17598a c17598a) {
        m75518b(c17598a);
    }

    /* JADX INFO: renamed from: b */
    public void m75518b(C17598a c17598a) {
        if (c17598a != null) {
            this.f52152b.put("com.huawei.agconnect", C17625c.f52154a, String.class, c17598a.aaidString, AgcCrypto.class);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m75520c(C17598a c17598a) {
        m75521d(c17598a);
    }
}
