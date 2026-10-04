package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class Section extends CompositeNode<Node> implements zzZ9E {
    private zzYCZ zzXOw;
    private HeaderFooterCollection zzXnP;
    private PageSetup zzXnQ;

    public static class zzZ implements zzZ9E {
        private Section zzXWP;

        public zzZ(Section section) {
            this.zzXWP = section;
        }

        private zzZ9E zzYc9() {
            Document document = (Document) com.aspose.words.internal.zzZKW.zzZ(this.zzXWP.getDocument(), Document.class);
            return (document == null || document.getFirstSection() == null) ? this.zzXWP : document.getFirstSection();
        }

        @Override // com.aspose.words.zzZ9E
        public final void clearSectionAttrs() {
        }

        @Override // com.aspose.words.zzZ9E
        public final Object fetchInheritedSectionAttr(int i) {
            return zzYc9().fetchInheritedSectionAttr(i);
        }

        @Override // com.aspose.words.zzZ9E
        public final Object fetchSectionAttr(int i) {
            return zzYc9().fetchSectionAttr(i);
        }

        @Override // com.aspose.words.zzZ9E
        public final Object getDirectSectionAttr(int i) {
            return zzYc9().getDirectSectionAttr(i);
        }

        @Override // com.aspose.words.zzZ9E
        public final void setSectionAttr(int i, Object obj) {
        }
    }

    public Section(DocumentBase documentBase) {
        this(documentBase, new zzYCZ());
    }

    private void zzW(Section section, boolean z) {
        if (section == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: sourceSection");
        }
        Body body = section.getBody();
        if (body == null) {
            return;
        }
        Body body2 = getBody();
        if (body2 == null) {
            body2 = (Body) appendChild(new Body(getDocument()));
        }
        Body body3 = (Body) getDocument().importNode(body, true);
        CompositeNode lastParagraph = z ? body2.getLastParagraph() : null;
        while (lastParagraph != null && lastParagraph.getParentNode() != body2) {
            lastParagraph = lastParagraph.getParentNode();
        }
        body2.zzY(body3.getFirstChild(), null, lastParagraph);
    }

    @Override // com.aspose.words.Node
    public final boolean accept(DocumentVisitor documentVisitor) throws Exception {
        return acceptCore(documentVisitor);
    }

    @Override // com.aspose.words.CompositeNode
    public final int acceptEnd(DocumentVisitor documentVisitor) throws Exception {
        return documentVisitor.visitSectionEnd(this);
    }

    @Override // com.aspose.words.CompositeNode
    public final int acceptStart(DocumentVisitor documentVisitor) throws Exception {
        return documentVisitor.visitSectionStart(this);
    }

    public final void appendContent(Section section) {
        zzW(section, true);
    }

    public final void clearContent() {
        clearHeadersFooters();
        getBody().removeAllChildren();
        getBody().ensureMinimum();
    }

    public final void clearHeadersFooters() {
        for (Node firstChild = getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            if (firstChild.getNodeType() == 4) {
                ((HeaderFooter) firstChild).removeAllChildren();
            }
        }
    }

    @Override // com.aspose.words.zzZ9E
    @ReservedForInternalUse
    @Deprecated
    public final void clearSectionAttrs() {
        this.zzXOw.clear();
    }

    public final Section deepClone() {
        return (Section) deepClone(true);
    }

    public final void deleteHeaderFooterShapes() {
        for (Node firstChild = getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            if (firstChild.getNodeType() == 4) {
                ((HeaderFooter) firstChild).deleteShapes();
            }
        }
    }

    public final void ensureMinimum() {
        Body body = getBody();
        if (body == null) {
            body = (Body) appendChild(new Body(getDocument()));
        }
        body.ensureMinimum();
    }

    @Override // com.aspose.words.zzZ9E
    @ReservedForInternalUse
    @Deprecated
    public final Object fetchInheritedSectionAttr(int i) {
        return i == 2600 ? getDocument().zzZpV().zzYVh.zzPj(i) : zzYCZ.zzOt(i);
    }

    @Override // com.aspose.words.zzZ9E
    @ReservedForInternalUse
    @Deprecated
    public final Object fetchSectionAttr(int i) {
        Object directSectionAttr = getDirectSectionAttr(i);
        return directSectionAttr != null ? directSectionAttr : fetchInheritedSectionAttr(i);
    }

    public final Body getBody() {
        return (Body) getChild(3, 0, false);
    }

    @Override // com.aspose.words.zzZ9E
    @ReservedForInternalUse
    @Deprecated
    public final Object getDirectSectionAttr(int i) {
        return this.zzXOw.zzPk(i);
    }

    public final HeaderFooterCollection getHeadersFooters() {
        if (this.zzXnP == null) {
            this.zzXnP = new HeaderFooterCollection(this);
        }
        return this.zzXnP;
    }

    @Override // com.aspose.words.Node
    public final int getNodeType() {
        return 2;
    }

    public final PageSetup getPageSetup() {
        if (this.zzXnQ == null) {
            this.zzXnQ = new PageSetup(this, getDocument().zzZpV(), getDocument().getStyles(), new zzZ(this));
        }
        return this.zzXnQ;
    }

    public final boolean getProtectedForForms() {
        return !getPageSetup().zzYpR();
    }

    public final void prependContent(Section section) {
        zzW(section, false);
    }

    public final void setProtectedForForms(boolean z) {
        getPageSetup().zzRE(!z);
    }

    @Override // com.aspose.words.zzZ9E
    @ReservedForInternalUse
    @Deprecated
    public final void setSectionAttr(int i, Object obj) {
        if (i == 2260 || i == 2270) {
            this.zzXOw.remove(2090);
        }
        if (i == 2600) {
            getDocument().zzZpV().zzYVh.zzQ(i, obj);
        } else {
            this.zzXOw.zzQ(i, obj);
        }
    }

    @Override // com.aspose.words.Node
    public final String toString() {
        return com.aspose.words.internal.zzZKN.format("{0} {1}", super.toString(), SectionStart.toString(this.zzXOw.getSectionStart()));
    }

    @Override // com.aspose.words.CompositeNode
    public final boolean zzT(Node node) {
        int nodeType = node.getNodeType();
        return (nodeType == 3 || nodeType == 4) && zzmv(((Story) node).getStoryType()) == null;
    }

    public final void zzY(zzYCZ zzycz) {
        this.zzXOw = zzycz;
    }

    public final boolean zzYVf() {
        return getParentNode().getFirstChild() == this;
    }

    public final boolean zzYVg() {
        return getParentNode().getLastChild() == this;
    }

    public final boolean zzYca() {
        boolean z = false;
        for (HeaderFooter headerFooter : getHeadersFooters()) {
            if (headerFooter.isHeader()) {
                for (Shape shape : headerFooter.zzY4A()) {
                    if (shape.zzY98()) {
                        shape.remove();
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    public final zzYCZ zzYvR() {
        return this.zzXOw;
    }

    @Override // com.aspose.words.CompositeNode, com.aspose.words.Node
    public final Node zzZ(boolean z, zzZA5 zzza5) {
        Section section = (Section) super.zzZ(z, zzza5);
        section.zzXOw = (zzYCZ) this.zzXOw.zzbn();
        section.zzXnQ = null;
        section.zzXnP = null;
        return section;
    }

    public final Story zzmv(int i) {
        for (Node firstChild = getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            Story story = (Story) firstChild;
            if (story.getStoryType() == i) {
                return story;
            }
        }
        return null;
    }

    public Section(DocumentBase documentBase, zzYCZ zzycz) {
        super(documentBase);
        this.zzXOw = zzycz;
    }

    public final void zzY(Shape shape, boolean z) throws Exception {
        zzZ(shape, 4, z);
        zzZ(shape, 0, z);
        zzZ(shape, 1, z);
    }

    private void zzZ(Shape shape, int i, boolean z) throws Exception {
        HeaderFooter byHeaderFooterType = getHeadersFooters().getByHeaderFooterType(i);
        if (byHeaderFooterType == null) {
            if (!z) {
                return;
            }
            byHeaderFooterType = new HeaderFooter(getDocument(), i);
            getHeadersFooters().add(byHeaderFooterType);
        }
        if (byHeaderFooterType.getParagraphs().getCount() == 0) {
            byHeaderFooterType.appendChild(new Paragraph(getDocument()));
        }
        Shape shape2 = (Shape) shape.deepClone(true);
        shape2.setId(shape2.getDocument().zzZq0());
        shape2.setName(com.aspose.words.internal.zzZKN.format("{0}{1}", shape2.hasImage() ? "WordPictureWatermark" : "PowerPlusWaterMarkObject", Integer.valueOf(shape2.getId())));
        byHeaderFooterType.getFirstParagraph().appendChild(shape2);
    }
}
