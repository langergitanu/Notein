package com.aspose.slides;

import OooOoO.C20503OooO00o;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.qe */
/* JADX INFO: loaded from: classes3.dex */
class C14343qe {
    /* JADX INFO: renamed from: k4 */
    private static void m69545k4(C13743kq c13743kq, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        if (f < 180.0f) {
            c13743kq.m64111k4(f3);
            c13743kq.m64125x1(f4);
            c13743kq.m64122to(f5);
            c13743kq.m64115kk(1.0f);
            c13743kq.m64101du(f7);
            c13743kq.m64097c5(f3);
            c13743kq.m64109jd((f4 - f5) - 1.0f);
            c13743kq.m64099ck(f3 + 1.0f);
            c13743kq.m64105fa(f4);
            if (f2 < 0.0f) {
                return;
            } else {
                f4 -= 1.0f;
            }
        } else {
            float f8 = f3 + f6;
            c13743kq.m64111k4(f8);
            c13743kq.m64125x1(f4);
            c13743kq.m64122to(f5);
            c13743kq.m64115kk(1.0f);
            c13743kq.m64101du(f7);
            c13743kq.m64097c5(f8);
            c13743kq.m64109jd(f4 - f5);
            c13743kq.m64099ck(f8 + 1.0f);
        }
        c13743kq.m64105fa(f4);
    }

