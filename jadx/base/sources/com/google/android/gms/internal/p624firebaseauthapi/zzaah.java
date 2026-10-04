package com.google.android.gms.internal.p624firebaseauthapi;

import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import java.security.InvalidKeyException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class zzaah {
    public static byte[] zza(byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        long[] jArr = new long[11];
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 32);
        bArrCopyOf[0] = (byte) (bArrCopyOf[0] & 248);
        byte b = (byte) (bArrCopyOf[31] & Ascii.DEL);
        bArrCopyOf[31] = b;
        bArrCopyOf[31] = (byte) (b | SignedBytes.MAX_POWER_OF_TWO);
        zzng.zza(jArr, bArrCopyOf, bArr2);
        return zznm.zzc(jArr);
    }

    public static byte[] zza() {
        byte[] bArrZza = zzqd.zza(32);
        bArrZza[0] = (byte) (bArrZza[0] | 7);
        byte b = (byte) (bArrZza[31] & 63);
        bArrZza[31] = b;
        bArrZza[31] = (byte) (b | UnsignedBytes.MAX_POWER_OF_TWO);
        return bArrZza;
    }

    public static byte[] zza(byte[] bArr) throws InvalidKeyException {
        if (bArr.length == 32) {
            byte[] bArr2 = new byte[32];
            bArr2[0] = 9;
            return zza(bArr, bArr2);
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }
}
