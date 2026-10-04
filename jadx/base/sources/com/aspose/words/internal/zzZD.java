package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZD extends zz6 implements zzH2 {
    private int zzYe;
    private int zzYf;
    private int zzYg;
    private float zzYh;
    private float zzYi;
    private float zzYj;
    private boolean zzYk;

    private void zzS(long j) {
        zzZ(Float.intBitsToFloat((int) j));
        zzZ(zzZPW.zzYz(j));
    }

    private void zzT(zzP9 zzp9) {
        if (zzp9 == null) {
            return;
        }
        zzZ(zzp9.zzOf());
        zzZ(zzp9.zzOe());
        zzZ(zzp9.zzOd());
        zzZ(zzp9.zzOc());
        zzZ(zzp9.zzOb());
        zzZ(zzp9.zzOa());
    }

    private void zzU(zzZQ4 zzzq4) {
        zzZ(zzzq4.zzZo());
        zzZ(zzzq4.zzZm());
        zzZ(zzzq4.zzkw());
        zzZ(zzzq4.zzZn());
    }

    private void zzV(zzOU zzou) {
        if (zzou == null) {
            return;
        }
        zzZ(zzou.getWidth());
    }

    private void zzW(zzL zzl) {
        if (zzl == null) {
            return;
        }
        zzU(zzl.zzZZ());
    }

    private void zzYW() {
        this.zzYj = 0.0f;
        this.zzYi = 0.0f;
        this.zzYh = 0.0f;
        this.zzYg = 0;
        this.zzYf = 0;
        this.zzYe = 0;
    }

    public final void zzQ(zzZL zzzl) throws Exception {
        zzYW();
        this.zzYk = false;
        zzzl.zzZ(this);
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzY(zzP5 zzp5) {
        return true;
    }

    public final float zzYU() {
        return this.zzYh;
    }

    public final float zzYV() {
        return this.zzYj;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(zzP5 zzp5) {
        return true;
    }

    private void zzY(float f) {
        if (Math.abs(f) > this.zzYi) {
            this.zzYi = Math.abs(f);
        }
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzG zzg) throws Exception {
        this.zzYg++;
        zzW(zzg.zzZM());
        zzT(zzg.zzZN());
        zzT(zzg.zzZO());
    }

    private void zzY(zzPM zzpm) {
        this.zzYh = Math.max(this.zzYh, zzpm.zzPg());
    }

    private void zzU(long j) {
        zzZ(Float.intBitsToFloat((int) j));
        zzZ(zzZPY.zzYC(j));
    }

    private void zzZ(float f) {
        if (Math.abs(f) > this.zzYj) {
            this.zzYj = Math.abs(f);
        }
    }

    private void zzT(zzP8 zzp8) throws Exception {
        if (zzp8 == null) {
            return;
        }
        this.zzYk = true;
        zzp8.zzY(this);
        this.zzYk = false;
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZU zzzu) throws Exception {
        if (zzzu.isHidden()) {
            return;
        }
        this.zzYg++;
        zzY(zzzu.zzZr());
        zzT(zzzu.zzZN());
        zzT(zzzu.zzZO());
        zzU(zzzu.zzZT());
        zzS(zzzu.getSize());
    }

    private void zzT(long j) {
        zzY(Float.intBitsToFloat((int) j));
        zzY(zzZPY.zzYC(j));
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZG zzzg) throws Exception {
        zzZQ4 zzzq4ZzY = zzZQ4.zz2T;
        if (zzzg.zzZ1() != null && zzzg.zzZ1().zzPH() == 4) {
            zzzq4ZzY = zzP6.zzY(zzzg.zzZ0(), 0.0f);
        }
        zzV(zzzg.zzZ2());
        zzZ(zzzg.zzZ1(), zzzq4ZzY);
        zzT(zzzg.zzZN());
        zzT(zzzg.zzZO());
        zzzg.zzZ0().zzY(this);
    }

    private void zzZ(zzPY zzpy, zzZQ4 zzzq4) throws Exception {
        if (zzpy == null) {
            return;
        }
        int iZzPH = zzpy.zzPH();
        if (iZzPH == 3) {
            zzU(((zzPA) zzpy).zzOw());
            return;
        }
        if (iZzPH != 4) {
            if (iZzPH != 5) {
                return;
            }
            zzP0 zzp0 = (zzP0) zzpy;
            zzU(zzp0.zzNV());
            zzp0.zzUu().zzY(this);
            return;
        }
        zzOP zzopZzH = ((zzOP) zzpy).zzH(zzzq4);
        zzZ(zzopZzH.zzNs().zzPs().zzPv());
        zzZ(zzopZzH.zzNs().zzPr().zzPv());
        zzZ(zzopZzH.zzNr().zzPs().zzPv());
        zzZ(zzopZzH.zzNr().zzPr().zzPv());
        zzZ(zzopZzH.zzNp().zzPv());
        zzZ(zzopZzH.zzNq().zzPv());
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(zzOS zzos) {
        for (int i = 0; i < zzos.zzNu().getCount(); i++) {
            long j = zzos.zzNu().get(i);
            zzU(j);
            if (this.zzYk) {
                zzT(j);
            }
        }
        return true;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(zzPZ zzpz) {
        zzU(zzpz.zzPL());
        zzU(zzpz.zzPK());
        zzU(zzpz.zzPW());
        zzU(zzpz.zzPX());
        if (!this.zzYk) {
            return true;
        }
        zzT(zzpz.zzPL());
        zzT(zzpz.zzPK());
        zzT(zzpz.zzPX());
        zzT(zzpz.zzPW());
        return true;
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZP zzzp) {
        this.zzYg++;
        this.zzYe++;
        zzU(zzzp.zzZT());
        zzS(zzzp.getSize());
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzI zzi) {
        this.zzYg++;
        zzU(zzi.zzZT());
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZI zzzi) {
        this.zzYg++;
        zzU(zzzi.zzZT());
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZB zzzb) {
        this.zzYg++;
        zzU(zzzb.zzZv());
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZC zzzc) {
        this.zzYg++;
        zzU(zzzc.zzZv());
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzC zzc) {
        this.zzYg++;
        zzU(zzc.zzZv());
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zz9 zz9Var) {
        this.zzYg++;
        zzU(zz9Var.zzZv());
    }

    @Override // com.aspose.words.internal.zz6
    public final boolean zzZ(zzZS zzzs) {
        this.zzYg++;
        return true;
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZH zzzh) {
        this.zzYg++;
    }
}
