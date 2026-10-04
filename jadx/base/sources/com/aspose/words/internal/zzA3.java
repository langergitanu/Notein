package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzA3 {
    private zzA1 zzEg;
    private boolean zzFH;
    private zzA6 zzrb;

    public zzA3(zzA1 zza1, zzA6 zza6) {
        this.zzrb = zza6;
        this.zzEg = zza1;
    }

    private void zzAh() {
        this.zzEg.zzI().zzZ(1, 3, "Metafile cannot be correctly rendered as vector graphics. Fallback to bitmap rendering will be performed.");
    }

    private zzG zzAi() throws Exception {
        zz9X zz9x = new zz9X(this.zzEg);
        zz9x.play();
        return zz9x.zzAa();
    }

    public static zzA3 zzZ(zzA1 zza1, zzA6 zza6) {
        int iZzyX = zza1.zzAg().zzyX();
        if (iZzyX == 1 || iZzyX == 2) {
            return new zzZV2(zza1, zza6);
        }
        if (iZzyX == 3) {
            return new zzO9(zza1, zza6);
        }
        if (iZzyX == 4) {
            return new zzNF(zza1, zza6);
        }
        if (iZzyX == 5) {
            return new zzNP(zza1, zza6);
        }
        throw new IllegalStateException("Unknown metafile type.");
    }

    public final zzA6 zzAf() {
        return this.zzrb;
    }

    public final zz8T zzAg() {
        return this.zzEg.zzAg();
    }

    public zzG zzAj() throws Exception {
        if (this.zzrb.zzAs()) {
            zzG zzgZzN4 = zzN4();
            if (!this.zzFH || !this.zzrb.zzAr()) {
                return zzgZzN4;
            }
            zzAh();
        }
        return zzAi();
    }

    public final zzA1 zzKp() {
        return this.zzEg;
    }

    public final boolean zzML() {
        return this.zzFH;
    }

    public abstract zzG zzN4() throws Exception;

    public final zzG zzZN(long j) throws Exception {
        zzG zzgZzAj = zzAj();
        if (zzgZzAj == null) {
            return null;
        }
        zzZ(zzgZzAj, j);
        return zzgZzAj;
    }

    public final void zzZR(boolean z) {
        this.zzFH = z;
    }

    public static zzA3 zzZ(zz8T zz8t, zzA6 zza6, long j) {
        return zzZ(new zzA1(zz8t, zza6.zzAt(), zza6.getEmulateRasterOperations(), j), zza6);
    }

    private void zzZ(zzG zzg, long j) {
        if (zzg.zzZO() == null) {
            OooO0O0.OooO00o(zzg);
        }
        zzg.zzZO().zzZ(zzP9.zzZ(zzZQ4.zzN(this.zzEg.zzAg().zzyQ()), new zzZQ4(0L, j)), 1);
    }
}
