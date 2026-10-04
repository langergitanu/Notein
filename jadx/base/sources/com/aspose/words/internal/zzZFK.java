package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZFK extends zzZFO {
    int zzUt;
    final zzZQY zzWMw;

    public zzZFK(zzZF1 zzzf1, String str, char[] cArr, int i, int i2, zzZQY zzzqy, zzZF7 zzzf7) {
        super(zzzf1, str, zzzqy.getPublicId(), zzzf7);
        this.zzZnz = cArr;
        this.zzUt = 0;
        this.zzWMR = i2;
        this.zzWMw = zzzqy;
    }

    @Override // com.aspose.words.internal.zzZF1
    public final void close() {
        this.zzZnz = null;
    }

    @Override // com.aspose.words.internal.zzZF1
    public final int zzW(zzZF3 zzzf3) {
        int i;
        int i2;
        int i3;
        char[] cArr = this.zzZnz;
        if (cArr == null || (i3 = (i = this.zzWMR) - (i2 = this.zzUt)) <= 0) {
            return -1;
        }
        zzzf3.zzWLX = cArr;
        zzzf3.zzWMi = i2;
        zzzf3.zzWMh = i;
        this.zzUt = i;
        return i3;
    }

    @Override // com.aspose.words.internal.zzZF1
    public final boolean zzXNB() {
        return true;
    }

    @Override // com.aspose.words.internal.zzZFO, com.aspose.words.internal.zzZF1
    public final void zzZ(zzZF3 zzzf3) {
        zzzf3.zzWLW = this.zzWMw.zzll();
        zzzf3.zzWLV = this.zzWMw.getLineNumber();
        zzzf3.zzWLU = (-this.zzWMw.getColumnNumber()) + 1;
    }

    @Override // com.aspose.words.internal.zzZF1
    public final boolean zzZ(zzZF3 zzzf3, int i) {
        return zzzf3.zzWMi >= zzzf3.zzWMh && this.zzWMR - this.zzUt >= i && zzW(zzzf3) > 0;
    }
}
