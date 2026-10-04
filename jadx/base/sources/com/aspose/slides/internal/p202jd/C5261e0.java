package com.aspose.slides.internal.p202jd;

import com.aspose.slides.internal.p126fa.AbstractC3901jd;
import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p231kk.C5813x1;
import com.aspose.slides.internal.p231kk.InterfaceC5808uz;
import com.aspose.slides.internal.p270m9.C6344m9;
import com.aspose.slides.internal.p423to.C11068dy;
import com.aspose.slides.internal.p447up.C11539rv;

/* JADX INFO: renamed from: com.aspose.slides.internal.jd.e0 */
/* JADX INFO: loaded from: classes.dex */
public class C5261e0 extends AbstractC3901jd {

    /* JADX INFO: renamed from: k4 */
    private static final C11068dy<AbstractC5788h4> f14274k4;

    static {
        C11068dy<AbstractC5788h4> c11068dy = new C11068dy<>();
        f14274k4 = c11068dy;
        c11068dy.m53499k4("thin", C5813x1.k4.f16276os);
        c11068dy.m53499k4("medium", C5813x1.k4.f15990em);
        c11068dy.m53499k4("thick", C5813x1.k4.f16581zj);
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3901jd
    /* JADX INFO: renamed from: du */
    public C11068dy<AbstractC5788h4> mo15588du() {
        return f14274k4;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public AbstractC5788h4 mo15597k4(InterfaceC5808uz interfaceC5808uz, C6344m9 c6344m9, String str, C11539rv c11539rv, AbstractC5788h4 abstractC5788h4, int i) {
        AbstractC5788h4 abstractC5788h4M25991k4 = c6344m9.m25991k4(interfaceC5808uz, str, c6344m9.m26003to(54));
        return (C5813x1.k4.f15898b3 == abstractC5788h4M25991k4 || C5813x1.k4.f16130jm == abstractC5788h4M25991k4) ? C5813x1.k4.f16507x1 : abstractC5788h4 == C5813x1.k4.f16040gf ? C5813x1.k4.f15990em : super.mo15597k4(interfaceC5808uz, c6344m9, str, c11539rv, abstractC5788h4, i);
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
        return 55;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public String mo15583k4() {
        return "border-right-width";
    }
}
