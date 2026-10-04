package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzNF extends zzA3 {
    public zzNF(zzA1 zza1, zzA6 zza6) {
        super(zza1, zza6);
    }

    @Override // com.aspose.words.internal.zzA3
    public final zzG zzN4() throws Exception {
        zz8B zz8b = new zz8B(zzAg(), zzKp().zzAc(), zzAf().zzAt());
        try {
            zz9Y zz9y = new zz9Y(zzKp(), zzAf().zzAr(), zz8b);
            zz9y.play();
            zzZR(zz9y.zzML());
            return zz9y.zzAa();
        } finally {
            zz8b.dispose();
        }
    }
}
