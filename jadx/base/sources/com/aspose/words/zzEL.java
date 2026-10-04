package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzEL extends zzF3 {
    private double zzZrJ;

    public zzEL(int i, zzZCM zzzcm) {
        this(0, new int[]{i}, new zzZCM[]{zzzcm}, 0.0d);
    }

    public final double getLineWidth() {
        return this.zzZrJ;
    }

    public zzEL(int[] iArr, zzZCM[] zzzcmArr) {
        this(0, iArr, zzzcmArr, 0.0d);
    }

    public zzEL(int[] iArr, zzZCM zzzcm) {
        this(0, iArr, new zzZCM[]{zzzcm}, 0.0d);
    }

    public zzEL(int i, zzZCM zzzcm, byte b) {
        this(0, new int[]{i}, new zzZCM[]{zzzcm}, 0.0d);
    }

    public zzEL(int i, int[] iArr, zzZCM[] zzzcmArr, double d) {
        super(0, iArr, zzzcmArr);
        this.zzZrJ = d;
    }
}
