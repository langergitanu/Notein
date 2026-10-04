package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class MathLimitFactory implements IMathLimitFactory {
    @Override // com.aspose.slides.IMathLimitFactory
    public final IMathLimit createMathLimit(IMathElement iMathElement, IMathElement iMathElement2) {
        return new MathLimit(iMathElement, iMathElement2);
    }

    @Override // com.aspose.slides.IMathLimitFactory
    public final IMathLimit createMathLimit(IMathElement iMathElement, IMathElement iMathElement2, boolean z) {
        return new MathLimit(iMathElement, iMathElement2, z);
    }
}
