package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class BookmarkStart extends Node implements zzZCT, zzZD7 {
    private String mName;
    private int zzZCI;
    private int zzZCz;

    public BookmarkStart(DocumentBase documentBase, String str) {
        this(documentBase, str, 0);
    }

    @Override // com.aspose.words.Node
    public boolean accept(DocumentVisitor documentVisitor) throws Exception {
        return Node.visitorActionToBool(documentVisitor.visitBookmarkStart(this));
    }

    public Bookmark getBookmark() {
        return new Bookmark(this);
    }

    @Override // com.aspose.words.zzZCT
    @ReservedForInternalUse
    @Deprecated
    public int getDisplacedByCustomXml() {
        return this.zzZCI;
    }

    public final int getFirstColumn() {
        if (isColumn()) {
            return this.zzZCz & 127;
        }
        return -1;
    }

    public final int getFlags() {
        return this.zzZCz;
    }

    public final int getLastColumn() {
        if (isColumn()) {
            return ((this.zzZCz & 32512) >> 8) - 1;
        }
        return -1;
    }

    @Override // com.aspose.words.zzZD7
    public String getName() {
        return this.mName;
    }

    @Override // com.aspose.words.Node
    public int getNodeType() {
        return 9;
    }

    @Override // com.aspose.words.Node
    public String getText() {
        return "";
    }

    public final boolean isColumn() {
        return (this.zzZCz & 32768) == 32768;
    }

    @Override // com.aspose.words.zzZCT
    @ReservedForInternalUse
    @Deprecated
    public void setDisplacedByCustomXml(int i) {
        this.zzZCI = i;
    }

    @Override // com.aspose.words.zzZD7
    public void setName(String str) {
        zzTh(str);
    }

    public final int zz9d() {
        return this.zzZCI;
    }

    public final void zzOW(int i) {
        this.zzZCz = (((i + 1) & 127) << 8) | (this.zzZCz & (-32513)) | 32768;
    }

    public final void zzOX(int i) {
        this.zzZCz = (i & 127) | (this.zzZCz & (-128)) | 32768;
    }

    public final void zzOY(int i) {
        this.zzZCI = i;
    }

    public final void zzTh(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "name");
        this.mName = str;
    }

    public BookmarkStart(DocumentBase documentBase) {
        super(documentBase);
        this.mName = "";
        this.zzZCI = 2;
    }

    public BookmarkStart(DocumentBase documentBase, String str, int i) {
        super(documentBase);
        this.mName = "";
        this.zzZCI = 2;
        com.aspose.words.internal.zzZ4.zzY((Object) str, "name");
        this.mName = str;
        this.zzZCz = i;
    }
}
