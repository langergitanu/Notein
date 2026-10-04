package com.aspose.words;

import OooOoO.C20503OooO00o;

/* JADX INFO: loaded from: classes6.dex */
final class zzZS7 {
    public static zzZS8 zzE(Shape shape) {
        zzZS8 zzzs8 = new zzZS8();
        if (shape == null) {
            return zzzs8;
        }
        boolean zZzZx = zzZx(shape.getDirectShapeAttr(1984));
        boolean zZzZx2 = zzZx(shape.getDirectShapeAttr(1985));
        zzZ(zzZS9.zzF(shape), zZzZx, zZzZx2, zzzs8);
        zzzs8.zzYM((float) (((double) shape.zzYb2()) / 12700.0d));
        zzzs8.zzYL((float) (((double) shape.zzYb1()) / 12700.0d));
        zzzs8.zzYK((float) (((double) shape.zzYb3()) / 65536.0d));
        zzZ(zzZS9.zzG(shape).getSize(), shape.zzYzG().getSize(), zZzZx, zZzZx2, zzzs8);
        long jZzG = com.aspose.words.internal.zzZPW.zzG(shape.zzYzG().getWidth() * zzzs8.getScaleX(), shape.zzYzG().getHeight() * zzzs8.getScaleY());
        int i = (int) jZzG;
        zzzs8.zzXN(com.aspose.words.internal.zzZPY.zzG((Float.intBitsToFloat(i) * ((float) (((double) shape.zzYaW()) / 65536.0d))) + (Float.intBitsToFloat(i) / 2.0f), (com.aspose.words.internal.zzZPW.zzYz(jZzG) * ((float) (((double) shape.zzYaV()) / 65536.0d))) + (com.aspose.words.internal.zzZPW.zzYz(jZzG) / 2.0f)));
        zzzs8.zzV(new com.aspose.words.internal.zzQ9((float) (((double) shape.zzYaZ()) / 12700.0d), (float) (((double) shape.zzYaY()) / 12700.0d), (float) (((double) shape.zzYaX()) / 12700.0d)));
        zzzs8.zzYI((float) (((double) shape.zzYaU()) / 65536.0d));
        zzzs8.zzYH((float) (((double) (-shape.zzYaT())) / 65536.0d));
        zzzs8.zzY(com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat(i) / 2.0f, com.aspose.words.internal.zzZPW.zzYz(jZzG) / 2.0f));
        zzzs8.zze(com.aspose.words.internal.zzPV.zzYR(shape.getFillColor()));
        zzzs8.zzU(new com.aspose.words.internal.zzQ9((float) (((double) shape.zzYaS()) / 65536.0d), (float) (((double) shape.zzYaR()) / 65536.0d), (float) (((double) shape.zzYaQ()) / 65536.0d)));
        zzzs8.zzT(new com.aspose.words.internal.zzQ9((float) (((double) shape.zzYaN()) / 65536.0d), (float) (((double) shape.zzYaM()) / 65536.0d), (float) (((double) shape.zzYaL()) / 65536.0d)));
        zzzs8.zzYF((float) (((double) shape.zzYaP()) / 65536.0d));
        zzzs8.zzYE((float) (((double) shape.zzYaK()) / 65536.0d));
        zzzs8.zzWe(shape.zzYaO());
        zzzs8.zzWd(shape.zzYaJ());
        zzzs8.zzYD((float) (((double) shape.zzYaI()) / 65536.0d));
        zzzs8.zzWc(shape.isWordArt());
        zzzs8.zzd(shape.zzZhC());
        zzzs8.zzYC((float) (((double) shape.zzYaH()) / 65536.0d));
        zzzs8.zzYB((float) (((double) shape.zzYaG()) / 65536.0d));
        zzzs8.zzWb(shape.zzYaF());
        zzzs8.zzDT(!shape.zzYb4() ? 1 : 0);
        return zzzs8;
    }

    private static float zzW(float f, float f2, boolean z) {
        if (z) {
            return C20503OooO00o.OooO0O0(f2, f, f2, 1.0f);
        }
        return 1.0f;
    }

    private static float zzZ(float f, boolean z, float f2) {
        if (!z) {
            return f;
        }
        if (f2 < 0.0f) {
            return -f2;
        }
        return 0.0f;
    }

    private static boolean zzZx(Object obj) {
        return (obj == null || ((Integer) obj).intValue() == 0) ? false : true;
    }

    public static zzZS8 zzZ(zz2J zz2j, long j, zz2S zz2s, zz2N zz2n, int i, zz2G zz2g) throws Exception {
        zz44 zz44Var;
        zzZS8 zzzs8 = new zzZS8();
        if (zz2j != null) {
            zzzs8.setShapeType(zz2j.getShapeType());
            zzzs8.setScaleX(1.0f);
            zzzs8.setScaleY(1.0f);
            if (i != 1) {
                zzZ(zzZS9.zzW(zz2j), zzZx(zz2j.zzZyb().getDirectShapeAttr(1984)), zzZx(zz2j.zzZyb().getDirectShapeAttr(1985)), zzzs8);
            }
            zzZ(Float.intBitsToFloat((int) j), com.aspose.words.internal.zzZPW.zzYz(j), zz2s, zzzs8);
            zzzs8.zzYJ((float) zz2j.getRotation());
            zzZ(zzzs8);
            if (zz2n != null) {
                zzzs8.zzYL((float) zz2n.zzZvn());
                zzzs8.zzXt(zz2n.zzZvo());
                zzzs8.zzDQ(zz2n.zzZvm());
                zzzs8.zzd(zzZ(zz2g, zz2n.zzZvp()));
            }
            zzzs8.zzDT(i);
            zzzs8.zzYK(zzZ(zz2s.zzZvF().zzZPy(), (float) zz2j.getRotation(), zz2j.getFlipOrientation(), zz2j.zzZyb().zzY9o()));
            if (zzzs8.zzZhy() == 2 && !zz3I.zzHc(zz2s.zzZvF().zzZPy())) {
                zzzs8.zzYL(zzzs8.zzZhS() * 0.6f);
            }
            zzzs8.zzYy(zz2s.zzZvE().zzZPw() == null ? 0.0f : (float) zz2s.zzZvE().zzZPw().zzZw3().zzZQQ());
            zzzs8.zzHR(zz2s.zzZvE().zzZyN());
            zzZ(zz2n, zzzs8);
            if (zz2j.getFill().zzZQ4() == 1 && (zz44Var = (zz44) com.aspose.words.internal.zzZKW.zzZ(((zz7C) zz2j.getFill()).zzZAz(), zz44.class)) != null) {
                zzzs8.zzDR(zz44Var.zzZwV());
            }
        }
        return zzzs8;
    }

    private static com.aspose.words.internal.zzPV zzZ(zz2G zz2g, zzBW zzbw) throws Exception {
        if (zz2g != null && zzbw != null) {
            zzGR zzgrZzZvb = zz2g.zzZvb();
            return zzbw.zzZ(zzgrZzZvb.getThemeProvider(), zzgrZzZvb.zzZPL());
        }
        return com.aspose.words.internal.zzPV.zzHZ;
    }

    private static float zzZ(int i, float f, int i2, boolean z) {
        float fZzHb = zz3I.zzHb(i);
        if (!com.aspose.words.internal.zzAN.zzf(fZzHb)) {
            fZzHb += f;
        }
        if (z) {
            if (i2 == 2 || i2 == 3) {
                return fZzHb - 180.0f;
            }
        } else {
            if (i2 == 1) {
                return fZzHb + 90.0f;
            }
            if (i2 == 2) {
                return fZzHb - 90.0f;
            }
            if (i2 == 3) {
                return fZzHb - 180.0f;
            }
        }
        return fZzHb;
    }

    private static void zzZ(com.aspose.words.internal.zzZQ4 zzzq4, boolean z, boolean z2, zzZS8 zzzs8) {
        zzzs8.zzYA(zzZ(zzzs8.zzZhx(), z, zzzq4.getX()));
        zzzs8.zzYz(zzZ(zzzs8.zzyq(), z2, zzzq4.getY()));
    }

    private static void zzZ(zz2N zz2n, zzZS8 zzzs8) {
        if (zz2n == null || zz2n.zzZvs() == null) {
            return;
        }
        zzzs8.zzZhs();
        zzzs8.zzDS(zz2n.zzZvs().zzZQd());
        zzZ((float) zz2n.zzZvs().getHeight(), (float) zz2n.zzZvs().getWidth(), zzzs8);
        if (zzzs8.zzZhu() == 3 && com.aspose.words.internal.zzAN.zzf(zzzs8.zzZhS())) {
            zzzs8.zzYL(38100.0f);
        }
    }

    private static void zzZ(float f, float f2, zzZS8 zzzs8) {
        if (zzzs8.zzZhu() != 3) {
            if (com.aspose.words.internal.zzAN.zzf(f) && com.aspose.words.internal.zzAN.zzf(f2)) {
                zzzs8.zzYx(76200.0f);
                zzzs8.zzYw(76200.0f);
                return;
            } else {
                zzzs8.zzYx(f);
                zzzs8.zzYw(f2);
                return;
            }
        }
        if (com.aspose.words.internal.zzAN.zzf(f)) {
            f = 76200.0f;
        }
        zzzs8.zzYx(f);
        zzzs8.zzYw(f2);
    }

    private static void zzZ(zzZS8 zzzs8) {
        zzzs8.zzU(new com.aspose.words.internal.zzQ9(0.762939453125d, 0.0d, 0.152587890625d));
        zzzs8.zzYF(0.579834f);
        zzzs8.zzWe(true);
        zzzs8.zzT(new com.aspose.words.internal.zzQ9(-0.762939453125d, 0.0d, 0.152587890625d));
        zzzs8.zzYE(0.579834f);
        zzzs8.zzYD(0.30517578f);
        zzzs8.zzYB(1.0f);
    }

    private static void zzZ(float f, float f2, zz2S zz2s, zzZS8 zzzs8) {
        zzGO zzgoZzHd;
        float f3 = f / 2.0f;
        float f4 = f2 / 2.0f;
        zzzs8.zzY(com.aspose.words.internal.zzZPY.zzG(f3, f4));
        zzzs8.zzXN(com.aspose.words.internal.zzZPY.zzG(f3, f4));
        if (zz2s.zzZvF().zzZPw() != null) {
            zzgoZzHd = zz2s.zzZvF();
        } else {
            zzgoZzHd = zz3I.zzHd(zz2s.zzZvF().zzZPy());
        }
        zzzs8.zzYI(-((float) zzgoZzHd.zzZPw().zzZw5().zzZQQ()));
        zzzs8.zzYH(-((float) zzgoZzHd.zzZPw().zzZw4().zzZQQ()));
        zzzs8.zzYG(-((float) zzgoZzHd.zzZPw().zzZw3().zzZQQ()));
        zzzs8.zzWa(zz3I.zzHc(zzgoZzHd.zzZPy()));
        zzzs8.zzV(new com.aspose.words.internal.zzQ9(0.0d, 0.0d, 8000000.0d / (zzgoZzHd.zzZPz().zzZQR() + 0.01d)));
        zzzs8.zzW9((com.aspose.words.internal.zzAN.zzf(zzzs8.zzZhN()) && com.aspose.words.internal.zzAN.zzf(zzzs8.zzZhM()) && com.aspose.words.internal.zzAN.zzf(zzzs8.zzZhL()) && (zz2s.zzZvF().zzZPy() == 18 || zz2s.zzZvF().zzZPy() == 47 || zz2s.zzZvF().zzZPy() == 13)) ? false : true);
    }

    private static void zzZ(long j, long j2, boolean z, boolean z2, zzZS8 zzzs8) {
        float fZzW = zzW(Float.intBitsToFloat((int) j), Float.intBitsToFloat((int) j2), z);
        float fZzW2 = zzW(com.aspose.words.internal.zzZPW.zzYz(j), com.aspose.words.internal.zzZPW.zzYz(j2), z2);
        zzzs8.setScaleX(com.aspose.words.internal.zzAN.zzZ(fZzW, 0.01f, 1.0f));
        zzzs8.setScaleY(com.aspose.words.internal.zzAN.zzZ(fZzW2, 0.01f, 1.0f));
    }
}
