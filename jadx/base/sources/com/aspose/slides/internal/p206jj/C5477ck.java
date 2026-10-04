package com.aspose.slides.internal.p206jj;

import androidx.core.view.ViewCompat;
import com.aspose.slides.internal.p019ac.AbstractC1349ne;
import com.aspose.slides.internal.p019ac.C1360yj;
import com.aspose.slides.internal.p080dd.C3134k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.jj.ck */
/* JADX INFO: loaded from: classes.dex */
public class C5477ck extends AbstractC5496yj {
    /* JADX INFO: renamed from: k4 */
    public AbstractC1349ne m22566k4(C3134k4 c3134k4) {
        C1360yj c1360yj = new C1360yj();
        c1360yj.m8056k4(c3134k4.m13382u4());
        c1360yj.m8060x1(c3134k4.m13382u4());
        c1360yj.m8057k4(m22565k4(c3134k4, r1 & 65535));
        return c1360yj;
    }

    /* JADX INFO: renamed from: k4 */
    public static int[] m22565k4(C3134k4 c3134k4, long j) {
        long j2 = j & 4294967295L;
        int[] iArr = new int[(int) j2];
        for (int i = 0; i < j2; i++) {
            int iM13386x6 = c3134k4.m13386x6();
            iArr[i] = ((iM13386x6 >> 16) & 255) | ((iM13386x6 & 255) << 16) | ViewCompat.MEASURED_STATE_MASK | (65280 & iM13386x6);
        }
        return iArr;
    }
}
