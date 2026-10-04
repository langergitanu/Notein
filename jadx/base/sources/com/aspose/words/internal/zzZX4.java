package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZX4 {
    private boolean zz9q;
    private boolean zz9r;
    private boolean zz9s;
    private int zz9t;
    private int zz9u;
    private int zzdo;
    private int zzdp;

    public zzZX4(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        this.zz9u = i;
        this.zz9t = i2;
        this.zzdp = i3;
        this.zzdo = i4;
        this.zz9s = z;
        this.zz9r = z2;
    }

    public final int getX() {
        return this.zzdp;
    }

    public final int getY() {
        return this.zzdo;
    }

    public final void translate(int i, int i2) {
        this.zzdp += i;
        this.zzdo += i2;
    }

    public final void zzoL() {
        this.zz9q = true;
    }

    public final boolean zzoM() {
        return this.zz9q;
    }

    public final boolean zzoN() {
        return this.zz9r;
    }

    public final boolean zzoO() {
        return this.zz9s;
    }

    public final int zzoP() {
        return this.zz9t;
    }

    public final int zzoQ() {
        return this.zz9u;
    }
}
