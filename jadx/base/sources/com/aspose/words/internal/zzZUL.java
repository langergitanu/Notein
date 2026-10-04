package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzZUL extends zzZUN implements zzG5 {
    private boolean zz6P;
    private long zz6Q;
    private zzZQ5 zzDE;
    private zzZQ5 zzDF;
    private int zzDG;
    private byte[] zzDO;

    private byte[] zzS(zzPV zzpv, zzPV zzpv2) throws Exception {
        zzmY().zzq().zzH(this.zz6Q);
        zzXO zzxoZzY = zzQX.zzY(zzmY());
        if ((zzmV() - 40) - zzxoZzY.zzWN() <= 0) {
            return null;
        }
        if (zzmU() && zzxoZzY.zzWM() == 1 && zzxoZzY.zzWN() == 8) {
            return zzEF.zzZ(zzxoZzY, zzZ(zzmY().zzMW(), zzmY().zzMW(), zzpv, zzpv2), zzmY(), (zzmV() - 40) - zzxoZzY.zzWN());
        }
        zzmY().zzq().zzH(this.zz6Q);
        return zzEF.zzZ(zzmY(), zzmV());
    }

    private static zzPV[] zzZ(zzPV zzpv, zzPV zzpv2, zzPV zzpv3, zzPV zzpv4) {
        return zz9Q.zzV(zzpv, zzpv2) ? new zzPV[]{zzpv3, zzpv4} : new zzPV[]{zzpv4, zzpv3};
    }

    public static boolean zzZp(int i, int i2) {
        return (i + 6) / 2 != (i2 >> 8) + 3;
    }

    private int zzmV() {
        return (int) (zzmX() - this.zz6Q);
    }

    @Override // com.aspose.words.internal.zzG5
    public final boolean zzJM() {
        return this.zz6P;
    }

    @Override // com.aspose.words.internal.zzG5
    public final zzZQ5 zzJN() {
        return this.zzDE;
    }

    @Override // com.aspose.words.internal.zzG5
    public final zzZQ5 zzJO() {
        return this.zzDF;
    }

    @Override // com.aspose.words.internal.zzG5
    public final int zzJP() {
        return this.zzDG;
    }

    public final void zzT(zzZQ5 zzzq5) {
        this.zzDE = zzzq5;
    }

    public final void zzUF(int i) {
        this.zzDG = i;
    }

    public final void zzYU(long j) {
        this.zz6Q = j;
    }

    public final void zzZh(boolean z) {
        this.zz6P = z;
    }

    public abstract boolean zzmU();

    public final byte[] zzT(zzPV zzpv, zzPV zzpv2) throws Exception {
        if (!this.zz6P) {
            return null;
        }
        byte[] bArr = this.zzDO;
        if (bArr != null) {
            return bArr;
        }
        byte[] bArrZzS = zzS(zzpv, zzpv2);
        this.zzDO = bArrZzS;
        return bArrZzS;
    }

    public final void zzS(zzZQ5 zzzq5) {
        this.zzDF = zzzq5;
    }
}
