package com.aspose.slides.internal.p071cz;

import androidx.core.graphics.OooO00o;
import com.aspose.slides.internal.p071cz.AbstractC2770ix;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.dl */
/* JADX INFO: loaded from: classes3.dex */
public class C2700dl extends AbstractC2665b2 {
    public C2700dl(C2891s1 c2891s1) {
        super(c2891s1);
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2665b2
    /* JADX INFO: renamed from: k4 */
    public C2695dc mo12112k4() {
        double dM12329x1 = AbstractC2770ix.m12329x1(m12213h4().m12521x1().m12482k4() / 2.0d, 2700000.0d);
        double dM12324kk = AbstractC2770ix.m12324kk(m12213h4().m12521x1().m12484x1() / 2.0d, 2700000.0d);
        double dM12325kk = AbstractC2770ix.m12325kk(m12213h4().m12521x1().m12482k4() / 2.0d, 0.0d, dM12329x1);
        double dM12325kk2 = AbstractC2770ix.m12325kk(m12213h4().m12521x1().m12482k4() / 2.0d, dM12329x1, 0.0d);
        double dM12325kk3 = AbstractC2770ix.m12325kk(m12213h4().m12521x1().m12484x1() / 2.0d, 0.0d, dM12324kk);
        double dM12325kk4 = AbstractC2770ix.m12325kk(m12213h4().m12521x1().m12484x1() / 2.0d, dM12324kk, 0.0d);
        C2695dc c2695dc = new C2695dc(m12213h4());
        c2695dc.m12194k4(m12213h4().m12521x1().m12482k4(), m12213h4().m12521x1().m12484x1(), 0, false, true);
        c2695dc.m12190du(0.0d, m12213h4().m12521x1().m12484x1() / 2.0d);
        c2695dc.m12193k4(m12213h4().m12521x1().m12484x1() / 2.0d, m12213h4().m12521x1().m12482k4() / 2.0d, 1.08E7d, 5400000.0d);
        c2695dc.m12193k4(m12213h4().m12521x1().m12484x1() / 2.0d, m12213h4().m12521x1().m12482k4() / 2.0d, 1.62E7d, 5400000.0d);
        c2695dc.m12193k4(m12213h4().m12521x1().m12484x1() / 2.0d, m12213h4().m12521x1().m12482k4() / 2.0d, 0.0d, 5400000.0d);
        c2695dc.m12193k4(m12213h4().m12521x1().m12484x1() / 2.0d, m12213h4().m12521x1().m12482k4() / 2.0d, 5400000.0d, 5400000.0d);
        c2695dc.m12189du();
        c2695dc.m12197k4(new C2910tl(dM12325kk, dM12325kk3, dM12325kk2, dM12325kk4));
        return c2695dc;
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2665b2
    /* JADX INFO: renamed from: k4 */
    public C2867q6 mo12133k4(float f, float f2) {
        double d = f / 2.0f;
        double d2 = f2 / 2.0f;
        return new C2867q6(OooO00o.OooO00o(AbstractC2770ix.m12325kk(d, 0.0d, AbstractC2770ix.m12329x1(d, 2700000.0d)), 2.0d, f, 1.100000023841858d), OooO00o.OooO00o(AbstractC2770ix.m12325kk(d2, 0.0d, AbstractC2770ix.m12324kk(d2, 2700000.0d)), 2.0d, f2, 1.100000023841858d));
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2770ix
    /* JADX INFO: renamed from: k4 */
    public void mo12113k4(AbstractC2770ix.x1 x1Var) {
    }
}
