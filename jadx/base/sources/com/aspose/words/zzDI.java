package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzDI {
    private static int zzZaH = 26;
    private int zzZaD;
    private long zzZaE;
    private int zzZaI;
    private float zzZaJ;
    private float zzZaK;
    private float zzZaL;
    private com.aspose.words.internal.zzG[] zzZaM;
    private zzZC3 zzZge;
    private zzD8 zzZz1;
    private com.aspose.words.internal.zzZQ4 zzZaG = com.aspose.words.internal.zzZQ4.zz2T;
    private com.aspose.words.internal.zzZQC<com.aspose.words.internal.zzG> zzeU = new com.aspose.words.internal.zzZQC<>();
    private com.aspose.words.internal.zzD3<byte[]> zzZaC = new com.aspose.words.internal.zzD3<>();
    private zzFH zzZaF = new zzFH(this);

    public zzDI(zzD8 zzd8, zz50 zz50Var) {
        this.zzZaE = 0L;
        this.zzZz1 = zzd8;
        this.zzZge = zz50Var.zzZIB();
        this.zzZaE = com.aspose.words.internal.zzZPW.zzG(com.aspose.words.internal.zzSA.zzp(Float.intBitsToFloat((int) zz50Var.zzZIz())), com.aspose.words.internal.zzSA.zzp(com.aspose.words.internal.zzZPW.zzYz(zz50Var.zzZIz())));
        this.zzeU.push(new com.aspose.words.internal.zzG());
        this.zzZaM = new com.aspose.words.internal.zzG[zzZaH];
    }

    private void zzZID() {
        for (zzGK zzgk : this.zzZz1.zzZHX().zz45().zzZJe()) {
            int iZzZQO = zzgk.zzZQO();
            if (iZzZQO == 7 || iZzZQO == 8 || iZzZQO == 9 || iZzZQO == 12) {
                Iterator<ChartSeries> it = zzgk.zzZPj().iterator();
                while (it.hasNext()) {
                    this.zzZaD = Math.max(it.next().getValueCount(), this.zzZaD);
                }
            } else {
                this.zzZaD = Math.max(zzgk.zzZPj().getCount() - 1, this.zzZaD);
            }
        }
    }

    public final zzD8 getChartSpace() {
        return this.zzZz1;
    }

    public final int getStyle() {
        return this.zzZz1.zzZHO();
    }

    public final void zzA(com.aspose.words.internal.zzG zzg) {
        zzsD().zzX((com.aspose.words.internal.zzZL) zzg);
        zzW(zzg);
    }

    public final void zzKx(int i) {
        this.zzZaI = i;
    }

    public final com.aspose.words.internal.zzG zzKy(int i) {
        com.aspose.words.internal.zzG[] zzgArr = this.zzZaM;
        if (zzgArr[i] == null) {
            zzgArr[i] = new com.aspose.words.internal.zzG();
        }
        return this.zzZaM[i];
    }

    public final void zzW(com.aspose.words.internal.zzG zzg) {
        this.zzeU.push(zzg);
    }

    public final boolean zzY0(long j) {
        return this.zzZaG.isEmpty() || com.aspose.words.internal.zzJ6.zzZ(this.zzZaG, j);
    }

    public final void zzZ(int i, com.aspose.words.internal.zzG zzg) {
        if (i >= zzsD().getCount()) {
            zzA(zzg);
        } else {
            zzsD().zzZ(i, zzg);
            this.zzeU.push(zzg);
        }
    }

    public final void zzZ3(float f) {
        this.zzZaJ = f;
    }

    public final void zzZ4(float f) {
        this.zzZaK = f;
    }

    public final void zzZ5(float f) {
        this.zzZaL = f;
    }

    public final void zzZE(com.aspose.words.internal.zzZQ4 zzzq4) {
        if (this.zzZaG.isEmpty()) {
            this.zzZaG = zzzq4;
        }
    }

    public final void zzZI() {
        com.aspose.words.internal.zzG zzgZzsD = zzsD();
        this.zzeU.pop();
        int iZzW = zzsD().zzW((com.aspose.words.internal.zzZL) zzgZzsD);
        if (zzgZzsD.getCount() != 0 || iZzW <= 0) {
            return;
        }
        zzsD().removeAt(iZzW);
    }

    public final zzZBY zzZIA() {
        return this.zzZge.zzZw9();
    }

    public final zzZC3 zzZIB() {
        return this.zzZge;
    }

    public final zzFH zzZIC() {
        return this.zzZaF;
    }

    public final int zzZIq() {
        return this.zzZaI;
    }

    public final float zzZIr() {
        return this.zzZaJ;
    }

    public final float zzZIs() {
        return this.zzZaK;
    }

    public final float zzZIt() {
        return this.zzZaL;
    }

    public final com.aspose.words.internal.zzZQ4 zzZIu() {
        return this.zzZaG;
    }

    public final com.aspose.words.internal.zzG[] zzZIv() {
        return this.zzZaM;
    }

    public final com.aspose.words.internal.zzD3<byte[]> zzZIw() {
        return this.zzZaC;
    }

    public final int zzZIx() {
        if (this.zzZaD == 0) {
            zzZID();
        }
        return this.zzZaD;
    }

    public final float zzZIy() {
        return Float.intBitsToFloat((int) this.zzZaE) / 2.0f;
    }

    public final long zzZIz() {
        return this.zzZaE;
    }

    public final float zzZQB() {
        return (this.zzZaF.zzZdM * 2.0f) + (Float.intBitsToFloat((int) this.zzZaE) / 5.0f);
    }

    public final com.aspose.words.internal.zzG zzsD() {
        return this.zzeU.peek();
    }
}
