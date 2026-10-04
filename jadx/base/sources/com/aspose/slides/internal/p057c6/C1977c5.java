package com.aspose.slides.internal.p057c6;

import com.aspose.slides.internal.p097e0.AbstractC3524ks;

/* JADX INFO: renamed from: com.aspose.slides.internal.c6.c5 */
/* JADX INFO: loaded from: classes3.dex */
public class C1977c5 implements InterfaceC1981h4 {

    /* JADX INFO: renamed from: k4 */
    private InterfaceC1981h4 f6937k4;

    /* JADX INFO: renamed from: kk */
    private int f6938kk;

    /* JADX INFO: renamed from: x1 */
    private int f6939x1;

    public C1977c5(InterfaceC1981h4 interfaceC1981h4, int i, int i2) {
        this.f6937k4 = interfaceC1981h4;
        this.f6939x1 = i;
        this.f6938kk = i2;
    }

    @Override // com.aspose.slides.internal.p057c6.InterfaceC1981h4
    /* JADX INFO: renamed from: k4 */
    public final int mo10099k4(int i, AbstractC3524ks abstractC3524ks) {
        if (i == this.f6939x1) {
            return this.f6938kk;
        }
        InterfaceC1981h4 interfaceC1981h4 = this.f6937k4;
        if (interfaceC1981h4 != null) {
            return interfaceC1981h4.mo10099k4(i, abstractC3524ks);
        }
        return -1;
    }
}
