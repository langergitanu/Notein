package com.aspose.slides;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p466vu.AbstractC11874k4;
import com.aspose.slides.internal.p466vu.C11875x1;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OutputFile implements IOutputFile {
    /* JADX INFO: renamed from: k4 */
    public abstract void mo2108k4(AbstractC3150x6 abstractC3150x6);

    @Override // com.aspose.slides.IOutputFile
    public void write(OutputStream outputStream) {
        C11875x1.m55458k4(new AbstractC11874k4(outputStream) { // from class: com.aspose.slides.OutputFile.1
            @Override // com.aspose.slides.internal.p466vu.AbstractC11874k4
            /* JADX INFO: renamed from: k4 */
            public void mo1976k4(AbstractC3150x6 abstractC3150x6) {
                OutputFile.this.mo2108k4(abstractC3150x6);
            }
        });
    }
}
