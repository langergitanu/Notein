package com.aspose.words;

import androidx.appcompat.view.menu.C21505OooO0Oo;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes6.dex */
final class zzY7G {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("path", DrawToolFactory.LASSO_TYPE_RECT, "circle", "ellipse", "line", "polyline", "polygon", "miter", "round", "bevel", "butt", "square");

    private static long[] zzAk(String str) {
        float[] fArrZzZZ = zzY80.zzZZ(str, true);
        int length = fArrZzZZ.length / 2;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            jArr[i] = com.aspose.words.internal.zzZPY.zzG(fArrZzZZ[i2], fArrZzZZ[i2 + 1]);
        }
        return jArr;
    }

    private static void zzB(com.aspose.words.internal.zzOU zzou) {
        if (zzou.getDashStyle() == 5) {
            float[] fArrZzK = zzK(zzou.zzNH());
            if ((zzou.zzNJ() == 2 && zzou.zzNN() == 2) || (zzou.zzNJ() == 0 && zzou.zzNN() == 1)) {
                fArrZzK = (float[]) fArrZzK.clone();
                for (int i = 0; i < fArrZzK.length; i++) {
                    if (com.aspose.words.internal.zzAN.zzZP(i)) {
                        fArrZzK[i] = fArrZzK[i] - 1.0f;
                    } else {
                        fArrZzK[i] = fArrZzK[i] + 1.0f;
                    }
                }
            }
            zzou.zzW(fArrZzK);
        }
    }

    private static float[] zzK(float[] fArr) {
        if (fArr == null || !com.aspose.words.internal.zzAN.zzZP(fArr.length)) {
            return fArr;
        }
        float[] fArr2 = new float[fArr.length * 2];
        for (int i = 0; i < fArr.length; i++) {
            fArr2[i] = fArr[i];
            fArr2[fArr.length + i] = fArr[i];
        }
        return fArr2;
    }

    private static void zzL(zzY7J zzy7j, zzY7X zzy7x) throws Exception {
        zzY7H zzy7h = new zzY7H();
        zzy7h.zzAm(zzY7B.zzZ(zzy7x, "points", zzy7h.zzY0O()));
        zzy7h.zzAl(zzY7B.zzZ(zzy7x, "d", zzy7h.zzY0N()));
        zzy7h.zzY2(zzY7B.zzZ(zzy7j, zzy7x, "x2", zzy7h.zzY1b()));
        zzy7h.zzY1(zzY7B.zzZ(zzy7j, zzy7x, "y2", zzy7h.zzY1a()));
        zzy7h.setX(zzY7B.zzZ(zzy7j, zzy7x, "x", zzy7h.getX()));
        zzy7h.setX(zzY7B.zzZ(zzy7j, zzy7x, "cx", zzy7h.getX()));
        zzy7h.setX(zzY7B.zzZ(zzy7j, zzy7x, "x1", zzy7h.getX()));
        zzy7h.setY(zzY7B.zzZ(zzy7j, zzy7x, "y", zzy7h.getY()));
        zzy7h.setY(zzY7B.zzZ(zzy7j, zzy7x, TranslateLanguage.WELSH, zzy7h.getY()));
        zzy7h.setY(zzY7B.zzZ(zzy7j, zzy7x, "y1", zzy7h.getY()));
        zzy7h.zzXW(zzY7B.zzZ(zzy7j, zzy7x, "rx", 0.0f));
        zzy7h.zzXV(zzY7B.zzZ(zzy7j, zzy7x, "ry", 0.0f));
        if (zzy7x.hasAttribute("rx") && zzy7x.hasAttribute("ry") && (com.aspose.words.internal.zzAN.zzf(zzy7h.zzY0Q()) || com.aspose.words.internal.zzAN.zzf(zzy7h.zzY0P()))) {
            zzy7h.zzXV(0.0f);
            zzy7h.zzXW(0.0f);
        }
        if (com.aspose.words.internal.zzZYD.zzXk(zzy7x.zzKM("r"))) {
            zzy7h.zzXW(zzY7B.zzZ(zzy7j, zzy7x, "r", zzy7h.zzY0Q()));
            zzy7h.zzXV(zzy7h.zzY0Q());
        }
        zzy7h.zzL(zzY7B.zzZ(zzy7j, zzy7x, zzy7h.zzNb()));
        zzy7h.setWidth((float) zzY7B.zzZ(zzy7j, zzy7x, "width", 0.0d));
        zzy7h.zzk((float) zzY7B.zzZ(zzy7j, zzy7x, "height", 0.0d));
        String strZzSE = zzy7x.zzZWe().zzSE("clip-path");
        if (com.aspose.words.internal.zzZYD.zzXk(strZzSE)) {
            zzy7h.zzu(zzy7j.zzAr(strZzSE));
        }
        String strZzSE2 = zzy7x.zzZWe().zzSE("marker-start");
        if (com.aspose.words.internal.zzZYD.zzXk(strZzSE2)) {
            zzy7h.zzZ(zzy7j.zzAq(strZzSE2));
        }
        String strZzSE3 = zzy7x.zzZWe().zzSE("marker-end");
        if (com.aspose.words.internal.zzZYD.zzXk(strZzSE3)) {
            zzy7h.zzY(zzy7j.zzAq(strZzSE3));
        }
        zzy7x.zzZ(zzy7h);
    }

    private static com.aspose.words.internal.zzZG zzM(zzY7J zzy7j, zzY7X zzy7x) throws Exception {
        zzL(zzy7j, zzy7x);
        return zzU(zzy7x, zzy7j);
    }

    public static com.aspose.words.internal.zzP8 zzN(zzY7J zzy7j, zzY7X zzy7x) throws Exception {
        com.aspose.words.internal.zzZG zzzgZzM;
        if (zzy7x.zzQw().size() == 0 || (zzzgZzM = zzM(zzy7j, zzy7x.zzQw().get(zzy7x.zzQw().size() - 1))) == null) {
            return null;
        }
        com.aspose.words.internal.zzP9 zzp9ZzZ = zzY7B.zzZ(zzy7j, zzy7x, zzzgZzM.zzZO());
        if (zzp9ZzZ != null) {
            zzzgZzM.zzZ0().zzY(zzp9ZzZ);
        }
        return zzzgZzM.zzZ0();
    }

    private static float zzP(long j, long j2, long j3) {
        int i = (int) j;
        int i2 = (int) j2;
        return Math.abs(((com.aspose.words.internal.zzZPY.zzYC(j2) * Float.intBitsToFloat(i)) + ((Float.intBitsToFloat((int) j3) * (com.aspose.words.internal.zzZPY.zzYC(j) - com.aspose.words.internal.zzZPY.zzYC(j2))) - (com.aspose.words.internal.zzZPY.zzYC(j3) * (Float.intBitsToFloat(i) - Float.intBitsToFloat(i2))))) - (Float.intBitsToFloat(i2) * com.aspose.words.internal.zzZPY.zzYC(j))) / ((float) Math.sqrt(Math.pow(Float.intBitsToFloat(i) - Float.intBitsToFloat(i2), 2.0d) + Math.pow(com.aspose.words.internal.zzZPY.zzYC(j) - com.aspose.words.internal.zzZPY.zzYC(j2), 2.0d)));
    }

    public static void zzQ(zzY7J zzy7j, zzY7X zzy7x) throws Exception {
        com.aspose.words.internal.zzZG zzzgZzM = zzM(zzy7j, zzy7x);
        if (zzzgZzM != null) {
            zzy7j.zzS(zzzgZzM);
            zzZ(zzzgZzM, zzy7x, zzy7j);
        }
    }

    private static com.aspose.words.internal.zzZG zzU(zzY7X zzy7x, zzY7J zzy7j) throws Exception {
        com.aspose.words.internal.zzZG zzzg = new com.aspose.words.internal.zzZG();
        zzY7H zzy7hZzY1o = zzy7x.zzY1o();
        if (zzy7hZzY1o.zzNb() != null) {
            zzzg.zzW(zzy7hZzY1o.zzNb());
        }
        switch (zzUR.zzTP(zzy7x.zzZTQ())) {
            case 0:
                if (com.aspose.words.internal.zzZYD.zzXk(zzy7hZzY1o.zzY0N())) {
                    new zzY7M(zzzg.zzZ0()).zzZ(zzy7hZzY1o.zzY0N(), zzy7j);
                }
                break;
            case 1:
                if (com.aspose.words.internal.zzAN.zzf(zzy7hZzY1o.getHeight()) || com.aspose.words.internal.zzAN.zzf(zzy7hZzY1o.getWidth())) {
                    return null;
                }
                com.aspose.words.internal.OooO00o.OooO00o(zzzg, zzW(new com.aspose.words.internal.zzZQ4(zzy7hZzY1o.getX(), zzy7hZzY1o.getY(), zzy7hZzY1o.getWidth(), zzy7hZzY1o.getHeight()), zzy7hZzY1o.zzY0Q(), zzy7hZzY1o.zzY0P()));
                break;
            case 2:
            case 3:
                com.aspose.words.internal.zzP5 zzp5 = new com.aspose.words.internal.zzP5();
                zzp5.zzZ(new com.aspose.words.internal.zzQ5(new com.aspose.words.internal.zzZQ4(zzy7hZzY1o.getX() - zzy7hZzY1o.zzY0Q(), zzy7hZzY1o.getY() - zzy7hZzY1o.zzY0P(), zzy7hZzY1o.zzY0Q() * 2.0f, zzy7hZzY1o.zzY0P() * 2.0f)));
                com.aspose.words.internal.zzZQG.zzZ(zzzg.zzZ0().zzO7(), zzp5);
                break;
            case 4:
                com.aspose.words.internal.zzZQG.zzZ(zzzg.zzZ0().zzO7(), com.aspose.words.internal.zzP5.zzS(com.aspose.words.internal.zzZPY.zzG(zzy7hZzY1o.getX(), zzy7hZzY1o.getY()), com.aspose.words.internal.zzZPY.zzG(zzy7hZzY1o.zzY1b(), zzy7hZzY1o.zzY1a())));
                break;
            case 5:
                com.aspose.words.internal.zzZQG.zzZ(zzzg.zzZ0().zzO7(), com.aspose.words.internal.zzP5.zzX(zzAk(zzy7hZzY1o.zzY0O()), false, false));
                break;
            case 6:
                com.aspose.words.internal.zzZQG.zzZ(zzzg.zzZ0().zzO7(), com.aspose.words.internal.zzP5.zzX(zzAk(zzy7hZzY1o.zzY0O()), false, true));
                break;
            default:
                zzy7j.zzT(16777216, com.aspose.words.internal.zzZKN.format("'{0}' shape is unexpected and will be ignored", zzy7x.zzZTQ()));
                break;
        }
        zzY(zzzg, zzy7x, zzy7j);
        zzzg.zzZ(zzy7hZzY1o.zzFx());
        return zzzg;
    }

    private static void zzV(com.aspose.words.internal.zzZG zzzg, zzY7X zzy7x) {
        zzPT zzptZzSx = zzy7x.zzZWe().zzSx("stroke-dasharray");
        if (zzptZzSx == null || zzptZzSx.zzZWj().zzP(zzL4.zzZno) || zzptZzSx.zzZWj().zzP(new zzNH(0.0d))) {
            return;
        }
        int count = zzptZzSx.zzZWj().getCount();
        float[] fArr = new float[count];
        for (int i = 0; i < zzptZzSx.zzZWj().getCount(); i++) {
            fArr[i] = (float) zzL5.zzL(zzptZzSx.zzZWj().zzMl(i));
        }
        if (count > 0) {
            zzX(fArr, zzzg.zzZ2().getWidth());
            zzzg.zzZ2().zzW(fArr);
            double dZzSH = zzy7x.zzZWe().zzSH("stroke-dashoffset");
            if (com.aspose.words.internal.zzAN.zzZC(dZzSH)) {
                return;
            }
            zzzg.zzZ2().zzz(((float) dZzSH) / zzzg.zzZ2().getWidth());
        }
    }

    private static com.aspose.words.internal.zzP5 zzW(com.aspose.words.internal.zzZQ4 zzzq4, float f, float f2) {
        if (com.aspose.words.internal.zzAN.zzf(f) && com.aspose.words.internal.zzAN.zzf(f2)) {
            return com.aspose.words.internal.zzP5.zzK(zzzq4);
        }
        if (com.aspose.words.internal.zzAN.zzf(f)) {
            f = f2;
        }
        if (com.aspose.words.internal.zzAN.zzf(f2)) {
            f2 = f;
        }
        float f3 = f * 2.0f;
        float f4 = f2 * 2.0f;
        com.aspose.words.internal.zzQ5 zzq5 = new com.aspose.words.internal.zzQ5(new com.aspose.words.internal.zzZQ4(zzzq4.zzZm(), zzzq4.zzZo(), f3, f4), 180.0d, 90.0d);
        com.aspose.words.internal.zzQ5 zzq52 = new com.aspose.words.internal.zzQ5(new com.aspose.words.internal.zzZQ4(zzzq4.zzkw() - f3, zzzq4.zzZo(), f3, f4), 270.0d, 90.0d);
        com.aspose.words.internal.zzQ5 zzq53 = new com.aspose.words.internal.zzQ5(new com.aspose.words.internal.zzZQ4(zzzq4.zzkw() - f3, zzzq4.zzZn() - f4, f3, f4), 0.0d, 90.0d);
        com.aspose.words.internal.zzQ5 zzq54 = new com.aspose.words.internal.zzQ5(new com.aspose.words.internal.zzZQ4(zzzq4.zzZm(), zzzq4.zzZn() - f4, f3, f4), 90.0d, 90.0d);
        com.aspose.words.internal.zzP5 zzp5 = new com.aspose.words.internal.zzP5();
        zzp5.zzZ(zzq5);
        zzp5.zzZ(zzq52);
        zzp5.zzZ(zzq53);
        zzp5.zzZ(zzq54);
        zzp5.zze(true);
        return zzp5;
    }

    private static void zzX(com.aspose.words.internal.zzZG zzzg, zzY7X zzy7x, zzY7J zzy7j) throws Exception {
        com.aspose.words.internal.zzPY zzpyZzZ;
        if ("line".equals(zzy7x.zzZTQ())) {
            return;
        }
        zzzg.zzZ0().zzY1(!"evenodd".equals(zzy7x.zzZWe().zzSF("fill-rule")) ? 1 : 0);
        if (zzy7x.zzZWe().zzSx("fill") == null) {
            zzzg.zzY(new com.aspose.words.internal.zzOI(com.aspose.words.internal.zzPV.zzKa));
            return;
        }
        zzMP zzmpZzZWj = zzy7x.zzZWe().zzSx("fill").zzZWj();
        if (zzmpZzZWj.zzP(zzL4.zzZno) || zzmpZzZWj.zzP(zzL4.zzZnp)) {
            return;
        }
        String strZzSE = zzy7x.zzZWe().zzSE("fill");
        if (!com.aspose.words.internal.zzZYD.zzXk(strZzSE)) {
            com.aspose.words.internal.zzPV zzpvZzSB = zzy7x.zzZWe().zzSB("fill");
            zzzg.zzY((zzpvZzSB == null || zzpvZzSB.isEmpty()) ? new com.aspose.words.internal.zzOI(com.aspose.words.internal.zzPV.zzKa) : new com.aspose.words.internal.zzOI(zzpvZzSB));
            return;
        }
        zzY7X zzy7xZzAp = zzy7j.zzAp(strZzSE);
        if (zzy7xZzAp == null || (zzpyZzZ = zzy7j.zzZ(zzy7xZzAp, new com.aspose.words.internal.zzH().zzZ((com.aspose.words.internal.zzZL) zzzg))) == null) {
            return;
        }
        if (zzpyZzZ.zzPH() == 3) {
            zzpyZzZ = zzZ(zzzg, zzy7j, (com.aspose.words.internal.zzPA) zzpyZzZ, zzy7xZzAp);
        }
        zzzg.zzY(zzpyZzZ);
    }

    private static void zzY(com.aspose.words.internal.zzZG zzzg, zzY7X zzy7x, zzY7J zzy7j) throws Exception {
        zzZ(zzzg, zzy7x);
        zzX(zzzg, zzy7x, zzy7j);
        if (zzzg.zzZ1() != null) {
            zzY(zzzg.zzZ1(), zzY7B.zzX(zzy7x, "fill-opacity"));
        }
    }

    private static void zzZ(com.aspose.words.internal.zzZG zzzg, zzY7X zzy7x, zzY7J zzy7j) {
        zzY7H zzy7hZzY1o = zzy7x.zzY1o();
        if (zzy7hZzY1o.zzY0M() == null && zzy7hZzY1o.zzY0L() == null) {
            return;
        }
        String strZzZTQ = zzy7x.zzZTQ();
        if ("line".equals(strZzZTQ) || "polyline".equals(strZzZTQ) || "polygon".equals(strZzZTQ) || "path".equals(strZzZTQ)) {
            float width = zzzg.zzZ2() != null ? zzzg.zzZ2().getWidth() : 1.0f;
            for (int i = 0; i < zzzg.zzZ0().zzO7().size(); i++) {
                com.aspose.words.internal.zzP5 zzp5 = zzzg.zzZ0().zzO7().get(i);
                if (zzp5 != null && zzp5.getCount() != 0) {
                    long[] jArrZzN = zzN(zzp5);
                    long[] jArrZzw = zzw(jArrZzN);
                    long[] jArrZzv = zzv(jArrZzN);
                    if (zzy7hZzY1o.zzY0M() != null && jArrZzw != null) {
                        zzy7j.zzS(zzy7hZzY1o.zzY0M().zzR(jArrZzw[0], jArrZzw[1], width));
                    }
                    if (zzy7hZzY1o.zzY0L() != null && jArrZzv != null) {
                        zzy7j.zzS(zzy7hZzY1o.zzY0L().zzS(jArrZzv[0], jArrZzv[1], width));
                    }
                }
            }
        }
    }

    private static float zzc(double d, double d2) {
        return (float) Math.sqrt(Math.pow(d2, 2.0d) + Math.pow(d, 2.0d));
    }

    private static long[] zzv(long[] jArr) {
        if (jArr == null || jArr.length <= 1) {
            return null;
        }
        return new long[]{jArr[jArr.length - 2], jArr[jArr.length - 1]};
    }

    private static long[] zzw(long[] jArr) {
        if (jArr == null || jArr.length <= 1) {
            return null;
        }
        return new long[]{jArr[0], jArr[1]};
    }

    private static void zzY(com.aspose.words.internal.zzZG zzzg, zzY7X zzy7x) {
        String strZzSF = zzy7x.zzZWe().zzSF("stroke-linejoin");
        if (com.aspose.words.internal.zzZKN.zzU3(strZzSF)) {
            return;
        }
        int iZzTP = zzUR.zzTP(strZzSF);
        if (iZzTP == 7) {
            zzzg.zzZ2().zzXW(0);
        } else if (iZzTP == 8) {
            zzzg.zzZ2().zzXW(2);
        } else {
            if (iZzTP != 9) {
                return;
            }
            zzzg.zzZ2().zzXW(1);
        }
    }

    private static long[] zzN(com.aspose.words.internal.zzP5 zzp5) {
        com.aspose.words.internal.zz0Q zz0q = new com.aspose.words.internal.zz0Q();
        for (int i = 0; i < zzp5.getCount(); i++) {
            com.aspose.words.internal.zzOW zzow = zzp5.zzNY().get(i);
            com.aspose.words.internal.zzOS zzos = (com.aspose.words.internal.zzOS) com.aspose.words.internal.zzZKW.zzZ(zzow, com.aspose.words.internal.zzOS.class);
            if (zzos != null) {
                zz0q.zzR(zzos.zzNu());
            }
            com.aspose.words.internal.zzPZ zzpz = (com.aspose.words.internal.zzPZ) com.aspose.words.internal.zzZKW.zzZ(zzow, com.aspose.words.internal.zzPZ.class);
            if (zzpz != null) {
                zz0q.add(zzpz.zzPX());
                zz0q.add(zzpz.zzPL());
                zz0q.add(zzpz.zzPK());
                zz0q.add(zzpz.zzPW());
            }
        }
        if (zz0q.getCount() > 0 && zzp5.isClosed()) {
            zz0q.add(zz0q.get(0));
        }
        return zz0q.toArray();
    }

    private static void zzY(com.aspose.words.internal.zzPY zzpy, float f) {
        if (zzpy == null || f < 0.0f || f >= 1.0f) {
            return;
        }
        int i = (int) (255.0f * f);
        int iZzPH = zzpy.zzPH();
        if (iZzPH == 0) {
            com.aspose.words.internal.zzOI zzoi = (com.aspose.words.internal.zzOI) zzpy;
            zzoi.zzY(new com.aspose.words.internal.zzPV(i, zzoi.zzZy()));
            return;
        }
        if (iZzPH == 1) {
            com.aspose.words.internal.zzPK zzpk = (com.aspose.words.internal.zzPK) zzpy;
            zzpk.zzM(new com.aspose.words.internal.zzPV(i, zzpk.zzOK()));
            zzpk.zzN(new com.aspose.words.internal.zzPV(i, zzpk.zzOL()));
            return;
        }
        if (iZzPH == 2) {
            ((com.aspose.words.internal.zzOH) zzpy).zzy(f);
            return;
        }
        if (iZzPH != 3) {
            if (iZzPH != 4) {
                return;
            }
            for (com.aspose.words.internal.zzPI zzpi : ((com.aspose.words.internal.zzOP) zzpy).zzOP()) {
                zzpi.zzY(new com.aspose.words.internal.zzPV(i, zzpi.zzZy()));
            }
        } else {
            com.aspose.words.internal.zzPA zzpa = (com.aspose.words.internal.zzPA) zzpy;
            zzpa.zzL(new com.aspose.words.internal.zzPV(i, zzpa.zzOv()));
            zzpa.zzK(new com.aspose.words.internal.zzPV(i, zzpa.zzOu()));
        }
    }

    private static void zzW(com.aspose.words.internal.zzZG zzzg, zzY7X zzy7x) {
        double dZzSH = zzy7x.zzZWe().zzSH("stroke-width");
        if (com.aspose.words.internal.zzAN.zzZD(dZzSH) || com.aspose.words.internal.zzAN.zzZC(dZzSH)) {
            dZzSH = ConvertUtil.pixelToPoint(1.0d);
        }
        zzzg.zzZ2().setWidth((float) dZzSH);
    }

    private static void zzX(com.aspose.words.internal.zzZG zzzg, zzY7X zzy7x) {
        String strZzSF = zzy7x.zzZWe().zzSF("stroke-linecap");
        if (com.aspose.words.internal.zzZKN.zzU3(strZzSF)) {
            return;
        }
        int iZzTP = zzUR.zzTP(strZzSF);
        if (iZzTP == 8) {
            zzzg.zzZ2().zzXX(2);
            zzzg.zzZ2().setEndCap(2);
            zzzg.zzZ2().zzXV(2);
        } else if (iZzTP == 10) {
            zzzg.zzZ2().zzXX(0);
            zzzg.zzZ2().setEndCap(0);
            zzzg.zzZ2().zzXV(0);
        } else {
            if (iZzTP != 11) {
                return;
            }
            zzzg.zzZ2().zzXX(1);
            zzzg.zzZ2().setEndCap(0);
            zzzg.zzZ2().zzXV(0);
        }
    }

    private static com.aspose.words.internal.zzPA zzZ(com.aspose.words.internal.zzZG zzzg, zzY7J zzy7j, com.aspose.words.internal.zzPA zzpa, zzY7X zzy7x) throws Exception {
        com.aspose.words.internal.zzPA zzpa2 = (com.aspose.words.internal.zzPA) zzpa.zzPI();
        zzY7U zzy7uZzY1r = zzy7x.zzY1r();
        com.aspose.words.internal.zzP9 zzp9ZzZO = zzzg.zzZO();
        com.aspose.words.internal.zzZL zzzl = zzzg;
        if (zzp9ZzZO != null) {
            com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
            zzg.zzX(zzzg);
            zzzl = zzg;
        }
        com.aspose.words.internal.zzZQ4 zzzq4ZzZ = new com.aspose.words.internal.zzH().zzZ(zzzl);
        if (zzy7uZzY1r.zzY1h()) {
            zzzq4ZzZ = zzZ(zzzq4ZzZ, zzy7j);
        }
        zzY7P zzy7pZzZ = zzZ(zzzq4ZzZ, zzy7uZzY1r);
        zzpa2.zzP(zzzq4ZzZ);
        zzpa2.zzY(zzZ(zzpa2.zzOP(), zzzq4ZzZ, zzy7uZzY1r, zzy7pZzZ));
        zzpa2.zzP(zzU(zzzq4ZzZ, zzy7pZzZ.zzY10()));
        com.aspose.words.internal.zzP9 zzp9ZzZ = zzZ(zzzq4ZzZ, zzy7pZzZ.zzY10(), zzy7pZzZ.zzY0Y(), zzy7uZzY1r);
        zzpa2.zzL((com.aspose.words.internal.zzP9) null);
        if (!zzp9ZzZ.isIdentity()) {
            zzpa2.zzL(zzp9ZzZ);
        }
        return zzpa2;
    }

    private static void zzX(float[] fArr, float f) {
        for (int i = 0; i < fArr.length; i++) {
            fArr[i] = fArr[i] / f;
        }
    }

    private static com.aspose.words.internal.zzZQ4 zzU(com.aspose.words.internal.zzZQ4 zzzq4, float f) {
        com.aspose.words.internal.zzZQ4 zzzq4ZzY = com.aspose.words.internal.zzJ6.zzY(zzzq4, f);
        return new com.aspose.words.internal.zzZQ4(0.0f, 0.0f, zzzq4ZzY.getWidth(), zzzq4ZzY.getHeight());
    }

    private static com.aspose.words.internal.zzZQ4 zzZ(com.aspose.words.internal.zzZQ4 zzzq4, zzY7J zzy7j) {
        return new com.aspose.words.internal.zzZQ4(zzzq4.getX() < 0.0f ? zzzq4.getX() : 0.0f, zzzq4.getY() < 0.0f ? zzzq4.getY() : 0.0f, (float) zzy7j.zzY0T().zzY1z(), (float) zzy7j.zzY0T().zzY1y());
    }

    private static com.aspose.words.internal.zzP9 zzZ(com.aspose.words.internal.zzZQ4 zzzq4, float f, boolean z, zzY7U zzy7u) {
        com.aspose.words.internal.zzP9 zzp9;
        if (zzy7u.zzY1e() != null) {
            zzp9 = zzy7u.zzY1e();
        } else {
            zzp9 = new com.aspose.words.internal.zzP9();
        }
        if (zzy7u.zzY1g()) {
            if (z) {
                zzp9.zzY(zzzq4.getWidth() + zzzq4.getX(), zzzq4.getY(), 0);
            } else {
                zzp9.zzY(zzzq4.getX(), zzzq4.getY(), 0);
            }
        } else if (!z) {
            zzp9.zzY(zzzq4.getX(), zzzq4.getY(), 0);
        } else {
            long[] jArrZzX = com.aspose.words.internal.zzJ6.zzX(com.aspose.words.internal.zzJ6.zzY(zzzq4, f), f);
            zzp9.zzY(Float.intBitsToFloat((int) jArrZzX[0]), com.aspose.words.internal.zzZPY.zzYC(jArrZzX[0]), 0);
        }
        zzp9.zzX(f, 0);
        return zzp9;
    }

    private static com.aspose.words.internal.zzPI[] zzZ(com.aspose.words.internal.zzPI[] zzpiArr, com.aspose.words.internal.zzZQ4 zzzq4, zzY7U zzy7u, zzY7P zzy7p) {
        com.aspose.words.internal.zzPI zzpiZzZ;
        if (zzpiArr.length == 0) {
            return new com.aspose.words.internal.zzPI[0];
        }
        long jZzG = (zzy7u.zzY1g() && zzy7p.zzY0Y()) ? com.aspose.words.internal.zzZPY.zzG(zzzq4.getWidth(), 0.0f) : 0L;
        ArrayList arrayList = new ArrayList();
        com.aspose.words.internal.zzZQ4 zzzq4ZzY = com.aspose.words.internal.zzJ6.zzY(zzzq4, zzy7p.zzY10());
        float width = zzzq4ZzY.getWidth();
        float fZzZ = zzZ(zzy7u, zzy7p, zzzq4ZzY);
        ArrayList<com.aspose.words.internal.zzPI> arrayListZzV = com.aspose.words.internal.zzZQG.zzV(zzpiArr);
        if (zzy7p.zzY0Z()) {
            Collections.reverse(arrayListZzV);
        }
        for (com.aspose.words.internal.zzPI zzpi : arrayListZzV) {
            if (zzy7u.zzY1g()) {
                zzpiZzZ = zzZ(zzZ(zzpi), zzy7p, width, jZzG);
            } else {
                zzpiZzZ = zzZ(zzZ(zzpi), zzy7p, width, fZzZ);
            }
            if (zzpiZzZ.zzOG() < 0.0f) {
                zzpiZzZ.zzO(0.0f);
            }
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzPI>) arrayList, zzpiZzZ);
        }
        if (((com.aspose.words.internal.zzPI) arrayList.get(0)).zzOG() > 0.0f) {
            arrayList.add(0, new com.aspose.words.internal.zzPI(((com.aspose.words.internal.zzPI) arrayList.get(0)).zzZy(), 0.0f));
        }
        com.aspose.words.internal.zzPI zzpi2 = (com.aspose.words.internal.zzPI) C21505OooO0Oo.OooO00o(1, arrayList);
        if (zzpi2.zzOG() < 1.0f) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzPI>) arrayList, new com.aspose.words.internal.zzPI(zzpi2.zzZy(), 1.0f));
        } else if (zzpi2.zzOG() > 1.0f) {
            zzpi2.zzO(1.0f);
        }
        return (com.aspose.words.internal.zzPI[]) arrayList.toArray(new com.aspose.words.internal.zzPI[0]);
    }

    private static float zzZ(zzY7U zzy7u, zzY7P zzy7p, com.aspose.words.internal.zzZQ4 zzzq4) {
        if (!zzy7u.zzY1h()) {
            return 0.0f;
        }
        long[] jArrZzX = com.aspose.words.internal.zzJ6.zzX(zzzq4, zzy7p.zzY10());
        return zzP(jArrZzX[0], jArrZzX[3], com.aspose.words.internal.zzZPY.zzG(zzy7p.zzY1d(), zzy7p.zzY1c()));
    }

    private static com.aspose.words.internal.zzPI zzZ(com.aspose.words.internal.zzPI zzpi) {
        return new com.aspose.words.internal.zzPI(zzpi.zzZy(), zzpi.zzOG());
    }

    private static com.aspose.words.internal.zzPI zzZ(com.aspose.words.internal.zzPI zzpi, zzY7P zzy7p, float f, long j) {
        float fZzOG = zzpi.zzOG();
        if (zzy7p.zzY0Y()) {
            fZzOG = 1.0f - fZzOG;
        }
        float length = zzy7p.getLength() * fZzOG;
        float width = zzy7p.getWidth() / zzy7p.getLength();
        zzpi.zzO(com.aspose.words.internal.zzJ6.zzO(j, com.aspose.words.internal.zzZPY.zzG((width * length) + zzy7p.zzY1d(), (length * (zzy7p.getHeight() / zzy7p.getLength())) + zzy7p.zzY1c())) / f);
        return zzpi;
    }

    private static com.aspose.words.internal.zzPI zzZ(com.aspose.words.internal.zzPI zzpi, zzY7P zzy7p, float f, float f2) {
        float fZzOG = zzpi.zzOG() * zzy7p.getLength();
        zzpi.zzO((zzy7p.zzY0Z() ? f2 - fZzOG : f2 + fZzOG) / f);
        return zzpi;
    }

    private static zzY7P zzZ(com.aspose.words.internal.zzZQ4 zzzq4, zzY7U zzy7u) {
        float fZzY1d;
        float fZzY1c;
        float fZzY1b;
        float fZzY1a;
        zzY7P zzy7p = new zzY7P();
        if (zzy7u.zzY17()) {
            fZzY1d = zzzq4.getWidth() * zzy7u.zzY1d();
        } else {
            fZzY1d = zzy7u.zzY1d();
        }
        zzy7p.zzY4(fZzY1d);
        if (zzy7u.zzY16()) {
            fZzY1c = zzzq4.getHeight() * zzy7u.zzY1c();
        } else {
            fZzY1c = zzy7u.zzY1c();
        }
        zzy7p.zzY3(fZzY1c);
        if (zzy7u.zzY15()) {
            fZzY1b = zzzq4.getWidth() * zzy7u.zzY1b();
        } else {
            fZzY1b = zzy7u.zzY1b();
        }
        zzy7p.zzY2(fZzY1b);
        if (zzy7u.zzY14()) {
            fZzY1a = zzzq4.getHeight() * zzy7u.zzY1a();
        } else {
            fZzY1a = zzy7u.zzY1a();
        }
        zzy7p.zzY1(fZzY1a);
        zzy7p.setWidth(zzy7p.zzY1b() - zzy7p.zzY1d());
        zzy7p.zzk(zzy7p.zzY1a() - zzy7p.zzY1c());
        zzy7p.zzXY(zzc(zzy7p.getWidth(), zzy7p.getHeight()));
        zzy7p.zzXX((float) com.aspose.words.internal.zzAN.zzZK(Math.acos(Math.abs(zzy7p.getWidth() / zzy7p.getLength()))));
        if (zzy7p.getWidth() < 0.0f && zzy7p.getHeight() > 0.0f) {
            zzy7p.zzXX(zzy7p.zzY10() * (-1.0f));
            zzy7p.zzPP(true);
            zzy7p.zzY0X();
            return zzy7p;
        }
        if (zzy7p.getWidth() <= 0.0f && zzy7p.getHeight() <= 0.0f) {
            zzy7p.zzPP(true);
            return zzy7p;
        }
        if (zzy7p.getWidth() > 0.0f && zzy7p.getHeight() < 0.0f) {
            zzy7p.zzXX(zzy7p.zzY10() * (-1.0f));
            zzy7p.zzPP(false);
            zzy7p.zzY0X();
        }
        return zzy7p;
    }

    private static void zzZ(com.aspose.words.internal.zzZG zzzg, zzY7X zzy7x) {
        zzMP zzmpZzZWj;
        com.aspose.words.internal.zzPV zzpvZzSB;
        if (com.aspose.words.internal.zzAN.zzZD(zzy7x.zzZWe().zzSH("stroke-width")) || zzy7x.zzZWe().zzSx("stroke") == null || (zzmpZzZWj = zzy7x.zzZWe().zzSx("stroke").zzZWj()) == null || zzmpZzZWj.zzP(zzL4.zzZno)) {
            return;
        }
        if (zzmpZzZWj.zzP(zzL4.zzZnp)) {
            zzpvZzSB = com.aspose.words.internal.zzPV.zzHZ;
        } else {
            zzpvZzSB = zzy7x.zzZWe().zzSB("stroke");
        }
        if (zzpvZzSB != null || zzmpZzZWj.zzP(zzL4.zzZnp)) {
            zzzg.zzX(new com.aspose.words.internal.zzOU(zzpvZzSB));
            zzW(zzzg, zzy7x);
            zzX(zzzg, zzy7x);
            zzY(zzzg, zzy7x);
            zzV(zzzg, zzy7x);
            zzB(zzzg.zzZ2());
            zzY(zzzg.zzZ2().zzZ1(), zzY7B.zzX(zzy7x, "stroke-opacity"));
        }
    }
}
