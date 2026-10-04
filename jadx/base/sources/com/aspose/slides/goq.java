package com.aspose.slides;

import com.aspose.slides.PropertyEffectPlaying;

/* JADX INFO: loaded from: classes3.dex */
final class goq implements InterfaceC14751wu {

    /* JADX INFO: renamed from: k4 */
    private final kdz f5295k4;

    /* JADX INFO: renamed from: kk */
    private final PropertyEffectPlaying.SetValueHandler f5296kk;

    /* JADX INFO: renamed from: x1 */
    private final InterfaceC1130g3 f5297x1;

    public goq(kdz kdzVar, InterfaceC1130g3 interfaceC1130g3, PropertyEffectPlaying.SetValueHandler setValueHandler) {
        this.f5295k4 = kdzVar;
        this.f5297x1 = interfaceC1130g3;
        this.f5296kk = setValueHandler;
    }

    @Override // com.aspose.slides.InterfaceC14751wu
    /* JADX INFO: renamed from: k4 */
    public final void mo2023k4() {
        mo2024k4(1.0f);
    }

    @Override // com.aspose.slides.InterfaceC14751wu
    /* JADX INFO: renamed from: k4 */
    public final void mo2024k4(float f) {
        kdz kdzVar = this.f5295k4;
        kdzVar.f45670x1 = f;
        this.f5296kk.invoke(this.f5297x1.mo6404k4(kdzVar));
    }
}
