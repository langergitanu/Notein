package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz9G implements zzGC {
    private zzPV zzD0;
    private int zzD1;
    private int zzH3;
    private zzPM zzYX;
    private zz9V zzqA;
    private zzPV zzqB;
    private boolean zzqD;
    private zzGA zzqE;
    private zzA1 zzqF;
    private zz8T zzqG;
    private zz8U zzqH;
    private zz9J zzqJ;
    private int zzqK;
    private int zzqL;
    private int zzqM;
    private zz8W zzqN;
    private zz99 zzqO;
    private zzZQC<zz9F> zzqC = new zzZQC<>();
    private long zzqz = 0;
    private int zzD6 = 1;
    private zz9B zzqI = new zz9B(this);

    public zz9G(zzGA zzga, zz8T zz8t, boolean z, zzA1 zza1) {
        this.zzqE = zzga;
        this.zzqG = zz8t;
        this.zzqD = z;
        this.zzqF = zza1;
        this.zzqJ = new zz9J(zzZQ4.zzN(zz8t.zzyQ()));
        this.zzqO = zz8t.zzyN();
        zzzZ();
    }

    private void zzD(zzP9 zzp9) {
        zzp9.zzZ(1.0f, 1.0f / this.zzqN.zzY(this.zzqF, this.zzqG), 1);
    }

    private long zzZK(long j) throws Exception {
        int i = this.zzD1 & 6;
        float fZzT = 0.0f;
        float f = i != 2 ? i != 6 ? 0.0f : (-Float.intBitsToFloat((int) j)) / 2.0f : -Float.intBitsToFloat((int) j);
        int i2 = this.zzD1 & 24;
        if (i2 == 0) {
            fZzT = zz8W.zzT(zzZr());
        } else if (i2 == 8) {
            fZzT = -zz8W.zzS(zzZr());
        }
        return zzZPW.zzG(f, fZzT);
    }

    private boolean zzzX() {
        return this.zzqO.zzMq().zzOf() < 0.0f || this.zzqO.zzMq().zzOc() < 0.0f;
    }

    private zz9F zzzY() {
        zz9F zz9f = new zz9F();
        zz9f.zzY(this.zzqJ.zzA3());
        zz9f.zzZ(this.zzqO.zzzy());
        zz9f.zzZ(this.zzqI.zzzJ());
        zz9f.zzM(this.zzqB);
        zz9f.zzZI(this.zzqz);
        zz9f.zzUZ(this.zzqM);
        zz9f.zzUX(this.zzqL);
        zz9f.zzUW(this.zzqK);
        zz9f.zzUY(this.zzD1);
        zz9f.zzC(this.zzD0);
        zz9f.zzY1(this.zzH3);
        zz9f.zzZ(this.zzqA);
        zz9f.zzZ(this.zzqN);
        zz9f.zzV(this.zzYX);
        zz9f.zzZ(this.zzqH);
        return zz9f;
    }

    private void zzzZ() {
        this.zzqM = 2;
        this.zzqB = zzPV.zzI5;
        this.zzD0 = zzPV.zzKa;
        this.zzD1 = 0;
        this.zzqK = 0;
        this.zzH3 = 1;
        this.zzqL = 13;
        this.zzD6 = 1;
        this.zzqN = new zz8W(this.zzqD);
        this.zzqH = new zz8U(this.zzqD);
        this.zzqA = new zz9P(zzPV.zzI5);
    }

    public final void restore(int i) {
        if (this.zzqC.size() == 0) {
            return;
        }
        int iMax = Math.max(Math.min(this.zzqC.size(), i < 0 ? -i : this.zzqC.size() - i), 1);
        zz9F zz9fPop = this.zzqC.pop();
        for (int i2 = 0; i2 < iMax - 1; i2++) {
            zz9fPop = this.zzqC.pop();
        }
        zzZ(zz9fPop);
    }

    public final void save() {
        this.zzqC.push(zzzY());
    }

    public final zz8T zzA8() {
        return this.zzqG;
    }

    public final void zzC(zzPV zzpv) {
        this.zzD0 = zzpv;
    }

    @Override // com.aspose.words.internal.zzGC
    public final int zzFl() {
        if (this.zzqD) {
            return this.zzD6 != 2 ? 1 : 0;
        }
        return 2;
    }

    @Override // com.aspose.words.internal.zzGC
    public final zz9B zzFm() {
        return this.zzqI;
    }

    @Override // com.aspose.words.internal.zzGC
    public final long zzFn() {
        return this.zzqz;
    }

    @Override // com.aspose.words.internal.zzGC
    public final zzGE zzFo() {
        return this.zzqJ;
    }

    @Override // com.aspose.words.internal.zzGC
    public final int zzFp() {
        return this.zzqK;
    }

    @Override // com.aspose.words.internal.zzGC
    public final int zzFq() {
        return this.zzqL;
    }

    @Override // com.aspose.words.internal.zzGC
    public final boolean zzFr() {
        return (this.zzD1 & 1) != 0;
    }

    @Override // com.aspose.words.internal.zzGC
    public final zz8W zzFs() {
        return this.zzqN;
    }

    @Override // com.aspose.words.internal.zzGC
    public final zzG4 zzFt() {
        return this.zzqO;
    }

    @Override // com.aspose.words.internal.zzGC
    public final zzPV zzJb() {
        return this.zzD0;
    }

    public final void zzM(zzPV zzpv) {
        this.zzqB = zzpv;
    }

    @Override // com.aspose.words.internal.zzGC
    public final int zzO6() {
        return this.zzH3;
    }

    @Override // com.aspose.words.internal.zzGC
    public final zzPV zzOK() {
        return this.zzqM == 1 ? new zzPV(0, this.zzqB) : this.zzqB;
    }

    public final void zzUV(int i) {
        this.zzD6 = i;
    }

    public final void zzUW(int i) {
        this.zzqK = i;
    }

    public final void zzUX(int i) {
        this.zzqL = i;
    }

    public final void zzUY(int i) {
        this.zzD1 = i;
    }

    public final void zzUZ(int i) {
        this.zzqM = i;
    }

    public final void zzV0(int i) {
        zzGB zzgbZzWd = this.zzqE.zzWd(i);
        if (zzgbZzWd == null) {
            return;
        }
        int type = zzgbZzWd.getType();
        if (type == 1) {
            this.zzqA = (zz9V) zzgbZzWd;
            return;
        }
        if (type == 2) {
            this.zzqH = (zz8U) zzgbZzWd;
            return;
        }
        if (type != 4) {
            if (type == 6) {
                this.zzqN = (zz8W) zzgbZzWd;
                this.zzYX = null;
            } else if (type != 10 && type != 11) {
                throw new IllegalStateException("Unknown GDI object type.");
            }
        }
    }

    @Override // com.aspose.words.internal.zzGC
    public final zzPY zzWf(int i) {
        return ((zz9V) this.zzqE.zzWd(i)).zzZ(this);
    }

    public final void zzY(zzON zzon, int i) {
        this.zzqJ.zzZ(zzon, i);
    }

    public final void zzY1(int i) {
        this.zzH3 = i;
    }

    @Override // com.aspose.words.internal.zzGC
    public final zzP9 zzZ(long j, long j2, int i, float f, float f2) throws Exception {
        long jZzZK = zzZK(j2);
        zzP9 zzp9 = new zzP9();
        zzp9.zzY(Float.intBitsToFloat((int) jZzZK), zzZPW.zzYz(jZzZK), 1);
        zzp9.zzY(Float.intBitsToFloat((int) j), zzZPY.zzYC(j), 1);
        zzp9.zzZ(this.zzqO.zzMq(), 1);
        long jZzR = this.zzqO.zzMq().zzR(j);
        int i2 = (int) jZzR;
        zzp9.zzY(-Float.intBitsToFloat(i2), -zzZPY.zzYC(jZzR), 1);
        zzp9.zzX(-(this.zzqN.zzz8() / 10.0f), 1);
        if (i == 1) {
            zzZ(zzp9, f, f2);
        }
        zzD(zzp9);
        zzp9.zzY(Float.intBitsToFloat(i2), zzZPY.zzYC(jZzR), 1);
        return zzp9;
    }

    @Override // com.aspose.words.internal.zzGC
    public final zzPY zzZ1() {
        return this.zzqA.zzZ(this);
    }

    @Override // com.aspose.words.internal.zzGC
    public final zzOU zzZ2() {
        return this.zzqH.zzY(this);
    }

    public final void zzZI(long j) {
        this.zzqz = j;
    }

    public final void zzZJ(long j) throws Exception {
        this.zzqJ.zzi(this.zzqO.zzMq().zzR(zzZPY.zzG(Float.intBitsToFloat((int) j), zzZPW.zzYz(j))));
    }

    @Override // com.aspose.words.internal.zzGC
    public final zzPM zzZr() throws Exception {
        return this.zzqN.zzZ(this.zzqF, this.zzqG);
    }

    public final void zzq(zzZQ4 zzzq4) throws Exception {
        this.zzqJ.zzZ(new zzOJ(zzzq4).zzM(this.zzqO.zzMq()), 4);
    }

    public final void zzr(zzZQ4 zzzq4) throws Exception {
        this.zzqJ.zzZ(new zzOJ(zzzq4).zzM(this.zzqO.zzMq()), 1);
    }

    public final zzA1 zzzS() {
        return this.zzqF;
    }

    public final zz9J zzzT() {
        return this.zzqJ;
    }

    public final int zzzU() {
        return this.zzqM;
    }

    public final zz99 zzzV() {
        return this.zzqO;
    }

    public final zzP9 zzzW() {
        zzP9 zzp9ZzOo = this.zzqO.zzMq().zzOo();
        zzp9ZzOo.zzZ(this.zzqG.getHorizontalResolution() / 96.0f, this.zzqG.getVerticalResolution() / 96.0f, 0);
        return zzp9ZzOo;
    }

    private void zzZ(zzP9 zzp9, float f, float f2) {
        if (zzzX()) {
            zzp9.zzZ(zzZKQ.zzZN(f), zzZKQ.zzZN(f2), 1);
        }
    }

    @Override // com.aspose.words.internal.zzGC
    public final zzP9 zzZ(int i, float f, float f2, boolean z) throws Exception {
        zzP9 zzp9 = new zzP9();
        zzp9.zzZ(this.zzqN.zzU(zzZr()), 1.0f, 1);
        if (i == 1) {
            zzp9.zzZ((!zzzX() ? zzZKQ.zzZN(f) : 1.0f) * Math.abs(f2 / f), zzzX() ? 1.0f : zzZKQ.zzZN(f2), 1);
        }
        if (this.zzqN.zzz7() && z) {
            zzp9.zzX(-90.0f, 1);
            zzp9.zzY(zzZr().zzPf() - zzZr().getDescentPoints(), zzZr().getDescentPoints(), 1);
        }
        return zzp9;
    }

    @Override // com.aspose.words.internal.zzGC
    public final boolean zzZ(int i, float f, float f2) throws Exception {
        return !zzZ(i, f, f2, true).isIdentity();
    }

    public final void zzZ(zzP8 zzp8, int i) {
        this.zzqJ.zzZ(new zzOX(zzp8), i);
    }

    private void zzZ(zz9F zz9f) {
        this.zzqJ.zzZ(zz9f.zzzR());
        this.zzqO.zzY(zz9f.zzzQ());
        this.zzqI.zzY(zz9f.zzzN());
        this.zzqB = zz9f.zzOK();
        this.zzqz = zz9f.zzFn();
        this.zzqM = zz9f.zzzU();
        this.zzqL = zz9f.zzFq();
        this.zzqK = zz9f.zzFp();
        this.zzD1 = zz9f.zzJc();
        this.zzD0 = zz9f.zzJb();
        this.zzH3 = zz9f.zzO6();
        this.zzqA = zz9f.zzzP();
        this.zzqN = zz9f.zzFs();
        this.zzYX = zz9f.zzZr();
        this.zzqH = zz9f.zzzO();
    }
}
