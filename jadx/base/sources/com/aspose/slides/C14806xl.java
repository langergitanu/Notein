package com.aspose.slides;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p466vu.AbstractC11874k4;
import com.aspose.slides.internal.p466vu.C11875x1;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.aspose.slides.xl */
/* JADX INFO: loaded from: classes3.dex */
class C14806xl extends OutputFile {

    /* JADX INFO: renamed from: k4 */
    private byte[] f50145k4;

    public C14806xl() {
    }

    @Override // com.aspose.slides.OutputFile
    /* JADX INFO: renamed from: k4 */
    public void mo2108k4(AbstractC3150x6 abstractC3150x6) {
        byte[] bArr = this.f50145k4;
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        abstractC3150x6.write(bArr, 0, bArr.length);
    }

    @Override // com.aspose.slides.OutputFile, com.aspose.slides.IOutputFile
    public void write(OutputStream outputStream) {
        C11875x1.m55458k4(new AbstractC11874k4(outputStream) { // from class: com.aspose.slides.xl.1
            @Override // com.aspose.slides.internal.p466vu.AbstractC11874k4
            /* JADX INFO: renamed from: k4 */
            public void mo1976k4(AbstractC3150x6 abstractC3150x6) {
                C14806xl.this.mo2108k4(abstractC3150x6);
            }
        });
    }

    public C14806xl(byte[] bArr) {
        this.f50145k4 = bArr;
    }
}
