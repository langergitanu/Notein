package com.aspose.words;

import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;

/* JADX INFO: loaded from: classes6.dex */
class zzYAA extends zzYAU {
    public static int zzZ(zzZ55 zzz55, zzZ32 zzz32) throws Exception {
        zzYAA zzyaa = new zzYAA();
        zzyaa.zzU(zzz32);
        zzyaa.zzY(zzz55);
        return zzyaa.getWidth();
    }

    @Override // com.aspose.words.zzYAU
    public final int getLength() {
        return 1;
    }

    @Override // com.aspose.words.zzYAU
    public final String getText() {
        return CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR;
    }

    @Override // com.aspose.words.zzYAU
    public final int zz0R() {
        return 1;
    }

    @Override // com.aspose.words.zzYAU
    public final boolean zzY6x() {
        if (zzZZJ() != null) {
            return !zzZZJ().zza7().getBalanceSingleByteDoubleByteWidth() || zzY6D();
        }
        return false;
    }

    @Override // com.aspose.words.zzYAU
    public final boolean zzY6y() {
        return zzZZJ() != null && zzZZJ().zza7().getBalanceSingleByteDoubleByteWidth() && zzY6D();
    }

    @Override // com.aspose.words.zzYAU
    public final zzYAU zzY71() throws Exception {
        zzYAA zzyaa = new zzYAA();
        zzZB(zzyaa);
        return zzyaa;
    }

    @Override // com.aspose.words.zzYAU
    public final void zzY7z() {
    }

    @Override // com.aspose.words.zzYAU
    public final int zzZo6() {
        return EditingLanguage.ARABIC_YEMEN;
    }
}
