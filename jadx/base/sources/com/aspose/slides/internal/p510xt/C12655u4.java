package com.aspose.slides.internal.p510xt;

import com.aspose.slides.internal.p123f5.C3856h4;
import com.aspose.slides.internal.p123f5.C3857k4;
import com.aspose.slides.internal.p132fj.C4047sv;
import com.aspose.slides.internal.p132fj.C4055uz;
import com.aspose.slides.internal.p276ml.AbstractC6397x1;
import com.aspose.slides.internal.p344pt.C9527qq;
import com.aspose.slides.internal.p353q7.C9790ts;
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
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.C14117yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.xt.u4 */
/* JADX INFO: loaded from: classes5.dex */
public class C12655u4 extends AbstractC6397x1 {
    /* JADX INFO: renamed from: k4 */
    public static float m58820k4(C3856h4 c3856h4) {
        if (c3856h4.m15525wy() || c3856h4.m15481jd() == null || C14113y2.m67411k4(c3856h4.m15481jd().m57732ks())) {
            return 1.0f;
        }
        C11913yj c11913yjM15466c6 = c3856h4.m15466c6();
        return c11913yjM15466c6.m55776k4()[3] / c11913yjM15466c6.m55776k4()[0];
    }

    /* JADX INFO: renamed from: k4 */
    private static float m58821k4(String str, short[] sArr, C9790ts c9790ts, C12013m9 c12013m9, AbstractC12008jd abstractC12008jd, C3856h4 c3856h4) {
        if (sArr == null) {
            float fM58820k4 = (m58820k4(c3856h4) * c9790ts.m48197k4(str, c12013m9.m56639dy())) + 0.0f;
            if (C14116yg.m67480k4(c9790ts.m48236uz()) <= 0.0f) {
                return fM58820k4;
            }
            return fM58820k4 + ((float) (C14116yg.m67466c5((((double) C14116yg.m67480k4(c9790ts.m48236uz())) * 3.141592653589793d) / 180.0d) * ((double) c12013m9.m56639dy())));
        }
        float fM67481k4 = 0.0f;
        float f = 0.0f;
        int iMo26658k4 = 0;
        for (int i = 0; i < str.length(); i++) {
            fM67481k4 = C14116yg.m67481k4(fM67481k4, C14116yg.m67481k4(sArr[iMo26658k4], m58820k4(c3856h4) * c9790ts.m48194k4(str.charAt(i), c12013m9.m56639dy())) + f);
            f += sArr[iMo26658k4];
            iMo26658k4 += C9527qq.m46686k4(c3856h4.m15481jd().m57722jd(), c9790ts).mo26658k4(C14117yj.m67537ne(str.charAt(i)));
        }
        return fM67481k4 - 0.0f;
    }

