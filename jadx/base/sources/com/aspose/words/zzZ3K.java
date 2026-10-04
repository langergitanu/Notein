package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ3K {
    private com.aspose.words.internal.zzAY zzYaD;
    private com.aspose.words.internal.zzAZ zzYaE;
    private com.aspose.words.internal.zzBG zzYb8;

    public zzZ3K(com.aspose.words.internal.zzBG zzbg) {
        this.zzYb8 = zzbg;
    }

    public final void zzP(zzZ6N zzz6n) throws Exception {
        if (!zzz6n.zzYSs()) {
            zzYNd();
            return;
        }
        if (this.zzYaE == null) {
            com.aspose.words.internal.zzAZ zzaz = new com.aspose.words.internal.zzAZ();
            this.zzYaE = zzaz;
            this.zzYb8.zzX(zzaz);
        }
        com.aspose.words.internal.zzAY zzay = new com.aspose.words.internal.zzAY();
        this.zzYaD = zzay;
        this.zzYaE.zzX(zzay);
    }

    public final com.aspose.words.internal.zzAY zzYNb() {
        return this.zzYaD;
    }

    public final boolean zzYNc() {
        return this.zzYaE != null;
    }

    public final void zzYNd() {
        this.zzYaE = null;
        this.zzYaD = null;
    }
}
