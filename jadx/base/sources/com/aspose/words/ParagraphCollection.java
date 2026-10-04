package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class ParagraphCollection extends NodeCollection<Paragraph> {
    public ParagraphCollection(CompositeNode compositeNode) {
        super(compositeNode, 8, false);
    }

    @Override // com.aspose.words.NodeCollection
    public Paragraph get(int i) {
        return (Paragraph) super.get(i);
    }

    @Override // com.aspose.words.NodeCollection
    public Paragraph[] toArray() {
        return (Paragraph[]) zzYAN().toArray(new Paragraph[0]);
    }
}
