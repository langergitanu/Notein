package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public final class MathBorderBox extends MathElementBase implements IMathBorderBox, InterfaceC14876z8 {

    /* JADX INFO: renamed from: c5 */
    private boolean f2727c5;

    /* JADX INFO: renamed from: ck */
    private boolean f2728ck;

    /* JADX INFO: renamed from: du */
    private boolean f2729du;

    /* JADX INFO: renamed from: dy */
    private boolean f2730dy;

    /* JADX INFO: renamed from: fa */
    private boolean f2731fa;

    /* JADX INFO: renamed from: h4 */
    private boolean f2732h4;

    /* JADX INFO: renamed from: jd */
    private boolean f2733jd;

    /* JADX INFO: renamed from: k4 */
    final p8h f2734k4;

    /* JADX INFO: renamed from: m9 */
    private boolean f2735m9;

    /* JADX INFO: renamed from: to */
    private IMathElement f2736to;

    public MathBorderBox(IMathElement iMathElement) {
        m1977k4(iMathElement);
        this.f2734k4 = new p8h();
    }

    /* JADX INFO: renamed from: k4 */
    private void m1977k4(IMathElement iMathElement) {
        this.f2736to = iMathElement;
    }

    @Override // com.aspose.slides.IMathBorderBox
    public final IMathElement getBase() {
        return this.f2736to;
    }

    @Override // com.aspose.slides.MathElementBase, com.aspose.slides.IMathElement
    public final IMathElement[] getChildren() {
        return getBase() == null ? MathElementBase.f2751kk : new IMathElement[]{getBase()};
    }

    @Override // com.aspose.slides.InterfaceC14876z8
    public final p8h getControlCharacterProperties() {
        return this.f2734k4;
    }

    @Override // com.aspose.slides.IMathBorderBox
    public final boolean getHideBottom() {
        return this.f2732h4;
    }

    @Override // com.aspose.slides.IMathBorderBox
    public final boolean getHideLeft() {
        return this.f2735m9;
    }

    @Override // com.aspose.slides.IMathBorderBox
    public final boolean getHideRight() {
        return this.f2730dy;
    }

    @Override // com.aspose.slides.IMathBorderBox
    public final boolean getHideTop() {
        return this.f2729du;
    }

    @Override // com.aspose.slides.IMathBorderBox
    public final boolean getStrikethroughBottomLeftToTopRight() {
        return this.f2728ck;
    }

    @Override // com.aspose.slides.IMathBorderBox
    public final boolean getStrikethroughHorizontal() {
        return this.f2727c5;
    }

    @Override // com.aspose.slides.IMathBorderBox
    public final boolean getStrikethroughTopLeftToBottomRight() {
        return this.f2731fa;
    }

    @Override // com.aspose.slides.IMathBorderBox
    public final boolean getStrikethroughVertical() {
        return this.f2733jd;
    }

    @Override // com.aspose.slides.IMathBorderBox
    public final void setHideBottom(boolean z) {
        this.f2732h4 = z;
    }

    @Override // com.aspose.slides.IMathBorderBox
    public final void setHideLeft(boolean z) {
        this.f2735m9 = z;
    }

    @Override // com.aspose.slides.IMathBorderBox
    public final void setHideRight(boolean z) {
        this.f2730dy = z;
    }

    @Override // com.aspose.slides.IMathBorderBox
    public final void setHideTop(boolean z) {
        this.f2729du = z;
    }

    @Override // com.aspose.slides.IMathBorderBox
    public final void setStrikethroughBottomLeftToTopRight(boolean z) {
        this.f2728ck = z;
    }

    @Override // com.aspose.slides.IMathBorderBox
    public final void setStrikethroughHorizontal(boolean z) {
        this.f2727c5 = z;
    }

    @Override // com.aspose.slides.IMathBorderBox
    public final void setStrikethroughTopLeftToBottomRight(boolean z) {
        this.f2731fa = z;
    }

    @Override // com.aspose.slides.IMathBorderBox
    public final void setStrikethroughVertical(boolean z) {
        this.f2733jd = z;
    }

    public MathBorderBox(IMathElement iMathElement, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this(iMathElement);
        setHideTop(z);
        setHideBottom(z2);
        setHideLeft(z3);
        setHideRight(z4);
        setStrikethroughHorizontal(z5);
        setStrikethroughVertical(z6);
        setStrikethroughBottomLeftToTopRight(z7);
        setStrikethroughTopLeftToBottomRight(z8);
    }

    @Override // com.aspose.slides.MathElementBase
    /* JADX INFO: renamed from: k4 */
    public void mo1966k4(fx0 fx0Var) {
        fx0Var.mo4380k4(this);
    }
}
