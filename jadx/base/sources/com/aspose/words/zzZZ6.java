package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZZ6 {
    private boolean zzYTV;
    private int zzYTW;
    private int zzYTX;

    public zzZZ6(Document document, Table table) {
        this.zzYTV = false;
        boolean z = true;
        if (document.getOriginalLoadFormat() == 10 || document.getOriginalLoadFormat() == 11) {
            zzY6G zzy6gZzZYf = table.getRows().get(0).zzZYf();
            TableStyle tableStyle = (TableStyle) com.aspose.words.internal.zzZKW.zzZ(document.getStyles().zzZ8(zzy6gZzZYf.zzZ7j(), false), TableStyle.class);
            if (tableStyle != null) {
                this.zzYTV = zzY6X.zzT(tableStyle) | this.zzYTV;
            }
            int styleOptions = zzy6gZzZYf.getStyleOptions();
            boolean z2 = this.zzYTV;
            if ((styleOptions & 512) != 0 && (styleOptions & 1024) != 0) {
                z = false;
            }
            this.zzYTV = z2 | z;
        } else {
            this.zzYTV = true;
        }
        this.zzYTX = table.zzZrd();
        this.zzYTW = 0;
    }

    public final boolean zzZrb() {
        return this.zzYTV;
    }

    public final int zzZrc() {
        return this.zzYTW;
    }

    public final int zzZrd() {
        return this.zzYTX;
    }
}
