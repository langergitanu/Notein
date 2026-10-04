package com.aspose.slides.internal.p159h0;

import com.aspose.slides.exceptions.Exception;

/* JADX INFO: renamed from: com.aspose.slides.internal.h0.vj */
/* JADX INFO: loaded from: classes.dex */
final class C4478vj {
    /* JADX INFO: renamed from: k4 */
    public static C4474up m18400k4(C4474up c4474up, C4488yj c4488yj) {
        boolean z;
        int iM18489kk = c4488yj.m18489kk(c4474up);
        if (iM18489kk < 0) {
            return null;
        }
        int i = iM18489kk;
        do {
            if (((c4488yj.m18493x1(i).m18384k4()[0].m18303k4() == c4474up.m18384k4()[0].m18303k4() && c4488yj.m18493x1(i).m18384k4()[0].m18310x1() == c4474up.m18384k4()[0].m18310x1() && c4488yj.m18493x1(i).m18384k4()[1].m18303k4() == c4474up.m18384k4()[1].m18303k4() && c4488yj.m18493x1(i).m18384k4()[1].m18310x1() == c4474up.m18384k4()[1].m18310x1()) || (c4488yj.m18493x1(i).m18384k4()[0].m18303k4() == c4474up.m18384k4()[1].m18303k4() && c4488yj.m18493x1(i).m18384k4()[0].m18310x1() == c4474up.m18384k4()[1].m18310x1() && c4488yj.m18493x1(i).m18384k4()[1].m18303k4() == c4474up.m18384k4()[0].m18303k4() && c4488yj.m18493x1(i).m18384k4()[1].m18310x1() == c4474up.m18384k4()[0].m18310x1())) && c4488yj.m18493x1(i) != c4474up) {
                z = true;
                break;
            }
            i++;
            if (c4488yj.m18482k4() <= i) {
                break;
            }
        } while (C4464rv.m18314k4(c4488yj.m18493x1(i).m18386to(), c4474up.m18386to(), 1.0E-7d));
        z = false;
        if (z) {
            return c4488yj.m18493x1(i);
        }
        int i2 = iM18489kk - 1;
        if (i2 < 0) {
            return null;
        }
        do {
            if (((c4488yj.m18493x1(i2).m18384k4()[0].m18303k4() == c4474up.m18384k4()[0].m18303k4() && c4488yj.m18493x1(i2).m18384k4()[0].m18310x1() == c4474up.m18384k4()[0].m18310x1() && c4488yj.m18493x1(i2).m18384k4()[1].m18303k4() == c4474up.m18384k4()[1].m18303k4() && c4488yj.m18493x1(i2).m18384k4()[1].m18310x1() == c4474up.m18384k4()[1].m18310x1()) || (c4488yj.m18493x1(i2).m18384k4()[0].m18303k4() == c4474up.m18384k4()[1].m18303k4() && c4488yj.m18493x1(i2).m18384k4()[0].m18310x1() == c4474up.m18384k4()[1].m18310x1() && c4488yj.m18493x1(i2).m18384k4()[1].m18303k4() == c4474up.m18384k4()[0].m18303k4() && c4488yj.m18493x1(i2).m18384k4()[1].m18310x1() == c4474up.m18384k4()[0].m18310x1())) && c4488yj.m18493x1(i2) != c4474up) {
                return c4488yj.m18493x1(i2);
            }
            i2--;
            if (i2 < 0) {
                return null;
            }
        } while (C4464rv.m18314k4(c4488yj.m18493x1(i2).m18386to(), c4474up.m18386to(), 1.0E-7d));
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public static C4481wp m18401k4(C4463ri c4463ri, C4481wp c4481wp, int i, int[] iArr) {
        int i2 = i * 6;
        int i3 = 0;
        while (!C4464rv.m18316k4(c4463ri, c4481wp, iArr)) {
            int i4 = 0;
            while (true) {
                if (i4 >= 3) {
                    break;
                }
                if (C4464rv.m18312k4(c4481wp.m18432x1()[i4].m18384k4()[0].m18307kk().Clone(), c4481wp.m18432x1()[i4].m18384k4()[1].m18307kk().Clone(), c4481wp.m18431x1(i4).m18307kk().Clone(), c4463ri.m18307kk().Clone()) == -1) {
                    c4481wp = c4481wp.m18432x1()[i4].m18382k4(c4481wp);
                    break;
                }
                i4++;
            }
            i3++;
            if (i3 > i2) {
                throw new Exception("Infinite loop");
            }
        }
        return c4481wp;
    }
}
