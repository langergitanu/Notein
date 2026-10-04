package com.aspose.slides;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;

/* JADX INFO: loaded from: classes3.dex */
class p9q extends C14806xl {

    /* JADX INFO: renamed from: k4 */
    private final IPPImage f48019k4;

    public p9q(IPPImage iPPImage) {
        this.f48019k4 = iPPImage;
    }

    @Override // com.aspose.slides.C14806xl, com.aspose.slides.OutputFile
    /* JADX INFO: renamed from: k4 */
    public void mo2108k4(AbstractC3150x6 abstractC3150x6) {
        byte[] binaryData = this.f48019k4.getBinaryData();
        abstractC3150x6.write(binaryData, 0, binaryData.length);
    }
}
