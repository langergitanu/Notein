package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYP8 {
    private zzYTN zzXQW;
    private zzYPM zzXRS;
    private zzYOR zzXRT;
    private com.aspose.words.internal.zzZQC<zzWF> zzY2D = new com.aspose.words.internal.zzZQC<>();

    public zzYP8(zzYOR zzyor, zzYPM zzypm, zzYTN zzytn) {
        this.zzXRT = zzyor;
        this.zzXRS = zzypm;
        this.zzXQW = zzytn;
    }

    private void zz5(int[] iArr) {
        boolean allowAutoFit = zzYHm().zz4N().getAllowAutoFit();
        for (int i : iArr) {
            this.zzXQW.zzYw(zzYtk(), "table-column");
            zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
            String strZzr2 = this.zzXRT.zzr2(i);
            zzY0 zzy0 = null;
            String str = allowAutoFit ? null : "style:use-optimal-column-width";
            if (!allowAutoFit) {
                zzy0 = new zzY0(false);
            }
            zzytgZzYsG.zzX("style:table-column-properties", "style:column-width", strZzr2, str, zzy0);
            this.zzXRT.zzYsG().zzo();
        }
    }

    private void zz6(int[] iArr) {
        this.zzXRT.zzYsG().zzY("table:table");
        this.zzXRT.zzYsG().zz0("table:style-name", zzYtl());
        for (int i = 0; i < iArr.length; i++) {
            this.zzXRT.zzYsG().zzX("table:table-column", "table:style-name", zzYtk());
        }
    }

    private static zzY6G zzB(Row row) {
        zzY6G zzy6gZzZYf = row.zzZYf();
        zzY6G zzy6gZzXXb = zzy6gZzZYf.zzXXb();
        return zzy6gZzXXb != null ? zzy6gZzXXb : zzy6gZzZYf;
    }

    private void zzC(Row row) {
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        this.zzXQW.zzYw(zzYtj(), "table-row");
        zzY6G zzy6gZzB = zzB(row);
        boolean allowAutoFit = zzYHm().zz4N().getAllowAutoFit();
        if (!zzK(zzy6gZzB) || !allowAutoFit) {
            zzytgZzYsG.zzY("style:table-row-properties");
            if (zzy6gZzB.get(4120) != null) {
                String strZzr2 = this.zzXRT.zzr2(zzy6gZzB.getHeight());
                if (zzy6gZzB.getHeightRule() == 1) {
                    zzytgZzYsG.zz0("style:row-height", strZzr2);
                } else if (zzy6gZzB.getHeightRule() == 0) {
                    zzytgZzYsG.zz0("style:min-row-height", strZzr2);
                }
            }
            if (!allowAutoFit) {
                zzytgZzYsG.zzx("style:use-optimal-row-height", false);
            }
            if (!zzy6gZzB.getAllowBreakAcrossPages()) {
                zzytgZzYsG.zz0("fo:keep-together", "always");
            }
            zzytgZzYsG.zzo();
        }
        zzytgZzYsG.zzo();
    }

    private void zzD(Row row) {
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        if (row.zzZYf().getHeadingFormat()) {
            zzytgZzYsG.zzY("table:table-header-rows");
        }
        zzytgZzYsG.zzY("table:table-row");
        zzytgZzYsG.zz0("table:style-name", zzYtj());
    }

    private static boolean zzK(zzY6G zzy6g) {
        return (zzy6g.get(4120) == null || zzy6g.getHeightRule() == 2) && zzy6g.getAllowBreakAcrossPages();
    }

    private void zzL(zzY6G zzy6g) {
        for (int i = 0; i < zzy6g.getCount(); i++) {
            int iZzT3 = zzy6g.zzT3(i);
            if (zzy6g.zzVY(i) != null) {
                switch (iZzT3) {
                    case 4005:
                    case 4140:
                    case 4150:
                    case 4160:
                    case 4170:
                    case 4180:
                    case 4190:
                    case 4200:
                    case 4210:
                    case 4220:
                    case 4230:
                    case 4240:
                    case 4250:
                    case 4260:
                    case 4270:
                    case 4280:
                    case 4290:
                    case 4330:
                    case 4350:
                    case 4500:
                    case 4510:
                    case 4520:
                    case 5100:
                    case 5101:
                    case 5102:
                    case 5103:
                    case 5111:
                        this.zzXRT.zzZ(iZzT3, "table", true, false);
                        break;
                    case 4400:
                    case 5015:
                        this.zzXRT.zzZ(iZzT3, "table", false, true);
                        break;
                }
            }
        }
    }

    private zzWF zzYHm() {
        return this.zzY2D.peek();
    }

    private double zzYth() {
        Table tableZz4N = zzYHm().zz4N();
        if (tableZz4N.zzYBd().getNodeType() == 7) {
            CellFormat cellFormat = ((Cell) tableZz4N.zzYBd()).getCellFormat();
            return (cellFormat.getWidth() - cellFormat.getLeftPadding()) - cellFormat.getRightPadding();
        }
        Section section = (Section) tableZz4N.getAncestor(2);
        while (section.getPageSetup().getSectionStart() != 2 && !section.zz9I()) {
            Section section2 = (Section) com.aspose.words.internal.zzZKW.zzZ(section.getPreviousSibling(), Section.class);
            if (section2 != null) {
                section = section2;
            }
        }
        PageSetup pageSetup = section.getPageSetup();
        return (pageSetup.getPageWidth() - (section.zzYvR().contains(2280) ? pageSetup.getLeftMargin() : 72.0d)) - (section.zzYvR().contains(2290) ? pageSetup.getRightMargin() : 72.0d);
    }

    private String zzYti() {
        int iZzr = com.aspose.words.internal.zzSA.zzr(zzYth()) - zzYHm().zz4M();
        int alignment = zzYHm().zz4N().getAlignment();
        if (alignment == 1) {
            iZzr /= 2;
        } else if (alignment != 2) {
            Table tableZz4N = zzYHm().zz4N();
            int iMin = tableZz4N.zzZYf().zzPk(4340) != null ? Math.min(tableZz4N.zzZYf().zzYM7(), Integer.MAX_VALUE) : Integer.MAX_VALUE;
            for (Row firstRow = tableZz4N.getFirstRow(); firstRow != null; firstRow = firstRow.getNextRow()) {
                iMin = Math.min(firstRow.zzZYf().zzYM7(), iMin);
            }
            iZzr = iMin;
        }
        return this.zzXRT.zzr2(iZzr);
    }

    private String zzYtj() {
        zzYOR zzyor = this.zzXRT;
        zzyor.zzr6(zzyor.getRowIndex() + 1);
        return com.aspose.words.internal.zzZKN.format("Row{0}", Integer.valueOf(this.zzXRT.getRowIndex()));
    }

    private String zzYtk() {
        zzYOR zzyor = this.zzXRT;
        zzyor.zzOv(zzyor.getColumnIndex() + 1);
        return com.aspose.words.internal.zzZKN.format("Column{0}", Integer.valueOf(this.zzXRT.getColumnIndex()));
    }

    private String zzYtl() {
        zzYOR zzyor = this.zzXRT;
        zzyor.zzr7(zzyor.zzYsw() + 1);
        return com.aspose.words.internal.zzZKN.format("Table{0}", Integer.valueOf(this.zzXRT.zzYsw()));
    }

    private void zzYtm() {
        zzWH zzwhZz4K = zzYHm().zz4K();
        if (zzwhZz4K.zz52() != null) {
            if (zzwhZz4K.zz6G().getVerticalMerge() == 2) {
                this.zzXRT.zzYsG().zzY("table:covered-table-cell");
                this.zzXRT.zzYsG().zz0("table:style-name", this.zzXRS.zzYtQ());
                return;
            }
            this.zzXRT.zzYsG().zzY("table:table-cell");
            this.zzXRT.zzYsG().zz0("table:style-name", this.zzXRS.zzYtQ());
            if (zzwhZz4K.zzBx() > 1) {
                this.zzXRT.zzYsG().zzZj("table:number-columns-spanned", zzwhZz4K.zzBx());
            }
            if (zzwhZz4K.getRowSpan() > 1) {
                this.zzXRT.zzYsG().zzZj("table:number-rows-spanned", zzwhZz4K.getRowSpan());
            }
        }
    }

    private void zzZ(Table table, int[] iArr) {
        zzg(table);
        zz5(iArr);
    }

    private boolean zze(Table table) throws Exception {
        boolean zZzXk = zzYOR.zzXk(table);
        if (!(this.zzXRT.zzYsF() && zZzXk) && (!(this.zzXRT.zzYsC() == 3 || this.zzXRT.zzYsC() == 4) || zZzXk)) {
            return true;
        }
        return ((table.getParentNode() instanceof Shape) && zzYPU.zzZV((Shape) com.aspose.words.internal.zzZKW.zzZ(table.getParentNode(), Shape.class))) || this.zzXRT.zzYsp() || this.zzXRT.zzYsC() == 6;
    }

    private void zzf(Table table) {
        zzL(table.zzZYf());
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        zzytgZzYsG.zzY("style:table-properties");
        zzytgZzYsG.zz0("table:align", zzYS3.zzse(table.getAlignment()));
        zzytgZzYsG.zz0("style:width", this.zzXRT.zzr2(zzYHm().zz4M()));
        if (table.getPreferredWidth().zzYmB()) {
            zzytgZzYsG.zz0("style:rel-width", zzYOR.zzWt(table.getPreferredWidth().getValue()));
        }
        zzytgZzYsG.zz0("fo:margin-left", zzYti());
        Object objZzPk = table.getFirstRow().zzZYf().zzPk(4380);
        if (objZzPk != null) {
            zzytgZzYsG.zz0("style:writing-mode", ((Boolean) objZzPk).booleanValue() ? "rl-tb" : "lr-tb");
        }
        zzytgZzYsG.zzo();
    }

    private void zzg(Table table) {
        this.zzXQW.zzYw(zzYtl(), "table");
        this.zzXQW.zzW(null, false, true);
        zzf(table);
        this.zzXRT.zzYsG().zzo();
    }

    private boolean zzv(Cell cell) throws Exception {
        return !zze(cell.getParentRow().getParentTable()) && this.zzXRT.zzYsD();
    }

    private void zzw(Cell cell) {
        this.zzXQW.zzYw(this.zzXRS.zzYtQ(), "table-cell");
        new zzYTC(this.zzXRT).zzz(cell);
        this.zzXRT.zzYsG().zzo();
    }

    public final int visitCellEnd(Cell cell) throws Exception {
        if (zzv(cell)) {
            zzWH zzwhZz4K = zzYHm().zz4K();
            int iZzBx = zzwhZz4K.zzBx();
            if (zzwhZz4K.zz52() != null) {
                zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
                zzwhZz4K.zz6G().getVerticalMerge();
                zzytgZzYsG.zzo();
                zzYHm().zz4P();
            }
            for (int i = 1; i < iZzBx; i++) {
                this.zzXRT.zzYsG().zzZ("table:covered-table-cell", (String) null);
                zzYHm().zz4P();
            }
        }
        this.zzXRT.zzZ(cell, (Section) null);
        return 0;
    }

    public final int visitCellStart(Cell cell) throws Exception {
        if (zze(cell.getParentRow().getParentTable())) {
            return 0;
        }
        if (this.zzXRT.zzYsE()) {
            zzw(cell);
        }
        if (this.zzXRT.zzYsD()) {
            zzYHm().zz4K();
            zzYtm();
        }
        return 0;
    }

    public final int visitRowEnd(Row row) throws Exception {
        if (!zze(row.getParentTable()) && this.zzXRT.zzYsD()) {
            zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
            zzytgZzYsG.zzo();
            if (row.zzZYf().getHeadingFormat()) {
                zzytgZzYsG.zzo();
            }
        }
        zzYHm().zz4R();
        this.zzXRT.zzZ(row, (Section) null);
        return 0;
    }

    public final int visitRowStart(Row row) throws Exception {
        if (zze(row.getParentTable())) {
            return 0;
        }
        zzYHm().zz4Q();
        if (this.zzXRT.zzYsE()) {
            zzC(row);
        }
        if (this.zzXRT.zzYsD()) {
            zzD(row);
            while (zzYHm().zz4K().zz51()) {
                this.zzXRT.zzYsG().zzZ("table:table-cell", (String) null);
                zzYHm().zz4P();
            }
        }
        return 0;
    }

    public final int visitTableEnd(Table table) throws Exception {
        if (!zze(table) && this.zzXRT.zzYsD()) {
            this.zzXRT.zzYsG().zzo();
        }
        this.zzY2D.pop();
        this.zzXRT.zzZ(table, (Section) null);
        return 0;
    }

    public final int visitTableStart(Table table) throws Exception {
        if (!table.hasChildNodes()) {
            this.zzXRT.zzZ(table, (Section) null);
            return 1;
        }
        this.zzY2D.push(new zzWF(table, 2));
        if (zze(table)) {
            return 0;
        }
        zzYHm().zz4S();
        int[] iArrZz4O = zzYHm().zz4O();
        if (this.zzXRT.zzYsE()) {
            zzZ(table, iArrZz4O);
        }
        if (this.zzXRT.zzYsD()) {
            zz6(iArrZz4O);
        }
        return 0;
    }
}
