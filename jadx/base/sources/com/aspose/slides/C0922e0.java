package com.aspose.slides;

import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.e0 */
/* JADX INFO: loaded from: classes3.dex */
final class C0922e0 implements IAlphaInverseEffectiveData, InterfaceC13788lo {

    /* JADX INFO: renamed from: k4 */
    static final C0922e0 f4699k4 = new C0922e0();

    private C0922e0() {
    }

    @Override // com.aspose.slides.InterfaceC13788lo
    /* JADX INFO: renamed from: k4 */
    public final tc4 mo3873k4(tc4 tc4Var) {
        for (int i = 0; i < tc4Var.m71087to().length; i += 4) {
            int i2 = i + 3;
            tc4Var.m71087to()[i2] = (byte) (255 - (tc4Var.m71087to()[i2] & 255));
        }
        return tc4Var;
    }

    @Override // com.aspose.slides.InterfaceC13788lo
    /* JADX INFO: renamed from: k4 */
    public final String mo3874k4() {
        return C14067j2.m66727k4(this).mo48540du();
    }

    @Override // com.aspose.slides.InterfaceC13788lo
    /* JADX INFO: renamed from: k4 */
    public final void mo4351k4(IBaseSlide iBaseSlide, dm6 dm6Var) {
    }
}
