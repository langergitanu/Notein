package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz68 {
    private float zzHV;
    private zzZC9 zzZ2y;

    public zz68(zzZC9 zzzc9, float f) {
        this.zzZ2y = zzzc9;
        this.zzHV = f;
    }

    public final float zzPv() {
        return this.zzHV;
    }

    public final boolean zzZzv() {
        return Float.isInfinite(this.zzHV) || Math.abs(this.zzZ2y.zzZzs()) <= Math.abs(this.zzHV);
    }

    public final zzZC9 zzZzy() {
        return this.zzZ2y;
    }
}
