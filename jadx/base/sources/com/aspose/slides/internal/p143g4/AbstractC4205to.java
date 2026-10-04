package com.aspose.slides.internal.p143g4;

import com.aspose.slides.internal.p183ij.C5061vw;
import com.aspose.slides.internal.p243l6.C6005k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.g4.to */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4205to {
    /* JADX INFO: renamed from: du */
    private void m16874du(C5061vw c5061vw, C4201h4 c4201h4) {
        try {
            mo16876to(c5061vw, c4201h4);
        } catch (RuntimeException e) {
            C6005k4.m24263kk(e.getMessage());
            throw e;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m16875k4(C5061vw c5061vw, C4201h4 c4201h4) {
        mo16658x1(c5061vw, c4201h4);
        if ((c5061vw.m21555bv().mo12733x1() != 5 && c5061vw.m21555bv().mo12733x1() != 4) || c5061vw.m21561v4() == 70 || c5061vw.m21561v4() == 1 || c4201h4.f11386du) {
            m16874du(c5061vw, c4201h4);
        }
        mo16656kk(c5061vw, c4201h4);
    }

    /* JADX INFO: renamed from: kk */
    public void mo16656kk(C5061vw c5061vw, C4201h4 c4201h4) {
    }

    /* JADX INFO: renamed from: to */
    public abstract void mo16876to(C5061vw c5061vw, C4201h4 c4201h4);

    /* JADX INFO: renamed from: x1 */
    public void mo16658x1(C5061vw c5061vw, C4201h4 c4201h4) {
    }
}
