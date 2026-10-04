package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYO4 implements Iterator<Cell> {
    protected zzWQ zzXII;
    protected zzYO5 zzXIJ;
    private Cell zzXIK;

    public zzYO4(zzYO5 zzyo5) {
        this.zzXIJ = zzyo5;
        this.zzXII = zzyo5.zzYrg().zz5I();
    }

    public static void zzYrf() {
        throw new IllegalStateException("Unknown cell enumeration direction.");
    }

    public static zzYO4 zzZ(zzYO5 zzyo5) {
        int direction = zzyo5.getDirection();
        if (direction == 0 || direction == 1) {
            return new zzY3V(zzyo5);
        }
        if (direction == 2 || direction == 3) {
            return new zzYIP(zzyo5);
        }
        zzYrf();
        return null;
    }

    private static boolean zzu(Cell cell) {
        return cell.zz6G().getVerticalMerge() == 2 || cell.zz6G().getHorizontalMerge() == 2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        boolean zZzYre;
        Cell cellZz6C;
        do {
            zZzYre = zzYre();
            cellZz6C = zZzYre ? this.zzXII.zz6C() : null;
            this.zzXIK = cellZz6C;
            if (!zZzYre) {
                break;
            }
        } while (zzu(cellZz6C));
        return zZzYre;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Cell next() {
        return this.zzXIK;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean zzYre();
}
