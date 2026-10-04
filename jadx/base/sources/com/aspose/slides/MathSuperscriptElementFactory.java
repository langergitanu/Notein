package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class MathSuperscriptElementFactory implements IMathSuperscriptElementFactory {
    @Override // com.aspose.slides.IMathSuperscriptElementFactory
    public final IMathSuperscriptElement createMathSuperscriptElement(IMathElement iMathElement, IMathElement iMathElement2) {
        return new MathSuperscriptElement(iMathElement, iMathElement2);
    }
}
