package com.aspose.words;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes6.dex */
public class PageSavingArgs {
    private boolean zzXHc;
    private String zzXHd;
    private com.aspose.words.internal.zzZOP zzXHe;
    private int zzdA;

    public boolean getKeepPageStreamOpen() {
        return this.zzXHc;
    }

    public String getPageFileName() {
        return this.zzXHd;
    }

    public int getPageIndex() {
        return this.zzdA;
    }

    public OutputStream getPageStream() {
        return com.aspose.words.internal.zzZOP.zzZF(this.zzXHe);
    }

    public void setKeepPageStreamOpen(boolean z) {
        this.zzXHc = z;
    }

    public void setPageFileName(String str) {
        this.zzXHd = str;
    }

    public final void setPageIndex(int i) {
        this.zzdA = i;
    }

    public void setPageStream(OutputStream outputStream) {
        this.zzXHe = com.aspose.words.internal.zzZOP.zzY(outputStream);
    }

    public final zzY3P zzZVm() {
        return new zzY3P(this.zzXHe, this.zzXHc);
    }

    public final boolean zzro() {
        return this.zzXHe != null;
    }
}
