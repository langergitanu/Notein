package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public final class MathSuperscriptElement extends BaseScript implements IMathSuperscriptElement {

    /* JADX INFO: renamed from: to */
    private final ue7 f2802to;

    public MathSuperscriptElement(IMathElement iMathElement, IMathElement iMathElement2) {
        super(iMathElement);
        this.f2802to = ue7.m71676k4(iMathElement2, (byte) -1);
    }

    @Override // com.aspose.slides.MathElementBase, com.aspose.slides.IMathElement
    public final IMathElement[] getChildren() {
        return getChildren(getBase(), getSuperscript());
    }

    @Override // com.aspose.slides.IMathSuperscriptElement
    public final IMathElement getSuperscript() {
        return this.f2802to.m71681x1();
    }

    @Override // com.aspose.slides.MathElementBase
    /* JADX INFO: renamed from: k4 */
    public void mo1966k4(fx0 fx0Var) {
        fx0Var.mo4393k4(this);
    }
}
