package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public final class MathNaryOperator extends MathElementBase implements IMathNaryOperator, InterfaceC14876z8 {

    /* JADX INFO: renamed from: du */
    private ue7 f2784du;

    /* JADX INFO: renamed from: h4 */
    private ue7 f2785h4;

    /* JADX INFO: renamed from: k4 */
    private IMathElement f2786k4;

    /* JADX INFO: renamed from: to */
    private wjx f2787to;

    public MathNaryOperator(char c, IMathElement iMathElement) {
        this(c, iMathElement, (IMathElement) null, (IMathElement) null);
    }

    /* JADX INFO: renamed from: k4 */
    private void m1994k4(IMathElement iMathElement) {
        this.f2786k4 = iMathElement;
    }

    @Override // com.aspose.slides.IMathNaryOperator
    public final IMathElement getBase() {
        return this.f2786k4;
    }

    @Override // com.aspose.slides.MathElementBase, com.aspose.slides.IMathElement
    public final IMathElement[] getChildren() {
        return getChildren(getBase(), getSubscript(), getSuperscript());
    }

    @Override // com.aspose.slides.InterfaceC14876z8
    public final p8h getControlCharacterProperties() {
        return this.f2787to.m72774x1();
    }

    @Override // com.aspose.slides.IMathNaryOperatorProperties
    public final boolean getGrowToMatchOperandHeight() {
        return this.f2787to.getGrowToMatchOperandHeight();
    }

    @Override // com.aspose.slides.IMathNaryOperatorProperties
    public final boolean getHideSubscript() {
        return this.f2787to.getHideSubscript();
    }

    @Override // com.aspose.slides.IMathNaryOperatorProperties
    public final boolean getHideSuperscript() {
        return this.f2787to.getHideSuperscript();
    }

    @Override // com.aspose.slides.IMathNaryOperatorProperties
    public final int getLimitLocation() {
        return this.f2787to.getLimitLocation();
    }

    @Override // com.aspose.slides.IMathNaryOperatorProperties
    public final char getOperator() {
        return this.f2787to.getOperator();
    }

    @Override // com.aspose.slides.IMathNaryOperator
    public final IMathElement getSubscript() {
        return this.f2784du.m71681x1();
    }

    @Override // com.aspose.slides.IMathNaryOperator
    public final IMathElement getSuperscript() {
        return this.f2785h4.m71681x1();
    }

    @Override // com.aspose.slides.IMathNaryOperatorProperties
    public final void setGrowToMatchOperandHeight(boolean z) {
        this.f2787to.setGrowToMatchOperandHeight(z);
    }

    @Override // com.aspose.slides.IMathNaryOperatorProperties
    public final void setHideSubscript(boolean z) {
        this.f2787to.setHideSubscript(z);
    }

    @Override // com.aspose.slides.IMathNaryOperatorProperties
    public final void setHideSuperscript(boolean z) {
        this.f2787to.setHideSuperscript(z);
    }

    @Override // com.aspose.slides.IMathNaryOperatorProperties
    public final void setLimitLocation(int i) {
        this.f2787to.setLimitLocation(i);
    }

    @Override // com.aspose.slides.IMathNaryOperatorProperties
    public final void setOperator(char c) {
        this.f2787to.setOperator(c);
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m1995x1() {
        return this.f2787to.m72773k4();
    }

    public MathNaryOperator(char c, IMathElement iMathElement, IMathElement iMathElement2) {
        this(c, iMathElement, iMathElement2, (IMathElement) null);
    }

    @Override // com.aspose.slides.MathElementBase
    /* JADX INFO: renamed from: k4 */
    public void mo1966k4(fx0 fx0Var) {
        fx0Var.mo4389k4(this);
    }

    public MathNaryOperator(char c, IMathElement iMathElement, IMathElement iMathElement2, IMathElement iMathElement3) {
        this(iMathElement, iMathElement2, iMathElement3, new wjx(c, iMathElement2 == null, iMathElement3 == null));
    }

    public MathNaryOperator(IMathElement iMathElement, IMathElement iMathElement2, IMathElement iMathElement3, IMathNaryOperatorProperties iMathNaryOperatorProperties) {
        m1994k4(iMathElement);
        this.f2784du = ue7.m71676k4(iMathElement2, (byte) -1);
        this.f2785h4 = ue7.m71676k4(iMathElement3, (byte) -1);
        ue7 ue7Var = this.f2784du;
        if (ue7Var != null && ue7Var.m71681x1() != null) {
            ((MathElementBase) this.f2784du.m71681x1()).m1986k4(this);
        }
        this.f2787to = iMathNaryOperatorProperties != null ? new wjx(iMathNaryOperatorProperties) : new wjx();
    }
}
