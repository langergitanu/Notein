package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IChartDataPoint extends IActualLayout {
    Integer getAutomaticDataPointColor();

    IDoubleChartValue getBubbleSize();

    IDoubleChartValue getColorValue();

    IChartDataPointLevelsManager getDataPointLevels();

    IErrorBarsCustomValues getErrorBarsCustomValues();

    int getExplosion();

    IFormat getFormat();

    long getIndex();

    boolean getInvertIfNegative();

    IDataLabel getLabel();

    IMarker getMarker();

    ILegendEntryProperties getRelatedLegendEntry();

    boolean getSetAsTotal();

    IDoubleChartValue getSizeValue();

    IDoubleChartValue getValue();

    IStringOrDoubleChartValue getXValue();

    IDoubleChartValue getYValue();

    boolean isBubble3D();

    void remove();

    void setBubble3D(boolean z);

    void setExplosion(int i);

    void setFormat(IFormat iFormat);

    void setInvertIfNegative(boolean z);

    void setSetAsTotal(boolean z);
}
