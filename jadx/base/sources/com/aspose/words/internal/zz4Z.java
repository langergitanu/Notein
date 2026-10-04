package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz4Z extends zz6 {
    private int zzjN;
    private int zzjO;
    private zzZ zzjP;
    private zzHV zzjQ;
    private zz1L zzjR;
    private zz2G zzjS;
    private zz50 zzjT;
    private zz5E zzjU;
    private zz4W zzkV;

    public static class zzZ extends zzM {
        private zz4Z zzjM;

        public zzZ(zz4Z zz4z) {
            super(zz4z);
            this.zzjM = zz4z;
        }

        @Override // com.aspose.words.internal.zzM
        public final void zzZ(zzZ8 zzz8) throws Exception {
            this.zzjM.zzY(zzz8);
        }
    }

    public zz4Z(zz4W zz4w, zz5E zz5e) {
        this(zz4w, zz5e, null);
        this.zzjU = zz5e;
    }

    private static String zzG(zzZG zzzg) {
        StringBuilder sb = new StringBuilder();
        if (!zzT(zzzg.zzZ1()) && !zzO(zzzg.zzZ2())) {
            sb.append(zzzg.zzZ0().zzO9() ? 'b' : 'B');
            if (zzzg.zzZ0().zzO6() == 0) {
                sb.append('*');
            }
        } else if (!zzT(zzzg.zzZ1())) {
            sb.append('f');
            if (zzzg.zzZ0().zzO6() == 0) {
                sb.append('*');
            }
        } else if (zzO(zzzg.zzZ2())) {
            sb.append('n');
        } else {
            sb.append(zzzg.zzZ0().zzO9() ? 's' : 'S');
        }
        return sb.toString();
    }

    private static zzZQ4 zzH(zzZG zzzg) throws Exception {
        zzP9 zzp9ZzZO = zzzg.zzZO();
        zzzg.zzW((zzP9) null);
        zzZQ4 zzzq4ZzZ = new zzH().zzZ((zzZL) zzzg);
        zzzg.zzW(zzp9ZzZO);
        return zzzq4ZzZ;
    }

    private static boolean zzI(zzZG zzzg) {
        if (zzzg.zzZ2() == null || zzzg.zzZ2().zzZ1() == null || zzzg.zzZ2().zzZ1().zzPH() == 0) {
            return (zzzg.zzZ1() == null || zzzg.zzZ1().zzPH() == 0) ? false : true;
        }
        return true;
    }

    private static boolean zzO(zzOU zzou) {
        return zzou == null || zzT(zzou.zzZ1());
    }

    private void zzQ(zzZP zzzp) throws Exception {
        this.zzjR.zzvh();
        zzZQ4 zzzq4ZzZj = zzzp.zzZj();
        if (!zzEP.zzZ(zzzp.zzZd())) {
            zzzq4ZzZj = zzzp.zzZd().zzw(zzzq4ZzZj);
        }
        this.zzjT.zzvj().zzZ(zzzp.getImageBytes(), zzzq4ZzZj, zzzp.zzZd());
    }

    private static boolean zzT(zzPY zzpy) {
        return zzpy == null || zzpy.isEmpty();
    }

    private void zzW(zzHU zzhu, boolean z) throws Exception {
        if (z || zzZT.zzW(zzhu)) {
            this.zzjR.zzvh();
            this.zzjT.zzvi().zztY();
            this.zzjO--;
        }
    }

    private void zzX(zzHU zzhu, boolean z) throws Exception {
        if (z || zzZT.zzW(zzhu)) {
            this.zzjR.zzvh();
            this.zzjT.zzvi().zztZ();
            if (zzZT.zzV(zzhu)) {
                this.zzjT.zzvi().zzz(zzhu.zzZO());
            }
            if (zzZT.zzU(zzhu)) {
                zzhu.zzZN().zzY(new zz2G(this.zzjT.zzvl()));
                this.zzjT.zzvl().zzXV("W n");
            }
            int i = this.zzjO + 1;
            this.zzjO = i;
            if (i > this.zzjN) {
                this.zzjN = i;
            }
        }
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzY(zzG zzg) throws Exception {
        zzW(zzg, false);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZU zzzu) throws Exception {
        if (zzzu.isHidden()) {
            return;
        }
        zzX(zzzu, false);
        if (this.zzjQ != null && zzzu.zzZl() != null) {
            this.zzjQ.zzV(zzzu.zzZl());
        }
        zzB zzb = (zzB) zzZKW.zzZ(zzzu, zzB.class);
        if (zzb == null || !zzb.zzZC().zzoW()) {
            this.zzjR.zzQ(zzzu);
        } else {
            this.zzjR.zzZ(zzb);
        }
        zzW(zzzu, false);
    }

    public final int zzvg() {
        return this.zzjN;
    }

    public final void zzvh() throws Exception {
        this.zzjR.zzvh();
    }

    public final void zzY(zzZ8 zzz8) throws Exception {
        zz27 zz27VarZzX = this.zzjT.zzvk().zzX(zzz8);
        if (zz27VarZzX != null) {
            this.zzjT.zzvl().zzp("{0} sh", zz27VarZzX.zzF1());
        }
    }

    public zz4Z(zz4W zz4w, zz50 zz50Var, zzHV zzhv) {
        this.zzjO = 0;
        this.zzjN = 0;
        this.zzkV = zz4w;
        this.zzjT = zz50Var;
        this.zzjQ = zzhv;
        this.zzjR = new zz1L(zz4w, zz50Var.zzvl(), this.zzjT.zzvi(), this.zzjT.zzvk());
        this.zzjS = new zz2G(this.zzjT.zzvl());
        this.zzjP = new zzZ(this);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZP zzzp) throws Exception {
        zzZP zzzpZzZ = zzZO.zzZ(zzzp, this, this.zzkV.zzv2(), this.zzjT.zzvi().zztV().zzua());
        if (zzzpZzZ != null) {
            zzQ(zzzpZzZ);
        }
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzN zzn) throws Exception {
        zzn.zzZ(this.zzjP);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzG zzg) throws Exception {
        this.zzjR.zzvh();
        zzX(zzg, false);
        if (this.zzjQ == null || zzg.zzZM() == null) {
            return;
        }
        this.zzjQ.zzV(zzg.zzZM());
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZG zzzg) throws Exception {
        this.zzjR.zzvh();
        zzX(zzzg, zzI(zzzg));
        zzZQ4 zzzq4ZzH = zzH(zzzg);
        if (!zzT(zzzg.zzZ1())) {
            this.zzjT.zzvj().zzY(zzzg.zzZ1(), false, zzzq4ZzH);
            zz5E zz5e = this.zzjU;
            if (zz5e != null) {
                zz5e.zzZK(zz5e.zzvY() | (zzzg.zzZ1().zzPH() == 1));
            }
        }
        if (!zzO(zzzg.zzZ2())) {
            this.zzjT.zzvj().zzY(zzzg.zzZ2(), zzzq4ZzH);
        }
        zzzg.zzZ0().zzY(this.zzjS);
        this.zzjT.zzvl().zzXV(zzG(zzzg));
        zzW(zzzg, zzI(zzzg));
    }
}
