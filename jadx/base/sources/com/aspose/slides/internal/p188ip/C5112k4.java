package com.aspose.slides.internal.p188ip;

/* JADX INFO: renamed from: com.aspose.slides.internal.ip.k4 */
/* JADX INFO: loaded from: classes.dex */
public class C5112k4 {

    /* JADX INFO: renamed from: du */
    private long f14068du;

    /* JADX INFO: renamed from: k4 */
    private long f14069k4;

    /* JADX INFO: renamed from: kk */
    private boolean f14070kk;

    /* JADX INFO: renamed from: to */
    private long[] f14071to;

    /* JADX INFO: renamed from: x1 */
    private long f14072x1;

    public C5112k4() {
        this(false);
    }

    /* JADX INFO: renamed from: k4 */
    private static byte m21953k4(byte b) {
        long j = (((long) (b & 255)) & 4294967295L) * 131586;
        return (byte) ((((j & 17055760) + ((j << 2) & 34111520)) * 16781313) >> 24);
    }

    /* JADX INFO: renamed from: kk */
    private void m21955kk() {
        this.f14071to = new long[256];
        byte b = 0;
        do {
            int i = b & 255;
            long j = i;
            for (byte b2 = 8; (b2 & 255) > 0; b2 = (byte) (b2 - 1)) {
                long j2 = j & 4294967295L;
                j = (j & 1) == 1 ? (j2 >> 1) ^ (4294967295L & this.f14069k4) : j2 >> 1;
            }
            if (this.f14070kk) {
                this.f14071to[m21953k4(b) & 255] = m21954k4(j);
            } else {
                this.f14071to[i] = j;
            }
            b = (byte) (b + 1);
        } while (b != 0);
    }

    /* JADX INFO: renamed from: x1 */
    public int m21958x1() {
        return (int) (~(this.f14068du & 4294967295L));
    }

    public C5112k4(int i, boolean z) {
        this.f14068du = 4294967295L;
        this.f14070kk = z;
        this.f14069k4 = i;
        m21955kk();
    }

    /* JADX INFO: renamed from: k4 */
    public long m21956k4() {
        return this.f14072x1;
    }

    public C5112k4(boolean z) {
        this(-306674912, z);
    }

    /* JADX INFO: renamed from: k4 */
    private static long m21954k4(long j) {
        long j2 = (((j & 1431655765) << 1) & 4294967295L) | (((j & 4294967295L) >> 1) & 1431655765);
        long j3 = (((j2 & 858993459) << 2) & 4294967295L) | (((j2 & 4294967295L) >> 2) & 858993459);
        long j4 = (((j3 & 252645135) << 4) & 4294967295L) | (((j3 & 4294967295L) >> 4) & 252645135);
        long j5 = j4 & 4294967295L;
        return (((j4 & 65280) << 8) & 4294967295L) | ((j4 << 24) & 4294967295L) | ((j5 >> 8) & 65280) | (j5 >> 24);
    }

    /* JADX INFO: renamed from: k4 */
    public void m21957k4(byte[] bArr, int i, int i2) {
        long j;
        long j2;
        if (bArr == null) {
            throw new RuntimeException("The data buffer must not be null.");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = bArr[i + i3];
            boolean z = this.f14070kk;
            long j3 = this.f14068du;
            if (z) {
                long j4 = ((long) (b & 255)) ^ ((j3 & 4294967295L) >> 24);
                j = (j3 << 8) & 4294967295L;
                j2 = this.f14071to[(int) j4];
            } else {
                long j5 = ((long) (b & 255)) ^ (255 & j3);
                j = (j3 & 4294967295L) >> 8;
                j2 = this.f14071to[(int) j5];
            }
            this.f14068du = (j2 & 4294967295L) ^ j;
        }
        this.f14072x1 += (long) i2;
    }
}
