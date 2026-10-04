package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY83 {
    private com.aspose.words.internal.zzZQC<zzL1> zzX8I = new com.aspose.words.internal.zzZQC<>();

    public final void zzV(zzZIH zzzih) {
        if (!zzzih.zzYr8) {
            zzQ4 zzq4 = (zzQ4) com.aspose.words.internal.zzZKW.zzZ(zzzih.zzZWe().zzSx("vertical-align"), zzQ4.class);
            zzmpZzZWj = zzq4 != null ? zzq4.zzZWj() : null;
            if (zzmpZzZWj == null && this.zzX8I.size() > 0) {
                zzmpZzZWj = this.zzX8I.peek().zzZTN();
            }
        }
        this.zzX8I.push(new zzL1(zzmpZzZWj));
    }

    public final zzL1 zzY1E() {
        return this.zzX8I.peek();
    }

    public final void zzZP() {
        this.zzX8I.pop();
    }
}
