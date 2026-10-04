package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public final class MathRightSubSuperscriptElement extends BaseScript implements IMathRightSubSuperscriptElement {

    /* JADX INFO: renamed from: du */
    private final IMathElement f2798du;

    /* JADX INFO: renamed from: h4 */
    private final IMathElement f2799h4;

    /* JADX INFO: renamed from: to */
    private boolean f2800to;

    public MathRightSubSuperscriptElement(IMathElement iMathElement, IMathElement iMathElement2, IMathElement iMathElement3) {
        super(iMathElement);
        this.f2798du = iMathElement2;
        this.f2799h4 = iMathElement3;
    }

    @Override // com.aspose.slides.IMathRightSubSuperscriptElement
    public final boolean getAlignScripts() {
        return this.f2800to;
    }

    @Override // com.aspose.slides.MathElementBase, com.aspose.slides.IMathElement
    public final IMathElement[] getChildren() {
        return getChildren(getBase(), getSubscript(), getSuperscript());
    }

    @Override // com.aspose.slides.IMathRightSubSuperscriptElement
    public final IMathElement getSubscript() {
        return this.f2798du;
    }

    @Override // com.aspose.slides.IMathRightSubSuperscriptElement
    public final IMathElement getSuperscript() {
        return this.f2799h4;
    }

    @Override // com.aspose.slides.MathElementBase
    /* JADX INFO: renamed from: k4 */
    public void mo1966k4(fx0 fx0Var) {
        fx0Var.mo4391k4(this);
    }

    @Override // com.aspose.slides.IMathRightSubSuperscriptElement
    public final void setAlignScripts(boolean z) {
        this.f2800to = z;
    }
}
