package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZJ6 implements com.aspose.words.internal.zzFL {
    private zzZHP zzYsr;
    private com.aspose.words.internal.zzZWJ zzxD = null;
    private com.aspose.words.internal.zzZV9 zz7g = new com.aspose.words.internal.zzZV9();

    public zzZJ6(zzZHP zzzhp) {
        this.zzYsr = zzzhp;
    }

    @Override // com.aspose.words.internal.zzFL
    public final com.aspose.words.internal.zzZWJ zzG9() {
        if (this.zzxD == null) {
            this.zzxD = new com.aspose.words.internal.zzZWJ();
        }
        return this.zzxD;
    }

    @Override // com.aspose.words.internal.zzFL
    public final String zzW7(int i) {
        return this.zz7g.zzW7(i);
    }

    @Override // com.aspose.words.internal.zzFL
    public final void zzZ(String str, com.aspose.words.internal.zzZXH zzzxh, boolean z) {
        zzZHP zzzhp = this.zzYsr;
        if (zzzhp != null) {
            zzzhp.zzZ(str, zzzxh, z);
        }
    }
}
