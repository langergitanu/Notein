package com.aspose.slides.internal.p071cz;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.dd */
/* JADX INFO: loaded from: classes3.dex */
public final class C2696dd extends AbstractC2679c1 {

    /* JADX INFO: renamed from: k4 */
    private C2939vm f8556k4;

    /* JADX INFO: renamed from: x1 */
    private int f8557x1;

    public C2696dd(C2939vm c2939vm, int i) {
        m12201k4(c2939vm);
        m12200k4(i);
    }

    /* JADX INFO: renamed from: k4 */
    public final C2939vm m12199k4() {
        return this.f8556k4;
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2679c1, com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: kk */
    public AbstractC2679c1 cloneT() {
        return new C2696dd(this.f8556k4, this.f8557x1);
    }

    /* JADX INFO: renamed from: x1 */
    public final int m12202x1() {
        return this.f8557x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12200k4(int i) {
        this.f8557x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12201k4(C2939vm c2939vm) {
        this.f8556k4 = c2939vm;
    }
}
