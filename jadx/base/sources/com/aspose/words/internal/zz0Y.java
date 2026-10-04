package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz0Y {
    private zzZQ4 zzHe;
    private long zzSp;
    private long zzeI;
    private int zzeJ;
    private int zzeK;
    private String zzeL;
    private zzD3<String> zzeM;
    private float zzeN;
    private byte[] zzeO;
    private byte[] zzeP;
    private long zzeQ;
    private long zzeR;
    private zzZQ4 zzeS;
    private zzPV zzeT;
    private zzZQC<zzG> zzeU = new zzZQC<>();
    private zzPV zzqB;
    private zzF4 zzv;
    private zzH3 zzwm;

    public zz0Y(zzH3 zzh3) {
        zzZQ4 zzzq4 = zzZQ4.zz2T;
        this.zzHe = zzzq4;
        this.zzqB = zzPV.zzI5;
        this.zzeT = zzPV.zzKa;
        this.zzeS = zzzq4;
        this.zzSp = 0L;
        this.zzeR = 0L;
        this.zzeQ = 0L;
        this.zzeN = 1.0f;
        this.zzeM = new zzD3<>();
        this.zzeL = "Arial";
        this.zzeK = 12;
        this.zzeJ = 0;
        this.zzeI = zzZPY.zzG(1.0f, 1.0f);
        this.zzwm = zzh3;
    }

    private void zzW(zzG zzg) {
        if (this.zzeU.size() > 0) {
            zzsD().zzX((zzZL) zzg);
        }
        this.zzeU.push(zzg);
    }

    private void zzZI() {
        this.zzeU.pop();
    }

    public final void end() {
        while (this.zzeU.size() > 1) {
            zzZI();
        }
    }

    public final void start() {
        this.zzeU.clear();
        zzW(new zzG());
    }

    public final void zzF(long j, long j2) throws Exception {
        if (!zzAN.zzf(this.zzeN) && !zzJ6.zzN(j, j2)) {
            zzZG zzzgZzZ = zzZG.zzZ(j, j2);
            zzY(zzzgZzZ, 0);
            zzsD().zzX(zzzgZzZ);
        }
        this.zzSp = j2;
    }

    public final void zzM(zzPV zzpv) {
        this.zzqB = zzpv;
    }

    public final void zzN(zzPV zzpv) {
        this.zzeT = zzpv;
    }

    public final void zzR(int i, String str) {
        this.zzeM.set(i, str);
    }

    public final void zzS(zzZQ4 zzzq4, int i) throws Exception {
        if (zzzq4.isEmpty()) {
            zzzq4 = this.zzeS;
        }
        this.zzeS = zzzq4;
        if (zzzq4.isEmpty()) {
            return;
        }
        zzQ5 zzq5 = new zzQ5(this.zzeS);
        zzP5 zzp5 = new zzP5();
        zzp5.zzZ(zzq5);
        zzZG zzzg = new zzZG();
        OooO00o.OooO00o(zzzg, zzp5);
        zzY(zzzg, i);
        zzsD().zzX(zzzg);
    }

    public final void zzT(int i, String str) {
        zzF4 zzf4 = this.zzv;
        if (zzf4 != null) {
            zzf4.zzZ(i, 10, str);
        }
    }

    public final void zzTj(int i) {
        this.zzeJ = i;
    }

    public final void zzTk(int i) {
        this.zzeK = i;
    }

    public final void zzTl(int i) {
        if (this.zzeM.get(i) != null) {
            this.zzeL = this.zzeM.get(i);
        }
    }

    public final void zzU(zzZQ4 zzzq4, int i) throws Exception {
        if (zzzq4.isEmpty()) {
            zzzq4 = this.zzeS;
        }
        this.zzeS = zzzq4;
        if (zzzq4.isEmpty()) {
            return;
        }
        zzZG zzzgZzW = zzZG.zzW(this.zzeS);
        zzY(zzzgZzW, i);
        zzsD().zzX(zzzgZzW);
    }

    public final void zzX(long[] jArr, int i) throws Exception {
        long[] jArr2 = new long[jArr.length];
        for (int i2 = 0; i2 < jArr.length; i2++) {
            jArr2[i2] = jArr[i2];
        }
        zzZG zzzgZzZ = zzZG.zzZ(jArr2, false, false);
        zzY(zzzgZzZ, i);
        zzsD().zzX(zzzgZzZ);
    }

    public final void zzY(long j, int i, int i2) throws Exception {
        zzF(j, zzZPY.zzG(Float.intBitsToFloat((int) j) + i, zzZPY.zzYC(j) + i2));
    }

    public final void zzYZ(long j) {
        this.zzeI = j;
    }

    public final void zzZ(zzZQ4 zzzq4, int i, int i2, int i3) throws Exception {
        if (zzzq4.isEmpty()) {
            zzzq4 = this.zzeS;
        }
        this.zzeS = zzzq4;
        if (zzzq4.isEmpty()) {
            return;
        }
        zzQ5 zzq5 = new zzQ5(this.zzeS, i - 90, i2);
        zzP5 zzp5 = new zzP5();
        zzp5.zzZ(zzq5);
        zzZG zzzg = new zzZG();
        OooO00o.OooO00o(zzzg, zzp5);
        if (i3 != 0) {
            zzp5.zze(true);
        }
        zzY(zzzg, i3);
        zzsD().zzX(zzzg);
    }

    public final void zzZ0(long j) {
        this.zzeQ = j;
    }

    public final void zzZ1(long j) throws Exception {
        zzF(this.zzSp, j);
    }

    public final void zzZ2(long j) {
        end();
        zzW(new zzG());
        OooO0O0.OooO00o(zzsD());
        zzsD().zzZO().zzY(-Float.intBitsToFloat((int) j), -zzZPY.zzYC(j), 0);
    }

    public final void zzZE(int i, int i2) throws Exception {
        zzY(this.zzSp, i, i2);
    }

    public final void zzZW(float f) {
        this.zzeN = f;
    }

    public final void zzZd(byte[] bArr) {
        this.zzeO = bArr;
    }

    public final void zzZe(byte[] bArr) {
        this.zzeP = bArr;
    }

    public final void zzg(zzZQ4 zzzq4) {
        this.zzHe = zzzq4;
    }

    public final void zzh(zzZQ4 zzzq4) {
        while (zzsD().zzZN() != null) {
            zzZI();
        }
        zzW(new zzG());
        zzsD().zzZ(zzP8.zzM(zzzq4));
    }

    public final zzG zzsD() {
        return this.zzeU.peek();
    }

    public final long zzsE() {
        return this.zzeR;
    }

    public final zzZQ4 zzsF() {
        return this.zzHe;
    }

    public final void zzT(zzZQ4 zzzq4, int i) throws Exception {
        if (zzZPY.zzYF(this.zzeQ)) {
            zzU(zzzq4, i);
            return;
        }
        zzZQ4 zzzq42 = zzzq4.isEmpty() ? this.zzeS : zzzq4;
        this.zzeS = zzzq42;
        if (zzzq42.isEmpty()) {
            return;
        }
        zzZG zzzg = new zzZG();
        zzP5 zzp5 = new zzP5();
        zzZQG.zzZ(zzzg.zzZ0().zzO7(), zzp5);
        zzQ5 zzq5 = new zzQ5(new zzZQ4(zzzq4.zzZm(), zzzq4.zzZo(), Float.intBitsToFloat((int) this.zzeQ), zzZPY.zzYC(this.zzeQ)), 180.0d, 90.0d);
        zzQ5 zzq52 = new zzQ5(new zzZQ4(zzzq4.zzkw() - Float.intBitsToFloat((int) this.zzeQ), zzzq4.zzZo(), Float.intBitsToFloat((int) this.zzeQ), zzZPY.zzYC(this.zzeQ)), 270.0d, 90.0d);
        zzQ5 zzq53 = new zzQ5(new zzZQ4(zzzq4.zzkw() - Float.intBitsToFloat((int) this.zzeQ), zzzq4.zzZn() - zzZPY.zzYC(this.zzeQ), Float.intBitsToFloat((int) this.zzeQ), zzZPY.zzYC(this.zzeQ)), 0.0d, 90.0d);
        zzQ5 zzq54 = new zzQ5(new zzZQ4(zzzq4.zzZm(), zzzq4.zzZn() - zzZPY.zzYC(this.zzeQ), Float.intBitsToFloat((int) this.zzeQ), zzZPY.zzYC(this.zzeQ)), 90.0d, 90.0d);
        zzp5.zzZ(zzq5);
        zzp5.zzZ(zzq52);
        zzp5.zzZ(zzq53);
        zzp5.zzZ(zzq54);
        zzp5.zze(true);
        zzY(zzzg, i);
        zzsD().zzX(zzzg);
    }

    private void zzY(zzZG zzzg, int i) throws Exception {
        if (i == 0) {
            zzzg.zzX(new zzOU(zz0X.zzZ(this.zzeO, this.zzqB, this.zzeT), this.zzeN));
            return;
        }
        if (i == 1) {
            zzzg.zzY(new zzOI(this.zzeT));
            return;
        }
        if (i == 2) {
            zzzg.zzY(new zzOI(this.zzqB));
        } else if (i == 3) {
            zzzg.zzY(zz0X.zzZ(this.zzeP, this.zzeT, this.zzqB));
        } else {
            if (i != 4) {
                return;
            }
            zzzg.zzY(zz0X.zzZ(this.zzeP, this.zzqB, this.zzeT));
        }
    }

    public final void zzX(long j, String str) throws Exception {
        zzZU zzzu = new zzZU(this.zzwm.zzY(this.zzeL, this.zzeK, this.zzeJ), new zzOI(this.zzeT), j, zzZKN.zzZ(str, (char) 165, (char) 8226));
        if (!zzAN.zzS(Float.intBitsToFloat((int) this.zzeI), 1.0f) || !zzAN.zzS(zzZPY.zzYC(this.zzeI), 1.0f)) {
            zzzu.zzW(new zzP9());
            zzzu.zzZO().zzY(-Float.intBitsToFloat((int) zzzu.zzZE()), -zzZPY.zzYC(zzzu.zzZE()), 1);
            zzzu.zzZO().zzZ(Float.intBitsToFloat((int) this.zzeI), zzZPY.zzYC(this.zzeI), 1);
            zzzu.zzZO().zzY(Float.intBitsToFloat((int) zzzu.zzZE()), zzZPY.zzYC(zzzu.zzZE()), 1);
        }
        zzsD().zzX(zzzu);
        this.zzeR = j;
    }

    public final void zzZ(zz15 zz15Var) throws Exception {
        zzsD().zzX(new zzZP(zz15Var.zzsR().zzZE(), zz15Var.zzsR().getSize(), zz15Var.zzsQ().zzZ(this)));
    }
}
