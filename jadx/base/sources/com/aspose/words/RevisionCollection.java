package com.aspose.words;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class RevisionCollection implements Iterable<Revision> {
    private RevisionGroupCollection zzXBE;
    private int zzXBJ;
    private int zzXBK;
    private Node zzXVV;
    private DocumentBase zzZCL;
    private ArrayList<Revision> zzXBI = new ArrayList<>();
    private ArrayList<Revision> zzXBH = new ArrayList<>();
    private ArrayList<Revision> zzXBG = new ArrayList<>();
    private zzYJ8 zzXBF = new zzYJ8();

    public static final class zzY implements Iterator<Revision> {
        private int zzTL;
        private com.aspose.words.internal.zzKV<Revision> zzXBA;
        private int zzXBB;
        private RevisionCollection zzXBC;
        private ArrayList<Revision> zzXBI;
        private Revision zzXBz;

        public zzY(RevisionCollection revisionCollection) {
            revisionCollection.zzYAM();
            this.zzXBC = revisionCollection;
            this.zzXBB = revisionCollection.zzYlv();
            this.zzXBI = revisionCollection.zzXBI;
            this.zzXBA = new com.aspose.words.internal.zzKV<>(revisionCollection.zzXBG.iterator());
            reset();
        }

        private void reset() {
            this.zzTL = 0;
            this.zzXBz = null;
            this.zzXBB = this.zzXBC.zzYlv();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: zzYls, reason: merged with bridge method [inline-methods] */
        public Revision next() {
            if (this.zzXBB == this.zzXBC.zzYlv()) {
                return this.zzXBz;
            }
            throw new IllegalStateException("RevisionCollection was modified by Accept/Reject operation; enumeration operation may not execute.");
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.zzXBB != this.zzXBC.zzYlv()) {
                throw new IllegalStateException("RevisionCollection was modified by Accept/Reject operation; enumeration operation may not execute.");
            }
            if (this.zzTL < this.zzXBI.size()) {
                this.zzXBz = this.zzXBI.get(this.zzTL);
                this.zzTL++;
                return true;
            }
            if (this.zzXBA.moveNext()) {
                this.zzXBz = this.zzXBA.getCurrent();
                return true;
            }
            this.zzXBz = null;
            return false;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static class zzZ implements IRevisionCriteria {
        static IRevisionCriteria zzXBD = new zzZ();

        private zzZ() {
        }

        @Override // com.aspose.words.IRevisionCriteria
        public final boolean isMatch(Revision revision) {
            return true;
        }
    }

    public RevisionCollection(Node node) {
        if (node.getNodeType() != 1) {
            this.zzZCL = node.getDocument();
            this.zzXVV = node;
        } else {
            this.zzZCL = (DocumentBase) node;
        }
        zzYlu();
    }

    private void zzF(Style style) {
        if (style.zzZYh().zzY3m()) {
            zzZ(this.zzXBH, style.zzZYh().zzYsN(), style, false);
        }
        if (style.zzZYj().zzY3m()) {
            zzZ(this.zzXBH, style.zzZYj().zzYsN(), style, false);
        }
    }

    private void zzRv(boolean z) {
        if (z) {
            this.zzXBK++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zzYAM() {
        if (this.zzXBJ != zzYlt()) {
            zzYlu();
        }
    }

    private int zzYlt() {
        DocumentBase documentBase = this.zzZCL;
        if (documentBase != null) {
            return documentBase.zzZq4();
        }
        return 0;
    }

    private void zzYlu() {
        CompositeNode compositeNode;
        ArrayList<Node> arrayListZzYAN;
        this.zzXBI.clear();
        this.zzXBG.clear();
        this.zzXBH.clear();
        this.zzXBJ = zzYlt();
        this.zzXBF.zzWX(this.zzXVV);
        Node node = this.zzXVV;
        if (node == null) {
            arrayListZzYAN = new NodeCollection((CompositeNode) this.zzZCL, (zzYWD) this.zzXBF, true).zzYAN();
            compositeNode = this.zzZCL;
        } else {
            compositeNode = (CompositeNode) com.aspose.words.internal.zzZKW.zzZ(node, CompositeNode.class);
            arrayListZzYAN = compositeNode != null ? new NodeCollection(compositeNode, (zzYWD) this.zzXBF, true).zzYAN() : new ArrayList();
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<Node>) arrayListZzYAN, this.zzXVV);
        }
        if (compositeNode != null) {
            for (ShapeBase shapeBase : compositeNode.getChildNodes(18, true)) {
                if (shapeBase.zzY9n() != null) {
                    com.aspose.words.internal.zzZQG.zzZ(arrayListZzYAN, (Iterable) new NodeCollection((CompositeNode) shapeBase.zzY9n(), (zzYWD) this.zzXBF, true).zzYAO());
                }
            }
        }
        for (Node node2 : arrayListZzYAN) {
            WordAttrCollection wordAttrCollectionZzWP = zzYJ3.zzWP(node2);
            if (wordAttrCollectionZzWP != null) {
                zzZ(wordAttrCollectionZzWP, node2);
            }
            Paragraph paragraph = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(node2, Paragraph.class);
            if (paragraph != null) {
                zzZ(paragraph.zzYp5(), paragraph);
            }
            StructuredDocumentTag structuredDocumentTag = (StructuredDocumentTag) com.aspose.words.internal.zzZKW.zzZ(node2, StructuredDocumentTag.class);
            if (structuredDocumentTag != null) {
                zzZ(structuredDocumentTag.zzY3I(), structuredDocumentTag);
            }
        }
        for (Style style : this.zzZCL.getStyles()) {
            if (style.hasRevisions()) {
                zzG(style);
            }
            if (style.zzY3m()) {
                zzF(style);
            }
        }
        this.zzXBK++;
    }

    private void zzYlx() {
        this.zzXBI.clear();
        this.zzXBG.clear();
        this.zzXBH.clear();
        this.zzXBE = null;
        this.zzXBK++;
    }

    public int accept(IRevisionCriteria iRevisionCriteria) throws Exception {
        com.aspose.words.internal.zzZ4.zzY((Object) iRevisionCriteria, "filter");
        return zzZ(iRevisionCriteria, true);
    }

    public void acceptAll() throws Exception {
        accept(zzZ.zzXBD);
    }

    public Revision get(int i) {
        zzYAM();
        if (i < this.zzXBI.size()) {
            return this.zzXBI.get(i);
        }
        int size = i - this.zzXBI.size();
        if (size < this.zzXBG.size()) {
            return this.zzXBG.get(size);
        }
        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: index");
    }

    public int getCount() {
        zzYAM();
        return this.zzXBG.size() + this.zzXBI.size();
    }

    public RevisionGroupCollection getGroups() {
        RevisionGroupCollection revisionGroupCollection = this.zzXBE;
        if (revisionGroupCollection != null) {
            return revisionGroupCollection;
        }
        RevisionGroupCollection revisionGroupCollection2 = new RevisionGroupCollection(this.zzZCL);
        this.zzXBE = revisionGroupCollection2;
        return revisionGroupCollection2;
    }

    @Override // java.lang.Iterable
    public Iterator<Revision> iterator() {
        return new zzY(this);
    }

    public int reject(IRevisionCriteria iRevisionCriteria) throws Exception {
        com.aspose.words.internal.zzZ4.zzY((Object) iRevisionCriteria, "filter");
        return zzZ(iRevisionCriteria, false);
    }

    public void rejectAll() throws Exception {
        reject(zzZ.zzXBD);
    }

    public final void zzG(Style style) {
        if (style.zzZYh().zz6D()) {
            zzZ(this.zzXBG, style.zzZYh().zzYsN(), style, true);
        }
        if (style.zzZYj().zz6D()) {
            zzZ(this.zzXBG, style.zzZYj().zzYsN(), style, true);
        }
    }

    public final void zzH(Style style) {
        Revision next;
        Iterator<Revision> it = this.zzXBG.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next.getParentStyle().zzZ7j() == style.zzZ7j()) {
                    break;
                }
            }
        }
        if (next != null) {
            this.zzXBG.remove(next);
            this.zzXBK++;
        }
    }

    public final void zzV(Revision revision) {
        if (revision.getRevisionType() != 3) {
            this.zzXBI.remove(revision);
        } else {
            this.zzXBG.remove(revision);
        }
        this.zzXBK++;
    }

    public final int zzYlv() {
        return this.zzXBK;
    }

    public final void zzYlw() {
        this.zzXBE = null;
    }

    private int zzZ(IRevisionCriteria iRevisionCriteria, boolean z) throws Exception {
        try {
            zzY81 zzy81 = new zzY81(this.zzZCL);
            try {
                ArrayList<Revision> arrayListZzZ = zzZ(iRevisionCriteria);
                zzYJ9 zzyj9 = new zzYJ9(arrayListZzZ, z);
                Iterator<Revision> it = arrayListZzZ.iterator();
                while (it.hasNext()) {
                    it.next().zzZ(false, zzyj9);
                }
                zzYC.zzZ(this.zzZCL, zzyj9);
                zzYJ3.zzZ(zzyj9, this.zzZCL);
                zzYlx();
                int size = arrayListZzZ.size();
                zzy81.dispose();
                return size;
            } catch (Throwable th) {
                zzy81.dispose();
                throw th;
            }
        } finally {
            this.zzXBK++;
        }
    }

    private void zzZ(WordAttrCollection wordAttrCollection, Node node) {
        RevisionCollection revisionCollection;
        Node node2;
        if (wordAttrCollection.zzYrV()) {
            zzZ(this.zzXBI, 0, wordAttrCollection.getInsertRevision(), node, true);
            revisionCollection = this;
            node2 = node;
        } else {
            revisionCollection = this;
            node2 = node;
        }
        if (wordAttrCollection.zzYrW()) {
            revisionCollection.zzZ(revisionCollection.zzXBI, 1, wordAttrCollection.getDeleteRevision(), node2, true);
        }
        if (wordAttrCollection.zz6D()) {
            revisionCollection.zzZ(revisionCollection.zzXBI, 2, wordAttrCollection.zzYsN(), node2, true);
        }
        if (wordAttrCollection.zzXS4()) {
            revisionCollection.zzZ(revisionCollection.zzXBI, 4, wordAttrCollection.getMoveFromRevision(), node2, true);
        }
        if (wordAttrCollection.zzXS3()) {
            revisionCollection.zzZ(revisionCollection.zzXBI, 4, wordAttrCollection.getMoveToRevision(), node2, true);
        }
        if (wordAttrCollection.zzY3m()) {
            revisionCollection.zzZ(revisionCollection.zzXBH, 2, wordAttrCollection.zzYsN(), node2, false);
        }
        zzYMX zzymx = (zzYMX) com.aspose.words.internal.zzZKW.zzZ(wordAttrCollection, zzYMX.class);
        if (zzymx == null || !zzymx.zzYpJ()) {
            return;
        }
        revisionCollection.zzZ(revisionCollection.zzXBI, 2, zzymx.zzYpK(), node2, true);
    }

    private void zzZ(ArrayList<Revision> arrayList, int i, zzYJC zzyjc, Node node, boolean z) {
        arrayList.add(new Revision(i, zzyjc, node, this));
        zzRv(z);
    }

    private void zzZ(ArrayList<Revision> arrayList, zzYJC zzyjc, Style style, boolean z) {
        arrayList.add(new Revision(zzyjc, style, this));
        zzRv(z);
    }

    private ArrayList<Revision> zzZ(IRevisionCriteria iRevisionCriteria) throws Exception {
        ArrayList<Revision> arrayList = new ArrayList<>(this.zzXBH.size() + getCount());
        Iterator<Revision> it = iterator();
        while (it.hasNext()) {
            zzZ(arrayList, it.next(), iRevisionCriteria);
        }
        Iterator<Revision> it2 = this.zzXBH.iterator();
        while (it2.hasNext()) {
            zzZ(arrayList, it2.next(), iRevisionCriteria);
        }
        return arrayList;
    }

    private static void zzZ(Collection<Revision> collection, Revision revision, IRevisionCriteria iRevisionCriteria) throws Exception {
        if (iRevisionCriteria.isMatch(revision)) {
            collection.add(revision);
        }
    }
}
