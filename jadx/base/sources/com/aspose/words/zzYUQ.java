package com.aspose.words;

import androidx.core.view.InputDeviceCompat;
import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: loaded from: classes6.dex */
final class zzYUQ {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("circle", "comma", "dot", "underDot", "under-dot", "round", "angle", "square", "curly", "majorAscii", "majorBidi", "majorEastAsia", "majorHAnsi", "minorAscii", "minorBidi", "minorEastAsia", "minorHAnsi", "eastAsia", "fareast", TranslateLanguage.CZECH, "none", "left", "right", "all", "page", "column", "textWrapping", "text-wrapping", "blinkBackground", "blink-background", "lights", "antsBlack", "ants-black", "antsRed", "ants-red", "shimmer", "sparkle", "single", "words", "double", "thick", "dotted", "dotted-heavy", "dottedHeavy", "dash", "dashed-heavy", "dashedHeavy", "dash-long", "dashLong", "dash-long-heavy", "dashLongHeavy", "dot-dash", "dotDash", "dash-dot-heavy", "dashDotHeavy", "dot-dot-dash", "dotDotDash", "dash-dot-dot-heavy", "dashDotDotHeavy", "wave", "wavy-heavy", "wavyHeavy", "wavy-double", "wavyDouble", "white", "yellow", "green", "cyan", "magenta", "blue", "red", "darkBlue", "dark-blue", "darkCyan", "dark-cyan", "darkGreen", "dark-green", "darkMagenta", "dark-magenta", "darkRed", "dark-red", "darkYellow", "dark-yellow", "darkGray", "dark-gray", "lightGray", "light-gray", "black", "baseline", "superscript", "subscript", "normal", "add-before", "change-before", "delete-before", "change-after", "delete-and-change", "center", "distributeLetter", "distributeSpace", "rightVertical");

