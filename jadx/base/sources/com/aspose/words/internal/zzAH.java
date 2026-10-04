package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzAH extends zzKO {
    private zzAD zzW2;
    private boolean zzrK;
    private zzH0 zzrL;
    private zzKO[] zzrM;
    private zzKO zzrN;

    public zzAH(zzKO zzko, zzAD zzad, zzKO[] zzkoArr) {
        this(zzad.zzAF().getType(), zzko, zzad, zzkoArr, null, false);
    }

    private zzF6 zzAJ() {
        zzAD zzad = this.zzW2;
        return zzad != null ? zzad.zzAF() : this.zzrL;
    }

    @Override // com.aspose.words.internal.zzKO
    public final boolean zzSj() {
        return this.zzrK;
    }

    @Override // com.aspose.words.internal.zzZVP
    public Object zzTT() {
        if (this.zzrK) {
            return null;
        }
        return super.zzTT();
    }

    @Override // com.aspose.words.internal.zzZVP
    public boolean zzTU() {
        return this.zzrK;
    }

    @Override // com.aspose.words.internal.zzZVP, com.aspose.words.internal.zzF6
    public boolean zzs() {
        return this.zzrK;
    }

    @Override // com.aspose.words.internal.zzZVP, com.aspose.words.internal.zzF6
    public Object zzu() {
        if (this.zzrK) {
            return null;
        }
        return zzAJ().zzu();
    }

    @Override // com.aspose.words.internal.zzZVP, com.aspose.words.internal.zzF6
    public Object zzv() {
        if (this.zzrK) {
            return null;
        }
        return zzAJ().zzv();
    }

    @Override // com.aspose.words.internal.zzKO, com.aspose.words.internal.zzH0
    public Object zzx() throws Exception {
        if (this.zzrK) {
            return null;
        }
        zzAD zzad = this.zzW2;
        if (zzad == null) {
            return this.zzrL.zzx();
        }
        zzKO[] zzkoArr = this.zzrM;
        if (zzkoArr != null) {
            return zzKK.zzZ(zzad, this.zzrN, zzkoArr);
        }
        zzKO zzko = this.zzrN;
        return this.zzW2.zzr(zzko != null ? zzko.zzx() : null);
    }

    public zzAH(zzH0 zzh0) {
        this(zzh0.getType(), null, null, null, zzh0, false);
    }

    public zzAH(boolean z) {
        this(Object.class, null, null, null, null, z);
    }

    public zzAH() {
        this(true);
    }

    private zzAH(Class cls, zzKO zzko, zzAD zzad, zzKO[] zzkoArr, zzH0 zzh0, boolean z) {
        super(cls);
        this.zzrN = zzko;
        this.zzW2 = zzad;
        this.zzrM = zzkoArr;
        this.zzrL = zzh0;
        this.zzrK = z;
    }
}
