package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zz2D implements zzZC1 {
    private zz89 zzYZ5;
    private com.aspose.words.internal.zzH zzZdO;

    public zz2D(zz89 zz89Var) {
        this.zzYZ5 = zz89Var;
    }

    private com.aspose.words.internal.zzZQ4 zzs(com.aspose.words.internal.zzG zzg) throws Exception {
        com.aspose.words.internal.zzZQ4 zzzq4 = com.aspose.words.internal.zzZQ4.zz2T;
        if (this.zzYZ5.zzZC4() != null && this.zzYZ5.zzZC4().zzZhn()) {
            return com.aspose.words.internal.zzZE.zzZ(new com.aspose.words.internal.zzZQ4(0.0f, 0.0f, Float.intBitsToFloat((int) this.zzYZ5.zzZC4().zzZT()) * 2.0f, com.aspose.words.internal.zzZPY.zzYC(this.zzYZ5.zzZC4().zzZT()) * 2.0f), this.zzYZ5.zzZC5(), 1);
        }
        if (this.zzYZ5.zzZFk()) {
            com.aspose.words.internal.zzZQ4 zzzq4ZzZ = com.aspose.words.internal.zzZE.zzZ(zzZMR().zzZ((com.aspose.words.internal.zzZL) zzg), this.zzYZ5.zzZC5(), 1);
            if (zzzq4ZzZ.getWidth() < 2.0f || zzzq4ZzZ.getHeight() < 2.0f) {
                return new com.aspose.words.internal.zzZQ4(zzzq4ZzZ.getX(), zzzq4ZzZ.getY(), Math.max(zzzq4ZzZ.getWidth(), 2.0f), Math.max(zzzq4ZzZ.getHeight(), 2.0f));
            }
        }
        return zzzq4;
    }

    public final int zzXq(double d) {
        return com.aspose.words.internal.zzAN.zzZG(com.aspose.words.internal.zzSA.pointToPixel(d * ((double) this.zzYZ5.getScaleFactor())));
    }

    public final byte[] zzZ(com.aspose.words.internal.zzG zzg, com.aspose.words.internal.zzJ8 zzj8) throws Exception {
        return com.aspose.words.internal.zzE.zzZ(zzg, 96.0f, com.aspose.words.internal.zzPV.zzHZ, this.zzYZ5.zzZC5(), zzj8, zzs(zzg));
    }

    public final com.aspose.words.internal.zzH zzZMR() {
        if (this.zzZdO == null) {
            this.zzZdO = new com.aspose.words.internal.zzH();
        }
        return this.zzZdO;
    }

    public final boolean zzZuY() {
        return this.zzYZ5.getDmlEffectsRenderingMode() == 0;
    }

    public final zz89 zzZuZ() {
        return this.zzYZ5;
    }

    public final byte[] zzt(com.aspose.words.internal.zzG zzg) throws Exception {
        return zzZ(zzg, 96.0f, com.aspose.words.internal.zzPV.zzHZ);
    }

    @Override // com.aspose.words.zzZC1
    public com.aspose.words.internal.zzG zzv(com.aspose.words.internal.zzG zzg) throws Exception {
        return null;
    }

    public final byte[] zzZ(com.aspose.words.internal.zzG zzg, float f, com.aspose.words.internal.zzPV zzpv) throws Exception {
        return com.aspose.words.internal.zzE.zzZ(zzg, f, zzpv, this.zzYZ5.zzZC5(), this.zzYZ5.zzwx(), zzs(zzg));
    }
}
