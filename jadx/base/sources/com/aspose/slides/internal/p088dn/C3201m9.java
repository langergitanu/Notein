package com.aspose.slides.internal.p088dn;

import java.util.Arrays;

/* JADX INFO: renamed from: com.aspose.slides.internal.dn.m9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3201m9 {

    /* JADX INFO: renamed from: k4 */
    private static final char[] f9533k4;

    /* JADX INFO: renamed from: x1 */
    private static final int[] f9534x1;

    static {
        char[] charArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
        f9533k4 = charArray;
        int[] iArr = new int[256];
        f9534x1 = iArr;
        Arrays.fill(iArr, -1);
        int length = charArray.length;
        for (int i = 0; i < length; i++) {
            f9534x1[f9533k4[i]] = i;
        }
        f9534x1[61] = 0;
    }

    /* JADX INFO: renamed from: k4 */
    public static final byte[] m13781k4(String str) {
        int length = str != null ? str.length() : 0;
        if (length == 0) {
            return new byte[0];
        }
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (f9534x1[str.charAt(i2)] < 0) {
                i++;
            }
        }
        int i3 = length - i;
        if (i3 % 4 != 0) {
            return null;
        }
        int i4 = 0;
        while (length > 1) {
            length--;
            if (f9534x1[str.charAt(length)] > 0) {
                break;
            }
            if (str.charAt(length) == '=') {
                i4++;
            }
        }
        int i5 = ((i3 * 6) >> 3) - i4;
        byte[] bArr = new byte[i5];
        int i6 = 0;
        int i7 = 0;
        while (i6 < i5) {
            int i8 = 0;
            int i9 = 0;
            while (i8 < 4) {
                int i10 = i7 + 1;
                int i11 = f9534x1[str.charAt(i7)];
                if (i11 >= 0) {
                    i9 |= i11 << (18 - (i8 * 6));
                } else {
                    i8--;
                }
                i8++;
                i7 = i10;
            }
            int i12 = i6 + 1;
            bArr[i6] = (byte) (i9 >> 16);
            if (i12 < i5) {
                int i13 = i6 + 2;
                bArr[i12] = (byte) (i9 >> 8);
                if (i13 < i5) {
                    i6 += 3;
                    bArr[i13] = (byte) i9;
                } else {
                    i6 = i13;
                }
            } else {
                i6 = i12;
            }
        }
        return bArr;
    }
}
