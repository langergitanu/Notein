package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYHC {
    private int zzXvO;
    private FontInfoCollection zzYSn;
    private com.aspose.words.internal.zzZYV<String> zzXvN = new com.aspose.words.internal.zzZYV<>();
    private com.aspose.words.internal.zzZYV<Integer> zzXvM = new com.aspose.words.internal.zzZYV<>();
    private com.aspose.words.internal.zzZYV<Integer> zzXvL = new com.aspose.words.internal.zzZYV<>();

    public zzYHC(FontInfoCollection fontInfoCollection, int i) {
        this.zzYSn = fontInfoCollection;
        this.zzXvO = i;
    }

    public final String zzB6(int i) {
        String str = this.zzXvN.get(i);
        if (str == null) {
            str = this.zzXvN.get(this.zzXvO);
        }
        if (str == null) {
            str = this.zzXvN.get(0);
        }
        if (str != null) {
            return str;
        }
        zzZ(i, new FontInfo(zzYEF.zzYdx()), 0);
        return this.zzXvN.get(i);
    }

    public final void zzZ(int i, FontInfo fontInfo, int i2) {
        if (i >= 0 && fontInfo != null) {
            com.aspose.words.internal.zzZYD.zzXk(fontInfo.getName());
        }
        this.zzYSn.zzW(fontInfo);
        this.zzXvN.set(i, fontInfo.getName());
        this.zzXvM.set(i, Integer.valueOf(fontInfo.getCharset()));
        this.zzXvL.set(i, Integer.valueOf(i2));
    }

    public final void zzoU(int i) {
        this.zzXvO = i;
    }

    public final int zzoV(int i) {
        return this.zzXvM.zzW(i, Integer.MIN_VALUE).intValue();
    }

    public final int zzoW(int i) {
        return !this.zzXvL.zzVE(i) ? this.zzXvL.zzW(this.zzXvO, 0).intValue() : this.zzXvL.zzW(i, 0).intValue();
    }
}
