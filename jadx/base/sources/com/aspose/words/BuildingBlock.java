package com.aspose.words;

import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public class BuildingBlock extends CompositeNode<Node> {
    private String mName;
    private int zzL4;
    private String zzLo;
    private String zzLr;
    private com.aspose.words.internal.zzZOZ zzV0;
    private SectionCollection zzZB0;
    private int zzZB1;
    private int zzZB2;
    private boolean zzZB3;
    private String zzxu;

    public BuildingBlock(GlossaryDocument glossaryDocument) {
        super(glossaryDocument);
        this.mName = "(Empty Name)";
        this.zzV0 = com.aspose.words.internal.zzZOZ.zzZXP;
        this.zzLr = "";
        this.zzZB2 = 0;
        this.zzLo = "(Empty Category)";
        this.zzZB1 = 0;
        this.zzxu = "";
        this.zzL4 = 0;
    }

    @Override // com.aspose.words.Node
    public boolean accept(DocumentVisitor documentVisitor) throws Exception {
        return acceptCore(documentVisitor);
    }

    @Override // com.aspose.words.CompositeNode
    public int acceptEnd(DocumentVisitor documentVisitor) throws Exception {
        return documentVisitor.visitBuildingBlockEnd(this);
    }

    @Override // com.aspose.words.CompositeNode
    public int acceptStart(DocumentVisitor documentVisitor) throws Exception {
        return documentVisitor.visitBuildingBlockStart(this);
    }

    public int getBehavior() {
        return this.zzZB1;
    }

    public String getCategory() {
        return this.zzLo;
    }

    public String getDescription() {
        return this.zzLr;
    }

    public Section getFirstSection() {
        return (Section) getChild(2, 0, false);
    }

    public int getGallery() {
        return this.zzZB2;
    }

    public UUID getGuid() {
        return com.aspose.words.internal.zzZOZ.zzV(this.zzV0);
    }

    public Section getLastSection() {
        return (Section) getChild(2, -1, false);
    }

    public String getName() {
        return this.mName;
    }

    @Override // com.aspose.words.Node
    public int getNodeType() {
        return 32;
    }

    public SectionCollection getSections() {
        if (this.zzZB0 == null) {
            this.zzZB0 = new SectionCollection(this);
        }
        return this.zzZB0;
    }

    public int getType() {
        return this.zzL4;
    }

    public void setBehavior(int i) {
        this.zzZB1 = i;
    }

    public void setCategory(String str) {
        com.aspose.words.internal.zzZ4.zzU(str, "category");
        this.zzLo = str;
    }

    public void setDescription(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "description");
        this.zzLr = str;
    }

    public void setGallery(int i) {
        this.zzZB2 = i;
    }

    public void setGuid(UUID uuid) {
        this.zzV0 = com.aspose.words.internal.zzZOZ.zzZ(uuid);
    }

    public void setName(String str) {
        com.aspose.words.internal.zzZ4.zzU(str, "name");
        this.mName = str;
    }

    public void setType(int i) {
        this.zzL4 = i;
    }

    public final com.aspose.words.internal.zzZOZ zz7i() {
        return this.zzV0;
    }

    public final boolean zz7j() {
        return this.zzZB3;
    }

    public final String zzG7() {
        return this.zzxu;
    }

    public final void zzR(com.aspose.words.internal.zzZOZ zzzoz) {
        this.zzV0 = zzzoz;
    }

    @Override // com.aspose.words.CompositeNode
    public final boolean zzT(Node node) {
        return node.getNodeType() == 2;
    }

    public final void zzTa(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "style");
        this.zzxu = str;
    }

    public final void zzTb(String str) {
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            this.zzLo = str;
        }
    }

    public final void zzTc(String str) {
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            this.mName = str;
        }
    }

    public final void zzYK(boolean z) {
        this.zzZB3 = z;
    }

    @Override // com.aspose.words.CompositeNode, com.aspose.words.Node
    public final Node zzZ(boolean z, zzZA5 zzza5) {
        BuildingBlock buildingBlock = (BuildingBlock) super.zzZ(z, zzza5);
        buildingBlock.zzZB0 = null;
        return buildingBlock;
    }
}
