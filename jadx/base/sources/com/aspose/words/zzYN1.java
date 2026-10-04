package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYN1 extends zzYN3 implements Iterator<Integer> {
    private int zzXH9 = -1;
    private int[] zzXHa;

    public zzYN1(int[] iArr, int i) {
        int i2 = i - 1;
        this.zzXHa = new int[iArr.length];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            int i4 = iArr[i3];
            if (i4 == Integer.MAX_VALUE) {
                i4 = i2;
            } else if (i4 >= i) {
                throw new IllegalArgumentException("Page index exceeds the index of the last page in the document.\r\nParameter name: pageIndex");
            }
            this.zzXHa[i3] = i4;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.zzXH9 + 1;
        this.zzXH9 = i;
        return i < this.zzXHa.length;
    }

    @Override // com.aspose.words.zzYN3, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // com.aspose.words.zzYN3, java.util.Iterator
    public final Integer next() {
        return Integer.valueOf(this.zzXHa[this.zzXH9]);
    }
}
