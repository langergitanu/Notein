package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class BookmarkEnd extends Node implements zzZCT, zzZD7 {
    private String mName;
    private int zzZCI;

    public BookmarkEnd(DocumentBase documentBase, String str) {
        super(documentBase);
        this.mName = "";
        this.zzZCI = 2;
        com.aspose.words.internal.zzZ4.zzY((Object) str, "name");
        this.mName = str;
    }

    @Override // com.aspose.words.Node
    public boolean accept(DocumentVisitor documentVisitor) throws Exception {
        return Node.visitorActionToBool(documentVisitor.visitBookmarkEnd(this));
    }

    @Override // com.aspose.words.zzZCT
    @ReservedForInternalUse
    @Deprecated
    public int getDisplacedByCustomXml() {
        return this.zzZCI;
    }

    @Override // com.aspose.words.zzZD7
    public String getName() {
        return this.mName;
    }

    @Override // com.aspose.words.Node
    public int getNodeType() {
        return 10;
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

    public final void zzOY(int i) {
        this.zzZCI = i;
    }

    public final void zzTh(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "name");
        this.mName = str;
    }

    public BookmarkEnd(DocumentBase documentBase) {
        super(documentBase);
        this.mName = "";
        this.zzZCI = 2;
    }
}
