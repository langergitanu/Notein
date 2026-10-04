package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class FontSources implements IFontSources {

    /* JADX INFO: renamed from: k4 */
    private String[] f2322k4;

    /* JADX INFO: renamed from: x1 */
    private byte[][] f2323x1;

    @Override // com.aspose.slides.IFontSources
    public final String[] getFontFolders() {
        return this.f2322k4;
    }

    @Override // com.aspose.slides.IFontSources
    public final byte[][] getMemoryFonts() {
        return this.f2323x1;
    }

    @Override // com.aspose.slides.IFontSources
    public final void setFontFolders(String[] strArr) {
        this.f2322k4 = strArr;
    }

    @Override // com.aspose.slides.IFontSources
    public final void setMemoryFonts(byte[][] bArr) {
        this.f2323x1 = bArr;
    }
}
