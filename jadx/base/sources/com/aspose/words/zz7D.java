package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz7D extends com.aspose.words.internal.zz6 {
    private com.aspose.words.internal.zzG zzZ3p;
    private com.aspose.words.internal.zzPV zzZ3q;
    private double zzZ3r;
    private int zzZ3s;
    private com.aspose.words.internal.zzZQC<com.aspose.words.internal.zzG> zzeU = new com.aspose.words.internal.zzZQC<>();

    private zz7D(double d, com.aspose.words.internal.zzPV zzpv, int i) {
        this.zzZ3s = 0;
        this.zzZ3r = d;
        this.zzZ3q = zzpv;
        this.zzZ3s = i;
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        this.zzZ3p = zzg;
        this.zzeU.push(zzg);
    }

    public static com.aspose.words.internal.zzG zzZ(com.aspose.words.internal.zzG zzg, zz26 zz26Var, zzZC3 zzzc3) throws Exception {
        if (com.aspose.words.internal.zzAN.zzZD(zz26Var.zzZuO().zzZPS())) {
            return zzg;
        }
        int dmlEffectsRenderingMode = zzzc3.zzZw8().getDmlEffectsRenderingMode();
        com.aspose.words.internal.zzPV zzpvZzZ = zz26Var.zzZuO().zzZQX().zzZ(zzzc3.getThemeProvider(), (zzZCM) null);
        int iZzPD = zzpvZzZ.zzPD();
        if (dmlEffectsRenderingMode == 2) {
            zzpvZzZ = new com.aspose.words.internal.zzPV(255, zzpvZzZ);
        }
        zz7D zz7d = new zz7D(zz26Var.zzZuO().zzZPS(), zzpvZzZ, dmlEffectsRenderingMode);
        zzg.zzZ(zz7d);
        if (dmlEffectsRenderingMode == 0) {
            return zz7d.zzsD();
        }
        com.aspose.words.internal.zzG zzgZzsD = iZzPD == 255 ? zz7d.zzsD() : zz1E.zzZ(zz7d.zzsD(), iZzPD, 12700, zzzc3.getDocument());
        zz2I zz2i = new zz2I();
        zz2i.zzYL(zz26Var.zzXq(zz26Var.zzZuO().zzZPS() / 2.0d));
        return new zz2H(zz2i, zz26Var.zzZuZ()).zzv(zzgZzsD);
    }

    private void zzZAD() {
        this.zzeU.pop();
    }

    private com.aspose.words.internal.zzG zzsD() {
        return this.zzeU.peek();
    }

    private static com.aspose.words.internal.zzG zzx(com.aspose.words.internal.zzG zzg) {
        com.aspose.words.internal.zzG zzg2 = (com.aspose.words.internal.zzG) zzg.zz1();
        zzg2.zzZ((com.aspose.words.internal.zzP8) null);
        zzg2.clear();
        return zzg2;
    }

    private void zzy(com.aspose.words.internal.zzG zzg) {
        com.aspose.words.internal.zzG zzgZzx = zzx(zzg);
        zzsD().zzX((com.aspose.words.internal.zzZL) zzgZzx);
        this.zzeU.push(zzgZzx);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzY(com.aspose.words.internal.zzG zzg) {
        zzZAD();
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(com.aspose.words.internal.zzG zzg) {
        zzy(zzg);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(com.aspose.words.internal.zzZG zzzg) {
        if ((zzzg.zzZ1() == null || zzzg.zzZ1().isEmpty()) && (zzzg.zzZ2() == null || zzzg.zzZ2().zzZ1() == null || zzzg.zzZ2().zzZ1().isEmpty())) {
            return;
        }
        com.aspose.words.internal.zzZG zzzgZzYZ = zzzg.zzYZ();
        zzzgZzYZ.zzY((com.aspose.words.internal.zzPY) null);
        zzzgZzYZ.zzX(new com.aspose.words.internal.zzOU(this.zzZ3q, (float) this.zzZ3r));
        zzzgZzYZ.zzZ2().zzXW(2);
        if (this.zzZ3s == 0) {
            zzsD().zzX((com.aspose.words.internal.zzZL) zz1E.zzZ(zzzgZzYZ, this.zzZ3r, this.zzZ3q));
        } else {
            zzsD().zzX(zzzgZzYZ);
        }
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(com.aspose.words.internal.zzZP zzzp) {
        com.aspose.words.internal.zzZG zzzgZzW = com.aspose.words.internal.zzZG.zzW(zzzp.zzZj());
        zzzgZzW.zzX(new com.aspose.words.internal.zzOU(this.zzZ3q, (float) this.zzZ3r));
        zzzgZzW.zzZ2().zzXW(2);
        if (this.zzZ3s == 0) {
            zzsD().zzX((com.aspose.words.internal.zzZL) zz1E.zzZ(zzzgZzW, this.zzZ3r, this.zzZ3q));
        } else {
            zzsD().zzX(zzzgZzW);
        }
    }
}
