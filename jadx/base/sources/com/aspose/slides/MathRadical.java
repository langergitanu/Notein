package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public final class MathRadical extends MathElementBase implements IMathRadical, InterfaceC14876z8 {

    /* JADX INFO: renamed from: du */
    private final IMathElement f2794du;

    /* JADX INFO: renamed from: h4 */
    private ue7 f2795h4;

    /* JADX INFO: renamed from: k4 */
    final p8h f2796k4 = new p8h();

    /* JADX INFO: renamed from: to */
    private boolean f2797to;

    public MathRadical(IMathElement iMathElement, IMathElement iMathElement2) {
        this.f2794du = iMathElement;
        this.f2795h4 = ue7.m71676k4(iMathElement2, (byte) -2);
    }

    @Override // com.aspose.slides.IMathRadical
    public final IMathElement getBase() {
        return this.f2794du;
    }

    @Override // com.aspose.slides.MathElementBase, com.aspose.slides.IMathElement
    public final IMathElement[] getChildren() {
        return getChildren(getBase(), getDegree());
    }

    @Override // com.aspose.slides.InterfaceC14876z8
    public final p8h getControlCharacterProperties() {
        return this.f2796k4;
    }

    @Override // com.aspose.slides.IMathRadical
    public final IMathElement getDegree() {
        return this.f2795h4.m71681x1();
    }

    @Override // com.aspose.slides.IMathRadical
    public final boolean getHideDegree() {
        return this.f2797to;
    }

    @Override // com.aspose.slides.MathElementBase
    /* JADX INFO: renamed from: k4 */
    public void mo1966k4(fx0 fx0Var) {
        fx0Var.mo4390k4(this);
    }

    @Override // com.aspose.slides.IMathRadical
    public final void setHideDegree(boolean z) {
        this.f2797to = z;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m2003x1() {
        return !getHideDegree() && this.f2796k4.m68975k4();
    }
}
