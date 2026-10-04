package com.aspose.slides.internal.p154gr;

/* JADX INFO: renamed from: com.aspose.slides.internal.gr.k4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4374k4 {
    /* JADX INFO: renamed from: k4 */
    public static byte[] m17614k4(int[] iArr, byte[] bArr) {
        if (iArr == null) {
            return null;
        }
        if (iArr.length == 0) {
            return new byte[0];
        }
        if (bArr == null) {
            bArr = new byte[iArr.length];
        }
        for (int i = 0; i < iArr.length; i++) {
            bArr[i] = (byte) iArr[i];
        }
        return bArr;
    }
}
