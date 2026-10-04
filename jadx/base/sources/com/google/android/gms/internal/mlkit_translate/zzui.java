package com.google.android.gms.internal.mlkit_translate;

import android.util.Base64;

/* JADX INFO: loaded from: classes7.dex */
public final class zzui {
    public static final zzua zza;

    static {
        byte[] bArrDecode = Base64.decode("xBkDPNxUEiMRX5vPP2wqvCR4Grb8GZQqrKNyC0Y", 3);
        byte[] bArrDecode2 = Base64.decode("xJXZd/zR0io4+XWtcwbtnyYutpO4NX7DhE3xBg4", 3);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[i] ^ bArrDecode2[i]);
        }
        zza = new zzua("722550545529", Base64.encodeToString(bArr, 3), "82c62205f0ef0ea96608a8");
    }
}
