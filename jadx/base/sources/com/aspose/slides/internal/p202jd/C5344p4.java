package com.aspose.slides.internal.p202jd;

import com.aspose.slides.internal.p126fa.AbstractC3901jd;
import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p231kk.C5813x1;
import com.aspose.slides.internal.p423to.C11068dy;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: renamed from: com.aspose.slides.internal.jd.p4 */
/* JADX INFO: loaded from: classes.dex */
public class C5344p4 extends AbstractC3901jd {

    /* JADX INFO: renamed from: k4 */
    private static final C11068dy<AbstractC5788h4> f14336k4;

    static {
        C11068dy<AbstractC5788h4> c11068dy = new C11068dy<>();
        f14336k4 = c11068dy;
        c11068dy.m53499k4("left", C5813x1.k4.f16523xk);
        c11068dy.m53499k4("center", C5813x1.k4.f16416ts);
        c11068dy.m53499k4("right", C5813x1.k4.f15918bz);
        c11068dy.m53499k4("leftwards", C5813x1.k4.f16497wp);
        c11068dy.m53499k4("rightwards", C5813x1.k4.f16389ss);
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3901jd
    /* JADX INFO: renamed from: du */
    public C11068dy<AbstractC5788h4> mo15588du() {
        return f14336k4;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public String mo15583k4() {
        return "voice-balance";
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: kk */
    public boolean mo15584kk() {
        return true;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: to */
    public AbstractC5788h4 mo15585to() {
        return C5813x1.k4.f16416ts;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: x1 */
    public int mo15586x1() {
        return StyleIdentifier.GRID_TABLE_2;
    }
}
