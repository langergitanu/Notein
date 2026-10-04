package com.aspose.slides;

import OooOoO.C20503OooO00o;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14064he;

/* JADX INFO: renamed from: com.aspose.slides.f2 */
/* JADX INFO: loaded from: classes3.dex */
class C0974f2 extends AbstractC1202hh {

    /* JADX INFO: renamed from: du */
    private C14237oh f4953du;

    /* JADX INFO: renamed from: h4 */
    private C0838c1 f4954h4;

    /* JADX INFO: renamed from: k4 */
    int f4955k4;

    /* JADX INFO: renamed from: kk */
    private ygk f4956kk;

    /* JADX INFO: renamed from: m9 */
    private int f4957m9;

    /* JADX INFO: renamed from: to */
    private AbstractC14770x9 f4958to;

    /* JADX INFO: renamed from: x1 */
    private gt5 f4959x1;

    public C0974f2(C14365qy c14365qy) {
        super(c14365qy);
        this.f4955k4 = 6;
        this.f4957m9 = 12;
        if (c14365qy.m69879yj().size() == 0 && c14365qy.m69851ks().size() == 0) {
            return;
        }
        if (c14365qy.m69834fa().hasTitle()) {
            gt5 gt5Var = new gt5(c14365qy);
            this.f4959x1 = gt5Var;
            m73215k4(gt5Var);
        }
        if (c14365qy.m69834fa().hasLegend()) {
            ygk ygkVar = new ygk(c14365qy);
            this.f4956kk = ygkVar;
            m73215k4(ygkVar);
        }
        C14237oh c14237oh = new C14237oh(this);
        this.f4953du = c14237oh;
        m73215k4(c14237oh);
        AbstractC14770x9 h3wVar = new h3w(c14365qy, this.f4953du);
        this.f4958to = h3wVar;
        m73215k4(h3wVar);
        C0838c1 c0838c1 = new C0838c1(c14365qy);
        this.f4954h4 = c0838c1;
        m73215k4(c0838c1);
        if (c14365qy.m69834fa().getType() == 74) {
            this.f4957m9 = 6;
        }
    }

    /* JADX INFO: renamed from: h4 */
    private mxy m5802h4(C14713vw c14713vw) {
        C12025x6 c12025x6 = new C12025x6();
        C12015qq c12015qq = new C12015qq();
        C12025x6[] c12025x6Arr = {c12025x6};
        C12015qq[] c12015qqArr = {c12015qq};
        m5807k4(m7149to().m69834fa().getChartTitle(), c12025x6Arr, c12015qqArr);
        c12025x6Arr[0].CloneTo(c12025x6);
        c12015qqArr[0].CloneTo(c12015qq);
        float fM72555k4 = this.f4959x1.m73225wy() == 0.0f ? c14713vw.m72555k4() * 0.8f : this.f4959x1.m73225wy();
        float fM72556x1 = this.f4959x1.m73203ak() == 0.0f ? c14713vw.m72556x1() * 0.46f : this.f4959x1.m73203ak();
        if (C14064he.m66715kk(c12025x6.m56897x1()) && C14064he.m66715kk(c12025x6.m56895kk())) {
            c12025x6 = new C12025x6((c14713vw.m72555k4() - fM72555k4) / 2.0f, this.f4955k4);
        }
        if (c12025x6.m56897x1() + this.f4959x1.m73225wy() > m73225wy()) {
            c12025x6.m56891k4(m73225wy() - this.f4959x1.m73225wy());
        }
        return new mxy(fM72555k4, fM72556x1, c12025x6.m56897x1(), c12025x6.m56895kk());
    }

    /* JADX INFO: renamed from: k4 */
    private mxy m5803k4(mxy mxyVar) {
        return new mxy(mxyVar.m72555k4() - (this.f4957m9 * 2), mxyVar.m72556x1() - (this.f4957m9 * 2), mxyVar.m67814to() + this.f4957m9, mxyVar.m67811du() + this.f4957m9);
    }

