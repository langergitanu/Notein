package com.aspose.slides.internal.p344pt;

import com.aspose.slides.internal.p123f5.C3856h4;
import com.aspose.slides.internal.p132fj.C4047sv;
import com.aspose.slides.internal.p132fj.C4064x5;
import com.aspose.slides.internal.p353q7.C9763ck;
import com.aspose.slides.internal.p353q7.C9790ts;
import com.aspose.slides.internal.p472w8.C11893c5;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C11999ar;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p475wh.C12019um;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p510xt.C12655u4;
import com.aspose.slides.internal.p510xt.C12671y9;
import com.aspose.slides.p559ms.System.C14117yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.pt.gk */
/* JADX INFO: loaded from: classes4.dex */
public class C9506gk extends AbstractC9530rv {
    @Override // com.aspose.slides.internal.p344pt.AbstractC9530rv
    /* JADX INFO: renamed from: x1 */
    public void mo46684x1(C4047sv c4047sv, AbstractC12008jd abstractC12008jd, C3856h4 c3856h4) throws Throwable {
        AbstractC12008jd abstractC12008jd2;
        AbstractC12008jd abstractC12008jd3 = abstractC12008jd;
        C4064x5 c4064x5 = (C4064x5) c4047sv;
        C11999ar c11999ar = new C11999ar(c3856h4.m15475fa().Clone());
        C12019um c12019um = new C12019um(C12019um.m56799c5());
        C12025x6 c12025x6 = new C12025x6(c4064x5.m16194kk(), c4064x5.m16196to());
        C12013m9 c12013m9M57723k4 = c3856h4.m15481jd().m57723k4(true);
        C9790ts c9790tsMo48031k4 = C9763ck.m48030to().mo48031k4(c12013m9M57723k4.m56651x1().m56527du(), c12013m9M57723k4.m56642jd());
        String strMo26682x1 = C9527qq.m46686k4(c3856h4.m15481jd().m57722jd(), c9790tsMo48031k4).mo26682x1(c4064x5.m16189h4(), 0, c4064x5.m16190k4());
        C11893c5 c11893c5Mo17583x1 = abstractC12008jd3.mo17583x1();
        C12007ix c12007ixClone = C12671y9.m58824k4(c12025x6.Clone(), strMo26682x1, c9790tsMo48031k4, c12013m9M57723k4, c3856h4).Clone();
        float fM58820k4 = C12655u4.m58820k4(c3856h4) * c9790tsMo48031k4.m48195k4(c9790tsMo48031k4.m48221m9().m48107x1(strMo26682x1.charAt(0)).m48286to(), c12013m9M57723k4.m56639dy());
        if (fM58820k4 > 0.0f) {
            fM58820k4 = 0.0f;
        }
        float[] fArr = {0.0f};
        C11913yj c11913yjM46687k4 = C9527qq.m46687k4(c12025x6.Clone(), abstractC12008jd3, c3856h4, new boolean[]{false}, fArr);
        C12007ix c12007ix = new C12007ix((c12007ixClone.m56557jd() + fM58820k4) * fArr[0], c12007ixClone.m56551ck(), c12007ixClone.m56550c5() - fM58820k4, c12007ixClone.m56575x1());
        if (c3856h4.m15520up() == 2) {
            abstractC12008jd3.mo17593x1(new C11999ar(c3856h4.m15540yj().Clone()), c12007ix.Clone());
        }
        if (c3856h4.m15462bv() > 0) {
            float fM56571to = c12007ix.m56571to();
            float fM56554dy = c12007ix.m56554dy();
            int i = 0;
            float f = fM56571to;
            while (i < strMo26682x1.length()) {
                char cCharAt = strMo26682x1.charAt(i);
                String strM67537ne = C14117yj.m67537ne(cCharAt);
                float fM15462bv = c3856h4.m15462bv() + c9790tsMo48031k4.m48194k4(cCharAt, c12013m9M57723k4.m56639dy());
                C9527qq.m46690k4(abstractC12008jd3, strM67537ne, c12013m9M57723k4, c11999ar, new C12025x6(f, fM56554dy), c12019um, c11913yjM46687k4);
                f += fM15462bv;
                i++;
                abstractC12008jd3 = abstractC12008jd;
            }
            abstractC12008jd2 = abstractC12008jd;
        } else {
            abstractC12008jd2 = abstractC12008jd;
            C9527qq.m46690k4(abstractC12008jd2, strMo26682x1, c12013m9M57723k4, c11999ar, c12007ix.m56552du().Clone(), c12019um, c11913yjM46687k4);
        }
        abstractC12008jd2.mo17496k4(c11893c5Mo17583x1);
    }
}
