package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzCW extends zz80 implements Cloneable {
    private int zzZ9Q;
    private zzE3 zzZ9R;
    private zzD9 zzZyx;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final int getThickness() {
        return this.zzZ9Q;
    }

    public final void setThickness(int i) {
        this.zzZ9Q = i;
    }

    public final zzE3 zz3e() {
        return this.zzZ9R;
    }

    public final void zzZ(zzE3 zze3) {
        this.zzZ9R = zze3;
    }

    public final zzCW zzZHl() {
        zzCW zzcw = (zzCW) memberwiseClone();
        zzD9 zzd9 = this.zzZyx;
        if (zzd9 != null) {
            zzcw.zzZyx = zzd9.zzZI4();
        }
        zzE3 zze3 = this.zzZ9R;
        if (zze3 != null) {
            zzcw.zzZ9R = zze3.zzZL2();
        }
        zzcw.setExtensions(zzZBz());
        return zzcw;
    }

    public final zzD9 zzaQ() {
        if (this.zzZyx == null) {
            this.zzZyx = new zzD9();
        }
        return this.zzZyx;
    }
}
