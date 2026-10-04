package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public final class MathAccent extends MathElementBase implements IMathAccent, InterfaceC14876z8 {

    /* JADX INFO: renamed from: du */
    private char f2716du;

    /* JADX INFO: renamed from: k4 */
    final p8h f2717k4;

    /* JADX INFO: renamed from: to */
    private IMathElement f2718to;

    public MathAccent(IMathElement iMathElement) {
        this(iMathElement, (char) 770);
    }

    /* JADX INFO: renamed from: k4 */
    private void m1965k4(IMathElement iMathElement) {
        this.f2718to = iMathElement;
    }

    @Override // com.aspose.slides.IMathAccent
    public final IMathElement getBase() {
        return this.f2718to;
    }

    @Override // com.aspose.slides.IMathAccent
    public final char getCharacter() {
        return this.f2716du;
    }

    @Override // com.aspose.slides.MathElementBase, com.aspose.slides.IMathElement
    public final IMathElement[] getChildren() {
        return getBase() == null ? MathElementBase.f2751kk : new IMathElement[]{getBase()};
    }

    @Override // com.aspose.slides.InterfaceC14876z8
    public final p8h getControlCharacterProperties() {
        return this.f2717k4;
    }

    @Override // com.aspose.slides.IMathAccent
    public final void setCharacter(char c) {
        if (c < 768 || 879 < c) {
        }
        this.f2716du = c;
    }

    public MathAccent(IMathElement iMathElement, char c) {
        m1965k4(iMathElement);
        setCharacter(c);
        this.f2717k4 = new p8h();
    }

    @Override // com.aspose.slides.MathElementBase
    /* JADX INFO: renamed from: k4 */
    public void mo1966k4(fx0 fx0Var) {
        fx0Var.mo4376k4(this);
    }
}
