package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IAutoShape extends IGeometryShape {
    ITextFrame addTextFrame(String str);

    IAutoShapeLock getAutoShapeLock();

    ITextFrame getTextFrame();

    boolean getUseBackgroundFill();

    boolean isTextBox();

    void setUseBackgroundFill(boolean z);
}
