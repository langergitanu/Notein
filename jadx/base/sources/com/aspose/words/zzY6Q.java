package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzY6Q {
    private int zzX5U;
    private int zzX5V;
    private int zzX5W;
    private int zzX5X;
    private int[] zzX5Y;
    private int[] zzX5Z;
    private int zzXLP;
    private int zzXxd;
    private int zzXxf;
    private int zzYSE;

    public zzY6Q(Table table) {
        this(table, false);
    }

    private static boolean zz3(Table table) {
        if (!zzZZ8.zzw(table)) {
            return true;
        }
        for (Row row : table.getRows()) {
            if (row.zzZYf().zzPk(4250) != null) {
                return true;
            }
            PreferredWidth preferredWidth = (PreferredWidth) row.zzZYf().zzPk(4253);
            if (preferredWidth != null && preferredWidth.zzYmB()) {
                return true;
            }
        }
        return false;
    }

    private void zz4(Table table) {
        com.aspose.words.internal.zzZYV zzzyv = new com.aspose.words.internal.zzZYV();
        for (Row firstRow = table.getFirstRow(); firstRow != null; firstRow = firstRow.getNextRow()) {
            int iZzk = zzk(firstRow);
            zzzyv.set(iZzk, null);
            Iterator<T> it = firstRow.getCells().iterator();
            while (it.hasNext()) {
                iZzk += ((Integer) ((Cell) it.next()).zz6G().zzVR(3010, this.zzYSE)).intValue();
                zzzyv.set(iZzk, null);
            }
        }
        int i = 0;
        int iMax = Math.max(zzzyv.getCount() - 1, 0);
        int[] iArr = new int[iMax];
        int iZzT3 = zzzyv.zzT3(0);
        int i2 = iZzT3;
        while (i < iMax) {
            int i3 = i + 1;
            int iZzT32 = zzzyv.zzT3(i3);
            iArr[i] = iZzT32 - i2;
            i = i3;
            i2 = iZzT32;
        }
        this.zzX5Z = iArr;
        this.zzX5V = iZzT3;
    }

    public static zzY6Q zz5(Table table) {
        return new zzY6Q(table, true, true);
    }

    private static int zzV(Table table, boolean z) {
        if (!z) {
            return 0;
        }
        if (((Boolean) table.getFirstRow().zzZYf().zzPj(5112)).booleanValue()) {
            return 1;
        }
        return zz3(table) ? 2 : 3;
    }

    private int zzVf(int i, int i2) {
        int i3 = 0;
        while (i2 > 1) {
            int[] iArr = this.zzX5Z;
            if (i >= iArr.length) {
                break;
            }
            i2 -= iArr[i];
            i++;
            i3++;
        }
        return i3;
    }

    private int zzk(Row row) {
        int i = this.zzX5U;
        if (i == 0) {
            return ((Integer) row.zzZYf().zzVR(4250, this.zzYSE)).intValue();
        }
        if (i != 1 && i != 2) {
            if (i != 3) {
                throw new IllegalStateException("Unknown widthBefore getting method.");
            }
            return ((Integer) row.zzZYf().zzPj(5108)).intValue() - ((Integer) row.zzZYf().zzPj(5109)).intValue();
        }
        return ((Integer) row.zzZYf().zzPj(4250)).intValue();
    }

    public final int[] zz4O() {
        return this.zzX5Z;
    }

    public final com.aspose.words.internal.zzDB zzXYQ() {
        com.aspose.words.internal.zzDB zzdb = new com.aspose.words.internal.zzDB(this.zzX5Z.length);
        for (int i : this.zzX5Z) {
            zzdb.add(i);
        }
        return zzdb;
    }

    public final int zzXYR() {
        return this.zzX5W;
    }

    public final int zzXYS() {
        return this.zzX5X;
    }

    public final int zzXYT() {
        int[] iArr = this.zzX5Y;
        int i = this.zzXLP;
        this.zzXLP = i + 1;
        return iArr[i];
    }

    public final int zzYk8() {
        return this.zzXxd;
    }

    public final int zzYka() {
        return this.zzXxf;
    }

    public final void zzj(Row row) {
        this.zzXLP = 0;
        int iZzk = zzk(row);
        if (this.zzX5U != 0) {
            iZzk -= this.zzX5V;
        }
        int i = 0;
        int i2 = 0;
        while (i < iZzk) {
            int[] iArr = this.zzX5Z;
            if (i2 >= iArr.length) {
                break;
            }
            i += iArr[i2];
            i2++;
        }
        this.zzX5X = iZzk;
        this.zzXxf = i2;
        CellCollection cells = row.getCells();
        this.zzX5Y = new int[cells.getCount()];
        for (int i3 = 0; i3 < cells.getCount(); i3++) {
            int iZzVf = zzVf(i2, ((Integer) cells.get(i3).zz6G().zzVR(3010, this.zzYSE)).intValue());
            this.zzX5Y[i3] = iZzVf;
            i2 += iZzVf;
        }
        this.zzX5W = ((Integer) row.zzZYf().zzVR(4260, this.zzYSE)).intValue();
        int length = this.zzX5Z.length - i2;
        this.zzXxd = length;
        if (length == 0) {
            this.zzX5W = 0;
        }
    }

    public zzY6Q(Table table, boolean z) {
        this(table, z, false);
    }

    private zzY6Q(Table table, boolean z, boolean z2) {
        this.zzYSE = z ? 1 : 0;
        this.zzX5U = zzV(table, z2);
        zz4(table);
    }
}
