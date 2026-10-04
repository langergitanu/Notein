package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class MathSubscriptElementFactory implements IMathSubscriptElementFactory {
    @Override // com.aspose.slides.IMathSubscriptElementFactory
    public final IMathSubscriptElement createMathSubscriptElement(IMathElement iMathElement, IMathElement iMathElement2) {
        return new MathSubscriptElement(iMathElement, iMathElement2);
    }
}
