package com.aspose.slides.internal.p313oa;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.oa.um */
/* JADX INFO: loaded from: classes4.dex */
class C7003um extends AbstractC6994ks {

    /* JADX INFO: renamed from: c5 */
    private byte f19050c5;

    /* JADX INFO: renamed from: jd */
    private float[] f19051jd;

    @Override // com.aspose.slides.internal.p313oa.AbstractC7002u4
    /* JADX INFO: renamed from: fa */
    public void mo27299fa() {
        if (this.f19049m9 != 1835430961) {
            throw new C7004up();
        }
    }

    @Override // com.aspose.slides.internal.p313oa.AbstractC6994ks
    /* JADX INFO: renamed from: k4 */
    public void mo27368k4(int i, int i2) {
        if (i != 1482250784) {
            float[] fArr = this.f19051jd;
            fArr[8] = 1.5258789E-5f;
            fArr[4] = 1.5258789E-5f;
            fArr[0] = 1.5258789E-5f;
            fArr[7] = 0.0f;
            fArr[6] = 0.0f;
            fArr[5] = 0.0f;
            fArr[3] = 0.0f;
            fArr[2] = 0.0f;
            fArr[1] = 0.0f;
        } else if (this.f19032du == null && m27365jd() == null) {
            this.f19032du = this.f19034h4;
            this.f19034h4 = null;
            m27367k4(this.f19051jd);
        }
        super.mo27368k4(i, i2);
    }

    /* JADX INFO: renamed from: up */
    public byte mo27301up() {
        return (byte) 1;
    }

    /* JADX INFO: renamed from: x1 */
    public int mo27302x1(C6990ix c6990ix) {
        return 256;
    }

    @Override // com.aspose.slides.internal.p313oa.AbstractC7002u4
    /* JADX INFO: renamed from: k4 */
    public void mo27374k4(C6990ix c6990ix) {
        this.f19049m9 = C7019kk.m27462to(Long.valueOf(c6990ix.m27352kk()), 10);
        mo27299fa();
        this.f19048dy = c6990ix.m27352kk();
        this.f19039x1 = c6990ix.m27349k4();
        this.f19037kk = c6990ix.m27349k4();
        byte bM27349k4 = c6990ix.m27349k4();
        this.f19050c5 = c6990ix.m27349k4();
        this.f19051jd = c6990ix.m27355to(9);
        int iMo27302x1 = mo27302x1(c6990ix);
        int iMo27302x12 = mo27302x1(c6990ix);
        m27401k4(m27370kk(), c6990ix, iMo27302x1);
        m27366k4(bM27349k4, mo27301up()).m27334x1(c6990ix);
        m27401k4(m27369k4(), c6990ix, iMo27302x12);
    }

    /* JADX INFO: renamed from: k4 */
    private void m27401k4(AbstractC6981c5[] abstractC6981c5Arr, C6990ix c6990ix, int i) {
        for (byte b = 0; C7019kk.m27462to(Byte.valueOf(b), 6) < abstractC6981c5Arr.length; b = (byte) (b + 1)) {
            abstractC6981c5Arr[C7019kk.m27462to(Byte.valueOf(b), 6)] = (AbstractC6981c5) AbstractC7002u4.m27400k4(1668641398);
            abstractC6981c5Arr[C7019kk.m27462to(Byte.valueOf(b), 6)].m27317k4(mo27300k4(c6990ix, i));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public float[] mo27300k4(C6990ix c6990ix, int i) {
        return c6990ix.m27357x1(C7019kk.m27462to(Integer.valueOf(i), 8));
    }
}
