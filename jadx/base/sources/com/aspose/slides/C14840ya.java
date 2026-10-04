package com.aspose.slides;

/* JADX INFO: renamed from: com.aspose.slides.ya */
/* JADX INFO: loaded from: classes3.dex */
class C14840ya extends AbstractC14770x9 {

    /* JADX INFO: renamed from: k4 */
    private int f50307k4;

    /* JADX INFO: renamed from: kk */
    private final C14485t4[] f50308kk;

    /* JADX INFO: renamed from: x1 */
    private int f50309x1;

    public C14840ya(C13847mr[] c13847mrArr) {
        C14485t4 c14485t4;
        if (c13847mrArr.length <= 0) {
            this.f50308kk = new C14485t4[0];
            return;
        }
        ChartSeries chartSeriesM64945h4 = c13847mrArr[0].m64945h4();
        int firstSliceAngle = chartSeriesM64945h4.getFirstSliceAngle() & 65535;
        this.f50307k4 = chartSeriesM64945h4.getDoughnutHoleSize() & 255;
        this.f50308kk = new C14485t4[c13847mrArr.length];
        for (int i = 0; i < c13847mrArr.length; i++) {
            C13847mr c13847mr = c13847mrArr[i];
            if (i == c13847mrArr.length - 1) {
                int explosion = c13847mr.m64945h4().getExplosion();
                this.f50309x1 = explosion;
                c14485t4 = new C14485t4(firstSliceAngle, explosion, c13847mrArr[i].m64944dy().toArray(new C0886d8[0]));
            } else {
                c14485t4 = new C14485t4(firstSliceAngle, -1, c13847mr.m64944dy().toArray(new C0886d8[0]));
            }
            this.f50308kk[i] = c14485t4;
            m73215k4(c14485t4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static C1128g1 m73784k4(float f, mxy mxyVar, float f2) {
        float f3 = (f2 + f) * 2.0f;
        mxy mxyVarM67813k4 = mxyVar.m67813k4(f3, f3);
        return new C1128g1(f, mxyVarM67813k4.m72555k4(), mxyVarM67813k4.m72556x1(), mxyVarM67813k4.m67814to(), mxyVarM67813k4.m67811du());
    }

    /* JADX INFO: renamed from: to */
    public final int m73785to() {
        return this.f50307k4;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3482x1() {
        for (AbstractC14770x9 abstractC14770x9 : m73204b3()) {
            abstractC14770x9.mo5524U_();
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        mxy mxyVarM67812h4 = ((mxy) c14713vw).m67812h4();
        float fM72555k4 = mxyVarM67812h4.m72555k4() / 2.0f;
        float f = this.f50307k4 / 100.0f;
        float f2 = 1.0f - f;
        float f3 = 1.0f / ((this.f50309x1 / 100.0f) + 1.0f);
        float f4 = f * f3 * fM72555k4;
        float length = (fM72555k4 * (f2 * f3)) / r2.length;
        for (C14485t4 c14485t4 : this.f50308kk) {
            c14485t4.m73210fa(m73784k4(f4, mxyVarM67812h4, length));
            f4 += length;
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
        for (C14485t4 c14485t4 : this.f50308kk) {
            float fM72555k4 = c14713vw.m72555k4() - c14485t4.m73225wy();
            float fM72556x1 = c14713vw.m72556x1() - c14485t4.m73203ak();
            c14485t4.m73208du(fM72555k4 / 2.0f);
            c14485t4.m73212h4(fM72556x1 / 2.0f);
            c14485t4.m73220ss();
        }
    }
}
