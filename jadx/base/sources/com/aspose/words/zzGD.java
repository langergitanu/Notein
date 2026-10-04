package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzGD extends zzGG {
    private double zzZfo;
    private double zzZfp;
    private double zzZfq;
    private double zzZfr;
    private double zzZfs;
    private double zzZft;
    private boolean zzZfu;
    private boolean zzZfv;
    private boolean zzZfw;

    public zzGD(ChartAxis chartAxis) {
        super(chartAxis);
        this.zzZfo = 1.0E-10d;
    }

    private void zzJ(zzCF[] zzcfArr) {
        this.zzZfw = !this.zzZEz.getScaling().getMinimum().isAuto();
        this.zzZfv = !this.zzZEz.getScaling().getMaximum().isAuto();
        this.zzZfu = !this.zzZEz.getMajorUnitIsAuto();
        this.zzZft = this.zzZfw ? this.zzZEz.getScaling().getMinimum().getValue() : zzcfArr[0].getValue();
        double value = this.zzZfv ? this.zzZEz.getScaling().getMaximum().getValue() : zzcfArr[zzcfArr.length - 1].getValue();
        this.zzZfs = value;
        this.zzZfq = value;
        this.zzZfp = this.zzZft;
        zzZOz();
        zzZOy();
        zzZOC();
        zzZOD();
        zzZOE();
        if (this.zzZEz.zz3J()) {
            double d = this.zzZft;
            if (d < 1.0d && d > 0.0d) {
                this.zzZft = zzYB(d);
                this.zzZfw = true;
            }
        }
        zzZOF();
        zzZOG();
    }

    private static String zzK(zzCF[] zzcfArr) {
        int iLog10 = com.aspose.words.internal.zzAN.zzZD(Math.max(Math.abs(zzcfArr[0].getValue()), Math.abs(zzcfArr[zzcfArr.length - 1].getValue()))) ? 0 : ((int) Math.log10(r1)) - 5;
        if (iLog10 <= 0) {
            return "123456.7";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iLog10; i++) {
            com.aspose.words.internal.zzZNH.zzU(sb, "0");
        }
        return sb.toString() + "123456/7";
    }

    private long zzL(zzCF[] zzcfArr) throws Exception {
        float lineSpacingPoints = this.zzZEz.zzZr().getLineSpacingPoints();
        long jZzG = com.aspose.words.internal.zzZPW.zzG(lineSpacingPoints, lineSpacingPoints);
        if (zzZOI()) {
            jZzG = zzx(zzRD(zzK(zzcfArr)), jZzG);
        } else {
            for (zzCF zzcf : zzcfArr) {
                if (zzcf.isVisible()) {
                    jZzG = zzx(zzRD(zzcf.getStringValue()), jZzG);
                }
            }
        }
        return com.aspose.words.internal.zzZPW.zzG((float) zzDG.zzYc(Float.intBitsToFloat((int) jZzG)), com.aspose.words.internal.zzZPW.zzYz(jZzG));
    }

    private static double zzLw(int i) {
        return (((double) i) * 0.0475d) + 0.001d;
    }

    private static double zzLx(int i) {
        if (i == 0) {
            return 3.0d;
        }
        return (i <= 0 || i > 3) ? 1.0d : 2.0d;
    }

    private double zzM(zzCF[] zzcfArr) throws Exception {
        long jZzL = zzL(zzcfArr);
        float fZzYz = com.aspose.words.internal.zzZPW.zzYz(jZzL);
        float fIntBitsToFloat = Float.intBitsToFloat((int) jZzL);
        int i = 0;
        for (zzCF zzcf : zzcfArr) {
            if (zzcf.isVisible()) {
                i++;
            }
        }
        return zzY(fZzYz, i, fIntBitsToFloat);
    }

    private boolean zzN(zzCF[] zzcfArr) throws Exception {
        return ((double) (this.zzZEz.zz40() ? this.zzZEz.zz44().getHeight() : this.zzZEz.zz44().getWidth())) >= zzM(zzcfArr);
    }

    private long zzRD(String str) throws Exception {
        zz30 zz30VarZzZM7 = this.zzZEz.zz43().zzZIC().zzZMQ().zzZM7();
        zz49 zz49VarZzZM3 = this.zzZEz.zz43().zzZIC().zzZMQ().zzZM3();
        float width = this.zzZEz.zz44().getWidth();
        return zzCK.zzZ(zzDG.zzRk(str), new zzCV(this.zzZEz.zzaR(), this.zzZEz.zzaQ(), zz30VarZzZM7, zz49VarZzZM3, this.zzZEz.zz43().zzZIC().zzZMP(), width), this.zzZEz.zz43(), true).zzZGm().getSize();
    }

    private static double zzX(double d, boolean z) {
        int iLog10 = (int) Math.log10(d);
        double dPow = Math.pow(10.0d, iLog10);
        double d2 = d / 10.0d;
        if (d * dPow < 1.0d) {
            iLog10--;
        }
        if (z && d2 > 0.9090909090909091d * dPow && d2 < dPow) {
            iLog10++;
        }
        return Math.pow(10.0d, iLog10 - 1);
    }

    private boolean zzY(zzCF[] zzcfArr, int i) throws Exception {
        return this.zzZfu || this.zzZEz.zz3Q() || zzN(zzcfArr);
    }

    private double zzY1(boolean z) {
        AxisScaling scaling = this.zzZEz.getScaling();
        double value = (z ? scaling.getMaximum() : scaling.getMinimum()).getValue();
        return (this.zzZEz.getMajorUnit() * Math.abs(Math.ceil(value / this.zzZEz.getMajorUnit())) * (z ? -1.0d : 1.0d)) + value;
    }

    private void zzY2(boolean z) {
        boolean z2 = true;
        if (!this.zzZfv) {
            boolean z3 = zzZOt() && com.aspose.words.internal.zzAN.zzJ(this.zzZfq, 0.0d);
            this.zzZfs = zzY(true, (z3 && z) ? this.zzZfq : this.zzZfs, z3 ? !z : z);
        }
        if (this.zzZfw) {
            return;
        }
        boolean z4 = zzZOt() && this.zzZfq < 0.0d;
        if (!z4) {
            z2 = z;
        } else if (z) {
            z2 = false;
        }
        this.zzZft = zzY(false, (z4 && z) ? this.zzZfp : this.zzZft, z2);
    }

    private double zzY8(int i, int i2) {
        double d = (this.zzZfr * ((double) i)) + this.zzZft;
        return i2 < 16 ? com.aspose.words.internal.zzZKQ.zzS(d, i2) : d;
    }

    private int zzYA(double d) {
        int i = 0;
        if ((d >= 1.0d && com.aspose.words.internal.zzAN.zzZD(d - ((double) ((int) d)))) || com.aspose.words.internal.zzAN.zzQ(d, 0.0d, this.zzZfo)) {
            return 0;
        }
        int iZzZA = com.aspose.words.internal.zzAN.zzZA(d);
        if (iZzZA < 0) {
            return -iZzZA;
        }
        double dPow = d;
        while (!com.aspose.words.internal.zzAN.zzL(dPow, com.aspose.words.internal.zzZKQ.zzZa(dPow)) && i < 9) {
            i++;
            dPow = Math.pow(10.0d, i) * d;
        }
        return i;
    }

    private static double zzYB(double d) {
        double dPow = Math.pow(10.0d, 2.0d);
        return com.aspose.words.internal.zzZKQ.zzZa(d * dPow) / dPow;
    }

    private double zzYC(double d) {
        if (d > 0.0d) {
            return 0.0d;
        }
        double dPow = Math.pow(10.0d, d);
        double dPow2 = d < 0.0d ? Math.pow(10.0d, (-d) + 1.0d) : 1.0d;
        return (this.zzZfp - (Math.floor((this.zzZfp * dPow2) / (this.zzZfr * dPow2)) * this.zzZfr)) / (dPow * 10.0d);
    }

    private static double zzYx(double d) {
        double d2;
        double dPow = Math.pow(10.0d, (int) Math.floor(Math.log10(d)));
        int i = (int) (d / dPow);
        if (i == 1) {
            d2 = 2.0d;
        } else {
            if (i != 2) {
                return dPow * 10.0d;
            }
            d2 = 5.0d;
        }
        return dPow * d2;
    }

    private double zzYy(double d) {
        return d * zzLw(Math.abs((int) com.aspose.words.internal.zzZKQ.zzZa(((this.zzZfv ? this.zzZfs : this.zzZfq) - (this.zzZfw ? this.zzZft : this.zzZfp)) / d)));
    }

    private void zzYz(double d) {
        int iZzZA = com.aspose.words.internal.zzAN.zzZA(d);
        if (iZzZA >= 0) {
            return;
        }
        this.zzZfo = Math.min(this.zzZfo, Math.pow(10.0d, iZzZA));
    }

    private void zzZOA() {
        double dLog10 = Math.log10(this.zzZfr);
        double dFloor = dLog10 < 0.0d ? -Math.ceil(-dLog10) : Math.floor(dLog10);
        double dPow = Math.pow(10.0d, dFloor);
        double d = 10.0d * dPow;
        double dZzZOu = zzZOu() / d;
        double[] dArr = {0.6d, 0.5581395348837209d, 0.46511627906976744d, 0.39999999999999997d, 0.37209302325581395d, 0.27906976744186046d, 0.31746031746031744d};
        int i = (int) (this.zzZfr / dPow);
        double dZzYC = zzYC(dFloor) * 0.9302325581395349d;
        double d2 = d * 1.0001d;
        double d3 = ((double) (i == 5 ? 4 : i)) * dArr[6];
        int i2 = 0;
        double d4 = 0.0d;
        for (int i3 = 7; i2 < i3; i3 = 7) {
            double d5 = dZzYC;
            double dMin = (dArr[i2] * ((double) i)) - d5;
            if (i2 == 0) {
                dMin = Math.min(dMin, 3.1746031746031744d);
            }
            if (i2 == 6 || dMin >= d3) {
                if (i2 == 6) {
                    dMin = d3;
                }
                double d6 = d4;
                if (!com.aspose.words.internal.zzAN.zzP(dZzZOu, dMin, 1.0E-14d)) {
                    zzw(d6, zzLx(i2));
                    return;
                }
                d4 = dMin * d2;
            }
            i2++;
            dZzYC = d5;
        }
    }

    private void zzZOB() {
        int iZzZa = (int) com.aspose.words.internal.zzZKQ.zzZa(Math.log10(zzZOu()));
        for (int i = iZzZa + 1; i >= iZzZa - 1; i--) {
            double dPow = Math.pow(10.0d, i);
            this.zzZfr = dPow / 10.0d;
            double dZzZOu = zzZOu() / (0.31746031746031744d * dPow);
            if (dZzZOu >= 1.0d) {
                int[] iArr = {4, 2, 1};
                for (int i2 = 0; i2 < 3; i2++) {
                    int i3 = iArr[i2];
                    if (dZzZOu > i3) {
                        double d = this.zzZfr;
                        if (i3 == 4) {
                            i3 = 5;
                        }
                        this.zzZfr = d * ((double) i3);
                        return;
                    }
                }
            }
        }
    }

    private void zzZOC() {
        double d = this.zzZft;
        double majorUnit = this.zzZfs;
        if (d <= majorUnit || !this.zzZfu) {
            return;
        }
        boolean z = this.zzZfw;
        boolean z2 = this.zzZfv;
        if (z != z2) {
            if (!z2) {
                majorUnit = this.zzZEz.getMajorUnit() + d;
            }
            this.zzZfs = majorUnit;
            this.zzZft = this.zzZfw ? this.zzZft : majorUnit - this.zzZEz.getMajorUnit();
            this.zzZfv = true;
            this.zzZfw = true;
        }
    }

    private void zzZOD() {
        if (com.aspose.words.internal.zzAN.zzQ(this.zzZft, this.zzZfs, this.zzZfo)) {
            if (com.aspose.words.internal.zzAN.zzO(this.zzZft, 0.0d, this.zzZfo)) {
                this.zzZft = 0.0d;
                this.zzZfw = true;
            } else {
                this.zzZfs = 0.0d;
                this.zzZfv = true;
            }
        }
    }

    private void zzZOE() {
        if (com.aspose.words.internal.zzAN.zzZD(this.zzZfs) && com.aspose.words.internal.zzAN.zzZD(this.zzZft)) {
            this.zzZfs = 1.0d;
            this.zzZfv = true;
            this.zzZfw = true;
        }
    }

    private void zzZOF() {
        if (this.zzZfu) {
            this.zzZfr = this.zzZEz.getMajorUnit();
        } else if (zzZOt()) {
            zzZOB();
        } else {
            this.zzZfr = zzZOx();
        }
        zzYz(this.zzZfr);
    }

    private void zzZOG() {
        if (!zzZOv() || zzZOw()) {
            return;
        }
        if (this.zzZfu) {
            zzw(0.0d, (int) (zzZOu() / (this.zzZfr * 2.0d)));
        } else if (this.zzZEz.zz40()) {
            zzZOA();
        } else if (this.zzZEz.zz3Y().getType() != 2) {
            zzw(0.0d, 2.0d);
        }
    }

    private float zzZOH() {
        return com.aspose.words.internal.zzSA.zzp(this.zzZEz.zz44().getWidth() > 3700000.0f ? 31.0f : 18.0f);
    }

    private boolean zzZOI() throws Exception {
        return (this.zzZEz.getType() != 2 || this.zzZEz.zz40() || this.zzZEz.isDate()) ? false : true;
    }

    private int zzZOJ() {
        int spacing = this.zzZEz.getTickLabels().isAutoSpacing() ? 1 : this.zzZEz.getTickLabels().getSpacing();
        int iZzR = ((int) com.aspose.words.internal.zzZKQ.zzR(Math.abs(this.zzZfs - this.zzZft) / this.zzZfr, 0)) + 1;
        int iZzY9 = zzY9(iZzR, spacing);
        this.zzZfr = iZzY9 != iZzR ? (this.zzZfs - this.zzZft) / ((double) iZzY9) : this.zzZfr;
        return iZzY9;
    }

    private void zzZOK() {
        double dAbs = Math.abs(this.zzZfs - this.zzZfq);
        double dAbs2 = Math.abs(this.zzZft - this.zzZfp);
        boolean z = false;
        boolean z2 = (com.aspose.words.internal.zzAN.zzZD(dAbs) || !com.aspose.words.internal.zzAN.zzK(dAbs / this.zzZfr, 0.4000000059604645d) || this.zzZfv) ? false : true;
        if (!com.aspose.words.internal.zzAN.zzZD(dAbs2) && com.aspose.words.internal.zzAN.zzK(dAbs2 / this.zzZfr, 0.4000000059604645d) && !this.zzZfw) {
            z = true;
        }
        this.zzZfs += z2 ? this.zzZfr : 0.0d;
        this.zzZft -= z ? this.zzZfr : 0.0d;
    }

    private boolean zzZOs() {
        double d = this.zzZfp;
        if (d < 0.0d) {
            double d2 = this.zzZfq;
            if (d2 > 0.0d) {
                double d3 = d2 - d;
                return d3 < Math.pow(10.0d, (double) (((int) Math.log10(d3)) + 1)) * 0.9090909090909091d;
            }
        }
        return (!zzZOv() && this.zzZEz.getMajorUnitIsAuto() && this.zzZEz.getScaling().getMaximum().isAuto() && this.zzZEz.getScaling().getMinimum().isAuto()) ? false : true;
    }

    private boolean zzZOt() {
        return zzZOv() && this.zzZEz.zz40() && !zzZOw() && !this.zzZfu;
    }

    private double zzZOu() {
        return Math.abs(this.zzZfq - this.zzZfp);
    }

    private boolean zzZOv() {
        if (((this.zzZfw || this.zzZfv) && !zzZOw()) || com.aspose.words.internal.zzAN.zzZD(zzZOu())) {
            return false;
        }
        double d = this.zzZfp;
        if (d > 0.0d && com.aspose.words.internal.zzAN.zzK(this.zzZfq, d * 1.2d)) {
            return true;
        }
        double d2 = this.zzZfq;
        return d2 < 0.0d && com.aspose.words.internal.zzAN.zzJ(this.zzZfp, d2 * 1.2d);
    }

    private boolean zzZOw() {
        if (this.zzZEz.zz3I() != null) {
            return this.zzZEz.zz3I().zzZQO() == 6 || this.zzZEz.zz3I().zzZQO() == 15;
        }
        return false;
    }

    private double zzZOx() {
        double dAbs = Math.abs(this.zzZfs - this.zzZft);
        boolean z = (!zzZOw() || this.zzZft == 0.0d || this.zzZfs == 0.0d) ? false : true;
        double dZzX = zzX(dAbs, z);
        double d = dZzX * 10.0d;
        double d2 = dAbs / d;
        boolean z2 = this.zzZfv;
        double d3 = (z2 && this.zzZfw) ? 1.0d : (z || (this.zzZfs > 0.0d && this.zzZft < 0.0d)) ? 0.9090909090909091d : 0.9523809523809523d;
        double d4 = d3 * 2.0d;
        double d5 = d3 * 5.0d;
        if ((!z2 && (!this.zzZEz.zz3R() || this.zzZEz.zz3Q())) || dZzX <= 0.001d || (!com.aspose.words.internal.zzAN.zzL(d2, 1.0d) && !com.aspose.words.internal.zzAN.zzL(d2, 2.0d) && !com.aspose.words.internal.zzAN.zzL(d2, 5.0d))) {
            if (com.aspose.words.internal.zzAN.zzJ(d2, d3) && d2 < d4) {
                return dZzX * 2.0d;
            }
            if (com.aspose.words.internal.zzAN.zzJ(d2, d4) && d2 < d5) {
                return dZzX * 5.0d;
            }
            if (com.aspose.words.internal.zzAN.zzJ(d2, d5) && d2 < 10.0d) {
                return d;
            }
        }
        return dAbs / 10.0d;
    }

    private void zzZOy() {
        if (zzZOv()) {
            return;
        }
        double dZzY1 = 0.0d;
        if (!this.zzZfw && this.zzZft > 0.0d) {
            this.zzZft = (this.zzZEz.getMajorUnitIsAuto() || this.zzZEz.getScaling().getMaximum().isAuto()) ? 0.0d : zzY1(true);
            this.zzZfw = true;
        }
        if (this.zzZfv || this.zzZfs >= 0.0d) {
            return;
        }
        if (!this.zzZEz.getMajorUnitIsAuto() && !this.zzZEz.getScaling().getMinimum().isAuto()) {
            dZzY1 = zzY1(false);
        }
        this.zzZfs = dZzY1;
        this.zzZfv = true;
    }

    private void zzZOz() {
        if (this.zzZEz.zz3S()) {
            if (com.aspose.words.internal.zzAN.zzQ(this.zzZfs, 1.0d, this.zzZfo)) {
                this.zzZfv = true;
            }
            if (com.aspose.words.internal.zzAN.zzQ(this.zzZft, -1.0d, this.zzZfo)) {
                this.zzZfw = true;
            }
        }
    }

    private void zzw(double d, double d2) {
        if (this.zzZfs > 0.0d) {
            double d3 = this.zzZfp;
            this.zzZfs = d + d3;
            this.zzZft = d3 - (this.zzZfr * d2);
        } else {
            double d4 = this.zzZfq;
            this.zzZfs = (this.zzZfr * d2) + d4;
            this.zzZft = d4 - d;
        }
    }

    private static long zzx(long j, long j2) {
        return com.aspose.words.internal.zzZPW.zzG(Math.max(Float.intBitsToFloat((int) j), Float.intBitsToFloat((int) j2)), Math.max(com.aspose.words.internal.zzZPW.zzYz(j), com.aspose.words.internal.zzZPW.zzYz(j2)));
    }

    @Override // com.aspose.words.zzGG
    public final zzCF[] zzZ(zzCF[] zzcfArr) throws Exception {
        zzJ(zzcfArr);
        zzCF[] zzcfArrZzZ = null;
        int i = 0;
        while (i < 4) {
            boolean z = i != 0 || this.zzZEz.zz3R();
            zzY2(z);
            if (!this.zzZfv && this.zzZEz.zz3R() && com.aspose.words.internal.zzAN.zzK(this.zzZfq, this.zzZfr)) {
                this.zzZfs = this.zzZfr;
            }
            int iZzZOJ = zzZOJ();
            if (iZzZOJ <= 11 || zzZOs() || this.zzZfu || i >= 3) {
                if (iZzZOJ > 10 && !z) {
                    zzZOK();
                    iZzZOJ = zzZOJ();
                }
                int iMax = Math.max(zzYA(this.zzZfr), zzYA(this.zzZft));
                zzcfArrZzZ = zzZ(iZzZOJ, zzY8(iZzZOJ - 1, iMax), iMax);
                if (zzY(zzcfArrZzZ, i)) {
                    break;
                }
            }
            this.zzZfr = zzYx(this.zzZfr);
            i++;
        }
        return zzcfArrZzZ;
    }

    @Override // com.aspose.words.zzGG
    public final double zzZOW() throws Exception {
        if (com.aspose.words.internal.zzAN.zzP(zzZOS(), 0.0d, this.zzZfo)) {
            return zzZOS();
        }
        if (com.aspose.words.internal.zzAN.zzO(zzZOR(), 0.0d, this.zzZfo)) {
            return zzZOR();
        }
        return 0.0d;
    }

    private double zzY(boolean z, double d, boolean z2) {
        double d2 = z ? this.zzZft : this.zzZfs;
        boolean z3 = z ? this.zzZfw : this.zzZfv;
        double d3 = z ? this.zzZfq : this.zzZfp;
        double d4 = (!z3 || com.aspose.words.internal.zzAN.zzZD(d2)) ? d : d3;
        if (com.aspose.words.internal.zzAN.zzZD(d4)) {
            return 0.0d;
        }
        double d5 = z3 ? d2 : 0.0d;
        double d6 = z ? 1.0d : -1.0d;
        double d7 = this.zzZfr;
        double d8 = (d7 * ((double) ((int) ((d4 - d5) / d7)))) + d5;
        double dZzZ = zzZ(d2, z2, d3, d6, d4);
        while (true) {
            double d9 = d6 * d8;
            if (d9 >= d6 * dZzZ && (!com.aspose.words.internal.zzAN.zzP(d9, d6 * d3, this.zzZfo) || this.zzZEz.zz3R())) {
                break;
            }
            d8 += this.zzZfr * d6;
        }
        return d8;
    }

    private double zzY(float f, int i, float f2) {
        if (this.zzZEz.zz40()) {
            boolean z = !com.aspose.words.internal.zzAN.zzZP((long) i) && !this.zzZEz.zz3R() && this.zzZfs > 0.0d && this.zzZft < 0.0d;
            boolean z2 = this.zzZEz.zz3R() && this.zzZEz.zz45().zzZQD();
            return com.aspose.words.internal.zzSA.zzh(f * (i + ((z2 || z) ? 0 : 1))) + ((double) (z2 ? 0.0f : 152400.0f));
        }
        float f3 = f2 * (i - 1);
        if (this.zzZEz.zz3R() && !this.zzZEz.zz45().zzZQD()) {
            fZzZOH = zzZOH();
        }
        double d = f3 + fZzZOH;
        zzHK zzhk = (zzHK) this.zzZEz.zzaR().zzZHh().zzLu(8);
        return (zzhk == null || com.aspose.words.internal.zzAN.zzZD(zzhk.zzZQR())) ? d : Math.cos(zzhk.zzZQR()) * d;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zzCF[] zzZ(int i, double d, int i2) {
        zzCF[] zzcfArr;
        if (this.zzZfv) {
            double d2 = this.zzZfs;
            if (d < d2) {
                zzcfArr = new zzCF[i + 1];
                zzcfArr[i] = new zzFA(i, d2, false);
            } else {
                zzcfArr = new zzCF[i];
            }
        }
        if (this.zzZEz.getScaling().getMinimum().isAuto() && !this.zzZEz.getScaling().getMaximum().isAuto()) {
            this.zzZft = Math.min(this.zzZfs - (((double) (i - 1)) * this.zzZfr), this.zzZft);
        }
        for (int i3 = 0; i3 < i; i3++) {
            boolean z = !this.zzZEz.zz40() && this.zzZEz.getDisplayUnit().isDefined() && com.aspose.words.internal.zzAN.zzZD(this.zzZEz.zz3M());
            double dZzY8 = zzY8(i3, i2);
            if (this.zzZfv) {
                double d3 = this.zzZfs;
                if (dZzY8 > d3) {
                    zzcfArr[i3] = new zzFA(i3, d3, false);
                } else {
                    zzcfArr[i3] = new zzE7(i3, dZzY8, this.zzZEz.getFormatCode(), z ? 1.0d : this.zzZEz.getDisplayUnit().zzaX());
                }
            }
        }
        return zzcfArr;
    }

    private double zzZ(double d, boolean z, double d2, double d3, double d4) {
        if (com.aspose.words.internal.zzAN.zzZD(d) && z && !this.zzZEz.zz3R()) {
            return d2 * 1.05d;
        }
        return (d3 * ((z || (this.zzZEz.zz40() && this.zzZEz.zz3I().zzZP5())) ? 0.0d : zzYy(this.zzZfr))) + d4;
    }
}
