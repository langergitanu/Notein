package com.aspose.slides;

import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.C10405dn;
import com.aspose.slides.internal.p407st.C10487j0;
import com.aspose.slides.internal.p407st.C10541md;
import com.aspose.slides.internal.p407st.C10575of;
import com.aspose.slides.internal.p407st.C10626rv;
import com.aspose.slides.internal.p407st.C10678v6;
import com.aspose.slides.p559ms.System.C14093tq;

/* JADX INFO: loaded from: classes3.dex */
class yiz {
    /* JADX INFO: renamed from: k4 */
    private static void m73910k4(jio jioVar, TextStyle textStyle) {
        if (jioVar == null) {
            return;
        }
        jioVar.m63331k4(textStyle);
    }

    /* JADX INFO: renamed from: kk */
    public static void m73914kk(rpo rpoVar) {
        C10487j0 c10487j0M70212jd = rpoVar.m70212jd();
        c10487j0M70212jd.m50981k4(0L);
        c10487j0M70212jd.m50983x1(0L);
        c10487j0M70212jd.m51114kk(false);
        c10487j0M70212jd.m51113k4(false);
        c10487j0M70212jd.m51117x1(false);
        if (!rpoVar.m70215k4().m73711k4(c10487j0M70212jd)) {
            c10487j0M70212jd.m50980k4(16);
        }
        c10487j0M70212jd.m50980k4(1);
        c10487j0M70212jd.m50979dy()[0] = 1;
        c10487j0M70212jd.m50979dy()[1] = 2;
        c10487j0M70212jd.m50979dy()[2] = 7;
        c10487j0M70212jd.m50979dy()[3] = 9;
        c10487j0M70212jd.m50979dy()[4] = 8;
    }

    /* JADX INFO: renamed from: x1 */
    public static void m73915x1(m4c m4cVar) {
        MasterSlide masterSlide = (MasterSlide) C7019kk.m27452k4((Object) m4cVar.m64735up(), MasterSlide.class);
        if (masterSlide == null) {
            return;
        }
        m73910k4(m4cVar.m64745yj()[0], masterSlide.f2698m9);
        m73910k4(m4cVar.m64745yj()[1], masterSlide.f2693dy);
        m73910k4(m4cVar.m64745yj()[4], masterSlide.f2694fa);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m73911k4(m4c m4cVar) {
        if (((MasterSlide) m4cVar.m64735up()) == null) {
            throw new NullReferenceException("Can't create target DOM MasterSlide!");
        }
        if (m4cVar.m64707b3()) {
            gh7.m6661x1(m4cVar);
        }
        C1240i5.m7462k4(m4cVar);
    }

    /* JADX INFO: renamed from: x1 */
    public static void m73916x1(rpo rpoVar) {
        y2n y2nVarM70215k4 = rpoVar.m70215k4();
        MasterSlide masterSlide = (MasterSlide) C7019kk.m27452k4((Object) rpoVar.m70235x1(), MasterSlide.class);
        if (rpoVar.m70220kk() == 2) {
            masterSlide = (MasterSlide) C7019kk.m27452k4((Object) ((LayoutSlide) rpoVar.m70235x1()).getMasterSlide(), MasterSlide.class);
        }
        C10678v6 c10678v6 = (C10678v6) rpoVar.m70228to();
        knj[] knjVarArrM70241yj = rpoVar.m70241yj();
        for (int i = 0; i < 9; i++) {
            if (i != 3) {
                knj knjVar = new knj(i, rpoVar);
                knjVarArrM70241yj[i] = knjVar;
                c10678v6.m50507k4(knjVar.m64051x1());
            }
        }
        ai5.m3611k4(knjVarArrM70241yj[0].m64051x1(), masterSlide.getTitleStyle(), y2nVarM70215k4);
        ai5.m3611k4(knjVarArrM70241yj[1].m64051x1(), masterSlide.getBodyStyle(), y2nVarM70215k4);
        knjVarArrM70241yj[1].m64050k4();
        ai5.m3611k4(knjVarArrM70241yj[4].m64051x1(), masterSlide.getOtherStyle(), y2nVarM70215k4);
        ai5.m3611k4(knjVarArrM70241yj[6].m64051x1(), masterSlide.m1941uz(), y2nVarM70215k4);
        ai5.m3611k4(knjVarArrM70241yj[5].m64051x1(), masterSlide.m1942wl(), y2nVarM70215k4);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m73912k4(rpo rpoVar) {
        MasterSlide masterSlide = (MasterSlide) rpoVar.m70235x1();
        C10678v6 c10678v6 = (C10678v6) rpoVar.m70228to();
        rpoVar.m70215k4().m73701k4(masterSlide);
        m73916x1(rpoVar);
        td3.m71110k4(rpoVar);
        C1240i5.m7464k4(rpoVar);
        m73914kk(rpoVar);
        C10626rv c10626rv = new C10626rv("Office Theme", (short) 2);
        c10626rv.m51409um().m51916k4((byte) 0);
        c10678v6.m50513yj().addItem(c10626rv);
        c10678v6.m51844k4(masterSlide.getThemeManager().getOverrideTheme().getName());
        cn8.m4692k4(rpoVar);
        m73913k4(rpoVar, (TextStyle) masterSlide.getTitleStyle());
        m73913k4(rpoVar, (TextStyle) masterSlide.getBodyStyle());
        m73913k4(rpoVar, (TextStyle) masterSlide.getOtherStyle());
        m73913k4(rpoVar, (TextStyle) masterSlide.m1941uz());
        m73913k4(rpoVar, (TextStyle) masterSlide.m1942wl());
        m73913k4(rpoVar, (TextStyle) masterSlide.m1940u4());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m73913k4(rpo rpoVar, TextStyle textStyle) {
        if (textStyle == null || !textStyle.m2979du().m67302x1()) {
            return;
        }
        C10678v6 c10678v6 = (C10678v6) rpoVar.m70228to();
        C10575of c10575of = new C10575of();
        c10575of.m51409um().m51920k4((short) textStyle.m2979du().m67297k4().intValue());
        boolean z = false;
        for (int i = 0; i < 5; i++) {
            IParagraphFormat level = textStyle.getLevel(i);
            if (level != null) {
                BulletFormat bulletFormat = (BulletFormat) level.getBullet();
                C10541md c10541md = new C10541md();
                if (bulletFormat.getType() == 2) {
                    c10541md.m51281k4().m51667k4((byte) 1);
                    c10541md.m51281k4().m51668k4(new C10405dn(bulletFormat.getNumberedBulletStyle(), bulletFormat.getNumberedBulletStartWith()));
                    z = true;
                }
                if (bulletFormat.getType() == 3) {
                    c10541md.m51281k4().m51667k4((byte) 0);
                    c10541md.m51281k4().m51669k4(new C14093tq<>(Short.valueOf((short) rpoVar.m70215k4().m71948k4(bulletFormat.getPicture().getImage()).m71724to())));
                    z = true;
                }
                c10575of.m51428kk().addItem(c10541md);
            }
        }
        if (z) {
            c10678v6.m51756du().m51388h4().m50507k4(c10575of);
        }
    }
}
