package com.aspose.slides.internal.p071cz;

import com.aspose.slides.IGenericCloneable;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.tl */
/* JADX INFO: loaded from: classes3.dex */
public final class C2910tl implements IGenericCloneable<C2910tl> {

    /* JADX INFO: renamed from: du */
    private final C2706dw f8748du;

    /* JADX INFO: renamed from: h4 */
    private final C2867q6 f8749h4;

    /* JADX INFO: renamed from: k4 */
    private final double f8750k4;

    /* JADX INFO: renamed from: kk */
    private final double f8751kk;

    /* JADX INFO: renamed from: to */
    private final double f8752to;

    /* JADX INFO: renamed from: x1 */
    private final double f8753x1;

    public C2910tl(double d, double d2, double d3, double d4) {
        this.f8753x1 = d2;
        this.f8750k4 = d;
        this.f8752to = d4;
        this.f8751kk = d3;
        this.f8748du = new C2706dw(d, d2);
        this.f8749h4 = new C2867q6(d3 - d, d4 - d2);
    }

    /* JADX INFO: renamed from: k4 */
    public C2706dw m12534k4() {
        return this.f8748du;
    }

    @Override // com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: kk, reason: merged with bridge method [inline-methods] */
    public C2910tl cloneT() {
        return new C2910tl(this.f8750k4, this.f8753x1, this.f8751kk, this.f8752to);
    }

    /* JADX INFO: renamed from: x1 */
    public C2867q6 m12536x1() {
        return this.f8749h4;
    }

    public C2910tl(C2706dw c2706dw, C2867q6 c2867q6) {
        double dM12212x1 = c2706dw.m12212x1();
        this.f8753x1 = dM12212x1;
        double dM12210k4 = c2706dw.m12210k4();
        this.f8750k4 = dM12210k4;
        this.f8752to = c2867q6.m12484x1() + dM12212x1;
        this.f8751kk = c2867q6.m12482k4() + dM12210k4;
        this.f8748du = c2706dw.cloneT();
        this.f8749h4 = c2867q6.cloneT();
    }
}
