package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY11 {
    private static zzY1B zzWUL;
    private static zzY1R zzWUN;
    private static zzY1Q zzWUO;
    private static zzY13 zzWUP;
    private static zzY19 zzWUQ;
    private static zzY0S zzWUR;
    private static zzY0W zzWUS;
    private static zzY0T zzWUT;
    private static zzY14 zzWUU;
    private static zzY1U zzWUV;
    private static zzYVG zzYNq;
    private static zzY0Y zzWUW = new zzY0Y();
    private static zzY0U zzWUK = new zzY0U();
    private static zzY18 zzWUM = new zzY18();

    static {
        zzY1G zzy1g = new zzY1G();
        zzY1C zzy1c = new zzY1C();
        zzY1B zzy1b = new zzY1B(zzy1c);
        zzWUL = zzy1b;
        zzy1c.zzZ(zzy1b);
        zzYV7 zzyv7 = new zzYV7(zzy1b);
        zzY14 zzy14 = new zzY14(zzWUW, zzWUK);
        zzWUU = zzy14;
        zzYNq = new zzYVG(zzWUW, zzy14);
        zzY1U zzy1u = new zzY1U(zzYNq, zzWUK);
        zzWUV = zzy1u;
        zzWUU.zzZ(zzy1u);
        zzWUK.zzZ(zzWUV);
        zzWUP = new zzY13(zzWUU, zzy1b);
        zzWUN = new zzY1R(zzWUP);
        zzWUT = new zzY0T(zzy1b);
        zzY2D zzy2d = new zzY2D();
        zzWUS = new zzY0W(zzWUT, zzWUW, zzWUP, zzy1g, zzyv7, zzy1c, zzy2d);
        zzWUR = new zzY0S(zzWUU, zzWUW);
        zzWUQ = new zzY19(zzWUW, zzWUU, zzy2d);
        zzWUO = new zzY1Q(zzWUT, zzWUU, zzWUN);
    }

    public static zzY12 zzU(com.aspose.words.internal.zzZOP zzzop, Document document) throws Exception {
        return new zzY12(zzzop, document, new LoadOptions(), true, zzWUR, zzWUQ, zzWUK);
    }

    public static zzY18 zzXSs() {
        return zzWUM;
    }

    public static zzY1R zzXSt() {
        return zzWUN;
    }

    public static zzY1Q zzXSu() {
        return zzWUO;
    }

    public static zzY13 zzXSv() {
        return zzWUP;
    }

    public static zzY0W zzXSw() {
        return zzWUS;
    }

    public static zzY0T zzXSx() {
        return zzWUT;
    }

    public static zzY1U zzXSy() {
        return zzWUV;
    }

    public static zzY12 zzZ(com.aspose.words.internal.zzZOP zzzop, LoadOptions loadOptions, Document document) throws Exception {
        return new zzY12(zzzop, document, loadOptions, false, zzWUR, zzWUQ, zzWUK);
    }

    public static zzY16 zzn(zzYVB zzyvb) {
        return new zzY16(zzyvb, zzZWW.zzZl4(), zzWUL);
    }
}
