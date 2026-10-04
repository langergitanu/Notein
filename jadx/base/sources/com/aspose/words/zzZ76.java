package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ76 {
    public static Node zzG(Node node, boolean z) {
        Cell cellZzZ0 = zzZ0(node);
        if (cellZzZ0 == null) {
            return null;
        }
        boolean zIsFirstCell = cellZzZ0.isFirstCell();
        boolean z2 = zzYJK.zzA(cellZzZ0.getParentRow()) == cellZzZ0;
        if (zIsFirstCell && z2 && z) {
            return cellZzZ0.getParentRow();
        }
        if (zIsFirstCell) {
            return cellZzZ0.getParentRow().getPreviousRow();
        }
        if (z2) {
            return cellZzZ0.getParentRow();
        }
        return null;
    }

    public static Node zzX(Table table, int i, int i2) {
        Cell cellZz6C = zzWI.zzZ(table.getRows().get(i), i2).zz6C();
        cellZz6C.ensureMinimum();
        Paragraph lastParagraph = cellZz6C.getLastParagraph();
        return lastParagraph.appendChild(new Run(lastParagraph.getDocument(), "", (zzYEF) lastParagraph.zzYp5().zzbn()));
    }

    private static Node zzY(int i, Node node) {
        if (i == 0) {
            return null;
        }
        if (i == 1) {
            return zzYZ(node);
        }
        if (i == 2) {
            return zzYJK.zzX4(node);
        }
        if (i == 3) {
            return zzZRO.zz4(node);
        }
        if (i == 4) {
            return zzZRO.zz3(node);
        }
        throw new IllegalStateException();
    }

    public static Node zzYY(Node node) {
        if (node == null) {
            return null;
        }
        zzYJK.zzX5(node);
        return node.getParentNode();
    }

    private static Node zzYZ(Node node) {
        node.getNodeType();
        Run run = (Run) node.deepClone(false);
        run.setText("");
        node.zzYC(run);
        return run;
    }

    public static Node zzZ(int i, Node node) {
        return zzY(i, node);
    }

    public static Cell zzZ0(Node node) {
        zzYJK.zzX5(node);
        CompositeNode compositeNodeZzYBd = node.getParentNode().zzYBd();
        if (compositeNodeZzYBd.getNodeType() == 7) {
            return (Cell) compositeNodeZzYBd;
        }
        return null;
    }

    public static Node zzZ1(Node node) {
        Cell cellZzZ0 = zzZ0(node);
        if (cellZzZ0 != null && cellZzZ0.isFirstCell()) {
            return cellZzZ0.getParentRow();
        }
        return null;
    }
}
