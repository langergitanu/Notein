package com.aspose.slides.internal.p202jd;

import com.aspose.slides.internal.p126fa.AbstractC3911x1;
import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p231kk.C5813x1;
import com.aspose.slides.internal.p423to.C11068dy;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: renamed from: com.aspose.slides.internal.jd.yw */
/* JADX INFO: loaded from: classes.dex */
public class C5430yw extends AbstractC3911x1 {

    /* JADX INFO: renamed from: k4 */
    private static final C11068dy<AbstractC5788h4> f14398k4;

    static {
        C11068dy<AbstractC5788h4> c11068dy = new C11068dy<>();
        f14398k4 = c11068dy;
        c11068dy.m53499k4("below", C5813x1.k4.f16094ig);
        c11068dy.m53499k4(FirebaseAnalytics.Param.LEVEL, C5813x1.k4.f16043gk);
        c11068dy.m53499k4("above", C5813x1.k4.f16511x5);
        c11068dy.m53499k4("higher", C5813x1.k4.f16557yo);
        c11068dy.m53499k4("lower", C5813x1.k4.f16235na);
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3911x1
    /* JADX INFO: renamed from: du */
    public C11068dy<AbstractC5788h4> mo15607du() {
        return f14398k4;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public String mo15583k4() {
        return "elevation";
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: kk */
    public boolean mo15584kk() {
        return true;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: to */
    public AbstractC5788h4 mo15585to() {
        return C5813x1.k4.f16043gk;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: x1 */
    public int mo15586x1() {
        return 100;
    }
}
