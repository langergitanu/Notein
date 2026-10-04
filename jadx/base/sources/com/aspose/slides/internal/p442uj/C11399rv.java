package com.aspose.slides.internal.p442uj;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p183ij.C4996ix;
import com.aspose.slides.internal.p183ij.C5061vw;
import com.aspose.slides.internal.p509xs.AbstractC12603k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.uj.rv */
/* JADX INFO: loaded from: classes4.dex */
public class C11399rv extends AbstractC12603k4 {
    @Override // com.aspose.slides.internal.p509xs.AbstractC12603k4
    /* JADX INFO: renamed from: k4 */
    public boolean mo54490k4(C5061vw[] c5061vwArr, AbstractC3150x6 abstractC3150x6) {
        boolean zM54492k4;
        C4996ix c4996ix;
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        C4996ix c4996ix2 = new C4996ix(c5061vwArr[0]);
        c4996ix2.m21112to(c3134k4.m13384uz());
        long jM13384uz = c3134k4.m13384uz();
        c3134k4.m13371ck().seek(-4L, 1);
        int i = (int) jM13384uz;
        if (i == 0) {
            C4996ix[] c4996ixArr = {c4996ix2};
            zM54492k4 = new C11338ck().m54492k4(c4996ixArr, abstractC3150x6);
            c4996ix = c4996ixArr[0];
        } else if (i == 726027589) {
            C4996ix[] c4996ixArr2 = {c4996ix2};
            zM54492k4 = new C11365jd(c4996ixArr2[0].m21555bv().m49082ck()).m54494k4(c4996ixArr2, abstractC3150x6);
            c4996ix = c4996ixArr2[0];
        } else if (i != 1128875079) {
            C4996ix[] c4996ixArr3 = {c4996ix2};
            zM54492k4 = new C11372ks().m54495k4(c4996ixArr3, abstractC3150x6);
            c4996ix = c4996ixArr3[0];
        } else {
            C4996ix[] c4996ixArr4 = {c4996ix2};
            zM54492k4 = new C11437yj().m54498k4(c4996ixArr4, abstractC3150x6);
            c4996ix = c4996ixArr4[0];
        }
        c5061vwArr[0] = c4996ix;
        return zM54492k4;
    }
}
