package com.huawei.agconnect.credential.obs;

import com.huawei.agconnect.datastore.annotation.DefaultCrypto;
import com.huawei.agconnect.datastore.core.CryptoUtil;
import com.huawei.agconnect.datastore.core.SharedPrefUtil;

/* JADX INFO: renamed from: com.huawei.agconnect.credential.obs.h */
/* JADX INFO: loaded from: classes8.dex */
public class C17630h {

    /* JADX INFO: renamed from: a */
    private static C17630h f52166a;

    /* JADX INFO: renamed from: b */
    private SharedPrefUtil f52167b = SharedPrefUtil.getInstance();

    /* JADX INFO: renamed from: c */
    private CryptoUtil f52168c;

    private C17630h() {
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C17630h m75558a() {
        try {
            if (f52166a == null) {
                f52166a = new C17630h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f52166a;
    }

    /* JADX INFO: renamed from: b */
    public void m75560b() {
        m75562c();
        m75564d();
    }

    /* JADX INFO: renamed from: c */
    public void m75562c() {
        this.f52167b.remove("com.huawei.agconnect.internal", "jerry");
    }

    /* JADX INFO: renamed from: d */
    public void m75564d() {
        this.f52167b.remove("com.huawei.appgallery.datastore", "fish");
    }

    /* JADX INFO: renamed from: e */
    public void m75566e(C17629g c17629g) {
        if (c17629g != null) {
            c17629g.jerry = (String) this.f52167b.get("com.huawei.agconnect.internal", "jerry", String.class, c17629g.jerry, DefaultCrypto.class);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m75567f(C17629g c17629g) {
        if (c17629g != null) {
            c17629g.fish = (String) this.f52167b.get("com.huawei.appgallery.datastore", "fish", String.class, c17629g.fish, DefaultCrypto.class);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m75559a(C17629g c17629g) {
        m75561b(c17629g);
        m75563c(c17629g);
    }

    /* JADX INFO: renamed from: b */
    public void m75561b(C17629g c17629g) {
        if (c17629g != null) {
            this.f52167b.put("com.huawei.agconnect.internal", "jerry", String.class, c17629g.jerry, DefaultCrypto.class);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m75563c(C17629g c17629g) {
        if (c17629g != null) {
            this.f52167b.put("com.huawei.appgallery.datastore", "fish", String.class, c17629g.fish, DefaultCrypto.class);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m75565d(C17629g c17629g) {
        m75566e(c17629g);
        m75567f(c17629g);
    }
}
