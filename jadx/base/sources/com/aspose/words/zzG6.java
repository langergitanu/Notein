package com.aspose.words;

import com.aspose.words.ref.RefPointF;

/* JADX INFO: loaded from: classes6.dex */
final class zzG6 {
    private double zzKu;
    private com.aspose.words.internal.zzZQ4 zzZfd;
    private com.aspose.words.internal.zzZQ4 zzZfe;
    private double zzZff;
    private zzFR zzZfg;
    private double zzZi5;

    private zzG6(zzFR zzfr) {
        this.zzZfg = zzfr;
        double dZzZS3 = zzfr.zzZS3();
        double dZzZNj = zzfr.zzZNj();
        if (dZzZNj < 0.0d) {
            dZzZS3 += dZzZNj;
            dZzZNj = Math.abs(dZzZNj);
        }
        this.zzKu = com.aspose.words.internal.zzAN.zzZJ(dZzZS3);
        this.zzZff = zzfr.zzZNi();
        this.zzZi5 = com.aspose.words.internal.zzAN.zzZJ(this.zzKu + dZzZNj);
        this.zzZfe = zzZOf();
        this.zzZfd = zzZOe();
    }

    private static long zzY(com.aspose.words.internal.zzZQ4 zzzq4, double d) {
        return new com.aspose.words.internal.zzQ5(zzzq4, 0.0d, d).zzPW();
    }

    private static boolean zzYs(double d) {
        return com.aspose.words.internal.zzAN.zzK(d, 270.0d) && d > 180.0d;
    }

    private static boolean zzYt(double d) {
        return com.aspose.words.internal.zzAN.zzK(d, 180.0d) && d > 90.0d;
    }

    private static boolean zzYu(double d) {
        return com.aspose.words.internal.zzAN.zzK(d, 90.0d) && d > 0.0d;
    }

    private float zzZ(long j, long j2, long j3, double d, com.aspose.words.internal.zzZQ4 zzzq4) {
        int i = (int) j;
        int iZzPT = (int) this.zzZfg.zzPT();
        float fMax = Float.intBitsToFloat(i) > Float.intBitsToFloat(iZzPT) ? Math.max(Float.intBitsToFloat((int) j2), Float.intBitsToFloat((int) j3)) : Math.min(Float.intBitsToFloat((int) j2), Float.intBitsToFloat((int) j3));
        long jZzY = zzY(zzzq4, ((double) ((zzYu(d) || zzYt(d)) ? 180 : 540)) - d);
        return Float.intBitsToFloat(i) > Float.intBitsToFloat(iZzPT) ? Math.max(fMax, Float.intBitsToFloat((int) jZzY)) : Math.min(fMax, Float.intBitsToFloat((int) jZzY));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private com.aspose.words.internal.zzZQ4 zzZF(com.aspose.words.internal.zzZQ4 zzzq4) {
        zzG6 zzg6 = this;
        com.aspose.words.internal.zzZQ4 zzzq42 = zzzq4;
        double dZzZNj = zzg6.zzZfg.zzZNj() / 1000.0d;
        double d = zzg6.zzKu;
        if (d > zzg6.zzZi5) {
            d -= 360.0d;
        }
        long jZzPT = zzg6.zzZfg.zzPT();
        long jZzY = zzY(zzzq42, zzg6.zzKu);
        long jZzY2 = zzY(zzzq42, zzg6.zzZi5);
        float height = zzg6.zzZfg.zzZNk().getHeight();
        float fMin = 0.0f;
        double d2 = d + dZzZNj;
        float fMin2 = 0.0f;
        float f = 0.0f;
        while (d2 < zzg6.zzZi5) {
            double d3 = d2 < 0.0d ? d2 + 360.0d : d2;
            float f2 = fMin2;
            float f3 = f;
            long jZzY3 = zzY(zzzq42, d3);
            double d4 = dZzZNj;
            int i = (int) jZzY3;
            long jZzG = com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat(i), (((zzYu(d3) || zzYt(d3)) ? -1.0f : 1.0f) * height) + com.aspose.words.internal.zzZPY.zzYC(jZzY3));
            double dZzv = zz3N.zzv(jZzG, jZzPT);
            zzg6 = this;
            double d5 = d3;
            float f4 = fMin;
            long jZzZ = zzg6.zzZ(jZzY3, zzzq42, d5, jZzY, jZzY2);
            long jZzZ2 = zzg6.zzZ(jZzG, zzzq42, dZzv, jZzY, jZzY2);
            long j = jZzY;
            long j2 = jZzY2;
            float fZzZ = zzg6.zzZ(jZzY3, jZzZ, jZzZ2, d5, zzzq42);
            long jZzG2 = com.aspose.words.internal.zzZPY.zzG(fZzZ, com.aspose.words.internal.zzZPY.zzYC(jZzZ));
            if (zzZ(jZzPT, zzg6.zzZfg.zzZS3(), zzg6.zzZfg.zzZNj(), zzzq4.getWidth() / 2.0f, zzzq4.getHeight() / 2.0f, jZzY3, jZzG2, com.aspose.words.internal.zzZPY.zzG(fZzZ, com.aspose.words.internal.zzZPY.zzYC(jZzZ2)), jZzG)) {
                int i2 = (int) jZzG2;
                float fAbs = Math.abs(Float.intBitsToFloat(i) - Float.intBitsToFloat(i2));
                if (fAbs > f3) {
                    fMin = Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
                    f = fAbs;
                    fMin2 = Math.min(com.aspose.words.internal.zzZPY.zzYC(jZzY3), com.aspose.words.internal.zzZPY.zzYC(jZzG));
                } else {
                    f = f3;
                    fMin = f4;
                    fMin2 = f2;
                }
            }
            d2 += d4;
            zzzq42 = zzzq4;
            dZzZNj = d4;
            jZzY = j;
            jZzY2 = j2;
        }
        return new com.aspose.words.internal.zzZQ4(fMin, fMin2, f, zzg6.zzZfg.zzZNk().getHeight());
    }

