package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzCV {
    private float zzZ9L;
    private zzFI zzZ9M;
    private zz49 zzZ9N;
    private zz49 zzZ9O;
    private zz30 zzZ9P;
    private zz30 zzZa5;
    private zzCL zzZyC;
    private zzD9 zzZyx;

    public zzCV(zzCL zzcl, zzD9 zzd9, zz30 zz30Var, zz49 zz49Var, zzFI zzfi, float f) {
        this.zzZyC = zzcl;
        this.zzZyx = zzd9;
        this.zzZa5 = zz30Var;
        this.zzZ9N = zz49Var;
        this.zzZ9M = zzfi;
        this.zzZ9L = f;
    }

    public final zzFI zzZHg() {
        return this.zzZ9M;
    }

    public final zz10 zzZHh() {
        zzCL zzcl = this.zzZyC;
        if (zzcl != null) {
            return zzcl.zzZHh();
        }
        return null;
    }

    public final zz49 zzZHi() {
        if (this.zzZ9O == null) {
            zzCL zzcl = this.zzZyC;
            zz49 zz49VarZzZxp = zzcl != null ? zzcl.zzZGt().zzZxp() : new zz49();
            this.zzZ9O = zz49VarZzZxp;
            zz49VarZzZxp.zzZ(this.zzZ9N);
        }
        return this.zzZ9O;
    }

    public final zz30 zzZHj() {
        if (this.zzZ9P == null) {
            zzCL zzcl = this.zzZyC;
            zz30 zz30VarZzZHj = zzcl != null ? zzcl.zzZHj() : new zz30();
            this.zzZ9P = zz30VarZzZHj;
            zz30VarZzZHj.zzU(this.zzZa5);
        }
        return this.zzZ9P;
    }

    public final float zzZHk() {
        return this.zzZ9L;
    }

    public final zzD9 zzaQ() {
        return this.zzZyx;
    }

    public final zzCL zzaR() {
        return this.zzZyC;
    }
}
