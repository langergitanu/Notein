package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYIW extends zzYKC {
    protected com.aspose.words.internal.zzDB[] zzXxG;
    protected com.aspose.words.internal.zzDB[] zzXxH;
    protected com.aspose.words.internal.zzP5[] zzXxI;
    private int zzYxz;

    public zzYIW() {
        zzYkt();
    }

    private void zzV(com.aspose.words.internal.zzOW zzow) {
        for (int i = 0; i < 2; i++) {
            if (this.zzXxH[i].contains(this.zzYxz)) {
                com.aspose.words.internal.zzZQG.zzZ(this.zzXxI[i].zzNY(), zzow.zzPM());
            } else {
                com.aspose.words.internal.zzDB zzdb = this.zzXxG[i];
                if (zzdb != null && zzdb.contains(this.zzYxz)) {
                    com.aspose.words.internal.zzOW zzowZzPM = zzow.zzPM();
                    zzowZzPM.zzPN();
                    this.zzXxI[i].zzNY().add(0, zzowZzPM);
                }
            }
        }
        this.zzYxz++;
    }

    private void zzYkt() {
        this.zzXxI = new com.aspose.words.internal.zzP5[2];
        int i = 0;
        while (true) {
            com.aspose.words.internal.zzP5[] zzp5Arr = this.zzXxI;
            if (i >= zzp5Arr.length) {
                this.zzXxH = new com.aspose.words.internal.zzDB[2];
                this.zzXxG = new com.aspose.words.internal.zzDB[2];
                return;
            } else {
                zzp5Arr[i] = new com.aspose.words.internal.zzP5();
                com.aspose.words.internal.zzZQG.zzZ(zzYmo().zzZ0().zzO7(), this.zzXxI[i]);
                i++;
            }
        }
    }

    @Override // com.aspose.words.zzYKC
    public final void zzZ(int i, com.aspose.words.internal.zzOS zzos) {
        zzV(zzos);
    }

    @Override // com.aspose.words.zzYKC
    public final void zzZ(int i, com.aspose.words.internal.zzPZ zzpz, int i2) {
        zzV(zzpz);
    }
}
