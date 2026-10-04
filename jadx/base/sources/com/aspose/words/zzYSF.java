package com.aspose.words;

import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.network.embedded.C18358t1;
import com.orion.notein.domain.models.backup.BackupFile;

/* JADX INFO: loaded from: classes6.dex */
final class zzYSF {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW(BackupFile.EXTENSION_NOTEIN_FILE, TranslateLanguage.PORTUGUESE, "cm", "pc", "px", "mm");

    public static boolean zzFO(String str) {
        if (!com.aspose.words.internal.zzZYD.zzXk(str) || str.length() < 3) {
            return false;
        }
        int iZzTP = zzUR.zzTP(str.substring(str.length() - 2, str.length()));
        return iZzTP == 0 || iZzTP == 1 || iZzTP == 2 || iZzTP == 3 || iZzTP == 4 || iZzTP == 5;
    }

    private static double zzFP(String str) {
        return com.aspose.words.internal.zzJB.parseDouble(str.substring(0, str.length() - 2));
    }

    private static String zzFQ(String str) {
        return str.substring(str.length() - 2, str.length());
    }

    public static int zzFR(String str) {
        if (com.aspose.words.internal.zzJB.zzZ7(str)) {
            str = com.aspose.words.internal.zzZKN.format("{0}pt", str);
        }
        return com.aspose.words.internal.zzSA.zzt(zzFV(str));
    }

    public static double zzFS(String str) {
        if (com.aspose.words.internal.zzZKN.zzW(str, "%", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
            return com.aspose.words.internal.zzJB.parseDouble(str.replace("%", ""));
        }
        return Double.NaN;
    }

    public static int zzFT(String str) {
        if (com.aspose.words.internal.zzZKN.zzW(str, C18358t1.g.f56183c, com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
            return com.aspose.words.internal.zzJB.parseInt(com.aspose.words.internal.zzZKN.zzS(str, '*'));
        }
        return Integer.MIN_VALUE;
    }

    public static int zzFU(String str) {
        return com.aspose.words.internal.zzSA.zzp(zzFV(str));
    }

    public static double zzFV(String str) {
        double d;
        if (!zzFO(str)) {
            return 0.0d;
        }
        double dZzFP = zzFP(str);
        int iZzTP = zzUR.zzTP(zzFQ(str));
        if (iZzTP == 0) {
            d = 72.0d;
        } else {
            if (iZzTP == 1) {
                return dZzFP;
            }
            d = iZzTP != 3 ? iZzTP != 4 ? iZzTP != 5 ? 28.34645669291339d : 2.834645669291339d : 0.75d : 12.0d;
        }
        return dZzFP * d;
    }

    public static double zzFW(String str) {
        if (!zzFO(str)) {
            return 0.0d;
        }
        double dZzFP = zzFP(str);
        int iZzTP = zzUR.zzTP(zzFQ(str));
        return iZzTP != 0 ? iZzTP != 1 ? iZzTP != 2 ? iZzTP != 3 ? iZzTP != 4 ? dZzFP / 10.0d : com.aspose.words.internal.zzSA.zzi(dZzFP) * 0.75d : com.aspose.words.internal.zzSA.zzi(dZzFP) * 12.0d : dZzFP : com.aspose.words.internal.zzSA.zzi(dZzFP) : dZzFP * 2.54d;
    }

    public static int zzFX(String str) {
        if (!zzFO(str)) {
            return 0;
        }
        double dZzFP = zzFP(str);
        int iZzTP = zzUR.zzTP(zzFQ(str));
        return iZzTP != 0 ? iZzTP != 1 ? iZzTP != 2 ? iZzTP != 3 ? iZzTP != 4 ? com.aspose.words.internal.zzSA.zzw(dZzFP) : com.aspose.words.internal.zzSA.zzr(dZzFP * 0.75d) : com.aspose.words.internal.zzSA.zzr(dZzFP * 12.0d) : com.aspose.words.internal.zzSA.zzu(dZzFP) : com.aspose.words.internal.zzSA.zzr(dZzFP) : com.aspose.words.internal.zzSA.zzq(dZzFP);
    }

    public static void zzZ(String str, zzYOY zzyoy, zzYEF zzyef, int i) {
        if (com.aspose.words.internal.zzZKN.zzW(str, "%", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
            zzyoy.zzWy(com.aspose.words.internal.zzJB.parseDouble(str.replace("%", "")));
        } else {
            zzyef.zzQ(i, Integer.valueOf(zzFR(str)));
        }
    }
}
