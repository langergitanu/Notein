package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
class vqo implements InterfaceC13755l1 {

    /* JADX INFO: renamed from: k4 */
    private double f49683k4;

    /* JADX INFO: renamed from: kk */
    private InterfaceC14885zh f49684kk;

    /* JADX INFO: renamed from: to */
    private int f49685to;

    /* JADX INFO: renamed from: x1 */
    private C1095fc f49686x1;

    public vqo(InterfaceC14885zh interfaceC14885zh, C1095fc c1095fc) {
        reset();
        this.f49684kk = interfaceC14885zh;
        this.f49686x1 = c1095fc;
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
    }

    @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.f49685to + 1;
            this.f49685to = i;
            if (i >= this.f49684kk.mo7367dy()) {
                m72482k4(Double.NaN);
                return false;
            }
            InterfaceC1124fx interfaceC1124fxMo7370k4 = this.f49684kk.mo7370k4(this.f49685to);
            if (interfaceC1124fxMo7370k4.mo3431dy() == 2) {
                m72482k4(Double.NaN);
                throw new mdp((String) interfaceC1124fxMo7370k4.mo3449to());
            }
            if (interfaceC1124fxMo7370k4.mo3431dy() == 1 && interfaceC1124fxMo7370k4.mo3433h4() != null) {
                m72482k4(interfaceC1124fxMo7370k4.mo3433h4().doubleValue());
                return true;
            }
        }
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericEnumerator, com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public Double next() {
        return Double.valueOf(this.f49683k4);
    }

    @Override // com.aspose.slides.Collections.IEnumerator
    public final void reset() {
        m72482k4(Double.NaN);
        this.f49685to = -1;
    }

    /* JADX INFO: renamed from: k4 */
    private void m72482k4(double d) {
        this.f49683k4 = d;
    }
}
