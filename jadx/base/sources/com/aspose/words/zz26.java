package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz26 extends zz2D {
    private zz27 zzYYX;

    public zz26(zz27 zz27Var, zz89 zz89Var) {
        super(zz89Var);
        this.zzYYX = zz27Var;
    }

    public final zz27 zzZuO() {
        return this.zzYYX;
    }

    @Override // com.aspose.words.zz2D, com.aspose.words.zzZC1
    public final com.aspose.words.internal.zzG zzv(com.aspose.words.internal.zzG zzg) throws Exception {
        if (!zzZuZ().zzZFk()) {
            return zz7D.zzZ(zzg, this, zzZuZ().zzZIB());
        }
        return zz03.zzY(zzZuZ(), zzt(zzg), zzXq(this.zzYYX.zzZPS()), this.zzYYX.zzZQX().zzZ(zzZuZ().getThemeProvider(), (zzZCM) null), zzZuY());
    }
}
