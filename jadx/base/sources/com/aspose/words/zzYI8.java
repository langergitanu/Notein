package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYI8 {
    private int zzXwT;
    private zzWJ zzXwU;
    private zzWJ zzXwV;
    private boolean zzXwW;
    private ArrayList<zzWJ> zzZe5 = new ArrayList<>();

    public zzYI8(Row row, boolean z) {
        if (row == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: row");
        }
        zzY6G zzy6gZzZYf = row.zzZYf();
        int iZzYk9 = (!z || zzZZ8.zzw(row.getParentTable())) ? zzy6gZzZYf.zzYk9() : zzy6gZzZYf.zzXXe();
        int iZzYka = zzy6gZzZYf.zzYka();
        zzWJ zzwj = new zzWJ(iZzYka, (iZzYk9 <= 0 || iZzYka <= 0) ? PreferredWidth.AUTO : PreferredWidth.zzpK(iZzYk9));
        this.zzXwV = zzwj;
        this.zzXwT = zzwj.zz5q();
        int iZzYk7 = zzy6gZzZYf.zzYk7();
        if (iZzYk7 == 0) {
            this.zzXwU = new zzWJ(zzy6gZzZYf.zzYk8(), PreferredWidth.AUTO);
        } else {
            this.zzXwU = new zzWJ(zzy6gZzZYf.zzYk8(), PreferredWidth.zzpK(iZzYk7));
        }
        zzWJ zzwj2 = null;
        boolean z2 = false;
        for (Cell cell : row.getCells()) {
            zzWP zzwpZz6G = cell.zz6G();
            if (zzwpZz6G.zz5q() <= 0) {
                zzwpZz6G.getHorizontalMerge();
            }
            this.zzXwT += zzwpZz6G.zz5q();
            int horizontalMerge = zzwpZz6G.getHorizontalMerge();
            if (horizontalMerge == 0) {
                com.aspose.words.internal.zzZQG.zzZ(this.zzZe5, new zzWJ(cell));
                zzwj2 = null;
            } else if (horizontalMerge == 1) {
                zzwj2 = new zzWJ(cell);
                com.aspose.words.internal.zzZQG.zzZ(this.zzZe5, zzwj2);
            } else {
                if (horizontalMerge != 2) {
                    throw new IllegalStateException("Unexpected cell merge type.");
                }
                if (zzwj2 != null) {
                    zzwj2.zzOu(zzwj2.zz5q() + zzwpZz6G.zz5q());
                    z2 |= zzwpZz6G.getPreferredWidth().isFixed() && zzwpZz6G.getPreferredWidth().zzYmD() > 0;
                } else {
                    com.aspose.words.internal.zzZQG.zzZ(this.zzZe5, new zzWJ(cell));
                }
            }
        }
        this.zzXwW = z2;
    }

    private static zzWJ zzW2(int i, int i2) {
        return new zzWJ(i, i2 == 0 ? PreferredWidth.AUTO : PreferredWidth.zzpK(i2));
    }

    private boolean zzZ(zzYI8 zzyi8) {
        if (!com.aspose.words.internal.zzZKO.equals(this.zzXwV, zzyi8.zzXwV) || !com.aspose.words.internal.zzZKO.equals(this.zzXwU, zzyi8.zzXwU) || this.zzXwT != zzyi8.zzXwT) {
            return false;
        }
        for (int i = 0; i < this.zzZe5.size(); i++) {
            if (!com.aspose.words.internal.zzZKO.equals(this.zzZe5.get(i), zzyi8.zzZe5.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (com.aspose.words.internal.zzZKO.zzA(null, obj)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, obj)) {
            return true;
        }
        if (obj.getClass() != zzYI8.class) {
            return false;
        }
        return zzZ((zzYI8) obj);
    }

    public final int hashCode() {
        zzWJ zzwj = this.zzXwV;
        int iHashCode = zzwj != null ? zzwj.hashCode() : 0;
        zzWJ zzwj2 = this.zzXwU;
        if (zzwj2 != null) {
            iHashCode = (iHashCode * 397) ^ zzwj2.hashCode();
        }
        Iterator<zzWJ> it = this.zzZe5.iterator();
        while (it.hasNext()) {
            iHashCode = (iHashCode * 397) ^ it.next().hashCode();
        }
        return iHashCode;
    }

    public final boolean zzYjr() {
        return this.zzXwW;
    }

    public final ArrayList<zzWJ> zzYjs() {
        return this.zzZe5;
    }

    public final int zzYjt() {
        return this.zzXwT;
    }

    public final zzWJ zzYju() {
        return this.zzXwU;
    }

    public final zzWJ zzYjv() {
        return this.zzXwV;
    }

    public final void zzp9(int i) {
        this.zzXwT = i;
    }

    public final void zzpa(int i) {
        int iZz5q = this.zzXwV.zz5q();
        if (i == 0 && this.zzXwV.getPreferredWidth().zzYmE() > 0) {
            this.zzXwV.setPreferredWidth(PreferredWidth.AUTO);
        }
        this.zzXwV.zzOu(i);
        this.zzXwT = (i - iZz5q) + this.zzXwT;
    }

    public zzYI8(zzYIC zzyic) throws Exception {
        if (zzyic != null) {
            zzWJ zzwjZzW2 = zzW2(zzyic.zzYka(), zzyic.zzYk9());
            this.zzXwV = zzwjZzW2;
            this.zzXwT = zzwjZzW2.zz5q();
            this.zzXwU = zzW2(zzyic.zzYk8(), zzyic.zzYk7());
            for (zzWV zzwv = (zzWV) zzyic.zzZXZ(); zzwv != null && !zzwv.zzYTn(); zzwv = (zzWV) zzwv.zzYTp()) {
                int iZz6p = zzwv.zz6p();
                this.zzXwT += iZz6p;
                zzZ3B zzz3b = (zzZ3B) zzwv.zzYTt();
                zzWJ zzwj = new zzWJ(iZz6p, zzz3b.zzYMZ(), zzwv.zz6g());
                zzwj.zzYy(zzz3b.zzYMY());
                zzwj.zzYx(!zzz3b.zzYMX());
                com.aspose.words.internal.zzZQG.zzZ(this.zzZe5, zzwj);
            }
            this.zzXwW = false;
            return;
        }
        throw new NullPointerException("Value cannot be null.\r\nParameter name: row");
    }
}
