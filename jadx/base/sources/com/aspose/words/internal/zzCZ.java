package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzCZ {
    private int zzZF;
    private float[] zzuq;
    private long[] zzur;
    private boolean zzus;
    private boolean zzut;
    private boolean zzuw;

    public zzCZ(boolean z, boolean z2, boolean z3, int i, long[] jArr, float[] fArr) {
        this.zzuw = z;
        this.zzut = z2;
        this.zzus = z3;
        this.zzZF = i;
        this.zzur = jArr;
        this.zzuq = fArr;
    }

    public static zzCZ zzCD() {
        return new zzCZ(false, false, false, 0, null, null);
    }

    public final float[] zzCB() {
        return this.zzuq;
    }

    public final long[] zzCC() {
        return this.zzur;
    }

    public final boolean zzCG() {
        return this.zzuw;
    }
}
