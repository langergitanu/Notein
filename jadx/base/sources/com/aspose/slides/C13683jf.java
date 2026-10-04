package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

/* JADX INFO: renamed from: com.aspose.slides.jf */
/* JADX INFO: loaded from: classes3.dex */
class C13683jf extends AbstractC14770x9 {

    /* JADX INFO: renamed from: k4 */
    protected AbstractC14763x3 f45479k4;

    public C13683jf(AbstractC14763x3 abstractC14763x3) {
        this.f45479k4 = abstractC14763x3;
        if (abstractC14763x3.m73026k4().m73384dy().isVisible()) {
            return;
        }
        mo63967x1(false);
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: O_ */
    public int mo3480O_() {
        return 3;
    }

    /* JADX INFO: renamed from: k4 */
    public final float m63298k4(wn6 wn6Var) {
        int majorTickMark = wn6Var.m72839to() ? this.f45479k4.m73026k4().m73384dy().getMajorTickMark() : this.f45479k4.m73026k4().m73384dy().getMinorTickMark();
        boolean[] zArr = {false};
        boolean[] zArr2 = {false};
        m63297k4(majorTickMark, zArr, zArr2);
        boolean z = zArr[0];
        boolean z2 = zArr2[0];
        float fM73225wy = this.f45479k4.m73020du() ? wn6Var.m73225wy() : wn6Var.m73203ak();
        if (majorTickMark == 0) {
            return (-fM73225wy) / 2.0f;
        }
        if (z2) {
            if (this.f45479k4.m73020du()) {
                return -fM73225wy;
            }
            return 0.0f;
        }
        if (!z || this.f45479k4.m73020du()) {
            return 0.0f;
        }
        return -fM73225wy;
    }

    /* JADX INFO: renamed from: kk */
    public final AbstractC14763x3 m63299kk() {
        return this.f45479k4;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: to */
    public void mo3230to(C14713vw c14713vw) {
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3482x1() {
        C14787xi c14787xiM73026k4;
        float fM73227xk;
        float fM73206c6;
        float fM73227xk2;
        float fM73206c62;
        if (this.f45479k4.m73020du()) {
            c14787xiM73026k4 = this.f45479k4.m73026k4();
            fM73227xk = m73227xk();
            fM73206c6 = m73206c6();
            fM73227xk2 = m73227xk();
            fM73206c62 = m73206c6() + m73203ak();
        } else {
            c14787xiM73026k4 = this.f45479k4.m73026k4();
            fM73227xk = m73227xk();
            fM73206c6 = m73206c6();
            fM73227xk2 = m73227xk() + m73225wy();
            fM73206c62 = m73206c6();
        }
        c14787xiM73026k4.m73393k4(fM73227xk, fM73206c6, fM73227xk2, fM73206c62);
    }

    /* JADX INFO: renamed from: k4 */
    private void m63297k4(int i, boolean[] zArr, boolean[] zArr2) {
        boolean z = m63299kk().m73021fa() != null && m63299kk().m73021fa().m73026k4().m73384dy().isPlotOrderReversed();
        if (i == 1) {
            zArr[0] = true;
            if (z) {
                zArr[0] = false;
                zArr2[0] = true;
            }
            if (m63299kk().m73021fa() == null || m63299kk().m73021fa().m73026k4().m73384dy().getCrossType() != 1) {
                if (m63299kk().m73021fa() != null && m63299kk().m73021fa().m73022ix() == 0 && m63299kk().m73022ix() == 2) {
                    zArr2[0] = true;
                    zArr[0] = false;
                    return;
                }
                return;
            }
            if (z) {
                zArr[0] = true;
                zArr2[0] = false;
                return;
            } else {
                zArr[0] = false;
                zArr2[0] = true;
                return;
            }
        }
        if (i != 3) {
            return;
        }
        zArr2[0] = true;
        if (z) {
            zArr2[0] = false;
            zArr[0] = true;
        }
        if (m63299kk().m73021fa() == null || m63299kk().m73021fa().m73026k4().m73384dy().getCrossType() != 1) {
            if (m63299kk().m73021fa() != null && m63299kk().m73021fa().m73022ix() == 0 && m63299kk().m73022ix() == 2) {
                zArr2[0] = false;
                zArr[0] = true;
                return;
            }
            return;
        }
        if (z) {
            zArr[0] = false;
            zArr2[0] = true;
        } else {
            zArr[0] = true;
            zArr2[0] = false;
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
        float fM63298k4;
        float fM63298k42;
        if (m63299kk().m73026k4().m73384dy().getMajorTickMark() != 2) {
            List<Float> listMo63717u4 = this.f45479k4.mo63717u4();
            for (int i = 0; i < listMo63717u4.size(); i++) {
                wn6 wn6Var = new wn6(m63299kk(), true);
                wn6Var.m73210fa(c14713vw);
                if (this.f45479k4.m73020du()) {
                    wn6Var.m73208du(m63298k4(wn6Var));
                    fM63298k42 = listMo63717u4.get_Item(i).floatValue();
                } else {
                    wn6Var.m73208du(listMo63717u4.get_Item(i).floatValue());
                    fM63298k42 = m63298k4(wn6Var);
                }
                wn6Var.m73212h4(fM63298k42);
                m73215k4((AbstractC14770x9) wn6Var);
            }
        }
        if (m63299kk().m73026k4().m73384dy().getMinorTickMark() != 2) {
            List<Float> listMo63719uz = this.f45479k4.mo63719uz();
            for (int i2 = 0; i2 < listMo63719uz.size(); i2++) {
                wn6 wn6Var2 = new wn6(m63299kk(), false);
                wn6Var2.m73210fa(c14713vw);
                if (this.f45479k4.m73020du()) {
                    wn6Var2.m73208du(m63298k4(wn6Var2));
                    fM63298k4 = listMo63719uz.get_Item(i2).floatValue();
                } else {
                    wn6Var2.m73208du(listMo63719uz.get_Item(i2).floatValue());
                    fM63298k4 = m63298k4(wn6Var2);
                }
                wn6Var2.m73212h4(fM63298k4);
                m73215k4((AbstractC14770x9) wn6Var2);
            }
        }
        for (AbstractC14770x9 abstractC14770x9 : m73204b3()) {
            abstractC14770x9.m73220ss();
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        m73224wp();
        m73217kk(this.f45479k4.m73020du() ? 1.0f : c14713vw.m72555k4());
        m73222to(this.f45479k4.m73020du() ? c14713vw.m72556x1() : 1.0f);
    }
}
