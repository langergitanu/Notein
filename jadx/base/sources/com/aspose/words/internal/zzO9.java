package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
class zzO9 extends zzA3 {
    public zzO9(zzA1 zza1, zzA6 zza6) {
        super(zza1, zza6);
    }

    private zzG6 zzN3() {
        return zzKp().getEmulateRasterOperations() ? zzAf().zzAu() ? new zz88(zzAg(), zzAg().zzyQ().getSize()) : new zz8B(zzAg(), zzAg().zzyQ().getSize(), zzAf().zzAt()) : zz86.zzoq;
    }

    @Override // com.aspose.words.internal.zzA3
    public zzG zzN4() throws Exception {
        zzG6 zzg6ZzN3 = zzN3();
        try {
            if (zzAf().zzAr() || zzAf().getEmulateRasterOperations()) {
                zz8Q zz8qZzZ = zzN0.zzZ(zzKp(), zzAf().zzAr(), zzg6ZzN3);
                if (zzAf().zzAr() && zz8qZzZ.zzML()) {
                    zzZR(true);
                    zzKp().zzI().zzZ(2, 3, zz8qZzZ.zzyK());
                    if (zzg6ZzN3 == null) {
                        return null;
                    }
                    zzg6ZzN3.dispose();
                    return null;
                }
                if (zz8qZzZ.zzyH()) {
                    zzL4.zzZ(zzKp(), zz8qZzZ, zzg6ZzN3);
                }
            }
            zz9Z zz9z = new zz9Z(zzKp(), zzg6ZzN3, zzAf().zzAr());
            zz9z.play();
            zzZR(zz9z.zzML());
            zzG zzgZzAa = zz9z.zzAa();
            if (zzg6ZzN3 != null) {
                zzg6ZzN3.dispose();
            }
            return zzgZzAa;
        } catch (Throwable th) {
            if (zzg6ZzN3 != null) {
                zzg6ZzN3.dispose();
            }
            throw th;
        }
    }
}
