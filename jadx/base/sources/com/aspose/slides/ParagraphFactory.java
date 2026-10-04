package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: loaded from: classes3.dex */
public class ParagraphFactory implements IParagraphFactory {
    @Override // com.aspose.slides.IParagraphFactory
    public final IParagraph createParagraph() {
        return new Paragraph();
    }

    @Override // com.aspose.slides.IParagraphFactory
    public final IParagraph createParagraph(IParagraph iParagraph) {
        return new Paragraph((Paragraph) C7019kk.m27452k4((Object) iParagraph, Paragraph.class));
    }
}
