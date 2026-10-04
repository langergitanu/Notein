package com.aspose.slides.internal.p071cz;

import com.aspose.slides.internal.p071cz.AbstractC2770ix;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.qq */
/* JADX INFO: loaded from: classes3.dex */
public class C2877qq extends AbstractC2732fu {
    @Override // com.aspose.slides.internal.p071cz.AbstractC2878qv
    /* JADX INFO: renamed from: du */
    public C2773j5 mo12119du() {
        double dM67502x1 = C14116yg.m67502x1(m12498h4().m12521x1().m12482k4(), m12498h4().m12521x1().m12484x1());
        double dM67491kk = C14116yg.m67491kk(m12498h4().m12521x1().m12482k4(), m12498h4().m12521x1().m12484x1());
        double dMo12282k4 = m12332x1().mo12282k4("adj");
        double dM12323k4 = AbstractC2770ix.m12323k4(0.0d, dMo12282k4, 2.1599999E7d);
        double dM12325kk = AbstractC2770ix.m12325kk(1.08E7d, 0.0d, dM12323k4);
        double dM12319du = AbstractC2770ix.m12319du(AbstractC2770ix.m12325kk(0.0d, 0.0d, dM12325kk), AbstractC2770ix.m12325kk(3.24E7d, 0.0d, dM12323k4), dM12325kk);
        double dM12325kk2 = AbstractC2770ix.m12325kk(5400000.0d, 0.0d, dM12323k4);
        double dM12325kk3 = AbstractC2770ix.m12325kk(1.62E7d, 0.0d, dM12323k4);
        double dM12325kk4 = AbstractC2770ix.m12325kk(dM12323k4, 0.0d, dM12319du);
        double dM12325kk5 = AbstractC2770ix.m12325kk(dM12325kk4, 0.0d, 2.16E7d);
        double dM12319du2 = AbstractC2770ix.m12319du(dM12319du, AbstractC2770ix.m12319du(dM12325kk2, dM12325kk4, AbstractC2770ix.m12319du(dM12325kk, dM12325kk5, AbstractC2770ix.m12319du(dM12325kk3, dM12325kk4, dM12325kk5))), AbstractC2770ix.m12325kk(0.0d, 0.0d, 1.08E7d));
        double d = dM67502x1 / 2.0d;
        double dM12324kk = AbstractC2770ix.m12324kk(d, dMo12282k4);
        double dM12329x1 = AbstractC2770ix.m12329x1(d, dMo12282k4);
        double dM12321h4 = AbstractC2770ix.m12321h4(d, dM12329x1, dM12324kk);
        double dM12320dy = AbstractC2770ix.m12320dy(d, dM12329x1, dM12324kk);
        AbstractC2770ix.m12325kk(d, dM12321h4, 0.0d);
        AbstractC2770ix.m12325kk(d, dM12320dy, 0.0d);
        double dM12324kk2 = AbstractC2770ix.m12324kk(d, dM12319du);
        double dM12329x12 = AbstractC2770ix.m12329x1(d, dM12319du);
        double dM12321h42 = AbstractC2770ix.m12321h4(d, dM12329x12, dM12324kk2);
        double dM12320dy2 = AbstractC2770ix.m12320dy(d, dM12329x12, dM12324kk2);
        double dM12325kk6 = AbstractC2770ix.m12325kk(d, dM12321h42, 0.0d);
        double dM12325kk7 = AbstractC2770ix.m12325kk(d, dM12320dy2, 0.0d);
        C2773j5 c2773j5 = new C2773j5(dM67502x1, dM67502x1, 0, false, true);
        c2773j5.m12347kk();
        c2773j5.m12351x1(dM12325kk6, dM12325kk7);
        c2773j5.m12344k4(d, d, dM12319du, dM12319du2);
        if (m12498h4().m12521x1().m12484x1() > m12498h4().m12521x1().m12482k4()) {
            c2773j5.m12342k4(dM67491kk / dM67502x1);
            return c2773j5;
        }
        c2773j5.m12350x1(dM67491kk / dM67502x1);
        return c2773j5;
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2878qv
    /* JADX INFO: renamed from: k4 */
    public int mo12120k4() {
        return 10;
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2878qv, com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: to */
    public AbstractC2878qv cloneT() {
        C2877qq c2877qq = new C2877qq();
        c2877qq.m12332x1().mo12283k4("adj", m12332x1().mo12282k4("adj"));
        return c2877qq;
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2770ix
    /* JADX INFO: renamed from: k4 */
    public void mo12113k4(AbstractC2770ix.x1 x1Var) {
        x1Var.mo12334x1("adj", 0.0d);
    }
}
