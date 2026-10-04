package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzX4 extends zzYKC {
    private int zzZAq;
    private com.aspose.words.internal.zzP5 zzZAr;

    public zzX4() {
        zz6N();
    }

    private void zz6N() {
        this.zzZAr = new com.aspose.words.internal.zzP5();
        com.aspose.words.internal.zzZQG.zzZ(zzYmn().zzZ0().zzO7(), this.zzZAr);
    }

    @Override // com.aspose.words.zzYKC
    public final void zzZ(int i, com.aspose.words.internal.zzPZ zzpz, int i2) {
        if (i == 0) {
            int i3 = this.zzZAq;
            if (i3 == 0 || i3 == 1) {
                com.aspose.words.internal.zzZQG.zzZ(this.zzZAr.zzNY(), zzpz.zzPM());
            } else if (i3 == 6 || i3 == 7) {
                this.zzZAr.zzNY().add(this.zzZAq - 6, zzpz.zzPM());
            }
        } else if (i == 1) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzZAr.zzNY(), zzpz.zzPM());
        }
        this.zzZAq++;
    }
}
