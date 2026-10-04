package com.aspose.slides.internal.p370qv;

import OooO0O0.C20394OooO0Oo;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.qv.x1 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9947x1 {
    /* JADX INFO: renamed from: k4 */
    public static boolean m48891k4(C12025x6 c12025x6, C12025x6 c12025x62, C12025x6 c12025x63, double d, double d2) {
        double dM56897x1 = c12025x6.m56897x1();
        double dM56895kk = c12025x6.m56895kk();
        double dM56897x12 = c12025x62.m56897x1();
        double dM56895kk2 = c12025x62.m56895kk();
        double dM56897x13 = c12025x63.m56897x1();
        double dM56895kk3 = c12025x63.m56895kk();
        double d3 = dM56895kk3 - dM56895kk;
        double d4 = dM56897x12 - dM56897x1;
        double d5 = dM56897x13 - dM56897x1;
        double d6 = dM56895kk2 - dM56895kk;
        double d7 = (d3 * d4) - (d5 * d6);
        if (d7 == 0.0d) {
            return false;
        }
        double d8 = d2 - dM56895kk;
        double d9 = d - dM56897x1;
        double dOooO00o = C20394OooO0Oo.OooO00o(d9, d6, d8 * d4, d7);
        if (dOooO00o >= 0.0d && dOooO00o <= 1.0d) {
            double dOooO00o2 = C20394OooO0Oo.OooO00o(d8, d5, d9 * d3, d7);
            if (dOooO00o2 >= 0.0d) {
                double d10 = dOooO00o2 + dOooO00o;
                if (d10 < 1.0d) {
                    return true;
                }
                if (d10 == 1.0d) {
                    if ((d2 == dM56895kk3 || d2 == dM56895kk2) && d2 < dM56895kk && d != Math.max(dM56897x12, dM56897x13)) {
                        return true;
                    }
                    if ((d == dM56897x13 || d == dM56897x12) && d < dM56897x1 && d2 != Math.max(dM56895kk2, dM56895kk3)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract boolean mo48883k4(double d, double d2);

    /* JADX INFO: renamed from: x1 */
    public abstract boolean mo48885x1(double d, double d2);
}
