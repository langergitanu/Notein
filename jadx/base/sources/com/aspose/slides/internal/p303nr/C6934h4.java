package com.aspose.slides.internal.p303nr;

import com.aspose.slides.internal.p190is.C5114k4;
import com.aspose.slides.internal.p220k7.AbstractC5625dy;
import com.aspose.slides.internal.p220k7.AbstractC5630k4;
import com.aspose.slides.internal.p347px.C9579bv;
import com.aspose.slides.internal.p347px.C9580c5;
import com.aspose.slides.internal.p359qf.C9856du;
import com.aspose.slides.internal.p421tk.C10992ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12019um;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p539z4.C13431zj;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.nr.h4 */
/* JADX INFO: loaded from: classes4.dex */
public class C6934h4 extends AbstractC5625dy {

    /* JADX INFO: renamed from: k4 */
    private final AbstractC5630k4 f18912k4 = new C6947wl(this);

    @Override // com.aspose.slides.internal.p220k7.AbstractC5642x1
    /* JADX INFO: renamed from: k4 */
    public AbstractC5630k4 mo23039k4() {
        return this.f18912k4;
    }

    @Override // com.aspose.slides.internal.p220k7.AbstractC5625dy
    /* JADX INFO: renamed from: k4 */
    public void mo23014k4(C10992ck c10992ck, C9856du c9856du) {
        String strM67405k4;
        long jM53233m9 = c10992ck.m53233m9();
        AbstractC12008jd abstractC12008jd = (AbstractC12008jd) c9856du.m48641k4();
        C12019um c12019um = new C12019um(C12019um.m56799c5());
        if ((jM53233m9 & 2) == 2) {
            c12019um.m56817kk(c12019um.m56816kk() | 2);
        }
        if ((jM53233m9 & 8) == 8) {
            if (!c9856du.m48663x1().m22896c5().m67302x1()) {
                abstractC12008jd.mo17478dy(4);
            }
            if (!c9856du.m48663x1().m22902m9().m67302x1()) {
                abstractC12008jd.mo17476du(1);
            }
        } else {
            if (!c9856du.m48663x1().m22896c5().m67302x1()) {
                abstractC12008jd.mo17478dy(4);
            }
            if (!c9856du.m48663x1().m22902m9().m67302x1()) {
                abstractC12008jd.mo17476du(0);
            }
        }
        boolean z = (jM53233m9 & 4) == 4;
        if ((c10992ck.m53236up() & 4294967295L) == 1 && c10992ck.m53238yj() != null) {
            abstractC12008jd.mo17499k4(c10992ck.m53238yj().m62505k4());
        }
        short[] sArrM53224jd = c10992ck.m53224jd();
        C13431zj[] c13431zjArrM53220c5 = c10992ck.m53220c5();
        if ((jM53233m9 & 1) == 1) {
            strM67405k4 = C5114k4.m21961k4(sArrM53224jd);
        } else {
            C9579bv c9579bvMo46809k4 = C9580c5.m46807k4().mo46809k4(c9856du.m48635dy().m56651x1().m56527du(), c9856du.m48635dy().m56642jd(), null);
            char[] cArr = new char[sArrM53224jd.length];
            for (int i = 0; i < sArrM53224jd.length; i++) {
                cArr[i] = (char) c9579bvMo46809k4.m46764du().m46909kk(sArrM53224jd[i]).m46754k4();
            }
            strM67405k4 = C14113y2.m67405k4(cArr);
        }
        String str = strM67405k4;
        float fM23013k4 = m23013k4(c9856du.m48635dy());
        if (z) {
            C12025x6 c12025x6Clone = c13431zjArrM53220c5[0].mo62092k4().Clone();
            c12025x6Clone.m56898x1(c12025x6Clone.m56895kk() - fM23013k4);
            abstractC12008jd.mo17557k4(str, c9856du.m48635dy(), c9856du.m48638h4(), c12025x6Clone.Clone(), c12019um);
        } else {
            for (int i2 = 0; i2 < c10992ck.m53222dy(); i2++) {
                C12025x6 c12025x6Clone2 = c13431zjArrM53220c5[i2].mo62092k4().Clone();
                c12025x6Clone2.m56898x1(c12025x6Clone2.m56895kk() - fM23013k4);
                abstractC12008jd.mo17557k4(C14117yj.m67537ne(str.charAt(i2)), c9856du.m48635dy(), c9856du.m48638h4(), c12025x6Clone2.Clone(), c12019um);
            }
        }
    }
}
