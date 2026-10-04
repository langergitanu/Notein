package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzCQ extends zz80 implements Cloneable {
    private zzE8 zzZ9D;
    private zzEH zzZyA;
    private zzCL zzZyC;
    private zzD9 zzZyx;
    private zzCM zzZyy;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    private boolean zz3x() {
        return this.zzZyA != null;
    }

    public final zzCM zz3u() {
        return this.zzZyy;
    }

    public final boolean zz3v() {
        if (zz3x()) {
            return this.zzZyA.zzZLj() || this.zzZyA.zzZLi();
        }
        return false;
    }

    public final boolean zz3w() {
        if (zz3x()) {
            return this.zzZyA.zzZLl() || this.zzZyA.zzZLk();
        }
        return false;
    }

    public final zzEH zz3y() {
        return this.zzZyA;
    }

    public final zzE8 zz4d() {
        return this.zzZ9D;
    }

    public final void zzZ(zzEH zzeh) {
        this.zzZyA = zzeh;
    }

    public final zzCQ zzZGJ() {
        zzCQ zzcq = (zzCQ) memberwiseClone();
        zzEH zzeh = this.zzZyA;
        if (zzeh != null) {
            zzcq.zzZyA = zzeh.zzZLr();
        }
        zzE8 zze8 = this.zzZ9D;
        if (zze8 != null) {
            zzcq.zzZ9D = zze8.zzZLc();
        }
        zzD9 zzd9 = this.zzZyx;
        if (zzd9 != null) {
            zzcq.zzZyx = zzd9.zzZI4();
        }
        zzCM zzcm = this.zzZyy;
        if (zzcm != null) {
            zzcq.zzZyy = zzcm.zzZGB();
        }
        zzCL zzcl = this.zzZyC;
        if (zzcl != null) {
            zzcq.zzZyC = zzcl.zzZGr();
        }
        zzcq.setExtensions(zzZBz());
        return zzcq;
    }

    public final zzD9 zzaQ() {
        if (this.zzZyx == null) {
            this.zzZyx = new zzD9();
        }
        return this.zzZyx;
    }

    public final zzCL zzaR() {
        if (this.zzZyC == null) {
            this.zzZyC = new zzCL();
        }
        return this.zzZyC;
    }

    public final void zzZ(zzE8 zze8) {
        this.zzZ9D = zze8;
    }

    public final void zzZ(zzCM zzcm) {
        this.zzZyy = zzcm;
    }
}
