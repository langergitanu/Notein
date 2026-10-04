package com.aspose.slides.internal.p156gw;

import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: renamed from: com.aspose.slides.internal.gw.ne */
/* JADX INFO: loaded from: classes.dex */
public class C4405ne {
    /* JADX INFO: renamed from: k4 */
    public static double m17966k4(double d, double d2) {
        double dTan = Math.tan(Math.toRadians(d2));
        double degrees = Math.toDegrees(Math.acos(1.0d / Math.sqrt(((dTan * dTan) * d) + 1.0d)));
        int i = (int) d2;
        int iAbs = (Math.abs(i) / 90) & 3;
        if (iAbs == 1) {
            degrees = 180.0d - degrees;
        } else if (iAbs == 2) {
            degrees += 180.0d;
        } else if (iAbs == 3) {
            degrees = 360.0d - degrees;
        }
        if (d2 < 0.0d) {
            degrees = -degrees;
        }
        return degrees + ((double) ((i / StyleIdentifier.LIST_TABLE_4_ACCENT_5) * StyleIdentifier.LIST_TABLE_4_ACCENT_5));
    }

    /* JADX INFO: renamed from: k4 */
    private static int m17967k4(C12007ix c12007ix, double d, double d2) {
        int i = c12007ix.m56550c5() <= 0.0f ? 5 : d < ((double) c12007ix.m56557jd()) ? 1 : d > ((double) c12007ix.m56557jd()) + ((double) c12007ix.m56550c5()) ? 4 : 0;
        return c12007ix.m56575x1() <= 0.0f ? i | 10 : d2 < ((double) c12007ix.m56551ck()) ? i | 2 : d2 > ((double) c12007ix.m56551ck()) + ((double) c12007ix.m56575x1()) ? i | 8 : i;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m17968k4(C12007ix c12007ix, double d, double d2, double d3, double d4) {
        int iM17967k4 = m17967k4(c12007ix, d3, d4);
        if (iM17967k4 == 0) {
            return true;
        }
        double d5 = d;
        double d6 = d2;
        while (true) {
            int iM17967k42 = m17967k4(c12007ix, d5, d6);
            if (iM17967k42 == 0) {
                return true;
            }
            if ((iM17967k42 & iM17967k4) != 0) {
                return false;
            }
            if ((iM17967k42 & 5) != 0) {
                double dM56557jd = c12007ix.m56557jd();
                if ((iM17967k42 & 4) != 0) {
                    dM56557jd += (double) c12007ix.m56550c5();
                }
                d6 = (((d4 - d6) * (dM56557jd - d5)) / (d3 - d5)) + d6;
                d5 = dM56557jd;
            } else {
                double dM56551ck = c12007ix.m56551ck();
                if ((iM17967k42 & 8) != 0) {
                    dM56551ck += (double) c12007ix.m56575x1();
                }
                d5 = (((d3 - d5) * (dM56551ck - d6)) / (d4 - d6)) + d5;
                d6 = dM56551ck;
            }
        }
    }
}
