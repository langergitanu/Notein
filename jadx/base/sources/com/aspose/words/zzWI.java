package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzWI {
    public static int zzV(Cell cell) {
        int iZz5q = 0;
        for (Cell previousCell = cell.getPreviousCell(); previousCell != null; previousCell = previousCell.getPreviousCell()) {
            iZz5q += previousCell.zz6G().zz5q();
        }
        return iZz5q;
    }

    public static int zzW(Cell cell) {
        int horizontalMerge = cell.zz6G().getHorizontalMerge();
        if (horizontalMerge == 0) {
            return cell.zz6G().zz5q();
        }
        if (horizontalMerge != 1) {
            throw new IllegalStateException();
        }
        int iZz5q = 0;
        do {
            iZz5q += cell.zz6G().zz5q();
            cell = cell.getNextCell();
            if (cell == null) {
                break;
            }
        } while (cell.zz6G().getHorizontalMerge() == 2);
        return iZz5q;
    }

    public static int zzX(Cell cell) {
        Cell cellZzY;
        int verticalMerge = cell.zz6G().getVerticalMerge();
        if (verticalMerge == 0) {
            return 1;
        }
        if (verticalMerge != 1) {
            throw new IllegalStateException();
        }
        Row parentRow = cell.getParentRow();
        int iZzV = zzV(cell);
        int i = 0;
        do {
            i++;
            parentRow = parentRow.getNextRow();
            cellZzY = parentRow != null ? zzY(parentRow, iZzV) : null;
            if (cellZzY == null) {
                break;
            }
        } while (cellZzY.zz6G().getVerticalMerge() == 2);
        return i;
    }

    public static Cell zzY(Row row, int i) {
        zzWW zzwwZzZ = zzZ(row, i);
        if (zzwwZzZ.zz6B() == i) {
            return zzwwZzZ.zz6C();
        }
        return null;
    }

    public static zzWW zzZ(Row row, int i) {
        Cell firstCell = row.getFirstCell();
        int iZz5q = 0;
        while (firstCell.zz6G().zz5q() + iZz5q <= i) {
            iZz5q += firstCell.zz6G().zz5q();
            firstCell = firstCell.getNextCell();
            if (firstCell == null) {
                break;
            }
        }
        return new zzWW(firstCell, iZz5q);
    }
}
