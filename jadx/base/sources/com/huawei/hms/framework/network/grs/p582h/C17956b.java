package com.huawei.hms.framework.network.grs.p582h;

import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.embedded.C18358t1;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.huawei.hms.framework.network.grs.h.b */
/* JADX INFO: loaded from: classes7.dex */
public class C17956b {

    /* JADX INFO: renamed from: a */
    private static final String f53748a = "b";

    /* JADX INFO: renamed from: b */
    private static final Pattern f53749b = Pattern.compile("[0-9]*[a-z|A-Z]*[一-龥]*");

    /* JADX INFO: renamed from: a */
    public static String m77151a(String str) {
        return m77152a(str, KeyUtil.HMAC_KEY_HASH_ALGORITHM);
    }

    /* JADX INFO: renamed from: b */
    public static String m77154b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int i = 1;
        if (str.length() == 1) {
            return C18358t1.g.f56183c;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < str.length(); i2++) {
            String str2 = str.charAt(i2) + "";
            if (f53749b.matcher(str2).matches()) {
                if (i % 2 == 0) {
                    str2 = C18358t1.g.f56183c;
                }
                i++;
            }
            stringBuffer.append(str2);
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: a */
    private static String m77152a(String str, String str2) {
        String str3;
        String str4;
        try {
            try {
                return m77153a(MessageDigest.getInstance(str2).digest(str.getBytes("UTF-8")));
            } catch (NoSuchAlgorithmException unused) {
                str3 = f53748a;
                str4 = "encrypt NoSuchAlgorithmException";
                Logger.m76967w(str3, str4);
                return null;
            }
        } catch (UnsupportedEncodingException unused2) {
            str3 = f53748a;
            str4 = "encrypt UnsupportedEncodingException";
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m77153a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                sb.append("0");
            }
            sb.append(hexString);
        }
        return sb.toString();
    }
}
