package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzGF extends zzGG {
    public zzGF(ChartAxis chartAxis) {
        super(chartAxis);
    }

    private com.aspose.words.internal.zzZQ9 zzO(zzCF[] zzcfArr) {
        com.aspose.words.internal.zzZQ9 zzzq9 = com.aspose.words.internal.zzZQ9.zz34;
        if (!this.zzZEz.getScaling().getMaximum().isAuto()) {
            return com.aspose.words.internal.zzZQ9.zzZg(this.zzZEz.getScaling().getMaximum().getValue());
        }
        for (int length = zzcfArr.length - 1; length >= 0; length--) {
            if (!Double.isNaN(zzcfArr[length].getValue())) {
                return com.aspose.words.internal.zzZQ9.zzZg(zzcfArr[length].getValue());
            }
        }
        return zzzq9;
    }

    private com.aspose.words.internal.zzZQ9 zzP(zzCF[] zzcfArr) {
        com.aspose.words.internal.zzZQ9 zzzq9ZzZg = com.aspose.words.internal.zzZQ9.zz35;
        if (this.zzZEz.getScaling().getMinimum().isAuto()) {
            int i = 0;
            while (true) {
                if (i >= zzcfArr.length) {
                    break;
                }
                if (!Double.isNaN(zzcfArr[i].getValue())) {
                    zzzq9ZzZg = com.aspose.words.internal.zzZQ9.zzZg(zzcfArr[i].getValue());
                    break;
                }
                i++;
            }
        } else {
            zzzq9ZzZg = com.aspose.words.internal.zzZQ9.zzZg(this.zzZEz.getScaling().getMinimum().getValue());
        }
        return zzDG.zzV(zzzq9ZzZg, getBaseTimeUnit());
    }

    private zzCF zzQ(zzCF[] zzcfArr) {
        if (this.zzZEz.getReverseOrder()) {
            for (int i = 0; i < zzcfArr.length; i++) {
                if (zzcfArr[i].isVisible()) {
                    return zzcfArr[i];
                }
            }
            return null;
        }
        for (int length = zzcfArr.length - 1; length >= 0; length--) {
            if (zzcfArr[length].isVisible()) {
                return zzcfArr[length];
            }
        }
        return null;
    }

    private String zzR(zzCF[] zzcfArr) throws Exception {
        zzE7 zze7 = (zzE7) com.aspose.words.internal.zzZKW.zzZ(zzcfArr[0], zzE7.class);
        String formatCode = null;
        String formatCode2 = zze7 == null ? null : zze7.getFormatCode();
        if (this.zzZEz.zz3I().zzZPk() != null && this.zzZEz.zz3I().zzZPk().zz2z().zzZMv() != null) {
            formatCode = this.zzZEz.zz3I().zzZPk().zz2z().zzZMv().getFormatCode();
        }
        String strZzZ = zzEW.zzZ(this.zzZEz.getFormatCode(), this.zzZEz.zz4d() == null || this.zzZEz.zz4d().zzZLb(), formatCode2, formatCode);
        String str = "";
        float f = 0.0f;
        for (zzCF zzcf : zzcfArr) {
            if (zzcf != null && !Double.isNaN(zzcf.getValue()) && zzcf.isDate()) {
                for (String str2 : new com.aspose.words.internal.zzZNR("[\\s,]").split(zzDG.zzY(com.aspose.words.internal.zzZQ9.zzZg((float) zzcf.getValue()), strZzZ))) {
                    float fZzZ = zzDG.zzZ(str2, this.zzZEz.zzaR(), this.zzZEz.zz43());
                    if (fZzZ > f) {
                        str = str2;
                        f = fZzZ;
                    }
                }
            }
        }
        return str;
    }

    private static int zzS(zzCF[] zzcfArr) {
        com.aspose.words.internal.zzZQ9 zzzq9 = new com.aspose.words.internal.zzZQ9();
        int iMin = StyleIdentifier.LIST_TABLE_2_ACCENT_6;
        for (int i = 0; i < zzcfArr.length - 1; i++) {
            zzCF zzcf = zzcfArr[i];
            if (zzcf != null && !Double.isNaN(zzcf.getValue()) && zzcf.isDate()) {
                com.aspose.words.internal.zzZQ9 zzzq9ZzZg = com.aspose.words.internal.zzZQ9.zzZg((float) zzcfArr[i].getValue());
                if (i > 0) {
                    iMin = Math.min(iMin, Math.abs(com.aspose.words.internal.zzZQ9.zzU(zzzq9, zzzq9ZzZg).getDays()));
                }
                zzzq9 = zzzq9ZzZg;
            }
        }
        return iMin;
    }

    private void zzT(zzCF[] zzcfArr) {
        if (this.zzZEz.getBaseTimeUnit() == 0) {
            double dZzS = zzS(zzcfArr);
            if (dZzS >= 365.0d) {
                setBaseTimeUnit(3);
            } else if (dZzS >= 28.0d) {
                setBaseTimeUnit(2);
            } else {
                setBaseTimeUnit(1);
            }
        }
    }

    private void zzU(zzCF[] zzcfArr) throws Exception {
        if (this.zzZEz.getBaseTimeUnit() == 0 || this.zzZEz.getMajorUnitScale() == 0 || this.zzZEz.getMajorUnitIsAuto()) {
            com.aspose.words.internal.zzZQ9 zzzq9ZzP = zzP(zzcfArr);
            com.aspose.words.internal.zzZQ9 zzzq9ZzO = zzO(zzcfArr);
            int year = (zzzq9ZzO.getYear() - zzzq9ZzP.getYear()) + 1;
            int month = (zzzq9ZzO.getMonth() + ((zzzq9ZzO.getYear() - zzzq9ZzP.getYear()) * 12)) - zzzq9ZzP.getMonth();
            int i = month + 1;
            if (year <= 2) {
                year = i;
            }
            double dFloor = Math.floor(zzZ(zzcfArr, year));
            double dAbs = Math.abs(com.aspose.words.internal.zzZQ9.zzU(zzzq9ZzO, zzzq9ZzP).getDays()) + 1;
            int length = zzcfArr.length;
            double dMax = Math.max(zzcfArr.length > 2 ? dAbs / ((double) length) : 0.0d, dAbs / dFloor);
            if (dMax == 0.0d || dFloor > dAbs) {
                dMax = 0.5d;
            }
            double dZzZa = com.aspose.words.internal.zzZKQ.zzZa(dMax / 365.0d);
            boolean z = false;
            boolean z2 = this.zzZEz.getMajorUnitScale() == 0;
            zzT(zzcfArr);
            if (month > 0 && length < dFloor) {
                z = true;
            }
            zzZ(z2, dMax, z);
            zzZ(dZzZa, month, dMax, z2, dAbs, dFloor);
        }
    }

    private long zzY(zzDI zzdi) throws Exception {
        float fZzU = zzDG.zzU(this.zzZEz.zzaR(), zzdi);
        return com.aspose.words.internal.zzZPW.zzG(fZzU, fZzU);
    }

    private static int zzYD(double d) {
        if (d > 14.0d) {
            return 21;
        }
        if (d > 7.0d) {
            return 14;
        }
        if (d > 2.0d) {
            return 7;
        }
        return d > 1.0d ? 2 : 1;
    }

    private static int zzYE(double d) {
        if (d > 213.0d) {
            return 8;
        }
        if (d > 182.4d) {
            return 7;
        }
        if (d > 151.8d) {
            return 6;
        }
        if (d > 121.6d) {
            return 5;
        }
        if (d > 91.0d) {
            return 4;
        }
        if (d > 60.8d) {
            return 3;
        }
        return d > 30.4d ? 2 : 1;
    }

    private static com.aspose.words.internal.zzZQ9 zzZ(com.aspose.words.internal.zzZQ9 zzzq9, double d, int i) {
        return i != 1 ? i != 3 ? zzzq9.getDay() == com.aspose.words.internal.zzZQ9.zzZn(zzzq9.getYear(), zzzq9.getMonth()) ? zzzq9.zzZj(1.0d).zzRp((int) d).zzZj(-1.0d) : zzzq9.zzRp((int) d) : zzzq9.zzRo((int) d) : zzzq9.zzZj(d);
    }

    @Override // com.aspose.words.zzGG
    public final zzFA zzX(zzCF[] zzcfArr) {
        int length = this.zzZEz.getReverseOrder() ? 0 : zzcfArr.length;
        float fZzZ = zzZ(zzV(zzcfArr), this.zzZEz.getReverseOrder() ? -1 : 1, getBaseTimeUnit());
        return new zzFA(length, fZzZ, zzZ(zzcfArr, fZzZ));
    }

    @Override // com.aspose.words.zzGG
    public final double zzYF(double d) throws Exception {
        com.aspose.words.internal.zzZQ9 zzzq9ZzkT = com.aspose.words.internal.zzZQ9.zzZg(d).zzkT();
        com.aspose.words.internal.zzZQ9 zzzq9ZzkT2 = com.aspose.words.internal.zzZQ9.zzZg(zzZOR()).zzkT();
        int baseTimeUnit = getBaseTimeUnit();
        if (baseTimeUnit == 2) {
            zzzq9ZzkT = zzZ(zzzq9ZzkT2, (zzzq9ZzkT.getMonth() - zzzq9ZzkT2.getMonth()) + ((zzzq9ZzkT.getYear() - zzzq9ZzkT2.getYear()) * 12), 2);
        } else if (baseTimeUnit == 3) {
            zzzq9ZzkT = zzZ(zzzq9ZzkT2, zzzq9ZzkT.getYear() - zzzq9ZzkT2.getYear(), 3);
        }
        return (float) zzzq9ZzkT.zzkM();
    }

    @Override // com.aspose.words.zzGG
    public final zzCF[] zzZOZ() throws Exception {
        double majorUnit;
        double d;
        double minorUnit = this.zzZEz.getMinorUnit();
        if (this.zzZEz.getMinorUnitIsAuto()) {
            if (this.zzZEz.zz3Z()) {
                majorUnit = getMajorUnit();
                d = 2.0d;
            } else {
                majorUnit = getMajorUnit();
                d = 5.0d;
            }
            minorUnit = majorUnit / d;
        }
        if (minorUnit < 1.0d) {
            minorUnit = 1.0d;
        }
        com.aspose.words.internal.zzZQ9 zzzq9ZzP = zzP(zzZOV());
        com.aspose.words.internal.zzZQ9 zzzq9ZzO = zzO(zzZOV());
        ArrayList arrayList = new ArrayList();
        com.aspose.words.internal.zzZQ9 zzzq9ZzZ = zzzq9ZzP;
        int i = 0;
        while (com.aspose.words.internal.zzZQ9.zzY(zzzq9ZzZ, zzzq9ZzO)) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzE7>) arrayList, new zzE7(i, (float) zzzq9ZzZ.zzkM(), "", this.zzZEz.getDisplayUnit().zzaX()));
            i++;
            zzzq9ZzZ = zzZ(zzzq9ZzP.zzkT(), ((double) i) * minorUnit, this.zzZEz.getMinorUnitScale());
        }
        return (zzCF[]) arrayList.toArray(new zzCF[0]);
    }

    @Override // com.aspose.words.zzGG
    public final zzCF[] zzZ(zzCF[] zzcfArr) throws Exception {
        int i;
        zzU(zzcfArr);
        com.aspose.words.internal.zzZQ9 zzzq9ZzP = zzP(zzcfArr);
        com.aspose.words.internal.zzZQ9 zzzq9ZzO = zzO(zzcfArr);
        int i2 = 1;
        if (com.aspose.words.internal.zzZQ9.zzX(zzZ(zzzq9ZzP.zzkT(), 1.0d, getBaseTimeUnit()), zzzq9ZzO)) {
            com.aspose.words.internal.zzZQ9 zzzq9ZzZ = zzzq9ZzP;
            i = 1;
            while (com.aspose.words.internal.zzZQ9.zzX(zzzq9ZzZ, zzzq9ZzO)) {
                i++;
                zzzq9ZzZ = zzZ(zzzq9ZzP.zzkT(), i, getBaseTimeUnit());
            }
        } else {
            i = 1;
        }
        com.aspose.words.internal.zzZQ9 zzzq9 = new com.aspose.words.internal.zzZQ9(zzzq9ZzP.getYear(), zzzq9ZzP.getMonth(), zzzq9ZzP.getDay());
        zzCF[] zzcfArr2 = new zzCF[i];
        com.aspose.words.internal.zzZQ9 zzzq9ZzZ2 = zzzq9;
        com.aspose.words.internal.zzZQ9 zzzq9ZzZ3 = zzzq9ZzZ2;
        int i3 = 0;
        while (i3 < i) {
            if (com.aspose.words.internal.zzZQ9.zzZ(zzzq9ZzZ2, zzzq9ZzZ3)) {
                zzcfArr2[i3] = new zzE7(i3, zzzq9ZzZ3.zzkM(), this.zzZEz.getFormatCode(), this.zzZEz.getDisplayUnit().zzaX());
                zzzq9ZzZ2 = zzZ(zzzq9, ((double) i2) * getMajorUnit(), getMajorUnitScale());
                i2++;
            } else {
                zzcfArr2[i3] = new zzFA(i3, (float) zzzq9ZzZ3.zzkM(), false);
            }
            i3++;
            zzzq9ZzZ3 = zzZ(zzzq9, i3, getBaseTimeUnit());
        }
        return zzY(zzcfArr2);
    }

    private void zzZ(double d, int i, double d2, boolean z, double d3, double d4) {
        if (this.zzZEz.getMajorUnitIsAuto()) {
            int majorUnitScale = getMajorUnitScale();
            if (majorUnitScale == 2) {
                setMajorUnit(getBaseTimeUnit() == 2 ? ((int) (((double) i) / d4)) + 1 : zzYE(d2));
                return;
            } else if (majorUnitScale != 3) {
                setMajorUnit(zzYD(d2));
                return;
            } else {
                setMajorUnit(Math.max(1, (int) com.aspose.words.internal.zzZKQ.zzZa(d)));
                return;
            }
        }
        if (z) {
            if (getBaseTimeUnit() != 1) {
                setMajorUnitScale(getBaseTimeUnit());
                return;
            }
            if (d3 / getMajorUnit() <= d4) {
                setMajorUnitScale(1);
            } else if (Math.floor(d3 / (getMajorUnit() * 28.0d)) <= d4) {
                setMajorUnitScale(2);
            } else {
                setMajorUnitScale(3);
            }
        }
    }

    private void zzZ(boolean z, double d, boolean z2) {
        if (z) {
            if (getBaseTimeUnit() == 1) {
                if (d <= 217.0d) {
                    if (d < 18.0d && !z2) {
                        setMajorUnitScale(1);
                        return;
                    } else {
                        setMajorUnitScale(2);
                        return;
                    }
                }
            } else if (getBaseTimeUnit() == 2) {
                setMajorUnitScale(2);
                return;
            }
            setMajorUnitScale(3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005d A[PHI: r1
      0x005d: PHI (r1v6 long) = (r1v1 long), (r1v7 long) binds: [B:21:0x0067, B:17:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private double zzZ(zzCF[] zzcfArr, int i) throws Exception {
        zzGF zzgf;
        int iZzZ;
        zzDI zzdiZz43 = this.zzZEz.zz43();
        com.aspose.words.internal.zzZQ4 zzzq4Zz44 = this.zzZEz.zz44();
        zzHK zzhk = (zzHK) this.zzZEz.zzaR().zzZHh().zzLu(8);
        long jZzY = zzY(zzdiZz43);
        boolean z = zzhk != null;
        boolean z2 = this.zzZEz.getMajorUnitScale() == 0;
        float f = 1.0f;
        if (z && !zzDG.zzYd(this.zzZEz.zz3M())) {
            jZzY = zzZ(zzdiZz43, zzcfArr, zzzq4Zz44);
            if (!this.zzZEz.zz40() && com.aspose.words.internal.zzAN.zzZD(zzhk.zzZQQ())) {
            }
        } else if (!this.zzZEz.zz40()) {
            f = 1.2f;
        }
        long j = jZzY;
        float fZzZ = f;
        if (!this.zzZEz.zz3I().zz45().zzZQD() || this.zzZEz.zz40()) {
            zzgf = this;
        } else {
            zzgf = this;
            fZzZ = zzgf.zzZ(fZzZ, zzdiZz43, zzzq4Zz44, Float.intBitsToFloat((int) j), z);
        }
        if (!z && z2 && zzgf.zzZEz.getBaseTimeUnit() == 1 && i > 2) {
            iZzZ = zzgf.zzZ(zzzq4Zz44, j, i, zzcfArr[0], fZzZ);
        } else {
            iZzZ = zzZ(zzzq4Zz44, j, fZzZ);
        }
        return iZzZ;
    }

    private int zzZ(com.aspose.words.internal.zzZQ4 zzzq4, long j, int i, zzCF zzcf, float f) throws Exception {
        new zzHK(0.0d);
        float f2 = i - 1;
        float fIntBitsToFloat = (Float.intBitsToFloat((int) zzZ(this.zzZEz.zz43(), new zzCF[]{zzcf}, zzzq4)) + com.aspose.words.internal.zzSA.zzp(4.15d)) * 2.0f * f2;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) j) * f2 * 1.2f;
        if (fIntBitsToFloat <= zzzq4.getWidth() || fIntBitsToFloat2 >= zzzq4.getWidth()) {
            i = zzZ(zzzq4, j, f);
        }
        if (fIntBitsToFloat < zzzq4.getWidth()) {
            this.zzZEz.zzaR().zzZHh().zzX(new zzHK(-5400000.0d));
        }
        return i;
    }

    private int zzZ(com.aspose.words.internal.zzZQ4 zzzq4, long j, float f) {
        float height = this.zzZEz.zz40() ? zzzq4.getHeight() : zzzq4.getWidth();
        float fZzYz = this.zzZEz.zz40() ? com.aspose.words.internal.zzZPW.zzYz(j) : Float.intBitsToFloat((int) j) * f;
        if (fZzYz != 0.0f) {
            return (int) (height / fZzYz);
        }
        return -1;
    }

    private float zzZ(float f, zzDI zzdi, com.aspose.words.internal.zzZQ4 zzzq4, float f2, boolean z) {
        float f3 = zzdi.zzZIC().zzZdM;
        float fIntBitsToFloat = Float.intBitsToFloat((int) zzdi.zzZIz());
        float f4 = f2 / 2.0f;
        boolean z2 = zzzq4.getX() < f4;
        boolean z3 = (zzzq4.zzkw() + f3) + f4 > fIntBitsToFloat;
        boolean z4 = zzDG.zzYd(this.zzZEz.zz3M()) || com.aspose.words.internal.zzAN.zzZD(this.zzZEz.zz3M()) || !z;
        if ((z3 || z2) && z4) {
            return 1.1f;
        }
        return f;
    }

    private long zzZ(zzDI zzdi, zzCF[] zzcfArr, com.aspose.words.internal.zzZQ4 zzzq4) throws Exception {
        zzCK zzckZzZ = zzCK.zzZ(zzDG.zzRk(zzR(zzcfArr)), new zzCV(this.zzZEz.zzaR(), this.zzZEz.zzaQ(), zzdi.zzZIC().zzZMQ().zzZM7(), zzdi.zzZIC().zzZMQ().zzZM3(), zzdi.zzZIC().zzZMP(), zzzq4.getWidth()), zzdi, true);
        return com.aspose.words.internal.zzZPW.zzG(Math.max(zzckZzZ.zzZGm().getWidth(), 0.0f), Math.max(zzckZzZ.zzZGm().getHeight(), 0.0f));
    }

    private boolean zzZ(zzCF[] zzcfArr, float f) {
        zzCF zzcfZzQ = zzQ(zzcfArr);
        if (zzcfZzQ == null) {
            return false;
        }
        return com.aspose.words.internal.zzAN.zzS(f, zzZ(zzcfZzQ, getMajorUnit(), getMajorUnitScale()));
    }

    private static float zzZ(zzCF zzcf, double d, int i) {
        return (float) zzZ(com.aspose.words.internal.zzZQ9.zzZg(zzcf.getValue()), d, i).zzkM();
    }
}
