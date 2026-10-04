package com.aspose.words.internal;

import com.huawei.hms.network.embedded.C18177fb;

/* JADX INFO: loaded from: classes5.dex */
final class zz8Y {
    private int zzEc;
    private short zzpM;
    private short zzpN;
    private short zzpO;
    private short zzpP;
    private short zzpQ;
    private int zzpR;
    private short zzpS;
    private short zzpT;

    private zz8Y() {
    }

    public static zz8Y zzX(zzZOX zzzox) throws Exception {
        zz8Y zz8y = new zz8Y();
        zz8y.zzEc = zzzox.zzXc();
        zz8y.zzpS = zzzox.zzXa();
        zz8y.zzpP = zzzox.zzXa();
        zz8y.zzpO = zzzox.zzXa();
        zz8y.zzpN = zzzox.zzXa();
        zz8y.zzpM = zzzox.zzXa();
        zz8y.zzpT = zzzox.zzXa();
        zz8y.zzpR = zzzox.zzXc();
        zz8y.zzpQ = zzzox.zzXa();
        return zz8y;
    }

    private short zzzd() {
        int i = this.zzEc;
        long j = ((((((((long) (i >>> 16)) ^ (((long) i) & C18177fb.f54859s)) ^ ((long) this.zzpS)) ^ ((long) this.zzpP)) ^ ((long) this.zzpO)) ^ ((long) this.zzpN)) ^ ((long) this.zzpM)) ^ ((long) this.zzpT);
        int i2 = this.zzpR;
        return (short) ((j ^ ((long) (i2 >>> 16))) ^ (((long) i2) & C18177fb.f54859s));
    }

    public final zzZQ5 zzWG() {
        short s = this.zzpP;
        short s2 = this.zzpO;
        return new zzZQ5(s, s2, this.zzpN - s, this.zzpM - s2);
    }

    public final void zzZ(zzZOW zzzow) throws Exception {
        zzzow.zzl(this.zzEc);
        zzzow.zzK(this.zzpS);
        zzzow.zzK(this.zzpP);
        zzzow.zzK(this.zzpO);
        zzzow.zzK(this.zzpN);
        zzzow.zzK(this.zzpM);
        zzzow.zzK(this.zzpT);
        zzzow.zzl(this.zzpR);
        zzzow.zzK(this.zzpQ);
    }

    public final short zzzb() {
        return this.zzpT;
    }

    public final boolean zzzc() {
        return this.zzpN - this.zzpP > 0 && this.zzpM - this.zzpO > 0;
    }

    public zz8Y(short s, short s2, short s3, short s4) {
        this.zzEc = -1698247209;
        this.zzpS = (short) 0;
        this.zzpP = s;
        this.zzpO = s2;
        this.zzpN = s3;
        this.zzpM = s4;
        this.zzpT = (short) 72;
        this.zzpR = 0;
        this.zzpQ = zzzd();
    }
}
