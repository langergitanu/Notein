package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz7U extends zz17 {
    private int zzZ53;

    private zz7X zzT(zzZ90 zzz90) {
        if (zzz90 == null) {
            return null;
        }
        return zzz90.getFillStyle(this.zzZ53 - 1);
    }

    private zz7X zzU(zzZ90 zzz90) {
        if (zzz90 == null) {
            return null;
        }
        return zzz90.getBackgroundFillStyle(this.zzZ53 - 1001);
    }

    private zz7X zzV(zzGR zzgr) throws Exception {
        int i = this.zzZ53;
        zz7X zz7xZzU = (i <= 0 || i > 999) ? i >= 1001 ? zzU(zzgr.getThemeProvider()) : null : zzT(zzgr.getThemeProvider());
        return zz7xZzU == null ? new zz54() : zz7xZzU;
    }

    public final void zzIU(int i) {
        this.zzZ53 = i;
    }

    public final zz7X zzW(zzGR zzgr) throws Exception {
        zz7X zz7xZzV = zzV(zzgr);
        zz7xZzV.zzV(zzZQX());
        return zz7xZzV;
    }

    public final int zzZC7() {
        return this.zzZ53;
    }
}
