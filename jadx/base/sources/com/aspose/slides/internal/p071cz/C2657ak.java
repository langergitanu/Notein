package com.aspose.slides.internal.p071cz;

import com.aspose.slides.internal.p071cz.AbstractC2770ix;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.ak */
/* JADX INFO: loaded from: classes3.dex */
public class C2657ak extends AbstractC2665b2 {
    public C2657ak(C2891s1 c2891s1) {
        super(c2891s1);
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2665b2
    /* JADX INFO: renamed from: k4 */
    public C2695dc mo12112k4() {
        double dM12330x1 = AbstractC2770ix.m12330x1(m12213h4().m12521x1().m12482k4(), m12332x1().mo12282k4("adj1"), 100000.0d);
        double dM12330x12 = AbstractC2770ix.m12330x1(m12213h4().m12521x1().m12482k4(), m12332x1().mo12282k4("adj3"), 100000.0d);
        AbstractC2770ix.m12328to(dM12330x1, dM12330x12, 2.0d);
        double dM12330x13 = AbstractC2770ix.m12330x1(m12213h4().m12521x1().m12484x1(), m12332x1().mo12282k4("adj2"), 100000.0d);
        AbstractC2770ix.m12328to(0.0d, dM12330x13, 2.0d);
        AbstractC2770ix.m12328to(m12213h4().m12521x1().m12484x1(), dM12330x13, 2.0d);
        C2695dc c2695dc = new C2695dc(m12213h4());
        c2695dc.m12194k4(m12213h4().m12521x1().m12482k4(), m12213h4().m12521x1().m12484x1(), 5, false, true);
        c2695dc.m12190du(0.0d, 0.0d);
        c2695dc.m12191h4(dM12330x1, 0.0d);
        c2695dc.m12191h4(dM12330x1, dM12330x13);
        c2695dc.m12191h4(dM12330x12, dM12330x13);
        c2695dc.m12191h4(dM12330x12, m12213h4().m12521x1().m12484x1());
        c2695dc.m12191h4(m12213h4().m12521x1().m12482k4(), m12213h4().m12521x1().m12484x1());
        c2695dc.m12197k4(new C2910tl(0.0d, 0.0d, m12213h4().m12521x1().m12482k4(), m12213h4().m12521x1().m12484x1()));
        return c2695dc;
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2770ix
    /* JADX INFO: renamed from: k4 */
    public void mo12113k4(AbstractC2770ix.x1 x1Var) {
        x1Var.mo12334x1("adj1", 50000.0d);
        x1Var.mo12334x1("adj2", 50000.0d);
        x1Var.mo12334x1("adj3", 50000.0d);
    }
}
