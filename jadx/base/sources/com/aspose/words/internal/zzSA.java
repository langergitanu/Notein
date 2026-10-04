package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzSA {
    public static int pixelToNewDpi(double d, double d2, double d3) {
        return zzAN.zzZG((d * d3) / d2);
    }

    public static double pixelToPoint(double d) {
        return (d / 96.0d) * 72.0d;
    }

    public static double pointToPixel(double d) {
        return (d / 72.0d) * 96.0d;
    }

    public static long zzD(long j) {
        return zzZPZ.zzZm(zzn(Float.intBitsToFloat((int) j)), zzn(zzZPY.zzYC(j)));
    }

    public static long zzE(long j) {
        return zzZPW.zzG(((int) j) / 1000.0f, ((int) (j >>> 32)) / 1000.0f);
    }

    public static long zzF(long j) {
        return zzZPY.zzG(((int) j) / 1000.0f, ((int) (j >> 32)) / 1000.0f);
    }

    public static long zzG(long j) {
        return zzZPW.zzG(zzp(Float.intBitsToFloat((int) j)), zzp(zzZPW.zzYz(j)));
    }

    public static double zzO(double d, double d2) {
        return ((d / d2) * 72.0d) / 0.0028346457984298468d;
    }

    public static double zzP(double d, double d2) {
        return ((d / d2) * 72.0d) / 2.834645669291339d;
    }

    public static int zzQ(double d, double d2) {
        return zzAN.zzZG((((double) ((float) (d / 1000.0d))) / 72.0d) * d2);
    }

    public static long zzR(double d, double d2) {
        return zzZPX.zzZm(zzq(d), zzq(d2));
    }

    public static long zzS(double d, double d2) {
        return zzZPX.zzZm(zzw(d), zzw(d2));
    }

    private static int zzT(double d, double d2) {
        return zzAN.zzZG((d / d2) * 72000.0d);
    }

    public static int zzU(double d, double d2) {
        return zzAN.zzZG((d / d2) * 1440.0d);
    }

    public static int zzV(double d, double d2) {
        return Math.max((int) Math.ceil((d / 72.0d) * d2), 1);
    }

    public static int zzW(double d, double d2) {
        return zzAN.zzZG((d / 72.0d) * d2);
    }

    public static zzZQ4 zzY(zzZQ5 zzzq5) {
        return new zzZQ4(zzzq5.getX() / 1000.0f, zzzq5.getY() / 1000.0f, zzzq5.getWidth() / 1000.0f, zzzq5.getHeight() / 1000.0f);
    }

    public static double zzYA(int i) {
        return zzp(pixelToPoint(i));
    }

    public static int zzYB(int i) {
        return zzAN.zzZG(((double) i) * 12700.0d);
    }

    public static int zzYC(int i) {
        return zzAN.zzZG(((double) i) * 635.0d);
    }

    public static int zzYD(int i) {
        return zzAN.zzZG(((double) i) / 635.0d);
    }

    public static double zzYE(int i) {
        return ((double) i) / 20.0d;
    }

    public static int zzYF(int i) {
        return zzAN.zzZG(((double) i) * 2.5d);
    }

    public static float zzYw(int i) {
        return (i / 1000.0f) / 12.0f;
    }

    public static int zzYx(int i) {
        return (i / 50) + (i % 50 == 0 ? 0 : 1);
    }

    public static int zzYy(int i) {
        return zzAN.zzZG(i * 1000);
    }

    public static float zzYz(int i) {
        return (float) pointToPixel(((double) i) / 12700.0d);
    }

    public static long zzZ(long j, float f, double d, double d2) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: scale");
        }
        if (d <= 0.0d) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: dpi");
        }
        if (d2 > 0.0d) {
            return zzZPX.zzZm(Math.max(zzW(Float.intBitsToFloat((int) j) * f, d), 1), Math.max(zzW(zzZPW.zzYz(j) * f, d2), 1));
        }
        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: dpi");
    }

    public static double zzh(double d) {
        return Math.ceil(d / 635.0d) * 635.0d;
    }

    public static double zzi(double d) {
        return (d * 2.54d) / 72.0d;
    }

    public static double zzj(double d) {
        return zzAN.zzZK(d) * 60000.0d;
    }

    public static double zzk(double d) {
        return zzAN.zzZL(d / 60000.0d);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0009 A[PHI: r0
      0x0009: PHI (r0v3 double) = (r0v0 double), (r0v1 double) binds: [B:3:0x0007, B:6:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zzl(double d) {
        double d2 = 32767.99998474121d;
        if (d > 32767.99998474121d) {
            d = d2;
        } else {
            d2 = -32768.99998474121d;
            if (d < -32768.99998474121d) {
            }
        }
        return zzAN.zzZG(d * 65536.0d);
    }

    public static int zzm(double d) {
        return zzAN.zzZG(d * 500.0d);
    }

    public static int zzn(double d) {
        return zzAN.zzZG(d * 1000.0d);
    }

    public static int zzo(double d) {
        return zzAN.zzZG(d * 36000.00000000001d);
    }

    public static int zzp(double d) {
        return zzAN.zzZG(d * 12700.0d);
    }

    public static int zzq(double d) {
        return zzAN.zzZG(d * 1440.0d);
    }

    public static int zzr(double d) {
        return zzAN.zzZG(d * 20.0d);
    }

    public static int zzs(double d) {
        return zzAN.zzZG(d * 8.0d);
    }

    public static int zzt(double d) {
        return (int) Math.round(d * 2.0d);
    }

    public static int zzu(double d) {
        return zzAN.zzZG(d * 566.9291338582677d);
    }

    public static int zzv(double d) {
        return zzAN.zzZG((d * 96.0d) / 25.4d);
    }

    public static int zzw(double d) {
        return zzAN.zzZG(d * 56.69291338582678d);
    }

    public static int zzx(double d) {
        return zzAN.zzZG(d / 0.028346456587314606d);
    }

    public static int zzy(double d) {
        return zzAN.zzZG(d / 0.0028346457984298468d);
    }

    public static zzZQ5 zzQ(zzZQ4 zzzq4) {
        return new zzZQ5(zzn(zzzq4.getX()), zzn(zzzq4.getY()), zzn(zzzq4.getWidth()), zzn(zzzq4.getHeight()));
    }

    public static zzZQ4 zzR(zzZQ4 zzzq4) {
        return zzZQ4.zzX(zzo(zzzq4.zzZm()), zzo(zzzq4.zzZo()), zzo(zzzq4.zzkw()), zzo(zzzq4.zzZn()));
    }

    public static zzZQ4 zzS(zzZQ4 zzzq4) {
        return new zzZQ4((float) (((double) zzzq4.zzZm()) / 12700.0d), (float) (((double) zzzq4.zzZo()) / 12700.0d), (float) (((double) zzzq4.getWidth()) / 12700.0d), (float) (((double) zzzq4.getHeight()) / 12700.0d));
    }

    public static zzZQ4 zzT(zzZQ4 zzzq4) {
        return zzZQ4.zzX(zzp(zzzq4.zzZm()), zzp(zzzq4.zzZo()), zzp(zzzq4.zzkw()), zzp(zzzq4.zzZn()));
    }

    public static long zzY(long j, float f, double d, double d2) {
        return zzZPX.zzZm(zzZ(Float.intBitsToFloat((int) j), f, d, 1), zzZ(zzZPW.zzYz(j), f, d2, 1));
    }

    public static zzZQ5 zzZ(zzZQ4 zzzq4, float f, double d, double d2) {
        return zzZQ5.zzT(zzZ(zzzq4.zzZm(), f, d, 0), zzZ(zzzq4.zzZo(), f, d2, 0), zzZ(zzzq4.zzkw(), f, d, 0), zzZ(zzzq4.zzZn(), f, d2, 0));
    }

    private static int zzZ(float f, float f2, double d, int i) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: scale");
        }
        if (d > 0.0d) {
            return Math.max((int) Math.ceil((((double) (f * f2)) / 72.0d) * d), i);
        }
        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: dpi");
    }

    public static int zzZ(int i, float f) {
        double d = i;
        return zzT(zzQ(d, r2), f);
    }

    public static long zzZ(zzQ9 zzq9) {
        return zzZPY.zzG((float) zzq9.zzQb(), (float) zzq9.zzYm());
    }
}
