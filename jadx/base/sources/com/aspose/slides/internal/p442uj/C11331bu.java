package com.aspose.slides.internal.p442uj;

import com.aspose.slides.internal.p019ac.C1347ks;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p183ij.C4970d3;
import com.aspose.slides.internal.p183ij.C5061vw;
import com.aspose.slides.internal.p206jj.C5483jd;
import com.aspose.slides.internal.p509xs.AbstractC12603k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.uj.bu */
/* JADX INFO: loaded from: classes4.dex */
public class C11331bu extends AbstractC12603k4 {
    @Override // com.aspose.slides.internal.p509xs.AbstractC12603k4
    /* JADX INFO: renamed from: k4 */
    public boolean mo54490k4(C5061vw[] c5061vwArr, AbstractC3150x6 abstractC3150x6) {
        C4970d3 c4970d3 = new C4970d3(c5061vwArr[0]);
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        c4970d3.m20900k4(c3134k4.m13384uz());
        c4970d3.m20907x1(c3134k4.m13384uz());
        c4970d3.m20904kk(c3134k4.m13384uz());
        int iM20903kk = (int) c4970d3.m20903kk();
        C1347ks[] c1347ksArr = new C1347ks[iM20903kk];
        for (int i = 0; i < iM20903kk; i++) {
            c1347ksArr[i] = (C1347ks) new C5483jd().m22573k4(c3134k4);
        }
        c4970d3.m20901k4(c1347ksArr);
        c5061vwArr[0] = c4970d3;
        return true;
    }
}
