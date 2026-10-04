package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzAG {
    static zzAG[] zzrJ = new zzAG[0];
    private zzKO zzPj;
    private zzAD zzW2;
    private zzKO zzrN;

    private zzAG(zzKO zzko, zzAD zzad, zzKO zzko2) {
        this.zzrN = zzko;
        this.zzW2 = zzad;
        this.zzPj = zzko2;
    }

    public static zzAG zzZ(zzKO zzko, String str, zzGY zzgy, zzKO zzko2) {
        zzAD zzadZzZ = zzRE.zzZ(zzko, str, zzko2, zzgy);
        if (zzadZzZ == null) {
            throw new zzCX(zzZKN.format("Can not set the value of member '{0}' on type '{1}'.", str, zzko.getType()));
        }
        if (zzSC.zzW(zzko2, zzadZzZ.zzAF())) {
            return new zzAG(zzko, zzadZzZ, zzko2);
        }
        throw new zzCX(zzZKN.format("Can not assign an expression of type '{0}' to '{1}.{2}'.", zzko2.getType(), zzko.getType(), str));
    }

    public final boolean zzL(zzKO zzko) {
        return this.zzrN == zzko;
    }

    public final void zzs(Object obj) throws Exception {
        this.zzW2.zzG(obj, this.zzPj.zzZ(this.zzW2.zzAF()));
    }
}
