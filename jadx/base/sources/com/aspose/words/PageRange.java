package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class PageRange {
    private int zzXHi;
    private int zzXHj;

    public PageRange(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Page index must be positive.\r\nParameter name: from");
        }
        if (i2 < i) {
            throw new IllegalArgumentException("Index of the last page in range must not be less than the index of the first page.\r\nParameter name: to");
        }
        this.zzXHj = i;
        this.zzXHi = i2;
    }

    public final int zzYq6() {
        return this.zzXHi;
    }

    public final int zzYq7() {
        return this.zzXHj;
    }

    public final PageRange zzqM(int i) {
        if (i <= 0 || i == Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: documentPageCount");
        }
        int i2 = i - 1;
        int i3 = this.zzXHj;
        int i4 = this.zzXHi;
        if (i3 == Integer.MAX_VALUE) {
            i3 = i2;
        }
        if (i4 > i2) {
            i4 = i2;
        }
        if (i3 > i2) {
            throw new IllegalStateException("Index of the first page in range must be less than document page count.");
        }
        if (i4 >= i3) {
            return new PageRange(i3, i4);
        }
        throw new IllegalStateException("Index of the last page in range must not be less than the index of the first page.");
    }
}
