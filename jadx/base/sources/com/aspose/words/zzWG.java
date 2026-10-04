package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzWG {
    private boolean zzZzs;
    private boolean zzZzt;
    private double zzZzu;
    private int zzZzv;
    private boolean zzZzw;
    private zzWH[] zzZzx;
    private Row zzZzy;

    public zzWG(int i, Row row) {
        this.zzZzx = new zzWH[i];
        this.zzZzy = row;
    }

    public final boolean isHeading() {
        return this.zzZzt;
    }

    public final void zz4T() {
        this.zzZzs = true;
    }

    public final boolean zz4U() {
        return this.zzZzs;
    }

    public final double zz4V() {
        return this.zzZzu;
    }

    public final int zz4W() {
        return this.zzZzv;
    }

    public final boolean zz4X() {
        return this.zzZzw;
    }

    public final zzWH[] zz4Y() {
        return this.zzZzx;
    }

    public final Row zz4Z() {
        return this.zzZzy;
    }

    public final void zzOh(int i) {
        this.zzZzv = i;
    }

    public final void zzYv(boolean z) {
        this.zzZzt = z;
    }

    public final void zzYw(boolean z) {
        this.zzZzw = z;
    }

    public final void zzZ3(double d) {
        this.zzZzu = d;
    }
}
