package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zz2F {
    private boolean zzYZ6;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return com.aspose.words.internal.zzZ4.zzW(this, obj) && ((zz2F) obj).zzZvh() == zzZvh();
    }

    public int hashCode() {
        return zzZvh();
    }

    public boolean isEmpty() {
        return false;
    }

    public final void zzWK(boolean z) {
        this.zzYZ6 = z;
    }

    public final boolean zzZv8() {
        return this.zzYZ6;
    }

    public abstract int zzZvh();

    public abstract zz2F zzZvi();
}
