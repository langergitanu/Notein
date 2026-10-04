package com.aspose.words.internal;

import com.aspose.words.EditingLanguage;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.notein.domain.models.backup.BackupFile;

/* JADX INFO: loaded from: classes5.dex */
final class zz6Y {
    private static String zzH(long j, int i) {
        if (zzBZ.zzZY(19, i)) {
            return "e";
        }
        int i2 = (int) j;
        return i2 != -1 ? i2 != 0 ? i2 != 1 ? "e" : "er" : "" : "er";
    }

    private static String zzI(long j, int i) {
        switch (zzUh(i)) {
            case 0:
                return zzZd(j);
            case 1:
                return ".";
            case 2:
                return "º";
            case 3:
                return zzH(j, i);
            case 4:
                return "-й";
            case 5:
                return "°";
            case 6:
                return "ο";
            case 7:
                return zzZe(j);
            case 8:
                return zzZf(j);
            case 9:
                return zzZg(j);
            default:
                throw new IllegalArgumentException();
        }
    }

    public static String zzJ(long j, int i) {
        return zzZKN.format("{0}{1}", Long.valueOf(j), zzI(j, i));
    }

    private static int zzUh(int i) {
        switch (i) {
            case 3:
            case EditingLanguage.CATALAN /* 1027 */:
                return 9;
            case 5:
            case 7:
            case 11:
            case 14:
            case 20:
            case 21:
            case 26:
            case 31:
            case 36:
            case 37:
            case 45:
            case EditingLanguage.CZECH /* 1029 */:
            case EditingLanguage.GERMAN_GERMANY /* 1031 */:
            case EditingLanguage.FINNISH /* 1035 */:
            case EditingLanguage.HUNGARIAN /* 1038 */:
            case EditingLanguage.NORWEGIAN_BOKMAL /* 1044 */:
            case EditingLanguage.POLISH /* 1045 */:
            case 1050:
            case 1055:
            case EditingLanguage.SLOVENIAN /* 1060 */:
            case EditingLanguage.ESTONIAN /* 1061 */:
            case EditingLanguage.BASQUE /* 1069 */:
            case EditingLanguage.GERMAN_SWITZERLAND /* 2055 */:
            case EditingLanguage.NORWEGIAN_NYNORSK /* 2068 */:
            case EditingLanguage.SERBIAN_LATIN_SERBIA_AND_MONTENEGRO /* 2074 */:
            case EditingLanguage.GERMAN_AUSTRIA /* 3079 */:
            case EditingLanguage.SERBIAN_CYRILLIC_SERBIA_AND_MONTENEGRO /* 3098 */:
            case EditingLanguage.GERMAN_LUXEMBOURG /* 4103 */:
            case EditingLanguage.CROATIAN_BOZNIA_AND_HERZEGOVINA /* 4122 */:
            case EditingLanguage.GERMAN_LIECHTENSTEIN /* 5127 */:
            case EditingLanguage.BOSNIAN_LATIN /* 5146 */:
            case EditingLanguage.SERBIAN_LATIN_BOSNIA_AND_HERZEGOVINA /* 6170 */:
            case EditingLanguage.SERBIAN_CYRILLIC_BOSNIA_AND_HERZEGOVINA /* 7194 */:
            case EditingLanguage.BOSNIAN_CYRILLIC /* 8218 */:
            case 31770:
                return 1;
            case 6:
            case EditingLanguage.DANISH /* 1030 */:
                return 7;
            case 8:
            case EditingLanguage.GREEK /* 1032 */:
                return 6;
            case 10:
            case 22:
            case EditingLanguage.SPANISH_SPAIN_TRADITIONAL_SORT /* 1034 */:
            case EditingLanguage.PORTUGUESE_BRAZIL /* 1046 */:
            case EditingLanguage.SPANISH_MEXICO /* 2058 */:
            case EditingLanguage.PORTUGUESE_PORTUGAL /* 2070 */:
            case EditingLanguage.SPANISH_SPAIN_MODERN_SORT /* 3082 */:
            case EditingLanguage.SPANISH_GUATEMALA /* 4106 */:
            case EditingLanguage.SPANISH_COSTA_RICA /* 5130 */:
            case EditingLanguage.SPANISH_PANAMA /* 6154 */:
            case EditingLanguage.SPANISH_DOMINICAN_REPUBLIC /* 7178 */:
            case EditingLanguage.SPANISH_VENEZUELA /* 8202 */:
            case EditingLanguage.SPANISH_COLOMBIA /* 9226 */:
            case EditingLanguage.SPANISH_PERU /* 10250 */:
            case EditingLanguage.SPANISH_ARGENTINA /* 11274 */:
            case EditingLanguage.SPANISH_ECUADOR /* 12298 */:
            case EditingLanguage.SPANISH_CHILE /* 13322 */:
            case EditingLanguage.SPANISH_URUGUAY /* 14346 */:
            case EditingLanguage.SPANISH_PARAGUAY /* 15370 */:
            case EditingLanguage.SPANISH_BOLIVIA /* 16394 */:
            case EditingLanguage.SPANISH_EL_SALVADOR /* 17418 */:
            case EditingLanguage.SPANISH_HONDURAS /* 18442 */:
            case EditingLanguage.SPANISH_NICARAGUA /* 19466 */:
            case EditingLanguage.SPANISH_PUERTO_RICO /* 20490 */:
                return 2;
            case 12:
            case 19:
            case EditingLanguage.FRENCH_FRANCE /* 1036 */:
            case EditingLanguage.DUTCH_NETHERLANDS /* 1043 */:
            case EditingLanguage.FRENCH_BELGIUM /* 2060 */:
            case EditingLanguage.DUTCH_BELGIUM /* 2067 */:
            case EditingLanguage.FRENCH_CANADA /* 3084 */:
            case EditingLanguage.FRENCH_SWITZERLAND /* 4108 */:
            case EditingLanguage.FRENCH_LUXEMBOURG /* 5132 */:
            case EditingLanguage.FRENCH_MONACO /* 6156 */:
            case 7180:
            case 8204:
            case 9228:
            case 10252:
            case 11276:
            case 12300:
            case 13324:
            case 14348:
            case 15372:
                return 3;
            case 16:
            case EditingLanguage.ITALIAN_ITALY /* 1040 */:
            case EditingLanguage.ITALIAN_SWITZERLAND /* 2064 */:
                return 5;
            case 25:
            case 1049:
            case 2073:
                return 4;
            case 29:
            case 1053:
            case EditingLanguage.SWEDISH_FINLAND /* 2077 */:
                return 8;
            default:
                return 0;
        }
    }

