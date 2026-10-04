package com.aspose.words;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzYW9 extends zzYW6 {
    private zzZRO zzXV1;
    private Map zzXV2;
    private zzUQ zzZv7 = new zzUQ();

    private zzYW9(Map map, zzZRO zzzro) {
        this.zzXV2 = map;
        this.zzXV1 = zzzro;
    }

    private void zzV(Node node, Node node2, boolean z) {
        CompositeNode parentNode = node.getParentNode();
        CompositeNode parentNode2 = node2.getParentNode();
        zzZ(node, parentNode.getLastChild(), (Node) null, zzYJK.zzZ(parentNode, node, this.zzXV1, this));
        zzX(parentNode2.getFirstChild(), node2, node);
        if (!z || parentNode.getNextSibling() == parentNode2) {
            return;
        }
        zzX(parentNode.getNextSibling(), parentNode2.getPreviousSibling(), parentNode);
    }

    public static void zzZ(Node node, Node node2, Map map, zzZRO zzzro, int i) throws Exception {
        new zzYW9(map, zzzro).zzZ(node, node2, i);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void zzs(Node node, Node node2) {
        Node parentNode = node.getParentNode();
        CompositeNode parentNode2 = node2.getParentNode();
        CompositeNode parentNode3 = parentNode.getParentNode();
        CompositeNode parentNode4 = parentNode2.getParentNode();
        parentNode3.getNodeType();
        parentNode4.getNodeType();
        Node parentNode5 = parentNode3.getParentNode();
        Node parentNode6 = parentNode4.getParentNode();
        zzV(node, node2, false);
        CompositeNode compositeNode = (CompositeNode) this.zzXV1.zzZ(parentNode5, false, this);
        Iterator<T> it = ((Section) parentNode5).getHeadersFooters().iterator();
        while (it.hasNext()) {
            compositeNode.appendChild(this.zzXV1.zzZ((HeaderFooter) it.next(), true, this));
        }
        CompositeNode compositeNodeZzZ = zzYJK.zzZ(parentNode3, parentNode, this.zzXV1, this);
        compositeNode.appendChild(compositeNodeZzZ);
        parentNode5.zzYC(compositeNode);
        if (parentNode.getNextSibling() != null) {
            zzZ(parentNode.getNextSibling(), parentNode3.getLastChild(), (Node) null, compositeNodeZzZ);
        }
        if (parentNode2.getPreviousSibling() != null) {
            zzX(parentNode4.getFirstChild(), parentNode2.getPreviousSibling(), parentNode);
        }
        if (parentNode5.getNextSibling() != parentNode6) {
            zzX(parentNode5.getNextSibling(), parentNode6.getPreviousSibling(), parentNode5);
        }
    }

    public final void zzW(Node node, Node node2) {
        if (this.zzXV2.containsKey(node)) {
            this.zzXV2.put(node, node2);
        }
        this.zzZv7.zzI(node);
    }

    @Override // com.aspose.words.zzYW6
    public final void zzX(Cell cell, Cell cell2) {
        zzX(cell, cell2, cell);
    }

    @Override // com.aspose.words.zzYW6
    public final void zzY6(Node node) {
        node.zzYC(this.zzXV1.zzZ(node, true, this));
    }

    @Override // com.aspose.words.zzYW6
    public final void zzr(Node node, Node node2) {
        zzX(node, node2, node);
    }

    @Override // com.aspose.words.zzYW6
    public final void zzt(Node node, Node node2) {
        CompositeNode parentNode = node.getParentNode();
        CompositeNode parentNode2 = node2.getParentNode();
        if (parentNode == parentNode2) {
            zzX(node, node2, node);
        } else if (parentNode.getParentNode() == parentNode2.getParentNode()) {
            zzV(node, node2, true);
        } else {
            zzs(node, node2);
        }
    }

    private void zzX(Node node, Node node2, Node node3) {
        zzZ(node, node2, node3, (CompositeNode) null);
    }

    private void zzZ(Node node, Node node2, Node node3, CompositeNode compositeNode) {
        if (compositeNode == null) {
            compositeNode = node3.getParentNode();
        }
        while (true) {
            Node nextSibling = node.getNextSibling();
            compositeNode.insertBefore(this.zzXV1.zzZ(node, true, this), node3);
            if (node == node2) {
                return;
            } else {
                node = nextSibling;
            }
        }
    }
}
