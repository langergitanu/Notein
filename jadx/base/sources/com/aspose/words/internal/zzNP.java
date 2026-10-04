package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzNP extends zzO9 {
    public zzNP(zzA1 zza1, zzA6 zza6) {
        super(zza1, zza6);
    }

    private void zzM5() {
        zzKp().zzI().zzZ(2, 3, "EMF+ part of EMF+ dual metafile cannot be correctly rendered. Fallback to EMF part rendering will be performed.");
    }

    @Override // com.aspose.words.internal.zzO9, com.aspose.words.internal.zzA3
    public final zzG zzN4() throws Exception {
        if (zzAf().zzAq()) {
            zz8B zz8b = new zz8B(zzAg(), zzKp().zzAc(), zzAf().zzAt());
            try {
                zz9Y zz9y = new zz9Y(zzKp(), zzAf().zzAp() || zzAf().zzAr(), zz8b);
                zz9y.play();
                if (!zz9y.zzML() || !zzAf().zzAp()) {
                    zzZR(zz9y.zzML());
                    zzG zzgZzAa = zz9y.zzAa();
                    zz8b.dispose();
                    return zzgZzAa;
                }
                zz8b.dispose();
                zzM5();
            } catch (Throwable th) {
                zz8b.dispose();
                throw th;
            }
        }
        return super.zzN4();
    }
}
