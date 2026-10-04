package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzIY extends zzIZ {
    private zzHK zzZhQ;
    private long zzZi7;

    public zzIY(long j, zzHK zzhk) {
        this.zzZi7 = j;
        this.zzZhQ = zzhk;
    }

    @Override // com.aspose.words.zzIZ
    public final zz8N zzYd(long j) {
        return zz8N.zzZ(j, this.zzZhQ);
    }

    @Override // com.aspose.words.zzIZ
    public final zz07 zzYe(long j) {
        zz07 zz07Var = new zz07();
        zz07Var.zzX(this.zzZhQ);
        int i = (int) j;
        zz07Var.setWidth(com.aspose.words.internal.zzSA.zzo(Float.intBitsToFloat(i)));
        zz07Var.setHeight(com.aspose.words.internal.zzSA.zzo(com.aspose.words.internal.zzZPW.zzYz(j)));
        zz07Var.zzW(com.aspose.words.internal.zzSA.zzo(Float.intBitsToFloat((int) this.zzZi7) - (Float.intBitsToFloat(i) / 2.0f)));
        zz07Var.zzV(com.aspose.words.internal.zzSA.zzo(com.aspose.words.internal.zzZPY.zzYC(this.zzZi7) - (com.aspose.words.internal.zzZPW.zzYz(j) / 2.0f)));
        return zz9B.zzZ(new zz7H(), zz07Var, 2);
    }
}
