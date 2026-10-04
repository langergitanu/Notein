package com.aspose.slides.internal.p548zf;

import com.aspose.slides.internal.p069cw.C2638du;
import com.aspose.slides.internal.p109ei.AbstractC3729dy;
import com.aspose.slides.internal.p109ei.AbstractC3734k4;
import com.aspose.slides.internal.p110ek.C3749k4;
import com.aspose.slides.internal.p171hq.C4681zj;
import com.aspose.slides.internal.p251li.C6049ck;
import com.aspose.slides.internal.p353q7.C9763ck;
import com.aspose.slides.internal.p353q7.C9790ts;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12019um;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.zf.h4 */
/* JADX INFO: loaded from: classes5.dex */
public class C13572h4 extends AbstractC3729dy {

    /* JADX INFO: renamed from: k4 */
    private final AbstractC3734k4 f45127k4 = new C13585wl(this);

    @Override // com.aspose.slides.internal.p109ei.AbstractC3746x1
    /* JADX INFO: renamed from: k4 */
    public AbstractC3734k4 mo15042k4() {
        return this.f45127k4;
    }

    @Override // com.aspose.slides.internal.p109ei.AbstractC3729dy
    /* JADX INFO: renamed from: k4 */
    public void mo15017k4(C6049ck c6049ck, C2638du c2638du) {
        String strM67405k4;
        long jM24463dy = c6049ck.m24463dy();
        AbstractC12008jd abstractC12008jd = (AbstractC12008jd) c2638du.m12052k4();
        C12019um c12019um = new C12019um(C12019um.m56799c5());
        if ((jM24463dy & 2) == 2) {
            c12019um.m56817kk(c12019um.m56816kk() | 2);
        }
        if ((jM24463dy & 8) == 8) {
            if (C14093tq.m67295k4(c2638du.m12075x1().m17050jd(), null)) {
                abstractC12008jd.mo17478dy(4);
            }
            if (C14093tq.m67295k4(c2638du.m12075x1().m17047dy(), null)) {
                abstractC12008jd.mo17476du(1);
            }
        } else {
            if (C14093tq.m67295k4(c2638du.m12075x1().m17050jd(), null)) {
                abstractC12008jd.mo17478dy(4);
            }
            if (C14093tq.m67295k4(c2638du.m12075x1().m17047dy(), null)) {
                abstractC12008jd.mo17476du(0);
            }
        }
        boolean z = (jM24463dy & 4) == 4;
        if ((c6049ck.m24479yj() & 4294967295L) == 1 && c6049ck.m24474ks() != null) {
            abstractC12008jd.mo17499k4(c6049ck.m24474ks().m19523dy());
        }
        short[] sArrM24462ck = c6049ck.m24462ck();
        C4681zj[] c4681zjArrM24465jd = c6049ck.m24465jd();
        if ((jM24463dy & 1) == 1) {
            strM67405k4 = C3749k4.m15046k4(sArrM24462ck);
        } else {
            C9790ts c9790tsMo48032k4 = C9763ck.m48030to().mo48032k4(c2638du.m12041c5().m56651x1().m56527du(), c2638du.m12041c5().m56642jd(), (String) null);
            char[] cArr = new char[sArrM24462ck.length];
            for (int i = 0; i < sArrM24462ck.length; i++) {
                cArr[i] = (char) c9790tsMo48032k4.m48221m9().m48104kk(sArrM24462ck[i]).m48284k4();
            }
            strM67405k4 = C14113y2.m67405k4(cArr);
        }
        String str = strM67405k4;
        float fM15016k4 = m15016k4(c2638du.m12041c5());
        if (z) {
            C12025x6 c12025x6Clone = c4681zjArrM24465jd[0].mo19089k4().Clone();
            c12025x6Clone.m56898x1(c12025x6Clone.m56895kk() - fM15016k4);
            abstractC12008jd.mo17557k4(str, c2638du.m12041c5(), c2638du.m12067m9(), c12025x6Clone.Clone(), c12019um);
        } else {
            for (int i2 = 0; i2 < c6049ck.m24461c5(); i2++) {
                C12025x6 c12025x6Clone2 = c4681zjArrM24465jd[i2].mo19089k4().Clone();
                c12025x6Clone2.m56898x1(c12025x6Clone2.m56895kk() - fM15016k4);
                abstractC12008jd.mo17557k4(C14117yj.m67537ne(str.charAt(i2)), c2638du.m12041c5(), c2638du.m12067m9(), c12025x6Clone2.Clone(), c12019um);
            }
        }
    }
}
