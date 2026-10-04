package com.aspose.slides.internal.p442uj;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p183ij.C4996ix;
import com.aspose.slides.internal.p183ij.C5008ks;
import com.aspose.slides.internal.p243l6.C6005k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.uj.ck */
/* JADX INFO: loaded from: classes4.dex */
public class C11338ck {
    /* JADX INFO: renamed from: k4 */
    public final boolean m54492k4(C4996ix[] c4996ixArr, AbstractC3150x6 abstractC3150x6) {
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        C5008ks c5008ks = new C5008ks(c4996ixArr[0]);
        if ((c5008ks.m21111to() & 4294967295L) > 8) {
            c5008ks.m21231k4(c3134k4.m13384uz() & 4294967295L);
            c5008ks.m21233x1(c3134k4.m13384uz() & 4294967295L);
            C6005k4.m24263kk("Reading EmfCommentEmfSpool record is not implemented");
            abstractC3150x6.seek(4294967295L & ((c5008ks.m21111to() & 4294967295L) - 8), 1);
        }
        c4996ixArr[0] = c5008ks;
        return true;
    }
}
