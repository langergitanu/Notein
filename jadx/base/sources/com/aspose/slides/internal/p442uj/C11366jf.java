package com.aspose.slides.internal.p442uj;

import com.aspose.slides.internal.p019ac.C1336ar;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p183ij.C5046tl;
import com.aspose.slides.internal.p183ij.C5061vw;
import com.aspose.slides.internal.p206jj.C5491u4;
import com.aspose.slides.internal.p509xs.AbstractC12603k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.uj.jf */
/* JADX INFO: loaded from: classes4.dex */
public class C11366jf extends AbstractC12603k4 {
    @Override // com.aspose.slides.internal.p509xs.AbstractC12603k4
    /* JADX INFO: renamed from: k4 */
    public boolean mo54490k4(C5061vw[] c5061vwArr, AbstractC3150x6 abstractC3150x6) {
        C5046tl c5046tl = new C5046tl(c5061vwArr[0]);
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        c5046tl.m21466k4(c3134k4.m13384uz());
        int iM21465k4 = (int) c5046tl.m21465k4();
        C1336ar[] c1336arArr = new C1336ar[iM21465k4];
        C5491u4 c5491u4 = new C5491u4();
        for (int i = 0; i < iM21465k4; i++) {
            c1336arArr[i] = (C1336ar) c5491u4.m22581k4(c3134k4);
        }
        c5046tl.m21468k4(c1336arArr);
        c5046tl.m21467k4(c3134k4.m13372dy(8));
        c5061vwArr[0] = c5046tl;
        return true;
    }
}
