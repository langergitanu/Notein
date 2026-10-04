package com.huawei.hms.network.base.common.trans;

import com.aspose.slides.PatternStyle;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes9.dex */
final class Base64 {

    /* JADX INFO: renamed from: a */
    private static final byte[] f54057a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, PatternStyle.Wave, PatternStyle.Horizontal, PatternStyle.Vertical, PatternStyle.Cross, PatternStyle.DownwardDiagonal, PatternStyle.UpwardDiagonal, PatternStyle.DiagonalCross, 55, 56, 57, PatternStyle.Sphere, PatternStyle.Shingle};

    /* JADX INFO: renamed from: b */
    private static final byte[] f54058b = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, PatternStyle.Wave, PatternStyle.Horizontal, PatternStyle.Vertical, PatternStyle.Cross, PatternStyle.DownwardDiagonal, PatternStyle.UpwardDiagonal, PatternStyle.DiagonalCross, 55, 56, 57, PatternStyle.DottedGrid, 95};

    private Base64() {
    }

    /* JADX INFO: renamed from: a */
    private static String m77745a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        for (int i2 = 0; i2 < length; i2 += 3) {
            bArr3[i] = bArr2[(bArr[i2] & 255) >> 2];
            int i3 = i2 + 1;
            bArr3[i + 1] = bArr2[((bArr[i2] & 3) << 4) | ((bArr[i3] & 255) >> 4)];
            int i4 = i + 3;
            int i5 = (bArr[i3] & 15) << 2;
            int i6 = i2 + 2;
            bArr3[i + 2] = bArr2[i5 | ((bArr[i6] & 255) >> 6)];
            i += 4;
            bArr3[i4] = bArr2[bArr[i6] & 63];
        }
        int length2 = bArr.length % 3;
        if (length2 == 1) {
            bArr3[i] = bArr2[(bArr[length] & 255) >> 2];
            bArr3[i + 1] = bArr2[(bArr[length] & 3) << 4];
            bArr3[i + 2] = 61;
            bArr3[i + 3] = 61;
        } else if (length2 == 2) {
            bArr3[i] = bArr2[(bArr[length] & 255) >> 2];
            int i7 = (bArr[length] & 3) << 4;
            int i8 = length + 1;
            bArr3[i + 1] = bArr2[((bArr[i8] & 255) >> 4) | i7];
            bArr3[i + 2] = bArr2[(bArr[i8] & 15) << 2];
            bArr3[i + 3] = 61;
        }
        try {
            return new String(bArr3, "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public static byte[] decode(String str) {
        int i;
        char cCharAt;
        int length = str.length();
        while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int i2 = (int) ((((long) length) * 6) / 8);
        byte[] bArr = new byte[i2];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            char cCharAt2 = str.charAt(i6);
            if (cCharAt2 >= 'A' && cCharAt2 <= 'Z') {
                i = cCharAt2 - 'A';
            } else if (cCharAt2 >= 'a' && cCharAt2 <= 'z') {
                i = cCharAt2 - 'G';
            } else if (cCharAt2 >= '0' && cCharAt2 <= '9') {
                i = cCharAt2 + 4;
            } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                i = 62;
            } else if (cCharAt2 == '/' || cCharAt2 == '_') {
                i = 63;
            } else {
                if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                    return new byte[0];
                }
            }
            i5 = (i5 << 6) | ((byte) i);
            i3++;
            if (i3 % 4 == 0) {
                bArr[i4] = (byte) (i5 >> 16);
                int i7 = i4 + 2;
                bArr[i4 + 1] = (byte) (i5 >> 8);
                i4 += 3;
                bArr[i7] = (byte) i5;
            }
        }
        int i8 = i3 % 4;
        if (i8 == 1) {
            return new byte[0];
        }
        if (i8 == 2) {
            bArr[i4] = (byte) ((i5 << 12) >> 16);
            i4++;
        } else if (i8 == 3) {
            int i9 = i5 << 6;
            int i10 = i4 + 1;
            bArr[i4] = (byte) (i9 >> 16);
            i4 += 2;
            bArr[i10] = (byte) (i9 >> 8);
        }
        if (i4 == i2) {
            return bArr;
        }
        byte[] bArr2 = new byte[i4];
        System.arraycopy(bArr, 0, bArr2, 0, i4);
        return bArr2;
    }

    public static String encode(byte[] bArr) {
        return m77745a(bArr, f54057a);
    }

    public static String encodeUrl(byte[] bArr) {
        return m77745a(bArr, f54058b);
    }
}
