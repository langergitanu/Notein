package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class gt5 extends xhm {

    /* JADX INFO: renamed from: x1 */
    private final C14365qy f5336x1;

    public gt5(C14365qy c14365qy) {
        this.f5336x1 = c14365qy;
    }

    /* JADX INFO: renamed from: c5 */
    private ChartTitle m6897c5() {
        return (ChartTitle) this.f5336x1.m69834fa().getChartTitle();
    }

    /* JADX INFO: renamed from: dy */
    private String m6898dy() {
        return (this.f5336x1.m69865up().size() != 1 || ChartTypeCharacterizer.m767to(this.f5336x1.m69865up().get_Item(0).m64945h4().getType())) ? "Chart Title" : this.f5336x1.m69865up().get_Item(0).m64957kk();
    }

    /* JADX INFO: renamed from: jd */
    private void m6899jd() {
        C12013m9 c12013m9M68734du = this.f5336x1.m69828ck().m68734du();
        if (c12013m9M68734du == null) {
            c12013m9M68734du = mo4321to();
        }
        float fM56639dy = (c12013m9M68734du.m56639dy() * c12013m9M68734du.m56651x1().m56526du(c12013m9M68734du.m56642jd())) / c12013m9M68734du.m56651x1().m56535to(c12013m9M68734du.m56642jd());
        IGenericEnumerator<IParagraph> it = ((xhm) this).f50079k4.getTextFrame().getParagraphs().iterator();
        while (it.hasNext()) {
            try {
                it.next().getParagraphFormat().setSpaceWithin(-((float) C14116yg.m67477k4(fM56639dy, 0)));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: O_ */
    public int mo3480O_() {
        return 10;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: T_ */
    public boolean mo3221T_() {
        return this.f5336x1.m69834fa().hasTitle();
    }

    @Override // com.aspose.slides.xhm
    /* JADX INFO: renamed from: du */
    public C12003du mo4317du() {
        return this.f5336x1.m69828ck().m68741kk();
    }

    @Override // com.aspose.slides.xhm
    /* JADX INFO: renamed from: h4 */
    public float mo4318h4() {
        return this.f5336x1.m69828ck().m68743to();
    }

    @Override // com.aspose.slides.xhm
    /* JADX INFO: renamed from: k4 */
    public void mo4319k4(AutoShape autoShape) {
        m73365k4(m6897c5().getTextFormat());
        ChartTitle chartTitleM6897c5 = m6897c5();
        ITextFrame textFrameForOverriding = chartTitleM6897c5.getTextFrameForOverriding();
        if (textFrameForOverriding != null && textFrameForOverriding.getText() != null) {
            autoShape.m288x1().m2930x1(textFrameForOverriding);
        }
        float f = ChartTypeCharacterizer.m767to(chartTitleM6897c5.getChart().getType()) ? 0.0f : 0.72f;
        TextFrameFormat textFrameFormat = (TextFrameFormat) autoShape.m288x1().getTextFrameFormat();
        textFrameFormat.setCenterText((byte) 1);
        double d = 4.0f * f;
        double d2 = f;
        textFrameFormat.m2953k4(new xmh(d, d2, d, d2));
        textFrameFormat.setAnchoringType((byte) 1);
        m6899jd();
        ((FillFormat) autoShape.getFillFormat()).m1456k4(chartTitleM6897c5.getFormat().getFill());
        ((LineFormat) autoShape.getLineFormat()).m1896k4(chartTitleM6897c5.getFormat().getLine());
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m6900m9() {
        return m6897c5().getOverlay();
    }

    @Override // com.aspose.slides.xhm
    /* JADX INFO: renamed from: to */
    public C12013m9 mo4321to() {
        return this.f5336x1.m69828ck().m68744x1();
    }

    @Override // com.aspose.slides.xhm, com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3482x1() {
        im9.m7700k4(C12003du.f40505to.Clone(), C12003du.f40505to.Clone(), this.f5336x1, m73209e0().Clone(), (LineFormat) this.f5336x1.m69834fa().getChartTitle().getFormat().getLine(), (FillFormat) this.f5336x1.m69834fa().getChartTitle().getFormat().getFill(), this.f5336x1.m69834fa().getChartTitle().getFormat().getEffect());
        super.mo3482x1();
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: to */
    public void mo3230to(C14713vw c14713vw) {
        oju ojuVarClone = m73363k4(m6898dy(), c14713vw.m72555k4(), c14713vw.m72556x1()).Clone();
        if (ojuVarClone.f47836k4 > c14713vw.m72555k4() || ojuVarClone.f47837x1 > c14713vw.m72556x1()) {
            m73363k4(((xhm) this).f50079k4.m288x1().f3523to.mo64292k4(c14713vw.m72555k4(), c14713vw.m72556x1(), C7019kk.m27469x1(this, nxm.class)), c14713vw.m72555k4(), c14713vw.m72556x1()).CloneTo(ojuVarClone);
        }
        m73214k4(ojuVarClone.Clone());
    }
}
