package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZIA extends zzZI7 {
    private zzZIA(HtmlSaveOptions htmlSaveOptions) {
        super(htmlSaveOptions);
    }

    private boolean zzX(Paragraph paragraph, int i) {
        if (!zzZ2u()) {
            return false;
        }
        if (i == 4 || i == 5) {
            return (paragraph.isInCell() && paragraph.zzYpa() && paragraph.isEndOfCell()) ? false : true;
        }
        return false;
    }

    public static zzZI8 zzZ(Document document, HtmlSaveOptions htmlSaveOptions) throws Exception {
        zzZIA zzzia = new zzZIA(htmlSaveOptions);
        document.accept(zzzia);
        return zzzia.zzZ2t();
    }

    private static boolean zzZX(Paragraph paragraph) {
        if (paragraph.isDeleteRevision()) {
            return false;
        }
        return ((paragraph.zzZYj().zzZ7j() > 0 && paragraph.zzZYj().zzZ7j() <= 6) || paragraph.getParagraphFormat().getShading().isVisible() || paragraph.getParagraphFormat().getBorders().isVisible()) ? false : true;
    }

    @Override // com.aspose.words.zzZI7
    public final int zzY(Paragraph paragraph, int i) {
        if (!zzZX(paragraph)) {
            return 2;
        }
        if (zzW(paragraph, i)) {
            return 0;
        }
        return zzX(paragraph, i) ? 1 : 2;
    }
}
