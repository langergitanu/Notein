package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYTW {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("001, 002, 003, ...", "0001, 0002, 0003, ...", "00001, 00002, 00003, ...", "A, Ç, Ĝ, ...", "a, ç, ĝ, ...", "Α, Β, Γ, ...", "α, β, γ, ...");

    private static int zzA(String str) {
        if (!com.aspose.words.internal.zzZYD.zzXk(str)) {
            return 0;
        }
        char cCharAt = str.charAt(0);
        if (Character.isLowerCase(cCharAt)) {
            return 5;
        }
        if (Character.isUpperCase(cCharAt)) {
            return 4;
        }
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 0) {
            return 24;
        }
        if (iZzTP == 1) {
            return 25;
        }
        if (iZzTP == 2) {
            return 26;
        }
        throw new IllegalArgumentException(com.aspose.words.internal.zzZKN.format("Unexpected custom number format style: '{0}'", str));
    }

    private static int zzJF(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 3 || iZzTP == 4) {
            return 1055;
        }
        return (iZzTP == 5 || iZzTP == 6) ? EditingLanguage.GREEK : EditingLanguage.ENGLISH_US;
    }

    public static String zzM(int i, int i2, boolean z) {
        return zzZ(i, i2, "", z);
    }

    public static String zzUy(int i) {
        return com.aspose.words.internal.zz7H.zzUy(i);
    }

    private static String zzY(long j, int i, boolean z, int i2) {
        return zzZ(j, i, "", false, i2);
    }

    public static int zzYg(String str) {
        return com.aspose.words.internal.zz7H.zzYg(str);
    }

    public static String zzZ(int i, int i2, String str, boolean z) {
        return com.aspose.words.internal.zz7H.zzZ(i, zzo(i2, str), z, zzJF(str));
    }

    private static int zzo(int i, String str) {
        if (i == 255) {
            return 0;
        }
        if (i == 65280) {
            return zzA(str);
        }
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 27;
            case 24:
                return 28;
            case 25:
                return 29;
            case 26:
                return 30;
            case 27:
                return 31;
            case 28:
                return 32;
            case 29:
                return 33;
            case 30:
                return 34;
            case 31:
                return 35;
            case 32:
                return 36;
            case 33:
                return 37;
            case 34:
                return 38;
            case 35:
                return 39;
            case 36:
                return 40;
            case 37:
                return 41;
            case 38:
                return 42;
            case 39:
                return 43;
            case 40:
                return 44;
            case 41:
                return 45;
            case 42:
                return 46;
            case 43:
                return 47;
            case 44:
                return 48;
            case 45:
                return 49;
            case 46:
                return 50;
            case 47:
                return 51;
            case 48:
                return 52;
            case 49:
                return 53;
            case 50:
                return 54;
            case 51:
                return 55;
            case 52:
                return 56;
            case 53:
                return 57;
            case 54:
                return 58;
            case 55:
                return 59;
            case 56:
                return 60;
            case 57:
                return 61;
            case 58:
                return 62;
            case 59:
                return 63;
            default:
                throw new IllegalArgumentException(com.aspose.words.internal.zzZKN.format("Unexpected number style: '{0}'", Integer.valueOf(i)));
        }
    }

    public static String zzy(long j, int i) {
        return zzY(j, i, false, com.aspose.words.internal.zzZNG.zzpZ().zzj9().intValue());
    }

    public static String zzZ(long j, int i, String str, boolean z, int i2) {
        int iZzo = zzo(i, str);
        if (iZzo == 5 || iZzo == 4) {
            if (com.aspose.words.internal.zzZYD.zzXk(str)) {
                i2 = zzJF(str);
            } else if (i2 != 1053) {
                i2 = EditingLanguage.ENGLISH_US;
            }
        }
        return com.aspose.words.internal.zz7H.zzY(j, iZzo, z, i2);
    }
}
