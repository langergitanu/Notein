package com.aspose.slides.internal.p313oa;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.oa.lr */
/* JADX INFO: loaded from: classes4.dex */
class C6995lr extends AbstractC6981c5 {

    /* JADX INFO: renamed from: kk */
    private int f19040kk;

    /* JADX INFO: renamed from: x1 */
    private int f19041x1;

    @Override // com.aspose.slides.internal.p313oa.AbstractC7002u4
    /* JADX INFO: renamed from: fa */
    public void mo27299fa() {
        if (this.f19049m9 != 1885434465) {
            throw new C7004up();
        }
    }

    @Override // com.aspose.slides.internal.p313oa.AbstractC6981c5
    /* JADX INFO: renamed from: k4 */
    public float mo27315k4(float f) {
        if (f < 0.0d) {
            f = 0.0f;
        }
        if (f > 1.0d) {
            f = 1.0f;
        }
        int i = this.f19040kk;
        if (i == 0) {
            return (float) C14116yg.m67469du(f, this.f18986k4[0]);
        }
        if (i == 1) {
            float[] fArr = this.f18986k4;
            float f2 = fArr[2];
            if (f >= (-f2) / fArr[1]) {
                return (float) C14116yg.m67469du((r4 * f) + f2, fArr[0]);
            }
            return 0.0f;
        }
        if (i == 2) {
            float[] fArr2 = this.f18986k4;
            float f3 = fArr2[2];
            float f4 = fArr2[1];
            return f >= (-f3) / f4 ? ((float) C14116yg.m67469du((((double) f4) * ((double) f)) + ((double) f3), fArr2[0])) + this.f18986k4[3] : fArr2[3];
        }
        if (i == 3) {
            float[] fArr3 = this.f18986k4;
            return f >= fArr3[4] ? (float) C14116yg.m67469du((((double) fArr3[1]) * ((double) f)) + ((double) fArr3[2]), fArr3[0]) : fArr3[3] * f;
        }
        if (i != 4) {
            return f;
        }
        float[] fArr4 = this.f18986k4;
        return f >= fArr4[4] ? ((float) C14116yg.m67469du((((double) fArr4[1]) * ((double) f)) + ((double) fArr4[2]), fArr4[0])) + this.f18986k4[5] : (fArr4[3] * f) + fArr4[6];
    }

    @Override // com.aspose.slides.internal.p313oa.AbstractC6981c5
    /* JADX INFO: renamed from: x1 */
    public boolean mo27320x1() {
        int i = this.f19040kk;
        return i != 0 ? (i == 1 || i == 2 || i == 3 || i == 4) ? false : true : C6979b3.m27305k4(this.f18986k4[0]);
    }

    @Override // com.aspose.slides.internal.p313oa.AbstractC7002u4
    /* JADX INFO: renamed from: k4 */
    public void mo27374k4(C6990ix c6990ix) {
        this.f19049m9 = C7019kk.m27462to(Long.valueOf(c6990ix.m27352kk()), 10);
        mo27299fa();
        this.f19048dy = c6990ix.m27352kk();
        this.f19040kk = c6990ix.m27356x1();
        this.f19041x1 = c6990ix.m27356x1();
        int i = this.f19040kk;
        int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? 0 : 7 : 5 : 4 : 3 : 1;
        if (C7019kk.m27457kk(Integer.valueOf(i2), 8) != 0) {
            this.f18986k4 = c6990ix.m27355to(C7019kk.m27462to(Integer.valueOf(i2), 8));
        }
    }
}
