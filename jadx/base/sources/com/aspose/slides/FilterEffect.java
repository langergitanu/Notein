package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class FilterEffect extends Behavior implements IFilterEffect {

    /* JADX INFO: renamed from: du */
    int f2287du;

    /* JADX INFO: renamed from: h4 */
    int f2288h4;

    /* JADX INFO: renamed from: m9 */
    int f2289m9;

    public FilterEffect() {
        super(new C14578tv());
        this.f2289m9 = -1;
    }

    @Override // com.aspose.slides.IFilterEffect
    public final int getReveal() {
        return this.f2289m9;
    }

    @Override // com.aspose.slides.IFilterEffect
    public final int getSubtype() {
        return this.f2288h4;
    }

    @Override // com.aspose.slides.IFilterEffect
    public final int getType() {
        return this.f2287du;
    }

    @Override // com.aspose.slides.IFilterEffect
    public final void setReveal(int i) {
        this.f2289m9 = i;
    }

    @Override // com.aspose.slides.IFilterEffect
    public final void setSubtype(int i) {
        this.f2288h4 = i;
    }

    @Override // com.aspose.slides.IFilterEffect
    public final void setType(int i) {
        this.f2287du = i;
    }

    @Override // com.aspose.slides.Behavior
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public final C14578tv mo424k4() {
        return (C14578tv) super.mo424k4();
    }
}
