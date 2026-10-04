package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzK1 extends zzZWZ {
    short zzBe;
    short zzBf;
    short zzBg;
    short zzBh;
    short zzBi;
    short zzBj;
    short zzBk;
    short zzBl;
    short zzBm;
    long zzBn;
    long zzBo;
    short zzBp;
    short zzBq;
    int zzBr;
    int zzBs;
    int zzBt;
    int zzBu;

    public static zzK1 zzU(zzY0 zzy0) throws Exception {
        zzK1 zzk1 = new zzK1();
        int iZzXb = zzy0.zzXb();
        zzk1.zzBu = iZzXb;
        if (iZzXb != 65536) {
            throw new UnsupportedOperationException("Unsupported font head version.");
        }
        zzk1.zzBt = zzy0.zzXb();
        zzk1.zzBs = zzy0.zzXb();
        int iZzXb2 = zzy0.zzXb();
        zzk1.zzBr = iZzXb2;
        if (iZzXb2 != 1594834165) {
            throw new UnsupportedOperationException("Unsupported font head magic number.");
        }
        zzk1.zzBq = zzy0.zzX9();
        zzk1.zzBp = zzy0.zzX9();
        zzk1.zzBo = zzy0.zzX8();
        zzk1.zzBn = zzy0.zzX8();
        zzk1.zzBm = zzy0.zzXa();
        zzk1.zzBl = zzy0.zzXa();
        zzk1.zzBk = zzy0.zzXa();
        zzk1.zzBj = zzy0.zzXa();
        zzk1.zzBi = zzy0.zzX9();
        zzk1.zzBh = zzy0.zzX9();
        zzk1.zzBg = zzy0.zzXa();
        zzk1.zzBf = zzy0.zzXa();
        zzk1.zzBe = zzy0.zzXa();
        return zzk1;
    }

    public final int getStyle() {
        short s = this.zzBi;
        return ((s & 1) != 0 ? 1 : 0) | ((s & 2) != 0 ? 2 : 0) | ((s & 4) != 0 ? 4 : 0);
    }

    public final void zz7(boolean z) {
        this.zzBf = (short) (!z ? 1 : 0);
    }

    public final boolean zzHW() {
        return this.zzBf == 0;
    }

    @Override // com.aspose.words.internal.zzZWZ
    public final void zzX(zzXZ zzxz) throws Exception {
        zzxz.zzk(this.zzBu);
        zzxz.zzk(this.zzBt);
        zzxz.zzk(this.zzBs);
        zzxz.zzk(this.zzBr);
        zzxz.zzi(this.zzBq & 65535);
        zzxz.zzi(this.zzBp & 65535);
        zzxz.zzQ(this.zzBo);
        zzxz.zzQ(this.zzBn);
        zzxz.zzj(this.zzBm);
        zzxz.zzj(this.zzBl);
        zzxz.zzj(this.zzBk);
        zzxz.zzj(this.zzBj);
        zzxz.zzi(this.zzBi & 65535);
        zzxz.zzi(this.zzBh & 65535);
        zzxz.zzj(this.zzBg);
        zzxz.zzj(this.zzBf);
        zzxz.zzj(this.zzBe);
    }
}
