package com.aspose.slides.internal.p296nd;

import com.aspose.slides.internal.p042bn.C1752sv;
import com.aspose.slides.internal.p042bn.C1769x5;
import com.aspose.slides.internal.p232kl.C5868u4;
import com.aspose.slides.internal.p232kl.C5884y9;
import com.aspose.slides.internal.p347px.C9579bv;
import com.aspose.slides.internal.p347px.C9580c5;
import com.aspose.slides.internal.p441ui.C11315h4;
import com.aspose.slides.internal.p472w8.C11893c5;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C11999ar;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p475wh.C12019um;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.nd.ig */
/* JADX INFO: loaded from: classes4.dex */
public class C6820ig extends AbstractC6841rv {
    /* JADX INFO: renamed from: k4 */
    private static void m26876k4(AbstractC12008jd abstractC12008jd, String str, C12013m9 c12013m9, AbstractC12024x1 abstractC12024x1, C12025x6 c12025x6, C12019um c12019um, boolean z) throws Throwable {
        AbstractC12008jd abstractC12008jd2;
        C11913yj c11913yjMo17577u4 = abstractC12008jd.mo17577u4();
        try {
            if (z) {
                float[] fArrM55776k4 = c11913yjMo17577u4.m55776k4();
                float f = fArrM55776k4[3];
                abstractC12008jd.mo17588x1(new C11913yj(f, fArrM55776k4[1], fArrM55776k4[2], f, fArrM55776k4[4], fArrM55776k4[5]));
                abstractC12008jd.mo17554k4(str, c12013m9, abstractC12024x1, (c12025x6.m56897x1() * fArrM55776k4[0]) / fArrM55776k4[3], c12025x6.m56895kk(), c12019um);
                abstractC12008jd2 = abstractC12008jd;
            } else {
                abstractC12008jd2 = abstractC12008jd;
                try {
                    abstractC12008jd2.mo17554k4(str, c12013m9, abstractC12024x1, c12025x6.m56897x1(), c12025x6.m56895kk(), c12019um);
                } catch (Throwable th) {
                    th = th;
                    abstractC12008jd2.mo17588x1(c11913yjMo17577u4);
                    throw th;
                }
            }
            abstractC12008jd2.mo17588x1(c11913yjMo17577u4);
        } catch (Throwable th2) {
            th = th2;
            abstractC12008jd2 = abstractC12008jd;
        }
    }

    @Override // com.aspose.slides.internal.p296nd.AbstractC6841rv
    /* JADX INFO: renamed from: x1 */
    public void mo26875x1(C1752sv c1752sv, AbstractC12008jd abstractC12008jd, C11315h4 c11315h4) throws Throwable {
        AbstractC12008jd abstractC12008jd2;
        AbstractC12008jd abstractC12008jd3 = abstractC12008jd;
        C1769x5 c1769x5 = (C1769x5) c1752sv;
        C11999ar c11999ar = new C11999ar(c11315h4.m54405fa().Clone());
        C12019um c12019um = new C12019um(C12019um.m56799c5());
        C12025x6 c12025x6 = new C12025x6(c1769x5.m9524kk(), c1769x5.m9526to());
        String strM67443x1 = C14113y2.m67443x1(c1769x5.m9527x1(), 0, c1769x5.m9520k4());
        C12013m9 c12013m9M58139k4 = c11315h4.m54411jd().m58139k4(true);
        C9579bv c9579bvMo46809k4 = C9580c5.m46807k4().mo46809k4(c12013m9M58139k4.m56651x1().m56527du(), c12013m9M58139k4.m56642jd(), null);
        C11893c5 c11893c5Mo17583x1 = abstractC12008jd3.mo17583x1();
        C12007ix c12007ixClone = C5884y9.m23719k4(c12025x6.Clone(), strM67443x1, c9579bvMo46809k4, c12013m9M58139k4, c11315h4).Clone();
        float fM23715k4 = C5868u4.m23715k4(c11315h4) * c9579bvMo46809k4.m46775k4(c9579bvMo46809k4.m46764du().m46910x1(strM67443x1.charAt(0)).m46756to(), c12013m9M58139k4.m56639dy());
        if (fM23715k4 > 0.0f) {
            fM23715k4 = 0.0f;
        }
        C12007ix c12007ix = new C12007ix(c12007ixClone.m56557jd() + fM23715k4, c12007ixClone.m56551ck(), c12007ixClone.m56550c5() - fM23715k4, c12007ixClone.m56575x1());
        if (c11315h4.m54411jd().m58145kk() != 0) {
            C11913yj c11913yj = new C11913yj();
            c11913yj.m55766k4((-c11315h4.m54411jd().m58145kk()) / 10.0f, c12025x6.Clone());
            abstractC12008jd3.mo17499k4(c11913yj);
        }
        if (c11315h4.m54450up() == 2) {
            abstractC12008jd3.mo17593x1(new C11999ar(c11315h4.m54468yj().Clone()), c12007ix.Clone());
        }
        boolean z = !C14113y2.m67411k4(c11315h4.m54411jd().m58148ks());
        if (c11315h4.m54392ar() > 0) {
            float fM56571to = c12007ix.m56571to();
            float fM56554dy = c12007ix.m56554dy();
            float f = fM56571to;
            int i = 0;
            while (i < strM67443x1.length()) {
                char cCharAt = strM67443x1.charAt(i);
                C12013m9 c12013m9 = c12013m9M58139k4;
                String strM67537ne = C14117yj.m67537ne(cCharAt);
                float fM54392ar = c11315h4.m54392ar() + c9579bvMo46809k4.m46774k4(cCharAt, c12013m9.m56639dy());
                m26876k4(abstractC12008jd3, strM67537ne, c12013m9, c11999ar, new C12025x6(f, fM56554dy), c12019um, z);
                f += fM54392ar;
                i++;
                abstractC12008jd3 = abstractC12008jd;
                c12013m9M58139k4 = c12013m9;
            }
            abstractC12008jd2 = abstractC12008jd;
        } else {
            abstractC12008jd2 = abstractC12008jd;
            m26876k4(abstractC12008jd2, strM67443x1, c12013m9M58139k4, c11999ar, c12007ix.m56552du().Clone(), c12019um, z);
        }
        abstractC12008jd2.mo17496k4(c11893c5Mo17583x1);
    }
}
