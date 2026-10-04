package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class MathNaryOperatorFactory implements IMathNaryOperatorFactory {
    @Override // com.aspose.slides.IMathNaryOperatorFactory
    public final IMathNaryOperator createMathNaryOperator(char c, IMathElement iMathElement) {
        return new MathNaryOperator(c, iMathElement);
    }

    @Override // com.aspose.slides.IMathNaryOperatorFactory
    public final IMathNaryOperator createMathNaryOperator(char c, IMathElement iMathElement, IMathElement iMathElement2) {
        return new MathNaryOperator(c, iMathElement, iMathElement2);
    }

    @Override // com.aspose.slides.IMathNaryOperatorFactory
    public final IMathNaryOperator createMathNaryOperator(char c, IMathElement iMathElement, IMathElement iMathElement2, IMathElement iMathElement3) {
        return new MathNaryOperator(c, iMathElement, iMathElement2, iMathElement3);
    }
}
