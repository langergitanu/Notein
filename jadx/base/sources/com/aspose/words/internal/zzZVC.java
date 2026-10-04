package com.aspose.words.internal;

import com.aspose.words.ControlChar;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.penkit.tools.DrawToolFactory;

/* JADX INFO: loaded from: classes5.dex */
final class zzZVC {
    private static boolean zzRU(int i) {
        return i == 2 || i == 3;
    }

    private static boolean zzRV(int i) {
        return i == 1 || i == 3;
    }

    public static String zzRW(int i) {
        return zzRU(i) ? "italic" : "normal";
    }

    public static String zzRX(int i) {
        return zzRV(i) ? "bold" : "normal";
    }

    public static String zzRY(int i) {
        return i != 1 ? i != 2 ? "miter" : "round" : "bevel";
    }

    public static String zzRZ(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 18 ? "butt" : "round" : "square" : "round" : "square";
    }

    public static String zzZ(zzP9 zzp9, int i, boolean z) {
        if (zzp9.zzOp()) {
            return zzZ("matrix", i, "", 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f);
        }
        float[] fArrZzOs = zzp9.zzOs();
        float f = fArrZzOs[0];
        float f2 = fArrZzOs[1];
        float f3 = fArrZzOs[2];
        if (!zzAN.zzY(f, 1.0f, 1.0E-4f) || !zzAN.zzY(f2, 1.0f, 1.0E-4f) || !zzAN.zzf(f3)) {
            return zzZ("matrix", i, "", zzp9.zzOf(), zzp9.zzOe(), zzp9.zzOd(), zzp9.zzOc(), zzp9.zzOb(), zzp9.zzOa());
        }
        float f4 = fArrZzOs[3];
        float f5 = fArrZzOs[4];
        float f6 = fArrZzOs[5];
        StringBuilder sb = new StringBuilder();
        if (!zzAN.zzf(f5) || !zzAN.zzf(f6)) {
            zzZNH.zzU(sb, zzZ("translate", i, "", f5, f6));
        }
        if (!zzAN.zzf(f4)) {
            if (sb.length() > 0) {
                sb.append(ControlChar.SPACE_CHAR);
            }
            zzZNH.zzU(sb, zzZ("rotate", i, z ? "deg" : "", f4));
        }
        return sb.toString();
    }

    public static String zze(zzZQ4 zzzq4) {
        return zzZ(DrawToolFactory.LASSO_TYPE_RECT, 2, TranslateLanguage.PORTUGUESE, zzzq4.zzZo(), zzzq4.zzkw(), zzzq4.zzZn(), zzzq4.zzZm());
    }

    public static String zzr(zzPV zzpv) {
        return zzpv.zzPD() != 255 ? zzZKN.format("rgba({0},{1},{2},{3})", Integer.valueOf(zzpv.zzPC()), Integer.valueOf(zzpv.zzPB()), Integer.valueOf(zzpv.zzPA()), zzJB.zzZU(zzpv.zzPD() / 255.0f)) : zzw(zzpv);
    }

    public static String zzw(zzPV zzpv) {
        return zzZKN.format("#{0:x2}{1:x2}{2:x2}", Integer.valueOf(zzpv.zzPC()), Integer.valueOf(zzpv.zzPB()), Integer.valueOf(zzpv.zzPA()));
    }

    private static String zzZ(String str, int i, String str2, float... fArr) {
        StringBuilder sb = new StringBuilder();
        zzZNH.zzU(sb, str);
        sb.append('(');
        for (int i2 = 0; i2 < fArr.length; i2++) {
            if (i2 > 0) {
                sb.append(',');
            }
            zzZNH.zzU(sb, zzJB.zzV(fArr[i2], i));
            zzZNH.zzU(sb, str2);
        }
        sb.append(')');
        return sb.toString();
    }
}
