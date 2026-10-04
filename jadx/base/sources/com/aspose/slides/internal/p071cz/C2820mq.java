package com.aspose.slides.internal.p071cz;

import com.aspose.slides.internal.p071cz.AbstractC2770ix;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.mq */
/* JADX INFO: loaded from: classes3.dex */
public class C2820mq extends AbstractC2665b2 {
    public C2820mq(C2891s1 c2891s1) {
        super(c2891s1);
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2665b2
    /* JADX INFO: renamed from: k4 */
    public C2695dc mo12112k4() {
        double dM12330x1 = AbstractC2770ix.m12330x1(m12213h4().m12521x1().m12482k4() / 2.0d, m12332x1().mo12282k4("hf"), 100000.0d);
        double dM12330x12 = AbstractC2770ix.m12330x1(m12213h4().m12521x1().m12484x1() / 2.0d, m12332x1().mo12282k4("vf"), 100000.0d);
        double dM12330x13 = AbstractC2770ix.m12330x1(m12213h4().m12521x1().m12484x1() / 2.0d, m12332x1().mo12282k4("vf"), 100000.0d);
        double dM12329x1 = AbstractC2770ix.m12329x1(dM12330x1, 1080000.0d);
        double dM12329x12 = AbstractC2770ix.m12329x1(dM12330x1, 1.836E7d);
        double dM12324kk = AbstractC2770ix.m12324kk(dM12330x12, 1080000.0d);
        double dM12324kk2 = AbstractC2770ix.m12324kk(dM12330x12, 1.836E7d);
        double dM12325kk = AbstractC2770ix.m12325kk(m12213h4().m12521x1().m12482k4() / 2.0d, 0.0d, dM12329x1);
        double dM12325kk2 = AbstractC2770ix.m12325kk(m12213h4().m12521x1().m12482k4() / 2.0d, 0.0d, dM12329x12);
        double dM12325kk3 = AbstractC2770ix.m12325kk(m12213h4().m12521x1().m12482k4() / 2.0d, dM12329x12, 0.0d);
        double dM12325kk4 = AbstractC2770ix.m12325kk(m12213h4().m12521x1().m12482k4() / 2.0d, dM12329x1, 0.0d);
        double dM12325kk5 = AbstractC2770ix.m12325kk(dM12330x13, 0.0d, dM12324kk);
        double dM12325kk6 = AbstractC2770ix.m12325kk(dM12330x13, 0.0d, dM12324kk2);
        double dM12330x14 = AbstractC2770ix.m12330x1(dM12325kk5, dM12329x12, dM12329x1);
        C2695dc c2695dc = new C2695dc(m12213h4());
        c2695dc.m12194k4(m12213h4().m12521x1().m12482k4(), m12213h4().m12521x1().m12484x1(), 0, false, true);
        c2695dc.m12190du(dM12325kk, dM12325kk5);
        c2695dc.m12191h4(m12213h4().m12521x1().m12482k4() / 2.0d, 0.0d);
        c2695dc.m12191h4(dM12325kk4, dM12325kk5);
        c2695dc.m12191h4(dM12325kk3, dM12325kk6);
        c2695dc.m12191h4(dM12325kk2, dM12325kk6);
        c2695dc.m12189du();
        c2695dc.m12197k4(new C2910tl(dM12325kk2, dM12330x14, dM12325kk3, dM12325kk6));
        return c2695dc;
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2770ix
    /* JADX INFO: renamed from: k4 */
    public void mo12113k4(AbstractC2770ix.x1 x1Var) {
        x1Var.mo12334x1("hf", 105146.0d);
        x1Var.mo12334x1("vf", 110557.0d);
    }
}
