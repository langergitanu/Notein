package com.aspose.slides.internal.p505xn;

/* JADX INFO: renamed from: com.aspose.slides.internal.xn.k4 */
/* JADX INFO: loaded from: classes5.dex */
public class C12563k4 {

    /* JADX INFO: renamed from: k4 */
    public static final byte[] f42075k4 = new byte[0];

    /* JADX INFO: renamed from: k4 */
    public static int m58595k4(byte[] bArr, int i, int i2, byte[] bArr2) {
        int length = i2 + i;
        if (bArr.length < length) {
            length = bArr.length;
        }
        int length2 = length - bArr2.length;
        while (i <= length2) {
            int i3 = 0;
            while (i3 < bArr2.length && bArr[i + i3] == bArr2[i3]) {
                i3++;
            }
            if (i3 == bArr2.length) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m58596k4(int[] iArr, int i, int i2, int i3) {
        int i4 = (i2 + i) - 1;
        while (i <= i4) {
            int i5 = (i + i4) >> 1;
            int i6 = iArr[i5];
            if (i6 == i3) {
                return i5;
            }
            if (i6 < i3) {
                i = i5 + 1;
            } else {
                i4 = i5 - 1;
            }
        }
        return ~i;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m58597k4(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if ((bArr[i] & 255) != (bArr2[i] & 255)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m58598k4(byte[] bArr, byte[] bArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if ((bArr[i2] & 255) != (bArr2[i2] & 255)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m58599k4(int[] iArr, int[] iArr2) {
        if (iArr.length != iArr2.length) {
            return false;
        }
        for (int i = 0; i < iArr.length; i++) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }
}
