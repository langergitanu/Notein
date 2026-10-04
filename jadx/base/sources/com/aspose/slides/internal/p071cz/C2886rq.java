package com.aspose.slides.internal.p071cz;

import com.aspose.slides.internal.p071cz.AbstractC2770ix;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.rq */
/* JADX INFO: loaded from: classes3.dex */
public class C2886rq extends AbstractC2837nv {
    @Override // com.aspose.slides.internal.p071cz.AbstractC2878qv
    /* JADX INFO: renamed from: du */
    public C2773j5 mo12119du() {
        double dM12330x1 = AbstractC2770ix.m12330x1(AbstractC2770ix.m12323k4(5000.0d, m12332x1().mo12282k4("adj"), 95000.0d), m12498h4().m12521x1().m12484x1(), 100000.0d);
        double dM12330x12 = AbstractC2770ix.m12330x1(m12498h4().m12521x1().m12484x1(), 5.0d, 100.0d);
        double dM12330x13 = AbstractC2770ix.m12330x1(m12498h4().m12521x1().m12484x1(), 45.0d, 100.0d);
        double dM12330x14 = AbstractC2770ix.m12330x1(m12498h4().m12521x1().m12484x1(), 55.0d, 100.0d);
        double dM12325kk = AbstractC2770ix.m12325kk(dM12330x1, 0.0d, dM12330x12);
        double dM12325kk2 = AbstractC2770ix.m12325kk(dM12330x1, dM12330x12, 0.0d);
        double dM12325kk3 = AbstractC2770ix.m12325kk(dM12325kk, dM12325kk, dM12330x13);
        double dM12325kk4 = AbstractC2770ix.m12325kk(dM12325kk2, dM12325kk2, dM12330x14);
        C2773j5 c2773j5 = new C2773j5(m12498h4().m12521x1().m12482k4(), m12498h4().m12521x1().m12484x1(), 0, false, true);
        c2773j5.m12347kk();
        c2773j5.m12351x1(0.0d, 0.0d);
        c2773j5.m12343k4(m12498h4().m12521x1().m12482k4(), 0.0d);
        c2773j5.m12347kk();
        c2773j5.m12351x1(0.0d, dM12330x13);
        c2773j5.m12345k4(new C2865q1(m12498h4().m12521x1().m12482k4() / 2.0d, dM12325kk3), new C2865q1(m12498h4().m12521x1().m12482k4(), dM12330x13));
        c2773j5.m12347kk();
        c2773j5.m12351x1(0.0d, dM12330x14);
        c2773j5.m12345k4(new C2865q1(m12498h4().m12521x1().m12482k4() / 2.0d, dM12325kk4), new C2865q1(m12498h4().m12521x1().m12482k4(), dM12330x14));
        c2773j5.m12347kk();
        c2773j5.m12351x1(0.0d, m12498h4().m12521x1().m12484x1());
        c2773j5.m12343k4(m12498h4().m12521x1().m12482k4(), m12498h4().m12521x1().m12484x1());
        return c2773j5;
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2878qv
    /* JADX INFO: renamed from: k4 */
    public int mo12120k4() {
        return 31;
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2878qv, com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: to */
    public AbstractC2878qv cloneT() {
        C2886rq c2886rq = new C2886rq();
        c2886rq.m12332x1().mo12283k4("adj", m12332x1().mo12282k4("adj"));
        return c2886rq;
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2770ix
    /* JADX INFO: renamed from: k4 */
    public void mo12113k4(AbstractC2770ix.x1 x1Var) {
        x1Var.mo12334x1("adj", 35000.0d);
    }
}
