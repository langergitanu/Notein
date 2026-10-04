package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz9Z extends zzA0 implements zzG8 {
    private zzM2 zzFI;
    private zzO6 zzr1;

    public zz9Z(zzA1 zza1, zzG6 zzg6, boolean z) {
        super(zza1, z);
        this.zzFI = new zzM2(zzA8(), this);
        this.zzr1 = new zzO6(zza1, zzg6);
    }

    @Override // com.aspose.words.internal.zzA0
    public final zzG zzAa() {
        return this.zzr1.zzMN();
    }

    @Override // com.aspose.words.internal.zzA0
    public final zzG zzAb() throws Exception {
        this.zzFI.play();
        zzZR(this.zzr1.zzML());
        return this.zzr1.zzMN();
    }

    @Override // com.aspose.words.internal.zzG8
    public final boolean zzMO() throws Exception {
        this.zzr1.zzZ(this.zzFI.zzJA());
        return (zzA9() && this.zzr1.zzML()) ? false : true;
    }
}
