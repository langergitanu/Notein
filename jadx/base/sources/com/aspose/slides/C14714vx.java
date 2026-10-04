package com.aspose.slides;

import OooOoO.C20503OooO00o;
import Oooo0oO.C21034OooOOOo;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.vx */
/* JADX INFO: loaded from: classes3.dex */
class C14714vx extends AbstractC7020m9<C14714vx> {
    /* JADX INFO: renamed from: k4 */
    private static int m72557k4(boolean z, C14787xi c14787xi) {
        C14365qy c14365qyM73423wy = c14787xi.m73423wy();
        double dM73412rv = c14787xi.m73412rv();
        double dM73432yj = c14787xi.m73432yj();
        double dM73405ks = c14787xi.m73405ks();
        double d = c14787xi.m73384dy().isPlotOrderReversed() ? dM73432yj - dM73412rv : dM73412rv - dM73405ks;
        float fM64100du = c14365qyM73423wy.m69833e0().m64100du();
        if (z) {
            fM64100du = c14365qyM73423wy.m69833e0().m64121to();
        }
        return com.aspose.slides.Collections.Generic.OooO00o.OooO00o(d / (dM73432yj - dM73405ks), fM64100du, 14);
    }

    /* JADX INFO: renamed from: kk */
    private static boolean m72564kk(int i) {
        if (i == 25) {
            return true;
        }
        switch (i) {
            case 50:
            case 51:
            case 52:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: to */
    private static boolean m72565to(int i) {
        return i == 27 || i == 30;
    }

    /* JADX INFO: renamed from: x1 */
    private static boolean m72566x1(int i) {
        return i == 4 || i == 5 || i == 8 || i == 9 || i == 12 || i == 13 || i == 16 || i == 17 || i == 36 || i == 37 || i == 39 || i == 40 || i == 42 || i == 43 || i == 45 || i == 46;
    }

    public Object clone() {
        return Clone();
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof C14714vx) {
            return m72567x1((C14714vx) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m72567x1(C14714vx c14714vx) {
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12025x6 m72558k4(C12025x6 c12025x6) {
        return new C12025x6(c12025x6.m56897x1(), c12025x6.m56895kk());
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C14714vx Clone() {
        C14714vx c14714vx = new C14714vx();
        CloneTo(c14714vx);
        return c14714vx;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m72559k4(C12014ne c12014ne, boolean z, C14365qy c14365qy) {
        double dM56663c5;
        double dM56663c52;
        double dM56663c53;
        double dM56663c54;
        double d;
        double d2;
        C13743kq c13743kqM69833e0;
        float f;
        if (m72565to(c14365qy.m69834fa().getType())) {
            return;
        }
        double dM69822ar = ((double) c14365qy.m69822ar()) / 100.0d;
        double dOooO0O0 = (OooOO0O.OooO0O0(c14365qy.m69834fa(), 0) & 65535) / 100.0f;
        double gapWidth = ((double) (c14365qy.m69834fa().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapWidth() & 65535)) / 100.0d;
        int iM69819to = C14365qy.m69819to(c14365qy.m69865up());
        int size = c14365qy.m69865up().size();
        if (m72566x1(c14365qy.m69834fa().getType())) {
            size = 1;
        }
        if (c14365qy.m69854ne().m73384dy().getCategoryAxisType() == 1) {
            iM69819to = m72564kk(c14365qy.m69834fa().getType()) ? c14365qy.m69854ne().m73373ak() : C0841c4.m4455k4(c14365qy.m69854ne().m73384dy().getBaseUnitScale(), C7019kk.m27462to(Double.valueOf(c14365qy.m69854ne().m73389ix()), 14), C7019kk.m27462to(Double.valueOf(c14365qy.m69854ne().m73410ne()), 14), C7019kk.m27462to(Double.valueOf(c14365qy.m69854ne().m73389ix()), 14), false) + 1;
        } else if (m72564kk(c14365qy.m69834fa().getType())) {
            iM69819to = C14787xi.m73370k4(c14365qy.m69854ne(), iM69819to);
        }
        double d3 = !m72563k4(c14365qy.m69834fa().getType()) ? ((((double) size) + gapWidth) * ((double) iM69819to)) / ((dOooO0O0 * dM69822ar) + dM69822ar) : ((double) iM69819to) / (((double) size) * dM69822ar);
        double dM67475k4 = C14116yg.m67475k4(C14116yg.m67495m9((((double) c14365qy.m69829dq()) * 3.141592653589793d) / 180.0d));
        int iM69877xk = c14365qy.m69877xk() % 90;
        if (iM69877xk >= 45) {
            iM69877xk = 90 - iM69877xk;
        }
        double dM67495m9 = C14116yg.m67495m9((((double) iM69877xk) * 3.141592653589793d) / 180.0d);
        int iM69877xk2 = c14365qy.m69877xk() / 45;
        float f2 = (c14365qy.m69865up().size() == 1 && (c14365qy.m69834fa().getType() == 6 || c14365qy.m69834fa().getType() == 14 || c14365qy.m69834fa().getType() == 10 || c14365qy.m69834fa().getType() == 18)) ? 0.67f : 1.0f;
        switch (iM69877xk2) {
            case 0:
            case 3:
            case 4:
            case 7:
            case 8:
                int iM56663c5 = c12014ne.m56663c5();
                if (!z) {
                    dM56663c5 = ((double) iM56663c5) / ((dM67495m9 / d3) + 1.0d);
                    dM56663c53 = c12014ne.m56663c5() * c12014ne.m56683x1();
                    dM56663c54 = (((double) c12014ne.m56663c5()) * dM67475k4) / d3;
                    dM56663c52 = dM56663c53 / (dM56663c54 + ((double) c12014ne.m56683x1()));
                    double d4 = dM56663c5;
                    d = dM56663c52;
                    d2 = d4;
                } else {
                    dM56663c5 = ((double) (c12014ne.m56663c5() * iM56663c5)) / (((((double) c12014ne.m56683x1()) * dM67495m9) / d3) + ((double) c12014ne.m56663c5()));
                    dM56663c52 = ((double) c12014ne.m56663c5()) / ((dM67475k4 / d3) + 1.0d);
                    double d42 = dM56663c5;
                    d = dM56663c52;
                    d2 = d42;
                }
                break;
            case 1:
            case 2:
            case 5:
            case 6:
                dM56663c5 = ((double) c12014ne.m56663c5()) / ((1.0d / d3) + dM67495m9);
                dM56663c53 = c12014ne.m56663c5() * c12014ne.m56683x1();
                dM56663c54 = ((double) c12014ne.m56663c5()) * dM67475k4;
                dM56663c52 = dM56663c53 / (dM56663c54 + ((double) c12014ne.m56683x1()));
                double d422 = dM56663c5;
                d = dM56663c52;
                d2 = d422;
                break;
            default:
                d2 = 0.0d;
                d = 0.0d;
                break;
        }
        double dM56683x1 = (((double) c12014ne.m56683x1()) * d2) / ((double) c12014ne.m56663c5());
        double dM56683x12 = (((double) c12014ne.m56683x1()) * d) / ((double) c12014ne.m56663c5());
        if (dM56683x1 < dM56683x12) {
            c14365qy.m69833e0().m64115kk((float) d2);
            c13743kqM69833e0 = c14365qy.m69833e0();
            f = (float) dM56683x1;
        } else {
            c14365qy.m69833e0().m64115kk((float) d);
            c13743kqM69833e0 = c14365qy.m69833e0();
            f = (float) dM56683x12;
        }
        c13743kqM69833e0.m64122to(f);
        c14365qy.m69833e0().m64122to(c14365qy.m69833e0().m64100du() * f2);
        C13743kq c13743kqM69833e02 = c14365qy.m69833e0();
        C13743kq c13743kqM69833e03 = c14365qy.m69833e0();
        c13743kqM69833e02.m64101du((float) (((double) (!z ? c13743kqM69833e03.m64121to() : c13743kqM69833e03.m64100du())) / d3));
        c14365qy.m69833e0().m64111k4(C20503OooO00o.OooO0O0(c12014ne.m56663c5(), c14365qy.m69833e0().m64121to(), 2.0f, c12014ne.m56669jd()));
        c14365qy.m69833e0().m64125x1((c12014ne.m56683x1() + c12014ne.m56664ck()) - ((c12014ne.m56683x1() - c14365qy.m69833e0().m64100du()) / 2.0f));
    }

    /* JADX INFO: renamed from: k4 */
    private static void m72560k4(C14365qy c14365qy, C12025x6[] c12025x6Arr, boolean z) {
        C12025x6 c12025x6Clone;
        C12025x6 c12025x6;
        if (c14365qy.m69829dq() > 0) {
            C11896dy c11896dy = new C11896dy();
            if (z) {
                c11896dy.m55547k4(c12025x6Arr[0].Clone(), c12025x6Arr[3].Clone());
                c11896dy.m55547k4(c12025x6Arr[3].Clone(), c12025x6Arr[7].Clone());
                c11896dy.m55547k4(c12025x6Arr[7].Clone(), c12025x6Arr[4].Clone());
                c12025x6Clone = c12025x6Arr[4].Clone();
                c12025x6 = c12025x6Arr[0];
            } else {
                c11896dy.m55547k4(c12025x6Arr[0].Clone(), c12025x6Arr[1].Clone());
                c11896dy.m55547k4(c12025x6Arr[1].Clone(), c12025x6Arr[2].Clone());
                c11896dy.m55547k4(c12025x6Arr[2].Clone(), c12025x6Arr[3].Clone());
                c12025x6Clone = c12025x6Arr[3].Clone();
                c12025x6 = c12025x6Arr[0];
            }
            c11896dy.m55547k4(c12025x6Clone, c12025x6.Clone());
            c14365qy.m69825bz().m64112k4(c11896dy);
        }
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C14714vx c14714vx) {
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x0b32  */
    /* JADX WARN: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m72561k4(boolean z, C14365qy c14365qy) {
        float fM64121to;
        float fM64117m9;
        char c;
        C12025x6 c12025x6;
        C12025x6 c12025x62;
        char c2;
        C11896dy c11896dy;
        C11896dy c11896dy2;
        C12025x6 c12025x63;
        C12025x6 c12025x64;
        C12025x6 c12025x65;
        C12025x6 c12025x66;
        C12025x6 c12025x67;
        C12025x6 c12025x68;
        C12025x6 c12025x69;
        C12025x6 c12025x610;
        C12025x6 c12025x611;
        C12025x6 c12025x612;
        C12025x6 c12025x613;
        C12025x6 c12025x614;
        C12025x6 c12025x615;
        C12025x6 c12025x616;
        C12025x6 c12025x617;
        C12025x6 c12025x618;
        C12025x6 c12025x619;
        C12025x6 c12025x620;
        C12025x6 c12025x621;
        C12025x6 c12025x622;
        C12025x6 c12025x623;
        C12025x6 c12025x624;
        C12025x6 c12025x625;
        C12025x6 c12025x626;
        int iM72557k4;
        char c3;
        C12025x6 c12025x627;
        C12025x6 c12025x628;
        C12025x6 c12025x629;
        C12025x6 c12025x630;
        if (m72565to(c14365qy.m69834fa().getType())) {
            return;
        }
        C12025x6 c12025x631 = new C12025x6(c14365qy.m69833e0().m64106h4(), c14365qy.m69833e0().m64114kk());
        int iM69877xk = c14365qy.m69877xk() % 90;
        if (iM69877xk >= 45) {
            iM69877xk = 90 - iM69877xk;
        }
        int iM69877xk2 = c14365qy.m69877xk() / 45;
        if (iM69877xk2 == 0 || iM69877xk2 == 3 || iM69877xk2 == 4 || iM69877xk2 == 7 || iM69877xk2 == 8) {
            fM64121to = c14365qy.m69833e0().m64121to();
            fM64117m9 = c14365qy.m69833e0().m64117m9();
        } else {
            fM64121to = c14365qy.m69833e0().m64117m9();
            fM64117m9 = c14365qy.m69833e0().m64121to();
        }
        float fM67495m9 = ((float) C14116yg.m67495m9((((double) iM69877xk) * 3.141592653589793d) / 180.0d)) * fM64117m9;
        float fM67495m92 = fM64117m9 * ((float) C14116yg.m67495m9((((double) c14365qy.m69829dq()) * 3.141592653589793d) / 180.0d));
        C12025x6[] c12025x6Arr = (C12025x6[]) C22200OooO0o0.OooO00o(C12025x6.class, 8);
        switch (iM69877xk2) {
            case 0:
            case 8:
                c = 4;
                C22227OoooO.OooO0O0(fM64121to, fM67495m9, 2.0f, c12025x631.m56897x1(), c12025x6Arr[0]);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[0], c12025x6Arr[1], fM64121to);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[1], c12025x6Arr[2], fM67495m9);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[0], c12025x6Arr[3], fM67495m9);
                c12025x6Arr[0].m56898x1((fM67495m92 / 2.0f) + c12025x631.m56895kk());
                c12025x6Arr[1].m56898x1(c12025x6Arr[0].m56895kk());
                OooOOO.OooO0OO(c12025x6Arr[1], c12025x6Arr[2], fM67495m92);
                c12025x6 = c12025x6Arr[3];
                c12025x62 = c12025x6Arr[2];
                c12025x6.m56898x1(c12025x62.m56895kk());
                break;
            case 1:
                c = 4;
                C22227OoooO.OooO0O0(fM64121to, fM67495m9, 2.0f, c12025x631.m56897x1(), c12025x6Arr[0]);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[0], c12025x6Arr[1], fM67495m9);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[1], c12025x6Arr[2], fM64121to);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[0], c12025x6Arr[3], fM64121to);
                C22207OooOOoo.OooO0O0(c12025x6Arr[0], fM67495m92, 2.0f, c12025x631.m56895kk());
                C22231OoooOO0.OooO00o(c12025x6Arr[0], c12025x6Arr[1], fM67495m92);
                c12025x6Arr[2].m56898x1(c12025x6Arr[1].m56895kk());
                c12025x6 = c12025x6Arr[3];
                c12025x62 = c12025x6Arr[0];
                c12025x6.m56898x1(c12025x62.m56895kk());
                break;
            case 2:
                c = 4;
                C22227OoooO.OooO0O0(fM64121to, fM67495m9, 2.0f, c12025x631.m56897x1(), c12025x6Arr[1]);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[1], c12025x6Arr[0], fM67495m9);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[1], c12025x6Arr[2], fM64121to);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[0], c12025x6Arr[3], fM64121to);
                C22207OooOOoo.OooO0O0(c12025x6Arr[0], fM67495m92, 2.0f, c12025x631.m56895kk());
                C22231OoooOO0.OooO00o(c12025x6Arr[0], c12025x6Arr[1], fM67495m92);
                c12025x6Arr[2].m56898x1(c12025x6Arr[1].m56895kk());
                c12025x6 = c12025x6Arr[3];
                c12025x62 = c12025x6Arr[0];
                c12025x6.m56898x1(c12025x62.m56895kk());
                break;
            case 3:
                c = 4;
                C22227OoooO.OooO0O0(fM64121to, fM67495m9, 2.0f, c12025x631.m56897x1(), c12025x6Arr[1]);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[1], c12025x6Arr[0], fM64121to);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[1], c12025x6Arr[2], fM67495m9);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[2], c12025x6Arr[3], fM64121to);
                C22207OooOOoo.OooO0O0(c12025x6Arr[0], fM67495m92, 2.0f, c12025x631.m56895kk());
                c12025x6Arr[1].m56898x1(c12025x6Arr[0].m56895kk());
                C22231OoooOO0.OooO00o(c12025x6Arr[1], c12025x6Arr[2], fM67495m92);
                c12025x6 = c12025x6Arr[3];
                c12025x62 = c12025x6Arr[2];
                c12025x6.m56898x1(c12025x62.m56895kk());
                break;
            case 4:
                c = 4;
                c12025x6Arr[0].m56891k4(((fM64121to + fM67495m9) / 2.0f) + c12025x631.m56897x1());
                C21034OooOOOo.OooO0OO(c12025x6Arr[0], c12025x6Arr[1], fM64121to);
                C21034OooOOOo.OooO0OO(c12025x6Arr[1], c12025x6Arr[2], fM67495m9);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[2], c12025x6Arr[3], fM64121to);
                C22207OooOOoo.OooO0O0(c12025x6Arr[0], fM67495m92, 2.0f, c12025x631.m56895kk());
                c12025x6Arr[1].m56898x1(c12025x6Arr[0].m56895kk());
                C22231OoooOO0.OooO00o(c12025x6Arr[1], c12025x6Arr[2], fM67495m92);
                c12025x6 = c12025x6Arr[3];
                c12025x62 = c12025x6Arr[2];
                c12025x6.m56898x1(c12025x62.m56895kk());
                break;
            case 5:
                c = 4;
                c12025x6Arr[0].m56891k4(((fM64121to + fM67495m9) / 2.0f) + c12025x631.m56897x1());
                C21034OooOOOo.OooO0OO(c12025x6Arr[0], c12025x6Arr[1], fM67495m9);
                C21034OooOOOo.OooO0OO(c12025x6Arr[1], c12025x6Arr[2], fM64121to);
                C21034OooOOOo.OooO0OO(c12025x6Arr[0], c12025x6Arr[3], fM64121to);
                c12025x6Arr[0].m56898x1((fM67495m92 / 2.0f) + c12025x631.m56895kk());
                OooOOO.OooO0OO(c12025x6Arr[0], c12025x6Arr[1], fM67495m92);
                c12025x6Arr[2].m56898x1(c12025x6Arr[1].m56895kk());
                c12025x6 = c12025x6Arr[3];
                c12025x62 = c12025x6Arr[0];
                c12025x6.m56898x1(c12025x62.m56895kk());
                break;
            case 6:
                c = 4;
                c12025x6Arr[1].m56891k4(((fM64121to + fM67495m9) / 2.0f) + c12025x631.m56897x1());
                C21034OooOOOo.OooO0OO(c12025x6Arr[1], c12025x6Arr[0], fM67495m9);
                C21034OooOOOo.OooO0OO(c12025x6Arr[1], c12025x6Arr[2], fM64121to);
                C21034OooOOOo.OooO0OO(c12025x6Arr[0], c12025x6Arr[3], fM64121to);
                c12025x6Arr[0].m56898x1((fM67495m92 / 2.0f) + c12025x631.m56895kk());
                OooOOO.OooO0OO(c12025x6Arr[0], c12025x6Arr[1], fM67495m92);
                c12025x6Arr[2].m56898x1(c12025x6Arr[1].m56895kk());
                c12025x6 = c12025x6Arr[3];
                c12025x62 = c12025x6Arr[0];
                c12025x6.m56898x1(c12025x62.m56895kk());
                break;
            case 7:
                c = 4;
                c12025x6Arr[1].m56891k4(((fM64121to + fM67495m9) / 2.0f) + c12025x631.m56897x1());
                C21034OooOOOo.OooO0OO(c12025x6Arr[1], c12025x6Arr[0], fM64121to);
                C21034OooOOOo.OooO0OO(c12025x6Arr[1], c12025x6Arr[2], fM67495m9);
                C21034OooOOOo.OooO0OO(c12025x6Arr[2], c12025x6Arr[3], fM64121to);
                c12025x6Arr[0].m56898x1((fM67495m92 / 2.0f) + c12025x631.m56895kk());
                c12025x6Arr[1].m56898x1(c12025x6Arr[0].m56895kk());
                OooOOO.OooO0OO(c12025x6Arr[1], c12025x6Arr[2], fM67495m92);
                c12025x6 = c12025x6Arr[3];
                c12025x62 = c12025x6Arr[2];
                c12025x6.m56898x1(c12025x62.m56895kk());
                break;
            default:
                c = 4;
                break;
        }
        c12025x6Arr[c].m56891k4(c12025x6Arr[0].m56897x1());
        c12025x6Arr[5].m56891k4(c12025x6Arr[1].m56897x1());
        c12025x6Arr[6].m56891k4(c12025x6Arr[2].m56897x1());
        c12025x6Arr[7].m56891k4(c12025x6Arr[3].m56897x1());
        c12025x6Arr[c].m56898x1(c12025x6Arr[0].m56895kk() - c14365qy.m69833e0().m64100du());
        c12025x6Arr[5].m56898x1(c12025x6Arr[1].m56895kk() - c14365qy.m69833e0().m64100du());
        c12025x6Arr[6].m56898x1(c12025x6Arr[2].m56895kk() - c14365qy.m69833e0().m64100du());
        c12025x6Arr[7].m56898x1(c12025x6Arr[3].m56895kk() - c14365qy.m69833e0().m64100du());
        C12025x6[] c12025x6Arr2 = (C12025x6[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12025x6.class), 6));
        if (!z) {
            if (c14365qy.m69829dq() > 0) {
                C11896dy c11896dy3 = new C11896dy();
                c2 = 6;
                c11896dy3.m55570to(new C12025x6[]{c12025x6Arr[0], c12025x6Arr[1], c12025x6Arr[2], c12025x6Arr[3]});
                c14365qy.m69825bz().m64113k4(c11896dy3, 0.7f);
            } else {
                c2 = 6;
            }
            switch (iM69877xk2) {
                case 0:
                case 1:
                case 8:
                    c11896dy = new C11896dy();
                    c11896dy.m55570to(new C12025x6[]{c12025x6Arr[0], c12025x6Arr[3], c12025x6Arr[7], c12025x6Arr[c]});
                    c14365qy.m69827c6().m64113k4(c11896dy, 0.7f);
                    c11896dy2 = new C11896dy();
                    c11896dy2.m55570to(new C12025x6[]{c12025x6Arr[2], c12025x6Arr[3], c12025x6Arr[7], c12025x6Arr[c2]});
                    c14365qy.m69862ts().m64113k4(c11896dy2, 1.0f);
                    if (c14365qy.m69863u4().m73384dy() != null) {
                        if (c14365qy.m69863u4().m73384dy().isPlotOrderReversed()) {
                            c12025x6Arr[c].CloneTo(c12025x6Arr2[0]);
                            c12025x6Arr[0].CloneTo(c12025x6Arr2[1]);
                            c12025x6Arr[7].CloneTo(c12025x6Arr2[2]);
                            c12025x6Arr[3].CloneTo(c12025x6Arr2[3]);
                            c12025x6Arr[c2].CloneTo(c12025x6Arr2[c]);
                            c12025x67 = c12025x6Arr[2];
                            c12025x68 = c12025x6Arr2[5];
                        } else {
                            c12025x6Arr[0].CloneTo(c12025x6Arr2[0]);
                            c12025x6Arr[c].CloneTo(c12025x6Arr2[1]);
                            c12025x6Arr[3].CloneTo(c12025x6Arr2[2]);
                            c12025x6Arr[7].CloneTo(c12025x6Arr2[3]);
                            c12025x6Arr[2].CloneTo(c12025x6Arr2[c]);
                            c12025x67 = c12025x6Arr[c2];
                            c12025x68 = c12025x6Arr2[5];
                        }
                        c12025x67.CloneTo(c12025x68);
                        m72562k4(c12025x6Arr2, c14365qy.m69863u4());
                    }
                    if (c14365qy.m69854ne().m73384dy() != null) {
                        if (c14365qy.m69854ne().m73384dy().isPlotOrderReversed()) {
                            c12025x6Arr[1].CloneTo(c12025x6Arr2[0]);
                            c12025x6Arr[0].CloneTo(c12025x6Arr2[1]);
                            c12025x6Arr[2].CloneTo(c12025x6Arr2[2]);
                            c12025x6Arr[3].CloneTo(c12025x6Arr2[3]);
                            c12025x6Arr[c2].CloneTo(c12025x6Arr2[c]);
                            c12025x65 = c12025x6Arr[7];
                            c12025x66 = c12025x6Arr2[5];
                        } else {
                            c12025x6Arr[0].CloneTo(c12025x6Arr2[0]);
                            c12025x6Arr[1].CloneTo(c12025x6Arr2[1]);
                            c12025x6Arr[3].CloneTo(c12025x6Arr2[2]);
                            c12025x6Arr[2].CloneTo(c12025x6Arr2[3]);
                            c12025x6Arr[7].CloneTo(c12025x6Arr2[c]);
                            c12025x65 = c12025x6Arr[c2];
                            c12025x66 = c12025x6Arr2[5];
                        }
                        c12025x65.CloneTo(c12025x66);
                        m72562k4(c12025x6Arr2, c14365qy.m69854ne());
                    }
                    if (c14365qy.m69868wl().m73384dy() != null) {
                        if (c14365qy.m69868wl().m73384dy().isPlotOrderReversed()) {
                            c12025x6Arr[2].CloneTo(c12025x6Arr2[0]);
                            c12025x6Arr[1].CloneTo(c12025x6Arr2[1]);
                            c12025x6Arr[3].CloneTo(c12025x6Arr2[2]);
                            c12025x6Arr[0].CloneTo(c12025x6Arr2[3]);
                            c12025x6Arr[7].CloneTo(c12025x6Arr2[c]);
                            c12025x63 = c12025x6Arr[c];
                            c12025x64 = c12025x6Arr2[5];
                        } else {
                            c12025x6Arr[1].CloneTo(c12025x6Arr2[0]);
                            c12025x6Arr[2].CloneTo(c12025x6Arr2[1]);
                            c12025x6Arr[0].CloneTo(c12025x6Arr2[2]);
                            c12025x6Arr[3].CloneTo(c12025x6Arr2[3]);
                            c12025x6Arr[c].CloneTo(c12025x6Arr2[c]);
                            c12025x63 = c12025x6Arr[7];
                            c12025x64 = c12025x6Arr2[5];
                        }
                        c12025x63.CloneTo(c12025x64);
                        m72562k4(c12025x6Arr2, c14365qy.m69868wl());
                    }
                    m72560k4(c14365qy, c12025x6Arr, z);
                    c14365qy.m69862ts().m64112k4(c11896dy2);
                    break;
                case 2:
                case 3:
                    c11896dy = new C11896dy();
                    c11896dy.m55570to(new C12025x6[]{c12025x6Arr[0], c12025x6Arr[3], c12025x6Arr[7], c12025x6Arr[c]});
                    c14365qy.m69827c6().m64113k4(c11896dy, 0.7f);
                    c11896dy2 = new C11896dy();
                    c11896dy2.m55570to(new C12025x6[]{c12025x6Arr[0], c12025x6Arr[1], c12025x6Arr[5], c12025x6Arr[c]});
                    c14365qy.m69862ts().m64113k4(c11896dy2, 1.0f);
                    if (c14365qy.m69863u4().m73384dy() != null) {
                        if (c14365qy.m69863u4().m73384dy().isPlotOrderReversed()) {
                            c12025x6Arr[5].CloneTo(c12025x6Arr2[0]);
                            c12025x6Arr[1].CloneTo(c12025x6Arr2[1]);
                            c12025x6Arr[c].CloneTo(c12025x6Arr2[2]);
                            c12025x6Arr[0].CloneTo(c12025x6Arr2[3]);
                            c12025x6Arr[7].CloneTo(c12025x6Arr2[c]);
                            c12025x613 = c12025x6Arr[3];
                            c12025x614 = c12025x6Arr2[5];
                        } else {
                            c12025x6Arr[1].CloneTo(c12025x6Arr2[0]);
                            c12025x6Arr[5].CloneTo(c12025x6Arr2[1]);
                            c12025x6Arr[0].CloneTo(c12025x6Arr2[2]);
                            c12025x6Arr[c].CloneTo(c12025x6Arr2[3]);
                            c12025x6Arr[3].CloneTo(c12025x6Arr2[c]);
                            c12025x613 = c12025x6Arr[7];
                            c12025x614 = c12025x6Arr2[5];
                        }
                        c12025x613.CloneTo(c12025x614);
                        m72562k4(c12025x6Arr2, c14365qy.m69863u4());
                    }
                    if (c14365qy.m69854ne().m73384dy() != null) {
                        if (c14365qy.m69854ne().m73384dy().isPlotOrderReversed()) {
                            c12025x6Arr[2].CloneTo(c12025x6Arr2[0]);
                            c12025x6Arr[3].CloneTo(c12025x6Arr2[1]);
                            c12025x6Arr[1].CloneTo(c12025x6Arr2[2]);
                            c12025x6Arr[0].CloneTo(c12025x6Arr2[3]);
                            c12025x6Arr[5].CloneTo(c12025x6Arr2[c]);
                            c12025x611 = c12025x6Arr[c];
                            c12025x612 = c12025x6Arr2[5];
                        } else {
                            c12025x6Arr[3].CloneTo(c12025x6Arr2[0]);
                            c12025x6Arr[2].CloneTo(c12025x6Arr2[1]);
                            c12025x6Arr[0].CloneTo(c12025x6Arr2[2]);
                            c12025x6Arr[1].CloneTo(c12025x6Arr2[3]);
                            c12025x6Arr[c].CloneTo(c12025x6Arr2[c]);
                            c12025x611 = c12025x6Arr[5];
                            c12025x612 = c12025x6Arr2[5];
                        }
                        c12025x611.CloneTo(c12025x612);
                        m72562k4(c12025x6Arr2, c14365qy.m69854ne());
                    }
                    if (c14365qy.m69868wl().m73384dy() != null) {
                        if (c14365qy.m69868wl().m73384dy().isPlotOrderReversed()) {
                            c12025x6Arr[2].CloneTo(c12025x6Arr2[0]);
                            c12025x6Arr[1].CloneTo(c12025x6Arr2[1]);
                            c12025x6Arr[3].CloneTo(c12025x6Arr2[2]);
                            c12025x6Arr[0].CloneTo(c12025x6Arr2[3]);
                            c12025x6Arr[7].CloneTo(c12025x6Arr2[c]);
                            c12025x69 = c12025x6Arr[c];
                            c12025x610 = c12025x6Arr2[5];
                        } else {
                            c12025x6Arr[1].CloneTo(c12025x6Arr2[0]);
                            c12025x6Arr[2].CloneTo(c12025x6Arr2[1]);
                            c12025x6Arr[0].CloneTo(c12025x6Arr2[2]);
                            c12025x6Arr[3].CloneTo(c12025x6Arr2[3]);
                            c12025x6Arr[c].CloneTo(c12025x6Arr2[c]);
                            c12025x69 = c12025x6Arr[7];
                            c12025x610 = c12025x6Arr2[5];
                        }
                        c12025x69.CloneTo(c12025x610);
                        m72562k4(c12025x6Arr2, c14365qy.m69868wl());
                    }
                    m72560k4(c14365qy, c12025x6Arr, z);
                    c14365qy.m69862ts().m64112k4(c11896dy2);
                    break;
                case 4:
                case 5:
                    C11896dy c11896dy4 = new C11896dy();
                    c11896dy4.m55570to(new C12025x6[]{c12025x6Arr[0], c12025x6Arr[1], c12025x6Arr[5], c12025x6Arr[c]});
                    c14365qy.m69862ts().m64113k4(c11896dy4, 1.0f);
                    C11896dy c11896dy5 = new C11896dy();
                    c11896dy5.m55570to(new C12025x6[]{c12025x6Arr[1], c12025x6Arr[2], c12025x6Arr[c2], c12025x6Arr[5]});
                    c14365qy.m69827c6().m64113k4(c11896dy5, 0.7f);
                    if (c14365qy.m69863u4().m73384dy() != null) {
                        if (c14365qy.m69863u4().m73384dy().isPlotOrderReversed()) {
                            c12025x6Arr[c].CloneTo(c12025x6Arr2[0]);
                            c12025x6Arr[0].CloneTo(c12025x6Arr2[1]);
                            c12025x6Arr[5].CloneTo(c12025x6Arr2[2]);
                            c12025x6Arr[1].CloneTo(c12025x6Arr2[3]);
                            c12025x6Arr[c2].CloneTo(c12025x6Arr2[c]);
                            c12025x619 = c12025x6Arr[2];
                            c12025x620 = c12025x6Arr2[5];
                        } else {
                            c12025x6Arr[0].CloneTo(c12025x6Arr2[0]);
                            c12025x6Arr[c].CloneTo(c12025x6Arr2[1]);
                            c12025x6Arr[1].CloneTo(c12025x6Arr2[2]);
                            c12025x6Arr[5].CloneTo(c12025x6Arr2[3]);
                            c12025x6Arr[2].CloneTo(c12025x6Arr2[c]);
                            c12025x619 = c12025x6Arr[c2];
                            c12025x620 = c12025x6Arr2[5];
                        }
                        c12025x619.CloneTo(c12025x620);
                        m72562k4(c12025x6Arr2, c14365qy.m69863u4());
                    }
                    if (c14365qy.m69854ne().m73384dy() != null) {
                        if (c14365qy.m69854ne().m73384dy().isPlotOrderReversed()) {
                            c12025x6Arr[2].CloneTo(c12025x6Arr2[0]);
                            c12025x6Arr[3].CloneTo(c12025x6Arr2[1]);
                            c12025x6Arr[1].CloneTo(c12025x6Arr2[2]);
                            c12025x6Arr[0].CloneTo(c12025x6Arr2[3]);
                            c12025x6Arr[5].CloneTo(c12025x6Arr2[c]);
                            c12025x617 = c12025x6Arr[c];
                            c12025x618 = c12025x6Arr2[5];
                        } else {
                            c12025x6Arr[3].CloneTo(c12025x6Arr2[0]);
                            c12025x6Arr[2].CloneTo(c12025x6Arr2[1]);
                            c12025x6Arr[0].CloneTo(c12025x6Arr2[2]);
                            c12025x6Arr[1].CloneTo(c12025x6Arr2[3]);
                            c12025x6Arr[c].CloneTo(c12025x6Arr2[c]);
                            c12025x617 = c12025x6Arr[5];
                            c12025x618 = c12025x6Arr2[5];
                        }
                        c12025x617.CloneTo(c12025x618);
                        m72562k4(c12025x6Arr2, c14365qy.m69854ne());
                    }
                    if (c14365qy.m69868wl().m73384dy() != null) {
                        if (c14365qy.m69868wl().m73384dy().isPlotOrderReversed()) {
                            c12025x6Arr[0].CloneTo(c12025x6Arr2[0]);
                            c12025x6Arr[3].CloneTo(c12025x6Arr2[1]);
                            c12025x6Arr[1].CloneTo(c12025x6Arr2[2]);
                            c12025x6Arr[2].CloneTo(c12025x6Arr2[3]);
                            c12025x6Arr[5].CloneTo(c12025x6Arr2[c]);
                            c12025x615 = c12025x6Arr[c2];
                            c12025x616 = c12025x6Arr2[5];
                        } else {
                            c12025x6Arr[3].CloneTo(c12025x6Arr2[0]);
                            c12025x6Arr[0].CloneTo(c12025x6Arr2[1]);
                            c12025x6Arr[2].CloneTo(c12025x6Arr2[2]);
                            c12025x6Arr[1].CloneTo(c12025x6Arr2[3]);
                            c12025x6Arr[c2].CloneTo(c12025x6Arr2[c]);
                            c12025x615 = c12025x6Arr[5];
                            c12025x616 = c12025x6Arr2[5];
                        }
                        c12025x615.CloneTo(c12025x616);
                        m72562k4(c12025x6Arr2, c14365qy.m69868wl());
                    }
                    m72560k4(c14365qy, c12025x6Arr, z);
                    c14365qy.m69862ts().m64112k4(c11896dy4);
                    c14365qy.m69827c6().m64112k4(c11896dy5);
                    break;
                case 6:
                case 7:
                    c11896dy = new C11896dy();
                    c11896dy.m55570to(new C12025x6[]{c12025x6Arr[1], c12025x6Arr[2], c12025x6Arr[c2], c12025x6Arr[5]});
                    c14365qy.m69827c6().m64113k4(c11896dy, 0.7f);
                    c11896dy2 = new C11896dy();
                    c11896dy2.m55570to(new C12025x6[]{c12025x6Arr[2], c12025x6Arr[3], c12025x6Arr[7], c12025x6Arr[c2]});
                    c14365qy.m69862ts().m64113k4(c11896dy2, 1.0f);
                    if (c14365qy.m69863u4().m73384dy() != null) {
                        if (c14365qy.m69863u4().m73384dy().isPlotOrderReversed()) {
                            c12025x6Arr[7].CloneTo(c12025x6Arr2[0]);
                            c12025x6Arr[3].CloneTo(c12025x6Arr2[1]);
                            c12025x6Arr[c2].CloneTo(c12025x6Arr2[2]);
                            c12025x6Arr[2].CloneTo(c12025x6Arr2[3]);
                            c12025x6Arr[5].CloneTo(c12025x6Arr2[c]);
                            c12025x625 = c12025x6Arr[1];
                            c12025x626 = c12025x6Arr2[5];
                        } else {
                            c12025x6Arr[3].CloneTo(c12025x6Arr2[0]);
                            c12025x6Arr[7].CloneTo(c12025x6Arr2[1]);
                            c12025x6Arr[2].CloneTo(c12025x6Arr2[2]);
                            c12025x6Arr[c2].CloneTo(c12025x6Arr2[3]);
                            c12025x6Arr[1].CloneTo(c12025x6Arr2[c]);
                            c12025x625 = c12025x6Arr[5];
                            c12025x626 = c12025x6Arr2[5];
                        }
                        c12025x625.CloneTo(c12025x626);
                        m72562k4(c12025x6Arr2, c14365qy.m69863u4());
                    }
                    if (c14365qy.m69854ne().m73384dy() != null) {
                        if (c14365qy.m69854ne().m73384dy().isPlotOrderReversed()) {
                            c12025x6Arr[1].CloneTo(c12025x6Arr2[0]);
                            c12025x6Arr[0].CloneTo(c12025x6Arr2[1]);
                            c12025x6Arr[2].CloneTo(c12025x6Arr2[2]);
                            c12025x6Arr[3].CloneTo(c12025x6Arr2[3]);
                            c12025x6Arr[c2].CloneTo(c12025x6Arr2[c]);
                            c12025x623 = c12025x6Arr[7];
                            c12025x624 = c12025x6Arr2[5];
                        } else {
                            c12025x6Arr[0].CloneTo(c12025x6Arr2[0]);
                            c12025x6Arr[1].CloneTo(c12025x6Arr2[1]);
                            c12025x6Arr[3].CloneTo(c12025x6Arr2[2]);
                            c12025x6Arr[2].CloneTo(c12025x6Arr2[3]);
                            c12025x6Arr[7].CloneTo(c12025x6Arr2[c]);
                            c12025x623 = c12025x6Arr[c2];
                            c12025x624 = c12025x6Arr2[5];
                        }
                        c12025x623.CloneTo(c12025x624);
                        m72562k4(c12025x6Arr2, c14365qy.m69854ne());
                    }
                    if (c14365qy.m69868wl().m73384dy() != null) {
                        if (c14365qy.m69868wl().m73384dy().isPlotOrderReversed()) {
                            c12025x6Arr[0].CloneTo(c12025x6Arr2[0]);
                            c12025x6Arr[3].CloneTo(c12025x6Arr2[1]);
                            c12025x6Arr[1].CloneTo(c12025x6Arr2[2]);
                            c12025x6Arr[2].CloneTo(c12025x6Arr2[3]);
                            c12025x6Arr[5].CloneTo(c12025x6Arr2[c]);
                            c12025x621 = c12025x6Arr[c2];
                            c12025x622 = c12025x6Arr2[5];
                        } else {
                            c12025x6Arr[3].CloneTo(c12025x6Arr2[0]);
                            c12025x6Arr[0].CloneTo(c12025x6Arr2[1]);
                            c12025x6Arr[2].CloneTo(c12025x6Arr2[2]);
                            c12025x6Arr[1].CloneTo(c12025x6Arr2[3]);
                            c12025x6Arr[c2].CloneTo(c12025x6Arr2[c]);
                            c12025x621 = c12025x6Arr[5];
                            c12025x622 = c12025x6Arr2[5];
                        }
                        c12025x621.CloneTo(c12025x622);
                        m72562k4(c12025x6Arr2, c14365qy.m69868wl());
                    }
                    m72560k4(c14365qy, c12025x6Arr, z);
                    c14365qy.m69862ts().m64112k4(c11896dy2);
                    break;
            }
            iM72557k4 = m72557k4(z, c14365qy.m69863u4());
            if (iM72557k4 == 0) {
                C12025x6[] c12025x6ArrM72659kk = C14728w8.m72659kk(c14365qy);
                if (z) {
                    float f = iM72557k4;
                    c14365qy.m69854ne().m73393k4(c12025x6ArrM72659kk[2].m56897x1() + f, c12025x6ArrM72659kk[2].m56895kk(), c12025x6ArrM72659kk[2].m56897x1() + f, c12025x6ArrM72659kk[2].m56895kk() - c14365qy.m69833e0().m64100du());
                    return;
                } else {
                    float f2 = iM72557k4;
                    c14365qy.m69854ne().m73393k4(c12025x6ArrM72659kk[2].m56897x1(), c12025x6ArrM72659kk[2].m56895kk() - f2, c12025x6ArrM72659kk[3].m56897x1(), c12025x6ArrM72659kk[3].m56895kk() - f2);
                    return;
                }
            }
            return;
        }
        if (c14365qy.m69829dq() >= 0) {
            C11896dy c11896dy6 = new C11896dy();
            c3 = 5;
            c11896dy6.m55570to(new C12025x6[]{c12025x6Arr[0], c12025x6Arr[3], c12025x6Arr[7], c12025x6Arr[c]});
            c14365qy.m69825bz().m64113k4(c11896dy6, 0.7f);
        } else {
            c3 = 5;
        }
        c11896dy = new C11896dy();
        c11896dy.m55570to(new C12025x6[]{c12025x6Arr[0], c12025x6Arr[1], c12025x6Arr[2], c12025x6Arr[3]});
        c14365qy.m69827c6().m64113k4(c11896dy, 0.7f);
        C11896dy c11896dy7 = new C11896dy();
        c11896dy7.m55570to(new C12025x6[]{c12025x6Arr[2], c12025x6Arr[3], c12025x6Arr[7], c12025x6Arr[6]});
        c14365qy.m69862ts().m64113k4(c11896dy7, 1.0f);
        if (c14365qy.m69863u4().m73384dy() != null) {
            if (c14365qy.m69863u4().m73384dy().isPlotOrderReversed()) {
                c12025x6Arr[1].CloneTo(c12025x6Arr2[0]);
                c12025x6Arr[0].CloneTo(c12025x6Arr2[1]);
                c12025x6Arr[2].CloneTo(c12025x6Arr2[2]);
                c12025x6Arr[3].CloneTo(c12025x6Arr2[3]);
                c12025x6Arr[6].CloneTo(c12025x6Arr2[c]);
                c12025x629 = c12025x6Arr[7];
                c12025x630 = c12025x6Arr2[c3];
            } else {
                c12025x6Arr[0].CloneTo(c12025x6Arr2[0]);
                c12025x6Arr[1].CloneTo(c12025x6Arr2[1]);
                c12025x6Arr[3].CloneTo(c12025x6Arr2[2]);
                c12025x6Arr[2].CloneTo(c12025x6Arr2[3]);
                c12025x6Arr[7].CloneTo(c12025x6Arr2[c]);
                c12025x629 = c12025x6Arr[6];
                c12025x630 = c12025x6Arr2[c3];
            }
            c12025x629.CloneTo(c12025x630);
            m72562k4(c12025x6Arr2, c14365qy.m69863u4());
        }
        if (c14365qy.m69854ne().m73384dy() != null) {
            if (c14365qy.m69854ne().m73384dy().isPlotOrderReversed()) {
                c12025x6Arr[c].CloneTo(c12025x6Arr2[0]);
                c12025x6Arr[0].CloneTo(c12025x6Arr2[1]);
                c12025x6Arr[7].CloneTo(c12025x6Arr2[2]);
                c12025x6Arr[3].CloneTo(c12025x6Arr2[3]);
                c12025x6Arr[6].CloneTo(c12025x6Arr2[c]);
                c12025x627 = c12025x6Arr[2];
                c12025x628 = c12025x6Arr2[c3];
            } else {
                c12025x6Arr[0].CloneTo(c12025x6Arr2[0]);
                c12025x6Arr[c].CloneTo(c12025x6Arr2[1]);
                c12025x6Arr[3].CloneTo(c12025x6Arr2[2]);
                c12025x6Arr[7].CloneTo(c12025x6Arr2[3]);
                c12025x6Arr[2].CloneTo(c12025x6Arr2[c]);
                c12025x627 = c12025x6Arr[6];
                c12025x628 = c12025x6Arr2[c3];
            }
            c12025x627.CloneTo(c12025x628);
            m72562k4(c12025x6Arr2, c14365qy.m69854ne());
        }
        m72560k4(c14365qy, c12025x6Arr, z);
        c14365qy.m69862ts().m64112k4(c11896dy7);
        c14365qy.m69827c6().m64112k4(c11896dy);
        iM72557k4 = m72557k4(z, c14365qy.m69863u4());
        if (iM72557k4 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x020f  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m72562k4(C12025x6[] c12025x6Arr, C14787xi c14787xi) {
        double d;
        double d2;
        double d3;
        double d4;
        char c;
        char c2;
        double dM4487x1;
        int i;
        char c3;
        double dM4455k4;
        char c4;
        double dM4487x12;
        C12025x6 c12025x6Clone;
        C12025x6 c12025x6Clone2;
        C12025x6 c12025x6Clone3;
        int i2;
        double d5;
        char c5;
        double dM4455k42;
        int baseUnitScale = c14787xi.m73384dy().getBaseUnitScale();
        double dM73432yj = c14787xi.m73432yj();
        double dM73405ks = c14787xi.m73405ks();
        double dM73391k4 = c14787xi.m73384dy().isLogarithmic() ? c14787xi.m73391k4(c14787xi.m73418um()) : c14787xi.m73418um();
        double dM73391k42 = c14787xi.m73384dy().isLogarithmic() ? c14787xi.m73391k4(c14787xi.m73374ar()) : c14787xi.m73374ar();
        double dM4455k43 = (c14787xi.m73419up() == 0 && c14787xi.m73384dy().getCategoryAxisType() == 1) ? ((double) C0841c4.m4455k4(baseUnitScale, C7019kk.m27462to(Double.valueOf(dM73432yj), 14), C7019kk.m27462to(Double.valueOf(dM73405ks), 14), C7019kk.m27462to(Double.valueOf(dM73432yj), 14), false)) + 1.0d : dM73432yj - dM73405ks;
        double dM56897x1 = ((double) (c12025x6Arr[1].m56897x1() - c12025x6Arr[0].m56897x1())) / dM4455k43;
        double dM56895kk = ((double) (c12025x6Arr[1].m56895kk() - c12025x6Arr[0].m56895kk())) / dM4455k43;
        if (!c14787xi.m73384dy().getShowMajorGridLines() || dM73391k4 <= 0.0d) {
            d = dM73432yj;
            d2 = dM73405ks;
            d3 = dM73391k42;
            d4 = 0.0d;
            c = 4;
        } else {
            if (c14787xi.m73419up() == 0) {
                d4 = 0.0d;
                if (c14787xi.m73384dy().getCategoryAxisType() == 1) {
                    c = 4;
                    d = dM73432yj;
                    c4 = 0;
                    dM4487x12 = C0841c4.m4487x1(c14787xi.m73384dy().getBaseUnitScale(), c14787xi.m73417u4(), C7019kk.m27462to(Double.valueOf(dM73391k4), 14), C7019kk.m27462to(Double.valueOf(dM73405ks), 14), false);
                }
                c12025x6Clone = m72558k4(c12025x6Arr[c4].Clone()).Clone();
                c12025x6Clone2 = m72558k4(c12025x6Arr[2].Clone()).Clone();
                c12025x6Clone3 = m72558k4(c12025x6Arr[c].Clone()).Clone();
                while (true) {
                    if (dM4487x12 > d) {
                        d2 = dM73405ks;
                        i2 = 1;
                    } else {
                        if (c14787xi.m73419up() != 0) {
                            d2 = dM73405ks;
                            break;
                        }
                        d2 = dM73405ks;
                        i2 = 1;
                        if (c14787xi.m73384dy().getCategoryAxisType() != 1 || dM4487x12 > d) {
                            break;
                        }
                    }
                    if (c14787xi.m73419up() == 0 || c14787xi.m73384dy().getCategoryAxisType() != i2) {
                        d5 = dM73391k4;
                        c5 = 0;
                        dM4455k42 = dM4487x12 - d2;
                    } else {
                        d5 = dM73391k4;
                        c5 = 0;
                        dM4455k42 = C0841c4.m4455k4(baseUnitScale, C7019kk.m27462to(Double.valueOf(dM4487x12), 14), C7019kk.m27462to(Double.valueOf(d2), 14), C7019kk.m27462to(Double.valueOf(d), 14), false);
                    }
                    float fM56897x1 = c12025x6Arr[c5].m56897x1();
                    char c6 = c5;
                    double d6 = dM73391k42;
                    float f = (float) (dM56897x1 * dM4455k42);
                    c12025x6Clone.m56891k4(fM56897x1 + f);
                    float f2 = (float) (dM4455k42 * dM56895kk);
                    c12025x6Clone.m56898x1(c12025x6Arr[c6].m56895kk() + f2);
                    com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[2], c12025x6Clone2, f);
                    C22231OoooOO0.OooO00o(c12025x6Arr[2], c12025x6Clone2, f2);
                    com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[c], c12025x6Clone3, f);
                    c12025x6Clone3.m56898x1(c12025x6Arr[c].m56895kk() + f2);
                    c14787xi.m73426x1(c12025x6Clone.m56897x1(), c12025x6Clone.m56895kk(), c12025x6Clone2.m56897x1(), c12025x6Clone2.m56895kk());
                    c14787xi.m73426x1(c12025x6Clone2.m56897x1(), c12025x6Clone2.m56895kk(), c12025x6Clone3.m56897x1(), c12025x6Clone3.m56895kk());
                    dM4487x12 = (c14787xi.m73419up() == 0 || c14787xi.m73384dy().getCategoryAxisType() != 1) ? dM4487x12 + d5 : C0841c4.m4487x1(c14787xi.m73384dy().getBaseUnitScale(), c14787xi.m73417u4(), C7019kk.m27462to(Double.valueOf(d5), 14), C7019kk.m27462to(Double.valueOf(dM4487x12), 14), false);
                    dM73405ks = d2;
                    dM73391k4 = d5;
                    dM73391k42 = d6;
                }
                d3 = dM73391k42;
            } else {
                d4 = 0.0d;
            }
            d = dM73432yj;
            c4 = 0;
            c = 4;
            dM4487x12 = dM73405ks;
            c12025x6Clone = m72558k4(c12025x6Arr[c4].Clone()).Clone();
            c12025x6Clone2 = m72558k4(c12025x6Arr[2].Clone()).Clone();
            c12025x6Clone3 = m72558k4(c12025x6Arr[c].Clone()).Clone();
            while (true) {
                if (dM4487x12 > d) {
                }
                if (c14787xi.m73419up() == 0) {
                    d5 = dM73391k4;
                    c5 = 0;
                    dM4455k42 = dM4487x12 - d2;
                }
                float fM56897x12 = c12025x6Arr[c5].m56897x1();
                char c62 = c5;
                double d62 = dM73391k42;
                float f3 = (float) (dM56897x1 * dM4455k42);
                c12025x6Clone.m56891k4(fM56897x12 + f3);
                float f22 = (float) (dM4455k42 * dM56895kk);
                c12025x6Clone.m56898x1(c12025x6Arr[c62].m56895kk() + f22);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[2], c12025x6Clone2, f3);
                C22231OoooOO0.OooO00o(c12025x6Arr[2], c12025x6Clone2, f22);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[c], c12025x6Clone3, f3);
                c12025x6Clone3.m56898x1(c12025x6Arr[c].m56895kk() + f22);
                c14787xi.m73426x1(c12025x6Clone.m56897x1(), c12025x6Clone.m56895kk(), c12025x6Clone2.m56897x1(), c12025x6Clone2.m56895kk());
                c14787xi.m73426x1(c12025x6Clone2.m56897x1(), c12025x6Clone2.m56895kk(), c12025x6Clone3.m56897x1(), c12025x6Clone3.m56895kk());
                if (c14787xi.m73419up() == 0) {
                }
                dM73405ks = d2;
                dM73391k4 = d5;
                dM73391k42 = d62;
            }
            d3 = dM73391k42;
        }
        if (!c14787xi.m73384dy().getShowMinorGridLines() || d3 <= d4) {
            return;
        }
        if (c14787xi.m73419up() == 0 && c14787xi.m73384dy().getCategoryAxisType() == 1) {
            c2 = 0;
            dM4487x1 = C0841c4.m4487x1(c14787xi.m73384dy().getBaseUnitScale(), c14787xi.m73420uz(), C7019kk.m27462to(Double.valueOf(d3), 14), C7019kk.m27462to(Double.valueOf(d2), 14), false);
        } else {
            c2 = 0;
            dM4487x1 = d2 + d3;
        }
        C12025x6 c12025x6Clone4 = m72558k4(c12025x6Arr[c2].Clone()).Clone();
        C12025x6 c12025x6Clone5 = m72558k4(c12025x6Arr[2].Clone()).Clone();
        C12025x6 c12025x6Clone6 = m72558k4(c12025x6Arr[c].Clone()).Clone();
        while (true) {
            if (dM4487x1 <= d) {
                i = 1;
            } else {
                if (c14787xi.m73419up() != 0) {
                    return;
                }
                i = 1;
                if (c14787xi.m73384dy().getCategoryAxisType() != 1 || dM4487x1 > d) {
                    return;
                }
            }
            if (c14787xi.m73419up() == 0 && c14787xi.m73384dy().getCategoryAxisType() == i) {
                c3 = 0;
                dM4455k4 = C0841c4.m4455k4(baseUnitScale, C7019kk.m27462to(Double.valueOf(dM4487x1), 14), C7019kk.m27462to(Double.valueOf(d2), 14), C7019kk.m27462to(Double.valueOf(d), 14), false);
            } else {
                c3 = 0;
                dM4455k4 = dM4487x1 - d2;
            }
            float f4 = (float) (dM56897x1 * dM4455k4);
            c12025x6Clone4.m56891k4(c12025x6Arr[c3].m56897x1() + f4);
            float f5 = (float) (dM4455k4 * dM56895kk);
            c12025x6Clone4.m56898x1(c12025x6Arr[c3].m56895kk() + f5);
            com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[2], c12025x6Clone5, f4);
            C22231OoooOO0.OooO00o(c12025x6Arr[2], c12025x6Clone5, f5);
            com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[c], c12025x6Clone6, f4);
            c12025x6Clone6.m56898x1(c12025x6Arr[c].m56895kk() + f5);
            c14787xi.m73401kk(c12025x6Clone4.m56897x1(), c12025x6Clone4.m56895kk(), c12025x6Clone5.m56897x1(), c12025x6Clone5.m56895kk());
            c14787xi.m73401kk(c12025x6Clone5.m56897x1(), c12025x6Clone5.m56895kk(), c12025x6Clone6.m56897x1(), c12025x6Clone6.m56895kk());
            dM4487x1 = (c14787xi.m73419up() == 0 && c14787xi.m73384dy().getCategoryAxisType() == 1) ? C0841c4.m4487x1(c14787xi.m73384dy().getBaseUnitScale(), c14787xi.m73420uz(), C7019kk.m27462to(Double.valueOf(d3), 14), C7019kk.m27462to(Double.valueOf(dM4487x1), 14), false) : dM4487x1 + d3;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m72563k4(int i) {
        return i == 6 || i == 10 || i == 14 || i == 18 || i == 25 || i == 50;
    }
}
