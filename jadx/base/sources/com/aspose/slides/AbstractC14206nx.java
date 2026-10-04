package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

/* JADX INFO: renamed from: com.aspose.slides.nx */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC14206nx {

    /* JADX INFO: renamed from: k4 */
    public final IShape f47636k4;

    public AbstractC14206nx(IShape iShape) {
        if (iShape == null) {
            throw new ArgumentNullException("shape");
        }
        this.f47636k4 = iShape;
    }
}
