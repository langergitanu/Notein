package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZZZ extends zzZ5 {
    zzZZX zzdI;
    zz06 zzdK;
    private zz04 zzdx;
    private zzZOP zzdy;
    private zzA2 zzj0;
    private zzZ9 zzz9;

    public zzZZZ(zzZOP zzzop, zz02 zz02Var) throws Exception {
        zzZ9 zzz9 = new zzZ9();
        this.zzz9 = zzz9;
        zzZ(zzz9);
        this.zzj0 = new zzA2(zz02Var.zzwy());
        zzZ(zzzop, zz02Var);
    }

    private void zzZ(zzZOP zzzop, zz02 zz02Var) throws Exception {
        if (zzzop == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: stream");
        }
        if (zz02Var == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: options");
        }
        this.zzdy = zzzop;
        zzZZX zzzzx = new zzZZX(new zzZOR());
        this.zzdI = zzzzx;
        this.zzdK = new zz06(zzzzx, zz02Var);
    }

    private zz04 zzrW() {
        if (this.zzdx == null) {
            this.zzdx = new zz04(this.zzdK);
        }
        return this.zzdx;
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzY(zzG zzg) throws Exception {
        zzrX();
    }

    public abstract void zzZ(zzZON zzzon) throws Exception;

    public final void zzZV(float f) throws Exception {
        zzP9 zzp9 = new zzP9();
        zzp9.zzY(0.0f, f, 0);
        zzp9.zzZ(1.0f, -1.0f, 0);
        this.zzdI.zzw(zzp9);
    }

    public final void zzrX() throws Exception {
        this.zzdI.zzXB("grestore");
    }

    public final void zzrY() throws Exception {
        this.zzdI.zzXB("gsave");
    }

    public final void zzrZ() throws Exception {
        zzZON zzzon = new zzZON(this.zzdy);
        zzZ(zzzon);
        zzzon.flush();
        this.zzdK.zz1(this.zzdy);
        zzZOP zzzopZzq = this.zzdI.zzq();
        try {
            zzzopZzq.zzH(0L);
            zzZYQ.zzX(zzzopZzq, this.zzdy);
            zzzopZzq.close();
            zzzon.zzXB("%%EOF");
            zzzon.flush();
        } catch (Throwable th) {
            if (zzzopZzq != null) {
                zzzopZzq.close();
            }
            throw th;
        }
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzG zzg) throws Exception {
        zzrY();
        if (zzg.zzZO() != null) {
            this.zzdI.zzw(zzg.zzZO());
        }
        if (zzZT.zzU(zzg)) {
            this.zzdI.zzC(zzg.zzZN());
        }
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZG zzzg) throws Exception {
        zzrY();
        if (zzzg.zzZO() != null) {
            this.zzdI.zzw(zzzg.zzZO());
        }
        if (zzZT.zzU(zzzg)) {
            this.zzdI.zzC(zzzg.zzZN());
        }
        zzZQ4 zzzq4ZzS = zz6E.zzK(zzzg) ? zzP6.zzS(zzzg.zzZ0()) : zzZQ4.zz2T;
        zzrY();
        this.zzdI.zzA(zzzg.zzZ0());
        zzrW().zzS(zzzg.zzZ1(), zzzq4ZzS);
        zzrW().zzX(zzzg.zzZ2(), zzzq4ZzS);
        zzrX();
        zzrX();
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZP zzzp) throws Exception {
        zzZP zzzpZzZ = zzZO.zzZ(zzzp, zzYJ(), this.zzj0, this.zzz9.zzYP());
        if (zzzpZzZ != null) {
            zzEG zzegZzZT = zzEF.zzZT(zzzpZzZ.getImageBytes());
            String strZzT = this.zzdK.zzT(zzzpZzZ.getImageBytes(), zzzpZzZ.zzZd());
            zzrY();
            this.zzdI.zzQ("{0} {1} translate", zzJB.zzr(Float.intBitsToFloat((int) zzzpZzZ.zzZT())), zzJB.zzr(zzZPY.zzYC(zzzpZzZ.zzZT())));
            this.zzdI.zzQ("{0} {1} scale", zzJB.zzr(Float.intBitsToFloat((int) zzzpZzZ.getSize()) / zzegZzZT.getWidth()), zzJB.zzr(zzZPW.zzYz(zzzpZzZ.getSize()) / zzegZzZT.getHeight()));
            this.zzdI.zzm("{0} execform", strZzT);
            zzrX();
        }
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZU zzzu) throws Exception {
        if (zzzu.isHidden()) {
            return;
        }
        String strZzXD = this.zzdK.zzQ(zzzu.zzZr().zzPl()).zzXD(zzzu.getText());
        if (zzZYD.zzXk(zzZKN.zzTX(strZzXD))) {
            if (zzzu.zzZr().zzPj()) {
                zzrY();
                zzrW().zzI(zzzu);
                this.zzdI.zzXA(strZzXD);
                this.zzdI.zzXB("false charpath");
                this.zzdI.zzm("{0} setlinewidth 2 setmiterlimit stroke", zzJB.zzt(zzzu.zzZr().zzPg() * 0.04f));
                zzrX();
            }
            zzrY();
            zzrW().zzI(zzzu);
            this.zzdI.zzXA(strZzXD);
            this.zzdI.zzXB("show");
            zzrX();
        }
    }
}
