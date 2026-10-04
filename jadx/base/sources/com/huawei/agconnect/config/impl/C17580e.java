package com.huawei.agconnect.config.impl;

import android.text.TextUtils;
import android.util.Log;
import com.huawei.agconnect.config.ConfigReader;
import com.huawei.agconnect.config.IDecrypt;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.SecretKey;

/* JADX INFO: renamed from: com.huawei.agconnect.config.impl.e */
/* JADX INFO: loaded from: classes8.dex */
public class C17580e implements IDecrypt {

    /* JADX INFO: renamed from: a */
    private final ConfigReader f52010a;

    /* JADX INFO: renamed from: b */
    private SecretKey f52011b;

    /* JADX INFO: renamed from: c */
    private boolean f52012c = false;

    public C17580e(ConfigReader configReader) {
        this.f52010a = configReader;
    }

    /* JADX INFO: renamed from: a */
    private void m75365a() {
        try {
            this.f52011b = C17585j.m75373a(new C17579d(this.f52010a.getString("/code/code1", null), this.f52010a.getString("/code/code2", null), this.f52010a.getString("/code/code3", null), this.f52010a.getString("/code/code4", null), "PBKDF2WithHmacSHA1", 10000));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException unused) {
            Log.e("AGC_Mark", "Exception when reading the 'K&I' for 'Config'.");
            this.f52011b = null;
        }
        this.f52012c = true;
    }

    /* JADX INFO: renamed from: b */
    private String m75367b(String str) {
        try {
            Matcher matcher = Pattern.compile("^\\[!([A-Fa-f0-9]*)]").matcher(str);
            return matcher.find() ? matcher.group(1) : "";
        } catch (IllegalStateException | IndexOutOfBoundsException unused) {
            Log.e("AGC_Mark", "getRawString exception");
            return "";
        }
    }

    @Override // com.huawei.agconnect.config.IDecrypt
    public String decrypt(String str, String str2) {
        String str3;
        if (!this.f52012c) {
            m75365a();
        }
        if (this.f52011b == null) {
            str3 = "mKey is null, return default value";
        } else {
            if (!m75366a(str)) {
                return str2;
            }
            try {
                return new String(C17585j.m75374a(this.f52011b, Hex.decodeHexString(m75367b(str))), "UTF-8");
            } catch (UnsupportedEncodingException | IllegalArgumentException | GeneralSecurityException unused) {
                str3 = "UnsupportedEncodingException||GeneralSecurityException||IllegalArgumentException";
            }
        }
        Log.e("AGC_Mark", str3);
        return str2;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m75366a(String str) {
        return !TextUtils.isEmpty(str) && Pattern.matches("^\\[!([A-Fa-f0-9]*)]", str);
    }
}
