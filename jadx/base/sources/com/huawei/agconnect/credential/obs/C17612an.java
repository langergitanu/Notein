package com.huawei.agconnect.credential.obs;

import com.huawei.agconnect.common.api.AgcCrypto;
import com.huawei.agconnect.datastore.core.CryptoUtil;
import com.huawei.agconnect.datastore.core.SharedPrefUtil;

/* JADX INFO: renamed from: com.huawei.agconnect.credential.obs.an */
/* JADX INFO: loaded from: classes8.dex */
public class C17612an {

    /* JADX INFO: renamed from: a */
    private static C17612an f52120a;

    /* JADX INFO: renamed from: b */
    private SharedPrefUtil f52121b = SharedPrefUtil.getInstance();

    /* JADX INFO: renamed from: c */
    private CryptoUtil f52122c;

    private C17612an() {
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C17612an m75474a() {
        try {
            if (f52120a == null) {
                f52120a = new C17612an();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f52120a;
    }

    /* JADX INFO: renamed from: b */
    public void m75478b() {
    }

    /* JADX INFO: renamed from: c */
    public void m75482c(C17611am c17611am, String str) {
        if (c17611am == null || str == null) {
            return;
        }
        this.f52121b.put("com.huawei.agconnect", "validTime_".concat(str), Long.class, Long.valueOf(c17611am.validTime), AgcCrypto.class);
    }

    /* JADX INFO: renamed from: d */
    public void m75484d(C17611am c17611am, String str) {
        if (c17611am == null || str == null) {
            return;
        }
        c17611am.tokenString = (String) this.f52121b.get("com.huawei.agconnect", "tokenString_".concat(str), String.class, null, AgcCrypto.class);
    }

    /* JADX INFO: renamed from: e */
    public void m75485e(C17611am c17611am, String str) {
        if (c17611am == null || str == null) {
            return;
        }
        c17611am.expires = ((Long) this.f52121b.get("com.huawei.agconnect", "expires_".concat(str), Long.class, null, AgcCrypto.class)).longValue();
    }

    /* JADX INFO: renamed from: f */
    public void m75486f(C17611am c17611am, String str) {
        if (c17611am == null || str == null) {
            return;
        }
        c17611am.validTime = ((Long) this.f52121b.get("com.huawei.agconnect", "validTime_".concat(str), Long.class, null, AgcCrypto.class)).longValue();
    }

    /* JADX INFO: renamed from: a */
    public void m75475a(C17611am c17611am) {
    }

    /* JADX INFO: renamed from: b */
    public void m75479b(C17611am c17611am) {
    }

    /* JADX INFO: renamed from: c */
    public void m75483c(String str) {
        this.f52121b.remove("com.huawei.agconnect", "validTime_" + str);
    }

    /* JADX INFO: renamed from: a */
    public void m75476a(C17611am c17611am, String str) {
        if (c17611am == null || str == null) {
            return;
        }
        this.f52121b.put("com.huawei.agconnect", "tokenString_".concat(str), String.class, c17611am.tokenString, AgcCrypto.class);
    }

    /* JADX INFO: renamed from: b */
    public void m75480b(C17611am c17611am, String str) {
        if (c17611am == null || str == null) {
            return;
        }
        this.f52121b.put("com.huawei.agconnect", "expires_".concat(str), Long.class, Long.valueOf(c17611am.expires), AgcCrypto.class);
    }

    /* JADX INFO: renamed from: a */
    public void m75477a(String str) {
        this.f52121b.remove("com.huawei.agconnect", "tokenString_" + str);
    }

    /* JADX INFO: renamed from: b */
    public void m75481b(String str) {
        this.f52121b.remove("com.huawei.agconnect", "expires_" + str);
    }
}
