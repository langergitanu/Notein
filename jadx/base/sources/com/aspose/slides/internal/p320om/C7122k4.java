package com.aspose.slides.internal.p320om;

import com.aspose.slides.internal.p075d5.C3023to;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p498xe.C12523x1;
import com.aspose.slides.internal.p501xj.C12539to;

/* JADX INFO: renamed from: com.aspose.slides.internal.om.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C7122k4 extends AbstractC7123x1 {
    /* JADX INFO: renamed from: k4 */
    public void m27646k4(C3149x1 c3149x1, C3023to c3023to) {
        C12523x1 c12523x1 = (C12523x1) c3023to;
        c3149x1.m13448k4(c12523x1.m58277k4());
        c3149x1.m13448k4(c12523x1.m58286x1());
        c3149x1.m13448k4(c12523x1.m58281kk());
        c3149x1.m13448k4(c12523x1.m58284to());
        c3149x1.m13443k4(c12523x1.m58276h4());
        if (c12523x1.m58275dy().length != c12523x1.m58281kk() * ((((c12523x1.m58286x1() * (c12523x1.m58283m9() & 255)) + 15) >> 4) << 1)) {
            throw new C12539to("Invalid Bits length.");
        }
        c3149x1.m13450k4(c12523x1.m58275dy());
    }
}
