package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class MathAccentFactory implements IMathAccentFactory {
    @Override // com.aspose.slides.IMathAccentFactory
    public final IMathAccent createMathAccent(IMathElement iMathElement) {
        return new MathAccent(iMathElement);
    }

    @Override // com.aspose.slides.IMathAccentFactory
    public final IMathAccent createMathAccent(IMathElement iMathElement, char c) {
        return new MathAccent(iMathElement, c);
    }
}
