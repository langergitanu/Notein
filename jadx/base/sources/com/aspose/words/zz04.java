package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz04 {
    private double zzYX1;
    private double zzYX2;
    private com.aspose.words.internal.zzP9 zzYX3;
    private com.aspose.words.internal.zzP9 zzYX4;
    private double zzYX5;
    private double zzYX6;
    private double zzYX7;
    private zz07 zzYYu;
    private zz07 zzZji;

    public zz04() {
        this(new zz07());
    }

    private static boolean zzM(zzHK zzhk) {
        double dZzZQQ = zzhk.zzZQQ();
        if (dZzZQQ < 45.0d || dZzZQQ >= 135.0d) {
            return dZzZQQ >= 225.0d && dZzZQQ < 315.0d;
        }
        return true;
    }

    private void zzY(zz04 zz04Var) {
        long jZzNV = zzZTh().zzNV();
        long jZzR = zz04Var.zzYX3.zzR(jZzNV);
        zzZTh().offset(Float.intBitsToFloat((int) jZzR) - Float.intBitsToFloat((int) jZzNV), com.aspose.words.internal.zzZPY.zzYC(jZzR) - com.aspose.words.internal.zzZPY.zzYC(jZzNV));
        if (zzM(zzZs3().zzZCC())) {
            zzZTh().zzq(zz04Var.zzYX1, zz04Var.zzYX2);
        } else {
            zzZTh().zzq(zz04Var.zzYX2, zz04Var.zzYX1);
        }
    }

    private void zzZ(zz04 zz04Var) {
        if (zzM(zzZs3().zzZCC())) {
            this.zzYX2 = zz04Var.zzYX1 * ((double) zzZs3().zzZAa());
            this.zzYX1 = zz04Var.zzYX2 * ((double) zzZs3().zzZA9());
        } else {
            this.zzYX2 = zz04Var.zzYX2 * ((double) zzZs3().zzZAa());
            this.zzYX1 = zz04Var.zzYX1 * ((double) zzZs3().zzZA9());
        }
    }

    private zz07 zzZTh() {
        if (this.zzZji == null) {
            this.zzZji = new zz07();
        }
        return this.zzZji;
    }

    private zz07 zzZs3() {
        if (this.zzYYu == null) {
            this.zzYYu = new zz07();
        }
        return this.zzYYu;
    }

    private void zzZs7() {
        zz07 zz07VarZzZTh = zzZTh();
        if (zz07VarZzZTh instanceof zz6X) {
            zz6X zz6x = (zz6X) zz07VarZzZTh;
            zz6X zz6x2 = (zz6X) zzZs3();
            float fIntBitsToFloat = Float.intBitsToFloat((int) zz6x.zzZA8()) - Float.intBitsToFloat((int) zz6x2.zzZA8());
            float fZzYC = com.aspose.words.internal.zzZPY.zzYC(zz6x.zzZA8()) - com.aspose.words.internal.zzZPY.zzYC(zz6x2.zzZA8());
            com.aspose.words.internal.zzP9 zzp9Zzr = zz6x.zzr(this.zzYX2, this.zzYX1);
            this.zzYX3 = zzp9Zzr;
            zzp9Zzr.zzY(fIntBitsToFloat, fZzYC, 0);
            zz6x.zzZAj();
        }
    }

    public final zz04 zzN(zz07 zz07Var) {
        zz04 zz04Var = new zz04(zz07Var);
        zz04Var.zzY(this);
        zz04Var.zzZ(this);
        zz04Var.zzZs7();
        zz04Var.zzX(this);
        return zz04Var;
    }

    public final com.aspose.words.internal.zzP9 zzX(float f, float f2, boolean z) {
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        float fIntBitsToFloat = Float.intBitsToFloat((int) zzZs3().zzZPI());
        float fZzYC = com.aspose.words.internal.zzZPY.zzYC(zzZs3().zzZPI());
        zzp9.zzY((-fIntBitsToFloat) / f, (-fZzYC) / f2, 1);
        zzp9.zzZ((float) (this.zzYX2 * ((double) f)), (float) (this.zzYX1 * ((double) f2)), 1);
        zzp9.zzZ((float) this.zzYX6, (float) this.zzYX5, 1);
        if (z) {
            zzp9.zzX((float) com.aspose.words.internal.zzAN.zzZK(this.zzYX7), 1);
        }
        zzp9.zzY(fIntBitsToFloat, fZzYC, 1);
        return zzp9;
    }

    public final void zzXe(double d) {
        this.zzYX7 = d;
    }

    public final void zzXf(double d) {
        this.zzYX5 = d;
    }

    public final void zzXg(double d) {
        this.zzYX6 = d;
    }

    public final double zzZs4() {
        return this.zzYX7;
    }

    public final double zzZs5() {
        return this.zzYX5;
    }

    public final double zzZs6() {
        return this.zzYX6;
    }

    public final com.aspose.words.internal.zzP9 zzZs8() {
        long jZzNV = zzZs3().zzNV();
        long jZzR = this.zzYX4.zzR(zzZTh().zzNV());
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        int i = (int) jZzNV;
        zzp9.zzY(Float.intBitsToFloat((int) jZzR) - Float.intBitsToFloat(i), com.aspose.words.internal.zzZPY.zzYC(jZzR) - com.aspose.words.internal.zzZPY.zzYC(jZzNV), 0);
        zzp9.zzY(Float.intBitsToFloat(i) - Float.intBitsToFloat((int) zzZs3().zzZPI()), com.aspose.words.internal.zzZPY.zzYC(jZzNV) - com.aspose.words.internal.zzZPY.zzYC(zzZs3().zzZPI()), 0);
        return zzp9;
    }

    private zz04(zz07 zz07Var) {
        this.zzYX6 = 1.0d;
        this.zzYX5 = 1.0d;
        this.zzYX4 = new com.aspose.words.internal.zzP9();
        this.zzYX3 = new com.aspose.words.internal.zzP9();
        this.zzYX2 = 1.0d;
        this.zzYX1 = 1.0d;
        this.zzYYu = zz07Var;
        this.zzZji = zz07Var.zzZAi();
    }

    private void zzX(zz04 zz04Var) {
        com.aspose.words.internal.zzP9 zzp9ZzZsc = zzZTh().zzZsc();
        com.aspose.words.internal.zzP9 zzp9ZzOh = zz04Var.zzYX4.zzOh();
        this.zzYX4 = zzp9ZzOh;
        zzp9ZzOh.zzZ(zzp9ZzZsc, 0);
        int flipOrientation = zzZs3().getFlipOrientation();
        boolean z = flipOrientation == 1 || flipOrientation == 3;
        boolean z2 = flipOrientation == 2 || flipOrientation == 3;
        double dZzZQR = zzZs3().zzZCC().zzZQR();
        double d = zz04Var.zzYX6;
        double d2 = zz04Var.zzYX5;
        this.zzYX7 = zz04Var.zzYX7 + (dZzZQR * d * d2);
        this.zzYX6 = d * (z ? -1.0d : 1.0d);
        this.zzYX5 = d2 * (z2 ? -1.0d : 1.0d);
    }
}
