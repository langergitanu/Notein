package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.jb */
/* JADX INFO: loaded from: classes3.dex */
class C13679jb {
    /* JADX INFO: renamed from: k4 */
    private static byte m63270k4(int i) {
        return (byte) C14116yg.m67507x1(C14116yg.m67483k4(i, 0), 255);
    }

    /* JADX INFO: renamed from: k4 */
    public static C12009k4 m63271k4(C12009k4 c12009k4) {
        int i;
        C0755am c0755amM3669k4 = C0755am.m3669k4(c12009k4);
        C0755am c0755amM3670k4 = C0755am.m3670k4(c0755amM3669k4.m3671du().Clone(), 196865);
        for (int i2 = 0; i2 < c0755amM3669k4.m3678x1(); i2++) {
            int i3 = 0;
            while (i3 < c0755amM3669k4.m3674k4()) {
                int iM3673k4 = c0755amM3669k4.m3673k4(i3, i2) & 255;
                byte b = iM3673k4 >= 128 ? (byte) -1 : (byte) 0;
                c0755amM3670k4.m3675k4(i3, i2, b);
                int i4 = iM3673k4 - (b & 255);
                int i5 = i3 + 1;
                if (i5 < c0755amM3669k4.m3674k4()) {
                    m63272k4(c0755amM3669k4, i5, i2, i4, 7);
                }
                int i6 = i3 - 1;
                if (i6 >= 0 && (i = i2 + 1) < c0755amM3669k4.m3678x1()) {
                    m63272k4(c0755amM3669k4, i6, i, i4, 3);
                }
                int i7 = i2 + 1;
                if (i7 < c0755amM3669k4.m3678x1()) {
                    m63272k4(c0755amM3669k4, i3, i7, i4, 5);
                }
                if (i5 < c0755amM3669k4.m3674k4() && i7 < c0755amM3669k4.m3678x1()) {
                    m63272k4(c0755amM3669k4, i5, i7, i4, 1);
                }
                i3 = i5;
            }
        }
        return c0755amM3670k4.m3672h4();
    }

    /* JADX INFO: renamed from: k4 */
    private static void m63272k4(C0755am c0755am, int i, int i2, int i3, int i4) {
        c0755am.m3675k4(i, i2, m63270k4(C7019kk.m27462to(Double.valueOf(((double) (i3 * i4)) / 16.0d), 14) + (c0755am.m3673k4(i, i2) & 255)));
    }
}
