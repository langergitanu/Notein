package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IChartSeries extends IChartComponent {
    Integer getAutomaticSeriesColor();

    int getBar3DShape();

    int getBubbleSizeRepresentation();

    int getBubbleSizeScale();

    IChartDataPointCollection getDataPoints();

    byte getDoughnutHoleSize();

    IErrorBarsFormat getErrorBarsXFormat();

    IErrorBarsFormat getErrorBarsYFormat();

    int getExplosion();

    int getFirstSliceAngle();

    IFormat getFormat();

    int getGapDepth();

    int getGapWidth();

    boolean getInvertIfNegative();

    IColorFormat getInvertedSolidFillColor();

    IDataLabelCollection getLabels();

    IMarker getMarker();

    IStringChartValue getName();

    String getNumberFormatOfBubbleSizes();

    String getNumberFormatOfValues();

    String getNumberFormatOfXValues();

    String getNumberFormatOfYValues();

    int getOrder();

    byte getOverlap();

    int getParentLabelLayout();

    IChartSeriesGroup getParentSeriesGroup();

    int getPieSplitBy();

    IPieSplitCustomPointCollection getPieSplitCustomPoints();

    double getPieSplitPosition();

    boolean getPlotOnSecondAxis();

    int getQuartileMethod();

    ILegendEntryProperties getRelatedLegendEntry();

    int getSecondPieSize();

    boolean getShowConnectorLines();

    boolean getShowInnerPoints();

    boolean getShowMeanLine();

    boolean getShowMeanMarkers();

    boolean getShowOutlierPoints();

    boolean getSmooth();

    ITrendlineCollection getTrendLines();

    int getType();

    boolean hasSeriesLines();

    boolean hasUpDownBars();

    boolean isColorVaried();

    void setBar3DShape(int i);

    void setExplosion(int i);

    void setInvertIfNegative(boolean z);

    void setNumberFormatOfBubbleSizes(String str);

    void setNumberFormatOfValues(String str);

    void setNumberFormatOfXValues(String str);

    void setNumberFormatOfYValues(String str);

    void setOrder(int i);

    void setParentLabelLayout(int i);

    void setPlotOnSecondAxis(boolean z);

    void setQuartileMethod(int i);

    void setShowConnectorLines(boolean z);

    void setShowInnerPoints(boolean z);

    void setShowMeanLine(boolean z);

    void setShowMeanMarkers(boolean z);

    void setShowOutlierPoints(boolean z);

    void setSmooth(boolean z);

    void setType(int i);
}
