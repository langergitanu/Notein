package com.aspose.words;

import com.aspose.words.internal.C22244OooO0o0;

/* JADX INFO: loaded from: classes6.dex */
class zz3O extends zzDL {
    private com.aspose.words.internal.zzZQ4 zzZ05;
    private com.aspose.words.internal.zzZQ4 zzZ06;
    private zzZCP zzZ07;
    private zz3P zzZ08;
    private float zzZbc;
    private float zzZbd;
    private float zzZe8;
    private ChartSeries zzZfT;
    private long zzZi7;

    public zz3O(zzGK zzgk) {
        super(zzgk);
        this.zzZi7 = 0L;
        this.zzZ08 = (zz3P) zzgk;
    }

    private com.aspose.words.internal.zzZQ4 zzT(long j, float f, float f2) {
        com.aspose.words.internal.zzZQ4 zzzq4 = new com.aspose.words.internal.zzZQ4(j, 0L);
        if (!zzZwq()) {
            return zzzq4;
        }
        zz8J zz8j = (zz8J) this.zzZ08;
        return zzU(j, (f * zz8j.zzZCn()) / 100.0f, (f2 * zz8j.zzZCn()) / 100.0f);
    }

    private static com.aspose.words.internal.zzZQ4 zzU(long j, float f, float f2) {
        return new com.aspose.words.internal.zzZQ4(Float.intBitsToFloat((int) j) - f2, com.aspose.words.internal.zzZPY.zzYC(j) - f, f2 * 2.0f, f * 2.0f);
    }

    private void zzW(zzDI zzdi) throws Exception {
        int iZzZwr;
        float height;
        double d;
        int i;
        double[] dArr;
        com.aspose.words.internal.zzZQ4 zzzq4;
        if (com.aspose.words.internal.zzAN.zzVb(zzZwr())) {
            return;
        }
        zzZws();
        double dZzZS3 = zzZS3();
        if (zzZwq()) {
            height = (this.zzZbd - (this.zzZ05.getHeight() / 2.0f)) / zzZwr();
            iZzZwr = zzZwr();
        } else {
            iZzZwr = 1;
            height = 0.0f;
        }
        float f = height;
        int i2 = iZzZwr;
        int i3 = 0;
        while (i3 < i2) {
            ChartSeries chartSeries = this.zzZ08.zzZPi().get(i3);
            double d2 = dZzZS3;
            zzDI zzdi2 = zzdi;
            zz3N zz3n = new zz3N(chartSeries, zzdi2);
            double[] dArrZzZ = zzZ(zzZS3(), chartSeries, this.zzZ06);
            zzCF[] zzcfArrZzZIo = chartSeries.zz2y().zzZMv().zzZIo();
            float f2 = i3 * f;
            int i4 = i3 + 1;
            float fZzZwr = (i4 - zzZwr()) * f;
            com.aspose.words.internal.zzZQ4 zzzq4ZzX = com.aspose.words.internal.zzZQ4.zzX(this.zzZ06, fZzZwr, fZzZwr);
            com.aspose.words.internal.zzZQ4 zzzq4ZzX2 = com.aspose.words.internal.zzZQ4.zzX(this.zzZ05, f2, f2);
            double d3 = d2;
            int i5 = 0;
            while (i5 < dArrZzZ.length) {
                if (zzCF.zzR(zzcfArrZzZIo[i5])) {
                    d = d3;
                    i = i5;
                    dArr = dArrZzZ;
                    zzzq4 = zzzq4ZzX2;
                } else {
                    int index = zzcfArrZzZIo[i5].getIndex();
                    double d4 = d3;
                    com.aspose.words.internal.zzP9 zzp9ZzZ = zzZ(d4, dArrZzZ[i5], this.zzZbd, this.zzZbc, chartSeries.zzNM(index).getExplosion(), zzdi2.zzZIz(), zzzq4ZzX, this.zzZ07.zz44());
                    com.aspose.words.internal.zzZQ4 zzzq4ZzO = zzp9ZzZ.zzO(zzzq4ZzX);
                    com.aspose.words.internal.zzZQ4 zzzq4ZzO2 = zzp9ZzZ.zzO(zzzq4ZzX2);
                    i = i5;
                    zzZ(zz3n, d4, dArrZzZ[i5], zzzq4ZzO, zzzq4ZzO2, index);
                    dArr = dArrZzZ;
                    zzzq4 = zzzq4ZzX2;
                    zzW(zzFR.zzZ(zzZIE(), index, chartSeries, zzzq4ZzO, zzzq4ZzO2, this.zzZe8, d4, dArrZzZ[i]));
                    d = d4 + dArr[i];
                }
                i5 = i + 1;
                zzdi2 = zzdi;
                dArrZzZ = dArr;
                zzzq4ZzX2 = zzzq4;
                d3 = d;
            }
            dZzZS3 = d3;
            i3 = i4;
        }
    }

