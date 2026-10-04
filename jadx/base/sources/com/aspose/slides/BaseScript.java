package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseScript extends MathElementBase implements InterfaceC14876z8 {

    /* JADX INFO: renamed from: k4 */
    final p8h f1061k4 = new p8h();

    /* JADX INFO: renamed from: to */
    private final IMathElement f1062to;

    public BaseScript(IMathElement iMathElement) {
        this.f1062to = iMathElement;
    }

    public final IMathElement getBase() {
        return this.f1062to;
    }

    @Override // com.aspose.slides.InterfaceC14876z8
    public final p8h getControlCharacterProperties() {
        return this.f1061k4;
    }
}
