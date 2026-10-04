package com.aspose.words;

import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzY6Y {
    private zzU8 zzZGE;

    private zzY6Y(zzU8 zzu8) {
        this.zzZGE = zzu8;
    }

    private static int[] zz7(Table table) {
        int[] iArr = new int[table.getRows().getCount()];
        for (int i = 0; i < table.getRows().getCount(); i++) {
            iArr[i] = table.getRows().get(i).getText().replace(ControlChar.CELL, "").hashCode();
        }
        return iArr;
    }

    private static int zzU(int[] iArr, int[] iArr2) {
        int i = 0;
        while ((iArr.length - 1) - i >= 0 && (iArr2.length - 1) - i >= 0 && iArr[(iArr.length - 1) - i] == iArr2[(iArr2.length - 1) - i]) {
            i++;
        }
        return i;
    }

    private static int zzV(int[] iArr, int[] iArr2) {
        int i = 0;
        while (i < iArr.length && i < iArr2.length && iArr[i] == iArr2[i]) {
            i++;
        }
        return i;
    }

    private static boolean zzW(Table table, Table table2) {
        for (Row row : table.getRows()) {
            for (Cell cell : row.getCells()) {
                if (cell.zz6G().getVerticalMerge() != 0 && (table2.getRows().getCount() <= row.getRowIndex() || table2.getRows().get(row.getRowIndex()).getCells().getCount() <= cell.getColumnIndex() || table2.getRows().get(row.getRowIndex()).getCells().get(cell.getColumnIndex()).zz6G().getVerticalMerge() != cell.zz6G().getVerticalMerge())) {
                    return false;
                }
            }
        }
        return true;
    }

    private void zzY(Table table, Table table2, zzU8 zzu8) throws Exception {
        ArrayList<zzJS> arrayListZzZ;
        Row row;
        if (!zzW(table, table2) || !zzW(table2, table)) {
            zzU6.zzSU("Merged vertically in different way.");
        }
        int[] iArrZz7 = zz7(table);
        int[] iArrZz72 = zz7(table2);
        int iZzV = zzV(iArrZz7, iArrZz72);
        int iZzU = zzU(iArrZz7, iArrZz72);
        int length = (iArrZz7.length - iZzV) - iZzU;
        int length2 = (iArrZz72.length - iZzV) - iZzU;
        int i = 0;
        if ((iZzV > 0 || iZzU > 0) && length > 0 && length2 > 0) {
            int[] iArr = new int[length];
            com.aspose.words.internal.zzZKV.zzZ(iArrZz7, iZzV, iArr, 0, length);
            int[] iArr2 = new int[(iArrZz72.length - iZzV) - iZzU];
            com.aspose.words.internal.zzZKV.zzZ(iArrZz72, iZzV, iArr2, 0, length2);
            arrayListZzZ = zzJT.zzZ(iArr, iArr2, (zzX9) null, (zzX9) null);
            for (zzJS zzjs : arrayListZzZ) {
                zzjs.zzZiQ += iZzV;
                zzjs.zzZiP += iZzV;
            }
        } else {
            arrayListZzZ = zzJT.zzZ(iArrZz7, iArrZz72, (zzX9) null, (zzX9) null);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (zzJS zzjs2 : arrayListZzZ) {
            if (zzjs2.zzZSB()) {
                for (int i2 = 0; i2 < zzjs2.zzZiO; i2++) {
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<Row>) arrayList2, table.getRows().get(zzjs2.zzZiQ + i2));
                }
            } else if (zzjs2.zzZSC()) {
                for (int i3 = 0; i3 < zzjs2.zzZiN; i3++) {
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<Row>) arrayList, table2.getRows().get(zzjs2.zzZiP + i3));
                }
            } else {
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (int i4 = 0; i4 < zzjs2.zzZiO; i4++) {
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<Row>) arrayList3, table.getRows().get(zzjs2.zzZiQ + i4));
                }
                for (int i5 = 0; i5 < zzjs2.zzZiN; i5++) {
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<Row>) arrayList4, table2.getRows().get(zzjs2.zzZiP + i5));
                }
                zzYIE.zzZ(arrayList3, arrayList4, arrayList, arrayList2, zzu8);
            }
        }
        RowCollection rows = table.getRows();
        RowCollection rows2 = table2.getRows();
        int i6 = 0;
        while (true) {
            if (i >= rows.getCount() && i6 >= rows2.getCount()) {
                return;
            }
            if (i < rows.getCount()) {
                row = rows.get(i);
                if (arrayList2.contains(row)) {
                    zzU4.zzY((Node) row, this.zzZGE);
                } else if (i6 > rows2.getCount()) {
                    zzU4.zzY((Node) row, this.zzZGE);
                }
                i++;
            } else {
                row = null;
            }
            Row row2 = table2.getRows().get(i6);
            if (arrayList.contains(row2)) {
                Row row3 = (Row) zzU4.zzZ((Node) row2, this.zzZGE, true);
                if (row != null) {
                    row.zzYC(row3);
                } else {
                    table.appendChild(row3);
                }
                zzZMF.zzZ(row3, row2);
            } else {
                if (row.zzZYf().isFloating() && !row2.zzZYf().isFloating()) {
                    zzl(row);
                }
                zzZMF.zzZ(row, row2, this.zzZGE);
                zzU6.zzZZ2();
                zzYID.zzZ(row, row2, this.zzZGE);
                zzU6.zzZZ1();
            }
            i++;
            i6++;
        }
    }

    public static void zzZ(Table table, Table table2, zzU8 zzu8) throws Exception {
        new zzY6Y(zzu8).zzY(table, table2, zzu8);
    }

    private static void zzl(Row row) {
        boolean z;
        zzY6G zzy6gZzZYf = row.zzZYf();
        if (zzy6gZzZYf.isFloating()) {
            zzZ(row, 1340, (Object) 2);
            if (zzy6gZzZYf.zzVE(4190)) {
                z = true;
                zzZ(row, 1302, Integer.valueOf(((Integer) zzy6gZzZYf.zzPj(4190)).intValue() + 1));
                row.zzZYf().remove(4190);
            } else {
                z = false;
            }
            zzZ(row, 4210, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, z);
            zzZ(row, 4180, 1290, z);
            zzZ(row, 4200, 1300, z);
            zzZ(row, 4150, 1320, z);
            zzZ(row, 4160, 1330, z);
        }
    }

    private static void zzZ(Row row, int i, int i2, boolean z) {
        zzY6G zzy6gZzZYf = row.zzZYf();
        if (zzy6gZzZYf.zzVE(i)) {
            zzZ(row, i2, zzy6gZzZYf.zzPj(i));
            if (z) {
                row.zzZYf().remove(i);
            }
        }
    }

    private static void zzZ(Row row, int i, Object obj) {
        Iterator<T> it = row.getChildNodes(8, true).iterator();
        while (it.hasNext()) {
            ((Paragraph) it.next()).zzZYj().zzQ(i, obj);
        }
    }
}
