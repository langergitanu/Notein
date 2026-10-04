package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzNN {
    private float zzF0;
    private zzPM zzF1;
    private zzZXH zzF2;
    private String zzF3;
    private int zzF4;
    private int zzF5;
    private float zzF6;
    private boolean zzFd;
    private zzN6 zzFz;

    public zzNN(float f, int i, int i2, String str, zzN6 zzn6) {
        this.zzF6 = f;
        this.zzF5 = i;
        this.zzF3 = str;
        this.zzFz = zzn6;
        this.zzFd = (i2 & 4) != 0;
        this.zzF4 = i2 & (-5);
    }

    private zzZXH zzM0() throws Exception {
        if (this.zzF2 == null) {
            this.zzF2 = this.zzFz.zzKp().zzMk().zzN(this.zzF3, this.zzF4);
        }
        return this.zzF2;
    }

    private float zzY(zzN6 zzn6) {
        return this.zzF5 == 2 ? this.zzF6 : ((float) zzn6.zzKi().zzY(this.zzF6, this.zzF5)) / zzn6.zzKn().zzMu().zzMp();
    }

    private boolean zzx(float f) {
        if (this.zzF5 == 2) {
            return true;
        }
        return zzAN.zzS(f, this.zzF0);
    }

    public final boolean zzM8() {
        return this.zzFd;
    }

    public final zzPM zzZ(zzN6 zzn6) throws Exception {
        float fZzMp = zzn6.zzKn().zzMu().zzMp();
        if (this.zzF1 != null && zzx(fZzMp)) {
            return this.zzF1;
        }
        zzPM zzpm = new zzPM(zzY(zzn6), this.zzF4, zzM0());
        this.zzF1 = zzpm;
        this.zzF0 = fZzMp;
        return zzpm;
    }
}
