package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYF5 {
    private static zzWP zzXrR;
    private com.aspose.words.internal.zzIM<Style> zzXrS = new com.aspose.words.internal.zzIM<>();
    private StyleCollection zzYSm;

    static {
        zzWP zzwp = new zzWP();
        zzXrR = zzwp;
        zzwp.add(3060, 0);
        zzXrR.add(3110, new Border());
        zzXrR.add(3130, new Border());
        zzXrR.add(3120, new Border());
        zzXrR.add(3140, new Border());
        zzXrR.add(3200, new Border());
        zzXrR.add(3210, new Border());
        zzXrR.add(3150, new Border());
        zzXrR.add(3160, new Border());
    }

    public zzYF5(StyleCollection styleCollection) {
        this.zzYSm = styleCollection;
    }

    private boolean zzC(Style style) {
        return this.zzXrS.contains(style);
    }

    private void zzD(Style style) {
        int iZzY3v;
        if (zzC(style) || (iZzY3v = style.zzY3v()) == style.zzZ7j()) {
            return;
        }
        if (iZzY3v == 12287) {
            if (style.getType() == 3) {
                TableStyle tableStyle = (TableStyle) style;
                if (tableStyle.zzZ7j() != 11 || tableStyle.zz6G().getCount() != 0) {
                    tableStyle.zz6G().zzX(zzXrR);
                }
            }
            this.zzXrS.add(style);
            return;
        }
        Style styleZzVp = this.zzYSm.zzVp(iZzY3v, StyleIdentifier.NIL);
        if (!zzC(styleZzVp)) {
            zzD(styleZzVp);
        }
        Style styleZzE = zzE(styleZzVp);
        zzYEO.zzX(styleZzE.zzZYj(), style.zzZYj());
        style.zzZYh().zzX(styleZzE.zzZYh(), 50);
        style.zzZYj().zzX(styleZzE.zzZYj(), 1000);
        if (style.getType() == 3) {
            TableStyle tableStyle2 = (TableStyle) style;
            TableStyle tableStyle3 = (TableStyle) styleZzE;
            tableStyle2.zz6G().zzX(tableStyle3.zz6G());
            tableStyle2.zzZYf().zzX(tableStyle3.zzZYf());
        }
        this.zzXrS.add(style);
    }

    public static Style zzE(Style style) {
        Style styleZzl6 = Style.zzl6(style.getType());
        styleZzl6.zzZ(style.zzl1(0));
        styleZzl6.zzZ(style.zzqw(0));
        if (style.getType() == 3) {
            TableStyle tableStyle = (TableStyle) styleZzl6;
            TableStyle tableStyle2 = (TableStyle) style;
            zzWP zzwp = new zzWP();
            zzXrR.zzY((zzZS) zzwp);
            tableStyle2.zzXWS().zzY((zzZS) zzwp);
            tableStyle.zzZ(zzwp);
            tableStyle.zzZ(tableStyle2.zzXWU());
        }
        return styleZzl6;
    }

    public final void zzYfr() {
        for (int i = 0; i < this.zzYSm.getCount(); i++) {
            zzD(this.zzYSm.get(i));
        }
    }
}
