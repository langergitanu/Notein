package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class MathBarFactory implements IMathBarFactory {
    @Override // com.aspose.slides.IMathBarFactory
    public final IMathBar createMathBar(IMathElement iMathElement) {
        return new MathBar(iMathElement);
    }

    @Override // com.aspose.slides.IMathBarFactory
    public final IMathBar createMathBar(IMathElement iMathElement, int i) {
        return new MathBar(iMathElement, i);
    }
}
