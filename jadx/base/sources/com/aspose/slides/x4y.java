package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p407st.C10357al;
import com.aspose.slides.internal.p407st.C10409du;
import com.aspose.slides.internal.p407st.C10410dv;
import com.aspose.slides.internal.p407st.C10486iy;
import com.aspose.slides.internal.p407st.C10523ld;
import com.aspose.slides.internal.p407st.C10562nk;
import com.aspose.slides.internal.p407st.C10742z2;

/* JADX INFO: loaded from: classes3.dex */
class x4y {
    /* JADX INFO: renamed from: k4 */
    public static void m73100k4(com.aspose.slides.internal.p332p7.oeg oegVar, C10357al c10357al, m4c m4cVar) {
        if (c10357al == null || c10357al.m50706h4() == null) {
            throw new InvalidOperationException();
        }
        C10523ld c10523ldM50706h4 = c10357al.m50706h4();
        l1y.m64242k4(oegVar.m38216x1(), c10357al, c10523ldM50706h4.m51183to(), m4cVar);
        m73102k4(oegVar, c10523ldM50706h4);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m73101k4(com.aspose.slides.internal.p332p7.oeg oegVar, C10409du c10409du, gi8 gi8Var) {
        if (oegVar == null) {
            return;
        }
        if (c10409du == null) {
            throw new InvalidOperationException();
        }
        C10523ld c10523ld = new C10523ld();
        c10409du.m50513yj().addItem(c10523ld);
        m73103k4(oegVar, c10523ld, gi8Var);
        if (oegVar.m38215kk() != null && oegVar.m38215kk().m34176k4() != null && "strVal".equals(oegVar.m38215kk().m34176k4().m29539k4())) {
            C10742z2 c10742z2 = new C10742z2(((com.aspose.slides.internal.p332p7.bc9) oegVar.m38215kk().m34176k4().m29542x1()).m28815k4());
            c10742z2.m51409um().m51920k4((short) 1);
            c10523ld.m50513yj().addItem(c10742z2);
        }
        C10486iy c10486iy = new C10486iy();
        c10523ld.m50513yj().addItem(c10486iy);
        ubb.m71612k4(oegVar.m38216x1(), c10486iy, gi8Var);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m73102k4(com.aspose.slides.internal.p332p7.oeg oegVar, C10523ld c10523ld) {
        if (c10523ld == null) {
            throw new InvalidOperationException();
        }
        if (c10523ld.m51184x1() != null) {
            ((com.aspose.slides.internal.p332p7.bc9) oegVar.m38214k4().m34177k4("strVal").m29542x1()).m28816k4(c10523ld.m51184x1().m52123du());
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m73103k4(com.aspose.slides.internal.p332p7.oeg oegVar, C10523ld c10523ld, gi8 gi8Var) {
        if (oegVar == null) {
            throw new ArgumentNullException();
        }
        if (c10523ld == null) {
            throw new ArgumentNullException();
        }
        C10410dv c10410dv = new C10410dv();
        c10523ld.m50513yj().addItem(c10410dv);
        if (oegVar.m38215kk() == null || oegVar.m38215kk().m34176k4() == null) {
            c10410dv.m50712k4(false);
            c10410dv.m50711k4(1);
        } else if (!"strVal".equals(oegVar.m38215kk().m34176k4().m29539k4())) {
            gi8Var.m6691k4("Writing of the animation set behavior failed.", 1);
        } else {
            c10410dv.m50712k4(true);
            c10410dv.m50711k4(1);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m73104k4(com.aspose.slides.internal.p332p7.oeg oegVar, C10562nk c10562nk, m4c m4cVar) {
        if (c10562nk == null || c10562nk.m50706h4() == null) {
            throw new InvalidOperationException();
        }
        C10523ld c10523ldM50706h4 = c10562nk.m50706h4();
        l1y.m64245k4(oegVar.m38216x1(), c10562nk, c10523ldM50706h4.m51183to(), m4cVar);
        m73102k4(oegVar, c10523ldM50706h4);
    }
}
