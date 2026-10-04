package com.aspose.slides;

import androidx.datastore.preferences.protobuf.C21825OoooOO0;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.z5 */
/* JADX INFO: loaded from: classes3.dex */
class C14873z5 {
    /* JADX INFO: renamed from: k4 */
    public static C12007ix m74318k4(C12007ix[] c12007ixArr) {
        if (c12007ixArr.length == 0) {
            return C12007ix.f40519k4;
        }
        if (c12007ixArr.length == 1) {
            return c12007ixArr[0];
        }
        C12007ix c12007ixClone = c12007ixArr[0].Clone();
        float fM56571to = c12007ixClone.m56571to();
        float fM56556h4 = c12007ixClone.m56556h4();
        float fM56554dy = c12007ixClone.m56554dy();
        float fM56558k4 = c12007ixClone.m56558k4();
        for (int i = 1; i < c12007ixArr.length; i++) {
            C12007ix c12007ixClone2 = c12007ixArr[i].Clone();
            fM56571to = C14116yg.m67504x1(c12007ixClone2.m56571to(), fM56571to);
            fM56556h4 = C14116yg.m67481k4(c12007ixClone2.m56556h4(), fM56556h4);
            fM56554dy = C14116yg.m67504x1(c12007ixClone2.m56554dy(), fM56554dy);
            fM56558k4 = C14116yg.m67481k4(c12007ixClone2.m56558k4(), fM56558k4);
        }
        return new C12007ix(fM56571to, fM56554dy, fM56556h4 - fM56571to, fM56558k4 - fM56554dy);
    }

    /* JADX INFO: renamed from: kk */
    private static double m74330kk(C12025x6 c12025x6, C12025x6 c12025x62) {
        return C14116yg.m67496rv(C14116yg.m67469du(c12025x6.m56895kk() - c12025x62.m56895kk(), 2.0d) + C14116yg.m67469du(c12025x6.m56897x1() - c12025x62.m56897x1(), 2.0d));
    }

    /* JADX INFO: renamed from: x1 */
    private static C12025x6 m74331x1(C12025x6 c12025x6, C12025x6 c12025x62) {
        return new C12025x6(c12025x6.m56897x1() - c12025x62.m56897x1(), c12025x6.m56895kk() - c12025x62.m56895kk());
    }

    /* JADX INFO: renamed from: k4 */
    public static C12025x6 m74319k4(double d, double d2, C12025x6 c12025x6) {
        double d3 = (d * 0.017453292519943295d) % 6.283185307179586d;
        return new C12025x6((float) ((C14116yg.m67470dy(d3) * d2) + ((double) c12025x6.m56897x1())), (float) ((C14116yg.m67495m9(d3) * d2) + ((double) c12025x6.m56895kk())));
    }

    /* JADX INFO: renamed from: k4 */
    public static C12025x6 m74320k4(C12007ix c12007ix, C12007ix c12007ix2, boolean z) {
        C12025x6 c12025x6 = new C12025x6(c12007ix.m56557jd(), c12007ix.m56551ck());
        boolean z2 = true;
        float[] fArr = {0.0f};
        float[] fArr2 = {0.0f};
        if (m74327k4(c12007ix2.Clone(), c12007ix.Clone(), fArr, fArr2) && (!z || ((fArr[0] == 0.0f || fArr2[0] != 0.0f || (c12007ix2.m56571to() <= c12007ix.m56556h4() && c12007ix2.m56556h4() >= c12007ix.m56571to())) && (fArr2[0] == 0.0f || fArr[0] != 0.0f || (c12007ix2.m56554dy() <= c12007ix.m56558k4() && c12007ix2.m56558k4() >= c12007ix.m56554dy()))))) {
            z2 = false;
        }
        return z2 ? c12025x6 : m74322k4(c12025x6.Clone(), fArr[0], fArr2[0]);
    }

    /* JADX INFO: renamed from: k4 */
    private static C12025x6 m74321k4(C12025x6 c12025x6, float f) {
        return new C12025x6(c12025x6.m56897x1() * f, c12025x6.m56895kk() * f);
    }

    /* JADX INFO: renamed from: k4 */
    public static C12025x6 m74322k4(C12025x6 c12025x6, float f, float f2) {
        return (f == 0.0f && f2 == 0.0f) ? c12025x6 : new C12025x6(c12025x6.m56897x1() + f, c12025x6.m56895kk() + f2);
    }

    /* JADX INFO: renamed from: k4 */
    public static C12025x6 m74323k4(C12025x6 c12025x6, float f, float f2, C12007ix c12007ix, boolean z) {
        return m74320k4(new C12007ix(c12025x6.m56897x1(), c12025x6.m56895kk(), f, f2), c12007ix.Clone(), z);
    }

