package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYUA {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("gridCol", "tblGridChange", "tblGrid");

    private static void zzM(zzY6G zzy6g) {
        com.aspose.words.internal.zzDB zzdb = (com.aspose.words.internal.zzDB) zzy6g.get(5103);
        if (zzdb == null) {
            return;
        }
        com.aspose.words.internal.zzDB zzdb2 = new com.aspose.words.internal.zzDB(zzdb.getCount());
        zzdb2.zzX(zzdb);
        zzy6g.zzQ(5107, new zzY6S(zzdb2));
    }

    private static boolean zzN(zzY6G zzy6g) {
        com.aspose.words.internal.zzDB zzdb = (com.aspose.words.internal.zzDB) zzy6g.get(5103);
        if (zzdb != null && zzdb.getCount() != 0) {
            int i = 0;
            for (int i2 = 0; i2 < zzdb.getCount(); i2++) {
                i += zzdb.get(i2);
            }
            if (i > 0) {
                return true;
            }
        }
        return false;
    }

    private static void zzV(Row row, int i) {
        com.aspose.words.internal.zzDB zzdb = (com.aspose.words.internal.zzDB) row.getParentTable().zzZYf().zzVR(5103, i);
        if (row.isFirstRow()) {
            zzZ(zzdb, row, i);
        }
        int iIntValue = ((Integer) row.zzZYf().zzVR(5104, i)).intValue();
        zzY(zzdb, row, i);
        if (zzdb.getCount() > 0) {
            Iterator<T> it = row.getCells().iterator();
            while (it.hasNext()) {
                zzWP zzwpZz6G = ((Cell) it.next()).zz6G();
                int iMin = Math.min(((Integer) zzwpZz6G.zzVR(3900, i)).intValue() + iIntValue, zzdb.getCount());
                int i2 = 0;
                while (iIntValue < iMin) {
                    i2 += zzdb.get(iIntValue);
                    iIntValue++;
                }
                if (i == 1) {
                    zzwpZz6G.zz5s().setWidth(i2);
                } else if (zzwpZz6G.zz6D()) {
                    zzwpZz6G.setWidth(i2);
                }
            }
        }
    }

    public static void zzW(zzYU4 zzyu4, zzY6G zzy6g, zzYO3 zzyo3) {
        com.aspose.words.internal.zzDB zzdb = new com.aspose.words.internal.zzDB();
        zzy6g.zzQ(5103, zzdb);
        while (zzyu4.zzQ("tblGrid")) {
            int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
            if (iZzTP == 0) {
                int iZzT = 0;
                while (zzyu4.zzi()) {
                    if ("w".equals(zzyu4.getLocalName())) {
                        iZzT = zzyu4.zzT(zzyo3);
                    }
                }
                zzdb.add(iZzT);
            } else if (iZzTP != 1) {
                zzyu4.zzk();
            } else {
                zzV(zzyu4, zzy6g, zzyo3);
            }
        }
        zzM(zzy6g);
    }

    private static com.aspose.words.internal.zzDB zzX(WordAttrCollection wordAttrCollection) {
        return (com.aspose.words.internal.zzDB) wordAttrCollection.zzPk(5103);
    }

    private static void zzY(com.aspose.words.internal.zzDB zzdb, Row row, int i) {
        int iIntValue = ((Integer) row.zzZYf().zzVR(5104, i)).intValue();
        int i2 = 0;
        for (int i3 = 0; i3 < iIntValue; i3++) {
            if (zzdb.getCount() > i3) {
                i2 = zzdb.get(i3) + i2;
            }
        }
        ((i == 1 && row.zzZYf().zz6D()) ? (zzY6G) row.zzZYf().zzYsN().zzZ6C() : row.zzZYf()).zzQ(4250, Integer.valueOf(i2));
    }

    public static void zzZ(zzYU6 zzyu6, Table table) {
        zzY6G zzy6gZzZYf = table.zzZYf();
        com.aspose.words.internal.zzDB zzdbZzX = zzX(zzy6gZzZYf.zzXXb());
        com.aspose.words.internal.zzDB zzdbZzX2 = zzy6gZzZYf.zz6D() ? zzX(zzy6gZzZYf) : null;
        zzyu6.zzY("w:tblGrid");
        for (int i = 0; i < zzdbZzX.getCount(); i++) {
            zzyu6.zzX("w:gridCol", "w:w", Integer.valueOf(zzdbZzX.get(i)));
        }
        if (zzdbZzX2 != null) {
            zzyu6.zzY("w:tblGridChange");
            zzyu6.zzY("w:tblGrid");
            for (int i2 = 0; i2 < zzdbZzX2.getCount(); i2++) {
                zzyu6.zzX("w:gridCol", "w:w", Integer.valueOf(zzdbZzX2.get(i2)));
            }
            zzyu6.zzp();
            zzyu6.zzp();
        }
        zzyu6.zzp();
    }

    private static void zzh(Table table) {
        com.aspose.words.internal.zzDB zzdb = new com.aspose.words.internal.zzDB();
        table.zzZYf().zzQ(5103, zzdb);
        for (Cell cell : table.getFirstRow().getCells()) {
            cell.zz6G().zz5C();
            zzdb.add(cell.zz6G().getWidth());
        }
    }

    public static void zzZ(Row row, ArrayList<Table> arrayList) {
        Table parentTable = row.getParentTable();
        if (!zzN(parentTable.zzZYf())) {
            zzh(parentTable);
            arrayList.add(parentTable);
        }
        if (parentTable.zzZYf().zz6D()) {
            zzV(row, 0);
        }
        zzV(row, 1);
    }

    private static void zzV(zzYU4 zzyu4, zzY6G zzy6g, zzYO3 zzyo3) {
        while (zzyu4.zzQ("tblGridChange")) {
            if (zzUR.zzTP(zzyu4.getLocalName()) != 2) {
                zzyu4.zzk();
            } else {
                com.aspose.words.internal.zzDB zzdb = (com.aspose.words.internal.zzDB) zzy6g.get(5103);
                if (zzy6g.zzYsN() == null) {
                    zzy6g.zzZ(new zzZMK(new zzY6G(), "", com.aspose.words.internal.zzZQ9.zz35));
                }
                zzy6g.zzYsN().zzZ6C().zzQ(5103, zzdb);
                zzW(zzyu4, zzy6g, zzyo3);
            }
        }
        zzM(zzy6g);
    }

    private static void zzZ(com.aspose.words.internal.zzDB zzdb, Row row, int i) {
        int iIntValue = ((Integer) row.zzZYf().zzVR(5105, i)).intValue() + ((Integer) row.zzZYf().zzVR(5104, i)).intValue();
        Iterator<T> it = row.getCells().iterator();
        while (it.hasNext()) {
            iIntValue += ((Integer) ((Cell) it.next()).zz6G().zzVR(3900, i)).intValue();
        }
        if (iIntValue > zzdb.getCount()) {
            if (row.zzZYf().getAllowAutoFit()) {
                int i2 = 0;
                for (int i3 = 0; i3 < zzdb.getCount(); i3++) {
                    i2 += zzdb.get(i3);
                }
                zzdb.clear();
                for (int i4 = 0; i4 < iIntValue; i4++) {
                    zzdb.add(i2 / iIntValue);
                }
                return;
            }
            while (iIntValue > zzdb.getCount()) {
                zzdb.add(StyleIdentifier.LIST_TABLE_4_ACCENT_5);
            }
        }
    }
}
