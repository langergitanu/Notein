package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class MathBoxFactory implements IMathBoxFactory {
    @Override // com.aspose.slides.IMathBoxFactory
    public final IMathBox createMathBox(IMathElement iMathElement) {
        return new MathBox(iMathElement);
    }
}
