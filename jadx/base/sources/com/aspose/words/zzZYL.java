package com.aspose.words;

import com.huawei.hms.network.embedded.C18360t3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import org.w3c.dom.DOMException;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes6.dex */
final class zzZYL {

    public static class zzY implements org.w3c.dom.NodeList {
        private final Map<Node, com.aspose.words.internal.zzZHH> zzYPu;
        private final NodeCollection zzYPv;

        public zzY(NodeCollection nodeCollection, Map<Node, com.aspose.words.internal.zzZHH> map) {
            if (nodeCollection == null) {
                throw new IllegalArgumentException("Collection cannot be null");
            }
            this.zzYPv = nodeCollection;
            this.zzYPu = map;
        }

        @Override // org.w3c.dom.NodeList
        public final int getLength() {
            return this.zzYPv.getCount();
        }

        @Override // org.w3c.dom.NodeList
        public final org.w3c.dom.Node item(int i) {
            return zzZYL.zzZ(this.zzYPv.get(i), this.zzYPu);
        }
    }

    public static class zzZ extends com.aspose.words.internal.zzZHH<Node> {
        private final boolean zzYPA;
        private final String zzYPB;
        private final Map<Node, com.aspose.words.internal.zzZHH> zzYPw;
        private boolean zzYPx;
        private zzY zzYPy;
        private final CompositeNode zzYPz;
        private final Node zzYR6;
        private final String zzZp0;

        public zzZ(Node node) {
            this(node, new HashMap());
        }

        private com.aspose.words.internal.zzZHH zzh(Node node) {
            return zzZYL.zzZ(node, this.zzYPw);
        }

        @Override // org.w3c.dom.Node
        public final org.w3c.dom.Node cloneNode(boolean z) {
            return this;
        }

        @Override // com.aspose.words.internal.zzZHH
        public final /* bridge */ /* synthetic */ Node get() {
            return this.zzYR6;
        }

        @Override // org.w3c.dom.Node
        public final String getBaseURI() {
            return this.zzZp0;
        }

        @Override // org.w3c.dom.Node
        public final org.w3c.dom.NodeList getChildNodes() {
            return this.zzYPy;
        }

        @Override // org.w3c.dom.Document
        public final Element getDocumentElement() {
            return zzh(this.zzYR6);
        }

        @Override // org.w3c.dom.Node
        public final org.w3c.dom.Node getFirstChild() {
            if (this.zzYPA) {
                return zzh(this.zzYPz.getFirstChild());
            }
            return null;
        }

        @Override // org.w3c.dom.Node
        public final org.w3c.dom.Node getLastChild() {
            if (this.zzYPA) {
                return zzh(this.zzYPz.getLastChild());
            }
            return null;
        }

        @Override // org.w3c.dom.Node
        public final String getLocalName() {
            return this.zzYPB;
        }

        @Override // org.w3c.dom.Node
        public final org.w3c.dom.Node getNextSibling() {
            return zzh(this.zzYR6.getNextSibling());
        }

        @Override // org.w3c.dom.Node
        public final String getNodeName() {
            return this.zzYPB;
        }

        @Override // org.w3c.dom.Node
        public final short getNodeType() {
            int nodeType = this.zzYR6.getNodeType();
            return (nodeType == 1 || nodeType == 31) ? (short) 9 : (short) 1;
        }

        @Override // org.w3c.dom.Node
        public final String getNodeValue() throws DOMException {
            return this.zzYR6.getText();
        }

        @Override // org.w3c.dom.Node
        public final org.w3c.dom.Document getOwnerDocument() {
            return zzh(this.zzYR6.getDocument());
        }

        @Override // org.w3c.dom.Node
        public final org.w3c.dom.Node getParentNode() {
            return zzh(this.zzYR6.getParentNode());
        }

        @Override // org.w3c.dom.Node
        public final org.w3c.dom.Node getPreviousSibling() {
            return zzh(this.zzYR6.getPreviousSibling());
        }

        @Override // org.w3c.dom.Element
        public final String getTagName() {
            return this.zzYPB;
        }

        @Override // org.w3c.dom.Node
        public final String getTextContent() throws DOMException {
            return this.zzYR6.getText();
        }

        @Override // org.w3c.dom.Node
        public final boolean hasChildNodes() {
            return this.zzYPx;
        }

        @Override // org.w3c.dom.Node
        public final boolean isEqualNode(org.w3c.dom.Node node) {
            return isSameNode(node);
        }

        @Override // org.w3c.dom.Node
        public final boolean isSameNode(org.w3c.dom.Node node) {
            return node instanceof com.aspose.words.internal.zzZHH ? this.zzYR6 == ((com.aspose.words.internal.zzZHH) node).get() : this == node;
        }

        public zzZ(Node node, Map<Node, com.aspose.words.internal.zzZHH> map) {
            if (node == null) {
                throw new IllegalArgumentException("Node");
            }
            if (map == null) {
                throw new IllegalArgumentException(C18360t3.f56195b);
            }
            this.zzYR6 = node;
            this.zzYPw = map;
            this.zzYPB = node.getClass().getSimpleName();
            boolean z = node instanceof CompositeNode;
            this.zzYPA = z;
            CompositeNode compositeNode = z ? (CompositeNode) node : null;
            this.zzYPz = compositeNode;
            this.zzZp0 = node instanceof Document ? ((Document) node).getBaseUri() : null;
            if (z) {
                this.zzYPx = compositeNode.hasChildNodes();
                this.zzYPy = new zzY(compositeNode.getChildNodes(0, false), map);
            }
            map.put(node, this);
        }
    }

    public static Node zzW(Node node, String str) {
        if (str == null) {
            return null;
        }
        try {
            com.aspose.words.internal.zzZHH zzzhh = (com.aspose.words.internal.zzZHH) com.aspose.words.internal.zzZHG.zzc6().newXPath().compile(com.aspose.words.internal.zzZSN.zzW8(str)).evaluate(new zzZ(node), XPathConstants.NODE);
            if (zzzhh != null) {
                return (Node) zzzhh.get();
            }
            return null;
        } catch (XPathExpressionException e) {
            com.aspose.words.internal.zzZHV.zzZ(e);
            throw new IllegalStateException(e);
        }
    }

    public static NodeList zzX(Node node, String str) {
        if (str == null) {
            return new NodeList(new ArrayList());
        }
        try {
            org.w3c.dom.NodeList nodeList = (org.w3c.dom.NodeList) com.aspose.words.internal.zzZHG.zzc6().newXPath().compile(com.aspose.words.internal.zzZSN.zzW8(str)).evaluate(new zzZ(node), XPathConstants.NODESET);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < nodeList.getLength(); i++) {
                arrayList.add((Node) ((com.aspose.words.internal.zzZHH) nodeList.item(i)).get());
            }
            return new NodeList(arrayList);
        } catch (XPathExpressionException e) {
            com.aspose.words.internal.zzZHV.zzZ(e);
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.aspose.words.internal.zzZHH zzZ(Node node, Map<Node, com.aspose.words.internal.zzZHH> map) {
        if (node == null) {
            return null;
        }
        return map.containsKey(node) ? map.get(node) : new zzZ(node, map);
    }
}
