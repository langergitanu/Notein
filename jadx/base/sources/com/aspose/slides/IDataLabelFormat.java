package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IDataLabelFormat extends IFormattedTextContainer {
    IFormat getFormat();

    String getNumberFormat();

    int getPosition();

    String getSeparator();

    boolean getShowBubbleSize();

    boolean getShowCategoryName();

    boolean getShowLabelAsDataCallout();

    boolean getShowLabelValueFromCell();

    boolean getShowLeaderLines();

    boolean getShowLegendKey();

    boolean getShowPercentage();

    boolean getShowSeriesName();

    boolean getShowValue();

    boolean isNumberFormatLinkedToSource();

    void setNumberFormat(String str);

    void setNumberFormatLinkedToSource(boolean z);

    void setPosition(int i);

    void setSeparator(String str);

    void setShowBubbleSize(boolean z);

    void setShowCategoryName(boolean z);

    void setShowLabelAsDataCallout(boolean z);

    void setShowLabelValueFromCell(boolean z);

    void setShowLeaderLines(boolean z);

    void setShowLegendKey(boolean z);

    void setShowPercentage(boolean z);

    void setShowSeriesName(boolean z);

    void setShowValue(boolean z);
}
