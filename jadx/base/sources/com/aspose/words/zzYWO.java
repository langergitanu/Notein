package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYWO extends zzYJF {
    private static int[] zzXVY = {30, 40, StyleIdentifier.BIBLIOGRAPHY};
    private boolean zzXVZ;
    private Run zzXW0;
    private Run zzXW1;
    private Run zzXW2;
    private zzYOK zzXW3;
    private Paragraph zzXW4;
    private ArrayList<Run> zzXW5;
    private StringBuilder zzXW6;
    private StringBuilder zzXW7;
    private StringBuilder zzXW8;

    private zzYWO(Iterable<Node> iterable, Paragraph paragraph, Paragraph paragraph2, zzYOK zzyok) {
        super(iterable, paragraph);
        this.zzXW8 = new StringBuilder();
        this.zzXW7 = new StringBuilder();
        this.zzXW6 = new StringBuilder();
        this.zzXW5 = new ArrayList<>();
        this.zzXW4 = paragraph2;
        this.zzXW3 = zzyok;
    }

    private static boolean zzF(Node node, Node node2) {
        if (node.getParentNode() != node2.getParentNode()) {
            return node.getParentNode().getNodeType() == 28 || node2.getParentNode().getNodeType() == 28;
        }
        return false;
    }

    private boolean zzO(Run run) {
        Run run2 = this.zzXW1;
        if (run2 == run) {
            return false;
        }
        if (run2 != null) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzXW5, run2);
        }
        Run run3 = this.zzXW1;
        if (run3 != null && run != null && (run3.zzZYh().zzYdM() != run.zzZYh().zzYdM() || zzF(this.zzXW1, run))) {
            zzY(this.zzXW3.zzZYh(), true);
        }
        this.zzXW1 = run;
        return true;
    }

    private static void zzX(Table table, Table table2) throws Exception {
        table.zzZYf().clear();
        ((zzY6G) zzZ(table2.zzZYf(), true)).zzZ(table.zzZYf());
        Iterator itZzYAP = table2.getRows().zzYAP();
        Row row = null;
        for (Row row2 : table.getRows()) {
            if (itZzYAP.hasNext()) {
                row = (Row) itZzYAP.next();
            } else if (row == null) {
                return;
            }
            zzY(row2, row);
        }
    }

    private static void zzY(Row row, Row row2) throws Exception {
        row.zzZ((zzY6G) zzZ(row2.zzZYf(), true));
        Iterator itZzYAP = row.getCells().zzYAP();
        Iterator itZzYAP2 = row2.getCells().zzYAP();
        while (itZzYAP.hasNext() && itZzYAP2.hasNext()) {
            zzY((Cell) itZzYAP.next(), (Cell) itZzYAP2.next());
        }
    }

    private void zzYBg() {
        if (this.zzXVZ) {
            zzYBk();
            this.zzXVZ = false;
        }
    }

    private void zzYBh() {
        if (this.zzXVZ) {
            return;
        }
        zzYBn();
        this.zzXVZ = true;
    }

    private void zzYBi() {
        Iterator<Run> it = this.zzXW5.iterator();
        while (it.hasNext()) {
            it.next().remove();
        }
    }

    private void zzYBj() {
        this.zzXW8.setLength(0);
    }

    private void zzYBk() {
        if (zzYlC()) {
            zzYa(zzYrK().getText().charAt(zzYlD()));
        }
    }

    private void zzYBl() {
        Run run = this.zzXW1;
        if (run == null) {
            return;
        }
        String text = run.getText();
        int iZzYlD = zzYlD();
        run.setText(C22241OooO0Oo.OooO00o(this.zzXW1.getText().length(), zzYlD(), zzYlD(), iZzYlD, text));
    }

    private void zzYBm() {
        Run run = this.zzXW2;
        if (run == null) {
            return;
        }
        run.setText(this.zzXW6.toString());
        this.zzXW6.setLength(0);
    }

    private void zzYBn() {
        if (!zzO(this.zzXW0)) {
            zzYBl();
        }
        this.zzXW1 = null;
        this.zzXW0 = null;
        zzYBm();
        this.zzXW2 = null;
        zzYBj();
        this.zzXW7.setLength(0);
    }

    private boolean zzYBo() throws Exception {
        if (!this.zzXW3.moveNext() || !moveNext()) {
            return false;
        }
        if (!this.zzXW3.zzYlF() && !zzYlF()) {
            return true;
        }
        zzZo(this.zzXW3.getLastParagraph() != null ? this.zzXW3.getLastParagraph() : this.zzXW3.getCurrentParagraph());
        zzYBh();
        return zzZ(this.zzXW3) && zzZ(this);
    }

    private void zzYa(char c) {
        this.zzXW7.append(c);
        this.zzXW0 = zzYrK();
    }

    public static void zzZ(Iterable<Node> iterable, Paragraph paragraph, Paragraph paragraph2, zzYOK zzyok, Paragraph paragraph3) throws Exception {
        new zzYWO(iterable, paragraph, paragraph2, zzyok).zzZp(paragraph3);
    }

    private void zzZo(Paragraph paragraph) {
        if (getLastParagraph() == null) {
            return;
        }
        zzZ(getLastParagraph(), paragraph != null ? paragraph.zzZYj() : null, this.zzXW3.zzZYh());
    }

    private void zzZp(Paragraph paragraph) throws Exception {
        while (zzYBo()) {
            if (zzYlG()) {
                zzZo(this.zzXW3.zzYlG() ? this.zzXW3.getLastParagraph() : this.zzXW3.getCurrentParagraph());
                zzYBg();
                this.zzXW3.zzYrH();
            } else if (zzYlF()) {
                zzX(zzYlz(), this.zzXW3.zzYlz());
            } else if (!this.zzXVZ) {
                zzY(this.zzXW3.zzZYh(), false);
                if (this.zzXW3.zzYlG()) {
                    zzYBh();
                    this.zzXW3.suspend();
                }
            }
        }
        zzYBn();
        zzYBi();
        if (paragraph != null) {
            zzZ(this.zzXW4, paragraph.zzZYj(), paragraph.zzYp5());
        }
        if (getCurrentParagraph() == null || getCurrentParagraph() == this.zzXW4 || this.zzXW3.getCurrentParagraph() == null) {
            return;
        }
        zzZ(getCurrentParagraph(), this.zzXW3.getCurrentParagraph().zzZYj(), (zzYEF) null);
    }

    @Override // com.aspose.words.zzYJF
    public final boolean isSuspended() {
        return false;
    }

    @Override // com.aspose.words.zzYJF
    public final void zzYBe() {
        if (this.zzXVZ) {
            return;
        }
        zzO(this.zzXW0);
        this.zzXW0 = null;
        zzYBj();
        StringBuilder sb = this.zzXW8;
        this.zzXW8 = this.zzXW7;
        this.zzXW7 = sb;
    }

    @Override // com.aspose.words.zzYJF
    public final void zzYBf() {
        if (this.zzXVZ) {
            return;
        }
        zzY(this.zzXW3.zzZYh(), true);
    }

    @Override // com.aspose.words.zzYJF
    public final void zzYb(char c) {
        if (this.zzXVZ) {
            return;
        }
        zzYa(c);
    }

    @Override // com.aspose.words.zzYJF
    public final void zzYc(char c) {
        if (this.zzXVZ) {
            return;
        }
        zzO(zzYrK());
        this.zzXW8.append(c);
    }

    private static boolean zzZ(zzYJF zzyjf) throws Exception {
        if (zzyjf.isSuspended()) {
            return zzyjf.zzYlF();
        }
        while (!zzyjf.zzYlF()) {
            if (!zzyjf.moveNext()) {
                return false;
            }
        }
        return true;
    }

    private static zzYEF zzZ(zzYEF zzyef, zzYEF zzyef2, boolean z) {
        zzYEF zzyef3 = (zzYEF) zzZ(zzyef, z);
        zzyef2.zzX(zzyef3, StyleIdentifier.BIBLIOGRAPHY);
        return zzyef3;
    }

    private static void zzZ(Paragraph paragraph, zzYMX zzymx, zzYEF zzyef) {
        if (zzymx != null) {
            paragraph.zzZ((zzYMX) zzZ(zzymx, false));
        }
        if (zzyef != null) {
            paragraph.zzC(zzZ(zzyef, paragraph.zzYp5(), false));
        }
    }

    private static void zzY(Cell cell, Cell cell2) throws Exception {
        cell.zzZ((zzWP) zzZ(cell2.zz6G(), true));
        zzZ(new zzYWB(cell.getFirstParagraph(), cell.getLastParagraph()), cell.getFirstParagraph(), cell.getLastParagraph(), new zzYOK(new zzYWB(cell2.getFirstParagraph(), cell2.getLastParagraph()), cell2.getFirstParagraph()), cell.getFirstParagraph() != cell.getLastParagraph() ? cell2.getLastParagraph() : null);
    }

    private static <T extends WordAttrCollection> T zzZ(T t, boolean z) {
        T t2 = (T) t.zzbn();
        if (z) {
            t2.remove(12);
            t2.remove(14);
            t2.zzYpN();
        }
        return t2;
    }

    private void zzY(zzYEF zzyef, boolean z) {
        Run run = this.zzXW2;
        if (run == null || !run.zzZYh().zzW(zzyef, zzXVY) || zzF(this.zzXW2, this.zzXW1)) {
            zzYBm();
            if (this.zzXW8.length() == 0) {
                this.zzXW2 = null;
                return;
            }
            Run run2 = new Run(this.zzXW1.getDocument(), "", zzZ(zzyef, this.zzXW1.zzZYh(), true));
            this.zzXW2 = run2;
            this.zzXW1.zzYC(run2);
            if (this.zzXW1.getParentNode().getNodeType() == 28) {
                StructuredDocumentTag structuredDocumentTag = (StructuredDocumentTag) this.zzXW1.getParentNode();
                structuredDocumentTag.zzr(zzZ(zzyef, structuredDocumentTag.zzY3J(), true));
            }
        }
        if (this.zzXW8.length() != 0) {
            com.aspose.words.internal.zzZNH.zzZ(this.zzXW6, this.zzXW8);
            zzYBj();
        }
        if (z || zzYlB()) {
            zzYBm();
            this.zzXW2 = null;
        }
    }
}
