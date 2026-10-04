package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class MathBorderBoxFactory implements IMathBorderBoxFactory {
    @Override // com.aspose.slides.IMathBorderBoxFactory
    public final IMathBorderBox createMathBorderBox(IMathElement iMathElement) {
        return new MathBorderBox(iMathElement);
    }

    @Override // com.aspose.slides.IMathBorderBoxFactory
    public final IMathBorderBox createMathBorderBox(IMathElement iMathElement, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        return new MathBorderBox(iMathElement, z, z2, z3, z4, z5, z6, z7, z8);
    }
}
