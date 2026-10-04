package com.nimbusds.jose.crypto.impl;

import OooOOO0.AbstractC20449OooO0Oo;
import com.nimbusds.jose.JOSEException;
import java.lang.reflect.Array;
import java.util.Arrays;
import javax.crypto.SecretKey;
import o00000O0.OooO00o;
import oO0oOoOo.C34203OooO0o0;
import oO0oOoo.C34205OooO00o;
import oO0oo000.C34231OooO00o;
import oO0oo00O.C34233OooO0O0;
import oOO000oO.C34332OooO00o;

/* JADX INFO: loaded from: classes9.dex */
public class LegacyAESGCM {
    public static final int AUTH_TAG_BIT_LENGTH = 128;

    private LegacyAESGCM() {
    }

    public static C34205OooO00o createAESCipher(SecretKey secretKey, boolean z) {
        C34205OooO00o c34205OooO00o = new C34205OooO00o();
        c34205OooO00o.OooO00o(z, new OooO00o(secretKey.getEncoded()));
        return c34205OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static C34231OooO00o createAESGCMCipher(SecretKey secretKey, boolean z, byte[] bArr, byte[] bArr2) {
        byte b;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        byte[] bArr6;
        C34205OooO00o c34205OooO00oCreateAESCipher = createAESCipher(secretKey, z);
        C34231OooO00o c34231OooO00o = new C34231OooO00o();
        c34205OooO00oCreateAESCipher.getClass();
        C34233OooO0O0 c34233OooO0O0 = new C34233OooO0O0();
        c34231OooO00o.f122947OooO00o = c34205OooO00oCreateAESCipher;
        c34231OooO00o.f122948OooO0O0 = c34233OooO0O0;
        OooO00o oooO00o = new OooO00o(secretKey.getEncoded());
        byte[] bArrOooO00o = C34332OooO00o.OooO00o(bArr);
        byte[] bArrOooO00o2 = C34332OooO00o.OooO00o(bArr2);
        c34231OooO00o.f122950OooO0Oo = z;
        c34231OooO00o.f122959OooOOO0 = null;
        byte b2 = 1;
        c34231OooO00o.f122952OooO0o0 = true;
        byte[] bArrOooO00o3 = C34332OooO00o.OooO00o(bArrOooO00o);
        c34231OooO00o.f122946OooO = C34332OooO00o.OooO00o(bArrOooO00o2);
        c34231OooO00o.f122951OooO0o = 16;
        c34231OooO00o.f122957OooOO0o = new byte[z ? 16 : 32];
        if (bArrOooO00o3 == null || bArrOooO00o3.length < 1) {
            throw new IllegalArgumentException("IV must be at least 1 byte");
        }
        if (z && (bArr5 = c34231OooO00o.f122954OooO0oo) != null && Arrays.equals(bArr5, bArrOooO00o3) && (bArr6 = c34231OooO00o.f122953OooO0oO) != null && Arrays.equals(bArr6, (byte[]) oooO00o.f81237OooO00o)) {
            throw new IllegalArgumentException("cannot reuse nonce for GCM encryption");
        }
        c34231OooO00o.f122954OooO0oo = bArrOooO00o3;
        c34231OooO00o.f122953OooO0oO = (byte[]) oooO00o.f81237OooO00o;
        c34205OooO00oCreateAESCipher.OooO00o(true, oooO00o);
        byte[] bArr7 = new byte[16];
        c34231OooO00o.f122955OooOO0 = bArr7;
        c34205OooO00oCreateAESCipher.OooO0O0(bArr7, bArr7);
        byte[] bArr8 = c34231OooO00o.f122955OooOO0;
        int i = 2;
        if (c34233OooO0O0.f122972OooO0O0 != null) {
            byte[] bArr9 = c34233OooO0O0.f122971OooO00o;
            int i2 = 0;
            for (int i3 = 0; i3 < 16; i3++) {
                i2 |= bArr9[i3] ^ bArr8[i3];
            }
            if (((byte) ((((i2 >>> 1) | (i2 & 1)) - 1) >> 31)) != 0) {
                b = 1;
            }
            c34231OooO00o.f122949OooO0OO = null;
            byte[] bArr10 = new byte[16];
            c34231OooO00o.f122956OooOO0O = bArr10;
            bArr3 = c34231OooO00o.f122954OooO0oo;
            if (bArr3.length != 12) {
                System.arraycopy(bArr3, 0, bArr10, 0, bArr3.length);
                c34231OooO00o.f122956OooOO0O[15] = b;
            } else {
                int length = bArr3.length;
                for (int i4 = 0; i4 < length; i4 += 16) {
                    c34231OooO00o.OooO0OO(i4, bArr10, bArr3, Math.min(length - i4, 16));
                }
                byte[] bArr11 = new byte[16];
                AbstractC20449OooO0Oo.Oooo0(((long) c34231OooO00o.f122954OooO0oo.length) * 8, bArr11, 8);
                byte[] bArr12 = c34231OooO00o.f122956OooOO0O;
                AbstractC20449OooO0Oo.Oooo0oo(bArr12, bArr11);
                c34231OooO00o.f122948OooO0O0.OooO00o(bArr12);
            }
            c34231OooO00o.f122958OooOOO = new byte[16];
            c34231OooO00o.f122960OooOOOO = new byte[16];
            c34231OooO00o.f122961OooOOOo = new byte[16];
            c34231OooO00o.f122966OooOo0 = new byte[16];
            c34231OooO00o.f122968OooOo0O = 0;
            c34231OooO00o.f122969OooOo0o = 0L;
            c34231OooO00o.f122965OooOo = 0L;
            c34231OooO00o.f122963OooOOo0 = C34332OooO00o.OooO00o(c34231OooO00o.f122956OooOO0O);
            c34231OooO00o.f122962OooOOo = -2;
            c34231OooO00o.f122964OooOOoo = 0;
            c34231OooO00o.f122967OooOo00 = 0L;
            bArr4 = c34231OooO00o.f122946OooO;
            if (bArr4 != null) {
                c34231OooO00o.OooO0o(bArr4.length, bArr4);
            }
            return c34231OooO00o;
        }
        c34233OooO0O0.f122972OooO0O0 = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 256, 2);
        byte[] bArr13 = new byte[16];
        c34233OooO0O0.f122971OooO00o = bArr13;
        for (int i5 = 0; i5 < 16; i5++) {
            bArr13[i5] = bArr8[i5];
        }
        byte[] bArr14 = c34233OooO0O0.f122971OooO00o;
        long[] jArr = c34233OooO0O0.f122972OooO0O0[1];
        int i6 = 0;
        int i7 = 0;
        while (i6 < 2) {
            jArr[i6] = ((((long) AbstractC20449OooO0Oo.OooO0oo(i7, bArr14)) & 4294967295L) << 32) | (((long) AbstractC20449OooO0Oo.OooO0oo(i7 + 4, bArr14)) & 4294967295L);
            i7 += 8;
            i6++;
            b2 = b2;
        }
        b = b2;
        long[] jArr2 = c34233OooO0O0.f122972OooO0O0[b];
        long j = jArr2[0];
        long j2 = jArr2[b];
        long j3 = j2 << 57;
        jArr2[0] = ((((j >>> 7) ^ j3) ^ (j3 >>> b)) ^ (j3 >>> 2)) ^ (j3 >>> 7);
        jArr2[b] = (j << 57) | (j2 >>> 7);
        for (int i8 = 256; i < i8; i8 = 256) {
            long[][] jArr3 = c34233OooO0O0.f122972OooO0O0;
            long[] jArr4 = jArr3[i >> 1];
            long[] jArr5 = jArr3[i];
            long j4 = jArr4[0];
            long j5 = jArr4[b];
            long j6 = j4 >> 63;
            long j7 = ((j4 ^ ((-2233785415175766016L) & j6)) << b) | (j5 >>> 63);
            jArr5[0] = j7;
            long j8 = (-j6) | (j5 << b);
            jArr5[b] = j8;
            long[] jArr6 = jArr3[b];
            long[] jArr7 = jArr3[i + 1];
            jArr7[0] = jArr6[0] ^ j7;
            jArr7[b] = j8 ^ jArr6[b];
            i += 2;
        }
        c34231OooO00o.f122949OooO0OO = null;
        byte[] bArr102 = new byte[16];
        c34231OooO00o.f122956OooOO0O = bArr102;
        bArr3 = c34231OooO00o.f122954OooO0oo;
        if (bArr3.length != 12) {
        }
        c34231OooO00o.f122958OooOOO = new byte[16];
        c34231OooO00o.f122960OooOOOO = new byte[16];
        c34231OooO00o.f122961OooOOOo = new byte[16];
        c34231OooO00o.f122966OooOo0 = new byte[16];
        c34231OooO00o.f122968OooOo0O = 0;
        c34231OooO00o.f122969OooOo0o = 0L;
        c34231OooO00o.f122965OooOo = 0L;
        c34231OooO00o.f122963OooOOo0 = C34332OooO00o.OooO00o(c34231OooO00o.f122956OooOO0O);
        c34231OooO00o.f122962OooOOo = -2;
        c34231OooO00o.f122964OooOOoo = 0;
        c34231OooO00o.f122967OooOo00 = 0L;
        bArr4 = c34231OooO00o.f122946OooO;
        if (bArr4 != null) {
        }
        return c34231OooO00o;
    }

