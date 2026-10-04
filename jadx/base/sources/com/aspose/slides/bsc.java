package com.aspose.slides;

import com.aspose.slides.PropertyEffectPlaying;

/* JADX INFO: loaded from: classes3.dex */
final class bsc implements InterfaceC14751wu {

    /* JADX INFO: renamed from: k4 */
    private final kdz f4241k4;

    /* JADX INFO: renamed from: kk */
    private final InterfaceC1130g3 f4242kk;

    /* JADX INFO: renamed from: to */
    private final InterfaceC1130g3 f4244to;

    /* JADX INFO: renamed from: x1 */
    private final PropertyEffectPlaying.SetValueHandler f4245x1;

    /* JADX INFO: renamed from: du */
    private float f4239du = 0.0f;

    /* JADX INFO: renamed from: h4 */
    private float f4240h4 = 0.0f;

    /* JADX INFO: renamed from: m9 */
    private boolean f4243m9 = true;

    public bsc(kdz kdzVar, PropertyEffectPlaying.SetValueHandler setValueHandler, InterfaceC1130g3 interfaceC1130g3, InterfaceC1130g3 interfaceC1130g32) {
        this.f4241k4 = kdzVar;
        this.f4245x1 = setValueHandler;
        this.f4242kk = interfaceC1130g3;
        this.f4244to = interfaceC1130g32;
    }

    @Override // com.aspose.slides.InterfaceC14751wu
    /* JADX INFO: renamed from: k4 */
    public final void mo2023k4() {
        if (this.f4243m9) {
            this.f4239du = this.f4242kk.mo6404k4(this.f4241k4);
            this.f4240h4 = this.f4244to.mo6404k4(this.f4241k4);
        }
        this.f4245x1.invoke(this.f4240h4);
    }

    @Override // com.aspose.slides.InterfaceC14751wu
    /* JADX INFO: renamed from: k4 */
    public final void mo2024k4(float f) {
        if (this.f4243m9) {
            this.f4243m9 = false;
            this.f4239du = this.f4242kk.mo6404k4(this.f4241k4);
            this.f4240h4 = this.f4244to.mo6404k4(this.f4241k4);
        }
        float f2 = this.f4239du;
        this.f4245x1.invoke(OooOO0.OooO0OO.OooO0O0(this.f4240h4, f2, f, f2));
    }
}
