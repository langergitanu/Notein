package com.aspose.slides.internal.p442uj;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p183ij.C5061vw;
import com.aspose.slides.internal.p183ij.C5073xk;
import com.aspose.slides.internal.p190is.C5114k4;
import com.aspose.slides.internal.p206jj.C5477ck;
import com.aspose.slides.internal.p509xs.AbstractC12603k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.uj.yd */
/* JADX INFO: loaded from: classes4.dex */
public class C11435yd extends AbstractC12603k4 {
    @Override // com.aspose.slides.internal.p509xs.AbstractC12603k4
    /* JADX INFO: renamed from: k4 */
    public boolean mo54490k4(C5061vw[] c5061vwArr, AbstractC3150x6 abstractC3150x6) {
        long position = abstractC3150x6.getPosition() - 8;
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        C5073xk c5073xk = new C5073xk(c5061vwArr[0]);
        c5073xk.m21627k4(c3134k4.m13384uz());
        c5073xk.m21632x1(c3134k4.m13384uz());
        if ((c5073xk.m21626k4() & 4294967295L) > 0) {
            c3134k4.m13371ck().seek(position + (c5073xk.m21631x1() & 4294967295L), 0);
            c5073xk.m21628k4(C5477ck.m22565k4(c3134k4, c5073xk.m21626k4()));
        }
        C5114k4.m21962k4(abstractC3150x6, 4);
        c5073xk.m21630kk(c3134k4.m13384uz());
        c5061vwArr[0] = c5073xk;
        return true;
    }
}
