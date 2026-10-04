package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public final class MathBar extends MathElementBase implements IMathBar, InterfaceC14876z8 {

    /* JADX INFO: renamed from: du */
    private int f2721du;

    /* JADX INFO: renamed from: k4 */
    final p8h f2722k4;

    /* JADX INFO: renamed from: to */
    private IMathElement f2723to;

    public MathBar(IMathElement iMathElement) {
        this(iMathElement, 2);
    }

    /* JADX INFO: renamed from: k4 */
    private void m1970k4(IMathElement iMathElement) {
        this.f2723to = iMathElement;
    }

    @Override // com.aspose.slides.IMathBar
    public final IMathElement getBase() {
        return this.f2723to;
    }

    @Override // com.aspose.slides.MathElementBase, com.aspose.slides.IMathElement
    public final IMathElement[] getChildren() {
        return getChildren(getBase());
    }

    @Override // com.aspose.slides.InterfaceC14876z8
    public final p8h getControlCharacterProperties() {
        return this.f2722k4;
    }

    @Override // com.aspose.slides.IMathBar
    public final int getPosition() {
        return this.f2721du;
    }

    @Override // com.aspose.slides.IMathBar
    public final void setPosition(int i) {
        this.f2721du = i;
    }

    public MathBar(IMathElement iMathElement, int i) {
        m1970k4(iMathElement);
        setPosition(i);
        this.f2722k4 = new p8h();
    }

    @Override // com.aspose.slides.MathElementBase
    /* JADX INFO: renamed from: k4 */
    public void mo1966k4(fx0 fx0Var) {
        fx0Var.mo4378k4(this);
    }
}
