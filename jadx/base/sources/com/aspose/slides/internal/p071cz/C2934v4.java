package com.aspose.slides.internal.p071cz;

import com.aspose.slides.IGenericCloneable;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.v4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2934v4 implements IGenericCloneable<C2934v4> {

    /* JADX INFO: renamed from: k4 */
    private C2702dp f8782k4;

    /* JADX INFO: renamed from: kk */
    private C2870qc f8783kk;

    /* JADX INFO: renamed from: x1 */
    private C2870qc f8784x1;

    public C2934v4() {
        this.f8782k4 = new C2702dp();
        this.f8784x1 = new C2870qc();
        this.f8783kk = new C2870qc();
        this.f8782k4 = new C2702dp(0.0d, 0.0d, 0.0d);
        this.f8784x1 = new C2870qc(0.0d, 0.0d, 1.0d);
        this.f8783kk = new C2870qc(0.0d, 1.0d, 0.0d);
    }

    @Override // com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C2934v4 cloneT() {
        C2934v4 c2934v4 = new C2934v4();
        this.f8782k4.CloneTo(c2934v4.f8782k4);
        this.f8784x1.CloneTo(c2934v4.f8784x1);
        this.f8783kk.CloneTo(c2934v4.f8783kk);
        return c2934v4;
    }
}
