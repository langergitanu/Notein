package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYTI {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("top", "left", "bottom", "right");
    private Border zzXRG;
    private Border zzXRH;
    private Border zzXRI;
    private Border zzXRJ;

    public static boolean zzA(Border border) {
        return border == null || border.equals(Border.zzZCe) || border.isInherited();
    }

    public static boolean zzB(Border border) {
        return !zzA(border) && border.isVisible();
    }

    private static boolean zzV(Border border, Border border2) {
        return (border == null ? 0 : border.zz8K()) == (border2 == null ? 0 : border2.zz8K());
    }

    public final Border zzGC(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 0) {
            return this.zzXRJ;
        }
        if (iZzTP == 1) {
            return this.zzXRI;
        }
        if (iZzTP == 2) {
            return this.zzXRH;
        }
        if (iZzTP == 3) {
            return this.zzXRG;
        }
        throw new IllegalStateException(com.aspose.words.internal.zzZKN.format("Unexpected side value '{0}'", str));
    }

    public final Border zzYy9() {
        Border border = this.zzXRJ;
        if (border != null) {
            return border;
        }
        Border border2 = this.zzXRI;
        if (border2 != null) {
            return border2;
        }
        Border border3 = this.zzXRH;
        if (border3 != null) {
            return border3;
        }
        Border border4 = this.zzXRG;
        if (border4 != null) {
            return border4;
        }
        return null;
    }

    public final boolean zzYya() {
        return zzV(this.zzXRJ, this.zzXRI) && zzV(this.zzXRI, this.zzXRH) && zzV(this.zzXRH, this.zzXRG);
    }

    public final float zzYyb() {
        float fMax = -3.4028235E38f;
        if (zzB(this.zzXRJ) && this.zzXRJ.getShadow()) {
            fMax = Math.max(-3.4028235E38f, this.zzXRJ.zz8S());
        }
        if (zzB(this.zzXRI) && this.zzXRI.getShadow()) {
            fMax = Math.max(fMax, this.zzXRI.zz8S());
        }
        if (zzB(this.zzXRH) && this.zzXRH.getShadow()) {
            fMax = Math.max(fMax, this.zzXRH.zz8S());
        }
        return (zzB(this.zzXRG) && this.zzXRG.getShadow()) ? Math.max(fMax, this.zzXRG.zz8S()) : fMax;
    }

    public final boolean zze(int i, Object obj) {
        switch (i) {
            case 1350:
            case 2130:
            case 3110:
            case EditingLanguage.SPANISH_GUATEMALA /* 4106 */:
                this.zzXRJ = (Border) obj;
                return true;
            case 1360:
            case 2140:
            case 3120:
            case 4107:
                this.zzXRI = (Border) obj;
                return true;
            case 1370:
            case 2150:
            case 3130:
            case EditingLanguage.FRENCH_SWITZERLAND /* 4108 */:
                this.zzXRH = (Border) obj;
                return true;
            case 1380:
            case 2160:
            case 3140:
            case 4109:
                this.zzXRG = (Border) obj;
                return true;
            default:
                return false;
        }
    }
}
