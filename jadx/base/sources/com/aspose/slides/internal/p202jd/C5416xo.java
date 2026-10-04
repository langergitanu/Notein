package com.aspose.slides.internal.p202jd;

import com.aspose.slides.internal.p126fa.AbstractC3905m9;
import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p231kk.C5813x1;
import com.aspose.slides.internal.p270m9.C6344m9;
import com.aspose.slides.internal.p368qq.InterfaceC9933up;
import com.aspose.slides.internal.p423to.C11068dy;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: renamed from: com.aspose.slides.internal.jd.xo */
/* JADX INFO: loaded from: classes.dex */
public class C5416xo extends AbstractC3905m9 {

    /* JADX INFO: renamed from: k4 */
    private static final C11068dy<AbstractC5788h4> f14387k4;

    static {
        C11068dy<AbstractC5788h4> c11068dy = new C11068dy<>();
        f14387k4 = c11068dy;
        c11068dy.m53499k4("normal", C5813x1.k4.f16504wy);
        c11068dy.m53499k4("pre", C5813x1.k4.f16062h9);
        c11068dy.m53499k4("nowrap", C5813x1.k4.f16163kn);
        c11068dy.m53499k4("pre-wrap", C5813x1.k4.f16054gz);
        c11068dy.m53499k4("pre-line", C5813x1.k4.f16013fh);
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3905m9
    /* JADX INFO: renamed from: du */
    public C11068dy<AbstractC5788h4> mo15596du() {
        return f14387k4;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3905m9, com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public AbstractC5788h4 mo15578k4(InterfaceC9933up interfaceC9933up, C6344m9 c6344m9) {
        AbstractC5788h4 abstractC5788h4Mo15578k4 = super.mo15578k4(interfaceC9933up, c6344m9);
        return abstractC5788h4Mo15578k4 == C5813x1.k4.f16040gf ? mo15585to() : abstractC5788h4Mo15578k4;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: kk */
    public boolean mo15584kk() {
        return true;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: to */
    public AbstractC5788h4 mo15585to() {
        return C5813x1.k4.f16504wy;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: x1 */
    public int mo15586x1() {
        return StyleIdentifier.GRID_TABLE_4_ACCENT_1;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public String mo15583k4() {
        return "white-space";
    }
}
