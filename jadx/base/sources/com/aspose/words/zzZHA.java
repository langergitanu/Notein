package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZHA extends zzZII {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("center", "left", "right");

    @Override // com.aspose.words.zzZII
    public final void zzZ(zzZAS zzzas, zzPR zzpr) {
        zzQC zzqc = new zzQC(com.aspose.words.internal.zzPV.zzJu);
        zzpr.zzV(new zzM3("display", zzL4.zzZmt, (byte) 0));
        zzpr.zzV(new zzM3("color", zzqc, (byte) 0));
        zzOI zzoi = new zzOI(1.0d, 6);
        zzpr.zzV(new zzM3("border-top-width", zzoi, (byte) 0));
        zzpr.zzV(new zzM3("border-right-width", zzoi, (byte) 0));
        zzpr.zzV(new zzM3("border-bottom-width", zzoi, (byte) 0));
        zzpr.zzV(new zzM3("border-left-width", zzoi, (byte) 0));
        zzpr.zzV(new zzM3("border-top-style", zzL4.zzZlr, (byte) 0));
        zzpr.zzV(new zzM3("border-right-style", zzL4.zzZlr, (byte) 0));
        zzpr.zzV(new zzM3("border-bottom-style", zzL4.zzZlr, (byte) 0));
        zzpr.zzV(new zzM3("border-left-style", zzL4.zzZlr, (byte) 0));
        zzpr.zzV(new zzM3("margin-right", zzL4.zzZng, (byte) 0));
        zzpr.zzV(new zzM3("margin-left", zzL4.zzZng, (byte) 0));
        int iZzTP = zzUR.zzTP(com.aspose.words.internal.zzZKN.zzU2(zzzas.getAttributeValue("align", "")));
        if (iZzTP == 0) {
            zzpr.zzV(new zzM3("margin-left", zzL4.zzZng, (byte) 0));
            zzpr.zzV(new zzM3("margin-right", zzL4.zzZng, (byte) 0));
        } else if (iZzTP == 1) {
            zzpr.zzV(new zzM3("margin-left", zzL4.zzZnl, (byte) 0));
            zzpr.zzV(new zzM3("margin-right", zzL4.zzZng, (byte) 0));
        } else if (iZzTP == 2) {
            zzpr.zzV(new zzM3("margin-left", zzL4.zzZng, (byte) 0));
            zzpr.zzV(new zzM3("margin-right", zzL4.zzZnl, (byte) 0));
        }
        if (zzzas.zzKM("color") != null || zzzas.zzKM("noshade") != null) {
            zzpr.zzV(new zzM3("border-top-style", zzL4.zzZlv, (byte) 0));
            zzpr.zzV(new zzM3("border-right-style", zzL4.zzZlv, (byte) 0));
            zzpr.zzV(new zzM3("border-bottom-style", zzL4.zzZlv, (byte) 0));
            zzpr.zzV(new zzM3("border-left-style", zzL4.zzZlv, (byte) 0));
            zzL4 zzl4ZzS1 = zzL4.zzS1(zzzas.zzKM("color"));
            if (zzl4ZzS1 != null) {
                zzpr.zzV(new zzM3("border-top-color", zzl4ZzS1, (byte) 0));
                zzpr.zzV(new zzM3("border-right-color", zzl4ZzS1, (byte) 0));
                zzpr.zzV(new zzM3("border-bottom-color", zzl4ZzS1, (byte) 0));
                zzpr.zzV(new zzM3("border-left-color", zzl4ZzS1, (byte) 0));
                zzpr.zzV(new zzM3("background-color", zzl4ZzS1, (byte) 0));
            } else if (zzzas.zzKM("noshade") != null) {
                zzpr.zzV(new zzM3("border-top-color", zzqc, (byte) 0));
                zzpr.zzV(new zzM3("border-right-color", zzqc, (byte) 0));
                zzpr.zzV(new zzM3("border-bottom-color", zzqc, (byte) 0));
                zzpr.zzV(new zzM3("border-left-color", zzqc, (byte) 0));
                zzpr.zzV(new zzM3("background-color", zzqc, (byte) 0));
            }
        }
        String strZzKM = zzzas.zzKM("size");
        if (strZzKM == null) {
            zzpr.zzV(new zzM3("height", new zzOI(0.0d, 6), (byte) 0));
        } else {
            if (zzZDY.zzJS(strZzKM) <= 1) {
                zzpr.zzV(new zzM3("border-bottom-width", new zzOI(0.0d, 6), (byte) 0));
                zzpr.zzV(new zzM3("height", new zzOI(0.0d, 6), (byte) 0));
            } else {
                zzpr.zzV(new zzM3("height", new zzOI(r2 - 2, 6), (byte) 0));
            }
        }
        zzZII.zzS(zzzas, zzpr);
    }
}
