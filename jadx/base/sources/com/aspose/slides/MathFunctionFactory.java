package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class MathFunctionFactory implements IMathFunctionFactory {
    @Override // com.aspose.slides.IMathFunctionFactory
    public final IMathFunction createMathFunction(IMathElement iMathElement, IMathElement iMathElement2) {
        return new MathFunction(iMathElement, iMathElement2);
    }

    @Override // com.aspose.slides.IMathFunctionFactory
    public final IMathFunction createMathFunction(String str, IMathElement iMathElement) {
        return new MathFunction(str, iMathElement);
    }
}
