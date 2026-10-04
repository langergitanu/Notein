package com.aspose.words;

import com.orion.notein.domain.models.note.NoteMeta;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class StructuredDocumentTagCollection implements Iterable<IStructuredDocumentTag> {
    private NodeCollection zzXaj;

    public static final class zzZ implements Iterator<IStructuredDocumentTag> {
        private Iterator<Node> zzXai;

        public zzZ(NodeCollection nodeCollection) {
            this.zzXai = nodeCollection.iterator();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: zzY3C, reason: merged with bridge method [inline-methods] */
        public IStructuredDocumentTag next() {
            return (IStructuredDocumentTag) this.zzXai.next();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.zzXai.hasNext();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public StructuredDocumentTagCollection(Node node) {
        if (node.isComposite()) {
            this.zzXaj = ((CompositeNode) node).zzY(new int[]{28, 29}, true);
        } else {
            this.zzXaj = zzZUO.zzYLo;
        }
    }

    public IStructuredDocumentTag get(int i) {
        return (IStructuredDocumentTag) this.zzXaj.get(i);
    }

    public IStructuredDocumentTag getById(int i) {
        Iterator<T> it = this.zzXaj.iterator();
        while (it.hasNext()) {
            IStructuredDocumentTag iStructuredDocumentTag = (IStructuredDocumentTag) com.aspose.words.internal.zzZKW.zzZ((Node) it.next(), IStructuredDocumentTag.class);
            if (iStructuredDocumentTag != null && iStructuredDocumentTag.getId() == i) {
                return iStructuredDocumentTag;
            }
        }
        return null;
    }

    public IStructuredDocumentTag getByTag(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "tag");
        Iterator<T> it = this.zzXaj.iterator();
        while (it.hasNext()) {
            IStructuredDocumentTag iStructuredDocumentTag = (IStructuredDocumentTag) com.aspose.words.internal.zzZKW.zzZ((Node) it.next(), IStructuredDocumentTag.class);
            if (iStructuredDocumentTag != null && com.aspose.words.internal.zzZKN.zzX(iStructuredDocumentTag.getTag(), str, com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
                return iStructuredDocumentTag;
            }
        }
        return null;
    }

    public IStructuredDocumentTag getByTitle(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, NoteMeta.PROPERTY_TITLE);
        Iterator<T> it = this.zzXaj.iterator();
        while (it.hasNext()) {
            IStructuredDocumentTag iStructuredDocumentTag = (IStructuredDocumentTag) com.aspose.words.internal.zzZKW.zzZ((Node) it.next(), IStructuredDocumentTag.class);
            if (iStructuredDocumentTag != null && com.aspose.words.internal.zzZKN.zzX(iStructuredDocumentTag.getTitle(), str, com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
                return iStructuredDocumentTag;
            }
        }
        return null;
    }

    public int getCount() {
        return this.zzXaj.getCount();
    }

    @Override // java.lang.Iterable
    public Iterator<IStructuredDocumentTag> iterator() {
        return new zzZ(this.zzXaj);
    }

    public void remove(int i) {
        IStructuredDocumentTag byId = getById(i);
        if (byId == null) {
            throw new IllegalArgumentException("The specified Id is not found.");
        }
        byId.getNode().remove();
    }

    public void removeAt(int i) {
        this.zzXaj.removeAt(i);
    }
}
