package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class FontDataFactory implements IFontDataFactory {
    @Override // com.aspose.slides.IFontDataFactory
    public final IFontData createFontData(String str) {
        return new FontData(str);
    }
}
