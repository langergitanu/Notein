package com.aspose.slides.internal.p071cz;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.s2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2892s2 extends C2726fc {

    /* JADX INFO: renamed from: k4 */
    private C2728fh f8741k4;

    private C2892s2(C2892s2 c2892s2) {
        super(c2892s2);
        m12522k4(c2892s2.m12523kk());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12522k4(C2728fh c2728fh) {
        if (c2728fh == this.f8741k4) {
            return;
        }
        this.f8741k4 = c2728fh != null ? c2728fh.cloneT() : null;
    }

    /* JADX INFO: renamed from: kk */
    public final C2728fh m12523kk() {
        return this.f8741k4;
    }

    @Override // com.aspose.slides.internal.p071cz.C2726fc, com.aspose.slides.internal.p071cz.AbstractC2701dn, com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: x1 */
    public AbstractC2701dn cloneT() {
        return new C2892s2(this);
    }
}
