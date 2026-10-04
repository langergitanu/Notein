package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.wh */
/* JADX INFO: loaded from: classes3.dex */
class C14738wh {

    /* JADX INFO: renamed from: k4 */
    private final C14365qy f49795k4;

    public C14738wh(C14365qy c14365qy) {
        this.f49795k4 = c14365qy;
    }

    /* JADX INFO: renamed from: kk */
    private void m72747kk(C14365qy c14365qy, C14787xi c14787xi) {
        C11896dy c11896dy;
        if (c14787xi.m73419up() != 4) {
            return;
        }
        float fM73432yj = (float) c14787xi.m73432yj();
        float fM73405ks = (float) c14787xi.m73405ks();
        float fM73391k4 = (float) (c14787xi.m73384dy().isLogarithmic() ? c14787xi.m73391k4(c14787xi.m73418um()) : c14787xi.m73418um());
        float fM73391k42 = (float) (c14787xi.m73384dy().isLogarithmic() ? c14787xi.m73391k4(c14787xi.m73374ar()) : c14787xi.m73374ar());
        if ((!c14787xi.m73384dy().getShowMajorGridLines() || fM73391k4 <= 0.0f) && (!c14787xi.m73384dy().getShowMinorGridLines() || fM73391k42 <= 0.0f)) {
            return;
        }
        if (C14164n2.m67859x1(c14365qy.m69834fa())) {
            fM73432yj -= C14116yg.m67481k4(fM73391k4, fM73391k42);
        }
        IRotation3D rotation3D = c14365qy.m69834fa().getRotation3D();
        float rotationY = rotation3D.getRotationY() & 65535;
        float depthPercents = ((rotation3D.getDepthPercents() & 65535) / 100.0f) * c14365qy.m69833e0().m64102dy();
        float fOooO00o = OooOOOO.OooO00o(65535 & OooOO0O.OooO0O0(c14365qy.m69834fa(), 0), 100.0f, depthPercents, depthPercents);
        float f = -fOooO00o;
        if (!rotation3D.getRightAngleAxes()) {
            fOooO00o = f;
        }
        float f2 = fM73432yj - fM73405ks;
        float fM64124x1 = c14365qy.m69833e0().m64124x1();
        float fM64114kk = c14365qy.m69833e0().m64114kk() - c14365qy.m69833e0().m64100du();
        float fM64124x12 = c14365qy.m69833e0().m64124x1() + c14365qy.m69833e0().m64121to();
        float fM64114kk2 = c14365qy.m69833e0().m64114kk();
        if (c14787xi.m73384dy().getShowMinorGridLines() && fM73391k42 > 0.0f) {
            float f3 = fM73405ks;
            while (f3 <= fM73432yj) {
                float f4 = rotationY;
                float f5 = ((float) (((double) (f3 - fM73405ks)) * ((double) fOooO00o))) / f2;
                c11896dy = new C11896dy();
                if (f4 < 180.0f) {
                    try {
                        c11896dy.m55574x1(fM64124x1, fM64114kk, fM64124x1, fM64114kk2);
                    } finally {
                    }
                } else {
                    c11896dy.m55574x1(fM64124x12, fM64114kk, fM64124x12, fM64114kk2);
                }
                c14787xi.m73403kk(c11896dy, 0.0f, f5);
                c11896dy.dispose();
                c11896dy = new C11896dy();
                try {
                    c11896dy.m55574x1(fM64124x1, fM64114kk2, fM64124x12, fM64114kk2);
                    c14787xi.m73403kk(c11896dy, 0.0f, f5);
                    c11896dy.dispose();
                    f3 += fM73391k42;
                    rotationY = f4;
                } finally {
                }
            }
        }
        float f6 = rotationY;
        if (!c14787xi.m73384dy().getShowMajorGridLines() || fM73391k4 <= 0.0f) {
            return;
        }
        for (float f7 = fM73405ks; f7 <= fM73432yj; f7 += fM73391k4) {
            float f8 = ((f7 - fM73405ks) * fOooO00o) / f2;
            c11896dy = new C11896dy();
            if (f6 < 180.0f) {
                try {
                    c11896dy.m55574x1(fM64124x1, fM64114kk, fM64124x1, fM64114kk2);
                } finally {
                }
            } else {
                c11896dy.m55574x1(fM64124x12, fM64114kk, fM64124x12, fM64114kk2);
            }
            c14787xi.m73428x1(c11896dy, 0.0f, f8);
            c11896dy.dispose();
            c11896dy = new C11896dy();
            try {
                c11896dy.m55574x1(fM64124x1, fM64114kk2, fM64124x12, fM64114kk2);
                c14787xi.m73428x1(c11896dy, 0.0f, f8);
                c11896dy.dispose();
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m72748x1(C14365qy c14365qy, C14787xi c14787xi) {
        double d;
        double dM4455k4;
        float f;
        double d2;
        int i;
        C11896dy c11896dy;
        double dM4487x1;
        int i2;
        double d3;
        double dM4455k42;
        double d4;
        float width;
        double dM73432yj = c14787xi.m73432yj();
        double dM73405ks = c14787xi.m73405ks();
        double dM73391k4 = c14787xi.m73384dy().isLogarithmic() ? c14787xi.m73391k4(c14787xi.m73418um()) : c14787xi.m73418um();
        double dM73391k42 = (float) (c14787xi.m73384dy().isLogarithmic() ? c14787xi.m73391k4(c14787xi.m73374ar()) : c14787xi.m73374ar());
        if ((!c14787xi.m73384dy().getShowMajorGridLines() || dM73391k4 <= 0.0d) && (!c14787xi.m73384dy().getShowMinorGridLines() || dM73391k42 <= 0.0d)) {
            return;
        }
        float depthPercents = ((c14365qy.m69834fa().getRotation3D().getDepthPercents() & 65535) / 100.0f) * c14365qy.m69833e0().m64102dy();
        float fOooO00o = OooOOOO.OooO00o(OooOO0O.OooO0O0(c14365qy.m69834fa(), 0) & 65535, 100.0f, depthPercents, depthPercents);
        float f2 = !c14365qy.m69834fa().getRotation3D().getRightAngleAxes() ? -fOooO00o : 0.0f;
        int baseUnitScale = c14787xi.m73384dy().getBaseUnitScale();
        if (c14787xi.m73419up() == 0 && c14787xi.m73384dy().getCategoryAxisType() == 1) {
            d = dM73432yj;
            dM4455k4 = ((double) C0841c4.m4455k4(baseUnitScale, C7019kk.m27462to(Double.valueOf(dM73432yj), 14), C7019kk.m27462to(Double.valueOf(dM73405ks), 14), C7019kk.m27462to(Double.valueOf(d), 14), false)) + 1.0d;
        } else {
            d = dM73432yj;
            dM4455k4 = d - dM73405ks;
        }
        float fM64124x1 = c14365qy.m69833e0().m64124x1();
        float fM64114kk = c14365qy.m69833e0().m64114kk();
        float fM64121to = c14365qy.m69833e0().m64121to() / ((float) dM4455k4);
        float fM64100du = c14365qy.m69833e0().m64100du();
        if (!c14787xi.m73384dy().getShowMajorGridLines() || dM73391k4 <= 0.0d) {
            f = fM64100du;
            d2 = dM73405ks;
        } else {
            if (c14787xi.m73419up() == 0 && c14787xi.m73384dy().getCategoryAxisType() == 1) {
                f = fM64100du;
                d2 = dM73405ks;
                dM4487x1 = C0841c4.m4487x1(c14787xi.m73384dy().getBaseUnitScale(), c14787xi.m73417u4(), C7019kk.m27462to(Double.valueOf(dM73391k4), 14), C7019kk.m27462to(Double.valueOf(d2), 14), false);
            } else {
                f = fM64100du;
                d2 = dM73405ks;
                dM4487x1 = d2;
            }
            while (true) {
                if (dM4487x1 <= d) {
                    i2 = 1;
                } else {
                    if (c14787xi.m73419up() != 0) {
                        break;
                    }
                    i2 = 1;
                    if (c14787xi.m73384dy().getCategoryAxisType() != 1 || dM4487x1 > d) {
                        break;
                    }
                }
                if (c14787xi.m73419up() == 0 && c14787xi.m73384dy().getCategoryAxisType() == i2) {
                    d3 = dM4487x1;
                    dM4455k42 = C0841c4.m4455k4(baseUnitScale, C7019kk.m27462to(Double.valueOf(dM4487x1), 14), C7019kk.m27462to(Double.valueOf(d2), 14), C7019kk.m27462to(Double.valueOf(d), 14), false);
                } else {
                    d3 = dM4487x1;
                    dM4455k42 = d3 - d2;
                }
                float f3 = (float) ((((double) fM64121to) * dM4455k42) + ((double) fM64124x1));
                float f4 = fM64114kk - f;
                c11896dy = new C11896dy();
                try {
                    c11896dy.m55574x1(f3, fM64114kk, f3, f4);
                    c14787xi.m73428x1(c11896dy, 0.0f, f2);
                    c11896dy.dispose();
                    c11896dy = new C11896dy();
                    try {
                        if (c14787xi.m73384dy().getMajorGridLinesFormat().getLine() == null || C14044b3.m66437kk(c14787xi.m73384dy().getMajorGridLinesFormat().getLine().getWidth())) {
                            d4 = dM73391k4;
                            width = 0.01f;
                        } else {
                            d4 = dM73391k4;
                            width = (float) c14787xi.m73384dy().getMajorGridLinesFormat().getLine().getWidth();
                        }
                        c11896dy.m55574x1(f3, fM64114kk, width + f3, fM64114kk);
                        c14787xi.m73428x1(c11896dy, -fOooO00o, f2);
                        c11896dy.dispose();
                        dM4487x1 = (c14787xi.m73419up() == 0 && c14787xi.m73384dy().getCategoryAxisType() == 1) ? C0841c4.m4487x1(c14787xi.m73384dy().getBaseUnitScale(), c14787xi.m73417u4(), C7019kk.m27462to(Double.valueOf(d4), 14), C7019kk.m27462to(Double.valueOf(d3), 14), false) : d3 + d4;
                        dM73391k4 = d4;
                    } finally {
                    }
                } finally {
                }
            }
        }
        if (!c14787xi.m73384dy().getShowMinorGridLines() || dM73391k42 <= 0.0d) {
            return;
        }
        double dM4487x12 = (c14787xi.m73419up() == 0 && c14787xi.m73384dy().getCategoryAxisType() == 1) ? C0841c4.m4487x1(c14787xi.m73384dy().getBaseUnitScale(), c14787xi.m73420uz(), C7019kk.m27462to(Double.valueOf(dM73391k42), 14), C7019kk.m27462to(Double.valueOf(d2), 14), false) : d2 + dM73391k42;
        while (true) {
            if (dM4487x12 <= d) {
                i = 1;
            } else {
                if (c14787xi.m73419up() != 0) {
                    return;
                }
                i = 1;
                if (c14787xi.m73384dy().getCategoryAxisType() != 1 || dM4487x12 > d) {
                    return;
                }
            }
            double d5 = dM4487x12;
            float fM4455k4 = (float) ((((double) fM64121to) * ((c14787xi.m73419up() == 0 && c14787xi.m73384dy().getCategoryAxisType() == i) ? C0841c4.m4455k4(baseUnitScale, C7019kk.m27462to(Double.valueOf(dM4487x12), 14), C7019kk.m27462to(Double.valueOf(d2), 14), C7019kk.m27462to(Double.valueOf(d), 14), false) : dM4487x12 - d2)) + ((double) fM64124x1));
            float f5 = fM64114kk - f;
            c11896dy = new C11896dy();
            try {
                c11896dy.m55574x1(fM4455k4, fM64114kk, fM4455k4, f5);
                c14787xi.m73403kk(c11896dy, 0.0f, f2);
                c11896dy.dispose();
                c11896dy = new C11896dy();
                try {
                    c11896dy.m55574x1(fM4455k4, fM64114kk, (c14787xi.m73384dy().getMinorGridLinesFormat().getLine() != null ? (float) c14787xi.m73384dy().getMinorGridLinesFormat().getLine().getWidth() : 0.01f) + fM4455k4, fM64114kk);
                    c14787xi.m73403kk(c11896dy, -fOooO00o, f2);
                    c11896dy.dispose();
                    dM4487x12 = (c14787xi.m73419up() == 0 && c14787xi.m73384dy().getCategoryAxisType() == 1) ? C0841c4.m4487x1(c14787xi.m73384dy().getBaseUnitScale(), c14787xi.m73420uz(), C7019kk.m27462to(Double.valueOf(dM73391k42), 14), C7019kk.m27462to(Double.valueOf(d5), 14), false) : d5 + dM73391k42;
                } finally {
                }
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m72749k4() {
        if (C14164n2.m67853k4(this.f49795k4.m69834fa().getType())) {
            return;
        }
        boolean zIsChartTypeBar = ChartTypeCharacterizer.isChartTypeBar(this.f49795k4.m69834fa().getType());
        if (this.f49795k4.m69863u4().m73384dy() != null) {
            C14365qy c14365qy = this.f49795k4;
            C14787xi c14787xiM69863u4 = c14365qy.m69863u4();
            if (zIsChartTypeBar) {
                m72748x1(c14365qy, c14787xiM69863u4);
            } else {
                m72746k4(c14365qy, c14787xiM69863u4);
            }
        }
        if (this.f49795k4.m69854ne().m73384dy() != null) {
            if (zIsChartTypeBar) {
                C14365qy c14365qy2 = this.f49795k4;
                m72746k4(c14365qy2, c14365qy2.m69854ne());
            } else {
                C14365qy c14365qy3 = this.f49795k4;
                m72748x1(c14365qy3, c14365qy3.m69854ne());
            }
        }
        if (this.f49795k4.m69868wl().m73384dy() != null) {
            C14365qy c14365qy4 = this.f49795k4;
            m72747kk(c14365qy4, c14365qy4.m69868wl());
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m72746k4(C14365qy c14365qy, C14787xi c14787xi) {
        C11896dy c11896dy;
        float fM73432yj = (float) c14787xi.m73432yj();
        float fM73405ks = (float) c14787xi.m73405ks();
        float fM73391k4 = (float) (c14787xi.m73384dy().isLogarithmic() ? c14787xi.m73391k4(c14787xi.m73418um()) : c14787xi.m73418um());
        float fM73391k42 = (float) (c14787xi.m73384dy().isLogarithmic() ? c14787xi.m73391k4(c14787xi.m73374ar()) : c14787xi.m73374ar());
        if ((!c14787xi.m73384dy().getShowMajorGridLines() || fM73391k4 <= 0.0f) && (!c14787xi.m73384dy().getShowMinorGridLines() || fM73391k42 <= 0.0f)) {
            return;
        }
        int rotationY = c14365qy.m69834fa().getRotation3D().getRotationY() & 65535;
        float depthPercents = ((r5.getDepthPercents() & 65535) / 100.0f) * c14365qy.m69833e0().m64102dy();
        float fOooO00o = OooOOOO.OooO00o(65535 & OooOO0O.OooO0O0(c14365qy.m69834fa(), 0), 100.0f, depthPercents, depthPercents);
        float f = !c14365qy.m69834fa().getRotation3D().getRightAngleAxes() ? -fOooO00o : 0.0f;
        float fM64124x1 = c14365qy.m69833e0().m64124x1();
        float fM64114kk = c14365qy.m69833e0().m64114kk();
        float fM64121to = c14365qy.m69833e0().m64121to();
        float fM64100du = c14365qy.m69833e0().m64100du() / (fM73432yj - fM73405ks);
        if (c14787xi.m73384dy().getShowMajorGridLines() && fM73391k4 > 0.0f) {
            float f2 = fM73405ks;
            while (f2 <= fM73432yj) {
                float f3 = fM64124x1 + fM64121to;
                float f4 = fM64114kk - ((f2 - fM73405ks) * fM64100du);
                c11896dy = new C11896dy();
                try {
                    c11896dy.m55574x1(fM64124x1, f4, f3, f4);
                    float f5 = fM73432yj;
                    c14787xi.m73428x1(c11896dy, 0.0f, f);
                    c11896dy.dispose();
                    if (rotationY < 180) {
                        f3 = fM64124x1;
                    }
                    c11896dy = new C11896dy();
                    float f6 = f4 - 0.5f;
                    try {
                        c11896dy.m55574x1(f3, f6, 0.5f + f3, f6);
                        c14787xi.m73428x1(c11896dy, -fOooO00o, f);
                        c11896dy.dispose();
                        f2 += fM73391k4;
                        fM73432yj = f5;
                    } finally {
                    }
                } finally {
                }
            }
        }
        float f7 = fM73432yj;
        if (!c14787xi.m73384dy().getShowMinorGridLines() || fM73391k42 <= 0.0f) {
            return;
        }
        for (float f8 = fM73405ks; f8 <= f7; f8 += fM73391k42) {
            float f9 = fM64114kk - ((f8 - fM73405ks) * fM64100du);
            float f10 = fM64124x1 + fM64121to;
            c11896dy = new C11896dy();
            try {
                c11896dy.m55574x1(fM64124x1, f9, f10, f9);
                c14787xi.m73403kk(c11896dy, 0.0f, f);
                c11896dy.dispose();
                if (rotationY < 180) {
                    f10 = fM64124x1;
                }
                c11896dy = new C11896dy();
                try {
                    c11896dy.m55574x1(f10, f9 + 0.01f, f10, f9);
                    c14787xi.m73403kk(c11896dy, -fOooO00o, f);
                    c11896dy.dispose();
                } finally {
                }
            } finally {
            }
        }
    }
}
