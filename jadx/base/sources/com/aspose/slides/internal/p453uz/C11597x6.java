package com.aspose.slides.internal.p453uz;

import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p231kk.C5813x1;
import com.aspose.slides.internal.p297ne.C6884yj;
import com.aspose.slides.internal.p447up.AbstractC11535k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.uz.x6 */
/* JADX INFO: loaded from: classes4.dex */
public class C11597x6 extends AbstractC11580k4 {

    /* JADX INFO: renamed from: k4 */
    private C6884yj f39148k4;

    /* JADX INFO: renamed from: kk */
    private boolean f39149kk;

    /* JADX INFO: renamed from: x1 */
    private boolean f39150x1;

    public C11597x6(AbstractC5788h4 abstractC5788h4) {
        C6884yj c6884yjM54614k4;
        super(abstractC5788h4);
        if (!m54592x1()) {
            c6884yjM54614k4 = C11598yd.m54614k4((AbstractC11535k4) abstractC5788h4);
        } else {
            if (C5813x1.k4.f16557yo == abstractC5788h4) {
                this.f39150x1 = true;
                return;
            }
            if (C5813x1.k4.f16235na == abstractC5788h4) {
                this.f39149kk = true;
                return;
            } else if (C5813x1.k4.f16094ig == abstractC5788h4) {
                c6884yjM54614k4 = new C6884yj(-90.0f, 10);
            } else if (C5813x1.k4.f16043gk == abstractC5788h4) {
                c6884yjM54614k4 = new C6884yj(0.0f, 10);
            } else if (C5813x1.k4.f16511x5 != abstractC5788h4) {
                return;
            } else {
                c6884yjM54614k4 = new C6884yj(90.0f, 10);
            }
        }
        this.f39148k4 = c6884yjM54614k4;
    }
}