    private double zzZS3() {
        return ((this.zzZ08.zz3R() && this.zzZ07.zzZLQ().zzZFR()) ? this.zzZ07.zzZLQ().zzZFS() : this.zzZ08.zzZwu()) - 90;
    }

    private boolean zzZwq() {
        return this.zzZ08.zzZQO() == 9;
    }

    private int zzZwr() {
        return this.zzZ08.zzZPi().size();
    }

    private void zzZws() throws Exception {
        this.zzZi7 = this.zzZ07.zzZKr();
        this.zzZbd = zzYP(this.zzZ07.zzZKu());
        this.zzZbc = zzYP(this.zzZ07.zzZKt());
        this.zzZe8 = zzYP(this.zzZ07.zzZKs());
        this.zzZ06 = zzU(this.zzZi7, this.zzZbd, this.zzZbc);
        this.zzZ05 = zzT(this.zzZi7, this.zzZbd, this.zzZbc);
    }

    @Override // com.aspose.words.zzDL
    public final void zzV(zzEM zzem, zzDI zzdi) throws Exception {
        String[] strArrZzG = zzDL.zzG(zzZPk());
        for (int i = 0; i < strArrZzG.length; i++) {
            zzZ(zzem, zzdi, i, zzZPk().zzNM(i), strArrZzG[i]);
        }
    }

    public final float zzYP(float f) {
        return zzZPk().zz2H().getExplosion() >= 0 ? f / ((zzZPk().zz2H().getExplosion() / 100.0f) + 1.0f) : f;
    }

    @Override // com.aspose.words.zzDL
    public void zzZ(zzZCP zzzcp, zzDI zzdi) throws Exception {
        this.zzZ07 = zzzcp;
        zzdi.zzW(zzdi.zzKy(4));
        zzW(zzdi);
        zzG5.zzh(this.zzZaP);
        zzdi.zzZI();
    }

    public final ChartSeries zzZPk() {
        if (this.zzZfT == null && this.zzZ08.zzZPi().size() > 0) {
            this.zzZfT = this.zzZ08.zzZPi().get(0);
        }
        return this.zzZfT;
    }

    public static com.aspose.words.internal.zzZQ4 zzV(long j, float f, float f2) {
        return zzU(j, f, f2);
    }

    public static com.aspose.words.internal.zzP9 zzZ(double d, double d2, float f, int i, com.aspose.words.internal.zzZQ4 zzzq4, long j, com.aspose.words.internal.zzZQ4 zzzq42) {
        return zzZ(d, d2, f, f, i, j, zzzq4, zzzq42);
    }

    public static com.aspose.words.internal.zzZQ4 zzT(long j, float f) {
        return zzU(j, f, f);
    }

    private static com.aspose.words.internal.zzP9 zzZ(double d, double d2, float f, float f2, int i, long j, com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzZQ4 zzzq42) {
        if (i <= 0) {
            return new com.aspose.words.internal.zzP9();
        }
        double d3 = d + 90.0d;
        double dZzZL = com.aspose.words.internal.zzAN.zzZL((d2 / 2.0d) + d3);
        float f3 = i / 100.0f;
        float fSin = f2 * f3 * ((float) Math.sin(dZzZL));
        float fCos = (-(f * f3)) * ((float) Math.cos(dZzZL));
        com.aspose.words.internal.zzZQ4 zzzq4ZzZ = zzZ(zzzq4, d3, d2);
        com.aspose.words.internal.zzZQ4 zzzq43 = new com.aspose.words.internal.zzZQ4(zzzq42.getX() + zzzq4ZzZ.getX(), zzzq42.getY() + zzzq4ZzZ.getY(), zzzq4ZzZ.getWidth(), zzzq4ZzZ.getHeight());
        if (zzzq43.getY() + fCos < 0.0f || zzzq43.zzZn() + fCos > com.aspose.words.internal.zzZPW.zzYz(j)) {
            fCos = zzzq43.getY() + fCos < 0.0f ? -zzzq43.getY() : com.aspose.words.internal.zzZPW.zzYz(j) - zzzq43.zzZn();
            fSin = (-fCos) * ((float) Math.tan(dZzZL));
        }
        if (zzzq43.getX() + fSin < 0.0f || zzzq43.zzkw() + fSin > Float.intBitsToFloat((int) j)) {
            fSin = zzzq43.getX() + fSin < 0.0f ? -zzzq43.getX() : Float.intBitsToFloat((int) j) - zzzq43.zzkw();
            fCos = (-fSin) / ((float) Math.tan(dZzZL));
        }
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        zzp9.zzY(fSin, fCos, 0);
        return zzp9;
    }

