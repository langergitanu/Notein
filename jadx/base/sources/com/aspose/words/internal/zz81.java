package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
abstract class zz81 implements zzG9 {
    private zzA1 zzEg;
    protected zz9C zzof;
    protected zz9G zzog;

    public zz81(zzA1 zza1, boolean z) {
        this.zzEg = zza1;
        zz9C zz9c = new zz9C(z);
        this.zzof = zz9c;
        if (z) {
            zz9c.zzzK();
        } else {
            zz9c.zzUP(zza1.zzAg().zzze());
        }
        this.zzog = new zz9G(this.zzof, zza1.zzAg(), z, zza1);
    }

    @Override // com.aspose.words.internal.zzG9
    public final zzGA zzFk() {
        return this.zzof;
    }

    @Override // com.aspose.words.internal.zzG9
    public final zzA1 zzKp() {
        return this.zzEg;
    }

    @Override // com.aspose.words.internal.zzG9
    public final zzGC zzMK() {
        return this.zzog;
    }
}
