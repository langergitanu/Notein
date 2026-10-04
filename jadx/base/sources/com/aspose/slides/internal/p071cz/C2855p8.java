package com.aspose.slides.internal.p071cz;

import com.aspose.slides.internal.p071cz.AbstractC2770ix;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.p8 */
/* JADX INFO: loaded from: classes3.dex */
public class C2855p8 extends AbstractC2846of {
    @Override // com.aspose.slides.internal.p071cz.AbstractC2878qv
    /* JADX INFO: renamed from: du */
    public C2773j5 mo12119du() {
        double dM12330x1 = AbstractC2770ix.m12330x1(AbstractC2770ix.m12323k4(30000.0d, m12332x1().mo12282k4("adj"), 70000.0d), m12498h4().m12521x1().m12482k4(), 100000.0d);
        double dM12325kk = AbstractC2770ix.m12325kk(dM12330x1, 0.0d, m12498h4().m12521x1().m12482k4() / 2.0d);
        double dM12325kk2 = AbstractC2770ix.m12325kk(dM12330x1, 0.0d, 0.0d);
        double dM12325kk3 = AbstractC2770ix.m12325kk(m12498h4().m12521x1().m12482k4(), 0.0d, dM12330x1);
        double dM12319du = AbstractC2770ix.m12319du(dM12325kk, AbstractC2770ix.m12330x1(dM12325kk3, 2.0d, 1.0d), AbstractC2770ix.m12330x1(dM12325kk2, 2.0d, 1.0d));
        double dM12325kk4 = AbstractC2770ix.m12325kk(0.0d, dM12319du, 0.0d);
        double dM12325kk5 = AbstractC2770ix.m12325kk(m12498h4().m12521x1().m12482k4(), 0.0d, dM12319du);
        double dM12319du2 = AbstractC2770ix.m12319du(dM12325kk, 0.0d, dM12325kk5);
        double dM12319du3 = AbstractC2770ix.m12319du(dM12325kk, dM12325kk4, m12498h4().m12521x1().m12482k4());
        double dM12319du4 = AbstractC2770ix.m12319du(dM12325kk, dM12325kk5, 0.0d);
        double dM12319du5 = AbstractC2770ix.m12319du(dM12325kk, m12498h4().m12521x1().m12482k4(), dM12325kk4);
        C2773j5 c2773j5 = new C2773j5(m12498h4().m12521x1().m12482k4(), m12498h4().m12521x1().m12484x1(), 0, false, true);
        c2773j5.m12347kk();
        c2773j5.m12351x1(dM12319du2, 0.0d);
        c2773j5.m12343k4(dM12319du3, 0.0d);
        c2773j5.m12347kk();
        c2773j5.m12351x1(dM12319du4, m12498h4().m12521x1().m12484x1());
        c2773j5.m12343k4(dM12319du5, m12498h4().m12521x1().m12484x1());
        return c2773j5;
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2878qv
    /* JADX INFO: renamed from: k4 */
    public int mo12120k4() {
        return 1;
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2878qv, com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: to */
    public AbstractC2878qv cloneT() {
        C2855p8 c2855p8 = new C2855p8();
        c2855p8.m12332x1().mo12283k4("adj", m12332x1().mo12282k4("adj"));
        return c2855p8;
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2770ix
    /* JADX INFO: renamed from: k4 */
    public void mo12113k4(AbstractC2770ix.x1 x1Var) {
        x1Var.mo12334x1("adj", 50000.0d);
    }
}
