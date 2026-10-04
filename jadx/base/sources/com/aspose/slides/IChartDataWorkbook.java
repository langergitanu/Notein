package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IChartDataWorkbook {
    void calculateFormulas();

    void clear(int i);

    IChartDataCell getCell(int i, int i2, int i3);

    IChartDataCell getCell(int i, int i2, int i3, Object obj);

    IChartDataCell getCell(int i, String str);

    IChartDataCell getCell(int i, String str, Object obj);

    IChartDataCell getCell(String str, int i, int i2);

    IChartCellCollection getCellCollection(String str, boolean z);

    IChartDataWorksheetCollection getWorksheets();
}
