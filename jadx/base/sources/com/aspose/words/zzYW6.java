package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYW6 {
    private void zzS(Node node, Node node2, boolean z) throws Exception {
        zzr(zzZ76.zzZ1(node), zzZ76.zzG(node2, z));
    }

    private static int zzT(Node node, Node node2, boolean z) {
        if (!z) {
            return 3;
        }
        Cell cellZzZ0 = zzZ76.zzZ0(node);
        Cell cellZzZ02 = zzZ76.zzZ0(node2);
        return (cellZzZ0 == null || cellZzZ02 == null || cellZzZ0.getParentRow().getParentTable() != cellZzZ02.getParentRow().getParentTable() || cellZzZ0.getRowIndex() > cellZzZ02.getRowIndex() || zzWI.zzV(cellZzZ0) > zzWI.zzV(cellZzZ02)) ? 0 : 3;
    }

    private static boolean zzU(Node node, Node node2, boolean z) {
        Node nodeZzZ1 = zzZ76.zzZ1(node);
        Node nodeZzG = zzZ76.zzG(node2, z);
        return (nodeZzZ1 == null || nodeZzG == null || nodeZzZ1.getParentNode() != nodeZzG.getParentNode()) ? false : true;
    }

    public static int zzZ(Node node, Node node2, int i, boolean z) {
        zzYJK.zzX5(node);
        zzYJK.zzX5(node2);
        if (node == node2 && node.getNodeType() == 18) {
            return 4;
        }
        if (i == 2) {
            return zzT(node, node2, z);
        }
        if (i == 1 && zzU(node, node2, true)) {
            return 2;
        }
        if (zzq(node, node2)) {
            return 1;
        }
        return (i == 1 || !zzU(node, node2, false)) ? 0 : 2;
    }

    private void zzp(Node node, Node node2) throws Exception {
        Cell cellZzZ0 = zzZ76.zzZ0(node);
        Cell cellZzZ02 = zzZ76.zzZ0(node2);
        int iZzV = zzWI.zzV(cellZzZ0);
        int iZzV2 = (zzWI.zzV(cellZzZ02) + zzWI.zzW(cellZzZ02)) - 1;
        Row parentRow = cellZzZ0.getParentRow();
        Row parentRow2 = cellZzZ02.getParentRow();
        int iZzX = zzWI.zzX(cellZzZ02);
        for (int i = 1; i < iZzX; i++) {
            parentRow2 = parentRow2.getNextRow();
        }
        while (true) {
            zzWW zzwwZzZ = zzWI.zzZ(parentRow, iZzV2);
            Cell cellZz6C = zzwwZzZ.zz6C();
            if (cellZz6C != null) {
                zzwwZzZ.zz6A();
            }
            if (cellZzZ0.getParentNode() != cellZz6C.getParentNode()) {
                throw new IllegalStateException("Unsupported node structure of a data band or conditional block affecting table columns.");
            }
            zzX(cellZzZ0, cellZz6C);
            if (parentRow == parentRow2) {
                return;
            }
            parentRow = parentRow.getNextRow();
            cellZzZ0 = zzWI.zzZ(parentRow, iZzV).zz6C();
        }
    }

    private static boolean zzq(Node node, Node node2) {
        CompositeNode parentNode = node.getParentNode().getParentNode();
        CompositeNode parentNode2 = node2.getParentNode().getParentNode();
        if (parentNode == parentNode2) {
            return true;
        }
        return parentNode.getNodeType() == 3 && parentNode.getParentNode().getNodeType() == 2 && parentNode2.getNodeType() == 3 && parentNode2.getParentNode().getNodeType() == 2;
    }

    public abstract void zzX(Cell cell, Cell cell2) throws Exception;

    public abstract void zzY6(Node node) throws Exception;

    public abstract void zzr(Node node, Node node2) throws Exception;

    public abstract void zzt(Node node, Node node2) throws Exception;

    public final void zzZ(Node node, Node node2, int i) throws Exception {
        int iZzZ = zzZ(node, node2, i, false);
        if (iZzZ == 1) {
            zzt(node, node2);
            return;
        }
        if (iZzZ == 2) {
            zzS(node, node2, i == 1);
        } else if (iZzZ == 3) {
            zzp(node, node2);
        } else {
            if (iZzZ == 4) {
                zzY6(node);
                return;
            }
            throw new IllegalStateException();
        }
    }
}
