package com.aspose.slides.internal.p321on;

import com.aspose.slides.internal.p081de.C3155to;
import com.aspose.slides.internal.p087dm.C3182du;
import com.aspose.slides.internal.p115eq.C3786fa;
import com.aspose.slides.internal.p115eq.C3794up;
import com.aspose.slides.internal.p300nj.C6914kk;
import com.aspose.slides.internal.p404sp.C10315x1;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12018u4;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.on.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C7127x1 {
    /* JADX INFO: renamed from: k4 */
    private static C6914kk m27668k4(C3182du c3182du, C6914kk c6914kk) {
        C6914kk c6914kk2 = (C6914kk) c6914kk.mo13644yd();
        c6914kk2.f9461x1.m13696x1("display");
        C7125kk.m27658k4(c6914kk2);
        return c6914kk2;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m27669k4(C3155to c3155to, C12015qq c12015qq, C3182du c3182du, C6914kk c6914kk, C12025x6 c12025x6, double d) {
        C3155to c3155to2;
        float f;
        float fM56575x1;
        C6914kk c6914kkM27668k4 = m27668k4(c3182du, c6914kk);
        C11913yj c11913yjMo9688du = c3155to.m13488k4().mo9688du();
        C12018u4 c12018u4Mo9704x1 = c3155to.m13488k4().mo9704x1();
        try {
            C11913yj c11913yjM55760h4 = c11913yjMo9688du.m55760h4();
            c11913yjM55760h4.m55777kk(c12025x6.m56897x1(), c12025x6.m56895kk());
            if (C14113y2.m67432to(C14113y2.m67440x1(c6914kkM27668k4.m27089xk()), "auto", (short) 3)) {
                c11913yjM55760h4.m55762k4((float) d);
            } else {
                c11913yjM55760h4.m55762k4(C10315x1.m50296k4(c6914kkM27668k4.m27089xk(), new C10315x1()).m50300kk());
            }
            C3786fa c3786faM13485du = c3155to.m13485du();
            float f2 = 1.0f;
            if (c6914kkM27668k4.m27086ts()) {
                float fM15125k4 = c3786faM13485du.m15125k4(c3182du.m13649dy(), "xy", c3182du, c12015qq.Clone());
                if (C14116yg.m67480k4(fM15125k4) < 0.001d) {
                    fM15125k4 = 1.0f;
                }
                c11913yjM55760h4.m55763k4(fM15125k4, fM15125k4);
            }
            float fM15125k42 = c3786faM13485du.m15125k4(c6914kkM27668k4.m27076ak(), "x", c3182du, c12015qq.Clone());
            float fM15125k43 = c3786faM13485du.m15125k4(c6914kkM27668k4.m27081dq(), "y", c3182du, c12015qq.Clone());
            C12007ix c12007ix = new C12007ix(C12025x6.f40591k4.Clone(), new C12015qq(fM15125k42, fM15125k43));
            C12007ix c12007ixClone = c12007ix.Clone();
            if (c6914kkM27668k4.m27082e0() != null) {
                c6914kkM27668k4.m27082e0().m50276k4(c3786faM13485du).CloneTo(c12007ixClone);
                C12015qq c12015qqClone = c12007ixClone.m56570m9().Clone();
                f = fM15125k42;
                C12007ix c12007ixClone2 = C3794up.m15154k4(c6914kkM27668k4.m27078bz(), new C12007ix(C12025x6.f40591k4.Clone(), c12015qqClone.Clone()), c12007ix.Clone()).Clone();
                float fM56550c5 = c12007ixClone2.m56550c5() / c12015qqClone.m56699x1();
                fM56575x1 = c12007ixClone2.m56575x1() / c12015qqClone.m56697kk();
                f2 = fM56550c5;
            } else {
                f = fM15125k42;
                fM56575x1 = 1.0f;
            }
            c11913yjM55760h4.m55777kk((-c3786faM13485du.m15125k4(c6914kkM27668k4.m27077b3(), "x", c3182du, c12015qq.Clone())) * f2, (-c3786faM13485du.m15125k4(c6914kkM27668k4.m27087wy(), "y", c3182du, c12015qq.Clone())) * fM56575x1);
            c11913yjM55760h4.m55763k4(f2, fM56575x1);
            c3155to.m13488k4().mo9698k4(c11913yjM55760h4);
            if (c6914kkM27668k4.m13662kk()) {
                c3155to.m13488k4().mo9706x1(new C12018u4(new C12007ix(c12007ixClone.m56557jd(), c12007ixClone.m56551ck(), f / f2, fM15125k43 / fM56575x1)));
            }
            c3155to2 = c3155to;
        } catch (Throwable th) {
            th = th;
            c3155to2 = c3155to;
        }
        try {
            c3155to2.m13489k4(c6914kkM27668k4, c12015qq.Clone(), (C12018u4) null);
            c3155to2.m13488k4().mo9698k4(c11913yjMo9688du);
            c3155to2.m13488k4().mo9706x1(c12018u4Mo9704x1);
        } catch (Throwable th2) {
            th = th2;
            c3155to2.m13488k4().mo9698k4(c11913yjMo9688du);
            c3155to2.m13488k4().mo9706x1(c12018u4Mo9704x1);
            throw th;
        }
    }
}
