package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzXZW {
    private zzYU6 zzXSu;
    private zzZN8 zzYs5;
    private Document zzZEY;

    public zzXZW(Document document, zzYU6 zzyu6, zzZN8 zzzn8) {
        this.zzZEY = document;
        this.zzXSu = zzyu6;
        this.zzYs5 = zzzn8;
    }

    private static boolean zzU(Font font, String str) {
        return com.aspose.words.internal.zzZYD.zzXk(str) && !font.getHidden();
    }

    public final void zzV(Font font, String str) {
        zzV(font, str, 3);
    }

    public final void zzV(Font font, String str, int i) {
        if (zzU(font, str)) {
            this.zzXSu.zzY("Run");
            zzY04.zzZ(this.zzXSu, font, i, this.zzYs5, false);
            this.zzXSu.writeString(this.zzZEY.zzZqy().zzN(font.getFontName(3), font.zzza()).zzWU(str));
            this.zzXSu.zzp();
        }
    }
}
