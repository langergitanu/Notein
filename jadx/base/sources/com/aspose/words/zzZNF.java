package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZNF {
    private int zzYxI;
    private zzY6I zzYxJ;
    private zzY6J zzYxK;
    private zzY6I zzYxL;

    public zzZNF(zzYIC zzyic) {
        zzY(zzyic);
    }

    private void zzY(zzYIC zzyic) {
        this.zzYxL = zzY6I.zzR((zzYIC) ((zzY6N) zzyic.zza9()).zzZXZ());
        zzY6I zzy6iZzR = zzY6I.zzR(zzyic);
        int iMin = 1073741823;
        zzY6J zzy6j = new zzY6J(0, 1073741823);
        int iZzT = zzYIB.zzT(zzyic);
        while (zzyic != null) {
            zzY6I zzy6iZzR2 = zzY6I.zzR(zzyic);
            if (zzy6iZzR.zzXXw().zzXXx() < zzy6iZzR2.zzXXw().zzXXx()) {
                zzy6iZzR.zzZ(zzy6iZzR2.zzXXw());
            }
            if (zzy6iZzR.zzXXv().zzXXx() < zzy6iZzR2.zzXXv().zzXXx()) {
                zzy6iZzR.zzY(zzy6iZzR2.zzXXv());
            }
            if (zzZ(zzyic, iZzT)) {
                iMin = Math.min(iMin, zzy6iZzR2.zzXXv().zzXXB());
                zzy6j.zzjW(Math.max(zzy6j.zzXXB(), zzy6iZzR2.zzXXv().zzXXB()));
                zzy6j.zzjV(Math.min(zzy6j.zzXXz(), zzy6iZzR2.zzXXv().zzXXz()));
            }
            zzyic = (zzYIC) zzyic.zzYTp();
        }
        this.zzYxJ = zzy6iZzR;
        this.zzYxI = iMin;
        this.zzYxK = zzy6j;
    }

    private static boolean zzZ(zzYIC zzyic, int i) {
        return zzyic.zzYjW() == i;
    }

    public final boolean zzZ7u() {
        return this.zzYxI > 0;
    }

    public final zzY6I zzZ7v() {
        return this.zzYxJ;
    }

    public final zzY6J zzZ7w() {
        return this.zzYxK;
    }

    public final zzY6I zzZ7x() {
        return this.zzYxL;
    }
}
