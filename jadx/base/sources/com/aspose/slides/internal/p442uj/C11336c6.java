package com.aspose.slides.internal.p442uj;

import com.aspose.slides.exceptions.InvalidDataException;
import com.aspose.slides.internal.p019ac.C1353u4;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p183ij.C5043sv;
import com.aspose.slides.internal.p183ij.C5061vw;
import com.aspose.slides.internal.p206jj.C5495x6;
import com.aspose.slides.internal.p509xs.AbstractC12603k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.uj.c6 */
/* JADX INFO: loaded from: classes4.dex */
public class C11336c6 extends AbstractC12603k4 {
    @Override // com.aspose.slides.internal.p509xs.AbstractC12603k4
    /* JADX INFO: renamed from: k4 */
    public boolean mo54490k4(C5061vw[] c5061vwArr, AbstractC3150x6 abstractC3150x6) {
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        C5043sv c5043sv = new C5043sv(c5061vwArr[0]);
        c5043sv.m21452k4(c3134k4.m13384uz());
        c5043sv.m21457x1(c3134k4.m13384uz() & 4294967295L);
        if ((c5043sv.m21451k4() & 4294967295L) > 0) {
            long position = c3134k4.m13371ck().getPosition();
            c5043sv.m21453k4((C1353u4) new C5495x6().m22585k4(c3134k4));
            if (((int) (c3134k4.m13371ck().getPosition() - position)) != (4294967295L & c5043sv.m21451k4())) {
                throw new InvalidDataException();
            }
        }
        c5061vwArr[0] = c5043sv;
        return true;
    }
}
