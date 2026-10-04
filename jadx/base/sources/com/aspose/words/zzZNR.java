package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZNR {
    private boolean zzYyh;
    private com.aspose.words.internal.zzDB zzYyi;
    private boolean zzYyj;
    private ArrayList<zzYI8> zzZEU = new ArrayList<>();

    private zzZNR(Table table, boolean z) {
        this.zzYyh = table.zzYBb().zzZpV().zzYVg.getAutofitToFirstFixedWidthCell();
        Iterator<T> it = table.getRows().iterator();
        boolean zZzYjr = false;
        while (it.hasNext()) {
            zzYI8 zzyi8 = new zzYI8((Row) it.next(), z);
            zZzYjr |= zzyi8.zzYjr();
            if (zzyi8.zzYjs().size() > 0) {
                com.aspose.words.internal.zzZQG.zzZ(this.zzZEU, zzyi8);
            }
        }
        this.zzZEU.size();
        com.aspose.words.internal.zzDB zzdb = new com.aspose.words.internal.zzDB();
        if (z) {
            zzY6S zzy6s = (zzY6S) table.zzZYf().zzPk(5107);
            if (zzy6s != null) {
                zzdb.zzX(zzy6s.zzX6a);
            }
        } else {
            zzY6U zzy6uZzXXf = table.zzZYf().zzXXf();
            if (zzy6uZzXXf != null) {
                if (zzy6uZzXXf.getState() != 2) {
                    table.getAllowAutoFit();
                }
                zzdb.zzX(zzy6uZzXXf.zzXZp());
            }
        }
        this.zzYyi = zzdb;
        this.zzYyj = zzX(table, zZzYjr);
    }

    private static Paragraph zzD(Table table) {
        CompositeNode compositeNodeZzZYt = table;
        while (compositeNodeZzZYt != null && compositeNodeZzZYt.getNodeType() == 5) {
            Table table2 = (Table) compositeNodeZzZYt;
            if (!table2.zzY0f()) {
                break;
            }
            compositeNodeZzZYt = table2.getFirstRow().getFirstCell().zzZYt();
        }
        if (compositeNodeZzZYt == null || compositeNodeZzZYt.getNodeType() != 8) {
            return null;
        }
        return (Paragraph) compositeNodeZzZYt;
    }

    public static boolean zzE(Table table) {
        int nodeType = table.zzYBd().getNodeType();
        boolean z = false;
        if (nodeType == 19) {
            return false;
        }
        if (!table.getAllowAutoFit() && !table.getPreferredWidth().zzYmB()) {
            return true;
        }
        Paragraph paragraphZzD = zzD(table);
        if (paragraphZzD != null && nodeType != 7 && zzj(paragraphZzD)) {
            z = true;
        }
        return !z;
    }

    private void zzF(Table table) {
        table.getFirstRow().zzZYf().getAllowAutoFit();
        zzY6R zzy6r = new zzY6R(this.zzYyi, this.zzZEU, table.getAllowCellSpacing() ? table.getFirstRow().zzYkg() : -1, false, this.zzYyh);
        boolean z = false;
        boolean zZzZ = false;
        while (zzy6r.zzXZe()) {
            zzy6r.zzXZf();
            do {
                zZzZ |= zzZ(table, zzy6r.zzXYW());
                if (!zZzZ) {
                }
            } while (zzy6r.zzXZ3());
        }
        if (this.zzYyj && !zzy6r.zzXYV() && !zZzZ) {
            z = true;
        }
        table.zzZYf().zzY(zzy6r.zzW(table, z));
    }

    private static boolean zzG(Table table) {
        Row firstRow = table.getFirstRow();
        if (firstRow == null) {
            return false;
        }
        TableStyle tableStyle = (TableStyle) com.aspose.words.internal.zzZKW.zzZ(table.getStyle(), TableStyle.class);
        boolean z = tableStyle != null && tableStyle.zz6G().getFitText();
        boolean zZzYkh = firstRow.zzYkh();
        int iZzYkg = firstRow.zzYkg();
        for (Row row : table.getRows()) {
            if (zZzYkh != row.zzYkh() || iZzYkg != row.zzYkg()) {
                return true;
            }
            Cell cell = null;
            for (Cell cell2 : row.getCells()) {
                zzWP zzwpZz6G = cell2.zz6G();
                if (zzwpZz6G.zz5q() <= 0 && (zzwpZz6G.getHorizontalMerge() != 2 || cell == null)) {
                    return true;
                }
                int horizontalMerge = zzwpZz6G.getHorizontalMerge();
                if (horizontalMerge == 0) {
                    cell = null;
                } else if (horizontalMerge == 1) {
                    cell = cell2;
                }
                if (zzwpZz6G.getFitText()) {
                    z = true;
                }
            }
        }
        return zZzYkh && z;
    }

    private static boolean zzH(Table table) {
        Iterator<T> it = table.getRows().iterator();
        while (it.hasNext()) {
            Iterator<T> it2 = ((Row) it.next()).getCells().iterator();
            if (it2.hasNext()) {
                it2.next();
                return true;
            }
        }
        return false;
    }

    private static boolean zzI(Table table) {
        if (table.zzZYf().hasRevisions() || table.zzYKU()) {
            return true;
        }
        Iterator<T> it = table.getRows().iterator();
        while (it.hasNext()) {
            Iterator<T> it2 = ((Row) it.next()).getCells().iterator();
            while (it2.hasNext()) {
                if (((Cell) it2.next()).zz6G().hasRevisions()) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean zzJ(Table table) {
        zzY6U zzy6uZzXXf;
        Document document = (Document) com.aspose.words.internal.zzZKW.zzZ(table.getDocument(), Document.class);
        if (document == null || !zzE(table)) {
            return false;
        }
        if (table.getAllowAutoFit() || !table.zzhk() || ((zzy6uZzXXf = ((Table) table.getAncestor(5)).zzZYf().zzXXf()) != null && zzy6uZzXXf.getState() == 2)) {
            return ((document.zzZpV().zzYV5 && table.getAllowAutoFit()) || !zzH(table) || zzI(table) || zzG(table)) ? false : true;
        }
        return false;
    }

    private static void zzK(Table table) {
        if (table.zzZYf().zzXXf() == null) {
            table.zzZYf().zzY(new zzY6U());
        }
        table.zzZYf().zzXXf().setState(1);
    }

    public static void zzL(Table table) {
        zzK(table);
    }

    private static boolean zzX(Table table, boolean z) {
        return (z && zzZZ8.zzw(table)) ? false : true;
    }

    public static void zzY(Table table, boolean z) {
        if (table.getFirstRow() == null) {
            return;
        }
        zzY6U zzy6uZzXXf = table.zzZYf().zzXXf();
        if (!zzJ(table)) {
            if (zzy6uZzXXf == null) {
                zzy6uZzXXf = new zzY6U();
                table.zzZYf().zzY(zzy6uZzXXf);
            }
            zzy6uZzXXf.setState(1);
            return;
        }
        if (table.getFirstRow().zzZYf().getAllowAutoFit()) {
            return;
        }
        if (zzy6uZzXXf == null || zzy6uZzXXf.getState() == 2) {
            new zzZNR(table, z).zzF(table);
        }
    }

    private boolean zzZ(Table table, zzY6V zzy6v) {
        int iMax;
        int iZzZ = zzZSF.zzZ(table, zzZSF.zzQ(table));
        int iZzr = com.aspose.words.internal.zzSA.zzr(table.getLeftIndent());
        int iZzYkg = table.getFirstRow().zzYkg();
        if (table.getDocument().zzZpV().zzYVg.zzZYM() || table.zzhk()) {
            iMax = 0;
        } else {
            Cell firstCell = table.getFirstRow().getFirstCell();
            iMax = Math.max(zzZSF.zzP(firstCell), com.aspose.words.internal.zzAN.zzZX(zzZSF.zzS(firstCell), 2));
        }
        zzY6O zzy6o = new zzY6O(zzy6v, this.zzYyh, iZzZ, iMax, table.getPreferredWidth(), iZzr, iZzYkg);
        zzy6o.zzWx();
        return zzy6o.zzXYw();
    }

    private static boolean zzj(Paragraph paragraph) {
        return paragraph.zzqw(1).zzYpF();
    }
}
