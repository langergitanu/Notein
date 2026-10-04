package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzSU extends zzKO {
    private zzKO zzPj;
    private zz6N zzPk;

    private zzSU(zz6N zz6n, zzKO zzko) {
        super(zz6n.getType());
        this.zzPk = zz6n;
        this.zzPj = zzko;
    }

    public static zzSU zzZ(zz6N zz6n, zzKO zzko) {
        if (zz6n.zzSj() || zzSC.zzY(zzko, zz6n)) {
            return new zzSU(zz6n, zzko);
        }
        throw new zzCX(zzZKN.format("An explicit predefined conversion from type '{0}' to type '{1}' does not exist.", zzko.getType(), zz6n.getType()));
    }

    @Override // com.aspose.words.internal.zzKO
    public final boolean zzSj() {
        return this.zzPk.zzSj();
    }

    @Override // com.aspose.words.internal.zzZVP
    public final Object zzTT() {
        return this.zzPk.zzTT();
    }

    @Override // com.aspose.words.internal.zzZVP
    public final boolean zzTU() {
        return this.zzPk.zzTU();
    }

    @Override // com.aspose.words.internal.zzZVP, com.aspose.words.internal.zzF6
    public final boolean zzs() {
        return this.zzPk.zzs();
    }

    @Override // com.aspose.words.internal.zzZVP, com.aspose.words.internal.zzF6
    public final Object zzu() {
        return this.zzPk.zzu();
    }

    @Override // com.aspose.words.internal.zzZVP, com.aspose.words.internal.zzF6
    public final Object zzv() {
        return this.zzPk.zzv();
    }

    @Override // com.aspose.words.internal.zzKO, com.aspose.words.internal.zzH0
    public final Object zzx() throws Exception {
        Object objZzx = this.zzPj.zzx();
        if (this.zzPk.zzSj()) {
            return null;
        }
        return zzKK.zzZ(objZzx, this.zzPj, this.zzPk);
    }
}