    public static double[] zzZ(double d, zzCF[] zzcfArr, double d2, com.aspose.words.internal.zzZQ4 zzzq4) {
        int i;
        int i2;
        int i3;
        zzCF[] zzcfArr2 = zzcfArr;
        int length = zzcfArr2.length;
        double[] dArr = new double[length];
        if (zzcfArr2.length != 0) {
            double[] dArrZzZ = zz3N.zzZ(d, zzzq4);
            int i4 = 0;
            double d3 = 0.0d;
            while (true) {
                i = StyleIdentifier.LIST_TABLE_4_ACCENT_5;
                if (i4 >= 360) {
                    break;
                }
                d3 += dArrZzZ[i4];
                i4++;
            }
            float f = 0.0f;
            int i5 = 0;
            int i6 = 0;
            double d4 = 0.0d;
            double d5 = 0.0d;
            while (i5 < length) {
                if (!zzCF.zzR(zzcfArr2[i5]) && !com.aspose.words.internal.zzAN.zzZD(zzcfArr2[i5].getValue())) {
                    float fAbs = Math.abs((float) zzcfArr2[i5].getValue()) + f;
                    double d6 = (((double) fAbs) / d2) * d3;
                    int i7 = 0;
                    while (true) {
                        i3 = i7 + i6;
                        if (i3 >= i || d4 >= d6) {
                            break;
                        }
                        d4 += dArrZzZ[i3];
                        i7++;
                    }
                    double d7 = (d4 - d6) / dArrZzZ[i3 - 1];
                    int i8 = i5;
                    double d8 = (((double) i7) - d7) + d5;
                    if (i8 == length - 1) {
                        d8 += d7;
                    }
                    dArr[i8] = d8;
                    f = fAbs;
                    d5 = d7;
                    i2 = i8;
                    i6 = i3;
                } else {
                    i2 = i5;
                    dArr[i2] = 0.0d;
                }
                i5 = i2 + 1;
                zzcfArr2 = zzcfArr;
                i = StyleIdentifier.LIST_TABLE_4_ACCENT_5;
            }
        }
        return dArr;
    }

    private static double[] zzZ(double d, ChartSeries chartSeries, com.aspose.words.internal.zzZQ4 zzzq4) {
        return zzZ(d, chartSeries.zz2y().zzZMv().zzZIo(), chartSeries.zz2y().zzZMv().getSum(), zzzq4);
    }

    private void zzZ(zz3N zz3n, double d, double d2, com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzZQ4 zzzq42, int i) throws Exception {
        if (com.aspose.words.internal.zzAN.zzZD(d2)) {
            return;
        }
        if (this.zzZ08.zz3R()) {
            zz3n.zzZ(this.zzZe8, d, d2, zzzq4, i);
        } else {
            zz3n.zzZ(d, d2, zzzq4, zzzq42, i);
        }
    }

    private static com.aspose.words.internal.zzZQ4 zzZ(com.aspose.words.internal.zzZQ4 zzzq4, double d, double d2) {
        float fOooO00o = C22244OooO0o0.OooO00o(zzzq4, 2.0f, zzzq4.getX());
        float height = (zzzq4.getHeight() / 2.0f) + zzzq4.getY();
        double d3 = d + d2;
        com.aspose.words.internal.zzQ5 zzq5 = new com.aspose.words.internal.zzQ5(zzzq4, d - 90.0d, d2);
        long jZzPX = zzq5.zzPX();
        long jZzPW = zzq5.zzPW();
        int i = (int) jZzPX;
        int i2 = (int) jZzPW;
        float fZzR = com.aspose.words.internal.zzAN.zzR(fOooO00o, Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        float fZzR2 = com.aspose.words.internal.zzAN.zzR(height, com.aspose.words.internal.zzZPY.zzYC(jZzPX), com.aspose.words.internal.zzZPY.zzYC(jZzPW));
        float fZzQ = com.aspose.words.internal.zzAN.zzQ(fOooO00o, Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        float fZzQ2 = com.aspose.words.internal.zzAN.zzQ(height, com.aspose.words.internal.zzZPY.zzYC(jZzPX), com.aspose.words.internal.zzZPY.zzYC(jZzPW));
        if ((com.aspose.words.internal.zzAN.zzK(d, 0.0d) && d3 > 0.0d) || (com.aspose.words.internal.zzAN.zzK(d, 360.0d) && d3 > 360.0d)) {
            fZzR2 = zzzq4.getY();
        }
        if (com.aspose.words.internal.zzAN.zzK(d, 90.0d) && d3 > 90.0d) {
            fZzQ = zzzq4.zzkw();
        }
        if (com.aspose.words.internal.zzAN.zzK(d, 180.0d) && d3 > 180.0d) {
            fZzQ2 = zzzq4.zzZn();
        }
        if (com.aspose.words.internal.zzAN.zzK(d, 270.0d) && d3 > 270.0d) {
            fZzR = zzzq4.getX();
        }
        return new com.aspose.words.internal.zzZQ4(fZzR, fZzR2, fZzQ - fZzR, fZzQ2 - fZzR2);
    }
}
