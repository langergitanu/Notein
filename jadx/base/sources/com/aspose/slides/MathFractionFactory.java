package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class MathFractionFactory implements IMathFractionFactory {
    @Override // com.aspose.slides.IMathFractionFactory
    public final IMathFraction createMathFraction(IMathElement iMathElement, IMathElement iMathElement2) {
        return new MathFraction(iMathElement, iMathElement2);
    }

    @Override // com.aspose.slides.IMathFractionFactory
    public final IMathFraction createMathFraction(IMathElement iMathElement, IMathElement iMathElement2, int i) {
        return new MathFraction(iMathElement, iMathElement2, i);
    }
}
