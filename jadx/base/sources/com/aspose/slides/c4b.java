package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: loaded from: classes3.dex */
class c4b extends zsm {
    public c4b(z3t z3tVar, fml fmlVar) {
        super(z3tVar, fmlVar);
        m74793to();
        for (int i = 0; i < m74784ck().f5072x1.size(); i++) {
            if (!m74784ck().f5072x1.get_Item(i).m6926yj().m4983dy()) {
                g2y g2yVar = new g2y();
                m73215k4(g2yVar);
                ((zsm) this).f50716k4.addItem(g2yVar);
                g2yVar.m6408x1((m74783c5()[0] * m74784ck().f5072x1.get_Item(i).m6923up()) + m74783c5()[1]);
                g2yVar.m6405k4(m74784ck().f5072x1.get_Item(i).m6923up());
                if (m74784ck().m6216ks().f45392kk.m73026k4().m73375b3() && !C7019kk.m27469x1(m74784ck().m6216ks().f45392kk, AbstractC14464sp.class)) {
                    g2yVar.m6405k4(g2yVar.m6407to() + 0.5d);
                }
            }
        }
    }
}
