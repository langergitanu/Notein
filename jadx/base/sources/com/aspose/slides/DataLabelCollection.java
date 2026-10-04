package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class DataLabelCollection extends DomObject<ChartSeries> implements IDataLabelCollection {

    /* JADX INFO: renamed from: du */
    private String f2095du;

    /* JADX INFO: renamed from: k4 */
    private final DataLabelFormat f2096k4;

    /* JADX INFO: renamed from: kk */
    private final C13735kl f2097kk;

    /* JADX INFO: renamed from: to */
    private GeometryShape f2098to;

    /* JADX INFO: renamed from: x1 */
    private final IChartLinesFormat f2099x1;

    public DataLabelCollection(ChartSeries chartSeries) {
        super(chartSeries);
        this.f2097kk = new C13735kl();
        this.f2096k4 = new DataLabelFormat(this);
        this.f2099x1 = new ChartLinesFormat(this);
    }

    @Override // com.aspose.slides.IChartComponent
    public final IChart getChart() {
        return getParentSeries().getChart();
    }

    @Override // com.aspose.slides.IDataLabelCollection
    public final int getCount() {
        return getParentSeries().getDataPoints().size();
    }

    @Override // com.aspose.slides.IDataLabelCollection
    public final int getCountOfVisibleDataLabels() {
        int i = 0;
        for (int i2 = 0; i2 < getParentSeries().getDataPoints().size(); i2++) {
            if (getParentSeries().getDataPoints().get_Item(i2).getLabel().isVisible()) {
                i++;
            }
        }
        return i;
    }

    @Override // com.aspose.slides.IDataLabelCollection
    public final IDataLabelFormat getDefaultDataLabelFormat() {
        return this.f2096k4;
    }

    @Override // com.aspose.slides.IDataLabelCollection
    public final IChartLinesFormat getLeaderLinesFormat() {
        return this.f2099x1;
    }

    @Override // com.aspose.slides.IDataLabelCollection
    public final IChartSeries getParentSeries() {
        return (IChartSeries) this.f2127h4;
    }

    @Override // com.aspose.slides.IPresentationComponent
    public final IPresentation getPresentation() {
        return getParentSeries().getPresentation();
    }

    @Override // com.aspose.slides.ISlideComponent
    public final IBaseSlide getSlide() {
        return getParentSeries().getSlide();
    }

    @Override // com.aspose.slides.IDataLabelCollection
    public final IDataLabel get_Item(int i) {
        return getParentSeries().getDataPoints().get_Item(i).getLabel();
    }

    @Override // com.aspose.slides.IDataLabelCollection
    public final void hide() {
        this.f2096k4.setShowLegendKey(false);
        this.f2096k4.setShowValue(false);
        this.f2096k4.setShowCategoryName(false);
        this.f2096k4.setShowSeriesName(false);
        this.f2096k4.setShowPercentage(false);
        this.f2096k4.setShowBubbleSize(false);
    }

    @Override // com.aspose.slides.IDataLabelCollection
    public final int indexOf(IDataLabel iDataLabel) {
        for (int i = 0; i < getParentSeries().getDataPoints().size(); i++) {
            if (get_Item(i) == iDataLabel) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.aspose.slides.IDataLabelCollection
    public final boolean isVisible() {
        if (this.f2096k4.getShowLegendKey() || this.f2096k4.getShowValue() || this.f2096k4.getShowCategoryName() || this.f2096k4.getShowSeriesName() || this.f2096k4.getShowPercentage() || this.f2096k4.getShowBubbleSize() || this.f2096k4.getShowLabelValueFromCell()) {
            return true;
        }
        IGenericEnumerator<IDataLabel> it = iterator();
        while (it.hasNext()) {
            try {
                if (it.next().isVisible()) {
                    return true;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return false;
        }
        it.dispose();
        return false;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<IDataLabel> iterator() {
        return new C14634ui(getParentSeries().getDataPoints());
    }

    public final IGenericEnumerator<IDataLabel> iteratorJava() {
        return new C14862yv(getParentSeries().getDataPoints());
    }

    /* JADX INFO: renamed from: k4 */
    public final String m1307k4() {
        return this.f2095du;
    }

    /* JADX INFO: renamed from: kk */
    public final String m1309kk() {
        ChartCellCollection chartCellCollection = new ChartCellCollection(this);
        IGenericEnumerator<IDataLabel> it = iterator();
        while (it.hasNext()) {
            try {
                DataLabel dataLabel = (DataLabel) it.next();
                if (dataLabel.getValueFromCell() != null) {
                    chartCellCollection.add(dataLabel.getValueFromCell());
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return chartCellCollection.getCellsAddress();
    }

    /* JADX INFO: renamed from: to */
    public final GeometryShape m1310to() {
        if (!getDefaultDataLabelFormat().getShowLabelAsDataCallout()) {
            return null;
        }
        if (this.f2098to == null) {
            AutoShape autoShape = new AutoShape(this);
            this.f2098to = autoShape;
            autoShape.setShapeType(117);
        }
        return this.f2098to;
    }

    /* JADX INFO: renamed from: x1 */
    public final C13735kl m1311x1() {
        return this.f2097kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1308k4(String str) {
        this.f2095du = str;
    }
}
