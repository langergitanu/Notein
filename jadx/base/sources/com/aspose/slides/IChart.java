package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IChart extends IFormattedTextContainer, IGraphicalObject, IOverrideThemeable {
    IAxesManager getAxes();

    IChartWall getBackWall();

    IChartData getChartData();

    IDataTable getChartDataTable();

    IChartTitle getChartTitle();

    int getDisplayBlanksAs();

    IChartWall getFloor();

    ILegend getLegend();

    IChartPlotArea getPlotArea();

    boolean getPlotVisibleCellsOnly();

    IRotation3D getRotation3D();

    boolean getShowDataLabelsOverMaximum();

    IChartWall getSideWall();

    int getStyle();

    int getType();

    IGroupShape getUserShapes();

    boolean hasDataTable();

    boolean hasLegend();

    boolean hasRoundedCorners();

    boolean hasTitle();

    void setDataTable(boolean z);

    void setDisplayBlanksAs(int i);

    void setLegend(boolean z);

    void setPlotVisibleCellsOnly(boolean z);

    void setRoundedCorners(boolean z);

    void setShowDataLabelsOverMaximum(boolean z);

    void setStyle(int i);

    void setTitle(boolean z);

    void setType(int i);

    void validateChartLayout();
}
