package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz90 {
    private int zzpV;
    private int zzpW;
    private int zzpX;
    private int zzpY;
    private int zzpZ;
    private int zzq0;
    private zzZQ4 zzq1;
    private zzZQ5 zzq2;
    private zzZQ5 zzq3;

    public zz90() {
        zzZQ5 zzzq5 = zzZQ5.zz2U;
        this.zzq3 = zzzq5;
        this.zzq2 = zzzq5;
        this.zzq1 = zzZQ4.zz2T;
    }

    private void zzzi() {
        zzZQ4 zzzq4ZzN = zzZQ4.zzN(zzAN.zzV(this.zzq3));
        float f = this.zzq0 / this.zzpY;
        float f2 = this.zzpZ / this.zzpX;
        float fZzZm = (zzzq4ZzN.zzZm() * f) / 100.0f;
        float fZzZo = (zzzq4ZzN.zzZo() * f2) / 100.0f;
        this.zzq1 = zzZQ4.zzX(fZzZm, fZzZo, (zzzq4ZzN.zzkw() * f) / 100.0f, (zzzq4ZzN.zzZn() * f2) / 100.0f);
        this.zzq2 = new zzZQ5(zzAN.zzZG(fZzZm), zzAN.zzZG(fZzZo), zzAN.zzZG((r6 - fZzZm) + 1.0f), zzAN.zzZG((r0 - fZzZo) + 1.0f));
    }

    public final float getHorizontalResolution() {
        return (float) ((((double) this.zzq0) / ((double) this.zzpY)) * 25.4d);
    }

    public final float getVerticalResolution() {
        return (float) ((((double) this.zzpZ) / ((double) this.zzpX)) * 25.4d);
    }

    public final void zzZ(zzZOX zzzox) throws Exception {
        zzzox.zzXc();
        int iZzXc = zzzox.zzXc();
        zzzox.zzXc();
        zzzox.zzXc();
        zzzox.zzXc();
        zzzox.zzXc();
        this.zzq3 = zzZQ5.zzT(zzzox.zzXc(), zzzox.zzXc(), zzzox.zzXc(), zzzox.zzXc());
        zzzox.zzXc();
        zzzox.zzXc();
        zzzox.zzXc();
        zzzox.zzXc();
        zzzox.zzXa();
        zzzox.zzXa();
        zzzox.zzXc();
        zzzox.zzXc();
        zzzox.zzXc();
        this.zzq0 = zzzox.zzXc();
        this.zzpZ = zzzox.zzXc();
        this.zzpY = zzzox.zzXc();
        int iZzXc2 = zzzox.zzXc();
        this.zzpX = iZzXc2;
        long j = ((long) iZzXc) & 4294967295L;
        if (j >= 108) {
            zzzox.zzXc();
            zzzox.zzXc();
            zzzox.zzXc();
            this.zzpW = zzzox.zzXc();
            this.zzpV = zzzox.zzXc();
        } else {
            this.zzpW = this.zzpY * 1000;
            this.zzpV = iZzXc2 * 1000;
        }
        zzzox.zzq().zzH(j);
        zzzi();
    }

    public final zz98 zzzf() {
        return new zz98(zzZPX.zzZm(this.zzq0, this.zzpZ), zzZPX.zzZm(this.zzpY, this.zzpX), zzZPX.zzZm(this.zzpW, this.zzpV));
    }

    public final zzZQ5 zzzg() {
        return this.zzq2;
    }

    public final zzZQ4 zzzh() {
        return this.zzq1;
    }
}
