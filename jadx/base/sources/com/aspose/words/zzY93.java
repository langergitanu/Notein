package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY93 implements zzZAM {
    private StructuredDocumentTag zzYHQ;

    public zzY93(StructuredDocumentTag structuredDocumentTag) {
        this.zzYHQ = structuredDocumentTag;
    }

    @Override // com.aspose.words.zzZ9G
    public final void clearRunAttrs() {
        this.zzYHQ.zzY3J().clear();
    }

    @Override // com.aspose.words.zzZ9G
    public final Object fetchInheritedRunAttr(int i) {
        return zzZ7R.zzY(this, i);
    }

    @Override // com.aspose.words.zzZ9G
    public final Object getDirectRunAttr(int i) {
        return getDirectRunAttr(i, 0);
    }

    @Override // com.aspose.words.zzZAM
    public final DocumentBase getDocument_IInline() {
        return this.zzYHQ.getDocument();
    }

    @Override // com.aspose.words.zzZAM
    public final zzYEF getExpandedRunPr_IInline(int i) {
        return zzZ7R.zzZ(this, i);
    }

    @Override // com.aspose.words.zzZAM
    public final Paragraph getParentParagraph_IInline() {
        return (Paragraph) com.aspose.words.internal.zzZKW.zzZ(this.zzYHQ.getParentNode(), Paragraph.class);
    }

    @Override // com.aspose.words.zzZAM
    public final zzYEF getRunPr_IInline() {
        return this.zzYHQ.zzY3J();
    }

    @Override // com.aspose.words.zzZ9G
    public final void removeRunAttr(int i) {
        this.zzYHQ.zzY3J().remove(i);
    }

    @Override // com.aspose.words.zzZ9G
    public final void setRunAttr(int i, Object obj) {
        this.zzYHQ.zzY3J().zzQ(i, obj);
    }

    @Override // com.aspose.words.zzZAM
    public final void setRunPr_IInline(zzYEF zzyef) {
    }

    @Override // com.aspose.words.zzZ9G
    public final Object getDirectRunAttr(int i, int i2) {
        return this.zzYHQ.zzY3J().zzVQ(i, i2);
    }
}