    /* JADX INFO: renamed from: m9 */
    private alc m5805m9(C14713vw c14713vw) {
        float fM72556x1;
        float f;
        float f2;
        float fM72555k4;
        ILegend legend = m7149to().m69834fa().getLegend();
        C12025x6 c12025x6 = new C12025x6();
        C12015qq c12015qq = new C12015qq();
        C12025x6[] c12025x6Arr = {c12025x6};
        C12015qq[] c12015qqArr = {c12015qq};
        m5807k4(legend, c12025x6Arr, c12015qqArr);
        c12025x6Arr[0].CloneTo(c12025x6);
        c12015qqArr[0].CloneTo(c12015qq);
        float fM73203ak = 0.0f;
        if (this.f4956kk.m73893dy()) {
            float fM72555k42 = c14713vw.m72555k4() * 0.35f;
            fM72555k4 = legend.getPosition() == 1 ? this.f4955k4 : (c14713vw.m72555k4() - this.f4956kk.m73225wy()) - this.f4955k4;
            gt5 gt5Var = this.f4959x1;
            if (gt5Var != null && !gt5Var.m6900m9()) {
                fM73203ak = this.f4959x1.m73203ak() + this.f4955k4;
            }
            fM72556x1 = fM73203ak + this.f4955k4;
            float fM72556x12 = (c14713vw.m72556x1() - fM72556x1) - this.f4955k4;
            if (legend.getPosition() != 4) {
                fM72556x1 = C20503OooO00o.OooO0O0(fM72556x12, this.f4956kk.m73203ak(), 2.0f, fM72556x1);
            } else if (this.f4956kk.m73203ak() > fM72556x12 / 3.0f) {
                fM72556x1 += this.f4955k4;
            }
            f = fM72556x12;
            f2 = fM72555k42;
        } else {
            float fM72556x13 = c14713vw.m72556x1() * 0.6666f;
            gt5 gt5Var2 = this.f4959x1;
            if (gt5Var2 != null && !gt5Var2.m6900m9()) {
                fM72556x13 -= this.f4959x1.m73203ak();
            }
            float fM72555k43 = c14713vw.m72555k4() * 0.9f;
            float fM72555k44 = (c14713vw.m72555k4() - this.f4956kk.m73225wy()) / 2.0f;
            if (legend.getPosition() == 0) {
                fM72556x1 = (c14713vw.m72556x1() - this.f4955k4) - this.f4956kk.m73203ak();
            } else {
                float f3 = this.f4955k4;
                gt5 gt5Var3 = this.f4959x1;
                if (gt5Var3 != null && !gt5Var3.m6900m9()) {
                    fM73203ak = this.f4955k4 + this.f4959x1.m73203ak();
                }
                fM72556x1 = fM73203ak + f3;
            }
            f = fM72556x13;
            f2 = fM72555k43;
            fM72555k4 = fM72555k44;
        }
        if (!C14064he.m66715kk(c12025x6.m56897x1()) && !C14064he.m66715kk(c12025x6.m56895kk())) {
            float fM56897x1 = c12025x6.m56897x1() + 1.0f;
            fM72556x1 = c12025x6.m56895kk();
            if (c12015qq.m56699x1() + fM56897x1 > m73225wy()) {
                fM56897x1 = m73225wy() - c12015qq.m56699x1();
            }
            fM72555k4 = fM56897x1;
            if (c12015qq.m56697kk() + fM72556x1 > m73203ak()) {
                fM72556x1 = m73203ak() - c12015qq.m56697kk();
            }
        }
        return new alc(f2, f, fM72555k4, fM72556x1, c12015qq.Clone());
    }

