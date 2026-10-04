package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public final class MathFraction extends MathElementBase implements IMathFraction, InterfaceC14876z8 {

    /* JADX INFO: renamed from: du */
    private IMathElement f2754du;

    /* JADX INFO: renamed from: h4 */
    private IMathElement f2755h4;

    /* JADX INFO: renamed from: k4 */
    final p8h f2756k4;

    /* JADX INFO: renamed from: to */
    private int f2757to;

    public MathFraction(IMathElement iMathElement, IMathElement iMathElement2) {
        this(iMathElement, iMathElement2, 1);
    }

    /* JADX INFO: renamed from: k4 */
    private void m1988k4(IMathElement iMathElement) {
        this.f2754du = iMathElement;
    }

    /* JADX INFO: renamed from: x1 */
    private void m1989x1(IMathElement iMathElement) {
        this.f2755h4 = iMathElement;
    }

    @Override // com.aspose.slides.MathElementBase, com.aspose.slides.IMathElement
    public final IMathElement[] getChildren() {
        return getChildren(getNumerator(), getDenominator());
    }

    @Override // com.aspose.slides.InterfaceC14876z8
    public final p8h getControlCharacterProperties() {
        return this.f2756k4;
    }

    @Override // com.aspose.slides.IMathFraction
    public final IMathElement getDenominator() {
        return this.f2755h4;
    }

    @Override // com.aspose.slides.IMathFraction
    public final int getFractionType() {
        return this.f2757to;
    }

    @Override // com.aspose.slides.IMathFraction
    public final IMathElement getNumerator() {
        return this.f2754du;
    }

    @Override // com.aspose.slides.IMathFraction
    public final void setFractionType(int i) {
        this.f2757to = i;
    }

    public MathFraction(IMathElement iMathElement, IMathElement iMathElement2, int i) {
        m1988k4(iMathElement);
        m1989x1(iMathElement2);
        setFractionType(i);
        this.f2756k4 = new p8h();
    }

    @Override // com.aspose.slides.MathElementBase
    /* JADX INFO: renamed from: k4 */
    public void mo1966k4(fx0 fx0Var) {
        fx0Var.mo4383k4(this);
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m1990x1() {
        return getFractionType() == 1 && this.f2756k4.m68975k4();
    }
}
