package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzBA extends zzBC {
    private zz65 zzZ7N;

    public zzBA(float f, zz65 zz65Var) {
        super(f, zz65Var);
        this.zzZ7N = zz65Var;
    }

    @Override // com.aspose.words.zzBC
    public final void apply() {
        this.zzZ7N.zzYQ(zzPv());
        if (Math.abs(this.zzZ7N.zzZzs()) > Math.abs(zzPv())) {
            this.zzZ7N.zzYT(zzPv());
            this.zzZ7N.zzX9(true);
        }
    }
}
