package com.aspose.slides.Collections.Generic;

import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.OooO0O0;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.exceptions.SystemException;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: loaded from: classes3.dex */
class RBTree {

    /* JADX INFO: renamed from: k4 */
    private Node f1687k4;

    /* JADX INFO: renamed from: kk */
    private long f1688kk;

    /* JADX INFO: renamed from: x1 */
    private Object f1689x1;

    /* JADX INFO: renamed from: com.aspose.slides.Collections.Generic.RBTree$1 */
    class C02561 implements IGenericEnumerable<Node> {

        /* JADX INFO: renamed from: k4 */
        final /* synthetic */ RBTree f1690k4;

        @Override // java.lang.Iterable
        public IGenericEnumerator<Node> iterator() {
            return new NodeEnumerator(this.f1690k4.m891du());
        }
    }

    public interface INodeHelper<T> {
        int compare(T t, Node node);

        Node createNode(T t);
    }

    public static abstract class Node {

        /* JADX INFO: renamed from: k4 */
        private long f1692k4 = 2;
        public Node left;
        public Node right;

        public long fixSize() {
            setSize(1L);
            if (this.left != null) {
                setSize(this.left.getSize() + getSize());
            }
            if (this.right != null) {
                setSize(this.right.getSize() + getSize());
            }
            return getSize();
        }

        public long getSize() {
            return (this.f1692k4 & 4294967295L) >> 1;
        }

        public void isBlack(boolean z) {
            long j = this.f1692k4;
            this.f1692k4 = z ? (j & 4294967295L) | 1 : j & 4294967294L;
        }

        public void setSize(long j) {
            this.f1692k4 = ((j << 1) & 4294967295L) | (this.f1692k4 & 1);
        }

        public abstract void swapValue(Node node);

        public boolean isBlack() {
            return (this.f1692k4 & 1) == 1;
        }
    }

    public static class NodeEnumerator extends AbstractC7020m9<NodeEnumerator> implements IGenericEnumerator<Node> {

        /* JADX INFO: renamed from: k4 */
        static final /* synthetic */ boolean f1693k4 = true;

        /* JADX INFO: renamed from: du */
        private Stack<Node> f1694du;

        /* JADX INFO: renamed from: kk */
        private long f1695kk;

        /* JADX INFO: renamed from: to */
        private Stack<Node> f1696to;

        /* JADX INFO: renamed from: x1 */
        private RBTree f1697x1;

        public NodeEnumerator() {
        }

