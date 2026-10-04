package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz7Q extends zzKO {
    private zzAD zzW2;
    private zzKO[] zzrM;

    private zz7Q(zzAD zzad, zzKO[] zzkoArr) {
        super(zzad.zzAF().getType());
        this.zzW2 = zzad;
        this.zzrM = zzkoArr;
    }

    public static zz7Q zzY(Class cls, zzKO[] zzkoArr, zzGY zzgy) {
        zzAD zzadZzZ = zzRE.zzZ(cls, zzkoArr, zzgy);
        if (zzadZzZ != null) {
            return new zz7Q(zzadZzZ, zzkoArr);
        }
        throw new zzCX(zzZKN.format("Can not resolve constructor on type '{0}'.", cls));
    }

    @Override // com.aspose.words.internal.zzZVP, com.aspose.words.internal.zzF6
    public final Object zzu() {
        return this.zzW2.zzAF().zzu();
    }

    @Override // com.aspose.words.internal.zzZVP, com.aspose.words.internal.zzF6
    public final Object zzv() {
        return this.zzW2.zzAF().zzv();
    }

    @Override // com.aspose.words.internal.zzKO, com.aspose.words.internal.zzH0
    public final Object zzx() throws Exception {
        return zzKK.zzZ(this.zzW2, (zzKO) null, this.zzrM);
    }
}
