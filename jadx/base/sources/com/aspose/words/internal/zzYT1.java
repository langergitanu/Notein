package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYT1 {
    public static boolean zzW1(byte[] bArr) {
        boolean z = true;
        if (bArr.length == 16) {
            for (int i = 0; i != 8; i++) {
                if (bArr[i] != bArr[i + 8]) {
                    z = false;
                }
            }
            return z;
        }
        for (int i2 = 0; i2 != 8; i2++) {
            byte b = bArr[i2];
            byte b2 = bArr[i2 + 8];
            if (b != b2 || b2 != bArr[i2 + 16]) {
                z = false;
            }
        }
        return z;
    }

    public static boolean zzW2(byte[] bArr) {
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            boolean z4 = true;
            if (i == 8) {
                break;
            }
            byte b = bArr[i];
            byte b2 = bArr[i + 8];
            z |= b != b2;
            byte b3 = bArr[i + 16];
            z2 |= b != b3;
            if (b2 == b3) {
                z4 = false;
            }
            z3 |= z4;
            i++;
        }
        return z && z2 && z3;
    }

    private static boolean zzW3(byte[] bArr) {
        boolean z = false;
        for (int i = 0; i != 8; i++) {
            if (bArr[i] != bArr[i + 8]) {
                z = true;
            }
        }
        return z;
    }

    public static boolean zzW4(byte[] bArr) {
        return bArr.length == 16 ? zzW3(bArr) : zzW2(bArr);
    }

    public static boolean zzZU(byte[] bArr, int i) {
        for (int i2 = 0; i2 < i; i2 += 8) {
            if (zzYT0.zzZT(bArr, i2)) {
                return true;
            }
        }
        return false;
    }
}
