package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzHK implements Cloneable {
    private double zzE0;
    private double zzZgZ;

    public zzHK() {
        this(0.0d);
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public static zzHK zzYQ(double d) {
        return new zzHK(com.aspose.words.internal.zzSA.zzj(d));
    }

    public static zzHK zzYR(double d) {
        return new zzHK(d * 60000.0d);
    }

    public static zzHK zzYS(double d) {
        zzHK zzhk = new zzHK(d);
        zzhk.zzZQS();
        return zzhk;
    }

    private void zzZQS() {
        if (Math.abs(this.zzE0) > 2.16E7d) {
            this.zzE0 %= 2.16E7d;
        }
        while (true) {
            double d = this.zzE0;
            if (d >= 0.0d) {
                return;
            } else {
                this.zzE0 = d + 2.16E7d;
            }
        }
    }

    public boolean equals(Object obj) {
        if (com.aspose.words.internal.zzZKO.zzA(null, obj)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, obj)) {
            return true;
        }
        if (obj.getClass() != zzHK.class) {
            return false;
        }
        return zzZ((zzHK) obj);
    }

    public final double getValue() {
        return this.zzE0;
    }

    public int hashCode() {
        return com.aspose.words.internal.zzZKP.zzZ9(this.zzE0);
    }

    public final boolean zzZ(zzHK zzhk) {
        if (com.aspose.words.internal.zzZKO.zzA(null, zzhk)) {
            return false;
        }
        return com.aspose.words.internal.zzZKO.zzA(this, zzhk) || zzhk.zzE0 == this.zzE0;
    }

    public final double zzZQQ() {
        return this.zzE0 / 60000.0d;
    }

    public final double zzZQR() {
        return com.aspose.words.internal.zzSA.zzk(this.zzE0);
    }

    public final zzHK zzZQT() {
        return (zzHK) memberwiseClone();
    }

    public zzHK(double d) {
        this.zzE0 = d;
        this.zzZgZ = d;
    }
}
