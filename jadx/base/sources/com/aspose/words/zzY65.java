package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzY65 implements com.aspose.words.internal.zzFH {
    private static String zzX43 = Character.toString(65535);
    private com.aspose.words.internal.zzZWX zzLL;
    private boolean zzPx;
    private com.aspose.words.internal.zzFJ zzX44;
    private int zzX45;
    private Row zzX46;
    private Row zzX47;
    private Node zzX48;
    private int zzX49;
    private String zzX4a;
    private Node zzX4b;
    private int zzX4c;
    private boolean zzX4d;
    private Node zzXBb;
    private boolean zzXCf;
    private zzZRO zzXV1;
    private boolean zzYBg;
    private Document zzZEY;

    public static class zzW extends zzX {
        public zzW(zzY65 zzy65, Node node) {
            super(zzy65, node);
        }

        @Override // com.aspose.words.zzY65.zzX
        public final int zzXWe() {
            return zzXWc();
        }

        @Override // com.aspose.words.zzY65.zzX
        public final boolean zzXWf() {
            return zzXWc() != 0;
        }

        @Override // com.aspose.words.zzY65.zzX
        public final void zzx(Run run) {
            zzw(run);
            zzjN(0);
        }
    }

    public static abstract class zzX implements com.aspose.words.internal.zzFV {
        private int zzX3Z;
        private Paragraph zzX40;
        private Run zzX41;
        private zzY65 zzX42;

        public zzX(zzY65 zzy65, Node node) {
            Node node2 = node != null ? node : zzy65.zzXBb;
            if (node2.getNodeType() == 21) {
                zzYJK.zzX5(node2);
                Run run = (Run) node2;
                this.zzX41 = run;
                this.zzX40 = (Paragraph) run.getParentNode();
            } else if (node == null) {
                int unused = zzy65.zzX49;
            }
            this.zzX42 = zzy65;
            this.zzX3Z = node != null ? node.zz0R() : zzy65.zzX49;
        }

        private int getTextAlignment() {
            int alignment = this.zzX41.getParentParagraph().zzZYj().getAlignment();
            if (alignment == 0) {
                return 0;
            }
            int i = 1;
            if (alignment != 1) {
                i = 2;
                if (alignment != 2) {
                    return 3;
                }
            }
            return i;
        }

        @Override // com.aspose.words.internal.zzFV
        public final Object zzEX() {
            if (!zzXWg() && this.zzX41 == null) {
                return this.zzX40;
            }
            while (this.zzX3Z >= this.zzX41.getText().length()) {
                this.zzX3Z -= this.zzX41.getText().length();
                Run run = (Run) this.zzX41.getNextSibling();
                this.zzX41 = run;
                if (run == null) {
                    return this.zzX40;
                }
            }
            if (!zzXWf()) {
                return this.zzX41;
            }
            Run run2 = (Run) this.zzX41.deepClone(false);
            this.zzX40.insertAfter(run2, this.zzX41);
            run2.setText(this.zzX41.getText().substring(zzXWe()));
            Run run3 = this.zzX41;
            run3.setText(run3.getText().substring(0, zzXWe()));
            if (this.zzX42.zzXBb == this.zzX41 && this.zzX42.zzX49 >= zzXWe()) {
                this.zzX42.zzXBb = run2;
                this.zzX42.zzX4a = run2.getText();
                zzY65.zzZ(this.zzX42, this.zzX41.getText().length());
            }
            zzx(run2);
            return this.zzX41;
        }

        @Override // com.aspose.words.internal.zzFV
        public final com.aspose.words.internal.zzEN zzEY() {
            Shape shape = (Shape) zzYJK.zzX4(this.zzX41);
            com.aspose.words.internal.zzEN zzen = new com.aspose.words.internal.zzEN();
            if (shape.zzY9J().getFillType() == 0) {
                zzen.setFillColor(shape.getFillColor());
            }
            com.aspose.words.internal.zzZQ4 zzzq4ZzYzG = shape.zzYzG();
            zzen.zzk(zzzq4ZzYzG.getHeight());
            zzen.setWidth(zzzq4ZzYzG.getWidth());
            return zzen;
        }

        @Override // com.aspose.words.internal.zzFV
        public final com.aspose.words.internal.zzZWP zzEZ() {
            com.aspose.words.internal.zzZWP zzzwp = new com.aspose.words.internal.zzZWP();
            zzzwp.setAlignment(getTextAlignment());
            zzzwp.zzI(this.zzX41.getFont().getColor());
            zzzwp.setFontName(this.zzX41.getFont().getName());
            zzzwp.setFontSize((float) this.zzX41.getFont().getSize());
            zzzwp.zzJ(this.zzX41.getFont().zzza());
            return zzzwp;
        }

        public final int zzXWc() {
            return this.zzX3Z;
        }

        public final Run zzXWd() {
            return this.zzX41;
        }

        public abstract int zzXWe();

        public abstract boolean zzXWf();

        public boolean zzXWg() {
            return true;
        }

        public final void zzY3(Paragraph paragraph) {
            this.zzX40 = paragraph;
        }

        public final void zzjN(int i) {
            this.zzX3Z = i;
        }

        public final void zzw(Run run) {
            this.zzX41 = run;
        }

        public abstract void zzx(Run run);
    }

    public static class zzY extends zzX {
        public zzY(zzY65 zzy65) {
            super(zzy65, null);
        }

        @Override // com.aspose.words.zzY65.zzX
        public final int zzXWe() {
            return zzXWc() + 1;
        }

        @Override // com.aspose.words.zzY65.zzX
        public final boolean zzXWf() {
            return zzXWc() != zzXWd().getText().length() - 1;
        }

        @Override // com.aspose.words.zzY65.zzX
        public final void zzx(Run run) {
            zzjN(zzXWd().getText().length() - 1);
        }
    }

    public static class zzZ extends zzW {
        public zzZ(zzY65 zzy65, Node node) {
            super(zzy65, node);
            node = node == null ? zzy65.zzXBb : node;
            int nodeType = node.getNodeType();
            if (nodeType == 5) {
                zzY3((Paragraph) node.zzYB9());
                return;
            }
            if (nodeType != 21) {
                if (nodeType == 7) {
                    zzY3(((Cell) node).getLastParagraph());
                } else {
                    if (nodeType != 8) {
                        throw new IllegalStateException();
                    }
                    zzY3((Paragraph) node);
                }
            }
        }

        @Override // com.aspose.words.zzY65.zzX
        public final boolean zzXWg() {
            return false;
        }
    }

    public zzY65(Document document, zzZRO zzzro, boolean z, boolean z2) {
        this.zzZEY = document;
        this.zzXV1 = zzzro;
        this.zzXCf = z;
        this.zzX4d = z2;
    }

    private Node zzF(CompositeNode compositeNode) {
        return (this.zzXCf || compositeNode.getNodeType() != 2) ? compositeNode.getFirstChild() : ((Section) compositeNode).getBody();
    }

    private void zzWh(Node node) {
        zzn(node, false);
        this.zzX4b = node.getParentNode();
    }

    private Node zzWi(Node node) {
        if (!this.zzXCf && node.getNodeType() == 3 && node.getParentNode().getFirstChild() != node) {
            return node.getParentNode().getFirstChild();
        }
        Node nextSibling = node.getNextSibling();
        return (this.zzXCf || nextSibling == null || nextSibling.getNodeType() != 3) ? nextSibling : nextSibling.getNextSibling();
    }

    private Node zzWj(Node node) {
        if (zzXWk() && zzXWh().zzTl() == node) {
            node.getNodeType();
            Row parentRow = ((Cell) node).getParentRow();
            parentRow.getRowIndex();
            Cell cellZzf = zzf(parentRow.getNextRow());
            if (cellZzf != null) {
                return cellZzf;
            }
        }
        return node;
    }

    private com.aspose.words.internal.zzT0 zzXWh() {
        return this.zzLL.zzoH().zzYN(this.zzX45);
    }

    private boolean zzXWi() {
        return zzXWk() && zzYJK.zzZ(this.zzXBb, this.zzX47.getParentTable()) && ((Cell) this.zzXBb).getParentRow() == this.zzX46;
    }

    private boolean zzXWj() {
        if (zzXWk() && zzYJK.zzZ(this.zzXBb, this.zzX47.getParentTable())) {
            Cell cell = (Cell) this.zzXBb;
            if (cell.getNextCell() == null) {
                return true;
            }
            if (zzXWh().zzTm() == (zzWI.zzV(cell) + zzWI.zzW(cell)) - 1) {
                return true;
            }
        }
        return false;
    }

    private boolean zzXWk() {
        return this.zzLL != null;
    }

    private void zzXWl() {
        Node node;
        int i = this.zzX45 + 1;
        this.zzX45 = i;
        if (i < this.zzLL.zzoH().getCount()) {
            Node nodeZzf = zzf(this.zzX47);
            if (nodeZzf != null && (node = this.zzX48) != null && node.zzYF(nodeZzf)) {
                nodeZzf = this.zzX48;
                this.zzX48 = null;
            }
            if (nodeZzf != null) {
                zzWh(nodeZzf);
                return;
            }
        }
        this.zzX44.zzEH();
        Row row = this.zzX46;
        this.zzX4b = row;
        zzn(row, true);
        this.zzLL = null;
        this.zzX47 = null;
        this.zzX46 = null;
        this.zzX45 = 0;
        this.zzX44 = null;
    }

    private void zzXWm() {
        if (this.zzXBb == zzXWh().zzTl()) {
            zzXWl();
            return;
        }
        if (zzXWi()) {
            if (zzXWh().zzTl() != null) {
                zzWh((Cell) zzXWh().zzTl());
                return;
            } else {
                zzXWl();
                return;
            }
        }
        Row row = (Row) this.zzXBb.getAncestor(6);
        row.getNextRow();
        Cell cellZzf = zzf(row.getNextRow());
        if (cellZzf != null) {
            zzWh(cellZzf);
        } else {
            zzXWl();
        }
    }

    private void zzXWn() {
        if (this.zzX4d) {
            switch (this.zzXBb.getNodeType()) {
                case 22:
                    if (this.zzYBg) {
                        this.zzX4c++;
                    }
                    break;
                case 23:
                    if (!this.zzYBg) {
                        this.zzYBg = true;
                        this.zzX4c = 0;
                    }
                    break;
                case 24:
                    if (this.zzYBg) {
                        int i = this.zzX4c;
                        if (i != 0) {
                            this.zzX4c = i - 1;
                        } else {
                            this.zzYBg = false;
                        }
                    }
                    break;
            }
        }
    }

    private boolean zzXWo() {
        if (this.zzXBb.getNodeType() != 21) {
            return false;
        }
        return zzYJK.zzX5(this.zzXBb);
    }

    private boolean zzYAu() {
        if (this.zzXBb.isComposite()) {
            Node node = this.zzXBb;
            if (node != this.zzX4b) {
                this.zzX4b = node;
                CompositeNode compositeNode = (CompositeNode) node;
                if (compositeNode.hasChildNodes()) {
                    zzn(zzF(compositeNode), false);
                    return true;
                }
                zzn(compositeNode, true);
                return true;
            }
            Node nodeZze = this.zzXV1.zze(node);
            if (nodeZze != null) {
                this.zzX4b = nodeZze.getParentNode();
                zzn(nodeZze, false);
                return true;
            }
            if (zzXWj()) {
                zzXWm();
                return true;
            }
            this.zzX4b = this.zzX4b.getParentNode();
        }
        Node nodeZzb = zzZRO.zzb(this.zzXBb);
        if (nodeZzb != null) {
            this.zzXBb = nodeZzb;
            this.zzX4b = nodeZzb.getParentNode();
        }
        Node nodeZzWi = zzWi(this.zzXBb);
        if (nodeZzWi != null) {
            zzn(zzWj(nodeZzWi), false);
            return true;
        }
        Node parentNode = this.zzXBb.getParentNode();
        if (parentNode == null) {
            return false;
        }
        zzn(parentNode, true);
        return true;
    }

    public static /* synthetic */ int zzZ(zzY65 zzy65, int i) {
        int i2 = zzy65.zzX49 - i;
        zzy65.zzX49 = i2;
        return i2;
    }

    private Cell zzf(Row row) {
        while (true) {
            Cell cellZzY = zzWI.zzY(row, zzXWh().zzTn());
            if (cellZzY != null) {
                return cellZzY;
            }
            if (row == this.zzX46) {
                return null;
            }
            row = row.getNextRow();
        }
    }

    private static String zzm(Node node, boolean z) {
        int nodeType = node.getNodeType();
        return nodeType != 8 ? nodeType != 21 ? !zzYVU.zztq(node.getNodeType()) ? zzX43 : "" : node.getText() : z ? ControlChar.PARAGRAPH_BREAK : "";
    }

    private void zzn(Node node, boolean z) {
        this.zzXBb = node;
        this.zzX4a = zzm(node, z);
        this.zzX49 = -1;
    }

    @Override // com.aspose.words.internal.zzHE
    public final boolean moveNext() {
        if (this.zzPx) {
            return false;
        }
        if (this.zzXBb == null) {
            zzn(this.zzZEY, false);
        }
        while (true) {
            if (this.zzX49 + 1 < this.zzX4a.length() && (!this.zzX4d || !this.zzYBg)) {
                break;
            }
            if (!zzYAu()) {
                this.zzPx = true;
                return false;
            }
            zzXWn();
        }
        this.zzX49++;
        return true;
    }

    @Override // com.aspose.words.internal.zzFH
    public final boolean zzEA() {
        return zzZRO.zz5(this.zzXBb) != null;
    }

    @Override // com.aspose.words.internal.zzFH
    public final boolean zzEB() {
        return zzZRO.zz7(this.zzXBb) != null;
    }

    @Override // com.aspose.words.internal.zzFH
    public final boolean zzEC() {
        return zzZRO.zz6(this.zzXBb) != null;
    }

    @Override // com.aspose.words.internal.zzFH
    public final boolean zzED() {
        return zzYJK.zzX4(this.zzXBb) != null;
    }

    @Override // com.aspose.words.internal.zzFH
    public final boolean zzEE() {
        return zzYJK.zzX3(this.zzXBb);
    }

    @Override // com.aspose.words.internal.zzFH
    public final com.aspose.words.internal.zzFV zzEF() {
        if (zzXWo()) {
            return new zzY(this);
        }
        return null;
    }

    @Override // com.aspose.words.internal.zzFH
    public final com.aspose.words.internal.zzFV zzEG() {
        if (zzXWo()) {
            return new zzW(this, null);
        }
        return null;
    }

    @Override // com.aspose.words.internal.zzFH
    public final boolean zzEq() {
        return zzZRO.zz1(this.zzXBb);
    }

    @Override // com.aspose.words.internal.zzFH
    public final boolean zzEr() {
        return zzZRO.zz2(this.zzXBb);
    }

    @Override // com.aspose.words.internal.zzFH
    public final Object zzEs() {
        return zzZRO.zz4(this.zzXBb);
    }

    @Override // com.aspose.words.internal.zzFH
    public final int zzEt() {
        ChartSeries chartSeriesZz5 = zzZRO.zz5(this.zzXBb);
        if (chartSeriesZz5 == null) {
            return -1;
        }
        return zzYJL.zzZ((Shape) zzZRO.zz4(this.zzXBb), chartSeriesZz5);
    }

    @Override // com.aspose.words.internal.zzFH
    public final int zzEu() {
        Node nodeZz4 = zzZRO.zz4(this.zzXBb);
        if (nodeZz4 == null) {
            return -1;
        }
        return zzYJL.zzZP((Shape) nodeZz4);
    }

    @Override // com.aspose.words.internal.zzFH
    public final String zzEv() {
        zzCU zzcuZz7 = zzZRO.zz7(this.zzXBb);
        if (zzcuZz7 != null) {
            return zzcuZz7.getText();
        }
        return null;
    }

    @Override // com.aspose.words.internal.zzFH
    public final boolean zzEw() {
        Node nodeZz4 = zzZRO.zz4(this.zzXBb);
        if (nodeZz4 == null) {
            return false;
        }
        Iterator<zzGK> it = zzYJL.zzZS((Shape) nodeZz4).iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            for (ChartSeries chartSeries : it.next().zzZPj()) {
                z = z || chartSeries.getSeriesType() == 37;
                z2 = z2 || chartSeries.getSeriesType() != 37;
            }
        }
        return z;
    }

    @Override // com.aspose.words.internal.zzFH
    public final boolean zzEx() {
        ChartSeries chartSeriesZz5 = zzZRO.zz5(this.zzXBb);
        return chartSeriesZz5 != null && chartSeriesZz5.zz2g();
    }

    @Override // com.aspose.words.internal.zzFH
    public final boolean zzEy() {
        ChartSeries chartSeriesZz5 = zzZRO.zz5(this.zzXBb);
        return chartSeriesZz5 != null && chartSeriesZz5.zz2i();
    }

    @Override // com.aspose.words.internal.zzFH
    public final boolean zzEz() {
        ChartSeries chartSeriesZz5 = zzZRO.zz5(this.zzXBb);
        return chartSeriesZz5 != null && chartSeriesZz5.zz2j();
    }

    @Override // com.aspose.words.internal.zzHE
    public final char zzFI() {
        char cCharAt = this.zzX4a.charAt(this.zzX49);
        if (com.aspose.words.internal.zzZYD.zzk(cCharAt)) {
            return '\"';
        }
        if (com.aspose.words.internal.zzZYD.zzi(cCharAt)) {
            return '-';
        }
        return cCharAt;
    }

    @Override // com.aspose.words.internal.zzFH
    public final com.aspose.words.internal.zzFV zzt(Object obj) {
        return new zzZ(this, (Node) obj);
    }

    @Override // com.aspose.words.internal.zzFH
    public final void zzZ(com.aspose.words.internal.zzZWX zzzwx, Object obj, com.aspose.words.internal.zzFJ zzfj) {
        this.zzLL = zzzwx;
        this.zzX45 = 0;
        this.zzX44 = zzfj;
        Table table = (Table) zzzwx.zzVv();
        Node node = (Node) obj;
        int iZzV = zzWI.zzV((Cell) node.getAncestor(7));
        com.aspose.words.internal.zzHB zzhbZzoH = zzzwx.zzoH();
        zzhbZzoH.zzYN(Math.min(1, zzhbZzoH.getCount() - 1));
        if (iZzV > zzhbZzoH.zzYN(0).zzTm() && zzzwx.zzoG() != zzzwx.zzoF()) {
            zzhbZzoH.zzYN(0);
            this.zzXBb = table.getRows().get(zzzwx.zzoG() + 1).getFirstCell();
            this.zzX48 = node;
        } else {
            this.zzXBb = node;
            this.zzX48 = null;
        }
        this.zzX47 = table.getRows().get(zzzwx.zzoG());
        this.zzX46 = table.getRows().get(zzzwx.zzoF());
        this.zzX4b = this.zzXBb.getParentNode();
        this.zzPx = false;
        zzn(this.zzXBb, false);
        moveNext();
    }
}
