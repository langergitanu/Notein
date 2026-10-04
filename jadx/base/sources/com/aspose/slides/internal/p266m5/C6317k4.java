package com.aspose.slides.internal.p266m5;

import com.aspose.slides.internal.p313oa.C6986dy;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p550zi.C13623yj;
import com.aspose.slides.o000oOoO;

/* JADX INFO: renamed from: com.aspose.slides.internal.m5.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C6317k4 {

    /* JADX INFO: renamed from: k4 */
    private static C6986dy f17965k4;

    /* JADX INFO: renamed from: x1 */
    private static C6986dy f17966x1;

    static {
        C6986dy c6986dy = new C6986dy();
        f17965k4 = c6986dy;
        c6986dy.m27336k4(C13623yj.m62875k4().m14472k4());
        f17965k4.m27336k4(C13623yj.m62876x1().m14472k4());
        C6986dy c6986dy2 = new C6986dy();
        f17966x1 = c6986dy2;
        c6986dy2.m27336k4(C13623yj.m62876x1().m14472k4());
        f17966x1.m27336k4(C13623yj.m62875k4().m14472k4());
    }

    /* JADX INFO: renamed from: k4 */
    private static int m25863k4(int i) {
        return Math.min(255, Math.max(0, i));
    }

    /* JADX INFO: renamed from: k4 */
    private static C12003du m25864k4(int i, int i2, int i3, int i4) {
        return C12003du.m56398k4(m25863k4(i), m25863k4(i2), m25863k4(i3), m25863k4(i4));
    }

    /* JADX INFO: renamed from: k4 */
    public static C12003du m25865k4(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, double d, double d2) {
        double d3 = ((double) i) * d;
        double d4 = ((double) i5) * d2;
        int i9 = (int) (d3 + d4);
        double d5 = i9;
        double d6 = d3 / d5;
        double d7 = d4 / d5;
        return m25864k4(i9, (int) o000oOoO.OooO00o(d7, i6, d6 * ((double) i2), 0.5d), (int) o000oOoO.OooO00o(d7, i7, d6 * ((double) i3), 0.5d), (int) o000oOoO.OooO00o(d7, i8, d6 * ((double) i4), 0.5d));
    }

    /* JADX INFO: renamed from: k4 */
    public static C12003du m25866k4(C12003du c12003du, C12003du c12003du2, double d, double d2) {
        return m25865k4(c12003du.m56501c5() & 255, c12003du.m56507jd() & 255, c12003du.m56502ck() & 255, c12003du.m56505fa() & 255, c12003du2.m56501c5() & 255, c12003du2.m56507jd() & 255, c12003du2.m56502ck() & 255, c12003du2.m56505fa() & 255, d, d2);
    }
}
