package com.aspose.slides.internal.p232kl;

import com.aspose.slides.internal.p042bn.C1752sv;
import com.aspose.slides.internal.p042bn.C1760uz;
import com.aspose.slides.internal.p296nd.C6857wl;
import com.aspose.slides.internal.p347px.C9579bv;
import com.aspose.slides.internal.p441ui.C11315h4;
import com.aspose.slides.internal.p441ui.C11316k4;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p472w8.C11893c5;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12018u4;
import com.aspose.slides.internal.p475wh.C12019um;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p533yv.AbstractC13336x1;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.kl.u4 */
/* JADX INFO: loaded from: classes.dex */
public class C5868u4 extends AbstractC13336x1 {
    /* JADX INFO: renamed from: k4 */
    public static float m23715k4(C11315h4 c11315h4) {
        if (c11315h4.m54467yd() || c11315h4.m54411jd() == null || C14113y2.m67411k4(c11315h4.m54411jd().m58148ks())) {
            return 1.0f;
        }
        C11913yj c11913yjM54400dq = c11315h4.m54400dq();
        return c11913yjM54400dq.m55776k4()[3] / c11913yjM54400dq.m55776k4()[0];
    }

    /* JADX INFO: renamed from: k4 */
    private static float m23716k4(String str, short[] sArr, C9579bv c9579bv, C12013m9 c12013m9, AbstractC12008jd abstractC12008jd, C11315h4 c11315h4) {
        if (sArr == null) {
            float fM23715k4 = (m23715k4(c11315h4) * c9579bv.m46776k4(str, c12013m9.m56639dy())) + 0.0f;
            if (C14116yg.m67480k4(c9579bv.m46768fa()) > 0.0f) {
                return fM23715k4 + ((float) (C14116yg.m67466c5((((double) C14116yg.m67480k4(c9579bv.m46768fa())) * 3.141592653589793d) / 180.0d) * ((double) c12013m9.m56639dy())));
            }
            return fM23715k4;
        }
        float fM67481k4 = 0.0f;
        float f = 0.0f;
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            fM67481k4 = C14116yg.m67481k4(fM67481k4, C14116yg.m67481k4(sArr[i], m23715k4(c11315h4) * c9579bv.m46774k4(str.charAt(i2), c12013m9.m56639dy())) + f);
            f += sArr[i];
            i += sArr.length > str.length() ? 2 : 1;
        }
        return fM67481k4 - 0.0f;
    }

    @Override // com.aspose.slides.internal.p533yv.AbstractC13336x1
    /* JADX INFO: renamed from: k4 */
    public C11316k4 mo23714k4(C1752sv c1752sv, AbstractC12008jd abstractC12008jd, C11315h4 c11315h4) {
        C1760uz c1760uz = (C1760uz) c1752sv;
        if ((c1760uz.m9476to() & 2) > 0) {
            return new C11316k4(c1760uz.m9465h4().m58223h4().Clone());
        }
        if (c11315h4.m54411jd() == null) {
            return C11316k4.m54471kk();
        }
        C12019um c12019um = new C12019um();
        if ((c1760uz.m9476to() & 128) > 0) {
            c12019um.m56817kk(c12019um.m56816kk() | 1);
        }
        if ((c1760uz.m9476to() & 2048) > 0) {
            c12019um.m56813k4(C11697x1.m55250kk().m55262dy(), 2);
        }
        if ((c1760uz.m9476to() & 1024) > 0) {
            c12019um.m56813k4(C11697x1.m55252to().m55262dy(), 1);
        }
        float fM9477x1 = c1760uz.m9477x1();
        float fM9466k4 = c1760uz.m9466k4();
        if ((c11315h4.m54437ks() & 1) == 1) {
            fM9477x1 = c11315h4.m54465x6().m56708k4();
            fM9466k4 = c11315h4.m54465x6().m56713x1();
        }
        C12025x6 c12025x6 = new C12025x6(fM9477x1, fM9466k4);
        String strMo26682x1 = C6857wl.m26889k4(c11315h4.m54411jd().m58138jd()).mo26682x1(c1760uz.m9475m9(), 0, c1760uz.m9473kk());
        C12013m9 c12013m9M58160x6 = c11315h4.m54411jd().m58160x6();
        C9579bv c9579bvM58151ne = c11315h4.m54411jd().m58151ne();
        C12007ix c12007ix = new C12007ix();
        C11893c5 c11893c5Mo17583x1 = abstractC12008jd.mo17583x1();
        if ((c1760uz.m9476to() & 4) > 0) {
            C12007ix.m56544k4(c1760uz.m9465h4().m58223h4()).CloneTo(c12007ix);
        }
        C12007ix c12007ixClone = m23717k4(c12025x6.Clone(), strMo26682x1, c9579bvM58151ne, c12013m9M58160x6, c1760uz.m9464dy(), abstractC12008jd, c11315h4).Clone();
        float fM23715k4 = m23715k4(c11315h4) * c9579bvM58151ne.m46775k4(c9579bvM58151ne.m46764du().m46910x1(strMo26682x1.charAt(0)).m46756to(), c12013m9M58160x6.m56639dy());
        if (fM23715k4 > 0.0f) {
            fM23715k4 = 0.0f;
        }
        C12007ix c12007ix2 = new C12007ix(c12007ixClone.m56557jd() + fM23715k4, c12007ixClone.m56551ck(), c12007ixClone.m56550c5() - fM23715k4, c12007ixClone.m56575x1());
        if ((c1760uz.m9476to() & 4) > 0) {
            C12007ix.m56543k4(c12007ix2.Clone(), c12007ix.Clone()).CloneTo(c12007ix2);
        }
        if (c11315h4.m54411jd().m58153to() != 0) {
            C11913yj c11913yj = new C11913yj();
            c11913yj.m55766k4((-c11315h4.m54411jd().m58153to()) / 10.0f, c12025x6.Clone());
            C12018u4 c12018u4 = new C12018u4(c12007ix2.Clone());
            c12018u4.m56771x1(c11913yj);
            abstractC12008jd.mo17475du();
            c12018u4.m56749k4(abstractC12008jd).CloneTo(c12007ix2);
            abstractC12008jd.mo17496k4(c11893c5Mo17583x1);
        }
        return new C11316k4(C12014ne.m56661x1(c12007ix2.Clone()).Clone());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static C12007ix m23717k4(C12025x6 c12025x6, String str, C9579bv c9579bv, C12013m9 c12013m9, short[] sArr, AbstractC12008jd abstractC12008jd, C11315h4 c11315h4) {
        int iM46772jd;
        float fM56897x1 = c12025x6.m56897x1();
        float fM56895kk = c12025x6.m56895kk();
        if ((c11315h4.m54437ks() & 24) != 24) {
            if ((c11315h4.m54437ks() & 8) == 8) {
                iM46772jd = c9579bv.m46772jd();
            }
            float fM23716k4 = m23716k4(str, sArr, c9579bv, c12013m9, abstractC12008jd, c11315h4);
            if ((c11315h4.m54437ks() & 6) != 6) {
                fM56897x1 -= fM23716k4 / 2.0f;
            } else if ((c11315h4.m54437ks() & 2) == 2) {
                fM56897x1 -= fM23716k4;
            }
            return new C12007ix(fM56897x1, fM56895kk, fM23716k4, abstractC12008jd.mo17488k4(str, c12013m9, Integer.MAX_VALUE, C12019um.m56799c5()).m56697kk());
        }
        iM46772jd = c9579bv.m46766dy();
        fM56895kk -= c9579bv.m46775k4(iM46772jd, c12013m9.m56639dy());
        float fM23716k42 = m23716k4(str, sArr, c9579bv, c12013m9, abstractC12008jd, c11315h4);
        if ((c11315h4.m54437ks() & 6) != 6) {
        }
        return new C12007ix(fM56897x1, fM56895kk, fM23716k42, abstractC12008jd.mo17488k4(str, c12013m9, Integer.MAX_VALUE, C12019um.m56799c5()).m56697kk());
    }
}