    /* JADX INFO: renamed from: du */
    public final mxy m5806du(C14713vw c14713vw) {
        float fM73203ak;
        float fM73203ak2;
        float fM73225wy = 0.0f;
        if (!((ChartPlotArea) C7019kk.m27452k4((Object) m7149to().m69834fa().getPlotArea(), ChartPlotArea.class)).isLocationAutocalculated() && m7149to().m69834fa().getPlotArea().getLayoutTargetType() == 1) {
            C12025x6 c12025x6 = new C12025x6();
            C12015qq c12015qq = new C12015qq();
            C12025x6[] c12025x6Arr = {c12025x6};
            C12015qq[] c12015qqArr = {c12015qq};
            m5807k4(m7149to().m69834fa().getPlotArea(), c12025x6Arr, c12015qqArr);
            c12025x6Arr[0].CloneTo(c12025x6);
            c12015qqArr[0].CloneTo(c12015qq);
            return (!C12015qq.m56692kk(c12015qq, C12015qq.f40552k4) || C14064he.m66715kk(c12025x6.m56897x1()) || C14064he.m66715kk(c12025x6.m56895kk())) ? new mxy(c14713vw.m72555k4(), c14713vw.m72556x1(), 0.0f, 0.0f) : new mxy(c12015qq.m56699x1(), c12015qq.m56697kk(), c12025x6.m56897x1(), c12025x6.m56895kk());
        }
        float fM72555k4 = c14713vw.m72555k4();
        float fM72556x1 = c14713vw.m72556x1();
        if (m7149to().m69865up().get_Item(0).m64945h4().getType() == 75) {
            this.f4957m9 = 6;
        }
        gt5 gt5Var = this.f4959x1;
        if (gt5Var == null || gt5Var.m6900m9()) {
            fM73203ak = 0.0f;
        } else {
            fM73203ak = this.f4955k4 + this.f4959x1.m73203ak();
            fM72556x1 -= fM73203ak;
        }
        ygk ygkVar = this.f4956kk;
        if (ygkVar != null && !ygkVar.m73895m9()) {
            int iM73896to = this.f4956kk.m73896to();
            if (iM73896to == 0) {
                fM73203ak2 = this.f4955k4 + this.f4956kk.m73203ak();
            } else if (iM73896to == 1) {
                fM73225wy = this.f4956kk.m73225wy() + this.f4955k4;
                fM72555k4 -= fM73225wy;
            } else if (iM73896to == 2) {
                fM72555k4 -= this.f4955k4 + this.f4956kk.m73225wy();
            } else if (iM73896to == 3) {
                float fM73203ak3 = this.f4955k4 + this.f4956kk.m73203ak();
                fM72556x1 -= fM73203ak3;
                fM73203ak += fM73203ak3;
            } else if (iM73896to == 4) {
                fM72555k4 -= this.f4955k4 + this.f4956kk.m73225wy();
                fM73203ak2 = this.f4956kk.m73203ak() < fM72556x1 / 3.0f ? this.f4956kk.m73203ak() : this.f4955k4;
                fM73203ak += fM73203ak2;
            }
            fM72556x1 -= fM73203ak2;
        }
        return m5803k4(new mxy(fM72555k4, fM72556x1, fM73225wy, fM73203ak));
    }

