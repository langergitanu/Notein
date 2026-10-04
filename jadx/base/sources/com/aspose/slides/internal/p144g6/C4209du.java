package com.aspose.slides.internal.p144g6;

import com.aspose.slides.internal.p505xn.C12566m9;

/* JADX INFO: renamed from: com.aspose.slides.internal.g6.du */
/* JADX INFO: loaded from: classes.dex */
public class C4209du {
    /* JADX INFO: renamed from: k4 */
    public static double m16893k4(double d) {
        return C12566m9.m58642h4(d * 96.0d);
    }

    /* JADX INFO: renamed from: kk */
    public static String m16895kk(int i) {
        return i != 0 ? i != 2 ? i != 3 ? "Square" : "Triangle" : "Round" : "Flat";
    }

    /* JADX INFO: renamed from: to */
    public static String m16896to(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "None" : "FlipXY" : "FlipY" : "FlipX" : "Tile";
    }

    /* JADX INFO: renamed from: x1 */
    public static String m16897x1(int i) {
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

    /* JADX INFO: renamed from: k4 */
    public static String m16894k4(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Bevel" : "Miter" : "Round" : "Bevel" : "Miter";
    }
}
