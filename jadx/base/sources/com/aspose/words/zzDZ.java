package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzDZ implements zzZCP {
    protected float zzZbA;
    private boolean zzZbt;
    private boolean zzZbu;
    protected boolean zzZbv;
    protected ChartAxis zzZbw;
    protected float zzZbx;
    protected float zzZby;
    protected float zzZbz;
    protected com.aspose.words.internal.zzZQ4 zzZgO;
    protected ChartAxis zzZgP;
    protected boolean zzZgQ;
    protected zzDI zzZyQ;

    public zzDZ(ChartAxis chartAxis, ChartAxis chartAxis2, zzDI zzdi, com.aspose.words.internal.zzZQ4 zzzq4, boolean z) {
        if (chartAxis.zz4l() != chartAxis2.zz4n()) {
            chartAxis.zzY(chartAxis2);
        }
        this.zzZyQ = zzdi;
        boolean zZz40 = chartAxis2.zz40();
        this.zzZbv = zZz40;
        this.zzZgP = zZz40 ? chartAxis : chartAxis2;
        this.zzZbw = zZz40 ? chartAxis2 : chartAxis;
        this.zzZgO = zzzq4;
        this.zzZgQ = z;
    }

    public static float zzZ(double d, double d2, ChartAxis chartAxis) throws Exception {
        if (chartAxis.zz3K()) {
            d = (float) (com.aspose.words.internal.zzZKQ.zzE(Math.max(d, 0.0d) + chartAxis.zz41().zzZOR(), chartAxis.getScaling().getLogBase()) - com.aspose.words.internal.zzZKQ.zzE(chartAxis.zz41().zzZOR(), chartAxis.getScaling().getLogBase()));
        }
        return (float) (d * d2);
    }

    @Override // com.aspose.words.zzZCP
    public final com.aspose.words.internal.zzZQ4 zz44() {
        return this.zzZgO;
    }

    @Override // com.aspose.words.zzZCP
    public final int[] zzJ(ChartSeries chartSeries) {
        boolean z = this.zzZbv;
        ChartAxis chartAxis = z ? this.zzZgP : this.zzZbw;
        ChartAxis chartAxis2 = z ? this.zzZbw : this.zzZgP;
        int valueCount = chartSeries.getValueCount();
        com.aspose.words.internal.zzDB zzdb = new com.aspose.words.internal.zzDB();
        int i = -1;
        int i2 = 0;
        for (int i3 = 0; i3 < valueCount; i3++) {
            zzCF zzcfZzNN = chartSeries.zzNN(i3);
            if (!zzZ(zzcfZzNN, zzcfZzNN == null ? null : chartSeries.zz2y().zzL0(zzcfZzNN.getIndex()), i, chartAxis, chartAxis2)) {
                if (i < 0) {
                    i = i3;
                }
                i2++;
            } else if (i >= 0 && i2 > 0) {
                zzdb.add(i);
                zzdb.add(i2);
                i = -1;
                i2 = 0;
            }
        }
        if (i >= 0 && i2 > 0) {
            zzdb.add(i);
            zzdb.add(i2);
        }
        return zzdb.toArray();
    }

    @Override // com.aspose.words.zzZCP
    public long[] zzK(ChartSeries chartSeries) throws Exception {
        long[] jArr = new long[chartSeries.getValueCount()];
        int i = 0;
        while (i < chartSeries.getValueCount()) {
            zzCF zzcfZzNN = chartSeries.zzNN(i);
            zzCF zzcfZzL0 = zzcfZzNN == null ? null : chartSeries.zz2y().zzL0(zzcfZzNN.getIndex());
            if (zzcfZzL0 != null && zzcfZzNN != null) {
                jArr[i] = ((Double.isNaN(zzcfZzNN.getValue()) || Double.isNaN(zzcfZzL0.getValue())) && i > 0) ? jArr[i - 1] : zzZ(zzcfZzNN.getValue(), zzcfZzL0.getValue(), true);
            }
            i++;
        }
        return jArr;
    }

    @Override // com.aspose.words.zzZCP
    public com.aspose.words.internal.zzP9 zzKG(int i) {
        return new com.aspose.words.internal.zzP9();
    }

    @Override // com.aspose.words.zzZCP
    public void zzU(float f, float f2, float f3, float f4) throws Exception {
        this.zzZbA = Math.max(this.zzZbA, f);
        this.zzZbz = Math.max(this.zzZbz, f2);
        this.zzZby = Math.max(this.zzZby, f3);
        this.zzZbx = Math.max(this.zzZbx, f4);
        if (this.zzZgQ) {
            if (com.aspose.words.internal.zzAN.zzf(this.zzZbz)) {
                float fZzZm = this.zzZgO.zzZm();
                float f5 = this.zzZbA;
                if (fZzZm < f5) {
                    this.zzZbz -= f5;
                }
            }
            if (com.aspose.words.internal.zzAN.zzf(this.zzZbx)) {
                float fZzZo = this.zzZgO.zzZo();
                float f6 = this.zzZby;
                if (fZzZo < f6) {
                    this.zzZbx -= f6;
                }
            }
        }
    }

    public abstract void zzX(zzCF zzcf, boolean z) throws Exception;

    public final void zzY(zzCF zzcf, boolean z) throws Exception {
        if ((z ? this.zzZbw : this.zzZgP).zz4c() && com.aspose.words.internal.zzZYD.zzXk(zzcf.getStringValue())) {
            zzX(zzcf, z);
        }
    }

    @Override // com.aspose.words.zzZCP
    public com.aspose.words.internal.zzP9 zzY6(int i, int i2) {
        return new com.aspose.words.internal.zzP9();
    }

    @Override // com.aspose.words.zzZCP
    public abstract long zzZ(double d, double d2, boolean z) throws Exception;

    @Override // com.aspose.words.zzZCP
    public final float zzZKA() {
        return this.zzZbA;
    }

    @Override // com.aspose.words.zzZCP
    public final float zzZKB() {
        return Math.max(this.zzZgO.getHeight() - (this.zzZby + this.zzZbx), 0.0f);
    }

    @Override // com.aspose.words.zzZCP
    public final float zzZKC() {
        return Math.max(this.zzZgO.getWidth() - (this.zzZbA + this.zzZbz), 0.0f);
    }

    @Override // com.aspose.words.zzZCP
    public com.aspose.words.internal.zzZQ4 zzZKD() {
        return new com.aspose.words.internal.zzZQ4(this.zzZbA, this.zzZby, zzZKC(), zzZKB());
    }

    public void zzZKE() throws Exception {
    }

    public abstract void zzZKF() throws Exception;

    public void zzZKG() throws Exception {
        if (this.zzZgQ) {
            float fZzZm = this.zzZgO.zzZm();
            float fZzZo = this.zzZgO.zzZo();
            float fIntBitsToFloat = Float.intBitsToFloat((int) this.zzZyQ.zzZIz()) - this.zzZgO.zzkw();
            float fZzYz = com.aspose.words.internal.zzZPW.zzYz(this.zzZyQ.zzZIz()) - this.zzZgO.zzZn();
            this.zzZbA = zzZ(this.zzZbA, fZzZm, false) ? 0.0f : this.zzZbA - fZzZm;
            this.zzZby = zzZ(this.zzZby, fZzZo, true) ? 0.0f : this.zzZby - fZzZo;
            this.zzZbz = zzZ(this.zzZbz, fIntBitsToFloat, false) ? 0.0f : this.zzZbz - fIntBitsToFloat;
            this.zzZbx = zzZ(this.zzZbx, fZzYz, true) ? 0.0f : this.zzZbx - fZzYz;
        }
    }

    public final void zzZKH() throws Exception {
        zzZKF();
        zzZKG();
    }

    public abstract void zzZKI() throws Exception;

    public abstract void zzZKJ() throws Exception;

    public void zzZKK() throws Exception {
    }

    @Override // com.aspose.words.zzZCP
    public final void zzZKL() throws Exception {
        if (this.zzZbt) {
            return;
        }
        zzZKJ();
        zzZKI();
        zzZKK();
        this.zzZbt = true;
    }

    public abstract com.aspose.words.internal.zzG zzZKM() throws Exception;

    public abstract com.aspose.words.internal.zzG zzZKN() throws Exception;

    public void zzZKO() throws Exception {
    }

    public void zzZKP() throws Exception {
    }

    @Override // com.aspose.words.zzZCP
    public void zzZKQ() throws Exception {
    }

    @Override // com.aspose.words.zzZCP
    public final void zzZKR() throws Exception {
        if (this.zzZbu) {
            return;
        }
        if (!this.zzZgP.getHidden()) {
            zzZKN();
        }
        if (!this.zzZbw.getHidden()) {
            zzZKM();
        }
        zzZKP();
        zzZKO();
        this.zzZbu = true;
    }

    @Override // com.aspose.words.zzZCP
    public final float zzZKs() {
        return 0.0f;
    }

    @Override // com.aspose.words.zzZCP
    public final float zzZKt() {
        throw new UnsupportedOperationException("Getting PieHorizontalRadius is not supported for this type of plane.");
    }

    @Override // com.aspose.words.zzZCP
    public final float zzZKu() {
        throw new UnsupportedOperationException("Getting PieVerticalRadius is not supported for this type of plane.");
    }

    public final float zzZKv() throws Exception {
        return this.zzZgP.zz3P() / 2.0f;
    }

    public final float zzZKw() {
        return this.zzZyQ.zzZIC().zzZdM * 1.25f;
    }

    @Override // com.aspose.words.zzZCP
    public final float zzZKx() {
        return this.zzZbx;
    }

    @Override // com.aspose.words.zzZCP
    public final float zzZKy() {
        return this.zzZby;
    }

    @Override // com.aspose.words.zzZCP
    public final float zzZKz() {
        return this.zzZbz;
    }

    @Override // com.aspose.words.zzZCP
    public final zzC9 zzZLQ() {
        return this.zzZyQ.getChartSpace().zzZHX().zzZLQ();
    }

    public final boolean zzZQD() {
        return this.zzZgQ;
    }

    @Override // com.aspose.words.zzZCP
    public final long zzt(double d, double d2) throws Exception {
        return zzZ(d, d2, true);
    }

    private void zzY(long[] jArr, zzD9 zzd9, boolean z) throws Exception {
        zzFI zzfiZzZMD;
        if (z) {
            zzfiZzZMD = this.zzZyQ.zzZIC().zzZMF();
        } else {
            zzfiZzZMD = this.zzZyQ.zzZIC().zzZMD();
        }
        com.aspose.words.internal.zzZQ4 zzzq4ZzZPK = zzfiZzZMD.zzZMW().zzZPK();
        zzfiZzZMD.zzZMW().zzZK(this.zzZgO);
        com.aspose.words.internal.zzZG zzzgZzZ = com.aspose.words.internal.zzZG.zzZ(jArr, false, false);
        zzzgZzZ.zzX(zzDG.zzZ(zzd9, zzfiZzZMD, 0));
        zzDG.zzZ(zzzgZzZ, this.zzZyQ.zzKy(0), zzd9, zzfiZzZMD);
        zzfiZzZMD.zzZMW().zzZK(zzzq4ZzZPK);
    }

    private boolean zzZ(float f, float f2, boolean z) throws Exception {
        return com.aspose.words.internal.zzAN.zzS(f, z ? zzZKv() : zzZKw()) || f < f2;
    }

    public final void zzZ(long j, long j2, com.aspose.words.internal.zzOU zzou, com.aspose.words.internal.zzG zzg, zzD9 zzd9) throws Exception {
        zzDG.zzZ(com.aspose.words.internal.zzZG.zzZ(j, j2, zzou), zzg, zzd9, this.zzZyQ.zzZIC().zzZMP());
    }

    public final void zzZ(long j, long j2, zzD9 zzd9, boolean z) throws Exception {
        zzY(new long[]{j, j2}, zzd9, z);
    }

    public final void zzZ(long[] jArr, zzD9 zzd9, boolean z) throws Exception {
        zzY(jArr, zzd9, z);
    }

    private static boolean zzZ(zzCF zzcf, zzCF zzcf2, int i, ChartAxis chartAxis, ChartAxis chartAxis2) {
        if (zzcf == null || zzcf2 == null) {
            return true;
        }
        return (i < 0 && (Double.isNaN(zzcf.getValue()) || Double.isNaN(zzcf2.getValue()))) || zzDG.zzZ(chartAxis, zzcf.getValue()) || zzDG.zzZ(chartAxis2, zzcf2.getValue());
    }
}
