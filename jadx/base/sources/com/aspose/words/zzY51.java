package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY51 {
    private zzZ8Y zzX2k;

    public zzY51(zzZ8Y zzz8y) {
        this.zzX2k = zzz8y;
    }

    public static int zzXW(Paragraph paragraph) {
        return zzjw(((Integer) paragraph.zzWm(1280, 1)).intValue());
    }

    private int zzZ(Paragraph paragraph, Style style, zzZ5S zzz5s) throws Exception {
        if (style.getParagraphFormat() == null) {
            return -1;
        }
        int iZzjw = zzjw(style.getParagraphFormat().getOutlineLevel());
        if (zzz5s.zzxV(iZzjw)) {
            return iZzjw;
        }
        if (this.zzX2k.zzZbL()) {
            return this.zzX2k.zzY(paragraph, style);
        }
        return -1;
    }

    private static int zzjw(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            default:
                return -1;
        }
    }

    public final int zzXX(Paragraph paragraph) throws Exception {
        boolean z = true;
        Style styleZzqy = paragraph.zzqy(1);
        if (!this.zzX2k.zzZbO() && !this.zzX2k.zzZbP()) {
            z = false;
        }
        if (this.zzX2k.zzZbM() || !z) {
            return zzZ(paragraph, styleZzqy, this.zzX2k.zzZbJ());
        }
        return -1;
    }

    public final int zzZ(zzZAM zzzam, Paragraph paragraph) throws Exception {
        return zzZ(zzzam, this.zzX2k.zzZbJ(), paragraph);
    }

    public final int zzZ(zzZAM zzzam, zzZ5S zzz5s, Paragraph paragraph) throws Exception {
        zzYEF runPr_IInline = zzzam.getRunPr_IInline();
        StyleCollection styles = zzzam.getDocument_IInline().getStyles();
        Style styleZzZ8 = styles.zzZ8(styles.zzVp(runPr_IInline.zzZ7j(), 10).zzY3t(), false);
        if (styleZzZ8 != null) {
            return zzZ(paragraph, styleZzZ8, zzz5s);
        }
        return -1;
    }
}
