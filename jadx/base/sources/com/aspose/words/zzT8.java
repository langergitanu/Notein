package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzT8 extends com.aspose.words.internal.zz6 {
    private com.aspose.words.internal.zzOU zzYs;
    private com.aspose.words.internal.zzZQ4 zzZsf;
    private com.aspose.words.internal.zzG zzvd = new com.aspose.words.internal.zzG();

    private zzT8(com.aspose.words.internal.zzOU zzou, com.aspose.words.internal.zzZQ4 zzzq4) {
        this.zzYs = zzou;
        this.zzZsf = zzzq4;
    }

    public static com.aspose.words.internal.zzG zzZ(com.aspose.words.internal.zzG zzg, com.aspose.words.internal.zzOU zzou, com.aspose.words.internal.zzZQ4 zzzq4) throws Exception {
        zzT8 zzt8 = new zzT8(zzou, zzzq4);
        zzg.zzZ(zzt8);
        return zzt8.zzvd;
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(com.aspose.words.internal.zzZG zzzg) {
        com.aspose.words.internal.zzZG zzzgZzYZ = zzzg.zzYZ();
        zzzgZzYZ.zzX(this.zzYs);
        zzzgZzYZ.zzY((com.aspose.words.internal.zzPY) null);
        float width = zzzg.zzZ2() != null ? zzzg.zzZ2().getWidth() : 0.0f;
        com.aspose.words.internal.zzP9 zzp9ZzZ = com.aspose.words.internal.zzP9.zzZ(this.zzZsf, new com.aspose.words.internal.zzZQ4(this.zzZsf.getX(), this.zzZsf.getY(), this.zzZsf.getWidth() + width, this.zzZsf.getHeight() + width));
        float f = -(width / 2.0f);
        zzp9ZzZ.zzY(f, f, 0);
        zzzgZzYZ.zzW(zzp9ZzZ);
        this.zzvd.zzX(zzzg);
        this.zzvd.zzX(zzzgZzYZ);
    }
}
