package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

/* JADX INFO: renamed from: com.aspose.slides.yz */
/* JADX INFO: loaded from: classes3.dex */
final class C14867yz extends AbstractC14440s9 implements vbl {

    /* JADX INFO: renamed from: kk */
    private double f50429kk;

    /* JADX INFO: renamed from: x1 */
    public final double f50430x1;

    public C14867yz(vbl vblVar, double d) {
        super(vblVar);
        if (d < 0.0d) {
            throw new ArgumentOutOfRangeException("delay");
        }
        this.f50430x1 = d;
        m74151x1(d + vblVar.mo4315kk());
    }

    /* JADX INFO: renamed from: x1 */
    private void m74151x1(double d) {
        this.f50429kk = d;
    }

    @Override // com.aspose.slides.vbl
    /* JADX INFO: renamed from: k4 */
    public final void mo4312k4(double d) {
        double d2 = this.f50430x1;
        if (d < d2) {
            return;
        }
        this.f48787k4.mo4312k4(d - d2);
    }

    @Override // com.aspose.slides.vbl
    /* JADX INFO: renamed from: kk */
    public final double mo4315kk() {
        return this.f50429kk;
    }
}
