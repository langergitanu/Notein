package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface ISmartArtNode {
    IFillFormat getBulletFillFormat();

    ISmartArtNodeCollection getChildNodes();

    int getLevel();

    int getOrganizationChartLayout();

    int getPosition();

    ISmartArtShapeCollection getShapes();

    ITextFrame getTextFrame();

    boolean isAssistant();

    boolean isHidden();

    boolean remove();

    void setAssistant(boolean z);

    void setOrganizationChartLayout(int i);

    void setPosition(int i);
}
