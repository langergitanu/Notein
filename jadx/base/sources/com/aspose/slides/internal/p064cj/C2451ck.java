package com.aspose.slides.internal.p064cj;

import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p349q3.C9658ix;
import com.aspose.slides.internal.p349q3.C9670ks;

/* JADX INFO: renamed from: com.aspose.slides.internal.cj.ck */
/* JADX INFO: loaded from: classes3.dex */
public class C2451ck {
    /* JADX INFO: renamed from: k4 */
    public final boolean m11863k4(C9658ix c9658ix, C3149x1 c3149x1) {
        C9670ks c9670ks = (C9670ks) c9658ix;
        if ((c9670ks.m47290dy() & 4294967295L) > 8) {
            c3149x1.m13447k4(c9670ks.m47414k4() & 4294967295L);
            c3149x1.m13447k4(c9670ks.m47417x1() & 4294967295L);
            C6005k4.m24263kk("Writing EmfCommentEmfSpool record is not implemented");
            c3149x1.m13442k4().seek(4294967295L & ((c9670ks.m47290dy() & 4294967295L) - 8), 1);
        }
        return true;
    }
}
