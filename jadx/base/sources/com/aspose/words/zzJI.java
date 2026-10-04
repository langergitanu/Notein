package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzJI implements Cloneable {
    private String zzZPH;

    public zzJI(double d) {
        this.zzZPH = com.aspose.words.internal.zzJB.zzZT(d);
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final String getString() {
        return this.zzZPH;
    }

    public final double zzZ(zzZCC zzzcc) {
        double dZzZs = com.aspose.words.internal.zzJB.zzZs(this.zzZPH);
        if (!Double.isNaN(dZzZs)) {
            return dZzZs;
        }
        double dZzR = zzYU4.zzR(this.zzZPH, null);
        return !Double.isNaN(dZzR) ? dZzR : zz7K.zzZ(this.zzZPH, zzzcc);
    }

    public final zzJI zzZSr() {
        return (zzJI) memberwiseClone();
    }

    public zzJI(String str) {
        if (!com.aspose.words.internal.zzZYD.zzXk(str)) {
            this.zzZPH = "0";
        } else {
            this.zzZPH = str;
        }
    }
}
