package com.aspose.slides;

import com.aspose.slides.internal.p407st.C10480ii;
import com.aspose.slides.internal.p407st.C10534m3;
import com.aspose.slides.internal.p407st.C10609qn;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.wa */
/* JADX INFO: loaded from: classes3.dex */
class C14730wa {
    /* JADX INFO: renamed from: k4 */
    public static C13701jt m72668k4(C10609qn c10609qn, C10609qn c10609qn2) {
        C13701jt c13701jt = new C13701jt();
        long jM51597ar = c10609qn != null ? c10609qn.m51597ar() : 25400L;
        long jM51597ar2 = c10609qn2 != null ? c10609qn2.m51597ar() : 25400L;
        double d = c10609qn != null ? ((double) ((int) (jM51597ar & 4294967295L))) / 12700.0d : 2.0d;
        double d2 = c10609qn2 != null ? ((double) ((int) (jM51597ar2 & 4294967295L))) / 12700.0d : 2.0d;
        double dM67496rv = C14116yg.m67496rv((d2 * d2) + (d * d));
        c13701jt.f45579k4 = dM67496rv;
        float fM67473jd = (float) ((C14116yg.m67473jd(d / dM67496rv) * 180.0d) / 3.141592653589793d);
        c13701jt.f45580x1 = fM67473jd;
        if (d2 < 0.0d) {
            c13701jt.f45580x1 = 360.0f - fM67473jd;
        }
        if (C14064he.m66715kk(c13701jt.f45580x1)) {
            c13701jt.f45580x1 = 0.0f;
        }
        return c13701jt;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m72669k4(C13701jt c13701jt, C10534m3 c10534m3) {
        C10480ii c10480iiM51263x1 = c10534m3.m51263x1();
        double dM67470dy = C14116yg.m67470dy((((double) c13701jt.f45580x1) * 3.141592653589793d) / 180.0d) * c13701jt.f45579k4;
        double dM67495m9 = C14116yg.m67495m9((((double) c13701jt.f45580x1) * 3.141592653589793d) / 180.0d) * c13701jt.f45579k4;
        long jM67472h4 = (long) ((((double) C14116yg.m67472h4(dM67470dy)) * 0.5d) + (dM67470dy * 12700.0d));
        long jM67472h42 = (long) ((((double) C14116yg.m67472h4(dM67495m9)) * 0.5d) + (12700.0d * dM67495m9));
        if ((jM67472h4 & 4294967295L) != 25400) {
            C22225Oooo0oO.OooO0O0(517, jM67472h4, c10480iiM51263x1);
        }
        if ((jM67472h42 & 4294967295L) != 25400) {
            C22225Oooo0oO.OooO0O0(518, jM67472h42, c10480iiM51263x1);
        }
    }
}
