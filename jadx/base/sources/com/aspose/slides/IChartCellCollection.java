package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;

/* JADX INFO: loaded from: classes3.dex */
public interface IChartCellCollection extends IGenericEnumerable<IChartDataCell> {
    void add(IChartDataCell iChartDataCell);

    void add(Object obj);

    String getCellsAddress();

    String getConcatenatedValuesFromCells();

    int getCount();

    IChartDataCell get_Item(int i);

    void removeAt(int i);
}
