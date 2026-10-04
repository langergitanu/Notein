package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class StructuredDocumentTagRangeStart extends Node implements IStructuredDocumentTag, Iterable<Node> {
    private StructuredDocumentTag zzXo7;

    public static class zzX extends zzYWD {
        private int zzXVJ;
        private int zzXae;
        private StructuredDocumentTagRangeStart zzXah;
        private boolean zzYE7;
        private DocumentBase zzZG3;
        private com.aspose.words.internal.zzIM<Integer> zzXag = new com.aspose.words.internal.zzIM<>();
        private ArrayList<Node> zzXaf = new ArrayList<>();

        public zzX(int i, StructuredDocumentTagRangeStart structuredDocumentTagRangeStart, boolean z) {
            this.zzXah = structuredDocumentTagRangeStart;
            this.zzXae = i;
            this.zzYE7 = z;
            this.zzZG3 = structuredDocumentTagRangeStart.getDocument();
            invalidate();
        }

        private void invalidate() {
            this.zzXVJ = this.zzZG3.zzZq4();
            this.zzXaf.clear();
            this.zzXag.clear();
            StructuredDocumentTagRangeEnd rangeEnd = this.zzXah.getRangeEnd();
            Node nodeNextPreOrder = this.zzXah;
            while (true) {
                nodeNextPreOrder = nodeNextPreOrder.nextPreOrder(this.zzZG3);
                if (nodeNextPreOrder == null || nodeNextPreOrder == rangeEnd) {
                    return;
                }
                if (nodeNextPreOrder.getNodeType() != 3 && nodeNextPreOrder.getNodeType() != 2 && (this.zzYE7 || nodeNextPreOrder.getParentNode().getNodeType() == 3)) {
                    if (!zzY3B()) {
                        com.aspose.words.internal.zzZQG.zzZ(this.zzXaf, nodeNextPreOrder);
                    }
                    if (!this.zzYE7) {
                        if (nodeNextPreOrder.getNodeType() == 29) {
                            zzWp(nodeNextPreOrder);
                        } else if (nodeNextPreOrder.getNodeType() == 30) {
                            zzWo(nodeNextPreOrder);
                        }
                    }
                }
            }
        }

        private void zzWo(Node node) {
            this.zzXag.remove(Integer.valueOf(((StructuredDocumentTagRangeEnd) node).getId()));
        }

        private void zzWp(Node node) {
            this.zzXag.add(Integer.valueOf(((StructuredDocumentTagRangeStart) node).getId()));
        }

        private boolean zzY3B() {
            return this.zzXag.getCount() > 0;
        }

        private void zzYAM() {
            if (this.zzXVJ != this.zzZG3.zzZq4()) {
                invalidate();
            }
        }

        @Override // com.aspose.words.zzYWD
        public final boolean zzJ(Node node) {
            if (this.zzXae != 0 && node.getNodeType() != this.zzXae) {
                return false;
            }
            zzYAM();
            return this.zzXaf.contains(node);
        }

        @Override // com.aspose.words.zzYWD
        public final boolean zzZZP() {
            return false;
        }
    }

    public static final class zzY implements Iterator<Node> {
        private Node zzXVH = null;
        private StructuredDocumentTagRangeStart zzXah;
        private DocumentBase zzZG3;

        public zzY(StructuredDocumentTagRangeStart structuredDocumentTagRangeStart) {
            this.zzXah = structuredDocumentTagRangeStart;
            this.zzZG3 = structuredDocumentTagRangeStart.getDocument();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.zzXah.getRangeEnd() == null) {
                return false;
            }
            if (this.zzXVH == null) {
                this.zzXVH = this.zzXah;
            }
            while (true) {
                Node nodeNextPreOrder = this.zzXVH.nextPreOrder(this.zzZG3);
                this.zzXVH = nodeNextPreOrder;
                if (nodeNextPreOrder == null || (nodeNextPreOrder.getNodeType() != 3 && this.zzXVH.getNodeType() != 2 && this.zzXVH.getParentNode().getNodeType() == 3)) {
                    break;
                }
            }
            if (this.zzXVH == this.zzXah.getRangeEnd()) {
                this.zzXVH = null;
            }
            return this.zzXVH != null;
        }

        @Override // java.util.Iterator
        public final /* bridge */ /* synthetic */ Node next() {
            return this.zzXVH;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static class zzZ extends zzYWG {
        private int zzYG;

        private zzZ(zzYWB zzywb, int i) {
            super(zzywb, 30);
            this.zzYG = i;
        }

        public static StructuredDocumentTagRangeEnd zzW(zzYWB zzywb, int i) {
            ArrayList<Node> arrayListZzYAp = new zzZ(zzywb, i).zzYAp();
            if (arrayListZzYAp.size() == 1) {
                return (StructuredDocumentTagRangeEnd) arrayListZzYAp.get(0);
            }
            return null;
        }

        @Override // com.aspose.words.zzYWG
        public final boolean zzYAo() {
            return ((StructuredDocumentTagRangeEnd) next()).getId() == this.zzYG;
        }
    }

    public StructuredDocumentTagRangeStart(DocumentBase documentBase, int i) {
        this(documentBase, new StructuredDocumentTag(documentBase, i, 2));
    }

    private static void zz4(Node node, Node node2) {
        node.getParentNode();
        node2.getParentNode();
        CompositeNode parentNode = node.getParentNode();
        int iIndexOf = parentNode.indexOf(node);
        int iIndexOf2 = (parentNode.indexOf(node2) - iIndexOf) + 1;
        for (int i = 0; i < iIndexOf2; i++) {
            parentNode.getChildNodes(0, false).removeAt(iIndexOf);
        }
    }

    private boolean zzX(DocumentVisitor documentVisitor) throws Exception {
        for (Node node : this) {
            if (node.getNodeType() != 29 && node.getNodeType() != 30 && !node.accept(documentVisitor)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.aspose.words.Node
    public boolean accept(DocumentVisitor documentVisitor) throws Exception {
        return Node.visitorActionToBool(documentVisitor.visitStructuredDocumentTagRangeStart(this));
    }

    public Node appendChild(Node node) {
        return (getLastChild() != null ? getLastChild() : this).zzYD(node);
    }

    @Override // com.aspose.words.IStructuredDocumentTag
    public int getAppearance() {
        return zzYcK().getAppearance();
    }

    @Override // com.aspose.words.IStructuredDocumentTag
    public NodeCollection getChildNodes(int i, boolean z) {
        return new NodeCollection((CompositeNode) getDocument(), (zzYWD) new zzX(i, this, z), true);
    }

    @Override // com.aspose.words.IStructuredDocumentTag
    public int getColor() {
        return zzYcK().getColor();
    }

    @Override // com.aspose.words.IStructuredDocumentTag
    public int getId() {
        return zzYcK().getId();
    }

    public Node getLastChild() {
        if (getRangeEnd() != null) {
            return getRangeEnd().getPreviousSibling();
        }
        return null;
    }

    @Override // com.aspose.words.IStructuredDocumentTag
    public int getLevel() {
        return 2;
    }

    @Override // com.aspose.words.IStructuredDocumentTag
    public boolean getLockContentControl() {
        return zzYcK().getLockContentControl();
    }

    @Override // com.aspose.words.IStructuredDocumentTag
    public boolean getLockContents() {
        return zzYcK().getLockContents();
    }

    @Override // com.aspose.words.IStructuredDocumentTag
    @ReservedForInternalUse
    @Deprecated
    public Node getNode() {
        return this;
    }

    @Override // com.aspose.words.Node
    public int getNodeType() {
        return 29;
    }

    @Override // com.aspose.words.IStructuredDocumentTag
    public BuildingBlock getPlaceholder() {
        return zzYcK().getPlaceholder();
    }

    @Override // com.aspose.words.IStructuredDocumentTag
    public String getPlaceholderName() {
        return zzYcK().getPlaceholderName();
    }

    public StructuredDocumentTagRangeEnd getRangeEnd() {
        if (getParentNode() == null) {
            return null;
        }
        return zzZ.zzW(new zzYWB(this, false, isRemoved() ? getParentNode().getLastChild() : getDocument().getLastChild(), true), getId());
    }

    @Override // com.aspose.words.IStructuredDocumentTag
    public int getSdtType() {
        return zzYcK().zzY3H().getType();
    }

    @Override // com.aspose.words.IStructuredDocumentTag
    public String getTag() {
        return zzYcK().getTag();
    }

    @Override // com.aspose.words.IStructuredDocumentTag
    public String getTitle() {
        return zzYcK().getTitle();
    }

    @Override // com.aspose.words.IStructuredDocumentTag
    public String getWordOpenXML() throws Exception {
        return new zzYO1().zzZ8(this);
    }

    public String getWordOpenXMLMinimal() throws Exception {
        return new zzYO1(true).zzZ8(this);
    }

    @Override // com.aspose.words.IStructuredDocumentTag
    public XmlMapping getXmlMapping() {
        return zzYcK().getXmlMapping();
    }

    @Override // com.aspose.words.IStructuredDocumentTag
    @ReservedForInternalUse
    @Deprecated
    public boolean isMultiSection() {
        return true;
    }

    @Override // com.aspose.words.IStructuredDocumentTag
    @ReservedForInternalUse
    @Deprecated
    public boolean isRanged() {
        return true;
    }

    @Override // com.aspose.words.IStructuredDocumentTag
    public boolean isShowingPlaceholderText() {
        return zzYcK().isShowingPlaceholderText();
    }

    @Override // java.lang.Iterable
    public Iterator<Node> iterator() {
        return new zzY(this);
    }

    public void removeAllChildren() {
        StructuredDocumentTagRangeEnd rangeEnd = getRangeEnd();
        if (rangeEnd == null) {
            return;
        }
        Section parentSection = getParentNode() != null ? ((Body) getParentNode()).getParentSection() : null;
        Section parentSection2 = rangeEnd.getParentNode() != null ? ((Body) rangeEnd.getParentNode()).getParentSection() : null;
        if (parentSection == null || parentSection2 == null) {
            return;
        }
        if (com.aspose.words.internal.zzZKO.zzA(parentSection, parentSection2)) {
            if (getNextSibling() != rangeEnd) {
                zz4(getNextSibling(), rangeEnd.getPreviousSibling());
                return;
            }
            return;
        }
        if (getNextSibling() != null) {
            zz4(getNextSibling(), parentSection.getBody().getLastChild());
        }
        if (rangeEnd.getPreviousSibling() != null) {
            zz4(parentSection2.getBody().getFirstChild(), rangeEnd.getPreviousSibling());
        }
        while (parentSection.getBody().hasChildNodes()) {
            parentSection2.getBody().insertBefore(parentSection.getBody().getFirstChild(), rangeEnd);
        }
        zz4(parentSection, parentSection2.getPreviousSibling());
    }

    @Override // com.aspose.words.IStructuredDocumentTag
    public void removeSelfOnly() {
        if (getRangeEnd() != null) {
            getRangeEnd().remove();
        }
        remove();
    }

    @Override // com.aspose.words.IStructuredDocumentTag
    public void setAppearance(int i) {
        zzYcK().setAppearance(i);
        zzYDH.zzv(zzYcK());
    }

    @Override // com.aspose.words.IStructuredDocumentTag
    public void setColor(int i) {
        zzYcK().setColor(i);
    }

    public final void setId(int i) {
        zzYcK().setId(i);
    }

    @Override // com.aspose.words.IStructuredDocumentTag
    public void setLockContentControl(boolean z) {
        zzYcK().setLockContentControl(z);
    }

    @Override // com.aspose.words.IStructuredDocumentTag
    public void setLockContents(boolean z) {
        zzYcK().setLockContents(z);
    }

    @Override // com.aspose.words.IStructuredDocumentTag
    public void setPlaceholderName(String str) {
        zzYcK().setPlaceholderName(str);
    }

    @Override // com.aspose.words.IStructuredDocumentTag
    public void setTag(String str) {
        zzYcK().setTag(str);
    }

    @Override // com.aspose.words.IStructuredDocumentTag
    public void setTitle(String str) {
        zzYcK().setTitle(str);
    }

    @Override // com.aspose.words.IStructuredDocumentTag
    @ReservedForInternalUse
    @Deprecated
    public Node structuredDocumentTagNode() {
        return this;
    }

    public final boolean zzY(DocumentVisitor documentVisitor) throws Exception {
        if (zzX(documentVisitor)) {
            return Node.visitorActionToBool(documentVisitor.visitStructuredDocumentTagRangeStart(this));
        }
        return false;
    }

    public final StructuredDocumentTag zzYcK() {
        StructuredDocumentTag structuredDocumentTag = this.zzXo7;
        if (structuredDocumentTag != null) {
            structuredDocumentTag.zzY(getDocument());
        }
        return this.zzXo7;
    }

    @Override // com.aspose.words.Node
    public final Node zzZ(boolean z, zzZA5 zzza5) {
        StructuredDocumentTagRangeStart structuredDocumentTagRangeStart = (StructuredDocumentTagRangeStart) super.zzZ(z, zzza5);
        structuredDocumentTagRangeStart.zzXo7 = (StructuredDocumentTag) zzYcK().zzZ(z, zzza5);
        structuredDocumentTagRangeStart.zzYcK().zzle(zzYcK().getId());
        return structuredDocumentTagRangeStart;
    }

    public final void zzm(StructuredDocumentTag structuredDocumentTag) {
        this.zzXo7 = structuredDocumentTag;
    }

    public StructuredDocumentTagRangeStart(DocumentBase documentBase, StructuredDocumentTag structuredDocumentTag) {
        super(documentBase);
        this.zzXo7 = structuredDocumentTag;
    }

    @Override // com.aspose.words.IStructuredDocumentTag
    public void isShowingPlaceholderText(boolean z) {
        zzYcK().isShowingPlaceholderText(z);
    }
}
