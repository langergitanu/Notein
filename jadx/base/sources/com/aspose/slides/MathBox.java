package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public final class MathBox extends MathElementBase implements IMathBox, InterfaceC14876z8 {

    /* JADX INFO: renamed from: c5 */
    private ue7 f2737c5;

    /* JADX INFO: renamed from: du */
    private boolean f2738du;

    /* JADX INFO: renamed from: dy */
    private byte f2739dy;

    /* JADX INFO: renamed from: h4 */
    private boolean f2740h4;

    /* JADX INFO: renamed from: k4 */
    final p8h f2741k4;

    /* JADX INFO: renamed from: m9 */
    private boolean f2742m9;

    /* JADX INFO: renamed from: to */
    private boolean f2743to;

    public MathBox(IMathElement iMathElement) {
        this.f2737c5 = ue7.m71676k4(iMathElement, (byte) 0);
        setOperatorEmulator(false);
        setNoBreak(true);
        setDifferential(false);
        setAlignmentPoint(false);
        setExplicitBreak((byte) 0);
        this.f2741k4 = new p8h();
    }

    @Override // com.aspose.slides.IMathBox
    public final boolean getAlignmentPoint() {
        return this.f2742m9;
    }

    @Override // com.aspose.slides.IMathBox
    public final IMathElement getBase() {
        return this.f2737c5.m71681x1();
    }

    @Override // com.aspose.slides.MathElementBase, com.aspose.slides.IMathElement
    public final IMathElement[] getChildren() {
        return getBase() == null ? MathElementBase.f2751kk : new IMathElement[]{getBase()};
    }

    @Override // com.aspose.slides.InterfaceC14876z8
    public final p8h getControlCharacterProperties() {
        return this.f2741k4;
    }

    @Override // com.aspose.slides.IMathBox
    public final boolean getDifferential() {
        return this.f2740h4;
    }

    @Override // com.aspose.slides.IMathBox
    public final byte getExplicitBreak() {
        return this.f2739dy;
    }

    @Override // com.aspose.slides.IMathBox
    public final boolean getNoBreak() {
        return this.f2738du;
    }

    @Override // com.aspose.slides.IMathBox
    public final boolean getOperatorEmulator() {
        return this.f2743to;
    }

    @Override // com.aspose.slides.MathElementBase
    /* JADX INFO: renamed from: k4 */
    public void mo1966k4(fx0 fx0Var) {
        fx0Var.mo4381k4(this);
    }

    @Override // com.aspose.slides.IMathBox
    public final void setAlignmentPoint(boolean z) {
        this.f2742m9 = z;
    }

    @Override // com.aspose.slides.IMathBox
    public final void setDifferential(boolean z) {
        this.f2740h4 = z;
    }

    @Override // com.aspose.slides.IMathBox
    public final void setExplicitBreak(byte b) {
        this.f2739dy = b;
    }

    @Override // com.aspose.slides.IMathBox
    public final void setNoBreak(boolean z) {
        this.f2738du = z;
    }

    @Override // com.aspose.slides.IMathBox
    public final void setOperatorEmulator(boolean z) {
        this.f2743to = z;
    }
}
