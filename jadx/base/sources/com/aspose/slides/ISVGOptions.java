package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface ISVGOptions extends ISaveOptions {
    boolean getDeletePicturesCroppedAreas();

    boolean getDisable3DText();

    boolean getDisableGradientSplit();

    boolean getDisableLineEndCropping();

    int getExternalFontsHandling();

    IInkOptions getInkOptions();

    int getJpegQuality();

    int getMetafileRasterizationDpi();

    int getPicturesCompression();

    ISvgShapeFormattingController getShapeFormattingController();

    boolean getUseFrameRotation();

    boolean getUseFrameSize();

    boolean getVectorizeText();

    void setDeletePicturesCroppedAreas(boolean z);

    void setDisable3DText(boolean z);

    void setDisableGradientSplit(boolean z);

    void setDisableLineEndCropping(boolean z);

    void setExternalFontsHandling(int i);

    void setJpegQuality(int i);

    void setMetafileRasterizationDpi(int i);

    void setPicturesCompression(int i);

    void setShapeFormattingController(ISvgShapeFormattingController iSvgShapeFormattingController);

    void setUseFrameRotation(boolean z);

    void setUseFrameSize(boolean z);

    void setVectorizeText(boolean z);
}
