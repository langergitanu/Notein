package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzA4 {
    private boolean zzFH;
    private zz9H zzrc;

    public zzA4(zzG9 zzg9, zzG6 zzg6) {
        this.zzrc = new zz9H(zzg9, zzg6);
    }

    private zzOU zzZ2() {
        int iZzFq = this.zzrc.zzMK().zzFq();
        if (iZzFq != 1 && iZzFq != 11 && iZzFq != 13 && iZzFq != 16) {
            zzAk().zzI().zzZ(2, 3, "'{0}' binary raster operation is not supported.", zz9D.zzUQ(this.zzrc.zzMK().zzFq()));
            this.zzFH = true;
        }
        return this.zzrc.zzMK().zzZ2();
    }

    public final zzA1 zzAk() {
        return this.zzrc.zzA1().zzKp();
    }

    public final zz9H zzAl() {
        return this.zzrc;
    }

    public final void zzAm() throws Exception {
        zzPY zzpyZzZ1 = this.zzrc.zzMK().zzZ1();
        zzOU zzouZzZ2 = zzZ2();
        if (this.zzrc.zzMK().zzFm().zzzB() != null) {
            if (zzpyZzZ1 == null && zzouZzZ2 == null) {
                return;
            }
            this.zzrc.zzMK().zzFm().zzzC();
            zzZ(zzouZzZ2, zzpyZzZ1);
        }
    }

    public final void zzAn() throws Exception {
        zzOU zzouZzZ2 = zzZ2();
        if (this.zzrc.zzMK().zzFm().zzzB() == null || zzouZzZ2 == null) {
            return;
        }
        zzZ(zzouZzZ2, (zzPY) null);
    }

    public final void zzAo() throws Exception {
        zzPY zzpyZzZ1 = this.zzrc.zzMK().zzZ1();
        if (this.zzrc.zzMK().zzFm().zzzB() == null || zzpyZzZ1 == null) {
            return;
        }
        this.zzrc.zzMK().zzFm().zzzC();
        zzZ((zzOU) null, zzpyZzZ1);
    }

    public final void zzI(zzG zzg) throws Exception {
        this.zzrc.zzN(zzg);
    }

    public final void zzJ(zzG zzg) throws Exception {
        this.zzrc.zzM(zzg);
    }

    public final boolean zzML() {
        return this.zzFH;
    }

    public final zzG zzMN() {
        return this.zzrc.zzMt().zzMN();
    }

    public final void zzQ(zzP5 zzp5) throws Exception {
        zzP8 zzp8 = new zzP8(1);
        zzZQG.zzZ(zzp8.zzO7(), zzp5);
        zzZ(zzp8, true, false);
    }

    public final void zzZ(zz8O zz8o, zzOU zzou, zzPY zzpy) throws Exception {
        zzP8 zzp8 = new zzP8();
        for (int i = 0; i < zz8o.zzyF().getCount(); i++) {
            zzZQG.zzZ(zzp8.zzO7(), zzP5.zzK(zz8o.zzyF().zzT7(i)));
        }
        zzZ(zzp8, zzou, zzpy);
    }

    public final void zzt(zzZQ4 zzzq4) throws Exception {
        zzP8 zzp8ZzM = zzP8.zzM(zzzq4);
        zzPY zzpyZzZ1 = this.zzrc.zzMK().zzZ1();
        if (zzpyZzZ1 != null) {
            zzpyZzZ1 = new zzOI(this.zzrc.zzMK().zzOK());
        }
        zzZ(zzp8ZzM, (zzOU) null, zzpyZzZ1);
    }

    public final void zzu(zzZQ4 zzzq4) throws Exception {
        zzZ(zzP8.zzM(zzzq4), false, true);
    }

    public final void zzZ(zzZQ4 zzzq4, zzZQ4 zzzq42, byte[] bArr) throws Exception {
        zzZ(zzzq4, zzzq42, new zzP9(), bArr);
    }

    public final void zzZ(zzZQ4 zzzq4, zzZQ4 zzzq42, zzP9 zzp9, byte[] bArr) throws Exception {
        if (bArr == null) {
            return;
        }
        zzZP zzzp = new zzZP(zzZPY.zzG(r0.getLeft(), r0.getTop()), zzZPX.zzYA(zzEF.zzZT(bArr).getSize()), bArr);
        zzG zzg = new zzG();
        zzg.zzX(zzzp);
        zzg.zzW(zzp9.zzOo());
        zzG zzg2 = new zzG();
        zzg2.zzX((zzZL) zzg);
        zzg2.zzZ(zzP8.zzM(zzzq4));
        zzg2.zzW(zzP9.zzZ(zzzq4, zzzq42));
        this.zzrc.zzN(zzg2);
    }

    public final void zzZ(zzP8 zzp8, boolean z, boolean z2) throws Exception {
        zzZ(zzp8, z ? zzZ2() : null, z2 ? this.zzrc.zzMK().zzZ1() : null);
    }

    private void zzZ(zzP8 zzp8, zzOU zzou, zzPY zzpy) throws Exception {
        if (zzou == null && zzpy == null) {
            return;
        }
        zzZG zzzg = new zzZG(zzp8);
        zzzg.zzZ0().zzY1(zz9E.zzUU(this.zzrc.zzMK().zzO6()));
        zzzg.zzX(zzou);
        zzzg.zzY(zzpy);
        this.zzrc.zzN(zzzg);
    }

    public final void zzZ(long j, zzPV zzpv) throws Exception {
        long jZzR = this.zzrc.zzMK().zzFt().zzR(j);
        zzZG zzzgZzW = zzZG.zzW(new zzZQ4(Float.intBitsToFloat((int) jZzR) - 0.01f, zzZPY.zzYC(jZzR) - 0.01f, 0.02f, 0.02f));
        zzzgZzW.zzY(new zzOI(zzpv));
        this.zzrc.zzM(zzzgZzW);
    }

    public final void zzZ(zz85 zz85Var, int i) throws Exception {
        zzZP zzzpZzZ = this.zzrc.zzA0().zzZ(zz85Var, this.zzrc.zzMK().zzFt().zzMq().zzO(zzZQ4.zzN(zz85Var.zzJN())), i);
        if (zzzpZzZ != null) {
            this.zzrc.zzMt().zzM(zzzpZzZ);
        }
    }

    public final void zzZ(zzP8 zzp8, boolean z, boolean z2, int i) throws Exception {
        zzOU zzouZzZ2 = this.zzrc.zzMK().zzZ2();
        zzPY zzpyZzZ1 = z2 ? this.zzrc.zzMK().zzZ1() : null;
        if (zzouZzZ2 == null && zzpyZzZ1 == null) {
            return;
        }
        zzZG zzzg = new zzZG(zzp8);
        zzzg.zzZ0().zzY1(zz9E.zzUU(this.zzrc.zzMK().zzO6()));
        zzzg.zzX(zzouZzZ2);
        zzzg.zzY(zzpyZzZ1);
        zzzg.zzW(this.zzrc.zzMK().zzFt().zzMq());
        zzZP zzzpZzZ = this.zzrc.zzA0().zzZ(zzzg, this.zzrc.zzMK().zzFq(), i);
        if (zzzpZzZ != null) {
            this.zzrc.zzMt().zzM(zzzpZzZ);
        }
    }

    private void zzZ(zzOU zzou, zzPY zzpy) throws Exception {
        this.zzrc.zzMK().zzFm().zzzB().zzY(this.zzrc.zzMK().zzFt().zzMq().zzOo());
        zzZG zzzg = new zzZG(this.zzrc.zzMK().zzFm().zzzB());
        zzzg.zzZ0().zzY1(zz9E.zzUU(this.zzrc.zzMK().zzO6()));
        zzzg.zzX(zzou);
        zzzg.zzY(zzpy);
        this.zzrc.zzN(zzzg);
    }
}
