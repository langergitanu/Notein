package com.aspose.words;

import java.util.Collection;

/* JADX INFO: loaded from: classes6.dex */
final class zz24 extends zz2D {
    private zz25 zzYYT;

    public zz24(zz25 zz25Var, zz89 zz89Var) {
        super(zz89Var);
        this.zzYYT = zz25Var;
    }

    private static com.aspose.words.internal.zzP8 zzY(com.aspose.words.internal.zzZG zzzg, com.aspose.words.internal.zzP9 zzp9) {
        com.aspose.words.internal.zzP9 zzp9ZzOo = zzp9.zzOo();
        com.aspose.words.internal.zzP8 zzp8 = new com.aspose.words.internal.zzP8();
        for (int i = 0; i < zzzg.zzZ0().getCount(); i++) {
            com.aspose.words.internal.zzP5 zzp5ZzNZ = zzzg.zzZ0().zzO7().get(i).zzNZ();
            zzp5ZzNZ.zzY(zzp9ZzOo);
            com.aspose.words.internal.zzZQG.zzZ(zzp8.zzO7(), zzp5ZzNZ);
        }
        return zzp8;
    }

    @Override // com.aspose.words.zz2D, com.aspose.words.zzZC1
    public final com.aspose.words.internal.zzG zzv(com.aspose.words.internal.zzG zzg) throws Exception {
        com.aspose.words.internal.zzG zzgZzv;
        com.aspose.words.internal.zzPV zzpvZzZ = this.zzYYT.zzZQX().zzZ(zzZuZ().getThemeProvider(), (zzZCM) null);
        zz23 zz23Var = new zz23(this.zzYYT, zzZuZ().getThemeProvider());
        if (zzZuZ().zzZFk()) {
            return zz03.zzZ(zzZuZ(), zzt(zzg), zzXq(this.zzYYT.zzZuN()), zzpvZzZ, zzZuY(), com.aspose.words.internal.zzZPZ.zzZm(zzXq(zz23Var.zzC(0)), zzXq(zz23Var.zzB(0))));
        }
        Collection<com.aspose.words.internal.zzZG> collectionZzZ = new com.aspose.words.internal.zzYD(zz23Var).zzZ(zzg, false);
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        zzp9.zzY((float) zz23Var.zzC(0), (float) zz23Var.zzB(0), 0);
        com.aspose.words.internal.zzZQ4 zzzq4ZzZ = zzZMR().zzZ((com.aspose.words.internal.zzZL) zzg);
        com.aspose.words.internal.zzZQ4 zzzq4ZzT = com.aspose.words.internal.zzZQ4.zzT(zzzq4ZzZ, zzp9.zzO(zzzq4ZzZ));
        if (zzZuZ().getDmlEffectsRenderingMode() == 2) {
            float fZzZuN = (float) this.zzYYT.zzZuN();
            float x = zzzq4ZzT.getX() - fZzZuN;
            float y = zzzq4ZzT.getY() - fZzZuN;
            float f = fZzZuN * 2.0f;
            zzzq4ZzT = new com.aspose.words.internal.zzZQ4(x, y, zzzq4ZzT.getWidth() + f, zzzq4ZzT.getHeight() + f);
        }
        int iZzPD = zzpvZzZ.zzPD();
        com.aspose.words.internal.zzPV zzpv = new com.aspose.words.internal.zzPV(255, zzpvZzZ);
        com.aspose.words.internal.zzG zzg2 = new com.aspose.words.internal.zzG();
        for (com.aspose.words.internal.zzZG zzzg : collectionZzZ) {
            com.aspose.words.internal.zzP8 zzp8ZzY = zzY(zzzg, zzp9);
            com.aspose.words.internal.zzZQG.zzZ(zzzg.zzZ0().zzO7(), com.aspose.words.internal.zzP5.zzK(zzzq4ZzT));
            zzzg.zzZ0().zzY1(0);
            if (zzZuZ().getDmlEffectsRenderingMode() == 0) {
                zzgZzv = zz1E.zzZ(zzzg, this.zzYYT.zzZuN(), zzpv, zzZuZ().zzZC5(), true, zzZuZ().getDocument());
            } else {
                zzzg.zzY(new com.aspose.words.internal.zzOI(zzpv));
                com.aspose.words.internal.zzG zzg3 = new com.aspose.words.internal.zzG();
                zzg3.zzX(zzzg);
                zz2I zz2i = new zz2I();
                zz2i.zzYL(zzXq(this.zzYYT.zzZuN()));
                zz2i.zzM(new com.aspose.words.internal.zzPV(1, zzpv));
                zzgZzv = new zz2H(zz2i, zzZuZ()).zzv(zzg3);
            }
            com.aspose.words.internal.zzG zzg4 = new com.aspose.words.internal.zzG();
            zzg4.zzZ(zzp8ZzY);
            zzg4.zzX((com.aspose.words.internal.zzZL) zzgZzv);
            zzg2.zzX((com.aspose.words.internal.zzZL) zzg4);
        }
        return iZzPD == 255 ? zzg2 : zz1E.zzZ(zzg2, iZzPD, zzZuZ().zzZC5(), zzZuZ().getDocument());
    }
}
