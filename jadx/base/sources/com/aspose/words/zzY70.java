package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY70 {
    private Row zzX6S;
    private Table zzX6T;
    private int zzX6U;
    private DocumentBuilder zzZwh;

    public zzY70(DocumentBuilder documentBuilder) {
        if (documentBuilder == null) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: builder");
        }
        this.zzZwh = documentBuilder;
    }

    public final Row endRow() {
        if (this.zzX6U == 3) {
            zzXZT();
        }
        if (this.zzX6U != 2) {
            throw new IllegalStateException("Cannot end a row in this state.");
        }
        this.zzX6U = 1;
        Row row = this.zzX6S;
        this.zzX6S = null;
        return row;
    }

    public final Table endTable() {
        if (this.zzX6U == 3) {
            zzXZT();
        }
        if (this.zzX6U == 2) {
            endRow();
        }
        if (this.zzX6U != 1) {
            throw new IllegalStateException("Cannot end a table in this state.");
        }
        this.zzZwh.zzZ((Paragraph) this.zzX6T.zzYB5(), 0);
        this.zzZwh.getCellFormat().setVerticalMerge(0);
        this.zzZwh.getCellFormat().setHorizontalMerge(0);
        this.zzX6U = 0;
        Table table = this.zzX6T;
        this.zzX6T = null;
        return table;
    }

    public final Table startTable() {
        if (this.zzX6U != 0) {
            throw new IllegalStateException("Cannot start a table in this state.");
        }
        if (!this.zzZwh.isAtStartOfParagraph()) {
            this.zzZwh.insertParagraph();
        }
        Table table = new Table(this.zzZwh.getDocument());
        this.zzX6T = table;
        this.zzZwh.zzv(table);
        this.zzX6U = 1;
        return this.zzX6T;
    }

    public final int zzXZS() {
        return this.zzX6U;
    }

    public final void zzXZT() {
        if (this.zzX6U != 3) {
            throw new IllegalStateException("Cannot end a cell in this state.");
        }
        this.zzX6U = 2;
        this.zzZwh.zzZpB();
    }

    public final Cell zzXZU() {
        if (this.zzX6U != 2) {
            throw new IllegalStateException("Cannot start a cell in this state.");
        }
        Cell cell = new Cell(this.zzZwh.getDocument(), this.zzZwh.zzZpD());
        this.zzX6S.appendChild(cell);
        Paragraph paragraph = new Paragraph(this.zzZwh.getDocument(), this.zzZwh.zzZpF(), this.zzZwh.zzZpG());
        cell.appendChild(paragraph);
        this.zzZwh.zzZ(paragraph, 0);
        this.zzX6U = 3;
        return cell;
    }

    public final Row zzXZV() {
        zzY6G zzy6gZzZpE;
        if (this.zzX6U != 1) {
            throw new IllegalStateException("Cannot start a row in this state.");
        }
        Row lastRow = this.zzX6T.getLastRow();
        if (lastRow != null) {
            zzy6gZzZpE = (zzY6G) lastRow.zzZYf().zzbn();
            this.zzZwh.zzZpE().zzY(zzy6gZzZpE);
        } else {
            zzy6gZzZpE = this.zzZwh.zzZpE();
        }
        Row row = new Row(this.zzZwh.getDocument(), zzy6gZzZpE);
        this.zzX6S = row;
        this.zzX6T.appendChild(row);
        this.zzX6U = 2;
        return this.zzX6S;
    }
}
