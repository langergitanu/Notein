package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZI9 extends zzZI7 {
    private zzZI9(HtmlSaveOptions htmlSaveOptions) {
        super(htmlSaveOptions);
    }

    public static zzZI8 zzZ(Document document, HtmlSaveOptions htmlSaveOptions) throws Exception {
        zzZI9 zzzi9 = new zzZI9(htmlSaveOptions);
        document.accept(zzzi9);
        return zzzi9.zzZ2t();
    }

    private boolean zzzJ(int i) {
        return zzZ2u() && i != 7;
    }

    @Override // com.aspose.words.zzZI7
    public final int zzY(Paragraph paragraph, int i) {
        return (!zzW(paragraph, i) && zzzJ(i)) ? 1 : 0;
    }
}
