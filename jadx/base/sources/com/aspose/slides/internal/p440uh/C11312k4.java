package com.aspose.slides.internal.p440uh;

/* JADX INFO: renamed from: com.aspose.slides.internal.uh.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C11312k4 {
    /* JADX INFO: renamed from: k4 */
    public static int m54341k4(byte[] bArr, int i) {
        byte b = bArr[i];
        return b < 0 ? b + 256 : b;
    }

    /* JADX INFO: renamed from: kk */
    public static int m54342kk(byte[] bArr, int i) {
        int iM54341k4 = m54341k4(bArr, i);
        int iM54341k42 = m54341k4(bArr, i + 1);
        int iM54341k43 = m54341k4(bArr, i + 2);
        return (m54341k4(bArr, i + 3) << 24) | (iM54341k42 << 8) | iM54341k4 | (iM54341k43 << 16);
    }

    /* JADX INFO: renamed from: x1 */
    public static short m54343x1(byte[] bArr, int i) {
        int i2 = i + 1;
        return (short) ((m54341k4(bArr, i2) << 8) | m54341k4(bArr, i));
    }
}
