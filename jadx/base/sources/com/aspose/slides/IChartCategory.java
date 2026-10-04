package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IChartCategory {
    IChartDataCell getAsCell();

    Object getAsLiteral();

    IChartCategoryLevelsManager getGroupingLevels();

    boolean getUseCell();

    Object getValue();

    void remove();

    void setAsCell(IChartDataCell iChartDataCell);

    void setAsLiteral(Object obj);

    void setValue(Object obj);
}
