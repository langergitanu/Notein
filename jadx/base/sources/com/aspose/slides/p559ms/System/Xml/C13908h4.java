package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.h4 */
/* JADX INFO: loaded from: classes5.dex */
public class C13908h4 {

    /* JADX INFO: renamed from: k4 */
    private long[] f46568k4;

    /* JADX INFO: renamed from: kk */
    private long f46569kk = 1;

    /* JADX INFO: renamed from: x1 */
    private int f46570x1;

    /* JADX INFO: renamed from: kk */
    private void m65448kk() {
        if (this.f46568k4 == null) {
            this.f46568k4 = new long[16];
        }
        long[] jArr = this.f46568k4;
        int i = this.f46570x1;
        int i2 = i + 1;
        this.f46570x1 = i2;
        jArr[i] = this.f46569kk;
        this.f46569kk = 1L;
        int length = jArr.length;
        if (i2 >= length) {
            long[] jArr2 = new long[length * 2];
            AbstractC14092to.m67220k4(AbstractC14092to.m67208k4(jArr), AbstractC14092to.m67208k4(jArr2), length);
            this.f46568k4 = jArr2;
        }
    }

    /* JADX INFO: renamed from: to */
    private void m65449to() {
        int i = this.f46570x1;
        if (i > 0) {
            long[] jArr = this.f46568k4;
            int i2 = i - 1;
            this.f46570x1 = i2;
            this.f46569kk = jArr[i2];
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m65450k4(boolean z) {
        if ((this.f46569kk & 2147483648L) != 0) {
            m65448kk();
        }
        this.f46569kk = (((this.f46569kk & 4294967295L) << 1) | (z ? 1L : 0L)) & 4294967295L;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m65452x1() {
        return (this.f46569kk & 1) != 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m65451k4() {
        long j = this.f46569kk;
        boolean z = (j & 1) != 0;
        long j2 = (j & 4294967295L) >> 1;
        this.f46569kk = j2 & 4294967295L;
        if ((j2 & 4294967295L) == 1) {
            m65449to();
        }
        return z;
    }
}
