package com.aspose.words.internal;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZIV {

    public static class zzZ extends zzZIV implements Serializable {

        /* JADX INFO: renamed from: x */
        public double f51310x;

        /* JADX INFO: renamed from: y */
        public double f51311y;

        public zzZ() {
        }

        public final String toString() {
            return "Point2D.Double[" + this.f51310x + ", " + this.f51311y + "]";
        }

        @Override // com.aspose.words.internal.zzZIV
        public final void zzC(double d, double d2) {
            this.f51310x = d;
            this.f51311y = d2;
        }

        @Override // com.aspose.words.internal.zzZIV
        public final double zzQb() {
            return this.f51310x;
        }

        @Override // com.aspose.words.internal.zzZIV
        public final double zzYm() {
            return this.f51311y;
        }

        public zzZ(double d, double d2) {
            this.f51310x = d;
            this.f51311y = d2;
        }
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof zzZIV)) {
            return super.equals(obj);
        }
        zzZIV zzziv = (zzZIV) obj;
        return zzQb() == zzziv.zzQb() && zzYm() == zzziv.zzYm();
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(zzQb()) ^ (Double.doubleToLongBits(zzYm()) * 31);
        return ((int) (jDoubleToLongBits >> 32)) ^ ((int) jDoubleToLongBits);
    }

    public final double zzB(double d, double d2) {
        double dZzQb = d - zzQb();
        double dZzYm = d2 - zzYm();
        return Math.sqrt((dZzYm * dZzYm) + (dZzQb * dZzQb));
    }

    public abstract void zzC(double d, double d2);

    public abstract double zzQb();

    public final double zzX(zzZIV zzziv) {
        double dZzQb = zzziv.zzQb() - zzQb();
        double dZzYm = zzziv.zzYm() - zzYm();
        return Math.sqrt((dZzYm * dZzYm) + (dZzQb * dZzQb));
    }

    public final double zzY(zzZIV zzziv) {
        double dZzQb = zzziv.zzQb() - zzQb();
        double dZzYm = zzziv.zzYm() - zzYm();
        return (dZzYm * dZzYm) + (dZzQb * dZzQb);
    }

    public abstract double zzYm();
}
