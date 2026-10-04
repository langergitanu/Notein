package com.huawei.agconnect.credential.obs;

import android.text.TextUtils;
import com.huawei.agconnect.common.api.Logger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: com.huawei.agconnect.credential.obs.f */
/* JADX INFO: loaded from: classes8.dex */
final class C17628f {

    /* JADX INFO: renamed from: a */
    private static final String f52161a = "SHA-256";

    /* JADX INFO: renamed from: b */
    private static final char[] f52162b = "0123456789ABCDEF".toCharArray();

    /* JADX INFO: renamed from: a */
    public static String m75550a(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str2)) {
                str2 = "SHA-256";
            }
            MessageDigest messageDigest = MessageDigest.getInstance(str2);
            messageDigest.update(str.getBytes(Charset.defaultCharset()));
            return m75553b(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            Logger.m75328e("", "", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m75553b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            char[] cArr = f52162b;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m75551a(String str) {
        return m75552a(str.getBytes(Charset.defaultCharset()));
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m75552a(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA-256").digest(bArr);
        } catch (NoSuchAlgorithmException unused) {
            throw new RuntimeException("encrypt failed");
        }
    }
}
