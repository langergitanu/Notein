package com.huawei.agconnect.credential.obs;

import Oooo0O0.C20945OoooO00;
import Oooo0oO.C21081o00000o0;
import com.huawei.agconnect.datastore.annotation.ICrypto;
import javax.crypto.SecretKey;

/* JADX INFO: renamed from: com.huawei.agconnect.credential.obs.k */
/* JADX INFO: loaded from: classes8.dex */
public class C17633k implements ICrypto {

    /* JADX INFO: renamed from: a */
    private static final String f52174a = "PBKDF2WithHmacSHA1";

    /* JADX INFO: renamed from: b */
    private static final int f52175b = 5000;

    /* JADX INFO: renamed from: c */
    private SecretKey f52176c;

    /* JADX INFO: renamed from: b */
    private SecretKey m75577b() {
        if (this.f52176c == null) {
            this.f52176c = C17629g.m75554a().m75557a(f52174a, 5000);
        }
        return this.f52176c;
    }

    /* JADX INFO: renamed from: a */
    public String m75578a() {
        SecretKey secretKeyM75577b = m75577b();
        if (secretKeyM75577b == null) {
            return null;
        }
        return C20945OoooO00.OooO0O0(secretKeyM75577b.getEncoded());
    }

    @Override // com.huawei.agconnect.datastore.annotation.ICrypto
    public String decrypt(String str) {
        return C21081o00000o0.OooO0OO(str, m75578a());
    }

    @Override // com.huawei.agconnect.datastore.annotation.ICrypto
    public String encrypt(String str) {
        return C21081o00000o0.OooO0o0(str, m75578a());
    }
}
