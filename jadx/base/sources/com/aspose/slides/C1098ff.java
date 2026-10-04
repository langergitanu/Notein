package com.aspose.slides;

import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.ff */
/* JADX INFO: loaded from: classes3.dex */
class C1098ff extends AbstractC14770x9 {

    /* JADX INFO: renamed from: k4 */
    private AbstractC14763x3 f5038k4;

    /* JADX INFO: renamed from: kk */
    private float f5039kk;

    /* JADX INFO: renamed from: x1 */
    private boolean f5040x1;

    public C1098ff(AbstractC14763x3 abstractC14763x3, boolean z, float f) {
        this.f5038k4 = abstractC14763x3;
        this.f5040x1 = z;
        this.f5039kk = f;
    }

    /* JADX INFO: renamed from: c5 */
    private boolean m6147c5() {
        return ChartTypeCharacterizer.isChartTypeRadar(this.f5038k4.f49908x1.get_Item(0).m64945h4().getType());
    }

    /* JADX INFO: renamed from: dy */
    private void m6148dy() {
        if (this.f5038k4.m73020du()) {
            if (this.f5040x1) {
                this.f5038k4.m73026k4().m73426x1(m73227xk(), m73206c6(), m73227xk() + m73225wy(), m73206c6());
                return;
            } else {
                this.f5038k4.m73026k4().m73401kk(m73227xk(), m73206c6(), m73227xk() + m73225wy(), m73206c6());
                return;
            }
        }
        if (this.f5040x1) {
            this.f5038k4.m73026k4().m73426x1(m73227xk(), m73206c6(), m73227xk(), m73206c6() + m73203ak());
        } else {
            this.f5038k4.m73026k4().m73401kk(m73227xk(), m73206c6(), m73227xk(), m73206c6() + m73203ak());
        }
    }

    /* JADX INFO: renamed from: m9 */
    private void m6149m9() {
        float f;
        double d;
        double size = 6.283185307179586d / ((double) this.f5038k4.m73021fa().f49904k4.size());
        double dM73225wy = m73225wy() / 2.0f;
        double dM73203ak = m73203ak() / 2.0f;
        double dM73225wy2 = m73225wy() / 2.0f;
        C12025x6 c12025x6Clone = C12025x6.f40591k4.Clone();
        double d2 = 1.5707963267948966d;
        int i = 0;
        while (i < this.f5038k4.m73021fa().f49904k4.size()) {
            double d3 = dM73225wy2;
            float fM67470dy = (float) ((C14116yg.m67470dy(d2) * dM73225wy2) + dM73225wy);
            float fM67495m9 = (float) (dM73203ak - (C14116yg.m67495m9(d2) * dM73225wy2));
            C12025x6 c12025x6 = new C12025x6(fM67470dy, fM67495m9);
            if (i == 0) {
                double d4 = d2 + size;
                f = fM67495m9;
                d = size;
                c12025x6Clone = new C12025x6((float) ((C14116yg.m67470dy(d4) * d3) + dM73225wy), (float) (dM73203ak - (C14116yg.m67495m9(d4) * d3)));
            } else {
                f = fM67495m9;
                d = size;
            }
            if (C14116yg.m67480k4(c12025x6.m56897x1() - c12025x6Clone.m56897x1()) > 1.0f || C14116yg.m67480k4(c12025x6.m56895kk() - c12025x6Clone.m56895kk()) > 1.0f) {
                if (this.f5040x1) {
                    this.f5038k4.m73026k4().m73426x1(m73227xk() + fM67470dy, m73206c6() + f, c12025x6Clone.m56897x1() + m73227xk(), c12025x6Clone.m56895kk() + m73206c6());
                } else {
                    this.f5038k4.m73026k4().m73401kk(m73227xk() + fM67470dy, m73206c6() + f, c12025x6Clone.m56897x1() + m73227xk(), c12025x6Clone.m56895kk() + m73206c6());
                }
                c12025x6.CloneTo(c12025x6Clone);
            }
            d2 -= d;
            i++;
            dM73225wy2 = d3;
            size = d;
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: O_ */
    public int mo3480O_() {
        return 2;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        if (m6147c5()) {
            m73217kk(m6150to() * 2.0f);
            m73222to(m6150to() * 2.0f);
        } else if (this.f5038k4.m73020du()) {
            m73217kk(c14713vw.m72555k4());
            m73222to(1.0f);
        } else {
            m73217kk(1.0f);
            m73222to(c14713vw.m72556x1());
        }
    }

    /* JADX INFO: renamed from: to */
    public final float m6150to() {
        return this.f5039kk;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3482x1() {
        if (m6147c5()) {
            m6149m9();
        } else {
            m6148dy();
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: to */
    public void mo3230to(C14713vw c14713vw) {
    }
}
