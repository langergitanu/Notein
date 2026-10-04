package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class MathArrayFactory implements IMathArrayFactory {
    @Override // com.aspose.slides.IMathArrayFactory
    public final IMathArray createMathArray(IMathElement iMathElement) {
        return new MathArray(iMathElement);
    }

    @Override // com.aspose.slides.IMathArrayFactory
    public final IMathArray createMathArray(IMathElementCollection iMathElementCollection) {
        return new MathArray(iMathElementCollection);
    }
}
