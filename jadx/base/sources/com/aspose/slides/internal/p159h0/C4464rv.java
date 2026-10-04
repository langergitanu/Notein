package com.aspose.slides.internal.p159h0;

import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.h0.rv */
/* JADX INFO: loaded from: classes.dex */
final class C4464rv {
    /* JADX INFO: renamed from: k4 */
    public static int m18311k4(C4463ri c4463ri, C4463ri c4463ri2, C4463ri c4463ri3, C4463ri c4463ri4, C4463ri[] c4463riArr) {
        double dM18310x1 = ((c4463ri4.m18310x1() - c4463ri3.m18310x1()) * (c4463ri.m18303k4() - c4463ri2.m18303k4())) - ((c4463ri4.m18303k4() - c4463ri3.m18303k4()) * (c4463ri.m18310x1() - c4463ri2.m18310x1()));
        double dM18310x12 = ((c4463ri4.m18310x1() - c4463ri3.m18310x1()) * (c4463ri.m18303k4() - c4463ri3.m18303k4())) - ((c4463ri4.m18303k4() - c4463ri3.m18303k4()) * (c4463ri.m18310x1() - c4463ri3.m18310x1()));
        double dM18310x13 = ((c4463ri.m18310x1() - c4463ri3.m18310x1()) * (c4463ri.m18303k4() - c4463ri2.m18303k4())) - ((c4463ri.m18303k4() - c4463ri3.m18303k4()) * (c4463ri.m18310x1() - c4463ri2.m18310x1()));
        c4463riArr[0] = null;
        if (C14116yg.m67475k4(dM18310x1) < 1.0E-7d) {
            return 0;
        }
        double d = dM18310x12 / dM18310x1;
        double d2 = dM18310x13 / dM18310x1;
        if (-1.0E-7d > d || d > 1.0000001d || -1.0E-7d > d2 || d2 > 1.0000001d) {
            return -1;
        }
        c4463riArr[0] = new C4463ri(((c4463ri2.m18303k4() - c4463ri.m18303k4()) * d) + c4463ri.m18303k4(), ((c4463ri2.m18310x1() - c4463ri.m18310x1()) * d) + c4463ri.m18310x1());
        return 1;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m18312k4(C4487yd c4487yd, C4487yd c4487yd2, C4487yd c4487yd3, C4487yd c4487yd4) {
        double dM18481x1 = ((c4487yd2.m18481x1() - c4487yd3.m18481x1()) * (c4487yd.m18478k4() - c4487yd3.m18478k4())) - ((c4487yd.m18481x1() - c4487yd3.m18481x1()) * (c4487yd2.m18478k4() - c4487yd3.m18478k4()));
        double dM18481x12 = ((c4487yd2.m18481x1() - c4487yd4.m18481x1()) * (c4487yd.m18478k4() - c4487yd4.m18478k4())) - ((c4487yd.m18481x1() - c4487yd4.m18481x1()) * (c4487yd2.m18478k4() - c4487yd4.m18478k4()));
        if (m18313k4(dM18481x12, 1.0E-7d)) {
            return 0;
        }
        double d = dM18481x12 * dM18481x1;
        if (d > 0.0d) {
            return 1;
        }
        return d < 0.0d ? -1 : 0;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m18313k4(double d, double d2) {
        return C14116yg.m67475k4(d) <= d2;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m18314k4(double d, double d2, double d3) {
        return C14116yg.m67475k4(d - d2) <= C14116yg.m67502x1(C14116yg.m67475k4(d), C14116yg.m67475k4(d2)) * d3;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m18315k4(C4463ri c4463ri, C4463ri c4463ri2, C4463ri c4463ri3, C4463ri c4463ri4) {
        double dM18310x1 = (((c4463ri3.m18310x1() - c4463ri4.m18310x1()) * (c4463ri3.m18310x1() - c4463ri2.m18310x1())) + ((c4463ri3.m18303k4() - c4463ri4.m18303k4()) * (c4463ri3.m18303k4() - c4463ri2.m18303k4()))) * C14116yg.m67475k4(((c4463ri.m18310x1() - c4463ri4.m18310x1()) * (c4463ri.m18303k4() - c4463ri2.m18303k4())) - ((c4463ri.m18310x1() - c4463ri2.m18310x1()) * (c4463ri.m18303k4() - c4463ri4.m18303k4())));
        double dM67475k4 = C14116yg.m67475k4(((c4463ri3.m18310x1() - c4463ri4.m18310x1()) * (c4463ri3.m18303k4() - c4463ri2.m18303k4())) - ((c4463ri3.m18310x1() - c4463ri2.m18310x1()) * (c4463ri3.m18303k4() - c4463ri4.m18303k4()))) * (((c4463ri.m18310x1() - c4463ri4.m18310x1()) * (c4463ri.m18310x1() - c4463ri2.m18310x1())) + ((c4463ri.m18303k4() - c4463ri4.m18303k4()) * (c4463ri.m18303k4() - c4463ri2.m18303k4())));
        return dM18310x1 + dM67475k4 >= (-(C14116yg.m67502x1(C14116yg.m67475k4(dM18310x1), C14116yg.m67475k4(dM67475k4)) * 1.0E-13d));
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m18316k4(C4463ri c4463ri, C4481wp c4481wp, int[] iArr) {
        iArr[0] = -1;
        int iM18312k4 = m18312k4(c4481wp.m18432x1()[0].m18384k4()[0].m18307kk().Clone(), c4481wp.m18432x1()[0].m18384k4()[1].m18307kk().Clone(), c4481wp.m18431x1(0).m18307kk().Clone(), c4463ri.m18307kk().Clone());
        int iM18312k42 = m18312k4(c4481wp.m18432x1()[1].m18384k4()[0].m18307kk().Clone(), c4481wp.m18432x1()[1].m18384k4()[1].m18307kk().Clone(), c4481wp.m18431x1(1).m18307kk().Clone(), c4463ri.m18307kk().Clone());
        int iM18312k43 = m18312k4(c4481wp.m18432x1()[2].m18384k4()[0].m18307kk().Clone(), c4481wp.m18432x1()[2].m18384k4()[1].m18307kk().Clone(), c4481wp.m18431x1(2).m18307kk().Clone(), c4463ri.m18307kk().Clone());
        if ((iM18312k4 != 0 && iM18312k4 != 1) || ((iM18312k42 != 0 && iM18312k42 != 1) || (iM18312k43 != 0 && iM18312k43 != 1))) {
            return false;
        }
        iArr[0] = 3 - ((iM18312k4 + iM18312k42) + iM18312k43);
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m18317k4(C4487yd c4487yd, C4487yd c4487yd2, double d) {
        return C14116yg.m67475k4(c4487yd.m18478k4() - c4487yd2.m18478k4()) <= C14116yg.m67502x1(C14116yg.m67475k4(c4487yd.m18478k4()), C14116yg.m67475k4(c4487yd2.m18478k4())) * d && C14116yg.m67475k4(c4487yd.m18481x1() - c4487yd2.m18481x1()) <= C14116yg.m67502x1(C14116yg.m67475k4(c4487yd.m18481x1()), C14116yg.m67475k4(c4487yd2.m18481x1())) * d;
    }
}
