package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
class lyj extends AbstractC14770x9 {

    /* JADX INFO: renamed from: du */
    private int f46112du;

    /* JADX INFO: renamed from: h4 */
    private boolean f46113h4;

    /* JADX INFO: renamed from: k4 */
    private final C13847mr f46114k4;

    /* JADX INFO: renamed from: kk */
    private float f46115kk;

    /* JADX INFO: renamed from: to */
    private int f46116to;

    /* JADX INFO: renamed from: x1 */
    private IMarker f46117x1;

    public lyj(IMarker iMarker, C13847mr c13847mr) {
        this.f46113h4 = false;
        this.f46117x1 = iMarker;
        this.f46114k4 = c13847mr;
        this.f46116to = (iMarker.getSize() != 0 ? this.f46117x1 : c13847mr.m64946jd().m70443k4()).getSize();
        this.f46112du = (this.f46117x1.getSymbol() != -1 ? this.f46117x1 : c13847mr.m64946jd().m70443k4()).getSymbol();
        if (C7019kk.m27469x1(m73228yd(), otz.class) || c13847mr == null || c13847mr.m64945h4().getFormat().getLine().getFillFormat().getFillType() != 0) {
            return;
        }
        this.f46113h4 = true;
    }

    /* JADX INFO: renamed from: c5 */
    private void m64615c5(FillFormat fillFormat, LineFormat lineFormat) {
        m64619jd(fillFormat, lineFormat);
        C11896dy c11896dy = new C11896dy();
        c11896dy.m55547k4(new C12025x6(m73227xk(), m73206c6()), new C12025x6(m73227xk() + this.f46116to, m73206c6() + this.f46116to));
        c11896dy.m55585yj();
        c11896dy.m55547k4(new C12025x6(m73227xk() + m73225wy(), m73206c6()), new C12025x6(m73227xk(), m73206c6() + this.f46116to));
        c11896dy.m55585yj();
        c11896dy.m55547k4(new C12025x6(m73223ts().m56897x1(), m73206c6()), new C12025x6(m73223ts().m56897x1(), m73206c6() + this.f46116to));
        m64622k4(fillFormat, lineFormat, c11896dy);
    }

    /* JADX INFO: renamed from: du */
    private void m64616du(FillFormat fillFormat, LineFormat lineFormat) {
        m64619jd(fillFormat, lineFormat);
        C11896dy c11896dy = new C11896dy();
        c11896dy.m55547k4(new C12025x6(m73227xk(), m73206c6()), new C12025x6(m73227xk() + this.f46116to, m73206c6() + this.f46116to));
        c11896dy.m55585yj();
        c11896dy.m55547k4(new C12025x6(m73227xk() + this.f46116to, m73206c6()), new C12025x6(m73227xk(), m73206c6() + this.f46116to));
        m64622k4(fillFormat, lineFormat, c11896dy);
    }

    /* JADX INFO: renamed from: h4 */
    private void m64618h4(FillFormat fillFormat, LineFormat lineFormat) {
        m64619jd(fillFormat, lineFormat);
        C11896dy c11896dy = new C11896dy();
        c11896dy.m55547k4(new C12025x6(m73223ts().m56897x1(), m73206c6()), new C12025x6(m73223ts().m56897x1(), m73206c6() + this.f46116to));
        c11896dy.m55585yj();
        c11896dy.m55547k4(new C12025x6(m73227xk(), m73223ts().m56895kk()), new C12025x6(m73227xk() + this.f46116to, m73223ts().m56895kk()));
        m64622k4(fillFormat, lineFormat, c11896dy);
    }

    /* JADX INFO: renamed from: jd */
    private void m64619jd(FillFormat fillFormat, LineFormat lineFormat) {
        lineFormat.setCapStyle((byte) 2);
        lineFormat.setJoinStyle((byte) 0);
        LineFormat lineFormat2 = new LineFormat(lineFormat);
        C12003du c12003duClone = C12003du.f40505to.Clone();
        lineFormat2.setWidth(lineFormat.getEffective().getWidth());
        double width = lineFormat2.getWidth();
        float f = this.f46115kk;
        if (width > f) {
            lineFormat2.setWidth(f);
        }
        if (fillFormat.getFillType() == 3) {
            ((ColorFormat) fillFormat.getPatternFormat().getForeColor()).m1084to().CloneTo(c12003duClone);
        }
        im9.m7700k4(c12003duClone.Clone(), C12003du.f40505to.Clone(), m73218lr().m7149to(), new C12007ix(m73227xk(), m73206c6(), m73225wy(), m73203ak()), lineFormat2, fillFormat, (IEffectFormat) null);
    }

