package com.aspose.slides.internal.p092du;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p423to.InterfaceC11073to;

/* JADX INFO: renamed from: com.aspose.slides.internal.du.vh */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3345vh implements InterfaceC11073to {
    @Override // com.aspose.slides.internal.p423to.InterfaceC11073to
    /* JADX INFO: renamed from: k4 */
    public final int mo13931k4(String str) {
        int[] iArr = {0};
        boolean zMo13930k4 = mo13930k4(str, iArr);
        int i = iArr[0];
        if (zMo13930k4) {
            return i;
        }
        throw new ArgumentException("value");
    }

    @Override // com.aspose.slides.internal.p423to.InterfaceC11073to
    /* JADX INFO: renamed from: k4 */
    public abstract boolean mo13930k4(String str, int[] iArr);
}
