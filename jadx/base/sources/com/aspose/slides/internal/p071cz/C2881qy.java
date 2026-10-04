package com.aspose.slides.internal.p071cz;

import com.aspose.slides.internal.p071cz.AbstractC2770ix;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.qy */
/* JADX INFO: loaded from: classes3.dex */
public class C2881qy extends AbstractC2665b2 {
    public C2881qy(C2891s1 c2891s1) {
        super(c2891s1);
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2665b2
    /* JADX INFO: renamed from: k4 */
    public C2695dc mo12112k4() {
        double dM12330x1 = AbstractC2770ix.m12330x1(50000.0d, m12213h4().m12521x1().m12482k4(), C14116yg.m67491kk(m12213h4().m12521x1().m12484x1(), m12213h4().m12521x1().m12482k4()));
        double dM12323k4 = AbstractC2770ix.m12323k4(0.0d, m12332x1().mo12282k4("adj"), dM12330x1);
        double dM12330x12 = AbstractC2770ix.m12330x1(C14116yg.m67491kk(m12213h4().m12521x1().m12484x1(), m12213h4().m12521x1().m12482k4()), dM12323k4, 200000.0d);
        double dM12330x13 = AbstractC2770ix.m12330x1(C14116yg.m67491kk(m12213h4().m12521x1().m12484x1(), m12213h4().m12521x1().m12482k4()), dM12323k4, 100000.0d);
        double dM12325kk = AbstractC2770ix.m12325kk(m12213h4().m12521x1().m12482k4(), 0.0d, dM12330x13);
        AbstractC2770ix.m12325kk(m12213h4().m12521x1().m12482k4(), 0.0d, dM12330x12);
        double dM12330x14 = AbstractC2770ix.m12330x1(m12213h4().m12521x1().m12482k4() / 3.0d, dM12323k4, dM12330x1);
        double dM12330x15 = AbstractC2770ix.m12330x1(m12213h4().m12521x1().m12484x1() / 3.0d, dM12323k4, dM12330x1);
        double dM12325kk2 = AbstractC2770ix.m12325kk(m12213h4().m12521x1().m12482k4(), 0.0d, dM12330x14);
        C2695dc c2695dc = new C2695dc(m12213h4());
        c2695dc.m12194k4(m12213h4().m12521x1().m12482k4(), m12213h4().m12521x1().m12484x1(), 0, false, true);
        c2695dc.m12190du(0.0d, m12213h4().m12521x1().m12484x1());
        c2695dc.m12191h4(dM12330x13, 0.0d);
        c2695dc.m12191h4(dM12325kk, 0.0d);
        c2695dc.m12191h4(m12213h4().m12521x1().m12482k4(), m12213h4().m12521x1().m12484x1());
        c2695dc.m12189du();
        c2695dc.m12197k4(new C2910tl(dM12330x14, dM12330x15, dM12325kk2, m12213h4().m12521x1().m12484x1()));
        return c2695dc;
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2665b2
    /* JADX INFO: renamed from: k4 */
    public C2867q6 mo12133k4(float f, float f2) {
        double d = f;
        double dM12330x1 = AbstractC2770ix.m12330x1(50000.0d, d, C14116yg.m67504x1(f2, f));
        double dM12323k4 = AbstractC2770ix.m12323k4(0.0d, m12332x1().mo12282k4("adj"), dM12330x1);
        return new C2867q6((AbstractC2770ix.m12330x1(f / 3.0f, dM12323k4, dM12330x1) * 2.0d) + d, ((double) f2) + AbstractC2770ix.m12330x1(f2 / 3.0f, dM12323k4, dM12330x1));
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2770ix
    /* JADX INFO: renamed from: k4 */
    public void mo12113k4(AbstractC2770ix.x1 x1Var) {
        x1Var.mo12334x1("adj", 25000.0d);
    }
}
