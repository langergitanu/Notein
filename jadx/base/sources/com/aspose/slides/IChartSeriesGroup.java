package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IChartSeriesGroup extends IChartComponent {
    int getBubbleSizeRepresentation();

    int getBubbleSizeScale();

    byte getDoughnutHoleSize();

    int getFirstSliceAngle();

    int getGapDepth();

    int getGapWidth();

    IChartLinesFormat getHiLowLinesFormat();

    byte getOverlap();

    int getPieSplitBy();

    IPieSplitCustomPointCollection getPieSplitCustomPoints();

    double getPieSplitPosition();

    boolean getPlotOnSecondAxis();

    int getSecondPieSize();

    IChartSeriesReadonlyCollection getSeries();

    int getType();

    IUpDownBarsManager getUpDownBars();

    IChartSeries get_Item(int i);

    boolean hasSeriesLines();

    boolean isColorVaried();

    void setBubbleSizeRepresentation(int i);

    void setBubbleSizeScale(int i);

    void setColorVaried(boolean z);

    void setDoughnutHoleSize(byte b);

    void setFirstSliceAngle(int i);

    void setGapDepth(int i);

    void setGapWidth(int i);

    void setOverlap(byte b);

    void setPieSplitBy(int i);

    void setPieSplitPosition(double d);

    void setSecondPieSize(int i);

    void setSeriesLines(boolean z);
}
