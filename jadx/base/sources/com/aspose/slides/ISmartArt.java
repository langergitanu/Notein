package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface ISmartArt extends IGraphicalObject {
    ISmartArtNodeCollection getAllNodes();

    int getColorStyle();

    int getLayout();

    ISmartArtNodeCollection getNodes();

    int getQuickStyle();

    boolean isReversed();

    void setColorStyle(int i);

    void setLayout(int i);

    void setQuickStyle(int i);

    void setReversed(boolean z);
}
