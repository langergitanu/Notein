package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZI5 extends zzZI4 {
    private zzY86 zzYqK;
    private String zzkB;

    public zzZI5(zzY86 zzy86, zzYXT zzyxt) {
        this.zzYqK = zzy86;
        this.zzkB = zzyxt != null ? zzyxt.zzYCh() : "styles.css";
    }

    @Override // com.aspose.words.zzZI4
    public final String getUri() {
        return this.zzkB;
    }

    @Override // com.aspose.words.zzZI4
    public final void zzKL(String str) throws Exception {
        this.zzYqK.zzX(new zzY5X(new com.aspose.words.internal.zzZNI(false), "text/css", this.zzkB, str));
    }
}
