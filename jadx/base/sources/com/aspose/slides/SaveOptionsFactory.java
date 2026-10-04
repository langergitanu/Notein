package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class SaveOptionsFactory implements ISaveOptionsFactory {
    @Override // com.aspose.slides.ISaveOptionsFactory
    public final IPptxOptions createPptxOptions() {
        return new PptxOptions();
    }
}
