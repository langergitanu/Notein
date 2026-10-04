package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzN extends zzZL {
    private zzZL zzZX;

    @Override // com.aspose.words.internal.zzZL
    public final zzZL zz1() {
        return zz2();
    }

    public abstract zzN zz2();

    public abstract zzZL zz3();

    public abstract void zzX(zzP9 zzp9);

    public final void zzY(zz6 zz6Var) throws Exception {
        if (this.zzZX == null) {
            this.zzZX = zz3();
        }
        this.zzZX.zzZ(zz6Var);
    }

    @Override // com.aspose.words.internal.zzZL
    public final void zzZ(zz6 zz6Var) throws Exception {
        zz6Var.zzZ(this);
    }

    public abstract void zzZ(zzM zzm) throws Exception;

    public final void zzY(zzP9 zzp9) {
        zzX(zzp9);
        this.zzZX = null;
    }
}
