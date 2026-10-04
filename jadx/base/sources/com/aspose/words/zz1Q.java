package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz1Q extends zz2D {
    private zz1R zzYYC;

    public zz1Q(zz1R zz1r, zz89 zz89Var) {
        super(zz89Var);
        this.zzYYC = zz1r;
    }

    private static com.aspose.words.internal.zzG zzV(com.aspose.words.internal.zzG zzg, com.aspose.words.internal.zzZQ4 zzzq4) {
        long jZzB = com.aspose.words.internal.zzJ6.zzB(zzzq4);
        if (zzg.zzZO() == null) {
            com.aspose.words.internal.OooO0O0.OooO00o(zzg);
        }
        int i = (int) jZzB;
        zzg.zzZO().zzY(-Float.intBitsToFloat(i), -com.aspose.words.internal.zzZPY.zzYC(jZzB), 1);
        zzg.zzZO().zzZ(1.0f, -1.0f, 1);
        zzg.zzZO().zzY(Float.intBitsToFloat(i), com.aspose.words.internal.zzZPY.zzYC(jZzB), 1);
        return zzg;
    }

    private byte[] zzZ(com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzG zzg) throws Exception {
        int iZzZG = com.aspose.words.internal.zzAN.zzZG(com.aspose.words.internal.zzSA.pointToPixel(zzzq4.getWidth()));
        int iZzZG2 = com.aspose.words.internal.zzAN.zzZG(com.aspose.words.internal.zzSA.pointToPixel(zzzq4.getHeight()));
        if (zzg.zzZO() == null) {
            com.aspose.words.internal.OooO0O0.OooO00o(zzg);
        }
        zzg.zzZO().zzY(-zzzq4.getX(), -zzzq4.getY(), 1);
        com.aspose.words.internal.zzXN zzxn = new com.aspose.words.internal.zzXN(iZzZG, iZzZG2);
        try {
            com.aspose.words.internal.zzIY zziy = new com.aspose.words.internal.zzIY(zzxn);
            try {
                com.aspose.words.internal.zzIY.zzGJ();
                zziy.zzGF();
                new com.aspose.words.internal.zzJ8(zzZuZ().zzwx().zzFE()).zzZ(zzg, zziy);
                zziy.dispose();
                com.aspose.words.internal.zzEI zzei = new com.aspose.words.internal.zzEI(zzxn);
                if (zzZuZ().zzZQ4() == 4) {
                    zzei.zzQ((int) (this.zzYYC.zzZuz() * 255.0d), (int) (this.zzYYC.zzZuy() * 255.0d), 1);
                } else {
                    zzei.zzQ((int) (this.zzYYC.zzZuy() * 255.0d), (int) (this.zzYYC.zzZuz() * 255.0d), 1);
                }
                byte[] imageBytes = zzei.getImageBytes();
                zzxn.dispose();
                return imageBytes;
            } catch (Throwable th) {
                zziy.dispose();
                throw th;
            }
        } catch (Throwable th2) {
            zzxn.dispose();
            throw th2;
        }
    }

    private com.aspose.words.internal.zzG zzh(com.aspose.words.internal.zzG zzg) throws Exception {
        com.aspose.words.internal.zzZQ4 zzzq4ZzZ = zzZMR().zzZ((com.aspose.words.internal.zzZL) zzg);
        float height = zzzq4ZzZ.getHeight() * ((float) (1.0d - this.zzYYC.zzZux()));
        com.aspose.words.internal.zzZQ4 zzzq4 = zzZuZ().zzZQ4() == 4 ? new com.aspose.words.internal.zzZQ4(zzzq4ZzZ.getX(), zzzq4ZzZ.getY(), zzzq4ZzZ.getWidth(), zzzq4ZzZ.getHeight() - height) : new com.aspose.words.internal.zzZQ4(zzzq4ZzZ.getX(), zzzq4ZzZ.getY() + height, zzzq4ZzZ.getWidth(), zzzq4ZzZ.getHeight() - height);
        com.aspose.words.internal.zzG zzg2 = new com.aspose.words.internal.zzG();
        if (com.aspose.words.internal.zzAN.zzP(zzzq4.getWidth(), 0.5f) && com.aspose.words.internal.zzAN.zzP(zzzq4.getHeight(), 0.5f)) {
            byte[] bArrZzZ = zzZ(zzzq4, zzg);
            com.aspose.words.internal.zzEG zzegZzZT = com.aspose.words.internal.zzEF.zzZT(bArrZzZ);
            zzg2.zzX(new com.aspose.words.internal.zzZP(com.aspose.words.internal.zzZPY.zzG(zzzq4ZzZ.getX(), zzzq4ZzZ.getY()), com.aspose.words.internal.zzZPW.zzG((float) zzegZzZT.getWidthPoints(), (float) zzegZzZT.getHeightPoints()), bArrZzZ));
        }
        return zzg2;
    }

    private com.aspose.words.internal.zzG zzi(com.aspose.words.internal.zzG zzg) throws Exception {
        int iZzZC5 = zzZuZ().zzZC5();
        com.aspose.words.internal.zzZE zzze = new com.aspose.words.internal.zzZE();
        if (1 != iZzZC5) {
            zzze.zzZ(zzg, iZzZC5, 1);
        }
        com.aspose.words.internal.zzG zzgZzh = zzh(zzg);
        if (1 != iZzZC5) {
            zzze.zzZ(zzgZzh, 1, iZzZC5);
        }
        if (zzgZzh.zzZO() == null) {
            com.aspose.words.internal.OooO0O0.OooO00o(zzgZzh);
        }
        return zzgZzh;
    }

    private com.aspose.words.internal.zzG zzj(com.aspose.words.internal.zzG zzg) throws Exception {
        com.aspose.words.internal.zzG zzg2 = (com.aspose.words.internal.zzG) zzg.zz1();
        if (com.aspose.words.internal.zzAN.zzZD(this.zzYYC.zzZuN())) {
            return zzg2;
        }
        if (zzZuZ().getDmlEffectsRenderingMode() != 2) {
            zzZuZ().zz2("Blur is not applied to reflection in simplified DrawingML effects rendering mode.");
            return zzg2;
        }
        zz2I zz2i = new zz2I();
        zz2i.zzYL(zzXq(this.zzYYC.zzZuN()));
        return new zz2H(zz2i, zzZuZ()).zzv(zzg2);
    }

    private com.aspose.words.internal.zzG zzk(com.aspose.words.internal.zzG zzg) throws Exception {
        com.aspose.words.internal.zzG zzgZzV;
        float height;
        double dZzZuL;
        com.aspose.words.internal.zzZQ4 zzzq4ZzZ = new com.aspose.words.internal.zzH().zzZ((com.aspose.words.internal.zzZL) zzg);
        if (zzZuZ().zzZQ4() == 4) {
            com.aspose.words.internal.zzG zzgZzV2 = zzV(zzg, zzzq4ZzZ);
            com.aspose.words.internal.zzD.zzZ(zzgZzV2, true, false, false);
            zzgZzV = zzi(zzgZzV2);
            height = zzzq4ZzZ.getHeight();
            dZzZuL = this.zzYYC.zzZuL();
        } else {
            zzgZzV = zzV(zzi(zzg), zzzq4ZzZ);
            height = zzzq4ZzZ.getHeight() * ((float) this.zzYYC.zzZux());
            dZzZuL = this.zzYYC.zzZuL();
        }
        float fZzZn = (height + ((float) dZzZuL)) - ((zzzq4ZzZ.zzZn() - zzZuZ().zzZC6().zzZn()) * 2.0f);
        if (zzgZzV.zzZO() == null) {
            com.aspose.words.internal.OooO0O0.OooO00o(zzgZzV);
        }
        zzgZzV.zzZO().zzY(0.0f, fZzZn, 1);
        return zzgZzV;
    }

    @Override // com.aspose.words.zz2D, com.aspose.words.zzZC1
    public final com.aspose.words.internal.zzG zzv(com.aspose.words.internal.zzG zzg) throws Exception {
        if (this.zzYYC.getAlignment() == 7 || this.zzYYC.getAlignment() == 6 || this.zzYYC.getAlignment() == 8) {
            return zzk(zzj(zzg));
        }
        zzZuZ().zz2("Unexpected alignment of reflection, reflection will not be rendered");
        return null;
    }
}