    /* JADX INFO: renamed from: k4 */
    private static C12025x6 m74324k4(C12025x6 c12025x6, C12025x6 c12025x62) {
        return new C12025x6(c12025x62.m56897x1() + c12025x6.m56897x1(), c12025x62.m56895kk() + c12025x6.m56895kk());
    }

    /* JADX INFO: renamed from: k4 */
    private static C12025x6 m74325k4(C12025x6 c12025x6, C12025x6 c12025x62, C12025x6 c12025x63, C12025x6 c12025x64, float f) {
        float f2 = 1.0f - f;
        float fM67469du = (float) C14116yg.m67469du(f2, 3.0d);
        float fM67469du2 = (float) C14116yg.m67469du(f, 3.0d);
        float f3 = 3.0f * f;
        float f4 = f3 * f2 * f2;
        float f5 = f3 * f * f2;
        return new C12025x6((c12025x64.m56897x1() * fM67469du2) + (c12025x63.m56897x1() * f5) + (c12025x62.m56897x1() * f4) + (c12025x6.m56897x1() * fM67469du), com.aspose.slides.internal.p040bg.OooO00o.OooO00o(c12025x64, fM67469du2, com.aspose.slides.internal.p040bg.OooO00o.OooO00o(c12025x63, f5, com.aspose.slides.internal.p040bg.OooO00o.OooO00o(c12025x62, f4, c12025x6.m56895kk() * fM67469du))));
    }

