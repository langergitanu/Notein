package com.aspose.slides.internal.p097e0;

import com.aspose.slides.internal.p048bv.C1865ks;
import com.aspose.slides.internal.p048bv.C1873yj;
import com.aspose.slides.internal.p048bv.InterfaceC1859dy;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p115eq.InterfaceC3793to;
import com.aspose.slides.internal.p231kk.C5801ss;
import com.aspose.slides.internal.p231kk.C5811wp;
import com.aspose.slides.internal.p261m0.C6292c5;
import com.aspose.slides.internal.p420th.C10948ar;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p505xn.C12565ks;
import com.aspose.slides.internal.p523yd.C12812kk;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.e0.v4 */
/* JADX INFO: loaded from: classes3.dex */
public class C3536v4 extends C3542yd {

    /* JADX INFO: renamed from: to */
    public C10948ar f9873to;

    /* JADX INFO: renamed from: com.aspose.slides.internal.e0.v4$k4 */
    public static class k4 implements InterfaceC3793to {

        /* JADX INFO: renamed from: k4 */
        private InterfaceC1859dy f9874k4;

        /* JADX INFO: renamed from: x1 */
        private String f9875x1;

        public k4(InterfaceC1859dy interfaceC1859dy, String str) {
            this.f9874k4 = interfaceC1859dy;
            this.f9875x1 = str;
        }

        /* JADX INFO: renamed from: k4 */
        private static C5801ss m14411k4(C1865ks c1865ks) {
            return new C5801ss(c1865ks.m9754k4(), c1865ks.m9755x1());
        }

        @Override // com.aspose.slides.internal.p231kk.InterfaceC5815xk
        /* JADX INFO: renamed from: k4 */
        public final C5801ss mo14413k4(Object obj, C5811wp c5811wp) {
            InterfaceC1859dy interfaceC1859dy = this.f9874k4;
            return m14411k4(interfaceC1859dy == null ? new C1865ks(C12565ks.m58632x1(new C12812kk().mo59523k4(c5811wp.m23710k4(), C14113y2.f47374k4, this.f9875x1))) : interfaceC1859dy.mo9717k4(obj, new C1873yj(m14412k4(c5811wp.m23710k4()))));
        }

        /* JADX INFO: renamed from: k4 */
        private String m14412k4(String str) {
            try {
                if (new C14062gk(str, 0).m66683ix()) {
                    return str;
                }
            } catch (RuntimeException unused) {
            }
            return C3141rv.m13412x1(this.f9875x1, str);
        }
    }

    public C3536v4(AbstractC3511c5 abstractC3511c5) {
        super(abstractC3511c5);
        this.f9873to = null;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3531ts
    /* JADX INFO: renamed from: k4 */
    public C12025x6 mo14369k4(C12016rv c12016rv, String str) {
        this.f9873to = new C6292c5(new k4(this.f9752k4.m14111q_().m59556du().m59532jd().m59550k4(), str)).m25744k4(this.f9862h4.getOuterXml());
        return new C12025x6(this.f9873to.m52873k4().m56699x1(), this.f9873to.m52873k4().m56697kk());
    }
}