    /* JADX INFO: renamed from: kk */
    private static void m69548kk(C14365qy c14365qy, boolean z, C12014ne c12014ne) {
        int iM73373ak;
        float f;
        float f2;
        float f3;
        float fM67504x1;
        float fOooO0O0;
        float fM56663c5;
        C13743kq c13743kqM69827c6;
        if (m69549kk(c14365qy.m69834fa().getType())) {
            return;
        }
        int type = c14365qy.m69834fa().getType();
        IRotation3D rotation3D = c14365qy.m69834fa().getRotation3D();
        float depthPercents = (rotation3D.getDepthPercents() & 65535) / 100.0f;
        float fOooO0O02 = (OooOO0O.OooO0O0(c14365qy.m69834fa(), 0) & 65535) / 100.0f;
        float rotationY = 65535 & rotation3D.getRotationY();
        float rotationX = rotation3D.getRotationX();
        double dM67495m9 = C14116yg.m67495m9((((double) rotationY) * 3.141592653589793d) / 180.0d);
        double dM67495m92 = C14116yg.m67495m9((((double) rotationX) * 3.141592653589793d) / 180.0d);
        int iM69819to = C14365qy.m69819to(c14365qy.m69865up());
        int categoryAxisType = c14365qy.m69854ne().m73384dy().getCategoryAxisType();
        boolean zM69552x1 = m69552x1(type);
        if (categoryAxisType != 1) {
            if (zM69552x1) {
                iM69819to = C14787xi.m73370k4(c14365qy.m69854ne(), iM69819to);
            }
            iM73373ak = iM69819to;
        } else if (zM69552x1) {
            iM73373ak = c14365qy.m69854ne().m73373ak();
        } else {
            int baseUnitScale = c14365qy.m69854ne().m73384dy().getBaseUnitScale();
            int iM27462to = C7019kk.m27462to(Double.valueOf(c14365qy.m69854ne().m73389ix()), 14);
            iM73373ak = C0841c4.m4455k4(baseUnitScale, iM27462to, C7019kk.m27462to(Double.valueOf(c14365qy.m69854ne().m73410ne()), 14), iM27462to, false) + 1;
        }
        float size = iM73373ak / c14365qy.m69865up().size();
        float f4 = 0.95f;
        if (rotation3D.getRightAngleAxes()) {
            f = ((1.0f / (size >= 1.0f ? (size * size) + 1.0f : size * size)) + 1.0f) * 0.5f;
            f2 = 0.95f;
        } else if (size < 1.0f) {
            f4 = ((((float) (dM67495m9 * dM67495m92)) / size) + 1.0f) * 0.5f;
            f2 = 1.0f;
            f = f4;
        } else {
            f = 0.6f;
            f4 = 0.8f;
            f2 = 0.95f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        float fM56663c52 = c12014ne.m56663c5() * f4;
        float fM56683x1 = c12014ne.m56683x1() * f;
        float f5 = fM56663c52 / size;
        double d = f5 * depthPercents;
        float f6 = (float) (dM67495m9 * d);
        float f7 = (float) (d * dM67495m92);
        float fM56663c53 = (fM56663c52 + f6) / c12014ne.m56663c5();
        float fM56683x12 = (fM56683x1 + f7) / c12014ne.m56683x1();
        if (rotation3D.getRightAngleAxes()) {
            fM67504x1 = C14116yg.m67481k4(fM56663c53, fM56683x12);
            f3 = 1.0f;
        } else {
            f3 = 1.0f;
            fM67504x1 = C14116yg.m67504x1(fM56663c53, fM56683x12);
        }
        float fM67481k4 = C14116yg.m67481k4(fM67504x1, f3);
        float f8 = fM56663c52 / fM67481k4;
        float f9 = fM56683x1 / fM67481k4;
        float fM67505x1 = C14116yg.m67505x1(f6);
        float fM67505x12 = C14116yg.m67505x1(f7);
        if (c14365qy.m69834fa().getRotation3D().getRightAngleAxes()) {
            fOooO0O0 = (((fM67505x12 * 8.0f) + ((c12014ne.m56683x1() - f9) - (f7 / fM67481k4))) / 2.0f) + c12014ne.m56664ck() + f9;
            fM56663c5 = ((((f6 / fM67481k4) + (c12014ne.m56663c5() - f8)) - (fM67505x1 * 4.0f)) / 2.0f) + c12014ne.m56669jd();
        } else {
            float fM67481k42 = C14116yg.m67481k4(f6, f7);
            fOooO0O0 = (((float) dM67495m92) * fM67481k42) + C20503OooO00o.OooO0O0(c12014ne.m56683x1(), f9, 2.0f, c12014ne.m56664ck() + f9);
            fM56663c5 = ((((c12014ne.m56663c5() - f8) - (fM67505x1 * 4.0f)) / 2.0f) + c12014ne.m56669jd()) - (((float) dM67495m9) * fM67481k42);
        }
        float f10 = fOooO0O0;
        c14365qy.m69833e0().m64111k4(fM56663c5);
        c14365qy.m69833e0().m64125x1(f10);
        c14365qy.m69833e0().m64115kk(f8);
        c14365qy.m69833e0().m64122to(f9);
        c14365qy.m69833e0().m64101du((f5 * f2) / fM67481k4);
        float f11 = 0.0f / fM67481k4;
        c14365qy.m69833e0().m64107h4(f11);
        c14365qy.m69833e0().m64118m9(f11);
        c14365qy.m69833e0().m64103dy(fM67481k4);
        c14365qy.m69862ts().m64111k4(fM56663c5);
        c14365qy.m69862ts().m64125x1(f10);
        c14365qy.m69862ts().m64115kk(f8);
        c14365qy.m69862ts().m64122to(f9);
        c14365qy.m69862ts().m64101du(0.0f);
        c14365qy.m69862ts().m64097c5(fM56663c5);
        c14365qy.m69862ts().m64109jd(f10 - f9);
        c14365qy.m69862ts().m64099ck(fM56663c5 + f8);
        c14365qy.m69862ts().m64105fa(f10);
        float fM64117m9 = (c14365qy.m69833e0().m64117m9() * depthPercents) / (fOooO0O02 + 1.0f);
        float f12 = (fOooO0O02 * fM64117m9) + fM64117m9;
        if (z) {
            m69545k4(c14365qy.m69825bz(), rotationY, rotationX, fM56663c5, f10, f9, f8, f12);
            c13743kqM69827c6 = c14365qy.m69827c6();
        } else {
            m69545k4(c14365qy.m69827c6(), rotationY, rotationX, fM56663c5, f10, f9, f8, f12);
            c13743kqM69827c6 = c14365qy.m69825bz();
        }
        m69550x1(c13743kqM69827c6, rotationY, rotationX, fM56663c5, f10, f9, f8, f12);
    }

    /* JADX INFO: renamed from: x1 */
    private static void m69550x1(C13743kq c13743kq, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        if (f2 >= 0.0f) {
            c13743kq.m64097c5(f3 - 1.0f);
            c13743kq.m64109jd(f4 - 2.0f);
            c13743kq.m64099ck(f3 + f6);
            c13743kq.m64105fa(f4 - 1.0f);
            c13743kq.m64101du(f7);
            return;
        }
        c13743kq.m64097c5(0.0f);
        c13743kq.m64109jd(0.0f);
        c13743kq.m64099ck(0.0f);
        c13743kq.m64105fa(0.0f);
        c13743kq.m64101du(0.0f);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m69546k4(C14365qy c14365qy, boolean z, C12014ne c12014ne) {
        if (m69549kk(c14365qy.m69834fa().getType())) {
            return;
        }
        boolean zM67859x1 = C14164n2.m67859x1(c14365qy.m69834fa());
        C12014ne c12014neClone = c12014ne.Clone();
        if (zM67859x1) {
            m69548kk(c14365qy, z, c12014neClone);
        } else {
            m69551x1(c14365qy, z, c12014neClone);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0365  */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m69551x1(C14365qy c14365qy, boolean z, C12014ne c12014ne) {
        float fM56663c5;
        float fM56683x1;
        float fM56664ck;
        float fM56683x12;
        float f;
        float f2;
        float f3;
        float f4;
        C13743kq c13743kqM69827c6;
        if (m69549kk(c14365qy.m69834fa().getType())) {
            return;
        }
        int type = c14365qy.m69834fa().getType();
        IRotation3D rotation3D = c14365qy.m69834fa().getRotation3D();
        float depthPercents = (rotation3D.getDepthPercents() & 65535) / 100.0f;
        float fOooO0O0 = (OooOO0O.OooO0O0(c14365qy.m69834fa(), 0) & 65535) / 100.0f;
        float gapWidth = (c14365qy.m69834fa().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapWidth() & 65535) / 100.0f;
        int iM69819to = C14365qy.m69819to(c14365qy.m69865up());
        if (c14365qy.m69854ne().m73384dy().getCategoryAxisType() == 1) {
            iM69819to = m69552x1(type) ? c14365qy.m69854ne().m73373ak() : C0841c4.m4455k4(c14365qy.m69854ne().m73384dy().getBaseUnitScale(), C7019kk.m27462to(Double.valueOf(c14365qy.m69854ne().m73389ix()), 14), C7019kk.m27462to(Double.valueOf(c14365qy.m69854ne().m73410ne()), 14), C7019kk.m27462to(Double.valueOf(c14365qy.m69854ne().m73389ix()), 14), false) + 1;
        } else if (m69552x1(type)) {
            iM69819to = C14787xi.m73370k4(c14365qy.m69854ne(), iM69819to);
        }
        float f5 = iM69819to;
        float size = m69547k4(type) ? 1 : c14365qy.m69865up().size();
        float f6 = !C14164n2.m67856kk(c14365qy.m69834fa()) ? ((size + gapWidth) * f5) / (fOooO0O0 + 1.0f) : f5 / size;
        float f7 = (c14365qy.m69865up().size() == 1 && (type == 6 || type == 14 || type == 10 || type == 18 || type == 25)) ? 0.67f : (type == 6 || type == 25) ? 0.7f : 1.0f;
        float rotationY = 65535 & rotation3D.getRotationY();
        float rotationX = rotation3D.getRotationX();
        float fM56663c52 = c12014ne.m56663c5();
        float fM56683x13 = c12014ne.m56683x1() * f7;
        if (!rotation3D.getRightAngleAxes()) {
            if (C14116yg.m67480k4(rotationX) + C14116yg.m67480k4(rotationY) >= 10.0f) {
                if (type == 6) {
                    fM56683x13 = c12014ne.m56683x1() * f7;
                    fM56663c52 = c12014ne.m56663c5() * f7;
                }
                if (type == 3 || type == 4 || type == 5 || type == 33 || type == 36 || type == 37) {
                    float perspective = ((rotation3D.getPerspective() & 255) / 200.0f) + 1.0f;
                    fM56663c52 /= perspective;
                    fM56683x13 /= perspective;
                }
            }
        }
        float f8 = !z ? fM56663c52 / f6 : fM56683x13 / f6;
        float f9 = fM56683x13;
        double d = (((double) rotationY) * 3.141592653589793d) / 180.0d;
        double dM67495m9 = C14116yg.m67495m9(d);
        double d2 = (((double) rotationX) * 3.141592653589793d) / 180.0d;
        double dM67495m92 = C14116yg.m67495m9(d2);
        if (!rotation3D.getRightAngleAxes()) {
            dM67495m9 = C14116yg.m67495m9(d);
            dM67495m92 = C14116yg.m67495m9(d2);
            if (type == 3 || type == 33 || type == 5) {
                dM67495m9 = C14116yg.m67495m9(d) * 2.0d;
                dM67495m92 = C14116yg.m67495m9(d2) * 2.0d;
            } else if (type == 6 || type == 25) {
                dM67495m9 = C14116yg.m67495m9(d) / 2.0d;
                dM67495m92 = C14116yg.m67495m9(d2) / 2.0d;
            }
        }
        double d3 = f8 * depthPercents;
        float f10 = (float) (dM67495m9 * d3);
        float f11 = (float) (d3 * dM67495m92);
        float fM67481k4 = C14116yg.m67481k4(C14116yg.m67481k4(((C14116yg.m67480k4(f10) + fM56663c52) - 2.0f) / c12014ne.m56663c5(), ((C14116yg.m67480k4(f11) + f9) - 2.0f) / c12014ne.m56683x1()), 1.0f);
        float f12 = fM56663c52 / fM67481k4;
        float f13 = f9 / fM67481k4;
        float fM67505x1 = C14116yg.m67505x1(f10);
        float fM67505x12 = C14116yg.m67505x1(f11);
        if (c14365qy.m69834fa().getRotation3D().getRightAngleAxes()) {
            fM56663c5 = ((((f10 / fM67481k4) + (c12014ne.m56663c5() - f12)) - (fM67505x1 * 4.0f)) / 2.0f) + c12014ne.m56669jd();
            fM56664ck = c12014ne.m56664ck() + f13;
            fM56683x12 = (fM67505x12 * 4.0f) + ((c12014ne.m56683x1() - f13) - (f11 / fM67481k4));
        } else {
            if (c14365qy.m69834fa().hasDataTable() || type == 6 || type == 37 || type == 36 || type == 5 || type == 25) {
                fM56663c5 = ((((c12014ne.m56663c5() - f12) - f10) - (fM67505x1 * 4.0f)) / 2.0f) + c12014ne.m56669jd();
                fM56683x1 = type == 6 ? ((c12014ne.m56683x1() - f13) / 2.0f) + c12014ne.m56664ck() + f13 + f11 : C20503OooO00o.OooO0O0(c12014ne.m56683x1(), f13, 2.0f, c12014ne.m56664ck() + f13);
                float f14 = fM56663c5;
                c14365qy.m69833e0().m64111k4(f14);
                c14365qy.m69833e0().m64125x1(fM56683x1);
                c14365qy.m69833e0().m64115kk(f12);
                c14365qy.m69833e0().m64122to(f13);
                c14365qy.m69833e0().m64101du(f8 / fM67481k4);
                c14365qy.m69833e0().m64107h4(f10 / fM67481k4);
                c14365qy.m69833e0().m64118m9(f11 / fM67481k4);
                c14365qy.m69833e0().m64103dy(fM67481k4);
                c14365qy.m69862ts().m64111k4(f14);
                c14365qy.m69862ts().m64125x1(fM56683x1);
                c14365qy.m69862ts().m64115kk(f12);
                c14365qy.m69862ts().m64122to(f13);
                c14365qy.m69862ts().m64101du(0.0f);
                c14365qy.m69862ts().m64097c5(f14);
                c14365qy.m69862ts().m64109jd(fM56683x1 - f13);
                c14365qy.m69862ts().m64099ck(f14 + f12);
                c14365qy.m69862ts().m64105fa(fM56683x1);
                float fM64117m9 = (c14365qy.m69833e0().m64117m9() * depthPercents) / (fOooO0O0 + 1.0f);
                float f15 = (fOooO0O0 * fM64117m9) + fM64117m9;
                if (z) {
                    f3 = fM56683x1;
                    f = f12;
                    f2 = f13;
                    f4 = rotationY;
                    m69545k4(c14365qy.m69827c6(), f4, rotationX, f14, f3, f2, f, f15);
                    c13743kqM69827c6 = c14365qy.m69825bz();
                } else {
                    f = f12;
                    f2 = f13;
                    f3 = fM56683x1;
                    f4 = rotationY;
                    m69545k4(c14365qy.m69825bz(), f4, rotationX, f14, f3, f2, f, f15);
                    c13743kqM69827c6 = c14365qy.m69827c6();
                }
                m69550x1(c13743kqM69827c6, f4, rotationX, f14, f3, f2, f, f15);
            }
            fM56663c5 = C20503OooO00o.OooO0O0(c12014ne.m56663c5(), f12, 2.0f, c12014ne.m56669jd());
            fM56664ck = c12014ne.m56664ck() + f13;
            fM56683x12 = (fM67505x12 * 4.0f) + (f11 / fM67481k4) + (c12014ne.m56683x1() - f13);
        }
        fM56683x1 = (fM56683x12 / 2.0f) + fM56664ck;
        float f142 = fM56663c5;
        c14365qy.m69833e0().m64111k4(f142);
        c14365qy.m69833e0().m64125x1(fM56683x1);
        c14365qy.m69833e0().m64115kk(f12);
        c14365qy.m69833e0().m64122to(f13);
        c14365qy.m69833e0().m64101du(f8 / fM67481k4);
        c14365qy.m69833e0().m64107h4(f10 / fM67481k4);
        c14365qy.m69833e0().m64118m9(f11 / fM67481k4);
        c14365qy.m69833e0().m64103dy(fM67481k4);
        c14365qy.m69862ts().m64111k4(f142);
        c14365qy.m69862ts().m64125x1(fM56683x1);
        c14365qy.m69862ts().m64115kk(f12);
        c14365qy.m69862ts().m64122to(f13);
        c14365qy.m69862ts().m64101du(0.0f);
        c14365qy.m69862ts().m64097c5(f142);
        c14365qy.m69862ts().m64109jd(fM56683x1 - f13);
        c14365qy.m69862ts().m64099ck(f142 + f12);
        c14365qy.m69862ts().m64105fa(fM56683x1);
        float fM64117m92 = (c14365qy.m69833e0().m64117m9() * depthPercents) / (fOooO0O0 + 1.0f);
        float f152 = (fOooO0O0 * fM64117m92) + fM64117m92;
        if (z) {
        }
        m69550x1(c13743kqM69827c6, f4, rotationX, f142, f3, f2, f, f152);
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m69547k4(int i) {
        return i == 4 || i == 5 || i == 8 || i == 9 || i == 12 || i == 13 || i == 16 || i == 17 || i == 36 || i == 37 || i == 39 || i == 40 || i == 42 || i == 43 || i == 45 || i == 46;
    }

    /* JADX INFO: renamed from: kk */
    private static boolean m69549kk(int i) {
        return i == 27 || i == 30;
    }

    /* JADX INFO: renamed from: x1 */
    private static boolean m69552x1(int i) {
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
}
