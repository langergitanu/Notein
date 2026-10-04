package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZPY {
    private boolean zzYDe;
    private int zzZn;

    public zzZPY(boolean z, boolean z2) {
        this.zzYDe = z;
        this.zzZn = z2 ? zzZcZ() : 0;
    }

    private int zzZcZ() {
        return this.zzYDe ? 1 : -1;
    }

    public final boolean zzZd0() {
        return this.zzZn == zzZcZ();
    }

    public final boolean zzZd1() {
        int i = this.zzYDe ? 0 : -1;
        int i2 = this.zzZn - 1;
        this.zzZn = i2;
        return i2 == i;
    }

    public final boolean zzZd2() {
        boolean z = this.zzYDe;
        int i = this.zzZn + 1;
        this.zzZn = i;
        return i == z;
    }
}
