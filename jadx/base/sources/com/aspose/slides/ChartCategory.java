package com.aspose.slides;

import com.aspose.slides.exceptions.InvalidOperationException;

/* JADX INFO: loaded from: classes3.dex */
public class ChartCategory implements IChartCategory, InterfaceC14397rj {

    /* JADX INFO: renamed from: du */
    private ChartCategoryCollection f1321du;

    /* JADX INFO: renamed from: k4 */
    private Object f1322k4;

    /* JADX INFO: renamed from: kk */
    private C0828br f1323kk = new C0828br();

    /* JADX INFO: renamed from: to */
    private Object f1324to;

    /* JADX INFO: renamed from: x1 */
    private ChartCategoryLevelsManager f1325x1;

    public ChartCategory(ChartCategoryCollection chartCategoryCollection) {
        this.f1321du = chartCategoryCollection;
    }

    @Override // com.aspose.slides.IChartCategory
    public final IChartDataCell getAsCell() {
        if (getUseCell()) {
            return getGroupingLevels().get_Item(0);
        }
        throw new InvalidOperationException("See ChartCategory.UseCell property summary.");
    }

    @Override // com.aspose.slides.IChartCategory
    public final Object getAsLiteral() {
        if (getUseCell()) {
            throw new InvalidOperationException("See ChartCategory.UseCell property summary.");
        }
        return this.f1324to;
    }

    @Override // com.aspose.slides.IChartCategory
    public final IChartCategoryLevelsManager getGroupingLevels() {
        if (!getUseCell()) {
            return null;
        }
        if (this.f1321du.getUseCells()) {
            ((ChartData) C0754al.m3657k4(ChartData.class, this.f1321du)).m553x1().mo5704k4();
        }
        if (this.f1325x1 == null) {
            this.f1325x1 = new ChartCategoryLevelsManager(this);
        }
        return this.f1325x1;
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return this.f1321du;
    }

    @Override // com.aspose.slides.IChartCategory
    public final boolean getUseCell() {
        return this.f1321du.getUseCells();
    }

    @Override // com.aspose.slides.IChartCategory
    public final Object getValue() {
        return getUseCell() ? getAsCell().getValue() : getAsLiteral();
    }

    /* JADX INFO: renamed from: k4 */
    public final Object m522k4() {
        return this.f1322k4;
    }

    /* JADX INFO: renamed from: kk */
    public final Object m525kk() {
        return (((ChartData) C0754al.m3657k4(ChartData.class, this.f1321du)).m553x1().mo5710kk() == 2 || !this.f1321du.getUseCells()) ? getValue() : m526x1().m4304k4() > 0 ? m526x1().m4305k4(0) : m522k4();
    }

    @Override // com.aspose.slides.IChartCategory
    public final void remove() {
        ChartCategoryCollection chartCategoryCollection = this.f1321du;
        if (chartCategoryCollection == null) {
            throw new PptxEditException("Category is already removed from chart.");
        }
        synchronized (chartCategoryCollection.getSyncRoot()) {
            ((ChartData) C0754al.m3657k4(ChartData.class, this.f1321du)).getChartDataWorkbook();
            this.f1321du.m534k4(this);
            this.f1321du = null;
        }
    }

    @Override // com.aspose.slides.IChartCategory
    public final void setAsCell(IChartDataCell iChartDataCell) {
        if (!getUseCell()) {
            throw new InvalidOperationException("See ChartCategory.UseCell property summary.");
        }
        ((ChartData) C0754al.m3657k4(ChartData.class, this.f1321du)).m553x1().mo5706k4((ChartDataCell) iChartDataCell);
        getGroupingLevels().setGroupingItem(0, iChartDataCell);
    }

    @Override // com.aspose.slides.IChartCategory
    public final void setAsLiteral(Object obj) {
        if (getUseCell()) {
            throw new InvalidOperationException("See ChartCategory.UseCell property summary.");
        }
        this.f1324to = obj;
    }

    @Override // com.aspose.slides.IChartCategory
    public final void setValue(Object obj) {
        if (getUseCell()) {
            getAsCell().setValue(obj);
        } else {
            setAsLiteral(obj);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final C0828br m526x1() {
        return this.f1323kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final Object m523k4(int i) {
        if (((ChartData) C0754al.m3657k4(ChartData.class, this.f1321du)).m553x1().mo5710kk() != 2) {
            return m526x1().m4305k4(i);
        }
        if (getGroupingLevels() == null || getGroupingLevels().get_Item(i) != null) {
            return getGroupingLevels().get_Item(i).getValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m524k4(Object obj) {
        this.f1322k4 = obj;
    }
}
