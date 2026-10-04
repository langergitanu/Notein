package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY3V extends zzYO4 {
    private boolean zzX0H;
    private double zzX0I;
    private int zzZpV;

    public zzY3V(zzYO5 zzyo5) {
        super(zzyo5);
        int direction = zzyo5.getDirection();
        if (direction == 0) {
            this.zzZpV = -1;
        } else if (direction != 1) {
            zzYO4.zzYrf();
        } else {
            this.zzZpV = 1;
        }
        this.zzX0I = zzg(this.zzXII.zz6C());
    }

    private boolean zzXUa() {
        CellCollection cells = this.zzXIJ.zzYrg().zz6C().getParentRow().getParentTable().getRows().get(this.zzXII.getRowIndex()).getCells();
        double width = 0.0d;
        int i = 0;
        boolean z = false;
        while (i < cells.getCount()) {
            width += cells.get(i).getCellFormat().getWidth();
            z = width >= this.zzX0I - 1.0E-13d;
            if (z) {
                break;
            }
            i++;
        }
        if (z) {
            this.zzXII = new zzWQ(cells.get(i));
        }
        return z;
    }

    private static double zzg(Cell cell) {
        Row parentRow = cell.getParentRow();
        double width = 0.0d;
        for (int i = 0; i <= cell.getColumnIndex(); i++) {
            width += parentRow.getCells().get(i).getCellFormat().getWidth();
        }
        return width;
    }

    @Override // com.aspose.words.zzYO4
    public final boolean zzYre() {
        if (this.zzX0H) {
            return false;
        }
        boolean zZzOx = this.zzXII.zzOx(this.zzZpV);
        if (!zZzOx) {
            return zZzOx;
        }
        boolean zZzXUa = zzXUa();
        if (zZzXUa || Math.abs(this.zzXII.getRowIndex() - this.zzXIJ.zzYrg().getRowIndex()) != 1) {
            return zZzXUa;
        }
        this.zzXII.zzOv(0);
        boolean zZzOy = this.zzXII.zzOy(this.zzXIJ.zzYrg().getColumnIndex());
        this.zzX0H = true;
        return zZzOy;
    }
}
