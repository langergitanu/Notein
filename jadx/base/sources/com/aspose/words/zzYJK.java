package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYJK {
    public static Cell zzA(Row row) {
        Cell lastCell = row.getLastCell();
        while (lastCell != null && lastCell.zz6G().getHorizontalMerge() == 2) {
            lastCell = lastCell.getPreviousCell();
        }
        return lastCell;
    }

    public static void zzU(CompositeNode compositeNode, CompositeNode compositeNode2) {
        while (compositeNode.hasChildNodes()) {
            compositeNode2.prependChild(compositeNode.getLastChild());
        }
    }

    public static boolean zzX3(Node node) {
        return node.getAncestor(5) != null;
    }

    public static Node zzX4(Node node) {
        while (true) {
            node = node.getParentNode();
            if (node == null) {
                return null;
            }
            if (node.getNodeType() == 18 && ((Shape) node).canHaveImage()) {
                return node;
            }
        }
    }

    public static boolean zzX5(Node node) {
        CompositeNode parentNode = node.getParentNode();
        return parentNode != null && parentNode.getNodeType() == 8;
    }

    public static Cell zzY(Cell cell, boolean z) {
        Cell nextCell = cell.getNextCell();
        if (nextCell != null || !z) {
            return nextCell;
        }
        Row nextRow = cell.getParentRow().getNextRow();
        if (nextRow == null) {
            return null;
        }
        return nextRow.getFirstCell();
    }

    public static boolean zzYu(Paragraph paragraph) {
        for (Node firstChild = paragraph.getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            if (zzYVU.zzXV(firstChild)) {
                return true;
            }
            if (firstChild.getNodeType() == 21 && com.aspose.words.internal.zzZYD.zzX(firstChild.getText(), ControlChar.PAGE_BREAK, false)) {
                return true;
            }
        }
        return false;
    }

    public static CompositeNode zzZ(CompositeNode compositeNode, Node node, zzZRO zzzro, zzYW9 zzyw9) {
        CompositeNode compositeNode2 = (CompositeNode) zzzro.zzZ(compositeNode, false, zzyw9);
        if (compositeNode.getParentNode().zzT(compositeNode2)) {
            compositeNode.zzYC(compositeNode2);
        }
        while (compositeNode.getFirstChild() != node) {
            compositeNode2.appendChild(compositeNode.getFirstChild());
        }
        return compositeNode2;
    }

    public static boolean zzc(Table table) {
        Iterator<T> it = table.getRows().iterator();
        while (it.hasNext()) {
            Iterator<T> it2 = ((Row) it.next()).getCells().iterator();
            while (it2.hasNext()) {
                if (((Cell) it2.next()).zz6G().zz5q() > 1) {
                    return true;
                }
            }
        }
        return false;
    }

    private static void zzr(Cell cell) {
        CompositeNode compositeNodeZzZYt = cell.zzZYt();
        if (compositeNodeZzZYt == null || compositeNodeZzZYt.getNodeType() != 8) {
            cell.removeAllChildren();
            cell.ensureMinimum();
        } else {
            cell.removeAllChildren();
            cell.appendChild(compositeNodeZzZYt);
            compositeNodeZzZYt.removeAllChildren();
        }
    }

    public static boolean zzs(Cell cell) {
        return cell.zz6G().getHorizontalMerge() == 2;
    }

    public static boolean zzt(Cell cell) {
        return cell.zz6G().getVerticalMerge() == 2;
    }

    public static void zzZ(Cell cell, Cell cell2, boolean z) {
        if (!z) {
            cell.zz6G().setVerticalMerge(1);
            cell2.zz6G().setVerticalMerge(2);
            zzr(cell2);
            return;
        }
        if (cell2.zz6G().getVerticalMerge() != 1) {
            cell.zz6G().setHorizontalMerge(1);
            cell2.zz6G().setHorizontalMerge(2);
            zzr(cell2);
            return;
        }
        zzWI.zzX(cell2);
        zzWI.zzX(cell);
        Row parentRow = cell2.getParentRow();
        int iZzV = zzWI.zzV(cell2);
        int iZzV2 = zzWI.zzV(cell);
        zzWI.zzW(cell);
        do {
            cell.zz6G().setHorizontalMerge(1);
            cell2.zz6G().setHorizontalMerge(2);
            cell2.zz6G().setVerticalMerge(0);
            zzr(cell2);
            parentRow = parentRow.getNextRow();
            if (parentRow == null) {
                return;
            }
            cell2 = zzWI.zzY(parentRow, iZzV);
            cell = zzWI.zzY(parentRow, iZzV2);
            if (cell == null || cell2 == null) {
                return;
            }
        } while (cell2.zz6G().getVerticalMerge() == 2);
    }

    public static boolean zzZ(Node node, Table table) {
        Cell cell = (Cell) com.aspose.words.internal.zzZKW.zzZ(node, Cell.class);
        return cell != null && cell.getParentRow().getParentTable() == table;
    }
}
