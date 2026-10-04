package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz9Y extends zzA0 implements zzG8 {
    private zzM2 zzFI;
    private zzN6 zzFz;
    private zzO6 zzr1;

    public zz9Y(zzA1 zza1, boolean z, zzG6 zzg6) {
        super(zza1, z);
        this.zzFI = new zzM2(zza1.zzAg(), this);
        this.zzFz = new zzN6(zza1);
        this.zzr1 = new zzO6(zza1, zzg6);
    }

    private void zzA7() {
        this.zzFz.zzKn().zzMt().zzK(this.zzr1.zzMN());
        this.zzr1.zzMM();
    }

    @Override // com.aspose.words.internal.zzA0
    public final zzG zzAb() throws Exception {
        this.zzFI.play();
        if (this.zzFz.zzKo().zzLj()) {
            zzA7();
        }
        return this.zzFz.zzKn().zzMt().zzMN();
    }

    @Override // com.aspose.words.internal.zzG8
    public final boolean zzMO() throws Exception {
        if (this.zzFI.zzJA().getType() == 70) {
            if (this.zzFz.zzKo().zzLj()) {
                zzA7();
            }
            this.zzFz.zzKo().zzc(zzA9());
            zzZR(this.zzFz.zzML());
        } else if (this.zzFz.zzKo().zzLj()) {
            this.zzr1.zzZ(this.zzFI.zzJA());
            zzZR(this.zzr1.zzML());
        }
        return (zzA9() && zzML()) ? false : true;
    }
}
