package com.aspose.slides.internal.p453uz;

import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p231kk.C5796m9;
import com.aspose.slides.internal.p297ne.C6884yj;
import com.aspose.slides.internal.p447up.AbstractC11535k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.uz.dy */
/* JADX INFO: loaded from: classes4.dex */
public class C11575dy extends AbstractC11580k4 {

    /* JADX INFO: renamed from: k4 */
    private C6884yj f39102k4;

    /* JADX INFO: renamed from: x1 */
    private C6884yj f39103x1;

    public C11575dy(AbstractC5788h4 abstractC5788h4) {
        super(abstractC5788h4);
        if (abstractC5788h4.m23417m9() != 2) {
            C11598yd c11598ydM54614k4 = C11598yd.m54614k4((AbstractC11535k4) abstractC5788h4);
            this.f39103x1 = c11598ydM54614k4;
            this.f39102k4 = c11598ydM54614k4;
            return;
        }
        C5796m9 c5796m9 = (C5796m9) abstractC5788h4;
        if (c5796m9.mo23681k4() != 1) {
            this.f39102k4 = C11598yd.m54614k4((AbstractC11535k4) c5796m9.mo23682k4(0));
            this.f39103x1 = C11598yd.m54614k4((AbstractC11535k4) c5796m9.mo23682k4(1));
        } else {
            C11598yd c11598ydM54614k42 = C11598yd.m54614k4((AbstractC11535k4) c5796m9.mo23682k4(0));
            this.f39103x1 = c11598ydM54614k42;
            this.f39102k4 = c11598ydM54614k42;
        }
    }

    /* JADX INFO: renamed from: dy */
    public final C6884yj m54576dy() {
        return this.f39103x1;
    }

    /* JADX INFO: renamed from: m9 */
    public final C6884yj m54577m9() {
        return this.f39102k4;
    }
}
