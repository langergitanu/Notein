package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZE extends zz6 implements zzH2 {
    private boolean zzYl;
    private float zzYn;
    private zzIM<Object> zzYo = new zzIM<>();
    private boolean zzYm = true;

    private zzP9 zzU(zzP9 zzp9) {
        if (zzp9 == null) {
            return null;
        }
        zzP9 zzp9ZzOh = zzp9.zzOh();
        float f = this.zzYn;
        zzp9ZzOh.zzZ(f, f, 1);
        float f2 = this.zzYn;
        zzp9ZzOh.zzZ(1.0f / f2, 1.0f / f2, 0);
        return zzp9ZzOh;
    }

    private zzZQ4 zzV(zzZQ4 zzzq4) {
        return zzZ(zzzq4, this.zzYn);
    }

    private void zzW(zzOU zzou) throws Exception {
        if (zzZ(zzou)) {
            return;
        }
        zzou.setWidth(zzou.getWidth() * this.zzYn);
        zzX(zzou.zzZ1());
    }

    private zzL zzX(zzL zzl) {
        if (zzl == null) {
            return null;
        }
        zzL zzlZz0 = zzl.zz0();
        zzlZz0.zzZ(zzV(zzl.zzZZ()));
        return zzlZz0;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzY(zzP5 zzp5) {
        return true;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(zzP5 zzp5) {
        return true;
    }

    private long zzV(long j) {
        return zzZPW.zzG(Float.intBitsToFloat((int) j) * this.zzYn, zzZPW.zzYz(j) * this.zzYn);
    }

    public final void zzZ(zzZL zzzl, int i, int i2) throws Exception {
        zzZ(zzzl, i2 / i, true);
    }

    private void zzX(zzPY zzpy) throws Exception {
        if (zzpy == null || zzZ(zzpy)) {
            return;
        }
        int iZzPH = zzpy.zzPH();
        if (iZzPH == 2) {
            zzOH zzoh = (zzOH) zzpy;
            if (this.zzYl) {
                zzoh.zzL(zzU(zzoh.zzNb()));
                return;
            }
            zzoh.zzL(zzoh.zzNb().zzOh());
            zzP9 zzp9ZzNb = zzoh.zzNb();
            float f = this.zzYn;
            zzp9ZzNb.zzZ(f, f, 1);
            return;
        }
        if (iZzPH == 3) {
            zzPA zzpa = (zzPA) zzpy;
            zzpa.zzL(zzU(zzpa.zzNb()));
            zzpa.zzP(zzV(zzpa.zzOw()));
        } else if (iZzPH == 4) {
            zzOP zzop = (zzOP) zzpy;
            zzop.zzL(zzU(zzop.zzNb()));
        } else {
            if (iZzPH != 5) {
                return;
            }
            zzP0 zzp0 = (zzP0) zzpy;
            zzp0.zzL(zzU(zzp0.zzNb()));
            zzp0.zzo(zzW(zzp0.zzNV()));
            zzp0.zzUu().zzY(this);
        }
    }

    public final void zzZ(zzZL zzzl, double d) throws Exception {
        zzZ(zzzl, (float) d, false);
    }

    private long zzW(long j) {
        return zzZPY.zzG(Float.intBitsToFloat((int) j) * this.zzYn, zzZPY.zzYC(j) * this.zzYn);
    }

    private void zzZ(zzZL zzzl, float f, boolean z) throws Exception {
        if (zzAN.zzS(f, 1.0f)) {
            return;
        }
        this.zzYo.clear();
        this.zzYn = f;
        this.zzYl = z;
        zzzl.zzZ(this);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzG zzg) throws Exception {
        if (zzZ((Object) zzg)) {
            return;
        }
        zzg.zzW(zzU(zzg.zzZO()));
        zzg.zzZ(zzX(zzg.zzZM()));
        if (zzg.zzZN() != null) {
            zzg.zzZN().zzY(this);
        }
    }

    public static zzZQ4 zzZ(zzZQ4 zzzq4, int i, int i2) {
        return zzZ(zzzq4, 1.0f / i);
    }

    public static zzZQ4 zzZ(zzZQ4 zzzq4, float f) {
        return new zzZQ4(zzzq4.getX() * f, zzzq4.getY() * f, zzzq4.getWidth() * f, zzzq4.getHeight() * f);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZU zzzu) throws Exception {
        if (zzZ((Object) zzzu)) {
            return;
        }
        if (zzzu.zzZN() != null) {
            zzzu.zzZN().zzY(this);
        }
        zzzu.zzW(zzU(zzzu.zzZO()));
        if (zzzu.zzZr() != null) {
            zzZ(zzzu.zzZr());
        }
        zzzu.zzY(zzW(zzzu.zzZT()));
        zzzu.setSize(zzV(zzzu.getSize()));
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZG zzzg) throws Exception {
        if (zzZ((Object) zzzg)) {
            return;
        }
        zzzg.zzW(zzU(zzzg.zzZO()));
        if (zzzg.zzZ2() != null) {
            zzW(zzzg.zzZ2());
        }
        if (zzzg.zzZ1() != null) {
            zzX(zzzg.zzZ1());
        }
        if (zzzg.zzZN() != null) {
            zzzg.zzZN().zzY(this);
        }
        zzzg.zzZ0().zzY(this);
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(zzOS zzos) {
        if (zzZ((Object) zzos)) {
            return true;
        }
        for (int i = 0; i < zzos.zzNu().getCount(); i++) {
            zzos.zzNu().set(i, zzW(zzos.zzNu().get(i)));
        }
        return true;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(zzPZ zzpz) {
        if (zzZ((Object) zzpz)) {
            return true;
        }
        zzpz.zzR(zzW(zzpz.zzPX()), zzW(zzpz.zzPL()), zzW(zzpz.zzPK()), zzW(zzpz.zzPW()));
        return true;
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZP zzzp) {
        if (zzZ((Object) zzzp)) {
            return;
        }
        zzzp.zzY(zzW(zzzp.zzZT()));
        zzzp.setSize(zzV(zzzp.getSize()));
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzI zzi) {
        if (zzZ((Object) zzi)) {
            return;
        }
        zzi.zzY(zzW(zzi.zzZT()));
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZI zzzi) {
        if (zzZ((Object) zzzi)) {
            return;
        }
        zzzi.zzY(zzW(zzzi.zzZT()));
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZB zzzb) {
        if (zzZ((Object) zzzb)) {
            return;
        }
        zzzb.zzX(zzV(zzzb.zzZv()));
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZC zzzc) {
        if (zzZ((Object) zzzc)) {
            return;
        }
        zzzc.zzX(zzV(zzzc.zzZv()));
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzC zzc) {
        if (zzZ((Object) zzc)) {
            return;
        }
        zzc.zzX(zzV(zzc.zzZv()));
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zz9 zz9Var) {
        if (zzZ((Object) zz9Var)) {
            return;
        }
        zz9Var.zzX(zzV(zz9Var.zzZv()));
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzN zzn) {
        if (zzZ((Object) zzn)) {
            return;
        }
        float f = this.zzYn;
        zzn.zzY(new zzP9(f, 0.0f, 0.0f, f, 0.0f, 0.0f));
    }

    private void zzZ(zzPM zzpm) {
        if (!zzZ((Object) zzpm) && this.zzYm) {
            zzpm.zzR(this.zzYn);
        }
    }

    private boolean zzZ(Object obj) {
        if (this.zzYo.contains(obj)) {
            return true;
        }
        this.zzYo.add(obj);
        return false;
    }
}
