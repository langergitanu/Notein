package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz2H extends zz2D {
    private zz2I zzYZg;

    public zz2H(zz2I zz2i, zz89 zz89Var) {
        super(zz89Var);
        this.zzYZg = zz2i;
    }

    private com.aspose.words.internal.zzG zzu(com.aspose.words.internal.zzG zzg) throws Exception {
        com.aspose.words.internal.zzZQ4 zzzq4ZzZ = zzZMR().zzZ((com.aspose.words.internal.zzZL) zzg);
        if (com.aspose.words.internal.zzAN.zzf(zzzq4ZzZ.getWidth()) || com.aspose.words.internal.zzAN.zzf(zzzq4ZzZ.getHeight())) {
            return zzg;
        }
        com.aspose.words.internal.zzXN zzxn = new com.aspose.words.internal.zzXN(zzt(zzg));
        try {
            com.aspose.words.internal.zzEI zzei = new com.aspose.words.internal.zzEI(zzxn);
            zz8C.zzZ(this.zzYZg.zzZvg(), zzZuZ().getThemeProvider()).zzZ(zzei, 6, null);
            byte[] imageBytes = zzei.getImageBytes();
            zzxn.dispose();
            com.aspose.words.internal.zzEG zzegZzZT = com.aspose.words.internal.zzEF.zzZT(imageBytes);
            long jZzG = com.aspose.words.internal.zzZPW.zzG(((float) zzegZzZT.getWidthPoints()) / zzZuZ().getScaleFactor(), ((float) zzegZzZT.getHeightPoints()) / zzZuZ().getScaleFactor());
            float x = zzzq4ZzZ.getX() - ((Float.intBitsToFloat((int) jZzG) - zzzq4ZzZ.getWidth()) / 2.0f);
            float y = zzzq4ZzZ.getY() - ((com.aspose.words.internal.zzZPW.zzYz(jZzG) - zzzq4ZzZ.getHeight()) / 2.0f);
            com.aspose.words.internal.zzG zzg2 = new com.aspose.words.internal.zzG();
            zzg2.zzX(new com.aspose.words.internal.zzZP(com.aspose.words.internal.zzZPY.zzG(x, y), jZzG, imageBytes));
            return zzg2;
        } catch (Throwable th) {
            zzxn.dispose();
            throw th;
        }
    }

    @Override // com.aspose.words.zz2D, com.aspose.words.zzZC1
    public final com.aspose.words.internal.zzG zzv(com.aspose.words.internal.zzG zzg) throws Exception {
        return zzZuZ().getDmlEffectsRenderingMode() == 0 ? zzg : zzu(zzg);
    }
}
