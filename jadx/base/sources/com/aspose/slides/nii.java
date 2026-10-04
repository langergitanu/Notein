package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;

/* JADX INFO: loaded from: classes3.dex */
class nii implements vbl {

    /* JADX INFO: renamed from: k4 */
    public final InterfaceC14751wu f47547k4;

    /* JADX INFO: renamed from: x1 */
    private double f47550x1 = 1.0d;

    /* JADX INFO: renamed from: kk */
    private double f47548kk = 1.0d;

    /* JADX INFO: renamed from: to */
    private float f47549to = 0.0f;

    public nii(InterfaceC14751wu interfaceC14751wu, double d) {
        this.f47547k4 = interfaceC14751wu;
        m68057x1(d);
    }

    @Override // com.aspose.slides.vbl
    /* JADX INFO: renamed from: I_ */
    public final void mo4311I_() {
        this.f47547k4.mo2023k4();
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        if (C7019kk.m27469x1(this.f47547k4, IDisposable.class)) {
            ((IDisposable) C7019kk.m27452k4((Object) this.f47547k4, IDisposable.class)).dispose();
        }
    }

    @Override // com.aspose.slides.vbl
    /* JADX INFO: renamed from: k4 */
    public final void mo4312k4(double d) {
        float f = (float) (d * this.f47548kk);
        this.f47549to = f;
        this.f47547k4.mo2024k4(f);
    }

    @Override // com.aspose.slides.vbl
    /* JADX INFO: renamed from: kk */
    public final double mo4315kk() {
        return this.f47550x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m68057x1(double d) {
        this.f47550x1 = d;
        this.f47548kk = d;
        if (d > 0.0d) {
            this.f47548kk = 1.0d / d;
        }
    }
}
