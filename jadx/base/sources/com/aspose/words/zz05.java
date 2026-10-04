package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz05 {
    private com.aspose.words.internal.zzZQC<zz04> zzYX8 = new com.aspose.words.internal.zzZQC<>();

    public final void zzO(zz07 zz07Var) {
        this.zzYX8.push(zzZs9().zzN(zz07Var));
    }

    public final zz35 zzY(float f, float f2, boolean z) {
        zz04 zz04VarZzZs9 = zzZs9();
        return new zz35(zz04VarZzZs9.zzX(f, f2, z), zz04VarZzZs9.zzZs8());
    }

    public final zz04 zzZs9() {
        return this.zzYX8.size() == 0 ? new zz04() : this.zzYX8.peek();
    }

    public final void zzZsa() {
        if (this.zzYX8.size() > 0) {
            this.zzYX8.pop();
        }
    }
}
