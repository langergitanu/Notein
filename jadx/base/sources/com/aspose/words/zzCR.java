package com.aspose.words;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
final class zzCR extends zz80 implements Cloneable {
    private com.aspose.words.internal.zz0Q zzGf;
    private com.aspose.words.internal.zz0Q zzZ9G;
    private zzFD zzZ9H;
    private zzFD zzZ9I;
    private double[][] zzZ9K;
    private ChartSeries zzZyw;
    private zzCO zzZ9J = new zzCO();
    private double zzZ9F = Double.MAX_VALUE;
    private double zzZ9E = -1.7976931348623157E308d;

    private int getOrder() {
        return ((Integer) this.zzZ9J.zzLv(6)).intValue();
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    private void prepare() {
        zzZH7();
        int iZzZGQ = zzZGQ();
        if (iZzZGQ == 0) {
            zzZGZ();
            return;
        }
        if (iZzZGQ != 1) {
            if (iZzZGQ == 2) {
                zzZH0();
                return;
            }
            if (iZzZGQ == 3) {
                zzZGY();
                return;
            } else if (iZzZGQ != 4) {
                if (iZzZGQ != 5) {
                    throw new IllegalArgumentException("Unexpected TrendlineType");
                }
                zzZH0();
                return;
            }
        }
        zzZH1();
    }

    private int zz29() {
        if (this.zzZyw.zz2z().zzZMv() == null) {
            return 1;
        }
        return this.zzZyw.zz2z().zzZMv().getValueType();
    }

    private static double[][] zzKk(int i) {
        double[][] dArrZzY4 = zzY4(i, i);
        for (int i2 = 0; i2 < i; i2++) {
            dArrZzY4[i2][i2] = 1.0d;
        }
        return dArrZzY4;
    }

    private void zzKl(int i) {
        int valueCount = (this.zzZ9I.zzZMv().getValueCount() * 2) - 1;
        zzFD zzfd = new zzFD(new zzFK());
        this.zzZ9H = zzfd;
        zzfd.zzV(new zzCE(2));
        this.zzZ9H.zzZN4().zzNy(valueCount);
        boolean zIsDate = this.zzZ9I.isDate();
        this.zzGf = new com.aspose.words.internal.zz0Q(valueCount);
        zzCF[] zzcfArrZzZIo = this.zzZ9I.zzZMv().zzZIo();
        Arrays.sort(zzcfArrZzZIo);
        for (int i2 = 0; i2 < zzcfArrZzZIo.length; i2++) {
            zzCF zzcf = zzcfArrZzZIo[i2];
            if (!zzCF.zzR(zzcf)) {
                zzZ(zIsDate ? i2 + 1 : (float) zzcf.getValue(), this.zzZ9K, i);
                if (i2 < zzcfArrZzZIo.length - 1) {
                    zzZ(zIsDate ? i2 + 1.5f : (((float) zzcf.getValue()) + ((float) zzcfArrZzZIo[i2 + 1].getValue())) / 2.0f, this.zzZ9K, i);
                }
            }
        }
    }

    private int zzKm(int i) {
        String formatCode = this.zzZyw.zz2z().zzZMv().getFormatCode();
        for (int i2 = 0; i2 < this.zzZyw.zz2D().length; i2++) {
            zzCF zzcf = this.zzZyw.zz2D()[i2];
            if (!zzCF.zzR(zzcf)) {
                zzE7 zze7 = (zzE7) com.aspose.words.internal.zzZKW.zzZ(this.zzZyw.zz2D()[i2], zzE7.class);
                this.zzZ9I.zzZMv().zzU(new zzE7(i, zzcf.getValue(), zze7 == null ? formatCode : zze7.getFormatCode()));
                i++;
            }
        }
        return i;
    }

    private static double[][] zzO(com.aspose.words.internal.zz0Q zz0q) {
        double[][] dArrZzY4 = zzY4(zz0q.getCount(), 1);
        for (int i = 0; i < zz0q.getCount(); i++) {
            dArrZzY4[i][0] = com.aspose.words.internal.zzZPY.zzYC(zz0q.get(i));
        }
        return dArrZzY4;
    }

    private static double zzP(com.aspose.words.internal.zz0Q zz0q) {
        double dMax = 0.0d;
        double dMin = 0.0d;
        for (int i = 0; i < zz0q.getCount(); i++) {
            long j = zz0q.get(i);
            dMax = Math.max(com.aspose.words.internal.zzZPY.zzYC(j), dMax);
            dMin = Math.min(com.aspose.words.internal.zzZPY.zzYC(j), dMin);
        }
        return dMax - dMin;
    }

    private float zzY(float f, double[][] dArr, int i) {
        int iZzZGQ = zzZGQ();
        if (iZzZGQ == 0) {
            return (float) (Math.exp((com.aspose.words.internal.zzAN.zzZD(zzZGT()) ? 0.0d : dArr[1][0]) * ((double) f)) * (com.aspose.words.internal.zzAN.zzZD(zzZGT()) ? 0.0d : Math.exp(dArr[0][0])));
        }
        if (iZzZGQ != 1) {
            if (iZzZGQ == 2) {
                double d = dArr[1][0];
                double d2 = dArr[0][0];
                return com.aspose.words.internal.zzAN.zzf(f) ? ((float) d2) * 0.9f : (float) ((Math.log(f) * d) + d2);
            }
            if (iZzZGQ != 4) {
                if (iZzZGQ != 5) {
                    throw new IllegalArgumentException("Unexpected TrendlineType");
                }
                double dExp = Math.exp(dArr[0][0]);
                return com.aspose.words.internal.zzAN.zzf(f) ? ((float) dExp) * 1.2f : (float) (Math.pow(f, dArr[1][0]) * dExp);
            }
        }
        float fPow = 0.0f;
        for (int i2 = 0; i2 < i + 1; i2++) {
            fPow += (float) (Math.pow(f, i2) * dArr[i2][0]);
        }
        return fPow;
    }

    private static double[][] zzY4(int i, int i2) {
        double[][] dArr = new double[i][];
        for (int i3 = 0; i3 < i; i3++) {
            dArr[i3] = new double[i2];
        }
        return dArr;
    }

    private com.aspose.words.internal.zz0Q zzZGO() {
        if (this.zzZ9G == null) {
            zzZH2();
        }
        return this.zzZ9G;
    }

    private double zzZGT() {
        return ((Double) this.zzZ9J.zzLv(4)).doubleValue();
    }

    private double zzZGU() {
        return ((Double) this.zzZ9J.zzLv(3)).doubleValue();
    }

    private double zzZGX() {
        return ((Double) this.zzZ9J.zzLv(0)).doubleValue();
    }

    private void zzZGY() {
        this.zzZ9H = this.zzZyw.zz2y();
        this.zzGf = zzZGO();
    }

    private void zzZGZ() {
        this.zzZ9K = zzY4(2, 1);
        if (!com.aspose.words.internal.zzAN.zzZD(zzZGT())) {
            this.zzZ9K = zzZ(zzZGO(), 2, Double.isNaN(zzZGT()) ? Double.NaN : Math.log(zzZGT()));
        }
        zzKl(0);
    }

    private void zzZH0() {
        this.zzZ9K = zzZ(zzZGO(), 2);
        zzKl(0);
    }

    private void zzZH1() {
        int order = zzZGQ() != 1 ? getOrder() < zzZGO().getCount() ? getOrder() : Math.max(2, zzZGO().getCount() - 1) : 1;
        this.zzZ9K = zzZ(zzZGO(), order + 1, zzZGT());
        zzKl(order);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzZH2() {
        long jZzG;
        com.aspose.words.internal.zz0Q zz0q = new com.aspose.words.internal.zz0Q();
        float f = Float.NaN;
        int i = 1;
        float f2 = Float.NaN;
        for (int i2 = 0; i2 < this.zzZyw.zz2D().length; i2++) {
            zzCF zzcf = this.zzZyw.zz2D()[i2];
            if (!zzCF.zzR(zzcf)) {
                zzCF zzcfZzL0 = this.zzZyw.zz2y().zzL0(zzcf.getIndex());
                if (zzCF.zzR(zzcfZzL0)) {
                    continue;
                } else {
                    float value = zzZGN().isDate() ? i2 + 1 : (float) zzcf.getValue();
                    float value2 = (float) zzcfZzL0.getValue();
                    int iZzZGQ = zzZGQ();
                    if (iZzZGQ == 0) {
                        jZzG = com.aspose.words.internal.zzZPY.zzG(value, (float) Math.log(value2));
                    } else if (iZzZGQ == 1) {
                        if (f == value) {
                            f2 += value2;
                            i++;
                        } else {
                            if (i > 1) {
                                zzZ(zz0q, f, f2 / i);
                            }
                            i = 1;
                            f2 = value2;
                        }
                        jZzG = com.aspose.words.internal.zzZPY.zzG(value, value2);
                    } else if (iZzZGQ == 2) {
                        jZzG = com.aspose.words.internal.zzZPY.zzG((float) Math.log(value), value2);
                    } else if (iZzZGQ != 3 && iZzZGQ != 4) {
                        if (iZzZGQ != 5) {
                            throw new IllegalArgumentException("Unexpected TrendlineType");
                        }
                        jZzG = com.aspose.words.internal.zzZPY.zzG((float) Math.log(value), (float) Math.log(value2));
                    }
                    zz0q.add(jZzG);
                    f = value;
                }
            }
        }
        this.zzZ9G = zz0q;
    }

    private void zzZH3() {
        if (zz29() != 1 && zz29() != 3) {
            throw new IllegalArgumentException("String value type is expected.");
        }
        for (int i = 0; i < this.zzZyw.getValueCount(); i++) {
            this.zzZ9I.zzZMv().zzU(this.zzZyw.zz2z().zzL0(i).zzZLf());
        }
        this.zzZ9I.zzZMv().zzNy(com.aspose.words.internal.zzAN.zzZG(zzZGU()) + this.zzZyw.getValueCount());
    }

    private void zzZH4() {
        if (!this.zzZyw.zz2z().isDate()) {
            throw new IllegalArgumentException("Date values are expected.");
        }
        zzZH5();
        int iZzKm = zzKm(0);
        String formatCode = this.zzZyw.zz2z().zzZMv().getFormatCode();
        this.zzZ9I.zzZMv().zzNy(com.aspose.words.internal.zzAN.zzZG(zzZGU()) + iZzKm);
        double d = (this.zzZ9E - this.zzZ9F) / ((double) iZzKm);
        while (iZzKm < this.zzZ9I.zzZMv().getValueCount()) {
            this.zzZ9E += d;
            this.zzZ9I.zzZMv().zzU(new zzE7(iZzKm, this.zzZ9E, formatCode));
            iZzKm++;
        }
    }

    private void zzZH5() {
        for (int i = 0; i < this.zzZyw.getValueCount(); i++) {
            zzCF zzcfZzL0 = this.zzZyw.zz2z().zzL0(i);
            if (!zzCF.zzR(zzcfZzL0)) {
                this.zzZ9F = Math.min(this.zzZ9F, zzcfZzL0.getValue());
                this.zzZ9E = Math.max(this.zzZ9E, zzcfZzL0.getValue());
            }
        }
    }

    private void zzZH6() {
        zzZH5();
        double valueCount = (this.zzZ9E - this.zzZ9F) / ((double) this.zzZyw.getValueCount());
        double dZzZGX = this.zzZ9F - zzZGX();
        double dZzZGU = this.zzZ9E + zzZGU();
        if ((zzZGQ() == 5 || zzZGQ() == 2) && dZzZGX < 0.0d) {
            dZzZGU += Math.abs(dZzZGX);
            dZzZGX = 0.0d;
        }
        int i = 0;
        if (!com.aspose.words.internal.zzAN.zzZD(valueCount)) {
            while (dZzZGX < this.zzZ9F) {
                this.zzZ9I.zzZMv().zzU(new zzFA(i, (float) dZzZGX));
                i++;
                dZzZGX += valueCount;
            }
        }
        int iZzKm = zzKm(i);
        if (!com.aspose.words.internal.zzAN.zzZD(valueCount)) {
            double d = this.zzZ9E;
            while (true) {
                if (d >= dZzZGU && (com.aspose.words.internal.zzAN.zzZD(zzZGU()) || !com.aspose.words.internal.zzAN.zzL(d, dZzZGU))) {
                    break;
                }
                this.zzZ9I.zzZMv().zzU(new zzFA(iZzKm, (float) d));
                iZzKm++;
                d += valueCount;
            }
        }
        this.zzZ9I.zzZMv().zzNy(iZzKm);
    }

    private void zzZH7() {
        if (this.zzZ9I != null) {
            return;
        }
        zzFD zzfd = new zzFD(new zzFK());
        this.zzZ9I = zzfd;
        zzfd.zzV(new zzCE(zz29()));
        if (zz29() == 1 || zz29() == 3) {
            zzZH3();
        } else if (this.zzZyw.zz2z().isDate()) {
            zzZH4();
        } else {
            zzZH6();
        }
    }

    private boolean zzZH8() {
        zzCF[] zzcfArrZz2D = this.zzZyw.zz2D();
        int length = zzcfArrZz2D.length;
        zzCF zzcf = null;
        int i = 0;
        while (i < length) {
            zzCF zzcf2 = zzcfArrZz2D[i];
            if (zzcf != null && !com.aspose.words.internal.zzAN.zzL(zzcf2.getValue(), zzcf.getValue())) {
                return false;
            }
            i++;
            zzcf = zzcf2;
        }
        return true;
    }

    @Override // com.aspose.words.zz80, com.aspose.words.zzZCH
    public final com.aspose.words.internal.zzZYG<zz82> getExtensions() {
        return (com.aspose.words.internal.zzZYG) this.zzZ9J.zzLv(11);
    }

    public final String getName() {
        return (String) this.zzZ9J.zzLv(5);
    }

    public final boolean isValid() {
        return this.zzZyw.zz2D().length > 1 && this.zzZyw.zz2y().zzZMv().zz2w() > 0 && !zzZH8() && (!(zzZGQ() == 5 || zzZGQ() == 2) || ((float) this.zzZyw.zz2D()[0].getValue()) > 0.0f);
    }

    @Override // com.aspose.words.zz80, com.aspose.words.zzZCH
    public final void setExtensions(com.aspose.words.internal.zzZYG<zz82> zzzyg) {
        this.zzZ9J.zzL(11, zzzyg);
    }

    public final void setName(String str) {
        this.zzZ9J.zzL(5, str);
    }

    public final void setOrder(int i) {
        if (i < 2 || i > 6) {
            return;
        }
        this.zzZ9J.zzL(6, Integer.valueOf(i));
    }

    public final void zzKi(int i) {
        this.zzZ9J.zzL(10, Integer.valueOf(i));
    }

    public final void zzKj(int i) {
        if (i < 2 || i > 255) {
            return;
        }
        this.zzZ9J.zzL(7, Integer.valueOf(i));
    }

    public final com.aspose.words.internal.zz0Q zzNu() {
        if (this.zzGf == null) {
            prepare();
        }
        return this.zzGf;
    }

    public final void zzXA(boolean z) {
        this.zzZ9J.zzL(1, Boolean.valueOf(z));
    }

    public final void zzXz(boolean z) {
        this.zzZ9J.zzL(2, Boolean.valueOf(z));
    }

    public final void zzY8(double d) {
        this.zzZ9J.zzL(4, Double.valueOf(d));
    }

    public final void zzY9(double d) {
        this.zzZ9J.zzL(3, Double.valueOf(d));
    }

    public final void zzYa(double d) {
        this.zzZ9J.zzL(0, Double.valueOf(d));
    }

    public final void zzZ(ChartSeries chartSeries) {
        this.zzZyw = chartSeries;
    }

    public final ChartSeries zzZGK() {
        return this.zzZyw;
    }

    public final double[][] zzZGL() {
        return this.zzZ9K;
    }

    public final zzFD zzZGM() {
        if (this.zzZ9H == null) {
            prepare();
        }
        return this.zzZ9H;
    }

    public final zzFD zzZGN() {
        if (this.zzZ9I == null) {
            prepare();
        }
        return this.zzZ9I;
    }

    public final zzCO zzZGP() {
        return this.zzZ9J;
    }

    public final int zzZGQ() {
        return ((Integer) this.zzZ9J.zzLv(10)).intValue();
    }

    public final zzCQ zzZGR() {
        return (zzCQ) this.zzZ9J.zzLv(9);
    }

    public final int zzZGS() {
        return ((Integer) this.zzZ9J.zzLv(7)).intValue();
    }

    public final boolean zzZGV() {
        return ((Boolean) this.zzZ9J.zzLv(2)).booleanValue();
    }

    public final boolean zzZGW() {
        return ((Boolean) this.zzZ9J.zzLv(1)).booleanValue();
    }

    public final zzCR zzZH9() {
        zzCR zzcr = (zzCR) memberwiseClone();
        zzcr.zzZ9J = this.zzZ9J.zzZGE();
        zzcr.zzZ9I = null;
        zzcr.zzZ9H = null;
        zzcr.zzGf = null;
        return zzcr;
    }

    public final zzD9 zzaQ() {
        if (this.zzZ9J.zzLv(8) == null) {
            this.zzZ9J.zzL(8, new zzD9());
        }
        return (zzD9) this.zzZ9J.zzLv(8);
    }

    private static void zzZ(com.aspose.words.internal.zz0Q zz0q, float f, float f2) {
        for (int i = 0; i < zz0q.getCount(); i++) {
            if (com.aspose.words.internal.zzAN.zzS(Float.intBitsToFloat((int) zz0q.get(i)), f)) {
                zz0q.set(i, com.aspose.words.internal.zzZPY.zzG(f, f2));
            }
        }
    }

    private void zzZ(float f, double[][] dArr, int i) {
        float fZzY = zzY(f, dArr, i);
        this.zzZ9H.zzZMv().zzU(new zzE7(this.zzGf.getCount(), fZzY, null));
        this.zzGf.add(com.aspose.words.internal.zzZPY.zzG(f, fZzY));
    }

    private static double[][] zzZ(com.aspose.words.internal.zz0Q zz0q, int i, double d) {
        double d2 = d;
        double[][] dArrZzZ = zzZ(zz0q, i);
        if (Double.isNaN(d2)) {
            return dArrZzZ;
        }
        int i2 = 0;
        double d3 = dArrZzZ[0][0];
        double dMax = Math.max(Double.MIN_VALUE, zzP(zz0q) / 1000000.0d);
        zz0q.add(com.aspose.words.internal.zzZPY.zzG(0.0f, (float) d2));
        double[][] dArrZzZ2 = dArrZzZ;
        double d4 = d3;
        while (!com.aspose.words.internal.zzAN.zzQ(d4, d2, dMax)) {
            int i3 = i2;
            while (i3 < zz0q.getCount() - 1) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) zz0q.get(i3));
                int i4 = i2;
                float fPow = 0.0f;
                while (i4 < i) {
                    fPow += (float) (Math.pow(fIntBitsToFloat, i4) * dArrZzZ2[i4][i2]);
                    i4++;
                    i2 = i2;
                    dArrZzZ2 = dArrZzZ2;
                }
                zz0q.set(i3, com.aspose.words.internal.zzZPY.zzG(fIntBitsToFloat, fPow));
                i3++;
                i2 = i2;
                dArrZzZ2 = dArrZzZ2;
            }
            int i5 = i2;
            dArrZzZ2 = zzZ(zz0q, i);
            d2 = d;
            d4 = dArrZzZ2[i5][i5];
        }
        int i6 = i2;
        double[][] dArr = dArrZzZ2;
        dArr[i6][i6] = d;
        return dArr;
    }

    private static double[][] zzY(com.aspose.words.internal.zz0Q zz0q, int i) {
        double[][] dArrZzY4 = zzY4(zz0q.getCount(), i);
        for (int i2 = 0; i2 < zz0q.getCount(); i2++) {
            for (int i3 = 0; i3 < i; i3++) {
                dArrZzY4[i2][i3] = Math.pow(Float.intBitsToFloat((int) zz0q.get(i2)), i3);
            }
        }
        return dArrZzY4;
    }

    private static double[][] zzY(double[][] dArr) {
        double[][] dArrZzKk = zzKk(dArr.length);
        for (int i = 0; i < dArr.length; i++) {
            double d = 0.0d;
            while (com.aspose.words.internal.zzAN.zzZD(d)) {
                double d2 = dArr[i][i];
                if (com.aspose.words.internal.zzAN.zzZD(d2)) {
                    for (double[] dArr2 : dArr) {
                        if (com.aspose.words.internal.zzAN.zzZD(dArr[i][i])) {
                            for (int i2 = 0; i2 < dArr.length; i2++) {
                                double[] dArr3 = dArr[i];
                                dArr3[i2] = dArr3[i2] + dArr2[i2];
                            }
                        }
                    }
                }
                d = d2;
            }
            for (int i3 = 0; i3 < dArr.length; i3++) {
                double[] dArr4 = dArr[i];
                dArr4[i3] = dArr4[i3] / d;
                double[] dArr5 = dArrZzKk[i];
                dArr5[i3] = dArr5[i3] / d;
            }
            for (int i4 = 0; i4 < dArr.length; i4++) {
                if (i4 != i) {
                    double d3 = dArr[i4][i] / dArr[i][i];
                    for (int i5 = 0; i5 < dArr[0].length; i5++) {
                        double[] dArr6 = dArr[i4];
                        dArr6[i5] = dArr6[i5] - (dArr[i][i5] * d3);
                        double[] dArr7 = dArrZzKk[i4];
                        dArr7[i5] = dArr7[i5] - (dArrZzKk[i][i5] * d3);
                    }
                }
            }
        }
        return dArrZzKk;
    }

    private static double[][] zzZ(com.aspose.words.internal.zz0Q zz0q, int i) {
        double[][] dArrZzY = zzY(zz0q, i);
        double[][] dArrZzO = zzO(zz0q);
        double[][] dArrZzZ = zzZ(dArrZzY);
        return zzZ(zzY(zzZ(dArrZzZ, dArrZzY)), zzZ(dArrZzZ, dArrZzO));
    }

    private static double[][] zzZ(double[][] dArr) {
        double[][] dArrZzY4 = zzY4(dArr[0].length, dArr.length);
        for (int i = 0; i < dArr.length; i++) {
            for (int i2 = 0; i2 < dArr[0].length; i2++) {
                dArrZzY4[i2][i] = dArr[i][i2];
            }
        }
        return dArrZzY4;
    }

    private static double[][] zzZ(double[][] dArr, double[][] dArr2) {
        double[][] dArrZzY4 = zzY4(dArr.length, dArr2[0].length);
        for (int i = 0; i < dArrZzY4.length; i++) {
            for (int i2 = 0; i2 < dArrZzY4[0].length; i2++) {
                for (int i3 = 0; i3 < dArr2.length; i3++) {
                    double[] dArr3 = dArrZzY4[i];
                    dArr3[i2] = (dArr[i][i3] * dArr2[i3][i2]) + dArr3[i2];
                }
            }
        }
        return dArrZzY4;
    }

    public final void zzZ(zzCQ zzcq) {
        this.zzZ9J.zzL(9, zzcq);
    }
}
