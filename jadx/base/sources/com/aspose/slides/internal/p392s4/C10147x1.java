package com.aspose.slides.internal.p392s4;

import com.aspose.slides.exceptions.ArgumentException;

/* JADX INFO: renamed from: com.aspose.slides.internal.s4.x1 */
/* JADX INFO: loaded from: classes4.dex */
class C10147x1 {

    /* JADX INFO: renamed from: k4 */
    private static final long[] f36515k4 = new long[256];

    /* JADX INFO: renamed from: kk */
    private long f36516kk;

    /* JADX INFO: renamed from: x1 */
    private long f36517x1;

    static {
        for (long j = 0; j < 256; j++) {
            long j2 = j;
            for (long j3 = 8; j3 > 0; j3--) {
                long j4 = j2 & 1;
                j2 >>= 1;
                if (j4 == 1) {
                    j2 ^= 3988292384L;
                }
            }
            f36515k4[(int) j] = j2;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m49918k4(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new ArgumentException("CompressorException: The data buffer must not be null.");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            long j = this.f36517x1;
            this.f36517x1 = f36515k4[(int) ((j & 255) ^ ((long) (bArr[i + i3] & 255)))] ^ (j >> 8);
        }
        this.f36516kk += (long) i2;
    }
}
