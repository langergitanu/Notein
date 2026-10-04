package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface ISmartArtNodeCollection extends IGenericCollection<ISmartArtNode> {
    ISmartArtNode addNode();

    ISmartArtNode addNodeByPosition(int i);

    ISmartArtNode get_Item(int i);

    void removeNode(int i);

    void removeNode(ISmartArtNode iSmartArtNode);
}
