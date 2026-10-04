package com.aspose.words.internal;

import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: loaded from: classes5.dex */
final class zz39 {
    private zzZQC<zz3A> zzhx = new zzZQC<>();
    private zz3A zzhy = new zz3A();
    private zz50 zzjH;

    public zz39(zz50 zz50Var) {
        this.zzjH = zz50Var;
    }

    private void zzL(float f, float f2) throws Exception {
        zzZ(this.zzjH.zzvk().zzN(f, f2));
    }

    private void zzZ(float f, boolean z) throws Exception {
        float fZzu9 = z ? f : this.zzhy.zzu9();
        if (z) {
            f = this.zzhy.zzu8();
        }
        zzL(fZzu9, f);
    }

    private boolean zztU() {
        return this.zzhy.zzu9() < 1.0f || this.zzhy.zzu8() < 1.0f || this.zzhy.zzu1() != null;
    }

    public final void zz0(float f) throws Exception {
        if (zz1(f)) {
            return;
        }
        this.zzhy.zz2(f);
        this.zzjH.zzvl().zzn(f);
        this.zzjH.zzvl().zzFh();
        this.zzjH.zzvl().zzXV("w");
    }

    public final boolean zz1(float f) {
        return zzAN.zzS(f, this.zzhy.zzu4());
    }

    public final zzZQ4 zzO(zzZQ4 zzzq4) {
        long[] jArr = {zzZPY.zzG(zzzq4.zzZm(), zzzq4.zzZo()), zzZPY.zzG(zzzq4.zzkw(), zzzq4.zzZn())};
        this.zzhy.zzua().zzZ(jArr);
        return new zzZQ4(Math.min(Float.intBitsToFloat((int) jArr[0]), Float.intBitsToFloat((int) jArr[1])), Math.min(zzZPY.zzYC(jArr[0]), zzZPY.zzYC(jArr[1])), Math.abs(Float.intBitsToFloat((int) jArr[0]) - Float.intBitsToFloat((int) jArr[1])), Math.abs(zzZPY.zzYC(jArr[0]) - zzZPY.zzYC(jArr[1])));
    }

    public final void zzR(String str, boolean z) throws Exception {
        zztX();
        if (this.zzhy.zzZJ(z) != zz57.zzvI()) {
            this.zzhy.zzZ(z, zz57.zzvI());
            this.zzjH.zzvl().zzS("{0} {1}", zz57.zzvI().zzwE(), z ? "CS" : TranslateLanguage.CZECH);
        }
        this.zzjH.zzvl().zzS("{0} {1}", str, z ? "SCN" : "scn");
    }

    public final void zzTP(int i) throws Exception {
        if (i == this.zzhy.zzNM()) {
            return;
        }
        this.zzhy.zzXW(i);
        this.zzjH.zzvl().writeInt(i);
        this.zzjH.zzvl().zzFh();
        this.zzjH.zzvl().zzXV("j");
    }

    public final void zzTQ(int i) throws Exception {
        if (i == this.zzhy.zzu3()) {
            return;
        }
        this.zzhy.zzTT(i);
        this.zzjH.zzvl().writeInt(i);
        this.zzjH.zzvl().zzFh();
        this.zzjH.zzvl().zzXV("J");
    }

    public final void zzTR(int i) throws Exception {
        if (zzTS(i)) {
            return;
        }
        this.zzhy.zzTU(i);
        this.zzjH.zzvl().writeInt(i);
        this.zzjH.zzvl().zzFh();
        this.zzjH.zzvl().zzXV("Tr");
    }

    public final boolean zzTS(int i) {
        return i == this.zzhy.zzu5();
    }

    public final boolean zzX(zzPV zzpv, boolean z) {
        return this.zzhy.zzZJ(z) == zz57.zzu(zzpv) && zzPV.zzZ(this.zzhy.zzZI(z), zzpv) && zzAN.zzS(this.zzhy.zzZH(z), ((float) zzpv.zzPD()) / 255.0f);
    }

