package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;

/* JADX INFO: loaded from: classes3.dex */
final class nw7 extends AbstractC1137ga<SketchFormat, nw7> implements ISketchFormatEffectiveData {

    /* JADX INFO: renamed from: k4 */
    long f47632k4 = 1219033472;

    /* JADX INFO: renamed from: x1 */
    int f47633x1 = -1;

    @Override // com.aspose.slides.ISketchFormatEffectiveData
    public final int getSketchType() {
        return this.f47633x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68234k4() {
        this.f47632k4 = 1219033472L;
        this.f47633x1 = -1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68235k4(SketchFormat sketchFormat) {
        if (sketchFormat.getSketchType() != -1) {
            this.f47632k4 = sketchFormat.m2678to();
            this.f47633x1 = sketchFormat.getSketchType();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68236k4(InterfaceC14672vc interfaceC14672vc) {
        nw7 nw7Var = (nw7) interfaceC14672vc;
        this.f47632k4 = nw7Var.f47632k4;
        this.f47633x1 = nw7Var.f47633x1;
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo4883k4(InterfaceC14672vc interfaceC14672vc, SketchFormat sketchFormat) {
        m68236k4(interfaceC14672vc);
        m68235k4(sketchFormat);
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public boolean mo4836k4(nw7 nw7Var) {
        return nw7Var != null && C3085sv.m13089k4((float) (this.f47632k4 & 4294967295L), (float) (nw7Var.f47632k4 & 4294967295L)) && this.f47633x1 == nw7Var.f47633x1;
    }
}
