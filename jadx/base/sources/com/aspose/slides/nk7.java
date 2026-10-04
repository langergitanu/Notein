package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

/* JADX INFO: loaded from: classes3.dex */
final class nk7 extends AbstractC14440s9 implements vbl {

    /* JADX INFO: renamed from: kk */
    private double f47557kk;

    /* JADX INFO: renamed from: x1 */
    private int f47558x1;

    public nk7(vbl vblVar, int i) {
        super(vblVar);
        this.f47558x1 = 1;
        m68066k4(i);
    }

    @Override // com.aspose.slides.vbl
    /* JADX INFO: renamed from: k4 */
    public final void mo4312k4(double d) {
        this.f48787k4.mo4312k4(d % this.f48787k4.mo4315kk());
    }

    @Override // com.aspose.slides.vbl
    /* JADX INFO: renamed from: kk */
    public final double mo4315kk() {
        return this.f47557kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m68067x1() {
        return this.f47558x1;
    }

    /* JADX INFO: renamed from: x1 */
    private void m68065x1(double d) {
        this.f47557kk = d;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68066k4(int i) {
        if (this.f47558x1 == i) {
            return;
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f47558x1 = i;
        m68065x1(this.f48787k4.mo4315kk() * ((double) m68067x1()));
    }
}
