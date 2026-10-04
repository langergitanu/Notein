package com.aspose.slides;

import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.p4 */
/* JADX INFO: loaded from: classes3.dex */
class C14266p4 extends ixg {
    public C14266p4(C13847mr[] c13847mrArr, AbstractC14763x3 abstractC14763x3, AbstractC14763x3 abstractC14763x32) {
        super(abstractC14763x3, abstractC14763x32);
        for (C13847mr c13847mr : c13847mrArr) {
            C13790lq c13790lq = new C13790lq(this, c13847mr);
            ((ixg) this).f45391k4.addItem(c13790lq);
            m73215k4(c13790lq);
        }
        m63153m9();
    }

    /* JADX INFO: renamed from: to */
    public final double m68933to() {
        double d = 0.0d;
        for (int i = 0; i < ((ixg) this).f45391k4.size(); i++) {
            fml fmlVar = ((ixg) this).f45391k4.get_Item(i);
            boolean zM733ks = fmlVar.m6220yj().m64945h4().m733ks();
            for (int i2 = 0; i2 < fmlVar.f5072x1.size(); i2++) {
                if (!fmlVar.f5072x1.get_Item(i2).m6926yj().m4983dy()) {
                    double dM4999kk = fmlVar.f5072x1.get_Item(i2).m6926yj().m4999kk();
                    if (zM733ks) {
                        dM4999kk = C14116yg.m67475k4(dM4999kk);
                    }
                    if (d < dM4999kk) {
                        d = dM4999kk;
                    }
                }
            }
        }
        return d;
    }
}
