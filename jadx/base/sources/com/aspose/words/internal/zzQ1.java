package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzQ1 {
    private int zzKn;
    private zz0Q zzKo;

    public zzQ1(int i) {
        this.zzKn = i;
        this.zzKo = new zz0Q();
    }

    public static void zzZ(zzQ1 zzq1, zz0Q zz0q) {
        zzq1.zzKo = zz0q;
    }

    public final void clear() {
        this.zzKo.clear();
    }

    public final int getCount() {
        return this.zzKo.getCount() / this.zzKn;
    }

    public final void zzY(int i, int i2, long j) {
        this.zzKo.set((i * this.zzKn) + i2, j);
    }

    public final long zzr(int i, int i2) {
        return this.zzKo.get((i * this.zzKn) + i2);
    }

    public final void zzz(long j) {
        if (this.zzKo.zzB2() == 0) {
            this.zzKo.zzH(this.zzKn * 4);
        }
        this.zzKo.add(j);
    }

    public static int zzY(zzQ1 zzq1) {
        return zzq1.zzKn;
    }

    public static zz0Q zzZ(zzQ1 zzq1) {
        return zzq1.zzKo;
    }

    public zzQ1(int i, byte b) {
        this.zzKn = 4;
        this.zzKo = new zz0Q(i * 4);
    }
}
