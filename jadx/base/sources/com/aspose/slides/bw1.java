package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p407st.C10409du;
import com.aspose.slides.internal.p407st.C10478ib;
import com.aspose.slides.internal.p407st.C10486iy;
import com.aspose.slides.internal.p407st.C10562nk;
import com.aspose.slides.internal.p407st.C10581ov;

/* JADX INFO: loaded from: classes3.dex */
class bw1 {
    /* JADX INFO: renamed from: k4 */
    public static void m4339k4(com.aspose.slides.internal.p332p7.u4g u4gVar, C10409du c10409du, gi8 gi8Var) {
        if (u4gVar == null) {
            return;
        }
        if (c10409du == null) {
            throw new InvalidOperationException();
        }
        C10581ov c10581ov = new C10581ov();
        c10409du.m50513yj().addItem(c10581ov);
        m4341k4(u4gVar, c10581ov);
        C10486iy c10486iy = new C10486iy();
        c10581ov.m50513yj().addItem(c10486iy);
        ubb.m71612k4(u4gVar.m42101to(), c10486iy, gi8Var);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m4340k4(com.aspose.slides.internal.p332p7.u4g u4gVar, C10562nk c10562nk, m4c m4cVar) {
        if (c10562nk == null || c10562nk.m51374ne() == null) {
            throw new InvalidOperationException();
        }
        C10581ov c10581ovM51374ne = c10562nk.m51374ne();
        l1y.m64245k4(u4gVar.m42101to(), c10562nk, c10581ovM51374ne.m51450to(), m4cVar);
        u4gVar.m42098k4(c10581ovM51374ne.m51451x1().m50917x1());
        u4gVar.m42103x1(c10581ovM51374ne.m51451x1().m50913kk());
        u4gVar.m42100kk(c10581ovM51374ne.m51451x1().m50916to());
    }

    /* JADX INFO: renamed from: k4 */
    private static void m4341k4(com.aspose.slides.internal.p332p7.u4g u4gVar, C10581ov c10581ov) {
        float fM42102x1;
        float fM42099kk;
        if (u4gVar == null) {
            throw new ArgumentNullException();
        }
        if (c10581ov == null) {
            throw new ArgumentNullException();
        }
        C10478ib c10478ib = new C10478ib();
        c10581ov.m50513yj().addItem(c10478ib);
        if (u4gVar.m42097k4() != Float.NaN) {
            c10478ib.m50912k4(true);
            c10478ib.m50911k4(u4gVar.m42097k4());
        } else {
            c10478ib.m50912k4(false);
        }
        if (u4gVar.m42102x1() != Float.NaN) {
            c10478ib.m50919x1(true);
            fM42102x1 = u4gVar.m42102x1();
        } else {
            c10478ib.m50919x1(false);
            fM42102x1 = 0.0f;
        }
        c10478ib.m50918x1(fM42102x1);
        if (u4gVar.m42099kk() != Float.NaN) {
            c10478ib.m50915kk(true);
            fM42099kk = u4gVar.m42099kk();
        } else {
            c10478ib.m50915kk(false);
            fM42099kk = 360.0f;
        }
        c10478ib.m50914kk(fM42099kk);
    }
}
