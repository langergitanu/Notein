package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZD {
    private int zzZEm;
    private int zzZEn;
    private zzZ9[] zzZEo;

    public zzZD(zzYYL zzyyl, int i, zzYY[] zzyyArr) throws Exception {
        zzZ(zzyyl);
        this.zzZEo = new zzZ9[this.zzZEm];
        zzyyl.zzq().zzH(this.zzZEn);
        int[] iArrZzZ = zzZ(zzyyl, this.zzZEo.length);
        for (int i2 = 0; i2 < iArrZzZ.length; i2++) {
            zzyyl.zzq().zzH(iArrZzZ[i2]);
            this.zzZEo[i2] = new zzZ9(zzyyl, i, zzyyArr);
        }
    }

    private void zzZ(zzYYL zzyyl) throws Exception {
        zzyyl.zzua(1229866072);
        zzyyl.zzQk(16);
        this.zzZEn = zzyyl.zzYD0();
        this.zzZEm = zzyyl.zzYD0();
        zzyyl.zzQk(28);
    }

    public final zzZ9[] zzaO() {
        return this.zzZEo;
    }

    private static int[] zzZ(zzYYL zzyyl, int i) throws Exception {
        int[] iArr = new int[i];
        zzyyl.zzua(1229215828);
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = zzyyl.zzX9() & 65535;
        }
        return iArr;
    }
}
