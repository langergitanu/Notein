package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzDN implements Cloneable {
    private boolean zzZaT;
    private boolean zzZaU;
    private boolean zzZaV;
    private boolean zzZaW;
    private boolean zzZaX;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void zzXE(boolean z) {
        this.zzZaT = z;
    }

    public final void zzXF(boolean z) {
        this.zzZaU = z;
    }

    public final void zzXG(boolean z) {
        this.zzZaV = z;
    }

    public final void zzXH(boolean z) {
        this.zzZaW = z;
    }

    public final void zzXI(boolean z) {
        this.zzZaX = z;
    }

    public final boolean zzZIK() {
        return this.zzZaX || this.zzZaW || this.zzZaV || this.zzZaU || this.zzZaT;
    }

    public final boolean zzZIL() {
        return this.zzZaT;
    }

    public final boolean zzZIM() {
        return this.zzZaU;
    }

    public final boolean zzZIN() {
        return this.zzZaV;
    }

    public final boolean zzZIO() {
        return this.zzZaW;
    }

    public final boolean zzZIP() {
        return this.zzZaX;
    }

    public final zzDN zzZIQ() {
        return (zzDN) memberwiseClone();
    }
}
