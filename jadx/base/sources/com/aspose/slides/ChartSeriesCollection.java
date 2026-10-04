package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
public class ChartSeriesCollection extends DomObject<ChartData> implements IChartSeriesCollection {

    /* JADX INFO: renamed from: k4 */
    private Chart f1497k4;

    /* JADX INFO: renamed from: x1 */
    private final nl7<IChartSeries> f1498x1;

    public ChartSeriesCollection(ChartData chartData) {
        super(chartData);
        this.f1498x1 = new nl7<>(chartData);
    }

    @Override // com.aspose.slides.IChartSeriesCollection
    public final IChartSeries add(int i) {
        ChartSeries chartSeries = new ChartSeries(this, i, false);
        chartSeries.m738x1(m742k4(chartSeries));
        this.f1498x1.addItem(chartSeries);
        chartSeries.m731kk();
        return chartSeries;
    }

    @Override // com.aspose.slides.IChartSeriesCollection
    public final void clear() {
        while (this.f1498x1.size() > 0) {
            removeAt(this.f1498x1.size() - 1);
        }
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final void copyTo(AbstractC14092to abstractC14092to, int i) {
        this.f1498x1.copyTo(abstractC14092to, i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final Object getSyncRoot() {
        return this;
    }

    @Override // com.aspose.slides.IChartSeriesCollection
    public final IChartSeries get_Item(int i) {
        return this.f1498x1.get_Item(i);
    }

    @Override // com.aspose.slides.IChartSeriesCollection
    public final int indexOf(IChartSeries iChartSeries) {
        return this.f1498x1.indexOf(iChartSeries);
    }

    @Override // com.aspose.slides.IChartSeriesCollection
    public final IChartSeries insert(int i, int i2) {
        ChartSeries chartSeries = new ChartSeries(this, i2, false);
        chartSeries.m738x1(m742k4(chartSeries));
        this.f1498x1.insertItem(i, chartSeries);
        chartSeries.m731kk();
        return chartSeries;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<IChartSeries> iterator() {
        return this.f1498x1.iterator();
    }

    @Override // com.aspose.slides.IGenericCollection
    public final IGenericEnumerator<IChartSeries> iteratorJava() {
        return this.f1498x1.iteratorJava();
    }

    /* JADX INFO: renamed from: k4 */
    public final IChart m743k4() {
        Chart chart = this.f1497k4;
        if (chart == null) {
            Chart[] chartArr = {chart};
            kke.m63959k4(Chart.class, (InterfaceC14397rj) this.f2127h4, chartArr);
            this.f1497k4 = chartArr[0];
        }
        return this.f1497k4;
    }

    @Override // com.aspose.slides.IChartSeriesCollection
    public final void remove(IChartSeries iChartSeries) {
        if (this.f1498x1.indexOf(iChartSeries) == -1) {
            throw new ArgumentException("The value parameter was not found in the collection.");
        }
        this.f1498x1.removeItem(iChartSeries);
        ((AxesManager) m743k4().getAxes()).m317x1();
        ((C14346qh) m743k4().getChartData().getSeriesGroups()).m69582x1((ChartSeries) iChartSeries);
    }

    @Override // com.aspose.slides.IChartSeriesCollection
    public final void removeAt(int i) {
        remove(this.f1498x1.get_Item(i));
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final int size() {
        return this.f1498x1.size();
    }

    @Override // com.aspose.slides.IChartSeriesCollection
    public final IChartSeries add(IChartCellCollection iChartCellCollection, int i) {
        for (IChartSeries iChartSeries : this.f1498x1) {
            if (iChartSeries.getName().getDataSourceType() == 0 && iChartSeries.getName().getAsCells().getCount() == iChartCellCollection.getCount() && C14113y2.m67363du(iChartSeries.getName().getAsCells().getConcatenatedValuesFromCells(), iChartCellCollection.getConcatenatedValuesFromCells())) {
                return iChartSeries;
            }
        }
        IChartSeries iChartSeriesAdd = add(i);
        iChartSeriesAdd.getName().setAsCells(iChartCellCollection);
        return iChartSeriesAdd;
    }

    /* JADX INFO: renamed from: k4 */
    public final IChartSeries m744k4(int i, IChartSeriesGroup iChartSeriesGroup, boolean z) {
        ChartSeries chartSeries = new ChartSeries(this, i, true);
        chartSeries.m738x1(z);
        this.f1498x1.addItem(chartSeries);
        ((AxesManager) m743k4().getAxes()).m317x1();
        ((C14886zi) iChartSeriesGroup.getSeries()).m74527k4(chartSeries);
        return chartSeries;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.IChartSeriesCollection
    public final IChartSeries add(IChartDataCell iChartDataCell, int i) {
        for (IChartSeries iChartSeries : this.f1498x1) {
            if (iChartSeries.getName().getDataSourceType() == 0 && iChartSeries.getName().getAsCells().getCount() == 1 && iChartSeries.getName().getAsCells().get_Item(0).equals(iChartDataCell)) {
                return iChartSeries;
            }
        }
        IChartSeries iChartSeriesAdd = add(i);
        ((ChartData) this.f2127h4).m553x1().mo5706k4(iChartDataCell);
        iChartSeriesAdd.getName().setFromOneCell(iChartDataCell);
        return iChartSeriesAdd;
    }

    /* JADX INFO: renamed from: k4 */
    public final IChartSeries m745k4(int i, boolean z) {
        ChartSeries chartSeries = new ChartSeries(this, i, true);
        chartSeries.m738x1(z);
        this.f1498x1.addItem(chartSeries);
        ((AxesManager) m743k4().getAxes()).m317x1();
        ((C14346qh) m743k4().getChartData().getSeriesGroups()).m69581kk(chartSeries);
        return chartSeries;
    }

    @Override // com.aspose.slides.IChartSeriesCollection
    public final IChartSeries add(String str, int i) {
        ChartDataCell chartDataCellM669dy = ((ChartDataWorkbook) m743k4().getChartData().getChartDataWorkbook()).m669dy();
        chartDataCellM669dy.setValue(str);
        return add(chartDataCellM669dy, i);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m746k4(int i, IChartSeries iChartSeries) {
        if (this.f1498x1.containsItem(iChartSeries)) {
            this.f1498x1.removeItem(iChartSeries);
            this.f1498x1.insertItem(i, iChartSeries);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m742k4(ChartSeries chartSeries) {
        if (this.f1498x1.size() > 0) {
            boolean zIs3DChart = ChartTypeCharacterizer.is3DChart(this.f1498x1.get_Item(0).getType());
            for (int i = 1; i < this.f1498x1.size(); i++) {
                this.f1498x1.get_Item(i);
            }
            if (zIs3DChart != ChartTypeCharacterizer.is3DChart(chartSeries.getType())) {
                if (zIs3DChart) {
                    throw new CannotCombine2DAnd3DChartsException(C14113y2.m67408k4("Cannot combine 2D and 3D chart types ", "(the series to be added is 2D and present series is/are 3D)."));
                }
                throw new CannotCombine2DAnd3DChartsException(C14113y2.m67408k4("Cannot combine 2D and 3D chart types ", "(the series to be added is 3D and present series is/are 2D)."));
            }
        }
        if (((AxesManager) m743k4().getAxes()).m314k4(chartSeries.getType(), false)) {
            return false;
        }
        if (((AxesManager) m743k4().getAxes()).m314k4(chartSeries.getType(), true)) {
            return true;
        }
        throw new AxesCompositionNotCombinableException(C14113y2.m67408k4("Some chart types cannot be combined with other chart types. Select a different chart type. ", "Details: axes composition of the series to be added is not combinable with present ", "axes composition in chart. So series of this type cannot be added to this chart. ", "Preferred axes composition for the series to be added is \"", ChartTypeCharacterizer.m765kk(ChartTypeCharacterizer.m762k4(chartSeries.getType())), "\"."));
    }
}
