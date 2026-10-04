package com.aspose.words;

import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZEF extends zzZ1D {
    private com.aspose.words.internal.zzZQC<zzZEI> zzYkU;
    private zzZJX zzYrP;
    private zzZH4 zzYs8;
    private HtmlSaveOptions zzYt2;
    private zzZAO zzYt4;
    private Document zzZEY;

    public zzZEF(Document document, zzZAO zzzao, zzZH4 zzzh4, HtmlSaveOptions htmlSaveOptions, zzZJX zzzjx, boolean z) {
        super(z);
        this.zzZEY = document;
        this.zzYt4 = zzzao;
        this.zzYs8 = zzzh4;
        this.zzYt2 = htmlSaveOptions;
        this.zzYrP = zzzjx;
        this.zzYkU = new com.aspose.words.internal.zzZQC<>();
    }

    private boolean zzYYp() {
        if (this.zzYkU.size() == 0) {
            return false;
        }
        return this.zzYkU.peek().zzYl5;
    }

    private void zzYYq() {
        String name = zzZ3E().zzYXX().getName();
        if ("thead".equals(name) || "tbody".equals(name)) {
            zzZ3E().zzp();
        }
    }

    private void zzYYr() {
        if (zzYYs()) {
            zzZ3E().zzZN(TranslateLanguage.TURKISH, 0);
            zzLU zzlu = new zzLU();
            zzlu.zzZ("height", 0.0d, 4);
            this.zzYt4.zzZ3C().zzV(zzlu);
            for (int i = 0; i < zzYHm().getColumnCount(); i++) {
                zzZ3E().zzZN("td", 0);
                zzLU zzlu2 = new zzLU();
                zzlu2.zzZ("width", zzuW(i), 4);
                zzlu2.zzX(zzL4.zzZno, null, null);
                this.zzYt4.zzZ3C().zzV(zzlu2);
                zzZ3E().endElement("td");
            }
            zzZ3E().endElement(TranslateLanguage.TURKISH);
        }
    }

    private boolean zzYYs() {
        return zzYHm().zz4E() || !zzYHm().zz4D();
    }

    private static boolean zzZ(Row row, int i, Border border) throws Exception {
        Iterator<T> it = row.getCells().iterator();
        while (it.hasNext()) {
            if (!zzZ((Cell) it.next(), i, border)) {
                return false;
            }
        }
        return true;
    }

    private zzZE7 zzZ3E() {
        return this.zzYt4.zzZ3E();
    }

    private void zzZE(String str, int i) {
        if (i > 1) {
            zzZ3E().zzZD(str, i);
        }
    }

    private static boolean zzs(Table table) throws Exception {
        if (table.getFirstRow() == null || table.getFirstRow().getFirstCell() == null) {
            return false;
        }
        Border top = table.getFirstRow().getFirstCell().getCellFormat().getBorders().getTop();
        if (!top.isVisible() || !zzZ(table.getFirstRow(), 3, top) || !zzZ(table.getLastRow(), 0, top)) {
            return false;
        }
        for (Row row : table.getRows()) {
            if (!zzZ(row.getFirstCell(), 1, top) || !zzZ(row.getLastCell(), 2, top)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.aspose.words.zzZ1D
    public final void zzYYt() {
        if (zzLR.zzU(zzYHm().zz4K().zz6G().zz5r())) {
            zzZ3E().endElement("div");
        }
        this.zzYrP.zzZ45();
        zzZ3E().endElement("td");
    }

    @Override // com.aspose.words.zzZ1D
    public final void zzYYu() {
        zzZ3E().zzZN("td", 0);
        zzWH zzwhZz4K = zzYHm().zz4K();
        zzZE("colspan", zzwhZz4K.zzBx());
        zzZE("rowspan", zzwhZz4K.zz50());
        this.zzYt4.zzZ3C().zzZ(zzwhZz4K, zzYYp(), !zzYHm().zz4N().getAllowCellSpacing());
        this.zzYrP.zzZ46();
        if (zzLR.zzU(zzwhZz4K.zz6G().zz5r())) {
            zzZ3E().zzZN("div", 0);
            zzLU zzlu = new zzLU();
            zzLR.zzZ(zzlu, zzwhZz4K.zz52());
            if (this.zzYt2.getExportRoundtripInformation()) {
                zzlu.zzZs("-aw-ignore", TelemetryEventStrings.Value.TRUE);
            }
            zzZ3E().zzH(zzlu.zzZWe());
        }
    }

    @Override // com.aspose.words.zzZ1D
    public final void zzYYv() {
        if (zzYHm().zz4L().zz4X()) {
            return;
        }
        zzZ3E().endElement(TranslateLanguage.TURKISH);
    }

    @Override // com.aspose.words.zzZ1D
    public final void zzYYw() {
        if (zzYHm().zz4L().zz4U()) {
            zzYYq();
            if (zzYHm().zz4L().isHeading()) {
                zzZ3E().zzZN("thead", 0);
            } else {
                zzZ3E().zzZN("tbody", 0);
            }
        }
        if (zzYHm().zz4L().zz4X()) {
            return;
        }
        zzZ3E().zzZN(TranslateLanguage.TURKISH, 0);
        this.zzYt4.zzZ3C().zzX(zzYHm().zz4L());
    }

    @Override // com.aspose.words.zzZ1D
    public final void zzt(Table table) {
        zzYYr();
        zzYYq();
        zzZ3E().endElement("table");
        if (this.zzYkU.pop().zzYl4) {
            zzZ3E().endElement("div");
        }
        this.zzYrP.zzZ47();
    }

    @Override // com.aspose.words.zzZ1D
    public final void zzu(Table table) throws Exception {
        this.zzYrP.zzz(table);
        boolean zZzs = zzs(table);
        zzZEI zzzei = new zzZEI();
        this.zzYkU.push(zzzei);
        zzzei.zzYl5 = (!zZzs || table.getAllowCellSpacing() || zzYYs()) ? false : true;
        if (this.zzYs8.zzy(table)) {
            zzZ3E().zzZN("div", 0);
            this.zzYs8.zzx(table);
            zzzei.zzYl4 = true;
        }
        if (this.zzYt2.zzYZ1() == 0) {
            int i = table.getFirstRow().zzZYf().zzXXa().getBidi() ? 2 : 0;
            int alignment = table.getFirstRow().zzZYf().zzXXa().getAlignment();
            if (alignment != i) {
                if (!zzzei.zzYl4) {
                    zzZ3E().zzZN("div", 0);
                    zzzei.zzYl4 = true;
                }
                zzLU zzlu = new zzLU();
                zzlu.zzZs("text-align", zzZDY.zzyJ(alignment));
                this.zzYt4.zzZ3C().zzV(zzlu);
            }
        }
        zzZ3E().zzZN("table", 0);
        if (!this.zzYt2.zzYZ4()) {
            zzZ3E().zzZD("cellspacing", table.getAllowCellSpacing() ? com.aspose.words.internal.zzAN.zzZG(com.aspose.words.internal.zzSA.pointToPixel(zzLR.zzX(table))) : 0);
            zzZ3E().zzZD("cellpadding", 0);
        }
        double leftIndent = table.getLeftIndent();
        if (!table.zzhk() && this.zzZEY.getCompatibilityOptions().getMswVersion() < 15) {
            CellFormat cellFormat = table.getFirstRow().getFirstCell().getCellFormat();
            leftIndent -= cellFormat.getLeftPadding();
            if (table.getFirstRow().getFirstCell() != null) {
                Border byBorderType = cellFormat.getBorders().getByBorderType(1);
                if (byBorderType.getLineStyle() != 0) {
                    leftIndent -= (double) (byBorderType.zz8S() / 2.0f);
                }
            }
        }
        this.zzYt4.zzZ3C().zzZ(table, leftIndent, zzYYp());
    }

    private static boolean zzZ(Cell cell, int i, Border border) throws Exception {
        return cell.getCellFormat().getBorders().getByBorderType(i).equals(border);
    }
}
