package com.aspose.slides;

import com.aspose.slides.internal.p475wh.C12009k4;

/* JADX INFO: loaded from: classes3.dex */
class j5m {
    /* JADX INFO: renamed from: k4 */
    private static byte m63215k4(C0755am c0755am) {
        float[] fArr = new float[256];
        int[] iArrM63220x1 = m63220x1(c0755am);
        int i = 1;
        while (i < 255) {
            float fM63216k4 = m63216k4(0, i, iArrM63220x1);
            int i2 = i + 1;
            float fM63216k42 = m63216k4(i2, 255, iArrM63220x1);
            float f = fM63216k4 * fM63216k42;
            if (f == 0.0f) {
                f = 1.0f;
            }
            float fM63219x1 = (m63219x1(0, i, iArrM63220x1) * fM63216k42) - (m63219x1(i2, 255, iArrM63220x1) * fM63216k4);
            fArr[i] = (fM63219x1 * fM63219x1) / f;
            i = i2;
        }
        return (byte) m63217k4(fArr, 256);
    }

    /* JADX INFO: renamed from: x1 */
    private static float m63219x1(int i, int i2, int[] iArr) {
        int i3 = 0;
        while (i <= i2) {
            i3 += iArr[i] * i;
            i++;
        }
        return i3;
    }

    /* JADX INFO: renamed from: k4 */
    private static float m63216k4(int i, int i2, int[] iArr) {
        int i3 = 0;
        while (i <= i2) {
            i3 += iArr[i];
            i++;
        }
        return i3;
    }

    /* JADX INFO: renamed from: x1 */
    private static int[] m63220x1(C0755am c0755am) {
        int[] iArr = new int[256];
        for (int i = 0; i < c0755am.m3678x1(); i++) {
            for (int i2 = 0; i2 < c0755am.m3674k4(); i2++) {
                int iM3673k4 = c0755am.m3673k4(i2, i) & 255;
                iArr[iM3673k4] = iArr[iM3673k4] + 1;
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: k4 */
    private static int m63217k4(float[] fArr, int i) {
        float f = 0.0f;
        int i2 = 0;
        for (int i3 = 1; i3 < i - 1; i3++) {
            float f2 = fArr[i3];
            if (f2 > f) {
                i2 = i3;
                f = f2;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12009k4 m63218k4(C12009k4 c12009k4) {
        C0755am c0755amM3669k4 = C0755am.m3669k4(c12009k4);
        return ysu.m74078k4(c0755amM3669k4, m63215k4(c0755amM3669k4));
    }
}
