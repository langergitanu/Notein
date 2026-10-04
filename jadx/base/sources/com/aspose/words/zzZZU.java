package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZZU {
    private com.aspose.words.internal.zzGQ zzFh;
    private com.aspose.words.internal.zzZQ4 zzYWR;
    private com.aspose.words.internal.zzG zzYWS;
    private com.aspose.words.internal.zzF4 zzv;

    private com.aspose.words.internal.zzG zzY(com.aspose.words.internal.zzG zzg, com.aspose.words.internal.zzP5[] zzp5Arr, com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzGQ zzgq, com.aspose.words.internal.zzF4 zzf4) throws Exception {
        this.zzYWS = zzg;
        this.zzYWR = zzzq4;
        this.zzFh = zzgq;
        this.zzv = zzf4;
        com.aspose.words.internal.zzG zzg2 = new com.aspose.words.internal.zzG();
        zzg2.zzW(zzg.zzZO());
        zzg.zzW((com.aspose.words.internal.zzP9) null);
        zzg2.zzZ(zzZ(zzp5Arr));
        return zzg2;
    }

    public static com.aspose.words.internal.zzG zzZ(com.aspose.words.internal.zzG zzg, com.aspose.words.internal.zzP5[] zzp5Arr, com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzGQ zzgq, com.aspose.words.internal.zzF4 zzf4) throws Exception {
        return new zzZZU().zzY(zzg, zzp5Arr, zzzq4, zzgq, zzf4);
    }

    private com.aspose.words.internal.zzZG[] zzZ(com.aspose.words.internal.zzP5[] zzp5Arr) throws Exception {
        com.aspose.words.internal.zzZQ4 zzzq4ZzZZ;
        com.aspose.words.internal.zzG zzgZzZ = zzYM9.zzZ(this.zzYWS, this.zzFh, this.zzv);
        this.zzYWS = zzgZzZ;
        com.aspose.words.internal.zzD.zzZ(zzgZzZ, true, false, false);
        com.aspose.words.internal.zzG zzg = this.zzYWS;
        if (this.zzYWR.isEmpty()) {
            zzzq4ZzZZ = zzY5S.zzZZ(this.zzYWS);
        } else {
            zzzq4ZzZZ = this.zzYWR;
        }
        return zzY0H.zzY(zzg, zzzq4ZzZZ, zzp5Arr, false);
    }
}
