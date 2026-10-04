package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ1 {
    private zzYY[] zzZDU;
    private int zzZDV;
    private int zzZDW;

    public zzZ1(zzYYL zzyyl) throws Exception {
        zzZ(zzyyl);
        zzY(zzyyl);
    }

    private void zzY(zzYYL zzyyl) throws Exception {
        zzyyl.zzua(1413564248);
        int iZzYD0 = zzyyl.zzYD0();
        this.zzZDV = zzyyl.zzYD0();
        int i = (iZzYD0 - 12) / 4;
        this.zzZDU = new zzYY[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.zzZDU[i2] = new zzYY(zzyyl);
        }
    }

    private void zzZ(zzYYL zzyyl) throws Exception {
        zzyyl.zzua(1229866072);
        int iZzXb = zzyyl.zzXb();
        zzyyl.zzQk(16);
        this.zzZDW = zzyyl.zzYD0();
        zzyyl.zzQk(28);
        zzyyl.zzq().zzH(((long) iZzXb) & 4294967295L);
    }

    public final zzYY[] zzao() {
        return this.zzZDU;
    }

    public final int zzap() {
        return this.zzZDV;
    }

    public final int zzaq() {
        return this.zzZDW;
    }
}
