package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class MathGroupingCharacterFactory implements IMathGroupingCharacterFactory {
    @Override // com.aspose.slides.IMathGroupingCharacterFactory
    public final IMathGroupingCharacter createMathGroupingCharacter(IMathElement iMathElement) {
        return new MathGroupingCharacter(iMathElement);
    }

    @Override // com.aspose.slides.IMathGroupingCharacterFactory
    public final IMathGroupingCharacter createMathGroupingCharacter(IMathElement iMathElement, char c, int i, int i2) {
        return new MathGroupingCharacter(iMathElement, c, i, i2);
    }
}
