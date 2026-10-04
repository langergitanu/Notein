package com.aspose.slides.internal.p246lc;

import com.aspose.slides.internal.p026an.C1474c6;
import com.aspose.slides.internal.p143g4.C4201h4;
import com.aspose.slides.internal.p183ij.C4996ix;
import com.aspose.slides.internal.p183ij.C5081yj;
import com.aspose.slides.internal.p191it.C5126kk;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p421tk.C10988bz;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.lc.x1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6025x1 extends C5126kk {
    public AbstractC6025x1(AbstractC6022k4 abstractC6022k4) {
        super(abstractC6022k4);
    }

    @Override // com.aspose.slides.internal.p191it.C5126kk
    /* JADX INFO: renamed from: k4 */
    public void mo21985k4(C4996ix c4996ix, C4201h4 c4201h4) {
        C5081yj c5081yj;
        if (c4996ix.m21555bv().mo12733x1() == 3 || (c5081yj = (C5081yj) C7019kk.m27452k4((Object) c4996ix, C5081yj.class)) == null || c5081yj.m21667k4() == null || c5081yj.m21667k4().length <= 0) {
            return;
        }
        c4201h4.f11386du = false;
        for (C10988bz c10988bz : c5081yj.m21667k4()) {
            try {
                m21984k4().m24328k4().mo16673k4(c10988bz.m53206rv()).m48686k4(c10988bz, c4201h4.m16746sv());
                if (c10988bz.m53206rv() == 16388) {
                    c4201h4.f11386du = true;
                    return;
                } else {
                    if (c10988bz.m53206rv() == 16386) {
                        return;
                    }
                    mo16656kk(c4996ix, c4201h4);
                }
            } catch (RuntimeException e) {
                if (c4996ix.m21555bv().mo12733x1() != 5) {
                    throw e;
                }
                C6005k4.m24263kk(C14113y2.m67408k4("EmfPlusException (", C14042ak.m66410k4(C1474c6.class, c10988bz.m53206rv()), "): ", e.getMessage()));
                c4201h4.f11386du = true;
                return;
            }
        }
    }
}
