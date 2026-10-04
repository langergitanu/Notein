package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class MathMatrixFactory implements IMathMatrixFactory {
    @Override // com.aspose.slides.IMathMatrixFactory
    public final IMathMatrix createMathMatrix(int i, int i2) {
        return new MathMatrix(i, i2);
    }
}
