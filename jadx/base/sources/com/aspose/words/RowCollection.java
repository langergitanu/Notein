package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class RowCollection extends NodeCollection<Row> {
    public RowCollection(CompositeNode compositeNode) {
        super(compositeNode, 6, false);
    }

    @Override // com.aspose.words.NodeCollection
    public Row get(int i) {
        return (Row) super.get(i);
    }

    @Override // com.aspose.words.NodeCollection
    public Row[] toArray() {
        return (Row[]) zzYAN().toArray(new Row[0]);
    }
}
