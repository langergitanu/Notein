package com.aspose.slides.internal.p144g6;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p138fu.C4123dy;
import com.aspose.slides.internal.p138fu.C4127k4;
import com.aspose.slides.internal.p138fu.C4128kk;
import com.aspose.slides.internal.p138fu.C4130m9;
import com.aspose.slides.internal.p151gj.C4314c5;
import com.aspose.slides.internal.p151gj.C4316du;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p151gj.C4318fa;
import com.aspose.slides.internal.p151gj.C4319h4;
import com.aspose.slides.internal.p151gj.C4324m9;
import com.aspose.slides.internal.p151gj.C4327up;
import com.aspose.slides.internal.p151gj.C4328x1;
import com.aspose.slides.internal.p223ka.C5656k4;
import com.aspose.slides.internal.p302nm.C6921dy;
import com.aspose.slides.internal.p302nm.C6922h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p420th.AbstractC10973uz;
import com.aspose.slides.internal.p420th.C10965m9;
import com.aspose.slides.internal.p472w8.C11906rv;
import com.aspose.slides.internal.p472w8.C11909up;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p504xm.C12549du;
import com.aspose.slides.internal.p504xm.C12553to;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.g6.x1 */
/* JADX INFO: loaded from: classes.dex */
public class C4223x1 {
    /* JADX INFO: renamed from: k4 */
    private static double m17000k4(C12025x6 c12025x6, C12025x6 c12025x62) {
        double dM56897x1 = c12025x6.m56897x1() - c12025x62.m56897x1();
        double dM56895kk = c12025x6.m56895kk() - c12025x62.m56895kk();
        return C14116yg.m67496rv((dM56895kk * dM56895kk) + (dM56897x1 * dM56897x1));
    }

