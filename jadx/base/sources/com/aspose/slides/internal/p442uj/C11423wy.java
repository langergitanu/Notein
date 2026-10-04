package com.aspose.slides.internal.p442uj;

import com.aspose.slides.internal.p019ac.C1338ck;
import com.aspose.slides.internal.p019ac.C1355up;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p183ij.C4979e0;
import com.aspose.slides.internal.p183ij.C5061vw;
import com.aspose.slides.internal.p206jj.C5476c5;
import com.aspose.slides.internal.p206jj.C5487m9;
import com.aspose.slides.internal.p509xs.AbstractC12603k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.uj.wy */
/* JADX INFO: loaded from: classes4.dex */
public class C11423wy extends AbstractC12603k4 {
    @Override // com.aspose.slides.internal.p509xs.AbstractC12603k4
    /* JADX INFO: renamed from: k4 */
    public boolean mo54490k4(C5061vw[] c5061vwArr, AbstractC3150x6 abstractC3150x6) {
        C4979e0 c4979e0 = new C4979e0(c5061vwArr[0]);
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        c4979e0.m20993k4(c3134k4.m13384uz());
        int iM21560lr = c4979e0.m21560lr() - 12;
        long position = abstractC3150x6.getPosition();
        C1338ck c1338ck = iM21560lr <= 320 ? (C1338ck) new C5476c5().m22564k4(c3134k4) : (C1355up) new C5487m9().m22577k4(c3134k4);
        abstractC3150x6.seek(position + ((long) iM21560lr), 0);
        c4979e0.m20994k4(c1338ck);
        c5061vwArr[0] = c4979e0;
        return true;
    }
}
