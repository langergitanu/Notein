package com.google.android.play.integrity.internal;

import android.util.Base64;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.ah */
/* JADX INFO: loaded from: classes7.dex */
public final class C16368ah {
    /* JADX INFO: renamed from: a */
    public static String m75016a(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(KeyUtil.HMAC_KEY_HASH_ALGORITHM);
            messageDigest.update(bArr);
            return Base64.encodeToString(messageDigest.digest(), 11);
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }
}
