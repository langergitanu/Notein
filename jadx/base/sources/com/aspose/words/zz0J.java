package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz0J implements Cloneable {
    private com.aspose.words.internal.zzZQ4 zzG8 = com.aspose.words.internal.zzZQ4.zz2T;
    private boolean zzYXp;
    private zz11 zzZ5E;
    private zz07 zzZji;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void zzI(com.aspose.words.internal.zzZQ4 zzzq4) {
        this.zzG8 = zzzq4;
    }

    public final void zzX(zz11 zz11Var) {
        this.zzZ5E = zz11Var;
    }

    public final void zzZ(zz07 zz07Var) {
        this.zzZji = zz07Var;
    }

    public final zz11 zzZCZ() {
        if (this.zzZ5E == null) {
            this.zzZ5E = new zz11();
        }
        return this.zzZ5E;
    }

    public final zz07 zzZTh() {
        if (this.zzZji == null) {
            this.zzZji = new zz07();
        }
        return this.zzZji;
    }

    public final com.aspose.words.internal.zzZQ4 zzZj() {
        return this.zzG8;
    }

    public final void zzZsw() {
        this.zzYXp = true;
    }

    public final boolean zzZsx() {
        return this.zzYXp;
    }

    public final zz0J zzZsy() {
        zz0J zz0j = (zz0J) memberwiseClone();
        zz07 zz07Var = this.zzZji;
        if (zz07Var != null) {
            zz0j.zzZji = zz07Var.zzZAi();
        }
        zz11 zz11Var = this.zzZ5E;
        if (zz11Var != null) {
            zz0j.zzZ5E = zz11Var.zzZtM();
        }
        return zz0j;
    }
}
