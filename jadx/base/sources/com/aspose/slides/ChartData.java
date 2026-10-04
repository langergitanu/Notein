package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.slides.p559ms.System.IDisposable;
import com.huawei.hms.network.embedded.C18241k5;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class ChartData extends DomObject<Chart> implements IChartData {

    /* JADX INFO: renamed from: du */
    private final ChartCategoryCollection f1338du;

    /* JADX INFO: renamed from: k4 */
    private final ett f1339k4;

    /* JADX INFO: renamed from: kk */
    private final C14346qh f1340kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f1341m9;

    /* JADX INFO: renamed from: to */
    private final ChartCategoryCollection f1342to;

    /* JADX INFO: renamed from: x1 */
    private final ChartSeriesCollection f1343x1;

    public ChartData(Chart chart) {
        super(chart);
        this.f1342to = new ChartCategoryCollection(this);
        this.f1338du = new ChartCategoryCollection(this);
        this.f1343x1 = new ChartSeriesCollection(this);
        this.f1340kk = new C14346qh(this);
        this.f1339k4 = new oaj(chart);
    }

    /* JADX INFO: renamed from: du */
    private void m546du() {
        int i;
        IGenericEnumerator<IChartDataCell> it;
        int i2 = 1;
        boolean z = getSeries().get_Item(0).getDataPoints().get_Item(0).getXValue().getAsCell().getRow() != getSeries().get_Item(0).getDataPoints().get_Item(0).getYValue().getAsCell().getRow();
        int type = getSeries().get_Item(0).getType();
        boolean zIsChartTypeBubble = ChartTypeCharacterizer.isChartTypeBubble(type);
        IGenericEnumerator<IChartSeries> it2 = getSeries().iterator();
        int i3 = Integer.MAX_VALUE;
        int i4 = 0;
        int i5 = 0;
        int i6 = Integer.MAX_VALUE;
        while (it2.hasNext()) {
            try {
                IChartSeries next = it2.next();
                if (next.getName().getAsCells() != null) {
                    it = next.getName().getAsCells().iterator();
                    while (it.hasNext()) {
                        try {
                            int[] iArr = {i3};
                            int[] iArr2 = {i4};
                            int[] iArr3 = {i6};
                            int[] iArr4 = {i5};
                            m548k4(it.next(), iArr, iArr2, iArr3, iArr4);
                            i3 = iArr[0];
                            i4 = iArr2[0];
                            i6 = iArr3[0];
                            i5 = iArr4[0];
                        } finally {
                        }
                    }
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
                it = next.getDataPoints().iterator();
                while (it.hasNext()) {
                    try {
                        IChartDataPoint next2 = it.next();
                        int[] iArr5 = {i3};
                        int[] iArr6 = {i4};
                        int[] iArr7 = {i6};
                        int[] iArr8 = {i5};
                        m548k4(next2.getXValue().getAsCell(), iArr5, iArr6, iArr7, iArr8);
                        int i7 = iArr5[0];
                        int i8 = iArr6[0];
                        int i9 = iArr7[0];
                        int i10 = iArr8[0];
                        iArr5[0] = i7;
                        iArr6[0] = i8;
                        iArr7[0] = i9;
                        iArr8[0] = i10;
                        m548k4(next2.getYValue().getAsCell(), iArr5, iArr6, iArr7, iArr8);
                        i3 = iArr5[0];
                        int i11 = iArr6[0];
                        int i12 = iArr7[0];
                        i5 = iArr8[0];
                        if (zIsChartTypeBubble) {
                            iArr5[0] = i3;
                            iArr6[0] = i11;
                            iArr7[0] = i12;
                            iArr8[0] = i5;
                            m548k4(next2.getBubbleSize().getAsCell(), iArr5, iArr6, iArr7, iArr8);
                            i3 = iArr5[0];
                            i11 = iArr6[0];
                            i12 = iArr7[0];
                            i5 = iArr8[0];
                        }
                        int i13 = i12;
                        i4 = i11;
                        i6 = i13;
                    } finally {
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            it2.dispose();
        }
        getSeries().clear();
        int i14 = zIsChartTypeBubble ? 2 : 1;
        long j = 1;
        if (z) {
            int i15 = i6 + 1;
            IChartSeries iChartSeriesAdd = getSeries().add(getChartDataWorkbook().getCell(0, i3, i15), type);
            long j2 = 0;
            for (int i16 = i3 + 1; i16 <= i4; i16 += i14) {
                AbstractC13703jv.m63555k4(iChartSeriesAdd.getDataPoints().getOrCreateDataPointByIdx(j2), 0).setAsCell(getChartDataWorkbook().getCell(0, i16, i6));
                iChartSeriesAdd.getDataPoints().get_Item(iChartSeriesAdd.getDataPoints().size() - 1).getYValue().setAsCell(getChartDataWorkbook().getCell(0, i16, i15));
                iChartSeriesAdd.getDataPoints().get_Item(iChartSeriesAdd.getDataPoints().size() - 1).getBubbleSize().setAsCell(getChartDataWorkbook().getCell(0, i16, i6 + 2));
                j2++;
            }
            return;
        }
        int i17 = i3 + 1;
        while (i17 <= i4) {
            IChartSeries iChartSeriesAdd2 = getSeries().add(type);
            int i18 = i2;
            int i19 = i14;
            int i20 = i6;
            long j3 = 0;
            while (true) {
                long j4 = j;
                if (i20 <= i5) {
                    AbstractC13703jv.m63555k4(iChartSeriesAdd2.getDataPoints().getOrCreateDataPointByIdx(j3), 0).setAsCell(getChartDataWorkbook().getCell(0, i3, i20));
                    iChartSeriesAdd2.getDataPoints().get_Item(iChartSeriesAdd2.getDataPoints().size() - i18).getYValue().setAsCell(getChartDataWorkbook().getCell(0, i17, i20));
                    if (ChartTypeCharacterizer.isChartTypeBubble(type) && (i = i17 + 1) <= i4) {
                        iChartSeriesAdd2.getDataPoints().get_Item(iChartSeriesAdd2.getDataPoints().size() - 1).getBubbleSize().setAsCell(getChartDataWorkbook().getCell(0, i, i20));
                    }
                    j3 += j4;
                    i20++;
                    j = j4;
                }
            }
            i17 += i19;
            i2 = i18;
            i14 = i19;
        }
    }

    /* JADX INFO: renamed from: h4 */
    private void m547h4() {
        int size = getSeries().size();
        IChartSeries[] iChartSeriesArr = new IChartSeries[size];
        getSeries().copyTo(AbstractC14092to.m67208k4((Object) iChartSeriesArr), 0);
        getSeries().clear();
        int i = 0;
        while (true) {
            if (i >= getCategories().size()) {
                break;
            }
            IChartSeries iChartSeriesAdd = getSeries().add(getCategories().get_Item(i).getAsCell(), (i < size ? iChartSeriesArr[i] : iChartSeriesArr[size - 1]).getType());
            ChartCategoryLevelsManager chartCategoryLevelsManager = (ChartCategoryLevelsManager) getCategories().get_Item(i).getGroupingLevels();
            for (int i2 = 1; i2 <= chartCategoryLevelsManager.m540k4(); i2++) {
                iChartSeriesAdd.getName().getAsCells().add(chartCategoryLevelsManager.get_Item(i2));
            }
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC13703jv.m63555k4(iChartSeriesAdd.getDataPoints().getOrCreateDataPointByIdx(((long) i3) & 4294967295L), 3).setAsCell(AbstractC13703jv.m63555k4(iChartSeriesArr[i3].getDataPoints().get_Item(i), 3).getAsCell());
            }
            i++;
        }
        getCategories().clear();
        for (int i4 = 0; i4 < size; i4++) {
            if (iChartSeriesArr[i4].getName().getAsCells() != null && iChartSeriesArr[i4].getName().getAsCells().getCount() > 1) {
                int count = iChartSeriesArr[i4].getName().getAsCells().getCount();
                IChartDataCell[] iChartDataCellArr = new ChartDataCell[count];
                for (int i5 = 0; i5 < iChartSeriesArr[i4].getName().getAsCells().getCount(); i5++) {
                    iChartDataCellArr[i5] = iChartSeriesArr[i4].getName().getAsCells().get_Item(i5);
                }
                AbstractC14092to.m67248to(AbstractC14092to.m67208k4((Object) iChartDataCellArr));
                IChartCategory iChartCategoryAdd = getCategories().add(iChartDataCellArr[0]);
                for (int i6 = 1; i6 < count; i6++) {
                    iChartCategoryAdd.getGroupingLevels().setGroupingItem(i6, iChartDataCellArr[i6]);
                }
            } else if (iChartSeriesArr[i4].getName().getAsCells() != null && iChartSeriesArr[i4].getName().getAsCells().getCount() > 0) {
                getCategories().add(iChartSeriesArr[i4].getName().getAsCells().get_Item(0));
            }
        }
    }

    @Override // com.aspose.slides.IChartData
    public final IChartCategoryCollection getCategories() {
        return this.f1342to;
    }

    @Override // com.aspose.slides.IChartData
    public final IChartDataWorkbook getChartDataWorkbook() {
        return m553x1().mo5713x1();
    }

    @Override // com.aspose.slides.IChartData
    public final int getDataSourceType() {
        return m553x1().mo5711m9();
    }

    @Override // com.aspose.slides.IChartData
    public final String getExternalWorkbookPath() {
        return m553x1().mo5703h4();
    }

    @Override // com.aspose.slides.IChartData
    public final String getRange() {
        int[] iArr = {0};
        int[] iArr2 = {0};
        int[] iArr3 = {0};
        int[] iArr4 = {0};
        ((ChartDataWorkbook) C7019kk.m27452k4((Object) getChartDataWorkbook(), ChartDataWorkbook.class)).m683k4(iArr, iArr2, iArr3, iArr4);
        int i = iArr[0];
        int i2 = iArr2[0];
        int i3 = iArr3[0];
        int i4 = iArr4[0];
        ChartDataWorksheet chartDataWorksheetM673k4 = ((ChartDataWorkbook) C7019kk.m27452k4((Object) getChartDataWorkbook(), ChartDataWorkbook.class)).m673k4(this);
        if (chartDataWorksheetM673k4 == null) {
            throw new InvalidOperationException("Chart data doesn't have workbook reference.");
        }
        String strM561du = chartDataWorksheetM673k4.m703x1().m63051x1(i2, i).m561du();
        String strM67358c5 = C14113y2.m67358c5(strM561du);
        int i5 = 0;
        while (true) {
            if (i5 >= strM67358c5.length()) {
                break;
            }
            if (C14117yj.m67539to(strM561du.charAt(i5))) {
                strM67358c5 = C14113y2.m67397k4(strM67358c5, i5, "$");
                break;
            }
            i5++;
        }
        String strM561du2 = chartDataWorksheetM673k4.m703x1().m63051x1(i4, i3).m561du();
        String strM67358c52 = C14113y2.m67358c5(strM561du2);
        int i6 = 0;
        while (true) {
            if (i6 >= strM67358c52.length()) {
                break;
            }
            if (C14117yj.m67539to(strM561du2.charAt(i6))) {
                strM67358c52 = C14113y2.m67397k4(strM67358c52, i6, "$");
                break;
            }
            i6++;
        }
        return C14113y2.m67408k4(chartDataWorksheetM673k4.getName(), "!", C14113y2.m67397k4(strM67358c5, 0, "$"), C18241k5.f55433h) + C14113y2.m67397k4(strM67358c52, 0, "$");
    }

    @Override // com.aspose.slides.IChartData
    public final IChartCategoryCollection getSecondaryCategories() {
        if (this.f1341m9) {
            return this.f1338du;
        }
        return null;
    }

    @Override // com.aspose.slides.IChartData
    public final IChartSeriesCollection getSeries() {
        return this.f1343x1;
    }

    @Override // com.aspose.slides.IChartData
    public final IChartSeriesGroupCollection getSeriesGroups() {
        return this.f1340kk;
    }

    @Override // com.aspose.slides.IChartData
    public final boolean getUseSecondaryCategories() {
        return this.f1341m9;
    }

    /* JADX INFO: renamed from: k4 */
    public C3152yj m549k4() {
        return m553x1().mo5701du();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: kk */
    public final void m551kk() {
        ChartDataCell chartDataCell;
        ChartDataCell chartDataCell2;
        ChartDataCell chartDataCell3;
        ChartDataCell chartDataCell4;
        ChartDataWorkbook chartDataWorkbook = (ChartDataWorkbook) getChartDataWorkbook();
        boolean plotVisibleCellsOnly = ((Chart) this.f2127h4).getPlotVisibleCellsOnly();
        IGenericEnumerator<IChartSeries> it = this.f1343x1.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            try {
                IChartSeries next = it.next();
                if (next.getName().getDataSourceType() == 0) {
                    String cellsAddress = next.getName().getAsCells().getCellsAddress();
                    if (C14113y2.m67411k4(cellsAddress)) {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                            return;
                        }
                        return;
                    }
                    next.getName().setAsCells(chartDataWorkbook.getCellCollection(cellsAddress, false));
                }
                IGenericEnumerator<IChartDataPoint> it2 = next.getDataPoints().iterator();
                while (it2.hasNext()) {
                    try {
                        IChartDataPoint next2 = it2.next();
                        if (next.getDataPoints().getDataSourceTypeForValues() == 0 && (chartDataCell4 = (ChartDataCell) next2.getValue().getAsCell()) != null) {
                            next2.getValue().setAsCell(chartDataWorkbook.getCell(chartDataCell4.getChartDataWorksheet().getIndex(), chartDataCell4.m561du()));
                        }
                        if (next.getDataPoints().getDataSourceTypeForXValues() == 0 && (chartDataCell3 = (ChartDataCell) next2.getXValue().getAsCell()) != null) {
                            next2.getXValue().setAsCell(chartDataWorkbook.getCell(chartDataCell3.getChartDataWorksheet().getIndex(), chartDataCell3.m561du()));
                        }
                        if (next.getDataPoints().getDataSourceTypeForYValues() == 0 && (chartDataCell2 = (ChartDataCell) next2.getYValue().getAsCell()) != null) {
                            next2.getYValue().setAsCell(chartDataWorkbook.getCell(chartDataCell2.getChartDataWorksheet().getIndex(), chartDataCell2.m561du()));
                        }
                        if (next.getDataPoints().getDataSourceTypeForBubbleSizes() == 0 && (chartDataCell = (ChartDataCell) next2.getBubbleSize().getAsCell()) != null) {
                            next2.getBubbleSize().setAsCell(chartDataWorkbook.getCell(chartDataCell.getChartDataWorksheet().getIndex(), chartDataCell.m561du()));
                        }
                        if (next.getType() == 75 || next.getType() == 74) {
                            ChartDataCell chartDataCell5 = (ChartDataCell) next2.getSizeValue().getAsCell();
                            if (chartDataCell5 != null) {
                                next2.getSizeValue().setAsCell(chartDataWorkbook.getCell(chartDataCell5.getChartDataWorksheet().getIndex(), chartDataCell5.m561du()));
                            }
                        }
                    } catch (Throwable th) {
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            it2.dispose();
                        }
                        throw th;
                    }
                }
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
                int i = 0;
                while (i < next.getDataPoints().size()) {
                    IChartDataPoint iChartDataPoint = next.getDataPoints().get_Item(i);
                    IChartDataCell asCell = iChartDataPoint.getValue().getAsCell();
                    if (plotVisibleCellsOnly && asCell != null && asCell.isHidden()) {
                        iChartDataPoint.remove();
                        i--;
                    }
                    i++;
                }
                if ((!next.getPlotOnSecondAxis() || !this.f1341m9) && !z && this.f1342to.getUseCells()) {
                    if (this.f1342to.getGroupingLevelCount() > 1) {
                        ChartCategoryCollection chartCategoryCollection = this.f1342to;
                        C1233hz.m7338k4(chartCategoryCollection, chartCategoryCollection.m529du(), chartDataWorkbook, this.f1342to.getGroupingLevelCount());
                    } else {
                        ChartCategoryCollection chartCategoryCollection2 = this.f1342to;
                        C1233hz.m7339k4((IChartCategoryCollection) chartCategoryCollection2, chartCategoryCollection2.m529du(), (IChartDataWorkbook) chartDataWorkbook, false);
                    }
                    z = true;
                }
                if (next.getPlotOnSecondAxis() && this.f1341m9 && !z2 && this.f1338du.getUseCells()) {
                    if (this.f1338du.getGroupingLevelCount() > 1) {
                        ChartCategoryCollection chartCategoryCollection3 = this.f1338du;
                        C1233hz.m7338k4(chartCategoryCollection3, chartCategoryCollection3.m529du(), chartDataWorkbook, this.f1338du.getGroupingLevelCount());
                    } else {
                        ChartCategoryCollection chartCategoryCollection4 = this.f1338du;
                        C1233hz.m7339k4((IChartCategoryCollection) chartCategoryCollection4, chartCategoryCollection4.m529du(), (IChartDataWorkbook) chartDataWorkbook, false);
                    }
                    z2 = true;
                }
            } catch (Throwable th2) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th2;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    @Override // com.aspose.slides.IChartData
    public final byte[] readWorkbookStream() {
        return m549k4().toArray();
    }

    @Override // com.aspose.slides.IChartData
    public final void setExternalWorkbook(String str) {
        m553x1().mo5708k4(str, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.IChartData
    public final void setRange(String str) {
        if (str == null) {
            throw new ArgumentNullException("formula");
        }
        if (C14113y2.m67363du(str, C14113y2.f47374k4)) {
            throw new ArgumentException("Formula couldn't be empty", "formula");
        }
        int type = ((Chart) this.f2127h4).getType() == 73 ? getSeries().get_Item(0).getType() : ((Chart) this.f2127h4).getType();
        new C14277pd(str, this).m69027k4(ChartTypeCharacterizer.isChartTypeBubble(type) ? new C1121fu() : ChartTypeCharacterizer.isChartTypeScatter(type) ? new pt7() : new C14642un());
    }

    @Override // com.aspose.slides.IChartData
    public final void setUseSecondaryCategories(boolean z) {
        this.f1341m9 = z;
    }

    @Override // com.aspose.slides.IChartData
    public final void switchRowColumn() {
        if (ChartTypeCharacterizer.m762k4(getSeries().get_Item(0).getType()) == 5) {
            m546du();
        } else {
            m547h4();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: to */
    public final Chart m552to() {
        return (Chart) this.f2127h4;
    }

    @Override // com.aspose.slides.IChartData
    public final void writeWorkbookStream(byte[] bArr) {
        m550k4(new C3152yj(bArr));
    }

    /* JADX INFO: renamed from: x1 */
    public final ett m553x1() {
        return this.f1339k4;
    }

    /* JADX INFO: renamed from: k4 */
    private void m548k4(IChartDataCell iChartDataCell, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        if (iChartDataCell == null) {
            return;
        }
        if (iChartDataCell.getRow() < iArr[0]) {
            iArr[0] = iChartDataCell.getRow();
        }
        if (iChartDataCell.getRow() > iArr2[0]) {
            iArr2[0] = iChartDataCell.getRow();
        }
        if (iChartDataCell.getColumn() < iArr3[0]) {
            iArr3[0] = iChartDataCell.getColumn();
        }
        if (iChartDataCell.getColumn() > iArr4[0]) {
            iArr4[0] = iChartDataCell.getColumn();
        }
    }

    @Override // com.aspose.slides.IChartData
    public final void setExternalWorkbook(String str, boolean z) {
        m553x1().mo5708k4(str, z);
    }

    /* JADX INFO: renamed from: k4 */
    public void m550k4(C3152yj c3152yj) {
        m553x1().mo5707k4(c3152yj);
        if (m553x1().mo5710kk() == 2) {
            m551kk();
        }
    }
}
