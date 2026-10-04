package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class SectionCollection extends NodeCollection<Section> {
    public SectionCollection(CompositeNode compositeNode) {
        super(compositeNode, 2, false);
    }

    @Override // com.aspose.words.NodeCollection
    public Section get(int i) {
        return (Section) super.get(i);
    }

    @Override // com.aspose.words.NodeCollection
    public Section[] toArray() {
        return (Section[]) zzYAN().toArray(new Section[0]);
    }
}
