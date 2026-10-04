package com.aspose.slides.internal.p468vz;

import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p466vu.C11875x1;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.aspose.slides.internal.vz.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C11878k4 extends C3152yj {

    /* JADX INFO: renamed from: k4 */
    InputStream f39996k4;

    public C11878k4(InputStream inputStream) {
        this.f39996k4 = inputStream;
        C11875x1.m55459k4(inputStream, this);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void close() {
        try {
            try {
                this.f39996k4.close();
            } catch (IOException e) {
                throw new com.aspose.slides.exceptions.IOException("An I/O error occurs on closing stream", e);
            }
        } finally {
            super.close();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public InputStream m55462k4() {
        return this.f39996k4;
    }
}
