package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYMZ extends zzYN3 implements Iterator<Integer> {
    private PageRange[] zzXH7;
    private int zzXH8;
    private int zzXH9 = -1;
    private int zzbP = -1;

    public zzYMZ(int i, PageRange[] pageRangeArr, int i2) {
        this.zzXH8 = i;
        this.zzXH7 = new PageRange[pageRangeArr.length];
        for (int i3 = 0; i3 < pageRangeArr.length; i3++) {
            this.zzXH7[i3] = pageRangeArr[i3].zzqM(i2);
        }
    }

    private boolean zzYpZ() {
        int i = this.zzXH9;
        if (i < 0) {
            if (this.zzXH7.length == 0) {
                return false;
            }
            this.zzXH9 = 0;
            this.zzbP = 0;
            return true;
        }
        if (this.zzXH7[i].zzYq7() + this.zzbP < this.zzXH7[this.zzXH9].zzYq6()) {
            this.zzbP++;
            return true;
        }
        int i2 = this.zzXH9;
        if (i2 >= this.zzXH7.length - 1) {
            return false;
        }
        this.zzXH9 = i2 + 1;
        this.zzbP = 0;
        return true;
    }

    private boolean zzYq0() {
        return next().intValue() % 2 != 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean zZzYpZ = zzYpZ();
        int i = this.zzXH8;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("Unknown parity type encountered.");
                }
                while (zZzYpZ && zzYq0()) {
                    zZzYpZ = zzYpZ();
                }
                return zZzYpZ;
            }
            while (zZzYpZ && !zzYq0()) {
                zZzYpZ = zzYpZ();
            }
        }
        return zZzYpZ;
    }

    @Override // com.aspose.words.zzYN3, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // com.aspose.words.zzYN3, java.util.Iterator
    public final Integer next() {
        return Integer.valueOf(this.zzXH7[this.zzXH9].zzYq7() + this.zzbP);
    }
}
