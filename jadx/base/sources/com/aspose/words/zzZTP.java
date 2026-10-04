package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZTP extends zzZT7 {
    int zzYKE;
    int zzYKe;
    int zzYKf;
    int zzYKg;
    int zzZsD;
    int zzZsE;

    public zzZTP() {
        super(61458, 1);
    }

    @Override // com.aspose.words.zzZT7
    public final void zzD(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        this.zzYKE = zzzox.zzXc();
        this.zzYKg = zzzox.zzXc();
        this.zzYKf = zzzox.zzXc();
        this.zzYKe = zzzox.zzXc();
        this.zzZsE = zzzox.zzXc();
        this.zzZsD = zzzox.zzXc();
    }

    @Override // com.aspose.words.zzZT7
    public final void zzZ(zzZSP zzzsp) throws Exception {
        zzzsp.write(this.zzYKE);
        zzzsp.write(this.zzYKg);
        zzzsp.write(this.zzYKf);
        zzzsp.write(this.zzYKe);
        zzzsp.write(this.zzZsE);
        zzzsp.write(this.zzZsD);
    }

    public final zzTM zzZiE() {
        return new zzTM(this.zzYKg, this.zzYKf, this.zzZsE, this.zzZsD);
    }

    public zzZTP(int i, int i2, zzTM zztm) {
        this();
        this.zzYKE = i;
        this.zzYKe = i2;
        if (zztm != null) {
            this.zzYKg = zztm.zzZsG;
            this.zzYKf = zztm.zzZsF;
            this.zzZsE = zztm.zzZsE;
            this.zzZsD = zztm.zzZsD;
            return;
        }
        this.zzYKg = 0;
        this.zzYKf = 0;
        this.zzZsE = -1;
        this.zzZsD = -1;
    }
}
