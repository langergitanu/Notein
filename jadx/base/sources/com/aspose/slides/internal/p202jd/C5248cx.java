package com.aspose.slides.internal.p202jd;

import com.aspose.slides.internal.p126fa.AbstractC3905m9;
import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p231kk.C5813x1;
import com.aspose.slides.internal.p423to.C11068dy;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: renamed from: com.aspose.slides.internal.jd.cx */
/* JADX INFO: loaded from: classes.dex */
public class C5248cx extends AbstractC3905m9 {

    /* JADX INFO: renamed from: k4 */
    private static final C11068dy<AbstractC5788h4> f14263k4;

    static {
        C11068dy<AbstractC5788h4> c11068dy = new C11068dy<>();
        f14263k4 = c11068dy;
        c11068dy.m53499k4("horizontal-tb", C5813x1.k4.f16489wg);
        c11068dy.m53499k4("vertical-rl", C5813x1.k4.f15980eb);
        c11068dy.m53499k4("vertical-lr", C5813x1.k4.f16089i9);
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3905m9
    /* JADX INFO: renamed from: du */
    public C11068dy<AbstractC5788h4> mo15596du() {
        return f14263k4;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public String mo15583k4() {
        return "writing-mode";
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: kk */
    public boolean mo15584kk() {
        return true;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: to */
    public AbstractC5788h4 mo15585to() {
        return C5813x1.k4.f16489wg;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: x1 */
    public int mo15586x1() {
        return StyleIdentifier.GRID_TABLE_2_ACCENT_2;
    }
}
