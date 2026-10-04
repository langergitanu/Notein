package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz2G implements zzZC2 {
    private long zzSp = 0;
    private double zzYZ7;
    private double zzYZ8;
    private double zzYZ9;
    private double zzYZa;
    private boolean zzYZb;
    private double zzYZc;
    private double zzYZd;
    private zzZCC zzYZe;
    private zzGR zzYZf;
    private zz4G zzZje;
    private zz7X zzZjf;

    public zz2G(double d, double d2, zz4G zz4g, zz7X zz7x, zzGR zzgr, zzZCC zzzcc) {
        this.zzYZ9 = d;
        this.zzYZa = d2;
        this.zzZje = zz4g;
        this.zzZjf = zz7x;
        this.zzYZf = zzgr;
        this.zzYZe = zzzcc;
    }

    private com.aspose.words.internal.zzOU zzZvf() throws Exception {
        com.aspose.words.internal.zzOU zzouZzZ = this.zzZje.zzZ(this.zzYZf, false);
        if (this.zzYZb && zzouZzZ != null) {
            zzouZzZ.setAlignment(2);
        }
        return zzouZzZ;
    }

    @Override // com.aspose.words.zzZC2
    public final long zzDs() {
        return this.zzSp;
    }

    @Override // com.aspose.words.zzZC2
    public final long zzX(zzJH zzjh) {
        long jZzG = com.aspose.words.internal.zzZPY.zzG((float) zzZ(zzjh.zzZSp(), true), (float) zzZ(zzjh.zzZSo(), false));
        return (("xl".equals(zzjh.zzZSp().getString()) || "xr".equals(zzjh.zzZSp().getString()) || "xt".equals(zzjh.zzZSp().getString()) || "xb".equals(zzjh.zzZSp().getString())) && new com.aspose.words.internal.zzZQ4(0.0f, 0.0f, (float) this.zzYZ9, (float) this.zzYZa).zzYG(jZzG)) ? this.zzSp : jZzG;
    }

    @Override // com.aspose.words.zzZC2
    public final void zzXS(long j) {
        this.zzSp = j;
    }

    @Override // com.aspose.words.zzZC2
    public final double zzZ(zzJI zzji, boolean z) {
        return com.aspose.words.internal.zzZKQ.zzZa(zzji.zzZ(this.zzYZe) * (z ? this.zzYZ8 : this.zzYZ7));
    }

    @Override // com.aspose.words.zzZC2
    public final com.aspose.words.internal.zzOU zzZ2() throws Exception {
        zzGR zzgr = this.zzYZf;
        if (zzgr == null) {
            return zzZvf();
        }
        com.aspose.words.internal.zzZQ4 zzzq4ZzZPK = zzgr.zzZPK();
        try {
            this.zzYZf.zzZK(new com.aspose.words.internal.zzZQ4(0.0f, 0.0f, zzzq4ZzZPK.getWidth(), zzzq4ZzZPK.getHeight()));
            return zzZvf();
        } finally {
            this.zzYZf.zzZK(zzzq4ZzZPK);
        }
    }

    public final void zzZv9() {
        this.zzYZb = true;
    }

    @Override // com.aspose.words.zzZC2
    public final boolean zzZva() {
        return this.zzYZb;
    }

    public final zzGR zzZvb() {
        return this.zzYZf;
    }

    @Override // com.aspose.words.zzZC2
    public final zzZCC zzZvc() {
        return this.zzYZe;
    }

    @Override // com.aspose.words.zzZC2
    public final double zzZvd() {
        return this.zzYZa;
    }

    @Override // com.aspose.words.zzZC2
    public final double zzZve() {
        return this.zzYZ9;
    }

    @Override // com.aspose.words.zzZC2
    public final void zzn(double d, double d2) {
        if (d == -1.0d) {
            d = this.zzYZ9;
        }
        this.zzYZc = d;
        if (d2 == -1.0d) {
            d2 = this.zzYZa;
        }
        this.zzYZd = d2;
        if (d > 0.0d) {
            this.zzYZ8 = this.zzYZ9 / d;
        } else {
            this.zzYZ8 = 0.0d;
        }
        if (d2 > 0.0d) {
            this.zzYZ7 = this.zzYZa / d2;
        } else {
            this.zzYZ7 = 0.0d;
        }
        this.zzSp = 0L;
    }

    @Override // com.aspose.words.zzZC2
    public final com.aspose.words.internal.zzPY zzZ(zzZCM zzzcm, com.aspose.words.internal.zzZG zzzg) throws Exception {
        zzZCM zzzcmZzZPL = this.zzYZf.zzZPL();
        com.aspose.words.internal.zzZG zzzgZzRV = this.zzYZf.zzRV();
        com.aspose.words.internal.zzZQ4 zzzq4ZzZPK = this.zzYZf.zzZPK();
        try {
            this.zzYZf.zzZ(zzzcm);
            this.zzYZf.zzC(zzzg);
            this.zzYZf.zzZK(new com.aspose.words.internal.zzZQ4(0.0f, 0.0f, zzzq4ZzZPK.getWidth(), zzzq4ZzZPK.getHeight()));
            return this.zzZjf.zzZ(this.zzYZf);
        } finally {
            this.zzYZf.zzZ(zzzcmZzZPL);
            this.zzYZf.zzC(zzzgZzRV);
            this.zzYZf.zzZK(zzzq4ZzZPK);
        }
    }
}
