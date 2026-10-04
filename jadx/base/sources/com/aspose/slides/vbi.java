package com.aspose.slides;

import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
class vbi extends zsm {
    public vbi(z3t z3tVar, fml fmlVar) {
        super(z3tVar, fmlVar);
        m74793to();
        for (int i = 0; i < m74784ck().f5072x1.size(); i++) {
            g2y g2yVar = new g2y();
            m73215k4(g2yVar);
            ((zsm) this).f50716k4.addItem(g2yVar);
            g2yVar.m6408x1((C14116yg.m67511yj(m74784ck().f5072x1.get_Item(i).m6923up()) * m74783c5()[0]) + m74783c5()[1]);
            g2yVar.m6405k4(m74784ck().f5072x1.get_Item(i).m6923up());
            if (m74784ck().m6216ks().f45392kk.m73026k4().m73375b3()) {
                g2yVar.m6405k4(g2yVar.m6407to() + 0.5d);
            }
        }
    }

    @Override // com.aspose.slides.zsm
    /* JADX INFO: renamed from: k4 */
    public void mo4799k4(double[] dArr, double[] dArr2) {
        for (int i = 0; i < dArr.length; i++) {
            dArr[i] = C14116yg.m67511yj(dArr[i]);
        }
        super.mo4799k4(dArr, dArr2);
    }
}
