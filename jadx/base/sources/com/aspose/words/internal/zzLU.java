package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzLU implements zzG7 {
    private zzMO zzDd;
    private int zzDe;
    private long zzDf;
    private long zzEr;
    private zzO8 zzFs;
    private int zzL4;

    public zzLU(zzO8 zzo8) {
        this.zzFs = zzo8;
    }

    public final int getType() {
        return this.zzL4;
    }

    public final zzMO zzJm() throws Exception {
        zzMO zzmo = this.zzDd;
        if (zzmo != null) {
            return zzmo;
        }
        zzMO zzmoZzZ = zzMO.zzZ(this.zzL4, this.zzFs, this.zzEr);
        this.zzDd = zzmoZzZ;
        return zzmoZzZ;
    }

    @Override // com.aspose.words.internal.zzG7
    public final int zzJn() {
        return 8;
    }

    @Override // com.aspose.words.internal.zzG7
    public final boolean zzJo() {
        int i = this.zzL4;
        return i == 0 || i == 14;
    }

    public final int zzJp() {
        return this.zzDe;
    }

    @Override // com.aspose.words.internal.zzG7
    public final long zzJq() {
        return this.zzDf;
    }

    public final long zzJr() {
        return this.zzEr;
    }

    @Override // com.aspose.words.internal.zzG7
    public final void zzJs() throws Exception {
        this.zzEr = this.zzFs.zzq().getPosition();
        this.zzL4 = this.zzFs.zzXc();
        this.zzDf = ((long) this.zzFs.zzXc()) & 4294967295L;
        this.zzDe++;
        this.zzDd = null;
    }

    @Override // com.aspose.words.internal.zzG7
    public final void zzLn() throws Exception {
        this.zzFs.zzq().zzH(this.zzEr + this.zzDf);
    }
}
