package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IChartData {
    IChartCategoryCollection getCategories();

    IChartDataWorkbook getChartDataWorkbook();

    int getDataSourceType();

    String getExternalWorkbookPath();

    String getRange();

    IChartCategoryCollection getSecondaryCategories();

    IChartSeriesCollection getSeries();

    IChartSeriesGroupCollection getSeriesGroups();

    boolean getUseSecondaryCategories();

    byte[] readWorkbookStream();

    void setExternalWorkbook(String str);

    void setExternalWorkbook(String str, boolean z);

    void setRange(String str);

    void setUseSecondaryCategories(boolean z);

    void switchRowColumn();

    void writeWorkbookStream(byte[] bArr);
}
