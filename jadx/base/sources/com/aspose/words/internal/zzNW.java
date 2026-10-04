package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzNW {
    private zzNZ zzFn;
    private zzN4 zzFo;
    private zz8J zzFp;
    private zzNV zzFq;
    private zzN6 zzFz;

    public zzNW(zzN6 zzn6) {
        this.zzFz = zzn6;
        this.zzFq = new zzNV(zzn6);
        this.zzFn = new zzNZ(zzZQ4.zzN(zzn6.zzKp().zzAg().zzyQ()));
        this.zzFp = new zz8J(zzZQ4.zzN(zzn6.zzKp().zzAg().zzyQ()), this.zzFn, this.zzFq);
        this.zzFo = new zzN4(this.zzFn, this.zzFq);
    }

    public final void restore(int i) {
        this.zzFo.zzX8(i);
    }

    public final zz8J zzMt() {
        return this.zzFp;
    }

    public final zzNV zzMu() {
        return this.zzFq;
    }

    public final void zzMv() {
        this.zzFn.zzZ(zzOK.zzNg(), 0);
    }

    public final void zzXA(int i) {
        this.zzFo.zzX9(i);
    }

    public final void zzXy(int i) {
        this.zzFo.zzXy(i);
    }

    public final void zzXz(int i) {
        this.zzFo.zzZ(i, new zzP9());
    }

    public final void zzY(zzZQ4 zzzq4, int i) throws Exception {
        zzZ(new zzOJ(zzzq4), i);
    }

    public final void zzZ(int i, zzZQ4 zzzq4, zzZQ4 zzzq42) {
        this.zzFo.zzZ(i, zzP9.zzZ(zzzq4, zzzq42));
    }

    public final void zzh(long j) throws Exception {
        long jZzR = this.zzFq.zzMq().zzR(zzZPY.zzG(Float.intBitsToFloat((int) j), zzZPW.zzYz(j)));
        this.zzFn.zzi(zzZPW.zzG(Float.intBitsToFloat((int) jZzR), zzZPY.zzYC(jZzR)));
    }

    public final void zzo(int i, int i2) throws Exception {
        zzON zzonZzXp = this.zzFz.zzKk().zzXp(i);
        if (zzonZzXp == null) {
            return;
        }
        zzZ(zzonZzXp, i2);
    }

    public final void zzp(int i, int i2) throws Exception {
        zzP8 zzp8ZzXq = this.zzFz.zzKk().zzXq(i);
        if (zzp8ZzXq == null) {
            return;
        }
        zzZ(new zzOX(zzp8ZzXq), i2);
    }

    private void zzZ(zzON zzon, int i) throws Exception {
        this.zzFn.zzZ(zzon.zzM(this.zzFq.zzMq()), i);
    }
}
