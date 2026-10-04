package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzB5 {
    public static boolean zzJr(int i) {
        return i == 8;
    }

    public static boolean zzJs(int i) {
        return i == 22 || i == 27;
    }

    public static boolean zzJt(int i) {
        switch (i) {
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
                return true;
            default:
                return false;
        }
    }

    private static boolean zzJu(int i) {
        return i == 22 || i == 27;
    }

    public static float zzR(int i, float f) {
        return !zzJu(i) ? f : (float) com.aspose.words.internal.zzZKQ.zzR(f, 0);
    }
}
