package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class z3m extends xhm {

    /* JADX INFO: renamed from: kk */
    private C12013m9 f50475kk;

    /* JADX INFO: renamed from: to */
    private C12015qq f50476to = new C12015qq();

    /* JADX INFO: renamed from: x1 */
    private final String f50477x1;

    public z3m(String str) {
        this.f50477x1 = str;
    }

    /* JADX INFO: renamed from: c5 */
    private LegendEntryProperties m74299c5() {
        return ((a4w) m73228yd()).m3229to();
    }

    @Override // com.aspose.slides.xhm
    /* JADX INFO: renamed from: du */
    public C12003du mo4317du() {
        Chart chart = (Chart) m74299c5().getChart();
        return chart.m507k4(m74299c5().getTextFormat(), chart.m506k4(chart.getStyle() + 1 <= 40 ? (byte) 0 : (byte) 1).Clone().Clone());
    }

    /* JADX INFO: renamed from: dy */
    public final C12013m9 m74300dy() {
        return mo4321to();
    }

    @Override // com.aspose.slides.xhm
    /* JADX INFO: renamed from: h4 */
    public float mo4318h4() {
        return 0.0f;
    }

    @Override // com.aspose.slides.xhm
    /* JADX INFO: renamed from: k4 */
    public void mo4319k4(AutoShape autoShape) {
        m73365k4(((Chart) m74299c5().getChart()).getLegend().getTextFormat());
        IGenericEnumerator<IParagraph> it = autoShape.m288x1().getParagraphs().iterator();
        while (it.hasNext()) {
            try {
                it.next().getParagraphFormat().setAlignment(0);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: m9 */
    public final C12015qq m74301m9() {
        if (this.f50476to.m56696k4()) {
            oju ojuVarClone = m73363k4("Sample", 10000.0f, 10000.0f).Clone();
            this.f50476to = new C12015qq(ojuVarClone.f47836k4, ojuVarClone.f47837x1);
        }
        return this.f50476to;
    }

    @Override // com.aspose.slides.xhm
    /* JADX INFO: renamed from: to */
    public C12013m9 mo4321to() {
        if (this.f50475kk == null) {
            this.f50475kk = ((Chart) m74299c5().getChart()).m509k4(m74299c5().getTextFormat());
        }
        return this.f50475kk;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: to */
    public void mo3230to(C14713vw c14713vw) {
        oju ojuVarClone = m73364k4(this.f50477x1, c14713vw.m72555k4(), c14713vw.m72556x1(), true).Clone();
        if (ojuVarClone.f47837x1 > c14713vw.m72556x1()) {
            m73364k4(((xhm) this).f50079k4.m288x1().f3523to.mo64292k4(c14713vw.m72555k4(), c14713vw.m72556x1(), false), c14713vw.m72555k4(), c14713vw.m72556x1(), true).CloneTo(ojuVarClone);
            ojuVarClone.f47836k4 = C14116yg.m67481k4(0.0f, ojuVarClone.f47836k4);
        }
        m73214k4(ojuVarClone.Clone());
    }
}
