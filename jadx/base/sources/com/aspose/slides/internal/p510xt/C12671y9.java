package com.aspose.slides.internal.p510xt;

import com.aspose.slides.internal.p123f5.C3856h4;
import com.aspose.slides.internal.p123f5.C3857k4;
import com.aspose.slides.internal.p132fj.C4047sv;
import com.aspose.slides.internal.p132fj.C4064x5;
import com.aspose.slides.internal.p276ml.AbstractC6397x1;
import com.aspose.slides.internal.p353q7.C9790ts;
import com.aspose.slides.internal.p472w8.C11893c5;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12018u4;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.xt.y9 */
/* JADX INFO: loaded from: classes5.dex */
public class C12671y9 extends AbstractC6397x1 {
    /* JADX INFO: renamed from: k4 */
    private static float m58823k4(String str, C9790ts c9790ts, C12013m9 c12013m9, C3856h4 c3856h4) {
        float fM48197k4 = c9790ts.m48197k4(str, c12013m9.m56639dy());
        if (c3856h4.m15462bv() > 0) {
            fM48197k4 += str.length() * c3856h4.m15462bv();
        }
        float fM58820k4 = (C12655u4.m58820k4(c3856h4) * fM48197k4) + 0.0f;
        if (C14116yg.m67480k4(c9790ts.m48236uz()) <= 0.0f) {
            return fM58820k4;
        }
        return fM58820k4 + ((float) (C14116yg.m67466c5((((double) C14116yg.m67480k4(c9790ts.m48236uz())) * 3.141592653589793d) / 180.0d) * ((double) c12013m9.m56639dy())));
    }

    @Override // com.aspose.slides.internal.p276ml.AbstractC6397x1
    /* JADX INFO: renamed from: k4 */
    public C3857k4 mo26252k4(C4047sv c4047sv, AbstractC12008jd abstractC12008jd, C3856h4 c3856h4) {
        C4064x5 c4064x5 = (C4064x5) c4047sv;
        if (c3856h4.m15481jd() == null) {
            return C3857k4.m15543kk();
        }
        C12025x6 c12025x6 = new C12025x6(c4064x5.m16194kk(), c4064x5.m16196to());
        String strM67443x1 = C14113y2.m67443x1(c4064x5.m16197x1(), 0, c4064x5.m16190k4());
        C12013m9 c12013m9M57723k4 = c3856h4.m15481jd().m57723k4(true);
        C9790ts c9790tsM57735ne = c3856h4.m15481jd().m57735ne();
        C11893c5 c11893c5Mo17583x1 = abstractC12008jd.mo17583x1();
        C12007ix c12007ixClone = m58824k4(c12025x6.Clone(), strM67443x1, c9790tsM57735ne, c12013m9M57723k4, c3856h4).Clone();
        float fM58820k4 = C12655u4.m58820k4(c3856h4) * c9790tsM57735ne.m48195k4(c9790tsM57735ne.m48221m9().m48107x1(strM67443x1.charAt(0)).m48286to(), c12013m9M57723k4.m56639dy());
        if (fM58820k4 > 0.0f) {
            fM58820k4 = 0.0f;
        }
        C12007ix c12007ix = new C12007ix(c12007ixClone.m56557jd() + fM58820k4, c12007ixClone.m56551ck(), c12007ixClone.m56550c5() - fM58820k4, c12007ixClone.m56575x1());
        if (c3856h4.m15481jd().m57729kk() != 0) {
            C11913yj c11913yj = new C11913yj();
            c11913yj.m55766k4((-c3856h4.m15481jd().m57729kk()) / 10.0f, c12025x6.Clone());
            C12018u4 c12018u4 = new C12018u4(c12007ix.Clone());
            c12018u4.m56771x1(c11913yj);
            abstractC12008jd.mo17475du();
            c12018u4.m56749k4(abstractC12008jd).CloneTo(c12007ix);
        }
        abstractC12008jd.mo17496k4(c11893c5Mo17583x1);
        return new C3857k4(C12014ne.m56661x1(c12007ix.Clone()).Clone());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C12007ix m58824k4(C12025x6 c12025x6, String str, C9790ts c9790ts, C12013m9 c12013m9, C3856h4 c3856h4) {
        float f;
        float fM56897x1 = c12025x6.m56897x1();
        float fM56895kk = c12025x6.m56895kk();
        int iM48175c5 = c9790ts.m48175c5();
        int iM48177ck = c9790ts.m48177ck();
        int iM48191jd = c9790ts.m48191jd();
        int i = iM48177ck + iM48191jd;
        float fM56639dy = c12013m9.m56639dy() / iM48175c5;
        if ((c3856h4.m15507ks() & 24) != 24) {
            if ((c3856h4.m15507ks() & 8) == 8) {
                f = i;
            }
            float fM58823k4 = m58823k4(str, c9790ts, c12013m9, c3856h4);
            if ((c3856h4.m15507ks() & 6) != 6) {
                fM56897x1 -= fM58823k4 / 2.0f;
            } else if ((c3856h4.m15507ks() & 2) == 2) {
                fM56897x1 -= fM58823k4;
            }
            return new C12007ix(fM56897x1, fM56895kk, fM58823k4, c9790ts.m48195k4(c9790ts.m48185fa(), c12013m9.m56639dy()));
        }
        f = iM48191jd;
        fM56895kk -= f * fM56639dy;
        float fM58823k42 = m58823k4(str, c9790ts, c12013m9, c3856h4);
        if ((c3856h4.m15507ks() & 6) != 6) {
        }
        return new C12007ix(fM56897x1, fM56895kk, fM58823k42, c9790ts.m48195k4(c9790ts.m48185fa(), c12013m9.m56639dy()));
    }
}
