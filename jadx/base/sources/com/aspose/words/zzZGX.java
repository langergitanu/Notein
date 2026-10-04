package com.aspose.words;

import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: loaded from: classes6.dex */
final class zzZGX extends zzZII {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("left", "right", "top", "baseline", "texttop", "center", "middle", "absmiddle", "abscenter", "bottom");
    private int zzZr3;

    public zzZGX(int i) {
        this.zzZr3 = i;
    }

    @Override // com.aspose.words.zzZII
    public final void zzZ(zzZAS zzzas, zzPR zzpr) {
        if (com.aspose.words.internal.zzZKN.zzX(zzzas.getAttributeValue(C18437z2.f56754h, ""), "hidden", com.aspose.words.internal.zzZOF.ORDINAL_IGNORE_CASE$4894b8c8)) {
            zzpr.zzV(new zzM3("display", zzL4.zzZno, (byte) 0));
        }
        switch (zzUR.zzTP(com.aspose.words.internal.zzZKN.zzU2(zzzas.getAttributeValue("align", "")))) {
            case 0:
                zzpr.zzV(new zzM3("float", zzL4.zzZmH, (byte) 0));
                if (this.zzZr3 == 2) {
                    zzpr.zzV(new zzM3("margin-right", new zzOI(3.0d, 6), (byte) 0));
                }
                break;
            case 1:
                zzpr.zzV(new zzM3("float", zzL4.zzZmG, (byte) 0));
                if (this.zzZr3 == 2) {
                    zzpr.zzV(new zzM3("margin-left", new zzOI(3.0d, 6), (byte) 0));
                }
                break;
            case 2:
                zzpr.zzV(new zzM3("vertical-align", zzL4.zzZmY, (byte) 0));
                break;
            case 3:
                zzpr.zzV(new zzM3("vertical-align", zzL4.zzZmT, (byte) 0));
                break;
            case 4:
                zzpr.zzV(new zzM3("vertical-align", zzL4.zzZlO, (byte) 0));
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                zzpr.zzV(new zzM3("vertical-align", zzL4.zzZmW, (byte) 0));
                break;
            case 9:
                zzpr.zzV(new zzM3("vertical-align", zzL4.zzZmX, (byte) 0));
                break;
        }
        zzZII.zzT(zzzas, zzpr);
        zzZII.zzS(zzzas, zzpr);
        zzL4 zzl4ZzS2 = zzL4.zzS2(zzzas.zzKM("hspace"));
        if (zzl4ZzS2 != null) {
            zzpr.zzV(new zzM3("margin-left", zzl4ZzS2, (byte) 0));
            zzpr.zzV(new zzM3("margin-right", zzl4ZzS2, (byte) 0));
        }
        zzL4 zzl4ZzS22 = zzL4.zzS2(zzzas.zzKM("vspace"));
        if (zzl4ZzS22 != null) {
            zzpr.zzV(new zzM3("margin-top", zzl4ZzS22, (byte) 0));
            zzpr.zzV(new zzM3("margin-bottom", zzl4ZzS22, (byte) 0));
        }
        int iZzJS = zzZDY.zzJS(zzzas.zzKM("border"));
        if (iZzJS > 0) {
            zzOI zzoi = new zzOI(iZzJS, 6);
            zzpr.zzV(new zzM3("border-top-width", zzoi, (byte) 0));
            zzpr.zzV(new zzM3("border-right-width", zzoi, (byte) 0));
            zzpr.zzV(new zzM3("border-bottom-width", zzoi, (byte) 0));
            zzpr.zzV(new zzM3("border-left-width", zzoi, (byte) 0));
            zzpr.zzV(new zzM3("border-top-style", zzL4.zzZlv, (byte) 0));
            zzpr.zzV(new zzM3("border-right-style", zzL4.zzZlv, (byte) 0));
            zzpr.zzV(new zzM3("border-bottom-style", zzL4.zzZlv, (byte) 0));
            zzpr.zzV(new zzM3("border-left-style", zzL4.zzZlv, (byte) 0));
        }
    }
}
