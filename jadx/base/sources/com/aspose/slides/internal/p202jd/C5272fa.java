package com.aspose.slides.internal.p202jd;

import com.aspose.slides.internal.p126fa.AbstractC3901jd;
import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p231kk.C5796m9;
import com.aspose.slides.internal.p231kk.C5813x1;
import com.aspose.slides.internal.p270m9.C6344m9;
import com.aspose.slides.internal.p368qq.InterfaceC9933up;
import com.aspose.slides.internal.p423to.C11068dy;

/* JADX INFO: renamed from: com.aspose.slides.internal.jd.fa */
/* JADX INFO: loaded from: classes.dex */
public class C5272fa extends AbstractC3901jd {

    /* JADX INFO: renamed from: k4 */
    private static final C11068dy<AbstractC5788h4> f14284k4;

    static {
        C11068dy<AbstractC5788h4> c11068dy = new C11068dy<>();
        f14284k4 = c11068dy;
        c11068dy.m53499k4("cover", C5813x1.k4.f16165kp);
        c11068dy.m53499k4("contain", C5813x1.k4.f16041gi);
        c11068dy.m53499k4("auto", C5813x1.k4.f16548yd);
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3901jd
    /* JADX INFO: renamed from: du */
    public C11068dy<AbstractC5788h4> mo15588du() {
        return f14284k4;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3901jd, com.aspose.slides.internal.p126fa.AbstractC3894c5, com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public AbstractC5788h4 mo15578k4(InterfaceC9933up interfaceC9933up, C6344m9 c6344m9) {
        C5796m9 c5796m9 = new C5796m9();
        while (interfaceC9933up != null) {
            AbstractC5788h4 abstractC5788h4Mo15578k4 = super.mo15578k4(interfaceC9933up, c6344m9);
            if (C5813x1.k4.f16165kp == abstractC5788h4Mo15578k4 || C5813x1.k4.f16041gi == abstractC5788h4Mo15578k4) {
                return abstractC5788h4Mo15578k4;
            }
            c5796m9.m23683x1(abstractC5788h4Mo15578k4);
            interfaceC9933up = interfaceC9933up.mo48851kk();
        }
        return c5796m9;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: kk */
    public boolean mo15584kk() {
        return true;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: to */
    public AbstractC5788h4 mo15585to() {
        return new C5796m9(C5813x1.k4.f16548yd);
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: x1 */
    public int mo15586x1() {
        return 25;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public String mo15583k4() {
        return "background-size";
    }
}