    public static byte[] decrypt(SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws JOSEException {
        int i = 0;
        C34231OooO00o c34231OooO00oCreateAESGCMCipher = createAESGCMCipher(secretKey, false, bArr, bArr3);
        int length = bArr2.length + bArr4.length;
        byte[] bArr5 = new byte[length];
        System.arraycopy(bArr2, 0, bArr5, 0, bArr2.length);
        System.arraycopy(bArr4, 0, bArr5, bArr2.length, bArr4.length);
        int i2 = c34231OooO00oCreateAESGCMCipher.f122964OooOOoo + length;
        if (c34231OooO00oCreateAESGCMCipher.f122950OooO0Oo) {
            i = i2 + c34231OooO00oCreateAESGCMCipher.f122951OooO0o;
        } else {
            int i3 = c34231OooO00oCreateAESGCMCipher.f122951OooO0o;
            if (i2 >= i3) {
                i = i2 - i3;
            }
        }
        byte[] bArr6 = new byte[i];
        try {
            c34231OooO00oCreateAESGCMCipher.OooO0O0(bArr6, c34231OooO00oCreateAESGCMCipher.OooO0oo(length, bArr5, bArr6));
            return bArr6;
        } catch (C34203OooO0o0 e) {
            throw new JOSEException("Couldn't validate GCM authentication tag: " + e.getMessage(), e);
        }
    }

    public static AuthenticatedCipherText encrypt(SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3) throws JOSEException {
        int i;
        C34231OooO00o c34231OooO00oCreateAESGCMCipher = createAESGCMCipher(secretKey, true, bArr, bArr3);
        int length = bArr2.length + c34231OooO00oCreateAESGCMCipher.f122964OooOOoo;
        if (c34231OooO00oCreateAESGCMCipher.f122950OooO0Oo) {
            i = length + c34231OooO00oCreateAESGCMCipher.f122951OooO0o;
        } else {
            int i2 = c34231OooO00oCreateAESGCMCipher.f122951OooO0o;
            i = length < i2 ? 0 : length - i2;
        }
        byte[] bArr4 = new byte[i];
        int iOooO0oo = c34231OooO00oCreateAESGCMCipher.OooO0oo(bArr2.length, bArr2, bArr4);
        try {
            int iOooO0O0 = (iOooO0oo + c34231OooO00oCreateAESGCMCipher.OooO0O0(bArr4, iOooO0oo)) - 16;
            byte[] bArr5 = new byte[iOooO0O0];
            byte[] bArr6 = new byte[16];
            System.arraycopy(bArr4, 0, bArr5, 0, iOooO0O0);
            System.arraycopy(bArr4, iOooO0O0, bArr6, 0, 16);
            return new AuthenticatedCipherText(bArr5, bArr6);
        } catch (C34203OooO0o0 e) {
            throw new JOSEException("Couldn't generate GCM authentication tag: " + e.getMessage(), e);
        }
    }
}
