package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY3 {
    private BookmarkEnd zzZCS;
    private BookmarkStart zzZCT;
    private int zzZCs;

    public zzY3(BookmarkStart bookmarkStart, int i) {
        this.zzZCT = bookmarkStart;
        this.zzZCs = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String zzZ(zzZD7 zzzd7) {
        Node node = (Node) zzzd7;
        if (((GlossaryDocument) com.aspose.words.internal.zzZKW.zzZ(node.getDocument(), GlossaryDocument.class)) == null) {
            return zzzd7.getName();
        }
        CompositeNode ancestor = node.getAncestor(32);
        String string = ancestor != null ? Integer.toString(ancestor.hashCode()) : "";
        return com.aspose.words.internal.zzZYD.zzXk(string) ? com.aspose.words.internal.zzZKN.format("{0};{1}", string, zzzd7.getName()) : zzzd7.getName();
    }

    public final BookmarkEnd getBookmarkEnd() {
        return this.zzZCS;
    }

    public final BookmarkStart getBookmarkStart() {
        return this.zzZCT;
    }

    public final int zz91() {
        return this.zzZCs;
    }

    public final boolean zz92() {
        return this.zzZCS == null && this.zzZCT.getParentNode() != null;
    }

    public final void zzY(BookmarkEnd bookmarkEnd) {
        this.zzZCS = bookmarkEnd;
    }
}
