package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzOS extends zzMG {
    private zzNV zzZpW;
    private String zzZpX;

    public zzOS(String str, zzNV zznv) {
        super(1);
        com.aspose.words.internal.zzZYD.zzXk(str);
        this.zzZpX = str;
        this.zzZpW = zznv;
    }

    public final String getUrl() {
        return this.zzZpX;
    }

    public final zzNV zzZW1() {
        return this.zzZpW;
    }

    @Override // com.aspose.words.zzMG
    public final String zzZXu() {
        return "@import url('" + this.zzZpX + "') " + this.zzZpW + ";";
    }
}
