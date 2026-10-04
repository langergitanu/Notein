package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZEJ extends zzZII {
    private int zzZr3;
    private static zzL4 zzYl7 = new zzOI(1.0d, 6);
    private static zzL4 zzYl6 = new zzQC(com.aspose.words.internal.zzPV.zzJu);
    private static zzPS zzYtx = new zzPS(new zzM3("padding-top", zzYl7, (byte) 0), new zzM3("padding-right", zzYl7, (byte) 0), new zzM3("padding-bottom", zzYl7, (byte) 0), new zzM3("padding-left", zzYl7, (byte) 0), new zzM3("display", zzL4.zzZmp, (byte) 0), new zzM3("border-spacing", new zzOI(2.0d, 6), (byte) 0), new zzM3("border-collapse", zzL4.zzZm0, (byte) 0), new zzM3("border-top-color", zzYl6, (byte) 0), new zzM3("border-right-color", zzYl6, (byte) 0), new zzM3("border-bottom-color", zzYl6, (byte) 0), new zzM3("border-left-color", zzYl6, (byte) 0));
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("left", "right", "center", "none", "groups", "rows", "cols", "all", "void", "above", "below", "hsides", "lhs", "rhs", "vsides", "box", "border");

    public zzZEJ(int i) {
        this.zzZr3 = i;
    }

    @Override // com.aspose.words.zzZII
    public final void zzY(zzZAS zzzas, zzPR zzpr) {
        if (this.zzZr3 == 2) {
            zzpr.zzV(new zzM3("font-weight", zzL4.zzZnm, (byte) 0));
            zzpr.zzV(new zzM3("font-style", zzL4.zzZnm, (byte) 0));
            zzpr.zzV(new zzM3("font-variant", zzL4.zzZnm, (byte) 0));
            zzpr.zzV(new zzM3("font-size", zzL4.zzZnm, (byte) 0));
        }
    }

    @Override // com.aspose.words.zzZII
    public final void zzZ(zzZAS zzzas, zzPR zzpr) {
        String str;
        byte b;
        String str2;
        byte b2;
        byte b3;
        zzpr.zzO(zzYtx);
        com.aspose.words.internal.zzZHW zzzhw = zzUR;
        int iZzTP = zzzhw.zzTP(com.aspose.words.internal.zzZKN.zzU2(zzzas.getAttributeValue("align", "")));
        if (iZzTP == 0) {
            zzpr.zzV(new zzM3("float", zzL4.zzZmH, (byte) 0));
        } else if (iZzTP == 1) {
            zzpr.zzV(new zzM3("float", zzL4.zzZmG, (byte) 0));
        } else if (iZzTP == 2) {
            zzpr.zzV(new zzM3("margin-left", zzL4.zzZng, (byte) 0));
            zzpr.zzV(new zzM3("margin-right", zzL4.zzZng, (byte) 0));
        }
        int iZzTP2 = zzzhw.zzTP(com.aspose.words.internal.zzZKN.zzU2(zzzas.getAttributeValue("rules", "")));
        if (iZzTP2 == 3 || iZzTP2 == 4 || iZzTP2 == 5 || iZzTP2 == 6 || iZzTP2 == 7) {
            str = "margin-right";
            b = 0;
            zzpr.zzV(new zzM3("border-top-style", zzL4.zzZly, (byte) 0));
            zzpr.zzV(new zzM3("border-right-style", zzL4.zzZly, (byte) 0));
            zzpr.zzV(new zzM3("border-bottom-style", zzL4.zzZly, (byte) 0));
            zzpr.zzV(new zzM3("border-left-style", zzL4.zzZly, (byte) 0));
            str2 = "margin-left";
            zzpr.zzV(new zzM3("border-collapse", zzL4.zzZm1, (byte) 0));
            zzQC zzqc = new zzQC(com.aspose.words.internal.zzPV.zzKa);
            zzpr.zzV(new zzM3("border-top-color", zzqc, (byte) 0));
            zzpr.zzV(new zzM3("border-right-color", zzqc, (byte) 0));
            zzpr.zzV(new zzM3("border-bottom-color", zzqc, (byte) 0));
            zzpr.zzV(new zzM3("border-left-color", zzqc, (byte) 0));
        } else {
            str = "margin-right";
            str2 = "margin-left";
            b = 0;
        }
        String strZzKM = zzzas.zzKM("border");
        if (strZzKM != null && zzZDY.zzJS(strZzKM) != 0) {
            zzpr.zzV(new zzM3("border-top-style", zzL4.zzZlq, b));
            zzpr.zzV(new zzM3("border-right-style", zzL4.zzZlq, b));
            zzpr.zzV(new zzM3("border-bottom-style", zzL4.zzZlq, b));
            zzpr.zzV(new zzM3("border-left-style", zzL4.zzZlq, b));
        }
        if (strZzKM != null) {
            zzL4 zzl4ZzS3 = zzL4.zzS3(strZzKM);
            if (zzl4ZzS3 == null) {
                zzl4ZzS3 = new zzOI(1.0d, 6);
            }
            zzpr.zzV(new zzM3("border-top-width", zzl4ZzS3, (byte) 0));
            zzpr.zzV(new zzM3("border-right-width", zzl4ZzS3, (byte) 0));
            zzpr.zzV(new zzM3("border-bottom-width", zzl4ZzS3, (byte) 0));
            zzpr.zzV(new zzM3("border-left-width", zzl4ZzS3, (byte) 0));
        }
        switch (zzzhw.zzTP(com.aspose.words.internal.zzZKN.zzU2(zzzas.getAttributeValue("frame", "")))) {
            case 8:
                zzpr.zzV(new zzM3("border-top-style", zzL4.zzZly, (byte) 0));
                zzpr.zzV(new zzM3("border-right-style", zzL4.zzZly, (byte) 0));
                zzpr.zzV(new zzM3("border-bottom-style", zzL4.zzZly, (byte) 0));
                zzpr.zzV(new zzM3("border-left-style", zzL4.zzZly, (byte) 0));
                break;
            case 9:
                zzpr.zzV(new zzM3("border-top-style", zzL4.zzZlq, (byte) 0));
                zzpr.zzV(new zzM3("border-right-style", zzL4.zzZly, (byte) 0));
                zzpr.zzV(new zzM3("border-bottom-style", zzL4.zzZly, (byte) 0));
                zzpr.zzV(new zzM3("border-left-style", zzL4.zzZly, (byte) 0));
                break;
            case 10:
                zzpr.zzV(new zzM3("border-top-style", zzL4.zzZly, (byte) 0));
                zzpr.zzV(new zzM3("border-right-style", zzL4.zzZly, (byte) 0));
                zzpr.zzV(new zzM3("border-bottom-style", zzL4.zzZlq, (byte) 0));
                zzpr.zzV(new zzM3("border-left-style", zzL4.zzZly, (byte) 0));
                break;
            case 11:
                zzpr.zzV(new zzM3("border-top-style", zzL4.zzZlq, (byte) 0));
                zzpr.zzV(new zzM3("border-right-style", zzL4.zzZly, (byte) 0));
                zzpr.zzV(new zzM3("border-bottom-style", zzL4.zzZlq, (byte) 0));
                zzpr.zzV(new zzM3("border-left-style", zzL4.zzZly, (byte) 0));
                break;
            case 12:
                zzpr.zzV(new zzM3("border-top-style", zzL4.zzZly, (byte) 0));
                zzpr.zzV(new zzM3("border-right-style", zzL4.zzZly, (byte) 0));
                zzpr.zzV(new zzM3("border-bottom-style", zzL4.zzZly, (byte) 0));
                zzpr.zzV(new zzM3("border-left-style", zzL4.zzZlq, (byte) 0));
                break;
            case 13:
                zzpr.zzV(new zzM3("border-top-style", zzL4.zzZly, (byte) 0));
                zzpr.zzV(new zzM3("border-right-style", zzL4.zzZlq, (byte) 0));
                zzpr.zzV(new zzM3("border-bottom-style", zzL4.zzZly, (byte) 0));
                zzpr.zzV(new zzM3("border-left-style", zzL4.zzZly, (byte) 0));
                break;
            case 14:
                zzpr.zzV(new zzM3("border-top-style", zzL4.zzZly, (byte) 0));
                zzpr.zzV(new zzM3("border-right-style", zzL4.zzZlq, (byte) 0));
                zzpr.zzV(new zzM3("border-bottom-style", zzL4.zzZly, (byte) 0));
                zzpr.zzV(new zzM3("border-left-style", zzL4.zzZlq, (byte) 0));
                break;
            case 15:
            case 16:
                zzpr.zzV(new zzM3("border-top-style", zzL4.zzZlq, (byte) 0));
                zzpr.zzV(new zzM3("border-right-style", zzL4.zzZlq, (byte) 0));
                zzpr.zzV(new zzM3("border-bottom-style", zzL4.zzZlq, (byte) 0));
                zzpr.zzV(new zzM3("border-left-style", zzL4.zzZlq, (byte) 0));
                break;
        }
        switch (zzzhw.zzTP(com.aspose.words.internal.zzZKN.zzU2(zzzas.getAttributeValue("frame", "")))) {
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                zzQC zzqc2 = new zzQC(com.aspose.words.internal.zzPV.zzKa);
                b2 = 0;
                zzpr.zzV(new zzM3("border-top-color", zzqc2, (byte) 0));
                zzpr.zzV(new zzM3("border-right-color", zzqc2, (byte) 0));
                zzpr.zzV(new zzM3("border-bottom-color", zzqc2, (byte) 0));
                zzpr.zzV(new zzM3("border-left-color", zzqc2, (byte) 0));
                break;
            default:
                b2 = 0;
                break;
        }
        zzL4 zzl4ZzS32 = zzL4.zzS3(zzzas.zzKM("cellpadding"));
        if (zzl4ZzS32 != null) {
            zzpr.zzV(new zzM3("padding-top", zzl4ZzS32, b2));
            zzpr.zzV(new zzM3("padding-right", zzl4ZzS32, b2));
            zzpr.zzV(new zzM3("padding-bottom", zzl4ZzS32, b2));
            zzpr.zzV(new zzM3("padding-left", zzl4ZzS32, b2));
        }
        zzL4 zzl4ZzS33 = zzL4.zzS3(zzzas.zzKM("cellspacing"));
        if (zzl4ZzS33 != null) {
            zzpr.zzV(new zzM3("border-spacing", zzl4ZzS33, b2));
        }
        zzL4 zzl4ZzS2 = zzL4.zzS2(zzzas.zzKM("hspace"));
        if (zzl4ZzS2 != null) {
            zzpr.zzV(new zzM3(str2, zzl4ZzS2, b2));
            zzpr.zzV(new zzM3(str, zzl4ZzS2, b2));
        }
        zzL4 zzl4ZzS22 = zzL4.zzS2(zzzas.zzKM("vspace"));
        if (zzl4ZzS22 != null) {
            zzpr.zzV(new zzM3("margin-top", zzl4ZzS22, b2));
            zzpr.zzV(new zzM3("margin-bottom", zzl4ZzS22, b2));
        }
        zzZII.zzT(zzzas, zzpr);
        zzZII.zzS(zzzas, zzpr);
        zzZUY.zzX(zzzas, zzpr);
        zzL4 zzl4ZzS1 = zzL4.zzS1(zzzas.zzKM("bordercolor"));
        if (zzl4ZzS1 != null) {
            b3 = 0;
            zzpr.zzV(new zzM3("border-top-color", zzl4ZzS1, (byte) 0));
            zzpr.zzV(new zzM3("border-right-color", zzl4ZzS1, (byte) 0));
            zzpr.zzV(new zzM3("border-bottom-color", zzl4ZzS1, (byte) 0));
            zzpr.zzV(new zzM3("border-left-color", zzl4ZzS1, (byte) 0));
        } else {
            b3 = 0;
        }
        if (this.zzZr3 == 2) {
            zzpr.zzV(new zzM3("line-height", zzL4.zzZnm, b3));
            zzpr.zzV(new zzM3("white-space", zzL4.zzZnm, b3));
            zzpr.zzV(new zzM3("text-align", zzL4.zzZnm, b3));
        }
    }
}
