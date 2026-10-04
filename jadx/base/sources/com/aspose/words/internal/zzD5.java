package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzD5 {
    private zzD4 zzuJ = new zzD4();
    private zzD4 zzuI = new zzD4();

    private static int zzZ(zzD4 zzd4, int i, int i2) {
        return zzY1.zzS(zzZ(zzd4, i), i2);
    }

    public final int get(int i) {
        return zzVC(i);
    }

    public final void set(int i, int i2) {
        this.zzuJ.set(i, i2);
        this.zzuI.set(i2, i);
    }

    public final int zz0(int i, int i2) {
        return zzZ(this.zzuI, i, i2);
    }

    public final int zz1(int i, int i2) {
        return zzZ(this.zzuJ, i, i2);
    }

    public final void zz2(int i, int i2) {
        this.zzuJ.add(i, i2);
        this.zzuI.add(i2, i);
    }

    public final int zzVB(int i) {
        return zzZ(this.zzuI, i);
    }

    public final int zzVC(int i) {
        return zzZ(this.zzuJ, i);
    }

    private static int zzZ(zzD4 zzd4, int i) {
        if (i == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        int i2 = zzd4.get(i);
        if (zzD4.zzWm(i2)) {
            return Integer.MIN_VALUE;
        }
        return i2;
    }
}
