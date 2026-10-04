package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IAxis extends IFormattedTextContainer {
    double getActualMajorUnit();

    int getActualMajorUnitScale();

    double getActualMaxValue();

    double getActualMinValue();

    double getActualMinorUnit();

    int getActualMinorUnitScale();

    int getAggregationType();

    boolean getAxisBetweenCategories();

    int getBaseUnitScale();

    double getBinWidth();

    int getCategoryAxisType();

    float getCrossAt();

    int getCrossType();

    int getDisplayUnit();

    IAxisFormat getFormat();

    int getLabelOffset();

    double getLogBase();

    IChartLinesFormat getMajorGridLinesFormat();

    int getMajorTickMark();

    double getMajorUnit();

    int getMajorUnitScale();

    double getMaxValue();

    double getMinValue();

    IChartLinesFormat getMinorGridLinesFormat();

    int getMinorTickMark();

    double getMinorUnit();

    int getMinorUnitScale();

    String getNumberFormat();

    long getNumberOfBins();

    double getOverflowBin();

    int getPosition();

    boolean getShowMajorGridLines();

    boolean getShowMinorGridLines();

    int getTickLabelPosition();

    float getTickLabelRotationAngle();

    long getTickLabelSpacing();

    long getTickMarksSpacing();

    IChartTitle getTitle();

    double getUnderflowBin();

    boolean hasTitle();

    boolean isAutomaticMajorUnit();

    boolean isAutomaticMaxValue();

    boolean isAutomaticMinValue();

    boolean isAutomaticMinorUnit();

    boolean isAutomaticOverflowBin();

    boolean isAutomaticTickLabelSpacing();

    boolean isAutomaticTickMarksSpacing();

    boolean isAutomaticUnderflowBin();

    boolean isLogarithmic();

    boolean isNumberFormatLinkedToSource();

    boolean isOverflowBin();

    boolean isPlotOrderReversed();

    boolean isUnderflowBin();

    boolean isVisible();

    void setAggregationType(int i);

    void setAutomaticMajorUnit(boolean z);

    void setAutomaticMaxValue(boolean z);

    void setAutomaticMinValue(boolean z);

    void setAutomaticMinorUnit(boolean z);

    void setAutomaticOverflowBin(boolean z);

    void setAutomaticTickLabelSpacing(boolean z);

    void setAutomaticTickMarksSpacing(boolean z);

    void setAutomaticUnderflowBin(boolean z);

    void setAxisBetweenCategories(boolean z);

    void setBaseUnitScale(int i);

    void setBinWidth(double d);

    void setCategoryAxisType(int i);

    void setCategoryAxisTypeAutomatically();

    void setCrossAt(float f);

    void setCrossType(int i);

    void setDisplayUnit(int i);

    void setLabelOffset(int i);

    void setLogBase(double d);

    void setLogarithmic(boolean z);

    void setMajorTickMark(int i);

    void setMajorUnit(double d);

    void setMajorUnitScale(int i);

    void setMaxValue(double d);

    void setMinValue(double d);

    void setMinorTickMark(int i);

    void setMinorUnit(double d);

    void setMinorUnitScale(int i);

    void setNumberFormat(String str);

    void setNumberFormatLinkedToSource(boolean z);

    void setNumberOfBins(long j);

    void setOverflowBin(double d);

    void setOverflowBin(boolean z);

    void setPlotOrderReversed(boolean z);

    void setPosition(int i);

    void setTickLabelPosition(int i);

    void setTickLabelRotationAngle(float f);

    void setTickLabelSpacing(long j);

    void setTickMarksSpacing(long j);

    void setTitle(boolean z);

    void setUnderflowBin(double d);

    void setUnderflowBin(boolean z);

    void setVisible(boolean z);
}
