package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class GlossaryDocument extends DocumentBase<BuildingBlock> {
    private BuildingBlockCollection zzYuC;
    private Document zzYuD;

    @Override // com.aspose.words.Node
    public boolean accept(DocumentVisitor documentVisitor) throws Exception {
        return acceptCore(documentVisitor);
    }

    @Override // com.aspose.words.CompositeNode
    public int acceptEnd(DocumentVisitor documentVisitor) throws Exception {
        return documentVisitor.visitGlossaryDocumentEnd(this);
    }

    @Override // com.aspose.words.CompositeNode
    public int acceptStart(DocumentVisitor documentVisitor) throws Exception {
        return documentVisitor.visitGlossaryDocumentStart(this);
    }

    public BuildingBlock getBuildingBlock(int i, String str, String str2) {
        Iterator<V> it = iterator();
        while (it.hasNext()) {
            BuildingBlock buildingBlock = (BuildingBlock) it.next();
            if (buildingBlock.getGallery() == i && (str == null || com.aspose.words.internal.zzZKN.equals(buildingBlock.getCategory(), str))) {
                if (com.aspose.words.internal.zzZKN.equals(buildingBlock.getName(), str2)) {
                    return buildingBlock;
                }
            }
        }
        return null;
    }

    public BuildingBlockCollection getBuildingBlocks() {
        if (this.zzYuC == null) {
            this.zzYuC = new BuildingBlockCollection(this);
        }
        return this.zzYuC;
    }

    public BuildingBlock getFirstBuildingBlock() {
        return (BuildingBlock) getChild(32, 0, false);
    }

    public BuildingBlock getLastBuildingBlock() {
        return (BuildingBlock) getChild(32, -1, false);
    }

    @Override // com.aspose.words.Node
    public int getNodeType() {
        return 31;
    }

    @Override // com.aspose.words.DocumentBase
    public final void zzG0(int i) {
    }

    @Override // com.aspose.words.DocumentBase
    public final void zzG1(int i) {
    }

    @Override // com.aspose.words.CompositeNode
    public final boolean zzT(Node node) {
        return node.getNodeType() == 32;
    }

    @Override // com.aspose.words.DocumentBase, com.aspose.words.CompositeNode, com.aspose.words.Node
    public final Node zzZ(boolean z, zzZA5 zzza5) {
        GlossaryDocument glossaryDocument = (GlossaryDocument) super.zzZ(z, zzza5);
        glossaryDocument.zzYuC = null;
        glossaryDocument.zzYuD = null;
        return glossaryDocument;
    }

    @Override // com.aspose.words.DocumentBase
    public final Theme zzZqI() {
        return null;
    }

    @Override // com.aspose.words.DocumentBase
    public final boolean zzZqo() {
        return false;
    }

    @Override // com.aspose.words.DocumentBase
    public final boolean zzZqp() {
        return false;
    }

    @Override // com.aspose.words.DocumentBase
    public final zzZYQ zzZqx() {
        Document document = this.zzYuD;
        if (document != null) {
            return document.zzZqx();
        }
        return null;
    }

    @Override // com.aspose.words.DocumentBase
    public final zzZYZ zzZqy() {
        Document document = this.zzYuD;
        if (document != null) {
            return document.zzZqy();
        }
        return null;
    }

    public final Document zzZrE() {
        return this.zzYuD;
    }

    public final void zzr(Document document) {
        this.zzYuD = document;
    }
}
