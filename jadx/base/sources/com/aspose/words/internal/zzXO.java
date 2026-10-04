package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzXO extends zzQX {
    private short zzVA;
    private short zzVB;
    private int zzVL;
    private int zzVN;
    private int zzVu;
    private int zzVv;
    private int zzVw;
    private int zzVx;
    private int zzVy;
    private int zzVz;

    public final int getHeight() {
        return this.zzVN;
    }

    public final int getWidth() {
        return this.zzVL;
    }

    public final void setHeight(int i) {
        this.zzVN = i;
    }

    public final void setWidth(int i) {
        this.zzVL = i;
    }

    public final void zzW(short s) {
        this.zzVA = s;
    }

    public final int zzWJ() {
        return this.zzVw;
    }

    public final int zzWK() {
        return this.zzVx;
    }

    public final int zzWL() {
        return this.zzVz;
    }

    public final short zzWM() {
        return this.zzVA;
    }

    public final int zzWN() {
        return zzEF.zzP(this.zzVz, this.zzVA & 65535, (int) (((long) this.zzVv) & 4294967295L));
    }

    public final void zzX(short s) {
        this.zzVB = s;
    }

    @Override // com.aspose.words.internal.zzQX
    public final void zzZ(zzZOW zzzow) throws Exception {
        zzzow.zzl(40);
        zzzow.zzl(this.zzVL);
        zzzow.zzl(this.zzVN);
        zzzow.zzK((short) (this.zzVB & 65535));
        zzzow.zzK((short) (this.zzVA & 65535));
        zzzow.zzl(this.zzVz);
        zzzow.zzl((int) (((long) this.zzVy) & 4294967295L));
        zzzow.zzl(this.zzVx);
        zzzow.zzl(this.zzVw);
        zzzow.zzl((int) (((long) this.zzVv) & 4294967295L));
        zzzow.zzl((int) (((long) this.zzVu) & 4294967295L));
    }

    public final void zzZR(int i) {
        this.zzVu = i;
    }

    public final void zzZS(int i) {
        this.zzVv = i;
    }

    public final void zzZT(int i) {
        this.zzVw = i;
    }

    public final void zzZU(int i) {
        this.zzVx = i;
    }

    public final void zzZV(int i) {
        this.zzVy = i;
    }

    public final void zzZW(int i) {
        this.zzVz = i;
    }
}
