package com.aspose.words;

import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: loaded from: classes6.dex */
final class zzZJP extends zzZII {
    private int zzZr3;
    private static zzL4 zzYsM = new zzQC(com.aspose.words.internal.zzPV.zzJu);
    private static zzL4 zzYsL = new zzOI(1.0d, 6);
    private static zzPS zzYtx = new zzPS(new zzM3("display", zzL4.zzZmi, (byte) 0), new zzM3("padding-top", zzYsL, (byte) 0), new zzM3("padding-right", zzYsL, (byte) 0), new zzM3("padding-bottom", zzYsL, (byte) 0), new zzM3("padding-left", zzYsL, (byte) 0), new zzM3("vertical-align", zzL4.zzZnn, (byte) 0));
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("none", "groups", "rows", "cols", "all");

    public zzZJP(int i) {
        this.zzZr3 = i;
    }

    private static zzZBM zzN(zzZBM zzzbm) {
        zzZBM zzzbmZzZ2Q = zzzbm.zzZ2Q();
        if (zzzbmZzZ2Q != null && TranslateLanguage.TURKISH.equals(zzzbmZzZ2Q.zzZTQ()) && (zzzbmZzZ2Q = zzzbmZzZ2Q.zzZ2Q()) != null && ("thead".equals(zzzbmZzZ2Q.zzZTQ()) || "tbody".equals(zzzbmZzZ2Q.zzZTQ()) || "tfoot".equals(zzzbmZzZ2Q.zzZTQ()))) {
            zzzbmZzZ2Q = zzzbmZzZ2Q.zzZ2Q();
        }
        if (zzzbmZzZ2Q == null || !"table".equals(zzzbmZzZ2Q.zzZTQ())) {
            return null;
        }
        return zzzbmZzZ2Q;
    }

    private void zzU(zzZAS zzzas, zzPR zzpr) {
        zzZUY.zzW(zzzas, zzpr);
        zzZUY.zzX(zzzas, zzpr);
        zzZII.zzZ((zzZBM) zzzas, zzpr, true);
        zzZII.zzT(zzzas, zzpr);
        zzL4 zzl4ZzS2 = zzL4.zzS2(zzzas.zzKM("width"));
        if (zzl4ZzS2 != null) {
            zzpr.zzV(new zzM3("width", zzl4ZzS2, (byte) 0));
        }
        if (zzzas.zzKM("nowrap") != null) {
            if (this.zzZr3 == 2 && zzl4ZzS2 != null && zzl4ZzS2.getValueType() == 4) {
                zzpr.zzV(new zzM3("white-space", zzL4.zzZnb, (byte) 0));
            } else {
                zzpr.zzV(new zzM3("white-space", zzL4.zzZlZ, (byte) 0));
            }
        }
    }

    private static void zzV(zzZAS zzzas, zzPR zzpr) {
        zzZBM zzzbmZzZ2Q = zzzas.zzZ2Q();
        if (zzzbmZzZ2Q == null || !TranslateLanguage.TURKISH.equals(zzzbmZzZ2Q.zzZTQ())) {
            zzzbmZzZ2Q = null;
        }
        if (zzzbmZzZ2Q == null) {
            return;
        }
        zzZUY.zzW(zzzbmZzZ2Q, zzpr);
        zzZUY.zzX(zzzbmZzZ2Q, zzpr);
        zzZII.zzZ(zzzbmZzZ2Q, zzpr, true);
    }

