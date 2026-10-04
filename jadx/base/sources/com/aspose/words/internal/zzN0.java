package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzN0 extends zz8R {
    private zzM2 zzFI;

    private zzN0(zzA1 zza1, boolean z, zzG6 zzg6) {
        super(zza1, z, zzg6);
        this.zzFI = new zzM2(zza1.zzAg(), this);
    }

    public static zz8Q zzZ(zzA1 zza1, boolean z, zzG6 zzg6) throws Exception {
        zzN0 zzn0 = new zzN0(zza1, z, zzg6);
        zzn0.zzFI.play();
        return zzn0.zzpq;
    }

    @Override // com.aspose.words.internal.zz8R
    public final void zzK1() throws Exception {
        int type = this.zzFI.zzJA().getType();
        if (type != 41 && type != 53 && type != 116) {
            switch (type) {
                case 76:
                case 77:
                case 81:
                    zzZ((zzMW) this.zzFI.zzJA().zzJm(), this.zzFI.zzJA().zzJp());
                    break;
            }
            return;
        }
        zzUM(this.zzFI.zzJA().getType());
    }
}
