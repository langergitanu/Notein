package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IDataLabel extends IActualLayout, ILayoutable, IOverridableText {
    String getActualLabelText();

    IDataLabelFormat getDataLabelFormat();

    IChartDataCell getValueFromCell();

    void hide();

    boolean isVisible();

    void setValueFromCell(IChartDataCell iChartDataCell);
}
