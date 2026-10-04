package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class MathBlockFactory implements IMathBlockFactory {
    @Override // com.aspose.slides.IMathBlockFactory
    public final IMathBlock createMathBlock() {
        return new MathBlock();
    }

    @Override // com.aspose.slides.IMathBlockFactory
    public final IMathBlock createMathBlock(IMathElement iMathElement) {
        return new MathBlock(iMathElement);
    }

    @Override // com.aspose.slides.IMathBlockFactory
    public final IMathBlock createMathBlock(IMathElementCollection iMathElementCollection) {
        return new MathBlock(iMathElementCollection);
    }
}
