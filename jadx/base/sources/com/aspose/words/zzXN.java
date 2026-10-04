package com.aspose.words;

import androidx.appcompat.widget.C21532OooOOo;

/* JADX INFO: loaded from: classes6.dex */
final class zzXN {
    private static boolean zzW(zzZAW zzzaw) {
        int fillType = zzzaw.getFillType();
        if (fillType != 4 && fillType != 7 && fillType != 8) {
            return false;
        }
        int iZzZBu = (int) zzzaw.zzZBu();
        return iZzZBu == -135 || iZzZBu == -90 || iZzZBu == -45;
    }

    private static boolean zzX(zzZAW zzzaw) {
        return zzzaw.zzZBw() == null || zzzaw.zzZBw().length == 0;
    }

    public static com.aspose.words.internal.zzPY zzY(com.aspose.words.internal.zzPV zzpv, double d) {
        return new com.aspose.words.internal.zzOI(zzZ(zzpv, d));
    }

    public static com.aspose.words.internal.zzPY zzZ(zzZAW zzzaw, long j, float f, zzYBX zzybx, boolean z, com.aspose.words.internal.zzZG zzzg) throws Exception {
        Shape shape = zzybx.getShape();
        switch (zzzaw.getFillType()) {
            case 1:
                return zzZ(zzzaw.getImageBytes(), zzzaw.zz8Q(), zzzaw.zzZBx(), (float) zzzaw.getOpacity());
            case 2:
                return zzZ(zzzaw, f, z);
            case 3:
                return zzZ(zzzaw, zzybx, z);
            case 4:
            case 7:
            case 8:
            case 10:
                return zzY(shape, j);
            case 5:
                return zzZ(shape, j);
            case 6:
                return (shape.isWordArt() || zzYCC.zzZy(shape)) ? zzZ(shape, j) : zzZ(shape, zzzg, com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) j) * 0.5f, com.aspose.words.internal.zzZPW.zzYz(j) * 0.5f));
            case 9:
            default:
                return zzY(zzzaw.zz8Q(), zzzaw.getOpacity());
        }
    }

    private static void zzX(Shape shape, com.aspose.words.internal.zzPL zzpl) {
        int i;
        zzZAW zzzawZzY9J = shape.zzY9J();
        zzZLE[] zzzleArrZzZBw = zzzawZzY9J.zzZBw();
        int length = zzzleArrZzZBw.length;
        com.aspose.words.internal.zzPI[] zzpiArr = new com.aspose.words.internal.zzPI[length];
        for (int i2 = 0; i2 < length; i2++) {
            double d = (float) (((double) zzzleArrZzZBw[i2].zzZfb) / 65536.0d);
            zzpiArr[i2] = new com.aspose.words.internal.zzPI(zzZ(zzzleArrZzZBw[i2].zzYuy, C21532OooOOo.OooO0O0(zzzawZzY9J.getOpacity(), zzzawZzY9J.zzZBv(), d, zzzawZzY9J.zzZBv())), (float) d);
        }
        int i3 = zzpiArr[0].zzOG() > 0.0f ? length + 1 : length;
        int i4 = length - 1;
        if (zzpiArr[i4].zzOG() < 1.0f) {
            i3++;
        }
        if (i3 > length) {
            com.aspose.words.internal.zzPI[] zzpiArr2 = new com.aspose.words.internal.zzPI[i3];
            if (zzpiArr[0].zzOG() > 0.0f) {
                zzpiArr2[0] = new com.aspose.words.internal.zzPI(zzpiArr[0].zzZy(), 0.0f);
                i = 1;
            } else {
                i = 0;
            }
            com.aspose.words.internal.zzZKV.zzZ(zzpiArr, 0, zzpiArr2, i, length);
            if (zzpiArr[i4].zzOG() < 1.0f) {
                zzpiArr2[i3 - 1] = new com.aspose.words.internal.zzPI(zzpiArr[i4].zzZy(), 1.0f);
            }
            zzpiArr = zzpiArr2;
        }
        zzpl.zzY(zzZ(zzpiArr, zzzawZzY9J));
    }

    private static boolean zzY(zzZAW zzzaw) {
        return zzX(zzzaw) && zzzaw.zz8Q().toArgb() == zzzaw.zzZBx().toArgb() && zzzaw.getOpacity() == zzzaw.zzZBv();
    }

    private static void zzY(Shape shape, com.aspose.words.internal.zzPL zzpl) {
        zzZAW zzzawZzY9J = shape.zzY9J();
        com.aspose.words.internal.zzPV zzpvZz8Q = zzzawZzY9J.zz8Q();
        com.aspose.words.internal.zzPV zzpvZzZ = zzZ7K.zzZ(zzzawZzY9J.zzZBx(), shape);
        com.aspose.words.internal.zzPV zzpvZzZ2 = zzZ(zzpvZz8Q, zzzawZzY9J.getOpacity());
        com.aspose.words.internal.zzPV zzpvZzZ3 = zzZ(zzpvZzZ, zzzawZzY9J.zzZBv());
        zzpl.zzY(zzZ(new com.aspose.words.internal.zzPI[]{new com.aspose.words.internal.zzPI(zzpvZzZ2, 0.0f), new com.aspose.words.internal.zzPI(com.aspose.words.internal.zzPS.zzZ(zzpvZzZ2, zzpvZzZ3, 0.2f), 0.2f), new com.aspose.words.internal.zzPI(com.aspose.words.internal.zzPS.zzZ(zzpvZzZ2, zzpvZzZ3, 0.4f), 0.4f), new com.aspose.words.internal.zzPI(com.aspose.words.internal.zzPS.zzZ(zzpvZzZ2, zzpvZzZ3, 0.6f), 0.6f), new com.aspose.words.internal.zzPI(com.aspose.words.internal.zzPS.zzZ(zzpvZzZ2, zzpvZzZ3, 0.8f), 0.8f), new com.aspose.words.internal.zzPI(zzpvZzZ3, 1.0f)}, zzzawZzY9J));
    }

    private static com.aspose.words.internal.zzPV zzZ(com.aspose.words.internal.zzPV zzpv, double d) {
        return new com.aspose.words.internal.zzPV(zzpv.zzPD() != 255 ? zzpv.zzPD() : (int) (d * 255.0d), zzpv);
    }

    private static com.aspose.words.internal.zzPY zzY(Shape shape, long j) {
        com.aspose.words.internal.zzZQ4 zzzq4ZzY;
        zzZAW zzzawZzY9J = shape.zzY9J();
        if (zzYCC.zzXm(j)) {
            return null;
        }
        if (zzY(zzzawZzY9J)) {
            return zzY(zzzawZzY9J.zz8Q(), zzzawZzY9J.getOpacity());
        }
        com.aspose.words.internal.zzZQ4 zzzq4 = new com.aspose.words.internal.zzZQ4(0.0f, 0.0f, Float.intBitsToFloat((int) j), com.aspose.words.internal.zzZPW.zzYz(j));
        float f = (-((float) zzzawZzY9J.zzZBu())) - 90.0f;
        float fZzY9E = (float) shape.zzY9E();
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        if (shape.zzYaC()) {
            zzp9.zzZ(f, com.aspose.words.internal.zzJ6.zzB(zzzq4), 1);
            zzzq4ZzY = com.aspose.words.internal.zzJ6.zzY(zzzq4, -f);
            zzZ(zzp9, f, zzzq4);
            zzp9.zzZ(fZzY9E, com.aspose.words.internal.zzJ6.zzB(zzzq4), 1);
        } else {
            zzp9.zzZ(f, com.aspose.words.internal.zzJ6.zzB(zzzq4), 1);
            com.aspose.words.internal.zzZQ4 zzzq4ZzY2 = com.aspose.words.internal.zzJ6.zzY(zzzq4, fZzY9E);
            zzzq4ZzY = com.aspose.words.internal.zzJ6.zzY(zzzq4ZzY2, -f);
            zzZ(zzp9, f, zzzq4ZzY2);
        }
        com.aspose.words.internal.zzPA zzpa = new com.aspose.words.internal.zzPA(zzzq4ZzY);
        zzpa.zzL(zzp9);
        zzpa.zzNb().zzZ(1.00001f, 1.00001f, 0);
        zzpa.zzXR(1);
        zzZ(shape, zzpa);
        return zzpa;
    }

    public static com.aspose.words.internal.zzPY zzZ(byte[] bArr, com.aspose.words.internal.zzPV zzpv, com.aspose.words.internal.zzPV zzpv2, float f) {
        if (bArr == null) {
            return zzY(zzpv, 1.0d);
        }
        com.aspose.words.internal.zzOH zzoh = new com.aspose.words.internal.zzOH(bArr);
        zzoh.zzX(new com.aspose.words.internal.zzPV[]{com.aspose.words.internal.zzPV.zzI5, zzpv, com.aspose.words.internal.zzPV.zzKa, zzpv2});
        zzoh.zzy(f);
        zzoh.zzNb().zzZ(0.75f, 0.75f, 0);
        return zzoh;
    }

    private static com.aspose.words.internal.zzPY zzZ(zzZAW zzzaw, zzYBX zzybx, boolean z) throws Exception {
        if (zzzaw.getImageBytes() == null) {
            return zzY(zzzaw.zz8Q(), zzzaw.getOpacity());
        }
        com.aspose.words.internal.zzOH zzoh = new com.aspose.words.internal.zzOH(zzzaw.getImageBytes(), z ? 0 : 4);
        zzoh.zzy((float) zzzaw.getOpacity());
        if (z) {
            zzZ(zzoh, zzybx);
            return zzoh;
        }
        zzoh.zzL(zzybx.zzO(com.aspose.words.internal.zzEF.zzZT(zzzaw.getImageBytes()).getSize(), zzzaw.zzZBs()));
        return zzoh;
    }

    private static void zzZ(com.aspose.words.internal.zzOH zzoh, zzYBX zzybx) throws Exception {
        com.aspose.words.internal.zzEG zzegZzZT = com.aspose.words.internal.zzEF.zzZT(zzoh.getImageBytes());
        if (!zzegZzZT.zzDR() && zzybx != null && (zzybx.getShape().isImage() || zzybx.getShape().zzY9J().getFillType() == 3 || zzybx.getShape().zzY9J().getFillType() == 2)) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) zzybx.zzY8I());
            float fZzYz = com.aspose.words.internal.zzZPW.zzYz(zzybx.zzY8I());
            zzoh.zzNb().zzZ((float) (((double) fIntBitsToFloat) / zzegZzZT.getWidthPoints()), (float) (((double) fZzYz) / zzegZzZT.getHeightPoints()), 1);
        }
        zzoh.zzNb().zzZ((float) (72.0d / zzegZzZT.getVerticalResolution()), (float) (72.0d / zzegZzZT.getVerticalResolution()), 1);
    }

    private static com.aspose.words.internal.zzPY zzZ(Shape shape, com.aspose.words.internal.zzZG zzzg, long j) {
        zzZAW zzzawZzY9J = shape.zzY9J();
        if (zzY(zzzawZzY9J)) {
            return zzY(zzzawZzY9J.zz8Q(), zzzawZzY9J.getOpacity());
        }
        com.aspose.words.internal.zzP0 zzp0 = new com.aspose.words.internal.zzP0(zzzg.zzZ0(), j);
        zzZ(shape, zzp0);
        return zzp0;
    }

    private static void zzZ(Shape shape, com.aspose.words.internal.zzPL zzpl) {
        if (zzX(shape.zzY9J())) {
            zzY(shape, zzpl);
        } else {
            zzX(shape, zzpl);
        }
    }

    private static com.aspose.words.internal.zzPI[] zzZ(com.aspose.words.internal.zzPI[] zzpiArr, zzZAW zzzaw) {
        float f;
        float fZzZBo = zzzaw.zzZBo();
        if (zzW(zzzaw)) {
            fZzZBo = fZzZBo > 0.0f ? fZzZBo - 100.0f : fZzZBo + 100.0f;
        }
        if (fZzZBo == 0.0f) {
            return zzpiArr;
        }
        int length = zzpiArr.length;
        int i = 0;
        if (fZzZBo == 100.0f) {
            com.aspose.words.internal.zzPI[] zzpiArr2 = new com.aspose.words.internal.zzPI[zzpiArr.length];
            while (i < length) {
                zzpiArr2[(length - 1) - i] = new com.aspose.words.internal.zzPI(zzpiArr[i].zzZy(), 1.0f - zzpiArr[i].zzOG());
                i++;
            }
            return zzpiArr2;
        }
        float f2 = fZzZBo * 0.01f;
        if (f2 > 0.0f) {
            f = 1.0f - f2;
        } else {
            f = -f2;
            f2 += 1.0f;
        }
        int i2 = length * 2;
        com.aspose.words.internal.zzPI[] zzpiArr3 = new com.aspose.words.internal.zzPI[i2];
        while (i < length) {
            com.aspose.words.internal.zzPI zzpi = zzpiArr[f2 > 0.0f ? i : (length - 1) - i];
            float fZzOG = zzpi.zzOG();
            if (f2 <= 0.0f) {
                fZzOG = 1.0f - fZzOG;
            }
            zzpiArr3[i] = new com.aspose.words.internal.zzPI(zzpi.zzZy(), fZzOG * f);
            zzpiArr3[(i2 - 1) - i] = new com.aspose.words.internal.zzPI(zzpi.zzZy(), 1.0f - (fZzOG * f2));
            i++;
        }
        return zzpiArr3;
    }

    private static com.aspose.words.internal.zzPY zzZ(Shape shape, long j) {
        long jZzX;
        zzZAW zzzawZzY9J = shape.zzY9J();
        com.aspose.words.internal.zzZG zzzg = new com.aspose.words.internal.zzZG();
        com.aspose.words.internal.zzP5 zzp5 = new com.aspose.words.internal.zzP5();
        zzp5.zze(true);
        com.aspose.words.internal.zzZQG.zzZ(zzzg.zzZ0().zzO7(), zzp5);
        com.aspose.words.internal.zzZQ4 zzzq4 = new com.aspose.words.internal.zzZQ4(0.0f, 0.0f, Float.intBitsToFloat((int) j), com.aspose.words.internal.zzZPW.zzYz(j));
        if (shape.zzYaC()) {
            jZzX = com.aspose.words.internal.zzJ6.zzX(com.aspose.words.internal.zzJ6.zzZ((float) zzzawZzY9J.zzZBq(), (float) zzzawZzY9J.zzZBp(), zzzq4), com.aspose.words.internal.zzJ6.zzB(zzzq4), (float) shape.getRotation());
            zzp5.zzZ(com.aspose.words.internal.zzJ6.zzX(zzzq4, (float) shape.getRotation()), false);
        } else {
            com.aspose.words.internal.zzZQ4 zzzq4ZzY = com.aspose.words.internal.zzJ6.zzY(zzzq4, (float) shape.getRotation());
            long jZzZ = com.aspose.words.internal.zzJ6.zzZ((float) zzzawZzY9J.zzZBq(), (float) zzzawZzY9J.zzZBp(), zzzq4ZzY);
            zzp5.zzJ(zzzq4ZzY);
            jZzX = jZzZ;
        }
        return zzZ(shape, zzzg, jZzX);
    }

    private static com.aspose.words.internal.zzPY zzZ(zzZAW zzzaw, float f, boolean z) throws Exception {
        if (zzzaw.getImageBytes() == null) {
            return zzY(zzzaw.zz8Q(), zzzaw.getOpacity());
        }
        com.aspose.words.internal.zzOH zzoh = new com.aspose.words.internal.zzOH(zzzaw.getImageBytes(), (byte) 0);
        zzoh.zzNb().zzX(f, 0);
        if (z) {
            zzZ(zzoh, (zzYBX) null);
        }
        return zzoh;
    }

    private static void zzZ(com.aspose.words.internal.zzP9 zzp9, float f, com.aspose.words.internal.zzZQ4 zzzq4) {
        if (f % 90.0f == 0.0f) {
            return;
        }
        com.aspose.words.internal.zzZQ4 zzzq4ZzY = com.aspose.words.internal.zzJ6.zzY(zzzq4, f);
        float fSqrt = (float) Math.sqrt(2.0d);
        zzp9.zzY((-zzzq4.getWidth()) / 2.0f, (-zzzq4.getHeight()) / 2.0f, 1);
        zzp9.zzZ((zzzq4.getWidth() * fSqrt) / zzzq4ZzY.getWidth(), (zzzq4.getHeight() * fSqrt) / zzzq4ZzY.getHeight(), 1);
        zzp9.zzY(zzzq4.getWidth() / 2.0f, zzzq4.getHeight() / 2.0f, 1);
    }
}
