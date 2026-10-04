package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZGJ {
    private com.aspose.words.internal.zzZQC<zzZGK> zzYos = new com.aspose.words.internal.zzZQC<>();

    public zzZGJ() {
        zzZ0V();
    }

    public final void zzZ(DocumentBuilder documentBuilder, zzZYY zzzyy, zzZFF zzzff, String str, double d, boolean z) {
        zzZ0T();
        zzZGK zzzgk = new zzZGK(documentBuilder, zzzyy, zzzff, str, d, z);
        this.zzYos.pop();
        this.zzYos.push(zzzgk);
    }

    public final zzZGK zzZ0T() {
        this.zzYos.size();
        return this.zzYos.peek();
    }

    public final void zzZ0U() {
        this.zzYos.size();
        this.zzYos.pop();
    }

    public final void zzZ0V() {
        this.zzYos.push(null);
    }
}
