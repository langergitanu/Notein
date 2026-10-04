package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz5U extends zz17 {
    private int zzZ53;

    public final void zzIU(int i) {
        this.zzZ53 = i;
    }

    public final zz4G zzR(zzGR zzgr) throws Exception {
        if (this.zzZ53 == 0 || zzgr.getThemeProvider() == null) {
            return new zz4G();
        }
        zz4G lineStyle = zzgr.getThemeProvider().getLineStyle(this.zzZ53 - 1);
        lineStyle.zzV(zzZQX());
        return lineStyle;
    }

    public final int zzZC7() {
        return this.zzZ53;
    }
}
