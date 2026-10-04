package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzJ1 {
    public short zzBj;
    public short zzBk;
    public short zzBl;
    public short zzBm;
    public short zzz1;

    public static zzJ1 zzT(zzY0 zzy0) throws Exception {
        short sZzXa = zzy0.zzXa();
        zzy0.zzq().zzH(zzy0.zzq().getPosition() - 2);
        return sZzXa < 0 ? zzSS.zzX(zzy0) : zzZYX.zzs(zzy0);
    }

    public final boolean isEmpty() {
        return this.zzz1 == 0;
    }

    public final void zzW(zzXZ zzxz) throws Exception {
        zzxz.zzj(this.zzz1);
        zzxz.zzj(this.zzBm);
        zzxz.zzj(this.zzBl);
        zzxz.zzj(this.zzBk);
        zzxz.zzj(this.zzBj);
    }

    public void zzX(zzXZ zzxz) throws Exception {
        zzW(zzxz);
    }
}
