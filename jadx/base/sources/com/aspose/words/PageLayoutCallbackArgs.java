package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class PageLayoutCallbackArgs {
    private int zzXHE;
    private zzZYW zzYgl;
    private zzYMD zzYgm;
    private Document zzZEY;

    public PageLayoutCallbackArgs(Document document, zzZYW zzzyw, zzYMD zzymd, int i) {
        this.zzZEY = document;
        this.zzYgl = zzzyw;
        this.zzYgm = zzymd;
        this.zzXHE = i;
    }

    public Document getDocument() {
        return this.zzZEY;
    }

    public int getEvent() {
        return this.zzXHE;
    }

    public int getPageIndex() {
        zzYMD zzymd = this.zzYgm;
        if (zzymd != null) {
            return zzymd.zzZ8m().getIndex();
        }
        return -1;
    }
}
