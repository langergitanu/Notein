package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZID extends zzZII {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("left", "right", "top", "baseline", "texttop", "center", "middle", "absmiddle", "abscenter", "bottom");

    @Override // com.aspose.words.zzZII
    public final void zzZ(zzZAS zzzas, zzPR zzpr) {
        switch (zzUR.zzTP(com.aspose.words.internal.zzZKN.zzU2(zzzas.getAttributeValue("align", "")))) {
            case 0:
                zzpr.zzV(new zzM3("float", zzL4.zzZmH, (byte) 0));
                break;
            case 1:
                zzpr.zzV(new zzM3("float", zzL4.zzZmG, (byte) 0));
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
    }
}
