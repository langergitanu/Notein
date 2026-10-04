package com.huawei.agconnect.credential.obs;

import Oooo0O0.C20945OoooO00;
import Oooo0oO.C21081o00000o0;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.internal.OooO00o;
import com.huawei.agconnect.datastore.annotation.ICrypto;
import javax.crypto.SecretKey;

/* JADX INFO: renamed from: com.huawei.agconnect.credential.obs.l */
/* JADX INFO: loaded from: classes8.dex */
public class C17634l implements ICrypto {

    /* JADX INFO: renamed from: a */
    private static final String f52177a = "PBKDF2WithHmacSHA256";

    /* JADX INFO: renamed from: b */
    private static final int f52178b = 1;

    /* JADX INFO: renamed from: c */
    private static final String f52179c = "AGC_V3_";

    /* JADX INFO: renamed from: d */
    private SecretKey f52180d;

    /* JADX INFO: renamed from: b */
    private SecretKey m75579b() {
        if (this.f52180d == null) {
            this.f52180d = C17629g.m75554a().m75557a(f52177a, 1);
        }
        return this.f52180d;
    }

    /* JADX INFO: renamed from: a */
    public String m75580a() {
        SecretKey secretKeyM75579b = m75579b();
        if (secretKeyM75579b == null) {
            return null;
        }
        return C20945OoooO00.OooO0O0(secretKeyM75579b.getEncoded());
    }

    @Override // com.huawei.agconnect.datastore.annotation.ICrypto
    public String decrypt(String str) {
        return (TextUtils.isEmpty(str) || !str.startsWith(f52179c)) ? "" : C21081o00000o0.OooO0OO(str.substring(7), m75580a());
    }

    @Override // com.huawei.agconnect.datastore.annotation.ICrypto
    public String encrypt(String str) {
        return OooO00o.OooO00o(f52179c, C21081o00000o0.OooO0o0(str, m75580a()));
    }
}
