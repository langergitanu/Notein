package com.aspose.slides.internal.p202jd;

import com.aspose.slides.internal.p126fa.AbstractC3901jd;
import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p231kk.AbstractC5803to;
import com.aspose.slides.internal.p231kk.C5813x1;
import com.aspose.slides.internal.p270m9.C6344m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p368qq.C9919h4;
import com.aspose.slides.internal.p368qq.InterfaceC9933up;
import com.aspose.slides.internal.p423to.C11068dy;
import com.aspose.slides.internal.p447up.C11531dy;

/* JADX INFO: renamed from: com.aspose.slides.internal.jd.xl */
/* JADX INFO: loaded from: classes.dex */
public class C5415xl extends AbstractC3901jd {

    /* JADX INFO: renamed from: k4 */
    private static final C11068dy<AbstractC5788h4> f14386k4;

    static {
        C11068dy<AbstractC5788h4> c11068dy = new C11068dy<>();
        f14386k4 = c11068dy;
        c11068dy.m53499k4("x-slow", C5813x1.k4.f15878af);
        c11068dy.m53499k4("slow", C5813x1.k4.f16509x3);
        c11068dy.m53499k4("medium", C5813x1.k4.f15990em);
        c11068dy.m53499k4("fast", C5813x1.k4.f16387sq);
        c11068dy.m53499k4("x-fast", C5813x1.k4.f16428u5);
        c11068dy.m53499k4("faster", C5813x1.k4.f16188lm);
        c11068dy.m53499k4("slower", C5813x1.k4.f15923c4);
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3901jd
    /* JADX INFO: renamed from: du */
    public C11068dy<AbstractC5788h4> mo15588du() {
        return f14386k4;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3901jd, com.aspose.slides.internal.p126fa.AbstractC3894c5, com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public AbstractC5788h4 mo15578k4(InterfaceC9933up interfaceC9933up, C6344m9 c6344m9) {
        AbstractC5788h4 abstractC5788h4Mo15578k4 = super.mo15578k4(interfaceC9933up, c6344m9);
        if (!C7019kk.m27469x1(abstractC5788h4Mo15578k4, C11531dy.class) || ((AbstractC5803to) abstractC5788h4Mo15578k4).m23700k4() == 1) {
            return abstractC5788h4Mo15578k4;
        }
        throw C9919h4.m48827k4(interfaceC9933up.mo48850k4());
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: kk */
    public boolean mo15584kk() {
        return false;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: to */
    public AbstractC5788h4 mo15585to() {
        return C5813x1.k4.f15990em;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: x1 */
    public int mo15586x1() {
        return 235;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public String mo15583k4() {
        return "speech-rate";
    }
}
