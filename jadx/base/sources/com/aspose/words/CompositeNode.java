package com.aspose.words;

import com.aspose.words.Node;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public abstract class CompositeNode<V extends Node> extends Node implements zzZA4, Iterable<V> {
    private Node zzZsX;
    private Node zzZsY;
    private Node zzZsZ;

    public CompositeNode() {
    }

    private void zzH(StringBuilder sb) {
        for (Node firstChild = getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            firstChild.zzI(sb);
        }
    }

    private void zzX(Node node, Node node2) {
        Node nodeZzYB0 = node2.zzYB0();
        node.zzYH(nodeZzYB0);
        node.zzYI(node2);
        node2.zzYH(node);
        if (nodeZzYB0 == null) {
            this.zzZsZ = node;
        } else {
            nodeZzYB0.zzYI(node);
        }
    }

    private <T extends Node> T zzy(T t) {
        Node node = this.zzZsZ;
        if (t != node) {
            Node nodeZzYB0 = t.zzYB0();
            Node nodeZzYB1 = t.zzYB1();
            nodeZzYB0.zzYI(nodeZzYB1);
            if (nodeZzYB1 == null) {
                this.zzZsY = nodeZzYB0;
            } else {
                nodeZzYB1.zzYH(nodeZzYB0);
            }
        } else if (node == this.zzZsY) {
            this.zzZsZ = null;
            this.zzZsY = null;
        } else {
            Node nodeZzYB12 = t.zzYB1();
            this.zzZsZ = nodeZzYB12;
            nodeZzYB12.zzYH(null);
        }
        t.zzYI(null);
        t.zzYH(null);
        t.zzYG(null);
        return t;
    }

    public boolean acceptChildren(DocumentVisitor documentVisitor) throws Exception {
        Node firstChild = getFirstChild();
        while (firstChild != null) {
            Node nextSibling = firstChild.getNextSibling();
            if (!firstChild.accept(documentVisitor)) {
                return false;
            }
            firstChild = nextSibling;
        }
        return true;
    }

    public boolean acceptCore(DocumentVisitor documentVisitor) throws Exception {
        int iAcceptStart = acceptStart(documentVisitor);
        if (iAcceptStart == 0) {
            if (acceptChildren(documentVisitor)) {
                return Node.visitorActionToBool(acceptEnd(documentVisitor));
            }
            return false;
        }
        if (iAcceptStart == 1) {
            return true;
        }
        if (iAcceptStart == 2) {
            return false;
        }
        throw new IllegalStateException("Unknown visitor action.");
    }

    public abstract int acceptEnd(DocumentVisitor documentVisitor) throws Exception;

    public abstract int acceptStart(DocumentVisitor documentVisitor) throws Exception;

    public <T extends Node> T appendChild(T t) {
        return (T) insertAfter(t, getLastChild());
    }

    public void coreRemoveSelfOnly() {
        if (getParentNode() == null) {
            throw new IllegalStateException("This node is not attached to any document");
        }
        zzY82 zzy82 = new zzY82(getDocument());
        while (hasChildNodes()) {
            try {
                getParentNode().insertAfter(getLastChild(), this);
            } catch (Throwable th) {
                zzy82.dispose();
                throw th;
            }
        }
        getParentNode().zzT(this, true);
        zzy82.dispose();
    }

    public Node getChild(int i, int i2, boolean z) {
        if (i2 < 0 || z) {
            return getChildNodes(i, z).get(i2);
        }
        int i3 = i2 + 1;
        boolean zZztp = zzYVU.zztp(i);
        Node nodeZzZYv = zZztp ? zzZYv() : getFirstChild();
        while (nodeZzZYv != null) {
            if (nodeZzZYv.getNodeType() == i || i == 0) {
                i3--;
            }
            if (i3 == 0) {
                return nodeZzZYv;
            }
            nodeZzZYv = zZztp ? nodeZzZYv.zzYB7() : nodeZzZYv.getNextSibling();
        }
        return null;
    }

    public NodeCollection getChildNodes(int i, boolean z) {
        return new NodeCollection(this, i, z);
    }

    @Override // com.aspose.words.zzZA4
    @ReservedForInternalUse
    @Deprecated
    public CompositeNode getContainer() {
        return this;
    }

    public int getCount() {
        int i = 0;
        for (Node firstChild = getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            i++;
        }
        return i;
    }

    @Override // com.aspose.words.zzZA4
    @ReservedForInternalUse
    @Deprecated
    public Node getCurrentNode() {
        return this.zzZsX;
    }

    public Node getFirstChild() {
        return this.zzZsZ;
    }

    public Node getLastChild() {
        return this.zzZsY;
    }

    @Override // com.aspose.words.zzZA4
    @ReservedForInternalUse
    @Deprecated
    public Node getNextMatchingNode(Node node) {
        this.zzZsX = node == this ? getFirstChild() : node.getNextSibling();
        return node;
    }

    @Override // com.aspose.words.Node
    public String getText() {
        StringBuilder sb = new StringBuilder();
        zzI(sb);
        return sb.toString();
    }

    public boolean hasChildNodes() {
        return getLastChild() != null;
    }

    public int indexOf(Node node) {
        int i = 0;
        for (Node firstChild = getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            if (firstChild == node) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public <T extends Node> T insertAfter(T t, Node node) {
        return (T) zzZ((Node) t, node, true);
    }

    public <T extends Node> T insertBefore(T t, Node node) {
        return (T) zzZ((Node) t, node, false);
    }

    @Override // com.aspose.words.Node
    public boolean isComposite() {
        return true;
    }

    @Override // java.lang.Iterable
    public Iterator<V> iterator() {
        return new zzYWK(this);
    }

    public <T extends Node> T prependChild(T t) {
        return (T) insertBefore(t, getFirstChild());
    }

    public void removeAllChildren() {
        zzYW0.zzn(getFirstChild(), null);
    }

    public <T extends Node> T removeChild(T t) {
        return (T) zzT(t, false);
    }

    public void removeSmartTags() {
        Iterator<T> it = getChildNodes(27, true).iterator();
        while (it.hasNext()) {
            ((SmartTag) it.next()).coreRemoveSelfOnly();
        }
    }

    public NodeList selectNodes(String str) {
        return zzZYL.zzX(this, str);
    }

    public Node selectSingleNode(String str) {
        return zzZYL.zzW(this, str);
    }

    @Override // com.aspose.words.Node
    public final int zz0R() {
        int iZz0R = 0;
        for (Node firstChild = getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            iZz0R += firstChild.zz0R();
        }
        return zzZYp().length() + iZz0R;
    }

    public final Node zzA(Node node) {
        node.getParentNode();
        Node node2 = this.zzZsY;
        if (node2 == null) {
            node.zzYH(null);
            node.zzYI(null);
            this.zzZsZ = node;
        } else {
            node.zzYH(node2);
            node.zzYI(null);
            this.zzZsY.zzYI(node);
        }
        this.zzZsY = node;
        node.zzYG(this);
        return node;
    }

    @Override // com.aspose.words.Node
    public final void zzI(StringBuilder sb) {
        zzH(sb);
        com.aspose.words.internal.zzZNH.zzU(sb, zzZYp());
    }

    public boolean zzT(Node node) {
        return true;
    }

    public final NodeCollection zzY(int[] iArr, boolean z) {
        return new NodeCollection(this, iArr, z);
    }

    @Override // com.aspose.words.Node
    public Node zzZ(boolean z, zzZA5 zzza5) {
        CompositeNode compositeNode = (CompositeNode) super.zzZ(z, zzza5);
        compositeNode.zzZsY = null;
        compositeNode.zzZsZ = null;
        if (z) {
            for (Node firstChild = getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
                compositeNode.zzA(firstChild.zzZ(true, zzza5));
            }
        }
        return compositeNode;
    }

    public final String zzZYo() {
        StringBuilder sb = new StringBuilder();
        zzH(sb);
        return sb.toString();
    }

    public String zzZYp() {
        return "";
    }

    public final Node zzZYq() {
        Node lastChild = getLastChild();
        while (lastChild != null && zzYVU.zztq(lastChild.getNodeType())) {
            lastChild = lastChild.getPreviousSibling();
        }
        return lastChild;
    }

    public final Node zzZYr() {
        Node firstChild = getFirstChild();
        while (firstChild != null && zzYVU.zztq(firstChild.getNodeType())) {
            firstChild = firstChild.getNextSibling();
        }
        return firstChild;
    }

    public final CompositeNode zzZYs() {
        return (CompositeNode) zzYVU.zzz(getLastChild(), true);
    }

    public final CompositeNode zzZYt() {
        return (CompositeNode) zzYVU.zzA(getFirstChild(), true);
    }

    public final Node zzZYu() {
        return zzYVU.zzz(getLastChild(), false);
    }

    public final Node zzZYv() {
        return zzYVU.zzA(getFirstChild(), false);
    }

    public final boolean zzZYw() {
        for (Node firstChild = getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            if (firstChild instanceof zzZAM) {
                return true;
            }
            CompositeNode compositeNode = (CompositeNode) com.aspose.words.internal.zzZKW.zzZ(firstChild, CompositeNode.class);
            if (compositeNode != null && compositeNode.zzZYw()) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzZYx() {
        return hasChildNodes() && getFirstChild() == getLastChild();
    }

    public final boolean zzZYy() {
        return zzZYv() != null;
    }

    public final int zzz(Node node) {
        int i = 0;
        for (Node firstChild = getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            if (!zzYVU.zztq(firstChild.getNodeType())) {
                if (zzYVU.zzl(node, firstChild)) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public CompositeNode(DocumentBase documentBase) {
        super(documentBase);
    }

    private <T extends Node> T zzT(T t, boolean z) {
        if (t == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: oldChild");
        }
        if (t.getParentNode() != this) {
            throw new IllegalArgumentException("This node is not a parent of the oldChild node.");
        }
        DocumentBase document = getDocument();
        NodeChangingArgs nodeChangingArgsZzZ = zzTR.zzZ(document, t, this, null, 1);
        if (document.zzZqp() && zzYJ4.zzWW(t)) {
            return t;
        }
        zzTR.zzZ(document, nodeChangingArgsZzZ);
        if (!z && zzYVU.zzXL(t)) {
            zzYVU.zzx(t, false);
        }
        T t2 = (T) zzy(t);
        zzTR.zzY(document, nodeChangingArgsZzZ);
        return t2;
    }

    public final void zzY(Node node, Node node2, Node node3) {
        if (node2 != null && node2.getParentNode() != node.getParentNode()) {
            throw new IllegalArgumentException("The start and end nodes should have the same parent.");
        }
        while (node != node2) {
            Node nextSibling = node.getNextSibling();
            node3 = insertAfter(node, node3);
            node = nextSibling;
        }
    }

    private void zzY(Node node, Node node2) {
        Node nodeZzYB1 = node2.zzYB1();
        node.zzYH(node2);
        node.zzYI(nodeZzYB1);
        node2.zzYI(node);
        if (nodeZzYB1 == null) {
            this.zzZsY = node;
        } else {
            nodeZzYB1.zzYH(node);
        }
    }

    public final void zzZ(Node node, Node node2, Node node3) {
        zzZ(node, node2, node3, false);
    }

    public final void zzZ(Node node, Node node2, Node node3, boolean z) {
        if (node2 != null && node2.getParentNode() != node.getParentNode()) {
            throw new IllegalArgumentException("The start and end nodes should have the same parent.");
        }
        while (node != node2) {
            Node nextSibling = node.getNextSibling();
            if (!z || zzT(node)) {
                insertBefore(node, node3);
            }
            node = nextSibling;
        }
    }

    public final <T extends Node> T zzZ(T t, Node node, boolean z) {
        if (node != null && node.getParentNode() != this) {
            throw new IllegalArgumentException("The reference node is not a child of this node.");
        }
        if (t == null) {
            throw new IllegalArgumentException("Cannot insert a null node.");
        }
        if (t != this) {
            if (zzYF(t)) {
                throw new IllegalArgumentException("The newChild is an ancestor of this node.");
            }
            if (t != node) {
                DocumentBase document = getDocument();
                zzTR.zzZ(document, t.getDocument());
                if (t.getNodeType() != 37 && !zzT(t)) {
                    throw new IllegalArgumentException("Cannot insert a node of this type at this location.");
                }
                CompositeNode parentNode = t.getParentNode();
                Node nextSibling = t.getNextSibling();
                if (parentNode != null) {
                    zzY81 zzy81 = new zzY81(document);
                    try {
                        parentNode.zzT(t, true);
                    } finally {
                        zzy81.dispose();
                    }
                }
                NodeChangingArgs nodeChangingArgsZzZ = zzTR.zzZ(document, t, null, this, 0);
                zzTR.zzZ(document, nodeChangingArgsZzZ);
                Node node2 = this.zzZsY;
                if (node2 == null) {
                    t.zzYH(null);
                    t.zzYI(null);
                    this.zzZsZ = t;
                    this.zzZsY = t;
                } else if (z) {
                    if (node != null) {
                        zzY(t, node);
                    } else {
                        zzX(t, this.zzZsZ);
                    }
                } else if (node != null) {
                    zzX(t, node);
                } else {
                    zzY(t, node2);
                }
                t.zzYG(this);
                zzTR.zzY(document, nodeChangingArgsZzZ);
                if (document.zzZqp()) {
                    zzYJ4.zzZ(t, parentNode, nextSibling);
                }
                return t;
            }
            throw new IllegalArgumentException("Cannot add a node before/after itself.");
        }
        throw new IllegalArgumentException("Cannot add a node to self.");
    }
}
