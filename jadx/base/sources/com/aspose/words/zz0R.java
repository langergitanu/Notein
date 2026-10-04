package com.aspose.words;

import com.aspose.words.internal.C22244OooO0o0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zz0R {
    private com.aspose.words.internal.zzPM zzYX;
    private boolean zzYXD;
    private zzGR zzYZf;
    private zzZC3 zzZge;
    private zz2S zzZjc;
    private zz2C zzZjd;
    private zz4G zzZje;
    private zz7X zzZjf;
    private com.aspose.words.internal.zzH zzxj;
    private double zzYXF = Double.NaN;
    private double zzYXE = Double.NaN;

    private zz0R(com.aspose.words.internal.zzPM zzpm, zz4G zz4g, zz7X zz7x, zz2C zz2c, zz2S zz2s, zzZC3 zzzc3, zzGR zzgr, boolean z) {
        this.zzYX = zzpm;
        this.zzZje = zz4g;
        this.zzZjf = zz7x;
        this.zzZjd = zz2c;
        this.zzZge = zzzc3;
        this.zzYZf = zzgr;
        this.zzZjc = zz2s;
        this.zzYXD = z;
    }

    private boolean zzF(com.aspose.words.internal.zzZU zzzu) {
        return (this.zzYXD || !com.aspose.words.internal.zzZYD.zzXk(com.aspose.words.internal.zzZKN.zzTX(zzzu.getText())) || this.zzZge.zzZw8().getDmlEffectsRenderingMode() == 1 || zz7Y.zzZ(this.zzZjc, null)) ? false : true;
    }

    private com.aspose.words.internal.zzH zzG0() {
        if (this.zzxj == null) {
            this.zzxj = new com.aspose.words.internal.zzH();
        }
        return this.zzxj;
    }

    public static zzBW zzI(zzBW zzbw) {
        if (zzbw == null) {
            return zzBW.zzZ8e;
        }
        zzBW zzbwZzZHt = zzbw.zzZHt();
        Iterator<zzZCM> it = zzbwZzZHt.zzZNX().iterator();
        while (it.hasNext()) {
            zzZCN zzzcn = (zzZCN) com.aspose.words.internal.zzZKW.zzZ(it.next(), zzZCN.class);
            if (zzzcn != null) {
                zzzcn.zz9K();
            }
        }
        return zzbwZzZHt;
    }

    public static zz7X zzV(zz7X zz7x) {
        if (zz7x == null) {
            return null;
        }
        zz7X zz7xZzZQ6 = zz7x.zzZQ6();
        if (zz7xZzZQ6.zzZQ4() != 5) {
            return zz7xZzZQ6;
        }
        if (zz7x.getThemeProvider() != null) {
            zz7xZzZQ6.zzW(zz7x.getThemeProvider());
        }
        zz1C zz1c = (zz1C) zz7xZzZQ6;
        zz1c.zzZ(zzI(zz1c.zzZQX()));
        return zz7xZzZQ6;
    }

    private void zzW(com.aspose.words.internal.zzZU zzzu, com.aspose.words.internal.zz7 zz7Var) throws Exception {
        zz25 zz25Var = (zz25) this.zzZjd.zzH1(1);
        if (zz25Var == null) {
            return;
        }
        zz23 zz23Var = new zz23(zz25Var, zzZt0());
        com.aspose.words.internal.zzG zzgZzZ = zzZsZ().zzZ(zzzu, zz25Var, zzZt0());
        com.aspose.words.internal.zzOI zzoi = new com.aspose.words.internal.zzOI(com.aspose.words.internal.zzPV.zzKa);
        zzI();
        com.aspose.words.internal.zzG zzgZzZ2 = zzZ(zzzu, (com.aspose.words.internal.zzOU) null, (com.aspose.words.internal.zzPY) zzoi, false);
        zzgZzZ.getCount();
        zzgZzZ2.getCount();
        if (zzgZzZ2.getCount() == 0) {
            zzI().zzZ(1, 12, "Inner shadow effects applied to CFF font text are not supported.");
            return;
        }
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        for (int i = 0; i < zzgZzZ.getCount(); i++) {
            com.aspose.words.internal.zzG zzg2 = new com.aspose.words.internal.zzG();
            com.aspose.words.internal.zzZG zzzg = (com.aspose.words.internal.zzZG) com.aspose.words.internal.zzZKW.zzZ(zzgZzZ2.zzN(i), com.aspose.words.internal.zzZG.class);
            zzg2.zzZ(zzzg != null ? zzzg.zzZ0() : null);
            com.aspose.words.internal.zzZP zzzp = (com.aspose.words.internal.zzZP) zzgZzZ.zzN(i);
            zzzp.zzY(com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) zzzp.zzZT()) + ((float) zz23Var.zzC(0)), com.aspose.words.internal.zzZPY.zzYC(zzzp.zzZT()) + ((float) zz23Var.zzB(0))));
            zzg2.zzX(zzzp);
            if (zzzu.zzZO() != null) {
                zzg2.zzW(zzzu.zzZO());
            }
            zzg.zzX((com.aspose.words.internal.zzZL) zzg2);
        }
        zz7Var.zzX(zzg);
    }

    private void zzX(com.aspose.words.internal.zzZU zzzu, com.aspose.words.internal.zz7 zz7Var) throws Exception {
        zz21 zz21Var = (zz21) this.zzZjd.zzH1(6);
        if (zz21Var == null) {
            return;
        }
        zz7Var.zzX(zzZsZ().zzZ(zzzu, zz21Var, zzZt0()));
    }

    public static zz4G zzY(zz4G zz4g, boolean z) {
        if (zz4g == null) {
            return null;
        }
        zz4G zz4gZzZxK = zz4g.zzZxK();
        if (z) {
            zz4gZzZxK.zzXK(zz4gZzZxK.zzZxH() / 12700.0d);
        }
        zz4gZzZxK.setFill(zzV(zz4gZzZxK.getFill()));
        return zz4gZzZxK;
    }

    public static zz0R zzZ(com.aspose.words.internal.zzPM zzpm, zzZC3 zzzc3, zzZ2Z zzz2z) {
        zz2C zz2c = new zz2C();
        zz4G zz4gZzY = zzY(zzz2z.getOutline(), true);
        zz7X zz7xZzV = zzV(zzz2z.getFill());
        if (zzz2z.zzYKn() != null && !zzz2z.zzYKn().isEmpty()) {
            zz2c.zzZ(zzZ(zzz2z.zzYKn(), zzpm, true));
        }
        if (zzz2z.zzZuO() != null && !zzz2z.zzZuO().isEmpty()) {
            zz2c.zzZ(zzZ(zzz2z.zzZuO(), zzpm, true));
        }
        if (zzz2z.zzYKm() != null && !zzz2z.zzYKm().isEmpty()) {
            zz2c.zzZ(zzZ(zzz2z.zzYKm(), zzpm, true));
        }
        return new zz0R(zzpm, zz4gZzY, zz7xZzV, zz2c, zzz2z.zzZCu(), zzzc3, new zzGR(new zz2O(0), zzzc3, new zz1K()), zzz2z.zzYKk());
    }

    private zz0S zzZsZ() {
        return this.zzZge.zzZw7();
    }

    private zzZ90 zzZt0() throws Exception {
        return this.zzZge.getThemeProvider();
    }

    private void zzZt1() throws Exception {
        com.aspose.words.internal.zzZU zzzu = new com.aspose.words.internal.zzZU(this.zzYX, new com.aspose.words.internal.zzOI(com.aspose.words.internal.zzPV.zzKa), 0L, ".");
        com.aspose.words.internal.zzZL zzzlZzG = zzG(zzzu);
        com.aspose.words.internal.zzZQ4 zzzq4ZzZ = zzG0().zzZ((com.aspose.words.internal.zzZL) zzzu);
        com.aspose.words.internal.zzZQ4 zzzq4ZzZ2 = zzG0().zzZ(zzzlZzG);
        double dZzZo = zzzq4ZzZ.zzZo() - zzzq4ZzZ2.zzZo();
        double dZzZn = zzzq4ZzZ2.zzZn() - zzzq4ZzZ.zzZn();
        this.zzYXF = dZzZo > 0.0d ? dZzZo / ((double) this.zzYX.zzPf()) : 0.0d;
        this.zzYXE = dZzZn > 0.0d ? dZzZn / ((double) this.zzYX.zzPf()) : 0.0d;
    }

    private com.aspose.words.internal.zzOU zzZt5() throws Exception {
        zz4G zz4g = this.zzZje;
        if (zz4g == null || zz4g.getFill() == null || this.zzZje.getFill().zzZQ4() == 3 || com.aspose.words.internal.zzAN.zzZD(this.zzZje.zzZxH())) {
            return null;
        }
        zz7X fill = this.zzZje.getFill();
        this.zzZje.setFill(new zz1C(zzBW.zzj(com.aspose.words.internal.zzPV.zzIs)));
        com.aspose.words.internal.zzOU zzouZzZ = this.zzZje.zzZ(this.zzYZf, true);
        this.zzZje.setFill(fill);
        return zzouZzZ;
    }

    private static void zzv(com.aspose.words.internal.zzZG zzzg) throws Exception {
        com.aspose.words.internal.zzZQ4 zzzq4ZzY = com.aspose.words.internal.zzP6.zzY(zzzg.zzZ0(), zzzg.zzZ2().getWidth() / 2.0f);
        float fOooO00o = C22244OooO0o0.OooO00o(zzzq4ZzY, 2.0f, zzzq4ZzY.getX());
        float height = (zzzq4ZzY.getHeight() / 2.0f) + zzzq4ZzY.getY();
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        zzp9.zzY(-fOooO00o, -height, 1);
        zzp9.zzZ(new com.aspose.words.internal.zzP9(0.98f, 0.0f, 0.0f, 0.98f, 0.0f, 0.0f), 1);
        zzp9.zzY(fOooO00o, height, 1);
        zzzg.zzY(zzp9);
    }

    private com.aspose.words.internal.zzOU zzw(com.aspose.words.internal.zzZG zzzg) throws Exception {
        com.aspose.words.internal.zzOU zzouZzZt5 = zzZt5();
        if (zzouZzZt5 == null) {
            return null;
        }
        zzouZzZt5.zzY(zzZ(zzzg, this.zzZje.getFill(), 12700));
        return zzouZzZt5;
    }

    public final com.aspose.words.internal.zzZL zzG(com.aspose.words.internal.zzZU zzzu) throws Exception {
        return zzZ(zzzu, Float.NaN, Float.NaN);
    }

    public final boolean zzZt2() {
        zz7X zz7x = this.zzZjf;
        return zz7x != null && zz7x.zzZQ4() == 1;
    }

    public final double zzZt3() throws Exception {
        if (Double.isNaN(this.zzYXE)) {
            zzZt1();
        }
        return this.zzYXE;
    }

    public final double zzZt4() throws Exception {
        if (Double.isNaN(this.zzYXF)) {
            zzZt1();
        }
        return this.zzYXF;
    }

    public final com.aspose.words.internal.zzZL zzx(com.aspose.words.internal.zzZG zzzg) throws Exception {
        if (this.zzYXD) {
            return zzzg;
        }
        com.aspose.words.internal.zzZG zzzg2 = new com.aspose.words.internal.zzZG(com.aspose.words.internal.zzOY.zzZ(zzzg.zzZ0(), zzzg.zzZ2()));
        if (zzzg.zzZ2() != null && zzzg.zzZ2().zzZ1() != null) {
            zzzg2.zzY(zzzg.zzZ2().zzZ1());
        }
        com.aspose.words.internal.zzPY zzpyZzZ = zzZ(zzzg2, this.zzZjf, 12700);
        com.aspose.words.internal.zzOU zzouZzw = zzw(zzzg2);
        if (zzpyZzZ != null && !zzpyZzZ.isEmpty()) {
            zzzg2.zzY(zzpyZzZ);
        }
        if (zzouZzw != null && zzouZzw.zzZ1() != null && !zzouZzw.zzZ1().isEmpty()) {
            zzzg2.zzX(zzouZzw);
        }
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        zzg.zzX(zzzg2);
        return (com.aspose.words.internal.zzG) zz2B.zzZ(this.zzZjd, zzg, this.zzZge, 1, null, 3, false, false);
    }

    private void zzY(com.aspose.words.internal.zzZU zzzu, com.aspose.words.internal.zz7 zz7Var) throws Exception {
        zz27 zz27Var = (zz27) this.zzZjd.zzH1(5);
        if (zz27Var == null) {
            return;
        }
        zz7Var.zzX(zzZsZ().zzZ(zzzu, zz27Var, zzZt0()));
    }

    private com.aspose.words.internal.zzF4 zzI() {
        return this.zzZge.zzI();
    }

    private com.aspose.words.internal.zzOU zzY(com.aspose.words.internal.zzZU zzzu, float f, float f2) throws Exception {
        com.aspose.words.internal.zzOU zzouZzZt5 = zzZt5();
        if (zzouZzZt5 == null) {
            return null;
        }
        zzouZzZt5.zzY(zzZ(zzzu, this.zzZje.getFill(), f, f2));
        return zzouZzZt5;
    }

    public static zz1R zzZ(zz1R zz1r, com.aspose.words.internal.zzPM zzpm, boolean z) {
        if (zz1r == null || zz1r.isEmpty()) {
            return null;
        }
        zz1R zz1r2 = (zz1R) zz1r.zzZvi();
        if (!z) {
            return zz1r2;
        }
        zz1r2.zzWK(true);
        zz1r2.zzXo((zz1r2.zzZuL() / 12700.0d) * 0.06d * ((double) zzpm.zzPg()));
        zz1r2.zzXp(zz1r2.zzZuN() / 12700.0d);
        zz1r2.zzXj(zz1r2.zzZux() + ((double) (zzpm.getDescentPoints() / zzpm.zzPf())));
        return zz1r2;
    }

    public static zz27 zzZ(zz27 zz27Var, com.aspose.words.internal.zzPM zzpm, boolean z) {
        if (zz27Var == null || zz27Var.isEmpty()) {
            return null;
        }
        zz27 zz27Var2 = (zz27) zz27Var.zzZvi();
        zz27Var2.zzWK(z);
        zz27Var2.zzZ(zzI(zz27Var2.zzZQX()));
        float fZzYO = zz0S.zzYO(zzpm.zzPg());
        if (z) {
            zz27Var2.zzYL(Math.pow(fZzYO, 0.7d) * ((zz27Var2.zzZPS() / 12700.0d) / 24.0d));
        }
        return zz27Var2;
    }

    public static zz2F zzZ(zz21 zz21Var, com.aspose.words.internal.zzPM zzpm, boolean z) {
        if (zz21Var == null || zz21Var.isEmpty()) {
            return null;
        }
        zzBW zzbwZzI = zzI(zz21Var.zzZQX());
        double dPow = Math.pow(zzpm.zzPg(), 0.7d) * ((zz21Var.zzZuL() / 12700.0d) / 20.0d);
        double dPow2 = Math.pow(zz0S.zzYO(zzpm.zzPg()), 0.7d) * ((zz21Var.zzZuN() / 12700.0d) / 20.0d);
        if (zz21Var.zzZuK()) {
            if (zz21Var.getAlignment() != 9) {
                return null;
            }
            zz25 zz25Var = new zz25();
            zz25Var.zzWK(z);
            zz25Var.zzZ(zzbwZzI);
            zz25Var.zzXo(z ? dPow / 2.0d : zz21Var.zzZuL());
            zz25Var.zzQ(zz21Var.zzZuM());
            if (!z) {
                dPow2 = zz21Var.zzZuN();
            }
            zz25Var.zzXp(dPow2);
            return zz25Var;
        }
        zz21 zz21Var2 = (zz21) zz21Var.zzZvi();
        zz21Var2.zzWK(z);
        zz21Var2.zzZ(zzbwZzI);
        if (!z) {
            dPow = zz21Var.zzZuL();
        }
        zz21Var2.zzXo(dPow);
        if (!z) {
            dPow2 = zz21Var.zzZuN();
        }
        zz21Var2.zzXp(dPow2);
        return zz21Var2;
    }

    public final com.aspose.words.internal.zzZL zzZ(com.aspose.words.internal.zzZU zzzu, float f, float f2) throws Exception {
        if (!zzF(zzzu)) {
            return zzzu;
        }
        com.aspose.words.internal.zzPY zzpyZzZ = zzZ(zzzu, this.zzZjf, f, f2);
        com.aspose.words.internal.zzOU zzouZzY = zzY(zzzu, f, f2);
        if (zzpyZzZ != null && zzpyZzZ.isEmpty() && zzouZzY == null) {
            zzzu.clearText();
            return zzzu;
        }
        com.aspose.words.internal.zzPV zzpvZzZ = zzZ(zzzu, zzpyZzZ);
        if (zzpyZzZ == null) {
            zzpyZzZ = new com.aspose.words.internal.zzOI(zzzu.zzZy());
        }
        boolean z = (zzpyZzZ.zzPH() == 0 && zzouZzY == null && this.zzZjd.zzH1(1) == null) ? false : true;
        com.aspose.words.internal.zzZU zzzuZzZ = (z || com.aspose.words.internal.zzPV.zzZ(zzpvZzZ, zzzu.zzZy())) ? zzzu : zzZ(zzzu, zzpvZzZ, com.aspose.words.internal.zzPV.zzHZ);
        if (!z && this.zzZjd.getCount() == 0) {
            return zzzuZzZ;
        }
        com.aspose.words.internal.zz7 zzzs = new com.aspose.words.internal.zzZS(131072);
        zzY(zzzu, zzzs);
        zzX(zzzu, zzzs);
        if (z) {
            zzI();
            com.aspose.words.internal.zzG zzgZzZ = zzZ(zzzu, zzouZzY, zzpyZzZ, true);
            if (zzgZzZ.getCount() > 0) {
                zzzs.zzX(zzgZzZ);
                zzzuZzZ = zzZ(zzzu, com.aspose.words.internal.zzPV.zzHZ);
            } else {
                zzI().zzZ(1, 12, "Gradient effects applied to CFF font text are not supported.");
            }
        }
        zzZ(zzzuZzZ, zzzs);
        zzW(zzzu, zzzs);
        zzzs.zzX(zzzuZzZ);
        return zzzs;
    }

    private static com.aspose.words.internal.zzPV zzZ(com.aspose.words.internal.zzZU zzzu, com.aspose.words.internal.zzPY zzpy) {
        if (zzpy == null) {
            return zzzu.zzZy();
        }
        if (zzpy.zzPH() == 0) {
            com.aspose.words.internal.zzPV zzpvZzZy = ((com.aspose.words.internal.zzOI) zzpy).zzZy();
            zzzu.zzY(zzpvZzZy);
            return zzpvZzZy;
        }
        return com.aspose.words.internal.zzPV.zzHZ;
    }

    private void zzZ(com.aspose.words.internal.zzZU zzzu, com.aspose.words.internal.zz7 zz7Var) throws Exception {
        zz1R zz1r = (zz1R) this.zzZjd.zzH1(7);
        if (zz1r == null) {
            return;
        }
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        zzg.zzX(zz7Var);
        zzg.zzX(new com.aspose.words.internal.zzZU(zzzu.zzZr(), zzzu.zzZy(), zzzu.zzZq(), zzzu.zzZT(), zzzu.getText(), zzzu.zzZk()));
        zz1Q zz1q = new zz1Q(zz1r, new zz89(this.zzZge, zzG0().zzZ(zzg.zzN(zzg.getCount() - 1)), 1, null, 3, false, false));
        float f = (-zzzu.zzZr().getDescentPoints()) * 2.0f;
        com.aspose.words.internal.zzG zzgZzv = zz1q.zzv(zzg);
        if (zzgZzv == null) {
            return;
        }
        if (zzgZzv.zzZO() == null) {
            com.aspose.words.internal.OooO0O0.OooO00o(zzgZzv);
        }
        zzgZzv.zzZO().zzY(0.0f, f, 1);
        zz7Var.zzZ(0, zzgZzv);
    }

    private com.aspose.words.internal.zzPY zzZ(com.aspose.words.internal.zzZU zzzu, zz7X zz7x, float f, float f2) throws Exception {
        if (zz7x == null) {
            return null;
        }
        if (Float.isNaN(f)) {
            f = 0.0f;
        }
        if (Float.isNaN(f2)) {
            f2 = Float.intBitsToFloat((int) zzzu.getSize());
        }
        return zzZ(zz7x, new com.aspose.words.internal.zzZQ4(Float.intBitsToFloat((int) zzzu.zzZT()) - f, com.aspose.words.internal.zzZPY.zzYC(zzzu.zzZT()) - zzzu.zzZr().getAscentPoints(), f2, zzzu.zzZr().zzPf()));
    }

    private com.aspose.words.internal.zzPY zzZ(com.aspose.words.internal.zzZG zzzg, zz7X zz7x, int i) throws Exception {
        if (zz7x == null) {
            return null;
        }
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        zzp9.zzZ(1.0f, 1.0f, 1);
        return zzZ(zz7x, zzp9.zzO(zzG0().zzZ((com.aspose.words.internal.zzZL) zzzg)));
    }

    private com.aspose.words.internal.zzPY zzZ(zz7X zz7x, com.aspose.words.internal.zzZQ4 zzzq4) throws Exception {
        zzGR zzgr = this.zzYZf;
        com.aspose.words.internal.zzZG zzzgZzW = com.aspose.words.internal.zzZG.zzW(zzzq4);
        com.aspose.words.internal.zzZG zzzgZzRV = zzgr.zzRV();
        com.aspose.words.internal.zzZQ4 zzzq4ZzZPK = zzgr.zzZPK();
        try {
            zzgr.zzC(zzzgZzW);
            zzgr.zzZK(zzzq4);
            return zz7x.zzZ(zzgr);
        } finally {
            zzgr.zzC(zzzgZzRV);
            zzgr.zzZK(zzzq4ZzZPK);
        }
    }

    private static com.aspose.words.internal.zzZU zzZ(com.aspose.words.internal.zzZU zzzu, com.aspose.words.internal.zzPV zzpv) {
        return zzZ(zzzu, zzpv, zzpv);
    }

    private static com.aspose.words.internal.zzZU zzZ(com.aspose.words.internal.zzZU zzzu, com.aspose.words.internal.zzPV zzpv, com.aspose.words.internal.zzPV zzpv2) {
        com.aspose.words.internal.zzZU zzzu2 = new com.aspose.words.internal.zzZU(zzzu.zzZr(), zzpv, zzpv2, zzzu.zzZT(), zzzu.getText(), zzzu.getSize(), zzzu.zzZk(), zzzu.zzZz());
        zzzu2.zzW(zzzu.zzZO());
        return zzzu2;
    }

    private static com.aspose.words.internal.zzG zzZ(com.aspose.words.internal.zzZU zzzu, com.aspose.words.internal.zzOU zzou, com.aspose.words.internal.zzPY zzpy, boolean z) throws Exception {
        com.aspose.words.internal.zzZU zzzu2;
        com.aspose.words.internal.zzOU zzou2;
        com.aspose.words.internal.zzPY zzpy2;
        boolean z2;
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        com.aspose.words.internal.zzUW zzuw = new com.aspose.words.internal.zzUW(zzzu.zzZr(), zzzu.getText(), false, false);
        float fIntBitsToFloat = Float.intBitsToFloat((int) zzzu.zzZT());
        int i = 0;
        while (i < zzzu.getText().length()) {
            char cCharAt = zzzu.getText().charAt(i);
            if (cCharAt != ' ') {
                com.aspose.words.internal.zzZG zzzg = new com.aspose.words.internal.zzZG(zzuw.zzZ9(cCharAt));
                zzZ(zzzg, fIntBitsToFloat, com.aspose.words.internal.zzZPY.zzYC(zzzu.zzZT()));
                zzzg.zzX(zzou);
                zzzg.zzY(zzpy);
                zzzu2 = zzzu;
                zzou2 = zzou;
                zzpy2 = zzpy;
                z2 = z;
                zzZ(zzg, zzzg, zzzu2, zzou2, zzpy2, z2);
                if (z2 && zzzu2.zzZO() != null) {
                    zzzg.zzY(zzzu2.zzZO());
                }
                zzg.zzX(zzzg);
            } else {
                zzzu2 = zzzu;
                zzou2 = zzou;
                zzpy2 = zzpy;
                z2 = z;
            }
            fIntBitsToFloat += zzzu2.zzZr().zzY7(cCharAt);
            i++;
            zzzu = zzzu2;
            zzou = zzou2;
            zzpy = zzpy2;
            z = z2;
        }
        return zzg;
    }

    private static void zzZ(com.aspose.words.internal.zzZG zzzg, float f, float f2) {
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        zzp9.zzY(f, f2, 1);
        zzzg.zzY(zzp9);
    }

    private static void zzZ(com.aspose.words.internal.zzG zzg, com.aspose.words.internal.zzZG zzzg, com.aspose.words.internal.zzZU zzzu, com.aspose.words.internal.zzOU zzou, com.aspose.words.internal.zzPY zzpy, boolean z) throws Exception {
        if (zzzu.zzZr().zzPi()) {
            zzzg.zzY(zzzu.zzZs());
        }
        if (!zzzu.zzZr().zzPj() || zzpy == null || zzpy.isEmpty()) {
            return;
        }
        float fZzPg = zzzu.zzZr().zzPg() * 0.02f;
        if (zzou != null) {
            float width = zzou.getWidth();
            zzv(zzzg);
            com.aspose.words.internal.zzZG zzzgZzYZ = zzzg.zzYZ();
            if (width > fZzPg) {
                zzzg.zzX(zzou.zzNQ());
                zzzg.zzZ2().setWidth(width - fZzPg);
            } else {
                zzzg.zzX(new com.aspose.words.internal.zzOU(zzpy, fZzPg - width));
            }
            zzzgZzYZ.zzX(zzou.zzNQ());
            zzzgZzYZ.zzZ2().setWidth(width + fZzPg);
            if (z && zzzu.zzZO() != null) {
                zzzgZzYZ.zzY(zzzu.zzZO());
            }
            zzg.zzX(zzzgZzYZ);
            return;
        }
        zzzg.zzX(new com.aspose.words.internal.zzOU(zzpy, fZzPg));
    }
}
