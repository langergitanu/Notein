package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.huawei.hms.network.embedded.C18358t1;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class ChartDataWorksheetCollection implements IChartDataWorksheetCollection, InterfaceC14397rj {

    /* JADX INFO: renamed from: k4 */
    ChartDataWorkbook f1440k4;

    /* JADX INFO: renamed from: x1 */
    int f1442x1 = 0;

    /* JADX INFO: renamed from: kk */
    private List<IChartDataWorksheet> f1441kk = new List<>();

    public ChartDataWorksheetCollection(ChartDataWorkbook chartDataWorkbook) {
        this.f1440k4 = chartDataWorkbook;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final void copyTo(AbstractC14092to abstractC14092to, int i) {
        this.f1441kk.copyTo(abstractC14092to, i);
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return this.f1440k4;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final Object getSyncRoot() {
        return this;
    }

    @Override // com.aspose.slides.IChartDataWorksheetCollection
    public final IChartDataWorksheet get_Item(int i) {
        if (i < 0 || i >= size()) {
            throw new IndexOutOfRangeException("Index can't be less than zero or equal to or greater than Count");
        }
        return this.f1441kk.get_Item(i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<IChartDataWorksheet> iterator() {
        return this.f1441kk.iterator();
    }

    @Override // com.aspose.slides.IGenericCollection
    public final IGenericEnumerator<IChartDataWorksheet> iteratorJava() {
        return this.f1441kk.iteratorJava();
    }

    /* JADX INFO: renamed from: k4 */
    public final ChartDataWorksheet m704k4() {
        ChartDataWorksheet chartDataWorksheet = new ChartDataWorksheet(this);
        if (C18358t1.g.f56183c.equals(chartDataWorksheet.getName())) {
            chartDataWorksheet.m700k4(C14113y2.m67408k4("Sheet", C14057f9.m66591x1(this.f1442x1)));
        }
        int i = this.f1442x1;
        this.f1442x1 = i + 1;
        chartDataWorksheet.m697k4(i);
        this.f1441kk.addItem(chartDataWorksheet);
        return chartDataWorksheet;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final int size() {
        return this.f1441kk.size();
    }

    /* JADX INFO: renamed from: x1 */
    public final ChartDataWorkbook m706x1() {
        return this.f1440k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final ChartDataWorksheet m705k4(String str) {
        ChartDataWorksheet chartDataWorksheetM704k4 = m704k4();
        chartDataWorksheetM704k4.m700k4(str);
        return chartDataWorksheetM704k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final ChartDataWorksheet m707x1(String str) {
        List.Enumerator<IChartDataWorksheet> it = this.f1441kk.iterator();
        while (it.hasNext()) {
            try {
                ChartDataWorksheet chartDataWorksheet = (ChartDataWorksheet) it.next();
                if (C14113y2.m67363du(chartDataWorksheet.getName(), str)) {
                    return chartDataWorksheet;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return null;
        }
        it.dispose();
        return null;
    }
}
