package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

/* JADX INFO: loaded from: classes3.dex */
public class ChartDataPointLevelsManager extends DomObject<ChartDataPoint> implements IChartDataPointLevelsManager {

    /* JADX INFO: renamed from: k4 */
    private final List<ChartDataPointLevel> f1414k4;

    public ChartDataPointLevelsManager(ChartDataPoint chartDataPoint) {
        super(chartDataPoint);
        ChartCategoryCollection chartCategoryCollection = (ChartCategoryCollection) ((ChartData) chartDataPoint.m596to().m640x1().getChart().getChartData()).getCategories();
        List<ChartDataPointLevel> list = new List<>();
        this.f1414k4 = list;
        if (chartCategoryCollection.size() == 0) {
            list.addItem(new ChartDataPointLevel(this, 0));
            return;
        }
        for (int i = 0; i < chartCategoryCollection.getGroupingLevelCount(); i++) {
            this.f1414k4.addItem(new ChartDataPointLevel(this, i));
        }
    }

    @Override // com.aspose.slides.IChartDataPointLevelsManager
    public final int getCount() {
        return this.f1414k4.size();
    }

    @Override // com.aspose.slides.IChartDataPointLevelsManager
    public final IChartDataPointLevel get_Item(int i) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException("level must be >= 0");
        }
        if (i >= this.f1414k4.size()) {
            return null;
        }
        if (this.f1414k4.get_Item(i) == null) {
            this.f1414k4.set_Item(i, new ChartDataPointLevel(this, i));
        }
        return this.f1414k4.get_Item(i);
    }
}
