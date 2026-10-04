package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes3.dex */
public final class RowCollection extends DomObject<Table> implements IRowCollection {

    /* JADX INFO: renamed from: du */
    private boolean f3250du;

    /* JADX INFO: renamed from: k4 */
    boolean f3251k4;

    /* JADX INFO: renamed from: kk */
    final ColumnCollection f3252kk;

    /* JADX INFO: renamed from: to */
    private final List<IRow> f3253to;

    /* JADX INFO: renamed from: x1 */
    double f3254x1;

    public RowCollection(Table table) {
        super(table);
        this.f3253to = new List<>();
        this.f3250du = true;
        this.f3251k4 = true;
        this.f3254x1 = 0.0d;
        this.f3252kk = new ColumnCollection(this);
    }

    /* JADX INFO: renamed from: kk */
    private C12023wl m2486kk(int i) {
        int size = this.f3252kk.size();
        Row rowM2491k4 = m2491k4(i);
        int firstRowIndex = i;
        if (i > 0) {
            int colSpan = 0;
            while (colSpan < size) {
                Cell cellM462du = rowM2491k4.mo484k4(colSpan).m462du();
                if (cellM462du.getFirstRowIndex() < firstRowIndex) {
                    firstRowIndex = cellM462du.getFirstRowIndex();
                    rowM2491k4 = m2491k4(firstRowIndex);
                    colSpan = 0;
                }
                colSpan += cellM462du.getColSpan();
            }
        }
        int rowSpan = i + 1;
        if (rowSpan < size()) {
            Row rowM2491k42 = m2491k4(i);
            int colSpan2 = 0;
            while (colSpan2 < size) {
                Cell cellM462du2 = rowM2491k42.mo484k4(colSpan2).m462du();
                if (cellM462du2.getRowSpan() + cellM462du2.getFirstRowIndex() > rowSpan) {
                    rowSpan = cellM462du2.getRowSpan() + cellM462du2.getFirstRowIndex();
                    rowM2491k42 = m2491k4(rowSpan - 1);
                    colSpan2 = 0;
                }
                colSpan2 += cellM462du2.getColSpan();
            }
        }
        return new C12023wl(firstRowIndex, rowSpan - firstRowIndex);
    }

