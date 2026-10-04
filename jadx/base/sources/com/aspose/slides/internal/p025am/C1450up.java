package com.aspose.slides.internal.p025am;

import com.aspose.slides.internal.p049bx.C1879h4;
import com.aspose.slides.internal.p049bx.C1882k4;
import com.aspose.slides.internal.p059c9.AbstractC1992x1;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p132fj.C4047sv;
import com.aspose.slides.internal.p132fj.C4071yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p488x0.C12331c5;
import com.aspose.slides.internal.p488x0.C12352x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.am.up */
/* JADX INFO: loaded from: classes3.dex */
public class C1450up extends AbstractC1992x1 {
    @Override // com.aspose.slides.internal.p059c9.AbstractC1992x1
    /* JADX INFO: renamed from: x1 */
    public boolean mo8293x1(C4047sv c4047sv, AbstractC3150x6 abstractC3150x6) {
        C4071yj c4071yj = (C4071yj) c4047sv;
        C3149x1 c3149x1 = new C3149x1(abstractC3150x6);
        c3149x1.m13446k4(c4071yj.m16221k4() & 65535);
        c3149x1.m13446k4(c4071yj.m16225x1() & 65535);
        if (C7019kk.m27469x1(c4071yj.m16224kk(), C12352x1.class)) {
            new C1882k4().m9802k4(c3149x1, c4071yj.m16224kk());
            return true;
        }
        new C1879h4().m9797k4(c3149x1, (C12331c5) c4071yj.m16224kk());
        return true;
    }
}
