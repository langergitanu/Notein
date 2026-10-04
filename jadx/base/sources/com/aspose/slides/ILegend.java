package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface ILegend extends IFormattedTextContainer, ILayoutable {
    ILegendEntryCollection getEntries();

    IFormat getFormat();

    boolean getOverlay();

    int getPosition();

    void setOverlay(boolean z);

    void setPosition(int i);
}