    /* JADX INFO: renamed from: k4 */
    private static C4327up m17001k4(C4314c5 c4314c5) {
        C12007ix c12007ixClone = new C10965m9().m53022k4((AbstractC10973uz) c4314c5.m17301h4()).Clone();
        C4127k4 c4127k4 = new C4127k4(C7019kk.m27462to(Float.valueOf(c12007ixClone.m56550c5()), 13), C7019kk.m27462to(Float.valueOf(c12007ixClone.m56575x1()), 13));
        try {
            C11906rv c11906rv = (C11906rv) C4128kk.m16560k4((C4328x1) c4314c5);
            try {
                C4317dy c4317dyM16494k4 = C4123dy.m16494k4(c11906rv.m55685fa());
                c11906rv.m55697kk(new C11913yj());
                C4130m9 c4130m9 = new C4130m9(c4127k4);
                try {
                    c4130m9.m16573x1().mo17526k4((AbstractC12024x1) c11906rv, 0, 0, c4127k4.m16549x1(), c4127k4.m16546kk());
                    c4130m9.dispose();
                    C3152yj c3152yj = new C3152yj();
                    try {
                        c4127k4.m16541k4(c3152yj, 5);
                        byte[] array = c3152yj.toArray();
                        c3152yj.dispose();
                        C4327up c4327up = new C4327up(array);
                        c4327up.m17387k4(c4317dyM16494k4);
                        c11906rv.dispose();
                        c4127k4.dispose();
                        return c4327up;
                    } catch (Throwable th) {
                        c3152yj.dispose();
                        throw th;
                    }
                } catch (Throwable th2) {
                    c4130m9.dispose();
                    throw th2;
                }
            } finally {
            }
        } catch (Throwable th3) {
            c4127k4.dispose();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static C4327up m17002k4(C4324m9 c4324m9) {
        float fM56550c5;
        C12007ix c12007ixClone = c4324m9.m17391du().Clone();
        new C12007ix();
        C4317dy c4317dyM17385fa = c4324m9.m17385fa();
        C12007ix c12007ix = new C12007ix((float) C14116yg.m67490kk(c12007ixClone.m56557jd()), (float) C14116yg.m67490kk(c12007ixClone.m56551ck()), (float) C14116yg.m67501x1(c12007ixClone.m56550c5()), (float) C14116yg.m67501x1(c12007ixClone.m56575x1()));
        C11909up c11909up = (C11909up) C4128kk.m16560k4((C4328x1) c4324m9);
        try {
            C12025x6[] c12025x6Arr = {new C12025x6(c12007ix.m56571to(), c12007ix.m56554dy()), new C12025x6(c12007ix.m56556h4(), c12007ix.m56554dy())};
            double dM17000k4 = m17000k4(c12025x6Arr[0].Clone(), c12025x6Arr[1].Clone());
            c11909up.m55719ck().m55775k4(c12025x6Arr);
            double dM17000k42 = m17000k4(c12025x6Arr[0].Clone(), c12025x6Arr[1].Clone());
            if (dM17000k4 < dM17000k42) {
                c12007ix = new C12007ix((float) C14116yg.m67490kk(c12007ixClone.m56557jd()), (float) C14116yg.m67490kk(c12007ixClone.m56551ck()), (float) C14116yg.m67501x1(dM17000k42), (float) C14116yg.m67501x1(c12007ixClone.m56575x1()));
                fM56550c5 = c12007ixClone.m56550c5() / c12007ix.m56550c5();
            } else {
                fM56550c5 = 1.0f;
            }
            c11909up.dispose();
            c4324m9.m17397k4(c12007ix.Clone());
            C4127k4 c4127k4 = new C4127k4(C7019kk.m27462to(Float.valueOf(c12007ix.m56550c5()), 13), C7019kk.m27462to(Float.valueOf(c12007ix.m56575x1()), 13));
            try {
                C4130m9 c4130m9 = new C4130m9(c4127k4);
                try {
                    c11909up = (C11909up) C4128kk.m16560k4((C4328x1) c4324m9);
                    try {
                        C3152yj c3152yj = new C3152yj();
                        try {
                            C4317dy c4317dyM16494k4 = C4123dy.m16494k4(c11909up.m55719ck());
                            c11909up.m55730kk(new C11913yj());
                            c4130m9.m16573x1().mo17526k4((AbstractC12024x1) c11909up, 0, 0, c4127k4.m16549x1(), c4127k4.m16546kk());
                            c4127k4.m16541k4(c3152yj, 5);
                            C4327up c4327up = new C4327up(c3152yj.toArray());
                            c4317dyM16494k4.m17349x1(c12007ix.m56557jd(), c12007ix.m56551ck(), 1);
                            c4317dyM16494k4.m17336k4(1.0f / fM56550c5, 1.0f, 1);
                            c4317dyM16494k4.m17349x1(-c12007ixClone.m56557jd(), -c12007ixClone.m56551ck(), 1);
                            c4327up.m17387k4(c4317dyM16494k4);
                            c4324m9.m17387k4(c4317dyM17385fa);
                            c4324m9.m17397k4(c12007ixClone.Clone());
                            c11909up.dispose();
                            return c4327up;
                        } finally {
                            c3152yj.dispose();
                        }
                    } finally {
                    }
                } finally {
                    c4130m9.dispose();
                }
            } finally {
                c4127k4.dispose();
            }
        } finally {
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m17003k4(C4213ix c4213ix, AbstractC4221to abstractC4221to, C4316du c4316du) throws Throwable {
        m17007k4(c4213ix, abstractC4221to, C6922h4.m27133k4(c4316du), null, C12007ix.f40519k4.Clone(), 0, null);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m17004k4(C4213ix c4213ix, AbstractC4221to abstractC4221to, C4324m9 c4324m9) {
        float fM56556h4;
        float fM56554dy;
        if (!C14044b3.m66440x1(c4324m9.m17389c5(), 0.0d)) {
            m17005k4(c4213ix, abstractC4221to, m17002k4(c4324m9));
            return;
        }
        c4213ix.m13593x1("LinearGradientBrush");
        c4213ix.m13590kk("MappingMode", "Absolute");
        if (c4324m9.m17394jd().m56894k4() || c4324m9.m17390ck().m56894k4()) {
            c4213ix.m16935k4("StartPoint", c4324m9.m17391du().m56557jd(), c4324m9.m17391du().m56551ck());
            fM56556h4 = c4324m9.m17391du().m56556h4();
            fM56554dy = c4324m9.m17391du().m56554dy();
        } else {
            c4213ix.m16935k4("StartPoint", c4324m9.m17394jd().m56897x1(), c4324m9.m17394jd().m56895kk());
            fM56556h4 = c4324m9.m17390ck().m56897x1();
            fM56554dy = c4324m9.m17390ck().m56895kk();
        }
        c4213ix.m16935k4("EndPoint", fM56556h4, fM56554dy);
        c4213ix.m13590kk("SpreadMethod", c4324m9.m17388up() == 1 ? "Reflect" : "Repeat");
        if (c4324m9.m17385fa() != null) {
            c4213ix.m16936k4("Transform", c4324m9.m17385fa());
        }
        c4213ix.m13593x1("LinearGradientBrush.GradientStops");
        if (c4324m9.m17409x1() == null) {
            m17009k4(c4213ix, c4324m9.m17393h4(), 0.0f);
            m17009k4(c4213ix, c4324m9.m17399m9(), 1.0f);
        } else {
            for (C4319h4 c4319h4 : c4324m9.m17409x1()) {
                m17009k4(c4213ix, c4319h4.m17353k4(), c4319h4.m17355x1());
            }
        }
        c4213ix.m13588kk();
        c4213ix.m13588kk();
    }

    /* JADX INFO: renamed from: k4 */
    private static void m17005k4(C4213ix c4213ix, AbstractC4221to abstractC4221to, C4327up c4327up) {
        C4127k4 c4127k4 = new C4127k4(c4327up);
        try {
            byte[] bArrM16888k4 = C4208ck.m16888k4(c4127k4);
            C12553to c12553toM58492ix = C12549du.m58492ix(bArrM16888k4);
            m17007k4(c4213ix, abstractC4221to, bArrM16888k4, null, new C12007ix(0.0f, 0.0f, c12553toM58492ix.m58544k4(), c12553toM58492ix.m58547x1()).Clone(), c4327up.m17388up(), c4327up.m17385fa().m17345kk());
        } finally {
            c4127k4.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m17006k4(C4213ix c4213ix, AbstractC4221to abstractC4221to, C4328x1 c4328x1) throws Throwable {
        int iM17417k4 = c4328x1.m17417k4();
        if (iM17417k4 == 0) {
            m17008k4(c4213ix, (C4318fa) c4328x1);
            return;
        }
        if (iM17417k4 == 1) {
            m17003k4(c4213ix, abstractC4221to, (C4316du) c4328x1);
            return;
        }
        if (iM17417k4 == 2) {
            m17005k4(c4213ix, abstractC4221to, (C4327up) c4328x1);
        } else if (iM17417k4 == 3) {
            m17004k4(c4213ix, abstractC4221to, (C4324m9) c4328x1);
        } else {
            if (iM17417k4 != 4) {
                throw new NotSupportedException("Unsupported brush type.");
            }
            m17005k4(c4213ix, abstractC4221to, m17001k4((C4314c5) c4328x1));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m17007k4(C4213ix c4213ix, AbstractC4221to abstractC4221to, byte[] bArr, C6921dy c6921dy, C12007ix c12007ix, int i, C4317dy c4317dy) throws Throwable {
        C4214jd c4214jdMo16956k4 = abstractC4221to.mo16956k4(bArr, c6921dy);
        c4213ix.m13593x1("ImageBrush");
        c4213ix.m13590kk("ImageSource", c4214jdMo16956k4.m16939k4());
        C12553to c12553toM16941x1 = c4214jdMo16956k4.m16941x1();
        c4213ix.m16938k4("Viewbox", new C12007ix(0.0f, 0.0f, (float) C4209du.m16893k4(c12553toM16941x1.m58542du()), (float) C4209du.m16893k4(c12553toM16941x1.m58543h4())).Clone());
        if (!C6921dy.m27126k4(c6921dy)) {
            c6921dy.m27131x1(c12007ix.Clone()).CloneTo(c12007ix);
        }
        c4213ix.m16938k4("Viewport", new C12007ix(c12007ix.m56557jd(), c12007ix.m56551ck(), c12007ix.m56550c5() > 0.0f ? c12007ix.m56550c5() : (float) c12553toM16941x1.m58542du(), c12007ix.m56575x1() > 0.0f ? c12007ix.m56575x1() : (float) c12553toM16941x1.m58543h4()).Clone());
        c4213ix.m13590kk("ViewboxUnits", "Absolute");
        c4213ix.m13590kk("ViewportUnits", "Absolute");
        if (c4317dy != null) {
            c4213ix.m16936k4("Transform", c4317dy);
        }
        c4213ix.m13590kk("TileMode", C4209du.m16896to(i));
        c4213ix.m13588kk();
    }

    /* JADX INFO: renamed from: k4 */
    private static void m17008k4(C4213ix c4213ix, C4318fa c4318fa) {
        c4213ix.m13593x1("SolidColorBrush");
        c4213ix.m16937k4("Color", c4318fa.m17352x1());
        c4213ix.m13588kk();
    }

    /* JADX INFO: renamed from: k4 */
    private static void m17009k4(C4213ix c4213ix, C5656k4 c5656k4, float f) {
        c4213ix.m13593x1("GradientStop");
        c4213ix.m16937k4("Color", c5656k4);
        c4213ix.m16934k4("Offset", f);
        c4213ix.m13588kk();
    }
}
