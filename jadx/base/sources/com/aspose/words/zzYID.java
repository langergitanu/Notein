package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYID extends zzJV {
    private ArrayList<Cell> zzXxh;
    private ArrayList<Cell> zzXxi;
    private zzU8 zzZGE;

    private zzYID(Row row, Row row2, zzU8 zzu8) throws Exception {
        super(new zzU5(row, zzu8), new zzU5(row2, zzu8), zzu8);
        this.zzXxi = new ArrayList<>();
        this.zzXxh = new ArrayList<>();
        this.zzZGE = zzu8;
    }

    private static Node zzWK(Node node) {
        while (node.getNextSibling() != null && (node.getNextSibling() instanceof zzYD6)) {
            node = node.getNextSibling();
        }
        return node;
    }

    private static Node zzWL(Node node) {
        while (node.getPreviousSibling() != null && (node.getPreviousSibling() instanceof zzYD5)) {
            node = node.getPreviousSibling();
        }
        return node;
    }

    private void zzY(Row row, Row row2, zzU8 zzu8) throws Exception {
        if (zzU6.zzZtG) {
            zzU6.zzSU(com.aspose.words.internal.zzZKN.format("\n{{Row}} '{0}' -> '{1}'", zzZSI(), zzZSH()));
        }
        zzZSQ();
        for (Cell cell : this.zzXxi) {
            Cell cell2 = (Cell) zzU4.zzZ((Node) cell, this.zzZGE, true);
            Node parentNode = row.getCells().get(cell.getColumnIndex());
            if (parentNode == null || parentNode.getParentNode().getNodeType() == 6) {
                row.getCells().insert(cell.getColumnIndex(), cell2);
            } else {
                while (parentNode.getParentNode().getNodeType() != 6) {
                    parentNode = parentNode.getParentNode();
                }
                row.insertBefore(cell2, parentNode);
            }
        }
        Iterator<Cell> it = this.zzXxh.iterator();
        while (it.hasNext()) {
            zzU4.zzY((Node) it.next(), this.zzZGE);
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= row.getCells().getCount() && i2 >= row2.getCells().getCount()) {
                return;
            }
            Cell cell3 = row.getCells().get(i);
            Cell cell4 = row2.getCells().get(i2);
            if (cell3.zz6G().zzYrW()) {
                i++;
            } else {
                if (!cell3.zz6G().zzYrV()) {
                    zzZMF.zzZ(cell3, cell4, zzu8);
                    zzU6.zzZZ2();
                    zzY9D.zzU(cell3, cell4, zzu8);
                    zzU6.zzZZ1();
                }
                i++;
                i2++;
            }
        }
    }

    public static void zzZ(Row row, Row row2, zzU8 zzu8) throws Exception {
        if (row.getCells().getCount() != row2.getCells().getCount()) {
            new zzYID(row, row2, zzu8).zzY(row, row2, zzu8);
            return;
        }
        for (int i = 0; i < row.getCells().getCount(); i++) {
            Cell cell = row.getCells().get(i);
            Cell cell2 = row2.getCells().get(i);
            zzZMF.zzZ(cell, cell2, zzu8);
            zzYWB zzywb = new zzYWB(zzWL(cell), zzWK(cell));
            zzYWB zzywb2 = new zzYWB(zzWL(cell2), zzWK(cell2));
            zzU6.zzZZ2();
            zzY9D.zzZ(zzywb, zzywb2, zzu8);
            zzU6.zzZZ1();
        }
    }

    @Override // com.aspose.words.zzJV
    public final void zzLQ(int i) {
        zzLL(zzZSK() + i);
        zzLK(zzZSJ() + i);
    }

    @Override // com.aspose.words.zzJV
    public final void zzLR(int i) {
        zzLL(zzZSK() + i);
    }

    @Override // com.aspose.words.zzJV
    public final int zzLS(int i) {
        zzLK(zzZSJ() + i);
        return 0;
    }

    @Override // com.aspose.words.zzJV
    public final void zzZ7(char c) {
        zzLL(zzZSK() + 1);
        zzLK(zzZSJ() + 1);
    }

    @Override // com.aspose.words.zzJV
    public final void zzZ8(char c) {
        if (c != 57348) {
            switch (c) {
                case 57377:
                case 57379:
                    zzU4.zzZ((zzZ8X) ((zzYD5) zzZSM()).zzYcK(), this.zzZGE);
                    break;
                case 57378:
                case 57380:
                    zzYD6 zzyd6 = (zzYD6) zzZSM();
                    zzYD5 zzyd5 = this.zzZGE.zzZum.containsKey(Integer.valueOf(zzyd6.zze0)) ? this.zzZGE.zzZum.get(Integer.valueOf(zzyd6.zze0)) : null;
                    if (zzyd5 != null) {
                        zzU4.zzZ((zzZ8X) zzyd5.zzYcK(), this.zzZGE);
                    }
                    break;
            }
        } else {
            com.aspose.words.internal.zzZQG.zzZ(this.zzXxh, ((Paragraph) zzZSM()).zzZex());
        }
        zzLL(zzZSK() + 1);
    }

    @Override // com.aspose.words.zzJV
    public final int zzZ9(char c) {
        if (c == 57348) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzXxi, ((Paragraph) zzZSL()).zzZex());
        }
        zzLK(zzZSJ() + 1);
        return 0;
    }

    @Override // com.aspose.words.zzJV
    public final boolean zzZSO() {
        return false;
    }
}
