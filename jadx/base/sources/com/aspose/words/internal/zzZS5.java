package com.aspose.words.internal;

import com.aspose.words.ControlChar;

/* JADX INFO: loaded from: classes5.dex */
final class zzZS5 {
    private static String zzO(float[] fArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < fArr.length; i++) {
            zzZNH.zzU(sb, zzJB.zzr(fArr[i]));
            if (i < fArr.length - 1) {
                sb.append(ControlChar.SPACE_CHAR);
            }
        }
        if (fArr.length % 2 == 1) {
            zzZNH.zzU(sb, " 0");
        }
        return sb.toString();
    }

    private static void zzY(zzZS1 zzzs1, zzZSK zzzsk, zzPY zzpy, zzZQ4 zzzq4) throws Exception {
        zzzs1.zzY("Path.Fill");
        zzZSM.zzZ(zzzs1, zzzsk, zzpy, zzzq4);
        zzzs1.zzp();
    }

    public static void zzZ(zzZS1 zzzs1, zzZSK zzzsk, zzZG zzzg) throws Exception {
        zzOV zzov = new zzOV();
        String strZzZ = zzov.zzZ(zzzg.zzZ0(), true);
        if (zzZYD.zzXk(strZzZ)) {
            zzzs1.zzY("Path");
            if (zzzg.zzZ2() != null) {
                zzzs1.zzX("StrokeThickness", zzzg.zzZ2().getWidth());
                zzzs1.zzX("StrokeLineJoin", zzZSJ.zzRJ(zzzg.zzZ2().zzNM()));
                if (zzzg.zzZ2().zzNM() == 0 || zzzg.zzZ2().zzNM() == 3) {
                    zzzs1.zzX("StrokeMiterLimit", zzzg.zzZ2().zzNL());
                }
                zzzs1.zzX("StrokeStartLineCap", zzZSJ.zzRI(zzzg.zzZ2().zzNN()));
                zzzs1.zzX("StrokeEndLineCap", zzZSJ.zzRI(zzzg.zzZ2().getEndCap()));
                if (zzzg.zzZ2().getDashStyle() != 0) {
                    zzzs1.zzX("StrokeDashOffset", zzzg.zzZ2().zzNK());
                    zzzs1.zzX("StrokeDashCap", zzZSJ.zzRH(zzzg.zzZ2().zzNJ()));
                    zzzs1.zzX("StrokeDashArray", zzO(zzzg.zzZ2().zzNH()));
                }
            }
            if (zzzg.zzZO() != null) {
                zzzs1.zzW("RenderTransform", zzzg.zzZO());
            }
            zzzs1.zzX("Data", strZzZ);
            if (zzzg.zzZN() != null) {
                zzzs1.zzX("Clip", zzov.zzZ(zzzg.zzZN(), true));
            }
            zzZQ4 zzzq4ZzS = zz6E.zzK(zzzg) ? zzP6.zzS(zzzg.zzZ0()) : zzZQ4.zz2T;
            if (zzzg.zzZ1() != null) {
                zzY(zzzs1, zzzsk, zzzg.zzZ1(), zzzq4ZzS);
            }
            if (zzzg.zzZ2() != null) {
                zzZ(zzzs1, zzzsk, zzzg.zzZ2(), zzzq4ZzS);
            }
            zzzs1.zzp();
        }
    }

    private static void zzZ(zzZS1 zzzs1, zzZSK zzzsk, zzOU zzou, zzZQ4 zzzq4) throws Exception {
        zzzs1.zzY("Path.Stroke");
        zzZSM.zzZ(zzzs1, zzzsk, zzou.zzZ1(), zzzq4);
        zzzs1.zzp();
    }
}
