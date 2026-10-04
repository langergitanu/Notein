package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz8G {
    private byte zzoW;
    private byte zzoX;
    private byte zzoY;
    private byte zzoZ;

    public zz8G() {
    }

    public final int zzyf() {
        return ((this.zzoZ & 255) << 24) | ((this.zzoY & 255) << 16) | ((this.zzoX & 255) << 8) | (this.zzoW & 255);
    }

    public final byte zzyg() {
        return this.zzoW;
    }

    public final byte zzyh() {
        return this.zzoX;
    }

    public final byte zzyi() {
        return this.zzoY;
    }

    public final byte zzyj() {
        return this.zzoZ;
    }

    public final boolean zzyk() {
        return (this.zzoZ & 255) == 255 && (this.zzoY & 255) == 255 && (this.zzoX & 255) == 255 && (this.zzoW & 255) == 255;
    }

    public final boolean zzyl() {
        return (this.zzoZ & 255) == 255 && this.zzoY == 0 && this.zzoX == 0 && this.zzoW == 0;
    }

    public zz8G(byte b, byte b2, byte b3, byte b4) {
        this.zzoZ = b;
        this.zzoY = b2;
        this.zzoX = b3;
        this.zzoW = b4;
    }

    public zz8G(int i, int i2, int i3, int i4) {
        this((byte) i, (byte) i2, (byte) i3, (byte) i4);
    }

    public zz8G(int i) {
        this((i >> 24) & 255, (i >> 16) & 255, (i >> 8) & 255, i & 255);
    }

    public zz8G(zz8G zz8g, byte b) {
        this(b, zz8g.zzoY, zz8g.zzoX, zz8g.zzoW);
    }
}
