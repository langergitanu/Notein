package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYOT {
    private Object zzXKA;
    private Object zzXKB;

    public final void zzWv(double d) {
        this.zzXKA = Double.valueOf(d);
    }

    public final void zzWw(double d) {
        this.zzXKB = Double.valueOf(d);
    }

    public final boolean zzYsR() {
        return this.zzXKA != null;
    }

    public final boolean zzYsS() {
        return this.zzXKB != null;
    }

    public final double zzYsT() {
        if (zzYsR()) {
            return ((Double) this.zzXKA).doubleValue();
        }
        return 0.0d;
    }

    public final double zzYsU() {
        if (zzYsS()) {
            return ((Double) this.zzXKB).doubleValue();
        }
        return 0.0d;
    }
}
