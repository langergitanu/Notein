package com.aspose.slides;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;

/* JADX INFO: loaded from: classes3.dex */
class gb6 extends C14806xl {

    /* JADX INFO: renamed from: k4 */
    private final IVideo f5187k4;

    public gb6(IVideo iVideo) {
        this.f5187k4 = iVideo;
    }

    @Override // com.aspose.slides.C14806xl, com.aspose.slides.OutputFile
    /* JADX INFO: renamed from: k4 */
    public void mo2108k4(AbstractC3150x6 abstractC3150x6) {
        byte[] binaryData = this.f5187k4.getBinaryData();
        abstractC3150x6.write(binaryData, 0, binaryData.length);
    }
}
