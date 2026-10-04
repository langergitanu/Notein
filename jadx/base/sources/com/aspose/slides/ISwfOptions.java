package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface ISwfOptions extends ISaveOptions {
    boolean getCompressed();

    boolean getEnableContextMenu();

    int getJpegQuality();

    byte[] getLogoImageBytes();

    String getLogoLink();

    INotesCommentsLayoutingOptions getNotesCommentsLayouting();

    boolean getShowBottomPane();

    boolean getShowFullScreen();

    boolean getShowHiddenSlides();

    boolean getShowLeftPane();

    boolean getShowPageBorder();

    boolean getShowPageStepper();

    boolean getShowSearch();

    boolean getShowTopPane();

    boolean getStartOpenLeftPane();

    boolean getViewerIncluded();

    void setCompressed(boolean z);

    void setEnableContextMenu(boolean z);

    void setJpegQuality(int i);

    void setLogoImageBytes(byte[] bArr);

    void setLogoLink(String str);

    void setShowBottomPane(boolean z);

    void setShowFullScreen(boolean z);

    void setShowHiddenSlides(boolean z);

    void setShowLeftPane(boolean z);

    void setShowPageBorder(boolean z);

    void setShowPageStepper(boolean z);

    void setShowSearch(boolean z);

    void setShowTopPane(boolean z);

    void setStartOpenLeftPane(boolean z);

    void setViewerIncluded(boolean z);
}
