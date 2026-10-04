package com.aspose.slides;

/* JADX INFO: renamed from: com.aspose.slides.jp */
/* JADX INFO: loaded from: classes3.dex */
final class C13697jp extends AbstractC1137ga<EffectStyle, C13697jp> implements IEffectStyleEffectiveData {

    /* JADX INFO: renamed from: k4 */
    C14754wx f45541k4 = new C14754wx((EffectFormat) null);

    /* JADX INFO: renamed from: x1 */
    fpw f45542x1 = new fpw(null);

    @Override // com.aspose.slides.IEffectStyleEffectiveData
    public final IEffectFormatEffectiveData getEffectFormat() {
        return this.f45541k4;
    }

    @Override // com.aspose.slides.IEffectStyleEffectiveData
    public final IThreeDFormatEffectiveData getThreeDFormat() {
        return this.f45542x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63479k4() {
        this.f45541k4.m72947h4();
        this.f45542x1.m6254h4();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63480k4(EffectStyle effectStyle) {
        if (effectStyle == null) {
            return;
        }
        this.f45541k4.m72951x1((EffectFormat) effectStyle.getEffectFormat());
        this.f45542x1.m6260x1((ThreeDFormat) effectStyle.getThreeDFormat());
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4 */
    public void mo4833k4(IBaseSlide iBaseSlide, dm6 dm6Var) {
        this.f45541k4.mo4833k4(iBaseSlide, dm6Var);
        this.f45542x1.mo4833k4(iBaseSlide, dm6Var);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63481k4(InterfaceC14672vc interfaceC14672vc) {
        if (interfaceC14672vc == null) {
            return;
        }
        C13697jp c13697jp = (C13697jp) interfaceC14672vc;
        this.f45541k4.m72948k4((InterfaceC14672vc) c13697jp.f45541k4);
        this.f45542x1.m6256k4((InterfaceC14672vc) c13697jp.f45542x1);
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo4883k4(InterfaceC14672vc interfaceC14672vc, EffectStyle effectStyle) {
        m63481k4(interfaceC14672vc);
        m63480k4(effectStyle);
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public boolean mo4836k4(C13697jp c13697jp) {
        return c13697jp != null && this.f45541k4.mo4836k4(c13697jp.f45541k4) && this.f45542x1.mo4836k4(c13697jp.f45542x1);
    }
}
