package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IChartDataPointCollection extends IGenericCollection<IChartDataPoint> {
    IChartDataPoint addDataPointForAreaSeries(double d);

    IChartDataPoint addDataPointForAreaSeries(IChartDataCell iChartDataCell);

    IChartDataPoint addDataPointForBarSeries(double d);

    IChartDataPoint addDataPointForBarSeries(IChartDataCell iChartDataCell);

    IChartDataPoint addDataPointForBoxAndWhiskerSeries(IChartDataCell iChartDataCell);

    IChartDataPoint addDataPointForBubbleSeries(double d, double d2, double d3);

    IChartDataPoint addDataPointForBubbleSeries(double d, double d2, IChartDataCell iChartDataCell);

    IChartDataPoint addDataPointForBubbleSeries(double d, IChartDataCell iChartDataCell, double d2);

    IChartDataPoint addDataPointForBubbleSeries(double d, IChartDataCell iChartDataCell, IChartDataCell iChartDataCell2);

    IChartDataPoint addDataPointForBubbleSeries(IChartDataCell iChartDataCell, double d, double d2);

    IChartDataPoint addDataPointForBubbleSeries(IChartDataCell iChartDataCell, double d, IChartDataCell iChartDataCell2);

    IChartDataPoint addDataPointForBubbleSeries(IChartDataCell iChartDataCell, IChartDataCell iChartDataCell2, double d);

    IChartDataPoint addDataPointForBubbleSeries(IChartDataCell iChartDataCell, IChartDataCell iChartDataCell2, IChartDataCell iChartDataCell3);

    IChartDataPoint addDataPointForBubbleSeries(String str, double d, double d2);

    IChartDataPoint addDataPointForBubbleSeries(String str, double d, IChartDataCell iChartDataCell);

    IChartDataPoint addDataPointForBubbleSeries(String str, IChartDataCell iChartDataCell, double d);

    IChartDataPoint addDataPointForBubbleSeries(String str, IChartDataCell iChartDataCell, IChartDataCell iChartDataCell2);

    IChartDataPoint addDataPointForDoughnutSeries(double d);

    IChartDataPoint addDataPointForDoughnutSeries(IChartDataCell iChartDataCell);

    IChartDataPoint addDataPointForFunnelSeries(IChartDataCell iChartDataCell);

    IChartDataPoint addDataPointForHistogramSeries(IChartDataCell iChartDataCell);

    IChartDataPoint addDataPointForLineSeries(double d);

    IChartDataPoint addDataPointForLineSeries(IChartDataCell iChartDataCell);

    IChartDataPoint addDataPointForMapSeries(IChartDataCell iChartDataCell);

    IChartDataPoint addDataPointForPieSeries(double d);

    IChartDataPoint addDataPointForPieSeries(IChartDataCell iChartDataCell);

    IChartDataPoint addDataPointForRadarSeries(double d);

    IChartDataPoint addDataPointForRadarSeries(IChartDataCell iChartDataCell);

    IChartDataPoint addDataPointForScatterSeries(double d, double d2);

    IChartDataPoint addDataPointForScatterSeries(double d, IChartDataCell iChartDataCell);

    IChartDataPoint addDataPointForScatterSeries(IChartDataCell iChartDataCell, double d);

    IChartDataPoint addDataPointForScatterSeries(IChartDataCell iChartDataCell, IChartDataCell iChartDataCell2);

    IChartDataPoint addDataPointForScatterSeries(String str, double d);

    IChartDataPoint addDataPointForScatterSeries(String str, IChartDataCell iChartDataCell);

    IChartDataPoint addDataPointForStockSeries(double d);

    IChartDataPoint addDataPointForStockSeries(IChartDataCell iChartDataCell);

    IChartDataPoint addDataPointForSunburstSeries(IChartDataCell iChartDataCell);

    IChartDataPoint addDataPointForSurfaceSeries(double d);

    IChartDataPoint addDataPointForSurfaceSeries(IChartDataCell iChartDataCell);

    IChartDataPoint addDataPointForTreemapSeries(IChartDataCell iChartDataCell);

    IChartDataPoint addDataPointForWaterfallSeries(IChartDataCell iChartDataCell);

    void clear();

    int getDataSourceTypeForBubbleSizes();

    IDataSourceTypeForErrorBarsCustomValues getDataSourceTypeForErrorBarsCustomValues();

    int getDataSourceTypeForValues();

    int getDataSourceTypeForXValues();

    int getDataSourceTypeForYValues();

    IChartDataPoint getOrCreateDataPointByIdx(long j);

    int get_Item(IChartDataPoint iChartDataPoint);

    IChartDataPoint get_Item(int i);

    void remove(IChartDataPoint iChartDataPoint);

    void removeAt(int i);

    void setDataSourceTypeForBubbleSizes(int i);

    void setDataSourceTypeForValues(int i);

    void setDataSourceTypeForXValues(int i);

    void setDataSourceTypeForYValues(int i);
}
