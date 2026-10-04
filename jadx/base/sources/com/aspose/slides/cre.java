package com.aspose.slides;

import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
class cre extends zsm {
    public cre(z3t z3tVar, fml fmlVar) {
        super(z3tVar, fmlVar);
        m74793to();
        for (int i = 0; i < m74784ck().f5072x1.size(); i++) {
            g2y g2yVar = new g2y();
            m73215k4(g2yVar);
            ((zsm) this).f50716k4.addItem(g2yVar);
            double dM67469du = 0.0d;
            for (int i2 = 0; i2 < m74783c5().length; i2++) {
                dM67469du += C14116yg.m67469du(m74784ck().f5072x1.get_Item(i).m6923up(), (((double) m74783c5().length) - 1.0d) - ((double) i2)) * m74783c5()[i2];
            }
            g2yVar.m6408x1(dM67469du);
            g2yVar.m6405k4(m74784ck().f5072x1.get_Item(i).m6923up());
            if (m74784ck().m6216ks().f45392kk.m73026k4().m73375b3()) {
                g2yVar.m6405k4(g2yVar.m6407to() + 0.5d);
            }
        }
    }

    @Override // com.aspose.slides.zsm
    /* JADX INFO: renamed from: k4 */
    public void mo4799k4(double[] dArr, double[] dArr2) {
        double[][] dArrM70089k4;
        int order = m74792m9().m74307kk().getOrder() & 255;
        double[][] dArr3 = new double[dArr.length][];
        if (order > dArr.length - 1) {
            order = dArr.length - 1;
        }
        for (int i = 0; i < dArr.length; i++) {
            double[] dArr4 = new double[order];
            dArr3[i] = dArr4;
            dArr4[0] = dArr[i];
            for (int i2 = 1; i2 < order; i2++) {
                double[] dArr5 = dArr3[i];
                dArr5[i2] = dArr[i] * dArr5[i2 - 1];
            }
        }
        if (m74786fa()) {
            for (int i3 = 0; i3 < dArr2.length; i3++) {
                dArr2[i3] = dArr2[i3] - m74794up();
            }
            dArrM70089k4 = rgn.m70093x1(dArr2, dArr3);
        } else {
            dArrM70089k4 = rgn.m70089k4(dArr2, dArr3);
        }
        int length = dArrM70089k4[0].length;
        double[] dArr6 = new double[length];
        for (int i4 = 0; i4 < length; i4++) {
            dArr6[i4] = dArrM70089k4[0][i4];
            if (i4 == length - 1 && m74786fa()) {
                dArr6[i4] = m74794up();
            }
        }
        m74788k4(dArrM70089k4[2][0]);
        m74789k4(dArr6);
    }
}
