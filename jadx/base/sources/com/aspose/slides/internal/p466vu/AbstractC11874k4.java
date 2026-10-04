package com.aspose.slides.internal.p466vu;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.aspose.slides.internal.vu.k4 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11874k4 {

    /* JADX INFO: renamed from: k4 */
    private OutputStream f39993k4;

    public AbstractC11874k4(OutputStream outputStream) {
        this.f39993k4 = outputStream;
    }

    /* JADX INFO: renamed from: k4 */
    public void m55455k4() {
        C3152yj c3152yj = new C3152yj();
        try {
            mo1976k4(c3152yj);
            C11875x1.m55456k4(c3152yj, this.f39993k4);
        } finally {
            c3152yj.close();
            this.f39993k4 = null;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo1976k4(AbstractC3150x6 abstractC3150x6);
}
