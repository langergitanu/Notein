package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzHC {
    private double zzZgN;
    private com.aspose.words.internal.zzZQ4 zzZgO;
    private ChartAxis zzZgP;
    private boolean zzZgQ;
    private zzDI zzZyQ;
    private zzGK zzZyX;
    private int zzZgS = 22;
    private float zzZgR = 182880.0f;
    private float zzZgM = 0.0f;

    public zzHC(zzDI zzdi, boolean z, ChartAxis chartAxis, double d, zzGK zzgk, com.aspose.words.internal.zzZQ4 zzzq4) {
        this.zzZyQ = zzdi;
        this.zzZgQ = z;
        this.zzZgP = chartAxis;
        this.zzZgN = d;
        this.zzZyX = zzgk;
        this.zzZgO = zzzq4;
    }

    private int zzA(float f, float f2) throws Exception {
        return zzDG.zzt(f2, Math.min(zzDG.zzS(this.zzZgP.zzaR(), this.zzZyQ), f) + 2116.6667f);
    }

    private static boolean zzR(String str, String str2, boolean z) {
        if (com.aspose.words.internal.zzZKN.equals(str, str2)) {
            return true;
        }
        if (str.length() != str2.length()) {
            return false;
        }
        com.aspose.words.internal.zzZNR zzznr = new com.aspose.words.internal.zzZNR("(?<=\\s)");
        String[] strArrSplit = zzznr.split(str);
        String[] strArrSplit2 = zzznr.split(str2);
        if (strArrSplit.length != strArrSplit2.length) {
            return false;
        }
        for (int i = 0; i < strArrSplit.length; i++) {
            if (strArrSplit[i].length() != strArrSplit2[i].length()) {
                return false;
            }
            if (z && com.aspose.words.internal.zzZNR.zzZP(strArrSplit[i], "\\w") && !com.aspose.words.internal.zzZKN.equals(com.aspose.words.internal.zzZNR.zzN(strArrSplit[i], "\\d", ""), com.aspose.words.internal.zzZNR.zzN(strArrSplit2[i], "\\d", ""))) {
                return false;
            }
        }
        return true;
    }

    private int zzW(long j, float f) throws Exception {
        float fZzU = zzDG.zzU(this.zzZgP.zzaR(), this.zzZyQ);
        double dZzZL = com.aspose.words.internal.zzAN.zzZL(this.zzZgP.zz3M());
        float fAbs = (float) Math.abs(Math.sin(dZzZL));
        float fAbs2 = (float) Math.abs(Math.cos(dZzZL));
        if (this.zzZgP.zz3M() > 0.0d) {
            fZzU = Math.max(Float.intBitsToFloat((int) j) * fAbs2, fZzU);
        } else if (!com.aspose.words.internal.zzAN.zzf(fAbs)) {
            fZzU /= fAbs;
        }
        double d = (fZzU - f) / f;
        if (d <= 0.0d || d >= 0.1d) {
            return zzDG.zzt(f, fZzU);
        }
        return 1;
    }

    private boolean zzZQA() throws Exception {
        String str = "";
        for (zzCF zzcf : this.zzZgP.zz41().zzZOV()) {
            String strZzY = zzDG.zzY(zzcf, this.zzZgS);
            if (!com.aspose.words.internal.zzZKN.zzU3(strZzY)) {
                if (com.aspose.words.internal.zzZYD.zzXk(str) && !zzR(strZzY, str, false)) {
                    return false;
                }
                str = strZzY;
            }
        }
        return true;
    }

    private float zzZQB() throws Exception {
        if (zzZQx()) {
            return this.zzZgM;
        }
        float fZzZ = zzDG.zzZ("...", this.zzZgP.zzaR(), this.zzZyQ);
        float fZzYz = this.zzZgQ ? this.zzZgP.zz3U() == 0 ? com.aspose.words.internal.zzZPW.zzYz(this.zzZyQ.zzZIz()) - this.zzZgO.zzZn() : this.zzZgO.zzZo() : (this.zzZgO.getHeight() / 2.0f) - (this.zzZgP.zz3N() + (this.zzZgP.zz3W() ? this.zzZgP.zz3O() : 0.0f));
        float fZzYB = this.zzZgQ ? this.zzZyQ.zzZIC().zzZdM * 0.842f : this.zzZgR + com.aspose.words.internal.zzSA.zzYB(4);
        float fZzS = zzDG.zzS(this.zzZgP.zzaR(), this.zzZyQ);
        zzHK zzhkZzZCC = this.zzZgP.zzaR().zzZHh().zzZCC();
        float fSqrt = (((zzhkZzZCC == null || zzhkZzZCC.zzZQQ() <= 0.0d) ? (float) Math.sqrt((fZzYz * fZzYz) * 2.0f) : fZzYz / ((float) Math.sin(zzhkZzZCC.zzZQR()))) - fZzS) + fZzYB;
        this.zzZgS = Math.max(1, Math.min((int) com.aspose.words.internal.zzZKQ.zzS((fSqrt - fZzZ) / zzZQs(), 0), this.zzZgS));
        return fSqrt;
    }

    private boolean zzZQC() throws Exception {
        return this.zzZgP.zz4q() && this.zzZgP.zz41().getBaseTimeUnit() == 1 && this.zzZgP.zz41().getMajorUnitScale() != 1 && this.zzZgP.zz41().zzZOV()[0].isDate() && com.aspose.words.internal.zzZQ9.zzZg(this.zzZgP.zz41().zzZOV()[0].getValue()).getDay() != 1;
    }

    private boolean zzZQq() {
        return this.zzZgP.zzaR().zzZHh().zzLh(8);
    }

    private float zzZQs() throws Exception {
        return zzDG.zzZ("iW", this.zzZgP.zzaR(), this.zzZyQ) / 2.0f;
    }

    private boolean zzZQu() throws Exception {
        return zzZQt() && this.zzZgP.zz41().zzZOV().length / this.zzZgP.zz41().zzZOO() > 2;
    }

    private boolean zzZQx() throws Exception {
        if (this.zzZyX.zz3R()) {
            return true;
        }
        if (!this.zzZgQ) {
            return false;
        }
        if (this.zzZgP.isDate() || this.zzZgN < 0.0d) {
            return true;
        }
        float fZzZo = zzZo(Float.intBitsToFloat((int) zzY(true, this.zzZgO.getWidth())));
        float f = this.zzZyQ.zzZIC().zzZdM * 3.0f;
        float fIntBitsToFloat = Float.intBitsToFloat((int) this.zzZyQ.zzZIz());
        double left = this.zzZyQ.getChartSpace().zzZHX().zz45().zz3y().getLeft();
        double d = fIntBitsToFloat;
        return ((double) fZzZo) >= left * d || ((double) f) >= ((1.0d - left) - this.zzZyQ.getChartSpace().zzZHX().zz45().zz3y().getWidth()) * d;
    }

    private int zzZQy() throws Exception {
        int i = 0;
        for (zzCF zzcf : this.zzZgP.zz41().zzZOV()) {
            if (com.aspose.words.internal.zzZYD.zzXk(zzDG.zzY(zzcf, this.zzZgS))) {
                i++;
            }
        }
        return i;
    }

    private float zzZQz() throws Exception {
        String stringValue = "";
        float fMax = 0.0f;
        for (zzCF zzcf : this.zzZgP.zz41().zzZOV()) {
            if (!com.aspose.words.internal.zzZKN.zzU3(zzcf.getStringValue())) {
                if (!zzR(zzcf.getStringValue(), stringValue, true)) {
                    fMax = Math.max(fMax, zzCA.zzZ(zzcf, this.zzZgS, this.zzZgP.zzaR(), this.zzZyQ));
                }
                stringValue = zzcf.getStringValue();
            }
        }
        return fMax - this.zzZgR;
    }

    private float zzZq(float f) {
        float f2 = 0.0f;
        if (f <= 1000000.0f) {
            if (f > 800000.0f) {
                f2 = 0.58f;
            } else if (f > 745000.0f) {
                f2 = 0.26f;
            } else if (f > 740000.0f) {
                f2 = 1.83f;
            } else if (f > 702000.0f) {
                f2 = 0.59f;
            } else if (f > 660000.0f) {
                f2 = 0.46f;
            } else if (f > 630000.0f) {
                f2 = 0.55f;
            } else if (f > 530000.0f) {
                f2 = 0.32f;
            } else if (f > 515000.0f) {
                f2 = 0.1555f;
            } else if (f > 490000.0f) {
                f2 = 0.068f;
            } else if (f > 350000.0f) {
                f2 = -0.053f;
            } else if (f > 150000.0f) {
                f2 = 0.018f;
            }
        }
        return this.zzZgQ ? f2 + 0.8f : f2;
    }

    private boolean zzZr(float f) throws Exception {
        return this.zzZgQ && this.zzZgP.isDate() && f / (this.zzZgP.zz44().getWidth() / ((float) this.zzZgP.zz41().zzZOP())) > 0.8333333f;
    }

    private float zzZs(float f) throws Exception {
        return this.zzZgP.zz42() * (this.zzZyX.zz3R() ? this.zzZgP.zz4q() ? this.zzZgQ ? 2.1f : 1.3f : zzZq(f) : this.zzZgP.zz4q() ? this.zzZgQ ? 0.36f : 1.06f : 0.0f);
    }

    private boolean zzZt(float f) throws Exception {
        if (!this.zzZgQ || this.zzZgP.zz41().zzZOV()[0].isDate()) {
            return false;
        }
        return com.aspose.words.internal.zzAN.zzR(1.4142f, (this.zzZgO.getWidth() / (zzZQy() / f)) / zzDG.zzT(this.zzZgP.zzaR(), this.zzZyQ).zzPf());
    }

    private float zzZu(float f) throws Exception {
        if (!this.zzZgQ) {
            return (f / 2.0f) + com.aspose.words.internal.zzSA.zzYB(9);
        }
        return (com.aspose.words.internal.zzZPW.zzYz(zzZ((com.aspose.words.internal.zzZPW.zzYz(this.zzZyQ.zzZIz()) / 2.0f) + this.zzZgR, false, this.zzZgP, com.aspose.words.internal.zzZPW.zzYz(this.zzZyQ.zzZIz()))) + this.zzZgR) - com.aspose.words.internal.zzSA.zzp(1.5d);
    }

    public final float zzV(float f, float f2, float f3, float f4) throws Exception {
        this.zzZgM = f2;
        if (this.zzZgP.zz41().zzZEz.getType() == 2) {
            return this.zzZgM;
        }
        long jZzZ = zzZ(this.zzZgM, false, this.zzZgP, f2);
        float fIntBitsToFloat = Float.intBitsToFloat((int) zzY(true, this.zzZgM));
        if (com.aspose.words.internal.zzAN.zzR(f3, zzDG.zzU(this.zzZgP.zzaR(), this.zzZyQ) * 2.0f)) {
            return this.zzZgM;
        }
        if (zzZQq()) {
            if (com.aspose.words.internal.zzAN.zzZD(this.zzZgP.zz3M())) {
                return f + (this.zzZyX.zz3R() ? this.zzZyQ.zzZIC().zzZdM : this.zzZgR);
            }
            return zzDG.zzYd(this.zzZgP.zz3M()) ? zzZu(f3) : zzZQB();
        }
        boolean zZzZr = zzZr(fIntBitsToFloat);
        if (!zZzZr && zzW(jZzZ, f, f2)) {
            return this.zzZgM;
        }
        this.zzZgM = f2;
        if (!com.aspose.words.internal.zzAN.zzP(Float.intBitsToFloat((int) jZzZ) + zzZs(f), f) && !zZzZr) {
            return this.zzZgM;
        }
        float fZzZQB = zzZQB();
        this.zzZgM = fZzZQB;
        this.zzZgP.zzaR().zzZHh().zzX(new zzHK((zzZ(f, zzZ(fZzZQB, false, this.zzZgP, f2), f4) ? -45.0d : -90.0d) * 60000.0d));
        if (!this.zzZgQ && this.zzZyX.zz3R()) {
            this.zzZgM = Math.min(this.zzZgM, (this.zzZgO.getHeight() / 2.0f) + this.zzZgR);
        }
        return this.zzZgM;
    }

    public final long zzY(boolean z, float f) throws Exception {
        int length = z ? 0 : this.zzZgP.zz41().zzZOV().length - 1;
        zzCF zzcf = this.zzZgP.zz41().zzZOV()[length];
        if (z) {
            while (zzcf.getValueType() == 0 && length < this.zzZgP.zz41().zzZOV().length) {
                zzCF zzcf2 = this.zzZgP.zz41().zzZOV()[length];
                length++;
                zzcf = zzcf2;
            }
        } else {
            while (zzcf.getValueType() == 0 && length >= 0) {
                zzCF zzcf3 = this.zzZgP.zz41().zzZOV()[length];
                length--;
                zzcf = zzcf3;
            }
        }
        return zzCA.zzZ(zzcf, f, zzZ(zzcf.getStringValue(), this.zzZgS, this.zzZgP.zzaR(), f, this.zzZgP), this.zzZgP.zzaR(), this.zzZyQ);
    }

    public final long zzZ(float f, boolean z, ChartAxis chartAxis, float f2) throws Exception {
        zzCF[] zzcfArrZzZOV = chartAxis.zz41().zzZOV();
        zzCL zzclZzaR = chartAxis.zzaR();
        zzCF[] zzcfArr = new zzCF[3];
        float length = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        for (zzCF zzcf : zzcfArrZzZOV) {
            if (!com.aspose.words.internal.zzZKN.zzU3(zzcf.getStringValue())) {
                com.aspose.words.internal.zzZNR zzznr = new com.aspose.words.internal.zzZNR(ControlChar.f50773CR);
                float fZzZ = zzznr.zzUV(zzcf.getStringValue()) ? zzDG.zzZ(zzcf.getStringValue(), zzclZzaR, this.zzZyQ, zzznr) : zzDG.zzY(zzcf.getStringValue(), zzclZzaR, this.zzZyQ);
                if (fZzZ >= f) {
                    String strZzRi = zzDG.zzRi(zzcf.getStringValue());
                    String[] strArrSplit = zzDG.zzZay.split(strZzRi);
                    if (strArrSplit.length > length) {
                        zzcfArr[1] = zzcf;
                        length = strArrSplit.length;
                    }
                    float fZzX = zzDG.zzX(strZzRi, zzclZzaR, this.zzZyQ);
                    if (fZzX > f4) {
                        zzcfArr[2] = zzcf;
                        f4 = fZzX;
                    }
                } else if (fZzZ > f3) {
                    zzcfArr[0] = zzcf;
                    f3 = fZzZ;
                }
            }
        }
        return zzZ(zzcfArr, f, z, chartAxis, f2);
    }

    public final boolean zzZQr() {
        return this.zzZgP.zzaR().zzZHj().zzZvR() != null && com.aspose.words.internal.zzAN.zzZD(this.zzZgP.zz3M());
    }

    public final boolean zzZQt() throws Exception {
        return this.zzZgP.zz41().zzZOV().length > 10;
    }

    public final boolean zzZQv() {
        if (!this.zzZgP.zz3Z() || this.zzZgP.zz4q()) {
            return false;
        }
        return !zzZQq() || com.aspose.words.internal.zzAN.zzZD(this.zzZgP.zz3M());
    }

    public final boolean zzZQw() throws Exception {
        return zzZQv() && zzZQu();
    }

    public final float zzZo(float f) {
        double dZzZQQ = this.zzZgP.zzaR().zzZHh().zzZCC().zzZQQ();
        if (dZzZQQ > 0.0d && dZzZQQ < 90.0d) {
            return f * 1.5f;
        }
        if ((dZzZQQ >= 0.0d || dZzZQQ <= -90.0d) && this.zzZgP.zz3X()) {
            return 0.0f;
        }
        return f / 2.0f;
    }

    public final float zzZp(float f) throws Exception {
        double dZz3M = this.zzZgP.zz3M();
        float fSin = (float) (Math.sin(this.zzZgP.zzaR().zzZHh().zzZCC().zzZQR()) * ((double) (this.zzZgP.zzZr().zzPf() / 2.0f)));
        if (dZz3M <= 0.0d || dZz3M >= 90.0d) {
            return (dZz3M >= 0.0d || dZz3M <= -90.0d) ? (-f) / 2.0f : this.zzZgP.zz3W() ? (-f) - fSin : fSin;
        }
        if (this.zzZgP.zz3W()) {
            f = 0.0f;
        }
        return fSin - f;
    }

    private boolean zzW(long j, float f, float f2) throws Exception {
        float fZzZs = zzZs(f);
        int i = (int) j;
        if (com.aspose.words.internal.zzAN.zzR(Float.intBitsToFloat(i) + fZzZs, f)) {
            return true;
        }
        float f3 = f + 91440.0f + 91440.0f;
        float fMin = Math.min(Float.intBitsToFloat(i), f3);
        if (com.aspose.words.internal.zzAN.zzR(Float.intBitsToFloat((int) zzZ(fMin, false, this.zzZgP, f2)) + fZzZs, f)) {
            this.zzZgM = fMin;
            return true;
        }
        if ((Float.intBitsToFloat(i) + fZzZs) * zzZQy() < f2) {
            return true;
        }
        this.zzZgM = f3;
        if (com.aspose.words.internal.zzAN.zzR(Float.intBitsToFloat((int) zzZ(f3, false, this.zzZgP, f2)) + fZzZs, ((zzZQA() || this.zzZgP.zz3L()) ? 0.0f : 43500.0f) + f)) {
            return true;
        }
        float f4 = (this.zzZyQ.zzZIC().zzZdM * 2.0f) + f;
        this.zzZgM = f4;
        return com.aspose.words.internal.zzAN.zzR(Float.intBitsToFloat((int) zzZ(f4, false, this.zzZgP, f2)) + fZzZs, f);
    }

    public final zzCK zzZ(zzCF zzcf, float f, boolean z, float f2, float f3, int i, ChartAxis chartAxis) throws Exception {
        float fMax;
        zzCL zzclZzZ = zzZ(zzcf.getValue(), chartAxis.zzaR(), chartAxis.zz4d());
        String strZzZ = zzZ(zzcf, chartAxis, f);
        if (com.aspose.words.internal.zzZKN.zzU3(strZzZ)) {
            strZzZ = zzcf.getStringValue();
        }
        String str = strZzZ;
        int iZzZ = zzZ(str, i, zzclZzZ, f, chartAxis);
        float fZzX = zzDG.zzX(str, zzclZzZ, this.zzZyQ);
        if (z && zzZQu()) {
            fMax = zzZ(chartAxis, f3);
        } else {
            fMax = (chartAxis == this.zzZgP && zzZQq() && com.aspose.words.internal.zzAN.zzZD(this.zzZgP.zz3M()) && !zzZQt()) ? f : Math.max(f, fZzX);
        }
        return zzCA.zzY(zzcf, fMax, f2, iZzZ, zzclZzZ, chartAxis.zzaQ(), this.zzZyQ, true);
    }

    private int zzV(long j, float f) throws Exception {
        float fIntBitsToFloat;
        int i = (int) j;
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) * 0.095f;
        if (this.zzZgP.isDate() && this.zzZgP.zz41().zzZOR() > 2.0d) {
            fIntBitsToFloat = (fIntBitsToFloat2 * 2.0f) + Float.intBitsToFloat(i);
        } else if (Float.intBitsToFloat(i) > f) {
            fIntBitsToFloat = Math.min(Float.intBitsToFloat(i), zzZQz());
        } else {
            fIntBitsToFloat = Float.intBitsToFloat(i);
        }
        return zzDG.zzt(f, fIntBitsToFloat);
    }

    public final int zzZ(float f, float f2, long j) throws Exception {
        zzHK zzhk = (zzHK) this.zzZgP.zzaR().zzZHh().zzLu(8);
        if (zzhk == null) {
            if (this.zzZgP.zz3L()) {
                return zzA(Float.intBitsToFloat((int) j), f);
            }
            return zzDG.zzZ(f2, this.zzZgP.zzaR(), this.zzZyQ);
        }
        if (com.aspose.words.internal.zzAN.zzZD(zzhk.zzZQQ())) {
            return zzV(j, f);
        }
        return zzW(j, f2);
    }

    public final float zzZ(boolean z, float f, float f2, float f3) throws Exception {
        boolean reverseOrder = this.zzZgP.getReverseOrder();
        if (z) {
            reverseOrder = !reverseOrder;
        }
        long jZzY = zzY(reverseOrder, f);
        double dZzZQQ = this.zzZgP.zzaR().zzZHh().zzZCC().zzZQQ();
        if (!this.zzZgP.getHidden() && this.zzZgP.zz4c() && !com.aspose.words.internal.zzAN.zzL(Math.abs(dZzZQQ), 90.0d)) {
            if (com.aspose.words.internal.zzAN.zzZD(dZzZQQ)) {
                return zzZ(jZzY, f, f2, f3);
            }
            return zzZ(z, jZzY, dZzZQQ, f2);
        }
        return this.zzZyQ.zzZIC().zzZdM;
    }

    private float zzZ(long j, float f, float f2, float f3) throws Exception {
        float f4;
        float fMin = Math.min(Float.intBitsToFloat((int) j), Float.intBitsToFloat((int) zzZ(f, zzZQw(), this.zzZgP, f3)));
        float f5 = this.zzZyQ.zzZIC().zzZdM * 1.25f;
        if (this.zzZgP.zz3X()) {
            f4 = 0.0f;
            float fMax = Math.max(0.0f, (fMin - f2) / 2.0f);
            if (com.aspose.words.internal.zzAN.zzf(fMax) || !zzZQC()) {
                f4 = fMax;
            }
        } else {
            f4 = fMin / 2.0f;
        }
        return f5 + f4;
    }

    private boolean zzZ(float f, long j, float f2) throws Exception {
        float fZzS = zzDG.zzS(this.zzZgP.zzaR(), this.zzZyQ);
        if (!this.zzZgP.zz4q() && f < 0.87f * fZzS) {
            return false;
        }
        if (com.aspose.words.internal.zzZPW.zzYz(j) < (this.zzZgP.zz3L() ? 0.59f : 0.55f) * f) {
            return true;
        }
        return (this.zzZgP.zz3L() && com.aspose.words.internal.zzZPW.zzYz(j) > fZzS) || zzZt(f2);
    }

    private String zzZ(zzCF zzcf, ChartAxis chartAxis, float f) throws Exception {
        if (!chartAxis.zz40() && chartAxis.zz4q() && zzcf.isDate()) {
            boolean z = zzZQq() && com.aspose.words.internal.zzAN.zzZD(chartAxis.zz3M());
            boolean zZzLh = chartAxis.zzaR().zzZHh().zzLh(13);
            boolean z2 = chartAxis.zzaR().zzZHh().zzZtu() == 0;
            boolean zZzL = com.aspose.words.internal.zzAN.zzL(1.0d, chartAxis.zz41().getMajorUnit());
            float fZzY = zzDG.zzY(zzcf.getStringValue(), chartAxis.zzaR(), this.zzZyQ);
            if (z && zZzLh && z2 && zZzL && fZzY > f) {
                return zzDG.zzRi(zzcf.getStringValue());
            }
        }
        return "";
    }

    private float zzZ(ChartAxis chartAxis, float f) throws Exception {
        int length = chartAxis.zz41().zzZOV().length;
        return Math.max(zzZQs(), f * (length > 200 ? 0.06f : length > 99 ? 0.106f : length > 66 ? 0.12f : length > 50 ? 0.15f : length > 36 ? 0.17f : length > 35 ? 0.186f : length > 34 ? 0.2f : length > 33 ? 0.21f : length > 28 ? 0.22f : length > 26 ? 0.24f : 1.0f));
    }

    private int zzZ(String str, int i, zzCL zzcl, float f, ChartAxis chartAxis) throws Exception {
        if (com.aspose.words.internal.zzZKN.zzU3(str) || zzZ(str, zzcl, f, chartAxis)) {
            return i;
        }
        int length = str.length();
        float fZzYB = (chartAxis.isVisible() ? 0.0f : com.aspose.words.internal.zzSA.zzYB(7)) + (this.zzZgQ ? this.zzZyQ.zzZIC().zzZdM * 1.21f : 0.0f);
        while (length > 1) {
            String strZzS = com.aspose.words.internal.zzZKN.zzS(str, '-');
            int iMax = Math.max(strZzS.lastIndexOf(32), strZzS.lastIndexOf(45) + 1);
            length = iMax > 0 ? iMax : length - 1;
            str = strZzS.substring(0, length);
            if (zzDG.zzY(str, zzcl, this.zzZyQ) < f - fZzYB) {
                break;
            }
        }
        return length;
    }

    private boolean zzZ(String str, zzCL zzcl, float f, ChartAxis chartAxis) throws Exception {
        float fZzY = zzDG.zzY(str, zzcl, this.zzZyQ);
        if (!this.zzZgQ || !zzDG.zzYd(this.zzZgP.zz3M())) {
            return com.aspose.words.internal.zzAN.zzZD(chartAxis.zz3M()) || fZzY < f;
        }
        float fZzZ = zzDG.zzZ(str, zzcl, this.zzZyQ);
        float fZzYz = (com.aspose.words.internal.zzZPW.zzYz(this.zzZyQ.zzZIz()) - this.zzZgO.zzZn()) - com.aspose.words.internal.zzSA.zzp(1.5d);
        boolean zZzUV = zzDG.zzZay.zzUV(str);
        return (fZzYz >= fZzZ || ((this.zzZgO.getHeight() > ((com.aspose.words.internal.zzZPW.zzYz(this.zzZyQ.zzZIz()) / 2.0f) - (this.zzZyQ.zzZIC().zzZdM * 2.0f)) ? 1 : (this.zzZgO.getHeight() == ((com.aspose.words.internal.zzZPW.zzYz(this.zzZyQ.zzZIz()) / 2.0f) - (this.zzZyQ.zzZIC().zzZdM * 2.0f)) ? 0 : -1)) > 0)) && ((((((float) com.aspose.words.internal.zzSA.zzp(2.5d)) + fZzZ) > this.zzZgO.getHeight() ? 1 : ((((float) com.aspose.words.internal.zzSA.zzp(2.5d)) + fZzZ) == this.zzZgO.getHeight() ? 0 : -1)) < 0 && !zZzUV) || zZzUV);
    }

    private long zzZ(zzCF[] zzcfArr, float f, boolean z, ChartAxis chartAxis, float f2) throws Exception {
        float fMax = 0.0f;
        float fMax2 = 0.0f;
        for (int i = 0; i < 3; i++) {
            zzCF zzcf = zzcfArr[i];
            if (zzcf != null) {
                zzCK zzckZzZ = zzZ(zzcf, f, z, 0.0f, f2, this.zzZgS, chartAxis);
                fMax = Math.max(zzckZzZ.zzZGm().getWidth(), fMax);
                fMax2 = Math.max(zzckZzZ.zzZGm().getHeight(), fMax2);
                if (zzZQr()) {
                    fMax2 -= chartAxis.zzZr().zzPe() + chartAxis.zzZr().getDescentPoints();
                }
            }
        }
        return com.aspose.words.internal.zzZPW.zzG(fMax, fMax2);
    }

    private static zzCL zzZ(double d, zzCL zzcl, zzE8 zze8) {
        com.aspose.words.internal.zzPV zzpvZzU;
        if (zze8 == null) {
            zzpvZzU = com.aspose.words.internal.zzPV.zzHZ;
        } else {
            zzpvZzU = zzEX.zzU(d, zze8.zzZLa());
        }
        if (zzpvZzU.isEmpty()) {
            return zzcl;
        }
        zzCL zzcl2 = zzcl == null ? new zzCL() : zzcl.zzZGr();
        zzcl2.zzZGt().zzZxp().zzZHc().setFill(new zz1C(zzBW.zzj(zzpvZzU)));
        return zzcl2;
    }

    private float zzZ(boolean z, long j, double d, float f) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) j) - (this.zzZgP.zz3X() ? f / 2.0f : 0.0f);
        if (d > 0.0d && d < 90.0d) {
            if (this.zzZgP.zz3W() == z) {
                return 0.0f;
            }
        } else if (this.zzZgP.zz3W() != z) {
            return 0.0f;
        }
        return fIntBitsToFloat;
    }
}
