package com.aspose.slides.internal.p442uj;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p183ij.C5011ly;
import com.aspose.slides.internal.p183ij.C5061vw;
import com.aspose.slides.internal.p509xs.AbstractC12603k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.uj.u5 */
/* JADX INFO: loaded from: classes4.dex */
public class C11411u5 extends AbstractC12603k4 {
    @Override // com.aspose.slides.internal.p509xs.AbstractC12603k4
    /* JADX INFO: renamed from: k4 */
    public boolean mo54490k4(C5061vw[] c5061vwArr, AbstractC3150x6 abstractC3150x6) {
        C5011ly c5011ly = new C5011ly(c5061vwArr[0]);
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        c5011ly.m21243k4(c3134k4.m13384uz());
        c5011ly.m21248x1(c3134k4.m13384uz());
        c5011ly.m21246kk(c3134k4.m13384uz());
        long jM21242k4 = (c5011ly.m21242k4() & 4294967295L) + (c5011ly.m21247x1() & 4294967295L);
        long j = jM21242k4 & 4294967295L;
        if ((jM21242k4 & 4294967295L) > 0) {
            c5011ly.m21244k4(c3134k4.m13372dy((int) j));
        }
        c5061vwArr[0] = c5011ly;
        return true;
    }
}
