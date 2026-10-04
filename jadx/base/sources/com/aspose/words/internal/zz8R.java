package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
abstract class zz8R implements zzG8 {
    protected boolean zzpo;
    protected zzA1 zzpp;
    protected zz8Q zzpq = new zz8Q();
    private zzG6 zzqY;

    public zz8R(zzA1 zza1, boolean z, zzG6 zzg6) {
        this.zzpp = zza1;
        this.zzpo = z;
        this.zzqY = zzg6;
    }

    private void zzYm(String str) {
        this.zzpq.zzyL();
        this.zzpq.zzYl(str);
    }

    public abstract void zzK1() throws Exception;

    @Override // com.aspose.words.internal.zzG8
    public final boolean zzMO() throws Exception {
        zzK1();
        return !this.zzpq.zzML();
    }

    public final void zzUM(int i) {
        if (this.zzpo) {
            zzYm(zzZKN.format("'{0}' record is not supported.", zz9D.zzUT(i)));
        }
    }

    public final void zzZ(zzG5 zzg5, int i) {
        if (zz8I.zzUJ(zzg5.zzJP())) {
            return;
        }
        if (this.zzqY.zzL(zzg5.zzJP(), zzg5.zzJM())) {
            this.zzpq.zzyJ();
            this.zzpq.zzUL(i);
        } else if (this.zzpo) {
            zzYm(zzZKN.format("{0} raster operation is not supported.", zz9D.zzUR(zzg5.zzJP())));
        }
    }

    public final void zzZW(int i, int i2) {
        if (zz8I.zzUI(i)) {
            return;
        }
        if (this.zzqY.zzFj()) {
            this.zzpq.zzyI();
            this.zzpq.zzUL(i2);
        } else if (this.zzpo) {
            zzYm(zzZKN.format("'{0}' binary raster operation is not supported.", zz9D.zzUQ(i)));
        }
    }
}
