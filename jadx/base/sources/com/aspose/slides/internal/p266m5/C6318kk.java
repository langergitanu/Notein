package com.aspose.slides.internal.p266m5;

import com.aspose.slides.internal.p475wh.C12003du;

/* JADX INFO: renamed from: com.aspose.slides.internal.m5.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C6318kk {

    /* JADX INFO: renamed from: k4 */
    private final int f17967k4;

    public C6318kk(int i) {
        this.f17967k4 = i;
    }

    /* JADX INFO: renamed from: kk */
    private C12003du[] m25867kk(C12003du c12003du, C12003du c12003du2) {
        int iM56501c5 = c12003du.m56501c5() & 255;
        int iM56501c52 = c12003du2.m56501c5() & 255;
        return (iM56501c5 == 0 || iM56501c52 == 0) ? m25870k4(iM56501c5, iM56501c52, c12003du, c12003du2) : m25868to(c12003du, c12003du2);
    }

    /* JADX INFO: renamed from: to */
    private C12003du[] m25868to(C12003du c12003du, C12003du c12003du2) {
        int i = this.f17967k4;
        C12003du[] c12003duArr = new C12003du[i];
        int iM56501c5 = c12003du.m56501c5() & 255;
        int iM56507jd = c12003du.m56507jd() & 255;
        int iM56502ck = c12003du.m56502ck() & 255;
        int iM56505fa = c12003du.m56505fa() & 255;
        int iM56501c52 = c12003du2.m56501c5() & 255;
        int iM56507jd2 = c12003du2.m56507jd() & 255;
        int iM56502ck2 = c12003du2.m56502ck() & 255;
        int iM56505fa2 = c12003du2.m56505fa() & 255;
        int i2 = 0;
        while (i2 < i) {
            c12003duArr[i2] = C6317k4.m25865k4(iM56501c5, iM56507jd, iM56502ck, iM56505fa, iM56501c52, iM56507jd2, iM56502ck2, iM56505fa2, 1.0f - r12, i2 / i);
            i2++;
            i = i;
        }
        return c12003duArr;
    }

    /* JADX INFO: renamed from: x1 */
    private C12003du[] m25869x1(C12003du c12003du, C12003du c12003du2) {
        int i = this.f17967k4;
        C12003du[] c12003duArr = new C12003du[i];
        float f = 1.0f / i;
        int iM56501c5 = c12003du.m56501c5() & 255;
        int iM56507jd = c12003du.m56507jd() & 255;
        int iM56502ck = c12003du.m56502ck() & 255;
        int iM56505fa = c12003du.m56505fa() & 255;
        int iM56501c52 = (c12003du2.m56501c5() & 255) - iM56501c5;
        int iM56507jd2 = (c12003du2.m56507jd() & 255) - iM56507jd;
        int iM56502ck2 = (c12003du2.m56502ck() & 255) - iM56502ck;
        int iM56505fa2 = (c12003du2.m56505fa() & 255) - iM56505fa;
        int i2 = 0;
        while (i2 < i) {
            C12003du[] c12003duArr2 = c12003duArr;
            c12003duArr2[i2] = C12003du.m56398k4((int) (((double) ((i2 * iM56501c52 * f) + iM56501c5)) + 0.5d), (int) (((double) ((i2 * iM56507jd2 * f) + iM56507jd)) + 0.5d), (int) (((double) ((i2 * iM56502ck2 * f) + iM56502ck)) + 0.5d), (int) (((double) ((i2 * iM56505fa2 * f) + iM56505fa)) + 0.5d));
            i2++;
            i = i;
            c12003duArr = c12003duArr2;
        }
        return c12003duArr;
    }

    /* JADX INFO: renamed from: k4 */
    public C12003du[] m25870k4(int i, int i2, C12003du c12003du, C12003du c12003du2) {
        int i3 = this.f17967k4;
        int i4 = i3 - 1;
        C12003du[] c12003duArr = new C12003du[i3];
        float f = i2 - i;
        if (i == 0 && i2 == 0) {
            for (int i5 = 0; i5 < i3; i5++) {
                c12003duArr[i5] = C12003du.m56396k4(0);
            }
        } else if (i == 0) {
            c12003duArr[0] = c12003du;
            c12003duArr[i4] = c12003du2;
            for (int i6 = 1; i6 < i3 - 1; i6++) {
                c12003duArr[i6] = C12003du.m56400k4(((int) (((i6 / i4) * f) + i)) & 255, c12003du2);
            }
        } else if (i2 == 0) {
            c12003duArr[0] = c12003du;
            c12003duArr[i4] = c12003du2;
            for (int i7 = 1; i7 < i3 - 1; i7++) {
                c12003duArr[i7] = C12003du.m56400k4(((int) (((i7 / i4) * f) + i)) & 255, c12003du);
            }
        }
        return c12003duArr;
    }

    /* JADX INFO: renamed from: k4 */
    public C12003du[] m25871k4(C12003du c12003du, C12003du c12003du2) {
        return ((c12003du.m56501c5() & 255) == 255 && (c12003du2.m56501c5() & 255) == 255) ? m25869x1(c12003du, c12003du2) : m25867kk(c12003du, c12003du2);
    }
}
