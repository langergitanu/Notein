package com.aspose.slides.internal.p077d8;

/* JADX INFO: renamed from: com.aspose.slides.internal.d8.ss */
/* JADX INFO: loaded from: classes3.dex */
class C3084ss {
    /* JADX INFO: renamed from: k4 */
    private static void m13062k4(Object obj, int i, Object obj2, int i2, int i3) {
        if (i2 < 0) {
            System.arraycopy(obj, i - i2, obj2, 0, i3 + i2);
        } else {
            System.arraycopy(obj, i, obj2, i2, i3);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m13063k4(C3098w6 c3098w6, byte[] bArr) {
        return c3098w6.m13167k4(bArr);
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m13064k4(byte[] bArr) {
        int i = 0;
        while (i < bArr.length - 1 && bArr[i] == 0) {
            i++;
        }
        if (i <= 0) {
            return bArr;
        }
        int length = bArr.length - i;
        byte[] bArr2 = new byte[length];
        m13062k4(bArr, i, bArr2, 0, length);
        return bArr2;
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m13065k4(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        m13062k4(bArr, 0, bArr2, i - bArr.length, bArr.length);
        return bArr2;
    }
}
