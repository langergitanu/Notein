package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class BookmarkCollection implements Iterable<Bookmark> {
    private NodeCollection zzZCN;

    public static final class zzZ implements Iterator<Bookmark> {
        private Iterator<Node> zzZCM;

        public zzZ(NodeCollection nodeCollection) {
            this.zzZCM = nodeCollection.iterator();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: zz9i, reason: merged with bridge method [inline-methods] */
        public Bookmark next() {
            BookmarkStart bookmarkStart = (BookmarkStart) this.zzZCM.next();
            if (bookmarkStart != null) {
                return bookmarkStart.getBookmark();
            }
            return null;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.zzZCM.hasNext();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public BookmarkCollection(Node node) {
        if (node.isComposite()) {
            this.zzZCN = ((CompositeNode) node).getChildNodes(9, true);
        } else {
            this.zzZCN = zzZUO.zzYLo;
        }
    }

    public void clear() throws Exception {
        for (int count = getCount(); count > 0; count--) {
            removeAt(0);
        }
    }

    public Bookmark get(int i) {
        return ((BookmarkStart) this.zzZCN.get(i)).getBookmark();
    }

    public int getCount() {
        return this.zzZCN.getCount();
    }

    public final int indexOf(String str) {
        Iterator<T> it = this.zzZCN.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (com.aspose.words.internal.zzZYD.zzi(str, ((BookmarkStart) it.next()).getName())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // java.lang.Iterable
    public Iterator<Bookmark> iterator() {
        return new zzZ(this.zzZCN);
    }

    public void remove(Bookmark bookmark) throws Exception {
        if (bookmark == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: bookmark");
        }
        bookmark.remove();
    }

    public void removeAt(int i) throws Exception {
        remove(get(i));
    }

    public Bookmark get(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "bookmarkName");
        for (BookmarkStart bookmarkStart : this.zzZCN) {
            if (com.aspose.words.internal.zzZYD.zzi(str, bookmarkStart.getName())) {
                return bookmarkStart.getBookmark();
            }
        }
        return null;
    }

    public void remove(String str) throws Exception {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "bookmarkName");
        remove(get(str));
    }
}
