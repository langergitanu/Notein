package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY0J implements com.aspose.words.internal.zzGQ {
    private com.aspose.words.internal.zzGQ zzWUm;

    public zzY0J(com.aspose.words.internal.zzGQ zzgq) {
        this.zzWUm = zzgq;
    }

    @Override // com.aspose.words.internal.zzGQ
    public final com.aspose.words.internal.zzZXH zzN(String str, int i) throws Exception {
        return this.zzWUm.zzN(str, i);
    }

    @Override // com.aspose.words.internal.zzGQ
    public final com.aspose.words.internal.zzZXH zzO(String str, int i) {
        return this.zzWUm.zzO(str, i);
    }

    @Override // com.aspose.words.internal.zzGQ
    public final com.aspose.words.internal.zzZXH zzZ(com.aspose.words.internal.zzZXH zzzxh, int i, boolean z) {
        com.aspose.words.internal.zzZXH zzzxhZzO;
        if (com.aspose.words.internal.zzJF.zzZK(zzzxh.zzPh())) {
            return null;
        }
        return (3584 > i || i > 3711 || (zzzxhZzO = this.zzWUm.zzO("Tahoma", 0)) == null || !zzzxhZzO.zzpP().zzC(i, z)) ? this.zzWUm.zzZ(zzzxh, i, z) : zzzxhZzO;
    }
}
