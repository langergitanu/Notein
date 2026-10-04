package com.aspose.slides.internal.p202jd;

import com.aspose.slides.internal.p126fa.AbstractC3901jd;
import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p231kk.AbstractC5803to;
import com.aspose.slides.internal.p231kk.C5813x1;
import com.aspose.slides.internal.p231kk.InterfaceC5808uz;
import com.aspose.slides.internal.p270m9.C6344m9;
import com.aspose.slides.internal.p368qq.C9919h4;
import com.aspose.slides.internal.p368qq.InterfaceC9933up;
import com.aspose.slides.internal.p423to.C11068dy;
import com.aspose.slides.internal.p447up.C11539rv;

/* JADX INFO: renamed from: com.aspose.slides.internal.jd.ze */
/* JADX INFO: loaded from: classes.dex */
public class C5438ze extends AbstractC3901jd {

    /* JADX INFO: renamed from: k4 */
    private static final C11068dy<AbstractC5788h4> f14403k4;

    static {
        C11068dy<AbstractC5788h4> c11068dy = new C11068dy<>();
        f14403k4 = c11068dy;
        c11068dy.m53499k4("thin", C5813x1.k4.f16276os);
        c11068dy.m53499k4("medium", C5813x1.k4.f15990em);
        c11068dy.m53499k4("thick", C5813x1.k4.f16581zj);
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3901jd
    /* JADX INFO: renamed from: du */
    public C11068dy<AbstractC5788h4> mo15588du() {
        return f14403k4;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public AbstractC5788h4 mo15597k4(InterfaceC5808uz interfaceC5808uz, C6344m9 c6344m9, String str, C11539rv c11539rv, AbstractC5788h4 abstractC5788h4, int i) {
        AbstractC5788h4 abstractC5788h4M25991k4 = c6344m9.m25991k4(interfaceC5808uz, str, c6344m9.m26003to(191));
        return (C5813x1.k4.f15898b3 == abstractC5788h4M25991k4 || C5813x1.k4.f16130jm == abstractC5788h4M25991k4) ? C5813x1.k4.f16507x1 : super.mo15597k4(interfaceC5808uz, c6344m9, str, c11539rv, abstractC5788h4, i);
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
        return 192;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3901jd, com.aspose.slides.internal.p126fa.AbstractC3894c5, com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public AbstractC5788h4 mo15578k4(InterfaceC9933up interfaceC9933up, C6344m9 c6344m9) {
        AbstractC5788h4 abstractC5788h4Mo15578k4 = super.mo15578k4(interfaceC9933up, c6344m9);
        if (abstractC5788h4Mo15578k4.m23417m9() == 1) {
            AbstractC5803to abstractC5803to = (AbstractC5803to) abstractC5788h4Mo15578k4;
            if (abstractC5803to.m23700k4() != 21 && abstractC5803to.mo23699k4((short) 1) < 0.0f) {
                throw C9919h4.m48829kk(abstractC5788h4Mo15578k4.mo23414h4());
            }
        }
        return abstractC5788h4Mo15578k4;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public String mo15583k4() {
        return "outline-width";
    }
}
