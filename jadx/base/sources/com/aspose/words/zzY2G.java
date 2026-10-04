package com.aspose.words;

import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.notein.domain.models.backup.BackupFile;

/* JADX INFO: loaded from: classes6.dex */
final class zzY2G {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("", "px", TranslateLanguage.PORTUGUESE, BackupFile.EXTENSION_NOTEIN_FILE, "mm", "cm", "fd", "f");
    private String zzWWA;
    private double zzWWB;
    private String zzZ3F;
    private boolean zzZiG;

    public zzY2G(String str) {
        this(str, "");
    }

    private boolean isZero() {
        return this.zzWWB == 0.0d && zzXT8();
    }

    private boolean zzXT5() {
        return BackupFile.EXTENSION_NOTEIN_FILE.equals(this.zzWWA) || "px".equals(this.zzWWA) || TranslateLanguage.PORTUGUESE.equals(this.zzWWA) || "mm".equals(this.zzWWA) || "cm".equals(this.zzWWA);
    }

    private boolean zzXT6() {
        return this.zzZiG && zzXT8();
    }

    public final boolean isFixed() {
        if (this.zzZiG) {
            return "f".equals(this.zzWWA) || zzXT8();
        }
        return false;
    }

    public final int zzXT0() {
        isFixed();
        com.aspose.words.internal.zzZKN.format("'{0}' is not a valid fixed value.", this.zzZ3F);
        if (isFixed()) {
            return zzXT6() ? com.aspose.words.internal.zzAN.zzZG(this.zzWWB * 65536.0d) : com.aspose.words.internal.zzAN.zzZG(this.zzWWB);
        }
        return 0;
    }

    public final int zzXT1() {
        zzYmB();
        com.aspose.words.internal.zzZKN.format("'{0}' is not a valid percent value.", this.zzZ3F);
        if (zzYmB()) {
            return com.aspose.words.internal.zzAN.zzZG(this.zzWWB);
        }
        return 0;
    }

    public final int zzXT2() {
        zzXTa();
        com.aspose.words.internal.zzZKN.format("'{0}' is not a valid degrees value.", this.zzZ3F);
        int iZzTP = zzUR.zzTP(this.zzWWA);
        if (iZzTP == 0) {
            return com.aspose.words.internal.zzAN.zzZG(this.zzWWB * 65536.0d);
        }
        if (iZzTP == 6 || iZzTP == 7) {
            return com.aspose.words.internal.zzAN.zzZG(this.zzWWB);
        }
        return 0;
    }

    public final zzYM2 zzXT3() {
        return new zzYM2(com.aspose.words.internal.zzSA.zzr(zzXT4()), false);
    }

    public final double zzXT4() {
        zzXT9();
        com.aspose.words.internal.zzZKN.format("'{0}' is not a valid distance value.", this.zzZ3F);
        int iZzTP = zzUR.zzTP(this.zzWWA);
        if (iZzTP == 0) {
            return this.zzWWB;
        }
        if (iZzTP == 1) {
            return com.aspose.words.internal.zzSA.pixelToPoint(this.zzWWB);
        }
        if (iZzTP == 2) {
            return this.zzWWB;
        }
        if (iZzTP == 3) {
            return this.zzWWB * 72.0d;
        }
        if (iZzTP == 4) {
            return this.zzWWB * 2.834645669291339d;
        }
        if (iZzTP != 5) {
            return 0.0d;
        }
        return this.zzWWB * 28.34645669291339d;
    }

    public final int zzXT7() {
        return com.aspose.words.internal.zzAN.zzZG(zzXT4() * 12700.0d);
    }

    public final boolean zzXT8() {
        return com.aspose.words.internal.zzZKN.equals(this.zzWWA, "");
    }

    public final boolean zzXT9() {
        if (this.zzZiG) {
            return zzXT5() || zzXT8() || isZero();
        }
        return false;
    }

    public final boolean zzXTa() {
        if (this.zzZiG) {
            return "fd".equals(this.zzWWA) || "f".equals(this.zzWWA) || zzXT8();
        }
        return false;
    }

    public final boolean zzYmB() {
        if (this.zzZiG) {
            return "%".equals(this.zzWWA) || isZero();
        }
        return false;
    }

    public zzY2G(String str, String str2) {
        this.zzWWA = "";
        this.zzZ3F = str;
        if (com.aspose.words.internal.zzZKN.equals(str, "")) {
            return;
        }
        int length = str.length() - 1;
        while (length >= 0 && (str.charAt(length) < '0' || str.charAt(length) > '9')) {
            length--;
        }
        int i = length + 1;
        this.zzWWB = com.aspose.words.internal.zzJB.zzZs(str.substring(0, i));
        this.zzZiG = !Double.isNaN(r2);
        String strZzTX = com.aspose.words.internal.zzZKN.zzTX(str.substring(i, ((str.length() - length) - 1) + i));
        this.zzWWA = strZzTX;
        if (com.aspose.words.internal.zzZYD.zzXk(strZzTX)) {
            return;
        }
        this.zzWWA = str2;
    }
}
