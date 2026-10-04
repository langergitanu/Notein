package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZSF {
    private static int zzO(Cell cell) {
        if (cell == null) {
            return 0;
        }
        return ((Integer) cell.fetchCellAttr(3100)).intValue();
    }

    public static double zzP(Table table) {
        if (table.getRows().getCount() == 0) {
            return 0.0d;
        }
        Row firstRow = table.getFirstRow();
        Border border = (Border) firstRow.fetchRowAttr(4060);
        Border border2 = (Border) firstRow.fetchRowAttr(4080);
        return (table.getCellSpacing() * ((double) (table.getColumnCount() + 1))) + ((double) (border2.zz8S() + border.zz8S()));
    }

    public static int zzQ(Table table) {
        return zzZ(table, false);
    }

    private static int zzR(Cell cell) {
        Cell cell2;
        if (cell == null) {
            return 0;
        }
        if (cell.zz6G().getHorizontalMerge() != 0) {
            Cell nextCell = cell.getNextCell();
            while (true) {
                Cell cell3 = nextCell;
                cell2 = cell;
                cell = cell3;
                if (cell == null || cell.zz6G().getHorizontalMerge() != 2) {
                    break;
                }
                nextCell = cell.getNextCell();
            }
            cell = cell2;
        }
        return zzZ(cell, 3140);
    }

    public static int zzS(Cell cell) {
        if (cell == null) {
            return 0;
        }
        if (cell.zz6G().getHorizontalMerge() != 2 || cell.getPreviousCell() == null || cell.getPreviousCell().zz6G().getHorizontalMerge() == 0) {
            return zzZ(cell, 3120);
        }
        return 0;
    }

    private static Cell zzT(Row row) {
        Cell lastCell = row.getLastCell();
        while (lastCell != null && lastCell.zz6G().getHorizontalMerge() == 2) {
            lastCell = lastCell.getPreviousCell();
        }
        return lastCell;
    }

    private static int zzU(Cell cell) {
        int iZzYkg = cell.getParentRow().zzYkg();
        int i = iZzYkg * 2;
        if (cell.getPreviousCell() == null) {
            i += iZzYkg;
        }
        cell.zz6G().getHorizontalMerge();
        return cell.getNextCell() == null ? i + iZzYkg : i;
    }

    private static Border zzY(Cell cell, int i) {
        Cell previousCell;
        if (cell.getParentRow() != null && cell.getParentRow().getParentTable() != null && cell.getParentRow().getParentTable().getAllowCellSpacing()) {
            return Border.zzZCe;
        }
        int i2 = 3140;
        if (i == 3120) {
            previousCell = cell.getPreviousCell();
        } else {
            if (i != 3140) {
                return Border.zzZCe;
            }
            previousCell = cell.getNextCell();
            i2 = 3120;
        }
        return previousCell == null ? Border.zzZCe : (Border) previousCell.fetchCellAttr(i2);
    }

    public static int zzZ(Table table, int i) {
        return com.aspose.words.internal.zzSA.zzr(zzY6M.zzG(table.zzYBd())) + i;
    }

    public static int zzQ(Cell cell) {
        int iZzS = zzS(cell);
        int iZzP = zzP(cell);
        int iZzR = iZzS + zzR(cell);
        int iZzO = iZzP + zzO(cell);
        return cell.getParentRow().getParentTable().getAllowCellSpacing() ? iZzO + iZzR : Math.max(iZzO, iZzR / 2);
    }

    private static int zzZ(Table table, boolean z) {
        int iMax;
        Cell firstCell = table.getFirstRow().getFirstCell();
        int iZzS = zzS(firstCell);
        int iZzZX = com.aspose.words.internal.zzAN.zzZX(iZzS, 2);
        int iZzP = zzP(firstCell);
        Cell cellZzT = zzT(table.getFirstRow());
        int iZzR = zzR(cellZzT);
        int iZzZX2 = com.aspose.words.internal.zzAN.zzZX(iZzR, 2);
        int iZzO = zzO(cellZzT);
        int iZzZ = zzZ(table, iZzS, iZzR);
        if (table.zzhk()) {
            int i = -(iZzZX + iZzZX2);
            Cell cell = (Cell) table.zzYBd();
            int iZzP2 = zzP(cell) + zzO(cell);
            int iZzS2 = zzS(cell) + zzR(cell);
            iMax = (z ? i + iZzZ : i - zzU(cell)) - ((!cell.getParentRow().getParentTable().getAllowCellSpacing() || z) ? Math.max(iZzP2, com.aspose.words.internal.zzAN.zzZX(iZzS2, 2)) : iZzP2 + iZzS2);
        } else if (table.getDocument().zzZpV().zzYVg.zzZYM()) {
            iMax = -(iZzZX + iZzZX2);
        } else {
            iMax = (!table.getAllowCellSpacing() || z) ? Math.max(iZzZX2, iZzO) + Math.max(iZzZX, iZzP) : (table.getFirstRow().zzYkg() * 4) + iZzP + iZzO + iZzS + iZzR;
            if (z) {
                iMax += iZzZ;
            }
        }
        return iMax - com.aspose.words.internal.zzSA.zzr(table.getLeftIndent());
    }

    public static int zzT(Cell cell) {
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

    public static int zzP(Cell cell) {
        if (cell == null) {
            return 0;
        }
        return ((Integer) cell.fetchCellAttr(3090)).intValue();
    }

    public static int zzR(Table table) {
        int iZzZ = zzZ(table, zzZ(table, true));
        if (table.getPreferredWidth().zzYmB() && table.getPreferredWidth().zzYmE() > 0) {
            iZzZ = (int) com.aspose.words.internal.zzZKQ.zzZa((table.getPreferredWidth().getValue() * ((double) (com.aspose.words.internal.zzSA.zzr(table.getLeftIndent()) + iZzZ))) / 100.0d);
        }
        return Math.max(Math.min(iZzZ, 120000), 15);
    }

    private static int zzZ(Table table, int i, int i2) {
        int iZzYmE = table.getFirstRow().zzZYf().zzXXp().zzYmE();
        if (iZzYmE == 0) {
            return 0;
        }
        return (iZzYmE * 4) + i + i2;
    }

    public static double zzZ(zzZD5 zzzd5) {
        Border border = (Border) zzzd5.fetchCellAttr(3120);
        Border border2 = (Border) zzzd5.fetchCellAttr(3140);
        return (((double) ((Integer) zzzd5.fetchCellAttr(3100)).intValue()) / 20.0d) + (((double) ((Integer) zzzd5.fetchCellAttr(3090)).intValue()) / 20.0d) + ((double) border.zz8S()) + ((double) border2.zz8S());
    }

    private static int zzZ(Cell cell, int i) {
        Border borderZzZ = Border.zzZ((Border) cell.fetchCellAttr(i), zzY(cell, i));
        return com.aspose.words.internal.zzSA.zzr(Border.zzT(borderZzZ.getLineStyle(), (float) borderZzZ.getLineWidth()));
    }
}
