package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzHJ implements zzZC4, Cloneable {
    private zzJI zzZgV;
    private zzJJ zzZgW;
    private zzJJ zzZgX;
    private zzJI zzZgY;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    private static double zzH(double d, double d2, double d3) {
        return Math.atan2(Math.sin(d3) * (d2 < 1.0d ? 1.0d : 1.0d / d2), Math.cos(d3) * (d >= 1.0d ? 1.0d / d : 1.0d));
    }

    public final void zzY(zzJI zzji) {
        this.zzZgV = zzji;
    }

    public final void zzZ(zzJI zzji) {
        this.zzZgY = zzji;
    }

    @Override // com.aspose.words.zzZC4
    public final zzZC4 zzZQP() {
        zzHJ zzhj = (zzHJ) memberwiseClone();
        zzJI zzji = this.zzZgY;
        if (zzji != null) {
            zzhj.zzZgY = zzji.zzZSr();
        }
        zzJI zzji2 = this.zzZgV;
        if (zzji2 != null) {
            zzhj.zzZgV = zzji2.zzZSr();
        }
        return zzhj;
    }

    public final void zzY(zzJJ zzjj) {
        this.zzZgW = zzjj;
    }

    public final void zzZ(zzJJ zzjj) {
        this.zzZgX = zzjj;
    }

    @Override // com.aspose.words.zzZC4
    public final void zzZ(zzZC2 zzzc2, com.aspose.words.internal.zzP5 zzp5) {
        double dZzZ = this.zzZgY.zzZ(zzzc2.zzZvc());
        double dZzZ2 = this.zzZgV.zzZ(zzzc2.zzZvc());
        if (dZzZ >= 1.0d || dZzZ2 >= 1.0d) {
            double dZzY = this.zzZgX.zzY(zzzc2.zzZvc());
            double dZzY2 = this.zzZgW.zzY(zzzc2.zzZvc());
            long jZzDs = zzzc2.zzDs();
            double dZzZ3 = zzzc2.zzZ(this.zzZgY, false);
            double dZzZ4 = zzzc2.zzZ(this.zzZgV, true);
            double dZzH = zzH(dZzZ2, dZzZ, dZzY);
            double dZzZa = com.aspose.words.internal.zzZKQ.zzZa(((double) Float.intBitsToFloat((int) jZzDs)) - (Math.cos(dZzH) * dZzZ4));
            double dZzZa2 = com.aspose.words.internal.zzZKQ.zzZa(((double) com.aspose.words.internal.zzZPY.zzYC(jZzDs)) - (Math.sin(dZzH) * dZzZ3));
            if (dZzZ >= 1.0d && dZzZ2 >= 1.0d) {
                com.aspose.words.internal.zzQ5 zzq5 = new com.aspose.words.internal.zzQ5(new com.aspose.words.internal.zzZQ4((float) (dZzZa - dZzZ4), (float) (dZzZa2 - dZzZ3), (float) (dZzZ4 * 2.0d), (float) (dZzZ3 * 2.0d)), com.aspose.words.internal.zzAN.zzZK(dZzY), com.aspose.words.internal.zzAN.zzZK(dZzY2), dZzZ2 * 2.0d, dZzZ * 2.0d);
                zzp5.zzZ(zzq5);
                zzzc2.zzXS(zzq5.zzPW());
            } else {
                long jZzG = com.aspose.words.internal.zzZPY.zzG(String.length(), (float) ((Math.sin(zzH(dZzZ2, dZzZ, dZzY + dZzY2)) * dZzZ3) + dZzZa2));
                zzp5.zzR(jZzDs, jZzG);
                zzzc2.zzXS(jZzG);
            }
        }
    }

    @Override // com.aspose.words.zzZC4
    public final void zzZ(zzZYD zzzyd) {
        zzzyd.zzX("a:arcTo", "hR", this.zzZgY.getString(), "wR", this.zzZgV.getString(), "stAng", this.zzZgX.getString(), "swAng", this.zzZgW.getString());
    }
}
