package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public final class MathSubscriptElement extends BaseScript implements IMathSubscriptElement {

    /* JADX INFO: renamed from: to */
    private final ue7 f2801to;

    public MathSubscriptElement(IMathElement iMathElement, IMathElement iMathElement2) {
        super(iMathElement);
        this.f2801to = ue7.m71676k4(iMathElement2, (byte) -1);
    }

    @Override // com.aspose.slides.MathElementBase, com.aspose.slides.IMathElement
    public final IMathElement[] getChildren() {
        return getChildren(getBase(), getSubscript());
    }

    @Override // com.aspose.slides.IMathSubscriptElement
    public final IMathElement getSubscript() {
        return this.f2801to.m71681x1();
    }

    @Override // com.aspose.slides.MathElementBase
    /* JADX INFO: renamed from: k4 */
    public void mo1966k4(fx0 fx0Var) {
        fx0Var.mo4392k4(this);
    }

    /* JADX INFO: renamed from: x1 */
    public final ue7 m2004x1() {
        return this.f2801to;
    }
}
