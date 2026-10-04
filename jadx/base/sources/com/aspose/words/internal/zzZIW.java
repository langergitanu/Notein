package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZIW {

    public static class zzZ extends zzZIW {
        public double zzZJA;
        public double zzZJB;
        public double zzZJu;
        public double zzZJv;

        public zzZ() {
        }

        private void zzV(double d, double d2, double d3, double d4) {
            this.zzZJB = d;
            this.zzZJA = d2;
            this.zzZJv = d3;
            this.zzZJu = d4;
        }

        private static double zzY(double d, double d2, double d3, double d4, double d5, double d6) {
            return Math.sqrt(zzZIW.zzX(d, d2, d3, d4, d5, d6));
        }

        @Override // com.aspose.words.internal.zzZIW
        public final double zzZ(zzZIV zzziv) {
            return zzY(this.zzZJB, this.zzZJA, this.zzZJv, this.zzZJu, zzziv.zzQb(), zzziv.zzYm());
        }

        @Override // com.aspose.words.internal.zzZIW
        public final double zzde() {
            return this.zzZJu;
        }

        @Override // com.aspose.words.internal.zzZIW
        public final double zzdf() {
            return this.zzZJv;
        }

        @Override // com.aspose.words.internal.zzZIW
        public final double zzdg() {
            return this.zzZJA;
        }

        @Override // com.aspose.words.internal.zzZIW
        public final double zzdh() {
            return this.zzZJB;
        }

        public zzZ(zzZIV zzziv, zzZIV zzziv2) {
            zzV(zzziv.zzQb(), zzziv.zzYm(), zzziv2.zzQb(), zzziv2.zzYm());
        }

        public zzZ(double d, double d2, double d3, double d4) {
            zzV(d, d2, d3, d4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000f A[PHI: r10 r12
      0x000f: PHI (r10v5 double) = (r10v1 double), (r10v2 double) binds: [B:3:0x000d, B:6:0x001c] A[DONT_GENERATE, DONT_INLINE]
      0x000f: PHI (r12v7 double) = (r12v1 double), (r12v2 double) binds: [B:3:0x000d, B:6:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static double zzX(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7;
        double d8 = d3 - d;
        double d9 = d4 - d2;
        double d10 = d5 - d;
        double d11 = d6 - d2;
        if ((d11 * d9) + (d10 * d8) <= 0.0d) {
            d7 = 0.0d;
        } else {
            d10 = d8 - d10;
            d11 = d9 - d11;
            double d12 = (d11 * d9) + (d10 * d8);
            if (d12 > 0.0d) {
                d7 = (d12 * d12) / ((d9 * d9) + (d8 * d8));
            }
        }
        double d13 = ((d11 * d11) + (d10 * d10)) - d7;
        if (d13 < 0.0d) {
            return 0.0d;
        }
        return d13;
    }

    private static double zzY(double d, double d2, double d3, double d4, double d5, double d6) {
        return Math.sqrt(zzX(d, d2, d3, d4, d5, d6));
    }

    public double zzZ(zzZIV zzziv) {
        return zzY(zzdh(), zzdg(), zzdf(), zzde(), zzziv.zzQb(), zzziv.zzYm());
    }

    public abstract double zzde();

    public abstract double zzdf();

    public abstract double zzdg();

    public abstract double zzdh();
}
