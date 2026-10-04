package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY0N extends zzYMJ {
    private boolean zzXSd() {
        return this.zzXGb.zza7().zzZYM() && this.zzXGb.zza7().zzYMs() && !this.zzXGb.zza7().zzYMr();
    }

    @Override // com.aspose.words.zzYMJ
    public final boolean zzV(zzTC zztc, boolean z) {
        return false;
    }

    @Override // com.aspose.words.zzYMJ
    public final boolean zzW(zzTC zztc, boolean z) throws Exception {
        zzZ55 zzz55 = (zzZ55) com.aspose.words.internal.zzZKW.zzZ(zztc, zzZ55.class);
        if (zzz55 != null && zzXSd() && (((zzYAU) zzz55.zz6w()) instanceof zzYAA)) {
            return zzZ(zzz55, zzz55.zzZXK(), z);
        }
        return false;
    }

    @Override // com.aspose.words.zzYMJ
    public final boolean zzY(zzYBL zzybl) {
        return zzybl.zz60() == 2 || zzybl.zz60() == 16;
    }
}