    private static void zzW(zzZAS zzzas, zzPR zzpr) {
        zzZBM zzzbm;
        String str;
        String str2;
        byte b;
        zzZBM zzzbmZzN = zzN(zzzas);
        if (zzzbmZzN == null) {
            return;
        }
        zzZUY.zzX(zzzbmZzN, zzpr);
        zzOI zzoi = new zzOI(1.0d, 6);
        String strZzKM = zzzbmZzN.zzKM("border");
        if (strZzKM == null || zzZDY.zzJS(strZzKM) == 0) {
            zzzbm = zzzbmZzN;
            str = "border-left-width";
        } else {
            zzzbm = zzzbmZzN;
            zzpr.zzV(new zzM3("border-top-width", zzoi, (byte) 0));
            zzpr.zzV(new zzM3("border-right-width", zzoi, (byte) 0));
            zzpr.zzV(new zzM3("border-bottom-width", zzoi, (byte) 0));
            zzpr.zzV(new zzM3("border-left-width", zzoi, (byte) 0));
            str = "border-left-width";
            zzpr.zzV(new zzM3("border-top-color", zzYsM, (byte) 0));
            zzpr.zzV(new zzM3("border-right-color", zzYsM, (byte) 0));
            zzpr.zzV(new zzM3("border-bottom-color", zzYsM, (byte) 0));
            zzpr.zzV(new zzM3("border-left-color", zzYsM, (byte) 0));
            zzpr.zzV(new zzM3("border-top-style", zzL4.zzZlr, (byte) 0));
            zzpr.zzV(new zzM3("border-right-style", zzL4.zzZlr, (byte) 0));
            zzpr.zzV(new zzM3("border-bottom-style", zzL4.zzZlr, (byte) 0));
            zzpr.zzV(new zzM3("border-left-style", zzL4.zzZlr, (byte) 0));
        }
        zzZBM zzzbm2 = zzzbm;
        String strZzU2 = com.aspose.words.internal.zzZKN.zzU2(zzzbm2.getAttributeValue("rules", ""));
        int iZzTP = zzUR.zzTP(strZzU2);
        if (iZzTP == 0 || iZzTP == 1 || iZzTP == 2) {
            String str3 = str;
            str2 = "border-bottom-color";
            zzpr.zzV(new zzM3("border-top-width", zzoi, (byte) 0));
            zzpr.zzV(new zzM3("border-right-width", zzoi, (byte) 0));
            zzpr.zzV(new zzM3("border-bottom-width", zzoi, (byte) 0));
            zzpr.zzV(new zzM3(str3, zzoi, (byte) 0));
            zzpr.zzV(new zzM3("border-top-style", zzL4.zzZno, (byte) 0));
            zzpr.zzV(new zzM3("border-right-style", zzL4.zzZno, (byte) 0));
            zzpr.zzV(new zzM3("border-bottom-style", zzL4.zzZno, (byte) 0));
            zzpr.zzV(new zzM3("border-left-style", zzL4.zzZno, (byte) 0));
        } else if (iZzTP != 3) {
            if (iZzTP == 4) {
                zzpr.zzV(new zzM3("border-top-width", zzoi, (byte) 0));
                zzpr.zzV(new zzM3("border-right-width", zzoi, (byte) 0));
                zzpr.zzV(new zzM3("border-bottom-width", zzoi, (byte) 0));
                zzpr.zzV(new zzM3(str, zzoi, (byte) 0));
                zzpr.zzV(new zzM3("border-top-style", zzL4.zzZlv, (byte) 0));
                zzpr.zzV(new zzM3("border-right-style", zzL4.zzZlv, (byte) 0));
                zzpr.zzV(new zzM3("border-bottom-style", zzL4.zzZlv, (byte) 0));
                zzpr.zzV(new zzM3("border-left-style", zzL4.zzZlv, (byte) 0));
            }
            str2 = "border-bottom-color";
        } else {
            String str4 = str;
            str2 = "border-bottom-color";
            zzpr.zzV(new zzM3("border-top-width", zzoi, (byte) 0));
            zzpr.zzV(new zzM3("border-right-width", zzoi, (byte) 0));
            zzpr.zzV(new zzM3("border-bottom-width", zzoi, (byte) 0));
            zzpr.zzV(new zzM3(str4, zzoi, (byte) 0));
            zzpr.zzV(new zzM3("border-top-style", zzL4.zzZno, (byte) 0));
            zzpr.zzV(new zzM3("border-right-style", zzL4.zzZlv, (byte) 0));
            zzpr.zzV(new zzM3("border-bottom-style", zzL4.zzZno, (byte) 0));
            zzpr.zzV(new zzM3("border-left-style", zzL4.zzZlv, (byte) 0));
        }
        zzL4 zzl4ZzS1 = zzL4.zzS1(zzzbm2.zzKM("bordercolor"));
        if ("none".equals(strZzU2) || "groups".equals(strZzU2) || "rows".equals(strZzU2) || "cols".equals(strZzU2) || "all".equals(strZzU2)) {
            String str5 = str2;
            if (zzl4ZzS1 == null) {
                zzl4ZzS1 = new zzQC(com.aspose.words.internal.zzPV.zzKa);
            }
            b = 0;
            zzpr.zzV(new zzM3("border-top-color", zzl4ZzS1, (byte) 0));
            zzpr.zzV(new zzM3("border-right-color", zzl4ZzS1, (byte) 0));
            zzpr.zzV(new zzM3(str5, zzl4ZzS1, (byte) 0));
            zzpr.zzV(new zzM3("border-left-color", zzl4ZzS1, (byte) 0));
        } else {
            if (zzl4ZzS1 != null) {
                zzpr.zzV(new zzM3("border-top-color", zzl4ZzS1, (byte) 0));
                zzpr.zzV(new zzM3("border-right-color", zzl4ZzS1, (byte) 0));
                zzpr.zzV(new zzM3(str2, zzl4ZzS1, (byte) 0));
                zzpr.zzV(new zzM3("border-left-color", zzl4ZzS1, (byte) 0));
            }
            b = 0;
        }
        zzL4 zzl4ZzS3 = zzL4.zzS3(zzzbm2.zzKM("cellpadding"));
        if (zzl4ZzS3 != null) {
            zzpr.zzV(new zzM3("padding-top", zzl4ZzS3, b));
            zzpr.zzV(new zzM3("padding-right", zzl4ZzS3, b));
            zzpr.zzV(new zzM3("padding-bottom", zzl4ZzS3, b));
            zzpr.zzV(new zzM3("padding-left", zzl4ZzS3, b));
        }
        if (zzzas.zzKM("nowrap") != null) {
            zzpr.zzV(new zzM3("white-space", zzL4.zzZlZ, b));
        }
    }

    @Override // com.aspose.words.zzZII
    public final void zzZ(zzZAS zzzas, zzPR zzpr) {
        zzpr.zzO(zzYtx);
        if (zzzas.zzKM("hidden") != null) {
            zzpr.zzV(new zzM3("visibility", zzL4.zzZm1, (byte) 0));
        }
        if (TranslateLanguage.THAI.equals(zzzas.zzZTQ())) {
            zzpr.zzV(new zzM3("font-weight", zzL4.zzZn3, (byte) 0));
        }
        zzW(zzzas, zzpr);
        zzV(zzzas, zzpr);
        zzU(zzzas, zzpr);
    }

    @Override // com.aspose.words.zzZUY
    public final boolean zzZjA() {
        return false;
    }
}
