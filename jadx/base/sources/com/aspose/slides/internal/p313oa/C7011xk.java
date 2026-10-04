package com.aspose.slides.internal.p313oa;

/* JADX INFO: renamed from: com.aspose.slides.internal.oa.xk */
/* JADX INFO: loaded from: classes4.dex */
class C7011xk extends AbstractC7008wy {

    /* JADX INFO: renamed from: k4 */
    private AbstractC6981c5 f19068k4 = null;

    /* JADX INFO: renamed from: x1 */
    private float[] f19069x1 = {0.9642f, 1.0f, 0.8249f};

    @Override // com.aspose.slides.internal.p313oa.AbstractC7008wy
    /* JADX INFO: renamed from: k4 */
    public void mo27326k4() {
        super.mo27326k4();
        this.f19068k4 = m27407du() ? m27408k4(1800688195) : m27413x1(1800688195);
        this.f19068k4.m27316k4();
        if (this.f19068k4.mo27320x1()) {
            this.f19068k4 = null;
        }
        C6999rv.m27389kk(this.f19069x1);
        if (m27411to().m27423x1().f19015h4 == 1281450528) {
            C6999rv.m27396x1(this.f19069x1, false);
        }
    }

    @Override // com.aspose.slides.internal.p313oa.AbstractC7008wy
    /* JADX INFO: renamed from: k4 */
    public void mo27327k4(float[] fArr) {
        m27414x1(fArr);
        if (m27407du()) {
            float fMo27315k4 = fArr[0];
            AbstractC6981c5 abstractC6981c5 = this.f19068k4;
            if (abstractC6981c5 != null) {
                fMo27315k4 = abstractC6981c5.mo27315k4(fMo27315k4);
            }
            float[] fArr2 = this.f19069x1;
            fArr[0] = fArr2[0] * fMo27315k4;
            fArr[1] = fArr2[1] * fMo27315k4;
            fArr[2] = fMo27315k4 * fArr2[2];
        } else {
            if (m27411to().m27423x1().f19015h4 == 1281450528) {
                fArr[0] = fArr[0] / this.f19069x1[0];
            } else {
                fArr[0] = fArr[1] / this.f19069x1[1];
            }
            AbstractC6981c5 abstractC6981c52 = this.f19068k4;
            if (abstractC6981c52 != null) {
                fArr[0] = abstractC6981c52.mo27315k4(fArr[0]);
            }
        }
        m27410kk(fArr);
    }
}
