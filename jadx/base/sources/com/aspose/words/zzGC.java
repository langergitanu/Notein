package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzGC extends zzGG {
    private double zzZfr;
    private double zzZfs;
    private double zzZft;
    private boolean zzZfu;
    private boolean zzZfv;
    private boolean zzZfw;

    public zzGC(ChartAxis chartAxis) {
        super(chartAxis);
    }

    private double getLogBase() {
        return this.zzZEz.getScaling().getLogBase();
    }

    private void zzI(zzCF[] zzcfArr) {
        this.zzZfw = !this.zzZEz.getScaling().getMinimum().isAuto();
        this.zzZfv = !this.zzZEz.getScaling().getMaximum().isAuto();
        this.zzZfu = !this.zzZEz.getMajorUnitIsAuto();
        this.zzZft = this.zzZfw ? this.zzZEz.getScaling().getMinimum().getValue() : zzcfArr[0].getValue();
        this.zzZfs = this.zzZfv ? this.zzZEz.getScaling().getMaximum().getValue() : zzcfArr[zzcfArr.length - 1].getValue();
        double majorUnit = this.zzZfu ? this.zzZEz.getMajorUnit() : getLogBase();
        this.zzZfr = majorUnit;
        if (com.aspose.words.internal.zzAN.zzK(majorUnit, 1.0d)) {
            this.zzZfr = getLogBase();
        }
    }

    private double zzYv(double d) {
        if (com.aspose.words.internal.zzAN.zzK(d, 0.0d) || com.aspose.words.internal.zzAN.zzJ(d, 1.0d)) {
            return 1.0d;
        }
        double dZzZa = com.aspose.words.internal.zzZKQ.zzZa(com.aspose.words.internal.zzZKQ.zzE(d, getLogBase()));
        double dPow = Math.pow(getLogBase(), dZzZa);
        while (dPow > d) {
            dZzZa -= 1.0d;
            dPow = Math.pow(getLogBase(), dZzZa);
        }
        return dPow;
    }

    private double zzYw(double d) {
        double dZzZa = com.aspose.words.internal.zzZKQ.zzZa(com.aspose.words.internal.zzZKQ.zzE(d, getLogBase()));
        double dPow = Math.pow(getLogBase(), dZzZa);
        while (dPow < d) {
            dZzZa += 1.0d;
            dPow = Math.pow(getLogBase(), dZzZa);
        }
        return dPow;
    }

    @Override // com.aspose.words.zzGG
    public final zzCF[] zzZ(zzCF[] zzcfArr) {
        zzI(zzcfArr);
        boolean z = this.zzZfv;
        double dZzYw = this.zzZfs;
        if (!z) {
            dZzYw = zzYw(dZzYw);
        }
        this.zzZfs = dZzYw;
        boolean z2 = this.zzZfw;
        double dZzYv = this.zzZft;
        if (!z2) {
            dZzYv = zzYv(dZzYv);
        }
        this.zzZft = dZzYv;
        double dZzE = com.aspose.words.internal.zzZKQ.zzE(dZzYv, this.zzZfr);
        ArrayList arrayList = new ArrayList();
        double d = -1.7976931348623157E308d;
        int i = 0;
        while (d < this.zzZfs) {
            double dPow = Math.pow(this.zzZfr, dZzE);
            double d2 = this.zzZfs;
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<Object>) arrayList, (dPow <= d2 || com.aspose.words.internal.zzAN.zzL(dPow, d2)) ? new zzE7(i, dPow, this.zzZEz.getFormatCode(), this.zzZEz.getDisplayUnit().zzaX()) : new zzFA(i, this.zzZfs, false));
            i++;
            dZzE += 1.0d;
            d = dPow;
        }
        return (zzCF[]) arrayList.toArray(new zzCF[0]);
    }

    @Override // com.aspose.words.zzGG
    public final double zzZOT() throws Exception {
        return Math.abs(com.aspose.words.internal.zzZKQ.zzE(zzZOS(), getLogBase()) - com.aspose.words.internal.zzZKQ.zzE(zzZOR(), getLogBase()));
    }

    @Override // com.aspose.words.zzGG
    public final double zzZOW() throws Exception {
        if (zzZOS() < 1.0d) {
            return zzZOS();
        }
        if (zzZOR() > 1.0d) {
            return zzZOR();
        }
        return 1.0d;
    }

    @Override // com.aspose.words.zzGG
    public final zzCF[] zzZOZ() {
        ArrayList arrayList = new ArrayList();
        double dMax = Math.max(this.zzZEz.getMinorUnitIsAuto() ? this.zzZfr : this.zzZEz.getMinorUnit(), getLogBase());
        double dPow = dMax / Math.pow(getLogBase(), ((double) ((int) com.aspose.words.internal.zzZKQ.zzE(dMax, getLogBase()))) - 1.0d);
        double logBase = (this.zzZft / getLogBase()) * dPow;
        int i = 0;
        while (com.aspose.words.internal.zzAN.zzK(logBase, this.zzZfs)) {
            int i2 = 1;
            int i3 = i;
            while (true) {
                double d = i2;
                if (d < getLogBase()) {
                    double d2 = d * logBase;
                    if (d2 > this.zzZfs) {
                        logBase = d2;
                        break;
                    }
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzE7>) arrayList, new zzE7(i3, d2, this.zzZEz.getFormatCode(), this.zzZEz.getDisplayUnit().zzaX()));
                    i3++;
                    i2++;
                }
            }
            logBase *= dPow;
            i = i3;
        }
        return (zzCF[]) arrayList.toArray(new zzCF[0]);
    }
}