    /* JADX INFO: renamed from: k4 */
    public static void m74326k4(C12025x6 c12025x6, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
        fArr[0] = C14116yg.m67504x1(fArr[0], c12025x6.m56897x1());
        fArr3[0] = C14116yg.m67481k4(fArr3[0], c12025x6.m56897x1());
        fArr2[0] = C14116yg.m67504x1(fArr2[0], c12025x6.m56895kk());
        fArr4[0] = C14116yg.m67481k4(fArr4[0], c12025x6.m56895kk());
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m74327k4(C12007ix c12007ix, C12007ix c12007ix2, float[] fArr, float[] fArr2) {
        fArr2[0] = 0.0f;
        fArr[0] = 0.0f;
        float fM56571to = c12007ix.m56571to() - c12007ix2.m56571to();
        if (fM56571to > 0.0f) {
            fArr[0] = fM56571to;
        }
        float fM56556h4 = c12007ix.m56556h4() - c12007ix2.m56556h4();
        if (fM56556h4 < 0.0f) {
            fArr[0] = fM56556h4;
        }
        float fM56554dy = c12007ix.m56554dy() - c12007ix2.m56554dy();
        if (fM56554dy > 0.0f) {
            fArr2[0] = fM56554dy;
        }
        float fM56558k4 = c12007ix.m56558k4() - c12007ix2.m56558k4();
        if (fM56558k4 < 0.0f) {
            fArr2[0] = fM56558k4;
        }
        return (fArr[0] == 0.0f && fArr2[0] == 0.0f) ? false : true;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m74328k4(C12025x6 c12025x6, C12025x6 c12025x62, C12025x6 c12025x63, double d) {
        tbp tbpVar = new tbp(c12025x62.m56897x1() - c12025x6.m56897x1(), c12025x62.m56895kk() - c12025x6.m56895kk());
        tbp tbpVar2 = new tbp(c12025x6.m56897x1() - c12025x63.m56897x1(), c12025x6.m56895kk() - c12025x63.m56895kk());
        double dM71063k4 = tbpVar.m71063k4(tbpVar.Clone());
        double dM71063k42 = tbpVar2.m71063k4(tbpVar.Clone()) * 2.0d;
        double dOooO00o = C21825OoooOO0.OooO00o(dM71063k4, 4.0d, tbpVar2.m71063k4(tbpVar2.Clone()) - (d * d), dM71063k42 * dM71063k42);
        if (dOooO00o < 0.0d) {
            return false;
        }
        double dM67496rv = C14116yg.m67496rv(dOooO00o);
        double d2 = -dM71063k42;
        double d3 = dM71063k4 * 2.0d;
        double d4 = (d2 - dM67496rv) / d3;
        double d5 = (d2 + dM67496rv) / d3;
        if (d4 < 0.0d || d4 > 1.0d) {
            return d5 >= 0.0d && d5 <= 1.0d;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00f8 A[PHI: r2 r3
      0x00f8: PHI (r2v13 com.aspose.slides.internal.wh.x6) = (r2v7 com.aspose.slides.internal.wh.x6), (r2v20 com.aspose.slides.internal.wh.x6) binds: [B:48:0x01b3, B:24:0x00f6] A[DONT_GENERATE, DONT_INLINE]
      0x00f8: PHI (r3v6 com.aspose.slides.internal.wh.x6) = (r3v3 com.aspose.slides.internal.wh.x6), (r3v9 com.aspose.slides.internal.wh.x6) binds: [B:48:0x01b3, B:24:0x00f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00fa A[PHI: r2 r3
      0x00fa: PHI (r2v11 com.aspose.slides.internal.wh.x6) = (r2v7 com.aspose.slides.internal.wh.x6), (r2v20 com.aspose.slides.internal.wh.x6) binds: [B:48:0x01b3, B:24:0x00f6] A[DONT_GENERATE, DONT_INLINE]
      0x00fa: PHI (r3v4 com.aspose.slides.internal.wh.x6) = (r3v3 com.aspose.slides.internal.wh.x6), (r3v9 com.aspose.slides.internal.wh.x6) binds: [B:48:0x01b3, B:24:0x00f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C12025x6[] m74329k4(C12025x6 c12025x6, C12025x6 c12025x62, C12025x6 c12025x63, C12025x6 c12025x64) {
        C12025x6 c12025x6Clone;
        C12025x6 c12025x6Clone2;
        C12025x6 c12025x6M74324k4;
        float f;
        double dM74330kk = m74330kk(c12025x62.Clone(), c12025x63.Clone());
        double dM74330kk2 = m74330kk(c12025x6.Clone(), c12025x63.Clone());
        double dM74330kk3 = m74330kk(c12025x62.Clone(), c12025x64.Clone());
        C12025x6 c12025x6Clone3 = c12025x62.Clone();
        C12025x6 c12025x65 = new C12025x6();
        C12025x6 c12025x66 = new C12025x6();
        C12025x6 c12025x67 = new C12025x6();
        double d = dM74330kk2 / 6.0d;
        double d2 = dM74330kk / 2.0d;
        if (d >= d2 || dM74330kk3 / 6.0d >= d2) {
            if (d >= d2 && dM74330kk3 / 6.0d >= d2) {
                m74324k4(c12025x62.Clone(), m74321k4(m74331x1(c12025x63.Clone(), c12025x6.Clone()).Clone(), dM74330kk2 == 0.0d ? 0.0f : (float) (d2 / dM74330kk2)).Clone()).CloneTo(c12025x65);
                c12025x6Clone = c12025x63.Clone();
                c12025x6Clone2 = m74331x1(c12025x62.Clone(), c12025x64.Clone()).Clone();
                if (dM74330kk3 == 0.0d) {
                }
            } else if (d >= d2) {
                m74324k4(c12025x62.Clone(), m74321k4(m74331x1(c12025x63.Clone(), c12025x6.Clone()).Clone(), dM74330kk2 == 0.0d ? 0.0f : (float) (d2 / dM74330kk2)).Clone()).CloneTo(c12025x65);
                c12025x6M74324k4 = m74324k4(c12025x63.Clone(), m74321k4(m74331x1(c12025x62.Clone(), c12025x64.Clone()).Clone(), (dM74330kk3 == 0.0d || dM74330kk2 == 0.0d) ? 0.0f : (float) ((dM74330kk3 / dM74330kk2) * (d2 / dM74330kk3))).Clone());
            } else {
                m74324k4(c12025x62.Clone(), m74321k4(m74331x1(c12025x63.Clone(), c12025x6.Clone()).Clone(), (dM74330kk2 == 0.0d || dM74330kk3 == 0.0d) ? 0.0f : (float) ((dM74330kk2 / dM74330kk3) * (d2 / dM74330kk2))).Clone()).CloneTo(c12025x65);
                c12025x6Clone = c12025x63.Clone();
                c12025x6Clone2 = m74331x1(c12025x62.Clone(), c12025x64.Clone()).Clone();
                f = dM74330kk3 == 0.0d ? 0.0f : (float) (d2 / dM74330kk3);
            }
            c12025x6M74324k4 = m74324k4(c12025x6Clone, m74321k4(c12025x6Clone2, f).Clone());
        } else {
            m74324k4(c12025x62.Clone(), m74321k4(m74331x1(c12025x63.Clone(), c12025x6.Clone()).Clone(), C12025x6.m56888x1(c12025x6, c12025x62) ? 0.16666667f : 0.33333334f).Clone()).CloneTo(c12025x65);
            c12025x6M74324k4 = m74324k4(c12025x63.Clone(), m74321k4(m74331x1(c12025x62.Clone(), c12025x64.Clone()).Clone(), C12025x6.m56888x1(c12025x63, c12025x64) ? 0.16666667f : 0.33333334f).Clone());
        }
        c12025x6M74324k4.CloneTo(c12025x66);
        c12025x63.CloneTo(c12025x67);
        C12025x6[] c12025x6Arr = (C12025x6[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12025x6.class), 11));
        for (int i = 0; i <= 10; i++) {
            m74325k4(c12025x6Clone3.Clone(), c12025x65.Clone(), c12025x66.Clone(), c12025x67.Clone(), i / 10.0f).CloneTo(c12025x6Arr[i]);
        }
        return c12025x6Arr;
    }
}
