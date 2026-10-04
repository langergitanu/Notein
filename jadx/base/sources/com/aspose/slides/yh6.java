package com.aspose.slides;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class yh6 implements InterfaceC1140gd {

    /* JADX INFO: renamed from: k4 */
    private final AbstractC3150x6 f50357k4;

    public yh6(AbstractC3150x6 abstractC3150x6) {
        this.f50357k4 = abstractC3150x6;
    }

    @Override // com.aspose.slides.InterfaceC1140gd
    /* JADX INFO: renamed from: k4 */
    public final void mo6493k4(String str) {
        if (C14113y2.m67411k4(str)) {
            return;
        }
        byte[] bArrMo26677to = AbstractC6747ar.m26635ix().mo26677to(str);
        this.f50357k4.write(bArrMo26677to, 0, bArrMo26677to.length);
    }

    @Override // com.aspose.slides.InterfaceC1140gd
    /* JADX INFO: renamed from: k4 */
    public final boolean mo6494k4() {
        return this.f50357k4.getPosition() == 0;
    }
}
