package com.aspose.words;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzY6L {
    private static int[] zzX53;
    private com.aspose.words.internal.zzZQC<ArrayList<Table>> zzX54 = new com.aspose.words.internal.zzZQC<>();

    static {
        int[] iArr = {4020, 4040, 4050, 4060, 4070, 4080, 4090, EditingLanguage.CHINESE_SINGAPORE, 4120, 4230, 4240, 4253, 4260, 4261, 4320, 4360, 4400, 5105, 5106, 5107};
        zzX53 = iArr;
        Arrays.sort(iArr);
    }

    private void zz0(Table table) {
        if (!zzZZ(table)) {
            this.zzX54.push(new ArrayList<>());
        }
        com.aspose.words.internal.zzZQG.zzZ(this.zzX54.peek(), table);
    }

    private static com.aspose.words.internal.zzDB zzK(com.aspose.words.internal.zzZYV<Object> zzzyv) {
        com.aspose.words.internal.zzDB zzdb = new com.aspose.words.internal.zzDB(Math.max(zzzyv.getCount() - 1, 0));
        for (int i = 1; i < zzzyv.getCount(); i++) {
            zzdb.add(zzzyv.zzT3(i) - zzzyv.zzT3(i - 1));
        }
        return zzdb;
    }

    private static int zzT(Table table, boolean z) {
        int iZzYM7 = table.getFirstRow().zzZYf().zzYM7();
        int iZzl = 0;
        if (z && iZzYM7 < 0) {
            iZzYM7 = 0;
        }
        Cell firstCell = table.getFirstRow().getFirstCell();
        if (firstCell != null) {
            iZzl = table.getDocument().zzZpV().zzYVg.zzZYM() ? zzl(firstCell) : zzm(firstCell);
        }
        return iZzYM7 + iZzl;
    }

    private Table zzU(Table table, boolean z) {
        if (zzZX(table)) {
            zz0(table);
            return null;
        }
        if (!zzZZ(table)) {
            return table;
        }
        ArrayList<Table> arrayListPop = this.zzX54.pop();
        arrayListPop.size();
        Table table2 = arrayListPop.get(0);
        com.aspose.words.internal.zzZQG.zzZ(arrayListPop, table);
        if (z) {
            com.aspose.words.internal.zzZYV<Object> zzzyvZzYV = zzYV(arrayListPop);
            zzY(arrayListPop, zzZ(arrayListPop, zzzyvZzYV));
            table2.zzZYf().zzQ(5107, new zzY6S(zzK(zzzyvZzYV)));
        }
        zzYW(arrayListPop);
        return table2;
    }

    private static boolean zzV(Table table, Table table2) {
        if (!table.zzY0f() || !table2.zzY0f()) {
            return false;
        }
        zzZY(table);
        zzZY(table2);
        Row firstRow = table.getFirstRow();
        Row firstRow2 = table2.getFirstRow();
        return firstRow.zzZYf().zzW(firstRow2.zzZYf(), zzX53) && firstRow.zzz(firstRow2);
    }

    private static void zzY(ArrayList<Table> arrayList, com.aspose.words.internal.zzZYV<Object> zzzyv) {
        int iZzZ;
        int iIndexOfKey;
        com.aspose.words.internal.zzZYV<Object> zzzyv2 = zzzyv;
        int count = zzzyv2.getCount() - 1;
        int iZzT3 = zzzyv2.zzT3(count);
        boolean z = false;
        arrayList.get(0).getFirstRow().zzZYf().zzYM7();
        for (Table table : arrayList) {
            com.aspose.words.internal.zzDB zzdbZzZW = zzZW(table);
            int iZzT = zzT(table, z);
            table.getFirstRow().zzZYf().zzYM7();
            int iIndexOfKey2 = zzzyv2.indexOfKey(iZzT);
            for (Row row : table.getRows()) {
                int iZzYka = row.zzZYf().zzYka();
                if (iZzYka > 0) {
                    iZzZ = zzZ(zzdbZzZW, z ? 1 : 0, z ? 1 : 0, iZzYka);
                    iIndexOfKey = zzzyv2.indexOfKey(iZzZ + iZzT);
                } else {
                    iZzZ = z ? 1 : 0;
                    iIndexOfKey = iIndexOfKey2;
                }
                row.zzZYf().zzQ(5104, Integer.valueOf(iIndexOfKey));
                for (Cell cell : row.getCells()) {
                    int iZz5q = cell.zz6G().zz5q();
                    int iZzZ2 = zzZ(zzdbZzZW, iZzYka, iZzZ, iZz5q);
                    int i = count;
                    int iIndexOfKey3 = zzzyv2.indexOfKey(iZzZ2 + iZzT);
                    cell.zz6G().zzOu(iIndexOfKey3 - iIndexOfKey);
                    if (!table.getAllowAutoFit() && cell.zz6G().getPreferredWidth().isAuto()) {
                        cell.zz6G().setPreferredWidth(PreferredWidth.zzpK(iZzZ2 - iZzZ));
                    }
                    iZzYka += iZz5q;
                    zzzyv2 = zzzyv;
                    iIndexOfKey = iIndexOfKey3;
                    iZzZ = iZzZ2;
                    count = i;
                }
                int i2 = count;
                int iZzT2 = iZzT3 - (iZzZ + zzT(table, true));
                if (iZzT2 > 0) {
                    row.zzZYf().zzpf(iZzT2);
                    row.zzZYf().zzQ(5105, Integer.valueOf(i2 - iIndexOfKey));
                }
                count = i2;
                z = false;
                zzzyv2 = zzzyv;
            }
            zzzyv2 = zzzyv;
        }
    }

    private static com.aspose.words.internal.zzZYV<Object> zzYV(ArrayList<Table> arrayList) {
        com.aspose.words.internal.zzZYV<Object> zzzyv = new com.aspose.words.internal.zzZYV<>();
        for (Table table : arrayList) {
            com.aspose.words.internal.zzDB zzdbZzZW = zzZW(table);
            int iZzT = zzT(table, false);
            if (!zzzyv.zzVE(iZzT)) {
                zzzyv.set(iZzT, null);
            }
            for (int i = 0; i < zzdbZzZW.getCount(); i++) {
                iZzT += zzdbZzZW.get(i);
                if (!zzzyv.zzVE(iZzT)) {
                    zzzyv.set(iZzT, null);
                }
            }
        }
        return zzzyv;
    }

    private static void zzYW(ArrayList<Table> arrayList) {
        Table table;
        arrayList.get(0);
        for (int i = 1; i < arrayList.size(); i++) {
            Table table2 = arrayList.get(i);
            if (table2.getParentNode() != null && (table = (Table) com.aspose.words.internal.zzZKW.zzZ(table2.zzYB9(), Table.class)) != null) {
                table.zzY(table.getNextSibling(), table2, table.getLastChild());
                while (table2.getFirstChild() != null) {
                    table.appendChild(table2.getFirstChild());
                }
                table2.remove();
                zzY6U zzy6uZzXXf = table.zzZYf().zzXXf();
                if (zzy6uZzXXf != null) {
                    zzy6uZzXXf.setState(1);
                }
            }
        }
    }

    private static com.aspose.words.internal.zzZYV<Object> zzZ(ArrayList<Table> arrayList, com.aspose.words.internal.zzZYV<Object> zzzyv) {
        com.aspose.words.internal.zzZYV<Object> zzzyv2 = new com.aspose.words.internal.zzZYV<>(zzzyv.getCount());
        for (int i = 0; i < zzzyv.getCount(); i++) {
            zzzyv2.zzT4(zzzyv.zzT3(i));
        }
        for (Table table : arrayList) {
            com.aspose.words.internal.zzDB zzdbZzZW = zzZW(table);
            int iZzT = zzT(table, false);
            for (Row row : table.getRows()) {
                int iZzYka = row.zzZYf().zzYka();
                int iZzZ = zzZ(zzdbZzZW, 0, 0, iZzYka);
                int i2 = iZzZ + iZzT;
                if (!zzzyv2.zzVE(i2)) {
                    zzzyv2.set(i2, null);
                }
                Iterator<T> it = row.getCells().iterator();
                while (it.hasNext()) {
                    int iZz5q = ((Cell) it.next()).zz6G().zz5q();
                    iZzZ = zzZ(zzdbZzZW, iZzYka, iZzZ, iZz5q);
                    int i3 = iZzZ + iZzT;
                    if (!zzzyv2.zzVE(i3)) {
                        zzzyv2.set(i3, null);
                    }
                    iZzYka += iZz5q;
                }
            }
        }
        return zzzyv2;
    }

    private static com.aspose.words.internal.zzDB zzZW(Table table) {
        zzY6S zzy6s = (zzY6S) table.zzZYf().zzPk(5107);
        com.aspose.words.internal.zzDB zzdb = zzy6s == null ? new com.aspose.words.internal.zzDB() : zzy6s.zzX6a;
        zzY6R.zzT(zzdb);
        return zzdb;
    }

    private static boolean zzZX(Table table) {
        Node nodeZzYB4 = table.zzYB4();
        return nodeZzYB4 != null && nodeZzYB4.getNodeType() == 5 && zzV(table, (Table) nodeZzYB4);
    }

    private static void zzZY(Table table) {
        Style styleZzZ8;
        zzY6G zzy6gZzZYf = table.getFirstRow().zzZYf();
        if (!zzy6gZzZYf.contains(4005) || (styleZzZ8 = table.getDocument().getStyles().zzZ8(zzy6gZzZYf.zzZ7j(), false)) == null || styleZzZ8.getType() == 3) {
            return;
        }
        zzy6gZzZYf.zzQ(4005, 11);
    }

    private boolean zzZZ(Table table) {
        if (this.zzX54.size() == 0) {
            return false;
        }
        ArrayList<Table> arrayListPeek = this.zzX54.peek();
        arrayListPeek.size();
        return arrayListPeek.get(0).getParentNode() == table.getParentNode();
    }

    private static int zzl(Cell cell) {
        return com.aspose.words.internal.zzAN.zzZX(zzZSF.zzS(cell), 2);
    }

    private static int zzm(Cell cell) {
        return cell.getParentRow().getParentTable().zzhk() ? zzl(cell) : -Math.max(zzZSF.zzP(cell), zzl(cell));
    }

    public final Table zz1(Table table) {
        return zzU(table, false);
    }

    public final Table zz2(Table table) {
        return zzU(table, true);
    }

    private static int zzZ(com.aspose.words.internal.zzDB zzdb, int i, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i + i4;
            i2 += i5 < zzdb.getCount() ? zzdb.get(i5) : StyleIdentifier.LIST_TABLE_4_ACCENT_5;
        }
        return i2;
    }
}
