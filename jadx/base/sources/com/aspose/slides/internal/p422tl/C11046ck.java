package com.aspose.slides.internal.p422tl;

import androidx.core.view.ViewCompat;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p260ly.AbstractC6280ne;
import com.aspose.slides.internal.p260ly.C6291yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.tl.ck */
/* JADX INFO: loaded from: classes4.dex */
public class C11046ck extends AbstractC11065yj {
    /* JADX INFO: renamed from: k4 */
    public AbstractC6280ne m53477k4(C3134k4 c3134k4) {
        C6291yj c6291yj = new C6291yj();
        c6291yj.m25731k4(c3134k4.m13382u4());
        c6291yj.m25737x1(c3134k4.m13382u4());
        c6291yj.m25732k4(m53476k4(c3134k4, r1 & 65535));
        return c6291yj;
    }

    /* JADX INFO: renamed from: k4 */
    public static int[] m53476k4(C3134k4 c3134k4, long j) {
        long j2 = j & 4294967295L;
        int[] iArr = new int[(int) j2];
        for (int i = 0; i < j2; i++) {
            int iM13386x6 = c3134k4.m13386x6();
            iArr[i] = ((iM13386x6 >> 16) & 255) | ((iM13386x6 & 255) << 16) | ViewCompat.MEASURED_STATE_MASK | (65280 & iM13386x6);
        }
        return iArr;
    }
}
