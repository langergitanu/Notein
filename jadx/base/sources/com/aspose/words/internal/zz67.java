package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz67 {
    private zz6C zzll;

    public zz67(zz6C zz6c) {
        this.zzll = zz6c;
    }

    private static boolean zzO(zzOU zzou) {
        return zzou == null || zzT(zzou.zzZ1());
    }

    private void zzP(zzOU zzou) throws Exception {
        this.zzll.zzwM().zzP(zz6B.zza(zzou.getWidth()));
        this.zzll.zzwM().zzK((byte) 75);
        this.zzll.zzwM().zzM((byte) 122);
        this.zzll.zzwM().zzL(zz6B.zzS(zzou));
        this.zzll.zzwM().zzK((byte) 71);
        this.zzll.zzwM().zzM((byte) 113);
        this.zzll.zzwM().zzL(zz6B.zzR(zzou));
        this.zzll.zzwM().zzK((byte) 72);
        this.zzll.zzwM().zzM((byte) 114);
        if (zzou.zzNM() == 0 || zzou.zzNM() == 3) {
            this.zzll.zzwM().zzP(zz6B.zza(zzou.zzNL()));
            this.zzll.zzwM().zzK((byte) 73);
            this.zzll.zzwM().zzM((byte) 115);
        }
        if (zzou.getDashStyle() != 0) {
            this.zzll.zzwM().zzP(zz6B.zza(zzou.zzNK()));
            this.zzll.zzwM().zzK((byte) 67);
            this.zzll.zzwM().zzZ(zz6B.zzQ(zzou));
            this.zzll.zzwM().zzK((byte) 74);
            this.zzll.zzwM().zzM((byte) 112);
        }
    }

    private void zzT(zzPA zzpa) throws Exception {
        this.zzll.zzT(2, "Linear gradient brush is not supported. Using solid brush instead.");
        zzx(zzpa.zzOv());
    }

    private void zzU(zzPY zzpy, zzZQ4 zzzq4) throws Exception {
        int iZzPH = zzpy.zzPH();
        if (iZzPH == 0) {
            zzx(((zzOI) zzpy).zzZy());
            return;
        }
        if (iZzPH == 1) {
            zzU((zzPK) zzpy);
            return;
        }
        if (iZzPH == 2) {
            zzX((zzOH) zzpy);
            return;
        }
        if (iZzPH == 3) {
            zzT((zzPA) zzpy);
        } else if (iZzPH == 4) {
            zzW(zzOO.zzX((zzOP) zzpy, zzzq4));
        } else {
            if (iZzPH != 5) {
                throw new IllegalArgumentException();
            }
            zzW((zzP0) zzpy);
        }
    }

    private void zzW(zzP0 zzp0) throws Exception {
        this.zzll.zzT(2, "Path gradient brush is not supported. Using solid brush instead.");
        zzx(zzV(zzp0));
    }

    private void zzX(zzOH zzoh) throws Exception {
        zzZ(zzoh.getImageBytes(), zzoh.zzNd(), zzoh.zzNb());
    }

    private void zzwD() throws Exception {
        this.zzll.zzwM().zzwG();
        this.zzll.zzwM().zzK((byte) 8);
    }

    private void zzx(zzPV zzpv) throws Exception {
        this.zzll.zzwM().zzZm(new byte[]{(byte) zzpv.zzPC(), (byte) zzpv.zzPB(), (byte) zzpv.zzPA()});
        this.zzll.zzwM().zzK((byte) 11);
    }

    public final void zzV(zzPY zzpy, zzZQ4 zzzq4) throws Exception {
        if (zzT(zzpy)) {
            zzZL(false);
        } else {
            zzZ(zzpy, false, zzzq4);
        }
    }

    public final void zzY(zzOU zzou, zzZQ4 zzzq4) throws Exception {
        if (zzO(zzou)) {
            zzZL(true);
        } else {
            zzP(zzou);
            zzZ(zzou.zzZ1(), true, zzzq4);
        }
    }

    public final void zzZ(zzPV zzpv, boolean z) throws Exception {
        zzZ(new zzOI(zzpv), z, zzZQ4.zz2T);
    }

    public final void zzZL(boolean z) throws Exception {
        this.zzll.zzwM().zzL((byte) 0);
        this.zzll.zzwM().zzK(z ? (byte) 5 : (byte) 4);
        this.zzll.zzwM().zzM(z ? (byte) 121 : (byte) 99);
    }

    private void zzZ(zzPY zzpy, boolean z, zzZQ4 zzzq4) throws Exception {
        zzU(zzpy, zzzq4);
        this.zzll.zzwM().zzM(z ? (byte) 121 : (byte) 99);
    }

    private static boolean zzT(zzPY zzpy) {
        return zzpy == null || zzpy.isEmpty();
    }

    private static zzPV zzV(zzP0 zzp0) {
        if (zzp0.zzOP() != null && zzp0.zzOP().length != 0) {
            return zzp0.zzOP()[0].zzZy();
        }
        return zzPV.zzKa;
    }

    private void zzZ(byte[] bArr, zzZQ4 zzzq4, zzP9 zzp9) throws Exception {
        if (zzp9 != null && !zzp9.isIdentity()) {
            this.zzll.zzT(2, "Brush transform is not supported");
        }
        if (!zzzq4.isEmpty()) {
            this.zzll.zzT(2, "Brush image area is not supported");
        }
        zz65 zz65Var = new zz65(this.zzll.zzwM());
        zz65Var.zzZ(bArr, null, zzZPX.zzYA(zzEF.zzZT(bArr).getSize()));
        zz65Var.zzwC();
        this.zzll.zzwM().zzwG();
        this.zzll.zzwM().zzK((byte) 105);
        this.zzll.zzwM().zzL((byte) 1);
        this.zzll.zzwM().zzK((byte) 104);
        this.zzll.zzwM().zzM((byte) -77);
        zz65Var.zzwB();
        this.zzll.zzwM().zzM((byte) -76);
        zz65Var.zzwA();
        this.zzll.zzwM().zzM((byte) -75);
        zzwD();
    }

    private void zzU(zzPK zzpk) throws Exception {
        zzZ(zzIK.zzZ(zzpk), zzZQ4.zz2T, (zzP9) null);
    }
}
