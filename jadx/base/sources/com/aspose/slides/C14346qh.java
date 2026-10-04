package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14041ai;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.qh */
/* JADX INFO: loaded from: classes3.dex */
class C14346qh implements IChartSeriesGroupCollection, InterfaceC14397rj {

    /* JADX INFO: renamed from: k4 */
    private final InterfaceC14397rj f48310k4;

    /* JADX INFO: renamed from: x1 */
    private final List<IChartSeriesGroup> f48311x1 = new List<>();

    public C14346qh(ChartData chartData) {
        this.f48310k4 = chartData;
    }

    /* JADX INFO: renamed from: to */
    private void m69579to(ChartSeries chartSeries) {
        boolean zM27456k4;
        int iM756ck = ChartTypeCharacterizer.m756ck(chartSeries.getType());
        if (iM756ck != 3 && iM756ck != 28) {
            List.Enumerator<IChartSeriesGroup> it = this.f48311x1.iterator();
            while (it.hasNext()) {
                try {
                    ChartSeriesGroup chartSeriesGroup = (ChartSeriesGroup) it.next();
                    if (ChartTypeCharacterizer.m764k4(chartSeries, chartSeriesGroup)) {
                        ((C14886zi) chartSeriesGroup.getSeries()).m74527k4(chartSeries);
                        if (zM27456k4) {
                            return;
                        } else {
                            return;
                        }
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
        }
        m69581kk(chartSeries);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final void copyTo(AbstractC14092to abstractC14092to, int i) {
        this.f48311x1.copyTo(abstractC14092to, i);
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return this.f48310k4;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final Object getSyncRoot() {
        return this;
    }

    @Override // com.aspose.slides.IChartSeriesGroupCollection
    public final IChartSeriesGroup get_Item(int i) {
        return this.f48311x1.get_Item(i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<IChartSeriesGroup> iterator() {
        return this.f48311x1.iterator();
    }

    @Override // com.aspose.slides.IGenericCollection
    public final IGenericEnumerator<IChartSeriesGroup> iteratorJava() {
        return this.f48311x1.iteratorJava();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69580k4(ChartSeries chartSeries) {
        if (chartSeries.getParentSeriesGroup() == null) {
            m69579to(chartSeries);
            return;
        }
        if (ChartTypeCharacterizer.m764k4(chartSeries, chartSeries.getParentSeriesGroup())) {
            return;
        }
        int gapWidth = chartSeries.getParentSeriesGroup().getGapWidth();
        int gapDepth = chartSeries.getParentSeriesGroup().getGapDepth();
        m69582x1(chartSeries);
        m69579to(chartSeries);
        chartSeries.getParentSeriesGroup().setGapWidth(gapWidth);
        chartSeries.getParentSeriesGroup().setGapDepth(gapDepth);
    }

    /* JADX INFO: renamed from: kk */
    public final ChartSeriesGroup m69581kk(ChartSeries chartSeries) {
        ChartSeriesGroup chartSeriesGroup = new ChartSeriesGroup(this, chartSeries);
        int i = 0;
        int size = 0;
        while (true) {
            if (i >= this.f48311x1.size()) {
                i = size;
                break;
            }
            if (!this.f48311x1.get_Item(i).getPlotOnSecondAxis() && chartSeriesGroup.getPlotOnSecondAxis()) {
                size = i + 1;
            } else {
                if (this.f48311x1.get_Item(i).getPlotOnSecondAxis() == chartSeriesGroup.getPlotOnSecondAxis() && !m69578k4(this.f48311x1.get_Item(i).getType(), chartSeriesGroup.getType()) && this.f48311x1.get_Item(i).getType() > chartSeriesGroup.getType()) {
                    break;
                }
                if (this.f48311x1.get_Item(i).getType() == chartSeriesGroup.getType() && this.f48311x1.get_Item(i).getPlotOnSecondAxis() == chartSeriesGroup.getPlotOnSecondAxis()) {
                    if (chartSeriesGroup.getPlotOnSecondAxis() == this.f48311x1.get_Item(i).getPlotOnSecondAxis() || chartSeriesGroup.getPlotOnSecondAxis()) {
                        i++;
                    }
                } else if (i == this.f48311x1.size() - 1) {
                    size = this.f48311x1.size();
                }
            }
            i++;
        }
        this.f48311x1.insertItem(i, chartSeriesGroup);
        return chartSeriesGroup;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final int size() {
        return this.f48311x1.size();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m69582x1(ChartSeries chartSeries) {
        IChartSeriesGroup parentSeriesGroup = chartSeries.getParentSeriesGroup();
        ((C14886zi) parentSeriesGroup.getSeries()).m74528x1(chartSeries);
        if (parentSeriesGroup.getSeries().size() == 0) {
            this.f48311x1.removeItem(parentSeriesGroup);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m69578k4(final int i, final int i2) {
        int[] iArr = {3, 2, 1, 0};
        return AbstractC14092to.m67241k4(AbstractC14092to.m67208k4((Object) iArr), (AbstractC14041ai) new AbstractC14041ai<Integer>() { // from class: com.aspose.slides.qh.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14041ai
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public boolean invoke(Integer num) {
                return num.intValue() == i;
            }
        }) && AbstractC14092to.m67241k4(AbstractC14092to.m67208k4((Object) iArr), (AbstractC14041ai) new AbstractC14041ai<Integer>() { // from class: com.aspose.slides.qh.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14041ai
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public boolean invoke(Integer num) {
                return num.intValue() == i2;
            }
        });
    }

    @Override // com.aspose.slides.IChartSeriesGroupCollection
    public final IChartSeriesGroup get_Item(IChartSeries iChartSeries) {
        return iChartSeries.getParentSeriesGroup();
    }
}
