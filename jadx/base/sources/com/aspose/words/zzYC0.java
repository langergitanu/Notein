package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzYC0 extends zzYCT {
    @Override // com.aspose.words.zzYCT, com.aspose.words.zzZ6T
    public final zzTF zzX(zzYMD zzymd) {
        if (zz6x() == null) {
            zzZ(((zzYBY) zza9()).zzY8N().zzQo(true));
            zzY(zz6x());
            zz6x().zzZ(this);
            zz6x().zzZ((zzY9C) zza9());
        } else {
            zzYMD zzymdZzy = zzymd.zza9().zzy(zzymd);
            if (zzymdZzy != null) {
                return zzymdZzy.zzZZJ();
            }
            zzYMD zzymdZzz = zzymd.zza9().zzz(zzymd);
            if (zzymdZzz != null) {
                return zzymdZzz.zzZZJ();
            }
        }
        return (zzTF) zz6x();
    }
}
