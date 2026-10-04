package com.aspose.slides.internal.p219k6;

import com.aspose.slides.internal.p044bq.C1839x1;
import com.aspose.slides.internal.p340pm.C9466kk;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.k6.k4 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC5618k4 implements InterfaceC5620to {
    /* JADX INFO: renamed from: k4 */
    public C12025x6 m23004k4(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        float[] fArr = new float[2];
        C1839x1.m9613k4((f - f3) + f7, (f2 - f4) + f8, f + f7, f2 + f8, f + f9, f2 + f10, f + f5 + f9, f2 + f6 + f10, fArr, 0);
        return new C12025x6(fArr[0], fArr[1]);
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m23005k4(C9466kk.k4 k4Var, boolean z) {
        if (z && k4Var == C9466kk.k4.LEFT) {
            return true;
        }
        return !z && k4Var == C9466kk.k4.RIGHT;
    }
}
