package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZIL {
    private int zzYrd;
    private zzZIN zzYre;

    public zzZIL(Document document, String str, HtmlSaveOptions htmlSaveOptions, zzZ1I zzz1i, boolean z) throws Exception {
        String strZzVg;
        String strZzVe;
        String strZzTX = com.aspose.words.internal.zzZKN.zzTX(document.getBuiltInDocumentProperties().getTitle());
        strZzTX = com.aspose.words.internal.zzZYD.zzXk(strZzTX) ? strZzTX : "untitled";
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            strZzVg = com.aspose.words.internal.zzZOQ.zzVg(str);
            strZzVe = com.aspose.words.internal.zzZOQ.zzVe(str);
        } else {
            String strZzZS = new com.aspose.words.internal.zzZNR("[^-_a-zA-Z0-9 ]*", 0).zzZS(strZzTX, "");
            strZzVg = com.aspose.words.internal.zzZYD.zzXk(strZzZS) ? strZzZS : "untitled";
            strZzVe = null;
        }
        strZzVe = com.aspose.words.internal.zzZYD.zzXk(strZzVe) ? strZzVe : ".html";
        zzZIN zzzin = new zzZIN(htmlSaveOptions.getDocumentSplitCriteria(), htmlSaveOptions.getDocumentSplitHeadingLevel(), z, zzz1i);
        this.zzYre = zzzin;
        document.accept(zzzin);
        this.zzYre.zzF(strZzVg, strZzVe, strZzTX);
        this.zzYrd = -1;
    }

    public final zzZIO zzKP(String str) {
        return this.zzYre.zzKP(str);
    }

    public final zzZIO zzZ2U() {
        if (!zzZ2V()) {
            return null;
        }
        int i = this.zzYrd + 1;
        this.zzYrd = i;
        return this.zzYre.zzzL(i);
    }

    public final boolean zzZ2V() {
        return this.zzYre.zzzM(this.zzYrd + 1);
    }
}
