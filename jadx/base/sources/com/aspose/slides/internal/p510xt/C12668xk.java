package com.aspose.slides.internal.p510xt;

import com.aspose.slides.internal.p123f5.C3856h4;
import com.aspose.slides.internal.p123f5.C3857k4;
import com.aspose.slides.internal.p132fj.C4013e0;
import com.aspose.slides.internal.p132fj.C4047sv;
import com.aspose.slides.internal.p276ml.AbstractC6397x1;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12023wl;

/* JADX INFO: renamed from: com.aspose.slides.internal.xt.xk */
/* JADX INFO: loaded from: classes5.dex */
public class C12668xk extends AbstractC6397x1 {
    @Override // com.aspose.slides.internal.p276ml.AbstractC6397x1
    /* JADX INFO: renamed from: k4 */
    public C3857k4 mo26252k4(C4047sv c4047sv, AbstractC12008jd abstractC12008jd, C3856h4 c3856h4) {
        C4013e0 c4013e0 = (C4013e0) c4047sv;
        if (c4013e0.m15887kk().length <= 0) {
            return C3857k4.m15543kk();
        }
        C12014ne c12014ne = new C12014ne(c4013e0.m15887kk()[0].m57707to().Clone(), new C12023wl());
        for (int i = 0; i < c4013e0.m15887kk().length; i++) {
            C12014ne.m56662x1(c12014ne.Clone(), new C12014ne(c4013e0.m15887kk()[i].m57707to().Clone(), new C12023wl())).CloneTo(c12014ne);
        }
        return new C3857k4(c12014ne.Clone());
    }
}
