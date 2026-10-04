package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class PdfLoadOptions extends LoadOptions {
    private boolean zzXFa;
    private int zzXFb = Integer.MAX_VALUE;
    private int zzdA;

    public int getPageCount() {
        return this.zzXFb;
    }

    public int getPageIndex() {
        return this.zzdA;
    }

    public boolean getSkipPdfImages() {
        return this.zzXFa;
    }

    public void setPageCount(int i) {
        this.zzXFb = i;
    }

    public void setPageIndex(int i) {
        this.zzdA = i;
    }

    public void setSkipPdfImages(boolean z) {
        this.zzXFa = z;
    }
}
