package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz3A implements Cloneable {
    private float zzGn;
    private int zzGo;
    private int zzhA;
    private float zzhB;
    private int zzhC;
    private float zzhD;
    private zz3Q zzhE;
    private float zzhF;
    private zzPV zzhG;
    private zzPV zzhH;
    private boolean zzhz;
    private zz3D zzir;
    private float zzit;
    private zzP9 zzhL = new zzP9();
    private zzP9 zzhK = null;
    private zz57 zzhJ = zz57.zzvK();
    private zz57 zzhI = zz57.zzvK();

    public zz3A() {
        zzPV zzpv = zzPV.zzKa;
        this.zzhH = zzpv;
        this.zzhG = zzpv;
        this.zzit = 1.0f;
        this.zzhF = 1.0f;
        this.zzhB = 1.0f;
        this.zzGn = 10.0f;
        this.zzhz = true;
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void zz2(float f) {
        this.zzhB = f;
    }

    public final void zz3(float f) {
        this.zzhD = f;
    }

    public final void zz4(float f) {
        this.zzhF = f;
    }

    public final void zz5(float f) {
        this.zzit = f;
    }

    public final void zzA(float f) {
        this.zzGn = f;
    }

    public final float zzNL() {
        return this.zzGn;
    }

    public final int zzNM() {
        return this.zzGo;
    }

    public final void zzTT(int i) {
        this.zzhA = i;
    }

    public final void zzTU(int i) {
        this.zzhC = i;
    }

    public final void zzXW(int i) {
        this.zzGo = i;
    }

    public final void zzY(zz3D zz3d) {
        this.zzir = zz3d;
    }

    public final void zzZ(zz3Q zz3q) {
        this.zzhE = zz3q;
    }

    public final void zzZG(boolean z) {
        this.zzhz = z;
    }

    public final float zzZH(boolean z) {
        return z ? this.zzit : this.zzhF;
    }

    public final zzPV zzZI(boolean z) {
        return z ? this.zzhH : this.zzhG;
    }

    public final zz57 zzZJ(boolean z) {
        return z ? this.zzhJ : this.zzhI;
    }

    public final boolean zzu0() {
        return this.zzhz;
    }

    public final zz3D zzu1() {
        return this.zzir;
    }

    public final zzP9 zzu2() {
        return this.zzhK;
    }

    public final int zzu3() {
        return this.zzhA;
    }

    public final float zzu4() {
        return this.zzhB;
    }

    public final int zzu5() {
        return this.zzhC;
    }

    public final float zzu6() {
        return this.zzhD;
    }

    public final zz3Q zzu7() {
        return this.zzhE;
    }

    public final float zzu8() {
        return this.zzhF;
    }

    public final float zzu9() {
        return this.zzit;
    }

    public final zzP9 zzua() {
        return this.zzhL;
    }

    public final zz3A zzub() {
        zz3A zz3a = (zz3A) memberwiseClone();
        zz3a.zzhL = this.zzhL.zzOh();
        return zz3a;
    }

    public final void zzA(zzP9 zzp9) {
        this.zzhK = zzp9;
    }

    public final void zzZ(boolean z, zz57 zz57Var) {
        if (z) {
            this.zzhJ = zz57Var;
        } else {
            this.zzhI = zz57Var;
        }
    }

    public final void zzZ(boolean z, zzPV zzpv) {
        if (z) {
            this.zzhH = zzpv;
        } else {
            this.zzhG = zzpv;
        }
    }
}
