package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZSJ {
    public static String zzRG(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "None" : "FlipXY" : "FlipY" : "FlipX" : "Tile";
    }

    public static String zzRH(int i) {
        return i != 0 ? i != 2 ? i != 3 ? "Square" : "Triangle" : "Round" : "Flat";
    }

    public static String zzRI(int i) {
        if (i == 0) {
            return "Flat";
        }
        if (i != 1) {
            if (i == 2) {
                return "Round";
            }
            if (i == 3) {
                return "Triangle";
            }
            if (i == 240 || i == 255) {
                return "Flat";
            }
            switch (i) {
                case 16:
                case 19:
                case 20:
                    return "Flat";
                case 17:
                    break;
                case 18:
                    return "Round";
                default:
                    return "Square";
            }
        }
        return "Square";
    }

    public static String zzRJ(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Bevel" : "Miter" : "Round" : "Bevel" : "Miter";
    }

    public static double zzZp(double d) {
        return (d * 96.0d) / 72.0d;
    }
}
