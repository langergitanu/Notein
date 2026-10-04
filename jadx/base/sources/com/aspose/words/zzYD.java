package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYD implements INodeChangingCallback {
    private com.aspose.words.internal.zzZYG<zzZ> zzZCR;
    private Document zzZEY;

    public static class zzY extends DocumentVisitor {
        private zzYD zzZCO;

        public zzY(zzYD zzyd) {
            this.zzZCO = zzyd;
        }

        @Override // com.aspose.words.DocumentVisitor
        public final int visitBookmarkEnd(BookmarkEnd bookmarkEnd) {
            this.zzZCO.zzZ(bookmarkEnd.getName(), bookmarkEnd);
            return 0;
        }

        @Override // com.aspose.words.DocumentVisitor
        public final int visitBookmarkStart(BookmarkStart bookmarkStart) {
            this.zzZCO.zzZ(bookmarkStart.getName(), bookmarkStart);
            return 0;
        }
    }

    public static class zzZ {
        private BookmarkEnd zzZCP;
        private BookmarkStart zzZCQ;

        private zzZ() {
        }

        public final Bookmark getBookmark() {
            BookmarkEnd bookmarkEnd;
            BookmarkStart bookmarkStart = this.zzZCQ;
            if (bookmarkStart == null || (bookmarkEnd = this.zzZCP) == null) {
                return null;
            }
            return new Bookmark(bookmarkStart, bookmarkEnd);
        }

        public final void zzZ(BookmarkStart bookmarkStart) {
            this.zzZCQ = bookmarkStart;
        }

        public /* synthetic */ zzZ(byte b) {
            this();
        }

        public final void zzZ(BookmarkEnd bookmarkEnd) {
            this.zzZCP = bookmarkEnd;
        }
    }

    public zzYD(Document document) {
        this.zzZEY = document;
    }

    private void zz9j() throws Exception {
        if (this.zzZCR != null) {
            return;
        }
        this.zzZCR = new com.aspose.words.internal.zzZYG<>(false);
        this.zzZEY.accept(new zzY(this));
        this.zzZEY.zzZ(this);
    }

    private zzZ zzF(String str, boolean z) {
        zzZ zzz = this.zzZCR.get(str);
        if (zzz != null || !z) {
            return zzz;
        }
        zzZ zzz2 = new zzZ((byte) 0);
        this.zzZCR.set(str, zzz2);
        return zzz2;
    }

    private void zzV(Node node, boolean z) {
        if (node.isComposite()) {
            for (Node firstChild = ((CompositeNode) node).getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
                zzV(firstChild, z);
            }
            return;
        }
        if (node.getNodeType() == 9) {
            BookmarkStart bookmarkStart = (BookmarkStart) node;
            zzZ(bookmarkStart.getName(), z ? bookmarkStart : null);
        } else if (node.getNodeType() == 10) {
            BookmarkEnd bookmarkEnd = (BookmarkEnd) node;
            zzZ(bookmarkEnd.getName(), z ? bookmarkEnd : null);
        }
    }

    public final void clear() {
        if (this.zzZCR == null) {
            return;
        }
        this.zzZEY.zzY(this);
        this.zzZCR = null;
    }

    public final Bookmark get(String str) throws Exception {
        zz9j();
        zzZ zzzZzF = zzF(str, false);
        if (zzzZzF != null) {
            return zzzZzF.getBookmark();
        }
        return null;
    }

    @Override // com.aspose.words.INodeChangingCallback
    public final void nodeInserted(NodeChangingArgs nodeChangingArgs) {
        if (nodeChangingArgs.getNewParent().isRemoved()) {
            return;
        }
        zzV(nodeChangingArgs.getNode(), true);
    }

    @Override // com.aspose.words.INodeChangingCallback
    public final void nodeInserting(NodeChangingArgs nodeChangingArgs) {
    }

    @Override // com.aspose.words.INodeChangingCallback
    public final void nodeRemoved(NodeChangingArgs nodeChangingArgs) {
        if (nodeChangingArgs.getOldParent().isRemoved()) {
            return;
        }
        zzV(nodeChangingArgs.getNode(), false);
    }

    @Override // com.aspose.words.INodeChangingCallback
    public final void nodeRemoving(NodeChangingArgs nodeChangingArgs) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zzZ(String str, BookmarkStart bookmarkStart) {
        zzF(str, true).zzZ(bookmarkStart);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zzZ(String str, BookmarkEnd bookmarkEnd) {
        zzF(str, true).zzZ(bookmarkEnd);
    }
}
