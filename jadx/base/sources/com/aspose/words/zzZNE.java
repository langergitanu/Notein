package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZNE {
    private int zzYxF;
    private int zzYxG;
    private int zzYxH;

    public zzZNE(zzZNG zzzng, int i) {
        zzYIC zzyic = (zzYIC) ((zzY6N) zzzng.zzZ90()).zzZXZ();
        zzZNF zzznf = new zzZNF(zzyic);
        if (zzyic.zza7().zzZYM()) {
            this.zzYxG = -zzznf.zzZ7x().zzXXw().zzXXB();
            int iZzXXB = zzznf.zzZ7w().zzXXB();
            if (!zzznf.zzZ7u() || iZzXXB >= zzZNG.zzYxM) {
                this.zzYxF = -Math.max(iZzXXB, zzZNG.zzYxM);
            } else {
                this.zzYxF = iZzXXB;
            }
        } else {
            this.zzYxG = zzznf.zzZ7x().zzXXw().zzXXz();
            this.zzYxF = zzznf.zzZ7w().zzXXz();
        }
        this.zzYxH = zzZ(zzzng, i, zzznf);
    }

    private static int zzZ(zzZNG zzzng, int i, zzZNF zzznf) {
        int iZzXXz;
        int iZzXXz2;
        zzY6I zzy6iZzZ = zzZ(zzznf, i);
        zzY6N zzy6n = (zzY6N) zzzng.zzZ90();
        boolean zZzZYM = zzy6n.zza7().zzZYM();
        boolean z = zzzng.zzZ8G().zzYMf() == 1;
        int i2 = ((z || zZzZYM) && !zzznf.zzZ7u() && !zzy6n.zzY6a().zzZz() && i == 3) ? zzZNG.zzYxM : 0;
        if (zZzZYM) {
            iZzXXz = -zzy6iZzZ.zzXXw().zzXXB();
            iZzXXz2 = -Math.max(zzy6iZzZ.zzXXv().zzXXB(), i2);
        } else {
            iZzXXz = zzy6iZzZ.zzXXw().zzXXz();
            iZzXXz2 = zzy6iZzZ.zzXXv().zzXXz() - i2;
        }
        int i3 = zzy6n.zzY6a().zzZz() ? 0 : iZzXXz;
        if (i == 1) {
            int i4 = -i3;
            if (!z) {
                return i4;
            }
            int iZzYMi = i4 + zzzng.zzZ8G().zzYMi();
            return !zZzZYM ? iZzYMi + zzy6iZzZ.zzXXv().zzXXy() : iZzYMi;
        }
        if (i == 2) {
            return (iZzXXz2 - i3) / 2;
        }
        if (i != 3) {
            return -i3;
        }
        if (!z) {
            return iZzXXz2;
        }
        int iZzYMk = iZzXXz2 - zzzng.zzZ8G().zzYMk();
        return !zZzZYM ? iZzYMk - zzy6iZzZ.zzXXw().zzXXy() : iZzYMk;
    }

    public final int zzZ7r() {
        return this.zzYxH;
    }

    public final int zzZ7s() {
        return this.zzYxF;
    }

    public final int zzZ7t() {
        return this.zzYxG;
    }

    private static zzY6I zzZ(zzZNF zzznf, int i) {
        zzY6I zzy6i = new zzY6I();
        if (i == 1) {
            zzy6i.zzZ(zzznf.zzZ7x().zzXXw());
            zzy6i.zzY(zzznf.zzZ7v().zzXXv());
            return zzy6i;
        }
        if (i == 2) {
            zzy6i.zzZ(zzznf.zzZ7x().zzXXw());
            zzy6i.zzY(zzznf.zzZ7w());
            return zzy6i;
        }
        if (i != 3) {
            zzy6i.zzZ(zzznf.zzZ7x().zzXXw());
            return zzy6i;
        }
        zzy6i.zzZ(zzznf.zzZ7v().zzXXw());
        zzy6i.zzY(zzznf.zzZ7w());
        return zzy6i;
    }
}
