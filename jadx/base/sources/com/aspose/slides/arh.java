package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class arh extends fml {

    /* JADX INFO: renamed from: k4 */
    List<g2y> f3940k4;

    public arh(ixg ixgVar, C13847mr c13847mr) {
        super(ixgVar, c13847mr);
        this.f3940k4 = new List<>();
        for (int i = 0; i < c13847mr.m64945h4().m719c5().m72973k4(); i++) {
            g2y g2yVar = new g2y();
            g2yVar.m6408x1(((C0791b3) C7019kk.m27452k4((Object) c13847mr.m64945h4().m719c5().m72975k4(i), C0791b3.class)).m3950fa());
            m73215k4(g2yVar);
            this.f3940k4.addItem(g2yVar);
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        List.Enumerator<g2y> it = this.f3940k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().m73210fa(new C14713vw(0.0f, 0.0f));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3482x1() {
        C11896dy c11896dy = new C11896dy();
        Chart chart = (Chart) m6220yj().m64945h4().getChart();
        C12003du[] c12003duArrM7632k4 = igr.m7632k4(chart, chart.getStyle() + 1, 2);
        for (int i = 1; i < this.f3940k4.size(); i++) {
            c11896dy.m55547k4(this.f3940k4.get_Item(i - 1).m73223ts().Clone(), this.f3940k4.get_Item(i).m73223ts().Clone());
            m6220yj().m64950k4(c12003duArrM7632k4[1].Clone(), c11896dy, (LineFormat) m6220yj().m64945h4().getFormat().getLine(), im9.m7680k4(m6220yj().m64945h4().getChart()));
            c11896dy.m55527fa();
        }
    }

    @Override // com.aspose.slides.fml
    /* JADX INFO: renamed from: k4 */
    public void mo3716k4(double[] dArr, double[] dArr2) {
        C0791b3 c0791b3M72975k4 = m6220yj().m64945h4().m719c5().m72975k4(0);
        dArr[0] = c0791b3M72975k4.m3950fa();
        dArr2[0] = c0791b3M72975k4.m3950fa();
        if (m6220yj().m64945h4().m719c5().m72973k4() > 1) {
            for (int i = 1; i < m6220yj().m64945h4().m719c5().m72973k4(); i++) {
                C0791b3 c0791b3M72975k42 = m6220yj().m64945h4().m719c5().m72975k4(i);
                if (c0791b3M72975k42.m3950fa() > dArr2[0]) {
                    dArr2[0] = c0791b3M72975k42.m3950fa();
                }
                if (c0791b3M72975k42.m3950fa() < dArr[0]) {
                    dArr[0] = c0791b3M72975k42.m3950fa();
                }
            }
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
        for (int i = 0; i < this.f3940k4.size(); i++) {
            float fM72555k4 = c14713vw.m72555k4() / this.f3940k4.size();
            this.f3940k4.get_Item(i).m73212h4(m6216ks().f45394x1.mo4964k4(this.f3940k4.get_Item(i).m6406m9()));
            this.f3940k4.get_Item(i).m73208du((fM72555k4 / 2.0f) + (i * fM72555k4));
            this.f3940k4.get_Item(i).m73220ss();
        }
    }
}
