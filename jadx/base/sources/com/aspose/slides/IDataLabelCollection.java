package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;

/* JADX INFO: loaded from: classes3.dex */
public interface IDataLabelCollection extends IGenericEnumerable<IDataLabel>, IChartComponent {
    int getCount();

    int getCountOfVisibleDataLabels();

    IDataLabelFormat getDefaultDataLabelFormat();

    IChartLinesFormat getLeaderLinesFormat();

    IChartSeries getParentSeries();

    IDataLabel get_Item(int i);

    void hide();

    int indexOf(IDataLabel iDataLabel);

    boolean isVisible();
}
