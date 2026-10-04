package com.aspose.slides.internal.p482wr;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.wr.m9 */
/* JADX INFO: loaded from: classes5.dex */
public class C12263m9 {

    /* JADX INFO: renamed from: x1 */
    private static final long[] f41002x1 = new long[256];

    /* JADX INFO: renamed from: k4 */
    private long f41003k4;

    /* JADX INFO: renamed from: kk */
    private long f41004kk = 4294967295L;

    static {
        for (long j = 0; (j & 4294967295L) < 256; j++) {
            long j2 = j;
            for (long j3 = 8; (j3 & 4294967295L) > 0; j3--) {
                long j4 = j2 & 4294967295L;
                j2 = ((j2 & 1) == 1 ? (j4 >> 1) ^ 3988292384L : j4 >> 1) & 4294967295L;
            }
            f41002x1[(int) j] = j2;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final int m57373k4(int i, byte b) {
        return m57372k4(((long) i) & 4294967295L, b);
    }

    /* JADX INFO: renamed from: x1 */
    public final int m57378x1() {
        return (int) ((~(this.f41004kk & 4294967295L)) & 4294967295L);
    }

    /* JADX INFO: renamed from: k4 */
    public static int m57372k4(long j, byte b) {
        long j2 = j & 4294967295L;
        return (int) ((j2 >> 8) ^ f41002x1[(int) ((((long) (b & 255)) ^ j2) & 255)]);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m57374k4(AbstractC3150x6 abstractC3150x6) {
        return m57375k4(abstractC3150x6, (AbstractC3150x6) null);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m57375k4(AbstractC3150x6 abstractC3150x6, AbstractC3150x6 abstractC3150x62) {
        if (abstractC3150x6 == null) {
            throw new C12250c6("The input stream must not be null.");
        }
        byte[] bArr = new byte[8192];
        this.f41003k4 = 0L;
        int i = abstractC3150x6.read(bArr, 0, 8192);
        if (abstractC3150x62 != null) {
            abstractC3150x62.write(bArr, 0, i);
        }
        while (true) {
            this.f41003k4 += (long) i;
            if (i <= 0) {
                return (int) ((~(this.f41004kk & 4294967295L)) & 4294967295L);
            }
            m57377k4(bArr, 0, i);
            i = abstractC3150x6.read(bArr, 0, 8192);
            if (abstractC3150x62 != null) {
                abstractC3150x62.write(bArr, 0, i);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final long m57376k4() {
        return this.f41003k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57377k4(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new C12250c6("The data buffer must not be null.");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            long j = this.f41004kk;
            this.f41004kk = (f41002x1[(int) (((j & 255) ^ ((long) (bArr[i + i3] & 255))) & 4294967295L)] ^ ((j & 4294967295L) >> 8)) & 4294967295L;
        }
        this.f41003k4 += (long) i2;
    }
}
