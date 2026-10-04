package com.aspose.slides.internal.p048bv;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p097e0.C3525lr;
import com.aspose.slides.internal.p097e0.C3526m9;
import com.aspose.slides.internal.p111em.C3754ck;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p420th.C10948ar;
import com.aspose.slides.internal.p523yd.C12807du;
import com.aspose.slides.internal.p523yd.C12809h4;
import com.aspose.slides.internal.p523yd.C12814to;

/* JADX INFO: renamed from: com.aspose.slides.internal.bv.x6 */
/* JADX INFO: loaded from: classes3.dex */
public class C1872x6 {
    /* JADX INFO: renamed from: k4 */
    public static List<C10948ar> m9790k4(AbstractC3150x6 abstractC3150x6, C1867ne c1867ne) {
        return m9791k4(abstractC3150x6, c1867ne, null);
    }

    /* JADX INFO: renamed from: k4 */
    private static List<C10948ar> m9791k4(AbstractC3150x6 abstractC3150x6, C1867ne c1867ne, String str) throws Throwable {
        C12809h4 c12809h4M59524k4;
        boolean[] zArr = {false};
        C1868rv.m9779k4(zArr);
        boolean z = zArr[0];
        try {
            c12809h4M59524k4 = C12809h4.m59524k4();
            try {
                C12814to c12814toM59546x1 = c12809h4M59524k4.m59546x1();
                c12814toM59546x1.f42608dy = new List<>();
                c12814toM59546x1.m59587x1(c1867ne.m9776x1());
                c12814toM59546x1.f42605c5 = c1867ne.m9772kk();
                c12814toM59546x1.m59568k4(c1867ne.m9774to());
                c12814toM59546x1.m59585x1(c1867ne.m9765du());
                c12814toM59546x1.m59564k4(c1867ne.m9765du());
                c12814toM59546x1.m59578to(c1867ne.m9766h4());
                c12814toM59546x1.m59566k4(c1867ne.m9773m9());
                c12809h4M59524k4.m59537k4(new C3526m9());
                c12809h4M59524k4.m59537k4(new C3525lr());
                c12809h4M59524k4.m59536k4(c1867ne.m9767k4());
                C12807du c12807duM59534k4 = c12809h4M59524k4.m59534k4("application/X-fop-ex-aps", c12814toM59546x1, new C3152yj());
                C3754ck c3754ck = new C3754ck();
                c3754ck.m15068k4(c12807duM59534k4.m59522k4());
                c3754ck.m15067k4(abstractC3150x6, str);
                List<C10948ar> list = (List) C7019kk.m27452k4((Object) c12814toM59546x1.f42608dy, List.class);
                if (!z) {
                    C1868rv.m9778k4().dispose();
                }
                c12809h4M59524k4.dispose();
                return list;
            } catch (Throwable th) {
                th = th;
                if (!z) {
                    C1868rv.m9778k4().dispose();
                }
                if (c12809h4M59524k4 != null) {
                    c12809h4M59524k4.dispose();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c12809h4M59524k4 = null;
        }
    }
}
