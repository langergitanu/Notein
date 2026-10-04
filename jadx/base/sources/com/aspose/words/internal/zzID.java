package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzID extends zzZWZ {
    private short[] zzxE;
    private zzIE[] zzxF;

    public zzID(zzIE[] zzieArr, short[] sArr) {
        this.zzxF = zzieArr;
        this.zzxE = sArr;
    }

    public static zzID zzY(zzY0 zzy0, int i, int i2) throws Exception {
        zzIE[] zzieArr = new zzIE[i];
        for (int i3 = 0; i3 < i; i3++) {
            zzieArr[i3] = new zzIE(zzy0);
        }
        int i4 = i2 - i;
        short[] sArr = new short[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            sArr[i5] = zzy0.zzXa();
        }
        return new zzID(zzieArr, sArr);
    }

    public final short[] zzGo() {
        return this.zzxE;
    }

    public final zzIE[] zzGp() {
        return this.zzxF;
    }

    public final zzIE zzWl(int i) {
        zzIE[] zzieArr = this.zzxF;
        if (i < zzieArr.length) {
            return zzieArr[i];
        }
        return new zzIE(zzieArr[zzieArr.length - 1].zzxH, this.zzxE[i - zzieArr.length]);
    }

    @Override // com.aspose.words.internal.zzZWZ
    public final void zzX(zzXZ zzxz) throws Exception {
        for (zzIE zzie : this.zzxF) {
            zzie.zzX(zzxz);
        }
        for (short s : this.zzxE) {
            zzxz.zzi(s);
        }
    }
}
