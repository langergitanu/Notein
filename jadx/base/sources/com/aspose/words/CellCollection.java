package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class CellCollection extends NodeCollection<Cell> {
    public CellCollection(CompositeNode compositeNode) {
        super(compositeNode, 7, false);
    }

    public final boolean zz6D() {
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            if (((Cell) it.next()).zz6G().zz6D()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.aspose.words.NodeCollection
    public Cell get(int i) {
        return (Cell) super.get(i);
    }

    @Override // com.aspose.words.NodeCollection
    public Cell[] toArray() {
        return (Cell[]) zzYAN().toArray(new Cell[0]);
    }
}
