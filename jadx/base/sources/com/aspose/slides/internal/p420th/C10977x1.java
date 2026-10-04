package com.aspose.slides.internal.p420th;

import com.aspose.slides.internal.p431ty.C11241kk;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.th.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C10977x1 {
    /* JADX INFO: renamed from: k4 */
    private static double m53131k4(double d) {
        return d > 3.141592653589793d ? d - 6.283185307179586d : d < -3.141592653589793d ? d + 6.283185307179586d : d;
    }

    /* JADX INFO: renamed from: x1 */
    private static double m53133x1(double d, double d2, int i) {
        if (i != 0) {
            if (i == 1 && d2 > d) {
                d += 6.283185307179586d;
            }
        } else if (d2 < d) {
            d2 += 6.283185307179586d;
        }
        return d2 - d;
    }

    /* JADX INFO: renamed from: k4 */
    private static double m53132k4(double d, double d2, int i) {
        double dM53133x1 = m53133x1(d, d2, i);
        if (dM53133x1 == 0.0d) {
            return 360.0d;
        }
        if (i == 2) {
            dM53133x1 = m53131k4(dM53133x1);
        }
        return C11241kk.m54225x1(dM53133x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final C10961k4 m53134k4(C12007ix c12007ix, C12025x6 c12025x6, C12025x6 c12025x62) {
        return m53135k4(c12007ix.Clone(), c12025x6.Clone(), c12025x62.Clone(), 2);
    }

    /* JADX INFO: renamed from: k4 */
    public final C10961k4 m53135k4(C12007ix c12007ix, C12025x6 c12025x6, C12025x6 c12025x62, int i) {
        C12015qq c12015qq = new C12015qq(c12007ix.m56550c5() / 2.0f, c12007ix.m56575x1() / 2.0f);
        C12025x6 c12025x63 = new C12025x6(c12015qq.m56699x1() + c12007ix.m56557jd(), c12015qq.m56697kk() + c12007ix.m56551ck());
        double dM67498to = C14116yg.m67498to(c12025x6.m56895kk() - c12025x63.m56895kk(), c12025x6.m56897x1() - c12025x63.m56897x1());
        return new C10961k4(c12007ix.Clone(), C11241kk.m54225x1(dM67498to), m53132k4(dM67498to, C14116yg.m67498to(c12025x62.m56895kk() - c12025x63.m56895kk(), c12025x62.m56897x1() - c12025x63.m56897x1()), i));
    }
}
