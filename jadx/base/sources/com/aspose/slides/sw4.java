package com.aspose.slides;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;

/* JADX INFO: loaded from: classes3.dex */
class sw4 extends OutputFile {

    /* JADX INFO: renamed from: k4 */
    private final String f48937k4;

    public sw4(String str) {
        this.f48937k4 = str;
    }

    @Override // com.aspose.slides.OutputFile
    /* JADX INFO: renamed from: k4 */
    public void mo2108k4(AbstractC3150x6 abstractC3150x6) {
        byte[] bArrMo26677to = AbstractC6747ar.m26635ix().mo26677to(this.f48937k4);
        abstractC3150x6.write(bArrMo26677to, 0, bArrMo26677to.length);
    }
}
