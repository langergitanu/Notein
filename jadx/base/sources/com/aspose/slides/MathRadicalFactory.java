package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class MathRadicalFactory implements IMathRadicalFactory {
    @Override // com.aspose.slides.IMathRadicalFactory
    public final IMathRadical createMathRadical(IMathElement iMathElement, IMathElement iMathElement2) {
        return new MathRadical(iMathElement, iMathElement2);
    }
}