    public static int zzHh(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 21) {
            return 3;
        }
        if (iZzTP == 22) {
            return 4;
        }
        switch (iZzTP) {
            case 98:
                return 1;
            case 99:
                return 2;
            case 100:
                return 5;
            default:
                return 0;
        }
    }

    public static int zzHi(String str) {
        switch (zzUR.zzTP(str)) {
            case 91:
                return 1;
            case 92:
                return 2;
            case 93:
                return 3;
            case 94:
                return 4;
            case 95:
                return 5;
            case 96:
                return 6;
            default:
                return 0;
        }
    }

    public static int zzHj(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP != 89) {
            return iZzTP != 90 ? 0 : 2;
        }
        return 1;
    }

    public static com.aspose.words.internal.zzPV zzHk(String str) {
        int iZzTP = zzUR.zzTP(str);
        int i = 0;
        if (iZzTP != 20) {
            switch (iZzTP) {
                case 64:
                    i = 8;
                    break;
                case 65:
                    i = 7;
                    break;
                case 66:
                    i = 4;
                    break;
                case 67:
                    i = 3;
                    break;
                case 68:
                    i = 5;
                    break;
                case 69:
                    i = 2;
                    break;
                case 70:
                    i = 6;
                    break;
                case 71:
                case 72:
                    i = 9;
                    break;
                case 73:
                case 74:
                    i = 10;
                    break;
                case 75:
                case 76:
                    i = 11;
                    break;
                case 77:
                case 78:
                    i = 12;
                    break;
                case 79:
                case 80:
                    i = 13;
                    break;
                case 81:
                case 82:
                    i = 14;
                    break;
                case 83:
                case 84:
                    i = 15;
                    break;
                case 85:
                case 86:
                    i = 16;
                    break;
                case 87:
                    i = 1;
                    break;
            }
        }
        return zzY0E.zzhL(i);
    }

    public static int zzHl(String str) {
        switch (zzUR.zzTP(str)) {
            case 37:
                return 1;
            case 38:
                return 2;
            case 39:
                return 3;
            case 40:
                return 6;
            case 41:
                return 4;
            case 42:
            case 43:
                return 20;
            case 44:
                return 7;
            case 45:
            case 46:
                return 23;
            case 47:
            case 48:
                return 39;
            case 49:
            case 50:
                return 55;
            case 51:
            case 52:
                return 9;
            case 53:
            case 54:
                return 25;
            case 55:
            case 56:
                return 10;
            case 57:
            case 58:
                return 26;
            case 59:
                return 11;
            case 60:
            case 61:
                return 27;
            case 62:
            case 63:
                return 43;
            default:
                return 0;
        }
    }

    public static int zzHm(String str) {
        switch (zzUR.zzTP(str)) {
            case 28:
            case 29:
                return 2;
            case 30:
                return 1;
            case 31:
            case 32:
                return 4;
            case 33:
            case 34:
                return 5;
            case 35:
                return 6;
            case 36:
                return 3;
            default:
                return 0;
        }
    }

    public static char zzHn(String str) {
        switch (zzUR.zzTP(str)) {
            case 24:
                return '\f';
            case 25:
                return ControlChar.COLUMN_BREAK_CHAR;
            case 26:
            case 27:
                return ControlChar.LINE_BREAK_CHAR;
            default:
                return ControlChar.SPACE_CHAR;
        }
    }

    public static int zzHo(String str) {
        switch (zzUR.zzTP(str)) {
            case 21:
                return 1;
            case 22:
                return 2;
            case 23:
                return 3;
            default:
                return 0;
        }
    }

    public static int zzHp(String str) {
        switch (zzUR.zzTP(str)) {
            case 17:
            case 18:
                return 1;
            case 19:
                return 2;
            default:
                return 0;
        }
    }

    public static int zzHq(String str) {
        switch (zzUR.zzTP(str)) {
            case 9:
                return 65537;
            case 10:
                return 65538;
            case 11:
                return 65539;
            case 12:
                return InputDeviceCompat.SOURCE_TRACKBALL;
            case 13:
                return 131073;
            case 14:
                return 131074;
            case 15:
                return 131075;
            case 16:
                return 131076;
            default:
                return 0;
        }
    }

    public static int zzHr(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 5) {
            return 1;
        }
        if (iZzTP == 6) {
            return 3;
        }
        if (iZzTP != 7) {
            return iZzTP != 8 ? 0 : 4;
        }
        return 2;
    }

    public static int zzHs(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 0) {
            return 3;
        }
        if (iZzTP == 1) {
            return 2;
        }
        if (iZzTP != 2) {
            return (iZzTP == 3 || iZzTP == 4) ? 4 : 0;
        }
        return 1;
    }

    public static String zzW(com.aspose.words.internal.zzPV zzpv, boolean z) {
        switch (zzY0E.zzZE(zzpv)) {
            case 1:
                return "black";
            case 2:
                return "blue";
            case 3:
                return "cyan";
            case 4:
                return "green";
            case 5:
                return "magenta";
            case 6:
                return "red";
            case 7:
                return "yellow";
            case 8:
                return "white";
            case 9:
                return z ? "darkBlue" : "dark-blue";
            case 10:
                return z ? "darkCyan" : "dark-cyan";
            case 11:
                return z ? "darkGreen" : "dark-green";
            case 12:
                return z ? "darkMagenta" : "dark-magenta";
            case 13:
                return z ? "darkRed" : "dark-red";
            case 14:
                return z ? "darkYellow" : "dark-yellow";
            case 15:
                return z ? "darkGray" : "dark-gray";
            case 16:
                return z ? "lightGray" : "light-gray";
            default:
                return "none";
        }
    }

    public static String zzX(char c, boolean z) {
        return c != 11 ? c != '\f' ? c != 14 ? "" : "column" : "page" : z ? "textWrapping" : "text-wrapping";
    }

    public static String zzZF(int i, boolean z) {
        if (i == 1) {
            return "single";
        }
        if (i == 2) {
            return "words";
        }
        if (i == 3) {
            return "double";
        }
        if (i == 4) {
            return "dotted";
        }
        if (i == 6) {
            return "thick";
        }
        if (i == 7) {
            return "dash";
        }
        if (i == 20) {
            return z ? "dottedHeavy" : "dotted-heavy";
        }
        if (i == 23) {
            return z ? "dashedHeavy" : "dashed-heavy";
        }
        if (i == 39) {
            return z ? "dashLong" : "dash-long";
        }
        if (i == 43) {
            return z ? "wavyDouble" : "wavy-double";
        }
        if (i == 55) {
            return z ? "dashLongHeavy" : "dash-long-heavy";
        }
        switch (i) {
            case 9:
                return z ? "dotDash" : "dot-dash";
            case 10:
                return z ? "dotDotDash" : "dot-dot-dash";
            case 11:
                return "wave";
            default:
                switch (i) {
                    case 25:
                        return z ? "dashDotHeavy" : "dash-dot-heavy";
                    case 26:
                        return z ? "dashDotDotHeavy" : "dash-dot-dot-heavy";
                    case 27:
                        return z ? "wavyHeavy" : "wavy-heavy";
                    default:
                        return "none";
                }
        }
    }

    public static String zzZG(int i, boolean z) {
        switch (i) {
            case 1:
                return "lights";
            case 2:
                return z ? "blinkBackground" : "blink-background";
            case 3:
                return "sparkle";
            case 4:
                return z ? "antsBlack" : "ants-black";
            case 5:
                return z ? "antsRed" : "ants-red";
            case 6:
                return "shimmer";
            default:
                return "none";
        }
    }

    public static String zzZH(int i, boolean z) {
        return i != 1 ? i != 2 ? "default" : TranslateLanguage.CZECH : z ? "eastAsia" : "fareast";
    }

    public static String zzZI(int i, boolean z) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "" : z ? "underDot" : "under-dot" : "circle" : "comma" : "dot";
    }

    public static String zzt4(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "center" : "rightVertical" : "right" : "left" : "distributeSpace" : "distributeLetter";
    }

    public static String zzt5(int i) {
        switch (i) {
            case 1:
                return "normal";
            case 2:
                return "add-before";
            case 3:
                return "change-before";
            case 4:
                return "delete-before";
            case 5:
                return "change-after";
            case 6:
                return "delete-and-change";
            default:
                return "none";
        }
    }

    public static String zzt6(int i) {
        return i != 1 ? i != 2 ? "baseline" : "subscript" : "superscript";
    }

    public static String zzt7(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "" : "all" : "right" : "left" : "none";
    }

    public static String zzt8(int i) {
        switch (i) {
            case 65537:
                return "majorAscii";
            case 65538:
                return "majorBidi";
            case 65539:
                return "majorEastAsia";
            case InputDeviceCompat.SOURCE_TRACKBALL /* 65540 */:
                return "majorHAnsi";
            default:
                switch (i) {
                    case 131073:
                        return "minorAscii";
                    case 131074:
                        return "minorBidi";
                    case 131075:
                        return "minorEastAsia";
                    case 131076:
                        return "minorHAnsi";
                    default:
                        return "";
                }
        }
    }

    public static String zzt9(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "" : "curly" : "angle" : "square" : "round";
    }
}
