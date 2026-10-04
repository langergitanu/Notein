package com.aspose.slides.internal.p025am;

import com.aspose.slides.internal.p059c9.AbstractC1992x1;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p132fj.C4043ri;
import com.aspose.slides.internal.p132fj.C4047sv;

/* JADX INFO: renamed from: com.aspose.slides.internal.am.zj */
/* JADX INFO: loaded from: classes3.dex */
public class C1467zj extends AbstractC1992x1 {
    @Override // com.aspose.slides.internal.p059c9.AbstractC1992x1
    /* JADX INFO: renamed from: x1 */
    public boolean mo8293x1(C4047sv c4047sv, AbstractC3150x6 abstractC3150x6) {
        C4043ri c4043ri = (C4043ri) c4047sv;
        C3149x1 c3149x1 = new C3149x1(abstractC3150x6);
        c3149x1.m13446k4(c4043ri.m16047k4() & 65535);
        if ((c4043ri.m16068yj() & 4294967295L) <= 4) {
            return true;
        }
        c3149x1.m13448k4(c4043ri.m16050x1());
        return true;
    }
}
