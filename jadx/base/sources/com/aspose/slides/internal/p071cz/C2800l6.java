package com.aspose.slides.internal.p071cz;

import com.aspose.slides.internal.p071cz.AbstractC2770ix;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.l6 */
/* JADX INFO: loaded from: classes3.dex */
public class C2800l6 extends AbstractC2846of {
    @Override // com.aspose.slides.internal.p071cz.AbstractC2878qv
    /* JADX INFO: renamed from: du */
    public C2773j5 mo12119du() {
        double dM12323k4 = AbstractC2770ix.m12323k4(14286.0d, m12332x1().mo12282k4("adj"), 50000.0d);
        double dM12330x1 = AbstractC2770ix.m12330x1(m12498h4().m12521x1().m12482k4(), 1.0d, 3.0d);
        double dM12330x12 = AbstractC2770ix.m12330x1(dM12323k4, m12498h4().m12521x1().m12484x1(), 100000.0d);
        double dM12325kk = AbstractC2770ix.m12325kk(0.0d, dM12330x1, 0.0d);
        double dM12325kk2 = AbstractC2770ix.m12325kk(m12498h4().m12521x1().m12482k4(), 0.0d, dM12330x1);
        double dM12325kk3 = AbstractC2770ix.m12325kk(0.0d, dM12330x12, 0.0d);
        double dM12325kk4 = AbstractC2770ix.m12325kk(m12498h4().m12521x1().m12484x1(), 0.0d, dM12330x12);
        C2773j5 c2773j5 = new C2773j5(m12498h4().m12521x1().m12482k4(), m12498h4().m12521x1().m12484x1(), 0, false, true);
        c2773j5.m12347kk();
        c2773j5.m12351x1(0.0d, dM12325kk3);
        c2773j5.m12343k4(dM12325kk, 0.0d);
        c2773j5.m12343k4(dM12325kk2, 0.0d);
        c2773j5.m12343k4(m12498h4().m12521x1().m12482k4(), dM12325kk3);
        c2773j5.m12347kk();
        c2773j5.m12351x1(0.0d, dM12325kk4);
        c2773j5.m12343k4(dM12325kk, m12498h4().m12521x1().m12484x1());
        c2773j5.m12343k4(dM12325kk2, m12498h4().m12521x1().m12484x1());
        c2773j5.m12343k4(m12498h4().m12521x1().m12482k4(), dM12325kk4);
        return c2773j5;
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2878qv
    /* JADX INFO: renamed from: k4 */
    public int mo12120k4() {
        return 2;
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2878qv, com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: to */
    public AbstractC2878qv cloneT() {
        C2800l6 c2800l6 = new C2800l6();
        c2800l6.m12332x1().mo12283k4("adj", m12332x1().mo12282k4("adj"));
        return c2800l6;
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2770ix
    /* JADX INFO: renamed from: k4 */
    public void mo12113k4(AbstractC2770ix.x1 x1Var) {
        x1Var.mo12334x1("adj", 25000.0d);
    }
}
