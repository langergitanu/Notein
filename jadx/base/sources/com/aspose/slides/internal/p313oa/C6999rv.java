package com.aspose.slides.internal.p313oa;

import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.oa.rv */
/* JADX INFO: loaded from: classes4.dex */
class C6999rv {

    /* JADX INFO: renamed from: k4 */
    private static float[] f19044k4 = {0.9642f, 1.0f, 0.8249f};

    /* JADX INFO: renamed from: du */
    public static void m27379du(float[] fArr) {
        float f = (fArr[0] + 16.0f) / 116.0f;
        fArr[0] = m27391to((fArr[1] / 500.0f) + f) * f19044k4[0];
        fArr[1] = m27391to(f) * f19044k4[1];
        fArr[2] = m27391to(f - (fArr[2] / 200.0f)) * f19044k4[2];
    }

    /* JADX INFO: renamed from: h4 */
    public static void m27381h4(float[] fArr) {
        float fM27388kk = m27388kk(fArr[0] / f19044k4[0]);
        float fM27388kk2 = m27388kk(fArr[1] / f19044k4[1]);
        float fM27388kk3 = m27388kk(fArr[2] / f19044k4[2]);
        fArr[0] = (116.0f * fM27388kk2) - 16.0f;
        fArr[1] = (fM27388kk - fM27388kk2) * 500.0f;
        fArr[2] = (fM27388kk2 - fM27388kk3) * 200.0f;
    }

    /* JADX INFO: renamed from: k4 */
    public static float m27383k4(float f) {
        return (f * 32768.0f) / 65535.0f;
    }

    /* JADX INFO: renamed from: kk */
    private static float m27388kk(float f) {
        double d = f;
        return (float) (d > 0.008856d ? C14116yg.m67469du(d, 0.3333333333333333d) : (d * 7.787037037037037d) + 0.13793103448275862d);
    }

    /* JADX INFO: renamed from: to */
    private static float m27391to(float f) {
        double d = f;
        if (d > 0.20689303448275861d) {
            return f * f * f;
        }
        if (d > 0.13793103448275862d) {
            return (float) ((d - 0.13793103448275862d) / 7.787037037037037d);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: x1 */
    public static float m27394x1(float f) {
        return (f * 65535.0f) / 32768.0f;
    }

    /* JADX INFO: renamed from: du */
    public static void m27380du(float[] fArr, boolean z) {
        fArr[0] = (fArr[0] * 65535.0f) / 65280.0f;
        fArr[1] = (fArr[1] * 65535.0f) / 65280.0f;
        fArr[2] = (fArr[2] * 65535.0f) / 65280.0f;
        if (z) {
            C6979b3.m27304k4(fArr);
        }
    }

    /* JADX INFO: renamed from: h4 */
    public static void m27382h4(float[] fArr, boolean z) {
        fArr[0] = (fArr[0] * 65280.0f) / 65535.0f;
        fArr[1] = (fArr[1] * 65280.0f) / 65535.0f;
        fArr[2] = (fArr[2] * 65280.0f) / 65535.0f;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m27384k4(float[] fArr) {
        fArr[0] = fArr[0] / 100.0f;
        fArr[1] = (fArr[1] + 128.0f) / 255.0f;
        fArr[2] = (fArr[2] + 128.0f) / 255.0f;
    }

    /* JADX INFO: renamed from: kk */
    public static void m27389kk(float[] fArr) {
        for (int i = 0; i < 3; i++) {
            fArr[i] = m27383k4(fArr[i]);
        }
    }

    /* JADX INFO: renamed from: to */
    public static void m27392to(float[] fArr) {
        for (int i = 0; i < 3; i++) {
            fArr[i] = m27394x1(fArr[i]);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static void m27395x1(float[] fArr) {
        fArr[0] = fArr[0] * 100.0f;
        fArr[1] = (fArr[1] * 255.0f) - 128.0f;
        fArr[2] = (fArr[2] * 255.0f) - 128.0f;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m27385k4(float[] fArr, AbstractC7008wy abstractC7008wy) {
        if (abstractC7008wy.m27409kk() == 1281450528 && abstractC7008wy.mo27325h4()) {
            m27380du(fArr, true);
        }
    }

    /* JADX INFO: renamed from: kk */
    public static void m27390kk(float[] fArr, boolean z) {
        m27380du(fArr, z);
        m27387k4(fArr, z);
    }

    /* JADX INFO: renamed from: to */
    public static void m27393to(float[] fArr, boolean z) {
        m27396x1(fArr, z);
        m27382h4(fArr, z);
    }

    /* JADX INFO: renamed from: x1 */
    public static void m27396x1(float[] fArr, boolean z) {
        if (z) {
            C6979b3.m27304k4(fArr);
        }
        m27392to(fArr);
        m27381h4(fArr);
        m27384k4(fArr);
        if (z) {
            C6979b3.m27304k4(fArr);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m27386k4(float[] fArr, AbstractC7008wy abstractC7008wy, AbstractC7008wy abstractC7008wy2) {
        int iM27412x1 = abstractC7008wy2.m27412x1();
        int iM27409kk = abstractC7008wy != null ? abstractC7008wy.m27409kk() : 1061109567;
        boolean zMo27325h4 = abstractC7008wy2.mo27325h4();
        boolean zMo27325h42 = abstractC7008wy != null ? abstractC7008wy.mo27325h4() : false;
        if (iM27412x1 != 1281450528) {
            if (iM27412x1 == 1482250784 && iM27409kk == 1281450528) {
                if (zMo27325h42) {
                    m27390kk(fArr, true);
                    return;
                } else {
                    m27387k4(fArr, true);
                    return;
                }
            }
            return;
        }
        if (iM27409kk == 1281450528) {
            if (zMo27325h42 && !zMo27325h4) {
                m27380du(fArr, true);
                return;
            } else {
                if (zMo27325h42 || !zMo27325h4) {
                    return;
                }
                m27382h4(fArr, true);
                return;
            }
        }
        if (iM27409kk != 1482250784) {
            if (zMo27325h4) {
                m27382h4(fArr, true);
            }
        } else if (zMo27325h4) {
            m27393to(fArr, true);
        } else {
            m27396x1(fArr, true);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m27387k4(float[] fArr, boolean z) {
        m27395x1(fArr);
        m27379du(fArr);
        m27389kk(fArr);
        if (z) {
            C6979b3.m27304k4(fArr);
        }
    }
}
