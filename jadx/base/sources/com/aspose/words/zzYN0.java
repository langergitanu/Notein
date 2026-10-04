package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYN0 extends zzYN4 {
    private PageRange[] zzXH7;
    private int zzXH8;

    public zzYN0(int i, PageRange... pageRangeArr) {
        this.zzXH8 = i;
        this.zzXH7 = zzZ(pageRangeArr);
    }

    private static PageRange[] zzZ(PageRange[] pageRangeArr) {
        PageRange[] pageRangeArr2 = new PageRange[pageRangeArr.length];
        for (int i = 0; i < pageRangeArr.length; i++) {
            pageRangeArr2[i] = pageRangeArr[i];
        }
        return pageRangeArr2;
    }

    @Override // com.aspose.words.zzYN4
    public final zzYN3 zzqI(int i) {
        return new zzYMZ(this.zzXH8, this.zzXH7, i);
    }
}
