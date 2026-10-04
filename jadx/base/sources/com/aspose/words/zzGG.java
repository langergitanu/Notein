package com.aspose.words;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzGG {
    ChartAxis zzZEz;
    private zzCF[] zzZfD;
    private zzCF[] zzZfE;
    private double zzZfF;
    private int zzZfG;
    private int zzZfH;
    private boolean zzZfz;
    private int zzZfC = -1;
    private int zzZfB = -1;
    private com.aspose.words.internal.zzD3<zzCF> zzZfA = new com.aspose.words.internal.zzD3<>();
    private double zzZfy = Double.NaN;

    public zzGG(ChartAxis chartAxis) {
        this.zzZEz = chartAxis;
        this.zzZfH = chartAxis.getBaseTimeUnit();
        this.zzZfG = this.zzZEz.getMajorUnitScale();
        this.zzZfF = this.zzZEz.getMajorUnit();
        if (chartAxis.zz44() == null) {
            this.zzZEz.zz0(com.aspose.words.internal.zzZQ4.zz2T);
        }
    }

    public static zzGG zzQ(ChartAxis chartAxis) {
        int type = chartAxis.getType();
        return type != 0 ? type != 2 ? new zzGH(chartAxis) : chartAxis.zz3K() ? new zzGC(chartAxis) : new zzGD(chartAxis) : chartAxis.zz4q() ? new zzGF(chartAxis) : new zzGH(chartAxis);
    }

    private int zzW(zzCF[] zzcfArr) {
        if (this.zzZEz.getReverseOrder()) {
            return 0;
        }
        return zzcfArr.length - 1;
    }

    private double zzZOX() throws Exception {
        double dZzZOR = this.zzZEz.zz41().zzZOR();
        double dZzZOS = this.zzZEz.zz41().zzZOS();
        double crossesAt = this.zzZEz.zz3Y().getCrossesAt();
        return (this.zzZEz.getType() == 1 || (this.zzZEz.zz3Z() && !this.zzZEz.zz4q())) ? (Math.max(crossesAt, 1.0d) + dZzZOR) - 1.0d : (com.aspose.words.internal.zzAN.zzK(crossesAt, dZzZOS) && com.aspose.words.internal.zzAN.zzJ(crossesAt, dZzZOR)) ? crossesAt : crossesAt > dZzZOS ? dZzZOS : dZzZOR;
    }

    private double zzZOY() throws Exception {
        int crosses = this.zzZEz.zz3Y().getCrosses();
        return crosses != 1 ? crosses != 2 ? crosses != 3 ? zzZOW() : zzZOX() : this.zzZEz.zz41().zzZOR() : this.zzZEz.zz41().zzZOS();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zzCF[] zzZP0() throws Exception {
        int count;
        if (!this.zzZEz.zz3X() || this.zzZfA.getCount() == 0) {
            count = this.zzZfA.getCount() > 2 ? this.zzZfA.getCount() : 2;
        }
        zzCF[] zzcfArr = new zzCF[count];
        Iterator<zzCF> it = this.zzZfA.zzCJ().iterator();
        int i = 0;
        while (it.hasNext()) {
            zzcfArr[i] = it.next();
            i++;
        }
        while (i < count) {
            zzcfArr[i] = new zzFA(i, i == 0 ? 0 : ((int) zzcfArr[i - 1].getValue()) + 1);
            i++;
        }
        Arrays.sort(zzcfArr);
        return zzZ(zzcfArr);
    }

    public final int getBaseTimeUnit() {
        return this.zzZfH;
    }

    public final double getMajorUnit() {
        return this.zzZfF;
    }

    public final int getMajorUnitScale() {
        return this.zzZfG;
    }

    public final void setBaseTimeUnit(int i) {
        this.zzZfH = i;
    }

    public final void setMajorUnit(double d) {
        this.zzZfF = d;
    }

    public final void setMajorUnitScale(int i) {
        this.zzZfG = i;
    }

    public final void zzU(zzCF zzcf) {
        if (zzcf == null) {
            return;
        }
        int type = this.zzZEz.getType();
        if (type == 0 || type == 1) {
            this.zzZfA.set(zzcf.getIndex(), zzcf);
            return;
        }
        if (type != 2 || zzDG.zzZ(this.zzZEz, zzcf.getValue()) || Double.isNaN(zzcf.getValue())) {
            return;
        }
        zzCF zzcf2 = this.zzZfA.get(0);
        if (zzcf2 == null || zzcf.getValue() < zzcf2.getValue()) {
            this.zzZfA.set(0, zzcf);
        }
        zzCF zzcf3 = this.zzZfA.get(1);
        if (zzcf3 == null || zzcf.getValue() > zzcf3.getValue()) {
            this.zzZfA.set(1, zzcf);
        }
    }

    public final zzCF zzV(zzCF[] zzcfArr) {
        return zzcfArr[zzW(zzcfArr)];
    }

    public zzFA zzX(zzCF[] zzcfArr) {
        return new zzFA(this.zzZEz.getReverseOrder() ? 0 : zzcfArr.length, zzZ(zzcfArr[zzW(zzcfArr)], zzcfArr), true);
    }

    public final void zzY(zzGG zzgg) {
        Iterator<zzCF> it = this.zzZfA.zzCJ().iterator();
        while (it.hasNext()) {
            zzgg.zzU(it.next());
        }
    }

    public final int zzY9(int i, int i2) {
        float height = this.zzZEz.zz40() ? this.zzZEz.zz44().getHeight() : this.zzZEz.zz44().getWidth();
        int i3 = i / i2;
        if (com.aspose.words.internal.zzAN.zzR(height, 0.0f)) {
            i = 2;
        } else if (height / i3 < 635.0d) {
            i = (int) (((double) height) / 635.0d);
        }
        return Math.max(1, i);
    }

    public double zzYF(double d) throws Exception {
        return d;
    }

    public final double zzYG(double d) throws Exception {
        double dZzYF = zzYF(d);
        if (dZzYF < zzZOR() || dZzYF > zzZOS()) {
            return dZzYF;
        }
        int length = this.zzZfE.length;
        int i = -1;
        while (length - i > 1) {
            int iZzZa = (int) com.aspose.words.internal.zzZKQ.zzZa(((double) (i + length)) / 2.0d);
            if (com.aspose.words.internal.zzAN.zzK(this.zzZfE[iZzZa].getValue(), dZzYF)) {
                i = iZzZa;
            } else {
                length = iZzZa;
            }
        }
        zzCF[] zzcfArr = this.zzZfE;
        if (length >= zzcfArr.length) {
            length = zzcfArr.length - 1;
        }
        if (i < 0) {
            i = 0;
        }
        return (Math.abs(zzcfArr[length].getValue() - dZzYF) > Math.abs(this.zzZfE[i].getValue() - dZzYF) ? this.zzZfE[i] : zzZOV()[length]).getValue();
    }

    public final void zzZ(zzFD zzfd, zzF7 zzf7, int i) {
        zzY(zzfd, i);
        if (zzf7 == null) {
            return;
        }
        if (zzf7.zzZMc()) {
            zzY(zzf7.zzZMf(), i);
        }
        if (zzf7.zzZMb()) {
            zzY(zzf7.zzZMe(), i);
        }
    }

    public abstract zzCF[] zzZ(zzCF[] zzcfArr) throws Exception;

    public final com.aspose.words.internal.zzD3<zzCF> zzZOL() {
        return this.zzZfA;
    }

    public final double zzZOM() throws Exception {
        int position = this.zzZEz.zz3Y().getTickLabels().getPosition();
        return position != 0 ? position != 1 ? zzZON() : zzZOR() : zzZOS();
    }

    public final double zzZON() throws Exception {
        if (Double.isNaN(this.zzZfy)) {
            this.zzZfy = zzZOY();
        }
        return this.zzZfy;
    }

    public final int zzZOO() throws Exception {
        if (this.zzZfB < 0) {
            this.zzZfB = 0;
            for (zzCF zzcf : zzZOV()) {
                if (zzcf.getValueType() != 0) {
                    this.zzZfB++;
                }
            }
            this.zzZfB = Math.max(2, this.zzZfB);
        }
        return this.zzZfB;
    }

    public final int zzZOP() throws Exception {
        if (this.zzZfC < 0) {
            this.zzZfC = 0;
            for (zzCF zzcf : zzZOV()) {
                if (zzcf.isVisible()) {
                    this.zzZfC++;
                }
            }
        }
        return this.zzZfC;
    }

    public final boolean zzZOQ() {
        return this.zzZfA.getCount() > 0;
    }

    public final double zzZOR() throws Exception {
        return zzZOV()[0].getValue();
    }

    public final double zzZOS() throws Exception {
        return zzZOV()[zzZOV().length - 1].getValue();
    }

    public double zzZOT() throws Exception {
        return Math.abs(zzZOS() - zzZOR());
    }

    public final zzCF[] zzZOU() throws Exception {
        if (this.zzZfD == null) {
            this.zzZfD = zzZOZ();
        }
        return this.zzZfD;
    }

    public final zzCF[] zzZOV() throws Exception {
        if (this.zzZfE == null) {
            this.zzZfE = zzZP0();
        }
        return this.zzZfE;
    }

    public double zzZOW() throws Exception {
        return zzZOR();
    }

    public zzCF[] zzZOZ() throws Exception {
        double minorUnit = this.zzZEz.getMinorUnit();
        int tickMarkSpacing = this.zzZEz.zz4e() ? 1 : this.zzZEz.getTickMarkSpacing();
        double dAbs = Math.abs(zzZOV()[1].getValue() - zzZOV()[0].getValue());
        if (this.zzZEz.getMinorUnitIsAuto() || this.zzZEz.zz4q()) {
            minorUnit = dAbs / (this.zzZEz.zz3Z() ? 2.0d : 5.0d);
        }
        double d = dAbs / 100.0d;
        if (minorUnit < d) {
            minorUnit = d;
        }
        int iZzZa = (int) com.aspose.words.internal.zzZKQ.zzZa(zzZOT() / minorUnit);
        int iZzY9 = zzY9(iZzZa, tickMarkSpacing);
        if (iZzZa != iZzY9) {
            minorUnit = zzZOT() / ((double) iZzY9);
        }
        zzCF[] zzcfArr = new zzCF[iZzY9 + 1];
        for (int i = 0; i <= iZzY9; i++) {
            zzcfArr[i] = new zzE7(i, (((double) i) * minorUnit) + zzZOR(), this.zzZEz.getFormatCode(), this.zzZEz.getDisplayUnit().zzaX());
        }
        return zzcfArr;
    }

    public final void zzZP1() {
        zzGQ zzgq = (zzGQ) com.aspose.words.internal.zzZKW.zzZ(this.zzZEz.zz3I(), zzGQ.class);
        if (zzgq != null && this.zzZEz.getType() == 2 && this.zzZfA.getCount() >= 2) {
            zzE7 zze7 = (zzE7) com.aspose.words.internal.zzZKW.zzZ(this.zzZfA.get(0), zzE7.class);
            zzE7 zze72 = (zzE7) com.aspose.words.internal.zzZKW.zzZ(this.zzZfA.get(1), zzE7.class);
            if (zzCF.zzR(zze7) || zzCF.zzR(zze72)) {
                return;
            }
            double dZzZ = zzZ(zzgq, zzgq.zzZPB(), (float) (zze72.getValue() - Math.min(zze7.getValue(), 0.0d)));
            zzU(new zzE7(0, zze7.getValue() - dZzZ, zze7.getFormatCode()));
            zzU(new zzE7(1, zze72.getValue() + dZzZ, zze72.getFormatCode()));
        }
    }

    private void zzY(zzFD zzfd, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            zzCF zzcfZzL0 = zzfd.zzL0(i2);
            if (i2 == 0) {
                zzZ(zzfd, zzcfZzL0);
            }
            zzU(zzcfZzL0);
        }
        this.zzZfz = true;
    }

    private static float zzZ(zzGQ zzgq, float f, float f2) {
        float fZzZPB = (f / zzgq.zzZPB()) * (f2 / 8.0f);
        if (zzgq.zzZPD() == 0) {
            fZzZPB = (float) Math.sqrt(fZzZPB * r3);
        }
        return (zzgq.zzZPE() / 100.0f) * fZzZPB;
    }

    public final zzCF[] zzY(zzCF[] zzcfArr) throws Exception {
        if (!this.zzZEz.zz3X()) {
            return zzcfArr;
        }
        zzCF[] zzcfArr2 = new zzCF[zzcfArr.length + 1];
        boolean reverseOrder = this.zzZEz.getReverseOrder();
        System.arraycopy(zzcfArr, 0, zzcfArr2, reverseOrder ? 1 : 0, zzcfArr.length);
        zzcfArr2[zzW(zzcfArr2)] = zzX(zzcfArr);
        return zzcfArr2;
    }

    private void zzZ(zzFD zzfd, zzCF zzcf) {
        String formatCode;
        if ((this.zzZEz.zz4d() == null || this.zzZEz.zz4d().zzZLb()) && !this.zzZfz) {
            zzE7 zze7 = (zzE7) com.aspose.words.internal.zzZKW.zzZ(zzcf, zzE7.class);
            if (this.zzZEz.zz3I().zz3S() && this.zzZEz.getType() == 2) {
                formatCode = "0%";
            } else if (zze7 != null && zze7.getFormatCode() != null) {
                formatCode = zze7.getFormatCode();
            } else if (zzfd.zzZMv() != null && zzfd.zzZMv().getFormatCode() != null) {
                formatCode = zzfd.zzZMv().getFormatCode();
            } else {
                formatCode = "";
            }
            if (zzEW.zzRu(formatCode)) {
                return;
            }
            this.zzZEz.setFormatCode(formatCode);
        }
    }

    private float zzZ(zzCF zzcf, zzCF[] zzcfArr) {
        float majorUnit = (this.zzZEz.getMajorUnitIsAuto() || this.zzZEz.zz4q()) ? 1.0f : (float) this.zzZEz.getMajorUnit();
        if (this.zzZEz.getReverseOrder()) {
            majorUnit = -majorUnit;
        }
        if (zzcfArr[0].isDate() && this.zzZEz.getBaseTimeUnit() == 0) {
            majorUnit = (((float) zzcfArr[zzcfArr.length - 1].getValue()) - ((float) zzcfArr[0].getValue())) / (zzcfArr.length - 1);
        }
        return ((float) zzcf.getValue()) + majorUnit;
    }
}
