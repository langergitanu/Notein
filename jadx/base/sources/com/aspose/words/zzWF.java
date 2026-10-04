package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzWF {
    private boolean zzZzb;
    private boolean zzZzc;
    private int zzZzd;
    private int zzZze;
    private Border zzZzg;
    private boolean zzZzh;
    private boolean zzZzi;
    private boolean zzZzj;
    private boolean zzZzk;
    private boolean zzZzl;
    private boolean zzZzm;
    private boolean zzZzn;
    private boolean zzZzo;
    private Table zzZzr;
    private com.aspose.words.internal.zzZYV<Object> zzZzf = new com.aspose.words.internal.zzZYV<>();
    private ArrayList<zzWG> zzZEU = new ArrayList<>();
    private boolean zzZzq = true;
    private boolean zzZzp = false;

    public zzWF(Table table, int i) {
        this.zzZzr = table;
        this.zzZzo = (i & 1) != 0;
        this.zzZzn = (i & 2) != 0;
        zz4J();
        if (getColumnCount() == 0) {
            return;
        }
        zz4I();
        zz4H();
        zz4G();
        zz4C();
        if (this.zzZzb) {
            zz4F();
        }
        zz4y();
    }

    private void zz4A() {
        zzWG zzwg = this.zzZEU.get(0);
        double dZzY = 0.0d;
        for (zzWG zzwg2 : this.zzZEU) {
            if (zzwg2.zz4X()) {
                dZzY += zzY(zzwg2.zz4Z());
            } else {
                if (dZzY > 0.0d) {
                    zzwg.zzZ3(dZzY + zzY(zzwg.zz4Z()));
                }
                dZzY = 0.0d;
                zzwg = zzwg2;
            }
        }
        if (dZzY > 0.0d) {
            zzwg.zzZ3(dZzY + zzY(zzwg.zz4Z()));
        }
    }

    private void zz4B() {
        boolean z;
        int i = 0;
        for (zzWG zzwg : this.zzZEU) {
            zzWH[] zzwhArrZz4Y = zzwg.zz4Y();
            int length = zzwhArrZz4Y.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z = true;
                    break;
                } else {
                    if (zzwhArrZz4Y[i2].zz6G().getVerticalMerge() != 2) {
                        z = false;
                        break;
                    }
                    i2++;
                }
            }
            if (z) {
                i++;
            }
            zzwg.zzYw(z);
            zzwg.zzOh(i);
        }
    }

    private void zz4C() {
        zz4B();
        zz4A();
        zz4z();
    }

    private void zz4F() {
        if (this.zzZzp) {
            zzY6G zzy6gZzXXa = this.zzZzr.getFirstRow().zzZYf().zzXXa();
            this.zzZzm = zzy6gZzXXa.zzVE(4060);
            this.zzZzl = zzy6gZzXXa.zzVE(4080);
            this.zzZzk = zzy6gZzXXa.zzVE(4050);
            this.zzZzj = zzy6gZzXXa.zzVE(4070);
            this.zzZzi = zzy6gZzXXa.zzVE(4090);
            boolean zZzVE = zzy6gZzXXa.zzVE(EditingLanguage.CHINESE_SINGAPORE);
            this.zzZzh = zZzVE;
            this.zzZzg = (this.zzZzm || this.zzZzl || this.zzZzk || this.zzZzj || this.zzZzi || zZzVE) ? new Border(0, 0, com.aspose.words.internal.zzPV.zzHZ) : null;
        }
        for (int i = 0; i < this.zzZEU.size(); i++) {
            zzWG zzwg = this.zzZEU.get(i);
            for (int i2 = 0; zzZ(zzwg.zz4Y()[i2], i, i2); i2++) {
            }
            int columnCount = getColumnCount();
            do {
                columnCount--;
            } while (zzZ(zzwg.zz4Y()[columnCount], i, columnCount));
        }
    }

    private void zz4G() {
        for (int i = 0; i < getColumnCount(); i++) {
            int i2 = 1;
            for (int size = this.zzZEU.size() - 1; size >= 0; size--) {
                zzWH zzwh = this.zzZEU.get(size).zz4Y()[i];
                int verticalMerge = zzwh.zz6G().getVerticalMerge();
                if (verticalMerge == 0 || verticalMerge == 1) {
                    zzwh.zzOj(i2);
                    i2 = 1;
                } else {
                    if (verticalMerge != 2) {
                        throw new IllegalStateException("Unknown CellMerge type.");
                    }
                    i2++;
                }
            }
        }
    }

    private void zz4H() {
        for (int i = 0; i < this.zzZEU.size(); i++) {
            int i2 = 1;
            for (int columnCount = getColumnCount() - 1; columnCount >= 0; columnCount--) {
                zzWH zzwh = this.zzZEU.get(i).zz4Y()[columnCount];
                int horizontalMerge = zzwh.zz6G().getHorizontalMerge();
                if (horizontalMerge == 0 || horizontalMerge == 1) {
                    zzwh.zz6G().setWidth(zzYr(columnCount, i2));
                    zzwh.zzOk(i2);
                    i2 = 1;
                } else {
                    if (horizontalMerge != 2) {
                        throw new IllegalStateException("Unknown CellMerge type.");
                    }
                    i2++;
                }
            }
        }
    }

    private void zz4I() {
        int i;
        Cell cell;
        RowCollection rowCollection;
        int i2;
        Cell cell2;
        RowCollection rows = this.zzZzr.getRows();
        int count = rows.getCount();
        int i3 = 0;
        this.zzZzc = false;
        int i4 = 0;
        while (i4 < count) {
            zzWG zzwg = new zzWG(getColumnCount(), rows.get(i4));
            com.aspose.words.internal.zzZQG.zzZ(this.zzZEU, zzwg);
            zzZ(zzwg);
            CellCollection cells = zzwg.zz4Z().getCells();
            int count2 = cells.getCount();
            int i5 = i3;
            int i6 = i5;
            while (i5 < count2) {
                Cell cell3 = cells.get(i5);
                zzWP zzwpZz5r = cell3.zz6G().zz5r();
                int width = zzwpZz5r.getWidth();
                if (zzwpZz5r.zz5B() && width == 0) {
                    rowCollection = rows;
                    i2 = count;
                    i = i4;
                } else {
                    zzWH zzwhZzZ = zzWH.zzZ(zzwpZz5r, cell3);
                    int iZzX = zzX(zzwg.zz4Z(), i5);
                    int iIndexOfKey = this.zzZzf.indexOfKey(iZzX);
                    int iIndexOfKey2 = this.zzZzf.indexOfKey(width + iZzX);
                    zzwg.zz4Y()[iIndexOfKey] = zzwhZzZ;
                    if (zzwpZz5r.getHorizontalMerge() == 1) {
                        int i7 = i5 + 1;
                        cell = cell3;
                        while (true) {
                            if (i7 >= count2) {
                                i = i4;
                                break;
                            }
                            Cell cell4 = cells.get(i7);
                            int i8 = i7;
                            i = i4;
                            if (cell4.zz6G().zz5r().getHorizontalMerge() != 2) {
                                break;
                            }
                            i7 = i8 + 1;
                            cell = cell4;
                            i4 = i;
                        }
                    } else {
                        i = i4;
                        cell = cell3;
                    }
                    if (zzwpZz5r.getVerticalMerge() == 1) {
                        int i9 = i + 1;
                        cell2 = cell3;
                        while (i9 < count) {
                            Cell cellZzW = zzW(rows.get(i9), iZzX);
                            if (cellZzW == null) {
                                break;
                            }
                            rowCollection = rows;
                            i2 = count;
                            if (cellZzW.zz6G().zz5r().getVerticalMerge() != 2) {
                                break;
                            }
                            i9++;
                            cell2 = cellZzW;
                            count = i2;
                            rows = rowCollection;
                        }
                        rowCollection = rows;
                        i2 = count;
                    } else {
                        rowCollection = rows;
                        i2 = count;
                        cell2 = cell3;
                    }
                    zzWP zzwpZz6G = zzwhZzZ.zz6G();
                    zzZ(zzwpZz6G, cell3, 3110);
                    zzZ(zzwpZz6G, cell3, 3120);
                    zzZ(zzwpZz6G, cell2, 3130);
                    zzZ(zzwpZz6G, cell, 3140);
                    zzZ(zzwpZz6G, cell3, 3150);
                    zzZ(zzwpZz6G, cell3, 3160);
                    zzY(zzwpZz6G, cell3, 3070);
                    zzY(zzwpZz6G, cell3, 3090);
                    zzY(zzwpZz6G, cell3, 3080);
                    zzY(zzwpZz6G, cell3, 3100);
                    for (int i10 = iIndexOfKey + 1; i10 < iIndexOfKey2; i10++) {
                        zzwg.zz4Y()[i10] = zzWH.zzY(zzwpZz6G, cell3);
                    }
                    if (iIndexOfKey2 - iIndexOfKey > 1) {
                        i6 = 1;
                    }
                }
                i5++;
                count = i2;
                i4 = i;
                rows = rowCollection;
            }
            RowCollection rowCollection2 = rows;
            int i11 = count;
            int i12 = i4;
            if (i6 == 0) {
                this.zzZzc = true;
            }
            i4 = i12 + 1;
            count = i11;
            rows = rowCollection2;
            i3 = 0;
        }
    }

    private void zz4J() {
        for (Row firstRow = this.zzZzr.getFirstRow(); firstRow != null; firstRow = firstRow.getNextRow()) {
            int iZzX = zzX(firstRow);
            this.zzZzf.set(iZzX, null);
            Iterator<T> it = firstRow.getCells().iterator();
            while (it.hasNext()) {
                iZzX += ((Cell) it.next()).zz6G().zz5r().getWidth();
                this.zzZzf.set(iZzX, null);
            }
        }
    }

    private void zz4y() {
        zzWG zzwg = null;
        boolean z = false;
        for (zzWG zzwg2 : this.zzZEU) {
            zzwg2.zzYv((zzwg == null || zzwg.isHeading()) && zzW(zzwg2.zz4Z()));
            if (zzwg2.isHeading()) {
                z = true;
            }
            if (z && (zzwg == null || zzwg.isHeading() != zzwg2.isHeading())) {
                zzwg2.zz4T();
            }
            zzwg = zzwg2;
        }
    }

    private void zz4z() {
        for (int i = 0; i < this.zzZEU.size(); i++) {
            zzWG zzwg = this.zzZEU.get(i);
            for (zzWH zzwh : zzwg.zz4Y()) {
                if (zzwh.getRowSpan() > 1) {
                    zzwh.zzOi(zzwh.getRowSpan() - (this.zzZEU.get((zzwh.getRowSpan() + i) - 1).zz4W() - zzwg.zz4W()));
                }
            }
        }
    }

    private int zzOf(int i) {
        return this.zzZzf.zzT3(i);
    }

    private static Cell zzW(Row row, int i) {
        int iZzX = zzX(row);
        if (iZzX > i) {
            return null;
        }
        for (Cell cell : row.getCells()) {
            if (iZzX == i) {
                return cell;
            }
            iZzX += cell.zz6G().zz5r().getWidth();
        }
        return null;
    }

    private static int zzX(Row row) {
        return row.getParentTable().zzZrd() + row.zzZYf().zzXXa().zzYk9();
    }

    private void zzY(zzWP zzwp, Cell cell, int i) {
        zzZ(this.zzZzo, zzwp, cell, i);
    }

    private int zzYr(int i, int i2) {
        return zzOf(i2 + i) - zzOf(i);
    }

    private void zzZ(zzWP zzwp, Cell cell, int i) {
        zzZ(this.zzZzq, zzwp, cell, i);
    }

    public final int getColumnCount() {
        return this.zzZzf.getCount() - 1;
    }

    public final boolean zz4D() {
        return this.zzZzc;
    }

    public final boolean zz4E() {
        return this.zzZzb;
    }

    public final zzWH zz4K() {
        if (zz4L() == null || this.zzZzd >= getColumnCount()) {
            return null;
        }
        return zz4L().zz4Y()[this.zzZzd];
    }

    public final zzWG zz4L() {
        if (this.zzZze < this.zzZEU.size()) {
            return this.zzZEU.get(this.zzZze);
        }
        return null;
    }

    public final int zz4M() {
        return zzYr(0, getColumnCount());
    }

    public final Table zz4N() {
        return this.zzZzr;
    }

    public final int[] zz4O() {
        int count = this.zzZzf.getCount() - 1;
        int[] iArr = new int[count];
        for (int i = 0; i < count; i++) {
            iArr[i] = zzYr(i, 1);
        }
        return iArr;
    }

    public final void zz4P() {
        if (this.zzZzn) {
            this.zzZzd++;
            return;
        }
        do {
            this.zzZzd++;
            if (zz4K() == null) {
                return;
            }
        } while (zz4K().zz6G().zz5B());
    }

    public final void zz4Q() {
        this.zzZzd = -1;
        zz4P();
    }

    public final void zz4R() {
        this.zzZze++;
    }

    public final void zz4S() {
        this.zzZze = 0;
    }

    public final int zzOg(int i) {
        return zzYr(i, 1);
    }

    private static double zzY(Row row) {
        double lineSpacingPoints;
        if (row.getFirstCell() == null || row.getFirstCell().getFirstParagraph() == null) {
            lineSpacingPoints = 0.0d;
        } else {
            Font paragraphBreakFont = row.getFirstCell().getFirstParagraph().getParagraphBreakFont();
            lineSpacingPoints = row.getDocument().zzZqy().zzY(paragraphBreakFont.getName(), (float) paragraphBreakFont.getSize(), 0).getLineSpacingPoints();
        }
        return Math.max(row.getRowFormat().getHeight(), lineSpacingPoints);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zzZ(boolean z, zzWP zzwp, Cell cell, int i) {
        Object objFetchCellAttr = z ? cell.fetchCellAttr(i) : cell.getDirectCellAttr(i);
        if (z && cell.getParentRow().getParentTable().getAllowCellSpacing() && cell.getDirectCellAttr(i) == null) {
            if (i == 3110) {
                objFetchCellAttr = cell.getParentRow().fetchRowAttr(4090);
            } else if (i == 3120) {
                objFetchCellAttr = cell.getParentRow().fetchRowAttr(EditingLanguage.CHINESE_SINGAPORE);
            } else if (i != 3130) {
                if (i == 3140) {
                }
            }
        }
        if (objFetchCellAttr != null) {
            zzwp.zzQ(i, objFetchCellAttr);
        }
    }

    private static int zzX(Row row, int i) {
        int iZzX = zzX(row);
        CellCollection cells = row.getCells();
        for (int i2 = 0; i2 < i; i2++) {
            iZzX += cells.get(i2).zz6G().zz5r().getWidth();
        }
        return iZzX;
    }

    private static boolean zzW(Row row) {
        boolean headingFormat = row.zzZYf().zzXXa().getHeadingFormat();
        if (!headingFormat && row.getPreviousRow() != null && row.getPreviousRow().zzZYf().zzXXa().getHeadingFormat()) {
            for (Cell firstCell = row.getFirstCell(); firstCell != null; firstCell = firstCell.getNextCell()) {
                if (firstCell.zz6G().getVerticalMerge() == 2) {
                    return true;
                }
            }
        }
        return headingFormat;
    }

    private void zzZ(zzWG zzwg) {
        int iIndexOfKey = this.zzZzf.indexOfKey(zzX(zzwg.zz4Z()));
        for (int i = 0; i < iIndexOfKey; i++) {
            zzwg.zz4Y()[i] = zzWH.zz53();
        }
        int iIndexOfKey2 = this.zzZzf.indexOfKey(zzX(zzwg.zz4Z(), zzwg.zz4Z().getCells().getCount()));
        for (int i2 = iIndexOfKey2; i2 < getColumnCount(); i2++) {
            zzwg.zz4Y()[i2] = zzWH.zz53();
        }
        if (iIndexOfKey > 0 || iIndexOfKey2 < getColumnCount()) {
            this.zzZzb = true;
        }
    }

    private boolean zzZ(zzWH zzwh, int i, int i2) {
        boolean zZz51 = zzwh.zz51();
        if (zZz51) {
            zzWP zzwpZz6G = zzwh.zz6G();
            boolean z = false;
            boolean z2 = i == 0;
            boolean z3 = i == this.zzZEU.size() - 1;
            boolean z4 = !z2 && zzZ(zzwpZz6G, 3110, this.zzZEU.get(i + (-1)).zz4Y()[i2].zz6G(), 3130);
            boolean z5 = !z3 && zzZ(zzwpZz6G, 3130, this.zzZEU.get(i + 1).zz4Y()[i2].zz6G(), 3110);
            Border border = this.zzZzg;
            if (border != null) {
                if ((z2 && this.zzZzk) || (!z2 && this.zzZzi && !z4)) {
                    zzwpZz6G.zzO(border);
                }
                if ((z3 && this.zzZzj) || (!z3 && this.zzZzi && !z5)) {
                    zzwpZz6G.zzN(this.zzZzg);
                }
                boolean z6 = i2 == 0;
                boolean z7 = i2 == getColumnCount() - 1;
                boolean z8 = !z6 && zzZ(zzwpZz6G, 3120, this.zzZEU.get(i).zz4Y()[i2 + (-1)].zz6G(), 3140);
                if (!z7 && zzZ(zzwpZz6G, 3140, this.zzZEU.get(i).zz4Y()[i2 + 1].zz6G(), 3120)) {
                    z = true;
                }
                if ((z6 && this.zzZzm) || (!z6 && this.zzZzh && !z8)) {
                    zzwpZz6G.zzM(this.zzZzg);
                }
                if ((z7 && this.zzZzl) || (!z7 && this.zzZzh && !z)) {
                    zzwpZz6G.zzL(this.zzZzg);
                }
            }
        }
        return zZz51;
    }

    private static boolean zzZ(zzWP zzwp, int i, zzWP zzwp2, int i2) {
        Object objZzPk = zzwp2.zzPk(i2);
        boolean z = objZzPk != null;
        if (z) {
            zzwp.zzQ(i, objZzPk);
        }
        return z;
    }
}
