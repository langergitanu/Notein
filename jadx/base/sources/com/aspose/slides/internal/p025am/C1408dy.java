package com.aspose.slides.internal.p025am;

import com.aspose.slides.internal.p049bx.C1882k4;
import com.aspose.slides.internal.p059c9.AbstractC1992x1;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p132fj.C4006c5;
import com.aspose.slides.internal.p132fj.C4047sv;

/* JADX INFO: renamed from: com.aspose.slides.internal.am.dy */
/* JADX INFO: loaded from: classes3.dex */
public class C1408dy extends AbstractC1992x1 {
    @Override // com.aspose.slides.internal.p059c9.AbstractC1992x1
    /* JADX INFO: renamed from: x1 */
    public boolean mo8293x1(C4047sv c4047sv, AbstractC3150x6 abstractC3150x6) {
        C4006c5 c4006c5 = (C4006c5) c4047sv;
        C3149x1 c3149x1 = new C3149x1(abstractC3150x6);
        new C1882k4().m9801k4(c3149x1, c4006c5.m15839k4());
        if (c4006c5.m15844x1() == null || c4006c5.m15844x1().length != 18) {
            c3149x1.m13450k4(new byte[18]);
        } else {
            c3149x1.m13450k4(c4006c5.m15844x1());
        }
        c3149x1.m13450k4(c4006c5.m15842kk());
        return true;
    }
}
