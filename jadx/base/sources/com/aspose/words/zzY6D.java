package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzY6D {
    private static int zzX4D = com.aspose.words.internal.zzSA.zzr(ConvertUtil.millimeterToPoint(1.0d));
    private boolean zzX4E;
    private boolean zzX4F;
    private boolean zzX4G;
    private zzYDZ zzZFZ;
    private com.aspose.words.internal.zzIM<Table> zzX4I = new com.aspose.words.internal.zzIM<>();
    private com.aspose.words.internal.zzIM<Row> zzX4H = new com.aspose.words.internal.zzIM<>();

    public zzY6D(int i, zzYDZ zzydz) {
        this.zzX4E = (i & 2048) != 0;
        this.zzX4G = (i & 32) != 0;
        this.zzX4F = (i & 256) != 0;
        this.zzZFZ = zzydz;
    }

    private IWarningCallback getWarningCallback() {
        return this.zzZFZ.zzYfy.getWarningCallback();
    }

    private void zz2(String str) {
        if (getWarningCallback() != null) {
            OooO00o.OooO0O0(getWarningCallback(), 65536, 17, str);
        }
    }

    private static void zzA(zzY6G zzy6g) {
        if (zzy6g.getHorizontalAlignment() == 1) {
            zzy6g.remove(4180);
        }
        if (zzy6g.isFloating()) {
            return;
        }
        zzy6g.remove(4160);
        zzy6g.remove(4210);
        zzy6g.remove(4220);
        zzy6g.remove(4270);
        zzy6g.remove(4280);
    }

    private static void zzW(zzWP zzwp, int i) {
        if (zzwp.contains(i)) {
            zzwp.set(i, Integer.valueOf(com.aspose.words.internal.zzAN.zzVc(((Integer) zzwp.get(i)).intValue())));
        }
    }

    private void zzX(Table table, int i) {
        double dZzY03 = ((double) i) / ((double) table.zzY03());
        if (dZzY03 >= 1.0d || table.zzYKU()) {
            return;
        }
        zz2("Table width exceed maximum allowed, table was resized.");
        for (Row row : table.getRows()) {
            int width = 0;
            for (Cell cell : row.getCells()) {
                cell.zz6G().setWidth((int) com.aspose.words.internal.zzZKQ.zzZa(((double) cell.zz6G().getWidth()) * dZzY03));
                width += cell.zz6G().getWidth();
            }
            int width2 = (i - width) + row.getLastCell().zz6G().getWidth();
            if (width2 >= 0) {
                row.getLastCell().zz6G().setWidth(width2);
            }
        }
    }

    private static void zzY(zzY6G zzy6g, int i) {
        Object objZzPk = zzy6g.zzPk(i);
        if (objZzPk == null || ((Integer) objZzPk).intValue() >= 0) {
            return;
        }
        com.aspose.words.internal.zzZKN.format("Invalid value {0} of attribute {1} removed from a row.", objZzPk, Integer.valueOf(i));
        zzy6g.remove(i);
    }

    private void zzZS(Table table) {
        int iZzY03 = table.zzY03();
        Section section = (Section) table.getAncestor(2);
        int pageWidth = section != null ? section.zzYvR().getPageWidth() : 0;
        if ((this.zzX4E || pageWidth <= 31680) && iZzY03 > 31680) {
            zzX(table, 31680);
            iZzY03 = table.zzY03();
        }
        if (zzZT(table)) {
            int iZzR = (table.getAllowAutoFit() || table.getPreferredWidth().getType() == 2) ? zzZSF.zzR(table) : iZzY03;
            if (table.getPreferredWidth().isFixed() && table.getPreferredWidth().zzYmD() >= iZzR) {
                iZzR = iZzY03 < 31680 ? iZzY03 : 31680;
            }
            if (iZzY03 > zzX4D + iZzR) {
                zzX(table, iZzR);
            }
        }
    }

    private static boolean zzZT(Table table) {
        if (table.getRows().getCount() == 0 || table.isFloating()) {
            return false;
        }
        return table.zzhk() ? table.getPreferredWidth().zzYmB() || table.getPreferredWidth().isAuto() : table.getAllowAutoFit() ? !table.getDocument().zzZpV().zzYVg.getGrowAutofit() : table.getPreferredWidth().zzYmB();
    }

    private static void zzZU(Table table) {
        if (table.getFirstRow() == null) {
            return;
        }
        zzY6G zzy6gZzZYf = table.getFirstRow().zzZYf();
        if (zzy6gZzZYf.getHorizontalAlignment() != 0) {
            table.zzkk(4170);
        }
        int verticalAlignment = zzy6gZzZYf.getVerticalAlignment();
        if (verticalAlignment == 0 || verticalAlignment == -1) {
            return;
        }
        table.zzkk(4190);
    }

    private boolean zzZV(Table table) {
        if (this.zzX4I.contains(table)) {
            return false;
        }
        table.zzY0e();
        this.zzX4I.add(table);
        return true;
    }

    private static void zzg(Row row) {
        boolean zZzYrV = true;
        boolean zZzYrW = true;
        for (Cell cell : row.getCells()) {
            zZzYrV &= cell.getLastParagraph().zzYp5().zzYrV();
            zZzYrW &= cell.getLastParagraph().zzYp5().zzYrW();
        }
        if (zZzYrV && !row.zzZYf().zzYrV()) {
            row.zzZYf().zzQ(14, new zzZV8(0, row.getFirstCell().getLastParagraph().zzYp5().getInsertRevision().getAuthor(), row.getFirstCell().getLastParagraph().zzYp5().getInsertRevision().zzZx()));
        }
        if (!zZzYrW || row.zzZYf().zzYrW()) {
            return;
        }
        row.zzZYf().zzQ(12, new zzZV8(1, row.getFirstCell().getLastParagraph().zzYp5().getDeleteRevision().getAuthor(), row.getFirstCell().getLastParagraph().zzYp5().getDeleteRevision().zzZx()));
    }

    private boolean zzh(Row row) {
        if (!row.zzZYf().contains(5015)) {
            return false;
        }
        row.getDocument().zzZq2().zzZ(row.zzZYf(), ((Integer) row.zzZYf().get(5015)).intValue(), !(row.getParentTable().getAncestor(5) instanceof Table));
        this.zzX4H.add(row);
        return true;
    }

    public static void zzi(Row row) {
        zzY(row.zzZYf(), 5104);
        zzY(row.zzZYf(), 5105);
    }

    private static void zzk(Cell cell) {
        zzWP zzwpZz6G = cell.zz6G();
        zzW(zzwpZz6G, 3090);
        zzW(zzwpZz6G, 3100);
        zzW(zzwpZz6G, 3070);
        zzW(zzwpZz6G, 3080);
    }

    public final int visitCellStart(Cell cell) {
        if (this.zzX4F && !cell.zz6G().contains(3020)) {
            cell.zz6G().setPreferredWidth(PreferredWidth.AUTO);
        }
        cell.ensureMinimum();
        if (cell.zz6G().zz5C()) {
            zz2("Invalid cell width, table layout updated.");
            if (zzZV(cell.getParentRow().getParentTable())) {
                zzZS(cell.getParentRow().getParentTable());
            }
        }
        zzk(cell);
        zzY5J.zzi(cell);
        return 0;
    }

    public final int visitRowEnd(Row row) {
        if (row.getFirstCell() == null) {
            zz2("Empty table row was removed.");
            row.remove();
            return 0;
        }
        Cell firstCell = row.getFirstCell();
        if (firstCell.zz6G().getHorizontalMerge() == 2) {
            firstCell.zz6G().setHorizontalMerge(1);
        }
        Cell lastCell = row.getLastCell();
        if (lastCell.zz6G().getHorizontalMerge() == 1) {
            lastCell.zz6G().setHorizontalMerge(0);
        }
        zzg(row);
        zzA(row.zzZYf());
        if (zzh(row)) {
            this.zzZFZ.zzXoX = true;
        }
        return 0;
    }

    public final int visitRowStart(Row row) {
        if (this.zzX4E && row.getCells().getCount() > 63) {
            throw new IllegalStateException("More than 63 cells per row is not supported for this file format.");
        }
        if (row.zzZYf().getHeight() > 31680) {
            row.zzZYf().setHeight(31680);
            zzY1Z.zzZ(getWarningCallback(), 0, "Table row height exceed maximum allowed, corrected.", new Object[0]);
        }
        if (row.getCells().getCount() >= 63) {
            zzY1Z.zzZ(getWarningCallback(), 0, "Cell count per row must not exceed 63, document can have problem while opened in MS Word.", new Object[0]);
        }
        zzY5J.zzd(row);
        zzi(row);
        return 0;
    }

    public final int visitTableEnd(Table table) {
        if (table.getFirstRow() != null) {
            return 0;
        }
        zz2("Empty table was removed.");
        table.remove();
        return 0;
    }

    public final int visitTableStart(Table table) {
        if (table.zzY0f()) {
            if (this.zzX4G) {
                Iterator<T> it = table.getRows().iterator();
                boolean zZz5C = false;
                while (it.hasNext()) {
                    Iterator<T> it2 = ((Row) it.next()).getCells().iterator();
                    while (it2.hasNext()) {
                        zZz5C |= ((Cell) it2.next()).zz6G().zz5C();
                    }
                }
                if (zZz5C) {
                    zzZV(table);
                }
                table.zzY0d();
            } else if (new zzY6Q(table).zz4O().length == 0) {
                zzZV(table);
            }
            table.zzY0c();
            zzZS(table);
            zzZU(table);
        }
        return 0;
    }

    public final void zzZnb() {
        if (this.zzX4H.getCount() == 0) {
            return;
        }
        for (Row row : this.zzX4H) {
            row.getDocument();
            zzZK0.zzR(row.zzZYf());
        }
    }
}