    @Override // com.aspose.slides.internal.p276ml.AbstractC6397x1
    /* JADX INFO: renamed from: k4 */
    public C3857k4 mo26252k4(C4047sv c4047sv, AbstractC12008jd abstractC12008jd, C3856h4 c3856h4) {
        C4055uz c4055uz = (C4055uz) c4047sv;
        if ((c4055uz.m16144to() & 2) > 0) {
            return new C3857k4(c4055uz.m16133h4().m57807h4().Clone());
        }
        if (c3856h4.m15481jd() == null) {
            return C3857k4.m15543kk();
        }
        C12019um c12019um = new C12019um();
        if ((c4055uz.m16144to() & 128) > 0) {
            c12019um.m56817kk(c12019um.m56816kk() | 1);
        }
        if ((c4055uz.m16144to() & 2048) > 0) {
            c12019um.m56813k4(C11697x1.m55250kk().m55262dy(), 2);
        }
        if ((c4055uz.m16144to() & 1024) > 0) {
            c12019um.m56813k4(C11697x1.m55252to().m55262dy(), 1);
        }
        float fM16145x1 = c4055uz.m16145x1();
        float fM16134k4 = c4055uz.m16134k4();
        if ((c3856h4.m15507ks() & 1) == 1) {
            fM16145x1 = c3856h4.m15537x6().m56708k4();
            fM16134k4 = c3856h4.m15537x6().m56713x1();
        }
        C12025x6 c12025x6 = new C12025x6(fM16145x1, fM16134k4);
        C12013m9 c12013m9M57744x6 = c3856h4.m15481jd().m57744x6();
        C9790ts c9790tsM57735ne = c3856h4.m15481jd().m57735ne();
        String strMo26682x1 = C9527qq.m46686k4(c3856h4.m15481jd().m57722jd(), c9790tsM57735ne).mo26682x1(c4055uz.m16143m9(), 0, c4055uz.m16141kk());
        C12007ix c12007ix = new C12007ix();
        C11893c5 c11893c5Mo17583x1 = abstractC12008jd.mo17583x1();
        if ((c4055uz.m16144to() & 4) > 0) {
            C12007ix.m56544k4(c4055uz.m16133h4().m57807h4()).CloneTo(c12007ix);
        }
        C12007ix c12007ixClone = m58822k4(c12025x6.Clone(), strMo26682x1, c9790tsM57735ne, c12013m9M57744x6, c4055uz.m16132dy(), abstractC12008jd, c3856h4).Clone();
        float fM58820k4 = !C14113y2.m67411k4(strMo26682x1) ? m58820k4(c3856h4) * c9790tsM57735ne.m48195k4(c9790tsM57735ne.m48221m9().m48107x1(strMo26682x1.charAt(0)).m48286to(), c12013m9M57744x6.m56639dy()) : 0.0f;
        float f = fM58820k4 <= 0.0f ? fM58820k4 : 0.0f;
        C12007ix c12007ix2 = new C12007ix(c12007ixClone.m56557jd() + f, c12007ixClone.m56551ck(), c12007ixClone.m56550c5() - f, c12007ixClone.m56575x1());
        if ((c4055uz.m16144to() & 4) > 0) {
            C12007ix.m56543k4(c12007ix2.Clone(), c12007ix.Clone()).CloneTo(c12007ix2);
        }
        if (c3856h4.m15481jd().m57737to() != 0) {
            C11913yj c11913yj = new C11913yj();
            c11913yj.m55766k4((-c3856h4.m15481jd().m57737to()) / 10.0f, c12025x6.Clone());
            C12018u4 c12018u4 = new C12018u4(c12007ix2.Clone());
            c12018u4.m56771x1(c11913yj);
            abstractC12008jd.mo17475du();
            c12018u4.m56749k4(abstractC12008jd).CloneTo(c12007ix2);
            abstractC12008jd.mo17496k4(c11893c5Mo17583x1);
        }
        return new C3857k4(C12014ne.m56661x1(c12007ix2.Clone()).Clone());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static C12007ix m58822k4(C12025x6 c12025x6, String str, C9790ts c9790ts, C12013m9 c12013m9, short[] sArr, AbstractC12008jd abstractC12008jd, C3856h4 c3856h4) {
        int iM48185fa;
        float fM56897x1 = c12025x6.m56897x1();
        float fM56895kk = c12025x6.m56895kk();
        if ((c3856h4.m15507ks() & 24) != 24) {
            if ((c3856h4.m15507ks() & 8) == 8) {
                iM48185fa = c9790ts.m48185fa();
            }
            float fM58821k4 = m58821k4(str, sArr, c9790ts, c12013m9, abstractC12008jd, c3856h4);
            if ((c3856h4.m15507ks() & 6) != 6) {
                fM56897x1 -= fM58821k4 / 2.0f;
            } else if ((c3856h4.m15507ks() & 2) == 2) {
                fM56897x1 -= fM58821k4;
            }
            return new C12007ix(fM56897x1, fM56895kk, fM58821k4, abstractC12008jd.mo17488k4(str, c12013m9, Integer.MAX_VALUE, C12019um.m56799c5()).m56697kk());
        }
        iM48185fa = c9790ts.m48191jd();
        fM56895kk -= c9790ts.m48195k4(iM48185fa, c12013m9.m56639dy());
        float fM58821k42 = m58821k4(str, sArr, c9790ts, c12013m9, abstractC12008jd, c3856h4);
        if ((c3856h4.m15507ks() & 6) != 6) {
        }
        return new C12007ix(fM56897x1, fM56895kk, fM58821k42, abstractC12008jd.mo17488k4(str, c12013m9, Integer.MAX_VALUE, C12019um.m56799c5()).m56697kk());
    }
}
