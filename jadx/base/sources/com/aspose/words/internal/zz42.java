package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz42 extends zz45 {
    private int zzJ;
    private boolean zzie;
    private boolean zzif;
    private boolean zzig;
    private boolean zzih;
    private int zzii;
    private boolean zzij;
    private int zzik;
    private int zzil;

    public zz42() {
        this.zzil = 10;
        this.zzik = 1;
        this.zzii = 1;
        this.zzJ = 8;
        zzuz();
    }

    private void zzuz() {
        if (this.zzie || this.zzij || this.zzig || this.zzih) {
            if (this.zzif) {
                if (this.zzik >= 3) {
                    this.zzil = 14;
                    return;
                } else {
                    this.zzil = 1;
                    return;
                }
            }
            if (this.zzik >= 3) {
                this.zzil = 15;
            } else {
                this.zzil = 1;
            }
        }
    }

    @Override // com.aspose.words.internal.zz45
    public final zzZOP zz4(zzZOP zzzop) {
        return this.zzil == 1 ? new zz3S(zzzop) : new zz3S(zzzop, this.zzil, this.zzik, this.zzii, this.zzJ);
    }

    @Override // com.aspose.words.internal.zz45
    public final void zzG(zzFY zzfy) throws Exception {
        if (zzuB()) {
            zzfy.zzFd();
            zzfy.zzM("/Predictor", this.zzil);
            if (this.zzij) {
                zzfy.zzM("/Colors", this.zzik);
            }
            if (this.zzih) {
                zzfy.zzM("/Columns", this.zzii);
            }
            if (this.zzig) {
                zzfy.zzM("/BitsPerComponent", this.zzJ);
            }
            zzfy.zzFc();
        }
    }

    @Override // com.aspose.words.internal.zz45
    public final boolean zzuB() {
        return this.zzil != 1;
    }

    @Override // com.aspose.words.internal.zz45
    public final String zzwE() {
        return "/LZWDecode";
    }

    public zz42(int i, int i2, int i3, boolean z) {
        this.zzil = 10;
        this.zzik = 1;
        this.zzii = 1;
        this.zzJ = i;
        this.zzig = i != 8;
        this.zzii = i2;
        this.zzih = i2 != 1;
        this.zzik = i3;
        this.zzij = i3 != 1;
        this.zzif = z;
        this.zzie = true;
        zzuz();
    }
}
