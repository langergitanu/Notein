package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zz4N {
    private zzGH zziY;
    private zz26 zziZ;
    private zzA2 zzj0;
    private zz4G zzj1;
    private zz4K zzj2;
    private zz5H zzj3;
    private zz2M zzj4;
    private zz5C zzj5;
    private zz32 zzj6;
    private zz47 zzj7;
    private zzQR zzj8 = new zzQR();
    private boolean zzj9;
    private zz4M zzja;
    private zzFY zzjb;
    private boolean zzjc;
    private zz4D zzjd;
    private zz4W zzkV;

    public zz4N(zzZOP zzzop, zz2R zz2r) throws Exception {
        zzZ(zzzop, zz2r);
    }

    private void zzM(float f, float f2) throws Exception {
        if (this.zzj4 != null) {
            throw new IllegalStateException("Cannot start a new page while another page is not finished.");
        }
        this.zzj4 = new zz2M(this.zzkV, f, f2);
        this.zzj5.zzvW().zzXM(this.zzj4.zzF0());
        zzuQ();
        if (this.zzkV.zzv4() == -3.4028235E38f) {
            this.zzkV.zz6(f2);
        }
    }

    private void zzZ(zzZOP zzzop, zz2R zz2r) throws Exception {
        if (zzzop == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: stream");
        }
        if (zz2r == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: options");
        }
        zz2r.zztF();
        this.zzj9 = false;
        zz4W zz4w = new zz4W(this, zz2r);
        this.zzkV = zz4w;
        this.zzj2 = new zz4K(zz4w);
        zz1D zz1d = new zz1D(zzzop);
        this.zzjb = zz1d;
        this.zzja = new zz4M(zz1d, this.zzkV.zzv3());
        this.zzj3 = new zz5H();
        if (!this.zzkV.zzv7().zzvA()) {
            this.zzj6 = new zz32(this.zzkV);
        }
        this.zzj5 = new zz5C(this.zzkV);
        this.zzjb.zzZ(this.zzkV.zzv7());
        if (this.zzkV.zzvc().getDisplayDocTitle()) {
            this.zzj5.zzvS().zzt8();
        }
        if (this.zzkV.zzvc().isEncrypted()) {
            zz4D zz4dZzZ = zz4D.zzZ(this.zzkV, zzuO());
            this.zzjd = zz4dZzZ;
            zz4G zz4gZzZ = zz4dZzZ.zzZ(this.zzkV);
            this.zzj1 = zz4gZzZ;
            zz4gZzZ.zzY(this.zzja);
        }
    }

    private zz47 zzuO() {
        zz47 zz47Var = this.zzj7;
        if (zz47Var != null) {
            return zz47Var;
        }
        zz47 zz47Var2 = new zz47();
        this.zzj7 = zz47Var2;
        return zz47Var2;
    }

    private void zzuP() throws Exception {
        zz1I zz1i = new zz1I(this.zzj6, this.zzj5, this.zzj1, zzuO(), this.zzkV.zzv3());
        int iZzF4 = (int) this.zzjb.zzF4();
        if (!this.zzkV.zzv7().zzvF()) {
            this.zzjb.zzZ(this.zzkV.zzv3());
            zz1i.zzZ(this.zzjb, iZzF4);
        } else {
            zz4W zz4w = this.zzkV;
            new zz4S(zz4w, zz4w.zzv3(), zz1i).zzY(this.zzja);
            this.zzjb.zzWb(iZzF4);
        }
    }

    private void zzuQ() {
        zz4Q zz4qZztB = this.zzkV.zzvc().zztB();
        if (zz4qZztB == null || zz4qZztB.zzuV() == null || this.zzj5.zzvW().getCount() != 1) {
            return;
        }
        zz26 zz26Var = new zz26(this.zzkV, zz4qZztB);
        this.zziZ = zz26Var;
        this.zzj4.zzZ(zz26Var);
        this.zzj3.zzZ(this.zziZ);
        this.zzj5.zzvU().zzZ(this.zziZ);
    }

    private void zzuR() {
        if (this.zzkV.zzv6()) {
            this.zzj5.zzZ(new zz30(this.zzkV).zzT(this.zziY));
        }
    }

    public final void endDocument() throws Exception {
        if (this.zzjc) {
            return;
        }
        zzuR();
        this.zzj3.zzY(this.zzja);
        zz32 zz32Var = this.zzj6;
        if (zz32Var != null) {
            zz32Var.zzY(this.zzja);
        }
        this.zzj5.zzY(this.zzja);
        this.zzj2.zzW(this.zzja);
        zzuP();
        if (this.zziZ != null) {
            zz24.zzZ(this.zzjb.zzq(), this.zziZ.zzth(), this.zzkV.zzvc().zztB().zzuV(), this.zzkV.zzvc().zztB().getHashAlgorithm(), this.zzkV.zzvc().zztB().zzuT());
        }
        if (this.zzj9) {
            this.zzjb.zzq().close();
        }
        this.zzjc = true;
        this.zzkV.zzv1().zzV(this.zziY);
    }

    public final void zzG3() throws Exception {
        zz2M zz2m = this.zzj4;
        if (zz2m == null) {
            throw new IllegalStateException("No page to end.");
        }
        zz2m.zzG3();
        this.zzj4.zzY(this.zzja);
        this.zzj4 = null;
    }

    public final void zzU(zzGH zzgh) {
        this.zziY = zzgh;
    }

    public final void zzXX(String str) {
        this.zzj5.zzXX(str);
    }

    public final void zzZ5(long j) throws Exception {
        zzM(Float.intBitsToFloat((int) j), zzZPW.zzYz(j));
    }

    public final zz2M zzuM() {
        return this.zzj4;
    }

    public final zz4W zzuN() {
        return this.zzkV;
    }

    public final zzA2 zzv2() {
        return this.zzj0;
    }

    public final zz4D zzv8() {
        return this.zzjd;
    }

    public final zzQR zzv9() {
        return this.zzj8;
    }

    public final String zzvR() {
        return this.zzj5.zzvR();
    }

    public final zz5U zzvU() {
        return this.zzj5.zzvU();
    }

    public final zz2Q zzvV() {
        return this.zzj5.zzvV();
    }

    public final zz2I zzvW() {
        return this.zzj5.zzvW();
    }

    public final zz5H zzva() {
        return this.zzj3;
    }

    public final zz4K zzvb() {
        return this.zzj2;
    }

    public final void zzZ(zzQR zzqr) {
        this.zzj8 = zzqr;
    }

    public final void zzZ(zzA2 zza2) {
        this.zzj0 = zza2;
    }
}
