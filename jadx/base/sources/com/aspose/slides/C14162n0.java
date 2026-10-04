package com.aspose.slides;

import OooO0o.C20424OooO0Oo;
import Oooo0.C20856OooooOo;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12019um;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.google.common.base.Ascii;

/* JADX INFO: renamed from: com.aspose.slides.n0 */
/* JADX INFO: loaded from: classes3.dex */
class C14162n0 {

    /* JADX INFO: renamed from: k4 */
    private final C14365qy f47465k4;

    public C14162n0(C14365qy c14365qy) {
        this.f47465k4 = c14365qy;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m67844k4(float f, float f2, float f3, C14787xi c14787xi, float f4) {
        boolean z;
        float f5;
        C11896dy c11896dy;
        if (c14787xi.m73384dy().getMinorTickMark() == 2 || !c14787xi.m73384dy().isVisible()) {
            return;
        }
        C14365qy c14365qyM73423wy = c14787xi.m73423wy();
        int minorTickMark = c14787xi.m73384dy().getMinorTickMark();
        boolean z2 = true;
        if (minorTickMark != 0) {
            z = false;
            if (minorTickMark != 1) {
                if (minorTickMark != 3) {
                    z2 = false;
                } else if (f <= c14365qyM73423wy.m69833e0().m64106h4()) {
                    z = true;
                    z2 = false;
                }
            } else if (f > c14365qyM73423wy.m69833e0().m64106h4()) {
            }
        } else {
            z = true;
        }
        float fM73374ar = (float) ((c14787xi.m73374ar() / (c14787xi.m73389ix() - c14787xi.m73410ne())) * ((double) (f3 - f2)));
        if (c14787xi.m73384dy().isPlotOrderReversed()) {
            f5 = f2;
        } else {
            fM73374ar = -fM73374ar;
            f5 = f3;
        }
        float fM4486x1 = C0841c4.m4486x1(c14787xi.m73400kk().m56639dy());
        do {
            if (z2) {
                c11896dy = new C11896dy();
                try {
                    c11896dy.m55574x1(f, f5, f + fM4486x1, f5);
                    c14787xi.m73395k4(c11896dy, 0.0f, f4);
                } finally {
                }
            }
            if (z) {
                c11896dy = new C11896dy();
                try {
                    c11896dy.m55574x1(f - fM4486x1, f5, f, f5);
                    c14787xi.m73395k4(c11896dy, 0.0f, f4);
                } finally {
                }
            }
            f5 += fM73374ar;
            if (f2 > f5) {
                return;
            }
        } while (f5 <= f3);
    }

    /* JADX INFO: renamed from: kk */
    public final void m67848kk(C14787xi c14787xi) {
        int i;
        float f;
        int i2;
        int iOooO00o;
        double dM73432yj = this.f47465k4.m69863u4().m73432yj();
        double dM73405ks = this.f47465k4.m69863u4().m73405ks();
        double dM73412rv = this.f47465k4.m69863u4().m73412rv();
        int iOooO00o2 = com.aspose.slides.Collections.Generic.OooO00o.OooO00o((this.f47465k4.m69863u4().m73384dy().isPlotOrderReversed() ? dM73432yj - dM73412rv : dM73412rv - dM73405ks) / (dM73432yj - dM73405ks), this.f47465k4.m69833e0().m64100du(), 14);
        boolean z = iOooO00o2 != 0;
        IRotation3D rotation3D = this.f47465k4.m69834fa().getRotation3D();
        float rotationY = rotation3D.getRotationY() & 65535;
        float fM64124x1 = this.f47465k4.m69833e0().m64124x1() + this.f47465k4.m69833e0().m64121to();
        float fM64114kk = this.f47465k4.m69833e0().m64114kk();
        float fM73390jd = c14787xi.m73390jd();
        if (rotationY > 180.0f) {
            fM64124x1 = (this.f47465k4.m69833e0().m64124x1() - c14787xi.f50094k4) - fM73390jd;
        }
        if (c14787xi.m73384dy().getTickLabelPosition() == 2) {
            fM64114kk -= iOooO00o2;
        }
        float fOooO0O0 = (65535 & OooOO0O.OooO0O0(this.f47465k4.m69834fa(), 0)) / 100.0f;
        float fM64117m9 = (this.f47465k4.m69833e0().m64117m9() * ((rotation3D.getDepthPercents() & 65535) / 100.0f)) / (fOooO0O0 + 1.0f);
        float f2 = (fOooO0O0 * fM64117m9) + fM64117m9;
        boolean zM67859x1 = C14164n2.m67859x1(this.f47465k4.m69834fa());
        if (zM67859x1) {
            C13743kq c13743kqM69833e0 = this.f47465k4.m69833e0();
            C11896dy c11896dy = new C11896dy();
            try {
                i = 1;
                c11896dy.m55574x1(c13743kqM69833e0.m64124x1() + c13743kqM69833e0.m64121to(), c13743kqM69833e0.m64114kk(), c13743kqM69833e0.m64124x1() + c13743kqM69833e0.m64121to(), c13743kqM69833e0.m64114kk() + 1.0f);
                if (z) {
                    c11896dy.m55567m9();
                    float f3 = iOooO00o2;
                    c11896dy.m55574x1(c13743kqM69833e0.m64124x1() + c13743kqM69833e0.m64121to(), c13743kqM69833e0.m64114kk() - f3, c13743kqM69833e0.m64124x1() + c13743kqM69833e0.m64121to(), (c13743kqM69833e0.m64114kk() + 1.0f) - f3);
                    c11896dy.m55567m9();
                }
                if (rotation3D.getRightAngleAxes()) {
                    c14787xi.m73395k4(c11896dy, f2, f2);
                } else {
                    c14787xi.m73395k4(c11896dy, f2, 0.0f);
                }
                c11896dy.dispose();
            } catch (Throwable th) {
                c11896dy.dispose();
                throw th;
            }
        } else {
            i = 1;
        }
        int size = c14787xi.f50098m9.size();
        if (zM67859x1) {
            size--;
        }
        float f4 = f2 / size;
        int i3 = 0;
        while (i3 < c14787xi.f50098m9.size()) {
            if (zM67859x1) {
                float f5 = i3 * f4;
                f = f5 - (c14787xi.f50110x1 / 2.0f);
                if (!rotation3D.getRightAngleAxes()) {
                    f = (f5 - (c14787xi.f50110x1 / 2.0f)) - f2;
                }
            } else {
                float f6 = f4 / 2.0f;
                f = ((i3 * f4) + f6) - (c14787xi.f50110x1 / 2.0f);
                if (!rotation3D.getRightAngleAxes()) {
                    f = -((C20856OooooOo.OooO00o(i, i3, c14787xi.f50098m9) * f4) + f6);
                }
            }
            if (rotationY > 180.0f) {
                f = f4 * (i3 + 1);
            }
            float f7 = f;
            if (c14787xi.m73384dy().isPlotOrderReversed()) {
                i2 = 1;
                iOooO00o = i3;
            } else {
                i2 = 1;
                iOooO00o = C20856OooooOo.OooO00o(1, i3, c14787xi.f50098m9);
            }
            String strM4468k4 = C0841c4.m4468k4(c14787xi.f50098m9.get_Item(iOooO00o), c14787xi);
            if (c14787xi.m73384dy().getTickLabelPosition() != 3 && iOooO00o % c14787xi.m73376bv() == 0) {
                C1236i2.m7388k4(C12007ix.m56544k4(C12014ne.m56661x1(new C12007ix(fM64124x1, fM64114kk, c14787xi.f50094k4, c14787xi.f50110x1).Clone())).Clone(), strM4468k4, c14787xi.m73386h4(), c14787xi.m73425x1(), c14787xi.m73413to().Clone(), 1, 2, this.f47465k4, f7);
            }
            i3++;
            i = i2;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m67849x1(C14787xi c14787xi) throws Throwable {
        boolean z;
        int i;
        float f;
        boolean z2;
        List<C1210hn> list;
        float f2;
        char c;
        float f3;
        int i2;
        C12025x6 c12025x6;
        float f4;
        float fM56897x1;
        float f5;
        int i3;
        int i4;
        String str;
        C12007ix c12007ixClone;
        C12013m9 c12013m9M73425x1;
        C12003du c12003duClone;
        int i5;
        C14365qy c14365qy;
        C12009k4 c12009k4;
        float fM56897x12;
        float fM56897x13;
        if (c14787xi.m73384dy().getCategoryAxisType() == 1) {
            throw new NotImplementedException("CategoryAxisType.Date is not implemented");
        }
        int iM69819to = C14365qy.m69819to(this.f47465k4.m69865up());
        IRotation3D rotation3D = this.f47465k4.m69834fa().getRotation3D();
        float rotationX = rotation3D.getRotationX();
        float depthPercents = ((rotation3D.getDepthPercents() & 65535) / 100.0f) * this.f47465k4.m69833e0().m64102dy();
        C13743kq c13743kqM69833e0 = this.f47465k4.m69833e0();
        C12007ix c12007ix = new C12007ix(c13743kqM69833e0.m64124x1(), c13743kqM69833e0.m64114kk(), c13743kqM69833e0.m64121to(), c13743kqM69833e0.m64100du());
        float fOooO0O0 = depthPercents + (((OooOO0O.OooO0O0(this.f47465k4.m69834fa(), 0) & 65535) / 100.0f) * depthPercents);
        if (!this.f47465k4.m69834fa().getRotation3D().getRightAngleAxes()) {
            fOooO0O0 = 0.0f;
        }
        C12025x6 c12025x62 = new C12025x6(this.f47465k4.m69833e0().m64124x1(), this.f47465k4.m69833e0().m64114kk());
        C12025x6 c12025x63 = new C12025x6(this.f47465k4.m69833e0().m64124x1() + this.f47465k4.m69833e0().m64121to(), this.f47465k4.m69833e0().m64114kk());
        double dM73432yj = this.f47465k4.m69863u4().m73432yj();
        double dM73405ks = this.f47465k4.m69863u4().m73405ks();
        double dM73412rv = this.f47465k4.m69863u4().m73412rv();
        boolean z3 = this.f47465k4.m69863u4().m73410ne() == ((double) this.f47465k4.m69863u4().m73430x6());
        int iOooO00o = com.aspose.slides.Collections.Generic.OooO00o.OooO00o((this.f47465k4.m69863u4().m73384dy().isPlotOrderReversed() ? dM73432yj - dM73412rv : dM73412rv - dM73405ks) / (dM73432yj - dM73405ks), this.f47465k4.m69833e0().m64100du(), 14);
        boolean z4 = iOooO00o != 0;
        float fM64114kk = this.f47465k4.m69833e0().m64114kk();
        if (c14787xi.m73384dy().getTickLabelPosition() == 2) {
            fM64114kk -= iOooO00o;
        }
        if (rotationX >= 0.0f) {
            C11896dy c11896dy = new C11896dy();
            try {
                z = z3;
                c11896dy.m55574x1(c13743kqM69833e0.m64124x1(), c13743kqM69833e0.m64114kk(), c13743kqM69833e0.m64124x1() + c13743kqM69833e0.m64121to(), c13743kqM69833e0.m64114kk());
                c14787xi.m73395k4(c11896dy, 0.0f, fOooO0O0);
                if (z4) {
                    c11896dy = new C11896dy();
                    try {
                        float f6 = iOooO00o;
                        c11896dy.m55574x1(c13743kqM69833e0.m64124x1(), c13743kqM69833e0.m64114kk() - f6, c13743kqM69833e0.m64124x1() + c13743kqM69833e0.m64121to(), c13743kqM69833e0.m64114kk() - f6);
                        c14787xi.m73395k4(c11896dy, 0.0f, fOooO0O0);
                    } finally {
                    }
                }
            } finally {
            }
        } else {
            z = z3;
        }
        if (c14787xi.m73384dy().getTickLabelPosition() == 2) {
            float f7 = iOooO00o;
            c12025x62.m56898x1(c12025x62.m56895kk() - f7);
            c12025x63.m56898x1(c12025x63.m56895kk() - f7);
        }
        List<C1210hn> listM69871x1 = this.f47465k4.m69871x1();
        float fM73390jd = c14787xi.m73390jd();
        if (c14787xi.m73384dy().getTickLabelPosition() != 3) {
            float fM56639dy = c14787xi.m73400kk().m56639dy();
            fM73390jd += C0841c4.m4453k4(fM56639dy) + C0841c4.m4486x1(fM56639dy);
        }
        boolean z5 = c14787xi.m73375b3() || this.f47465k4.m69834fa().hasDataTable();
        if (z5) {
            i = iM69819to;
        } else {
            i = iM69819to - 1;
            if (i == 0) {
                i = 1;
            }
        }
        C12025x6 c12025x64 = new C12025x6(this.f47465k4.m69833e0().m64124x1(), fM64114kk);
        float fM56550c5 = c12007ix.m56550c5() / i;
        int i6 = 0;
        while (i6 < iM69819to) {
            int i7 = c14787xi.m73384dy().isPlotOrderReversed() ? (iM69819to - 1) - i6 : i6;
            String strM4468k4 = C14113y2.f47374k4;
            C12003du c12003duClone2 = c14787xi.m73413to().Clone();
            float f8 = fM73390jd;
            if (i7 < c14787xi.f50098m9.size()) {
                strM4468k4 = C0841c4.m4468k4(c14787xi.f50098m9.get_Item(i6), c14787xi);
                f = fOooO0O0;
                z2 = z5;
                C13729ki.m63876k4(c14787xi.f50098m9.get_Item(i7), c14787xi.m73384dy().getNumberFormat(), c12003duClone2.Clone()).CloneTo(c12003duClone2);
                if (c14787xi.m73385fa() && listM69871x1.size() > 0) {
                    String strM7228h4 = i7 < listM69871x1.size() ? listM69871x1.get_Item(i7).m7228h4() : C14113y2.f47374k4;
                    strM4468k4 = C13729ki.m63880k4(c14787xi.f50098m9.get_Item(i7), strM7228h4, i7 < listM69871x1.size() ? listM69871x1.get_Item(i7).m7227du() : false);
                    C13729ki.m63876k4(c14787xi.f50098m9.get_Item(i7), strM7228h4, c12003duClone2.Clone()).CloneTo(c12003duClone2);
                }
            } else {
                f = fOooO0O0;
                z2 = z5;
            }
            if (c14787xi.m73384dy().getTickLabelPosition() == 3) {
                list = listM69871x1;
                f2 = rotationX;
                c = 3;
                f3 = fM56550c5;
                i2 = i6;
                c12025x6 = c12025x64;
                fOooO0O0 = f;
            } else if (i7 % c14787xi.m73376bv() == 0) {
                C12007ix c12007ix2 = new C12007ix(0.0f, 0.0f, 0.0f, 0.0f);
                if (rotationX >= 0.0f) {
                    if (fM56550c5 < 0.0f) {
                        f4 = 2.0f;
                        fM56897x13 = ((i6 + 1) * fM56550c5) + c12025x64.m56897x1();
                    } else {
                        f4 = 2.0f;
                        fM56897x13 = c12025x64.m56897x1() + (i6 * fM56550c5);
                    }
                    c12007ix2.m56566kk(fM56897x13);
                    if (!z2) {
                        c12007ix2.m56566kk(c12007ix2.m56557jd() - (fM56550c5 / f4));
                    }
                    c12007ix2.m56572to(c12025x64.m56895kk() + f8);
                    c12007ix2.m56576x1(C14116yg.m67480k4(fM56550c5));
                    c12007ix2.m56560k4(c14787xi.f50095kk);
                } else {
                    f4 = 2.0f;
                    if (rotationX < 0.0f && !z && c14787xi.m73384dy().getTickLabelPosition() == 2) {
                        if (fM56550c5 > 0.0f) {
                            fM56897x1 = c12025x64.m56897x1();
                            f5 = i6;
                        } else {
                            fM56897x1 = c12025x64.m56897x1();
                            f5 = i6 + 1;
                        }
                        c12007ix2.m56566kk((f5 * fM56550c5) + fM56897x1);
                        c12007ix2.m56572to((c12025x64.m56895kk() - c14787xi.f50095kk) - f8);
                        c12007ix2.m56576x1(C14116yg.m67480k4(fM56550c5));
                        c12007ix2.m56560k4(c14787xi.f50095kk);
                    }
                }
                int iM73386h4 = c14787xi.m73386h4();
                if (rotation3D.getRightAngleAxes() || z4) {
                    list = listM69871x1;
                    i3 = 2;
                } else {
                    i3 = 2;
                    iM73386h4 = C7019kk.m27462to(Float.valueOf(C14116yg.m67504x1(rotationX, C14116yg.m67507x1(c14787xi.m73386h4(), (rotation3D.getPerspective() & 255) / 2))), 13);
                    int iM27462to = C7019kk.m27462to(Float.valueOf(C14116yg.m67481k4(rotationX, C14116yg.m67483k4(c14787xi.m73386h4(), (rotation3D.getPerspective() & 255) / 2))), 13);
                    list = listM69871x1;
                    if (C14116yg.m67482k4(iM73386h4) <= C14116yg.m67482k4(iM27462to)) {
                        iM73386h4 = iM27462to;
                    }
                }
                if (iM73386h4 != 0) {
                    C12025x6 c12025x6Clone = c12007ix2.m56552du().Clone();
                    C12015qq c12015qq = new C12015qq();
                    C12009k4 c12009k42 = new C12009k4(1, 1);
                    try {
                        AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k42);
                        try {
                            f2 = rotationX;
                            new C12019um(C12019um.m56799c5()).m56805du(3);
                            c12009k4 = c12009k42;
                            try {
                                f3 = fM56550c5;
                                abstractC12008jdM56582k4.mo17490k4(strM4468k4, c14787xi.m73400kk(), c12025x6Clone.Clone(), new C12019um(C12019um.m56799c5())).CloneTo(c12015qq);
                                try {
                                    abstractC12008jdM56582k4.dispose();
                                    c12009k4.dispose();
                                    double dM67482k4 = (((double) C14116yg.m67482k4(iM73386h4)) / 180.0d) * 3.141592653589793d;
                                    float fM67495m9 = (float) ((C14116yg.m67495m9(dM67482k4) * ((double) c12015qq.m56697kk())) + (C14116yg.m67470dy(dM67482k4) * ((double) c12015qq.m56699x1())));
                                    float fM56699x1 = c12015qq.m56699x1();
                                    float fM56697kk = c12015qq.m56697kk();
                                    float fM56897x14 = c12025x6Clone.m56897x1();
                                    float fM56895kk = c12025x6Clone.m56895kk();
                                    if (c14787xi.m73384dy().getPosition() == 0) {
                                        if (iM73386h4 > 0) {
                                            if (iM73386h4 != 90 && iM73386h4 != -90) {
                                                fM56897x12 = (f3 / f4) + c12025x6Clone.m56897x1();
                                            }
                                            fM56897x14 = fM56897x12 - fM67495m9;
                                        } else if (iM73386h4 != 0) {
                                            fM56897x14 = (f3 / f4) + c12025x6Clone.m56897x1();
                                        }
                                        fM56897x12 = (f3 / f4) + c12025x6Clone.m56897x1();
                                        fM67495m9 /= f4;
                                        fM56897x14 = fM56897x12 - fM67495m9;
                                    }
                                    i2 = i6;
                                    if (iM73386h4 <= 0) {
                                        i3 = iM73386h4 < 0 ? 0 : 1;
                                    }
                                    c12007ixClone = new C12007ix(new C12025x6(fM56897x14, fM56895kk), new C12015qq(fM56699x1, fM56697kk));
                                    c12025x6 = c12025x64;
                                    c12013m9M73425x1 = c14787xi.m73425x1();
                                    c12003duClone = c12003duClone2.Clone();
                                    i5 = 2;
                                    c14365qy = this.f47465k4;
                                    str = strM4468k4;
                                    c = 3;
                                    i4 = iM73386h4;
                                } catch (Throwable th) {
                                    th = th;
                                    c12009k4.dispose();
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (abstractC12008jdM56582k4 != null) {
                                    abstractC12008jdM56582k4.dispose();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            c12009k4 = c12009k42;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        c12009k4 = c12009k42;
                    }
                } else {
                    String str2 = strM4468k4;
                    i4 = iM73386h4;
                    str = str2;
                    f2 = rotationX;
                    f3 = fM56550c5;
                    i2 = i6;
                    c12025x6 = c12025x64;
                    c = 3;
                    c12007ixClone = C12007ix.m56544k4(C12014ne.m56661x1(c12007ix2.Clone())).Clone();
                    c12013m9M73425x1 = c14787xi.m73425x1();
                    c12003duClone = c12003duClone2.Clone();
                    i5 = 2;
                    i3 = 1;
                    c14365qy = this.f47465k4;
                }
                C1236i2.m7388k4(c12007ixClone, str, i4, c12013m9M73425x1, c12003duClone, i3, i5, c14365qy, f);
                fOooO0O0 = f;
                i6 = i2 + 1;
                c12025x64 = c12025x6;
                fM73390jd = f8;
                z5 = z2;
                listM69871x1 = list;
                rotationX = f2;
                fM56550c5 = f3;
            } else {
                list = listM69871x1;
                f2 = rotationX;
                f3 = fM56550c5;
                i2 = i6;
                c12025x6 = c12025x64;
                fOooO0O0 = f;
                c = 3;
            }
            i6 = i2 + 1;
            c12025x64 = c12025x6;
            fM73390jd = f8;
            z5 = z2;
            listM69871x1 = list;
            rotationX = f2;
            fM56550c5 = f3;
        }
        m67846k4(iOooO00o, iM69819to, c14787xi, fOooO0O0);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m67845k4(float f, float f2, C14787xi c14787xi, float f3) {
        boolean z;
        C11896dy c11896dy;
        if (c14787xi.m73384dy().getMajorTickMark() == 2 || !c14787xi.m73384dy().isVisible()) {
            return;
        }
        C14365qy c14365qyM73423wy = c14787xi.m73423wy();
        int majorTickMark = c14787xi.m73384dy().getMajorTickMark();
        boolean z2 = true;
        if (majorTickMark != 0) {
            z = false;
            if (majorTickMark != 1) {
                if (majorTickMark != 3) {
                    z2 = false;
                } else if (f <= c14365qyM73423wy.m69833e0().m64106h4()) {
                    z = true;
                    z2 = false;
                }
            } else if (f > c14365qyM73423wy.m69833e0().m64106h4()) {
            }
        } else {
            z = true;
        }
        float fM4453k4 = C0841c4.m4453k4(c14787xi.m73400kk().m56639dy());
        if (z2) {
            c11896dy = new C11896dy();
            try {
                c11896dy.m55574x1(f, f2, f + fM4453k4, f2);
                c14787xi.m73395k4(c11896dy, 0.0f, f3);
            } finally {
            }
        }
        if (z) {
            c11896dy = new C11896dy();
            try {
                c11896dy.m55574x1(f - fM4453k4, f2, f, f2);
                c14787xi.m73395k4(c11896dy, 0.0f, f3);
            } finally {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x014f, code lost:
    
        if (r4 >= r12) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0151, code lost:
    
        r16 = r10;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0155, code lost:
    
        r8 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0159, code lost:
    
        if (r4 >= r12) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01dd, code lost:
    
        if (r4 >= r27) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01df, code lost:
    
        r13 = true;
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01e2, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01e6, code lost:
    
        if (r4 >= r27) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x030b  */
    /* JADX WARN: Type inference failed for: r11v5, types: [float, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v13, types: [float, java.lang.StringBuffer] */
    /* JADX WARN: Type inference failed for: r7v17, types: [float, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v19, types: [float, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v20, types: [float, java.lang.StringBuffer] */
    /* JADX WARN: Type inference failed for: r8v13, types: [float, java.lang.String] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m67846k4(int i, int i2, C14787xi c14787xi, float f) {
        int i3;
        C12025x6 c12025x6;
        C12025x6 c12025x62;
        int i4;
        int i5;
        float f2;
        C12025x6 c12025x63;
        C12025x6 c12025x64;
        float f3;
        float f4;
        C12025x6 c12025x65;
        char c;
        boolean z;
        boolean z2;
        float f5;
        float f6;
        char c2;
        float f7;
        int i6 = i;
        if (c14787xi.m73419up() == 4) {
            throw new NotImplementedException("axisRenderContext.AxisType == ChartAxisType.Series");
        }
        C14365qy c14365qyM73423wy = c14787xi.m73423wy();
        if (!(c14787xi.m73384dy().getMajorTickMark() == 2 && c14787xi.m73384dy().getMinorTickMark() == 2) && c14787xi.m73384dy().isVisible()) {
            float rotationX = c14365qyM73423wy.m69834fa().getRotation3D().getRotationX();
            float fM4453k4 = C0841c4.m4453k4(c14787xi.m73400kk().m56639dy());
            float fM4486x1 = C0841c4.m4486x1(c14787xi.m73400kk().m56639dy());
            int i7 = 1;
            boolean z3 = c14787xi.m73375b3() || c14787xi.m73423wy().m69834fa().hasDataTable();
            C12025x6 c12025x66 = new C12025x6(c14365qyM73423wy.m69833e0().m64124x1(), c14365qyM73423wy.m69833e0().m64114kk());
            if (z3) {
                i3 = i2;
            } else {
                i3 = i2 - 1;
                if (i3 == 0) {
                    i3 = 1;
                }
            }
            float f8 = 0.0f;
            if (rotationX < 0.0f && i6 > 0) {
                c12025x66.m56898x1(c12025x66.m56895kk() - i6);
                i6 = 0;
            }
            new C12025x6();
            new C12025x6();
            if (c14787xi.m73384dy().isPlotOrderReversed()) {
                float f9 = i6;
                c12025x6 = new C12025x6(c14365qyM73423wy.m69833e0().m64124x1(), c14365qyM73423wy.m69833e0().m64114kk() - f9);
                c12025x62 = new C12025x6(c14365qyM73423wy.m69833e0().m64124x1(), c14365qyM73423wy.m69833e0().m64114kk() - f9);
            } else {
                float f10 = i6;
                c12025x6 = new C12025x6(c14365qyM73423wy.m69833e0().m64124x1(), c14365qyM73423wy.m69833e0().m64114kk() - f10);
                c12025x62 = new C12025x6(c14365qyM73423wy.m69833e0().m64124x1() + c14365qyM73423wy.m69833e0().m64121to(), c14365qyM73423wy.m69833e0().m64114kk() - f10);
            }
            float f11 = i3;
            float fM56897x1 = (c12025x62.m56897x1() - c12025x6.m56897x1()) / f11;
            float fM56895kk = (c12025x62.m56895kk() - c12025x6.m56895kk()) / f11;
            if (fM56897x1 == 0.0f && fM56895kk == 0.0f) {
                return;
            }
            while (i6 >= 0) {
                int majorTickMark = c14787xi.m73384dy().getMajorTickMark();
                char c3 = 3;
                if (majorTickMark == 0) {
                    i4 = i7;
                    i5 = i4;
                } else if (majorTickMark != i7) {
                    if (majorTickMark != 3) {
                        i4 = 0;
                        i5 = 0;
                    }
                }
                float fM56897x12 = c12025x6.m56897x1();
                float fM56895kk2 = c12025x6.m56895kk();
                while (true) {
                    if ((c12025x6.m56897x1() > fM56897x12 || fM56897x12 > c12025x62.m56897x1()) && (c12025x6.m56897x1() < fM56897x12 || fM56897x12 < c12025x62.m56897x1())) {
                        f2 = f8;
                        c12025x63 = c12025x6;
                        double d = fM56897x12;
                        c12025x64 = c12025x66;
                        if (C14116yg.m67497to(d) != C14116yg.m67497to(c12025x63.m56897x1()) && C14116yg.m67497to(d) != C14116yg.m67497to(c12025x62.m56897x1())) {
                            break;
                        }
                        f3 = fM4453k4;
                        f4 = fM4486x1;
                        c12025x65 = c12025x64;
                        c = 3;
                    } else {
                        f3 = fM4453k4;
                        f4 = fM4486x1;
                        c12025x65 = c12025x66;
                        c12025x63 = c12025x6;
                        c = c3;
                    }
                    if (i4 != 0) {
                        C11896dy c11896dy = new C11896dy();
                        f7 = fM56895kk2;
                        try {
                            c11896dy.m55574x1(fM56897x12, f7 - f3, fM56897x12, f7);
                            c14787xi.m73395k4(c11896dy, 0.0f, f);
                            c11896dy.dispose();
                        } finally {
                        }
                    } else {
                        f7 = fM56895kk2;
                    }
                    if (i5 != 0) {
                        C11896dy c11896dy2 = new C11896dy();
                        try {
                            c11896dy2.m55574x1(fM56897x12, f7, fM56897x12, f7 + f3);
                            f8 = 0.0f;
                            c14787xi.m73395k4(c11896dy2, 0.0f, f);
                            c11896dy2.dispose();
                        } finally {
                        }
                    } else {
                        f8 = 0.0f;
                    }
                    fM56897x12 += c14787xi.m73406lr() * fM56897x1;
                    fM56895kk2 = (c14787xi.m73406lr() * fM56895kk) + f7;
                    c12025x6 = c12025x63;
                    c3 = c;
                    fM4486x1 = f4;
                    c12025x66 = c12025x65;
                    fM4453k4 = f3;
                }
                int minorTickMark = c14787xi.m73384dy().getMinorTickMark();
                if (minorTickMark == 0) {
                    z = true;
                    z2 = true;
                } else if (minorTickMark != 1) {
                    if (minorTickMark != 3) {
                        z = false;
                        z2 = false;
                    }
                }
                c12025x63.m56897x1();
                StringBuffer stringBufferAppend = StringBuffer.append((String) c14787xi.m73406lr());
                c12025x63.m56895kk();
                float fOooO0O0 = stringBufferAppend;
                float fOooO0O02 = StringBuffer.append((String) c14787xi.m73406lr());
                while (true) {
                    if ((c12025x63.m56897x1() > fOooO0O0 || fOooO0O0 > c12025x62.m56897x1()) && (c12025x63.m56897x1() < fOooO0O0 || fOooO0O0 < c12025x62.m56897x1())) {
                        double d2 = fOooO0O0;
                        f5 = fM4453k4;
                        f6 = fM4486x1;
                        if (C14116yg.m67497to(d2) != C14116yg.m67497to(c12025x63.m56897x1()) && C14116yg.m67497to(d2) != C14116yg.m67497to(c12025x62.m56897x1())) {
                            break;
                        }
                    } else {
                        f5 = fM4453k4;
                        f6 = fM4486x1;
                    }
                    C12025x6 c12025x67 = c12025x64;
                    if (z) {
                        C11896dy c11896dy3 = new C11896dy();
                        try {
                            c11896dy3.m55574x1(fOooO0O0, fOooO0O02 - f6, fOooO0O0, fOooO0O02);
                            c14787xi.m73395k4(c11896dy3, f2, f);
                            c11896dy3.dispose();
                        } finally {
                        }
                    }
                    if (z2) {
                        C11896dy c11896dy4 = new C11896dy();
                        try {
                            c11896dy4.m55574x1(fOooO0O0, fOooO0O02, fOooO0O0, fOooO0O02 + f6);
                            c14787xi.m73395k4(c11896dy4, 0.0f, f);
                            c11896dy4.dispose();
                        } finally {
                        }
                    }
                    if (c14787xi.m73384dy().getMajorTickMark() == 2) {
                        ?? Append = StringBuffer.append((String) c14787xi.m73406lr());
                        ?? Append2 = StringBuffer.append((String) c14787xi.m73406lr());
                        if ((c12025x63.m56895kk() > Append2 || Append2 > c12025x62.m56895kk()) && (c12025x63.m56895kk() < Append2 || Append2 < c12025x62.m56895kk())) {
                            double d3 = (double) Append2;
                            if (C14116yg.m67497to(d3) == C14116yg.m67497to(c12025x63.m56895kk()) || C14116yg.m67497to(d3) == C14116yg.m67497to(c12025x62.m56895kk())) {
                                if (z) {
                                    C11896dy c11896dy5 = new C11896dy();
                                    try {
                                        c11896dy5.m55574x1((float) Append, Append2 - f6, (float) Append, (float) Append2);
                                        c14787xi.m73395k4(c11896dy5, 0.0f, f);
                                    } finally {
                                    }
                                }
                                if (z2) {
                                    C11896dy c11896dy6 = new C11896dy();
                                    try {
                                        c11896dy6.m55574x1((float) Append, (float) Append2, (float) Append, Append2 + f6);
                                        c14787xi.m73395k4(c11896dy6, 0.0f, f);
                                    } finally {
                                    }
                                }
                            }
                            float fM73406lr = c14787xi.m73406lr();
                            c2 = Ascii.MIN;
                            fOooO0O0 = C20424OooO0Oo.OooO0O0(fM73406lr, fM56897x1, 2.0f, Append);
                            fOooO0O02 = C20424OooO0Oo.OooO0O0(c14787xi.m73406lr(), fM56895kk, 2.0f, Append2);
                        }
                    } else {
                        c2 = Ascii.MIN;
                    }
                    c12025x64 = c12025x67;
                    fM4453k4 = f5;
                    fM4486x1 = f6;
                    f2 = 0.0f;
                    fOooO0O0 += c14787xi.m73406lr() * fM56897x1;
                    fOooO0O02 += c14787xi.m73406lr() * fM56895kk;
                }
                if (i6 <= 0) {
                    return;
                }
                C12025x6 c12025x68 = c12025x64;
                c12025x68.m56898x1(c12025x64.m56895kk() - i6);
                c12025x6 = c12025x63;
                f8 = f2;
                c12025x66 = c12025x68;
                fM4453k4 = f5;
                fM4486x1 = f6;
                i6 = 0;
                i7 = 1;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m67847k4(C14787xi c14787xi) {
        int i;
        float f;
        int i2;
        boolean z;
        String strM4468k4;
        C12003du c12003duM63876k4;
        IRotation3D rotation3D = this.f47465k4.m69834fa().getRotation3D();
        int rotationY = rotation3D.getRotationY() & 65535;
        float depthPercents = ((rotation3D.getDepthPercents() & 65535) / 100.0f) * this.f47465k4.m69833e0().m64102dy();
        float fOooO0O0 = rotationY <= 180 ? depthPercents + (((65535 & OooOO0O.OooO0O0(this.f47465k4.m69834fa(), 0)) / 100.0f) * depthPercents) : 0.0f;
        if (!rotation3D.getRightAngleAxes()) {
            fOooO0O0 = 0.0f;
        }
        C13743kq c13743kqM69833e0 = this.f47465k4.m69833e0();
        C12007ix c12007ix = new C12007ix(c13743kqM69833e0.m64124x1(), c13743kqM69833e0.m64114kk(), c13743kqM69833e0.m64121to(), c13743kqM69833e0.m64100du());
        C11896dy c11896dy = new C11896dy();
        try {
            c11896dy.m55547k4(new C12025x6(c12007ix.m56557jd(), c12007ix.m56551ck() - c12007ix.m56575x1()).Clone(), new C12025x6(c12007ix.m56557jd(), c12007ix.m56551ck()).Clone());
            c14787xi.m73395k4(c11896dy, 0.0f, fOooO0O0);
            c11896dy.dispose();
            C12025x6 c12025x6 = new C12025x6(c12007ix.m56557jd(), c12007ix.m56551ck());
            String strM5008to = this.f47465k4.m69865up().get_Item(0).m64944dy().get_Item(0).m5008to();
            float fM56897x1 = (c12025x6.m56897x1() - c14787xi.f50094k4) - C0841c4.m4453k4(c14787xi.m73400kk().m56639dy());
            List<Object> list = c14787xi.f50098m9;
            double dM73391k4 = c14787xi.m73384dy().isLogarithmic() ? c14787xi.m73391k4(c14787xi.m73389ix()) : c14787xi.m73389ix();
            double dM73391k42 = c14787xi.m73384dy().isLogarithmic() ? c14787xi.m73391k4(c14787xi.m73410ne()) : c14787xi.m73410ne();
            double dM73391k43 = c14787xi.m73384dy().isLogarithmic() ? c14787xi.m73391k4(c14787xi.m73418um()) : c14787xi.m73418um();
            int i3 = 0;
            while (i3 < c14787xi.f50098m9.size()) {
                Object obj = c14787xi.f50098m9.get_Item(i3);
                Class cls = Double.TYPE;
                double dDoubleValue = ((Double) C7019kk.m27464to(obj, cls)).doubleValue();
                double dM73424x1 = c14787xi.m73384dy().isLogarithmic() ? c14787xi.m73424x1(dDoubleValue) : dDoubleValue;
                int i4 = i3 - 1;
                if (i4 <= 0 ? (i = i3 + 1) >= list.size() || C14116yg.m67475k4(kc0.m63750k4(dDoubleValue, ((Double) C7019kk.m27464to(list.get_Item(i), cls)).doubleValue())) == dM73391k43 : C14116yg.m67475k4(kc0.m63750k4(dDoubleValue, ((Double) C7019kk.m27464to(list.get_Item(i4), cls)).doubleValue())) == dM73391k43) {
                    float fM64100du = (float) (((dDoubleValue - dM73391k42) / (dM73391k4 - dM73391k42)) * ((double) this.f47465k4.m69833e0().m64100du()));
                    float fM56895kk = !c14787xi.m73384dy().isPlotOrderReversed() ? c12025x6.m56895kk() - fM64100du : (c12025x6.m56895kk() - c13743kqM69833e0.m64100du()) + fM64100du;
                    if (c14787xi.m73384dy().getTickLabelPosition() != 3) {
                        if (ChartTypeCharacterizer.m761jd(this.f47465k4.m69834fa().getType() != 73 ? this.f47465k4.m69834fa().getType() : this.f47465k4.m69834fa().getChartData().getSeries().get_Item(0).getType())) {
                            dM73424x1 /= 100.0d;
                            strM5008to = "0%";
                        }
                        if (!c14787xi.m73384dy().isLogarithmic()) {
                            dM73424x1 *= C0841c4.m4452k4(c14787xi);
                        }
                        C12003du c12003duClone = c14787xi.m73413to().Clone();
                        if (c14787xi.m73385fa()) {
                            strM4468k4 = C13729ki.m63880k4((Object) Double.valueOf(dM73424x1), strM5008to, false);
                            c12003duM63876k4 = C13729ki.m63876k4(Double.valueOf(dM73424x1), strM5008to, c12003duClone.Clone());
                        } else {
                            strM4468k4 = C0841c4.m4468k4(Double.valueOf(dM73424x1), c14787xi);
                            c12003duM63876k4 = C13729ki.m63876k4(Double.valueOf(dM73424x1), c14787xi.m73384dy().getNumberFormat(), c12003duClone.Clone());
                        }
                        c12003duM63876k4.CloneTo(c12003duClone);
                        float f2 = fOooO0O0;
                        i2 = i3;
                        z = false;
                        C1236i2.m7388k4(new C12007ix(fM56897x1, fM56895kk - (c14787xi.f50110x1 / 2.0f), c14787xi.f50094k4, c14787xi.f50110x1).Clone(), strM4468k4, c14787xi.m73386h4(), c14787xi.m73425x1(), c12003duClone.Clone(), 1, 2, this.f47465k4, f2);
                        f = f2;
                    } else {
                        int i5 = i3;
                        f = fOooO0O0;
                        i2 = i5;
                        z = false;
                    }
                    m67845k4(c12025x6.m56897x1(), fM56895kk, c14787xi, f);
                } else {
                    int i6 = i3;
                    f = fOooO0O0;
                    i2 = i6;
                    z = false;
                }
                float f3 = f;
                i3 = i2 + 1;
                fOooO0O0 = f3;
            }
            m67844k4(c12025x6.m56897x1(), c12025x6.m56895kk() - c13743kqM69833e0.m64100du(), c12025x6.m56895kk(), c14787xi, fOooO0O0);
        } catch (Throwable th) {
            c11896dy.dispose();
            throw th;
        }
    }
}
