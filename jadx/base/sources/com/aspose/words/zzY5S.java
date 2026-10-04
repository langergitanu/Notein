package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY5S extends com.aspose.words.internal.zz6 {
    private com.aspose.words.internal.zzZQ4 zzG8;
    private com.aspose.words.internal.zzH zzZdO = new com.aspose.words.internal.zzH();

    public static com.aspose.words.internal.zzZQ4 zzZ(com.aspose.words.internal.zzZG[] zzzgArr) throws Exception {
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        zzg.zzZ(zzzgArr);
        return zzZZ(zzg);
    }

    private com.aspose.words.internal.zzZQ4 zzZY(com.aspose.words.internal.zzG zzg) throws Exception {
        this.zzG8 = com.aspose.words.internal.zzZQ4.zz2T;
        zzg.zzZ(this);
        return this.zzG8;
    }

    public static com.aspose.words.internal.zzZQ4 zzZZ(com.aspose.words.internal.zzG zzg) throws Exception {
        return new zzY5S().zzZY(zzg);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(com.aspose.words.internal.zzZG zzzg) throws Exception {
        com.aspose.words.internal.zzZG zzzgZzYZ = zzzg.zzYZ();
        zzzgZzYZ.zzX(null);
        com.aspose.words.internal.zzZQ4 zzzq4ZzZ = this.zzZdO.zzZ((com.aspose.words.internal.zzZL) zzzgZzYZ);
        if (!com.aspose.words.internal.zzZQ4.zzV(this.zzG8, com.aspose.words.internal.zzZQ4.zz2T)) {
            zzzq4ZzZ = com.aspose.words.internal.zzZQ4.zzT(this.zzG8, zzzq4ZzZ);
        }
        this.zzG8 = zzzq4ZzZ;
        super.zzZ(zzzg);
    }
}
