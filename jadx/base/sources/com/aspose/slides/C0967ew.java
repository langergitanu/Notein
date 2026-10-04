package com.aspose.slides;

import OooO0o.C20424OooO0Oo;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.ew */
/* JADX INFO: loaded from: classes3.dex */
class C0967ew {

    /* JADX INFO: renamed from: k4 */
    private C14365qy f4885k4;

    public C0967ew(C14365qy c14365qy) {
        this.f4885k4 = c14365qy;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x016e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0158  */
    /* JADX INFO: renamed from: kk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m5740kk(C14787xi c14787xi) {
        C12025x6 c12025x6;
        boolean z;
        C11896dy c11896dy;
        boolean z2;
        boolean z3;
        float fM56897x1;
        double d;
        boolean z4;
        if (!c14787xi.m73384dy().isVisible()) {
            return;
        }
        C14365qy c14365qyM73423wy = c14787xi.m73423wy();
        IRotation3D rotation3D = c14365qyM73423wy.m69834fa().getRotation3D();
        float depthPercents = ((rotation3D.getDepthPercents() & 65535) / 100.0f) * c14365qyM73423wy.m69833e0().m64102dy();
        float fOooO00o = OooOOOO.OooO00o(OooOO0O.OooO0O0(c14365qyM73423wy.m69834fa(), 0) & 65535, 100.0f, depthPercents, depthPercents);
        if (!c14365qyM73423wy.m69834fa().getRotation3D().getRightAngleAxes()) {
            fOooO00o = 0.0f;
        }
        C12025x6 c12025x62 = new C12025x6(c14365qyM73423wy.m69833e0().m64124x1(), c14365qyM73423wy.m69833e0().m64114kk());
        C12025x6 c12025x63 = new C12025x6(c14365qyM73423wy.m69833e0().m64124x1() + c14365qyM73423wy.m69833e0().m64121to(), c14365qyM73423wy.m69833e0().m64114kk());
        C12025x6 c12025x64 = new C12025x6();
        C12025x6 c12025x65 = new C12025x6();
        if (c14787xi.m73384dy().isPlotOrderReversed()) {
            c12025x63.CloneTo(c12025x64);
            c12025x62.CloneTo(c12025x65);
        } else {
            c12025x62.CloneTo(c12025x64);
            c12025x63.CloneTo(c12025x65);
        }
        float fM56897x12 = (float) (((double) (c12025x65.m56897x1() - c12025x64.m56897x1())) / (c14787xi.m73389ix() - c14787xi.m73410ne()));
        if (c14787xi.m73384dy().getMajorTickMark() != 2) {
            int majorTickMark = c14787xi.m73384dy().getMajorTickMark();
            if (majorTickMark != 0) {
                if (majorTickMark == 1) {
                    z3 = false;
                    z2 = true;
                } else if (majorTickMark != 3) {
                    z2 = false;
                } else {
                    z2 = false;
                    z3 = true;
                }
                fM56897x1 = c12025x64.m56897x1();
                float fM56895kk = c12025x64.m56895kk();
                float fM4453k4 = C0841c4.m4453k4(c14787xi.m73400kk().m56639dy());
                while (true) {
                    if ((c12025x64.m56897x1() <= fM56897x1 || fM56897x1 > c12025x65.m56897x1()) && (c12025x64.m56897x1() < fM56897x1 || fM56897x1 < c12025x65.m56897x1())) {
                        c12025x6 = c12025x65;
                        d = fM56897x1;
                        z4 = z3;
                        if (C14116yg.m67497to(d) != C14116yg.m67497to(c12025x64.m56897x1()) && C14116yg.m67497to(d) != C14116yg.m67497to(c12025x6.m56897x1())) {
                            break;
                        }
                    } else {
                        c12025x6 = c12025x65;
                        z4 = z3;
                    }
                    if (z2) {
                        c11896dy = new C11896dy();
                        try {
                            c11896dy.m55574x1(fM56897x1, fM56895kk - fM4453k4, fM56897x1, fM56895kk);
                            c14787xi.m73395k4(c11896dy, 0.0f, fOooO00o);
                            c11896dy.dispose();
                        } finally {
                        }
                    }
                    if (!z4) {
                        c11896dy = new C11896dy();
                        try {
                            c11896dy.m55574x1(fM56897x1, fM56895kk, fM56897x1, fM56895kk + fM4453k4);
                            c14787xi.m73395k4(c11896dy, 0.0f, fOooO00o);
                        } finally {
                        }
                    }
                    fM56897x1 += ((float) c14787xi.m73418um()) * fM56897x12;
                    c12025x65 = c12025x6;
                    z3 = z4;
                }
            } else {
                z2 = true;
            }
            z3 = z2;
            fM56897x1 = c12025x64.m56897x1();
            float fM56895kk2 = c12025x64.m56895kk();
            float fM4453k42 = C0841c4.m4453k4(c14787xi.m73400kk().m56639dy());
            while (true) {
                if (c12025x64.m56897x1() <= fM56897x1) {
                    c12025x6 = c12025x65;
                    d = fM56897x1;
                    z4 = z3;
                    if (C14116yg.m67497to(d) != C14116yg.m67497to(c12025x64.m56897x1())) {
                        break;
                        break;
                    }
                } else {
                    c12025x6 = c12025x65;
                    d = fM56897x1;
                    z4 = z3;
                    if (C14116yg.m67497to(d) != C14116yg.m67497to(c12025x64.m56897x1())) {
                    }
                }
                if (z2) {
                }
                if (!z4) {
                }
                fM56897x1 += ((float) c14787xi.m73418um()) * fM56897x12;
                c12025x65 = c12025x6;
                z3 = z4;
            }
        } else {
            c12025x6 = c12025x65;
        }
        if (c14787xi.m73384dy().getMinorTickMark() == 2) {
            return;
        }
        int minorTickMark = c14787xi.m73384dy().getMinorTickMark();
        boolean z5 = true;
        if (minorTickMark == 0) {
            z = true;
        } else if (minorTickMark == 1) {
            z = false;
        } else if (minorTickMark != 3) {
            z5 = false;
            z = false;
        } else {
            z = true;
            z5 = false;
        }
        float fM56897x13 = c12025x64.m56897x1();
        float fM56895kk3 = c12025x64.m56895kk();
        float fM4486x1 = C0841c4.m4486x1(c14787xi.m73400kk().m56639dy());
        while (true) {
            if ((c12025x64.m56897x1() > fM56897x13 || fM56897x13 > c12025x6.m56897x1()) && (c12025x64.m56897x1() < fM56897x13 || fM56897x13 < c12025x6.m56897x1())) {
                double d2 = fM56897x13;
                if (C14116yg.m67497to(d2) != C14116yg.m67497to(c12025x64.m56897x1()) && C14116yg.m67497to(d2) != C14116yg.m67497to(c12025x6.m56897x1())) {
                    return;
                }
            }
            if (z5) {
                c11896dy = new C11896dy();
                try {
                    c11896dy.m55574x1(fM56897x13, fM56895kk3 - fM4486x1, fM56897x13, fM56895kk3);
                    c14787xi.m73395k4(c11896dy, 0.0f, fOooO00o);
                    c11896dy.dispose();
                } finally {
                }
            }
            if (z) {
                c11896dy = new C11896dy();
                try {
                    c11896dy.m55574x1(fM56897x13, fM56895kk3, fM56897x13, fM56895kk3 + fM4486x1);
                    c14787xi.m73395k4(c11896dy, 0.0f, fOooO00o);
                } finally {
                }
            }
            fM56897x13 += ((float) c14787xi.m73374ar()) * fM56897x12;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m5741k4(C14787xi c14787xi) {
        float f;
        float f2;
        int i;
        float f3;
        float f4;
        String strM63880k4;
        C12003du c12003duM63876k4;
        C11896dy c11896dy;
        if (c14787xi.m73384dy().getCategoryAxisType() == 1) {
            throw new NotImplementedException("CategoryAxisType.Date is not implemented");
        }
        int iM69819to = C14365qy.m69819to(this.f4885k4.m69865up());
        IRotation3D rotation3D = this.f4885k4.m69834fa().getRotation3D();
        float rotationX = rotation3D.getRotationX();
        float rotationY = rotation3D.getRotationY() & 65535;
        float depthPercents = ((rotation3D.getDepthPercents() & 65535) / 100.0f) * this.f4885k4.m69833e0().m64102dy();
        float fOooO0O0 = rotationY <= 180.0f ? depthPercents + (((65535 & OooOO0O.OooO0O0(this.f4885k4.m69834fa(), 0)) / 100.0f) * depthPercents) : 0.0f;
        if (!this.f4885k4.m69834fa().getRotation3D().getRightAngleAxes()) {
            fOooO0O0 = 0.0f;
        }
        double dM73430x6 = this.f4885k4.m69863u4().m73430x6();
        double dM73389ix = this.f4885k4.m69863u4().m73389ix();
        double dM73410ne = this.f4885k4.m69863u4().m73410ne();
        double d = this.f4885k4.m69863u4().m73384dy().isPlotOrderReversed() ? dM73389ix - dM73430x6 : dM73430x6 - dM73410ne;
        float fM64124x1 = this.f4885k4.m69833e0().m64124x1();
        float fM64114kk = this.f4885k4.m69833e0().m64114kk();
        float fM64100du = this.f4885k4.m69833e0().m64100du();
        int iOooO00o = com.aspose.slides.Collections.Generic.OooO00o.OooO00o(d / (dM73389ix - dM73410ne), this.f4885k4.m69833e0().m64121to(), 14);
        if (iOooO00o != 0) {
            c11896dy = new C11896dy();
            float f5 = iOooO00o + fM64124x1;
            try {
                c11896dy.m55574x1(f5, fM64114kk, f5, fM64114kk - fM64100du);
                c14787xi.m73395k4(c11896dy, 0.0f, fOooO0O0);
            } finally {
            }
        }
        if (rotationX >= 0.0f) {
            c11896dy = new C11896dy();
            try {
                c11896dy.m55574x1(fM64124x1, fM64114kk, fM64124x1, fM64114kk - fM64100du);
                c14787xi.m73395k4(c11896dy, 0.0f, fOooO0O0);
            } finally {
            }
        }
        if (c14787xi.m73384dy().getTickLabelPosition() == 2) {
            fM64124x1 += iOooO00o;
        }
        float fM73390jd = c14787xi.m73390jd();
        if (c14787xi.m73384dy().getTickLabelPosition() != 3) {
            float fM56639dy = c14787xi.m73400kk().m56639dy();
            fM73390jd += C0841c4.m4453k4(fM56639dy) + C0841c4.m4486x1(fM56639dy);
        }
        float f6 = (fM64124x1 - c14787xi.f50102to) - fM73390jd;
        float f7 = fM64100du / iM69819to;
        List<C1210hn> listM69871x1 = this.f4885k4.m69871x1();
        boolean z = c14787xi.m73385fa() && listM69871x1.size() > 0;
        int i2 = 0;
        while (i2 < iM69819to) {
            float f8 = f6;
            double d2 = ((double) (i2 * f7)) + ((double) (f7 / 2.0f));
            float f9 = ((float) (c14787xi.m73384dy().isPlotOrderReversed() ? ((double) (fM64114kk - fM64100du)) + d2 : ((double) fM64114kk) - d2)) - (c14787xi.f50095kk / 2.0f);
            if (c14787xi.m73384dy().getTickLabelPosition() == 3 || i2 % c14787xi.m73376bv() != 0 || i2 >= c14787xi.f50098m9.size()) {
                f = fM64100du;
                f2 = fOooO0O0;
                i = i2;
                f3 = fM64114kk;
                f4 = f8;
            } else {
                C12003du c12003duClone = c14787xi.m73413to().Clone();
                if (z) {
                    f = fM64100du;
                    String strM7228h4 = i2 < listM69871x1.size() ? listM69871x1.get_Item(i2).m7228h4() : C14113y2.f47374k4;
                    strM63880k4 = C13729ki.m63880k4(c14787xi.f50098m9.get_Item(i2), strM7228h4, i2 < listM69871x1.size() && listM69871x1.get_Item(i2).m7227du());
                    c12003duM63876k4 = C13729ki.m63876k4(c14787xi.f50098m9.get_Item(i2), strM7228h4, c12003duClone.Clone());
                } else {
                    strM63880k4 = C0841c4.m4468k4(c14787xi.f50098m9.get_Item(i2), c14787xi);
                    f = fM64100du;
                    c12003duM63876k4 = C13729ki.m63876k4(c14787xi.f50098m9.get_Item(i2), c14787xi.m73384dy().getNumberFormat(), c12003duClone.Clone());
                }
                c12003duM63876k4.CloneTo(c12003duClone);
                f2 = fOooO0O0;
                f4 = f8;
                f3 = fM64114kk;
                i = i2;
                C1236i2.m7388k4(C12007ix.m56544k4(C12014ne.m56661x1(new C12007ix(f4, f9, c14787xi.f50102to, c14787xi.f50095kk).Clone())).Clone(), strM63880k4, c14787xi.m73386h4(), c14787xi.m73425x1(), c12003duClone.Clone(), 2, 2, this.f4885k4, f2);
            }
            i2 = i + 1;
            fM64114kk = f3;
            f6 = f4;
            fOooO0O0 = f2;
            fM64100du = f;
        }
        m5739k4(c14787xi, iOooO00o, iM69819to);
        List<C1210hn>[] listArrM69861to = this.f4885k4.m69861to();
        if (listArrM69861to != null && listArrM69861to.length > 0 && listM69871x1.size() > 0 && c14787xi.m73384dy().getTickLabelPosition() != 3) {
            throw new NotImplementedException("Not implemented parent labels rendering of 3-D Bar Chart");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0268  */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5742x1(C14787xi c14787xi) {
        C11896dy c11896dy;
        int i;
        float f;
        String strM4468k4;
        List<Object> list;
        int i2;
        C14365qy c14365qyM73423wy = c14787xi.m73423wy();
        if (c14365qyM73423wy.m69834fa().getRotation3D().getRotationX() < 0) {
            return;
        }
        float depthPercents = ((r1.getDepthPercents() & 65535) / 100.0f) * c14365qyM73423wy.m69833e0().m64102dy();
        float fOooO00o = OooOOOO.OooO00o(OooOO0O.OooO0O0(c14365qyM73423wy.m69834fa(), 0) & 65535, 100.0f, depthPercents, depthPercents);
        if (!c14365qyM73423wy.m69834fa().getRotation3D().getRightAngleAxes()) {
            fOooO00o = 0.0f;
        }
        boolean zIsPlotOrderReversed = c14787xi.m73423wy().m69854ne().m73384dy().isPlotOrderReversed();
        int position = c14787xi.m73384dy().getPosition();
        int i3 = 3;
        float f2 = (c14365qyM73423wy.m69834fa().getRotation3D().getRightAngleAxes() && (position == 3 || (position == 0 && zIsPlotOrderReversed))) ? 0.0f : fOooO00o;
        int type = c14365qyM73423wy.m69834fa().getType() != 73 ? c14365qyM73423wy.m69834fa().getType() : c14365qyM73423wy.m69834fa().getChartData().getSeries().get_Item(0).getType();
        C12025x6 c12025x6 = new C12025x6(c14365qyM73423wy.m69833e0().m64124x1(), c14365qyM73423wy.m69833e0().m64114kk());
        C12025x6 c12025x62 = new C12025x6(c14365qyM73423wy.m69833e0().m64124x1() + c14365qyM73423wy.m69833e0().m64121to(), c14365qyM73423wy.m69833e0().m64114kk());
        if (c14787xi.m73423wy().m69854ne().m73384dy().isPlotOrderReversed() || c14787xi.m73423wy().m69854ne().m73384dy().getCrossType() == 1) {
            c11896dy = new C11896dy();
            try {
                c11896dy.m55574x1(c12025x6.m56897x1(), c12025x6.m56895kk() - c14365qyM73423wy.m69833e0().m64100du(), c12025x62.m56897x1(), c12025x6.m56895kk() - c14365qyM73423wy.m69833e0().m64100du());
                c14787xi.m73395k4(c11896dy, 0.0f, f2);
            } finally {
            }
        } else {
            c11896dy = new C11896dy();
            try {
                c11896dy.m55574x1(c12025x6.m56897x1(), c12025x6.m56895kk(), c12025x62.m56897x1(), c12025x6.m56895kk());
                c14787xi.m73395k4(c11896dy, 0.0f, f2);
            } finally {
            }
        }
        String strM5008to = c14787xi.m73423wy().m69865up().get_Item(0).m64944dy().get_Item(0).m5008to();
        float fM56895kk = (c14787xi.m73423wy().m69854ne().m73384dy().isPlotOrderReversed() || c14787xi.m73423wy().m69854ne().m73384dy().getCrossType() == 1) ? ((c12025x6.m56895kk() - c14365qyM73423wy.m69833e0().m64100du()) - C0841c4.m4453k4(c14787xi.m73400kk().m56639dy())) - c14787xi.m73380du().m56862kk() : c12025x6.m56895kk() + C0841c4.m4453k4(c14787xi.m73400kk().m56639dy());
        List<Object> list2 = c14787xi.f50098m9;
        double dM73391k4 = c14787xi.m73384dy().isLogarithmic() ? c14787xi.m73391k4(c14787xi.m73389ix()) : c14787xi.m73389ix();
        double dM73391k42 = c14787xi.m73384dy().isLogarithmic() ? c14787xi.m73391k4(c14787xi.m73410ne()) : c14787xi.m73410ne();
        double dM73391k43 = c14787xi.m73384dy().isLogarithmic() ? c14787xi.m73391k4(c14787xi.m73418um()) : c14787xi.m73418um();
        int i4 = 0;
        while (i4 < c14787xi.f50098m9.size()) {
            Object obj = c14787xi.f50098m9.get_Item(i4);
            Class cls = Double.TYPE;
            double dDoubleValue = ((Double) C7019kk.m27464to(obj, cls)).doubleValue();
            double dM73424x1 = c14787xi.m73384dy().isLogarithmic() ? c14787xi.m73424x1(dDoubleValue) : dDoubleValue;
            int i5 = i4 - 1;
            if (i5 <= 0 ? (i = i4 + 1) >= list2.size() || C14116yg.m67475k4(kc0.m63750k4(dDoubleValue, ((Double) C7019kk.m27464to(list2.get_Item(i), cls)).doubleValue())) == dM73391k43 : C14116yg.m67475k4(kc0.m63750k4(dDoubleValue, ((Double) C7019kk.m27464to(list2.get_Item(i5), cls)).doubleValue())) == dM73391k43) {
                float fM64121to = (float) (((dDoubleValue - dM73391k42) / (dM73391k4 - dM73391k42)) * ((double) c14365qyM73423wy.m69833e0().m64121to()));
                float fM56897x1 = !c14787xi.m73384dy().isPlotOrderReversed() ? c12025x6.m56897x1() + fM64121to : c12025x62.m56897x1() - fM64121to;
                if (c14787xi.m73384dy().getTickLabelPosition() != i3) {
                    float f3 = c14787xi.f50094k4;
                    if (ChartTypeCharacterizer.m761jd(type)) {
                        dM73424x1 /= 100.0d;
                        f3 *= 2.0f;
                        strM5008to = "0%";
                    } else if (!c14787xi.m73384dy().isLogarithmic()) {
                        dM73424x1 *= C0841c4.m4452k4(c14787xi);
                    }
                    String str = strM5008to;
                    C12003du c12003duClone = c14787xi.m73413to().Clone();
                    if (c14787xi.m73385fa()) {
                        strM4468k4 = C13729ki.m63880k4((Object) Double.valueOf(dM73424x1), str, false);
                        f = 2.0f;
                        C13729ki.m63876k4(Double.valueOf(dM73424x1), str, c12003duClone.Clone()).CloneTo(c12003duClone);
                        list = list2;
                    } else {
                        f = 2.0f;
                        strM4468k4 = C0841c4.m4468k4(Double.valueOf(dM73424x1), c14787xi);
                        list = list2;
                        C13729ki.m63876k4(Double.valueOf(dM73424x1), c14787xi.m73384dy().getNumberFormat(), c12003duClone.Clone()).CloneTo(c12003duClone);
                    }
                    i2 = i4;
                    C1236i2.m7388k4(C12007ix.m56544k4(C12014ne.m56661x1(new C12007ix(fM56897x1 - (f3 / f), fM56895kk, f3, c14787xi.f50110x1).Clone())).Clone(), strM4468k4, c14787xi.m73386h4(), c14787xi.m73425x1(), c12003duClone.Clone(), 1, 1, c14365qyM73423wy, f2);
                    strM5008to = str;
                } else {
                    list = list2;
                    i2 = i4;
                }
            }
            i4 = i2 + 1;
            list2 = list;
            i3 = 3;
        }
        m5740kk(c14787xi);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02f3 A[PHI: r16
      0x02f3: PHI (r16v9 com.aspose.slides.internal.wh.x6) = (r16v7 com.aspose.slides.internal.wh.x6), (r16v10 com.aspose.slides.internal.wh.x6) binds: [B:123:0x02f0, B:133:0x030e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02f5 A[PHI: r16
      0x02f5: PHI (r16v10 com.aspose.slides.internal.wh.x6) = 
      (r16v7 com.aspose.slides.internal.wh.x6)
      (r16v7 com.aspose.slides.internal.wh.x6)
      (r16v11 com.aspose.slides.internal.wh.x6)
     binds: [B:121:0x02dd, B:123:0x02f0, B:115:0x02b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0339 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0212 A[LOOP:0: B:14:0x0085->B:81:0x0212, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0268 A[PHI: r7
      0x0268: PHI (r7v13 int) = (r7v10 int), (r7v10 int), (r7v14 int) binds: [B:93:0x0255, B:95:0x0266, B:87:0x0232] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x026a  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m5739k4(C14787xi c14787xi, int i, int i2) {
        boolean z;
        boolean z2;
        int minorTickMark;
        boolean z3;
        C12025x6 c12025x6;
        C12025x6 c12025x62;
        float fM56895kk;
        float fM73406lr;
        boolean z4;
        double d;
        C13743kq c13743kq;
        boolean z5;
        C11896dy c11896dy;
        double d2;
        int i3;
        float fOooO0O0;
        double d3;
        C12025x6 c12025x63;
        C14365qy c14365qyM73423wy = c14787xi.m73423wy();
        C13743kq c13743kqM69833e0 = c14365qyM73423wy.m69833e0();
        float rotationY = c14365qyM73423wy.m69834fa().getRotation3D().getRotationY() & 65535;
        float depthPercents = ((r3.getDepthPercents() & 65535) / 100.0f) * c14365qyM73423wy.m69833e0().m64102dy();
        boolean z6 = false;
        float fOooO0O02 = rotationY <= 180.0f ? depthPercents + (((65535 & OooOO0O.OooO0O0(c14365qyM73423wy.m69834fa(), 0)) / 100.0f) * depthPercents) : 0.0f;
        if (!(c14787xi.m73384dy().getMajorTickMark() == 2 && c14787xi.m73384dy().getMinorTickMark() == 2) && c14787xi.m73384dy().isVisible()) {
            C12025x6 c12025x64 = new C12025x6(c14365qyM73423wy.m69833e0().m64124x1(), c14365qyM73423wy.m69833e0().m64114kk());
            new C12025x6();
            new C12025x6();
            int i4 = i;
            while (i4 >= 0) {
                int majorTickMark = c14787xi.m73384dy().getMajorTickMark();
                boolean z7 = true;
                if (majorTickMark != 0) {
                    if (majorTickMark == 1) {
                        z2 = z6;
                        z = true;
                    } else if (majorTickMark != 3) {
                        z = z6;
                    } else {
                        z = z6;
                        z2 = true;
                    }
                    minorTickMark = c14787xi.m73384dy().getMinorTickMark();
                    if (minorTickMark != 0) {
                        z3 = true;
                    } else if (minorTickMark == 1) {
                        z3 = z6;
                    } else if (minorTickMark != 3) {
                        z3 = z6;
                        z7 = z3;
                    } else {
                        z3 = true;
                        z7 = z6;
                    }
                    if (c14787xi.m73384dy().isPlotOrderReversed()) {
                        c12025x6 = new C12025x6(c12025x64.m56897x1(), c12025x64.m56895kk());
                        c12025x62 = new C12025x6(c12025x64.m56897x1(), c12025x64.m56895kk() - c13743kqM69833e0.m64100du());
                    } else {
                        c12025x6 = new C12025x6(c12025x64.m56897x1(), c12025x64.m56895kk() - c13743kqM69833e0.m64100du());
                        c12025x62 = new C12025x6(c12025x64.m56897x1(), c12025x64.m56895kk());
                    }
                    fM56895kk = (c12025x62.m56895kk() - c12025x6.m56895kk()) / i2;
                    float fM56897x1 = c12025x6.m56897x1();
                    float fM56895kk2 = c12025x6.m56895kk();
                    float fM4453k4 = C0841c4.m4453k4(c14787xi.m73400kk().m56639dy());
                    fM73406lr = fM56895kk2;
                    while (true) {
                        if ((c12025x6.m56895kk() <= fM73406lr || fM73406lr > c12025x62.m56895kk()) && (c12025x6.m56895kk() < fM73406lr || fM73406lr < c12025x62.m56895kk())) {
                            z4 = z3;
                            d = fM73406lr;
                            c13743kq = c13743kqM69833e0;
                            z5 = z;
                            if (C14116yg.m67497to(d) != C14116yg.m67497to(c12025x6.m56895kk()) && C14116yg.m67497to(d) != C14116yg.m67497to(c12025x62.m56895kk())) {
                                break;
                            }
                        } else {
                            c13743kq = c13743kqM69833e0;
                            z5 = z;
                            z4 = z3;
                        }
                        if ((c12025x6.m56895kk() <= fM73406lr || fM73406lr > c12025x62.m56895kk()) && (c12025x6.m56895kk() < fM73406lr || fM73406lr < c12025x62.m56895kk())) {
                            d2 = fM73406lr;
                            i3 = i4;
                            if (C14116yg.m67497to(d2) == C14116yg.m67497to(c12025x6.m56895kk()) || C14116yg.m67497to(d2) == C14116yg.m67497to(c12025x62.m56895kk())) {
                            }
                            fOooO0O0 = C20424OooO0Oo.OooO0O0(c14787xi.m73406lr(), fM56895kk, 2.0f, fM73406lr);
                            if ((c12025x6.m56895kk() > fOooO0O0 || fOooO0O0 > c12025x62.m56895kk()) && (c12025x6.m56895kk() < fOooO0O0 || fOooO0O0 < c12025x62.m56895kk())) {
                                d3 = fOooO0O0;
                                c12025x63 = c12025x64;
                                if (C14116yg.m67497to(d3) == C14116yg.m67497to(c12025x6.m56895kk()) || C14116yg.m67497to(d3) == C14116yg.m67497to(c12025x62.m56895kk())) {
                                }
                                fM73406lr += c14787xi.m73406lr() * fM56895kk;
                                i4 = i3;
                                c12025x64 = c12025x63;
                                c13743kqM69833e0 = c13743kq;
                                z = z5;
                                z3 = z4;
                            } else {
                                c12025x63 = c12025x64;
                            }
                            if (z7) {
                                c11896dy = new C11896dy();
                                try {
                                    c11896dy.m55574x1(fM56897x1, fOooO0O0, fM56897x1 + fM4453k4, fOooO0O0);
                                    c14787xi.m73395k4(c11896dy, 0.0f, fOooO0O02);
                                    c11896dy.dispose();
                                } finally {
                                }
                            }
                            if (z4) {
                                c11896dy = new C11896dy();
                                try {
                                    c11896dy.m55574x1(fM56897x1 - fM4453k4, fOooO0O0, fM56897x1, fOooO0O0);
                                    c14787xi.m73395k4(c11896dy, 0.0f, fOooO0O02);
                                    c11896dy.dispose();
                                } finally {
                                }
                            }
                            fM73406lr += c14787xi.m73406lr() * fM56895kk;
                            i4 = i3;
                            c12025x64 = c12025x63;
                            c13743kqM69833e0 = c13743kq;
                            z = z5;
                            z3 = z4;
                        } else {
                            i3 = i4;
                        }
                        if (z5) {
                            c11896dy = new C11896dy();
                            try {
                                c11896dy.m55574x1(fM56897x1, fM73406lr, fM56897x1 + fM4453k4, fM73406lr);
                                c14787xi.m73395k4(c11896dy, 0.0f, fOooO0O02);
                                c11896dy.dispose();
                            } finally {
                            }
                        }
                        if (z2) {
                            c11896dy = new C11896dy();
                            try {
                                c11896dy.m55574x1(fM56897x1 - fM4453k4, fM73406lr, fM56897x1, fM73406lr);
                                c14787xi.m73395k4(c11896dy, 0.0f, fOooO0O02);
                                c11896dy.dispose();
                            } finally {
                            }
                        }
                        fOooO0O0 = C20424OooO0Oo.OooO0O0(c14787xi.m73406lr(), fM56895kk, 2.0f, fM73406lr);
                        if (c12025x6.m56895kk() > fOooO0O0) {
                            d3 = fOooO0O0;
                            c12025x63 = c12025x64;
                            if (C14116yg.m67497to(d3) == C14116yg.m67497to(c12025x6.m56895kk())) {
                                if (z7) {
                                }
                                if (z4) {
                                }
                            } else {
                                if (z7) {
                                }
                                if (z4) {
                                }
                            }
                        } else {
                            d3 = fOooO0O0;
                            c12025x63 = c12025x64;
                            if (C14116yg.m67497to(d3) == C14116yg.m67497to(c12025x6.m56895kk())) {
                            }
                        }
                        fM73406lr += c14787xi.m73406lr() * fM56895kk;
                        i4 = i3;
                        c12025x64 = c12025x63;
                        c13743kqM69833e0 = c13743kq;
                        z = z5;
                        z3 = z4;
                    }
                    if (c14787xi.m73406lr() * fM56895kk > c12025x62.m56895kk() - c12025x6.m56895kk()) {
                        float fOooO0O03 = C20424OooO0Oo.OooO0O0(c14787xi.m73406lr(), fM56895kk, 2.0f, fM73406lr);
                        if ((c12025x6.m56895kk() > fOooO0O03 || fOooO0O03 > c12025x62.m56895kk()) && (c12025x6.m56895kk() < fOooO0O03 || fOooO0O03 < c12025x62.m56895kk())) {
                            double d4 = fOooO0O03;
                            if (C14116yg.m67497to(d4) == C14116yg.m67497to(c12025x6.m56895kk()) || C14116yg.m67497to(d4) == C14116yg.m67497to(c12025x62.m56895kk())) {
                                if (z7) {
                                    c11896dy = new C11896dy();
                                    try {
                                        c11896dy.m55574x1(fM56897x1, fOooO0O03, fM56897x1 + fM4453k4, fOooO0O03);
                                        c14787xi.m73395k4(c11896dy, 0.0f, fOooO0O02);
                                    } finally {
                                    }
                                }
                                if (z4) {
                                    c11896dy = new C11896dy();
                                    try {
                                        c11896dy.m55574x1(fM56897x1 - fM4453k4, fOooO0O03, fM56897x1, fOooO0O03);
                                        c14787xi.m73395k4(c11896dy, 0.0f, fOooO0O02);
                                    } finally {
                                    }
                                }
                            }
                        }
                    }
                    if (i4 > 0) {
                        return;
                    }
                    c12025x64.m56891k4(c12025x64.m56897x1() + i4);
                    c13743kqM69833e0 = c13743kq;
                    i4 = 0;
                    z6 = false;
                } else {
                    z = true;
                }
                z2 = z;
                minorTickMark = c14787xi.m73384dy().getMinorTickMark();
                if (minorTickMark != 0) {
                }
                if (c14787xi.m73384dy().isPlotOrderReversed()) {
                }
                fM56895kk = (c12025x62.m56895kk() - c12025x6.m56895kk()) / i2;
                float fM56897x12 = c12025x6.m56897x1();
                float fM56895kk22 = c12025x6.m56895kk();
                float fM4453k42 = C0841c4.m4453k4(c14787xi.m73400kk().m56639dy());
                fM73406lr = fM56895kk22;
                while (true) {
                    if (c12025x6.m56895kk() <= fM73406lr) {
                        z4 = z3;
                        d = fM73406lr;
                        c13743kq = c13743kqM69833e0;
                        z5 = z;
                        if (C14116yg.m67497to(d) != C14116yg.m67497to(c12025x6.m56895kk())) {
                            break;
                            break;
                        }
                    } else {
                        z4 = z3;
                        d = fM73406lr;
                        c13743kq = c13743kqM69833e0;
                        z5 = z;
                        if (C14116yg.m67497to(d) != C14116yg.m67497to(c12025x6.m56895kk())) {
                        }
                    }
                    if (c12025x6.m56895kk() <= fM73406lr) {
                        d2 = fM73406lr;
                        i3 = i4;
                        if (C14116yg.m67497to(d2) == C14116yg.m67497to(c12025x6.m56895kk())) {
                            if (z5) {
                            }
                            if (z2) {
                            }
                        } else {
                            if (z5) {
                            }
                            if (z2) {
                            }
                        }
                    } else {
                        d2 = fM73406lr;
                        i3 = i4;
                        if (C14116yg.m67497to(d2) == C14116yg.m67497to(c12025x6.m56895kk())) {
                        }
                    }
                    fOooO0O0 = C20424OooO0Oo.OooO0O0(c14787xi.m73406lr(), fM56895kk, 2.0f, fM73406lr);
                    if (c12025x6.m56895kk() > fOooO0O0) {
                    }
                    fM73406lr += c14787xi.m73406lr() * fM56895kk;
                    i4 = i3;
                    c12025x64 = c12025x63;
                    c13743kqM69833e0 = c13743kq;
                    z = z5;
                    z3 = z4;
                }
                if (c14787xi.m73406lr() * fM56895kk > c12025x62.m56895kk() - c12025x6.m56895kk()) {
                }
                if (i4 > 0) {
                }
            }
        }
    }
}
