package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzYP9 extends zzYPQ {
    String zzXLC;
    String zzXLD;
    private int zzXLF;
    private String zzXLG;
    private zzYR2 zzXOv = new zzYR2();
    private boolean zzXLE = false;
    private PreferredWidth zzZvF = PreferredWidth.AUTO;

    public final PreferredWidth getPreferredWidth() {
        return this.zzZvF;
    }

    public final void setPreferredWidth(PreferredWidth preferredWidth) {
        this.zzZvF = preferredWidth;
    }

    public final void zzDP(String str) {
        this.zzXLG = str;
    }

    public final void zzS3(boolean z) {
        this.zzXLE = z;
    }

    public final boolean zzYtn() {
        return this.zzXLE;
    }

    public final int zzYto() {
        return this.zzXLF;
    }

    public final String zzYtp() {
        return this.zzXLG;
    }

    public final zzYR2 zzYvQ() {
        return this.zzXOv;
    }

    public final void zzrz(int i) {
        this.zzXLF = i;
    }
}
