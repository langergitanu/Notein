package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class ColumnCollection extends DomObject<RowCollection> implements IColumnCollection {

    /* JADX INFO: renamed from: k4 */
    private final List<IColumn> f1998k4;

    /* JADX INFO: renamed from: kk */
    private boolean f1999kk;

    /* JADX INFO: renamed from: to */
    private double f2000to;

    /* JADX INFO: renamed from: x1 */
    private boolean f2001x1;

    public ColumnCollection(RowCollection rowCollection) {
        super(rowCollection);
        this.f1998k4 = new List<>();
        this.f2001x1 = true;
        this.f1999kk = true;
        this.f2000to = 0.0d;
    }

    @Override // com.aspose.slides.IColumnCollection
    public final IColumn[] addClone(IColumn iColumn, boolean z) {
        return insertClone(size(), iColumn, z);
    }

    /* JADX INFO: renamed from: c5 */
    public final void m1143c5() {
        List.Enumerator<IColumn> it = this.f1998k4.iterator();
        while (it.hasNext()) {
            try {
                ((Column) it.next()).f1996to = false;
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final void copyTo(AbstractC14092to abstractC14092to, int i) {
        this.f1998k4.copyTo(abstractC14092to, i);
    }

    /* JADX INFO: renamed from: du */
    public final void m1144du() {
        m1151k4(0, size());
    }

    /* JADX INFO: renamed from: dy */
    public final void m1145dy() {
        this.f1999kk = false;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final Object getSyncRoot() {
        return this;
    }

    @Override // com.aspose.slides.IColumnCollection
    public final IColumn get_Item(int i) {
        if (i < 0 || i > size() - 1) {
            throw new IndexOutOfRangeException(C14113y2.m67402k4("value of index = {0} is out of range 0..{1}", Integer.valueOf(i), Integer.valueOf(size() - 1)));
        }
        return this.f1998k4.get_Item(i);
    }

    /* JADX INFO: renamed from: h4 */
    public final void m1146h4() {
        if (this.f2001x1) {
            return;
        }
        for (int i = 0; i < size(); i++) {
            m1147k4(i).f1997x1 = i;
        }
        this.f2001x1 = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.IColumnCollection
    public final IColumn[] insertClone(int i, IColumn iColumn, boolean z) {
        Column[] columnArrM1140kk;
        Column column = (Column) iColumn;
        if (m1149k4() != column.mo485k4()) {
            throw new PptxEditException("Clonning columns between different tables isn't supported.");
        }
        if (i < 0 || i > size()) {
            throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), "Wrong index of column");
        }
        if (m1152k4(i, true)) {
            throw new PptxEditException("Can't insert columns: target index breaks merged cells.");
        }
        if (z) {
            columnArrM1140kk = column.m1138h4().m1140kk(column.m1139m9());
        } else {
            if (m1158x1(column.m1139m9(), true)) {
                throw new PptxEditException("Some of row's cells lay outside column.");
            }
            columnArrM1140kk = new Column[]{column};
        }
        IColumn[] iColumnArr = new IColumn[columnArrM1140kk.length];
        int length = columnArrM1140kk.length;
        while (length > 0) {
            length--;
            Column column2 = columnArrM1140kk[length];
            Column columnM1148k4 = m1148k4(i, column2.getWidth());
            m1146h4();
            iColumnArr[length] = columnM1148k4;
            int size = ((RowCollection) this.f2127h4).size();
            while (size > 0) {
                size--;
                Cell cellMo484k4 = column2.mo484k4(size);
                Cell cellMo484k42 = columnM1148k4.mo484k4(size);
                cellMo484k42.m469k4(cellMo484k4);
                cellMo484k42.f1263x1 = cellMo484k4.f1263x1;
                cellMo484k42.f1258k4 = cellMo484k4.f1258k4;
                if (cellMo484k42.m474m9()) {
                    columnM1148k4.f1997x1 = i;
                    this.f2001x1 = true;
                    cellMo484k42.m479x1(false);
                }
            }
        }
        this.f2001x1 = false;
        return iColumnArr;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<IColumn> iterator() {
        return this.f1998k4.iterator();
    }

    @Override // com.aspose.slides.IGenericCollection
    public final IGenericEnumerator<IColumn> iteratorJava() {
        return this.f1998k4.iteratorJava();
    }

    /* JADX INFO: renamed from: k4 */
    public final Column m1147k4(int i) {
        return (Column) this.f1998k4.get_Item(i);
    }

    /* JADX INFO: renamed from: kk */
    public final double m1153kk() {
        m1154m9();
        return this.f2000to;
    }

    /* JADX INFO: renamed from: m9 */
    public final void m1154m9() {
        if (this.f1999kk) {
            return;
        }
        this.f2000to = 0.0d;
        for (int i = 0; i < size(); i++) {
            Column columnM1147k4 = m1147k4(i);
            columnM1147k4.f1997x1 = i;
            double d = this.f2000to;
            columnM1147k4.f1995kk = d;
            this.f2000to = columnM1147k4.getWidth() + d;
        }
        this.f1999kk = true;
        this.f2001x1 = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.IColumnCollection
    public final void removeAt(int i, boolean z) {
        int size = size();
        if (z) {
            C12023wl c12023wlClone = m1141x1(i).Clone();
            m1142x1(c12023wlClone.m56865x1(), c12023wlClone.m56862kk());
        } else {
            int size2 = ((RowCollection) this.f2127h4).size();
            Column columnM1147k4 = m1147k4(i);
            for (int i2 = 0; i2 < size2; i2++) {
                if (columnM1147k4.get_Item(i2).getColSpan() > 1) {
                    throw new PptxEditException("Some of column's cells lay outside column.");
                }
            }
            m1142x1(i, 1);
        }
        if (size == size() || size() <= 0) {
            return;
        }
        ((RowCollection) this.f2127h4).m2497to();
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final int size() {
        return this.f1998k4.size();
    }

    /* JADX INFO: renamed from: to */
    public final void m1155to() {
        m1142x1(0, size());
        this.f2001x1 = true;
        this.f1999kk = true;
        this.f2000to = 0.0d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x1 */
    public final RowCollection m1156x1() {
        return (RowCollection) this.f2127h4;
    }

    /* JADX INFO: renamed from: kk */
    private Column[] m1140kk(int i) {
        C12023wl c12023wlClone = m1141x1(i).Clone();
        int iM56862kk = c12023wlClone.m56862kk();
        Column[] columnArr = new Column[iM56862kk];
        for (int i2 = 0; i2 < iM56862kk; i2++) {
            columnArr[i2] = m1147k4(c12023wlClone.m56865x1() + i2);
        }
        return columnArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x1 */
    private C12023wl m1141x1(int i) {
        int size = ((RowCollection) this.f2127h4).size();
        Column columnM1147k4 = m1147k4(i);
        int firstColumnIndex = i;
        if (i > 0) {
            int rowSpan = 0;
            while (rowSpan < size) {
                Cell cellMo484k4 = columnM1147k4.mo484k4(rowSpan);
                if (cellMo484k4.getFirstColumnIndex() < firstColumnIndex) {
                    firstColumnIndex = cellMo484k4.getFirstColumnIndex();
                    columnM1147k4 = m1147k4(firstColumnIndex);
                    rowSpan = 0;
                }
                rowSpan += cellMo484k4.getRowSpan();
            }
        }
        int colSpan = i + 1;
        if (colSpan < size()) {
            Column columnM1147k42 = m1147k4(i);
            int rowSpan2 = 0;
            while (rowSpan2 < size) {
                Cell cellM462du = columnM1147k42.mo484k4(rowSpan2).m462du();
                if (cellM462du.getColSpan() + cellM462du.getFirstColumnIndex() > colSpan) {
                    colSpan = cellM462du.getColSpan() + cellM462du.getFirstColumnIndex();
                    columnM1147k42 = m1147k4(colSpan - 1);
                    rowSpan2 = 0;
                }
                rowSpan2 += cellM462du.getRowSpan();
            }
        }
        return new C12023wl(firstColumnIndex, colSpan - firstColumnIndex);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final Column m1148k4(int i, double d) {
        Column column = new Column(this, d);
        int size = ((RowCollection) this.f2127h4).size();
        if (i < 0 || i >= size()) {
            column.f1997x1 = this.f1998k4.size();
            this.f1998k4.addItem(column);
            i = -1;
        } else {
            this.f1998k4.insertItem(i, column);
            column.f1997x1 = i;
            this.f2001x1 = false;
        }
        this.f1999kk = false;
        for (int i2 = 0; i2 < size; i2++) {
            ((RowCollection) this.f2127h4).m2491k4(i2).m2482k4(i, 1);
        }
        return column;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final Table m1149k4() {
        return ((RowCollection) this.f2127h4).m2493k4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x1 */
    public final void m1157x1(int i, double d) {
        Column columnM1147k4 = m1147k4(i);
        if (d <= 0.0d || d >= columnM1147k4.getWidth()) {
            throw new ArgumentOutOfRangeException("Splitting width must be in greater than 0 and less than cell's width");
        }
        Column columnM1148k4 = m1148k4(i + 1, columnM1147k4.getWidth() - d);
        columnM1147k4.setWidth(d);
        int size = ((RowCollection) this.f2127h4).size();
        int i2 = 0;
        while (i2 < size) {
            Cell cellMo484k4 = columnM1147k4.mo484k4(i2);
            if (cellMo484k4.m463dy()) {
                cellMo484k4 = cellMo484k4.m462du();
            }
            cellMo484k4.f1263x1++;
            int rowSpan = cellMo484k4.getRowSpan();
            while (rowSpan > 0) {
                rowSpan--;
                columnM1148k4.mo484k4(i2).f1259kk = cellMo484k4;
                i2++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x1 */
    private void m1142x1(int i, int i2) {
        if (i2 == 0) {
            return;
        }
        if (i + i2 < size()) {
            this.f2001x1 = false;
        }
        this.f1999kk = false;
        int size = ((RowCollection) this.f2127h4).size();
        while (size > 0) {
            size--;
            ((RowCollection) this.f2127h4).m2491k4(size).m2485x1(i, i2);
        }
        if (i == 0 && i2 == size()) {
            this.f1998k4.clear();
        } else {
            this.f1998k4.removeRange(i, i2);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1150k4(double d) {
        m1148k4(-1, d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final void m1151k4(int i, int i2) {
        boolean z = this.f1999kk;
        int i3 = i2 + i;
        int size = ((RowCollection) this.f2127h4).size();
        while (i3 > i) {
            int i4 = i3 - 1;
            Column columnM1147k4 = m1147k4(i4);
            int rowSpan = 0;
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    if (i4 > 0) {
                        Column columnM1147k42 = m1147k4(i3 - 2);
                        columnM1147k42.setWidth(columnM1147k4.getWidth() + columnM1147k42.getWidth());
                    }
                    while (rowSpan < size) {
                        Cell cellM462du = columnM1147k4.mo484k4(rowSpan).m462du();
                        cellM462du.f1263x1--;
                        rowSpan += cellM462du.getRowSpan();
                    }
                    m1142x1(i4, 1);
                } else if (!columnM1147k4.mo484k4(i5).m463dy()) {
                    break;
                } else {
                    i5++;
                }
            }
            i3 = i4;
        }
        this.f1999kk = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x1 */
    public final boolean m1158x1(int i, boolean z) {
        Cell cellMo484k4;
        int firstColumnIndex;
        if (i == size()) {
            return false;
        }
        int size = ((RowCollection) this.f2127h4).size();
        Column columnM1147k4 = m1147k4(i);
        for (int rowSpan = 0; rowSpan < size; rowSpan += cellMo484k4.getRowSpan()) {
            cellMo484k4 = columnM1147k4.mo484k4(rowSpan);
            if (cellMo484k4.m463dy() && (firstColumnIndex = (cellMo484k4 = cellMo484k4.m462du()).getFirstColumnIndex()) < i) {
                if (z) {
                    return true;
                }
                cellMo484k4 = cellMo484k4.m467k4(i - firstColumnIndex);
            }
            if (cellMo484k4.getColSpan() > 1) {
                if (z) {
                    return true;
                }
                cellMo484k4.m467k4(1);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final boolean m1152k4(int i, boolean z) {
        if (i >= 1 && i != size()) {
            int size = ((RowCollection) this.f2127h4).size();
            Column columnM1147k4 = m1147k4(i);
            int rowSpan = 0;
            while (rowSpan < size) {
                Cell cellM462du = columnM1147k4.mo484k4(rowSpan).m462du();
                int firstColumnIndex = cellM462du.getFirstColumnIndex();
                if (firstColumnIndex < i) {
                    if (z) {
                        return true;
                    }
                    cellM462du.m467k4(i - firstColumnIndex);
                }
                rowSpan += cellM462du.getRowSpan();
            }
        }
        return false;
    }
}
