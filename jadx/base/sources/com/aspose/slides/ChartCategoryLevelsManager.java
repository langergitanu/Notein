package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
public class ChartCategoryLevelsManager implements IChartCategoryLevelsManager {

    /* JADX INFO: renamed from: k4 */
    private List<C14355qp> f1332k4;

    /* JADX INFO: renamed from: x1 */
    private InterfaceC14397rj f1333x1;

    public ChartCategoryLevelsManager(InterfaceC14397rj interfaceC14397rj) {
        this.f1333x1 = interfaceC14397rj;
        List<C14355qp> list = new List<>();
        this.f1332k4 = list;
        list.addItem(null);
    }

    @Override // com.aspose.slides.IChartCategoryLevelsManager
    public final void deleteGroupingItem(int i) {
        if (i <= 0 || i >= this.f1332k4.size()) {
            return;
        }
        this.f1332k4.set_Item(i, null);
        for (int size = this.f1332k4.size() - 1; size > 0 && this.f1332k4.get_Item(size) == null; size--) {
            this.f1332k4.removeAt(size);
        }
    }

    @Override // com.aspose.slides.IChartCategoryLevelsManager
    public final IChartDataCell get_Item(int i) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException("level must be >= 0");
        }
        if (i < this.f1332k4.size() && this.f1332k4.get_Item(i) != null) {
            return this.f1332k4.get_Item(i).m69722k4();
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m540k4() {
        return this.f1332k4.size() - 1;
    }

    @Override // com.aspose.slides.IChartCategoryLevelsManager
    public final void setGroupingItem(int i, Object obj) {
        ChartDataCell chartDataCell = this.f1332k4.get_Item(0) != null ? (ChartDataCell) this.f1332k4.get_Item(0).m69722k4() : null;
        if (i < 0) {
            throw new ArgumentOutOfRangeException("level must be >= 0");
        }
        if (i == 0 && !C7019kk.m27469x1(obj, ChartDataCell.class) && chartDataCell == null) {
            throw new ArgumentException("Undefined workbook cell for category of level 0.");
        }
        if (chartDataCell != null && chartDataCell.getColumn() - i < 0) {
            throw new ArgumentException(C14113y2.m67408k4("Cell for category of level 0 has Name \"", chartDataCell.m561du(), "\". ", "It's zero-based column number is ", C14057f9.m66591x1(chartDataCell.getColumn()), ". ", "So max level for this category is ", C14057f9.m66591x1(chartDataCell.getColumn()), "."));
        }
        for (int size = this.f1332k4.size(); size <= i; size++) {
            this.f1332k4.addItem(null);
        }
        IChartDataCell iChartDataCell = (IChartDataCell) C7019kk.m27452k4(obj, IChartDataCell.class);
        if (iChartDataCell != null) {
            this.f1332k4.set_Item(i, new C14355qp(iChartDataCell, this.f1333x1));
        } else {
            if (chartDataCell == null) {
                throw new NullReferenceException("ChartDataCell couldn't be empty.");
            }
            this.f1332k4.set_Item(i, new C14355qp(((ChartDataWorksheet) chartDataCell.getChartDataWorksheet()).m702to().getCell(chartDataCell.getChartDataWorksheet().getIndex(), chartDataCell.getRow(), chartDataCell.getColumn() - i, obj), this.f1333x1));
        }
    }
}
