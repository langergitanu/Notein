package com.aspose.slides.internal.p232kl;

import com.aspose.slides.internal.p042bn.C1752sv;
import com.aspose.slides.internal.p042bn.C1769x5;
import com.aspose.slides.internal.p347px.C9579bv;
import com.aspose.slides.internal.p441ui.C11315h4;
import com.aspose.slides.internal.p441ui.C11316k4;
import com.aspose.slides.internal.p472w8.C11893c5;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12018u4;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p533yv.AbstractC13336x1;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.kl.y9 */
/* JADX INFO: loaded from: classes.dex */
public class C5884y9 extends AbstractC13336x1 {
    /* JADX INFO: renamed from: k4 */
    private static float m23718k4(String str, C9579bv c9579bv, C12013m9 c12013m9, C11315h4 c11315h4) {
        float fM46776k4 = c9579bv.m46776k4(str, c12013m9.m56639dy());
        if (c11315h4.m54392ar() > 0) {
            fM46776k4 += str.length() * c11315h4.m54392ar();
        }
        float fM23715k4 = (C5868u4.m23715k4(c11315h4) * fM46776k4) + 0.0f;
        if (C14116yg.m67480k4(c9579bv.m46768fa()) <= 0.0f) {
            return fM23715k4;
        }
        return fM23715k4 + ((float) (C14116yg.m67466c5((((double) C14116yg.m67480k4(c9579bv.m46768fa())) * 3.141592653589793d) / 180.0d) * ((double) c12013m9.m56639dy())));
    }

    @Override // com.aspose.slides.internal.p533yv.AbstractC13336x1
    /* JADX INFO: renamed from: k4 */
    public C11316k4 mo23714k4(C1752sv c1752sv, AbstractC12008jd abstractC12008jd, C11315h4 c11315h4) {
        C1769x5 c1769x5 = (C1769x5) c1752sv;
        if (c11315h4.m54411jd() == null) {
            return C11316k4.m54471kk();
        }
        C12025x6 c12025x6 = new C12025x6(c1769x5.m9524kk(), c1769x5.m9526to());
        String strM67443x1 = C14113y2.m67443x1(c1769x5.m9527x1(), 0, c1769x5.m9520k4());
        C12013m9 c12013m9M58139k4 = c11315h4.m54411jd().m58139k4(true);
        C9579bv c9579bvM58151ne = c11315h4.m54411jd().m58151ne();
        C11893c5 c11893c5Mo17583x1 = abstractC12008jd.mo17583x1();
        C12007ix c12007ixClone = m23719k4(c12025x6.Clone(), strM67443x1, c9579bvM58151ne, c12013m9M58139k4, c11315h4).Clone();
        float fM23715k4 = C5868u4.m23715k4(c11315h4) * c9579bvM58151ne.m46775k4(c9579bvM58151ne.m46764du().m46910x1(strM67443x1.charAt(0)).m46756to(), c12013m9M58139k4.m56639dy());
        if (fM23715k4 > 0.0f) {
            fM23715k4 = 0.0f;
        }
        C12007ix c12007ix = new C12007ix(c12007ixClone.m56557jd() + fM23715k4, c12007ixClone.m56551ck(), c12007ixClone.m56550c5() - fM23715k4, c12007ixClone.m56575x1());
        if (c11315h4.m54411jd().m58145kk() != 0) {
            C11913yj c11913yj = new C11913yj();
            c11913yj.m55766k4((-c11315h4.m54411jd().m58145kk()) / 10.0f, c12025x6.Clone());
            C12018u4 c12018u4 = new C12018u4(c12007ix.Clone());
            c12018u4.m56771x1(c11913yj);
            abstractC12008jd.mo17475du();
            c12018u4.m56749k4(abstractC12008jd).CloneTo(c12007ix);
        }
        abstractC12008jd.mo17496k4(c11893c5Mo17583x1);
        return new C11316k4(C12014ne.m56661x1(c12007ix.Clone()).Clone());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C12007ix m23719k4(C12025x6 c12025x6, String str, C9579bv c9579bv, C12013m9 c12013m9, C11315h4 c11315h4) {
        float f;
        float fM56897x1 = c12025x6.m56897x1();
        float fM56895kk = c12025x6.m56895kk();
        int iM46794m9 = c9579bv.m46794m9();
        int iM46760c5 = c9579bv.m46760c5();
        int iM46766dy = c9579bv.m46766dy();
        int i = iM46760c5 + iM46766dy;
        float fM56639dy = c12013m9.m56639dy() / iM46794m9;
        if ((c11315h4.m54437ks() & 24) != 24) {
            if ((c11315h4.m54437ks() & 8) == 8) {
                f = i;
            }
            float fM23718k4 = m23718k4(str, c9579bv, c12013m9, c11315h4);
            if ((c11315h4.m54437ks() & 6) != 6) {
                fM56897x1 -= fM23718k4 / 2.0f;
            } else if ((c11315h4.m54437ks() & 2) == 2) {
                fM56897x1 -= fM23718k4;
            }
            return new C12007ix(fM56897x1, fM56895kk, fM23718k4, c9579bv.m46775k4(c9579bv.m46772jd(), c12013m9.m56639dy()));
        }
        f = iM46766dy;
        fM56895kk -= f * fM56639dy;
        float fM23718k42 = m23718k4(str, c9579bv, c12013m9, c11315h4);
        if ((c11315h4.m54437ks() & 6) != 6) {
        }
        return new C12007ix(fM56897x1, fM56895kk, fM23718k42, c9579bv.m46775k4(c9579bv.m46772jd(), c12013m9.m56639dy()));
    }
}
