package com.huawei.agconnect.credential.obs;

import com.huawei.agconnect.datastore.annotation.DefaultCrypto;
import com.huawei.agconnect.datastore.core.CryptoUtil;
import com.huawei.agconnect.datastore.core.SharedPrefUtil;

/* JADX INFO: renamed from: com.huawei.agconnect.credential.obs.ae */
/* JADX INFO: loaded from: classes8.dex */
public class C17603ae {

    /* JADX INFO: renamed from: a */
    private static C17603ae f52102a;

    /* JADX INFO: renamed from: b */
    private SharedPrefUtil f52103b = SharedPrefUtil.getInstance();

    /* JADX INFO: renamed from: c */
    private CryptoUtil f52104c;

    private C17603ae() {
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C17603ae m75445a() {
        try {
            if (f52102a == null) {
                f52102a = new C17603ae();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f52102a;
    }

    /* JADX INFO: renamed from: b */
    public void m75449b() {
    }

    /* JADX INFO: renamed from: c */
    public void m75453c(C17602ad c17602ad, String str) {
        if (c17602ad == null || str == null) {
            return;
        }
        this.f52103b.put("agc_site", "validTime_".concat(str), Long.class, Long.valueOf(c17602ad.validTime), DefaultCrypto.class);
    }

    /* JADX INFO: renamed from: d */
    public void m75455d(C17602ad c17602ad, String str) {
        if (c17602ad == null || str == null) {
            return;
        }
        c17602ad.mainUrl = (String) this.f52103b.get("agc_site", "main_".concat(str), String.class, null, DefaultCrypto.class);
    }

    /* JADX INFO: renamed from: e */
    public void m75456e(C17602ad c17602ad, String str) {
        if (c17602ad == null || str == null) {
            return;
        }
        c17602ad.backUrl = (String) this.f52103b.get("agc_site", "backup_".concat(str), String.class, null, DefaultCrypto.class);
    }

    /* JADX INFO: renamed from: f */
    public void m75457f(C17602ad c17602ad, String str) {
        if (c17602ad == null || str == null) {
            return;
        }
        c17602ad.validTime = ((Long) this.f52103b.get("agc_site", "validTime_".concat(str), Long.class, null, DefaultCrypto.class)).longValue();
    }

    /* JADX INFO: renamed from: a */
    public void m75446a(C17602ad c17602ad) {
    }

    /* JADX INFO: renamed from: b */
    public void m75450b(C17602ad c17602ad) {
    }

    /* JADX INFO: renamed from: c */
    public void m75454c(String str) {
        this.f52103b.remove("agc_site", "validTime_" + str);
    }

    /* JADX INFO: renamed from: a */
    public void m75447a(C17602ad c17602ad, String str) {
        if (c17602ad == null || str == null) {
            return;
        }
        this.f52103b.put("agc_site", "main_".concat(str), String.class, c17602ad.mainUrl, DefaultCrypto.class);
    }

    /* JADX INFO: renamed from: b */
    public void m75451b(C17602ad c17602ad, String str) {
        if (c17602ad == null || str == null) {
            return;
        }
        this.f52103b.put("agc_site", "backup_".concat(str), String.class, c17602ad.backUrl, DefaultCrypto.class);
    }

    /* JADX INFO: renamed from: a */
    public void m75448a(String str) {
        this.f52103b.remove("agc_site", "main_" + str);
    }

    /* JADX INFO: renamed from: b */
    public void m75452b(String str) {
        this.f52103b.remove("agc_site", "backup_" + str);
    }
}
