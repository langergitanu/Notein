package com.aspose.slides.internal.p075d5;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12017to;
import com.aspose.slides.internal.p475wh.C12018u4;
import com.aspose.slides.internal.p475wh.C12019um;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.d5.m9 */
/* JADX INFO: loaded from: classes3.dex */
public class C3022m9 {
    /* JADX INFO: renamed from: k4 */
    public static float m12716k4(C12025x6 c12025x6, String str, C12013m9 c12013m9, int i, float f) {
        float f2;
        float fM56895kk = c12025x6.m56895kk();
        int iM56535to = c12013m9.m56651x1().m56535to(c12013m9.m56642jd());
        int iM56532kk = c12013m9.m56651x1().m56532kk(c12013m9.m56642jd());
        int iM56536x1 = c12013m9.m56651x1().m56536x1(c12013m9.m56642jd());
        int i2 = iM56532kk + iM56536x1;
        float fM56639dy = c12013m9.m56639dy() / iM56535to;
        if ((i & 24) == 24) {
            f2 = iM56536x1;
        } else {
            if ((i & 8) != 8) {
                return fM56895kk;
            }
            f2 = i2;
        }
        return fM56895kk - (f2 * fM56639dy);
    }

    /* JADX INFO: renamed from: x1 */
    public static C12025x6 m12725x1(C12025x6 c12025x6, String str, C12013m9 c12013m9, AbstractC12008jd abstractC12008jd, int i, float f) {
        return new C12025x6(m12717k4(c12025x6.Clone(), str, c12013m9, abstractC12008jd, i, f), m12716k4(c12025x6.Clone(), str, c12013m9, i, f));
    }

    /* JADX INFO: renamed from: k4 */
    public static float m12717k4(C12025x6 c12025x6, String str, C12013m9 c12013m9, AbstractC12008jd abstractC12008jd, int i, float f) {
        float fM56897x1 = c12025x6.m56897x1();
        float fM56550c5 = m12718k4(str, abstractC12008jd, c12013m9).Clone().m56550c5() * f;
        return (i & 6) == 6 ? fM56897x1 - (fM56550c5 / 2.0f) : (i & 2) == 2 ? fM56897x1 - fM56550c5 : fM56897x1;
    }

    /* JADX INFO: renamed from: k4 */
    private static C12007ix m12718k4(String str, AbstractC12008jd abstractC12008jd, C12013m9 c12013m9) {
        C12019um c12019um = new C12019um(C12019um.m56799c5());
        c12019um.m56817kk(c12019um.m56816kk() | 2048);
        c12019um.m56814k4(new C12017to[]{new C12017to(0, str.length())});
        C12018u4[] c12018u4ArrMo17558k4 = abstractC12008jd.mo17558k4(str, c12013m9, C12007ix.m56544k4(C12014ne.f40546k4).Clone(), c12019um);
        if (c12018u4ArrMo17558k4.length <= 0) {
            return C12007ix.m56544k4(C12014ne.f40546k4);
        }
        C12007ix c12007ixClone = c12018u4ArrMo17558k4[0].m56749k4(abstractC12008jd).Clone();
        if (c12007ixClone.m56550c5() == 0.0f && c12007ixClone.m56575x1() == 0.0f && !C14113y2.m67411k4(str)) {
            throw new NotImplementedException();
        }
        return c12007ixClone;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m12719k4(byte[] bArr, byte[] bArr2) {
        if (bArr == bArr2) {
            return true;
        }
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m12720k4(float[] fArr, float[] fArr2) {
        if (fArr == fArr2) {
            return true;
        }
        if (fArr == null || fArr2 == null || fArr.length != fArr2.length) {
            return false;
        }
        for (int i = 0; i < fArr.length; i++) {
            if (fArr[i] != fArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m12721k4(int[] iArr, int[] iArr2) {
        if (iArr == iArr2) {
            return true;
        }
        if (iArr == null || iArr2 == null || iArr.length != iArr2.length) {
            return false;
        }
        for (int i = 0; i < iArr.length; i++) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m12722k4(long[] jArr, long[] jArr2) {
        if (jArr == jArr2) {
            return true;
        }
        if (jArr == null || jArr2 == null || jArr.length != jArr2.length) {
            return false;
        }
        for (int i = 0; i < jArr.length; i++) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static <T> boolean m12723k4(T[] tArr, T[] tArr2) {
        if (tArr == tArr2) {
            return true;
        }
        if (tArr == null || tArr2 == null || tArr.length != tArr2.length) {
            return false;
        }
        for (int i = 0; i < tArr.length; i++) {
            if (!tArr[i].equals(tArr2[i])) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m12724k4(short[] sArr, short[] sArr2) {
        if (sArr == sArr2) {
            return true;
        }
        if (sArr == null || sArr2 == null || sArr.length != sArr2.length) {
            return false;
        }
        for (int i = 0; i < sArr.length; i++) {
            if (sArr[i] != sArr2[i]) {
                return false;
            }
        }
        return true;
    }
}
