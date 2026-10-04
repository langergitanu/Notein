package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IChartCategoryCollection extends IGenericCollection<IChartCategory> {
    IChartCategory add(IChartDataCell iChartDataCell);

    IChartCategory add(Object obj);

    void clear();

    int getGroupingLevelCount();

    boolean getUseCells();

    IChartCategory get_Item(int i);

    int indexOf(IChartCategory iChartCategory);

    void remove(IChartCategory iChartCategory);

    void removeAt(int i);

    void setUseCells(boolean z);
}
