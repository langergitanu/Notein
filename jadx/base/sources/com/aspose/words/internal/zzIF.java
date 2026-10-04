package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzIF extends zzZWZ {
    int zzBu;
    short zzxI;
    short zzxJ;
    short zzxK;
    short zzxL;
    short zzxM;
    short zzxN;
    short zzxO;
    short zzxP;
    short zzxQ;
    short zzxR;
    short zzxS;
    short zzxT;
    short zzxU;
    short zzxV;
    short zzxW;
    short zzxX;

    public zzIF(zzY0 zzy0) throws Exception {
        int iZzXb = zzy0.zzXb();
        this.zzBu = iZzXb;
        if (iZzXb != 65536) {
            throw new UnsupportedOperationException("Unsupported font head version.");
        }
        this.zzxX = zzy0.zzXa();
        this.zzxW = zzy0.zzXa();
        this.zzxV = zzy0.zzXa();
        this.zzxU = zzy0.zzX9();
        this.zzxT = zzy0.zzXa();
        this.zzxS = zzy0.zzXa();
        this.zzxR = zzy0.zzXa();
        this.zzxQ = zzy0.zzXa();
        this.zzxP = zzy0.zzXa();
        this.zzxO = zzy0.zzXa();
        this.zzxN = zzy0.zzXa();
        this.zzxM = zzy0.zzXa();
        this.zzxL = zzy0.zzXa();
        this.zzxK = zzy0.zzXa();
        this.zzxJ = zzy0.zzXa();
        this.zzxI = zzy0.zzX9();
    }

    @Override // com.aspose.words.internal.zzZWZ
    public final void zzX(zzXZ zzxz) throws Exception {
        zzxz.zzk(this.zzBu);
        zzxz.zzj(this.zzxX);
        zzxz.zzj(this.zzxW);
        zzxz.zzj(this.zzxV);
        zzxz.zzj(this.zzxU & 65535);
        zzxz.zzj(this.zzxT);
        zzxz.zzj(this.zzxS);
        zzxz.zzj(this.zzxR);
        zzxz.zzj(this.zzxQ);
        zzxz.zzj(this.zzxP);
        zzxz.zzj(this.zzxO);
        zzxz.zzj(this.zzxN);
        zzxz.zzj(this.zzxM);
        zzxz.zzj(this.zzxL);
        zzxz.zzj(this.zzxK);
        zzxz.zzj(this.zzxJ);
        zzxz.zzj(this.zzxI & 65535);
    }
}
