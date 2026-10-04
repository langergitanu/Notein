package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class FieldCollection implements Iterable<Field> {
    private NodeCollection zzYEQ;

    public static final class zzZ implements Iterator<Field> {
        private Iterator<Node> zzYEP;

        public zzZ(NodeCollection nodeCollection) {
            this.zzYEP = nodeCollection.iterator();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: zzZey, reason: merged with bridge method [inline-methods] */
        public Field next() {
            try {
                return ((FieldStart) this.zzYEP.next()).getField();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            try {
                return this.zzYEP.hasNext();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public FieldCollection(Node node) {
        this.zzYEQ = node.isComposite() ? ((CompositeNode) node).getChildNodes(22, true) : zzZUO.zzYLo;
    }

    private static void zzX(FieldStart fieldStart) throws Exception {
        zzYW0.zzm(fieldStart, zzZR4.zzW(fieldStart).getEnd());
    }

    public void clear() throws Exception {
        while (true) {
            FieldStart fieldStart = (FieldStart) this.zzYEQ.get(0);
            if (fieldStart == null) {
                return;
            } else {
                zzX(fieldStart);
            }
        }
    }

    public Field get(int i) {
        FieldStart fieldStart = (FieldStart) this.zzYEQ.get(i);
        if (fieldStart != null) {
            return fieldStart.getField();
        }
        return null;
    }

    public int getCount() {
        return this.zzYEQ.getCount();
    }

    @Override // java.lang.Iterable
    public Iterator<Field> iterator() {
        return new zzZ(this.zzYEQ);
    }

    public void remove(Field field) throws Exception {
        if (field == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: field");
        }
        field.remove();
    }

    public void removeAt(int i) throws Exception {
        FieldStart fieldStart = (FieldStart) this.zzYEQ.get(i);
        if (fieldStart == null) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: index");
        }
        zzX(fieldStart);
    }
}
