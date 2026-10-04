package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzF3 {
    private int[] zzQi;
    private zzZCM[] zzZcS;
    private int zzZcT;

    public zzF3(int i, int i2, zzZCM zzzcm) {
        this(i, new int[]{i2}, new zzZCM[]{zzzcm});
    }

    public final int[] getColors() {
        return this.zzQi;
    }

    public final zzZCM[] zzZM8() {
        return this.zzZcS;
    }

    public final int zzZM9() {
        return this.zzZcT;
    }

    public zzF3(int i, int[] iArr, zzZCM zzzcm) {
        this(i, iArr, new zzZCM[]{zzzcm});
    }

    public zzF3(int i, int[] iArr, zzZCM[] zzzcmArr) {
        this.zzZcT = i;
        this.zzQi = iArr;
        this.zzZcS = zzzcmArr;
    }
}