    /* JADX INFO: renamed from: k4 */
    public static int m64620k4(long j) {
        switch ((int) (((((j & 4294967295L) % 9) & 4294967295L) + 2) & 4294967295L)) {
        }
        return 10;
    }

    /* JADX INFO: renamed from: kk */
    private void m64624kk(FillFormat fillFormat, LineFormat lineFormat) {
        C11896dy c11896dy = new C11896dy();
        m64623k4(c11896dy, new C12025x6[]{new C12025x6(m73227xk() + this.f46116to, m73206c6()), new C12025x6(m73227xk() + this.f46116to, m73206c6() + this.f46116to), new C12025x6(m73227xk(), m73206c6() + this.f46116to), new C12025x6(m73227xk(), m73206c6())});
        m64622k4(fillFormat, lineFormat, c11896dy);
    }

    /* JADX INFO: renamed from: to */
    private void m64626to(FillFormat fillFormat, LineFormat lineFormat) {
        C11896dy c11896dy = new C11896dy();
        c11896dy.m55542k4(m73209e0().Clone());
        m64622k4(fillFormat, lineFormat, c11896dy);
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: O_ */
    public int mo3480O_() {
        if (this.f46113h4) {
            return 5;
        }
        return m73228yd().mo3480O_();
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: T_ */
    public boolean mo3221T_() {
        return this.f46117x1.getSymbol() != 4 && super.mo3221T_();
    }

    /* JADX INFO: renamed from: dy */
    public final int m64628dy() {
        int i = this.f46112du;
        return i != -1 ? i : m64620k4(this.f46114k4.m64945h4().m726k4().m64750k4());
    }

    /* JADX INFO: renamed from: m9 */
    public final int m64629m9() {
        return this.f46116to;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3482x1() {
        C12007ix c12007ix = new C12007ix(m73218lr().m73227xk(), m73218lr().m73206c6(), m73218lr().m73225wy(), m73218lr().m73203ak());
        C14851yl c14851yl = new C14851yl(this.f46114k4.m64941c5());
        c14851yl.m73924k4(c12007ix.Clone());
        try {
            LineFormat lineFormat = (LineFormat) this.f46117x1.getFormat().getLine();
            FillFormat fillFormat = (FillFormat) this.f46117x1.getFormat().getFill();
            if (lineFormat.getFillFormat().getFillType() == -1) {
                lineFormat = (LineFormat) this.f46114k4.m64945h4().getMarker().getFormat().getLine();
            }
            if (fillFormat.getFillType() == -1) {
                fillFormat = (FillFormat) this.f46114k4.m64945h4().getMarker().getFormat().getFill();
            }
            switch (m64628dy()) {
                case 0:
                    m64626to(fillFormat, lineFormat);
                    break;
                case 1:
                    m64625m9(fillFormat, lineFormat);
                    break;
                case 2:
                    m64621k4(fillFormat, lineFormat);
                    break;
                case 3:
                    m64617dy(fillFormat, lineFormat);
                    break;
                case 5:
                case 7:
                    m64624kk(fillFormat, lineFormat);
                    break;
                case 6:
                    m64618h4(fillFormat, lineFormat);
                    break;
                case 8:
                    m64615c5(fillFormat, lineFormat);
                    break;
                case 9:
                    m64627x1(fillFormat, lineFormat);
                    break;
                case 10:
                    m64616du(fillFormat, lineFormat);
                    break;
            }
        } finally {
            c14851yl.m73923k4();
        }
    }

    /* JADX INFO: renamed from: dy */
    private void m64617dy(FillFormat fillFormat, LineFormat lineFormat) {
        C11896dy c11896dy = new C11896dy();
        C12007ix c12007ixClone = C12007ix.m56542k4(m73209e0().Clone(), 0.0f, (-m73209e0().m56550c5()) / 2.5f).Clone();
        c12007ixClone.m56566kk(m73223ts().m56897x1());
        c12007ixClone.m56576x1(m73225wy() / 2.0f);
        c11896dy.m55578x1(c12007ixClone.Clone());
        m64622k4(fillFormat, lineFormat, c11896dy);
    }

    /* JADX INFO: renamed from: k4 */
    private void m64621k4(FillFormat fillFormat, LineFormat lineFormat) {
        C11896dy c11896dy = new C11896dy();
        m64623k4(c11896dy, new C12025x6[]{new C12025x6(m73227xk(), m73223ts().m56895kk()), new C12025x6(m73223ts().m56897x1(), m73206c6()), new C12025x6(m73227xk() + this.f46116to, m73223ts().m56895kk()), new C12025x6(m73223ts().m56897x1(), m73206c6() + this.f46116to)});
        m64622k4(fillFormat, lineFormat, c11896dy);
    }

    /* JADX INFO: renamed from: m9 */
    private void m64625m9(FillFormat fillFormat, LineFormat lineFormat) {
        C11896dy c11896dy = new C11896dy();
        c11896dy.m55578x1(C12007ix.m56542k4(m73209e0().Clone(), 0.0f, (-m73209e0().m56550c5()) / 2.5f).Clone().Clone());
        m64622k4(fillFormat, lineFormat, c11896dy);
    }

    /* JADX INFO: renamed from: x1 */
    private void m64627x1(FillFormat fillFormat, LineFormat lineFormat) {
        C11896dy c11896dy = new C11896dy();
        m64623k4(c11896dy, new C12025x6[]{new C12025x6(m73223ts().m56897x1(), m73206c6()), new C12025x6(m73227xk() + this.f46116to, m73206c6() + this.f46116to), new C12025x6(m73227xk(), m73206c6() + this.f46116to)});
        m64622k4(fillFormat, lineFormat, c11896dy);
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: to */
    public void mo3230to(C14713vw c14713vw) {
        int iM27462to = C7019kk.m27462to(Float.valueOf(C14116yg.m67504x1(c14713vw.m72556x1(), c14713vw.m72555k4())), 13);
        if (m64630to()) {
            double width = this.f46114k4.m64945h4().getFormat().getLine().getWidth();
            if (C14044b3.m66437kk(width)) {
                width = im9.m7680k4(this.f46114k4.m64945h4().getChart());
            }
            this.f46116to = C7019kk.m27462to(Double.valueOf(width * 2.0d), 14) + 3;
        }
        int iM67507x1 = C14116yg.m67507x1(this.f46116to, iM27462to);
        this.f46116to = iM67507x1;
        m73217kk(iM67507x1);
        m73222to(this.f46116to);
        this.f46115kk = C7019kk.m27469x1(m73228yd(), otz.class) ? m73203ak() - (m73203ak() / 4.0f) : 1584.0f;
    }

    /* JADX INFO: renamed from: k4 */
    private void m64622k4(FillFormat fillFormat, LineFormat lineFormat, C11896dy c11896dy) {
        azo azoVarM7718x1 = im9.m7718x1(this.f46114k4.m64960m9().Clone(), lineFormat, this.f46114k4.m64941c5(), (float) lineFormat.getEffective().getWidth());
        azoVarM7718x1.f4054h4 = im9.m7685k4(this.f46114k4.m64960m9().Clone(), (LineFillFormat) lineFormat.getFillFormat(), this.f46114k4.m64941c5(), 1.0f, c11896dy);
        double dM3906k4 = azoVarM7718x1.m3906k4();
        float f = this.f46115kk;
        if (dM3906k4 > f) {
            azoVarM7718x1.m3909k4(f);
        }
        this.f46114k4.m64941c5().m69870wy().mo64338k4(c11896dy, azoVarM7718x1, im9.m7684k4(this.f46114k4.m64945h4().m734m9().Clone(), fillFormat, this.f46114k4.m64941c5(), 1.0f, c11896dy));
    }

    /* JADX INFO: renamed from: to */
    public final boolean m64630to() {
        return this.f46116to == 0;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo63967x1(boolean z) {
        super.mo63967x1(z);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m64623k4(C11896dy c11896dy, C12025x6[] c12025x6Arr) {
        C12025x6 c12025x6Clone = c12025x6Arr[0].Clone();
        int i = 1;
        while (i < c12025x6Arr.length + 1) {
            C12025x6 c12025x6Clone2 = (i == c12025x6Arr.length ? c12025x6Arr[0] : c12025x6Arr[i]).Clone();
            c11896dy.m55547k4(c12025x6Clone.Clone(), c12025x6Clone2.Clone());
            c12025x6Clone2.CloneTo(c12025x6Clone);
            i++;
        }
    }
}
