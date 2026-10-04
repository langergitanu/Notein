package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZZ1 {
    private int zzV7;
    private short zzcn;
    private short zzco;
    private short zzcp;
    private short zzcq;

    public static zzZZ1 zzv(zzY0 zzy0) throws Exception {
        zzZZ1 zzzz1 = new zzZZ1();
        zzzz1.zzV7 = zzy0.zzXc();
        zzzz1.zzcq = zzy0.zzX9();
        zzzz1.zzco = zzy0.zzX9();
        zzzz1.zzcp = zzy0.zzX9();
        zzzz1.zzcn = zzy0.zzX9();
        return zzzz1;
    }

    public final int getVersion() {
        return this.zzV7;
    }

    public final boolean isValid() {
        int i = this.zzV7;
        return (i == 65536 || i == 1330926671) && (this.zzcq & 65535) > 0;
    }

    public final void setVersion(int i) {
        this.zzV7 = i;
    }

    public final void zzO(short s) {
        this.zzcq = s;
    }

    public final void zzX(zzXZ zzxz) throws Exception {
        zzxz.zzl(this.zzV7);
        zzxz.zzi(this.zzcq & 65535);
        int iFloor = (int) Math.floor(zzZKQ.zzE(this.zzcq, 2.0d));
        int iPow = ((int) Math.pow(2.0d, iFloor)) * 16;
        int i = ((65535 & this.zzcq) * 16) - iPow;
        zzxz.zzi(iPow);
        zzxz.zzi(iFloor);
        zzxz.zzi(i);
    }

    public final short zzrj() {
        return this.zzcq;
    }
}
