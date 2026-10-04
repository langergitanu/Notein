package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class FontConfigSubstitutionRule extends FontSubstitutionRule {
    private com.aspose.words.internal.zzK6 zzYxu;

    public FontConfigSubstitutionRule(Object obj) {
        super(obj);
        this.zzYxu = new com.aspose.words.internal.zzK6();
    }

    public boolean isFontConfigAvailable() {
        return this.zzYxu.isFontConfigAvailable();
    }

    public void resetCache() {
        synchronized (getSyncRoot()) {
            this.zzYxu.resetCache();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0011  */
    @Override // com.aspose.words.FontSubstitutionRule
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setEnabled(boolean z) {
        boolean z2;
        synchronized (getSyncRoot()) {
            if (z) {
                try {
                    z2 = isFontConfigAvailable();
                } catch (Throwable th) {
                    throw th;
                }
            }
            super.setEnabled(z2);
        }
    }

    @Override // com.aspose.words.FontSubstitutionRule
    public final com.aspose.words.internal.zzZXH zzZ(String str, int i, FontInfo fontInfo, com.aspose.words.internal.zzKJ zzkj) {
        return this.zzYxu.zzZ(str, i, fontInfo.zzZ72(), zzkj);
    }
}
