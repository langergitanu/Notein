package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zz9F extends zz9K {
    public zz9F(zz8Z zz8z) {
        super(zz8z);
    }

    @Override // com.aspose.words.zz9K
    public void zzZE3() throws Exception {
        zzZDR().zzZzb();
        float fZzZze = Float.isInfinite(zzZDN().zzZze()) ? 0.0f : zzZDN().zzZze();
        float fZzZze2 = Float.isInfinite(zzZDM().zzZze()) ? 0.0f : zzZDM().zzZze();
        zzXY(com.aspose.words.internal.zzZPW.zzG(fZzZze, fZzZze2));
        if (com.aspose.words.internal.zzAN.zzf(fZzZze)) {
            zzZDL().zzZCH().zzZ(0.0f, (zzZC9) zzZDN());
        }
        if (com.aspose.words.internal.zzAN.zzf(fZzZze2)) {
            zzZDL().zzZCH().zzZ(0.0f, (zzZC9) zzZDM());
        }
        zzZDR().zzZzb();
        zzXp(true);
        zzXo(false);
    }
}
