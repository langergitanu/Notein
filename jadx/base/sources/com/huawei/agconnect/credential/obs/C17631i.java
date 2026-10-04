package com.huawei.agconnect.credential.obs;

import Oooo0oO.C21081o00000o0;
import android.text.TextUtils;
import com.aspose.slides.C22226Oooo0oo;
import com.huawei.agconnect.datastore.annotation.ICrypto;
import com.huawei.agconnect.datastore.annotation.SharedPreference;

/* JADX INFO: renamed from: com.huawei.agconnect.credential.obs.i */
/* JADX INFO: loaded from: classes8.dex */
public class C17631i implements ICrypto {

    /* JADX INFO: renamed from: a */
    private static final int f52169a = 16;

    /* JADX INFO: renamed from: b */
    private String f52170b = null;

    @SharedPreference(fileName = "com.huawei.appgallery.datastore", key = "key")
    String randomKey;

    /* JADX INFO: renamed from: a */
    private String m75568a() {
        if (TextUtils.isEmpty(this.f52170b)) {
            StringBuilder sbOooO0OO = C22226Oooo0oo.OooO0OO(C17636n.m75584a(C17636n.m75583a(C17607ai.m75469c(), 6), C17635m.m75581a()), C17636n.m75584a(C17636n.m75583a("AE6D8285", -4), C17607ai.f52115a));
            sbOooO0OO.append(m75569b());
            this.f52170b = sbOooO0OO.toString();
        }
        return this.f52170b;
    }

    /* JADX INFO: renamed from: b */
    private String m75569b() {
        C17632j.m75570a().m75576d(this);
        if (TextUtils.isEmpty(this.randomKey) || this.randomKey.length() != 16) {
            this.randomKey = C17636n.m75582a(16);
            C17632j.m75570a().m75573b(this);
        }
        return this.randomKey;
    }

    @Override // com.huawei.agconnect.datastore.annotation.ICrypto
    public String decrypt(String str) {
        return C21081o00000o0.OooO0OO(str, m75568a());
    }

    @Override // com.huawei.agconnect.datastore.annotation.ICrypto
    public String encrypt(String str) {
        return C21081o00000o0.OooO0o0(str, m75568a());
    }
}
