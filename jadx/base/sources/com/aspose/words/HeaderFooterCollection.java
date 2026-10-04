package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class HeaderFooterCollection extends NodeCollection<HeaderFooter> {
    private Section zzYtQ;

    public HeaderFooterCollection(CompositeNode compositeNode) {
        super(compositeNode, 4, false);
        this.zzYtQ = (Section) compositeNode;
    }

    public HeaderFooter getByHeaderFooterType(int i) {
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            HeaderFooter headerFooter = (HeaderFooter) it.next();
            if (headerFooter.getHeaderFooterType() == i) {
                return headerFooter;
            }
        }
        return null;
    }

    public final Section getParentSection() {
        return this.zzYtQ;
    }

    public final boolean hasHeaders() {
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            if (((HeaderFooter) it.next()).isHeader()) {
                return true;
            }
        }
        return false;
    }

    public void linkToPrevious(boolean z) {
        linkToPrevious(1, z);
        linkToPrevious(4, z);
        linkToPrevious(0, z);
        linkToPrevious(3, z);
        linkToPrevious(5, z);
        linkToPrevious(2, z);
    }

    public final boolean zzZ4Z() {
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            if (!((HeaderFooter) it.next()).isHeader()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.aspose.words.NodeCollection
    public HeaderFooter get(int i) {
        return (HeaderFooter) super.get(i);
    }

    @Override // com.aspose.words.NodeCollection
    public HeaderFooter[] toArray() {
        return (HeaderFooter[]) zzYAN().toArray(new HeaderFooter[0]);
    }

    public void linkToPrevious(int i, boolean z) {
        HeaderFooter byHeaderFooterType = getByHeaderFooterType(i);
        if (byHeaderFooterType == null) {
            byHeaderFooterType = new HeaderFooter(getContainer().getDocument(), i);
            add(byHeaderFooterType);
        }
        byHeaderFooterType.isLinkedToPrevious(z);
    }
}
