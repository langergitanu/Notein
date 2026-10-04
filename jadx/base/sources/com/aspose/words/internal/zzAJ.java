package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzAJ extends zzZWZ {
    int zzBu;
    short zzrP;
    short zzrQ;
    short zzrR;
    short zzrS;
    short zzrT;
    short zzrU;
    short zzrV;
    short zzrW;
    short zzrX;
    short zzrY;
    short zzrZ;
    short zzs0;
    short zzs1;
    short zzs2;

    public zzAJ(zzY0 zzy0) throws Exception {
        this.zzBu = zzy0.zzXb();
        this.zzs2 = zzy0.zzX9();
        int i = this.zzBu;
        if (i == 20480) {
            return;
        }
        if (i != 65536) {
            throw new UnsupportedOperationException("Unsupported maximum profile version.");
        }
        this.zzs1 = zzy0.zzX9();
        this.zzs0 = zzy0.zzX9();
        this.zzrZ = zzy0.zzX9();
        this.zzrY = zzy0.zzX9();
        this.zzrX = zzy0.zzX9();
        this.zzrW = zzy0.zzX9();
        this.zzrV = zzy0.zzX9();
        this.zzrU = zzy0.zzX9();
        this.zzrT = zzy0.zzX9();
        this.zzrS = zzy0.zzX9();
        this.zzrR = zzy0.zzX9();
        this.zzrQ = zzy0.zzX9();
        this.zzrP = zzy0.zzX9();
    }

    @Override // com.aspose.words.internal.zzZWZ
    public final void zzX(zzXZ zzxz) throws Exception {
        zzxz.zzk(this.zzBu);
        zzxz.zzj(this.zzs2 & 65535);
        if (this.zzBu == 20480) {
            return;
        }
        zzxz.zzj(this.zzs1 & 65535);
        zzxz.zzj(this.zzs0 & 65535);
        zzxz.zzj(this.zzrZ & 65535);
        zzxz.zzj(this.zzrY & 65535);
        zzxz.zzj(this.zzrX & 65535);
        zzxz.zzj(this.zzrW & 65535);
        zzxz.zzj(this.zzrV & 65535);
        zzxz.zzj(this.zzrU & 65535);
        zzxz.zzj(this.zzrT & 65535);
        zzxz.zzj(this.zzrS & 65535);
        zzxz.zzj(this.zzrR & 65535);
        zzxz.zzj(this.zzrQ & 65535);
        zzxz.zzj(this.zzrP & 65535);
    }
}
