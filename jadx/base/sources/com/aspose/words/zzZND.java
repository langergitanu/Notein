package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZND {
    private int zzYxD;
    private int zzYxE;

    public zzZND(zzZNG zzzng, int i) {
        zzY(zzzng, i);
    }

    private void zzY(zzZNG zzzng, int i) {
        int iZzXXB;
        int iZzXXx;
        zzYIC zzyic = (zzYIC) ((zzYIA) zzzng.zzZ93()).zza9();
        zzZNF zzznf = new zzZNF(zzyic);
        if (zzyic.zza7().zzZYM()) {
            iZzXXB = zzznf.zzZ7x().zzXXw().zzXXB();
            if (i == 2) {
                iZzXXB = Math.max(iZzXXB, ((zzY6N) zzyic.zza9()).zzY6a().zzZz() ? zzZNG.zzYxM : zzZNG.zzYxN);
            }
            iZzXXx = zzznf.zzZ7w().zzXXB();
            if (!zzznf.zzZ7u()) {
                iZzXXx = Math.max(iZzXXx, zzZNG.zzYxM);
            }
        } else {
            int iZzXXx2 = zzznf.zzZ7v().zzXXw().zzXXx();
            if (!((zzY6N) zzyic.zza9()).zzY6a().zzZz()) {
                iZzXXx2 -= zzznf.zzZ7x().zzXXw().zzXXz();
            }
            iZzXXB = iZzXXx2;
            iZzXXx = zzznf.zzZ7v().zzXXv().zzXXx() - zzznf.zzZ7w().zzXXz();
        }
        this.zzYxE = iZzXXB + zzzng.zzZ8G().zzYMk();
        this.zzYxD = iZzXXx + zzzng.zzZ8G().zzYMi();
    }

    public final int zzZ7p() {
        return this.zzYxD;
    }

    public final int zzZ7q() {
        return this.zzYxE;
    }
}