    /* JADX INFO: renamed from: kk */
    public final mxy m5808kk(C14713vw c14713vw) {
        if (((ChartPlotArea) C7019kk.m27452k4((Object) m7149to().m69834fa().getPlotArea(), ChartPlotArea.class)).isLocationAutocalculated()) {
            mxy mxyVarM5806du = m5806du(c14713vw);
            C14713vw c14713vwM68562up = this.f4953du.m68562up();
            return new mxy(c14713vwM68562up.m72555k4(), c14713vwM68562up.m72556x1(), mxyVarM5806du.m67814to() + this.f4953du.m68560to(1), mxyVarM5806du.m67811du() + this.f4953du.m68560to(3));
        }
        C12025x6 c12025x6 = new C12025x6();
        C12015qq c12015qq = new C12015qq();
        C12025x6[] c12025x6Arr = {c12025x6};
        C12015qq[] c12015qqArr = {c12015qq};
        m5807k4(m7149to().m69834fa().getPlotArea(), c12025x6Arr, c12015qqArr);
        c12025x6Arr[0].CloneTo(c12025x6);
        c12015qqArr[0].CloneTo(c12015qq);
        if (!C12015qq.m56692kk(c12015qq, C12015qq.f40552k4) || C14064he.m66715kk(c12025x6.m56897x1()) || C14064he.m66715kk(c12025x6.m56895kk())) {
            return m5806du(c14713vw);
        }
        if (m7149to().m69834fa().getPlotArea().getLayoutTargetType() == 0) {
            return new mxy(this.f4953du.m68561to() == null ? c12015qq.m56699x1() : this.f4953du.m68561to().m73225wy(), this.f4953du.m68551du() == null ? c12015qq.m56697kk() : this.f4953du.m68551du().m73203ak(), c12025x6.m56897x1(), c12025x6.m56895kk());
        }
        c12015qq.m56695k4((c12015qq.m56699x1() - this.f4953du.m68550du(1)) - this.f4953du.m68550du(2));
        c12015qq.m56700x1((c12015qq.m56697kk() - this.f4953du.m68550du(3)) - this.f4953du.m68550du(0));
        c12025x6.m56891k4(c12025x6.m56897x1() + this.f4953du.m68550du(1));
        c12025x6.m56898x1(c12025x6.m56895kk() + this.f4953du.m68550du(3));
        return new mxy(c12015qq.m56699x1(), c12015qq.m56697kk(), c12025x6.m56897x1(), c12025x6.m56895kk());
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
        AbstractC14770x9 abstractC14770x9;
        float fM73219qm;
        if (m7149to().m69879yj().size() == 0 && m7149to().m69851ks().size() == 0) {
            return;
        }
        if (this.f4959x1 != null) {
            mxy mxyVarM5802h4 = m5802h4(c14713vw);
            this.f4959x1.m73208du(mxyVarM5802h4.m67814to());
            this.f4959x1.m73212h4(mxyVarM5802h4.m67811du());
            this.f4959x1.m73220ss();
        }
        if (this.f4956kk != null) {
            alc alcVarM5805m9 = m5805m9(c14713vw);
            this.f4956kk.m73208du(alcVarM5805m9.m67814to());
            this.f4956kk.m73212h4(alcVarM5805m9.m67811du());
            this.f4956kk.m73220ss();
        }
        if (((ChartPlotArea) C7019kk.m27452k4((Object) m7149to().m69834fa().getPlotArea(), ChartPlotArea.class)).isLocationAutocalculated()) {
            mxy mxyVarM68557k4 = this.f4953du.m68557k4(m5806du(c14713vw));
            this.f4953du.m73208du(mxyVarM68557k4.m67814to());
            this.f4953du.m73212h4(mxyVarM68557k4.m67811du());
            this.f4958to.m73208du(this.f4953du.m73205bz() + this.f4953du.m68560to(1));
            this.f4958to.m73212h4(this.f4953du.m73219qm() + this.f4953du.m68560to(3));
            if (this.f4953du.m68552dy() != null) {
                this.f4958to.m73208du(this.f4953du.m73205bz() + this.f4953du.m68552dy().m73205bz());
                abstractC14770x9 = this.f4958to;
                fM73219qm = this.f4953du.m73219qm() + this.f4953du.m68552dy().m73219qm();
            }
            this.f4953du.m73220ss();
            this.f4958to.m73220ss();
            this.f4954h4.m73220ss();
        }
        mxy mxyVarM5808kk = m5808kk(c14713vw);
        this.f4958to.m73208du(mxyVarM5808kk.m67814to());
        this.f4958to.m73212h4(mxyVarM5808kk.m67811du());
        this.f4953du.m73208du(this.f4958to.m73205bz() - this.f4953du.m68560to(1));
        abstractC14770x9 = this.f4953du;
        fM73219qm = this.f4958to.m73219qm() - this.f4953du.m68560to(3);
        abstractC14770x9.m73212h4(fM73219qm);
        this.f4953du.m73220ss();
        this.f4958to.m73220ss();
        this.f4954h4.m73220ss();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m5807k4(ILayoutable iLayoutable, C12025x6[] c12025x6Arr, C12015qq[] c12015qqArr) {
        c12025x6Arr[0] = new C12025x6(Float.NaN, Float.NaN);
        C12015qq.f40552k4.CloneTo(c12015qqArr[0]);
        float x = iLayoutable.getX();
        float y = iLayoutable.getY();
        float width = iLayoutable.getWidth();
        float height = iLayoutable.getHeight();
        float fM73225wy = m73225wy();
        float fM73203ak = m73203ak();
        if (!C14064he.m66715kk(x) && !C14064he.m66715kk(y)) {
            c12025x6Arr[0] = new C12025x6(x * fM73225wy, y * fM73203ak);
        }
        if (!C14064he.m66715kk(width) && !C14064he.m66715kk(height)) {
            c12015qqArr[0] = new C12015qq(width * fM73225wy, height * fM73203ak);
        }
        if (((ChartPlotArea) C7019kk.m27452k4((Object) iLayoutable, ChartPlotArea.class)) == null || m7149to().m69834fa().getPlotArea().getLayoutTargetType() != 0) {
            return;
        }
        m5804k4(c12025x6Arr, c12015qqArr);
    }

    /* JADX INFO: renamed from: m9 */
    public final h3w m5809m9() {
        return (h3w) this.f4958to;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        if (m7149to().m69879yj().size() == 0 && m7149to().m69851ks().size() == 0) {
            return;
        }
        gt5 gt5Var = this.f4959x1;
        if (gt5Var != null) {
            gt5Var.m73210fa(m5802h4(c14713vw));
        }
        ygk ygkVar = this.f4956kk;
        if (ygkVar != null) {
            ygkVar.m73210fa(m5805m9(c14713vw));
        }
        this.f4953du.m73210fa(m5806du(c14713vw));
        this.f4958to.m73210fa(m5808kk(c14713vw));
        this.f4954h4.m73210fa(new C14713vw(m73225wy(), m73203ak()));
    }

    /* JADX INFO: renamed from: k4 */
    private void m5804k4(C12025x6[] c12025x6Arr, C12015qq[] c12015qqArr) {
        float fM73225wy = m73225wy();
        float fM73203ak = m73203ak();
        if (c12015qqArr[0].m56699x1() + c12025x6Arr[0].m56897x1() > fM73225wy) {
            C12025x6 c12025x6 = c12025x6Arr[0];
            c12025x6.m56891k4(c12025x6.m56897x1() - ((c12015qqArr[0].m56699x1() + c12025x6Arr[0].m56897x1()) - fM73225wy));
        }
        if (c12025x6Arr[0].m56897x1() < 0.0f) {
            c12025x6Arr[0].m56891k4(0.0f);
            c12015qqArr[0].m56695k4(fM73225wy);
        }
        if (c12015qqArr[0].m56697kk() + c12025x6Arr[0].m56895kk() > fM73203ak) {
            C12025x6 c12025x62 = c12025x6Arr[0];
            c12025x62.m56898x1(c12025x62.m56895kk() - ((c12015qqArr[0].m56697kk() + c12025x6Arr[0].m56895kk()) - fM73203ak));
        }
        if (c12025x6Arr[0].m56895kk() < 0.0f) {
            c12025x6Arr[0].m56898x1(0.0f);
            c12015qqArr[0].m56700x1(fM73203ak);
        }
        this.f4953du.m68553fa().m7281k4(c12025x6Arr, c12015qqArr);
    }
}
