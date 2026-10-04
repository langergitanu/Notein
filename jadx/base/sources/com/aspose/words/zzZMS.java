package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzZMS extends CompositeNode<Node> {
    private int zzYwp;
    private static int[] zzYwr = {1580, 1610, 1620, 1630, 1640};
    private static int[] zzYwq = {30, 40, 1580};

    public zzZMS(DocumentBase documentBase, int i) {
        super(documentBase);
        this.zzYwp = i;
    }

    @Override // com.aspose.words.Node
    public boolean accept(DocumentVisitor documentVisitor) throws Exception {
        return acceptChildren(documentVisitor);
    }

    @Override // com.aspose.words.CompositeNode
    public int acceptEnd(DocumentVisitor documentVisitor) {
        return 0;
    }

    @Override // com.aspose.words.CompositeNode
    public int acceptStart(DocumentVisitor documentVisitor) {
        return 0;
    }

    @Override // com.aspose.words.Node
    public int getNodeType() {
        return 37;
    }

    public final boolean isDefault() {
        Paragraph paragraph;
        if (getChildNodes(0, false).getCount() > 1 || (paragraph = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(getChildNodes(0, false).get(0), Paragraph.class)) == null) {
            return false;
        }
        zzYMX zzymx = (zzYMX) paragraph.zzZYj().zzbn();
        zzymx.zzYpN();
        int i = 0;
        while (i < zzymx.getCount()) {
            int iZzT3 = zzymx.zzT3(i);
            if (com.aspose.words.internal.zzZKO.equals(zzymx.get(iZzT3), paragraph.fetchInheritedParaAttr(iZzT3))) {
                zzymx.removeAt(i);
            } else {
                i++;
            }
        }
        zzYMX zzymx2 = new zzYMX();
        zzymx2.zzQ(1000, 0);
        zzymx2.zzQ(1220, 0);
        zzymx2.zzQ(1650, new zzZ52(240, 2));
        zzymx.zzW(zzymx2);
        zzymx.remove(1580);
        zzymx.remove(1610);
        zzymx.remove(1620);
        zzymx.remove(1630);
        return zzymx.getCount() <= 0;
    }

    @Override // com.aspose.words.CompositeNode
    public final boolean zzT(Node node) {
        return true;
    }

    public final boolean zzY(zzZMS zzzms) {
        if (zzzms == null || this.zzYwp != zzzms.zzYwp) {
            return false;
        }
        NodeCollection childNodes = getChildNodes(8, false);
        NodeCollection childNodes2 = zzzms.getChildNodes(8, false);
        if (childNodes.getCount() != childNodes2.getCount()) {
            return false;
        }
        for (int i = 0; i < childNodes.getCount(); i++) {
            Paragraph paragraph = (Paragraph) childNodes.get(i);
            Paragraph paragraph2 = (Paragraph) childNodes2.get(i);
            if (!paragraph.zzZYj().zzW(paragraph2.zzZYj(), zzYwr) || !paragraph.zzYp5().zzW(paragraph2.zzYp5(), zzYwq)) {
                return false;
            }
        }
        return true;
    }

    public final int zzZ6S() {
        return this.zzYwp;
    }
}
