package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: loaded from: classes3.dex */
final class ofw extends AbstractC1137ga<ShapeBevel, ofw> implements IShapeBevelEffectiveData {

    /* JADX INFO: renamed from: k4 */
    boolean f47771k4;

    /* JADX INFO: renamed from: x1 */
    private double f47774x1 = 6.0d;

    /* JADX INFO: renamed from: kk */
    private double f47772kk = 6.0d;

    /* JADX INFO: renamed from: to */
    private int f47773to = 2;

    public ofw(boolean z) {
        this.f47771k4 = z;
    }

    @Override // com.aspose.slides.IShapeBevelEffectiveData
    public final int getBevelType() {
        return this.f47773to;
    }

    @Override // com.aspose.slides.IShapeBevelEffectiveData
    public final double getHeight() {
        return this.f47772kk;
    }

    @Override // com.aspose.slides.IShapeBevelEffectiveData
    public final double getWidth() {
        return this.f47774x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68516k4() {
        this.f47774x1 = 6.0d;
        this.f47772kk = 6.0d;
        this.f47773to = 2;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68517k4(ShapeBevel shapeBevel) {
        if (shapeBevel.getBevelType() != -1) {
            if (!C14067j2.m66728k4(Double.valueOf(shapeBevel.getWidth()), Double.valueOf(Double.NaN))) {
                this.f47774x1 = shapeBevel.getWidth();
            }
            if (!C14067j2.m66728k4(Double.valueOf(shapeBevel.getHeight()), Double.valueOf(Double.NaN))) {
                this.f47772kk = shapeBevel.getHeight();
            }
            if (shapeBevel.getBevelType() != -1) {
                this.f47773to = shapeBevel.getBevelType();
            }
            this.f47771k4 = shapeBevel.m2602to();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68518k4(InterfaceC14672vc interfaceC14672vc) {
        ofw ofwVar = (ofw) interfaceC14672vc;
        this.f47774x1 = ofwVar.f47774x1;
        this.f47772kk = ofwVar.f47772kk;
        this.f47773to = ofwVar.f47773to;
        this.f47771k4 = ofwVar.f47771k4;
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo4883k4(InterfaceC14672vc interfaceC14672vc, ShapeBevel shapeBevel) {
        m68518k4(interfaceC14672vc);
        m68517k4(shapeBevel);
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public boolean mo4836k4(ofw ofwVar) {
        return ofwVar != null && C3085sv.m13088k4(this.f47774x1, ofwVar.f47774x1) && C3085sv.m13088k4(this.f47772kk, ofwVar.f47772kk) && this.f47773to == ofwVar.f47773to;
    }
}
