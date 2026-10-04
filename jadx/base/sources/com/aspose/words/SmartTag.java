package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class SmartTag extends CompositeNode<Node> implements zzZAD {
    private CustomXmlPropertyCollection zzXdU;
    private String zzXdV;
    private String zzkB;

    public SmartTag(DocumentBase documentBase) {
        super(documentBase);
        this.zzXdV = "";
        this.zzkB = "";
        this.zzXdU = new CustomXmlPropertyCollection();
    }

    @Override // com.aspose.words.Node
    public boolean accept(DocumentVisitor documentVisitor) throws Exception {
        return acceptCore(documentVisitor);
    }

    @Override // com.aspose.words.CompositeNode
    public int acceptEnd(DocumentVisitor documentVisitor) throws Exception {
        return documentVisitor.visitSmartTagEnd(this);
    }

    @Override // com.aspose.words.CompositeNode
    public int acceptStart(DocumentVisitor documentVisitor) throws Exception {
        return documentVisitor.visitSmartTagStart(this);
    }

    public String getElement() {
        return this.zzXdV;
    }

    @Override // com.aspose.words.zzZAD
    @ReservedForInternalUse
    @Deprecated
    public int getLevel_IMarkupNode() {
        return 1;
    }

    @Override // com.aspose.words.Node
    public int getNodeType() {
        return 27;
    }

    public CustomXmlPropertyCollection getProperties() {
        return this.zzXdU;
    }

    public String getUri() {
        return this.zzkB;
    }

    public void setElement(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "Element");
        this.zzXdV = str;
    }

    public void setUri(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "Uri");
        this.zzkB = str;
    }

    @Override // com.aspose.words.CompositeNode
    public final boolean zzT(Node node) {
        return zzYVU.zzXO(node);
    }

    public final void zzX(SmartTag smartTag) {
        String str = this.zzXdV;
        this.zzXdV = smartTag.zzXdV;
        smartTag.zzXdV = str;
        String str2 = this.zzkB;
        this.zzkB = smartTag.zzkB;
        smartTag.zzkB = str2;
        CustomXmlPropertyCollection customXmlPropertyCollection = this.zzXdU;
        this.zzXdU = smartTag.zzXdU;
        smartTag.zzXdU = customXmlPropertyCollection;
    }

    @Override // com.aspose.words.CompositeNode, com.aspose.words.Node
    public final Node zzZ(boolean z, zzZA5 zzza5) {
        SmartTag smartTag = (SmartTag) super.zzZ(z, zzza5);
        smartTag.zzXdU = this.zzXdU.zzZTD();
        return smartTag;
    }
}
