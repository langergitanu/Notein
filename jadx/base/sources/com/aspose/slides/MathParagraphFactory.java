package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class MathParagraphFactory implements IMathParagraphFactory {
    @Override // com.aspose.slides.IMathParagraphFactory
    public final IMathParagraph createMathParagraph() {
        return new MathParagraph();
    }

    @Override // com.aspose.slides.IMathParagraphFactory
    public final IMathParagraph createMathParagraph(IMathBlock iMathBlock) {
        return new MathParagraph(iMathBlock);
    }
}
