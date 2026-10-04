package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public final class MathGroupingCharacter extends MathElementBase implements IMathGroupingCharacter, InterfaceC14876z8 {

    /* JADX INFO: renamed from: du */
    private int f2763du;

    /* JADX INFO: renamed from: h4 */
    private int f2764h4;

    /* JADX INFO: renamed from: k4 */
    final p8h f2765k4;

    /* JADX INFO: renamed from: m9 */
    private ue7 f2766m9;

    /* JADX INFO: renamed from: to */
    private char f2767to;

    public MathGroupingCharacter(IMathElement iMathElement) {
        this(iMathElement, (char) 9183, 2, 1);
    }

    @Override // com.aspose.slides.IMathGroupingCharacter
    public final IMathElement getBase() {
        return this.f2766m9.m71681x1();
    }

    @Override // com.aspose.slides.IMathGroupingCharacter
    public final char getCharacter() {
        return this.f2767to;
    }

    @Override // com.aspose.slides.MathElementBase, com.aspose.slides.IMathElement
    public final IMathElement[] getChildren() {
        return getChildren(getBase());
    }

    @Override // com.aspose.slides.InterfaceC14876z8
    public final p8h getControlCharacterProperties() {
        return this.f2765k4;
    }

    @Override // com.aspose.slides.IMathGroupingCharacter
    public final int getPosition() {
        return this.f2763du;
    }

    @Override // com.aspose.slides.IMathGroupingCharacter
    public final int getVerticalJustification() {
        return this.f2764h4;
    }

    @Override // com.aspose.slides.MathElementBase
    /* JADX INFO: renamed from: k4 */
    public void mo1966k4(fx0 fx0Var) {
        fx0Var.mo4385k4(this);
    }

    @Override // com.aspose.slides.IMathGroupingCharacter
    public final void setCharacter(char c) {
        this.f2767to = c;
    }

    @Override // com.aspose.slides.IMathGroupingCharacter
    public final void setPosition(int i) {
        this.f2763du = i;
    }

    @Override // com.aspose.slides.IMathGroupingCharacter
    public final void setVerticalJustification(int i) {
        this.f2764h4 = i;
    }

    public MathGroupingCharacter(IMathElement iMathElement, char c, int i, int i2) {
        this.f2766m9 = ue7.m71676k4(iMathElement, (byte) 0);
        setCharacter(c);
        setPosition(i);
        setVerticalJustification(i2);
        this.f2765k4 = new p8h();
    }
}
