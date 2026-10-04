package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class PropertyEffect extends Behavior implements IPropertyEffect {

    /* JADX INFO: renamed from: du */
    String f3183du;

    /* JADX INFO: renamed from: h4 */
    String f3185h4;

    /* JADX INFO: renamed from: m9 */
    String f3187m9;

    /* JADX INFO: renamed from: dy */
    PointCollection f3184dy = new PointCollection();

    /* JADX INFO: renamed from: c5 */
    int f3182c5 = -1;

    /* JADX INFO: renamed from: jd */
    int f3186jd = -1;

    @Override // com.aspose.slides.IPropertyEffect
    public final String getBy() {
        return this.f3187m9;
    }

    @Override // com.aspose.slides.IPropertyEffect
    public final int getCalcMode() {
        return this.f3182c5;
    }

    @Override // com.aspose.slides.IPropertyEffect
    public final String getFrom() {
        return this.f3183du;
    }

    @Override // com.aspose.slides.IPropertyEffect
    public final IPointCollection getPoints() {
        return this.f3184dy;
    }

    @Override // com.aspose.slides.IPropertyEffect
    public final String getTo() {
        return this.f3185h4;
    }

    @Override // com.aspose.slides.IPropertyEffect
    public final int getValueType() {
        return this.f3186jd;
    }

    @Override // com.aspose.slides.IPropertyEffect
    public final void setBy(String str) {
        this.f3187m9 = str;
    }

    @Override // com.aspose.slides.IPropertyEffect
    public final void setCalcMode(int i) {
        this.f3182c5 = i;
    }

    @Override // com.aspose.slides.IPropertyEffect
    public final void setFrom(String str) {
        this.f3183du = str;
    }

    @Override // com.aspose.slides.IPropertyEffect
    public final void setPoints(IPointCollection iPointCollection) {
        this.f3184dy = (PointCollection) iPointCollection;
    }

    @Override // com.aspose.slides.IPropertyEffect
    public final void setTo(String str) {
        this.f3185h4 = str;
    }

    @Override // com.aspose.slides.IPropertyEffect
    public final void setValueType(int i) {
        this.f3186jd = i;
    }
}
