package com.aspose.slides;

import com.aspose.slides.internal.p475wh.C12009k4;

/* JADX INFO: renamed from: com.aspose.slides.t1 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC14482t1 extends AbstractC13710k2 {

    /* JADX INFO: renamed from: k4 */
    final C12009k4 f49005k4;

    public AbstractC14482t1(double d, C12009k4 c12009k4) {
        super(d);
        this.f49005k4 = c12009k4;
    }

    public final IImage getFrame() {
        return new yyn((C12009k4) this.f49005k4.deepClone());
    }
}
