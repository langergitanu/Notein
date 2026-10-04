package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
class n6c implements InterfaceC13755l1 {

    /* JADX INFO: renamed from: k4 */
    private double f47478k4;

    /* JADX INFO: renamed from: kk */
    private C1095fc f47479kk;

    /* JADX INFO: renamed from: to */
    private boolean f47480to;

    /* JADX INFO: renamed from: x1 */
    private mtk f47481x1 = new mtk();

    public n6c(mtk mtkVar, C1095fc c1095fc) {
        reset();
        mtkVar.CloneTo(this.f47481x1);
        this.f47479kk = c1095fc;
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
    }

    @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    public final boolean hasNext() {
        if (this.f47480to) {
            m67875k4(Double.NaN);
            return false;
        }
        m67875k4(this.f47481x1.m67725kk(this.f47479kk));
        this.f47480to = true;
        return true;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericEnumerator, com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public Double next() {
        return Double.valueOf(this.f47478k4);
    }

    @Override // com.aspose.slides.Collections.IEnumerator
    public final void reset() {
        m67875k4(Double.NaN);
        this.f47480to = false;
    }

    /* JADX INFO: renamed from: k4 */
    private void m67875k4(double d) {
        this.f47478k4 = d;
    }
}
