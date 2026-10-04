package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class MathematicalTextFactory implements IMathematicalTextFactory {
    @Override // com.aspose.slides.IMathematicalTextFactory
    public final IMathematicalText createMathematicalText() {
        return new MathematicalText();
    }

    @Override // com.aspose.slides.IMathematicalTextFactory
    public final IMathematicalText createMathematicalText(char c) {
        return new MathematicalText(c);
    }

    @Override // com.aspose.slides.IMathematicalTextFactory
    public final IMathematicalText createMathematicalText(String str) {
        return new MathematicalText(str);
    }

    @Override // com.aspose.slides.IMathematicalTextFactory
    public final IMathematicalText createMathematicalText(String str, IPortionFormat iPortionFormat) {
        return new MathematicalText(str, iPortionFormat);
    }
}
