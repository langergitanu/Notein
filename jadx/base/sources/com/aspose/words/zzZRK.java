package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZRK extends zzZRS {
    public zzZRK(Document document, String str) {
        super(document);
        zzY(document, str);
    }

    private void zzY(Document document, String str) {
        Paragraph paragraph = new Paragraph(document);
        paragraph.appendChild(new Run(document, str));
        appendChild(paragraph);
    }

    public abstract void zzMr(String str);

    @Override // com.aspose.words.CompositeNode
    public final boolean zzT(Node node) {
        return node.getNodeType() == 8;
    }

    @Override // com.aspose.words.zzZRS
    public final Node zzZhf() {
        return null;
    }

    @Override // com.aspose.words.zzZRS
    public final void zzZz9() {
        zzMr(androidx.core.content.OooO0OO.OooO00o(1, 0, getText()));
    }

    @Override // com.aspose.words.zzZRS
    public final void zzf(Node node) {
        throw new UnsupportedOperationException();
    }
}
