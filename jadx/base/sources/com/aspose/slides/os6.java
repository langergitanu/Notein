package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
class os6 extends zsm {
    public os6(z3t z3tVar, fml fmlVar) {
        super(z3tVar, fmlVar);
        m74793to();
        int period = m74792m9().m74307kk().getPeriod() & 255;
        for (int i = period - 1; i < m74784ck().f5072x1.size(); i++) {
            double dM6918fa = 0.0d;
            int i2 = 0;
            for (int i3 = (i - period) + 1; i3 <= i; i3++) {
                if (!m74784ck().f5072x1.get_Item(i3).m6926yj().m4983dy()) {
                    i2++;
                    dM6918fa += m74784ck().f5072x1.get_Item(i3).m6918fa();
                }
            }
            g2y g2yVar = new g2y();
            m73215k4(g2yVar);
            ((zsm) this).f50716k4.addItem(g2yVar);
            g2yVar.m6408x1(dM6918fa / ((double) (i2 != 0 ? i2 : 1)));
            g2yVar.m6405k4(m74784ck().f5072x1.get_Item(i).m6923up());
            if (m74784ck().m6216ks().f45392kk.m73026k4().m73375b3()) {
                g2yVar.m6405k4(g2yVar.m6407to() + 0.5d);
            }
        }
    }

    @Override // com.aspose.slides.zsm
    /* JADX INFO: renamed from: k4 */
    public void mo4799k4(double[] dArr, double[] dArr2) {
    }
}
