package com.aspose.slides.internal.p094dw;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p349q3.C9658ix;
import com.aspose.slides.internal.p349q3.C9670ks;

/* JADX INFO: renamed from: com.aspose.slides.internal.dw.ck */
/* JADX INFO: loaded from: classes3.dex */
public class C3394ck {
    /* JADX INFO: renamed from: k4 */
    public final boolean m13952k4(C9658ix[] c9658ixArr, AbstractC3150x6 abstractC3150x6) {
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        C9670ks c9670ks = new C9670ks(c9658ixArr[0]);
        if ((c9670ks.m47290dy() & 4294967295L) > 8) {
            c9670ks.m47415k4(c3134k4.m13384uz() & 4294967295L);
            c9670ks.m47418x1(c3134k4.m13384uz() & 4294967295L);
            C6005k4.m24263kk("Reading EmfCommentEmfSpool record is not implemented");
            abstractC3150x6.seek(4294967295L & ((c9670ks.m47290dy() & 4294967295L) - 8), 1);
        }
        c9658ixArr[0] = c9670ks;
        return true;
    }
}