    private com.aspose.words.internal.zzZQ4 zzZG(com.aspose.words.internal.zzZQ4 zzzq4) {
        float height = this.zzZfg.zzZNk().getHeight();
        float f = (-height) / 4.0f;
        zzzq4.zzH(f, f);
        long jZzY = zzY(zzzq4, this.zzZff);
        return new com.aspose.words.internal.zzZQ4(Float.intBitsToFloat((int) jZzY) - (height / 8.0f), com.aspose.words.internal.zzZPY.zzYC(jZzY) - (height / 2.0f), height / 4.0f, height);
    }

    private com.aspose.words.internal.zzZQ4 zzZOe() {
        com.aspose.words.internal.zzZQ4 zzzq4ZzZNk = this.zzZfg.zzZNk();
        return com.aspose.words.internal.zzZQ4.zzX(this.zzZfg.zzZNl(), ((com.aspose.words.internal.zzSA.zzYB(3) * 2.0f) + zzzq4ZzZNk.getWidth()) / 2.0f, ((com.aspose.words.internal.zzSA.zzYB(3) * 2.0f) + zzzq4ZzZNk.getHeight()) / 2.0f);
    }

    private com.aspose.words.internal.zzZQ4 zzZOf() {
        com.aspose.words.internal.zzZQ4 zzzq4ZzZNk = this.zzZfg.zzZNk();
        float fZzYB = com.aspose.words.internal.zzSA.zzYB(3);
        float f = (-((3.0f * fZzYB) + ((float) Math.sqrt((zzzq4ZzZNk.getHeight() * zzzq4ZzZNk.getHeight()) + (zzzq4ZzZNk.getWidth() * zzzq4ZzZNk.getWidth()))))) / 2.0f;
        com.aspose.words.internal.zzZQ4 zzzq4ZzZNl = this.zzZfg.zzZNl();
        return com.aspose.words.internal.zzZQ4.zzX(zzzq4ZzZNl, f, com.aspose.words.internal.zzAN.zzQ((double) zzzq4ZzZNl.getWidth(), (double) zzzq4ZzZNl.getHeight(), 1.0d) ? f : -(zzzq4ZzZNk.getHeight() + fZzYB));
    }

    private double zzZOg() {
        if (!com.aspose.words.internal.zzAN.zzY(this.zzZfg.zzZNl().getWidth(), this.zzZfg.zzZNl().getHeight(), 1.0f)) {
            return 0.0d;
        }
        com.aspose.words.internal.zzZQ4 zzzq4ZzZ = zzZ(this.zzZfg, zzY(this.zzZfe, this.zzZff));
        double[] dArr = {zz3N.zzv(com.aspose.words.internal.zzZPY.zzG(zzzq4ZzZ.zzZm(), zzzq4ZzZ.zzZo()), this.zzZfg.zzPT()), zz3N.zzv(com.aspose.words.internal.zzZPY.zzG(zzzq4ZzZ.zzZm(), zzzq4ZzZ.zzZn()), this.zzZfg.zzPT()), zz3N.zzv(com.aspose.words.internal.zzZPY.zzG(zzzq4ZzZ.zzkw(), zzzq4ZzZ.zzZo()), this.zzZfg.zzPT()), zz3N.zzv(com.aspose.words.internal.zzZPY.zzG(zzzq4ZzZ.zzkw(), zzzq4ZzZ.zzZn()), this.zzZfg.zzPT())};
        double dMin = Double.MAX_VALUE;
        double dMax = -1.7976931348623157E308d;
        for (int i = 0; i < 4; i++) {
            dMin = Math.min(dMin, zzv(this.zzKu, dArr[i]));
            dMax = Math.max(dMax, zzv(this.zzZi5, dArr[i]));
        }
        return (dMax + dMin) / 2.0d;
    }

