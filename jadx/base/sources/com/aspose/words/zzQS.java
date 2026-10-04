package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzQS {
    private static String[] zzZrC = {"border-bottom-style", "border-left-style", "border-right-style", "border-top-style"};
    private static String[] zzZrB = {"border-bottom-width", "border-left-width", "border-right-width", "border-top-width"};
    private static String[] zzZrA = {"border-bottom-color", "border-left-color", "border-right-color", "border-top-color"};
    private static String[] zzZrz = {"padding-bottom", "padding-left", "padding-right", "padding-top"};
    private static String[] zzZry = {"-aw-border-bottom-style", "-aw-border-left-style", "-aw-border-right-style", "-aw-border-top-style"};
    private static String[] zzZrx = {"-aw-border-bottom-width", "-aw-border-left-width", "-aw-border-right-width", "-aw-border-top-width"};

    private static boolean zzG(Border border) {
        if (com.aspose.words.internal.zzAN.zzS(0.75f, border.zz8S()) || border.zz8S() > 0.75f) {
            return border.getLineStyle() == 22 || border.getLineStyle() == 6 || border.getLineStyle() == 3 || border.getLineStyle() == 24 || border.getLineStyle() == 25 || border.getLineStyle() == 1 || border.getLineStyle() == 27 || border.getLineStyle() == 26;
        }
        return false;
    }

    public static float zzH(Border border) {
        if (border.zz8S() > 0.0f) {
            return Math.max(border.zz8S(), 0.75f);
        }
        return 0.0f;
    }

    private static String zzMC(int i) {
        switch (i) {
            case 1:
                return "single";
            case 2:
                return "thick";
            case 3:
                return "double";
            case 4:
            default:
                return "none";
            case 5:
                return "hairline";
            case 6:
                return "dot";
            case 7:
                return "dash-large-gap";
            case 8:
                return "dot-dash";
            case 9:
                return "dot-dot-dash";
            case 10:
                return "triple";
            case 11:
                return "thin-thick-small-gap";
            case 12:
                return "thick-thin-small-gap";
            case 13:
                return "thin-thick-thin-small-gap";
            case 14:
                return "thin-thick-medium-gap";
            case 15:
                return "thick-thin-medium-gap";
            case 16:
                return "thin-thick-thin-medium-gap";
            case 17:
                return "thin-thick-large-gap";
            case 18:
                return "thick-thin-large-gap";
            case 19:
                return "thin-thick-thin-large-gap";
            case 20:
                return "wave";
            case 21:
                return "double-wave";
            case 22:
                return "dash-small-gap";
            case 23:
                return "dash-dot-stroker";
            case 24:
                return "emboss3d";
            case 25:
                return "engrave3d";
            case 26:
                return "outset";
            case 27:
                return "inset";
        }
    }

    public static boolean zzMD(int i) {
        if (i != 1 && i != 2 && i != 3) {
            switch (i) {
                default:
                    switch (i) {
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                        default:
                            return false;
                    }
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    return true;
            }
        }
        return true;
    }

    private static com.aspose.words.internal.zzPV zzY(com.aspose.words.internal.zzPV zzpv, int i) {
        return !zzpv.isEmpty() ? zzpv : (i == 26 || i == 27) ? com.aspose.words.internal.zzPV.zzS(238, 238, 238) : com.aspose.words.internal.zzPV.zzKa;
    }

    public static boolean zzZ(zzLU zzlu, BorderCollection borderCollection, boolean z) throws Exception {
        if (borderCollection.isVisible()) {
            return zzZ(zzlu, borderCollection.getTop(), borderCollection.getLeft(), borderCollection.getBottom(), borderCollection.getRight(), false, false, z, false);
        }
        return false;
    }

    private static String zzp(int i, boolean z) {
        if (i == 0) {
            return "none";
        }
        if (i == 3) {
            return "double";
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
                return "dotted";
            case 7:
                return "dashed";
            case 10:
                return "double";
            default:
                switch (i) {
                    case 21:
                        return "double";
                    case 22:
                    case 23:
                        return "dashed";
                    case 24:
                        return "groove";
                    case 25:
                        return "ridge";
                    case 26:
                        return z ? "inset" : "outset";
                    case 27:
                        return z ? "outset" : "inset";
                    default:
                        return "solid";
                }
        }
    }

    public static boolean zzZ(zzLU zzlu, Border border, Border border2, Border border3, Border border4, boolean z, boolean z2, boolean z3, boolean z4) {
        return zzZ(zzlu, border, 3, false, z2, z3, z4) || zzZ(zzlu, border2, 1, false, z2, z3, z4) || zzZ(zzlu, border3, 0, false, z2, z3, z4) || zzZ(zzlu, border4, 2, false, z2, z3, z4);
    }

    public static boolean zzZ(zzLU zzlu, Border border, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        if (border == null || !border.isVisible()) {
            return false;
        }
        if (z2) {
            if (i == 1) {
                i = 2;
            } else if (i == 2) {
                i = 1;
            }
        }
        zzZ(zzlu, border, i, z3, z4);
        if (z && border.getDistanceFromText() > 0.0d) {
            zzlu.zzZ(zzZrz[i], border.getDistanceFromText(), 4);
        }
        return true;
    }

    public static boolean zzZ(Border border, zzLU zzlu, boolean z) {
        if (!border.isVisible()) {
            return false;
        }
        zzZ(zzlu, border, 0, z, false);
        zzZ(zzlu, border, 1, z, false);
        zzZ(zzlu, border, 2, z, false);
        zzZ(zzlu, border, 3, z, false);
        return true;
    }

    public static void zzZ(zzLU zzlu, Border border, int i) {
        String str;
        if (i == 4) {
            str = "-aw-border-insideh";
        } else if (i != 5) {
            return;
        } else {
            str = "-aw-border-insidev";
        }
        zzlu.zzV(new zzM3(str, new zzRC(new zzOI(border.getLineWidth(), 4), new zzOT(zzMC(border.getLineStyle())), new zzQC(border.zz8Q()))));
    }

    private static void zzZ(zzLU zzlu, Border border, int i, boolean z, boolean z2) {
        zzlu.zzZs(zzZrC[i], zzp(border.getLineStyle(), z2));
        zzlu.zzY(zzZrA[i], zzY(border.zz8Q(), border.getLineStyle()));
        zzlu.zzZ(zzZrB[i], zzH(border), 4);
        if (!z || zzG(border)) {
            return;
        }
        zzlu.zzZs(zzZry[i], zzMC(border.getLineStyle()));
        zzlu.zzZ(zzZrx[i], border.getLineWidth(), 4);
    }
}
