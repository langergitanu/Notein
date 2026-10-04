package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IPdfOptions extends ISaveOptions {
    int getAccessPermissions();

    String[] getAdditionalCommonFontFamilies();

    boolean getApplyImageTransparent();

    boolean getBestImagesCompressionRatio();

    int getCompliance();

    boolean getDrawSlidesFrame();

    boolean getEmbedFullFonts();

    boolean getEmbedTrueTypeFontsForASCII();

    Integer getImageTransparentColor();

    IInkOptions getInkOptions();

    byte getJpegQuality();

    @Deprecated
    INotesCommentsLayoutingOptions getNotesCommentsLayouting();

    String getPassword();

    boolean getRasterizeUnsupportedFontStyles();

    boolean getSaveMetafilesAsPng();

    boolean getShowHiddenSlides();

    ISlidesLayoutOptions getSlidesLayoutOptions();

    float getSufficientResolution();

    int getTextCompression();

    void setAccessPermissions(int i);

    void setAdditionalCommonFontFamilies(String[] strArr);

    void setApplyImageTransparent(boolean z);

    void setBestImagesCompressionRatio(boolean z);

    void setCompliance(int i);

    void setDrawSlidesFrame(boolean z);

    void setEmbedFullFonts(boolean z);

    void setEmbedTrueTypeFontsForASCII(boolean z);

    void setImageTransparentColor(Integer num);

    void setJpegQuality(byte b);

    void setPassword(String str);

    void setRasterizeUnsupportedFontStyles(boolean z);

    void setSaveMetafilesAsPng(boolean z);

    void setShowHiddenSlides(boolean z);

    void setSlidesLayoutOptions(ISlidesLayoutOptions iSlidesLayoutOptions);

    void setSufficientResolution(float f);

    void setTextCompression(int i);
}
