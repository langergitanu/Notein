package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZN9 extends zzYKC {
    private int zzYxz;
    private com.aspose.words.internal.zzP5 zzZk5;

    public zzZN9() {
        zz6N();
    }

    private void zz6N() {
        this.zzZk5 = new com.aspose.words.internal.zzP5();
        com.aspose.words.internal.zzZQG.zzZ(zzYmo().zzZ0().zzO7(), this.zzZk5);
    }

    @Override // com.aspose.words.zzYKC
    public final void zzZ(int i, com.aspose.words.internal.zzPZ zzpz, int i2) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzZk5.zzNY(), zzpz.zzPM());
        this.zzYxz++;
    }

    @Override // com.aspose.words.zzYKC
    public final void zzZ(int i, com.aspose.words.internal.zzOS zzos) {
        if (this.zzYxz == 1) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzZk5.zzNY(), zzos.zzPM());
        }
        this.zzYxz++;
    }
}
