package com.aspose.slides.internal.p202jd;

import com.aspose.slides.internal.p126fa.AbstractC3905m9;
import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p231kk.C5796m9;
import com.aspose.slides.internal.p231kk.C5813x1;
import com.aspose.slides.internal.p270m9.C6344m9;
import com.aspose.slides.internal.p368qq.InterfaceC9933up;
import com.aspose.slides.internal.p423to.C11068dy;

/* JADX INFO: renamed from: com.aspose.slides.internal.jd.m3 */
/* JADX INFO: loaded from: classes.dex */
public class C5317m3 extends AbstractC3905m9 {

    /* JADX INFO: renamed from: k4 */
    private static final C11068dy<AbstractC5788h4> f14314k4;

    static {
        C11068dy<AbstractC5788h4> c11068dy = new C11068dy<>();
        f14314k4 = c11068dy;
        c11068dy.m53499k4("none", C5813x1.k4.f15898b3);
        c11068dy.m53499k4("underline", C5813x1.k4.f16274op);
        c11068dy.m53499k4("overline", C5813x1.k4.f16245nm);
        c11068dy.m53499k4("line-through", C5813x1.k4.f16529xq);
        c11068dy.m53499k4("blink", C5813x1.k4.f16024fu);
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3905m9
    /* JADX INFO: renamed from: du */
    public C11068dy<AbstractC5788h4> mo15596du() {
        return f14314k4;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3905m9, com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public AbstractC5788h4 mo15578k4(InterfaceC9933up interfaceC9933up, C6344m9 c6344m9) {
        C5796m9 c5796m9 = new C5796m9();
        do {
            c5796m9.m23683x1(super.mo15578k4(interfaceC9933up, c6344m9));
            interfaceC9933up = interfaceC9933up.mo48851kk();
        } while (interfaceC9933up != null);
        return c5796m9;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: kk */
    public boolean mo15584kk() {
        return false;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: to */
    public AbstractC5788h4 mo15585to() {
        return new C5796m9(C5813x1.k4.f15898b3);
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: x1 */
    public int mo15586x1() {
        return 246;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public String mo15583k4() {
        return "text-decoration-line";
    }
}
