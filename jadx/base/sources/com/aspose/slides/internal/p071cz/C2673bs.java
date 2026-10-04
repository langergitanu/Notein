package com.aspose.slides.internal.p071cz;

import com.aspose.slides.internal.p071cz.AbstractC2770ix;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.bs */
/* JADX INFO: loaded from: classes3.dex */
public class C2673bs extends AbstractC2846of {
    @Override // com.aspose.slides.internal.p071cz.AbstractC2878qv
    /* JADX INFO: renamed from: du */
    public C2773j5 mo12119du() {
        double dM12323k4 = AbstractC2770ix.m12323k4(0.0d, m12332x1().mo12282k4("adj1"), 2.1599999E7d);
        double dM12325kk = AbstractC2770ix.m12325kk(dM12323k4, 0.0d, 1.08E7d);
        double dM12325kk2 = AbstractC2770ix.m12325kk(1.08E7d, 0.0d, dM12323k4);
        double dM12330x1 = AbstractC2770ix.m12330x1(AbstractC2770ix.m12319du(dM12325kk, AbstractC2770ix.m12325kk(2.16E7d, 0.0d, dM12323k4), AbstractC2770ix.m12319du(dM12325kk2, dM12325kk2, 1.0799999E7d)), 2.0d, 1.0d);
        double dM12324kk = AbstractC2770ix.m12324kk(m12498h4().m12521x1().m12482k4() / 2.0d, dM12323k4);
        double dM12329x1 = AbstractC2770ix.m12329x1(m12498h4().m12521x1().m12484x1() / 2.0d, dM12323k4);
        double dM12321h4 = AbstractC2770ix.m12321h4(m12498h4().m12521x1().m12482k4() / 2.0d, dM12329x1, dM12324kk);
        double dM12320dy = AbstractC2770ix.m12320dy(m12498h4().m12521x1().m12484x1() / 2.0d, dM12329x1, dM12324kk);
        double dM12325kk3 = AbstractC2770ix.m12325kk(m12498h4().m12521x1().m12482k4() / 2.0d, dM12321h4, 0.0d);
        double dM12325kk4 = AbstractC2770ix.m12325kk(m12498h4().m12521x1().m12484x1() / 2.0d, dM12320dy, 0.0d);
        double dM12330x12 = AbstractC2770ix.m12330x1(AbstractC2770ix.m12323k4(0.0d, m12332x1().mo12282k4("adj2"), 99000.0d), 1.0d, 100000.0d);
        double dM12330x13 = AbstractC2770ix.m12330x1(m12498h4().m12521x1().m12482k4() / 2.0d, dM12330x12, 1.0d);
        double dM12330x14 = AbstractC2770ix.m12330x1(m12498h4().m12521x1().m12484x1() / 2.0d, dM12330x12, 1.0d);
        double dM12324kk2 = AbstractC2770ix.m12324kk(dM12330x13, dM12323k4);
        double dM12329x12 = AbstractC2770ix.m12329x1(dM12330x14, dM12323k4);
        double dM12321h42 = AbstractC2770ix.m12321h4(dM12330x13, dM12329x12, dM12324kk2);
        double dM12320dy2 = AbstractC2770ix.m12320dy(dM12330x14, dM12329x12, dM12324kk2);
        double dM12325kk5 = AbstractC2770ix.m12325kk(m12498h4().m12521x1().m12482k4() / 2.0d, dM12321h42, 0.0d);
        double dM12325kk6 = AbstractC2770ix.m12325kk(m12498h4().m12521x1().m12484x1() / 2.0d, dM12320dy2, 0.0d);
        C2773j5 c2773j5 = new C2773j5(m12498h4().m12521x1().m12482k4(), m12498h4().m12521x1().m12484x1(), 0, false, true);
        c2773j5.m12347kk();
        c2773j5.m12351x1(dM12325kk3, dM12325kk4);
        c2773j5.m12344k4(m12498h4().m12521x1().m12484x1() / 2.0d, m12498h4().m12521x1().m12482k4() / 2.0d, dM12323k4, dM12330x1);
        c2773j5.m12347kk();
        c2773j5.m12351x1(dM12325kk5, dM12325kk6);
        c2773j5.m12344k4(dM12330x14, dM12330x13, dM12323k4, dM12330x1);
        return c2773j5;
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2878qv
    /* JADX INFO: renamed from: k4 */
    public int mo12120k4() {
        return 15;
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2878qv, com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: to */
    public AbstractC2878qv cloneT() {
        C2673bs c2673bs = new C2673bs();
        c2673bs.m12332x1().mo12283k4("adj1", m12332x1().mo12282k4("adj1"));
        c2673bs.m12332x1().mo12283k4("adj2", m12332x1().mo12282k4("adj2"));
        return c2673bs;
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2770ix
    /* JADX INFO: renamed from: k4 */
    public void mo12113k4(AbstractC2770ix.x1 x1Var) {
        x1Var.mo12334x1("adj1", 1.08E7d);
        x1Var.mo12334x1("adj2", 50000.0d);
    }
}