    public final void zzY(zz3Q zz3q, float f) throws Exception {
        if (zzZ(zz3q, f)) {
            return;
        }
        this.zzhy.zzZ(zz3q);
        this.zzhy.zz3(f);
        this.zzjH.zzvl().zzYY(zz3q.zzF1());
        this.zzjH.zzvl().zzFh();
        this.zzjH.zzvl().zzn(f);
        this.zzjH.zzvl().zzFh();
        this.zzjH.zzvl().zzXV("Tf");
    }

    public final long zzZ4(long j) {
        long[] jArr = {j};
        this.zzhy.zzua().zzZ(jArr);
        return jArr[0];
    }

    public final void zzZZ(float f) throws Exception {
        if (zzAN.zzS(f, this.zzhy.zzNL())) {
            return;
        }
        this.zzhy.zzA(f);
        this.zzjH.zzvl().zzn(f);
        this.zzjH.zzvl().zzFh();
        this.zzjH.zzvl().zzXV("M");
    }

    public final zz3A zztV() {
        return this.zzhy;
    }

    public final void zztW() throws Exception {
        if (this.zzhy.zzu0()) {
            return;
        }
        this.zzjH.zzvl().zzS(new float[0]);
        this.zzjH.zzvl().zzFh();
        this.zzjH.zzvl().zzn(0.0f);
        this.zzjH.zzvl().zzXW(" d ");
        this.zzhy.zzZG(true);
    }

    public final void zztX() throws Exception {
        if (zztU()) {
            zzL(1.0f, 1.0f);
        }
    }

    public final void zztY() throws Exception {
        this.zzjH.zzvl().zzXV("Q");
        this.zzhy = this.zzhx.pop();
    }

    public final void zztZ() throws Exception {
        this.zzjH.zzvl().zzXV("q");
        this.zzhx.push(this.zzhy.zzub());
    }

    public final void zzz(zzP9 zzp9) throws Exception {
        this.zzjH.zzvl().zzx(zzp9);
        this.zzjH.zzvl().zzFh();
        this.zzjH.zzvl().zzXV("cm");
        this.zzhy.zzua().zzZ(zzp9, 0);
    }

    public final void zzZ(zzPV zzpv, boolean z) throws Exception {
        if (zzX(zzpv, z)) {
            return;
        }
        if (zzpv.zzPD() < 255) {
            zzZ(zzpv.zzPD() / 255.0f, z);
        } else if (zztU()) {
            zzZ(1.0f, z);
        }
        zz57 zz57VarZzu = zz57.zzu(zzpv);
        this.zzhy.zzZ(z, zz57VarZzu);
        this.zzhy.zzZ(z, zzpv);
        this.zzjH.zzvl().zzS("{0} {1}", zz57VarZzu.zzw(zzpv), z ? zz57VarZzu.zzvN() : zz57VarZzu.zzvM());
    }

    public final void zzY(zz3D zz3d) throws Exception {
        zzZ(this.zzjH.zzvk().zzZ(zz3d));
    }

    public final boolean zzZ(zz3Q zz3q, float f) {
        return zz3q == this.zzhy.zzu7() && zzAN.zzS(f, this.zzhy.zzu6());
    }

    public final void zzZ(float[] fArr, float f) throws Exception {
        this.zzjH.zzvl().zzS(fArr);
        this.zzjH.zzvl().zzFh();
        this.zzjH.zzvl().zzn(f);
        this.zzjH.zzvl().zzXW(" d ");
        this.zzhy.zzZG(false);
    }

    private void zzZ(zz4B zz4b) throws Exception {
        this.zzjH.zzvl().zzYY(zz4b.zzF1());
        this.zzjH.zzvl().zzFh();
        this.zzjH.zzvl().zzXV("gs");
        zz4b.zzZ(this.zzhy);
    }
}
