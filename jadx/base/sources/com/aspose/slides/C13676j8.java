package com.aspose.slides;

import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.j8 */
/* JADX INFO: loaded from: classes3.dex */
class C13676j8 {
    /* JADX INFO: renamed from: k4 */
    private static double m63251k4(float f, float f2) {
        return 90.0d - (C14116yg.m67471fa(f / f2) * 57.29577951308232d);
    }

    /* JADX INFO: renamed from: k4 */
    private static int m63252k4(C12025x6 c12025x6, float f, float f2) {
        C12025x6 c12025x62 = new C12025x6(f / 2.0f, f2 / 2.0f);
        float fM56897x1 = c12025x62.m56897x1();
        float fM56895kk = c12025x62.m56895kk();
        double dM63251k4 = m63251k4(f, f2);
        return c12025x6.m56897x1() >= fM56897x1 ? c12025x6.m56895kk() > fM56895kk ? m63251k4(c12025x6.m56897x1() - fM56897x1, c12025x6.m56895kk() - fM56895kk) <= dM63251k4 ? 0 : 1 : m63251k4(c12025x6.m56897x1() - fM56897x1, fM56895kk - c12025x6.m56895kk()) <= dM63251k4 ? 7 : 6 : c12025x6.m56895kk() > fM56895kk ? m63251k4(fM56897x1 - c12025x6.m56897x1(), c12025x6.m56895kk() - fM56895kk) <= dM63251k4 ? 3 : 2 : m63251k4(fM56897x1 - c12025x6.m56897x1(), fM56895kk - c12025x6.m56895kk()) <= dM63251k4 ? 4 : 5;
    }

    /* JADX INFO: renamed from: k4 */
    public static GeometryPath m63253k4(float f, float f2, C12025x6 c12025x6) {
        float f3;
        boolean z = c12025x6.m56897x1() >= 0.0f && c12025x6.m56897x1() <= f && c12025x6.m56895kk() >= 0.0f && c12025x6.m56895kk() <= f2;
        int iM63252k4 = m63252k4(c12025x6.Clone(), f, f2);
        GeometryPath geometryPath = new GeometryPath();
        geometryPath.moveTo(0.0f, 0.0f);
        switch (iM63252k4) {
            case 0:
                geometryPath.lineTo(f, 0.0f);
                if (!z) {
                    float f4 = f2 - (f2 / 6.0f);
                    geometryPath.lineTo(f, f4 - (f2 / 4.0f));
                    geometryPath.lineTo(c12025x6.m56897x1(), c12025x6.m56895kk());
                    geometryPath.lineTo(f, f4);
                }
                geometryPath.lineTo(f, f2);
                geometryPath.lineTo(0.0f, f2);
                geometryPath.lineTo(0.0f, 0.0f);
                break;
            case 1:
                geometryPath.lineTo(f, 0.0f);
                geometryPath.lineTo(f, f2);
                if (!z) {
                    float f5 = f - (f / 6.0f);
                    geometryPath.lineTo(f5, f2);
                    geometryPath.lineTo(c12025x6.m56897x1(), c12025x6.m56895kk());
                    f3 = f5 - (f / 4.0f);
                    geometryPath.lineTo(f3, f2);
                }
                geometryPath.lineTo(0.0f, f2);
                geometryPath.lineTo(0.0f, 0.0f);
                break;
            case 2:
                geometryPath.lineTo(f, 0.0f);
                geometryPath.lineTo(f, f2);
                if (!z) {
                    f3 = f / 6.0f;
                    geometryPath.lineTo((f / 4.0f) + f3, f2);
                    geometryPath.lineTo(c12025x6.m56897x1(), c12025x6.m56895kk());
                    geometryPath.lineTo(f3, f2);
                }
                geometryPath.lineTo(0.0f, f2);
                geometryPath.lineTo(0.0f, 0.0f);
                break;
            case 3:
                geometryPath.lineTo(f, 0.0f);
                geometryPath.lineTo(f, f2);
                geometryPath.lineTo(0.0f, f2);
                if (!z) {
                    float f6 = f2 - (f2 / 6.0f);
                    geometryPath.lineTo(0.0f, f6);
                    geometryPath.lineTo(c12025x6.m56897x1(), c12025x6.m56895kk());
                    geometryPath.lineTo(0.0f, f6 - (f2 / 4.0f));
                }
                geometryPath.lineTo(0.0f, 0.0f);
                break;
            case 4:
                geometryPath.lineTo(f, 0.0f);
                geometryPath.lineTo(f, f2);
                geometryPath.lineTo(0.0f, f2);
                if (!z) {
                    float f7 = f2 / 6.0f;
                    geometryPath.lineTo(0.0f, (f2 / 4.0f) + f7);
                    geometryPath.lineTo(c12025x6.m56897x1(), c12025x6.m56895kk());
                    geometryPath.lineTo(0.0f, f7);
                }
                geometryPath.lineTo(0.0f, 0.0f);
                break;
            case 5:
                if (!z) {
                    float f8 = f / 6.0f;
                    geometryPath.lineTo(f8, 0.0f);
                    geometryPath.lineTo(c12025x6.m56897x1(), c12025x6.m56895kk());
                    geometryPath.lineTo((f / 4.0f) + f8, 0.0f);
                }
                geometryPath.lineTo(f, 0.0f);
                geometryPath.lineTo(f, f2);
                geometryPath.lineTo(0.0f, f2);
                geometryPath.lineTo(0.0f, 0.0f);
                break;
            case 6:
                if (!z) {
                    float f9 = f - (f / 6.0f);
                    geometryPath.lineTo(f9 - (f / 4.0f), 0.0f);
                    geometryPath.lineTo(c12025x6.m56897x1(), c12025x6.m56895kk());
                    geometryPath.lineTo(f9, 0.0f);
                }
                geometryPath.lineTo(f, 0.0f);
                geometryPath.lineTo(f, f2);
                geometryPath.lineTo(0.0f, f2);
                geometryPath.lineTo(0.0f, 0.0f);
                break;
            case 7:
                geometryPath.lineTo(f, 0.0f);
                if (!z) {
                    float f10 = f2 / 6.0f;
                    geometryPath.lineTo(f, f10);
                    geometryPath.lineTo(c12025x6.m56897x1(), c12025x6.m56895kk());
                    geometryPath.lineTo(f, (f2 / 4.0f) + f10);
                }
                geometryPath.lineTo(f, f2);
                geometryPath.lineTo(0.0f, f2);
                geometryPath.lineTo(0.0f, 0.0f);
                break;
        }
        return geometryPath;
    }
}
