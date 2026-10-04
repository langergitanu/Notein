package com.aspose.slides.internal.p135fp;

import com.aspose.slides.exceptions.Exception;

/* JADX INFO: renamed from: com.aspose.slides.internal.fp.u4 */
/* JADX INFO: loaded from: classes.dex */
public class C4104u4 {

    /* JADX INFO: renamed from: k4 */
    private final C4101qq f11234k4;

    /* JADX INFO: renamed from: kk */
    private int f11235kk = 0;

    /* JADX INFO: renamed from: x1 */
    private int f11236x1 = 0;

    public C4104u4(C4101qq c4101qq) {
        this.f11234k4 = c4101qq;
    }

    /* JADX INFO: renamed from: k4 */
    public C4101qq m16395k4() {
        return this.f11234k4;
    }

    /* JADX INFO: renamed from: x1 */
    public void m16398x1() {
        m16397k4(127, 7);
        this.f11236x1 = 0;
        this.f11235kk = 0;
    }

    /* JADX INFO: renamed from: k4 */
    public void m16396k4(byte b) {
        this.f11234k4.m62855k4(b);
    }

    /* JADX INFO: renamed from: k4 */
    public void m16397k4(int i, int i2) {
        if (i2 == 0) {
            throw new Exception("Attempt to write 0 bits");
        }
        int i3 = this.f11235kk + i2;
        int i4 = ((i & ((1 << i2) - 1)) << (24 - i3)) | this.f11236x1;
        while (i3 >= 8) {
            int i5 = (i4 >> 16) & 255;
            m16396k4((byte) i5);
            if (i5 == 255) {
                m16396k4((byte) 0);
            }
            i4 <<= 8;
            i3 -= 8;
        }
        this.f11236x1 = i4;
        this.f11235kk = i3;
    }
}
