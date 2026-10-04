package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IStringChartValue extends IMultipleCellChartValue {
    String getAsLiteralString();

    String getCellsAddressInWorkbook();

    void setAsLiteralString(String str);

    void setFromOneCell(IChartDataCell iChartDataCell);

    String toString();
}
