package com.aspose.slides.internal.p550zi;

import com.aspose.slides.internal.p299ni.InterfaceC6908m9;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12016rv;

/* JADX INFO: renamed from: com.aspose.slides.internal.zi.dq */
/* JADX INFO: loaded from: classes5.dex */
public class C13596dq implements InterfaceC6908m9 {

    /* JADX INFO: renamed from: k4 */
    private final int f45151k4;

    /* JADX INFO: renamed from: kk */
    private final int f45152kk;

    /* JADX INFO: renamed from: x1 */
    private final InterfaceC6908m9 f45153x1;

    public C13596dq(int i, int i2, InterfaceC6908m9 interfaceC6908m9) {
        this.f45152kk = i;
        this.f45151k4 = i2;
        this.f45153x1 = interfaceC6908m9;
    }

    @Override // com.aspose.slides.internal.p299ni.InterfaceC6908m9
    /* JADX INFO: renamed from: k4 */
    public void mo9843k4(C12014ne c12014ne, int[] iArr, C12016rv c12016rv, C12016rv c12016rv2) {
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            if (i2 == this.f45152kk || i2 == 0) {
                iArr[i] = this.f45151k4;
            }
        }
        this.f45153x1.mo9843k4(c12014ne.Clone(), iArr, c12016rv.Clone(), c12016rv2.Clone());
    }
}
