package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class TableCollection extends NodeCollection<Table> {
    public TableCollection(CompositeNode compositeNode) {
        super(compositeNode, 5, false);
    }

    @Override // com.aspose.words.NodeCollection
    public Table get(int i) {
        return (Table) super.get(i);
    }

    @Override // com.aspose.words.NodeCollection
    public Table[] toArray() {
        return (Table[]) zzYAN().toArray(new Table[0]);
    }
}
