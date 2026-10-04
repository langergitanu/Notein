package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class HeaderFooter extends Story {
    public HeaderFooter(DocumentBase documentBase, int i) {
        super(documentBase, zzY0C.zzhC(i));
    }

    @Override // com.aspose.words.Node
    public boolean accept(DocumentVisitor documentVisitor) throws Exception {
        return acceptCore(documentVisitor);
    }

    @Override // com.aspose.words.CompositeNode
    public int acceptEnd(DocumentVisitor documentVisitor) throws Exception {
        return documentVisitor.visitHeaderFooterEnd(this);
    }

    @Override // com.aspose.words.CompositeNode
    public int acceptStart(DocumentVisitor documentVisitor) throws Exception {
        return documentVisitor.visitHeaderFooterStart(this);
    }

    public int getHeaderFooterType() {
        return zzY0C.zzhB(super.getStoryType());
    }

    @Override // com.aspose.words.Node
    public int getNodeType() {
        return 4;
    }

    public Section getParentSection() {
        return (Section) getParentNode();
    }

    public boolean isHeader() {
        return getHeaderFooterType() == 1 || getHeaderFooterType() == 4 || getHeaderFooterType() == 0;
    }

    public boolean isLinkedToPrevious() {
        return !hasChildNodes();
    }

    public void isLinkedToPrevious(boolean z) {
        if (z) {
            removeAllChildren();
        } else {
            if (hasChildNodes()) {
                return;
            }
            appendChild(new Paragraph(getDocument()));
        }
    }
}
