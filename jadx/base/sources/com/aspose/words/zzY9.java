package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY9 extends DocumentVisitor {
    private int zzZCD;
    private BookmarkStart zzZCE = null;
    private boolean zzZCF;
    private String zzZCG;
    private BookmarkEnd zzZCS;
    private BookmarkStart zzZCT;

    private zzY9(String str, boolean z) {
        this.zzZCG = str;
        this.zzZCF = z;
    }

    public static BookmarkEnd zzY(Node node, String str) throws Exception {
        return zzZ(node, str, null);
    }

    public static BookmarkStart zzZ(Node node, String str) throws Exception {
        zzY9 zzy9 = new zzY9(str, true);
        node.accept(zzy9);
        return zzy9.zzZCT;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitBookmarkEnd(BookmarkEnd bookmarkEnd) {
        if (this.zzZCF || !com.aspose.words.internal.zzZYD.zzi(this.zzZCG, bookmarkEnd.getName())) {
            return 0;
        }
        this.zzZCS = bookmarkEnd;
        int i = this.zzZCD - 1;
        this.zzZCD = i;
        return (this.zzZCE == null && i <= 0) ? 2 : 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitBookmarkStart(BookmarkStart bookmarkStart) {
        if (this.zzZCF && com.aspose.words.internal.zzZYD.zzi(this.zzZCG, bookmarkStart.getName())) {
            this.zzZCT = bookmarkStart;
            return 2;
        }
        if (this.zzZCF) {
            return 0;
        }
        if (com.aspose.words.internal.zzZYD.zzi(this.zzZCG, bookmarkStart.getName()) && this.zzZCE != null) {
            this.zzZCD++;
        }
        if (!com.aspose.words.internal.zzZKO.zzA(this.zzZCE, bookmarkStart)) {
            return 0;
        }
        this.zzZCE = null;
        return 0;
    }

    public static BookmarkEnd zzY(Node node, String str, BookmarkStart bookmarkStart) throws Exception {
        BookmarkEnd bookmarkEndZzZ = zzZ(node, str, bookmarkStart);
        if (bookmarkEndZzZ != null) {
            return bookmarkEndZzZ;
        }
        throw new IllegalStateException(com.aspose.words.internal.zzZKN.format("Cannot find bookmark '{0}' in the document.", str));
    }

    public static BookmarkEnd zzZ(Node node, String str, BookmarkStart bookmarkStart) throws Exception {
        if (node != null) {
            zzY9 zzy9 = new zzY9(str, false);
            zzy9.zzZCE = bookmarkStart;
            node.accept(zzy9);
            return zzy9.zzZCS;
        }
        throw new NullPointerException("Value cannot be null.\r\nParameter name: node");
    }
}
