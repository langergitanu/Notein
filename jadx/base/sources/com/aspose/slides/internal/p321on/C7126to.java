package com.aspose.slides.internal.p321on;

import com.aspose.slides.internal.p081de.C3155to;
import com.aspose.slides.internal.p087dm.C3181c5;
import com.aspose.slides.internal.p115eq.C3786fa;
import com.aspose.slides.internal.p298nh.AbstractC6890h4;
import com.aspose.slides.internal.p298nh.AbstractC6897x1;
import com.aspose.slides.internal.p298nh.C6895to;
import com.aspose.slides.internal.p298nh.C6898yj;
import com.aspose.slides.internal.p300nj.C6915to;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p404sp.C10310jd;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12018u4;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.on.to */
/* JADX INFO: loaded from: classes4.dex */
public class C7126to {
    /* JADX INFO: renamed from: k4 */
    public static AbstractC6897x1 m27666k4(C6915to c6915to, C3155to c3155to, C3181c5 c3181c5, C12007ix c12007ix, C12007ix c12007ix2, float f) {
        c6915to.m27099k4(c3155to.m13494to());
        int i = c6915to.m27091b3() == 1 ? 1 : 0;
        C12007ix c12007ixClone = (i != 0 ? c12007ix : c12007ix2).Clone();
        C3786fa c3786faM13485du = c3155to.m13485du();
        int i2 = c3786faM13485du.f10318k4;
        c3786faM13485du.f10318k4 = i;
        float fM15125k4 = c3786faM13485du.m15125k4(c6915to.m27090ak(), "x", c6915to, c12007ixClone.m56570m9().Clone());
        float fM15125k42 = c3786faM13485du.m15125k4(c6915to.m27094dq(), "y", c6915to, c12007ixClone.m56570m9().Clone());
        float fM15125k43 = c3786faM13485du.m15125k4(c6915to.m27107xk(), "width", c6915to, c12007ixClone.m56570m9().Clone());
        float fM15125k44 = c3786faM13485du.m15125k4(c6915to.m27093c6(), "height", c6915to, c12007ixClone.m56570m9().Clone());
        c3786faM13485du.f10318k4 = i2;
        if (C14116yg.m67480k4(fM15125k43) < 0.001d && C14116yg.m67480k4(fM15125k44) < 0.001d) {
            return null;
        }
        C10310jd c10310jdM27104ts = c6915to.m27104ts();
        boolean z = c10310jdM27104ts != null;
        C12007ix c12007ixClone2 = (z ? c10310jdM27104ts.m50276k4(c3786faM13485du) : c12007ix2).Clone();
        C11913yj c11913yj = new C11913yj();
        try {
            boolean z2 = c6915to.m27105wy() == 1;
            C12015qq c12015qq = new C12015qq(fM15125k43, fM15125k44);
            if (z) {
                c11913yj.m55763k4(fM15125k43 / c12007ixClone2.m56550c5(), fM15125k44 / c12007ixClone2.m56575x1());
                c11913yj.m55777kk(-c12007ixClone2.m56557jd(), -c12007ixClone2.m56551ck());
            } else if (z2) {
                c11913yj.m55763k4(c12007ixClone.m56550c5(), c12007ixClone.m56575x1());
            }
            C6895to c6895to = new C6895to(new C12009k4(C7019kk.m27462to(Double.valueOf(C14116yg.m67497to(fM15125k43)), 14), C7019kk.m27462to(Double.valueOf(C14116yg.m67497to(fM15125k44)), 14)));
            AbstractC6890h4 abstractC6890h4M26992k4 = AbstractC6890h4.m26992k4(c6895to);
            try {
                abstractC6890h4M26992k4.mo9698k4(c11913yj);
                abstractC6890h4M26992k4.mo9702kk(2);
                abstractC6890h4M26992k4.mo9705x1(2);
                if (z) {
                    abstractC6890h4M26992k4.mo9706x1(new C12018u4(c12007ixClone2.Clone()));
                }
                m27667k4(new C3155to(abstractC6890h4M26992k4, c3155to.m13491kk(), c3155to.m13494to(), c3786faM13485du, c3155to.m13487h4(), c3155to.m13493m9(), c3155to.m13495x1()), c6915to, c12007ixClone.m56570m9().Clone());
                abstractC6890h4M26992k4.dispose();
                C6898yj c6898yj = new C6898yj(c6895to);
                C11913yj c11913yjM27098k4 = c6915to.m27098k4(c3786faM13485du, c12015qq.Clone());
                c11913yjM27098k4.m55786x1(fM15125k4, fM15125k42, 1);
                c6898yj.m27026k4(c11913yjM27098k4);
                c11913yj.dispose();
                return c6898yj;
            } catch (Throwable th) {
                if (abstractC6890h4M26992k4 != null) {
                    abstractC6890h4M26992k4.dispose();
                }
                throw th;
            }
        } catch (Throwable th2) {
            c11913yj.dispose();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m27667k4(C3155to c3155to, C6915to c6915to, C12015qq c12015qq) {
        if (!c6915to.m13639u4() && c6915to.m27092bz() != null) {
            m27667k4(c3155to, c6915to.m27092bz(), c12015qq.Clone());
        }
        c3155to.m13489k4(c6915to, c12015qq.Clone(), (C12018u4) null);
    }
}
