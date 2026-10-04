package com.aspose.slides.internal.p202jd;

import com.aspose.slides.internal.p126fa.AbstractC3901jd;
import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p231kk.AbstractC5803to;
import com.aspose.slides.internal.p231kk.C5813x1;
import com.aspose.slides.internal.p231kk.InterfaceC5808uz;
import com.aspose.slides.internal.p270m9.C6344m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p368qq.C9919h4;
import com.aspose.slides.internal.p368qq.InterfaceC9933up;
import com.aspose.slides.internal.p423to.C11068dy;
import com.aspose.slides.internal.p447up.AbstractC11535k4;
import com.aspose.slides.internal.p447up.C11531dy;
import com.aspose.slides.internal.p447up.C11532fa;
import com.aspose.slides.internal.p447up.C11539rv;

/* JADX INFO: renamed from: com.aspose.slides.internal.jd.rq */
/* JADX INFO: loaded from: classes.dex */
public class C5362rq extends AbstractC3901jd {

    /* JADX INFO: renamed from: k4 */
    private static final C11068dy<AbstractC5788h4> f14347k4;

    static {
        C11068dy<AbstractC5788h4> c11068dy = new C11068dy<>();
        f14347k4 = c11068dy;
        c11068dy.m53499k4("xx-small", C5813x1.k4.f16505wz);
        c11068dy.m53499k4("x-small", C5813x1.k4.f16425u1);
        c11068dy.m53499k4("small", C5813x1.k4.f16556yn);
        c11068dy.m53499k4("medium", C5813x1.k4.f15990em);
        c11068dy.m53499k4("large", C5813x1.k4.f16549yg);
        c11068dy.m53499k4("x-large", C5813x1.k4.f16224my);
        c11068dy.m53499k4("xx-large", C5813x1.k4.f15896b1);
        c11068dy.m53499k4("xxx-large", C5813x1.k4.f16563yw);
        c11068dy.m53499k4("larger", C5813x1.k4.f16583zm);
        c11068dy.m53499k4("smaller", C5813x1.k4.f16095ii);
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3901jd
    /* JADX INFO: renamed from: du */
    public C11068dy<AbstractC5788h4> mo15588du() {
        return f14347k4;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public AbstractC5788h4 mo15597k4(InterfaceC5808uz interfaceC5808uz, C6344m9 c6344m9, String str, C11539rv c11539rv, AbstractC5788h4 abstractC5788h4, int i) {
        AbstractC5788h4 abstractC5788h4Mo15597k4 = super.mo15597k4(interfaceC5808uz, c6344m9, str, c11539rv, abstractC5788h4, i);
        if (!c11539rv.m54530to(i)) {
            return abstractC5788h4Mo15597k4;
        }
        AbstractC5803to abstractC5803to = (AbstractC5803to) abstractC5788h4Mo15597k4;
        return (abstractC5803to.m23700k4() == 2 || abstractC5803to.m23700k4() == 3) ? C5813x1.k4.f16439um : abstractC5788h4Mo15597k4;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: kk */
    public boolean mo15584kk() {
        return true;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: to */
    public AbstractC5788h4 mo15585to() {
        return C5813x1.k4.f15990em;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: x1 */
    public int mo15586x1() {
        return 116;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3901jd, com.aspose.slides.internal.p126fa.AbstractC3894c5, com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public AbstractC5788h4 mo15578k4(InterfaceC9933up interfaceC9933up, C6344m9 c6344m9) {
        AbstractC5788h4 abstractC5788h4Mo15578k4 = super.mo15578k4(interfaceC9933up, c6344m9);
        if (abstractC5788h4Mo15578k4 == C5813x1.k4.f16040gf) {
            return mo15585to();
        }
        AbstractC11535k4 abstractC11535k4 = (AbstractC11535k4) C7019kk.m27452k4((Object) abstractC5788h4Mo15578k4, AbstractC11535k4.class);
        if (abstractC11535k4 == null || (!(C7019kk.m27469x1(abstractC11535k4, C11532fa.class) || C7019kk.m27469x1(abstractC11535k4, C11531dy.class)) || abstractC11535k4.mo23699k4(abstractC11535k4.m23700k4()) >= 0.0f)) {
            return abstractC5788h4Mo15578k4;
        }
        throw C9919h4.m48829kk(abstractC11535k4.mo23414h4());
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public String mo15583k4() {
        return "font-size";
    }
}
