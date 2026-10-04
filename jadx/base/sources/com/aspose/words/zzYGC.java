package com.aspose.words;

import androidx.appcompat.view.menu.C21505OooO0Oo;
import com.huawei.hms.network.embedded.C18241k5;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYGC {
    private int zzXur;
    private int zzXus;
    private zzY6G zzXuv;
    private boolean zzXuw;
    private zzYFT zzXwE;
    private static zzYEF zzXux = new zzYEF();
    private static ArrayList<Integer> zzXup = com.aspose.words.internal.zzZQG.zzQ(80, 128, 134, 136);
    private static char[] zzXuo = {ControlChar.PARAGRAPH_BREAK_CHAR, '\n'};
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("Times New Roman", "Cambria", "Century", "Courier");
    ArrayList<Comment> zzXuy = new ArrayList<>();
    private com.aspose.words.internal.zzZQC<CompositeNode> zzeU = new com.aspose.words.internal.zzZQC<>();
    private com.aspose.words.internal.zzZQC<zzZ> zzYR5 = new com.aspose.words.internal.zzZQC<>();
    private ArrayList<Node> zzXuu = new ArrayList<>();
    private ArrayList<zzY> zzXut = new ArrayList<>();
    private com.aspose.words.internal.zzZYV<zzZA1> zzXuq = new com.aspose.words.internal.zzZYV<>();

    public static class zzX {
        boolean zzXuh;
        boolean zzXui;

        public zzX(String str) {
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                boolean z = true;
                this.zzXui |= zzY0C.zzzG(cCharAt) == 1;
                boolean z2 = this.zzXuh;
                if (com.aspose.words.internal.zzZKV.zzZ(zzYGC.zzXuo, cCharAt, 0, zzYGC.zzXuo.length) < 0) {
                    z = false;
                }
                this.zzXuh = z2 | z;
            }
        }
    }

    public static class zzY {
        int zzXuj;
        int zzXuk;
        Run zzXul;

        public zzY(Run run, int i, int i2) {
            this.zzXul = run;
            this.zzXuk = i;
            this.zzXuj = i2;
        }
    }

    public static class zzZ {
        private boolean zzXum;
        private FieldChar zzXun;

        public zzZ(FieldChar fieldChar) {
            this.zzXun = fieldChar;
        }

        public final void zzYhc() {
            this.zzXum = true;
        }

        public final boolean zzYhd() {
            return this.zzXum;
        }

        public final FieldChar zzYhe() {
            return this.zzXun;
        }
    }

    public zzYGC(zzYFT zzyft) {
        this.zzXwE = zzyft;
        zzM(zzyft.getDocument());
        this.zzXus = 0;
    }

    private static Node zz7(Node node, Node node2) {
        if (node != null && node2 != null) {
            for (Node nextSibling = node.getNextSibling(); nextSibling != null && nextSibling != node2; nextSibling = nextSibling.getNextSibling()) {
                if (nextSibling.getNodeType() == 25) {
                    return nextSibling;
                }
            }
        }
        return null;
    }

    private static boolean zzCc(String str) {
        int iZzTP = zzUR.zzTP(str);
        return iZzTP == 0 || iZzTP == 1 || iZzTP == 2 || iZzTP == 3;
    }

    private String zzCd(String str) throws Exception {
        com.aspose.words.internal.zzZO0 zzzo0ZzQz = com.aspose.words.internal.zzZO0.zzQz(this.zzXwE.getCodePage());
        byte[] bytes = zzzo0ZzQz.getBytes(str);
        com.aspose.words.internal.zzZO0 zzzo0ZzS = com.aspose.words.internal.zzUU.zzS(new com.aspose.words.internal.zzZOR(bytes));
        return zzzo0ZzS.equals(com.aspose.words.internal.zzZO0.zzhV()) ? zzzo0ZzQz.zzZn(com.aspose.words.internal.zzZO0.zzZ(zzzo0ZzS, zzzo0ZzQz, bytes)) : str;
    }

    private static void zzF(Row row) {
        if (row.zzZYf().zz6D()) {
            zzZMK zzzmkZzYsN = row.zzZYf().zzYsN();
            zzWO zzwoZz5l = ((zzY6G) zzzmkZzYsN.zzZ6C()).zz5l();
            if (zzwoZz5l == null) {
                row.zzZYf().remove(10010);
                return;
            }
            int i = 0;
            for (Cell firstCell = row.getFirstCell(); firstCell != null; firstCell = firstCell.getNextCell()) {
                firstCell.zz6G().zzZ(new zzZMK(zzwoZz5l.zzOs(i), zzzmkZzYsN.getAuthor(), zzzmkZzYsN.zzZx()));
                i++;
            }
            if (i != zzwoZz5l.getCount()) {
                throw new IllegalStateException("Number of cells does not match the number of cells properties.");
            }
        }
    }

    private static void zzG(Row row) {
        zzWO zzwoZz5l = row.zzZYf().zz5l();
        Cell firstCell = row.getFirstCell();
        for (int i = 0; firstCell != null && i < zzwoZz5l.getCount(); i++) {
            zzZ(row.zzZYf(), zzwoZz5l.zzOs(i));
            firstCell.zzZ(zzwoZz5l.zzOs(i));
            zzq(firstCell);
            firstCell = firstCell.getNextCell();
        }
        if (firstCell != null) {
            zzYW0.zzn(firstCell, null);
        }
    }

    private void zzJ(zzY6G zzy6g) {
        zzZV8 zzzv8 = (zzZV8) zzYiL().zzZYh().get(12);
        if (zzzv8 != null) {
            zzy6g.zzQ(12, new zzZV8(1, zzzv8.getAuthor(), zzzv8.zzZx()));
        }
    }

    private FieldEnd zzM(FieldEnd fieldEnd) {
        return fieldEnd == null ? zzYhJ() : fieldEnd;
    }

    private static boolean zzN(CompositeNode compositeNode) {
        int nodeType = compositeNode.getNodeType();
        return nodeType == 8 || nodeType == 35 || nodeType == 27;
    }

    private void zzR(String str, zzYEF zzyef) {
        String[] strArrZzU = com.aspose.words.internal.zzZKN.zzU(str, zzXuo);
        for (int i = 0; i < strArrZzU.length; i++) {
            zzWI(new Run(this.zzXwE.getDocument(), strArrZzU[i], zzyef));
            if (i < strArrZzU.length - 1) {
                zzYhN();
            }
        }
    }

    private void zzS(String str, zzYEF zzyef) {
        if (!" ".equals(str) || zzYhg()) {
            zzWI(new Run(this.zzXwE.getDocument(), str, zzyef));
        } else {
            com.aspose.words.internal.zzZQG.zzZ(this.zzXut, new zzY(new Run(this.zzXwE.getDocument(), str, zzyef), getContainer().getNodeType(), zzYhP()));
        }
    }

    private void zzT(CompositeNode compositeNode) {
        getContainer().zzA(compositeNode);
        zzM(compositeNode);
    }

    private void zzWF(Node node) {
        if (!getContainer().zzT(node) || !zzN(getContainer())) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzXuu, node);
        } else {
            zzYhl();
            getContainer().zzA(node);
        }
    }

    private boolean zzWG(Node node) {
        return node instanceof zzZA1 ? zzN(getContainer()) : (node == null || !getContainer().zzT(node) || (getContainer() instanceof zzZMS)) ? false : true;
    }

    private void zzWH(Node node) {
        this.zzXwE.zzYhj().zznN(this.zzXwE.zzYgo().getCount());
        if (getContainer().getNodeType() == 5) {
            zzYhF();
        }
        if (zzWG(node)) {
            if (this.zzXwE.zzYhj().zzYfc()) {
                zzYhN();
                zzYhq();
                zzYhm();
                zzT(new Paragraph(this.zzXwE.getDocument()));
                return;
            }
            return;
        }
        if (!this.zzXwE.zzYhj().zzYff()) {
            if (getContainer().getNodeType() == 6) {
                zzYhm();
            } else if (getContainer().getNodeType() == 5) {
                zzYhp();
            }
        }
        if (this.zzXwE.zzYhj().zzYff()) {
            zzYhq();
            zzYhm();
        } else {
            zzYWP();
        }
        zzT(new Paragraph(this.zzXwE.getDocument()));
    }

    private void zzYWH() {
        if (getContainer().getNodeType() == 6 || getContainer().getNodeType() == 5) {
            zzYhm();
        } else {
            zzYWP();
        }
        zzT(new Table(this.zzXwE.getDocument()));
        if (this.zzXwE.zzYhj().zzZYf().getCount() > 0) {
            this.zzXuv = this.zzXwE.zzYhj().zzZYf();
        }
        this.zzXwE.zzYhj().zzYfi();
    }

    private void zzYWO() {
        if (getContainer().getNodeType() == 7) {
            zzYhh();
        }
        if (getContainer().getNodeType() == 6) {
            zzYhC();
        }
        if (this.zzXwE.zzYhj().zzYff() || getContainer().getNodeType() == 5) {
            zzYhp();
        } else {
            zzYhN();
        }
        if (getContainer().getNodeType() == 3) {
            zzZI();
        }
    }

    private void zzYWP() {
        this.zzXuw = false;
        zzYhs();
        if (getContainer().getNodeType() == 2) {
            zzT(new Body(this.zzXwE.getDocument()));
        }
    }

    public static void zzYWR() {
    }

    private void zzYhA() {
        Node nodeZzYB9;
        if (getContainer().getNodeType() == 6) {
            Row row = (Row) getContainer();
            Table parentTable = row.getParentTable();
            if (zzy(row) && parentTable.getFirstRow() == row && (nodeZzYB9 = parentTable.zzYB9()) != null && nodeZzYB9.getNodeType() == 5) {
                CompositeNode compositeNode = (Table) nodeZzYB9;
                compositeNode.zzY(compositeNode.getNextSibling(), parentTable, compositeNode.getLastChild());
                row.remove();
                zzZI();
                parentTable.remove();
                zzZI();
                zzM(compositeNode);
                zzT(row);
            }
        }
    }

    private void zzYhB() {
        zzWO zzwoZz5l = this.zzXwE.zzYhj().zzZYf().zz5l();
        int iZzYfl = this.zzXwE.zzYhj().zzYfl();
        int count = this.zzXwE.zzYgo().getCount();
        if (zzwoZz5l == null && iZzYfl > 0 && count > 0) {
            zzY6G zzy6gZznL = this.zzXwE.zzYhj().zznL(count - 1);
            if (zzy6gZznL.zz5l() != null && zzy6gZznL.zz5l().getCount() == iZzYfl) {
                zzwoZz5l = zzy6gZznL.zz5l();
            }
        }
        if (zzwoZz5l == null || zzwoZz5l.getCount() == 0) {
            return;
        }
        this.zzXwE.zzYhj().zzZYf().zzQ(5100, zzwoZz5l);
        while (this.zzXwE.zzYhj().zzYfl() > zzwoZz5l.getCount()) {
            zzwoZz5l.zzT(zzwoZz5l.zzOs(0).zzbn());
        }
    }

    private void zzYhD() {
        Table table;
        if (this.zzXwE.zzYhj().isLastRow() || this.zzXwE.zzYhj().zzYfd() || (table = (Table) com.aspose.words.internal.zzZKW.zzZ(this.zzeU.peek(), Table.class)) == null || table.getRows().getCount() <= 1 || table.getLastRow().getCells().getCount() != 1 || this.zzXwE.zzYhj().zzYfk() == table.getLastRow().getLastCell()) {
            return;
        }
        table.getParentNode().zzY(table.getLastRow().getLastCell().getFirstChild(), null, table);
        table.getLastRow().remove();
    }

    private boolean zzYhM() {
        return this.zzXwE.zzYgo().zzYiL().zzYiN().getType() == 91;
    }

    private int zzYhP() {
        return this.zzXwE.zzYgo().zzYiL().zzYiN().getType();
    }

    private boolean zzYhg() {
        return getContainer().getNodeType() == 8 || getContainer().getNodeType() == 27 || getContainer().getNodeType() == 35;
    }

    private void zzYhh() {
        if (getContainer().getNodeType() == 7) {
            if (this.zzXwE.zzYhj().isInCell()) {
                this.zzXwE.zzYhj().zzp((Cell) getContainer());
            }
            this.zzXwE.zzYhj().zzRh(false);
            zzZI();
            if (getContainer().getNodeType() == 6) {
                zzx((Row) getContainer());
            }
        }
    }

    private void zzYhk() {
        if (this.zzXut.size() == 0 || !zzYhg()) {
            return;
        }
        for (int size = this.zzXut.size(); size > 0; size--) {
            zzY zzy = (zzY) C21505OooO0Oo.OooO00o(size, this.zzXut);
            if (zzoD(zzy.zzXuj)) {
                getContainer().zzA(zzy.zzXul);
                this.zzXut.remove(zzy);
            }
        }
    }

    private void zzYhl() {
        if (this.zzXuu.size() == 0) {
            return;
        }
        Paragraph paragraph = getContainer().getNodeType() == 8 ? (Paragraph) getContainer() : (Paragraph) com.aspose.words.internal.zzZKW.zzZ(getContainer().zzZYq(), Paragraph.class);
        if (paragraph != null) {
            Iterator<Node> it = this.zzXuu.iterator();
            while (it.hasNext()) {
                paragraph.zzA(it.next());
            }
            this.zzXuu.clear();
        }
    }

    private void zzYhm() {
        if (getContainer().getNodeType() != 7) {
            zzYho();
            if (this.zzXur < 63) {
                zzT(new Cell(this.zzXwE.getDocument(), null));
                this.zzXur++;
            } else {
                zzM(((Row) getContainer()).getLastCell());
                this.zzXwE.zzT(1, "The number of cells in a row exceeds 63. The cell contents are merged with the last cell in the row.");
            }
        }
    }

    private void zzYhn() {
        Cell cell;
        if (getContainer().getNodeType() == 5 || this.zzXwE.zzYhj().zzZYf().zz5l() == null || (cell = (Cell) com.aspose.words.internal.zzZKW.zzZ(getContainer(), Cell.class)) == null) {
            return;
        }
        zzv(cell.getParentRow());
        while (getContainer().getNodeType() != 6) {
            zzZI();
        }
    }

    private void zzYho() {
        if (getContainer().getNodeType() != 6) {
            if (getContainer().getNodeType() != 5) {
                zzYhq();
            }
            zzT(new Row(this.zzXwE.getDocument(), null));
            this.zzXur = 0;
        }
    }

    private void zzYhp() {
        while (true) {
            if (getContainer().getAncestor(5) == null && getContainer().getNodeType() != 5) {
                return;
            }
            int nodeType = getContainer().getNodeType();
            if (nodeType == 5) {
                zzYhE();
            } else if (nodeType == 6) {
                zzYhC();
            } else if (nodeType == 7) {
                zzYhy();
            } else {
                if (nodeType != 8) {
                    throw new IllegalStateException(com.aspose.words.internal.zzZKN.format("Unexpected container type: {0}", Integer.valueOf(getContainer().getNodeType())));
                }
                zzYhN();
            }
        }
    }

    private boolean zzYhr() {
        if (getContainer().getNodeType() == 6 && !this.zzXwE.zzYhj().zzYfe()) {
            return this.zzXwE.zzYhj().zzZYf().zz5l() != null && ((Row) getContainer()).getChildNodes(0, false).getCount() == this.zzXwE.zzYhj().zzZYf().zz5l().getCount();
        }
        return false;
    }

    private void zzYhs() {
        if (getContainer().getNodeType() == 1) {
            zzT(new Section(this.zzXwE.getDocument(), (zzYCZ) zzYiL().zzYvR().zzbn()));
        }
    }

    private void zzYhv() {
        Body body = (Body) getContainer();
        zzZ((body.zzZYq() == null || body.zzZYq().getNodeType() != 5) ? null : (Table) body.zzZYq(), new Paragraph(this.zzXwE.getDocument()));
    }

    private void zzYhz() {
        if (getContainer().getNodeType() == 8) {
            if (getContainer().getParentNode().getNodeType() == 7) {
                zzYhx();
            }
        } else if (getContainer().getNodeType() == 5) {
            this.zzXwE.zzYhj().zznM(this.zzXwE.zzYhj().zzYf9());
        }
    }

    private zzYH3 zzYiL() {
        return this.zzXwE.zzYgo().zzYiL();
    }

    private void zzZI() {
        zzYhl();
        this.zzeU.pop();
    }

    public static void zza(Table table) {
        if (table.getFirstRow() != null) {
            table.getFirstRow().zzZYf().zzQ(5112, Boolean.TRUE);
        }
        Iterator<T> it = table.getRows().iterator();
        int i = Integer.MAX_VALUE;
        while (it.hasNext()) {
            int iIntValue = ((Integer) ((Row) it.next()).zzZYf().zzPj(5102)).intValue();
            if (iIntValue < i) {
                i = iIntValue;
            }
        }
        for (Row row : table.getRows()) {
            zzY6G zzy6gZzZYf = row.zzZYf();
            int iIntValue2 = ((Integer) row.zzZYf().zzPj(5102)).intValue() - i;
            if (iIntValue2 != 0 && iIntValue2 != zzy6gZzZYf.zzYk9()) {
                int iZzYk9 = iIntValue2 - zzy6gZzZYf.zzYk9();
                zzy6gZzZYf.zzph(iIntValue2);
                zzy6gZzZYf.zzwa(zzy6gZzZYf.zzYM7() - iZzYk9);
            }
            zzy6gZzZYf.remove(5102);
        }
    }

    private boolean zzoD(int i) {
        if (i == 0) {
            return (zzYhP() == 32 || zzYhP() == 33 || zzYhP() == 37 || zzYhP() == 36 || zzYhP() == 34 || zzYhP() == 35 || zzYhP() == 39 || zzYhP() == 38) ? false : true;
        }
        switch (i) {
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
                if (i == zzYhP()) {
                }
                break;
        }
        return true;
    }

    private static void zzq(Cell cell) {
        zzWP zzwpZz6G;
        if (cell.getParentRow().getParentTable().zzhk() && (zzwpZz6G = cell.zz6G()) != null && zzwpZz6G.getWidth() <= 0 && !zzwpZz6G.zz5B()) {
            PreferredWidth preferredWidth = (PreferredWidth) zzwpZz6G.zzPk(3020);
            if (preferredWidth != null && preferredWidth.isFixed() && preferredWidth.zzYmC()) {
                return;
            }
            int iZzr = com.aspose.words.internal.zzSA.zzr(zzwpZz6G.getLeftPadding() + zzwpZz6G.getRightPadding());
            int iZzr2 = zzwpZz6G.zz5y() != null ? com.aspose.words.internal.zzSA.zzr(zzwpZz6G.zz5y().zz8S()) : 0;
            if (zzwpZz6G.zz5x() != null) {
                iZzr2 += com.aspose.words.internal.zzSA.zzr(zzwpZz6G.zz5x().zz8S());
            }
            zzwpZz6G.setWidth(iZzr + 20 + iZzr2);
        }
    }

    private boolean zztL(int i) {
        return this.zzYR5.size() != 0 && this.zzYR5.peek().zzYhe().getNodeType() == i;
    }

    private static void zzu(Row row) {
        CellCollection cells = row.getCells();
        Row row2 = (Row) row.zzYB6();
        if (row2 != null && row2.getCells().getCount() == cells.getCount()) {
            row2.zzZ(cells);
            return;
        }
        Iterator<T> it = row.getCells().iterator();
        while (it.hasNext()) {
            ((Cell) it.next()).zzZ(new zzWP());
        }
    }

    private void zzv(Row row) {
        if (row.getCells().getCount() > this.zzXwE.zzYhj().zzZYf().zz5l().getCount()) {
            int count = this.zzXwE.zzYhj().zzZYf().zz5l().getCount() - 1;
            for (int count2 = row.getCells().getCount() - 1; count2 > count; count2--) {
                Cell cell = row.getCells().get(count2);
                cell.removeAllChildren();
                cell.remove();
            }
        }
    }

    private void zzw(Row row) {
        if (zzx(row).zz5l() != null) {
            zzG(row);
        } else {
            zzu(row);
        }
        zzJ(row.zzZYf());
        zzF(row);
        row.zzZYf().zzXXc();
    }

    private static void zzx(zzYEF zzyef) {
        zzyef.setNameFarEast((zzCc(zzyef.getNameAscii()) || zzCc(zzyef.getNameOther())) ? "MS Mincho" : "MS Gothic");
    }

    private static boolean zzy(Row row) {
        Iterator<T> it = row.getCells().iterator();
        while (it.hasNext()) {
            zzWP zzwpZz6G = ((Cell) it.next()).zz6G();
            if (zzwpZz6G != null && zzwpZz6G.getVerticalMerge() == 2) {
                return true;
            }
        }
        return false;
    }

    public final CompositeNode getContainer() {
        return this.zzeU.peek();
    }

    public final void zzCe(String str) throws Exception {
        if (com.aspose.words.internal.zzZKN.equals(str, ControlChar.PAGE_BREAK) && getContainer().getNodeType() == 5) {
            zzYhE();
        }
        String strZzCk = this.zzXwE.zzXt9 ? zzYGX.zzCk(str) : str.replace("\\:", C18241k5.f55433h);
        if (this.zzXwE.zzXt8) {
            strZzCk = strZzCk.replace("\"", "\\\"");
        }
        if (this.zzXwE.zzYgi().getRecognizeUtf8Text()) {
            strZzCk = zzCd(strZzCk);
        }
        zzYEF zzyefZzYir = zzYiL().zzYir();
        zzX zzx = new zzX(strZzCk);
        if (zzx.zzXui && zzZ(zzyefZzYir, this.zzXwE.getDocument().zzZqy())) {
            zzx(zzyefZzYir);
        }
        if (zzYhr() || zzYhM()) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzXut, new zzY(new Run(this.zzXwE.getDocument(), strZzCk, zzyefZzYir), getContainer().getNodeType(), zzYhP()));
            return;
        }
        this.zzXuw = false;
        if (zzx.zzXuh) {
            zzR(strZzCk, zzyefZzYir);
        } else {
            zzS(strZzCk, zzyefZzYir);
        }
    }

    public final void zzH(Footnote footnote) {
        if (this.zzXwE.getDocument().zzZpV().zzYVh.zzYcl() == 0 || this.zzXwE.getDocument().zzZpV().zzYVh.zzYcl() == 3) {
            footnote.zzZ6V();
        }
        zzYhN();
        while (zzYhE()) {
        }
        getContainer().getNodeType();
        zzZI();
        this.zzXwE.zzYhj().zzYfh();
    }

    public final void zzI(Footnote footnote) {
        this.zzXwE.zzYhj().zzYfj();
        zzWI(footnote);
    }

    public final void zzRm(boolean z) {
        if (z) {
            zzYhz();
        }
        zzYhy();
    }

    public final void zzRn(boolean z) throws Exception {
        if (getContainer().getNodeType() == 4 && !z) {
            zzCe(ControlChar.PAGE_BREAK);
            return;
        }
        this.zzXuw = z;
        zzYWO();
        if (getContainer().getNodeType() == 2) {
            Section section = (Section) getContainer();
            section.zzY((zzYCZ) zzYiL().zzYvR().zzbn());
            if (section.zzYVf()) {
                zzYCZ zzycz = new zzYCZ();
                this.zzXwE.zzX(zzycz);
                if (zzycz.zzVE(2200)) {
                    section.zzYvR().setPageStartingNumber(zzycz.getPageStartingNumber());
                }
            } else if (z && section.getBody() == null) {
                Section section2 = (Section) section.zztC(2);
                for (int count = section.getHeadersFooters().getCount() - 1; count >= 0; count--) {
                    int headerFooterType = section.getHeadersFooters().get(count).getHeaderFooterType();
                    if (section2.getHeadersFooters().getByHeaderFooterType(headerFooterType) != null) {
                        section2.getHeadersFooters().getByHeaderFooterType(headerFooterType).remove();
                    }
                    section2.appendChild(section.getHeadersFooters().getByHeaderFooterType(headerFooterType));
                }
                section.remove();
            }
            zzZI();
        }
    }

    public final void zzU(BookmarkStart bookmarkStart) {
        zzWF(bookmarkStart);
    }

    public final void zzV(zzZMM zzzmm) {
        zzWI(new FormField(this.zzXwE.getDocument(), zzzmm, zzYiL().zzYir()));
    }

    public final void zzW(Comment comment, int i) {
        int id = comment.getId();
        zzZA1 zzza1 = this.zzXuq.get(i);
        if (zzza1 == null || i == id) {
            this.zzXuq.remove(id);
        } else {
            zzza1.setIdInternal(id);
            this.zzXuq.set(id, zzza1);
        }
        comment.setIdInternal(i);
        this.zzXuq.remove(i);
    }

    public final void zzWI(Node node) {
        zzWH(node);
        if (node.isComposite()) {
            zzT((CompositeNode) node);
        } else {
            getContainer().zzA(node);
        }
    }

    public final void zzWJ(Node node) {
        if (zzYhr()) {
            ((Paragraph) ((Row) getContainer()).getLastCell().zzZYs()).zzA(node);
        } else {
            zzWI(node);
        }
    }

    public final void zzX(zzYX9 zzyx9) {
        zzWF(zzyx9);
    }

    public final void zzXV(char c) {
        zzWI(new SpecialChar(this.zzXwE.getDocument(), c, zzYiL().zzYir()));
    }

    public final void zzY(EditableRangeStart editableRangeStart) {
        zzWF(editableRangeStart);
    }

    public final FieldChar zzYOl() {
        this.zzYR5.size();
        if (this.zzYR5.size() > 0) {
            return this.zzYR5.peek().zzYhe();
        }
        return null;
    }

    public final void zzYWI() {
        zzYhN();
        getContainer().getNodeType();
        zzZI();
        this.zzXwE.zzYhj().zzYfh();
    }

    public final void zzYWM() {
        if (getContainer().getNodeType() == 8) {
            zzYhN();
        }
        getContainer();
        zzZI();
        getContainer().getNodeType();
        zzZI();
    }

    public final void zzYWN() {
        this.zzXuw = true;
        while (zzYhE()) {
        }
        if (getContainer().getNodeType() == 4) {
            HeaderFooter headerFooter = (HeaderFooter) getContainer();
            if (headerFooter.zzZYr() == null) {
                this.zzXuw = false;
                zzYiL().zzZYj().zzBl(0);
                zzYhN();
            }
            headerFooter.isLinkedToPrevious(false);
            this.zzXwE.zzYhj().zzYfh();
            zzZI();
        }
        this.zzXuw = false;
    }

    public final void zzYhC() {
        zzYhn();
        zzYhB();
        if (getContainer().getNodeType() != 6) {
            return;
        }
        Row row = (Row) getContainer();
        zzw(row);
        zzYhA();
        TableStyle tableStyle = (TableStyle) com.aspose.words.internal.zzZKW.zzZ(this.zzXwE.getDocument().getStyles().zzZ8(row.zzZYf().zzZ7j(), true), TableStyle.class);
        if (tableStyle != null) {
            row.zzZYf().zzX(tableStyle.zzZYf(), 4005);
        }
        if (row.zzZYf().isFloating()) {
            row.zzYkc();
        }
        zzYH3 zzyh3ZzYih = this.zzXwE.zzYgo().zzYih();
        if (zzyh3ZzYih != null && zzyh3ZzYih.zzZYj() != null && zzyh3ZzYih.zzZYj().zzYps() != 0) {
            row.zzZYf().zzqF(zzyh3ZzYih.zzZYj().zzYps());
        }
        zzZI();
        for (int size = this.zzXut.size(); size > 0; size--) {
            zzY zzy = (zzY) C21505OooO0Oo.OooO00o(size, this.zzXut);
            if (zzy.zzXuk == 6) {
                this.zzXut.remove(zzy);
            }
        }
    }

    public final boolean zzYhE() {
        if (getContainer().getNodeType() == 8) {
            zzYhN();
        }
        if (getContainer().getNodeType() == 7) {
            zzZI();
        }
        zzYhC();
        if (getContainer().getNodeType() != 5) {
            return false;
        }
        zzYhD();
        zzY6G zzy6gZzZYf = this.zzXwE.zzYhj().zzZYf();
        zzZI();
        this.zzXwE.zzYhj().zzYfh();
        if (this.zzXwE.zzYhj().isInCell()) {
            zzy6gZzZYf = this.zzXwE.zzYhj().zzZYf();
        }
        if (zzy6gZzZYf == null || this.zzXwE.zzYhj().zzYfn()) {
            return true;
        }
        zzy6gZzZYf.zzZ(this.zzXwE.zzYhj().zzZYf());
        return true;
    }

    public final void zzYhF() {
        if (this.zzXwE.zzYhj().zzYfn()) {
            boolean zZzYhE = true;
            while (this.zzXwE.zzYhj().zzYfd() && zZzYhE) {
                zZzYhE = zzYhE();
            }
        }
    }

    public final void zzYhG() {
        this.zzXuw = true;
        if ((this.zzXwE.zzYhj().zzYff() || getContainer().getNodeType() == 5) && getContainer().getNodeType() != 18) {
            zzYhp();
        } else {
            zzYhN();
        }
        this.zzXwE.zzYhj().zzYfh();
        this.zzXuw = false;
    }

    public final void zzYhH() {
        this.zzXwE.zzYhj().zzYfj();
    }

    public final void zzYhI() {
        getContainer();
        zzZI();
        zzYhk();
    }

    public final FieldEnd zzYhJ() {
        return new FieldEnd(this.zzXwE.getDocument(), zzXux, 0, false);
    }

    public final FieldEnd zzYhK() throws Exception {
        return zzN((FieldEnd) null);
    }

    public final FieldStart zzYhL() {
        FieldStart fieldStart = new FieldStart(this.zzXwE.getDocument(), zzXux, 0);
        zzWI(fieldStart);
        this.zzYR5.push(new zzZ(fieldStart));
        return fieldStart;
    }

    public final void zzYhN() {
        while (getContainer().getNodeType() == 27) {
            zzYhu();
        }
        if (getContainer().getNodeType() != 8 && !this.zzXuw) {
            zzWH(null);
        }
        if (getContainer().getNodeType() == 8) {
            Paragraph paragraph = (Paragraph) getContainer();
            paragraph.zzZ(zzYiL().zzRo(((Row) com.aspose.words.internal.zzZKW.zzZ(paragraph.getAncestor(6), Row.class)) != null));
            paragraph.zzC(zzYiL().zzYir());
            zzZI();
        }
    }

    public final void zzYhO() throws Exception {
        if (getContainer().getNodeType() == 8) {
            this.zzXwE.getDocument().zzWz(true);
        }
        zzRn(true);
        Iterator<T> it = this.zzXwE.getDocument().getChildNodes(20, true).iterator();
        while (it.hasNext()) {
            zzG((Footnote) ((Node) it.next()));
        }
    }

    public final zzZ zzYhi() {
        this.zzYR5.size();
        if (this.zzYR5.size() > 0) {
            return this.zzYR5.peek();
        }
        return null;
    }

    public final zzYF1 zzYhj() {
        return this.zzXwE.zzYhj();
    }

    public final void zzYhq() {
        while (this.zzXwE.zzYhj().zzYfc()) {
            zzYWH();
        }
    }

    public final void zzYht() {
        zzZI();
    }

    public final void zzYhu() {
        if (zzYVU.zzXM(getContainer())) {
            zzZI();
        }
    }

    public final void zzYhw() {
        Paragraph paragraph = (Paragraph) getContainer();
        paragraph.remove();
        zzZI();
        zzYhq();
        zzZ((Table) null, paragraph);
    }

    public final void zzYhx() {
        Paragraph paragraph = (Paragraph) getContainer();
        Node nodeZzYB9 = paragraph.zzYB9();
        Table table = (nodeZzYB9 == null || nodeZzYB9.getNodeType() != 5) ? null : (Table) nodeZzYB9;
        Node nextSibling = paragraph.getNextSibling();
        paragraph.remove();
        zzZI();
        zzZ(table, paragraph);
        if (table != null) {
            paragraph.getParentNode().zzZ(nodeZzYB9.getNextSibling(), nextSibling, paragraph);
        }
    }

    public final void zzYhy() {
        if (getContainer().getNodeType() == 5) {
            zzYhF();
        }
        if (getContainer().getNodeType() == 8 && !this.zzXwE.zzYhj().zzYff()) {
            zzYhx();
        }
        if (getContainer().getNodeType() == 3 && !this.zzXwE.zzYhj().zzYff()) {
            zzYhv();
        }
        zzYhN();
        zzYhh();
    }

    public final void zzZ(SubDocument subDocument) {
        zzWI(subDocument);
    }

    public final void zzZ4(ShapeBase shapeBase) {
        if (shapeBase.getParentNode() != null) {
            return;
        }
        if (getContainer().getNodeType() != 17) {
            zzWI(shapeBase);
        } else {
            zzT(shapeBase);
        }
        shapeBase.zzZ(zzYiL().zzYir());
        shapeBase.isLayoutInCell(false);
    }

    public final void zzm(int i, String str) {
        Node[] nodeArrZzZ = zzYYM.zzZ(this.zzXwE.getDocument(), (zzYEF) zzYiL().zzYir().zzbn(), i, str);
        zzWH(nodeArrZzZ[0]);
        for (int i2 = 0; i2 < 5; i2++) {
            getContainer().zzA(nodeArrZzZ[i2]);
        }
    }

    public final void zzyr(int i) {
        zzM(this.zzXwE.getDocument());
        zzZMS zzzms = new zzZMS(this.zzXwE.getDocument(), i);
        this.zzXwE.getDocument().zzZpU().zzZ(i, zzzms);
        zzM(zzzms);
    }

    public final void zzys(int i) {
        this.zzXuw = false;
        if (getContainer().getNodeType() == 1) {
            zzYhs();
        }
        Section section = (Section) (getContainer().getNodeType() == 2 ? getContainer() : getContainer().getAncestor(2));
        HeaderFooter headerFooter = new HeaderFooter(this.zzXwE.getDocument(), i);
        zzM(headerFooter);
        this.zzXwE.zzYhj().zzYfj();
        Story storyZzmv = section.zzmv(zzY0C.zzhC(i));
        if (storyZzmv != null) {
            section.removeChild(storyZzmv);
        }
        section.zzA(headerFooter);
    }

    private void zzM(CompositeNode compositeNode) {
        this.zzeU.push(compositeNode);
        zzYhl();
        zzYhk();
    }

    private void zzX(zzYEF zzyef, boolean z) {
        String str = z ? "Endnote Reference" : "Footnote Reference";
        if (zzyef.getVerticalAlignment() != 1) {
            zzyef.zzBl(this.zzXwE.getDocument().getStyles().get(str).zzZ7j());
        }
    }

    public final FieldEnd zzN(FieldEnd fieldEnd) throws Exception {
        if (getContainer().getNodeType() == 6) {
            return zzYhJ();
        }
        FieldEnd fieldEndZzM = zzM(fieldEnd);
        CompositeNode container = getContainer();
        if (fieldEnd == null) {
            zzWI(fieldEndZzM);
        } else if (zztL(23)) {
            fieldEnd.remove();
            zzWI(fieldEnd);
        } else {
            container = fieldEnd.getParentNode();
        }
        FieldSeparator fieldSeparator = zztL(23) ? (FieldSeparator) this.zzYR5.pop().zzYhe() : null;
        zztL(22);
        boolean zZzYhd = this.zzYR5.peek().zzYhd();
        zzZR4 zzzr4 = new zzZR4((FieldStart) this.zzYR5.pop().zzYhe(), fieldSeparator, fieldEndZzM);
        Run run = (Run) com.aspose.words.internal.zzZKW.zzZ(zzzr4.getStart().zztD(21), Run.class);
        if (run != null) {
            zzzr4.getStart().zzZ((zzYEF) run.zzZYh().zzbn());
            zzzr4.getEnd().zzZ((zzYEF) run.zzZYh().zzbn());
            if (zzzr4.getSeparator() != null) {
                zzzr4.getSeparator().zzZ((zzYEF) run.zzZYh().zzbn());
            }
            FormField formField = (FormField) zz7(zzzr4.getStart(), zzzr4.getSeparator());
            if (formField != null) {
                formField.zzZ((zzYEF) run.zzZYh().zzbn());
            }
        }
        zzzr4.zzDJ(zzzr4.zzZg2());
        boolean z = zzZOO.zzCF(zzzr4.getFieldType()) != 0;
        if (z && zzzr4.getSeparator() == null) {
            zzzr4.zzX(new FieldSeparator(this.zzXwE.getDocument(), zzXux, zzzr4.getFieldType()));
            container.insertBefore(zzzr4.getSeparator(), zzzr4.getEnd());
        } else if (!z && zzzr4.getSeparator() != null) {
            zzYW0.zzn(zzzr4.getSeparator(), zzzr4.getEnd());
            zzzr4.zzX((FieldSeparator) null);
        }
        zzzr4.getEnd().zzVU(zzzr4.getSeparator() != null);
        if (zzzr4.getFieldType() == 57) {
            zzS(zzzr4);
        } else {
            zzzr4.zzZg0();
            zzYC9.zzZ(zzzr4, zzS(zzzr4.getSeparator()), this.zzXwE.zzYgi());
        }
        if (zzzr4.getFieldType() == 88 && !zZzYhd && (zzzr4.getEnd().getPreviousSibling() == zzzr4.getSeparator() || zzzr4.getEnd().getPreviousSibling() == zzzr4.getStart())) {
            zzzr4.getEnd().getField().update();
        }
        return fieldEndZzM;
    }

    public final void zzU(BookmarkEnd bookmarkEnd) {
        zzWF(bookmarkEnd);
    }

    public final void zzY(EditableRangeEnd editableRangeEnd) {
        zzWF(editableRangeEnd);
    }

    public final void zzZ(zzYOC zzyoc) {
        if (this.zzYR5.size() <= 0 || this.zzYR5.peek().zzYhe().getNodeType() != 23) {
            FieldSeparator fieldSeparator = new FieldSeparator(this.zzXwE.getDocument(), zzXux, 0, zzyoc);
            zzWI(fieldSeparator);
            this.zzYR5.push(new zzZ(fieldSeparator));
        }
    }

    public final void zzV(zzYX6 zzyx6) {
        zzyx6.setId(this.zzXus);
        this.zzXus++;
        zzWF(zzyx6);
    }

    private zzY6G zzx(Row row) {
        zzY6G zzy6g;
        zzY6G zzy6gZznL = this.zzXwE.zzYhj().zznL(Math.min(this.zzXwE.zzYgo().getCount(), this.zzXwE.zzYhj().zzYfm()));
        if (zzy6gZznL.getCount() == 0 && (zzy6g = this.zzXuv) != null) {
            zzy6gZznL = (zzY6G) zzy6g.zzbn();
        } else {
            this.zzXuv = (zzY6G) zzy6gZznL.zzbn();
        }
        zzZNS.zzS(zzy6gZznL);
        row.zzZ(zzy6gZznL);
        return zzy6gZznL;
    }

    public final void zzM(Comment comment) {
        this.zzXwE.zzYhj().zzYfj();
        if (getContainer().getNodeType() != 5) {
            zzWH(comment);
            zzT(comment);
        } else {
            ((Table) getContainer()).getLastRow().getLastCell().zzA(comment);
            zzM((CompositeNode) comment);
        }
        this.zzXuq.set(comment.getId(), comment);
    }

    private void zzG(Footnote footnote) {
        boolean z = footnote.getFootnoteType() == 1;
        int iZzZ = zzZ(footnote, z);
        Paragraph paragraph = (Paragraph) footnote.getChild(8, 0, true);
        if (this.zzXwE.zzYgb() || paragraph == null || !paragraph.hasChildNodes()) {
            return;
        }
        Node firstChild = paragraph.getFirstChild();
        if (firstChild.getNodeType() == 21) {
            zzZ((Run) firstChild, z, iZzZ);
        }
        if (firstChild.getNodeType() == 26) {
            SpecialChar specialChar = (SpecialChar) firstChild;
            if (com.aspose.words.internal.zzZKN.equals(specialChar.getText(), ControlChar.zzZsc)) {
                zzX(specialChar.zzZYh(), z);
            }
        }
    }

    private static void zzS(zzZR4 zzzr4) {
        Run run = (Run) com.aspose.words.internal.zzZKW.zzZ(zzzr4.getStart().zztD(21), Run.class);
        if (run != null) {
            zzzr4.getStart().zztD(21);
            zzzr4.getEnd().zztC(21);
            zzZQS zzzqsZzV = zzZQS.zzV(zzzr4);
            if (com.aspose.words.internal.zzZYD.zzXk(zzzqsZzV.getFontName())) {
                run.zzZYh().setName(zzYEF.zzYdx());
                run.zzZYh().zzBp(zzzqsZzV.getFontName());
            }
            run.setText(Character.toString(com.aspose.words.internal.zzJF.zzE(zzzqsZzV.getChar())));
            zzzr4.zzZg1();
        }
    }

    private void zzZ(Table table, Paragraph paragraph) {
        if (table != null) {
            zzM(table);
            this.zzXwE.zzYhj().zznM(this.zzXwE.zzYhj().zzYf9() + 1);
            this.zzXwE.zzYhj().zzYfi();
            if (this.zzXwE.zzYhj().zzZYf().zz5l() == null && table.zzY0f()) {
                zzY6G zzy6g = this.zzXuv;
                if (zzy6g != null && zzy6g.zz5l() != null) {
                    this.zzXwE.zzYhj().zzZYf().zzQ(5100, this.zzXuv.zz5l().deepCloneComplexAttr());
                } else {
                    zzWO zzwo = new zzWO();
                    this.zzXwE.zzYhj().zzZYf().zzQ(5100, zzwo);
                    for (int i = 0; i < table.getLastRow().getCells().getCount(); i++) {
                        zzwo.zzU(new zzWP());
                    }
                }
            }
        } else {
            this.zzXwE.zzYhj().zznO(this.zzXwE.zzYgo().getCount());
            zzYhq();
        }
        zzYhm();
        if (paragraph != null) {
            zzT(paragraph);
        }
    }

    private static Shape zzS(FieldSeparator fieldSeparator) {
        if (fieldSeparator == null) {
            return null;
        }
        return (Shape) com.aspose.words.internal.zzZKW.zzZ(fieldSeparator.getNextSibling(), Shape.class);
    }

    private static void zzZ(zzY6G zzy6g, zzWP zzwp) {
        if (zzwp != null) {
            zzZ(zzy6g, zzwp, 3110, 4050);
            zzZ(zzy6g, zzwp, 3120, 4060);
            zzZ(zzy6g, zzwp, 3140, 4080);
            zzZ(zzy6g, zzwp, 3130, 4070);
        }
    }

    private static void zzZ(zzY6G zzy6g, zzWP zzwp, int i, int i2) {
        if (zzwp.contains(i) || !zzy6g.contains(i2)) {
            return;
        }
        zzwp.zzQ(i, Border.zz8G());
    }

    private static boolean zzZ(zzYEF zzyef, zzZYZ zzzyz) throws Exception {
        if (!zzyef.zzVE(235)) {
            return false;
        }
        zzU1 zzu1ZzYdR = zzyef.zzYdR();
        if (zzU1.zzZ(zzzyz, zzu1ZzYdR) || zzu1ZzYdR.zzZYI()) {
            return false;
        }
        FontInfo fontInfoZzO5 = zzzyz.zzO5(zzyef.getNameFarEast());
        return fontInfoZzO5 == null || !zzXup.contains(Integer.valueOf(fontInfoZzO5.getCharset()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.aspose.words.zzYGC] */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.aspose.words.Footnote, com.aspose.words.InlineStory, com.aspose.words.zzZAM] */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.aspose.words.Node] */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.aspose.words.Inline, com.aspose.words.Run, com.aspose.words.zzZAM] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    private int zzZ(Footnote footnote, boolean z) {
        int length = 1;
        if (footnote.isAuto()) {
            return 1;
        }
        String referenceMark = footnote.getReferenceMark();
        if (referenceMark != null && com.aspose.words.internal.zzZKU.zzG(referenceMark.charAt(referenceMark.length() - 1))) {
            return 0;
        }
        zzYEF zzyefZzZ = zzZ7R.zzZ((zzZAM) footnote, 0);
        zzX(footnote.zzZYh(), z);
        do {
            footnote = (Run) footnote.zztD(21);
            if (footnote != 0) {
                if (zzYEF.zzW(zzyefZzZ, zzZ7R.zzZ((zzZAM) footnote, 0))) {
                    String text = footnote.getText();
                    if (com.aspose.words.internal.zzZYD.zzXd(text)) {
                        int iZzXe = com.aspose.words.internal.zzZYD.zzXe(text);
                        zzZ(footnote, z, iZzXe);
                        length += iZzXe;
                        footnote = 0;
                    } else {
                        zzX(footnote.zzZYh(), z);
                        length = text.length() + length;
                    }
                } else {
                    footnote = 0;
                }
            }
        } while (footnote != 0);
        return length;
    }

    private void zzZ(Run run, boolean z, int i) {
        if (i <= 0 || i >= run.getText().length()) {
            return;
        }
        zzX(run.zzng(i).zzZYh(), z);
    }
}
