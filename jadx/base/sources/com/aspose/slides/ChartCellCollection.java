package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p492x4.C12380dy;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.ControlChar;
import com.huawei.hms.network.embedded.C18241k5;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class ChartCellCollection implements IChartCellCollection, InterfaceC14397rj {

    /* JADX INFO: renamed from: k4 */
    private Chart f1334k4;

    /* JADX INFO: renamed from: to */
    private InterfaceC14397rj f1336to;

    /* JADX INFO: renamed from: x1 */
    private final List<C14355qp> f1337x1 = new List<>();

    /* JADX INFO: renamed from: kk */
    private final Dictionary<String, List<C14355qp>> f1335kk = new Dictionary<>();

    public ChartCellCollection(InterfaceC14397rj interfaceC14397rj) {
        this.f1336to = interfaceC14397rj;
    }

    /* JADX INFO: renamed from: kk */
    private Chart m542kk() {
        Chart chart = this.f1334k4;
        if (chart == null) {
            Chart[] chartArr = {chart};
            kke.m63959k4(Chart.class, this.f1336to, chartArr);
            this.f1334k4 = chartArr[0];
        }
        return this.f1334k4;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m543x1() {
        String name = null;
        int column = -1;
        int row = -1;
        for (int i = 0; i < this.f1337x1.size(); i++) {
            ChartDataCell chartDataCell = (ChartDataCell) this.f1337x1.get_Item(i).m69722k4();
            if ((column != -1 || name != null) && ((row != -1 || name != null) && ((chartDataCell.getColumn() - column != 1 || !C14113y2.m67363du(name, chartDataCell.getChartDataWorksheet().getName())) && (chartDataCell.getRow() - row != 1 || !C14113y2.m67363du(name, chartDataCell.getChartDataWorksheet().getName()))))) {
                return false;
            }
            column = chartDataCell.getColumn();
            row = chartDataCell.getRow();
            name = chartDataCell.getChartDataWorksheet().getName();
        }
        return true;
    }

    @Override // com.aspose.slides.IChartCellCollection
    public final void add(IChartDataCell iChartDataCell) {
        if (iChartDataCell == null) {
            throw new ArgumentNullException();
        }
        String strM561du = ((ChartDataCell) iChartDataCell).m561du();
        C14355qp c14355qp = new C14355qp(iChartDataCell, this);
        if (!this.f1335kk.containsKey(strM561du)) {
            this.f1335kk.addItem(strM561du, new List<>());
        }
        List<C14355qp> list = this.f1335kk.get_Item(strM561du);
        int iIndexOf = -1;
        for (int i = 0; i < list.size(); i++) {
            iIndexOf = this.f1337x1.indexOf(list.get_Item(i), iIndexOf + 1);
            if (iIndexOf != -1) {
                this.f1337x1.set_Item(iIndexOf, c14355qp);
            }
            list.set_Item(i, c14355qp);
        }
        this.f1337x1.addItem(c14355qp);
        list.addItem(c14355qp);
    }

    @Override // com.aspose.slides.IChartCellCollection
    public final String getCellsAddress() {
        String strM67400k4 = "";
        if (this.f1337x1.size() == 0) {
            return "";
        }
        ChartDataCell chartDataCell = (ChartDataCell) this.f1337x1.get_Item(0).m69722k4();
        if (this.f1337x1.size() == 1) {
            String strM561du = chartDataCell.m561du();
            String strM67358c5 = C14113y2.m67358c5(strM561du);
            int i = 0;
            while (true) {
                if (i >= strM67358c5.length()) {
                    break;
                }
                if (C14117yj.m67539to(strM561du.charAt(i))) {
                    strM67358c5 = C14113y2.m67397k4(strM67358c5, i, "$");
                    break;
                }
                i++;
            }
            return C14113y2.m67408k4(m541k4(chartDataCell.getChartDataWorksheet().getName()), "!") + C14113y2.m67397k4(strM67358c5, 0, "$");
        }
        ChartDataCell chartDataCell2 = chartDataCell;
        ChartDataCell chartDataCell3 = chartDataCell2;
        ChartDataCell chartDataCell4 = chartDataCell3;
        for (int i2 = 0; i2 < this.f1337x1.size(); i2++) {
            ChartDataCell chartDataCell5 = (ChartDataCell) this.f1337x1.get_Item(i2).m69722k4();
            if (chartDataCell5.getColumn() < chartDataCell.getColumn()) {
                chartDataCell = chartDataCell5;
            }
            if (chartDataCell5.getColumn() > chartDataCell2.getColumn()) {
                chartDataCell2 = chartDataCell5;
            }
            if (chartDataCell5.getRow() < chartDataCell4.getRow()) {
                chartDataCell4 = chartDataCell5;
            }
            if (chartDataCell5.getRow() > chartDataCell3.getRow()) {
                chartDataCell3 = chartDataCell5;
            }
        }
        if (chartDataCell.getColumn() == chartDataCell2.getColumn() && (chartDataCell3.getRow() - chartDataCell4.getRow()) + 1 == this.f1337x1.size()) {
            String strM561du2 = chartDataCell4.m561du();
            String strM67358c52 = C14113y2.m67358c5(strM561du2);
            int i3 = 0;
            while (true) {
                if (i3 >= strM67358c52.length()) {
                    break;
                }
                if (C14117yj.m67539to(strM561du2.charAt(i3))) {
                    strM67358c52 = C14113y2.m67397k4(strM67358c52, i3, "$");
                    break;
                }
                i3++;
            }
            String strM561du3 = chartDataCell3.m561du();
            String strM67358c53 = C14113y2.m67358c5(strM561du3);
            int i4 = 0;
            while (true) {
                if (i4 >= strM67358c53.length()) {
                    break;
                }
                if (C14117yj.m67539to(strM561du3.charAt(i4))) {
                    strM67358c53 = C14113y2.m67397k4(strM67358c53, i4, "$");
                    break;
                }
                i4++;
            }
            return C14113y2.m67408k4(m541k4(chartDataCell4.getChartDataWorksheet().getName()), "!", C14113y2.m67397k4(strM67358c52, 0, "$"), C18241k5.f55433h) + C14113y2.m67397k4(strM67358c53, 0, "$");
        }
        if (chartDataCell4.getRow() == chartDataCell2.getRow() && (chartDataCell2.getColumn() - chartDataCell.getColumn()) + 1 == this.f1337x1.size()) {
            String strM561du4 = chartDataCell.m561du();
            String strM67358c54 = C14113y2.m67358c5(strM561du4);
            int i5 = 0;
            while (true) {
                if (i5 >= strM67358c54.length()) {
                    break;
                }
                if (C14117yj.m67539to(strM561du4.charAt(i5))) {
                    strM67358c54 = C14113y2.m67397k4(strM67358c54, i5, "$");
                    break;
                }
                i5++;
            }
            String strM561du5 = chartDataCell2.m561du();
            String strM67358c55 = C14113y2.m67358c5(strM561du5);
            int i6 = 0;
            while (true) {
                if (i6 >= strM67358c55.length()) {
                    break;
                }
                if (C14117yj.m67539to(strM561du5.charAt(i6))) {
                    strM67358c55 = C14113y2.m67397k4(strM67358c55, i6, "$");
                    break;
                }
                i6++;
            }
            return C14113y2.m67408k4(m541k4(chartDataCell.getChartDataWorksheet().getName()), "!", C14113y2.m67397k4(strM67358c54, 0, "$"), C18241k5.f55433h) + C14113y2.m67397k4(strM67358c55, 0, "$");
        }
        if (!m543x1()) {
            for (int i7 = 0; i7 < this.f1337x1.size(); i7++) {
                ChartDataCell chartDataCell6 = (ChartDataCell) this.f1337x1.get_Item(i7).m69722k4();
                String strM561du6 = chartDataCell6.m561du();
                String strM67358c56 = C14113y2.m67358c5(strM561du6);
                int i8 = 0;
                while (true) {
                    if (i8 >= strM67358c56.length()) {
                        break;
                    }
                    if (C14117yj.m67539to(strM561du6.charAt(i8))) {
                        strM67358c56 = C14113y2.m67397k4(strM67358c56, i8, "$");
                        break;
                    }
                    i8++;
                }
                strM67400k4 = C14113y2.m67400k4(strM67400k4, C14113y2.m67408k4(m541k4(chartDataCell6.getChartDataWorksheet().getName()), "!") + C14113y2.m67397k4(strM67358c56, 0, "$"));
                if (this.f1337x1.size() > 1 && i7 < this.f1337x1.size() - 1) {
                    strM67400k4 = C14113y2.m67400k4(strM67400k4, C11697x1.m55252to().m55260ck().m55238kk());
                }
            }
            return strM67400k4;
        }
        if (this.f1337x1.size() == 0) {
            return "";
        }
        if (this.f1337x1.size() == 1) {
            ChartDataCell chartDataCell7 = (ChartDataCell) this.f1337x1.get_Item(0).m69722k4();
            String strM561du7 = chartDataCell7.m561du();
            String strM67358c57 = C14113y2.m67358c5(strM561du7);
            int i9 = 0;
            while (true) {
                if (i9 >= strM67358c57.length()) {
                    break;
                }
                if (C14117yj.m67539to(strM561du7.charAt(i9))) {
                    strM67358c57 = C14113y2.m67397k4(strM67358c57, i9, "$");
                    break;
                }
                i9++;
            }
            return C14113y2.m67408k4(m541k4(chartDataCell7.getChartDataWorksheet().getName()), "!") + C14113y2.m67397k4(strM67358c57, 0, "$");
        }
        ChartDataCell chartDataCell8 = (ChartDataCell) this.f1337x1.get_Item(0).m69722k4();
        ChartDataCell chartDataCell9 = (ChartDataCell) ((C14355qp) OooO0O0.OooO00o(this.f1337x1, 1)).m69722k4();
        String strM561du8 = chartDataCell8.m561du();
        String strM67358c58 = C14113y2.m67358c5(strM561du8);
        int i10 = 0;
        while (true) {
            if (i10 >= strM67358c58.length()) {
                break;
            }
            if (C14117yj.m67539to(strM561du8.charAt(i10))) {
                strM67358c58 = C14113y2.m67397k4(strM67358c58, i10, "$");
                break;
            }
            i10++;
        }
        String strM561du9 = chartDataCell9.m561du();
        String strM67358c59 = C14113y2.m67358c5(strM561du9);
        int i11 = 0;
        while (true) {
            if (i11 >= strM67358c59.length()) {
                break;
            }
            if (C14117yj.m67539to(strM561du9.charAt(i11))) {
                strM67358c59 = C14113y2.m67397k4(strM67358c59, i11, "$");
                break;
            }
            i11++;
        }
        return C14113y2.m67408k4(m541k4(chartDataCell8.getChartDataWorksheet().getName()), "!", C14113y2.m67397k4(strM67358c58, 0, "$"), C18241k5.f55433h) + C14113y2.m67397k4(strM67358c59, 0, "$");
    }

    @Override // com.aspose.slides.IChartCellCollection
    public final String getConcatenatedValuesFromCells() {
        IGenericEnumerator<IChartDataCell> it = iterator();
        String strM67400k4 = "";
        while (it.hasNext()) {
            try {
                strM67400k4 = C14113y2.m67400k4(strM67400k4, C14113y2.m67407k4(((ChartDataCell) it.next()).m574m9(), Character.valueOf(ControlChar.SPACE_CHAR)));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return !"".equals(strM67400k4) ? C14113y2.m67394k4(strM67400k4, strM67400k4.length() - 1) : strM67400k4;
    }

    @Override // com.aspose.slides.IChartCellCollection
    public final int getCount() {
        return this.f1337x1.size();
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return this.f1336to;
    }

    @Override // com.aspose.slides.IChartCellCollection
    public final IChartDataCell get_Item(int i) {
        return this.f1337x1.get_Item(i).m69722k4();
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<IChartDataCell> iterator() {
        List list = new List();
        List.Enumerator<C14355qp> it = this.f1337x1.iterator();
        while (it.hasNext()) {
            try {
                list.addItem((ChartDataCell) it.next().m69722k4());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return new C13746kt(list);
    }

    public final IGenericEnumerator<IChartDataCell> iteratorJava() {
        List list = new List();
        List.Enumerator<C14355qp> it = this.f1337x1.iterator();
        while (it.hasNext()) {
            try {
                list.addItem((ChartDataCell) it.next().m69722k4());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return new C13668j0(list);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m544k4() {
        if (this.f1337x1.size() == 0) {
            return "";
        }
        ChartDataCell chartDataCell = (ChartDataCell) this.f1337x1.get_Item(0).m69722k4();
        if (this.f1337x1.size() == 1) {
            String strM561du = chartDataCell.m561du();
            String strM67358c5 = C14113y2.m67358c5(strM561du);
            int i = 0;
            while (true) {
                if (i >= strM67358c5.length()) {
                    break;
                }
                if (C14117yj.m67539to(strM561du.charAt(i))) {
                    strM67358c5 = C14113y2.m67397k4(strM67358c5, i, "$");
                    break;
                }
                i++;
            }
            return C14113y2.m67408k4(chartDataCell.getChartDataWorksheet().getName(), "!") + C14113y2.m67397k4(strM67358c5, 0, "$");
        }
        String name = chartDataCell.getChartDataWorksheet().getName();
        for (int i2 = 1; i2 < this.f1337x1.size(); i2++) {
            if (!C14113y2.m67363du(name, ((ChartDataCell) this.f1337x1.get_Item(i2).m69722k4()).getChartDataWorksheet().getName())) {
                throw new ArgumentException("Cells must be on the same worksheet");
            }
        }
        ChartDataCell chartDataCell2 = chartDataCell;
        ChartDataCell chartDataCell3 = chartDataCell2;
        ChartDataCell chartDataCell4 = chartDataCell3;
        for (int i3 = 0; i3 < this.f1337x1.size(); i3++) {
            ChartDataCell chartDataCell5 = (ChartDataCell) this.f1337x1.get_Item(i3).m69722k4();
            if (chartDataCell5.getColumn() < chartDataCell.getColumn()) {
                chartDataCell = chartDataCell5;
            }
            if (chartDataCell5.getColumn() > chartDataCell3.getColumn()) {
                chartDataCell3 = chartDataCell5;
            }
            if (chartDataCell5.getRow() < chartDataCell2.getRow()) {
                chartDataCell2 = chartDataCell5;
            }
            if (chartDataCell5.getRow() > chartDataCell4.getRow()) {
                chartDataCell4 = chartDataCell5;
            }
        }
        String strM67408k4 = C14113y2.m67408k4(name, "!");
        char[] cArr = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        return C14113y2.m67400k4(C14113y2.m67400k4(C14113y2.m67400k4(C14113y2.m67400k4(strM67408k4, C14113y2.m67408k4("$", C14113y2.m67443x1(chartDataCell.m561du(), 0, C14113y2.m67384k4(chartDataCell.m561du(), cArr)))), C14113y2.m67408k4("$", C14113y2.m67422kk(chartDataCell2.m561du(), C14113y2.m67384k4(chartDataCell2.m561du(), cArr)))), C14113y2.m67408k4(C18241k5.f55433h, "$", C14113y2.m67443x1(chartDataCell3.m561du(), 0, C14113y2.m67384k4(chartDataCell3.m561du(), cArr)))), C14113y2.m67408k4("$", C14113y2.m67422kk(chartDataCell4.m561du(), C14113y2.m67384k4(chartDataCell4.m561du(), cArr))));
    }

    @Override // com.aspose.slides.IChartCellCollection
    public final void removeAt(int i) {
        ChartDataCell chartDataCell = (ChartDataCell) this.f1337x1.get_Item(i).m69722k4();
        if (chartDataCell != null && this.f1335kk.containsKey(chartDataCell.m561du())) {
            this.f1335kk.get_Item(chartDataCell.m561du()).removeItem(this.f1337x1.get_Item(i));
        }
        this.f1337x1.removeAt(i);
    }

    /* JADX INFO: renamed from: k4 */
    private String m541k4(String str) {
        return C12380dy.m57972k4(str, "[\\w.]", "").length() > 0 ? C14113y2.m67408k4("'", str, "'") : str;
    }

    @Override // com.aspose.slides.IChartCellCollection
    public final void add(Object obj) {
        ChartDataCell chartDataCellM669dy = ((ChartDataWorkbook) m542kk().getChartData().getChartDataWorkbook()).m669dy();
        chartDataCellM669dy.setValue(obj);
        add((IChartDataCell) chartDataCellM669dy);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final void m545k4(IGenericEnumerable<ChartDataCell> iGenericEnumerable) {
        List list = new List();
        IGenericEnumerator<ChartDataCell> it = iGenericEnumerable.iterator();
        while (it.hasNext()) {
            try {
                list.addItem(new C14355qp(it.next(), this));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        this.f1337x1.addRange(list);
        List.Enumerator it2 = list.iterator();
        while (it2.hasNext()) {
            try {
                C14355qp c14355qp = (C14355qp) it2.next();
                String strM561du = ((ChartDataCell) c14355qp.m69722k4()).m561du();
                if (!this.f1335kk.containsKey(strM561du)) {
                    this.f1335kk.addItem(strM561du, new List<>());
                }
                this.f1335kk.get_Item(strM561du).addItem(c14355qp);
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
    }
}
