package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.C10409du;
import com.aspose.slides.internal.p407st.C10416e6;
import com.aspose.slides.internal.p407st.C10427ep;
import com.aspose.slides.internal.p407st.C10486iy;
import com.aspose.slides.internal.p407st.C10562nk;
import com.aspose.slides.internal.p407st.C10638sn;
import com.aspose.slides.internal.p407st.C10742z2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class sgr {
    /* JADX INFO: renamed from: k4 */
    private static byte m70617k4(C10416e6 c10416e6) {
        if (c10416e6.m50729x1() == null || !c10416e6.m50729x1().m51685x1()) {
            return (byte) -1;
        }
        int iM51682to = (int) c10416e6.m50729x1().m51682to();
        if (iM51682to != 0) {
            return iM51682to != 1 ? (byte) -1 : (byte) 2;
        }
        return (byte) 1;
    }

    /* JADX INFO: renamed from: x1 */
    private static String m70622x1(C10416e6 c10416e6) {
        C10742z2 c10742z2;
        if (c10416e6.m50729x1() == null || !c10416e6.m50729x1().m51681kk() || (c10742z2 = (C10742z2) C7019kk.m27452k4((Object) c10416e6.m50728to(), C10742z2.class)) == null) {
            return null;
        }
        return c10742z2.m52123du();
    }

    /* JADX INFO: renamed from: k4 */
    private static long m70618k4(byte b, gi8 gi8Var) {
        if (b == 1) {
            return 0L;
        }
        if (b == 2) {
            return 1L;
        }
        gi8Var.m6691k4("Writing of the animation effect behavior transition failed.", 1);
        return 0L;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m70619k4(com.aspose.slides.internal.p332p7.i4y i4yVar, C10409du c10409du, gi8 gi8Var) {
        if (i4yVar == null) {
            return;
        }
        if (c10409du == null) {
            throw new InvalidOperationException();
        }
        C10416e6 c10416e6 = new C10416e6();
        c10409du.m50513yj().addItem(c10416e6);
        m70620k4(i4yVar, c10416e6, gi8Var);
        if (!C14113y2.m67411k4(i4yVar.m33857x1())) {
            C10742z2 c10742z2 = new C10742z2(i4yVar.m33857x1());
            c10742z2.m51409um().m51920k4((short) 1);
            c10416e6.m50513yj().addItem(c10742z2);
        }
        if (i4yVar.m33851du() != null && i4yVar.m33851du().m34176k4() != null && "fltVal".equals(i4yVar.m33851du().m34176k4().m29539k4())) {
            c10416e6.m50513yj().addItem(new C10427ep(((com.aspose.slides.internal.p332p7.mox) i4yVar.m33851du().m34176k4().m29542x1()).m37034k4()));
        }
        C10486iy c10486iy = new C10486iy();
        c10416e6.m50513yj().addItem(c10486iy);
        ubb.m71612k4(i4yVar.m33856to(), c10486iy, gi8Var);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m70620k4(com.aspose.slides.internal.p332p7.i4y i4yVar, C10416e6 c10416e6, gi8 gi8Var) {
        long jM70618k4;
        if (i4yVar == null) {
            throw new ArgumentNullException();
        }
        if (c10416e6 == null) {
            throw new ArgumentNullException();
        }
        C10638sn c10638sn = new C10638sn();
        c10416e6.m50513yj().addItem(c10638sn);
        if (i4yVar.m33852k4() != -1) {
            c10638sn.m51679k4(true);
            jM70618k4 = m70618k4(i4yVar.m33852k4(), gi8Var);
        } else {
            c10638sn.m51679k4(false);
            jM70618k4 = 0;
        }
        c10638sn.m51678k4(jM70618k4);
        if (C14113y2.m67411k4(i4yVar.m33857x1())) {
            c10638sn.m51684x1(false);
        } else {
            c10638sn.m51684x1(true);
        }
        if (i4yVar.m33851du() == null || i4yVar.m33851du().m34176k4() == null) {
            c10638sn.m51680kk(false);
        } else if ("fltVal".equals(i4yVar.m33851du().m34176k4().m29539k4())) {
            c10638sn.m51680kk(true);
        } else {
            c10638sn.m51680kk(false);
            gi8Var.m6691k4("Writing of the animation effect behavior failed.", 1);
        }
        c10638sn.m51683to(false);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m70621k4(com.aspose.slides.internal.p332p7.i4y i4yVar, C10562nk c10562nk, m4c m4cVar) {
        if (c10562nk == null || c10562nk.m51376rv() == null) {
            throw new InvalidOperationException();
        }
        l1y.m64245k4(i4yVar.m33856to(), c10562nk, c10562nk.m51376rv().m50727du(), m4cVar);
        i4yVar.m33853k4(m70617k4(c10562nk.m51376rv()));
        i4yVar.m33854k4(m70622x1(c10562nk.m51376rv()));
    }
}
