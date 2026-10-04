package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class Footnote extends InlineStory implements zzZ8X {
    private int zzTL;
    private String zzYwE;
    private int zzYwF;
    private boolean zzZEG;

    public Footnote(DocumentBase documentBase, int i) {
        this(documentBase, i, true, "", new zzYEF());
    }

    @Override // com.aspose.words.Node
    public boolean accept(DocumentVisitor documentVisitor) throws Exception {
        return acceptCore(documentVisitor);
    }

    @Override // com.aspose.words.CompositeNode
    public int acceptEnd(DocumentVisitor documentVisitor) throws Exception {
        return documentVisitor.visitFootnoteEnd(this);
    }

    @Override // com.aspose.words.CompositeNode
    public int acceptStart(DocumentVisitor documentVisitor) throws Exception {
        return documentVisitor.visitFootnoteStart(this);
    }

    public String getActualReferenceMark() {
        Section section;
        if (!isAuto()) {
            String str = this.zzYwE;
            return str != null ? str : "";
        }
        if (this.zzTL < 0 || (section = (Section) getAncestor(2)) == null || ((Document) com.aspose.words.internal.zzZKW.zzZ(getDocument(), Document.class)) == null) {
            return "";
        }
        return zzYTW.zzM(this.zzTL, getFootnoteType() == 0 ? section.getPageSetup().getFootnoteOptions().getNumberStyle() : section.getPageSetup().getEndnoteOptions().getNumberStyle(), true);
    }

    @Override // com.aspose.words.zzZ8X
    @ReservedForInternalUse
    @Deprecated
    public zzZV8 getDeleteRevision() {
        return zzZYh().getDeleteRevision();
    }

    public int getFootnoteType() {
        return this.zzYwF;
    }

    @Override // com.aspose.words.zzZ8X
    @ReservedForInternalUse
    @Deprecated
    public zzZV8 getInsertRevision() {
        return zzZYh().getInsertRevision();
    }

    @Override // com.aspose.words.zzZA6
    @ReservedForInternalUse
    @Deprecated
    public zzYX5 getMoveFromRevision() {
        return zzZYh().getMoveFromRevision();
    }

    @Override // com.aspose.words.zzZA6
    @ReservedForInternalUse
    @Deprecated
    public zzYX5 getMoveToRevision() {
        return zzZYh().getMoveToRevision();
    }

    @Override // com.aspose.words.Node
    public int getNodeType() {
        return 20;
    }

    public String getReferenceMark() {
        return this.zzYwE;
    }

    @Override // com.aspose.words.InlineStory, com.aspose.words.zzZ96
    public int getStoryType() {
        int i = this.zzYwF;
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        throw new IllegalStateException("Unknown footnote type.");
    }

    public boolean isAuto() {
        return this.zzZEG;
    }

    @Override // com.aspose.words.zzZA6
    @ReservedForInternalUse
    @Deprecated
    public void removeMoveRevisions() {
        zzZYh().remove(13);
        zzZYh().remove(15);
    }

    @Override // com.aspose.words.zzZ8X
    @ReservedForInternalUse
    @Deprecated
    public void setDeleteRevision(zzZV8 zzzv8) {
        zzZYh().zzQ(12, zzzv8);
    }

    public final void setIndex(int i) {
        this.zzTL = i;
    }

    @Override // com.aspose.words.zzZ8X
    @ReservedForInternalUse
    @Deprecated
    public void setInsertRevision(zzZV8 zzzv8) {
        zzZYh().zzQ(14, zzzv8);
    }

    @Override // com.aspose.words.zzZA6
    @ReservedForInternalUse
    @Deprecated
    public void setMoveFromRevision(zzYX5 zzyx5) {
        zzZYh().zzQ(13, zzyx5);
    }

    @Override // com.aspose.words.zzZA6
    @ReservedForInternalUse
    @Deprecated
    public void setMoveToRevision(zzYX5 zzyx5) {
        zzZYh().zzQ(15, zzyx5);
    }

    public void setReferenceMark(String str) {
        this.zzYwE = str;
        this.zzZEG = !com.aspose.words.internal.zzZYD.zzXk(str);
    }

    public final void zzZ6V() {
        this.zzYwF = 1;
    }

    public Footnote(DocumentBase documentBase, int i, boolean z, String str, zzYEF zzyef) {
        super(documentBase, zzyef);
        this.zzTL = -1;
        this.zzYwF = i;
        this.zzZEG = z;
        this.zzYwE = str;
    }

    public void isAuto(boolean z) {
        this.zzZEG = z;
        if (z) {
            return;
        }
        this.zzYwE = "";
    }
}