    private long zzZOh() {
        long jZzG;
        long jZzG2;
        float f;
        float fZzp = com.aspose.words.internal.zzSA.zzp(4.5d);
        com.aspose.words.internal.zzZQ4 zzzq4ZzZNl = this.zzZfg.zzZNl();
        float f2 = -fZzp;
        zzzq4ZzZNl.zzH(f2, f2);
        long jZzPT = this.zzZfg.zzPT();
        com.aspose.words.internal.zzZQ4 zzzq4ZzZF = zzZF(zzzq4ZzZNl);
        com.aspose.words.internal.zzZQ4 zzzq4ZzZG = zzZG(zzzq4ZzZNl);
        if (zzzq4ZzZG.zzkw() >= Float.intBitsToFloat((int) jZzPT)) {
            jZzG = com.aspose.words.internal.zzZPY.zzG(zzzq4ZzZG.getX(), zzzq4ZzZG.zzZn());
            jZzG2 = com.aspose.words.internal.zzZPY.zzG(zzzq4ZzZF.getX(), zzzq4ZzZF.zzZn());
            f = 1.0f;
        } else {
            jZzG = com.aspose.words.internal.zzZPY.zzG(zzzq4ZzZG.zzkw(), zzzq4ZzZG.zzZn());
            jZzG2 = com.aspose.words.internal.zzZPY.zzG(zzzq4ZzZF.zzkw(), zzzq4ZzZF.zzZn());
            f = -1.0f;
        }
        if (this.zzZfg.zzZNk().getWidth() > zzzq4ZzZF.getWidth()) {
            return 0L;
        }
        long jZzV = com.aspose.words.internal.zzJ6.zzV(jZzG2, jZzG, (1.0f - (this.zzZfg.zzZNk().getWidth() / zzzq4ZzZF.getWidth())) * com.aspose.words.internal.zzJ6.zzO(jZzG2, jZzG));
        return com.aspose.words.internal.zzZPY.zzG(((this.zzZfg.zzZNk().getWidth() / 2.0f) * f) + Float.intBitsToFloat((int) jZzV), com.aspose.words.internal.zzZPY.zzYC(jZzV) - (this.zzZfg.zzZNk().getHeight() / 2.0f));
    }

    private static double zzv(double d, double d2) {
        double dZzZJ = com.aspose.words.internal.zzAN.zzZJ(d);
        double dZzZJ2 = com.aspose.words.internal.zzAN.zzZJ(d2);
        double dZzZJ3 = com.aspose.words.internal.zzAN.zzZJ(dZzZJ2 - dZzZJ);
        double dZzZJ4 = com.aspose.words.internal.zzAN.zzZJ(dZzZJ - dZzZJ2);
        return dZzZJ3 > dZzZJ4 ? -dZzZJ4 : dZzZJ3;
    }

    private long zzZ(long j, com.aspose.words.internal.zzZQ4 zzzq4, double d, long j2, long j3) {
        long jZzPT = this.zzZfg.zzPT();
        long jZzG = com.aspose.words.internal.zzZPY.zzG(0.0f, com.aspose.words.internal.zzZPY.zzYC(j));
        long jZzG2 = com.aspose.words.internal.zzZPY.zzG(zzzq4.zzkw(), com.aspose.words.internal.zzZPY.zzYC(j));
        if (zzYu(d) || zzYs(d)) {
            j2 = j3;
        }
        return com.aspose.words.internal.zzJ6.zzP(jZzPT, com.aspose.words.internal.zzJ6.zzV(jZzPT, j2, zzzq4.getWidth()), jZzG, jZzG2);
    }

    public static boolean zzZ(zzFR zzfr, RefPointF refPointF, RefPointF refPointF2) {
        return new zzG6(zzfr).zzZ(refPointF, refPointF2);
    }

    private boolean zzZ(RefPointF refPointF, RefPointF refPointF2) {
        double dZzZOg = zzZOg();
        refPointF.set(zzZOh());
        refPointF2.set(zzY(this.zzZfd, this.zzZff - dZzZOg));
        return !com.aspose.words.internal.zzZPY.zzYF(refPointF.get());
    }

    private static com.aspose.words.internal.zzZQ4 zzZ(zzFR zzfr, long j) {
        return zzfr.zzB(j, 0).zzO(zzfr.zzZNk());
    }

    private static boolean zzZ(long j, double d, double d2, float f, float f2, long j2, long j3, long j4, long j5) {
        return zz3N.zzZ(j2, j, d, d2, f, f2, 0.0f, 0.0f) && zz3N.zzZ(j3, j, d, d2, f, f2, 0.0f, 0.0f) && zz3N.zzZ(j4, j, d, d2, f, f2, 0.0f, 0.0f) && zz3N.zzZ(j5, j, d, d2, f, f2, 0.0f, 0.0f);
    }
}
