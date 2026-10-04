package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzDY extends zzDZ {
    private zzHC zzZbm;
    private boolean zzZbn;
    private int zzZbo;
    private zzFJ zzZbp;
    private float zzZbq;
    private long zzZbr;
    private long zzZbs;
    protected zzEY zzZy4;
    protected zzGK zzZyX;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public zzDY(zzEY zzey, zzGK zzgk, zzDI zzdi, com.aspose.words.internal.zzZQ4 zzzq4, boolean z) throws Exception {
        zzZCR zzzcr = (zzZCR) zzgk;
        super(zzzcr.zzZPt(), zzzcr.zzZPs(), zzdi, zzzq4, z);
        this.zzZbs = 0L;
        this.zzZbr = 0L;
        this.zzZbo = 22;
        this.zzZy4 = zzey;
        this.zzZyX = zzgk;
        this.zzZbn = this.zzZgP.zzaR().zzZHh().zzLh(8);
        this.zzZbm = new zzHC(this.zzZyQ, z, this.zzZgP, this.zzZbw.zz41().zzZOR(), zzgk, zzzq4);
    }

    private double getLeft() throws Exception {
        double dZzZON;
        double dZzZOR;
        if (this.zzZgP.getReverseOrder()) {
            dZzZON = this.zzZgP.zz41().zzZOS();
            dZzZOR = this.zzZgP.zz41().zzZON();
        } else {
            dZzZON = this.zzZgP.zz41().zzZON();
            dZzZOR = this.zzZgP.zz41().zzZOR();
        }
        return Math.abs(dZzZON - dZzZOR);
    }

    private double getRight() throws Exception {
        double dZzZOS;
        double dZzZON;
        if (this.zzZgP.getReverseOrder()) {
            dZzZOS = this.zzZgP.zz41().zzZON();
            dZzZON = this.zzZgP.zz41().zzZOR();
        } else {
            dZzZOS = this.zzZgP.zz41().zzZOS();
            dZzZON = this.zzZgP.zz41().zzZON();
        }
        return Math.abs(dZzZOS - dZzZON);
    }

    private ChartAxis zzXK(boolean z) {
        return z ? this.zzZbw : this.zzZgP;
    }

    private float zzXL(boolean z) throws Exception {
        return this.zzZbm.zzZ(z, this.zzZbq, zzZJZ(), zzZKC());
    }

    private float zzXM(boolean z) throws Exception {
        if (com.aspose.words.internal.zzAN.zzL(Math.abs(this.zzZgP.zz3M()), 90.0d) || this.zzZgP.zzZr().zzOZ()) {
            return 0.0f;
        }
        float lineSpacingPoints = this.zzZgP.zzZr().getLineSpacingPoints() - this.zzZgP.zzZr().getAscentPoints();
        if (this.zzZbm.zzZQr()) {
            if (!z && this.zzZgP.zz3W()) {
                return 0.0f;
            }
        } else if (!z) {
            return this.zzZgP.zzZr().zzPe();
        }
        return lineSpacingPoints;
    }

    private void zzXN(boolean z) throws Exception {
        ChartAxis chartAxisZzXK = zzXK(z);
        int i = chartAxisZzXK.zz41().zzZOV()[0].getValueType() == 0 ? 1 : 0;
        int iZzZK0 = z ? zzZK0() : zzZJX();
        int i2 = 0;
        for (int i3 = 0; i3 < chartAxisZzXK.zz41().zzZOV().length; i3++) {
            zzCF zzcf = chartAxisZzXK.zz41().zzZOV()[i3];
            int i4 = (!chartAxisZzXK.isDate() || z) ? i3 : i2;
            if (com.aspose.words.internal.zzZYD.zzXk(zzcf.getStringValue())) {
                if (!zzm(i4, i, iZzZK0) || (z && this.zzZy4.zz45().zzZQD())) {
                    zzY(zzcf, z);
                }
                i2++;
            }
        }
    }

    private long zzY(double d, double d2, boolean z) throws Exception {
        if (z && this.zzZgP.zz3Z()) {
            d = this.zzZgP.zz41().zzYG(d);
        }
        float fZzYj = this.zzZgP.isDate() ? zzYj(d) : zzYh(d - this.zzZgP.zz41().zzZOR());
        if (this.zzZgP.getReverseOrder()) {
            fZzYj = zzZKC() - fZzYj;
        }
        float f = fZzYj + this.zzZbA;
        float fZzYg = zzYg(d2 - this.zzZbw.zz41().zzZOR());
        if (!this.zzZbw.getReverseOrder()) {
            fZzYg = zzZKB() - fZzYg;
        }
        return com.aspose.words.internal.zzZPY.zzG(f, fZzYg + this.zzZby);
    }

    private float zzYg(double d) throws Exception {
        return zzDZ.zzZ(d, zzZK6(), this.zzZbw);
    }

    private float zzYh(double d) throws Exception {
        return zzDZ.zzZ(d, zzZK5(), this.zzZgP);
    }

    private float zzYi(double d) {
        com.aspose.words.internal.zzZQ9 zzzq9;
        com.aspose.words.internal.zzZQ9 zzzq9ZzZj;
        com.aspose.words.internal.zzZQ9 zzzq9ZzkT = com.aspose.words.internal.zzZQ9.zzZg(d).zzkT();
        if (this.zzZgP.zz41().getBaseTimeUnit() == 3) {
            zzzq9 = new com.aspose.words.internal.zzZQ9(zzzq9ZzkT.getYear(), 1, 1);
            zzzq9ZzZj = zzzq9.zzRo(1).zzZj(-1.0d);
        } else {
            zzzq9 = new com.aspose.words.internal.zzZQ9(zzzq9ZzkT.getYear(), zzzq9ZzkT.getMonth(), 1);
            zzzq9ZzZj = zzzq9.zzRp(1).zzZj(-1.0d);
        }
        float fZzkM = (float) zzzq9.zzkM();
        float fZzkM2 = ((float) zzzq9ZzZj.zzkM()) - fZzkM;
        return (float) (com.aspose.words.internal.zzAN.zzf(fZzkM2) ? 0.0d : (d - ((double) fZzkM)) / ((double) fZzkM2));
    }

    private float zzYj(double d) throws Exception {
        int month;
        if (this.zzZgP.zz41().getBaseTimeUnit() == 1 || this.zzZgP.zz41().getBaseTimeUnit() == 0) {
            return zzYh(d - this.zzZgP.zz41().zzZOR());
        }
        float fZzZKC = zzZKC() / (this.zzZgP.zz41().zzZOV().length - 1);
        com.aspose.words.internal.zzZQ9 zzzq9ZzkT = com.aspose.words.internal.zzZQ9.zzZg(this.zzZgP.zz41().zzZOR()).zzkT();
        com.aspose.words.internal.zzZQ9 zzzq9ZzkT2 = com.aspose.words.internal.zzZQ9.zzZg(d).zzkT();
        if (this.zzZgP.zz41().getBaseTimeUnit() == 3) {
            month = zzzq9ZzkT2.getYear() - zzzq9ZzkT.getYear();
        } else {
            month = (zzzq9ZzkT2.getMonth() - zzzq9ZzkT.getMonth()) + ((zzzq9ZzkT2.getYear() - zzzq9ZzkT.getYear()) * 12);
        }
        return ((month + zzYi(d)) - zzYi(this.zzZgP.zz41().zzZOR())) * fZzZKC;
    }

    private long zzZJT() throws Exception {
        if (com.aspose.words.internal.zzZPW.zzYF(this.zzZbs)) {
            this.zzZbs = zzZe(zzZK7());
        }
        return this.zzZbs;
    }

    private float zzZJU() throws Exception {
        if (this.zzZbw.zz3X()) {
            return zzZK2() / 2.0f;
        }
        return 0.0f;
    }

    private float zzZJV() throws Exception {
        if (this.zzZgP.zz3X()) {
            return zzZJZ() / 2.0f;
        }
        return 0.0f;
    }

    private int zzZJW() throws Exception {
        return this.zzZbm.zzZ(((zzZQD() ? zz44().getWidth() : zzZKC()) + (this.zzZgP.zz3X() ? 0.0f : Float.intBitsToFloat((int) zzZJS()))) / this.zzZgP.zz41().zzZOO(), zzZJY(), zzZJS());
    }

    private int zzZJX() throws Exception {
        if (!this.zzZgP.getTickLabels().isAutoSpacing()) {
            return this.zzZgP.getTickLabels().getSpacing();
        }
        if (this.zzZgP.getMajorUnitIsAuto()) {
            return zzZJW();
        }
        return 1;
    }

    private float zzZJY() throws Exception {
        return zzZKC() / (this.zzZgP.zz41().zzZOO() - 1);
    }

    private float zzZJZ() throws Exception {
        return zzZKC() / (this.zzZgP.zz41().zzZOV().length - 1);
    }

    private int zzZK0() throws Exception {
        return zzDG.zzt(this.zzZy4.zz45().getDataTable() != null ? zzZK1() * 2.0f : zzZK1(), (com.aspose.words.internal.zzAN.zzZD(this.zzZgP.zz3M()) && com.aspose.words.internal.zzAN.zzR(com.aspose.words.internal.zzZPW.zzYz(this.zzZbr), this.zzZgP.zzZr().getLineSpacingPoints())) ? this.zzZgP.zzZr().getLineSpacingPoints() : this.zzZgP.zzZr().getAscentPoints());
    }

    private float zzZK1() throws Exception {
        return zzZKB() / (this.zzZbw.zz41().zzZOO() - 1);
    }

    private float zzZK2() throws Exception {
        return zzZKB() / (this.zzZbw.zz41().zzZOV().length - 1);
    }

    private double zzZK3() throws Exception {
        return this.zzZbw.zz41().zzZOT() - zzZK4();
    }

    private double zzZK4() throws Exception {
        double dZzZON;
        double dZzZOR;
        if (this.zzZbw.getReverseOrder()) {
            dZzZON = this.zzZbw.zz41().zzZOS();
            dZzZOR = this.zzZbw.zz41().zzZON();
        } else {
            dZzZON = this.zzZbw.zz41().zzZON();
            dZzZOR = this.zzZbw.zz41().zzZOR();
        }
        return Math.abs(dZzZON - dZzZOR);
    }

    private double zzZK5() throws Exception {
        return ((double) zzZKC()) / this.zzZgP.zz41().zzZOT();
    }

    private double zzZK6() throws Exception {
        return ((double) zzZKB()) / this.zzZbw.zz41().zzZOT();
    }

    private float zzZK7() throws Exception {
        if (!zzZQD()) {
            return this.zzZyQ.zzZIy();
        }
        if (!this.zzZbw.zz3W()) {
            return Float.intBitsToFloat((int) this.zzZyQ.zzZIz());
        }
        return zzZK2() > zzDG.zzS(this.zzZbw.zzaR(), this.zzZyQ) * 2.0f ? zz44().zzZm() + com.aspose.words.internal.zzSA.zzYB(4) + this.zzZbw.zzaR().zzZHh().zzZtD() + this.zzZbw.zzaR().zzZHh().zzZtE() : this.zzZyQ.zzZIy();
    }

    private boolean zzZKd() {
        return this.zzZy4.zz45().getDataTable() == null;
    }

    private float zzZKf() throws Exception {
        int iZzZOO = this.zzZbm.zzZQw() ? this.zzZgP.zz41().zzZOO() : this.zzZgP.zz41().zzZOP() - 1;
        if (zzZJX() > 1) {
            iZzZOO = (int) com.aspose.words.internal.zzZKQ.zzZa(((double) (iZzZOO + 1)) / ((double) zzZJX()));
        } else if (!this.zzZgP.zz3X()) {
            iZzZOO++;
        }
        return ((this.zzZgQ || !this.zzZgP.zz3Z()) ? this.zzZgO.getWidth() : zzZKC()) / (iZzZOO == 0 ? 1.0f : iZzZOO);
    }

    private void zzZKg() throws Exception {
        if ((zzZQD() && !this.zzZyX.zz3R()) || this.zzZy4.zz45().getDataTable() != null) {
            return;
        }
        while (true) {
            float fZzXL = zzXL(true);
            float fZzXL2 = zzXL(false);
            if (com.aspose.words.internal.zzAN.zzP(this.zzZbA, fZzXL) && com.aspose.words.internal.zzAN.zzP(this.zzZbz, fZzXL2)) {
                return;
            }
            this.zzZbA = Math.max(this.zzZbA, fZzXL);
            this.zzZbz = Math.max(this.zzZbz, fZzXL2);
        }
    }

    private void zzZKh() {
        if (this.zzZbn) {
            return;
        }
        this.zzZgP.zzaR().zzZHh().zzX(null);
    }

    private void zzZKi() throws Exception {
        zzZKh();
        this.zzZbq = this.zzZbm.zzV(zzZKf(), zzZKC(), zzZKB(), zzZJX());
        zzZKg();
    }

    private void zzZKj() throws Exception {
        if (this.zzZy4.zz45().getDataTable() == null) {
            return;
        }
        boolean z = this.zzZgP.isDate() || !this.zzZbv;
        zzFJ zzfj = new zzFJ(this.zzZy4.zz45(), this.zzZbv ? this.zzZgP : this.zzZbw, this.zzZyQ, this.zzZgO, this.zzZgQ);
        this.zzZbp = zzfj;
        float fMax = Math.max(this.zzZbA, ((z ? 1.0f : 2.0f) * 76200.0f) + zzfj.zzZN1());
        this.zzZbA = fMax;
        this.zzZbp.zzZ(this.zzZbv, this.zzZbz, fMax);
        float height = this.zzZbp.getHeight();
        this.zzZbx = height;
        if (z) {
            float fZz3N = this.zzZgP.zz3N() + this.zzZgP.zz3P() + 152400.0f + height;
            this.zzZbx = fZz3N;
            this.zzZbx = fZz3N + (this.zzZbv ? 0.0f : com.aspose.words.internal.zzSA.zzp(2.5d));
        }
    }

    private void zzZKm() throws Exception {
        this.zzZby = Math.max(this.zzZby, zzZKv());
        this.zzZbx = Math.max(this.zzZbx, zzZKv());
    }

    private void zzZKn() {
        this.zzZbA = Math.max(this.zzZbA, zzZKw());
        this.zzZbz = Math.max(this.zzZbz, zzZKw());
    }

    private void zzZKo() throws Exception {
        zzZKn();
        zzZKm();
    }

    private void zzZKp() throws Exception {
        if (this.zzZgP.zz3T()) {
            if (this.zzZgP.zz3W()) {
                this.zzZbx = zzZ(this.zzZbx, this.zzZgO.getHeight(), zzZK4(), this.zzZbw.zz41().zzZOT(), zzZKv());
            } else {
                this.zzZby = zzZ(this.zzZby, this.zzZgO.getHeight(), zzZK3(), this.zzZbw.zz41().zzZOT(), zzZKv());
            }
        }
        if (this.zzZbw.zz3T()) {
            if (this.zzZbw.zz3W()) {
                this.zzZbA = zzZ(this.zzZbA, this.zzZgO.getWidth(), getLeft(), this.zzZgP.zz41().zzZOT(), zzXL(true));
            } else {
                this.zzZbz = zzZ(this.zzZbz, this.zzZgO.getWidth(), getRight(), this.zzZgP.zz41().zzZOT(), zzXL(false));
            }
        }
    }

    private long zzZe(float f) throws Exception {
        return this.zzZbm.zzZ(f, false, this.zzZbw, zzZKC());
    }

    private long zzZf(float f) throws Exception {
        return this.zzZbm.zzZ(f, false, this.zzZgP, zzZKC());
    }

    private float zzZg(float f) throws Exception {
        if ((this.zzZyX.zz3R() && this.zzZbv) || this.zzZyX.zzZPa()) {
            return 0.0f;
        }
        return (com.aspose.words.internal.zzAN.zzf(f) ? 0.0f : 17145.0f) + zzXM(true);
    }

    private static boolean zzm(int i, int i2, int i3) {
        return i3 != 0 && (i - i2) % i3 > 0;
    }

    @Override // com.aspose.words.zzDZ, com.aspose.words.zzZCP
    public final void zzU(float f, float f2, float f3, float f4) throws Exception {
        super.zzU(f, f2, f3, f4);
        if (this.zzZyX.zz3R() || zzZQD() || this.zzZy4.zz45().zzZJa() || this.zzZy4.zz45().zzZJf().size() <= 1) {
            return;
        }
        zzZKi();
    }

    @Override // com.aspose.words.zzDZ
    public final void zzX(zzCF zzcf, boolean z) throws Exception {
        double dZzZOM = z ? this.zzZgP.zz41().zzZOM() : zzcf.getValue();
        double value = z ? zzcf.getValue() : this.zzZbw.zz41().zzZOM();
        ChartAxis chartAxisZzXK = zzXK(z);
        long jZzY = zzY(dZzZOM, value, false);
        zzCF zzd4 = (chartAxisZzXK.zz40() || ((zzE7) com.aspose.words.internal.zzZKW.zzZ(zzcf, zzE7.class)) == null || !chartAxisZzXK.getDisplayUnit().isDefined()) ? zzcf : new zzD4(zzcf.getIndex(), zzE7.zzZ(zzcf.getValue(), chartAxisZzXK.getDisplayUnit().zzaX(), chartAxisZzXK.getFormatCode()));
        int i = z ? 22 : this.zzZbo;
        zzCK zzckZzZ = this.zzZbm.zzZ(zzd4, z ? zzZK7() : this.zzZbq, this.zzZbm.zzZQv() && !z, z ? Math.max(zzZK2(), zzDG.zzU(chartAxisZzXK.zzaR(), this.zzZyQ)) : 0.0f, zzZKC(), i, chartAxisZzXK);
        long jZzZ = z ? zzZ(zzckZzZ, jZzY) : zzY(zzckZzZ, jZzY);
        com.aspose.words.internal.zzG zzgZzKy = z ? this.zzZyQ.zzKy(22) : this.zzZyQ.zzKy(23);
        zzckZzZ.zzZGn().zzZO().zzY(Float.intBitsToFloat((int) jZzZ), com.aspose.words.internal.zzZPY.zzYC(jZzZ), 0);
        zzgZzKy.zzX((com.aspose.words.internal.zzZL) zzckZzZ.zzZGn());
    }

    @Override // com.aspose.words.zzDZ, com.aspose.words.zzZCP
    public final long zzZ(double d, double d2, boolean z) throws Exception {
        boolean z2 = this.zzZbv;
        double dZzZON = z2 ? d : d2;
        if (z2) {
            d = d2;
        }
        if (Double.isNaN(dZzZON)) {
            dZzZON = this.zzZgP.zz41().zzZON();
        }
        double d3 = dZzZON;
        if (Double.isNaN(d)) {
            d = this.zzZbw.zz41().zzZON();
        }
        long jZzY = zzY(d3, d, z);
        return com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) jZzY) + zzZJV(), com.aspose.words.internal.zzZPY.zzYC(jZzY) - zzZJU());
    }

    public final long zzZJS() throws Exception {
        if (com.aspose.words.internal.zzZPW.zzYF(this.zzZbr)) {
            this.zzZbr = zzZf(zzZKC());
        }
        return this.zzZbr;
    }

    @Override // com.aspose.words.zzZCP
    public float zzZK8() {
        throw new UnsupportedOperationException("Z axis is not available for 2D Cartesian plane.");
    }

    @Override // com.aspose.words.zzZCP
    public float zzZK9() {
        throw new UnsupportedOperationException("Z axis is not available for 2D Cartesian plane.");
    }

    @Override // com.aspose.words.zzDZ
    public final void zzZKF() throws Exception {
        zzZKl();
        zzZKk();
        zzZKE();
        zzZKp();
        zzZKj();
        zzZKo();
    }

    @Override // com.aspose.words.zzDZ
    public final void zzZKI() throws Exception {
        long jZzY = zzY(this.zzZgP.zz41().zzZOR(), this.zzZbw.zz41().zzZON(), false);
        long jZzY2 = zzY(this.zzZgP.zz41().zzZOS(), this.zzZbw.zz41().zzZON(), false);
        if (this.zzZbw.zz4i() != null) {
            zzZ(jZzY, jZzY2, true, false);
        }
        if (this.zzZbw.zz4j() != null) {
            zzZ(jZzY, jZzY2, true, true);
        }
    }

    @Override // com.aspose.words.zzDZ
    public final void zzZKJ() throws Exception {
        long jZzY = zzY(this.zzZgP.zz41().zzZON(), this.zzZbw.zz41().zzZOR(), false);
        long jZzY2 = zzY(this.zzZgP.zz41().zzZON(), this.zzZbw.zz41().zzZOS(), false);
        if (this.zzZgP.zz4i() != null) {
            zzZ(jZzY, jZzY2, false, false);
        }
        if (this.zzZgP.zz4j() != null) {
            zzZ(jZzY, jZzY2, false, true);
        }
    }

    @Override // com.aspose.words.zzDZ
    public com.aspose.words.internal.zzG zzZKM() throws Exception {
        long jZzY = zzY(this.zzZgP.zz41().zzZON(), this.zzZbw.zz41().zzZOR(), false);
        long jZzY2 = zzY(this.zzZgP.zz41().zzZON(), this.zzZbw.zz41().zzZOS(), false);
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        this.zzZyQ.zzKy(9).zzX((com.aspose.words.internal.zzZL) zzg);
        zzZ(jZzY, jZzY2, this.zzZbw.zzZ2(), zzg, this.zzZyX.zz3R() ? new zzD9() : this.zzZbw.zzaQ());
        if (this.zzZbw.getMajorTickMark() != 3) {
            zzZ(true, zzg, true);
        }
        if (this.zzZbw.getMinorTickMark() != 3) {
            zzZ(false, zzg, true);
        }
        zzXN(true);
        return zzg;
    }

    @Override // com.aspose.words.zzDZ
    public com.aspose.words.internal.zzG zzZKN() throws Exception {
        long jZzY = zzY(this.zzZgP.zz41().zzZOR(), this.zzZbw.zz41().zzZON(), false);
        long jZzY2 = zzY(this.zzZgP.zz41().zzZOS(), this.zzZbw.zz41().zzZON(), false);
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        this.zzZyQ.zzKy(11).zzX((com.aspose.words.internal.zzZL) zzg);
        zzZ(jZzY, jZzY2, this.zzZgP.zzZ2(), zzg, this.zzZyX.zz3R() ? new zzD9() : this.zzZgP.zzaQ());
        if (this.zzZbp == null || !this.zzZbv || this.zzZgP.isDate()) {
            if (this.zzZgP.getMajorTickMark() != 3) {
                zzZ(true, zzg, false);
            }
            if (this.zzZgP.getMinorTickMark() != 3) {
                zzZ(false, zzg, false);
            }
            if (this.zzZgP.zz4c()) {
                zzXN(false);
                zzZKh();
                return zzg;
            }
        }
        return zzg;
    }

    @Override // com.aspose.words.zzDZ
    public void zzZKO() throws Exception {
        if (this.zzZbp == null) {
            return;
        }
        com.aspose.words.internal.zzG zzgZzKy = this.zzZyQ.zzKy(12);
        zzgZzKy.clear();
        zzgZzKy.zzX((com.aspose.words.internal.zzZL) zzZKq());
    }

    @Override // com.aspose.words.zzZCP
    public final zzCF[] zzZKa() throws Exception {
        return this.zzZbw.zz41().zzZOV();
    }

    @Override // com.aspose.words.zzZCP
    public final int zzZKb() {
        return this.zzZbw.getScaling().getOrientation();
    }

    @Override // com.aspose.words.zzZCP
    public final int zzZKc() {
        return 1;
    }

    public final com.aspose.words.internal.zzZQ4 zzZKe() throws Exception {
        if (!zzZKd()) {
            return com.aspose.words.internal.zzZQ4.zz2T;
        }
        double dZzZQQ = this.zzZgP.zzaR().zzZHh().zzZCC().zzZQQ();
        long jZzY = this.zzZbm.zzY(true, this.zzZbq);
        long jZzY2 = this.zzZbm.zzY(false, this.zzZbq);
        int i = (int) jZzY;
        float fZzZo = this.zzZbm.zzZo(Float.intBitsToFloat(i));
        boolean z = this.zzZy4.zz45().zzZJf().size() > 1 && this.zzZbw.zz3U() == 2;
        float fZzZ = zzZ(Float.intBitsToFloat(i), dZzZQQ);
        if (!z) {
            this.zzZyQ.zzZ4(fZzZ);
        }
        float fZzZ2 = (z || (!this.zzZgP.getHidden() && this.zzZgP.zz4c())) ? zzZ(Float.intBitsToFloat((int) jZzY2), fZzZ, dZzZQQ) : 0.0f;
        float fZzkw = (zz44().zzkw() + fZzZ2) - Float.intBitsToFloat((int) this.zzZyQ.zzZIz());
        if (fZzZ < zz44().getX() && fZzkw < 0.0f && (!this.zzZgP.zz3I().zzZP3() || z)) {
            return com.aspose.words.internal.zzZQ4.zz2T;
        }
        float fMax = Math.max(Math.max(z ? Math.max(zz44().getX() - fZzkw, this.zzZyQ.zzZIs()) : Math.min((Float.intBitsToFloat((int) this.zzZyQ.zzZIz()) - fZzZ2) - zz44().getWidth(), zz44().getX()), fZzZo), fZzZ);
        float fZzYz = (com.aspose.words.internal.zzZPW.zzYz(this.zzZyQ.zzZIz()) - zz44().zzZn()) - ((!this.zzZgP.getHidden() && this.zzZgP.zz3V() && this.zzZgP.zz3W()) ? this.zzZgP.zz3N() + com.aspose.words.internal.zzZPW.zzYz(jZzY) : 0.0f);
        float height = zz44().getHeight() + (fZzYz < 0.0f ? fZzYz : 0.0f);
        if (fZzZ >= zz44().getX() || fZzkw >= 0.0f || fZzYz <= 0.0f) {
            return new com.aspose.words.internal.zzZQ4(fMax, zz44().getY(), (zz44().getWidth() + fMax) + fZzZ2 > Float.intBitsToFloat((int) this.zzZyQ.zzZIz()) ? (Float.intBitsToFloat((int) this.zzZyQ.zzZIz()) - fZzZ2) - fMax : zz44().getWidth(), height);
        }
        return com.aspose.words.internal.zzZQ4.zz2T;
    }

    public void zzZKk() throws Exception {
        zzZKi();
        if (this.zzZgP.getHidden() || !this.zzZgP.zz4c()) {
            return;
        }
        long jZzZ = this.zzZbm.zzZ(this.zzZbq, this.zzZbm.zzZQw(), this.zzZgP, zzZKC());
        this.zzZbr = jZzZ;
        float fZz3N = this.zzZgP.zz3N() + com.aspose.words.internal.zzZPW.zzYz(jZzZ);
        this.zzZby = this.zzZgP.zz3W() ? zzZKv() : fZz3N;
        this.zzZbx = this.zzZgP.zz3W() ? fZz3N + zzZg(com.aspose.words.internal.zzZPW.zzYz(this.zzZbr)) : zzZKv();
    }

    public void zzZKl() throws Exception {
        if (!this.zzZbw.getHidden() && this.zzZbw.zz4c()) {
            float fZz3N = this.zzZbw.zz3N() + Float.intBitsToFloat((int) zzZJT());
            if (zzZQD()) {
                boolean z = false;
                boolean z2 = this.zzZbw.zz40() && this.zzZbw.zz4m() == 2;
                if (this.zzZbw.zz40() && this.zzZbw.zz4m() == 1) {
                    z = true;
                }
                float fZzZm = fZz3N - zz44().zzZm();
                float fIntBitsToFloat = (fZz3N - Float.intBitsToFloat((int) this.zzZyQ.zzZIz())) - zz44().zzkw();
                if (fZzZm > 0.0f && z && this.zzZbw.zz3W()) {
                    this.zzZbA = fZzZm;
                }
                if (fIntBitsToFloat > 0.0f && z2 && !this.zzZbw.zz3W()) {
                    this.zzZbz = fIntBitsToFloat;
                }
            } else {
                this.zzZbA = this.zzZbw.zz3W() ? fZz3N : zzZKw();
                if (this.zzZbw.zz3W()) {
                    fZz3N = zzZKw();
                }
                this.zzZbz = fZz3N;
            }
        }
        zzZKn();
    }

    public final com.aspose.words.internal.zzG zzZKq() throws Exception {
        return this.zzZbp.zzZ(this.zzZbA, this.zzZbz, this.zzZbx, this.zzZbv, this.zzZgP.zz3O() + this.zzZgP.zz3N() + com.aspose.words.internal.zzZPW.zzYz(zzZJS()));
    }

    @Override // com.aspose.words.zzZCP
    public final long zzZKr() throws Exception {
        return zzY(this.zzZgP.zz41().zzZON(), this.zzZbw.zz41().zzZON(), false);
    }

    @Override // com.aspose.words.zzZCP
    public final float zzl(int i, int i2, int i3) throws Exception {
        return (this.zzZbv ? zzZJZ() : zzZK2()) / (((i2 / 100.0f) + i) - ((i3 / 100.0f) * (i - 1)));
    }

    @Override // com.aspose.words.zzZCP
    public void zzra() throws Exception {
        zzZKH();
    }

    public final long zzs(double d, double d2) throws Exception {
        return zzY(d, d2, false);
    }

    private void zzZ(long j, long j2, boolean z, boolean z2) throws Exception {
        zzD9 zzd9;
        float fIntBitsToFloat;
        float fZzYC;
        float fIntBitsToFloat2;
        float fZzYC2;
        zzDY zzdy = this;
        ChartAxis chartAxis = z ? zzdy.zzZbw : zzdy.zzZgP;
        zzGG zzggZz41 = chartAxis.zz41();
        zzCF[] zzcfArrZzZOV = z2 ? zzggZz41.zzZOV() : zzggZz41.zzZOU();
        zzD9 zzd9ZzaQ = (z2 ? chartAxis.zz4j() : chartAxis.zz4i()).zzaQ();
        int i = 0;
        while (i < zzcfArrZzZOV.length) {
            zzCF zzcf = zzcfArrZzZOV[i];
            if (!zzcf.isVisible() || zzm(i, 0, chartAxis.getTickMarkSpacing())) {
                zzd9 = zzd9ZzaQ;
            } else {
                long jZzY = zzdy.zzY(z ? zzdy.zzZgP.zz41().zzZON() : zzcf.getValue(), z ? zzcf.getValue() : zzdy.zzZbw.zz41().zzZON(), false);
                if (z) {
                    fIntBitsToFloat = Float.intBitsToFloat((int) j);
                    fZzYC = com.aspose.words.internal.zzZPY.zzYC(jZzY);
                } else {
                    fIntBitsToFloat = Float.intBitsToFloat((int) jZzY);
                    fZzYC = com.aspose.words.internal.zzZPY.zzYC(j);
                }
                long jZzG = com.aspose.words.internal.zzZPY.zzG(fIntBitsToFloat, fZzYC);
                if (z) {
                    fIntBitsToFloat2 = Float.intBitsToFloat((int) j2);
                    fZzYC2 = com.aspose.words.internal.zzZPY.zzYC(jZzY);
                } else {
                    fIntBitsToFloat2 = Float.intBitsToFloat((int) jZzY);
                    fZzYC2 = com.aspose.words.internal.zzZPY.zzYC(j2);
                }
                zzd9 = zzd9ZzaQ;
                zzZ(jZzG, com.aspose.words.internal.zzZPY.zzG(fIntBitsToFloat2, fZzYC2), zzd9, z2, chartAxis.zz40());
            }
            i++;
            zzdy = this;
            zzd9ZzaQ = zzd9;
        }
    }

    private float zzY(float f, float f2, double d) throws Exception {
        float width;
        if (com.aspose.words.internal.zzAN.zzL(Math.abs(d), 90.0d)) {
            return 0.0f;
        }
        if (this.zzZgP.zz41().zzZOP() == this.zzZgP.zz41().zzZOV().length) {
            if (com.aspose.words.internal.zzAN.zzZD(d) && this.zzZbm.zzZQt()) {
                float fMax = Math.max(zz44().getX(), f2);
                if (zz44().getWidth() + fMax > Float.intBitsToFloat((int) this.zzZyQ.zzZIz())) {
                    width = Float.intBitsToFloat((int) this.zzZyQ.zzZIz()) - fMax;
                } else {
                    width = zz44().getWidth();
                }
                return Math.max(0.0f, (((width / this.zzZgP.zz41().zzZOO()) - f) * (-0.4818f)) + 54700.0f);
            }
            if (d >= 0.0d) {
                return 0.0f;
            }
            return Math.max(0.0f, (((zzDG.zzX(this.zzZgP.zzaR(), this.zzZyQ) * ((float) Math.cos(com.aspose.words.internal.zzAN.zzZL(com.aspose.words.internal.zzAN.zzZJ(d))))) * 1.5f) - ((Float.intBitsToFloat((int) this.zzZyQ.zzZIz()) / this.zzZgP.zz41().zzZOP()) * 0.5f)) + 50800.0f);
        }
        return zzY(f, d);
    }

    public void zzZ(long j, long j2, zzD9 zzd9, boolean z, boolean z2) throws Exception {
        zzZ(j, j2, zzd9, z);
    }

    private void zzZ(boolean z, com.aspose.words.internal.zzG zzg, boolean z2) throws Exception {
        ChartAxis chartAxisZzXK = zzXK(z2);
        int majorTickMark = z ? chartAxisZzXK.getMajorTickMark() : chartAxisZzXK.getMinorTickMark();
        zzCF[] zzcfArrZzZOV = z ? chartAxisZzXK.zz41().zzZOV() : chartAxisZzXK.zz41().zzZOU();
        boolean z3 = chartAxisZzXK.zz41().zzZOV().length == 2;
        int iZzZJX = chartAxisZzXK.isDate() ? zzZJX() : chartAxisZzXK.getTickMarkSpacing();
        int i = 0;
        for (zzCF zzcf : zzcfArrZzZOV) {
            int index = chartAxisZzXK.isDate() ? i : zzcf.getIndex();
            if (zzcf.isVisible() || z3) {
                if (!zzm(index, 0, iZzZJX)) {
                    zzZ(zzcf, majorTickMark, z2, zzg);
                }
                i++;
            }
        }
    }

    private static float zzY(float f, double d) {
        if (com.aspose.words.internal.zzAN.zzZD(d)) {
            return f / 1.7f;
        }
        if (com.aspose.words.internal.zzAN.zzL(Math.abs(d), 90.0d)) {
            return f * 1.4f;
        }
        if (d > 0.0d) {
            return f * 1.2f;
        }
        if (d < 0.0d) {
            return f / 1.5f;
        }
        return 0.0f;
    }

    private long zzY(zzCK zzck, long j) throws Exception {
        float fZz3N;
        float fIntBitsToFloat = Float.intBitsToFloat((int) j);
        float fZzYC = com.aspose.words.internal.zzZPY.zzYC(j) + zzXM(false);
        if (this.zzZgP.zz3W()) {
            fZz3N = this.zzZgP.zz3N();
        } else {
            fZz3N = -(this.zzZgP.zz3N() + zzck.zzZGm().getHeight());
        }
        return com.aspose.words.internal.zzZPY.zzG(zzZJV() + this.zzZbm.zzZp(zzck.zzZGm().getWidth()) + fIntBitsToFloat, fZzYC + fZz3N);
    }

    private void zzZ(zzCF zzcf, int i, boolean z, com.aspose.words.internal.zzG zzg) throws Exception {
        double dZzZON = z ? this.zzZgP.zz41().zzZON() : zzcf.getValue();
        double value = z ? zzcf.getValue() : this.zzZbw.zz41().zzZON();
        ChartAxis chartAxisZzXK = zzXK(z);
        long jZzY = zzY(dZzZON, value, false);
        float fZzYC = com.aspose.words.internal.zzZPY.zzYC(jZzY);
        float fZzYC2 = com.aspose.words.internal.zzZPY.zzYC(jZzY);
        int i2 = (int) jZzY;
        float fIntBitsToFloat = Float.intBitsToFloat(i2);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        float fZz3O = chartAxisZzXK.zz3O();
        if (i == 2) {
            fZz3O = -fZz3O;
        }
        float fZz3O2 = chartAxisZzXK.zz3O();
        if (i == 1) {
            fZz3O2 = -fZz3O2;
        }
        float f = i == 0 ? -chartAxisZzXK.zz3O() : 0.0f;
        int iZz3U = chartAxisZzXK.zz3U();
        if (iZz3U == 1) {
            fIntBitsToFloat += fZz3O;
        } else {
            if (iZz3U != 2) {
                fZzYC = iZz3U != 3 ? fZzYC + fZz3O2 : fZzYC + fZz3O;
                fZzYC2 += f;
                zzZ(com.aspose.words.internal.zzZPY.zzG(fIntBitsToFloat, fZzYC), com.aspose.words.internal.zzZPY.zzG(fIntBitsToFloat2, fZzYC2), chartAxisZzXK.zzZ2(), zzg, chartAxisZzXK.zzaQ());
            }
            fIntBitsToFloat += fZz3O2;
        }
        fIntBitsToFloat2 += f;
        zzZ(com.aspose.words.internal.zzZPY.zzG(fIntBitsToFloat, fZzYC), com.aspose.words.internal.zzZPY.zzG(fIntBitsToFloat2, fZzYC2), chartAxisZzXK.zzZ2(), zzg, chartAxisZzXK.zzaQ());
    }

    private static float zzZ(float f, float f2, double d, double d2, float f3) {
        double d3 = d / d2;
        return com.aspose.words.internal.zzAN.zzK((double) (f / f2), d3) ? f3 : (1.0f - ((float) d3)) * f;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private float zzZ(float f, double d) throws Exception {
        boolean z;
        float fZz3N;
        float fMax;
        if (this.zzZbw.zz40() && this.zzZbw.zz4c()) {
            z = true;
            if (this.zzZbw.zz3U() != 1) {
            }
        } else {
            z = false;
        }
        if (this.zzZbw.getHidden()) {
            fZz3N = 0.0f;
        } else {
            fZz3N = (z ? this.zzZbw.zz3N() + Float.intBitsToFloat((int) zzZJT()) : 0.0f) + 17145.0f;
        }
        if (this.zzZgP.zz3X()) {
            fMax = Math.max(0.0f, (f * (d < 0.0d ? 1.0f : 0.5f)) - (zzZJZ() / 2.0f));
        } else {
            fMax = f * (d < 0.0d ? 1.0f : 0.5f);
        }
        return Math.max(fZz3N, fMax);
    }

    private float zzZ(float f, float f2, double d) throws Exception {
        float fZzY;
        if (this.zzZgP.zz3X()) {
            fZzY = zzY(f, f2, d);
        } else {
            fZzY = zzY(f, d);
        }
        if (this.zzZbw.getHidden() || this.zzZbw.zz3U() != 2 || !this.zzZbw.zz4c()) {
            return fZzY;
        }
        return Math.max(fZzY, this.zzZbw.zz3N() + Float.intBitsToFloat((int) zzZJT()) + 17145.0f);
    }

    private long zzZ(zzCK zzck, long j) throws Exception {
        float fZz3N;
        float fIntBitsToFloat = Float.intBitsToFloat((int) j);
        float height = ((-zzZJU()) - (zzck.zzZGm().getHeight() / 2.0f)) + com.aspose.words.internal.zzZPY.zzYC(j);
        if (this.zzZbw.zz3W()) {
            fZz3N = -(this.zzZbw.zz3N() + zzck.zzZGm().getWidth());
        } else {
            fZz3N = this.zzZbw.zz3N();
        }
        return com.aspose.words.internal.zzZPY.zzG(fIntBitsToFloat + fZz3N, height);
    }
}
