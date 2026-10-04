package com.aspose.slides.internal.p151gj;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p223ka.C5656k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.gj.fa */
/* JADX INFO: loaded from: classes.dex */
public class C4318fa extends C4328x1 {

    /* JADX INFO: renamed from: k4 */
    private C5656k4 f11778k4;

    public C4318fa(C5656k4 c5656k4) {
        super(0);
        m17351k4(c5656k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m17351k4(C5656k4 c5656k4) {
        if (c5656k4 == null) {
            throw new ArgumentNullException("value");
        }
        this.f11778k4 = c5656k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C5656k4 m17352x1() {
        return this.f11778k4;
    }
}
