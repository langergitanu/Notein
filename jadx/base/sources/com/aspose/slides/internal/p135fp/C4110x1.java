package com.aspose.slides.internal.p135fp;

import androidx.core.view.ViewCompat;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p299ni.InterfaceC6899c5;
import com.aspose.slides.internal.p299ni.InterfaceC6908m9;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12016rv;

/* JADX INFO: renamed from: com.aspose.slides.internal.fp.x1 */
/* JADX INFO: loaded from: classes.dex */
class C4110x1 implements InterfaceC6899c5 {

    /* JADX INFO: renamed from: k4 */
    private final InterfaceC6908m9 f11270k4;

    public C4110x1(InterfaceC6908m9 interfaceC6908m9) {
        this.f11270k4 = interfaceC6908m9;
    }

    @Override // com.aspose.slides.internal.p299ni.InterfaceC6899c5
    /* JADX INFO: renamed from: k4 */
    public void mo16292k4(C12014ne c12014ne, byte[] bArr, C12016rv c12016rv, C12016rv c12016rv2) {
        if (bArr.length % 3 != 0) {
            throw new ArgumentException("Data must contain 3 bytes for each pixel.");
        }
        int[] iArr = new int[bArr.length / 3];
        int i = 0;
        int i2 = 0;
        while (i < bArr.length) {
            iArr[i2] = ((bArr[i + 2] & 255) << 16) | ViewCompat.MEASURED_STATE_MASK | ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
            i += 3;
            i2++;
        }
        this.f11270k4.mo9843k4(c12014ne.Clone(), iArr, c12016rv.Clone(), c12016rv2.Clone());
    }
}