    private static String zzZd(long j) {
        int iAbs = (int) (Math.abs(j) % 100);
        if (iAbs >= 4 && iAbs <= 20) {
            return TranslateLanguage.THAI;
        }
        int i = iAbs % 10;
        return i != 1 ? i != 2 ? i != 3 ? TranslateLanguage.THAI : "rd" : "nd" : "st";
    }

    private static String zzZe(long j) {
        int iAbs;
        if (j != 0 && (iAbs = ((int) Math.abs(j)) % 100) != 11 && iAbs != 12 && iAbs != 30) {
            switch (iAbs) {
            }
            return "te";
        }
        return "te";
    }

    private static String zzZf(long j) {
        int iAbs = (int) (Math.abs(j) % 100);
        if (iAbs >= 10 && iAbs <= 20) {
            return ":e";
        }
        int i = iAbs % 10;
        return (i == 1 || i == 2) ? ":a" : ":e";
    }

    private static String zzZg(long j) {
        int iAbs = (int) Math.abs(j);
        return iAbs != 1 ? iAbs != 2 ? iAbs != 3 ? iAbs != 4 ? iAbs != 14 ? "è" : "èh" : "t" : "r" : BackupFile.PREFIX_NOTE_DIR : "r";
    }

    public static String zzZh(long j) {
        return zzZKN.format("{0}{1}", Long.valueOf(j), zzZd(j));
    }
}
