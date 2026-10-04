package com.aspose.words.internal;

import OoooooO.C21421OooO0oO;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
final class zzZI1 {
    private final int[] zzZHG;
    private final char[] zzZHH;

    public zzZI1(String str) {
        this.zzZHH = str.toCharArray();
        if (str.length() != 64) {
            throw new IllegalArgumentException("alphabet has incorrect length (should be 64, not " + str.length() + ")");
        }
        int[] iArr = new int[128];
        this.zzZHG = iArr;
        Arrays.fill(iArr, -1);
        int i = 0;
        while (true) {
            char[] cArr = this.zzZHH;
            if (i >= cArr.length) {
                return;
            }
            char c = cArr[i];
            if (c >= 128) {
                throw new IllegalArgumentException(C21421OooO0oO.OooO00o("invalid character in alphabet: ", c));
            }
            this.zzZHG[c] = i;
            i++;
        }
    }

    public final int zzA(byte b) {
        if (b >= 128 || b < 0) {
            return -1;
        }
        return this.zzZHG[b];
    }

    public final byte zzPw(int i) {
        return (byte) this.zzZHH[i];
    }

    public final boolean zzZF(char c) {
        return c < 128 && c >= 0 && this.zzZHG[c] >= 0;
    }
}
