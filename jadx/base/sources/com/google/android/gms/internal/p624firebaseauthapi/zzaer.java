package com.google.android.gms.internal.p624firebaseauthapi;

import com.aspose.words.ControlChar;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class zzaer {
    public static String zza(zzaes zzaesVar, String str) {
        try {
            String str2 = new String(MessageDigest.getInstance(KeyUtil.HMAC_KEY_HASH_ALGORITHM).digest(str.getBytes()));
            int length = str2.length();
            int i = 0;
            while (i < length) {
                if (zzg.zza(str2.charAt(i))) {
                    char[] charArray = str2.toCharArray();
                    while (i < length) {
                        char c = charArray[i];
                        if (zzg.zza(c)) {
                            charArray[i] = (char) (c ^ ControlChar.SPACE_CHAR);
                        }
                        i++;
                    }
                    return String.valueOf(charArray);
                }
                i++;
            }
            return str2;
        } catch (NoSuchAlgorithmException unused) {
            zzaes.zza.m74920e("Failed to get SHA-256 MessageDigest", new Object[0]);
            return null;
        }
    }

    public static void zzb(zzaes zzaesVar, String str) {
        zzaesVar.zza(str, null);
    }
}
