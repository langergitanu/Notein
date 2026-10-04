package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public final class MathLimit extends MathElementBase implements IMathLimit, InterfaceC14876z8 {

    /* JADX INFO: renamed from: du */
    private IMathElement f2770du;

    /* JADX INFO: renamed from: h4 */
    private ue7 f2771h4;

    /* JADX INFO: renamed from: k4 */
    final p8h f2772k4;

    /* JADX INFO: renamed from: to */
    private boolean f2773to;

    public MathLimit(IMathElement iMathElement, IMathElement iMathElement2) {
        this(iMathElement, iMathElement2, false);
    }

    @Override // com.aspose.slides.IMathLimit
    public final IMathElement getBase() {
        return this.f2770du;
    }

    @Override // com.aspose.slides.MathElementBase, com.aspose.slides.IMathElement
    public final IMathElement[] getChildren() {
        return getChildren(getBase(), getLimit());
    }

    @Override // com.aspose.slides.InterfaceC14876z8
    public final p8h getControlCharacterProperties() {
        return this.f2772k4;
    }

    @Override // com.aspose.slides.IMathLimit
    public final IMathElement getLimit() {
        return this.f2771h4.m71681x1();
    }

    @Override // com.aspose.slides.IMathLimit
    public final boolean getUpperLimit() {
        return this.f2773to;
    }

    @Override // com.aspose.slides.MathElementBase
    /* JADX INFO: renamed from: k4 */
    public void mo1966k4(fx0 fx0Var) {
        fx0Var.mo4387k4(this);
    }

    @Override // com.aspose.slides.IMathLimit
    public final void setUpperLimit(boolean z) {
        this.f2773to = z;
    }

    public MathLimit(IMathElement iMathElement, IMathElement iMathElement2, boolean z) {
        this.f2770du = iMathElement;
        this.f2771h4 = ue7.m71676k4(iMathElement2, (byte) -1);
        setUpperLimit(z);
        this.f2772k4 = new p8h();
    }
}
