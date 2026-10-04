package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzAW {
    private double zzZ7y;
    private double zzZ7z;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!com.aspose.words.internal.zzZ4.zzW(this, obj)) {
            return false;
        }
        zzAW zzaw = (zzAW) obj;
        return com.aspose.words.internal.zzAN.zzL(zzaw.zzZ7z, this.zzZ7z) && com.aspose.words.internal.zzAN.zzL(zzaw.zzZ7y, this.zzZ7y);
    }

    public final int hashCode() {
        return com.aspose.words.internal.zzZKP.zzZ9(this.zzZ7z) ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzZ7y);
    }

    public final void zzXX(double d) {
        this.zzZ7y = d;
    }

    public final void zzXY(double d) {
        this.zzZ7z = d;
    }

    public final zzAW zzZET() {
        zzAW zzaw = new zzAW();
        zzaw.zzZ7y = this.zzZ7y;
        zzaw.zzZ7z = this.zzZ7z;
        return zzaw;
    }

    public final double zzZEU() {
        return this.zzZ7y;
    }

    public final double zzZEV() {
        return this.zzZ7z;
    }
}
