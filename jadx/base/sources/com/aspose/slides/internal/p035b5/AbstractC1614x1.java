package com.aspose.slides.internal.p035b5;

import com.aspose.slides.internal.p040bg.C1698kk;
import com.aspose.slides.internal.p102e8.C3585h4;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p251li.C6045bz;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p349q3.C9658ix;
import com.aspose.slides.internal.p349q3.C9743yj;
import com.aspose.slides.internal.p396sc.C10176c6;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.b5.x1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1614x1 extends C1698kk {
    public AbstractC1614x1(AbstractC1611k4 abstractC1611k4) {
        super(abstractC1611k4);
    }

    @Override // com.aspose.slides.internal.p040bg.C1698kk
    /* JADX INFO: renamed from: k4 */
    public void mo8697k4(C9658ix c9658ix, C3585h4 c3585h4) {
        C9743yj c9743yj;
        if (c9658ix.m47761bv().mo13625x1() == 3 || (c9743yj = (C9743yj) C7019kk.m27452k4((Object) c9658ix, C9743yj.class)) == null || c9743yj.m47889x1() == null || c9743yj.m47889x1().length <= 0) {
            return;
        }
        c3585h4.f9899du = false;
        for (C6045bz c6045bz : c9743yj.m47889x1()) {
            c3585h4.m14546sv().f8460k4 = true;
            try {
                m9146k4().m8698k4().mo8700k4(c6045bz.m24450x6()).m12098k4(c6045bz, c3585h4.m14546sv());
            } catch (RuntimeException e) {
                if (c9658ix.m47761bv().mo13625x1() == 5) {
                    C6005k4.m24263kk(C14113y2.m67408k4("EmfPlusException (", C14042ak.m66410k4(C10176c6.class, c6045bz.m24450x6()), "): ", e.getMessage()));
                }
                c3585h4.f9899du = true;
                return;
            }
            if (c6045bz.m24450x6() == 16388) {
                c3585h4.f9899du = true;
                return;
            } else {
                if (c6045bz.m24450x6() == 16386) {
                    return;
                }
                mo7750kk(c9658ix, c3585h4);
            }
        }
    }
}
