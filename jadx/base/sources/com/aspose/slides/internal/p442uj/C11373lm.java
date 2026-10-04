package com.aspose.slides.internal.p442uj;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p183ij.C5028q6;
import com.aspose.slides.internal.p183ij.C5061vw;
import com.aspose.slides.internal.p509xs.AbstractC12603k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.uj.lm */
/* JADX INFO: loaded from: classes4.dex */
public class C11373lm extends AbstractC12603k4 {
    @Override // com.aspose.slides.internal.p509xs.AbstractC12603k4
    /* JADX INFO: renamed from: k4 */
    public boolean mo54490k4(C5061vw[] c5061vwArr, AbstractC3150x6 abstractC3150x6) {
        C5028q6 c5028q6 = new C5028q6(c5061vwArr[0]);
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        c5028q6.m21377k4(c3134k4.m13384uz());
        c5028q6.m21382x1(c3134k4.m13384uz());
        c5028q6.m21380kk(c3134k4.m13384uz());
        long jM21376k4 = (c5028q6.m21376k4() & 4294967295L) + (c5028q6.m21381x1() & 4294967295L);
        long j = jM21376k4 & 4294967295L;
        if ((jM21376k4 & 4294967295L) > 0) {
            c5028q6.m21378k4(c3134k4.m13372dy((int) j));
        }
        c5061vwArr[0] = c5028q6;
        return true;
    }
}
