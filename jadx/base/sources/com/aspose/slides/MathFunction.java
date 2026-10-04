package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public final class MathFunction extends MathElementBase implements IMathFunction, InterfaceC14876z8 {

    /* JADX INFO: renamed from: du */
    private IMathElement f2758du;

    /* JADX INFO: renamed from: k4 */
    final p8h f2759k4;

    /* JADX INFO: renamed from: to */
    private IMathElement f2760to;

    public MathFunction(IMathElement iMathElement, IMathElement iMathElement2) {
        m1991k4(iMathElement);
        m1992x1(iMathElement2);
        this.f2759k4 = new p8h();
    }

    /* JADX INFO: renamed from: k4 */
    private void m1991k4(IMathElement iMathElement) {
        this.f2760to = iMathElement;
    }

    /* JADX INFO: renamed from: x1 */
    private void m1992x1(IMathElement iMathElement) {
        this.f2758du = iMathElement;
    }

    @Override // com.aspose.slides.IMathFunction
    public final IMathElement getBase() {
        return this.f2758du;
    }

    @Override // com.aspose.slides.MathElementBase, com.aspose.slides.IMathElement
    public final IMathElement[] getChildren() {
        return getChildren(getName(), getBase());
    }

    @Override // com.aspose.slides.InterfaceC14876z8
    public final p8h getControlCharacterProperties() {
        return this.f2759k4;
    }

    @Override // com.aspose.slides.IMathFunction
    public final IMathElement getName() {
        return this.f2760to;
    }

    public MathFunction(String str, IMathElement iMathElement) {
        this(new MathematicalText(str), iMathElement);
    }

    @Override // com.aspose.slides.MathElementBase
    /* JADX INFO: renamed from: k4 */
    public void mo1966k4(fx0 fx0Var) {
        fx0Var.mo4384k4(this);
    }
}
