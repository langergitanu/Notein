package com.aspose.slides.internal.p049bx;

import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p280ms.C6492to;
import com.aspose.slides.internal.p488x0.C12352x1;
import com.aspose.slides.internal.p500xi.C12535to;

/* JADX INFO: renamed from: com.aspose.slides.internal.bx.k4 */
/* JADX INFO: loaded from: classes3.dex */
public class C1882k4 extends AbstractC1875ck {
    /* JADX INFO: renamed from: k4 */
    public final void m9801k4(C3149x1 c3149x1, C12352x1 c12352x1) {
        c3149x1.m13448k4(c12352x1.m57874k4());
        c3149x1.m13448k4(c12352x1.m57883x1());
        c3149x1.m13448k4(c12352x1.m57878kk());
        c3149x1.m13448k4(c12352x1.m57881to());
        c3149x1.m13443k4(c12352x1.m57873h4());
        c3149x1.m13450k4(c12352x1.m57872dy());
    }

    /* JADX INFO: renamed from: k4 */
    public void m9802k4(C3149x1 c3149x1, C12535to c12535to) {
        C12352x1 c12352x1 = (C12352x1) c12535to;
        c3149x1.m13448k4(c12352x1.m57874k4());
        c3149x1.m13448k4(c12352x1.m57883x1());
        c3149x1.m13448k4(c12352x1.m57878kk());
        c3149x1.m13448k4(c12352x1.m57881to());
        c3149x1.m13443k4(c12352x1.m57873h4());
        if (c12352x1.m57872dy().length != c12352x1.m57878kk() * ((((c12352x1.m57883x1() * (c12352x1.m57880m9() & 255)) + 15) >> 4) << 1)) {
            throw new C6492to("Invalid Bits length.");
        }
        c3149x1.m13450k4(c12352x1.m57872dy());
    }
}
