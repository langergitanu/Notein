package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzV {
    private boolean zzs;
    private boolean zzt;
    private int zzu;
    private zzF4 zzv;
    private boolean zzw;
    private boolean zzx;
    private int zzC = 0;
    private int zzB = 100;
    private boolean zzA = true;
    private int zzz = 220;
    private int zzy = 0;

    public final boolean getDownsampleImages() {
        return this.zzA;
    }

    public final int getImageCompression() {
        return this.zzC;
    }

    public final int getJpegQuality() {
        return this.zzB;
    }

    public final void setDownsampleImages(boolean z) {
        this.zzA = z;
    }

    public final void setImageCompression(int i) {
        this.zzC = i;
    }

    public final void setJpegQuality(int i) {
        if (i < 0 || i > 100) {
            throw new IllegalArgumentException("value");
        }
        this.zzB = i;
    }

    public final boolean zzF() {
        return this.zzt;
    }

    public final boolean zzG() {
        return this.zzw;
    }

    public final int zzH() {
        return this.zzu;
    }

    public final zzF4 zzI() {
        return this.zzv;
    }

    public final boolean zzJ() {
        return this.zzx;
    }

    public final int zzK() {
        return this.zzy;
    }

    public final int zzL() {
        return this.zzz;
    }

    public final boolean zzM() {
        return this.zzs;
    }

    public final void zzS(int i) {
        this.zzu = i;
    }

    public final void zzT(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
        }
        this.zzy = i;
    }

    public final void zzU(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("value");
        }
        this.zzz = i;
    }

    public final void zzW(boolean z) {
        this.zzs = z;
    }

    public final void zzX(boolean z) {
        this.zzt = z;
    }

    public final void zzY(boolean z) {
        this.zzw = z;
    }

    public final void zzZ(boolean z) {
        this.zzx = z;
    }

    public final void zzZ(zzF4 zzf4) {
        this.zzv = zzf4;
    }
}
