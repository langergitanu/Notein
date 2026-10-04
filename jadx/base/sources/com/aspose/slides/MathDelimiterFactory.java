package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class MathDelimiterFactory implements IMathDelimiterFactory {
    @Override // com.aspose.slides.IMathDelimiterFactory
    public final IMathDelimiter createMathDelimiter(IMathElement iMathElement) {
        return new MathDelimiter(iMathElement);
    }

    @Override // com.aspose.slides.IMathDelimiterFactory
    public final IMathDelimiter createMathDelimiter(IMathElementCollection iMathElementCollection) {
        return new MathDelimiter(iMathElementCollection, null);
    }
}
