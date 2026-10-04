package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
abstract class otz extends AbstractC14770x9 {

    /* JADX INFO: renamed from: k4 */
    private lyj f47931k4;

    /* JADX INFO: renamed from: c5 */
    public final C12007ix m68826c5() {
        return new C12007ix(m73227xk(), m73206c6(), m73225wy(), m73203ak());
    }

    /* JADX INFO: renamed from: ck */
    public final boolean m68827ck() {
        byte dashStyle = mo6843m9().getDashStyle();
        return (dashStyle == -1 || dashStyle == 0) ? false : true;
    }

    /* JADX INFO: renamed from: dy */
    public abstract boolean mo6841dy();

    /* JADX INFO: renamed from: jd */
    public final float m68828jd() {
        return (m73203ak() * 4.0f) / 5.0f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68829k4(IMarker iMarker, C13847mr c13847mr) {
        if (!mo6841dy() || iMarker.getSymbol() == 4) {
            return;
        }
        lyj lyjVar = new lyj(iMarker, c13847mr);
        m73215k4(lyjVar);
        this.f47931k4 = lyjVar;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo6842k4(C11896dy c11896dy);

    /* JADX INFO: renamed from: kk */
    public final void m68831kk(C14713vw c14713vw) {
        if (this.f47931k4 != null) {
            float fM72555k4 = c14713vw.m72555k4();
            float fM72556x1 = c14713vw.m72556x1();
            if (!this.f47931k4.m64630to()) {
                fM72555k4 = C14116yg.m67504x1(fM72555k4, this.f47931k4.m64629m9());
                fM72556x1 = C14116yg.m67504x1(fM72556x1, this.f47931k4.m64629m9());
            }
            this.f47931k4.m73210fa(new C14713vw(fM72555k4, fM72556x1));
        }
    }

    /* JADX INFO: renamed from: m9 */
    public abstract LineFormat mo6843m9();

    /* JADX INFO: renamed from: to */
    public abstract int mo6844to();

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: to */
    public void mo3230to(C14713vw c14713vw) {
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3482x1() {
        C12007ix c12007ix = new C12007ix(m73218lr().m73227xk(), m73218lr().m73206c6(), m73218lr().m73225wy(), m73218lr().m73203ak());
        C14851yl c14851yl = new C14851yl(m73218lr().m7149to());
        c14851yl.m73924k4(c12007ix.Clone());
        try {
            mo6842k4(new C11896dy());
        } finally {
            c14851yl.m73923k4();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68830k4(LineFormat lineFormat, C14365qy c14365qy, C12003du c12003du, float f, C14093tq<Float> c14093tq) {
        C14093tq<Float> c14093tqClone = c14093tq.Clone();
        if (!c14093tqClone.m67302x1()) {
            c14093tqClone = new C14093tq<>(Float.valueOf(1.0f));
        }
        azo azoVarM7718x1 = im9.m7718x1(c12003du.Clone(), lineFormat, c14365qy, C7019kk.m27469x1(this, hmm.class) ? 0.75f : c14093tqClone.m67297k4().floatValue());
        double d = f;
        if (azoVarM7718x1.m3906k4() > d) {
            azoVarM7718x1.m3909k4(d);
        }
        C12025x6 c12025x6 = new C12025x6(m73227xk(), m73223ts().m56895kk());
        C12025x6 c12025x62 = new C12025x6(m73227xk() + m73225wy(), m73223ts().m56895kk());
        C11896dy c11896dy = new C11896dy();
        azoVarM7718x1.f4054h4 = im9.m7685k4(C22222Oooo0OO.OooO00o(c12025x62, c11896dy, c12025x6.Clone(), c12003du), (LineFillFormat) lineFormat.getFillFormat(), c14365qy, 1.0f, c11896dy);
        c14365qy.m69870wy().mo64338k4(c11896dy, azoVarM7718x1, (C0962es) null);
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
        lyj lyjVar = this.f47931k4;
        if (lyjVar != null) {
            lyjVar.m73208du((m73225wy() - this.f47931k4.m73225wy()) / 2.0f);
            this.f47931k4.m73212h4((m73203ak() - this.f47931k4.m73203ak()) / 2.0f);
            this.f47931k4.m73220ss();
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        m73217kk(c14713vw.m72555k4());
        m73222to(c14713vw.m72556x1());
        m68831kk(c14713vw);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m68825k4(C13847mr c13847mr) {
        return !(ChartTypeCharacterizer.isChartTypeLine(c13847mr.m64945h4().getType()) || c13847mr.m64945h4().getType() == 54 || c13847mr.m64945h4().getType() == 55 || c13847mr.m64945h4().getType() == 56 || c13847mr.m64945h4().getType() == 57 || c13847mr.m64945h4().getType() == 70 || c13847mr.m64945h4().getType() == 71) || c13847mr.m64945h4().getFormat().getLine().getFillFormat().getFillType() == 0;
    }
}