        public static boolean equals(NodeEnumerator nodeEnumerator, NodeEnumerator nodeEnumerator2) {
            return nodeEnumerator.equals(nodeEnumerator2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: kk */
        public void m901kk() {
            RBTree rBTree = this.f1697x1;
            if (rBTree == null) {
                throw new ObjectDisposedException("enumerator");
            }
            if (this.f1695kk != rBTree.f1688kk) {
                throw new InvalidOperationException("tree modified");
            }
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        public NodeEnumerator Clone() {
            NodeEnumerator nodeEnumerator = new NodeEnumerator();
            CloneTo(nodeEnumerator);
            return nodeEnumerator;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        public void CloneTo(NodeEnumerator nodeEnumerator) {
            nodeEnumerator.f1697x1 = this.f1697x1;
            nodeEnumerator.f1695kk = this.f1695kk;
            nodeEnumerator.f1696to = this.f1696to;
            nodeEnumerator.f1694du = this.f1694du;
        }

        public Object clone() {
            return Clone();
        }

        @Override // com.aspose.slides.p559ms.System.IDisposable
        public void dispose() {
            this.f1697x1 = null;
            this.f1696to = null;
        }

        public IEnumerator getIEnumerator() {
            return new IEnumerator() { // from class: com.aspose.slides.Collections.Generic.RBTree.NodeEnumerator.1
                @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
                public boolean hasNext() {
                    return NodeEnumerator.this.m904k4();
                }

                @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
                public Object next() {
                    NodeEnumerator.this.m905x1();
                    return NodeEnumerator.this.f1696to.peek();
                }

                @Override // java.util.Iterator
                public void remove() {
                    throw new NotImplementedException();
                }

                @Override // com.aspose.slides.Collections.IEnumerator
                public void reset() {
                    NodeEnumerator.this.m901kk();
                    NodeEnumerator.this.f1696to = null;
                }
            };
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public boolean hasNext() {
            return m904k4();
        }

        public int hashCode() {
            RBTree rBTree = this.f1697x1;
            int iHashCode = rBTree != null ? rBTree.hashCode() : 0;
            long j = this.f1695kk;
            int i = ((iHashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31;
            Stack<Node> stack = this.f1696to;
            int iHashCode2 = (i + (stack != null ? stack.hashCode() : 0)) * 31;
            Stack<Node> stack2 = this.f1694du;
            return iHashCode2 + (stack2 != null ? stack2.hashCode() : 0);
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericEnumerator, com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public Node next() {
            return this.f1696to.peek();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new NotImplementedException();
        }

        @Override // com.aspose.slides.Collections.IEnumerator
        public void reset() {
            m901kk();
            this.f1696to = null;
        }

        /* JADX INFO: renamed from: x1 */
        public void m905x1() {
            m901kk();
            if (this.f1696to == null) {
                throw new InvalidOperationException("state invalid before the first MoveNext()");
            }
        }

        public NodeEnumerator(RBTree rBTree) {
            this();
            this.f1697x1 = rBTree;
            this.f1695kk = rBTree.f1688kk;
        }

        /* JADX INFO: renamed from: kk */
        private boolean m902kk(NodeEnumerator nodeEnumerator) {
            return C14067j2.m66728k4(nodeEnumerator.f1697x1, this.f1697x1) && nodeEnumerator.f1695kk == this.f1695kk && C14067j2.m66728k4(nodeEnumerator.f1696to, this.f1696to) && C14067j2.m66728k4(nodeEnumerator.f1694du, this.f1694du);
        }

        public boolean equals(Object obj) {
            if (!f1693k4 && obj == null) {
                throw new AssertionError();
            }
            if (C14067j2.m66729x1(null, obj)) {
                return false;
            }
            if (C14067j2.m66729x1(this, obj)) {
                return true;
            }
            if (obj instanceof NodeEnumerator) {
                return m902kk((NodeEnumerator) obj);
            }
            return false;
        }

        /* JADX INFO: renamed from: k4 */
        public boolean m904k4() {
            Node node;
            m901kk();
            Stack<Node> stack = this.f1696to;
            if (stack == null) {
                if (this.f1697x1.f1687k4 == null) {
                    return false;
                }
                Stack<Node> stack2 = this.f1694du;
                if (stack2 != null) {
                    this.f1696to = stack2;
                    this.f1694du = null;
                    return stack2.size() != 0;
                }
                this.f1696to = new Stack<>();
                node = this.f1697x1.f1687k4;
            } else {
                if (stack.size() == 0) {
                    return false;
                }
                node = this.f1696to.pop().right;
            }
            while (node != null) {
                this.f1696to.push(node);
                node = node.left;
            }
            return this.f1696to.size() != 0;
        }
    }

    public RBTree(Object obj) {
        this.f1689x1 = obj;
    }

    /* JADX INFO: renamed from: k4 */
    private <T> int m877k4(T t, List<Node> list) {
        Node node;
        INodeHelper iNodeHelper = (INodeHelper) this.f1689x1;
        Node node2 = this.f1687k4;
        if (list != null) {
            list.addItem(node2);
        }
        int iCompare = 0;
        while (node2 != null) {
            iCompare = iNodeHelper.compare(t, node2);
            if (iCompare == 0) {
                return iCompare;
            }
            if (iCompare < 0) {
                node = node2.right;
                node2 = node2.left;
            } else {
                node = node2.left;
                node2 = node2.right;
            }
            if (list != null) {
                list.addItem(node);
                list.addItem(node2);
            }
        }
        return iCompare;
    }

    /* JADX INFO: renamed from: x1 */
    private Node m888x1(List<Node> list) {
        Node node = (Node) OooO0O0.OooO00o(list, 1);
        Node node2 = node.left;
        if (node2 != null) {
            Node nodeM881k4 = m881k4(node2, node.right, list);
            node.swapValue(nodeM881k4);
            Node node3 = nodeM881k4.left;
            if (node3 != null) {
                list.addItem(null);
                list.addItem(node3);
                nodeM881k4.swapValue(node3);
            }
        } else {
            Node node4 = node.right;
            if (node4 != null) {
                list.addItem(null);
                list.addItem(node4);
                node.swapValue(node4);
            }
        }
        int size = list.size();
        int i = size - 1;
        Node node5 = list.get_Item(i);
        if ((node5.getSize() & 4294967295L) != 1) {
            throw new SystemException("Internal Error: red-black violation somewhere");
        }
        list.set_Item(i, null);
        m884k4(i != 0 ? list.get_Item(size - 3) : null, node5, 0L, null);
        for (int i2 = 0; i2 < list.size() - 2; i2 += 2) {
            list.get_Item(i2).setSize(list.get_Item(i2).getSize() - 1);
        }
        if (node5.isBlack()) {
            node5.isBlack(false);
            if (i != 0) {
                m887to(list);
            }
        }
        Node node6 = this.f1687k4;
        if (node6 != null && !node6.isBlack()) {
            throw new SystemException("Internal Error: root is not black");
        }
        this.f1688kk++;
        return node5;
    }

    /* JADX INFO: renamed from: du */
    public RBTree m891du() {
        return this;
    }

    /* JADX INFO: renamed from: h4 */
    public IEnumerable m892h4() {
        return new IEnumerable() { // from class: com.aspose.slides.Collections.Generic.RBTree.2
            @Override // java.lang.Iterable
            public IEnumerator iterator() {
                return new NodeEnumerator(RBTree.this.m891du());
            }
        };
    }

    /* JADX INFO: renamed from: kk */
    public int m895kk() {
        Node node = this.f1687k4;
        if (node == null) {
            return 0;
        }
        return (int) (node.getSize() & 4294967295L);
    }

    /* JADX INFO: renamed from: to */
    public NodeEnumerator m896to() {
        return new NodeEnumerator(this);
    }

    /* JADX INFO: renamed from: kk */
    private int m885kk(int i, List<Node> list) {
        boolean z;
        Node node = list.get_Item(i);
        int i2 = i - 1;
        Node node2 = list.get_Item(i2);
        int i3 = i - 2;
        Node node3 = list.get_Item(i3);
        long size = node3.getSize();
        if (node3.right == node2) {
            node3.right = node2.left;
            node2.left = node3;
            z = true;
        } else {
            node3.left = node2.right;
            node2.right = node3;
            z = false;
        }
        node3.fixSize();
        node3.isBlack(false);
        node2.isBlack(true);
        m884k4(i == 2 ? null : list.get_Item(i - 4), node3, size, node2);
        int i4 = i + 1;
        if (i4 == list.size()) {
            list.addItem(null);
            list.addItem(null);
        }
        list.set_Item(i3, node2);
        list.set_Item(i2, z ? node2.right : node2.left);
        list.set_Item(i, node3);
        list.set_Item(i4, z ? node3.right : node3.left);
        int i5 = i + 2;
        list.set_Item(i5, node);
        return i5;
    }

    /* JADX INFO: renamed from: to */
    private void m887to(List<Node> list) {
        Node node;
        int size = list.size() - 1;
        do {
            Node node2 = list.get_Item(size - 1);
            if (!node2.isBlack()) {
                size = m885kk(size, list);
                node2 = list.get_Item(size - 1);
            }
            Node node3 = node2.left;
            if ((node3 != null && !node3.isBlack()) || ((node = node2.right) != null && !node.isBlack())) {
                m890x1(size, list);
                return;
            }
            node2.isBlack(false);
            size -= 2;
            if (size == 0) {
                return;
            }
        } while (list.get_Item(size).isBlack());
        list.get_Item(size).isBlack(true);
    }

    /* JADX INFO: renamed from: k4 */
    public static List<Node> m879k4() {
        return new List<>();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        m882k4(r0, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: kk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m886kk(List<Node> list) {
        int size = list.size() - 1;
        while (true) {
            int i = size - 3;
            if (list.get_Item(i) == null || list.get_Item(i).isBlack()) {
                break;
            }
            list.get_Item(i).isBlack(true);
            list.get_Item(size - 2).isBlack(true);
            int i2 = size - 4;
            if (i2 == 0) {
                return;
            }
            list.get_Item(i2).isBlack(false);
            if (list.get_Item(size - 6).isBlack()) {
                return;
            } else {
                size = i2;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private Node m880k4(int i, Node node, List<Node> list) {
        list.set_Item(list.size() - 1, node);
        Node node2 = list.get_Item(list.size() - 3);
        if (i < 0) {
            node2.left = node;
        } else {
            node2.right = node;
        }
        for (int i2 = 0; i2 < list.size() - 2; i2 += 2) {
            list.get_Item(i2).setSize(list.get_Item(i2).getSize() + 1);
        }
        if (!node2.isBlack()) {
            m886kk(list);
        }
        if (!this.f1687k4.isBlack()) {
            throw new SystemException("Internal error: root is not black");
        }
        this.f1688kk++;
        return node;
    }

    /* JADX INFO: renamed from: k4 */
    public static Node m881k4(Node node, Node node2, List<Node> list) {
        while (true) {
            list.addItem(node2);
            list.addItem(node);
            Node node3 = node.right;
            if (node3 == null) {
                return node;
            }
            node2 = node.left;
            node = node3;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public <T> Node m893k4(T t) {
        if (this.f1687k4 == null) {
            return null;
        }
        List<Node> listM879k4 = m879k4();
        Node nodeM888x1 = m877k4(t, listM879k4) == 0 ? m888x1(listM879k4) : null;
        m883k4(listM879k4);
        return nodeM888x1;
    }

    /* JADX INFO: renamed from: x1 */
    public <T> Node m897x1(T t) {
        INodeHelper iNodeHelper = (INodeHelper) this.f1689x1;
        Node node = this.f1687k4;
        while (node != null) {
            int iCompare = iNodeHelper.compare(t, node);
            if (iCompare == 0) {
                break;
            }
            node = iCompare < 0 ? node.left : node.right;
        }
        return node;
    }

    /* JADX INFO: renamed from: k4 */
    public <T> Node m894k4(T t, Node node) {
        if (this.f1687k4 == null) {
            if (node == null) {
                node = ((INodeHelper) this.f1689x1).createNode(t);
            }
            this.f1687k4 = node;
            node.isBlack(true);
            this.f1688kk++;
            return this.f1687k4;
        }
        List<Node> listM879k4 = m879k4();
        int iM877k4 = m877k4(t, listM879k4);
        Node nodeM880k4 = (Node) OooO0O0.OooO00o(listM879k4, 1);
        if (nodeM880k4 == null) {
            if (node == null) {
                node = ((INodeHelper) this.f1689x1).createNode(t);
            }
            nodeM880k4 = m880k4(iM877k4, node, listM879k4);
        }
        m883k4(listM879k4);
        return nodeM880k4;
    }

    /* JADX INFO: renamed from: x1 */
    public void m898x1() {
        this.f1687k4 = null;
        this.f1688kk++;
    }

    /* JADX INFO: renamed from: x1 */
    private void m890x1(int i, List<Node> list) {
        Node node;
        Node node2;
        Node node3;
        Node node4 = list.get_Item(i - 1);
        Node node5 = list.get_Item(i - 2);
        long size = node5.getSize();
        boolean zIsBlack = node5.isBlack();
        if (node5.right == node4) {
            Node node6 = node4.right;
            if (node6 == null || node6.isBlack()) {
                node = node4.left;
                node5.right = node.left;
                node.left = node5;
                node4.left = node.right;
                node.right = node4;
                node3 = node;
            } else {
                node5.right = node4.left;
                node4.left = node5;
                node2 = node4.right;
                node2.isBlack(true);
                node3 = node4;
            }
        } else {
            Node node7 = node4.left;
            if (node7 == null || node7.isBlack()) {
                node = node4.right;
                node5.left = node.right;
                node.right = node5;
                node4.right = node.left;
                node.left = node4;
                node3 = node;
            } else {
                node5.left = node4.right;
                node4.right = node5;
                node2 = node4.left;
                node2.isBlack(true);
                node3 = node4;
            }
        }
        node5.fixSize();
        node5.isBlack(true);
        if (node3 != node4) {
            node4.fixSize();
        }
        node3.isBlack(zIsBlack);
        m884k4(i == 2 ? null : list.get_Item(i - 4), node5, size, node3);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m882k4(int i, List<Node> list) {
        Node node;
        Node node2 = list.get_Item(i);
        Node node3 = list.get_Item(i - 2);
        Node node4 = list.get_Item(i - 4);
        long size = node4.getSize();
        boolean z = node3 == node4.left;
        Node node5 = node3.left;
        boolean z2 = node2 == node5;
        if (!z || !z2) {
            if (z && !z2) {
                node4.left = node2.right;
                node2.right = node4;
                node3.right = node2.left;
                node2.left = node3;
            } else if (z || !z2) {
                node4.right = node5;
                node3.left = node4;
            } else {
                node4.right = node2.left;
                node2.left = node4;
                node3.left = node2.right;
                node2.right = node3;
            }
            node = node2;
            node4.fixSize();
            node4.isBlack(false);
            if (node != node3) {
                node3.fixSize();
            }
            node.isBlack(true);
            m884k4(i != 4 ? null : list.get_Item(i - 6), node4, size, node);
        }
        node4.left = node3.right;
        node3.right = node4;
        node = node3;
        node4.fixSize();
        node4.isBlack(false);
        if (node != node3) {
        }
        node.isBlack(true);
        m884k4(i != 4 ? null : list.get_Item(i - 6), node4, size, node);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m883k4(List<Node> list) {
    }

    /* JADX INFO: renamed from: k4 */
    private void m884k4(Node node, Node node2, long j, Node node3) {
        if (node3 != null && node3.fixSize() != j) {
            throw new SystemException("Internal error: rotation");
        }
        if (node2 == this.f1687k4) {
            this.f1687k4 = node3;
        } else if (node2 == node.left) {
            node.left = node3;
        } else {
            if (node2 != node.right) {
                throw new SystemException("Internal error: path error");
            }
            node.right = node3;
        }
    }
}
