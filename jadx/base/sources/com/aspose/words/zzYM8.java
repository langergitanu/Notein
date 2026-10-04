package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYM8 implements com.aspose.words.internal.zzH2 {
    private zzYM7 zzXFn = new zzYM7();
    private zzYLC zzXFo;
    private com.aspose.words.internal.zzDB zzXFp;
    private zzYL9 zzZAn;

    private zzYL9 zzE(com.aspose.words.internal.zzZG zzzg) throws Exception {
        this.zzZAn = new zzYL9();
        com.aspose.words.internal.zzZG zzzgZzq = zzq(zzzg);
        if (!zzz(zzzgZzq)) {
            return new zzYL9(new zzYLC());
        }
        zzzgZzq.zzZ0().zzY(this);
        if (zzzg.zzZO() != null) {
            this.zzZAn.zzp(zzzg.zzZO());
        }
        this.zzZAn.zzNw();
        return this.zzZAn;
    }

    private static boolean zzO(com.aspose.words.internal.zzPY zzpy) {
        if (zzpy == null) {
            return false;
        }
        com.aspose.words.internal.zzOI zzoi = (com.aspose.words.internal.zzOI) com.aspose.words.internal.zzZKW.zzZ(zzpy, com.aspose.words.internal.zzOI.class);
        return zzoi == null || zzoi.zzZy().zzPD() != 0;
    }

    private void zzYnM() {
        if (this.zzXFo.zzYnj() < 2) {
            return;
        }
        com.aspose.words.internal.zzDB zzdb = new com.aspose.words.internal.zzDB();
        int iZzYnj = this.zzXFo.zzYnj();
        for (int i = 1; i < iZzYnj - 1; i++) {
            if (com.aspose.words.internal.zzJ6.zzN(this.zzXFo.zzq1(i - 1).zzYn8(), this.zzXFo.zzq1(i).zzYn8())) {
                zzdb.add(i);
            }
        }
        for (int i2 = 0; i2 < zzdb.getCount(); i2++) {
            this.zzXFo.zzq3(zzdb.get(i2) - i2);
        }
        if (this.zzXFo.zzYnj() > 2) {
            long jZzYn8 = this.zzXFo.zzq1(0).zzYn8();
            zzYLC zzylc = this.zzXFo;
            if (com.aspose.words.internal.zzJ6.zzN(jZzYn8, zzylc.zzq1(zzylc.zzYnj() - 1).zzYn8())) {
                zzYLC zzylc2 = this.zzXFo;
                zzylc2.zzq3(zzylc2.zzYnj() - 1);
            }
        }
    }

    private com.aspose.words.internal.zzDB zzYnN() {
        com.aspose.words.internal.zzDB zzdb = new com.aspose.words.internal.zzDB();
        for (int i = 0; i < this.zzXFp.getCount(); i++) {
            int i2 = this.zzXFp.get(i);
            if (zzZ(this.zzXFo.zzq1(i2 - 1).zzYn8(), this.zzXFo.zzq1(i2).zzYn8(), this.zzXFo.zzq1(i2 + 1).zzYn8(), com.aspose.words.internal.zzJ6.zzT(this.zzXFo.zzYno()))) {
                zzdb.add(i2);
            }
        }
        return zzdb;
    }

    private void zzYnO() {
        com.aspose.words.internal.zzDB zzdbZzYnN = zzYnN();
        for (int i = 0; i < zzdbZzYnN.getCount(); i++) {
            this.zzXFo.zzq3(zzdbZzYnN.get(i) - i);
        }
    }

    private void zzYnP() {
        zzYnO();
        zzYnM();
    }

    private static com.aspose.words.internal.zzZG zzq(com.aspose.words.internal.zzZG zzzg) throws Exception {
        if (zzzg.zzZ2() == null) {
            return zzzg;
        }
        com.aspose.words.internal.zzZG zzzgZzZ = zzYM7.zzZ(zzzg, false, false);
        zzzgZzZ.zzX(new com.aspose.words.internal.zzOU(com.aspose.words.internal.zzPV.zzKa));
        zzzgZzZ.zzZ2().setWidth(1.0f);
        boolean z = zzzg.zzZ1() != null || zzzg.zzZ0().zzO9();
        float width = zzzg.zzZ2().getWidth() == 0.0f ? 0.75f : zzzg.zzZ2().getWidth();
        if (z && zzzg.zzZ2().getWidth() == 0.0f) {
            return zzzgZzZ;
        }
        com.aspose.words.internal.zzZG zzzgZzY = com.aspose.words.internal.zzSO.zzY(zzzgZzZ, (-width) * 0.5f);
        return z ? zzzgZzY : zzZ(zzzg.zzZ2().getWidth(), zzzgZzZ, zzzgZzY);
    }

    public static zzYL9 zzr(com.aspose.words.internal.zzZG zzzg) throws Exception {
        return new zzYM8().zzE(zzzg);
    }

    private static boolean zzz(com.aspose.words.internal.zzZG zzzg) {
        if (zzzg.zzZ2() == null || !zzO(zzzg.zzZ2().zzZ1())) {
            return zzO(zzzg.zzZ1());
        }
        return true;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzY(com.aspose.words.internal.zzP5 zzp5) {
        zzYnP();
        this.zzZAn.zzV(this.zzXFo);
        return true;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(com.aspose.words.internal.zzP5 zzp5) {
        this.zzXFo = new zzYLC();
        this.zzXFp = new com.aspose.words.internal.zzDB();
        return true;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(com.aspose.words.internal.zzOS zzos) {
        this.zzXFo.zzM(zzos.zzNu());
        return true;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(com.aspose.words.internal.zzPZ zzpz) {
        com.aspose.words.internal.zzOQ zzoqZzPP = zzpz.zzPP();
        for (int i = 0; i < zzoqZzPP.getCount(); i++) {
            this.zzXFo.zzXx(zzoqZzPP.zzYd(i));
            this.zzXFo.zzXx(zzoqZzPP.zzXT(i));
            this.zzXFp.add(this.zzXFo.zzYnj() - 1);
        }
        this.zzXFo.zzXx(zzoqZzPP.zzYa(zzoqZzPP.getCount() - 1));
        return true;
    }

    private static com.aspose.words.internal.zzZG zzZ(float f, com.aspose.words.internal.zzZG zzzg, com.aspose.words.internal.zzZG zzzg2) throws Exception {
        com.aspose.words.internal.zzZG zzzgZzp = zzYM3.zzp(com.aspose.words.internal.zzSO.zzY(zzzg, f * 0.5f));
        for (int i = 0; i < zzzgZzp.zzZ0().getCount(); i++) {
            if (i == zzzgZzp.zzZ0().getCount() - 1) {
                com.aspose.words.internal.zzP5 zzp5 = zzzgZzp.zzZ0().zzO7().get(i);
                com.aspose.words.internal.zzP5 zzp52 = zzzg2.zzZ0().zzO7().get(0);
                for (int i2 = 0; i2 < zzp5.getCount(); i2++) {
                    zzp52.zzNY().add(i2, zzp5.zzNY().get(i2));
                }
            } else {
                com.aspose.words.internal.zzZQG.zzZ(zzzg2.zzZ0().zzO7(), zzzgZzp.zzZ0().zzO7().get(i));
            }
        }
        return zzzg2;
    }

    private static boolean zzZ(long j, long j2, long j3, boolean z) {
        boolean zZzu = new com.aspose.words.internal.zzPG(j, j3).zzu(j2);
        boolean z2 = !zZzu;
        boolean z3 = Float.intBitsToFloat((int) j) - Float.intBitsToFloat((int) j3) > 0.0f;
        return z ? z3 ^ z2 : (z3 && !zZzu) || (!z3 && zZzu);
    }
}
