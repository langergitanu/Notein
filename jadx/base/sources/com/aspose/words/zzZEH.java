package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZEH {
    private zzRL zzYkV;
    private zzRL zzYkW;
    private boolean zzYkX;
    private boolean zzYkY;
    private zzZJQ zzYkZ;
    private zzZFD zzYl0;
    private zzZFC zzYl1;
    private zzZEL zzYl2;
    private zzZAQ zzYl3;
    private zzZH6 zzYmN;
    private zzZYY zzYnb;
    private zzZJY zzYnt;
    private zzZJB zzYny;
    private boolean zzZr1;
    private DocumentBuilder zzZwh;

    public zzZEH(DocumentBuilder documentBuilder, zzZYY zzzyy, zzZJB zzzjb, zzZAQ zzzaq, boolean z, zzZJY zzzjy, zzZH6 zzzh6) {
        this.zzZwh = documentBuilder;
        this.zzYnb = zzzyy;
        this.zzYny = zzzjb;
        this.zzYl3 = zzzaq;
        this.zzZr1 = z;
        this.zzYnt = zzzjy;
        this.zzYmN = zzzh6;
    }

    private void zz8(int i, int i2, int i3) {
        this.zzYl0 = this.zzYl2.zzyW(i3);
        int i4 = 0;
        while (i4 < this.zzYl0.zzYZj()) {
            zzZJQ zzzjqZzz6 = this.zzYl0.zzz6(i4);
            this.zzYkZ = zzzjqZzz6;
            int i5 = i;
            int i6 = i3;
            if (zzS(i5, i4, i6, zzzjqZzz6.zzBx(), this.zzYkZ.getRowSpan()) == this.zzYl2.zzZ3X().zzMy(i5)) {
                this.zzYkZ.zzZ3T().zz6G().remove(i2);
                int i7 = i6;
                while (i7 >= 0 && this.zzYl2.zzyW(i7).zzz6(i4).zzZ3T().zz6G().getVerticalMerge() == 2) {
                    i7--;
                }
                while (i7 < this.zzYl2.getRowCount()) {
                    Cell cellZzZ3T = this.zzYl2.zzyW(i7).zzz6(i4).zzZ3T();
                    if (cellZzZ3T.zz6G().getVerticalMerge() != 0) {
                        cellZzZ3T.zz6G().remove(i2);
                        i7++;
                    }
                }
            }
            i4++;
            i = i5;
            i3 = i6;
        }
    }

    private zzRL zz9(int i, int i2, int i3) {
        zzZEL zzzel = this.zzYl2;
        if (zzzel == null || zzzel.zzYYD() <= i2) {
            return zzRL.zzZXm();
        }
        if (i == 0) {
            return i3 == this.zzYl2.getRowCount() - 1 ? this.zzYl2.zzyX(i2).zzZ3Q().zzZ3X().zzZX4() : zzRL.zzZXm();
        }
        if (i == 1) {
            return zzyS(i2);
        }
        if (i == 2) {
            return zzyT(i2);
        }
        if (i == 3) {
            return i3 == 0 ? this.zzYl2.zzyX(i2).zzZ3Q().zzZ3X().zzZX5() : zzRL.zzZXm();
        }
        throw new IllegalStateException("Unknown border type");
    }

    private void zzH(int i, int i2, int i3, int i4) {
        zzZFD zzzfdZzyW = this.zzYl2.zzyW(i3);
        this.zzYl0 = zzzfdZzyW;
        zzZJQ zzzjqZzz6 = zzzfdZzyW.zzz6(i4);
        this.zzYkZ = zzzjqZzz6;
        if (zzS(i, i4, i3, zzzjqZzz6.zzBx(), this.zzYkZ.getRowSpan()) == this.zzYl2.zzZ3X().zzMy(i)) {
            this.zzYkZ.zzZ3T().zz6G().remove(i2);
            int i5 = i4;
            while (i5 >= 0 && this.zzYl0.zzz6(i5).zzZ3T().zz6G().getHorizontalMerge() == 2) {
                i5--;
            }
            while (i5 < this.zzYl0.zzYZj()) {
                Cell cellZzZ3T = this.zzYl0.zzz6(i5).zzZ3T();
                if (cellZzZ3T.zz6G().getHorizontalMerge() == 0) {
                    break;
                }
                cellZzZ3T.zz6G().remove(i2);
                i5++;
            }
        }
        this.zzYl0 = null;
        this.zzYkZ = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        if (r2.zzYl2.zzyW(r5 - 1).zzYZl() == r2.zzYl0.zzYZl()) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:
    
        if ((r4 + r6) == r2.zzYl0.zzYZk()) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0042, code lost:
    
        if (r4 == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005f, code lost:
    
        if (r2.zzYl2.zzyW(r5 + 1).zzYZl() == r2.zzYl0.zzYZl()) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0066, code lost:
    
        return com.aspose.words.zzRL.zzZXm();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zzRL zzI(int i, int i2, int i3, int i4) {
        zzZFD zzzfd;
        if (this.zzYl2 == null || (zzzfd = this.zzYl0) == null || zzzfd.zzYZl() == null) {
            return zzRL.zzZXm();
        }
        if (i == 0) {
            if (i3 != this.zzYl2.getRowCount() - 1) {
            }
            return this.zzYl0.zzYZl().zzZ3X().zzMy(i);
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("Unknown border type");
                }
                if (i3 != 0) {
                }
                return this.zzYl0.zzYZl().zzZ3X().zzMy(i);
            }
        }
    }

    private void zzJ(boolean z, boolean z2) {
        if (z) {
            zz8(3, 3110, 0);
        }
        if (z2) {
            zz8(0, 3130, this.zzYl2.getRowCount() - 1);
        }
        for (int i = 0; i < this.zzYl2.getRowCount(); i++) {
            zzH(1, 3120, i, 0);
            zzH(2, 3140, i, this.zzYl2.zzyW(i).zzYZj() - 1);
        }
    }

    private void zzL(Cell cell) throws Exception {
        zzQ4 zzq4;
        zzQ4 zzq42;
        if (this.zzYnb.zzZUC().zzSx("background-color") != null) {
            return;
        }
        zzZFD zzzfd = this.zzYl0;
        if (zzzfd != null) {
            zzQ4 zzq43 = (zzQ4) zzzfd.zzZWe().zzSx("background-color");
            if (zzq43 != null) {
                zzq43.zzZ(cell.getCellFormat());
                return;
            } else if (this.zzYl0.zzYZl() != null && (zzq42 = (zzQ4) this.zzYl0.zzYZl().zzZWe().zzSx("background-color")) != null) {
                zzq42.zzZ(cell.getCellFormat());
                return;
            }
        }
        if (this.zzYl2.zzYYD() > cell.getColumnIndex()) {
            zzZJI zzzjiZzyX = this.zzYl2.zzyX(cell.getColumnIndex());
            zzQ4 zzq44 = (zzQ4) zzzjiZzyX.zzZWe().zzSx("background-color");
            if (zzq44 != null) {
                zzq44.zzZ(cell.getCellFormat());
            } else {
                if (zzzjiZzyX.zzZ3Q() == null || (zzq4 = (zzQ4) zzzjiZzyX.zzZ3Q().zzZWe().zzSx("background-color")) == null) {
                    return;
                }
                zzq4.zzZ(cell.getCellFormat());
            }
        }
    }

    private void zzM(Cell cell) {
        zzPT zzptZzSx;
        if (cell.getCellFormat().getOrientation() == 5 && (zzptZzSx = this.zzYnb.zzZUC().zzSx("transform")) != null && zzptZzSx.zzZWj().zzZVx().getValueType() == 9) {
            zzP1 zzp1 = (zzP1) zzptZzSx.zzZWj().zzZVx();
            if ("rotate".equals(zzp1.getName()) && zzp1.zzZW3().getCount() == 1 && zzp1.zzZW3().zzMl(0).getValueType() == 10 && com.aspose.words.internal.zzAN.zzL(180.0d, zzp1.zzZW3().zzMl(0).getDoubleValue())) {
                cell.getCellFormat().setOrientation(3);
            }
        }
    }

    private void zzP(Row row) throws Exception {
        Iterator<zzPT> it = this.zzYnb.zzZUC().iterator();
        while (it.hasNext()) {
            ((zzQ4) it.next()).zzV(row);
        }
    }

    private void zzQ(Row row) {
        zzY6G zzy6gZzZYf = row.zzZYf();
        zzRL zzrl = this.zzYkW;
        if (zzrl != null && zzrl.isVisible()) {
            zzy6gZzZYf.zzQ(4090, new Border());
            this.zzYkW.zzI(zzy6gZzZYf.zz5u());
        }
        zzRL zzrl2 = this.zzYkV;
        if (zzrl2 == null || !zzrl2.isVisible()) {
            return;
        }
        zzy6gZzZYf.zzQ(EditingLanguage.CHINESE_SINGAPORE, new Border());
        this.zzYkV.zzI(zzy6gZzZYf.zz5t());
    }

    private zzRL zzS(int i, int i2, int i3, int i4, int i5) {
        zzRL[] zzrlArr = {zzyU(i), zzb(i, i2, i4), zzI(i, i2, i3, i4), zza(i, i2, i3), zz9(i, i2, i3), zzT(i, i2, i3, i4, i5)};
        zzRL zzrl = zzrlArr[0];
        for (int i6 = 1; i6 < 6; i6++) {
            if (zzrl.zzZ(zzrlArr[i6]) < 0) {
                zzrl = zzrlArr[i6];
            }
        }
        return zzrl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0014, code lost:
    
        if (r4 == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0026, code lost:
    
        if ((r3 + r5) == r1.zzYl0.zzYZk()) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0029, code lost:
    
        if (r3 == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0031, code lost:
    
        if ((r4 + r6) == r0.getRowCount()) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003d, code lost:
    
        return r1.zzYl2.zzZ3X().zzMy(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0042, code lost:
    
        return com.aspose.words.zzRL.zzZXm();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zzRL zzT(int i, int i2, int i3, int i4, int i5) {
        zzZEL zzzel = this.zzYl2;
        if (zzzel == null) {
            return zzRL.zzZXm();
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("Unknown border type");
                    }
                }
            }
        }
    }

    private static zzL4 zzV(zzPS zzps, String str) {
        zzPT zzptZzSx = zzps.zzSx(str);
        if (zzptZzSx == null) {
            return null;
        }
        zzptZzSx.zzZWj().getCount();
        return zzptZzSx.zzZWj().zzZVx();
    }

    private zzQQ zzW(BorderCollection borderCollection) throws Exception {
        zzQQ zzqqZzZ3X = this.zzYkZ.zzZ3X() != null ? this.zzYkZ.zzZ3X() : zzQQ.zzZ(this.zzYnb.zzZUC(), true);
        if (zzqqZzZ3X.zzZX5().isVisible()) {
            zzqqZzZ3X.zzZX5().zzI(borderCollection.getTop());
        }
        if (zzqqZzZ3X.zzZX4().isVisible()) {
            zzqqZzZ3X.zzZX4().zzI(borderCollection.getBottom());
        }
        if (zzqqZzZ3X.zzZX7().isVisible()) {
            zzqqZzZ3X.zzZX7().zzI(this.zzYkX ? borderCollection.getRight() : borderCollection.getLeft());
        }
        if (zzqqZzZ3X.zzZX6().isVisible()) {
            zzqqZzZ3X.zzZX6().zzI(this.zzYkX ? borderCollection.getLeft() : borderCollection.getRight());
        }
        return zzqqZzZ3X;
    }

    private void zzY(Table table, int i, int i2) throws Exception {
        int count = (table.getRows().getCount() - i2) - 1;
        while (i <= count) {
            BorderCollection borders = table.getRows().get(i).getRowFormat().getBorders();
            zzQQ zzqqZzZ3X = this.zzYl2.zzZ3X();
            if (zzqqZzZ3X.zzZX5().isVisible()) {
                zzqqZzZ3X.zzZX5().zzI(borders.getTop());
            }
            if (zzqqZzZ3X.zzZX6().isVisible()) {
                zzqqZzZ3X.zzZX6().zzI(borders.getRight());
            }
            if (zzqqZzZ3X.zzZX4().isVisible()) {
                zzqqZzZ3X.zzZX4().zzI(borders.getBottom());
            }
            if (zzqqZzZ3X.zzZX7().isVisible()) {
                zzqqZzZ3X.zzZX7().zzI(borders.getLeft());
            }
            i++;
        }
    }

    private zzRL zza(int i, int i2, int i3) {
        zzZEL zzzel = this.zzYl2;
        return (zzzel == null || i2 >= zzzel.zzYYD() || (i == 3 && i3 != 0) || (i == 0 && i3 != this.zzYl2.getRowCount() + (-1))) ? zzRL.zzZXm() : this.zzYl2.zzyX(i2).zzZ3X().zzMy(i);
    }

    private zzRL zzb(int i, int i2, int i3) {
        zzZFD zzzfd = this.zzYl0;
        return (zzzfd == null || (i == 1 && i2 != 0) || (i == 2 && i2 + i3 != zzzfd.zzYZk())) ? zzRL.zzZXm() : this.zzYl0.zzZ3X().zzMy(i);
    }

    private void zzv(Table table) throws Exception {
        if (table.isFloating()) {
            if (table.getFirstRow() != null) {
                zzY6G zzy6gZzZYf = table.getFirstRow().zzZYf();
                zzy6gZzZYf.zzQ(4210, Integer.valueOf(Math.max(com.aspose.words.internal.zzSA.zzr(this.zzYnb.zzZUx().zzZWS().getValue()), 0)));
                zzy6gZzZYf.zzQ(4270, Integer.valueOf(Math.max(com.aspose.words.internal.zzSA.zzr(this.zzYnb.zzZUx().zzZWR().getValue()), 0)));
                zzy6gZzZYf.zzQ(4220, Integer.valueOf(com.aspose.words.internal.zzSA.zzr(this.zzYnb.zzZUx().zzZWQ().getValue())));
                zzy6gZzZYf.zzQ(4280, Integer.valueOf(com.aspose.words.internal.zzSA.zzr(this.zzYnb.zzZUx().zzZWP().getValue())));
                return;
            }
            return;
        }
        double dZzW = this.zzZr1 ? table.getBidi() ? zzW(this.zzYnb.zzZUC(), "margin-right") : zzW(this.zzYnb.zzZUC(), "margin-left") : table.getBidi() ? this.zzYnb.zzZUx().zzZWR().getValue() : this.zzYnb.zzZUx().zzZWS().getValue();
        if (this.zzZwh.getDocument().getCompatibilityOptions().getMswVersion() < 15 && !table.zzhk() && table.getFirstRow() != null && !this.zzZr1) {
            zzWP zzwpZz6G = table.getFirstRow().getFirstCell().zz6G();
            dZzW += ((double) zzwpZz6G.getLeftPadding()) / 20.0d;
            if (zzwpZz6G.zz5y() != null && zzwpZz6G.zz5y().getLineStyle() != 0) {
                dZzW += zzwpZz6G.zz5y().getLineWidth() / 2.0d;
            }
        }
        if (com.aspose.words.internal.zzAN.zzL(table.getLeftIndent(), dZzW)) {
            return;
        }
        table.setLeftIndent(dZzW);
    }

    private zzRL zzyS(int i) {
        zzZJG zzzjgZzZ3Q = this.zzYl2.zzyX(i).zzZ3Q();
        return (i > 0 ? this.zzYl2.zzyX(i + (-1)).zzZ3Q() : null) != zzzjgZzZ3Q ? zzzjgZzZ3Q.zzZ3X().zzZX7() : zzRL.zzZXm();
    }

    private zzRL zzyT(int i) {
        zzZJG zzzjgZzZ3Q = this.zzYl2.zzyX(i).zzZ3Q();
        int i2 = i + 1;
        return ((i2 >= this.zzYl0.zzYZk() || i2 >= this.zzYl2.zzYYD()) ? null : this.zzYl2.zzyX(i2).zzZ3Q()) != zzzjgZzZ3Q ? zzzjgZzZ3Q.zzZ3X().zzZX6() : zzRL.zzZXm();
    }

    private zzRL zzyU(int i) {
        zzZJQ zzzjq = this.zzYkZ;
        return (zzzjq == null || zzzjq.zzZ3X() == null) ? zzRL.zzZXm() : this.zzYkZ.zzZ3X().zzMy(i);
    }

    private void zzyV(int i) throws Exception {
        zzZFD zzzfdZzyW = this.zzYl2.zzyW(i);
        this.zzYl0 = zzzfdZzyW;
        zzZFC zzzfcZzYZl = zzzfdZzyW.zzYZl();
        zzZFC zzzfc = this.zzYl1;
        if (zzzfcZzYZl != zzzfc) {
            if (zzzfc != null) {
                this.zzYnb.zzZVt();
            }
            zzZFC zzzfcZzYZl2 = this.zzYl0.zzYZl();
            this.zzYl1 = zzzfcZzYZl2;
            this.zzYnb.zzZ((zzZAS) zzzfcZzYZl2.zzZ3Y(), true);
        }
        this.zzYnb.zzZ((zzZAS) this.zzYl0.zzZ3Y(), true);
        if (this.zzYnb.zzZUy() == 0) {
            for (int i2 = 0; i2 < this.zzYl0.zzYZk(); i2++) {
                zzZ(this.zzYl0.zzz6(i2), i, i2);
            }
            this.zzZwh.clearRowAttrs();
            Row parentRow = this.zzZwh.getCurrentParagraph().getParentRow();
            zzP(parentRow);
            if (!com.aspose.words.internal.zzAN.zzZC(this.zzYl0.zzYZm()) && this.zzYl0.zzYZm() > parentRow.getRowFormat().getHeight()) {
                parentRow.getRowFormat().setHeight(this.zzYl0.zzYZm());
                parentRow.getRowFormat().setHeightRule(0);
            }
            if ("exactly".equals(this.zzYnb.zzZUC().zzSF("-aw-height-rule"))) {
                parentRow.getRowFormat().setHeightRule(1);
            }
            if (com.aspose.words.internal.zzZKN.zzX(this.zzYnb.zzZUC().zzSF("page-break-inside"), "avoid", com.aspose.words.internal.zzZOF.ORDINAL_IGNORE_CASE$4894b8c8)) {
                parentRow.getRowFormat().setAllowBreakAcrossPages(false);
            }
            if (this.zzYkY) {
                if (this.zzYl0.zzYZl().zzYZi()) {
                    parentRow.getRowFormat().setHeadingFormat(true);
                } else {
                    this.zzYkY = false;
                }
            }
            this.zzYmN.zzN(this.zzYl0.zzZ3Y());
            this.zzZwh.endRow();
        }
        this.zzYnb.zzZVt();
        this.zzYl0 = null;
    }

    public final Table zzZ(zzZEL zzzel, boolean z, zzZIG zzzig) throws Exception {
        this.zzYl2 = zzzel;
        if (zzzel.getRowCount() == 0 || this.zzYl2.getColumnCount() == 0) {
            return null;
        }
        Table tableStartTable = this.zzZwh.startTable();
        this.zzYmN.zzZ(zzzig, tableStartTable);
        this.zzYny.zzZ(tableStartTable, this.zzYnb.zzZUC());
        this.zzYkX = this.zzYnb.zzZUQ();
        this.zzZwh.getParagraphFormat().clearFormatting();
        int i = 0;
        for (int i2 = 0; i2 < this.zzYl2.zzYYE(); i2++) {
            zzZEK zzzekZzyY = this.zzYl2.zzyY(i2);
            if (zzzekZzyY.zzYYx()) {
                i++;
                zzZ(zzzekZzyY);
            }
        }
        zzPS zzpsZzZUC = this.zzYnb.zzZUC();
        this.zzYkW = zzRL.zzY(zzpsZzZUC, 4);
        this.zzYkV = zzRL.zzY(zzpsZzZUC, 5);
        this.zzYl1 = null;
        this.zzYkY = true;
        for (int i3 = 0; i3 < this.zzYl2.getRowCount(); i3++) {
            zzyV(i3);
            Row parentRow = this.zzZwh.getCurrentParagraph().getParentRow();
            if (parentRow != null) {
                zzQ(parentRow);
            }
        }
        if (this.zzYl1 != null) {
            this.zzYnb.zzZUw();
            this.zzYnb.zzZVt();
            this.zzYl1 = null;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.zzYl2.zzYYE(); i5++) {
            zzZEK zzzekZzyY2 = this.zzYl2.zzyY(i5);
            if (!zzzekZzyY2.zzYYx()) {
                i4++;
                zzZ(zzzekZzyY2);
            }
        }
        tableStartTable.setAllowAutoFit(true);
        this.zzYnb.zzZ(tableStartTable, this.zzYl2.zzYYA(), this.zzYl2.zzYYz());
        zzY(tableStartTable, i, i4);
        zzv(tableStartTable);
        this.zzYnt.zzC(tableStartTable);
        if (this.zzYl2.zzYYC()) {
            zzJ(i == 0, i4 == 0);
        }
        this.zzZwh.endTable();
        if (tableStartTable.zzhk() && !z) {
            return tableStartTable;
        }
        tableStartTable.zzY0e();
        return tableStartTable;
    }

    private static double zzW(zzPS zzps, String str) {
        zzL4 zzl4ZzV = zzV(zzps, str);
        if (zzl4ZzV == null) {
            return 0.0d;
        }
        return zzL5.zzL(zzl4ZzV);
    }

    private void zzZ(zzZJQ zzzjq, int i, int i2) throws Exception {
        int i3;
        zzZEH zzzeh;
        Cell cellZzZ3T;
        String name;
        this.zzYkZ = zzzjq;
        if (zzzjq.zzZ3Y() != null) {
            this.zzYnb.zzZ((zzZAS) zzzjq.zzZ3Y(), true);
        }
        if (i2 < 63) {
            cellZzZ3T = this.zzZwh.insertCell();
            zzzjq.zzN(cellZzZ3T);
            if (!cellZzZ3T.getParentRow().getParentTable().getAllowAutoFit()) {
                cellZzZ3T.getParentRow().getParentTable().setAllowAutoFit(true);
            }
            this.zzZwh.getCellFormat().zz6z();
            cellZzZ3T.zz6G().setHideMark(true);
            if (this.zzYl2.zzYYB()) {
                this.zzZwh.getCellFormat().setLeftPadding(0.0d);
                this.zzZwh.getCellFormat().setRightPadding(0.0d);
            }
            this.zzZwh.getCellFormat().setHorizontalMerge(zzzjq.getHorizontalMerge());
            this.zzZwh.getCellFormat().setVerticalMerge(zzzjq.getVerticalMerge());
            this.zzZwh.getCellFormat().setVerticalAlignment(1);
            if (zzzjq.zzZ3Y() != null) {
                zzZ(cellZzZ3T, i, zzzjq.zzBx(), zzzjq.zzZ3U(), zzzjq.getRowSpan(), !zzzjq.zzZ3Y().zzZ2D());
                zzzeh = this;
                i3 = i;
            } else {
                i3 = i;
                zzzeh = this;
            }
            zzZJQ zzzjqZzZ3W = zzzjq.zzZ3W();
            if (zzzjqZzZ3W == null) {
                zzzjqZzZ3W = zzzjq.zzZ3V();
            }
            if (zzzjqZzZ3W != null) {
                zzZJQ zzzjq2 = zzzjqZzZ3W;
                Cell cellZzZ3T2 = zzzjq2.zzZ3T();
                if (zzzjq2.getVerticalMerge() != 0) {
                    zzzeh.zzYnb.zzZ((zzZAS) new zzZIG("td"), false);
                    Border border = new Border();
                    zzRL.zzZ(zzzeh.zzYnb.zzZUC(), 3, true).zzI(border);
                    Border border2 = new Border();
                    zzRL.zzZ(zzzeh.zzYnb.zzZUC(), 0, true).zzI(border2);
                    zzzeh.zzYnb.zzZVt();
                    zzZ(cellZzZ3T2, cellZzZ3T, zzzjq2.getRowSpan(), border, border2, zzzeh.zzYkW.isVisible());
                } else {
                    zzZ(cellZzZ3T2, cellZzZ3T);
                }
            }
        } else {
            i3 = i;
            zzzeh = this;
            cellZzZ3T = zzzeh.zzYl0.zzz6(62).zzZ3T();
        }
        if (i2 == 0) {
            zzzeh.zzYmN.zzO((zzZAS) zzzeh.zzYl0.zzZ3Y());
        }
        if (zzzjq.zzZ3Y() != null) {
            zzzeh.zzYmN.zzO((zzZAS) zzzjq.zzZ3Y());
            zzzeh.zzYl3.zzI(zzzjq.zzZ3Y());
            zzzeh.zzYmN.zzN(zzzjq.zzZ3Y());
            zzzeh.zzYnb.zzZVt();
        } else if (i2 < 63) {
            zzzeh.zzZwh.getParagraphFormat().clearFormatting();
        }
        if (i3 == 0 && i2 == 0 && (cellZzZ3T.getParentRow().getParentTable().getNextSibling() instanceof Paragraph)) {
            Paragraph paragraph = (Paragraph) cellZzZ3T.getParentRow().getParentTable().getNextSibling();
            while (paragraph.getLastChild() != null) {
                if (paragraph.getLastChild().getNodeType() != 9 && paragraph.getLastChild().getNodeType() != 10) {
                    return;
                }
                int nodeType = paragraph.getLastChild().getNodeType();
                if (nodeType == 9) {
                    name = ((BookmarkStart) paragraph.getLastChild()).getName();
                } else if (nodeType != 10) {
                    name = "";
                } else {
                    name = ((BookmarkEnd) paragraph.getLastChild()).getName();
                }
                if (!zzzeh.zzYmN.zzKE(name)) {
                    return;
                }
                Node lastChild = paragraph.getLastChild();
                lastChild.remove();
                cellZzZ3T.getFirstParagraph().zzZ(lastChild, (Node) null, true);
            }
        }
    }

    private void zzZ(zzZEK zzzek) throws Exception {
        zzZJQ zzzjq = new zzZJQ(zzzek.zzZ3Y(), null);
        if (this.zzYl2.getColumnCount() > 1) {
            zzzjq.setHorizontalMerge(1);
        }
        zzZ(zzzjq, -1, -1);
        for (int i = 1; i < this.zzYl2.getColumnCount(); i++) {
            zzZJQ zzzjq2 = new zzZJQ(null);
            zzzjq2.setHorizontalMerge(2);
            zzzjq2.zzZ(zzzjq);
            zzZ(zzzjq2, -1, -1);
        }
        this.zzZwh.clearRowAttrs();
        this.zzZwh.endRow();
    }

    private static void zzZ(Cell cell, Cell cell2) {
        Iterator<Integer> it = zzWP.zzZzU.zzl9().iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            cell2.zz6G().remove(iIntValue);
            Border border = (Border) com.aspose.words.internal.zzZKW.zzZ(cell.zz6G().get(iIntValue), Border.class);
            if (border != null && !border.isInherited()) {
                cell2.zz6G().zzQ(iIntValue, border.zz8H());
            }
        }
    }

    private static void zzZ(Cell cell, Cell cell2, int i, Border border, Border border2, boolean z) {
        Border border3;
        boolean z2 = (cell2.getRowIndex() - cell.getRowIndex()) + 1 == i;
        for (Integer num : zzWP.zzZzU.getKeys()) {
            int iIntValue = num.intValue();
            int iIntValue2 = zzWP.zzZzU.get(num).intValue();
            cell2.zz6G().remove(iIntValue2);
            Border border4 = (Border) com.aspose.words.internal.zzZKW.zzZ(cell.zz6G().get(iIntValue2), Border.class);
            if (border4 != null && !border4.isInherited() && border4.isVisible() && iIntValue != 3 && (iIntValue != 0 || z2)) {
                cell2.zz6G().zzQ(iIntValue2, border4.zz8H());
            } else if (iIntValue == 3 || iIntValue == 0) {
                Border border5 = iIntValue == 3 ? border : border2;
                if (border5.isVisible() && !border5.zz8F()) {
                    cell2.zz6G().zzQ(iIntValue2, new Border(border5.getLineStyle(), border5.zz8L(), border5.zz8Q()));
                }
            }
        }
        if (z2) {
            int iIntValue3 = zzWP.zzZzU.get(0).intValue();
            if (((Border) com.aspose.words.internal.zzZKW.zzZ(cell.zz6G().get(iIntValue3), Border.class)) != null) {
                if (z) {
                    border3 = Border.zz8G();
                } else {
                    border3 = new Border();
                }
                cell.zz6G().zzQ(iIntValue3, border3);
            }
        }
    }

    private void zzZ(Cell cell, int i, int i2, int i3, int i4, boolean z) throws Exception {
        zzZEH zzzeh;
        Cell cell2;
        zzQQ zzqqZzW;
        if (this.zzYl2.zzYYC()) {
            zzzeh = this;
            cell2 = cell;
            zzqqZzW = zzzeh.zzZ(cell2, cell.getColumnIndex(), i, i2, i4);
        } else {
            zzzeh = this;
            cell2 = cell;
            zzqqZzW = zzW(cell2.getCellFormat().getBorders());
        }
        Iterator<zzPT> it = zzzeh.zzYnb.zzZUC().iterator();
        while (it.hasNext()) {
            ((zzQ4) it.next()).zzZ(cell2.getCellFormat());
        }
        zzZ(cell2, i3, z, zzqqZzW);
        zzL(cell2);
        zzM(cell2);
    }

    private void zzZ(Cell cell, int i, boolean z, zzQQ zzqq) throws Exception {
        zzPS zzpsZzZWe = zzPS.zzZqo;
        zzPS[] zzpsArr = null;
        if (cell.getColumnIndex() < this.zzYl2.zzYYD()) {
            zzpsZzZWe = this.zzYl2.zzyX(cell.getColumnIndex()).zzZWe();
            if (i >= 2) {
                int iMin = Math.min(this.zzYl2.zzYYD(), cell.getColumnIndex() + i) - 1;
                zzpsArr = new zzPS[iMin - cell.getColumnIndex()];
                int columnIndex = cell.getColumnIndex();
                while (true) {
                    columnIndex++;
                    if (columnIndex > iMin) {
                        break;
                    }
                    zzpsArr[(columnIndex - cell.getColumnIndex()) - 1] = this.zzYl2.zzyX(columnIndex).zzZWe();
                }
            }
        }
        zzKV.zzZ(cell.getCellFormat(), this.zzYnb.zzZUC(), zzpsZzZWe, zzpsArr, zzqq, !this.zzZr1, this.zzYl2.zzYYC(), z);
        if (cell.isFirstCell() && cell.getParentRow().isFirstRow()) {
            this.zzYl2.zzY(zzqq.zzZX7());
        }
        if (cell.isLastCell() && cell.getParentRow().isFirstRow()) {
            this.zzYl2.zzX(zzqq.zzZX6());
        }
    }

    private zzQQ zzZ(Cell cell, int i, int i2, int i3, int i4) throws Exception {
        zzQQ zzqqZzZ;
        if (this.zzYkZ.zzZ3X() != null) {
            zzqqZzZ = this.zzYkZ.zzZ3X();
        } else {
            zzqqZzZ = zzQQ.zzZ(this.zzYnb.zzZUC(), true);
        }
        if (i2 < 0) {
            zzqqZzZ.zzX(cell.getCellFormat().getBorders());
            return zzqqZzZ;
        }
        int[] iArr = {3, 2, 0, 1};
        zzRL[] zzrlArr = new zzRL[4];
        int i5 = 0;
        for (int i6 = 0; i6 < 4; i6++) {
            int i7 = iArr[i6];
            zzRL zzrlZzS = zzS(i7, i, i2, i3, i4);
            if (this.zzYkX) {
                if (i7 == 1) {
                    i7 = 2;
                } else if (i7 == 2) {
                    i7 = 1;
                }
            }
            Border byBorderType = cell.getCellFormat().getBorders().getByBorderType(i7);
            if (zzrlZzS.isVisible()) {
                zzrlZzS.zzI(byBorderType);
                zzrlArr[i5] = zzrlZzS;
            } else if ((((i7 == 1 || i7 == 2) && this.zzYkV.isVisible()) || ((i7 == 3 || i7 == 0) && this.zzYkW.isVisible())) && ((i != 0 || i7 != 1) && ((i != this.zzYl0.zzYZk() - 1 || i7 != 2) && ((i2 != 0 || i7 != 3) && (i2 != this.zzYl2.getRowCount() - 1 || i7 != 0))))) {
                zzrlZzS.zzI(byBorderType);
                byBorderType.zzYN(true);
            }
            i5++;
        }
        return new zzQQ(zzrlArr[0], zzrlArr[1], zzrlArr[2], zzrlArr[3]);
    }
}
