package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Story extends CompositeNode<Node> implements zzZ96 {
    private zzYCB zzXaZ;
    private int zzYQi;
    private TableCollection zzZAd;
    private ParagraphCollection zzZAe;

    public Story(DocumentBase documentBase, int i) {
        super(documentBase);
        this.zzYQi = i;
    }

    public Paragraph appendParagraph(String str) {
        Paragraph paragraph = new Paragraph(getDocument());
        appendChild(paragraph);
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            paragraph.appendChild(new Run(getDocument(), str));
        }
        return paragraph;
    }

    public void deleteShapes() {
        getChildNodes(17, true).clear();
        getChildNodes(18, true).clear();
    }

    public Paragraph getFirstParagraph() {
        return (Paragraph) getChild(8, 0, false);
    }

    public Paragraph getLastParagraph() {
        return (Paragraph) getChild(8, -1, false);
    }

    public ParagraphCollection getParagraphs() {
        ParagraphCollection paragraphCollection = this.zzZAe;
        if (paragraphCollection != null) {
            return paragraphCollection;
        }
        ParagraphCollection paragraphCollection2 = new ParagraphCollection(this);
        this.zzZAe = paragraphCollection2;
        return paragraphCollection2;
    }

    @Override // com.aspose.words.zzZ96
    public int getStoryType() {
        return this.zzYQi;
    }

    public TableCollection getTables() {
        TableCollection tableCollection = this.zzZAd;
        if (tableCollection != null) {
            return tableCollection;
        }
        TableCollection tableCollection2 = new TableCollection(this);
        this.zzZAd = tableCollection2;
        return tableCollection2;
    }

    public final boolean zz6T() {
        return zzZYx() && com.aspose.words.internal.zzZKN.equals(getLastChild().getText(), ControlChar.SECTION_BREAK);
    }

    @Override // com.aspose.words.CompositeNode
    public boolean zzT(Node node) {
        return zzYVU.zzXR(node);
    }

    public final zzYCB zzY4A() {
        zzYCB zzycb = this.zzXaZ;
        if (zzycb != null) {
            return zzycb;
        }
        zzYCB zzycb2 = new zzYCB(this);
        this.zzXaZ = zzycb2;
        return zzycb2;
    }

    @Override // com.aspose.words.CompositeNode, com.aspose.words.Node
    public final Node zzZ(boolean z, zzZA5 zzza5) {
        Story story = (Story) super.zzZ(z, zzza5);
        story.zzZAe = null;
        story.zzZAd = null;
        story.zzXaZ = null;
        return story;
    }
}
