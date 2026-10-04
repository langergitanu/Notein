package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYRF {
    private Object zzXOr;
    private Object zzXOs;

    public final void zzWE(double d) {
        this.zzXOr = Double.valueOf(d);
    }

    public final void zzWF(double d) {
        this.zzXOs = Double.valueOf(d);
    }

    public final boolean zzYvL() {
        return this.zzXOr != null;
    }

    public final boolean zzYvM() {
        return this.zzXOs != null;
    }

    public final double zzYvN() {
        if (zzYvL()) {
            return ((Double) this.zzXOr).doubleValue();
        }
        return 0.0d;
    }

    public final double zzYvO() {
        if (zzYvM()) {
            return ((Double) this.zzXOs).doubleValue();
        }
        return 0.0d;
    }
}
