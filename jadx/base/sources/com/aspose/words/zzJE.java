package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzJE extends zzJD {
    private float zzZil;

    public zzJE(float f) {
        this.zzZil = f;
    }

    @Override // com.aspose.words.zzJD
    public final void zzZ(zz65 zz65Var, zz65 zz65Var2, zz8Z zz8z) {
        if (Float.isInfinite(zz65Var.zzZze()) || Float.isInfinite(zz65Var2.zzZze())) {
            return;
        }
        if (zz65Var.zzZze() > zz65Var2.zzZze() * this.zzZil) {
            zz8z.zzZCH().zzZ(zz65Var2.zzZze() * this.zzZil, (zzZC9) zz65Var);
        } else {
            zz8z.zzZCH().zzZ(zz65Var.zzZze() / this.zzZil, (zzZC9) zz65Var2);
        }
    }

    @Override // com.aspose.words.zzJD
    public final boolean zzZSl() {
        return true;
    }
}
