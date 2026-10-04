package com.aspose.slides.internal.p202jd;

import com.aspose.slides.internal.p126fa.AbstractC3905m9;
import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p231kk.C5813x1;
import com.aspose.slides.internal.p423to.C11068dy;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: renamed from: com.aspose.slides.internal.jd.j6 */
/* JADX INFO: loaded from: classes.dex */
public class C5297j6 extends AbstractC3905m9 {

    /* JADX INFO: renamed from: k4 */
    private static final C11068dy<AbstractC5788h4> f14299k4;

    static {
        C11068dy<AbstractC5788h4> c11068dy = new C11068dy<>();
        f14299k4 = c11068dy;
        c11068dy.m53499k4("normal", C5813x1.k4.f16504wy);
        c11068dy.m53499k4("keep-all", C5813x1.k4.f15928c9);
        c11068dy.m53499k4("break-all", C5813x1.k4.f15885am);
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3905m9
    /* JADX INFO: renamed from: du */
    public C11068dy<AbstractC5788h4> mo15596du() {
        return f14299k4;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public String mo15583k4() {
        return "word-break";
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
        return StyleIdentifier.GRID_TABLE_7_COLORFUL_ACCENT_1;
    }
}
