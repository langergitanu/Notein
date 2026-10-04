package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz0U implements Cloneable {
    private zz7P zzYXR;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void zzV(zz7P zz7p) {
        if (zz7p == null) {
            return;
        }
        this.zzYXR = zz7p;
    }

    public final zz0U zzZtc() {
        zz0U zz0u = (zz0U) memberwiseClone();
        zz7P zz7p = this.zzYXR;
        if (zz7p != null) {
            zz0u.zzYXR = zz7p.zzZAZ();
        }
        return zz0u;
    }

    public final boolean zzZtd() {
        return this.zzYXR == null;
    }

    public final zz7P zzZw1() {
        return this.zzYXR;
    }
}
