package com.aspose.words;

import com.google.mlkit.p567nl.translate.TranslateLanguage;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ1P {
    private Cell zzY39;
    private Cell zzY3a;
    private zzZ1M zzY4a;
    private Table zzZzY;
    private ArrayList<zzZ1V> zzZ9n = new ArrayList<>();
    private int zzY38 = -1;

    public zzZ1P(Table table, zzZ1M zzz1m) {
        this.zzY4a = zzz1m;
        this.zzZzY = table;
    }

    private Row getFirstRow() {
        Cell cell = this.zzY39;
        return cell == null ? this.zzZzY.getFirstRow() : cell.getParentRow();
    }

    private String getParagraphBreak() {
        return this.zzY4a.zzYHF().getParagraphBreak();
    }

    private static int zzG(Cell cell) {
        int columnIndex = cell.getColumnIndex();
        int i = 1;
        for (Row nextRow = cell.getParentRow().getNextRow(); nextRow != null && nextRow.getCells().get(columnIndex) != null && nextRow.getCells().get(columnIndex).zz6G().getVerticalMerge() == 2; nextRow = nextRow.getNextRow()) {
            i++;
        }
        return i;
    }

    private static int zzH(Cell cell) {
        if (cell.zz6G().get(3900) != null) {
            return ((Integer) cell.zz6G().get(3900)).intValue();
        }
        int i = 1;
        for (Cell nextCell = cell.getNextCell(); nextCell != null && nextCell.zz6G().getHorizontalMerge() == 2; nextCell = nextCell.getNextCell()) {
            i++;
        }
        return i;
    }

    private void zzM(Row row) {
        this.zzY4a.zzZeE().append('|');
        int i = 0;
        while (i < zzYHI()) {
            this.zzY4a.zzZeE().append(ControlChar.SPACE_CHAR);
            int iZzZu = (i >= row.getCells().getCount() || row.getCells().get(i).getFirstParagraph() == null) ? 0 : zzZu(row.getCells().get(i).getFirstParagraph());
            if (iZzZu == 0 || iZzZu == 1) {
                this.zzY4a.zzZeE().append(':');
            }
            this.zzY4a.zzZeE().append('-');
            if (iZzZu == 2 || iZzZu == 1) {
                this.zzY4a.zzZeE().append(':');
            }
            this.zzY4a.zzZeE().append(ControlChar.SPACE_CHAR);
            this.zzY4a.zzZeE().append('|');
            i++;
        }
    }

    private Cell zzYHH() {
        Cell cell = this.zzY3a;
        return cell == null ? getFirstRow().getFirstCell() : cell;
    }

    private int zzYHI() {
        if (this.zzY38 == -1) {
            com.aspose.words.internal.zzDB zzdb = (com.aspose.words.internal.zzDB) this.zzZzY.zzZYf().get(5103);
            if (zzdb != null) {
                this.zzY38 = zzdb.getCount();
            } else if (getFirstRow() != null) {
                this.zzY38 = getFirstRow().getCells().getCount();
            }
            if (this.zzY38 < 0) {
                this.zzY38 = 0;
            }
        }
        return this.zzY38;
    }

    private boolean zzYHJ() {
        Iterator<T> it = this.zzZzY.getRows().iterator();
        while (it.hasNext()) {
            Iterator<T> it2 = ((Row) it.next()).getCells().iterator();
            while (it2.hasNext()) {
                if (((Cell) it2.next()).zz6G().zz5B()) {
                    return true;
                }
            }
        }
        return false;
    }

    private String zzYHK() {
        if (this.zzY3a.zz6G().getVerticalAlignment() == 1) {
            return "";
        }
        return com.aspose.words.internal.zzZKN.format(" valign=\"{0}\"", this.zzY3a.zz6G().getVerticalAlignment() == 0 ? "top" : "bottom");
    }

    private void zzYHL() throws Exception {
        for (zzZ1V zzz1v : this.zzZ9n) {
            if (this.zzZ9n.size() > 1) {
                com.aspose.words.internal.zzZNH.zzU(this.zzY4a.zzZeE(), "<p>");
            }
            zzz1v.zzIg();
            if (this.zzZ9n.size() > 1) {
                com.aspose.words.internal.zzZNH.zzU(this.zzY4a.zzZeE(), "</p>");
            }
        }
        this.zzZ9n.clear();
    }

    private int zzZu(Paragraph paragraph) {
        int tableContentAlignment = this.zzY4a.zzYHF().getTableContentAlignment();
        if (tableContentAlignment == 1) {
            return 0;
        }
        if (tableContentAlignment == 2) {
            return 1;
        }
        if (tableContentAlignment != 3) {
            return paragraph.zzZYj().getAlignment();
        }
        return 2;
    }

    public final void zzI(Cell cell) throws Exception {
        zzYHL();
        if (!this.zzY4a.zzYHC() || cell.zz6G().zz5B()) {
            return;
        }
        com.aspose.words.internal.zzZNH.zzZ(this.zzY4a.zzZeE(), "</{0}>", cell.getParentRow() == getFirstRow() ? TranslateLanguage.THAI : "td");
    }

    public final void zzJ(Cell cell) {
        this.zzY3a = cell;
        if (!this.zzY4a.zzYHC()) {
            this.zzY4a.zzZeE().append('|');
        } else {
            if (cell.zz6G().zz5B()) {
                return;
            }
            com.aspose.words.internal.zzZNH.zzU(this.zzY4a.zzZeE(), com.aspose.words.internal.zzZKN.format("<{0}{1}{2}{3}>", cell.getParentRow() == getFirstRow() ? TranslateLanguage.THAI : "td", (cell.zz6G().getHorizontalMerge() == 1 || cell.zz6G().get(3900) != null) ? com.aspose.words.internal.zzZKN.format(" colspan=\"{0}\"", Integer.valueOf(zzH(cell))) : "", cell.zz6G().getVerticalMerge() == 1 ? com.aspose.words.internal.zzZKN.format(" rowspan=\"{0}\"", Integer.valueOf(zzG(cell))) : "", zzYHK()));
        }
    }

    public final void zzN(Row row) {
        if (this.zzY4a.zzYHC()) {
            com.aspose.words.internal.zzZNH.zzU(this.zzY4a.zzZeE(), "</tr>");
            com.aspose.words.internal.zzZNH.zzU(this.zzY4a.zzZeE(), getParagraphBreak());
            return;
        }
        com.aspose.words.internal.zzZNH.zzZ(this.zzY4a.zzZeE(), '|', Math.max(1, zzYHI() - zzYHH().getColumnIndex()));
        com.aspose.words.internal.zzZNH.zzU(this.zzY4a.zzZeE(), getParagraphBreak());
        if (row == getFirstRow()) {
            zzM(row);
            com.aspose.words.internal.zzZNH.zzU(this.zzY4a.zzZeE(), getParagraphBreak());
        }
    }

    public final void zzYHM() {
        if (this.zzY4a.zzYHC()) {
            com.aspose.words.internal.zzZNH.zzU(this.zzY4a.zzZeE(), "<tr>");
        }
    }

    public final void zzYHN() throws Exception {
        com.aspose.words.internal.zzZNH.zzU(this.zzY4a.zzZeE(), getParagraphBreak());
        com.aspose.words.internal.zzZNH.zzZ(this.zzY4a.zzZeE(), '|', this.zzY39.getColumnIndex() + 1);
        zzYHL();
    }

    public final void zzYHO() {
        if (this.zzY4a.zzYHC()) {
            com.aspose.words.internal.zzZNH.zzU(this.zzY4a.zzZeE(), "</table>");
            com.aspose.words.internal.zzZNH.zzU(this.zzY4a.zzZeE(), getParagraphBreak());
        }
    }

    public final void zzYHP() {
        Paragraph paragraph;
        if (!this.zzZzY.zz9I() && (paragraph = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(this.zzZzY.getPreviousSibling(), Paragraph.class)) != null && paragraph.hasChildNodes()) {
            com.aspose.words.internal.zzZNH.zzU(this.zzY4a.zzZeE(), getParagraphBreak());
        }
        if (this.zzY4a.zzYHC()) {
            com.aspose.words.internal.zzZNH.zzU(this.zzY4a.zzZeE(), "<table>");
        }
    }

    public final boolean zzYIo() {
        return zzYHJ() && !(this.zzZzY.getChild(5, 0, true) != null);
    }

    public final void zzZ(zzZ1V zzz1v) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzZ9n, zzz1v);
    }

    public final zzZ1P zzr(Table table) throws Exception {
        zzYHL();
        com.aspose.words.internal.zzZNH.zzZ(this.zzY4a.zzZeE(), '|', Math.max(0, zzYHI() - zzYHH().getColumnIndex()));
        com.aspose.words.internal.zzZNH.zzU(this.zzY4a.zzZeE(), getParagraphBreak());
        if (zzYHH().getParentRow() == getFirstRow()) {
            zzM(getFirstRow());
            com.aspose.words.internal.zzZNH.zzU(this.zzY4a.zzZeE(), getParagraphBreak());
        }
        com.aspose.words.internal.zzZNH.zzU(this.zzY4a.zzZeE(), getParagraphBreak());
        this.zzY39 = zzYHH();
        return new zzZ1P(table, this.zzY4a);
    }
}
