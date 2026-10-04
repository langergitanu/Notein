package com.aspose.words;

import com.huawei.hms.network.embedded.C18438z3;

/* JADX INFO: loaded from: classes6.dex */
final class zzU7 {
    static String zzZtX = Character.toString(57347);
    static String zzZtW = Character.toString(57348);
    static String zzZtV = Character.toString(57352);
    static String SECTION_BREAK = Character.toString(57359);
    static String zzZtU = Character.toString(57360);
    static String zzZtT = Character.toString(57363);
    static String zzZtS = Character.toString(57364);
    static String zzZtR = Character.toString(57366);
    static String zzZtQ = Character.toString(57367);
    static String zzZtP = Character.toString(57368);
    static String zzZtO = Character.toString(57369);
    static String zzZtN = Character.toString(57376);
    static String zzZtM = Character.toString(57377);
    static String zzZtL = Character.toString(57378);
    static String zzZtK = Character.toString(57379);
    static String zzZtJ = Character.toString(57380);
    static String PARAGRAPH_BREAK = Character.toString(57613);
    static String zzZtI = Character.toString(57614);
    static String zzZtH = Character.toString(60416);

    public static boolean zzSV(String str) {
        return str.length() == 1 && zzZp(str.charAt(0));
    }

    public static String zzX(char c, int i, int i2) {
        if (i >= i2) {
            i = 0;
        }
        return com.aspose.words.internal.zzZKN.zzS((char) (c + i), 1);
    }

    public static boolean zzZh(char c) {
        return zzZj(c) || zzZi(c);
    }

    public static boolean zzZi(char c) {
        return 59904 <= c && c < 60416;
    }

    public static boolean zzZj(char c) {
        return 58880 <= c && c < 59392;
    }

    public static boolean zzZk(char c) {
        return zzZm(c) || zzZl(c);
    }

    public static boolean zzZl(char c) {
        return 59392 <= c && c < 59904;
    }

    public static boolean zzZm(char c) {
        return 58368 <= c && c < 58880;
    }

    public static boolean zzZn(char c) {
        return 57856 <= c && c < 58368;
    }

    public static boolean zzZo(char c) {
        return c == 57613 || c == 57614;
    }

    public static boolean zzZp(char c) {
        return 60416 <= c && c < 61952;
    }

    public static boolean zzZq(char c) {
        if (zzZp(c) || zzZn(c) || zzZk(c) || zzZh(c)) {
            return true;
        }
        switch (c) {
            case 2:
            case 3:
            case 4:
            case 5:
            case '\r':
            case 20:
            case 57347:
            case 57348:
            case 57352:
            case 57359:
            case 57360:
            case 57363:
            case 57364:
            case 57366:
            case 57367:
            case 57368:
            case 57369:
            case 57376:
            case 57377:
            case 57378:
            case 57379:
            case 57380:
            case 57613:
            case 57614:
                break;
        }
        return true;
    }

    public static int zzZr(char c) {
        if (c == 160) {
            return 6;
        }
        if (com.aspose.words.internal.zzZKU.zzG(c)) {
            return 3;
        }
        if (Character.isLetter(c)) {
            return 1;
        }
        if (Character.isDigit(c)) {
            return 2;
        }
        if (c == 57369) {
            return 5;
        }
        if (zzZq(c)) {
            return 4;
        }
        switch (c) {
            case '!':
            case '\"':
            case '(':
            case ')':
            case ',':
            case '-':
            case '.':
            case '/':
            case ':':
            case ';':
            case '<':
            case '>':
            case '?':
            case '[':
            case ']':
            case 174:
            case C18438z3.f56774j /* 8220 */:
            case 8221:
            case 8804:
            case 12290:
            case 65292:
            case 65306:
            case 65307:
                return 6;
            case '_':
                return 3;
            default:
                return 5;
        }
    }
}
