package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class PageSet {
    private zzYN4 zzXHb;

    public PageSet(int i) {
        this.zzXHb = new zzYN2(i);
    }

    public static PageSet getAll() {
        return new PageSet(0, new PageRange(0, Integer.MAX_VALUE));
    }

    public static PageSet getEven() {
        return new PageSet(1, new PageRange(0, Integer.MAX_VALUE));
    }

    public static PageSet getOdd() {
        return new PageSet(2, new PageRange(0, Integer.MAX_VALUE));
    }

    public final zzYN4 zzYq1() {
        return this.zzXHb;
    }

    public PageSet(int... iArr) {
        this.zzXHb = new zzYN2(iArr);
    }

    public PageSet(PageRange... pageRangeArr) {
        this(0, pageRangeArr);
    }

    private PageSet(int i, PageRange... pageRangeArr) {
        this.zzXHb = new zzYN0(i, pageRangeArr);
    }
}
