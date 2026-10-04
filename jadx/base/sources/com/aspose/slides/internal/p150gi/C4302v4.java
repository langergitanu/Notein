package com.aspose.slides.internal.p150gi;

import com.aspose.slides.OooO00o;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p150gi.AbstractC4271e0;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.gi.v4 */
/* JADX INFO: loaded from: classes.dex */
public class C4302v4 extends AbstractC4271e0.k4 {
    public C4302v4(int i) {
        super(i);
    }

    /* JADX INFO: renamed from: kk */
    private static int m17276kk(int i) {
        int i2;
        int i3 = 12000;
        double d = i < 12000 ? 0.8333333333333334d : 1.2d;
        double d2 = 12000;
        while (true) {
            int iOooO00o = OooO00o.OooO00o(d2, d, 14);
            i2 = i3;
            i3 = iOooO00o;
            if ((d >= 1.0d || i3 <= i) && (d <= 1.0d || i3 >= i)) {
                break;
            }
            d2 = i3;
        }
        return C14116yg.m67482k4(i2 - i) <= C14116yg.m67482k4(i - i3) ? i2 : i3;
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4275gi
    /* JADX INFO: renamed from: k4 */
    public AbstractC4282kp mo14415k4(AbstractC3533um abstractC3533um, String str, AbstractC3524ks abstractC3524ks) {
        AbstractC4282kp abstractC4282kpMo14415k4 = super.mo14415k4(abstractC3533um, str, abstractC3524ks);
        if (!C7019kk.m27469x1(abstractC4282kpMo14415k4, C4292ss.class)) {
            return abstractC4282kpMo14415k4;
        }
        return C4261ar.m17118k4((((C4292ss) abstractC4282kpMo14415k4).m17269yj() * ((double) abstractC3533um.m14400m9(this.f11665k4).mo9877dy().mo9884to())) / 100.0d);
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4271e0.k4, com.aspose.slides.internal.p150gi.AbstractC4275gi
    /* JADX INFO: renamed from: x1 */
    public AbstractC4282kp mo17139x1(AbstractC4282kp abstractC4282kp, AbstractC3533um abstractC3533um, AbstractC3524ks abstractC3524ks) {
        if (abstractC4282kp.mo17251du() != 71 && abstractC4282kp.mo17251du() != 132) {
            return super.mo17139x1(abstractC4282kp, abstractC3533um, abstractC3524ks);
        }
        int iM17276kk = m17276kk(abstractC3533um.m14400m9(this.f11665k4).mo9877dy().mo9884to());
        return C4261ar.m17118k4(C14116yg.m67497to(abstractC4282kp.mo17251du() == 71 ? ((double) iM17276kk) * 1.2d : ((double) iM17276kk) / 1.2d));
    }
}
