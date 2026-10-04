package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class BuildingBlockCollection extends NodeCollection<BuildingBlock> {
    public BuildingBlockCollection(GlossaryDocument glossaryDocument) {
        super((CompositeNode) glossaryDocument, 32, false);
    }

    @Override // com.aspose.words.NodeCollection
    public BuildingBlock get(int i) {
        return (BuildingBlock) super.get(i);
    }

    @Override // com.aspose.words.NodeCollection
    public BuildingBlock[] toArray() {
        return (BuildingBlock[]) zzYAN().toArray(new BuildingBlock[0]);
    }
}
