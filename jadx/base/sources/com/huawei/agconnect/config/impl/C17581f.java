package com.huawei.agconnect.config.impl;

import android.text.TextUtils;
import android.util.Log;
import com.huawei.agconnect.config.IDecrypt;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.SecretKey;

/* JADX INFO: renamed from: com.huawei.agconnect.config.impl.f */
/* JADX INFO: loaded from: classes8.dex */
public class C17581f implements IDecrypt {

    /* JADX INFO: renamed from: a */
    private SecretKey f52013a;

    /* JADX INFO: renamed from: b */
    private final C17579d f52014b;

    /* JADX INFO: renamed from: c */
    private boolean f52015c = false;

    public C17581f(C17579d c17579d) {
        this.f52014b = c17579d;
    }

    /* JADX INFO: renamed from: a */
    private void m75368a() {
        try {
            this.f52013a = C17585j.m75373a(this.f52014b);
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException unused) {
            Log.e("AGC_LocalResource", "Exception when reading the 'K&I' for 'Config'.");
            this.f52013a = null;
        }
        this.f52015c = true;
    }

    @Override // com.huawei.agconnect.config.IDecrypt
    public String decrypt(String str, String str2) {
        if (!this.f52015c) {
            m75368a();
        }
        if (this.f52013a != null && !TextUtils.isEmpty(str)) {
            try {
                return new String(C17585j.m75374a(this.f52013a, Hex.decodeHexString(str)), "UTF-8");
            } catch (UnsupportedEncodingException | IllegalArgumentException | GeneralSecurityException e) {
                Log.e("AGC_LocalResource", "decrypt exception:" + e.getMessage());
            }
        }
        return str2;
    }
}