    @Override // com.aspose.slides.IRowCollection
    public final IRow[] addClone(IRow iRow, boolean z) {
        return insertClone(size(), iRow, z);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final void copyTo(AbstractC14092to abstractC14092to, int i) {
        this.f3253to.copyTo(abstractC14092to, i);
    }

    /* JADX INFO: renamed from: du */
    public final void m2488du() {
        if (this.f3250du) {
            return;
        }
        for (int i = 0; i < size(); i++) {
            m2491k4(i).f3249x1 = i;
        }
        this.f3250du = true;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final Object getSyncRoot() {
        return this;
    }

    @Override // com.aspose.slides.IRowCollection
    public final IRow get_Item(int i) {
        if (i < 0 || i > size() - 1) {
            throw new IndexOutOfRangeException(C14113y2.m67402k4("value of index = {0} is out of range 0..{1}", Integer.valueOf(i), Integer.valueOf(size() - 1)));
        }
        return (Row) this.f3253to.get_Item(i);
    }

    /* JADX INFO: renamed from: h4 */
    public final void m2489h4() {
        if (this.f3251k4) {
            return;
        }
        m2493k4().m2546bz().mo5640kk();
        double height = 0.0d;
        for (int i = 0; i < size(); i++) {
            Row rowM2491k4 = m2491k4(i);
            rowM2491k4.f3249x1 = i;
            rowM2491k4.f3246kk = height;
            height += rowM2491k4.getHeight();
        }
        this.f3254x1 = height;
        this.f3251k4 = true;
        this.f3250du = true;
    }

    @Override // com.aspose.slides.IRowCollection
    public final IRow[] insertClone(int i, IRow iRow, boolean z) {
        Row[] rowArrM2501x1;
        Row row = (Row) iRow;
        if (m2493k4() != row.mo485k4()) {
            throw new PptxEditException("Clonning rows between different tables isn't supported.");
        }
        if (i < 0 || i > size()) {
            throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), "Wrong index of row");
        }
        if (m2495k4(i, true)) {
            throw new PptxEditException("Can't insert rows: target index breaks merged cells.");
        }
        if (z) {
            rowArrM2501x1 = row.m2480h4().m2501x1(row.m2483m9());
        } else {
            if (m2500x1(row.m2483m9(), true)) {
                throw new PptxEditException("Some of row's cells lay outside row.");
            }
            rowArrM2501x1 = new Row[]{row};
        }
        IRow[] iRowArr = new IRow[rowArrM2501x1.length];
        int length = rowArrM2501x1.length;
        while (length > 0) {
            length--;
            Row row2 = rowArrM2501x1[length];
            Row rowM2492k4 = m2492k4(i, row2.getMinimalHeight());
            iRowArr[length] = rowM2492k4;
            rowM2492k4.setMinimalHeight(row2.getMinimalHeight());
            int size = this.f3252kk.size();
            while (size > 0) {
                size--;
                Cell cellMo484k4 = row2.mo484k4(size);
                Cell cellMo484k42 = rowM2492k4.mo484k4(size);
                cellMo484k42.f1263x1 = cellMo484k4.f1263x1;
                cellMo484k42.f1258k4 = cellMo484k4.f1258k4;
                if (cellMo484k42.m474m9()) {
                    rowM2492k4.f3249x1 = i;
                    this.f3250du = true;
                    cellMo484k42.m479x1(false);
                }
                cellMo484k42.m469k4(cellMo484k4);
            }
        }
        this.f3250du = false;
        return iRowArr;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<IRow> iterator() {
        return this.f3253to.iterator();
    }

    @Override // com.aspose.slides.IGenericCollection
    public final IGenericEnumerator<IRow> iteratorJava() {
        return this.f3253to.iteratorJava();
    }

    /* JADX INFO: renamed from: k4 */
    public final Row m2490k4(double d) {
        return m2492k4(-1, d);
    }

    @Override // com.aspose.slides.IRowCollection
    public final void removeAt(int i, boolean z) {
        int size = size();
        if (z) {
            C12023wl c12023wlClone = m2486kk(i).Clone();
            m2487x1(c12023wlClone.m56865x1(), c12023wlClone.m56862kk());
        } else {
            int size2 = this.f3252kk.size();
            Row rowM2491k4 = m2491k4(i);
            for (int i2 = 0; i2 < size2; i2++) {
                if (rowM2491k4.get_Item(i2).getRowSpan() > 1) {
                    throw new PptxEditException("Some of row's cells lay outside row.");
                }
            }
            m2487x1(i, 1);
        }
        if (size == size() || size() <= 0) {
            return;
        }
        this.f3252kk.m1144du();
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final int size() {
        return this.f3253to.size();
    }

    /* JADX INFO: renamed from: to */
    public final void m2497to() {
        m2494k4(0, size());
    }

    /* JADX INFO: renamed from: x1 */
    public final double m2498x1() {
        m2489h4();
        return this.f3254x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final Row m2491k4(int i) {
        return (Row) this.f3253to.get_Item(i);
    }

    /* JADX INFO: renamed from: kk */
    public final void m2496kk() {
        m2487x1(0, size());
        this.f3250du = true;
        this.f3251k4 = true;
        this.f3254x1 = 0.0d;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m2499x1(int i, double d) {
        Row rowM2491k4 = m2491k4(i);
        if (d <= 0.0d || d >= rowM2491k4.getHeight()) {
            throw new ArgumentOutOfRangeException("Splitting height must be in greater than 0 and less than row's minimal height");
        }
        Row rowM2492k4 = m2492k4(i + 1, rowM2491k4.getHeight() - d);
        rowM2491k4.setMinimalHeight(d);
        int size = this.f3252kk.size();
        int i2 = 0;
        while (i2 < size) {
            Cell cellMo484k4 = rowM2491k4.mo484k4(i2);
            if (cellMo484k4.m463dy()) {
                cellMo484k4 = cellMo484k4.m462du();
            }
            cellMo484k4.f1258k4++;
            int colSpan = cellMo484k4.getColSpan();
            while (colSpan > 0) {
                colSpan--;
                rowM2492k4.mo484k4(i2).f1259kk = cellMo484k4;
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m2487x1(int i, int i2) {
        if (i2 == 0) {
            return;
        }
        if (i + i2 < size()) {
            this.f3250du = false;
        }
        this.f3251k4 = false;
        int size = this.f3252kk.size();
        int i3 = i;
        int i4 = 0;
        while (i4 < i2) {
            m2491k4(i3).m2485x1(0, size);
            i4++;
            i3++;
        }
        if (i == 0 && i2 == size()) {
            this.f3253to.clear();
        } else {
            this.f3253to.removeRange(i, i2);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final Row m2492k4(int i, double d) {
        Row row = new Row(this, d);
        if (i < 0 || i >= size()) {
            row.f3249x1 = this.f3253to.size();
            this.f3253to.addItem(row);
        } else {
            this.f3253to.insertItem(i, row);
            this.f3250du = false;
        }
        this.f3251k4 = false;
        row.m2484x1(this.f3252kk.size());
        return row;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final Table m2493k4() {
        return (Table) this.f2127h4;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m2500x1(int i, boolean z) {
        Cell cellMo484k4;
        int firstRowIndex;
        if (i == size()) {
            return false;
        }
        int size = this.f3252kk.size();
        Row rowM2491k4 = m2491k4(i);
        for (int colSpan = 0; colSpan < size; colSpan += cellMo484k4.getColSpan()) {
            cellMo484k4 = rowM2491k4.mo484k4(colSpan);
            if (cellMo484k4.m463dy() && (firstRowIndex = (cellMo484k4 = cellMo484k4.m462du()).getFirstRowIndex()) < i) {
                if (z) {
                    return true;
                }
                cellMo484k4 = cellMo484k4.m477x1(i - firstRowIndex);
            }
            if (cellMo484k4.getRowSpan() > 1) {
                if (z) {
                    return true;
                }
                cellMo484k4.m477x1(1);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2494k4(int i, int i2) {
        boolean z = this.f3251k4;
        int i3 = i2 + i;
        int size = this.f3252kk.size();
        while (i3 > i) {
            int i4 = i3 - 1;
            Row rowM2491k4 = m2491k4(i4);
            int colSpan = 0;
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    if (i4 > 0) {
                        Row rowM2491k42 = m2491k4(i3 - 2);
                        rowM2491k42.setMinimalHeight(rowM2491k4.getMinimalHeight() + rowM2491k42.getMinimalHeight());
                    }
                    while (colSpan < size) {
                        Cell cellM462du = rowM2491k4.mo484k4(colSpan).m462du();
                        cellM462du.f1258k4--;
                        colSpan += cellM462du.getColSpan();
                    }
                    m2487x1(i4, 1);
                } else if (!rowM2491k4.mo484k4(i5).m463dy()) {
                    break;
                } else {
                    i5++;
                }
            }
            i3 = i4;
        }
        this.f3251k4 = z;
    }

    /* JADX INFO: renamed from: x1 */
    public final Row[] m2501x1(int i) {
        C12023wl c12023wlClone = m2486kk(i).Clone();
        int iM56862kk = c12023wlClone.m56862kk();
        Row[] rowArr = new Row[iM56862kk];
        for (int i2 = 0; i2 < iM56862kk; i2++) {
            rowArr[i2] = m2491k4(c12023wlClone.m56865x1() + i2);
        }
        return rowArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m2495k4(int i, boolean z) {
        if (i >= 1 && i != size()) {
            int size = this.f3252kk.size();
            Row rowM2491k4 = m2491k4(i);
            int colSpan = 0;
            while (colSpan < size) {
                Cell cellMo484k4 = rowM2491k4.mo484k4(colSpan);
                if (cellMo484k4.m463dy()) {
                    cellMo484k4 = cellMo484k4.m462du();
                }
                int firstRowIndex = cellMo484k4.getFirstRowIndex();
                if (firstRowIndex < i) {
                    if (z) {
                        return true;
                    }
                    cellMo484k4.m477x1(i - firstRowIndex);
                }
                colSpan += cellMo484k4.getColSpan();
            }
        }
        return false;
    }
}
