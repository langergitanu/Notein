package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zz6X extends zz07 {
    private double zzZ3a;
    private double zzZ3b;
    private double zzZ3c;
    private double zzZ3d;

    private void zzXU(long j) {
        this.zzZ3b = Float.intBitsToFloat((int) j);
        this.zzZ3a = com.aspose.words.internal.zzZPY.zzYC(j);
    }

    private void zzZ(zz6X zz6x) {
        zzT(zz6x);
        zz6x.zzZ3d = this.zzZ3d;
        zz6x.zzZ3c = this.zzZ3c;
        zz6x.zzZ3b = this.zzZ3b;
        zz6x.zzZ3a = this.zzZ3a;
    }

    private float zzZAb() {
        if (com.aspose.words.internal.zzAN.zzZD(getWidth()) || com.aspose.words.internal.zzAN.zzZD(this.zzZ3c)) {
            return 1.0f;
        }
        return (float) (getWidth() / this.zzZ3c);
    }

    private float zzZAc() {
        if (com.aspose.words.internal.zzAN.zzZD(getHeight()) || com.aspose.words.internal.zzAN.zzZD(this.zzZ3d)) {
            return 1.0f;
        }
        return (float) (getHeight() / this.zzZ3d);
    }

    private long zzZAf() {
        return com.aspose.words.internal.zzZPY.zzG((float) this.zzZ3b, (float) this.zzZ3a);
    }

    @Override // com.aspose.words.zz07
    public final void offset(float f, float f2) {
        super.offset(f, f2);
        this.zzZ3b += (double) f;
        this.zzZ3a += (double) f2;
    }

    public final void zzXQ(double d) {
        this.zzZ3a = d;
    }

    public final void zzXR(double d) {
        this.zzZ3b = d;
    }

    public final void zzXS(double d) {
        this.zzZ3d = d;
    }

    public final void zzXT(double d) {
        this.zzZ3c = d;
    }

    public final long zzZA8() {
        double width = this.zzZ3c;
        if (width == 0.0d) {
            width = getWidth();
        }
        double height = this.zzZ3d;
        if (height == 0.0d) {
            height = getHeight();
        }
        return com.aspose.words.internal.zzZPY.zzG((float) ((width / 2.0d) + this.zzZ3b), (float) ((height / 2.0d) + this.zzZ3a));
    }

    @Override // com.aspose.words.zz07
    public final float zzZA9() {
        return zzZAc();
    }

    @Override // com.aspose.words.zz07
    public final float zzZAa() {
        return zzZAb();
    }

    public final double zzZAd() {
        return this.zzZ3a;
    }

    public final double zzZAe() {
        return this.zzZ3b;
    }

    public final double zzZAg() {
        return this.zzZ3d;
    }

    public final double zzZAh() {
        return this.zzZ3c;
    }

    @Override // com.aspose.words.zz07
    public final zz07 zzZAi() {
        zz6X zz6x = new zz6X();
        zzZ(zz6x);
        return zz6x;
    }

    public final void zzZAj() {
        this.zzZ3c = getWidth();
        this.zzZ3d = getHeight();
        this.zzZ3b = zzQb();
        this.zzZ3a = zzYm();
    }

    @Override // com.aspose.words.zz07
    public final void zzq(double d, double d2) {
        super.zzq(d, d2);
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        long jZzNV = zzNV();
        int i = (int) jZzNV;
        zzp9.zzY(-Float.intBitsToFloat(i), -com.aspose.words.internal.zzZPY.zzYC(jZzNV), 1);
        zzp9.zzZ((float) d, (float) d2, 1);
        zzp9.zzY(Float.intBitsToFloat(i), com.aspose.words.internal.zzZPY.zzYC(jZzNV), 1);
        zzXU(zzp9.zzR(zzZAf()));
        this.zzZ3c *= d;
        this.zzZ3d *= d2;
    }

    public final com.aspose.words.internal.zzP9 zzr(double d, double d2) {
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        long jZzZA8 = zzZA8();
        long jZzNV = zzNV();
        zzp9.zzY(-Float.intBitsToFloat((int) jZzZA8), -com.aspose.words.internal.zzZPY.zzYC(jZzZA8), 1);
        zzp9.zzZ((float) d, (float) d2, 1);
        zzp9.zzY(Float.intBitsToFloat((int) jZzNV), com.aspose.words.internal.zzZPY.zzYC(jZzNV), 1);
        return zzp9;
    }
}
