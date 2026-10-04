package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public final class MathLeftSubSuperscriptElement extends BaseScript implements IMathLeftSubSuperscriptElement {

    /* JADX INFO: renamed from: du */
    private final IMathElement f2768du;

    /* JADX INFO: renamed from: to */
    private final IMathElement f2769to;

    public MathLeftSubSuperscriptElement(IMathElement iMathElement, IMathElement iMathElement2, IMathElement iMathElement3) {
        super(iMathElement);
        this.f2769to = iMathElement2;
        this.f2768du = iMathElement3;
    }

    @Override // com.aspose.slides.MathElementBase, com.aspose.slides.IMathElement
    public final IMathElement[] getChildren() {
        return getChildren(getBase(), getSubscript(), getSuperscript());
    }

    @Override // com.aspose.slides.IMathLeftSubSuperscriptElement
    public final IMathElement getSubscript() {
        return this.f2769to;
    }

    @Override // com.aspose.slides.IMathLeftSubSuperscriptElement
    public final IMathElement getSuperscript() {
        return this.f2768du;
    }

    @Override // com.aspose.slides.MathElementBase
    /* JADX INFO: renamed from: k4 */
    public void mo1966k4(fx0 fx0Var) {
        fx0Var.mo4386k4(this);
    }
}
