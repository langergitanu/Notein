package com.aspose.slides.internal.p313oa;

import OooOO0.OooO0OO;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.oa.wl */
/* JADX INFO: loaded from: classes4.dex */
class C7007wl extends AbstractC6981c5 {
    @Override // com.aspose.slides.internal.p313oa.AbstractC7002u4
    /* JADX INFO: renamed from: fa */
    public void mo27299fa() {
        if (this.f19049m9 != 1668641398) {
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
        float[] fArr = this.f18986k4;
        if (fArr.length == 0) {
            return f;
        }
        if (fArr.length == 1) {
            return (float) C14116yg.m67469du(f, (float) ((((double) fArr[0]) * 65535.0d) / 256.0d));
        }
        int length = fArr.length - 1;
        float f2 = f * length;
        int iM27462to = C7019kk.m27462to(Float.valueOf(f2), 13);
        if (iM27462to == length) {
            return this.f18986k4[iM27462to];
        }
        float[] fArr2 = this.f18986k4;
        float f3 = fArr2[iM27462to];
        float fOooO0O0 = OooO0OO.OooO0O0(fArr2[iM27462to + 1], f3, f2 - iM27462to, f3);
        if (fOooO0O0 > 1.0f) {
            return 1.0f;
        }
        return fOooO0O0;
    }

    @Override // com.aspose.slides.internal.p313oa.AbstractC6981c5
    /* JADX INFO: renamed from: x1 */
    public boolean mo27320x1() {
        if (m27318kk().length == 0) {
            return true;
        }
        if (m27318kk().length == 1) {
            return C6979b3.m27305k4((this.f18986k4[0] * 65535.0f) / 256.0f);
        }
        int length = this.f18986k4.length - 1;
        int i = 0;
        while (true) {
            float[] fArr = this.f18986k4;
            if (i >= fArr.length) {
                return true;
            }
            if (C14116yg.m67480k4(fArr[i] - (i / length)) > 1.0E-7f) {
                return false;
            }
            i++;
        }
    }

    @Override // com.aspose.slides.internal.p313oa.AbstractC7002u4
    /* JADX INFO: renamed from: k4 */
    public void mo27374k4(C6990ix c6990ix) {
        this.f19049m9 = C7019kk.m27462to(Long.valueOf(c6990ix.m27352kk()), 10);
        mo27299fa();
        this.f19048dy = c6990ix.m27352kk();
        this.f18986k4 = c6990ix.m27353kk(C7019kk.m27462to(Long.valueOf(c6990ix.m27352kk()), 10));
    }
}
