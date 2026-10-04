package com.aspose.slides;

import Oooo0oO.C21034OooOOOo;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.w8 */
/* JADX INFO: loaded from: classes3.dex */
class C14728w8 extends AbstractC7020m9<C14728w8> {
    /* JADX INFO: renamed from: du */
    public static C12025x6 m72650du(C14365qy c14365qy) {
        float fM64121to;
        float fM64117m9;
        C12025x6 c12025x6;
        C12025x6 c12025x62 = new C12025x6(c14365qy.m69833e0().m64106h4(), c14365qy.m69833e0().m64114kk());
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
        C12025x6[] c12025x6Arr = (C12025x6[]) C22200OooO0o0.OooO00o(C12025x6.class, 4);
        C12025x6 c12025x6Clone = C12025x6.f40591k4.Clone();
        switch (iM69877xk2) {
            case 0:
            case 8:
                C22227OoooO.OooO0O0(fM64121to, fM67495m9, 2.0f, c12025x62.m56897x1(), c12025x6Arr[0]);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[0], c12025x6Arr[1], fM64121to);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[1], c12025x6Arr[2], fM67495m9);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[0], c12025x6Arr[3], fM67495m9);
                c12025x6Arr[0].m56898x1((fM67495m92 / 2.0f) + c12025x62.m56895kk());
                c12025x6Arr[1].m56898x1(c12025x6Arr[0].m56895kk());
                OooOOO.OooO0OO(c12025x6Arr[1], c12025x6Arr[2], fM67495m92);
                c12025x6Arr[3].m56898x1(c12025x6Arr[2].m56895kk());
                c12025x6 = c12025x6Arr[0];
                break;
            case 1:
                C22227OoooO.OooO0O0(fM64121to, fM67495m9, 2.0f, c12025x62.m56897x1(), c12025x6Arr[0]);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[0], c12025x6Arr[1], fM67495m9);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[1], c12025x6Arr[2], fM64121to);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[0], c12025x6Arr[3], fM64121to);
                C22207OooOOoo.OooO0O0(c12025x6Arr[0], fM67495m92, 2.0f, c12025x62.m56895kk());
                C22231OoooOO0.OooO00o(c12025x6Arr[0], c12025x6Arr[1], fM67495m92);
                c12025x6Arr[2].m56898x1(c12025x6Arr[1].m56895kk());
                c12025x6Arr[3].m56898x1(c12025x6Arr[0].m56895kk());
                c12025x6 = c12025x6Arr[2];
                break;
            case 2:
                C22227OoooO.OooO0O0(fM64121to, fM67495m9, 2.0f, c12025x62.m56897x1(), c12025x6Arr[1]);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[1], c12025x6Arr[0], fM67495m9);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[1], c12025x6Arr[2], fM64121to);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[0], c12025x6Arr[3], fM64121to);
                C22207OooOOoo.OooO0O0(c12025x6Arr[0], fM67495m92, 2.0f, c12025x62.m56895kk());
                C22231OoooOO0.OooO00o(c12025x6Arr[0], c12025x6Arr[1], fM67495m92);
                c12025x6Arr[2].m56898x1(c12025x6Arr[1].m56895kk());
                c12025x6Arr[3].m56898x1(c12025x6Arr[0].m56895kk());
                c12025x6 = c12025x6Arr[1];
                break;
            case 3:
                C22227OoooO.OooO0O0(fM64121to, fM67495m9, 2.0f, c12025x62.m56897x1(), c12025x6Arr[1]);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[1], c12025x6Arr[0], fM64121to);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[1], c12025x6Arr[2], fM67495m9);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[2], c12025x6Arr[3], fM64121to);
                C22207OooOOoo.OooO0O0(c12025x6Arr[0], fM67495m92, 2.0f, c12025x62.m56895kk());
                c12025x6Arr[1].m56898x1(c12025x6Arr[0].m56895kk());
                C22231OoooOO0.OooO00o(c12025x6Arr[1], c12025x6Arr[2], fM67495m92);
                c12025x6Arr[3].m56898x1(c12025x6Arr[2].m56895kk());
                c12025x6 = c12025x6Arr[3];
                break;
            case 4:
                c12025x6Arr[0].m56891k4(((fM64121to + fM67495m9) / 2.0f) + c12025x62.m56897x1());
                C21034OooOOOo.OooO0OO(c12025x6Arr[0], c12025x6Arr[1], fM64121to);
                C21034OooOOOo.OooO0OO(c12025x6Arr[1], c12025x6Arr[2], fM67495m9);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[2], c12025x6Arr[3], fM64121to);
                C22207OooOOoo.OooO0O0(c12025x6Arr[0], fM67495m92, 2.0f, c12025x62.m56895kk());
                c12025x6Arr[1].m56898x1(c12025x6Arr[0].m56895kk());
                C22231OoooOO0.OooO00o(c12025x6Arr[1], c12025x6Arr[2], fM67495m92);
                c12025x6Arr[3].m56898x1(c12025x6Arr[2].m56895kk());
                c12025x6 = c12025x6Arr[2];
                break;
            case 5:
                c12025x6Arr[0].m56891k4(((fM64121to + fM67495m9) / 2.0f) + c12025x62.m56897x1());
                C21034OooOOOo.OooO0OO(c12025x6Arr[0], c12025x6Arr[1], fM67495m9);
                C21034OooOOOo.OooO0OO(c12025x6Arr[1], c12025x6Arr[2], fM64121to);
                C21034OooOOOo.OooO0OO(c12025x6Arr[0], c12025x6Arr[3], fM64121to);
                c12025x6Arr[0].m56898x1((fM67495m92 / 2.0f) + c12025x62.m56895kk());
                OooOOO.OooO0OO(c12025x6Arr[0], c12025x6Arr[1], fM67495m92);
                c12025x6Arr[2].m56898x1(c12025x6Arr[1].m56895kk());
                c12025x6Arr[3].m56898x1(c12025x6Arr[0].m56895kk());
                c12025x6 = c12025x6Arr[0];
                break;
            case 6:
                c12025x6Arr[1].m56891k4(((fM64121to + fM67495m9) / 2.0f) + c12025x62.m56897x1());
                C21034OooOOOo.OooO0OO(c12025x6Arr[1], c12025x6Arr[0], fM67495m9);
                C21034OooOOOo.OooO0OO(c12025x6Arr[1], c12025x6Arr[2], fM64121to);
                C21034OooOOOo.OooO0OO(c12025x6Arr[0], c12025x6Arr[3], fM64121to);
                c12025x6Arr[0].m56898x1((fM67495m92 / 2.0f) + c12025x62.m56895kk());
                OooOOO.OooO0OO(c12025x6Arr[0], c12025x6Arr[1], fM67495m92);
                c12025x6Arr[2].m56898x1(c12025x6Arr[1].m56895kk());
                c12025x6Arr[3].m56898x1(c12025x6Arr[0].m56895kk());
                c12025x6 = c12025x6Arr[3];
                break;
            case 7:
                C22227OoooO.OooO0O0(fM64121to, fM67495m9, 2.0f, c12025x62.m56897x1(), c12025x6Arr[1]);
                C21034OooOOOo.OooO0OO(c12025x6Arr[1], c12025x6Arr[0], fM64121to);
                C21034OooOOOo.OooO0OO(c12025x6Arr[1], c12025x6Arr[2], fM67495m9);
                C21034OooOOOo.OooO0OO(c12025x6Arr[2], c12025x6Arr[3], fM64121to);
                C22207OooOOoo.OooO0O0(c12025x6Arr[0], fM67495m92, 2.0f, c12025x62.m56895kk());
                c12025x6Arr[1].m56898x1(c12025x6Arr[0].m56895kk());
                OooOOO.OooO0OO(c12025x6Arr[1], c12025x6Arr[2], fM67495m92);
                c12025x6Arr[3].m56898x1(c12025x6Arr[2].m56895kk());
                c12025x6 = c12025x6Arr[1];
                break;
            default:
                return c12025x6Clone;
        }
        c12025x6.CloneTo(c12025x6Clone);
        return c12025x6Clone;
    }

    /* JADX INFO: renamed from: h4 */
    private static void m72651h4(C14365qy c14365qy) {
        C14787xi c14787xiM69868wl = c14365qy.m69868wl();
        List<Object> list = c14787xiM69868wl.f50098m9;
        List<C13847mr> listM69865up = c14365qy.m69865up();
        for (int i = 0; i < listM69865up.size(); i++) {
            list.addItem(listM69865up.get_Item(i).m64957kk());
        }
        c14787xiM69868wl.m73414to(0.0d);
        c14787xiM69868wl.m73381du(listM69865up.size());
        c14787xiM69868wl.m73409m9(c14787xiM69868wl.m73406lr());
        c14787xiM69868wl.m73387h4(c14787xiM69868wl.m73418um() / 2.0d);
    }

    /* JADX INFO: renamed from: k4 */
    private static int m72652k4(C14365qy c14365qy, C12023wl c12023wl) {
        int iM56865x1;
        int iM56862kk;
        int iM69877xk = c14365qy.m69877xk() % 90;
        if (iM69877xk >= 45) {
            iM69877xk = 90 - iM69877xk;
        }
        int iM69877xk2 = c14365qy.m69877xk() / 45;
        if (iM69877xk2 == 0 || iM69877xk2 == 3 || iM69877xk2 == 4 || iM69877xk2 == 7 || iM69877xk2 == 8) {
            iM56865x1 = c12023wl.m56865x1();
            iM56862kk = c12023wl.m56862kk();
        } else {
            iM56865x1 = c12023wl.m56862kk();
            iM56862kk = c12023wl.m56865x1();
        }
        return C7019kk.m27462to(Double.valueOf(C14116yg.m67495m9((((double) iM69877xk) * 3.141592653589793d) / 180.0d) * ((double) iM56862kk)), 14) + iM56865x1;
    }

    /* JADX INFO: renamed from: kk */
    public static C12025x6[] m72659kk(C14365qy c14365qy) {
        float fM64121to;
        float fM64117m9;
        C12025x6 c12025x6;
        C12025x6 c12025x62;
        C12025x6 c12025x63 = new C12025x6(c14365qy.m69833e0().m64106h4(), c14365qy.m69833e0().m64114kk());
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
        C12025x6[] c12025x6Arr = (C12025x6[]) C22200OooO0o0.OooO00o(C12025x6.class, 4);
        C12025x6[] c12025x6Arr2 = (C12025x6[]) C22200OooO0o0.OooO00o(C12025x6.class, 4);
        switch (iM69877xk2) {
            case 0:
            case 8:
                C22227OoooO.OooO0O0(fM64121to, fM67495m9, 2.0f, c12025x63.m56897x1(), c12025x6Arr[0]);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[0], c12025x6Arr[1], fM64121to);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[1], c12025x6Arr[2], fM67495m9);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[0], c12025x6Arr[3], fM67495m9);
                c12025x6Arr[0].m56898x1((fM67495m92 / 2.0f) + c12025x63.m56895kk());
                c12025x6Arr[1].m56898x1(c12025x6Arr[0].m56895kk());
                OooOOO.OooO0OO(c12025x6Arr[1], c12025x6Arr[2], fM67495m92);
                c12025x6Arr[3].m56898x1(c12025x6Arr[2].m56895kk());
                c12025x6Arr[0].CloneTo(c12025x6Arr2[0]);
                c12025x6Arr[1].CloneTo(c12025x6Arr2[1]);
                c12025x6Arr[3].CloneTo(c12025x6Arr2[2]);
                c12025x6 = c12025x6Arr[2];
                c12025x62 = c12025x6Arr2[3];
                break;
            case 1:
                C22227OoooO.OooO0O0(fM64121to, fM67495m9, 2.0f, c12025x63.m56897x1(), c12025x6Arr[0]);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[0], c12025x6Arr[1], fM67495m9);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[1], c12025x6Arr[2], fM64121to);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[0], c12025x6Arr[3], fM64121to);
                C22207OooOOoo.OooO0O0(c12025x6Arr[0], fM67495m92, 2.0f, c12025x63.m56895kk());
                C22231OoooOO0.OooO00o(c12025x6Arr[0], c12025x6Arr[1], fM67495m92);
                c12025x6Arr[2].m56898x1(c12025x6Arr[1].m56895kk());
                c12025x6Arr[3].m56898x1(c12025x6Arr[0].m56895kk());
                c12025x6Arr[0].CloneTo(c12025x6Arr2[0]);
                c12025x6Arr[1].CloneTo(c12025x6Arr2[1]);
                c12025x6Arr[3].CloneTo(c12025x6Arr2[2]);
                c12025x6 = c12025x6Arr[2];
                c12025x62 = c12025x6Arr2[3];
                break;
            case 2:
                C22227OoooO.OooO0O0(fM64121to, fM67495m9, 2.0f, c12025x63.m56897x1(), c12025x6Arr[1]);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[1], c12025x6Arr[0], fM67495m9);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[1], c12025x6Arr[2], fM64121to);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[0], c12025x6Arr[3], fM64121to);
                C22207OooOOoo.OooO0O0(c12025x6Arr[0], fM67495m92, 2.0f, c12025x63.m56895kk());
                C22231OoooOO0.OooO00o(c12025x6Arr[0], c12025x6Arr[1], fM67495m92);
                c12025x6Arr[2].m56898x1(c12025x6Arr[1].m56895kk());
                c12025x6Arr[3].m56898x1(c12025x6Arr[0].m56895kk());
                c12025x6Arr[3].CloneTo(c12025x6Arr2[0]);
                c12025x6Arr[2].CloneTo(c12025x6Arr2[1]);
                c12025x6Arr[0].CloneTo(c12025x6Arr2[2]);
                c12025x6 = c12025x6Arr[1];
                c12025x62 = c12025x6Arr2[3];
                break;
            case 3:
                C22227OoooO.OooO0O0(fM64121to, fM67495m9, 2.0f, c12025x63.m56897x1(), c12025x6Arr[1]);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[1], c12025x6Arr[0], fM64121to);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[1], c12025x6Arr[2], fM67495m9);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[2], c12025x6Arr[3], fM64121to);
                C22207OooOOoo.OooO0O0(c12025x6Arr[0], fM67495m92, 2.0f, c12025x63.m56895kk());
                c12025x6Arr[1].m56898x1(c12025x6Arr[0].m56895kk());
                C22231OoooOO0.OooO00o(c12025x6Arr[1], c12025x6Arr[2], fM67495m92);
                c12025x6Arr[3].m56898x1(c12025x6Arr[2].m56895kk());
                c12025x6Arr[3].CloneTo(c12025x6Arr2[0]);
                c12025x6Arr[2].CloneTo(c12025x6Arr2[1]);
                c12025x6Arr[0].CloneTo(c12025x6Arr2[2]);
                c12025x6 = c12025x6Arr[1];
                c12025x62 = c12025x6Arr2[3];
                break;
            case 4:
                c12025x6Arr[0].m56891k4(((fM64121to + fM67495m9) / 2.0f) + c12025x63.m56897x1());
                C21034OooOOOo.OooO0OO(c12025x6Arr[0], c12025x6Arr[1], fM64121to);
                C21034OooOOOo.OooO0OO(c12025x6Arr[1], c12025x6Arr[2], fM67495m9);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[2], c12025x6Arr[3], fM64121to);
                C22207OooOOoo.OooO0O0(c12025x6Arr[0], fM67495m92, 2.0f, c12025x63.m56895kk());
                c12025x6Arr[1].m56898x1(c12025x6Arr[0].m56895kk());
                C22231OoooOO0.OooO00o(c12025x6Arr[1], c12025x6Arr[2], fM67495m92);
                c12025x6Arr[3].m56898x1(c12025x6Arr[2].m56895kk());
                c12025x6Arr[3].CloneTo(c12025x6Arr2[0]);
                c12025x6Arr[2].CloneTo(c12025x6Arr2[1]);
                c12025x6Arr[0].CloneTo(c12025x6Arr2[2]);
                c12025x6 = c12025x6Arr[1];
                c12025x62 = c12025x6Arr2[3];
                break;
            case 5:
                c12025x6Arr[0].m56891k4(((fM64121to + fM67495m9) / 2.0f) + c12025x63.m56897x1());
                C21034OooOOOo.OooO0OO(c12025x6Arr[0], c12025x6Arr[1], fM67495m9);
                C21034OooOOOo.OooO0OO(c12025x6Arr[1], c12025x6Arr[2], fM64121to);
                C21034OooOOOo.OooO0OO(c12025x6Arr[0], c12025x6Arr[3], fM64121to);
                c12025x6Arr[0].m56898x1((fM67495m92 / 2.0f) + c12025x63.m56895kk());
                OooOOO.OooO0OO(c12025x6Arr[0], c12025x6Arr[1], fM67495m92);
                c12025x6Arr[2].m56898x1(c12025x6Arr[1].m56895kk());
                c12025x6Arr[3].m56898x1(c12025x6Arr[0].m56895kk());
                c12025x6Arr[3].CloneTo(c12025x6Arr2[0]);
                c12025x6Arr[2].CloneTo(c12025x6Arr2[1]);
                c12025x6Arr[0].CloneTo(c12025x6Arr2[2]);
                c12025x6 = c12025x6Arr[1];
                c12025x62 = c12025x6Arr2[3];
                break;
            case 6:
                c12025x6Arr[1].m56891k4(((fM64121to + fM67495m9) / 2.0f) + c12025x63.m56897x1());
                C21034OooOOOo.OooO0OO(c12025x6Arr[1], c12025x6Arr[0], fM67495m9);
                C21034OooOOOo.OooO0OO(c12025x6Arr[1], c12025x6Arr[2], fM64121to);
                C21034OooOOOo.OooO0OO(c12025x6Arr[0], c12025x6Arr[3], fM64121to);
                c12025x6Arr[0].m56898x1((fM67495m92 / 2.0f) + c12025x63.m56895kk());
                OooOOO.OooO0OO(c12025x6Arr[0], c12025x6Arr[1], fM67495m92);
                c12025x6Arr[2].m56898x1(c12025x6Arr[1].m56895kk());
                c12025x6Arr[3].m56898x1(c12025x6Arr[0].m56895kk());
                c12025x6Arr[0].CloneTo(c12025x6Arr2[0]);
                c12025x6Arr[1].CloneTo(c12025x6Arr2[1]);
                c12025x6Arr[3].CloneTo(c12025x6Arr2[2]);
                c12025x6 = c12025x6Arr[2];
                c12025x62 = c12025x6Arr2[3];
                break;
            case 7:
                c12025x6Arr[1].m56891k4(((fM64121to + fM67495m9) / 2.0f) + c12025x63.m56897x1());
                C21034OooOOOo.OooO0OO(c12025x6Arr[1], c12025x6Arr[0], fM64121to);
                C21034OooOOOo.OooO0OO(c12025x6Arr[1], c12025x6Arr[2], fM67495m9);
                C21034OooOOOo.OooO0OO(c12025x6Arr[2], c12025x6Arr[3], fM64121to);
                c12025x6Arr[0].m56898x1((fM67495m92 / 2.0f) + c12025x63.m56895kk());
                c12025x6Arr[1].m56898x1(c12025x6Arr[0].m56895kk());
                OooOOO.OooO0OO(c12025x6Arr[1], c12025x6Arr[2], fM67495m92);
                c12025x6Arr[3].m56898x1(c12025x6Arr[2].m56895kk());
                c12025x6Arr[0].CloneTo(c12025x6Arr2[0]);
                c12025x6Arr[1].CloneTo(c12025x6Arr2[1]);
                c12025x6Arr[3].CloneTo(c12025x6Arr2[2]);
                c12025x6 = c12025x6Arr[2];
                c12025x62 = c12025x6Arr2[3];
                break;
            default:
                return c12025x6Arr2;
        }
        c12025x6.CloneTo(c12025x62);
        return c12025x6Arr2;
    }

    /* JADX INFO: renamed from: to */
    public static C12025x6[] m72660to(C14365qy c14365qy) {
        float fM64121to;
        float fM64117m9;
        C12025x6 c12025x6;
        C12025x6 c12025x62;
        C12025x6 c12025x63 = new C12025x6(c14365qy.m69833e0().m64106h4(), c14365qy.m69833e0().m64114kk());
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
        C12025x6[] c12025x6Arr = (C12025x6[]) C22200OooO0o0.OooO00o(C12025x6.class, 4);
        C12025x6[] c12025x6Arr2 = (C12025x6[]) C22200OooO0o0.OooO00o(C12025x6.class, 2);
        switch (iM69877xk2) {
            case 0:
            case 8:
                C22227OoooO.OooO0O0(fM64121to, fM67495m9, 2.0f, c12025x63.m56897x1(), c12025x6Arr[0]);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[0], c12025x6Arr[1], fM64121to);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[1], c12025x6Arr[2], fM67495m9);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[0], c12025x6Arr[3], fM67495m9);
                c12025x6Arr[0].m56898x1((fM67495m92 / 2.0f) + c12025x63.m56895kk());
                c12025x6Arr[1].m56898x1(c12025x6Arr[0].m56895kk());
                OooOOO.OooO0OO(c12025x6Arr[1], c12025x6Arr[2], fM67495m92);
                c12025x6Arr[3].m56898x1(c12025x6Arr[2].m56895kk());
                c12025x6Arr[1].CloneTo(c12025x6Arr2[0]);
                c12025x6 = c12025x6Arr[2];
                c12025x62 = c12025x6Arr2[1];
                break;
            case 1:
                C22227OoooO.OooO0O0(fM64121to, fM67495m9, 2.0f, c12025x63.m56897x1(), c12025x6Arr[0]);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[0], c12025x6Arr[1], fM67495m9);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[1], c12025x6Arr[2], fM64121to);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[0], c12025x6Arr[3], fM64121to);
                C22207OooOOoo.OooO0O0(c12025x6Arr[0], fM67495m92, 2.0f, c12025x63.m56895kk());
                C22231OoooOO0.OooO00o(c12025x6Arr[0], c12025x6Arr[1], fM67495m92);
                c12025x6Arr[2].m56898x1(c12025x6Arr[1].m56895kk());
                c12025x6Arr[3].m56898x1(c12025x6Arr[0].m56895kk());
                c12025x6Arr[1].CloneTo(c12025x6Arr2[0]);
                c12025x6 = c12025x6Arr[2];
                c12025x62 = c12025x6Arr2[1];
                break;
            case 2:
                C22227OoooO.OooO0O0(fM64121to, fM67495m9, 2.0f, c12025x63.m56897x1(), c12025x6Arr[1]);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[1], c12025x6Arr[0], fM67495m9);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[1], c12025x6Arr[2], fM64121to);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[0], c12025x6Arr[3], fM64121to);
                C22207OooOOoo.OooO0O0(c12025x6Arr[0], fM67495m92, 2.0f, c12025x63.m56895kk());
                C22231OoooOO0.OooO00o(c12025x6Arr[0], c12025x6Arr[1], fM67495m92);
                c12025x6Arr[2].m56898x1(c12025x6Arr[1].m56895kk());
                c12025x6Arr[3].m56898x1(c12025x6Arr[0].m56895kk());
                c12025x6Arr[1].CloneTo(c12025x6Arr2[0]);
                c12025x6 = c12025x6Arr[2];
                c12025x62 = c12025x6Arr2[1];
                break;
            case 3:
                C22227OoooO.OooO0O0(fM64121to, fM67495m9, 2.0f, c12025x63.m56897x1(), c12025x6Arr[1]);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[1], c12025x6Arr[0], fM64121to);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[1], c12025x6Arr[2], fM67495m9);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[2], c12025x6Arr[3], fM64121to);
                C22207OooOOoo.OooO0O0(c12025x6Arr[0], fM67495m92, 2.0f, c12025x63.m56895kk());
                c12025x6Arr[1].m56898x1(c12025x6Arr[0].m56895kk());
                C22231OoooOO0.OooO00o(c12025x6Arr[1], c12025x6Arr[2], fM67495m92);
                c12025x6Arr[3].m56898x1(c12025x6Arr[2].m56895kk());
                c12025x6Arr[1].CloneTo(c12025x6Arr2[0]);
                c12025x6 = c12025x6Arr[2];
                c12025x62 = c12025x6Arr2[1];
                break;
            case 4:
                c12025x6Arr[0].m56891k4(((fM64121to + fM67495m9) / 2.0f) + c12025x63.m56897x1());
                C21034OooOOOo.OooO0OO(c12025x6Arr[0], c12025x6Arr[1], fM64121to);
                C21034OooOOOo.OooO0OO(c12025x6Arr[1], c12025x6Arr[2], fM67495m9);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[2], c12025x6Arr[3], fM64121to);
                C22207OooOOoo.OooO0O0(c12025x6Arr[0], fM67495m92, 2.0f, c12025x63.m56895kk());
                c12025x6Arr[1].m56898x1(c12025x6Arr[0].m56895kk());
                C22231OoooOO0.OooO00o(c12025x6Arr[1], c12025x6Arr[2], fM67495m92);
                c12025x6Arr[3].m56898x1(c12025x6Arr[2].m56895kk());
                c12025x6Arr[0].CloneTo(c12025x6Arr2[0]);
                c12025x6 = c12025x6Arr[3];
                c12025x62 = c12025x6Arr2[1];
                break;
            case 5:
                c12025x6Arr[0].m56891k4(((fM64121to + fM67495m9) / 2.0f) + c12025x63.m56897x1());
                C21034OooOOOo.OooO0OO(c12025x6Arr[0], c12025x6Arr[1], fM67495m9);
                C21034OooOOOo.OooO0OO(c12025x6Arr[1], c12025x6Arr[2], fM64121to);
                C21034OooOOOo.OooO0OO(c12025x6Arr[0], c12025x6Arr[3], fM64121to);
                c12025x6Arr[0].m56898x1((fM67495m92 / 2.0f) + c12025x63.m56895kk());
                OooOOO.OooO0OO(c12025x6Arr[0], c12025x6Arr[1], fM67495m92);
                c12025x6Arr[2].m56898x1(c12025x6Arr[1].m56895kk());
                c12025x6Arr[3].m56898x1(c12025x6Arr[0].m56895kk());
                c12025x6Arr[0].CloneTo(c12025x6Arr2[0]);
                c12025x6 = c12025x6Arr[3];
                c12025x62 = c12025x6Arr2[1];
                break;
            case 6:
                c12025x6Arr[1].m56891k4(((fM64121to + fM67495m9) / 2.0f) + c12025x63.m56897x1());
                C21034OooOOOo.OooO0OO(c12025x6Arr[1], c12025x6Arr[0], fM67495m9);
                C21034OooOOOo.OooO0OO(c12025x6Arr[1], c12025x6Arr[2], fM64121to);
                C21034OooOOOo.OooO0OO(c12025x6Arr[0], c12025x6Arr[3], fM64121to);
                c12025x6Arr[0].m56898x1((fM67495m92 / 2.0f) + c12025x63.m56895kk());
                OooOOO.OooO0OO(c12025x6Arr[0], c12025x6Arr[1], fM67495m92);
                c12025x6Arr[2].m56898x1(c12025x6Arr[1].m56895kk());
                c12025x6Arr[3].m56898x1(c12025x6Arr[0].m56895kk());
                c12025x6Arr[0].CloneTo(c12025x6Arr2[0]);
                c12025x6 = c12025x6Arr[3];
                c12025x62 = c12025x6Arr2[1];
                break;
            case 7:
                c12025x6Arr[1].m56891k4(((fM64121to + fM67495m9) / 2.0f) + c12025x63.m56897x1());
                C21034OooOOOo.OooO0OO(c12025x6Arr[1], c12025x6Arr[0], fM64121to);
                C21034OooOOOo.OooO0OO(c12025x6Arr[1], c12025x6Arr[2], fM67495m9);
                C21034OooOOOo.OooO0OO(c12025x6Arr[2], c12025x6Arr[3], fM64121to);
                c12025x6Arr[0].m56898x1((fM67495m92 / 2.0f) + c12025x63.m56895kk());
                c12025x6Arr[1].m56898x1(c12025x6Arr[0].m56895kk());
                OooOOO.OooO0OO(c12025x6Arr[1], c12025x6Arr[2], fM67495m92);
                c12025x6Arr[3].m56898x1(c12025x6Arr[2].m56895kk());
                c12025x6Arr[0].CloneTo(c12025x6Arr2[0]);
                c12025x6 = c12025x6Arr[3];
                c12025x62 = c12025x6Arr2[1];
                break;
            default:
                return c12025x6Arr2;
        }
        c12025x6.CloneTo(c12025x62);
        return c12025x6Arr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00e4  */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m72661x1(C14365qy c14365qy) {
        C14365qy c14365qy2;
        boolean z;
        m72653k4(c14365qy);
        c14365qy.m69844k4(false);
        c14365qy.m69835g8();
        if (c14365qy.m69865up().size() == 0 || C14365qy.m69819to(c14365qy.m69865up()) == 0) {
            return;
        }
        boolean zIsChartTypeBar = ChartTypeCharacterizer.isChartTypeBar(c14365qy.m69834fa().getType());
        int iM69819to = C14365qy.m69819to(c14365qy.m69865up());
        float fM72786k4 = C14743wm.m72786k4(C7019kk.m27462to(Float.valueOf(c14365qy.m69833e0().m64124x1()), 13), C7019kk.m27462to(Float.valueOf(c14365qy.m69833e0().m64121to()), 13), zIsChartTypeBar, c14365qy.m69863u4());
        double dM73430x6 = c14365qy.m69863u4().m73430x6();
        float fM72786k42 = C14743wm.m72786k4(C7019kk.m27462to(Float.valueOf(c14365qy.m69833e0().m64114kk() - c14365qy.m69833e0().m64100du()), 13), C7019kk.m27462to(Float.valueOf(c14365qy.m69833e0().m64100du()), 13), zIsChartTypeBar, c14365qy.m69863u4());
        c14365qy.f48440k4.m7072k4();
        C12014ne c12014neClone = c14365qy.f48440k4.f5456k4.Clone();
        C14714vx.m72561k4(zIsChartTypeBar, c14365qy);
        C13847mr c13847mr = c14365qy.m69865up().get_Item(0);
        int type = c14365qy.m69834fa().getType();
        if (type == 25) {
            c14365qy2 = c14365qy;
            C14285pi.m69083kk(fM72786k42, dM73430x6, iM69819to, c14365qy2);
        } else if (type == 27 || type == 30) {
            c14365qy2 = c14365qy;
            vbm.m72166k4(c14365qy2);
        } else if (type != 33) {
            switch (type) {
                case 3:
                case 7:
                case 11:
                case 15:
                    c14365qy2 = c14365qy;
                    C14285pi.m69067k4(fM72786k42, dM73430x6, iM69819to, c14365qy2);
                    break;
                case 4:
                case 8:
                case 12:
                case 16:
                    c14365qy2 = c14365qy;
                    C14285pi.m69065k4(dM73430x6, iM69819to, c14365qy2);
                    break;
                case 5:
                case 9:
                case 13:
                case 17:
                    c14365qy2 = c14365qy;
                    C14285pi.m69086x1(dM73430x6, iM69819to, c14365qy2);
                    break;
                case 6:
                case 10:
                case 14:
                case 18:
                    c14365qy2 = c14365qy;
                    C14285pi.m69087x1(fM72786k42, dM73430x6, iM69819to, c14365qy2);
                    break;
                default:
                    switch (type) {
                        case 36:
                        case 39:
                        case 42:
                        case 45:
                            c14365qy2 = c14365qy;
                            C0798b5.m4005k4(dM73430x6, iM69819to, c14365qy2);
                            break;
                        case 37:
                        case 40:
                        case 43:
                        case 46:
                            c14365qy2 = c14365qy;
                            C0798b5.m4015x1(dM73430x6, iM69819to, c14365qy2);
                            break;
                        case 38:
                        case 41:
                        case 44:
                            c14365qy2 = c14365qy;
                            C0798b5.m4007k4(fM72786k4, dM73430x6, iM69819to, c14365qy2);
                            break;
                        default:
                            switch (type) {
                                case 50:
                                    c14365qy2 = c14365qy;
                                    C0750ai.m3581k4(fM72786k42, dM73430x6, iM69819to, c14365qy2);
                                    break;
                                case 51:
                                    c14365qy2 = c14365qy;
                                    z = false;
                                    C0750ai.m3582k4(fM72786k42, dM73430x6, iM69819to, z, c14365qy2);
                                    break;
                                case 52:
                                    z = true;
                                    c14365qy2 = c14365qy;
                                    C0750ai.m3582k4(fM72786k42, dM73430x6, iM69819to, z, c14365qy2);
                                    break;
                                default:
                                    c14365qy2 = c14365qy;
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        if (c14365qy2.m69863u4().m73384dy() != null && c14365qy2.m69863u4().m73384dy().isVisible()) {
            C14787xi c14787xiM69863u4 = c14365qy2.m69863u4();
            if (zIsChartTypeBar) {
                C14409rq.m70250k4(c14787xiM69863u4);
            } else {
                C14409rq.m70251k4(c14787xiM69863u4, c14365qy2);
            }
        }
        if (c14365qy2.m69854ne().m73384dy() != null && c14365qy2.m69854ne().m73384dy().isVisible()) {
            C12014ne c12014neClone2 = c12014neClone.Clone();
            C14787xi c14787xiM69854ne = c14365qy2.m69854ne();
            if (zIsChartTypeBar) {
                C14409rq.m70247k4(iM69819to, c12014neClone2, c14787xiM69854ne, c14365qy2);
            } else {
                C14409rq.m70248k4(iM69819to, c12014neClone2, zIsChartTypeBar, c14787xiM69854ne, c14365qy2);
            }
        }
        if (c14365qy2.m69868wl().m73384dy() != null && c14365qy2.m69868wl().m73384dy().isVisible()) {
            C14409rq.m70257x1(c14365qy2.m69868wl(), c14365qy2);
        }
        if (c14365qy2.m69863u4().m73384dy() != null && c14365qy2.m69863u4().m73384dy().hasTitle() && c14365qy2.m69863u4().m73384dy().isVisible()) {
            m72654k4(c14365qy2, c14365qy2.m69863u4());
        }
        if (c14365qy2.m69854ne().m73384dy() != null && c14365qy2.m69854ne().m73384dy().hasTitle() && c14365qy2.m69854ne().m73384dy().isVisible()) {
            m72654k4(c14365qy2, c14365qy2.m69854ne());
        }
        if (c14365qy2.m69868wl().m73384dy() != null && c14365qy2.m69868wl().m73384dy().hasTitle() && c14365qy2.m69868wl().m73384dy().isVisible()) {
            m72654k4(c14365qy2, c14365qy2.m69868wl());
        }
        if (c14365qy2.m69834fa().hasTitle()) {
            c14365qy2.m69828ck().m68739k4(c14365qy2);
        }
        if (c14365qy2.m69834fa().hasDataTable()) {
            C14328q5 c14328q5M69838jd = c14365qy2.m69838jd();
            C14580tx.m71376k4(c14328q5M69838jd.f48246k4.m56669jd(), c14328q5M69838jd.f48246k4.m56664ck(), c14328q5M69838jd.f48246k4.m56663c5(), zIsChartTypeBar, c14365qy2);
        }
        if (c14365qy2.m69834fa().hasLegend()) {
            if (c14365qy2.m69834fa().getType() == 30 || c14365qy2.m69834fa().getType() == 27 || c14365qy2.m69826c5().m74376fa()) {
                gfh.m6620k4(c13847mr, c14365qy2, (Legend) c14365qy2.m69834fa().getLegend(), c14365qy2.m69865up().get_Item(0));
            } else {
                gfh.m6621k4(zIsChartTypeBar, c13847mr, c14365qy2, (Legend) c14365qy2.m69834fa().getLegend());
            }
        }
        c14365qy2.m69844k4(true);
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
        if (obj instanceof C14728w8) {
            return m72663x1((C14728w8) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: x1 */
    private static void m72662x1(C14365qy c14365qy, C12014ne[] c12014neArr, int i) {
        C12014ne c12014ne;
        C12014ne c12014ne2;
        C12014ne c12014ne3;
        int iM56663c5;
        boolean zIsChartTypeBar = ChartTypeCharacterizer.isChartTypeBar(c14365qy.m69834fa().getType());
        boolean zIsLocationAutocalculated = ((ChartPlotArea) C7019kk.m27452k4((Object) c14365qy.m69834fa().getPlotArea(), ChartPlotArea.class)).isLocationAutocalculated();
        C14328q5 c14328q5M69838jd = c14365qy.m69838jd();
        if (kc0.m63756k4(c12014neArr[0].Clone()) || !c14365qy.m69834fa().hasDataTable()) {
            return;
        }
        C12023wl c12023wlClone = C14580tx.m71375k4(c14365qy).Clone();
        c14328q5M69838jd.m69406k4(c12023wlClone.Clone());
        int iM71373k4 = C14580tx.m71373k4(c12014neArr[0].Clone(), c14365qy);
        c14328q5M69838jd.m69403k4(iM71373k4);
        int iM56862kk = c12023wlClone.m56862kk() + iM71373k4;
        c14328q5M69838jd.f48246k4.m56671k4(iM56862kk);
        if (c14365qy.m69829dq() > 0 && !zIsChartTypeBar) {
            switch (i) {
                case 0:
                case 3:
                case 4:
                case 7:
                case 8:
                    if (!zIsLocationAutocalculated && c14365qy.m69834fa().getPlotArea().getLayoutTargetType() == 0) {
                        C12014ne c12014ne4 = c12014neArr[0];
                        c12014ne4.m56671k4(iM56862kk + 2 + c12014ne4.m56683x1());
                        C12014ne c12014ne5 = c12014neArr[0];
                        c12014ne5.m56676kk(c12014ne5.m56669jd() - c12023wlClone.m56865x1());
                        C12014ne c12014ne6 = c12014neArr[0];
                        c12014ne6.m56684x1(c12023wlClone.m56865x1() + c12014ne6.m56663c5());
                    } else {
                        C12014ne c12014ne7 = c12014neArr[0];
                        c12014ne7.m56671k4(c12014ne7.m56683x1() - (iM56862kk + 2));
                        C12014ne c12014ne8 = c12014neArr[0];
                        c12014ne8.m56676kk(c12023wlClone.m56865x1() + c12014ne8.m56669jd());
                        c12014ne = c12014neArr[0];
                        iM56663c5 = c12014ne.m56663c5();
                        c12014ne.m56684x1(iM56663c5 - c12023wlClone.m56865x1());
                    }
                    break;
                case 1:
                case 2:
                case 5:
                case 6:
                    if (!zIsLocationAutocalculated && c14365qy.m69834fa().getPlotArea().getLayoutTargetType() == 0) {
                        c14328q5M69838jd.f48246k4.m56676kk(c12023wlClone.m56865x1() + c12014neArr[0].m56669jd());
                        c14328q5M69838jd.f48246k4.m56682to(c12014neArr[0].m56670k4());
                        c14328q5M69838jd.f48246k4.m56684x1(c12014neArr[0].m56663c5() - c12023wlClone.m56865x1());
                        c12014ne3 = c12014neArr[0];
                        c12014ne3.m56671k4(c12014ne3.m56683x1() + iM56862kk);
                    } else {
                        C12014ne c12014ne9 = c12014neArr[0];
                        c12014ne9.m56671k4(c12014ne9.m56683x1() - iM56862kk);
                        c14328q5M69838jd.f48246k4.m56676kk(c12023wlClone.m56865x1() + c12014neArr[0].m56669jd());
                        c14328q5M69838jd.f48246k4.m56682to(c12014neArr[0].m56670k4());
                        c12014ne = c14328q5M69838jd.f48246k4;
                        c12014ne2 = c12014neArr[0];
                        iM56663c5 = c12014ne2.m56663c5();
                        c12014ne.m56684x1(iM56663c5 - c12023wlClone.m56865x1());
                    }
                    break;
            }
        } else if (zIsLocationAutocalculated || c14365qy.m69834fa().getPlotArea().getLayoutTargetType() != 0) {
            C12014ne c12014ne10 = c12014neArr[0];
            c12014ne10.m56671k4(c12014ne10.m56683x1() - iM56862kk);
            c14328q5M69838jd.f48246k4.m56676kk(c12023wlClone.m56865x1() + c12014neArr[0].m56669jd());
            c14328q5M69838jd.f48246k4.m56682to(c12014neArr[0].m56670k4());
            c12014ne = c14328q5M69838jd.f48246k4;
            c12014ne2 = c12014neArr[0];
            iM56663c5 = c12014ne2.m56663c5();
            c12014ne.m56684x1(iM56663c5 - c12023wlClone.m56865x1());
        } else {
            c14328q5M69838jd.f48246k4.m56676kk(c12023wlClone.m56865x1() + c12014neArr[0].m56669jd());
            c14328q5M69838jd.f48246k4.m56682to(c12014neArr[0].m56670k4());
            c14328q5M69838jd.f48246k4.m56684x1(c12014neArr[0].m56663c5() - c12023wlClone.m56865x1());
            c12014ne3 = c12014neArr[0];
            c12014ne3.m56671k4(c12014ne3.m56683x1() + iM56862kk);
        }
        if (zIsLocationAutocalculated || c14365qy.m69834fa().getPlotArea().getLayoutTargetType() == 1) {
            C14714vx.m72559k4(c12014neArr[0].Clone(), zIsChartTypeBar, c14365qy);
        }
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C14728w8 Clone() {
        C14728w8 c14728w8 = new C14728w8();
        CloneTo(c14728w8);
        return c14728w8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:386:0x0eb4, code lost:
    
        if (r5 != 8) goto L391;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0771  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x07c1  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0905  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0914  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0ac0  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0ac5  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0bd7  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0d48  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m72653k4(C14365qy c14365qy) {
        int i;
        C12023wl c12023wl;
        int i2;
        C14787xi c14787xi;
        boolean z;
        C12014ne c12014ne;
        C12014ne c12014ne2;
        float fM67480k4;
        int iM56663c5;
        float f;
        int iM27462to;
        float fM67495m9;
        int iM56683x1;
        int iM56683x12;
        int iM56670k4;
        int iM56663c52;
        int iM56865x1;
        int iM56683x13;
        int iM56862kk;
        int iM56663c53;
        int iM56663c54;
        int iM56668h4;
        float fM67495m92;
        int iM56683x14;
        C12014ne c12014ne3;
        if (c14365qy.m69865up().size() == 0 || C14365qy.m69819to(c14365qy.m69865up()) == 0) {
            return;
        }
        List<C13847mr> listM69865up = c14365qy.m69865up();
        C14787xi c14787xiM69854ne = c14365qy.m69854ne();
        C14787xi c14787xiM69863u4 = c14365qy.m69863u4();
        kc0.m63755k4(c14365qy.m69865up(), c14365qy.m69865up().get_Item(0), c14787xiM69854ne, c14787xiM69863u4);
        boolean zIsChartTypeBar = ChartTypeCharacterizer.isChartTypeBar(c14365qy.m69834fa().getType());
        boolean zM72563k4 = C14714vx.m72563k4(c14365qy.m69834fa().getType());
        C13847mr c13847mr = c14365qy.m69865up().get_Item(0);
        C12014ne c12014ne4 = new C12014ne(C7019kk.m27462to(Float.valueOf(c14365qy.m69878yd()), 13) + 11, C7019kk.m27462to(Float.valueOf(c14365qy.m69823b3()), 13) + 11, C7019kk.m27462to(Float.valueOf(c14365qy.m69867v4()), 13) - 22, C7019kk.m27462to(Float.valueOf(c14365qy.m69852lr()), 13) - 22);
        C12014ne[] c12014neArr = {c12014ne4};
        C14743wm.m72821x1(c14365qy, c12014neArr);
        c12014neArr[0].CloneTo(c12014ne4);
        if (c14365qy.m69834fa().hasLegend()) {
            if (c14365qy.m69834fa().getType() == 30 || c14365qy.m69834fa().getType() == 27 || c14365qy.m69826c5().m74376fa()) {
                C13847mr c13847mr2 = c14365qy.m69865up().get_Item(0);
                c12014neArr[0] = c12014ne4;
                gfh.m6612k4(c13847mr2, c12014neArr, c14365qy);
                c12014ne3 = c12014neArr[0];
            } else {
                c12014neArr[0] = c12014ne4;
                gfh.m6613k4(c12014neArr, c14365qy);
                c12014ne3 = c12014neArr[0];
            }
            c12014ne3.CloneTo(c12014ne4);
        }
        C14714vx.m72559k4(c12014ne4.Clone(), zIsChartTypeBar, c14365qy);
        C12014ne c12014ne5 = new C12014ne(c12014ne4.m56669jd(), c12014ne4.m56664ck(), c12014ne4.m56663c5(), c12014ne4.m56683x1());
        if (c14787xiM69854ne.m73384dy() != null && c14787xiM69854ne.m73384dy().hasTitle() && c14787xiM69854ne.m73384dy().isVisible()) {
            c12014neArr[0] = c12014ne4;
            m72657k4(c14787xiM69854ne, c12014ne5.Clone(), c12014neArr, zIsChartTypeBar, c14365qy);
            c12014neArr[0].CloneTo(c12014ne4);
        }
        if (c14787xiM69863u4.m73384dy() != null && c14787xiM69863u4.m73384dy().hasTitle() && c14787xiM69863u4.m73384dy().isVisible()) {
            if (C14064he.m66715kk(c14787xiM69863u4.m73408m9().m68743to())) {
                c14787xiM69863u4.m73408m9().m68738k4(90.0f);
            }
            c12014neArr[0] = c12014ne4;
            m72657k4(c14787xiM69863u4, c12014ne5.Clone(), c12014neArr, zIsChartTypeBar, c14365qy);
            c12014neArr[0].CloneTo(c12014ne4);
        }
        c12014neArr[0] = c12014ne4;
        vbm.m72167k4(c12014neArr, c13847mr);
        c12014neArr[0].CloneTo(c12014ne4);
        c14365qy.f48440k4.f5456k4 = new C12014ne(c12014ne4.m56669jd(), c12014ne4.m56664ck(), c12014ne4.m56663c5(), c12014ne4.m56683x1());
        boolean zIsLocationAutocalculated = ((ChartPlotArea) C7019kk.m27452k4((Object) c14365qy.m69834fa().getPlotArea(), ChartPlotArea.class)).isLocationAutocalculated();
        if (!((ChartPlotArea) C7019kk.m27452k4((Object) c14365qy.m69834fa().getPlotArea(), ChartPlotArea.class)).isLocationAutocalculated()) {
            c12014neArr[0] = c12014ne4;
            C14743wm.m72804k4(c14365qy, c12014neArr);
            c12014neArr[0].CloneTo(c12014ne4);
        }
        c14365qy.f48440k4.f5456k4 = new C12014ne(c12014ne4.m56669jd(), c12014ne4.m56664ck(), c12014ne4.m56663c5(), c12014ne4.m56683x1());
        double[] dArr = {0.0d};
        double[] dArr2 = {0.0d};
        C14743wm.m72801k4(listM69865up, dArr, dArr2, c14787xiM69863u4);
        double d = dArr[0];
        double d2 = dArr2[0];
        boolean z2 = c14787xiM69863u4.m73384dy() == null || c14787xiM69863u4.m73422wl();
        boolean z3 = c14787xiM69863u4.m73384dy() == null || c14787xiM69863u4.m73411qq();
        C14743wm.m72792k4(d2, d, c14787xiM69863u4.f50098m9, c14365qy.m69834fa().getType(), c12014ne4.Clone(), zIsChartTypeBar, listM69865up.get_Item(0), c14365qy.m69863u4());
        boolean z4 = z2;
        C14743wm.m72800k4(c14787xiM69854ne.f50098m9, c12014ne4.Clone(), c14365qy.m69834fa().getType(), listM69865up, zIsChartTypeBar, c14787xiM69854ne);
        if (zM72563k4) {
            m72651h4(c14365qy);
        }
        if (!kc0.m63756k4(c12014ne4.Clone())) {
            c12014ne4.m56676kk(c12014ne4.m56669jd() + 2);
            c12014ne4.m56682to(c12014ne4.m56664ck() + 2);
            c12014ne4.m56684x1(c12014ne4.m56663c5() - 4);
            c12014ne4.m56671k4(c12014ne4.m56683x1() - 4);
            C14714vx.m72559k4(c12014ne4.Clone(), zIsChartTypeBar, c14365qy);
        }
        if (c14365qy.m69868wl().m73384dy() != null && zM72563k4 && c14365qy.m69868wl().m73384dy().hasTitle() && c14365qy.m69868wl().m73384dy().isVisible()) {
            c12014neArr[0] = c12014ne4;
            m72658k4(c14365qy.m69868wl(), c12014neArr, c14365qy);
            c12014neArr[0].CloneTo(c12014ne4);
        }
        int iM69877xk = c14365qy.m69877xk() / 45;
        c12014neArr[0] = c12014ne4;
        m72662x1(c14365qy, c12014neArr, iM69877xk);
        c12014neArr[0].CloneTo(c12014ne4);
        C14787xi c14787xiM69868wl = c14365qy.m69868wl();
        int iM69819to = C14365qy.m69819to(c14365qy.m69865up());
        C12023wl c12023wlClone = C14409rq.m70243k4(c14787xiM69868wl.f50098m9, c12014ne4.Clone(), c14787xiM69868wl).Clone();
        int iM27462to2 = (C7019kk.m27462to(Float.valueOf(c14365qy.m69852lr()), 13) * c14787xiM69868wl.m73378ck()) / 4000;
        if (kc0.m63756k4(c12014ne4.Clone()) || c14787xiM69868wl.m73384dy() == null || c14787xiM69868wl.m73384dy().getTickLabelPosition() == 3 || !c14787xiM69868wl.m73384dy().isVisible()) {
            i = 0;
        } else {
            C12023wl c12023wl2 = new C12023wl(0, 0);
            if (c14787xiM69868wl.m73408m9() != null) {
                c14787xiM69868wl.m73408m9().f47882k4.f5456k4.m56680m9().CloneTo(c12023wl2);
            }
            if (zIsChartTypeBar) {
                C12025x6 c12025x6Clone = m72650du(c14365qy).Clone();
                int iM56865x12 = c12023wlClone.m56865x1() + iM27462to2;
                if (C7019kk.m27462to(Float.valueOf(c12025x6Clone.m56897x1() - c12014ne4.m56669jd()), 13) < iM56865x12) {
                    if (zIsLocationAutocalculated || c14365qy.m69834fa().getPlotArea().getLayoutTargetType() != 0) {
                        c12014ne4.m56676kk(c12014ne4.m56669jd() + iM56865x12);
                        iM56663c54 = c12014ne4.m56663c5() - iM56865x12;
                    } else {
                        c12014ne4.m56676kk(c12014ne4.m56669jd() - iM56865x12);
                        iM56663c54 = c12014ne4.m56663c5() + iM56865x12;
                    }
                    c12014ne4.m56684x1(iM56663c54);
                }
            } else {
                C12025x6[] c12025x6ArrM72660to = m72660to(c14365qy);
                Object[] objArr = c12025x6ArrM72660to[0].m56895kk() < c12025x6ArrM72660to[1].m56895kk();
                float fM67480k42 = C14116yg.m67480k4((c12025x6ArrM72660to[1].m56895kk() - c12025x6ArrM72660to[0].m56895kk()) / iM69819to);
                int iM56862kk2 = c12023wlClone.m56862kk() + iM27462to2;
                if (c14365qy.m69829dq() > 0) {
                    if (c12025x6ArrM72660to[0].m56895kk() != c12025x6ArrM72660to[1].m56895kk()) {
                        C12023wl c12023wlClone2 = c12023wlClone.Clone();
                        Object[] objArr2 = objArr;
                        if (c14365qy.m69854ne().m73384dy().getTickLabelPosition() != 3) {
                            c12023wlClone2.m56860k4(c12023wlClone2.m56865x1() + iM27462to2);
                        }
                        int iM56865x13 = c12023wl2.m56865x1() + m72652k4(c14365qy, c12023wlClone2.Clone());
                        if (iM69877xk == 0) {
                            if (c12014ne4.m56668h4() - (C7019kk.m27462to(Float.valueOf(C14116yg.m67480k4(c12025x6ArrM72660to[1].m56897x1() + c12025x6ArrM72660to[0].m56897x1())), 13) / 2) < iM56865x13) {
                                iM56668h4 = iM56865x13 - (c12014ne4.m56668h4() - (C7019kk.m27462to(Float.valueOf(C14116yg.m67480k4(c12025x6ArrM72660to[1].m56897x1() + c12025x6ArrM72660to[0].m56897x1())), 13) / 2));
                                int iM56663c55 = (zIsLocationAutocalculated || c14365qy.m69834fa().getPlotArea().getLayoutTargetType() != 0) ? c12014ne4.m56663c5() - iM56668h4 : c12014ne4.m56663c5() + iM56668h4;
                                c12014ne4.m56684x1(iM56663c55);
                            }
                            fM67495m92 = ((float) C14116yg.m67495m9((((double) c14365qy.m69829dq()) * 3.141592653589793d) / 180.0d)) * fM67480k42;
                            if (C7019kk.m27462to(Float.valueOf((c12014ne4.m56670k4() - c12025x6ArrM72660to[objArr2 == true ? 1 : 0].m56895kk()) + fM67495m92), 13) < c12023wlClone.m56862kk()) {
                                if (zIsLocationAutocalculated || c14365qy.m69834fa().getPlotArea().getLayoutTargetType() != 0) {
                                    iM56683x14 = c12014ne4.m56683x1() - (c12023wlClone.m56862kk() - C7019kk.m27462to(Float.valueOf((c12014ne4.m56670k4() - c12025x6ArrM72660to[objArr2 == true ? 1 : 0].m56895kk()) + fM67495m92), 13));
                                    c12014ne4.m56671k4(iM56683x14);
                                } else {
                                    c12014ne4.m56671k4((c12023wlClone.m56862kk() - C7019kk.m27462to(Float.valueOf((c12014ne4.m56670k4() - c12025x6ArrM72660to[objArr2 == true ? 1 : 0].m56895kk()) + fM67495m92), 13)) + c12014ne4.m56683x1());
                                }
                            }
                        } else if (iM69877xk == 3) {
                            if ((C7019kk.m27462to(Float.valueOf(C14116yg.m67480k4(c12025x6ArrM72660to[1].m56897x1() + c12025x6ArrM72660to[0].m56897x1())), 13) / 2) - c12014ne4.m56669jd() < iM56865x13) {
                                iM56668h4 = iM56865x13 - ((C7019kk.m27462to(Float.valueOf(C14116yg.m67480k4(c12025x6ArrM72660to[1].m56897x1() + c12025x6ArrM72660to[0].m56897x1())), 13) / 2) - c12014ne4.m56669jd());
                                if (zIsLocationAutocalculated || c14365qy.m69834fa().getPlotArea().getLayoutTargetType() != 0) {
                                    c12014ne4.m56676kk(c12014ne4.m56669jd() + iM56668h4);
                                    c12014ne4.m56684x1(iM56663c55);
                                } else {
                                    c12014ne4.m56676kk(c12014ne4.m56669jd() - iM56668h4);
                                    c12014ne4.m56684x1(iM56663c55);
                                }
                            }
                            fM67495m92 = ((float) C14116yg.m67495m9((((double) c14365qy.m69829dq()) * 3.141592653589793d) / 180.0d)) * fM67480k42;
                            if (C7019kk.m27462to(Float.valueOf((c12014ne4.m56670k4() - c12025x6ArrM72660to[objArr2 == true ? 1 : 0].m56895kk()) + fM67495m92), 13) < c12023wlClone.m56862kk()) {
                            }
                        } else if (iM69877xk != 4) {
                            if (iM69877xk != 7) {
                                if (iM69877xk == 8) {
                                }
                            }
                            fM67495m92 = ((float) C14116yg.m67495m9((((double) c14365qy.m69829dq()) * 3.141592653589793d) / 180.0d)) * fM67480k42;
                            if (C7019kk.m27462to(Float.valueOf((c12014ne4.m56670k4() - c12025x6ArrM72660to[objArr2 == true ? 1 : 0].m56895kk()) + fM67495m92), 13) < c12023wlClone.m56862kk()) {
                            }
                        }
                    } else if ((c12014ne4.m56670k4() - c12023wl2.m56862kk()) - C7019kk.m27462to(Float.valueOf(c12025x6ArrM72660to[0].m56895kk()), 13) < iM56862kk2) {
                        iM56683x14 = (zIsLocationAutocalculated || c14365qy.m69834fa().getPlotArea().getLayoutTargetType() != 0) ? c12014ne4.m56683x1() - (iM56862kk2 - ((c12014ne4.m56670k4() - c12023wl2.m56862kk()) - C7019kk.m27462to(Float.valueOf(c12025x6ArrM72660to[0].m56895kk()), 13))) : (iM56862kk2 - ((c12014ne4.m56670k4() - c12023wl2.m56862kk()) - C7019kk.m27462to(Float.valueOf(c12025x6ArrM72660to[0].m56895kk()), 13))) + c12014ne4.m56683x1();
                        c12014ne4.m56671k4(iM56683x14);
                    }
                }
            }
            if (zIsLocationAutocalculated || c14365qy.m69834fa().getPlotArea().getLayoutTargetType() == 1) {
                i = 0;
                C14714vx.m72559k4(c12014ne4.Clone(), false, c14365qy);
            }
        }
        C12023wl c12023wlClone3 = C0841c4.m4463k4(c14787xiM69863u4, listM69865up.get_Item(i), zIsChartTypeBar).Clone();
        c14787xiM69863u4.m73396k4(c12023wlClone3.Clone());
        if (c14787xiM69863u4.m73384dy() == null || kc0.m63756k4(c12014ne4.Clone()) || c14787xiM69863u4.m73384dy().getTickLabelPosition() == 3 || !c14787xiM69863u4.m73384dy().isVisible()) {
            c12023wl = c12023wlClone3;
        } else if (zIsChartTypeBar) {
            c12023wl = c12023wlClone3;
            C12025x6[] c12025x6ArrM72659kk = m72659kk(c14365qy);
            int iM56862kk3 = c12023wl.m56862kk();
            if (c12014ne4.m56670k4() - C7019kk.m27462to(Float.valueOf(c12025x6ArrM72659kk[0].m56895kk()), 13) < iM56862kk3) {
                if (!zIsLocationAutocalculated && c14365qy.m69834fa().getPlotArea().getLayoutTargetType() == 0) {
                    iM56670k4 = (iM56862kk3 - (c12014ne4.m56670k4() - C7019kk.m27462to(Float.valueOf(c12025x6ArrM72659kk[0].m56895kk()), 13))) + c12014ne4.m56683x1();
                    c12014ne4.m56671k4(iM56670k4);
                } else if ((ChartTypeCharacterizer.isBar3DChart(c14365qy.m69834fa().getType()) && c14787xiM69854ne.m73384dy().isPlotOrderReversed()) || c14787xiM69854ne.m73384dy().getCrossType() == 1) {
                    c12014ne4.m56671k4(c12014ne4.m56683x1() - (iM56862kk3 - (c12014ne4.m56670k4() - C7019kk.m27462to(Float.valueOf(c12025x6ArrM72659kk[0].m56895kk()), 13))));
                    c12014ne4.m56682to(c12014ne4.m56664ck() + iM56862kk3);
                } else {
                    iM56683x12 = c12014ne4.m56683x1() - (iM56862kk3 - (c12014ne4.m56670k4() - C7019kk.m27462to(Float.valueOf(c12025x6ArrM72659kk[0].m56895kk()), 13)));
                    c12014ne4.m56671k4(iM56683x12);
                }
            }
            if (zIsLocationAutocalculated) {
            }
        } else {
            C12025x6 c12025x6Clone2 = m72650du(c14365qy).Clone();
            if (c12025x6Clone2.m56897x1() < c14365qy.m69833e0().m64106h4()) {
                c12023wl = c12023wlClone3;
                int iM27462to3 = C7019kk.m27462to(Float.valueOf(c12025x6Clone2.m56897x1() - c12014ne4.m56669jd()), 13);
                if (c14787xiM69863u4.m73408m9() != null) {
                    iM27462to3 -= c14787xiM69863u4.m73408m9().f47882k4.f5456k4.m56680m9().m56865x1();
                }
                iM56865x1 = c12023wl.m56865x1();
                if (c14365qy.m69834fa().hasDataTable()) {
                    iM56865x1 -= c14365qy.m69838jd().m69401h4().m56865x1();
                }
                if (iM27462to3 < iM56865x1) {
                    if (zIsLocationAutocalculated || c14365qy.m69834fa().getPlotArea().getLayoutTargetType() != 0) {
                        c12014ne4.m56676kk(c12014ne4.m56669jd() + iM56865x1);
                        iM56663c52 = c12014ne4.m56663c5();
                        iM56663c53 = iM56663c52 - iM56865x1;
                        c12014ne4.m56684x1(iM56663c53);
                    } else {
                        c12014ne4.m56676kk(c12014ne4.m56669jd() - iM56865x1);
                        iM56663c53 = c12014ne4.m56663c5() + iM56865x1;
                        c12014ne4.m56684x1(iM56663c53);
                    }
                }
                if (c14365qy.m69829dq() >= 0) {
                    if ((c12025x6Clone2.m56895kk() - c14365qy.m69833e0().m64100du()) - c12014ne4.m56664ck() < c12023wl.m56862kk() / 2) {
                        if (zIsLocationAutocalculated || c14365qy.m69834fa().getPlotArea().getLayoutTargetType() != 0) {
                            c12014ne4.m56682to((c12023wl.m56862kk() / 2) + c12014ne4.m56664ck());
                        } else {
                            c12014ne4.m56682to(c12014ne4.m56664ck() - (c12023wl.m56862kk() / 2));
                        }
                    }
                    if (zIsLocationAutocalculated || c14365qy.m69834fa().getPlotArea().getLayoutTargetType() != 0) {
                        iM56683x12 = c12014ne4.m56683x1() - (c12023wl.m56862kk() / 2);
                        c12014ne4.m56671k4(iM56683x12);
                    } else {
                        iM56683x13 = c12014ne4.m56683x1();
                        iM56862kk = c12023wl.m56862kk();
                        iM56670k4 = (iM56862kk / 2) + iM56683x13;
                        c12014ne4.m56671k4(iM56670k4);
                    }
                } else if ((iM69877xk == 1 || iM69877xk == 2 || iM69877xk == 5 || iM69877xk == 6) && c12014ne4.m56670k4() - c12025x6Clone2.m56895kk() < c12023wl.m56862kk() / 2) {
                    if (!zIsLocationAutocalculated && c14365qy.m69834fa().getPlotArea().getLayoutTargetType() == 0) {
                        iM56683x13 = c12014ne4.m56683x1();
                        iM56862kk = c12023wl.m56862kk();
                        iM56670k4 = (iM56862kk / 2) + iM56683x13;
                        c12014ne4.m56671k4(iM56670k4);
                    }
                    iM56683x12 = c12014ne4.m56683x1() - (c12023wl.m56862kk() / 2);
                    c12014ne4.m56671k4(iM56683x12);
                }
                if (zIsLocationAutocalculated || c14365qy.m69834fa().getPlotArea().getLayoutTargetType() == 1) {
                    C14714vx.m72559k4(c12014ne4.Clone(), zIsChartTypeBar, c14365qy);
                }
            } else {
                c12023wl = c12023wlClone3;
                if (C7019kk.m27462to(Float.valueOf(c12014ne4.m56668h4() - c12025x6Clone2.m56897x1()), 13) < c12023wl.m56865x1()) {
                    if (zIsLocationAutocalculated || c14365qy.m69834fa().getPlotArea().getLayoutTargetType() != 0) {
                        iM56663c52 = c12014ne4.m56663c5();
                        iM56865x1 = c12023wl.m56865x1();
                        iM56663c53 = iM56663c52 - iM56865x1;
                        c12014ne4.m56684x1(iM56663c53);
                    } else {
                        c12014ne4.m56684x1(c12023wl.m56865x1() + c12014ne4.m56663c5());
                    }
                }
                if (c14365qy.m69829dq() >= 0) {
                }
                if (zIsLocationAutocalculated) {
                    C14714vx.m72559k4(c12014ne4.Clone(), zIsChartTypeBar, c14365qy);
                }
            }
        }
        C12023wl c12023wlClone4 = C0841c4.m4462k4(c14787xiM69854ne, c12014ne4.Clone(), iM69819to, zIsChartTypeBar, listM69865up.get_Item(0)).Clone();
        c14787xiM69854ne.m73396k4(c12023wlClone4.Clone());
        float fM56639dy = c14787xiM69854ne.m73384dy() != null ? c14787xiM69854ne.m73400kk().m56639dy() : 0.0f;
        int iOooO00o = C22201OooO0oO.OooO00o(c14787xiM69854ne.m73390jd() + C0841c4.m4453k4(fM56639dy) + C0841c4.m4486x1(fM56639dy), 0.5d, 14);
        if (c14365qy.m69861to() != null) {
            iOooO00o += c14365qy.m69861to().length * iOooO00o;
        }
        if (c14787xiM69854ne.m73384dy() == null || kc0.m63756k4(c12014ne4.Clone()) || c14787xiM69854ne.m73384dy().getTickLabelPosition() == 3 || !c14787xiM69854ne.m73384dy().isVisible()) {
            i2 = iOooO00o;
        } else {
            C12023wl c12023wl3 = new C12023wl(0, 0);
            if (c14787xiM69854ne.m73384dy() != null && c14787xiM69854ne.m73384dy().hasTitle()) {
                c14787xiM69854ne.m73408m9().f47882k4.f5456k4.m56680m9().CloneTo(c12023wl3);
            }
            if (zIsChartTypeBar) {
                i2 = iOooO00o;
                C12025x6 c12025x6Clone3 = m72650du(c14365qy).Clone();
                int iM56865x14 = c12023wlClone4.m56865x1() + i2;
                if (C7019kk.m27462to(Float.valueOf(c12025x6Clone3.m56897x1() - c12014ne4.m56669jd()), 13) < iM56865x14) {
                    if (zIsLocationAutocalculated || c14365qy.m69834fa().getPlotArea().getLayoutTargetType() != 0) {
                        c12014ne4.m56676kk(c12014ne4.m56669jd() + iM56865x14);
                        iM56663c5 = c12014ne4.m56663c5() - iM56865x14;
                    } else {
                        c12014ne4.m56676kk(c12014ne4.m56669jd() - iM56865x14);
                        iM56663c5 = c12014ne4.m56663c5() + iM56865x14;
                    }
                    c12014ne4.m56684x1(iM56663c5);
                }
            } else {
                C12025x6[] c12025x6ArrM72659kk2 = m72659kk(c14365qy);
                char c = c12025x6ArrM72659kk2[0].m56895kk() < c12025x6ArrM72659kk2[1].m56895kk() ? (char) 1 : (char) 0;
                float fM67480k43 = C14116yg.m67480k4((c12025x6ArrM72659kk2[1].m56895kk() - c12025x6ArrM72659kk2[0].m56895kk()) / iM69819to);
                int iM56862kk4 = c12023wlClone4.m56862kk() + iOooO00o;
                if (c14365qy.m69829dq() < 0) {
                    i2 = iOooO00o;
                } else if (c12025x6ArrM72659kk2[0].m56895kk() == c12025x6ArrM72659kk2[1].m56895kk()) {
                    i2 = iOooO00o;
                    if ((c12014ne4.m56670k4() - c12023wl3.m56862kk()) - C7019kk.m27462to(Float.valueOf(c12025x6ArrM72659kk2[0].m56895kk()), 13) < iM56862kk4) {
                        if (zIsLocationAutocalculated || c14365qy.m69834fa().getPlotArea().getLayoutTargetType() != 0) {
                            iM56683x1 = c12014ne4.m56683x1() - (iM56862kk4 - ((c12014ne4.m56670k4() - c12023wl3.m56862kk()) - C7019kk.m27462to(Float.valueOf(c12025x6ArrM72659kk2[0].m56895kk()), 13)));
                            c12014ne4.m56671k4(iM56683x1);
                        } else {
                            c12014ne4.m56671k4((iM56862kk4 - ((c12014ne4.m56670k4() - c12023wl3.m56862kk()) - C7019kk.m27462to(Float.valueOf(c12025x6ArrM72659kk2[0].m56895kk()), 13))) + c12014ne4.m56683x1());
                        }
                    }
                } else {
                    i2 = iOooO00o;
                    C12023wl c12023wlClone5 = c12023wlClone4.Clone();
                    if (c14787xiM69854ne.m73384dy().getTickLabelPosition() != 3) {
                        c12023wlClone5.m56860k4(c12023wlClone5.m56865x1() + i2);
                    }
                    int iM56865x15 = c12023wl3.m56865x1() + m72652k4(c14365qy, c12023wlClone5.Clone());
                    if (iM69877xk == 1) {
                        f = fM67480k43;
                        if ((C7019kk.m27462to(Float.valueOf(C14116yg.m67480k4(c12025x6ArrM72659kk2[1].m56897x1() + c12025x6ArrM72659kk2[0].m56897x1())), 13) / 2) - c12014ne4.m56669jd() < iM56865x15) {
                            iM27462to = iM56865x15 - ((C7019kk.m27462to(Float.valueOf(C14116yg.m67480k4(c12025x6ArrM72659kk2[1].m56897x1() + c12025x6ArrM72659kk2[0].m56897x1())), 13) / 2) - c12014ne4.m56669jd());
                            if (zIsLocationAutocalculated || c14365qy.m69834fa().getPlotArea().getLayoutTargetType() != 0) {
                                c12014ne4.m56676kk(c12014ne4.m56669jd() + iM27462to);
                                c12014ne4.m56684x1(iM56663c5);
                            } else {
                                c12014ne4.m56676kk(c12014ne4.m56669jd() - iM27462to);
                                c12014ne4.m56684x1(iM56663c5);
                            }
                        }
                        fM67495m9 = f * ((float) C14116yg.m67495m9((((double) c14365qy.m69829dq()) * 3.141592653589793d) / 180.0d));
                        if (C7019kk.m27462to(Float.valueOf((c12014ne4.m56670k4() - c12025x6ArrM72659kk2[c].m56895kk()) + fM67495m9), 13) < c12023wlClone4.m56862kk()) {
                            if (zIsLocationAutocalculated || c14365qy.m69834fa().getPlotArea().getLayoutTargetType() != 0) {
                                iM56683x1 = c12014ne4.m56683x1() - (c12023wlClone4.m56862kk() - C7019kk.m27462to(Float.valueOf((c12014ne4.m56670k4() - c12025x6ArrM72659kk2[c].m56895kk()) + fM67495m9), 13));
                                c12014ne4.m56671k4(iM56683x1);
                            } else {
                                c12014ne4.m56671k4((c12023wlClone4.m56862kk() - C7019kk.m27462to(Float.valueOf((c12014ne4.m56670k4() - c12025x6ArrM72659kk2[c].m56895kk()) + fM67495m9), 13)) + c12014ne4.m56683x1());
                            }
                        }
                    } else if (iM69877xk == 2) {
                        f = fM67480k43;
                        if (c12014ne4.m56668h4() - (C7019kk.m27462to(Float.valueOf(C14116yg.m67480k4(c12025x6ArrM72659kk2[1].m56897x1() + c12025x6ArrM72659kk2[0].m56897x1())), 13) / 2) < iM56865x15) {
                            iM27462to = iM56865x15 - (c12014ne4.m56668h4() - (C7019kk.m27462to(Float.valueOf(C14116yg.m67480k4(c12025x6ArrM72659kk2[1].m56897x1() + c12025x6ArrM72659kk2[0].m56897x1())), 13) / 2));
                            int iM56663c56 = (zIsLocationAutocalculated || c14365qy.m69834fa().getPlotArea().getLayoutTargetType() != 0) ? c12014ne4.m56663c5() - iM27462to : c12014ne4.m56663c5() + iM27462to;
                            c12014ne4.m56684x1(iM56663c56);
                        }
                        fM67495m9 = f * ((float) C14116yg.m67495m9((((double) c14365qy.m69829dq()) * 3.141592653589793d) / 180.0d));
                        if (C7019kk.m27462to(Float.valueOf((c12014ne4.m56670k4() - c12025x6ArrM72659kk2[c].m56895kk()) + fM67495m9), 13) < c12023wlClone4.m56862kk()) {
                        }
                    } else {
                        if (iM69877xk != 5) {
                            if (iM69877xk != 6) {
                                f = fM67480k43;
                            }
                        }
                        fM67495m9 = f * ((float) C14116yg.m67495m9((((double) c14365qy.m69829dq()) * 3.141592653589793d) / 180.0d));
                        if (C7019kk.m27462to(Float.valueOf((c12014ne4.m56670k4() - c12025x6ArrM72659kk2[c].m56895kk()) + fM67495m9), 13) < c12023wlClone4.m56862kk()) {
                        }
                    }
                }
            }
            if (zIsLocationAutocalculated || c14365qy.m69834fa().getPlotArea().getLayoutTargetType() == 1) {
                C14714vx.m72559k4(c12014ne4.Clone(), zIsChartTypeBar, c14365qy);
            }
        }
        c12014neArr[0] = c12014ne4;
        m72655k4(c14365qy, c12014neArr, iM69877xk);
        c12014neArr[0].CloneTo(c12014ne4);
        if (c14787xiM69863u4.m73384dy() == null || !c14787xiM69863u4.m73384dy().isVisible()) {
            c14787xi = c14787xiM69863u4;
            z = zIsChartTypeBar;
            c12014ne = c12014ne4;
        } else {
            float fM72787k4 = C14743wm.m72787k4(zIsChartTypeBar, c14365qy.m69865up().get_Item(0), c12014ne4.Clone(), c14365qy.m69863u4());
            C13743kq c13743kqM69833e0 = c14365qy.m69833e0();
            int iM63753k4 = kc0.m63753k4(zIsChartTypeBar ? c13743kqM69833e0.m64121to() : c13743kqM69833e0.m64100du());
            if (z4 && c14787xiM69863u4.f50098m9.size() > 3 && fM72787k4 > iM63753k4 && iM63753k4 != 0) {
                c14787xiM69863u4.f50098m9.clear();
                c14787xiM69863u4.m73404kk(z4);
                c14787xiM69863u4.m73416to(z3);
                if (z4) {
                    c14787xiM69863u4.m73409m9(0.0d);
                }
                if (z3) {
                    c14787xiM69863u4.m73387h4(0.0d);
                }
                c12014ne = c12014ne4;
                c14787xi = c14787xiM69863u4;
                z = zIsChartTypeBar;
                C14743wm.m72792k4(d2, d, c14787xiM69863u4.f50098m9, c14365qy.m69865up().get_Item(0).m64945h4().getType(), c12014ne.Clone(), z, c14365qy.m69865up().get_Item(0), c14787xi);
            }
        }
        if (!zIsLocationAutocalculated && c14365qy.m69834fa().getPlotArea().getLayoutTargetType() == 0) {
            C12014ne c12014ne6 = new C12014ne(c12014ne.m56669jd(), c12014ne.m56664ck(), c12014ne.m56663c5(), c12014ne.m56683x1());
            c12014ne = new C12014ne(c14365qy.f48440k4.f5456k4.m56669jd(), c14365qy.f48440k4.f5456k4.m56664ck(), c14365qy.f48440k4.f5456k4.m56663c5(), c14365qy.f48440k4.f5456k4.m56683x1());
            c14365qy.f48440k4.f5456k4 = new C12014ne(c12014ne6.m56669jd(), c12014ne6.m56664ck(), c12014ne6.m56663c5(), c12014ne6.m56683x1());
        }
        if (c14787xiM69854ne.m73384dy() != null && c14787xiM69854ne.m73384dy().hasTitle() && c14787xiM69854ne.m73384dy().isVisible()) {
            m72656k4(c14787xiM69854ne, c12014ne.Clone(), z, c12023wl.Clone(), c12023wlClone4.Clone(), i2);
        }
        if (c14787xi.m73384dy() != null && c14787xi.m73384dy().hasTitle() && c14787xi.m73384dy().isVisible()) {
            m72656k4(c14787xi, c12014ne.Clone(), z, c12023wl.Clone(), c12023wlClone4.Clone(), i2);
        }
        if (c14365qy.m69868wl().m73384dy() != null && c14365qy.m69868wl().m73384dy().hasTitle() && c14365qy.m69868wl().m73384dy().isVisible()) {
            C12023wl c12023wlClone6 = c12023wlClone.Clone();
            if (c14365qy.m69868wl().m73384dy().getTickLabelPosition() != 3) {
                c12023wlClone6.m56860k4(c12023wlClone6.m56865x1() + iM27462to2);
            }
            C12025x6[] c12025x6ArrM72660to2 = m72660to(c14365qy);
            C14245oo c14245ooM73408m9 = c14365qy.m69868wl().m73408m9();
            if (c12025x6ArrM72660to2[0].m56895kk() == c12025x6ArrM72660to2[1].m56895kk()) {
                if (c14365qy.m69829dq() >= 0) {
                    c14245ooM73408m9.f47882k4.f5456k4.m56676kk(C7019kk.m27462to(Double.valueOf((((double) (c12025x6ArrM72660to2[1].m56897x1() + c12025x6ArrM72660to2[0].m56897x1())) / 2.0d) - (((double) c14245ooM73408m9.f47882k4.f5456k4.m56663c5()) / 2.0d)), 13));
                }
            } else if (iM69877xk == 0) {
                c12014ne2 = c14245ooM73408m9.f47882k4.f5456k4;
                fM67480k4 = (C14116yg.m67480k4(c12025x6ArrM72660to2[1].m56897x1() + c12025x6ArrM72660to2[0].m56897x1()) / 2.0f) + m72652k4(c14365qy, c12023wlClone6.Clone());
                c12014ne2.m56676kk(C7019kk.m27462to(Float.valueOf(fM67480k4), 13));
                c14245ooM73408m9.f47882k4.f5456k4.m56682to(C7019kk.m27462to(Float.valueOf(C14116yg.m67480k4(c12025x6ArrM72660to2[1].m56895kk() + c12025x6ArrM72660to2[0].m56895kk()) / 2.0f), 13));
            } else {
                if (iM69877xk != 3) {
                    if (iM69877xk != 4) {
                        if (iM69877xk != 7) {
                        }
                    }
                    c12014ne2 = c14245ooM73408m9.f47882k4.f5456k4;
                    fM67480k4 = (C14116yg.m67480k4(c12025x6ArrM72660to2[1].m56897x1() + c12025x6ArrM72660to2[0].m56897x1()) / 2.0f) + m72652k4(c14365qy, c12023wlClone6.Clone());
                    c12014ne2.m56676kk(C7019kk.m27462to(Float.valueOf(fM67480k4), 13));
                    c14245ooM73408m9.f47882k4.f5456k4.m56682to(C7019kk.m27462to(Float.valueOf(C14116yg.m67480k4(c12025x6ArrM72660to2[1].m56895kk() + c12025x6ArrM72660to2[0].m56895kk()) / 2.0f), 13));
                }
                c12014ne2 = c14245ooM73408m9.f47882k4.f5456k4;
                fM67480k4 = ((C14116yg.m67480k4(c12025x6ArrM72660to2[1].m56897x1() + c12025x6ArrM72660to2[0].m56897x1()) / 2.0f) - c14245ooM73408m9.f47882k4.f5456k4.m56663c5()) - m72652k4(c14365qy, c12023wlClone6.Clone());
                c12014ne2.m56676kk(C7019kk.m27462to(Float.valueOf(fM67480k4), 13));
                c14245ooM73408m9.f47882k4.f5456k4.m56682to(C7019kk.m27462to(Float.valueOf(C14116yg.m67480k4(c12025x6ArrM72660to2[1].m56895kk() + c12025x6ArrM72660to2[0].m56895kk()) / 2.0f), 13));
            }
        }
        if (!c14365qy.m69834fa().hasDataTable() || z) {
            return;
        }
        C12025x6[] c12025x6ArrM72659kk3 = m72659kk(c14365qy);
        if (c14365qy.m69829dq() > 0) {
            if (iM69877xk == 0 || iM69877xk == 3 || iM69877xk == 4 || iM69877xk == 7 || iM69877xk == 8) {
                char c2 = c12025x6ArrM72659kk3[0].m56897x1() < c12025x6ArrM72659kk3[1].m56897x1() ? (char) 0 : (char) 1;
                c14365qy.m69838jd().f48246k4.m56676kk(C7019kk.m27462to(Float.valueOf(c12025x6ArrM72659kk3[c2].m56897x1()), 13));
                c14365qy.m69838jd().f48246k4.m56682to(C7019kk.m27462to(Float.valueOf(c12025x6ArrM72659kk3[c2].m56895kk()), 13));
                c14365qy.m69838jd().f48246k4.m56684x1(C7019kk.m27462to(Float.valueOf(C14116yg.m67480k4(c12025x6ArrM72659kk3[1].m56897x1() - c12025x6ArrM72659kk3[0].m56897x1())), 13));
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m72663x1(C14728w8 c14728w8) {
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m72654k4(C14365qy c14365qy, C14787xi c14787xi) {
        c14787xi.m73408m9().m68739k4(c14365qy);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m72655k4(C14365qy c14365qy, C12014ne[] c12014neArr, int i) {
        int iM71373k4;
        C12014ne c12014ne;
        C12014ne c12014ne2;
        int iM56683x1;
        boolean zIsChartTypeBar = ChartTypeCharacterizer.isChartTypeBar(c14365qy.m69834fa().getType());
        boolean zIsLocationAutocalculated = ((ChartPlotArea) C7019kk.m27452k4((Object) c14365qy.m69834fa().getPlotArea(), ChartPlotArea.class)).isLocationAutocalculated();
        C14328q5 c14328q5M69838jd = c14365qy.m69838jd();
        if (kc0.m63756k4(c12014neArr[0].Clone()) || !c14365qy.m69834fa().hasDataTable() || (iM71373k4 = C14580tx.m71373k4(c12014neArr[0].Clone(), c14365qy)) <= c14328q5M69838jd.m69400dy()) {
            return;
        }
        c14328q5M69838jd.m69403k4(iM71373k4);
        int iM69400dy = iM71373k4 - c14328q5M69838jd.m69400dy();
        C12014ne c12014ne3 = c14328q5M69838jd.f48246k4;
        c12014ne3.m56671k4(c12014ne3.m56683x1() + iM69400dy);
        if (c14365qy.m69829dq() > 0 && !zIsChartTypeBar) {
            switch (i) {
                case 0:
                case 3:
                case 4:
                case 7:
                case 8:
                    if (!zIsLocationAutocalculated && c14365qy.m69834fa().getPlotArea().getLayoutTargetType() == 0) {
                        C12014ne c12014ne4 = c12014neArr[0];
                        c12014ne4.m56671k4(iM69400dy + 2 + c12014ne4.m56683x1());
                    } else {
                        c12014ne2 = c12014neArr[0];
                        iM56683x1 = c12014ne2.m56683x1() - (iM69400dy + 2);
                        c12014ne2.m56671k4(iM56683x1);
                    }
                    break;
                case 1:
                case 2:
                case 5:
                case 6:
                    if (!zIsLocationAutocalculated && c14365qy.m69834fa().getPlotArea().getLayoutTargetType() == 0) {
                        C12014ne c12014ne5 = c14328q5M69838jd.f48246k4;
                        c12014ne5.m56682to(c12014ne5.m56664ck() + iM69400dy);
                        c12014ne2 = c12014neArr[0];
                        iM56683x1 = c12014ne2.m56683x1() + iM69400dy;
                        c12014ne2.m56671k4(iM56683x1);
                    } else {
                        c12014ne = c12014neArr[0];
                        c12014ne.m56671k4(c12014ne.m56683x1() - iM69400dy);
                        C12014ne c12014ne6 = c14328q5M69838jd.f48246k4;
                        c12014ne6.m56682to(c12014ne6.m56664ck() - iM69400dy);
                    }
                    break;
            }
        } else if (zIsLocationAutocalculated || c14365qy.m69834fa().getPlotArea().getLayoutTargetType() != 0) {
            c12014ne = c12014neArr[0];
            c12014ne.m56671k4(c12014ne.m56683x1() - iM69400dy);
            C12014ne c12014ne62 = c14328q5M69838jd.f48246k4;
            c12014ne62.m56682to(c12014ne62.m56664ck() - iM69400dy);
        } else {
            C12014ne c12014ne7 = c14328q5M69838jd.f48246k4;
            c12014ne7.m56682to(c12014ne7.m56664ck() + iM69400dy);
            c12014ne2 = c12014neArr[0];
            iM56683x1 = c12014ne2.m56683x1() + iM69400dy;
            c12014ne2.m56671k4(iM56683x1);
        }
        if (zIsLocationAutocalculated || c14365qy.m69834fa().getPlotArea().getLayoutTargetType() == 1) {
            C14714vx.m72559k4(c12014neArr[0].Clone(), zIsChartTypeBar, c14365qy);
        }
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C14728w8 c14728w8) {
    }

    /* JADX INFO: renamed from: k4 */
    private static void m72656k4(C14787xi c14787xi, C12014ne c12014ne, boolean z, C12023wl c12023wl, C12023wl c12023wl2, int i) {
        C12014ne c12014ne2;
        float fM67480k4;
        C12023wl c12023wlClone = C12023wl.f40585k4.Clone();
        C14365qy c14365qyM73423wy = c14787xi.m73423wy();
        if (c14787xi.m73419up() == 2) {
            c12023wl.CloneTo(c12023wlClone);
            z = !z;
        } else {
            c12023wl2.CloneTo(c12023wlClone);
            if (c14787xi.m73384dy().getTickLabelPosition() != 3) {
                c12023wlClone.m56860k4(c12023wlClone.m56865x1() + i);
            }
        }
        C1189h8 c1189h8 = c14787xi.m73408m9().f47882k4;
        if (z) {
            C12023wl c12023wlClone2 = c1189h8.f5456k4.m56680m9().Clone();
            C12025x6 c12025x6Clone = m72650du(c14365qyM73423wy).Clone();
            if (c12025x6Clone.m56897x1() < c14365qyM73423wy.m69833e0().m64106h4()) {
                c1189h8.f5456k4.m56676kk(C7019kk.m27462to(Float.valueOf((c14787xi.m73384dy().getTickLabelPosition() == 3 ? c12025x6Clone.m56897x1() : c12025x6Clone.m56897x1() - c12023wlClone.m56865x1()) - c12023wlClone2.m56865x1()), 13));
                c1189h8.f5456k4.m56682to(C7019kk.m27462to(Double.valueOf((((double) c12025x6Clone.m56895kk()) - (((double) c14365qyM73423wy.m69833e0().m64100du()) / 2.0d)) - (((double) c12023wlClone2.m56862kk()) / 2.0d)), 14));
                return;
            } else {
                if (C7019kk.m27462to(Float.valueOf(c12014ne.m56668h4() - c12025x6Clone.m56897x1()), 13) < c12023wlClone2.m56865x1()) {
                    return;
                }
                c1189h8.f5456k4.m56676kk(C7019kk.m27462to(Float.valueOf(c14787xi.m73384dy().getTickLabelPosition() == 3 ? c12025x6Clone.m56897x1() : c12025x6Clone.m56897x1() + c12023wlClone.m56865x1()), 13));
                c1189h8.f5456k4.m56682to(C7019kk.m27462to(Double.valueOf((((double) c12025x6Clone.m56895kk()) - (((double) c14365qyM73423wy.m69833e0().m64100du()) / 2.0d)) - (((double) c12023wlClone2.m56862kk()) / 2.0d)), 14));
                return;
            }
        }
        C12025x6[] c12025x6ArrM72659kk = m72659kk(c14365qyM73423wy);
        if (c12025x6ArrM72659kk[0].m56895kk() == c12025x6ArrM72659kk[1].m56895kk()) {
            if (c14365qyM73423wy.m69829dq() >= 0) {
                c1189h8.f5456k4.m56676kk(C7019kk.m27462to(Double.valueOf((((double) (c12025x6ArrM72659kk[1].m56897x1() + c12025x6ArrM72659kk[0].m56897x1())) / 2.0d) - (((double) c1189h8.f5456k4.m56663c5()) / 2.0d)), 14));
                return;
            }
            return;
        }
        if ((c14365qyM73423wy.m69877xk() < 45 || c14365qyM73423wy.m69877xk() >= 90) && (c14365qyM73423wy.m69877xk() < 225 || c14365qyM73423wy.m69877xk() >= 270)) {
            c12014ne2 = c1189h8.f5456k4;
            fM67480k4 = (C14116yg.m67480k4(c12025x6ArrM72659kk[1].m56897x1() + c12025x6ArrM72659kk[0].m56897x1()) / 2.0f) + m72652k4(c14365qyM73423wy, c12023wlClone.Clone());
        } else {
            c12014ne2 = c1189h8.f5456k4;
            fM67480k4 = ((C14116yg.m67480k4(c12025x6ArrM72659kk[1].m56897x1() + c12025x6ArrM72659kk[0].m56897x1()) / 2.0f) - c1189h8.f5456k4.m56663c5()) - m72652k4(c14365qyM73423wy, c12023wlClone.Clone());
        }
        c12014ne2.m56676kk(C7019kk.m27462to(Float.valueOf(fM67480k4), 13));
        c1189h8.f5456k4.m56682to(C7019kk.m27462to(Float.valueOf(C14116yg.m67480k4(c12025x6ArrM72659kk[1].m56895kk() + c12025x6ArrM72659kk[0].m56895kk()) / 2.0f), 13));
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03b4  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m72657k4(C14787xi c14787xi, C12014ne c12014ne, C12014ne[] c12014neArr, boolean z, C14365qy c14365qy) {
        int iM56865x1;
        C12014ne c12014ne2;
        C12014ne c12014ne3;
        int iM56670k4;
        int iM56670k42;
        C12014ne c12014ne4;
        C12014ne c12014ne5;
        C12014ne c12014ne6;
        C12023wl c12023wlClone = C12023wl.f40585k4.Clone();
        boolean z2 = c14787xi.m73419up() == 2 ? !z : z;
        C14245oo c14245ooM73408m9 = c14787xi.m73408m9();
        if (z2) {
            c14245ooM73408m9.m68736k4(new C12015qq(c12014neArr[0].m56663c5() * 0.8f, c12014neArr[0].m56683x1() * 0.8f).Clone()).CloneTo(c12023wlClone);
            c14245ooM73408m9.f47882k4.f5456k4.m56674k4(c12023wlClone.Clone());
            C12025x6 c12025x6Clone = m72650du(c14365qy).Clone();
            if (c12025x6Clone.m56897x1() < c14365qy.m69833e0().m64106h4()) {
                if (C7019kk.m27462to(Float.valueOf(c12025x6Clone.m56897x1() - c12014ne.m56669jd()), 13) < c12023wlClone.m56865x1()) {
                    C12014ne c12014ne7 = c12014neArr[0];
                    c12014ne7.m56676kk(c12023wlClone.m56865x1() + c12014ne7.m56669jd());
                    c12014ne6 = c12014neArr[0];
                    c12014ne6.m56684x1(c12014ne6.m56663c5() - c12023wlClone.m56865x1());
                }
                c12014ne5 = c12014neArr[0];
            } else {
                if (C7019kk.m27462to(Float.valueOf(c12014neArr[0].m56668h4() - c12025x6Clone.m56897x1()), 13) < c12023wlClone.m56865x1()) {
                    c14245ooM73408m9.f47882k4.f5456k4.m56676kk(c12014neArr[0].m56668h4() - c12023wlClone.m56865x1());
                    c14245ooM73408m9.f47882k4.f5456k4.m56682to(((c12014neArr[0].m56683x1() - c12023wlClone.m56862kk()) / 2) + c12014neArr[0].m56664ck());
                    c12014ne6 = c12014neArr[0];
                    c12014ne6.m56684x1(c12014ne6.m56663c5() - c12023wlClone.m56865x1());
                }
                c12014ne5 = c12014neArr[0];
            }
        } else {
            C12025x6[] c12025x6ArrM72659kk = m72659kk(c14365qy);
            if (c14365qy.m69829dq() == 0) {
                c14787xi.m73408m9().m68736k4(new C12015qq(c12014neArr[0].m56663c5() * 0.8f, c12014neArr[0].m56683x1() * 0.7f).Clone()).CloneTo(c12023wlClone);
                C12014ne c12014neClone = ((C14044b3.m66437kk((double) c14365qy.m69834fa().getPlotArea().getHeight()) && C14044b3.m66437kk((double) c14365qy.m69834fa().getPlotArea().getWidth())) ? c12014neArr[0] : new C12014ne(c12014neArr[0].m56669jd(), c12014neArr[0].m56664ck(), c12014neArr[0].m56663c5(), (c12023wlClone.m56862kk() + c12014neArr[0].m56683x1()) - 2)).Clone();
                c14245ooM73408m9.f47882k4.f5456k4.m56674k4(c12023wlClone.Clone());
                c14245ooM73408m9.f47882k4.f5456k4.m56682to((c12014neClone.m56670k4() - c12023wlClone.m56862kk()) - 2);
                iM56670k42 = c12014neArr[0].m56670k4() - C7019kk.m27462to(Float.valueOf(c12025x6ArrM72659kk[0].m56895kk()), 13);
                if (iM56670k42 < c12023wlClone.m56862kk() + 2) {
                    c12014ne4 = c12014neArr[0];
                    c12014ne4.m56671k4(c12014ne4.m56683x1() - ((c12023wlClone.m56862kk() + 2) - iM56670k42));
                }
                c12014ne5 = c12014neArr[0];
            } else {
                if (c14365qy.m69829dq() > 0) {
                    boolean z3 = true;
                    if (c12025x6ArrM72659kk[0].m56895kk() == c12025x6ArrM72659kk[1].m56895kk()) {
                        c14787xi.m73408m9().m68736k4(new C12015qq(c12014neArr[0].m56663c5() * 0.8f, c12014neArr[0].m56683x1() * 0.7f).Clone()).CloneTo(c12023wlClone);
                        c14245ooM73408m9.f47882k4.f5456k4.m56674k4(c12023wlClone.Clone());
                        if (!z) {
                            c12014ne3 = c14245ooM73408m9.f47882k4.f5456k4;
                            iM56670k4 = (c12014ne.m56670k4() - c12023wlClone.m56862kk()) - 8;
                        } else if (c14787xi.m73419up() == 2 && ChartTypeCharacterizer.isBar3DChart(c14365qy.m69834fa().getType()) && c14365qy.m69834fa().getAxes().getVerticalAxis().getCrossType() == 1) {
                            c14245ooM73408m9.f47882k4.f5456k4.m56682to(c12014neArr[0].m56664ck());
                            C12014ne c12014ne8 = c12014neArr[0];
                            c12014ne8.m56682to(c12023wlClone.m56862kk() + 2 + c12014ne8.m56664ck());
                            C12014ne c12014ne9 = c12014neArr[0];
                            c12014ne9.m56671k4(c12014ne9.m56683x1() - (c12023wlClone.m56862kk() + 2));
                            iM56670k42 = c12014neArr[0].m56670k4() - C7019kk.m27462to(Float.valueOf(c12025x6ArrM72659kk[0].m56895kk()), 13);
                            if (iM56670k42 < c12023wlClone.m56862kk() + 2 && !z3) {
                                c12014ne4 = c12014neArr[0];
                                c12014ne4.m56671k4(c12014ne4.m56683x1() - ((c12023wlClone.m56862kk() + 2) - iM56670k42));
                            }
                        } else {
                            c12014ne3 = c14245ooM73408m9.f47882k4.f5456k4;
                            iM56670k4 = (c12014neArr[0].m56670k4() - c12023wlClone.m56862kk()) - 2;
                        }
                        c12014ne3.m56682to(iM56670k4);
                        z3 = false;
                        iM56670k42 = c12014neArr[0].m56670k4() - C7019kk.m27462to(Float.valueOf(c12025x6ArrM72659kk[0].m56895kk()), 13);
                        if (iM56670k42 < c12023wlClone.m56862kk() + 2) {
                            c12014ne4 = c12014neArr[0];
                            c12014ne4.m56671k4(c12014ne4.m56683x1() - ((c12023wlClone.m56862kk() + 2) - iM56670k42));
                        }
                    } else {
                        c14787xi.m73408m9().m68736k4(new C12015qq(c12014neArr[0].m56663c5() * 0.3f, c12014neArr[0].m56683x1() * 0.3f).Clone()).CloneTo(c12023wlClone);
                        c14245ooM73408m9.f47882k4.f5456k4.m56674k4(c12023wlClone.Clone());
                        int iM69877xk = c14365qy.m69877xk() / 45;
                        if (iM69877xk == 1) {
                            if ((C7019kk.m27462to(Float.valueOf(C14116yg.m67480k4(c12025x6ArrM72659kk[1].m56897x1() + c12025x6ArrM72659kk[0].m56897x1())), 13) / 2) - c12014neArr[0].m56669jd() < c12023wlClone.m56865x1()) {
                                iM56865x1 = c12023wlClone.m56865x1() - ((C7019kk.m27462to(Float.valueOf(C14116yg.m67480k4(c12025x6ArrM72659kk[1].m56897x1() + c12025x6ArrM72659kk[0].m56897x1())), 13) / 2) - c12014neArr[0].m56669jd());
                                C12014ne c12014ne10 = c12014neArr[0];
                                c12014ne10.m56676kk(c12014ne10.m56669jd() + iM56865x1);
                                c12014ne2 = c12014neArr[0];
                                c12014ne2.m56684x1(c12014ne2.m56663c5() - iM56865x1);
                            }
                            if (c12014neArr[0].m56670k4() - (C7019kk.m27462to(Float.valueOf(C14116yg.m67480k4(c12025x6ArrM72659kk[1].m56895kk() + c12025x6ArrM72659kk[0].m56895kk())), 13) / 2) < c12023wlClone.m56862kk()) {
                                C12014ne c12014ne11 = c12014neArr[0];
                                c12014ne11.m56671k4(c12014ne11.m56683x1() - ((c12023wlClone.m56862kk() + 2) - (c12014neArr[0].m56670k4() - (C7019kk.m27462to(Float.valueOf(C14116yg.m67480k4(c12025x6ArrM72659kk[1].m56895kk() + c12025x6ArrM72659kk[0].m56895kk())), 13) / 2))));
                            }
                        } else if (iM69877xk == 2) {
                            if (c12014neArr[0].m56668h4() - (C7019kk.m27462to(Float.valueOf(C14116yg.m67480k4(c12025x6ArrM72659kk[1].m56897x1() + c12025x6ArrM72659kk[0].m56897x1())), 13) / 2) < c12023wlClone.m56865x1()) {
                                iM56865x1 = c12023wlClone.m56865x1() - (c12014neArr[0].m56668h4() - (C7019kk.m27462to(Float.valueOf(C14116yg.m67480k4(c12025x6ArrM72659kk[1].m56897x1() + c12025x6ArrM72659kk[0].m56897x1())), 13) / 2));
                                c12014ne2 = c12014neArr[0];
                                c12014ne2.m56684x1(c12014ne2.m56663c5() - iM56865x1);
                            }
                            if (c12014neArr[0].m56670k4() - (C7019kk.m27462to(Float.valueOf(C14116yg.m67480k4(c12025x6ArrM72659kk[1].m56895kk() + c12025x6ArrM72659kk[0].m56895kk())), 13) / 2) < c12023wlClone.m56862kk()) {
                            }
                        } else {
                            if (iM69877xk != 5) {
                                if (iM69877xk == 6) {
                                }
                            }
                            if (c12014neArr[0].m56670k4() - (C7019kk.m27462to(Float.valueOf(C14116yg.m67480k4(c12025x6ArrM72659kk[1].m56895kk() + c12025x6ArrM72659kk[0].m56895kk())), 13) / 2) < c12023wlClone.m56862kk()) {
                            }
                        }
                    }
                }
                c12014ne5 = c12014neArr[0];
            }
        }
        C14714vx.m72559k4(c12014ne5.Clone(), z2, c14365qy);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0316  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m72658k4(C14787xi c14787xi, C12014ne[] c12014neArr, C14365qy c14365qy) {
        int iM56865x1;
        C12014ne c12014ne;
        int iM56663c5;
        if (kc0.m63756k4(c12014neArr[0].Clone())) {
            return;
        }
        C12023wl c12023wlClone = C12023wl.f40585k4.Clone();
        C12025x6[] c12025x6ArrM72660to = m72660to(c14365qy);
        C14245oo c14245ooM73408m9 = c14787xi.m73408m9();
        boolean zIsLocationAutocalculated = ((ChartPlotArea) C7019kk.m27452k4((Object) c14365qy.m69834fa().getPlotArea(), ChartPlotArea.class)).isLocationAutocalculated();
        if (c14365qy.m69829dq() == 0) {
            c14787xi.m73408m9().m68736k4(new C12015qq(c12014neArr[0].m56663c5() * 0.8f, c12014neArr[0].m56683x1() * 0.7f).Clone()).CloneTo(c12023wlClone);
            c14245ooM73408m9.f47882k4.f5456k4.m56674k4(c12023wlClone.Clone());
            c14245ooM73408m9.f47882k4.f5456k4.m56682to((c12014neArr[0].m56670k4() - c12023wlClone.m56862kk()) - 2);
            if (zIsLocationAutocalculated || c14365qy.m69834fa().getPlotArea().getLayoutTargetType() != 0) {
                int iM56670k4 = c12014neArr[0].m56670k4() - C7019kk.m27462to(Float.valueOf(c12025x6ArrM72660to[0].m56895kk()), 13);
                if (iM56670k4 < c12023wlClone.m56862kk() + 2) {
                    C12014ne c12014ne2 = c12014neArr[0];
                    c12014ne2.m56671k4(c12014ne2.m56683x1() - ((c12023wlClone.m56862kk() + 2) - iM56670k4));
                }
            } else {
                int iM56670k42 = c12014neArr[0].m56670k4() - C7019kk.m27462to(Float.valueOf(c12025x6ArrM72660to[0].m56895kk()), 13);
                if (iM56670k42 < c12023wlClone.m56862kk() + 2) {
                    C12014ne c12014ne3 = c12014neArr[0];
                    c12014ne3.m56671k4(((c12023wlClone.m56862kk() + 2) - iM56670k42) + c12014ne3.m56683x1());
                }
            }
        }
        if (c14365qy.m69829dq() > 0) {
            if (c12025x6ArrM72660to[0].m56895kk() == c12025x6ArrM72660to[1].m56895kk()) {
                c14787xi.m73408m9().m68736k4(new C12015qq(c12014neArr[0].m56663c5() * 0.8f, c12014neArr[0].m56683x1() * 0.7f).Clone()).CloneTo(c12023wlClone);
                c14245ooM73408m9.f47882k4.f5456k4.m56674k4(c12023wlClone.Clone());
                c14245ooM73408m9.f47882k4.f5456k4.m56682to((c12014neArr[0].m56670k4() - c12023wlClone.m56862kk()) - 2);
                if (zIsLocationAutocalculated || c14365qy.m69834fa().getPlotArea().getLayoutTargetType() != 0) {
                    int iM56670k43 = c12014neArr[0].m56670k4() - C7019kk.m27462to(Float.valueOf(c12025x6ArrM72660to[0].m56895kk()), 13);
                    if (iM56670k43 < c12023wlClone.m56862kk() + 2) {
                        C12014ne c12014ne4 = c12014neArr[0];
                        c12014ne4.m56671k4(c12014ne4.m56683x1() - ((c12023wlClone.m56862kk() + 2) - iM56670k43));
                    }
                } else {
                    int iM56670k44 = c12014neArr[0].m56670k4() - C7019kk.m27462to(Float.valueOf(c12025x6ArrM72660to[0].m56895kk()), 13);
                    if (iM56670k44 < c12023wlClone.m56862kk() + 2) {
                        C12014ne c12014ne5 = c12014neArr[0];
                        c12014ne5.m56671k4(((c12023wlClone.m56862kk() + 2) - iM56670k44) + c12014ne5.m56683x1());
                    }
                }
            } else {
                c14787xi.m73408m9().m68736k4(new C12015qq(c12014neArr[0].m56663c5() * 0.3f, c12014neArr[0].m56683x1() * 0.3f).Clone()).CloneTo(c12023wlClone);
                c14245ooM73408m9.f47882k4.f5456k4.m56674k4(c12023wlClone.Clone());
                int iM69877xk = c14365qy.m69877xk() / 45;
                if (iM69877xk == 0) {
                    if (c12014neArr[0].m56668h4() - (C7019kk.m27462to(Float.valueOf(C14116yg.m67480k4(c12025x6ArrM72660to[1].m56897x1() + c12025x6ArrM72660to[0].m56897x1())), 13) / 2) < c12023wlClone.m56865x1()) {
                        iM56865x1 = c12023wlClone.m56865x1() - (c12014neArr[0].m56668h4() - (C7019kk.m27462to(Float.valueOf(C14116yg.m67480k4(c12025x6ArrM72660to[1].m56897x1() + c12025x6ArrM72660to[0].m56897x1())), 13) / 2));
                        if (zIsLocationAutocalculated || c14365qy.m69834fa().getPlotArea().getLayoutTargetType() != 0) {
                            c12014ne = c12014neArr[0];
                            iM56663c5 = c12014ne.m56663c5() - iM56865x1;
                            c12014ne.m56684x1(iM56663c5);
                        } else {
                            c12014ne = c12014neArr[0];
                            iM56663c5 = c12014ne.m56663c5() + iM56865x1;
                            c12014ne.m56684x1(iM56663c5);
                        }
                    }
                    if (c12014neArr[0].m56670k4() - (C7019kk.m27462to(Float.valueOf(C14116yg.m67480k4(c12025x6ArrM72660to[1].m56895kk() + c12025x6ArrM72660to[0].m56895kk())), 13) / 2) < c12023wlClone.m56862kk()) {
                        if (zIsLocationAutocalculated || c14365qy.m69834fa().getPlotArea().getLayoutTargetType() != 0) {
                            C12014ne c12014ne6 = c12014neArr[0];
                            c12014ne6.m56671k4(c12014ne6.m56683x1() - ((c12023wlClone.m56862kk() + 2) - (c12014neArr[0].m56670k4() - (C7019kk.m27462to(Float.valueOf(C14116yg.m67480k4(c12025x6ArrM72660to[1].m56895kk() + c12025x6ArrM72660to[0].m56895kk())), 13) / 2))));
                        } else {
                            C12014ne c12014ne7 = c12014neArr[0];
                            c12014ne7.m56671k4(((c12023wlClone.m56862kk() + 2) - (c12014neArr[0].m56670k4() - (C7019kk.m27462to(Float.valueOf(C14116yg.m67480k4(c12025x6ArrM72660to[1].m56895kk() + c12025x6ArrM72660to[0].m56895kk())), 13) / 2))) + c12014ne7.m56683x1());
                        }
                    }
                } else {
                    if (iM69877xk == 3) {
                        if ((C7019kk.m27462to(Float.valueOf(C14116yg.m67480k4(c12025x6ArrM72660to[1].m56897x1() + c12025x6ArrM72660to[0].m56897x1())), 13) / 2) - c12014neArr[0].m56669jd() < c12023wlClone.m56865x1()) {
                            iM56865x1 = c12023wlClone.m56865x1() - ((C7019kk.m27462to(Float.valueOf(C14116yg.m67480k4(c12025x6ArrM72660to[1].m56897x1() + c12025x6ArrM72660to[0].m56897x1())), 13) / 2) - c12014neArr[0].m56669jd());
                            if (zIsLocationAutocalculated || c14365qy.m69834fa().getPlotArea().getLayoutTargetType() != 0) {
                                C12014ne c12014ne8 = c12014neArr[0];
                                c12014ne8.m56676kk(c12014ne8.m56669jd() + iM56865x1);
                                c12014ne = c12014neArr[0];
                                iM56663c5 = c12014ne.m56663c5() - iM56865x1;
                                c12014ne.m56684x1(iM56663c5);
                            } else {
                                C12014ne c12014ne9 = c12014neArr[0];
                                c12014ne9.m56676kk(c12014ne9.m56669jd() - iM56865x1);
                                c12014ne = c12014neArr[0];
                                iM56663c5 = c12014ne.m56663c5() + iM56865x1;
                                c12014ne.m56684x1(iM56663c5);
                            }
                        }
                    } else if (iM69877xk != 4) {
                        if (iM69877xk != 7) {
                            if (iM69877xk == 8) {
                            }
                        }
                    }
                    if (c12014neArr[0].m56670k4() - (C7019kk.m27462to(Float.valueOf(C14116yg.m67480k4(c12025x6ArrM72660to[1].m56895kk() + c12025x6ArrM72660to[0].m56895kk())), 13) / 2) < c12023wlClone.m56862kk()) {
                    }
                }
            }
            if (zIsLocationAutocalculated || c14365qy.m69834fa().getPlotArea().getLayoutTargetType() == 1) {
                C14714vx.m72559k4(c12014neArr[0].Clone(), false, c14365qy);
            }
        }
    }
}
