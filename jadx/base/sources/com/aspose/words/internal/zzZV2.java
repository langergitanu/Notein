package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZV2 extends zzA3 {
    public zzZV2(zzA1 zza1, zzA6 zza6) {
        super(zza1, zza6);
    }

    private zzG6 zzN3() {
        return zzKp().getEmulateRasterOperations() ? zzAf().zzAu() ? new zz87(zzAg(), zzAg().zzyQ().getSize()) : new zz8A(zzAg(), zzAg().zzyQ().getSize(), zzAf().zzAt()) : zz86.zzoq;
    }

    private void zzZ(zzG zzg, zz8T zz8t) {
        if (zzg.zzZO() == null) {
            OooO0O0.OooO00o(zzg);
        }
        zzg.zzZO().zzZ(zzP9.zzZ(zzZQ4.zzN(zz8t.zzyQ()), zzZQ4.zzN(zzAg().zzyQ())), 1);
    }

    @Override // com.aspose.words.internal.zzA3
    public final zzG zzAj() throws Exception {
        byte[] bArrZzX;
        if (!zzAf().getUseEmfEmbeddedToWmf() || (bArrZzX = zzZUY.zzX(zzAg())) == null) {
            return super.zzAj();
        }
        zzA1 zza1 = new zzA1(new zz8T(bArrZzX), zzKp());
        zzG zzgZzAj = zzA3.zzZ(zza1, zzAf()).zzAj();
        zzZ(zzgZzAj, zza1.zzAg());
        return zzgZzAj;
    }

    @Override // com.aspose.words.internal.zzA3
    public final zzG zzN4() throws Exception {
        zzG6 zzg6ZzN3 = zzN3();
        try {
            if (zzAf().zzAr() || zzAf().getEmulateRasterOperations()) {
                zz8Q zz8qZzZ = zzZUW.zzZ(zzKp(), zzAf().zzAr(), zzg6ZzN3);
                if (zzAf().zzAr() && zz8qZzZ.zzML()) {
                    zzZR(true);
                    zzKp().zzI().zzZ(2, 3, zz8qZzZ.zzyK());
                    if (zzg6ZzN3 == null) {
                        return null;
                    }
                    zzg6ZzN3.dispose();
                    return null;
                }
                if (zzAf().getEmulateRasterOperations() && zz8qZzZ.zzyH()) {
                    zzZT6.zzZ(zzKp(), zz8qZzZ, zzg6ZzN3);
                }
            }
            zz9W zz9w = new zz9W(zzKp(), zzg6ZzN3, zzAf().zzAr());
            zz9w.play();
            zzZR(zz9w.zzML());
            zzG zzgZzAa = zz9w.zzAa();
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
