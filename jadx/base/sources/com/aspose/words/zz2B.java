package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz2B {
    private zz89 zzYZ5;
    private zz2C zzZjd;

    private zz2B(zz2C zz2c, zz89 zz89Var) {
        this.zzZjd = zz2c;
        this.zzYZ5 = zz89Var;
    }

    private zzZS8 zzGY(int i) {
        if (this.zzYZ5.zzZC4() == null || !this.zzYZ5.zzZC4().zzZho()) {
            return null;
        }
        zzZS8 zzzs8ZzZhU = this.zzYZ5.zzZC4().zzZhU();
        zzzs8ZzZhU.zzYM(-zzzs8ZzZhU.zzZhS());
        if (i == 7) {
            zzzs8ZzZhU.zzYG(-zzzs8ZzZhU.zzZhL());
        }
        return zzzs8ZzZhU;
    }

    private zzZC1 zzGZ(int i) {
        zz2C zz2c = this.zzZjd;
        if (zz2c == null || (r0 = zz2c.zzH1(i)) == null) {
            return null;
        }
        switch (i) {
        }
        return null;
    }

    private com.aspose.words.internal.zz7 zzM(com.aspose.words.internal.zz7 zz7Var) throws Exception {
        zz2C zz2c;
        if (this.zzYZ5.zzZIB().zzZw8().getDml3DEffectsRenderingMode() == 0 && (((zz2c = this.zzZjd) == null || zz2c.getCount() == 0) && (this.zzYZ5.zzZC4() == null || !this.zzYZ5.zzZC4().zzZho()))) {
            return zz7Var;
        }
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        zzg.zzX(zz7Var);
        com.aspose.words.internal.OooO0O0.OooO00o(zzg);
        return zzZ(zzg, (com.aspose.words.internal.zzG) null, false);
    }

    private com.aspose.words.internal.zzG zzY(int i, com.aspose.words.internal.zzG zzg) throws Exception {
        zzZS8 zzzs8ZzGY = zzGY(i);
        return zzzs8ZzGY == null ? zzg : zzZS5.zzZ(zzzs8ZzGY, this.zzYZ5.zzZC5(), this.zzYZ5.zzZIB().zzZw8().getDml3DEffectsRenderingMode(), ((Document) this.zzYZ5.getDocument()).zzZqe(), this.zzYZ5.getDocument().getWarningCallback()).zzY(zzg, false);
    }

    public static com.aspose.words.internal.zz7 zzZ(zz2C zz2c, com.aspose.words.internal.zz7 zz7Var, zzZC3 zzzc3, boolean z) throws Exception {
        return zzZ(zz2c, zz7Var, zzzc3, null, 3, z, false);
    }

    private boolean zzZuQ() {
        zz2C zz2c = this.zzZjd;
        return (zz2c == null || zz2c.zzH1(3) == null) ? false : true;
    }

    private boolean zzZuR() {
        return this.zzYZ5.zzZC4() == null || com.aspose.words.internal.zzAN.zzS(this.zzYZ5.zzZC4().zzZhT() + this.zzYZ5.zzZC4().zzZhS(), 0.0f);
    }

    private boolean zzZuS() {
        if (this.zzYZ5.zzZC4() == null || this.zzYZ5.zzZC4().zzZhy() == 2 || this.zzYZ5.zzZC4().zzZhq()) {
            return false;
        }
        return com.aspose.words.internal.zzAN.zzS(Math.abs(this.zzYZ5.zzZC4().zzZhN()), 90.0f) || com.aspose.words.internal.zzAN.zzS(Math.abs(this.zzYZ5.zzZC4().zzZhM()), 90.0f);
    }

    private static void zzl(com.aspose.words.internal.zzG zzg) {
        int i;
        while (true) {
            if (zzg.getCount() != 1 || !(zzg.zzN(0) instanceof com.aspose.words.internal.zzG)) {
                break;
            } else {
                zzg = (com.aspose.words.internal.zzG) zzg.zzN(0);
            }
        }
        if (zzg.getCount() <= 1 || !(zzg.zzN(0) instanceof com.aspose.words.internal.zzZG)) {
            return;
        }
        com.aspose.words.internal.zzZG zzzg = (com.aspose.words.internal.zzZG) zzg.zzN(0);
        for (i = 1; i < zzg.getCount(); i++) {
            com.aspose.words.internal.zzZG zzzg2 = (com.aspose.words.internal.zzZG) com.aspose.words.internal.zzZKW.zzZ(zzg.zzN(i), com.aspose.words.internal.zzZG.class);
            if (zzzg2 != null) {
                for (int i2 = 0; i2 < zzzg2.zzZ0().getCount(); i2++) {
                    com.aspose.words.internal.zzZQG.zzZ(zzzg.zzZ0().zzO7(), zzzg2.zzZ0().zzO7().get(i2));
                }
                zzg.removeAt(i);
            }
        }
    }

    private com.aspose.words.internal.zzG zzm(com.aspose.words.internal.zzG zzg) throws Exception {
        return zzZ(7, zzg, true);
    }

    private com.aspose.words.internal.zzG zzn(com.aspose.words.internal.zzG zzg) throws Exception {
        com.aspose.words.internal.zzG zzgZzZ;
        if ((this.zzYZ5.zzZC4() != null && (this.zzYZ5.zzZC4().zzZht() || !com.aspose.words.internal.zzAN.zzZD(this.zzYZ5.zzZC4().zzZvo()) || !com.aspose.words.internal.zzAN.zzf(this.zzYZ5.zzZC4().zzZhS()))) || (zzgZzZ = zzZ(3, zzg, false)) == null) {
            return zzg;
        }
        this.zzYZ5.zzZC3();
        return zzgZzZ;
    }

    private com.aspose.words.internal.zzG zzo(com.aspose.words.internal.zzG zzg) throws Exception {
        com.aspose.words.internal.zzG zzgZzZ = zzZ(0, zzg, false);
        return zzgZzZ != null ? zzgZzZ : zzg;
    }

    private com.aspose.words.internal.zzG zzp(com.aspose.words.internal.zzG zzg) throws Exception {
        if (this.zzYZ5.zzZC4() != null) {
            if (this.zzYZ5.zzZC4().zzZho() || this.zzYZ5.zzZIB().zzZw8().getDml3DEffectsRenderingMode() == 1) {
                com.aspose.words.internal.zzG zzgZzY = zzZS5.zzZ(this.zzYZ5.zzZC4(), 12700, this.zzYZ5.zzZIB().zzZw8().getDml3DEffectsRenderingMode(), ((Document) this.zzYZ5.getDocument()).zzZqe(), this.zzYZ5.getDocument().getWarningCallback()).zzY(zzg, this.zzYZ5.zzZIB().zzZw8().zzZxM().size() > 0);
                zzg.clear();
                zzg.zzX((com.aspose.words.internal.zzZL) zzgZzY);
            }
        }
        return zzg;
    }

    private com.aspose.words.internal.zzG zzq(com.aspose.words.internal.zzG zzg) throws Exception {
        return this.zzYZ5.zzZC4() != null ? (this.zzYZ5.zzZIB().zzZw8().getDml3DEffectsRenderingMode() == 1 || this.zzYZ5.zzZC4().zzZho()) ? zzYM9.zzZ(zzg, this.zzYZ5.zzMk(), this.zzYZ5.zzZIB().zzI()) : zzg : zzg;
    }

    private static com.aspose.words.internal.zzG[] zzr(com.aspose.words.internal.zzG zzg) throws Exception {
        com.aspose.words.internal.zzG[] zzgArr = new com.aspose.words.internal.zzG[2];
        com.aspose.words.internal.zzG[] zzgArrZzZ = zzB0.zzZ(zzg, 32768);
        if (com.aspose.words.internal.zzZW.zzV(zzgArrZzZ[0])) {
            zzgArr[0] = zzgArrZzZ[1];
            return zzgArr;
        }
        zzgArr[0] = zzgArrZzZ[0];
        zzgArr[1] = zzgArrZzZ[1];
        return zzgArr;
    }

    public static com.aspose.words.internal.zz7 zzZ(zz2C zz2c, com.aspose.words.internal.zz7 zz7Var, zzZC3 zzzc3, zzZS8 zzzs8, int i, boolean z, boolean z2) throws Exception {
        return zzZ(zz2c, zz7Var, zzzc3, 12700, zzzs8, i, z, z2);
    }

    public static com.aspose.words.internal.zz7 zzZ(zz2C zz2c, com.aspose.words.internal.zz7 zz7Var, zzZC3 zzzc3, int i, zzZS8 zzzs8, int i2, boolean z, boolean z2) throws Exception {
        return zzzc3.zzZw8().getDmlEffectsRenderingMode() == 1 ? zz7Var : new zz2B(zz2c, new zz89(zzzc3, new com.aspose.words.internal.zzH(true).zzZ(zz7Var), i, zzzs8, i2, z, z2)).zzM(zz7Var);
    }

    public static void zzZ(zz2C zz2c, com.aspose.words.internal.zzZG zzzg, com.aspose.words.internal.zzG zzg, zzZC3 zzzc3, boolean z) throws Exception {
        if (zzzc3.zzZw8().getDmlEffectsRenderingMode() == 1) {
            return;
        }
        new zz2B(zz2c, new zz89(zzzc3, new com.aspose.words.internal.zzH().zzZ((com.aspose.words.internal.zzZL) zzzg), 12700, null, 3, z, false)).zzZ(zzzg, zzg);
    }

    private void zzZ(com.aspose.words.internal.zzZG zzzg, com.aspose.words.internal.zzG zzg) throws Exception {
        zz2C zz2c = this.zzZjd;
        if ((zz2c == null || zz2c.getCount() == 0) && this.zzYZ5.zzZC4() == null) {
            zzg.zzX(zzzg);
            return;
        }
        com.aspose.words.internal.zzG zzg2 = new com.aspose.words.internal.zzG();
        zzg2.zzX(zzzg);
        com.aspose.words.internal.OooO0O0.OooO00o(zzg2);
        zzZ(zzg2, zzg, true);
    }

    private com.aspose.words.internal.zz7 zzZ(com.aspose.words.internal.zzG zzg, com.aspose.words.internal.zzG zzg2, boolean z) throws Exception {
        com.aspose.words.internal.zzG zzgZzn;
        com.aspose.words.internal.zzG zzg3;
        com.aspose.words.internal.zzG zzg4;
        com.aspose.words.internal.zzG zzgZzZ;
        com.aspose.words.internal.zzG zzgZzZ2 = null;
        if (!zzZuR()) {
            zzgZzn = zzg;
            zzg3 = null;
            zzg4 = null;
        } else {
            if (zzZuS()) {
                return new com.aspose.words.internal.zzG();
            }
            com.aspose.words.internal.zzG zzgZzo = zzo(zzg);
            com.aspose.words.internal.zzG zzgZzZ3 = zzZ(1, zzgZzo, true);
            com.aspose.words.internal.zzG zzgZzZ4 = zzZ(2, zzgZzo, false);
            if (!zzZuQ() || zzgZzZ3 == null) {
                zzgZzZ2 = zzgZzZ3;
            } else {
                zzgZzo = zzZ(zzgZzo, zzgZzZ3);
            }
            zzgZzn = zzn(zzgZzo);
            zzg4 = zzgZzZ2;
            zzgZzZ2 = zzZ(4, zzgZzn, false);
            zzg3 = zzgZzZ4;
        }
        com.aspose.words.internal.zzG[] zzgArrZzr = zzr(zzgZzn);
        com.aspose.words.internal.zzG zzg5 = zzgArrZzr[0];
        com.aspose.words.internal.zzG zzg6 = zzgArrZzr[1];
        if (zzg5 == null) {
            return zzg;
        }
        com.aspose.words.internal.zzG zzgZzq = zzq(zzg5);
        com.aspose.words.internal.zzG zzgZzZ5 = zzZ(5, zzgZzq, true);
        if (zzgZzZ5 != null) {
            this.zzYZ5.zzZC3();
        }
        if (zzgZzZ2 == null) {
            zzgZzZ2 = zzgZzq;
        }
        if (this.zzYZ5.zzZFk()) {
            zzgZzZ = zzZ(zzgZzZ5, zzgZzZ2, zzg4, zzg6);
        } else {
            zzgZzZ = zzZ(zzgZzq, zzg6);
        }
        com.aspose.words.internal.zzG zzgZzZ6 = zzZ(6, zzgZzZ, true);
        com.aspose.words.internal.zzG zzgZzm = zzm(zzZ(zzg3, zzZ(6, zzgZzZ, false), zzgZzZ5, zzgZzZ2, zzg6));
        com.aspose.words.internal.zzG zzgZzp = zzp(zzgZzZ2);
        if (z) {
            return zzZ(zzg2, zzgZzZ5, zzg3, zzgZzZ6, zzgZzp, zzg4);
        }
        return zzZ(zzgZzm, zzgZzZ6, zzg3, zzgZzZ5, zzgZzp, zzg4, zzg6);
    }

    private static com.aspose.words.internal.zzG zzZ(com.aspose.words.internal.zzG zzg, com.aspose.words.internal.zzG zzg2, com.aspose.words.internal.zzG zzg3, com.aspose.words.internal.zzG zzg4, com.aspose.words.internal.zzG zzg5, com.aspose.words.internal.zzG zzg6) {
        if (zzg2 != null) {
            zzg.zzZ(Math.max(0, zzg.getCount() - 2), zzg2);
        }
        if (zzg3 != null) {
            zzg.zzZ(0, zzg3);
        }
        if (zzg4 != null) {
            zzg.zzZ(0, zzg4);
        }
        zzg.zzX((com.aspose.words.internal.zzZL) zzZ(zzg5, zzg6));
        return zzg;
    }

    private static com.aspose.words.internal.zzG zzZ(com.aspose.words.internal.zzG... zzgArr) {
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        for (com.aspose.words.internal.zzG zzg2 : zzgArr) {
            if (zzg2 != null) {
                zzg.zzX((com.aspose.words.internal.zzZL) zzg2);
            }
        }
        return zzg;
    }

    private com.aspose.words.internal.zzG zzZ(int i, com.aspose.words.internal.zzG zzg, boolean z) throws Exception {
        zzZC1 zzzc1ZzGZ = zzGZ(i);
        if (zzzc1ZzGZ == null) {
            return null;
        }
        if (this.zzYZ5.zzZC4() != null && this.zzYZ5.zzZC4().zzZhn()) {
            com.aspose.words.internal.zzG zzgZzY = (com.aspose.words.internal.zzG) zzg.zzP(true);
            if (z) {
                zzgZzY = zzY(i, zzgZzY);
            }
            zzl(zzgZzY);
            return zzzc1ZzGZ.zzv(zzgZzY);
        }
        com.aspose.words.internal.zzG zzgZzv = zzzc1ZzGZ.zzv(zzg);
        return z ? zzY(i, zzgZzv) : zzgZzv;
    }
}
