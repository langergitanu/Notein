package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz69 {
    private boolean zzZ2v;
    private float zzZ2w;
    private zzZC9 zzZ2x;
    private zzZC9 zzZ2y;

    public zz69(zzZC9 zzzc9, zzZC9 zzzc92, float f, boolean z) {
        this.zzZ2y = zzzc9;
        this.zzZ2x = zzzc92;
        this.zzZ2w = f;
        this.zzZ2v = z;
    }

    private float zzX(zzZC9 zzzc9) {
        return this.zzZ2v ? zzzc9.zzZzs() : zzzc9.zzZzr();
    }

    private boolean zzZzv() {
        if (Float.isInfinite(zzX(this.zzZ2x))) {
            return true;
        }
        return !Float.isInfinite(zzX(this.zzZ2y)) && Math.abs(zzX(this.zzZ2y)) <= Math.abs(zzX(this.zzZ2x) * this.zzZ2w);
    }

    public final boolean zzZzu() {
        if (zzZzv()) {
            return false;
        }
        if (this.zzZ2v) {
            this.zzZ2y.zzYT(this.zzZ2x.zzZzs() * this.zzZ2w);
        } else {
            this.zzZ2y.zzYS(this.zzZ2x.zzZzr() * this.zzZ2w);
        }
        if (this.zzZ2x.zzZzk()) {
            this.zzZ2y.zzX9(true);
        }
        return true;
    }

    public final float zzZzw() {
        return this.zzZ2w;
    }

    public final zzZC9 zzZzx() {
        return this.zzZ2x;
    }

    public final zzZC9 zzZzy() {
        return this.zzZ2y;
    }
}
