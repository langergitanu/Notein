package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzKS extends zzYKC {
    private int zzZAq;
    private com.aspose.words.internal.zzP5 zzZk5;

    public zzKS() {
        zz6N();
    }

    private void zz6N() {
        this.zzZk5 = new com.aspose.words.internal.zzP5();
        com.aspose.words.internal.zzZQG.zzZ(zzYmo().zzZ0().zzO7(), this.zzZk5);
    }

    @Override // com.aspose.words.zzYKC
    public final void zzZ(int i, com.aspose.words.internal.zzPZ zzpz, int i2) {
        if (i == 0) {
            int i3 = this.zzZAq;
            if (i3 < 2 || i3 >= i2 - 3) {
                com.aspose.words.internal.zzZQG.zzZ(this.zzZk5.zzNY(), zzpz.zzPM());
            }
        } else if (i == 1) {
            this.zzZk5.zzNY().add(this.zzZk5.getCount() / 2, zzpz.zzPM());
        }
        this.zzZAq++;
    }
}
