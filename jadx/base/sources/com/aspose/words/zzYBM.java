package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYBM {
    private boolean zzXeA;
    private int zzYQD;
    private int zzYQE;
    private boolean zzYQz;
    private boolean zzYS;
    private String zzZi;

    public zzYBM(String str, boolean z, boolean z2, int i, int i2) {
        zzZ(str, z, z2, i, i2);
    }

    public final int getLocaleIdBi() {
        return this.zzYQE;
    }

    public final int getNumeralFormat() {
        return this.zzYQD;
    }

    public final String getText() {
        return this.zzZi;
    }

    public final void setText(String str) {
        this.zzZi = str;
    }

    public final void zzYKR() {
        this.zzYQz = true;
    }

    public final boolean zzYKS() {
        return this.zzYQz;
    }

    public final void zzZ(String str, boolean z, boolean z2, int i, int i2) {
        this.zzZi = str;
        this.zzXeA = z;
        this.zzYS = z2;
        this.zzYQE = i;
        this.zzYQD = i2;
        this.zzYQz = false;
    }

    public final boolean zzZnY() {
        return this.zzXeA;
    }

    public final boolean zzZz() {
        return this.zzYS;
    }
}
