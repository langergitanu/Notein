package com.aspose.words;

import com.aspose.words.Node;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class NodeCollection<T extends Node> implements zzZA4, Iterable<T> {
    private zzYWD zzXVG;
    private Node zzXVH;
    private int zzXVI;
    private int zzXVJ;
    private CompositeNode zzXVK;
    private boolean zzYE7;
    private DocumentBase zzZCL;
    private int zzZF;
    private Node zzZsX;

    public NodeCollection(CompositeNode compositeNode, int i, boolean z) {
        this(compositeNode, zzYVV.zztr(i), z);
    }

    private void invalidate() {
        this.zzXVJ = zzYAL();
        this.zzXVI = -1;
        this.zzXVH = this.zzXVK;
        this.zzZF = -1;
    }

    private Node zzD(Node node, boolean z) throws Exception {
        do {
            node = this.zzYE7 ? zzZ(z, node) : this.zzXVG.zzZZP() ? zzX(z, node) : zzY(z, node);
            if (node == null) {
                break;
            }
        } while (!this.zzXVG.zzJ(node));
        return node;
    }

    private Node zzM(Node node, int i) throws Exception {
        boolean z = i > 0;
        if (i < 0) {
            i = -i;
        }
        for (int i2 = 0; i2 < i; i2++) {
            node = zzD(node, z);
            if (node == null) {
                return null;
            }
        }
        return node;
    }

    private Node zzX(boolean z, Node node) {
        Node nodeZzZYu;
        if (z) {
            CompositeNode compositeNode = this.zzXVK;
            nodeZzZYu = node == compositeNode ? compositeNode.zzZYv() : node.zzYB7();
        } else {
            CompositeNode compositeNode2 = this.zzXVK;
            nodeZzZYu = node == compositeNode2 ? compositeNode2.zzZYu() : node.zzYB8();
        }
        if (nodeZzZYu == this.zzXVK.getNextSibling() || nodeZzZYu == this.zzXVK.getPreviousSibling()) {
            return null;
        }
        return nodeZzZYu;
    }

    private Node zzY(boolean z, Node node) {
        if (z) {
            CompositeNode compositeNode = this.zzXVK;
            return node == compositeNode ? compositeNode.getFirstChild() : node.getNextSibling();
        }
        CompositeNode compositeNode2 = this.zzXVK;
        return node == compositeNode2 ? compositeNode2.getLastChild() : node.getPreviousSibling();
    }

    private int zzYAL() {
        DocumentBase documentBase = this.zzZCL;
        if (documentBase != null) {
            return documentBase.zzZq4();
        }
        return 0;
    }

    private void zzYAM() {
        if (this.zzXVJ != zzYAL()) {
            invalidate();
        }
    }

    private Node zzYz(Node node) throws Exception {
        Node node2;
        Node nodeZzZ;
        this.zzZsX = node;
        do {
            node2 = this.zzZsX;
            nodeZzZ = this.zzYE7 ? zzZ(true, node2) : this.zzXVG.zzZZP() ? zzX(true, this.zzZsX) : zzY(true, this.zzZsX);
            this.zzZsX = nodeZzZ;
            if (nodeZzZ == null) {
                break;
            }
        } while (!this.zzXVG.zzJ(nodeZzZ));
        return node2;
    }

    private Node zzZ(boolean z, Node node) {
        return z ? node.nextPreOrder(this.zzXVK) : node.previousPreOrder(this.zzXVK);
    }

    public void add(Node node) {
        if (this.zzYE7) {
            throw new UnsupportedOperationException("Adding nodes is not yet supported for deep node collections.");
        }
        this.zzXVK.appendChild(node);
    }

    public void clear() {
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            it.next().remove();
        }
    }

    public boolean contains(Node node) {
        return indexOf(node) != -1;
    }

    public Node get(int i) {
        try {
            zzYAM();
            if (i < 0 && (i = i + getCount()) < 0) {
                return null;
            }
            int i2 = this.zzXVI;
            if (i2 == i) {
                return this.zzXVH;
            }
            Node nodeZzM = zzM(this.zzXVH, i - i2);
            if (nodeZzM != null) {
                this.zzXVI = i;
                this.zzXVH = nodeZzM;
            }
            return nodeZzM;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.aspose.words.zzZA4
    @ReservedForInternalUse
    @Deprecated
    public CompositeNode getContainer() {
        return this.zzXVK;
    }

    public int getCount() {
        zzYAM();
        if (this.zzZF == -1) {
            this.zzZF = zzYWK.zzZ(this);
        }
        return this.zzZF;
    }

    @Override // com.aspose.words.zzZA4
    @ReservedForInternalUse
    @Deprecated
    public Node getCurrentNode() {
        return this.zzZsX;
    }

    @Override // com.aspose.words.zzZA4
    @ReservedForInternalUse
    @Deprecated
    public Node getNextMatchingNode(Node node) throws Exception {
        return zzYz(node);
    }

    public int indexOf(Node node) {
        Iterator<T> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            if (node == it.next()) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public void insert(int i, Node node) {
        if (this.zzYE7) {
            throw new UnsupportedOperationException("Inserting nodes is not yet supported for deep node collections.");
        }
        this.zzXVK.insertBefore(node, get(i));
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new zzYWK(this);
    }

    public void remove(Node node) {
        node.remove();
    }

    public void removeAt(int i) {
        get(i).remove();
    }

    public Node[] toArray() {
        return (Node[]) zzYAN().toArray(new Node[0]);
    }

    public final <TValue extends Node> ArrayList<TValue> zzYAN() {
        ArrayList<TValue> arrayList = new ArrayList<>();
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<T>) arrayList, it.next());
        }
        return arrayList;
    }

    public final ArrayList<Node> zzYAO() {
        return zzYAN();
    }

    public final <TNode extends Node> zzYWK<TNode> zzYAP() {
        return new zzYWK<>(this);
    }

    public NodeCollection(CompositeNode compositeNode, int[] iArr, boolean z) {
        this(compositeNode, new zzYVV(iArr), z);
    }

    public NodeCollection(CompositeNode compositeNode, zzYWD zzywd, boolean z) {
        if (compositeNode == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: container");
        }
        if (zzywd != null) {
            this.zzXVK = compositeNode;
            this.zzZCL = compositeNode.getDocument();
            this.zzXVG = zzywd;
            this.zzYE7 = z;
            invalidate();
            return;
        }
        throw new NullPointerException("Value cannot be null.\r\nParameter name: matcher");
    }
}
