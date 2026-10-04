package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZGR {
    private com.aspose.words.internal.zzD3<zzZG9> zzYpj = new com.aspose.words.internal.zzD3<>();
    private String zzYpk;
    private zzZGO zzYpl;
    private int zzZch;

    public zzZGR(zzZGO zzzgo, int i, String str) {
        this.zzYpl = zzzgo;
        this.zzZch = i;
        this.zzYpk = str;
    }

    public static void zzN(zzYEF zzyef) {
        zzyef.remove(230);
        zzyef.remove(235);
        zzyef.remove(240);
        zzyef.remove(270);
    }

    private zzZG9 zzzo(int i) {
        if (this.zzYpj.zzVE(i)) {
            return this.zzYpj.get(i);
        }
        zzZG9 zzzg9 = new zzZG9();
        this.zzYpj.add(i, zzzg9);
        return zzzg9;
    }

    public final void setNumberFormat(String str) {
        zzzo(this.zzYpl.getListLevelNumber()).zzZ(new zzZG2(str));
    }

    public final void zzWX(int i, int i2) {
        if (i != this.zzYpl.getListLevelNumber()) {
            zzzo(i).zzZ(new zzZJ1(i2));
        } else {
            zzzo(i).zzZ(new zzZG5(i2));
        }
    }

    public final void zzWY(int i, int i2) {
        zzzo(i).zzZ(new zzZG0(i2));
    }

    public final void zzX(zzZGB zzzgb) throws Exception {
        zzzgb.zzzg(this.zzYpl.getListLevelNumber());
        com.aspose.words.internal.zzD3<zzZG9>.zzZ zzzZzCK = this.zzYpj.zzCK();
        while (zzzZzCK.moveNext()) {
            zzzZzCK.zzCI().zzY(zzzgb.zzzf(zzzZzCK.zzCM()));
        }
        zzZ(zzzgb);
    }

    public final boolean zzY(zzZGB zzzgb) {
        com.aspose.words.internal.zzD3<zzZG9>.zzZ zzzZzCK = this.zzYpj.zzCK();
        while (zzzZzCK.moveNext()) {
            if (!zzzZzCK.zzCI().zzZ(zzzgb.zzzf(zzzZzCK.zzCM()))) {
                return false;
            }
        }
        return true;
    }

    public abstract void zzZ(zzZGB zzzgb) throws Exception;

    public final int zzZ1s() {
        return this.zzZch;
    }

    public final String zzZ1t() {
        return this.zzYpk;
    }

    public final zzZGO zzZ1u() {
        return this.zzYpl;
    }

    public final boolean zzZWD() {
        return this.zzZch == 2;
    }

    public final void zzzp(int i) {
        zzzo(this.zzYpl.getListLevelNumber()).zzZ(new zzZFP(i));
    }

    public final void zzzq(int i) {
        zzzo(this.zzYpl.getListLevelNumber()).zzZ(new zzZGM(i));
    }
}
