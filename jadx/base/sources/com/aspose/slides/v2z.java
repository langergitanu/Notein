package com.aspose.slides;

import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes3.dex */
final class v2z {

    /* JADX INFO: renamed from: du */
    private float f49461du;

    /* JADX INFO: renamed from: k4 */
    private int f49462k4;

    /* JADX INFO: renamed from: kk */
    private float f49463kk;

    /* JADX INFO: renamed from: to */
    private float f49464to;

    /* JADX INFO: renamed from: x1 */
    private C11913yj f49465x1;

    private v2z(int i, C11913yj c11913yj, float f, float f2, float f3) {
        this.f49462k4 = i;
        this.f49465x1 = c11913yj;
        this.f49463kk = f;
        this.f49464to = f2;
        this.f49461du = f3;
    }

    /* JADX INFO: renamed from: k4 */
    public static v2z m72062k4() {
        return new v2z(0, null, 0.0f, 0.0f, 0.0f);
    }

    /* JADX INFO: renamed from: kk */
    public final String m72068kk() {
        if (m72069to()) {
            return null;
        }
        int i = this.f49462k4;
        if (i == 1) {
            return this.f49465x1.m55776k4()[5] != 0.0f ? C14113y2.m67402k4("translate({0}, {1})", C13850af.m65102k4(this.f49465x1.m55776k4()[4]), C13850af.m65102k4(this.f49465x1.m55776k4()[5])) : C14113y2.m67402k4("translate({0})", C13850af.m65102k4(this.f49465x1.m55776k4()[4]));
        }
        if (i == 2) {
            return this.f49465x1.m55776k4()[3] != this.f49465x1.m55776k4()[0] ? C14113y2.m67402k4("scale({0}, {1})", C13850af.m65102k4(this.f49465x1.m55776k4()[0]), C13850af.m65102k4(this.f49465x1.m55776k4()[3])) : C14113y2.m67402k4("scale({0})", C13850af.m65102k4(this.f49465x1.m55776k4()[0]));
        }
        if (i == 3) {
            return this.f49461du == 0.0f ? this.f49464to == 0.0f ? C14113y2.m67402k4("rotate({0})", C13850af.m65102k4(this.f49463kk)) : C14113y2.m67402k4("rotate({0}, {1})", C13850af.m65102k4(this.f49463kk), C13850af.m65102k4(this.f49464to)) : C14113y2.m67402k4("rotate({0}, {1}, {2})", C13850af.m65102k4(this.f49463kk), C13850af.m65102k4(this.f49464to), C13850af.m65102k4(this.f49461du));
        }
        if (i != 4) {
            return null;
        }
        return C14113y2.m67402k4("matrix({0}, {1}, {2}, {3}, {4}, {5})", C13850af.m65102k4(this.f49465x1.m55776k4()[0]), C13850af.m65102k4(this.f49465x1.m55776k4()[1]), C13850af.m65102k4(this.f49465x1.m55776k4()[2]), C13850af.m65102k4(this.f49465x1.m55776k4()[3]), C13850af.m65102k4(this.f49465x1.m55776k4()[4]), C13850af.m65102k4(this.f49465x1.m55776k4()[5]));
    }

    /* JADX INFO: renamed from: to */
    public final boolean m72069to() {
        return this.f49462k4 == 0 || this.f49465x1.m55789x1();
    }

    /* JADX INFO: renamed from: x1 */
    public final String m72070x1() {
        if (m72069to()) {
            return C14113y2.f47374k4;
        }
        int i = this.f49462k4;
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? C14113y2.f47374k4 : C14113y2.m67402k4("tm{0}_{1}_{2}_{3}_{4}_{5})", C13850af.m65102k4(this.f49465x1.m55776k4()[0]), C13850af.m65102k4(this.f49465x1.m55776k4()[1]), C13850af.m65102k4(this.f49465x1.m55776k4()[2]), C13850af.m65102k4(this.f49465x1.m55776k4()[3]), C13850af.m65102k4(this.f49465x1.m55776k4()[4]), C13850af.m65102k4(this.f49465x1.m55776k4()[5])) : C14113y2.m67402k4("tr{0}_{1}_{2}e", C13850af.m65102k4(this.f49463kk), C13850af.m65102k4(this.f49464to), C13850af.m65102k4(this.f49461du)) : C14113y2.m67402k4("ts{0}_{1}e", C13850af.m65102k4(this.f49465x1.m55776k4()[0]), C13850af.m65102k4(this.f49465x1.m55776k4()[3])) : C14113y2.m67402k4("tt{0}_{1}e", C13850af.m65102k4(this.f49465x1.m55776k4()[4]), C13850af.m65102k4(this.f49465x1.m55776k4()[5]));
    }

    public v2z(C11913yj c11913yj, int i) {
        m72066k4(c11913yj);
        this.f49462k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public static v2z m72063k4(float f, float f2, float f3) {
        float f4 = f % 360.0f;
        if (f4 < 0.0f) {
            f4 += 360.0f;
        }
        float f5 = f4;
        if (f5 == 0.0f) {
            return m72062k4();
        }
        C11913yj c11913yj = new C11913yj();
        c11913yj.m55766k4(f5, new C12025x6(f2, f3));
        return new v2z(3, c11913yj, f5, f2, f3);
    }

    /* JADX INFO: renamed from: x1 */
    public static String m72067x1(v2z v2zVar) {
        if (v2zVar == null) {
            return null;
        }
        return v2zVar.m72068kk();
    }

    /* JADX INFO: renamed from: k4 */
    public static String m72064k4(v2z v2zVar) {
        return v2zVar == null ? C14113y2.f47374k4 : v2zVar.m72070x1();
    }

    /* JADX INFO: renamed from: k4 */
    public static String m72065k4(v2z v2zVar, String str) {
        return v2zVar == null ? C14113y2.f47374k4 : C14113y2.m67402k4(str, v2zVar.m72070x1());
    }

    /* JADX INFO: renamed from: k4 */
    private void m72066k4(C11913yj c11913yj) {
        this.f49465x1 = c11913yj;
        this.f49462k4 = (c11913yj == null || c11913yj.m55789x1()) ? 0 : 4;
    }
}
