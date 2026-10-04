package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IChartSeriesCollection extends IGenericCollection<IChartSeries> {
    IChartSeries add(int i);

    IChartSeries add(IChartCellCollection iChartCellCollection, int i);

    IChartSeries add(IChartDataCell iChartDataCell, int i);

    IChartSeries add(String str, int i);

    void clear();

    IChartSeries get_Item(int i);

    int indexOf(IChartSeries iChartSeries);

    IChartSeries insert(int i, int i2);

    void remove(IChartSeries iChartSeries);

    void removeAt(int i);
}
