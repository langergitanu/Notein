package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.C3125bv;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p418tf.AbstractC10928kk;
import com.aspose.slides.internal.p418tf.InterfaceC10927k4;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p532yu.InterfaceC13298y4;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.InterfaceC14059g8;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.ga */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC13901ga implements IEnumerable, InterfaceC10927k4, InterfaceC14059g8 {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f46521k4 = new C7017h4("default", "preserve");
    public AbstractC13901ga parentNode;

    public AbstractC13901ga() {
    }

    public static boolean hasReadOnlyParent(AbstractC13901ga abstractC13901ga) {
        while (abstractC13901ga != null) {
            int nodeType = abstractC13901ga.getNodeType();
            if (nodeType == 2) {
                abstractC13901ga = ((C13940my) abstractC13901ga).m65623h4();
            } else {
                if (nodeType == 5 || nodeType == 6) {
                    return true;
                }
                abstractC13901ga = abstractC13901ga.getParentNode();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC13901ga m65351k4(AbstractC13901ga abstractC13901ga, AbstractC13901ga abstractC13901ga2) {
        if (abstractC13901ga == null) {
            return abstractC13901ga2;
        }
        if (abstractC13901ga.getNodeType() != 3) {
            if (abstractC13901ga2.getNodeType() != 3) {
                if (abstractC13901ga.getNodeType() != 14) {
                    if (abstractC13901ga2.getNodeType() != 14) {
                        if (abstractC13901ga.getNodeType() != 13) {
                            if (abstractC13901ga2.getNodeType() != 13) {
                                return null;
                            }
                        }
                    }
                }
            }
            return abstractC13901ga2;
        }
        return abstractC13901ga;
    }

    public static void nestTextNodes(AbstractC13901ga abstractC13901ga, AbstractC13901ga abstractC13901ga2) {
        abstractC13901ga2.parentNode = abstractC13901ga;
    }

    public static void splitName(String str, String[] strArr, String[] strArr2) {
        int iM67429to = C14113y2.m67429to(str, ':');
        if (-1 == iM67429to || iM67429to == 0 || str.length() - 1 == iM67429to) {
            strArr[0] = C14113y2.f47374k4;
            strArr2[0] = str;
        } else {
            strArr[0] = C14113y2.m67443x1(str, 0, iM67429to);
            strArr2[0] = C14113y2.m67422kk(str, iM67429to + 1);
        }
    }

    public static void unnestTextNodes(AbstractC13901ga abstractC13901ga, AbstractC13901ga abstractC13901ga2) {
        abstractC13901ga2.parentNode = abstractC13901ga.getParentNode();
    }

    public void afterEvent(C13979sz c13979sz) {
        if (c13979sz != null) {
            getOwnerDocument().afterEvent(c13979sz);
        }
    }

    public final boolean ancestorNode(AbstractC13901ga abstractC13901ga) {
        for (AbstractC13901ga parentNode = getParentNode(); parentNode != null && parentNode != this; parentNode = parentNode.getParentNode()) {
            if (parentNode == abstractC13901ga) {
                return true;
            }
        }
        return false;
    }

    public AbstractC13901ga appendChild(AbstractC13901ga abstractC13901ga) {
        XmlDocument ownerDocument = getOwnerDocument();
        if (ownerDocument == null) {
            ownerDocument = (XmlDocument) C7019kk.m27452k4((Object) this, XmlDocument.class);
        }
        if (!isContainer()) {
            throw new InvalidOperationException(C13968ri.m65818k4("The current node cannot contain other nodes."));
        }
        if (this == abstractC13901ga || ancestorNode(abstractC13901ga)) {
            throw new ArgumentException(C13968ri.m65818k4("Cannot insert a node or any ancestor of that node as a child of itself."));
        }
        if (abstractC13901ga.getParentNode() != null) {
            abstractC13901ga.getParentNode().removeChild(abstractC13901ga);
        }
        XmlDocument ownerDocument2 = abstractC13901ga.getOwnerDocument();
        if (ownerDocument2 != null && ownerDocument2 != ownerDocument && ownerDocument2 != this) {
            throw new ArgumentException(C13968ri.m65818k4("The node to be inserted is from a different document context."));
        }
        if (abstractC13901ga.getNodeType() == 11) {
            AbstractC13901ga firstChild = abstractC13901ga.getFirstChild();
            AbstractC13901ga abstractC13901ga2 = firstChild;
            while (abstractC13901ga2 != null) {
                AbstractC13901ga nextSibling = abstractC13901ga2.getNextSibling();
                abstractC13901ga.removeChild(abstractC13901ga2);
                appendChild(abstractC13901ga2);
                abstractC13901ga2 = nextSibling;
            }
            return firstChild;
        }
        if (!C7019kk.m27469x1(abstractC13901ga, AbstractC14007wt.class) || !isValidChildType(abstractC13901ga.getNodeType())) {
            throw new InvalidOperationException(C13968ri.m65818k4("The specified node cannot be inserted as the valid child of this node, because the specified node is the wrong type."));
        }
        if (!canInsertAfter(abstractC13901ga, getLastChild())) {
            throw new InvalidOperationException(C13968ri.m65818k4("Cannot insert the node in the specified location."));
        }
        String value = abstractC13901ga.getValue();
        C13979sz eventArgs = getEventArgs(abstractC13901ga, abstractC13901ga.getParentNode(), this, value, value, 0);
        if (eventArgs != null) {
            beforeEvent(eventArgs);
        }
        AbstractC14007wt lastNode = getLastNode();
        AbstractC14007wt abstractC14007wt = (AbstractC14007wt) abstractC13901ga;
        if (lastNode == null) {
            abstractC14007wt.f47053x1 = abstractC14007wt;
            setLastNode(abstractC14007wt);
            abstractC14007wt.setParent(this);
        } else {
            abstractC14007wt.f47053x1 = lastNode.f47053x1;
            lastNode.f47053x1 = abstractC14007wt;
            setLastNode(abstractC14007wt);
            abstractC14007wt.setParent(this);
            if (lastNode.isText() && abstractC14007wt.isText()) {
                nestTextNodes(lastNode, abstractC14007wt);
            }
        }
        if (eventArgs != null) {
            afterEvent(eventArgs);
        }
        return abstractC14007wt;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC13901ga appendChildForLoad(AbstractC13901ga abstractC13901ga, XmlDocument xmlDocument) {
        C13979sz insertEventArgsForLoad = xmlDocument.getInsertEventArgsForLoad(abstractC13901ga, this);
        if (insertEventArgsForLoad != null) {
            xmlDocument.beforeEvent(insertEventArgsForLoad);
        }
        AbstractC14007wt lastNode = getLastNode();
        AbstractC14007wt abstractC14007wt = (AbstractC14007wt) abstractC13901ga;
        if (lastNode != null) {
            abstractC14007wt.f47053x1 = lastNode.f47053x1;
            lastNode.f47053x1 = abstractC14007wt;
            setLastNode(abstractC14007wt);
            if (lastNode.isText() && abstractC14007wt.isText()) {
                nestTextNodes(lastNode, abstractC14007wt);
            }
            if (insertEventArgsForLoad != null) {
                xmlDocument.afterEvent(insertEventArgsForLoad);
            }
            return abstractC14007wt;
        }
        abstractC14007wt.f47053x1 = abstractC14007wt;
        setLastNode(abstractC14007wt);
        abstractC14007wt.setParentForLoad(this);
        if (insertEventArgsForLoad != null) {
        }
        return abstractC14007wt;
    }

    public void beforeEvent(C13979sz c13979sz) {
        if (c13979sz != null) {
            getOwnerDocument().beforeEvent(c13979sz);
        }
    }

    public boolean canInsertAfter(AbstractC13901ga abstractC13901ga, AbstractC13901ga abstractC13901ga2) {
        return true;
    }

    public boolean canInsertBefore(AbstractC13901ga abstractC13901ga, AbstractC13901ga abstractC13901ga2) {
        return true;
    }

    public abstract AbstractC13901ga cloneNode(boolean z);

    public void copyChildren(XmlDocument xmlDocument, AbstractC13901ga abstractC13901ga, boolean z) {
        for (AbstractC13901ga firstChild = abstractC13901ga.getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            appendChildForLoad(firstChild.cloneNode(z), xmlDocument);
        }
    }

    public AbstractC10925du createNavigator() {
        XmlDocument xmlDocument = (XmlDocument) C7019kk.m27452k4((Object) this, XmlDocument.class);
        return xmlDocument != null ? xmlDocument.createNavigator(this) : getOwnerDocument().createNavigator(this);
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14059g8
    public AbstractC13901ga deepClone() {
        return cloneNode(true);
    }

    public AbstractC13901ga findChild(int i) {
        for (AbstractC13901ga firstChild = getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            if (firstChild.getNodeType() == i) {
                return firstChild;
            }
        }
        return null;
    }

    public C13857b1 getAttributes() {
        return null;
    }

    public String getBaseURI() {
        for (AbstractC13901ga parentNode = getParentNode(); parentNode != null; parentNode = parentNode.getParentNode()) {
            int nodeType = parentNode.getNodeType();
            if (nodeType == 5) {
                return ((C13947nk) parentNode).m65703x1();
            }
            if (nodeType == 9 || nodeType == 6 || nodeType == 2) {
                return parentNode.getBaseURI();
            }
        }
        return C14113y2.f47374k4;
    }

    public AbstractC13911hq getChildNodes() {
        return new C13961qn(this);
    }

    public final XmlDocument getDocument() {
        return getNodeType() == 9 ? (XmlDocument) this : getOwnerDocument();
    }

    public C13979sz getEventArgs(AbstractC13901ga abstractC13901ga, AbstractC13901ga abstractC13901ga2, AbstractC13901ga abstractC13901ga3, String str, String str2, int i) {
        XmlDocument ownerDocument = getOwnerDocument();
        if (ownerDocument == null) {
            return null;
        }
        if (ownerDocument.isLoading() || ((abstractC13901ga3 == null || !abstractC13901ga3.isReadOnly()) && (abstractC13901ga2 == null || !abstractC13901ga2.isReadOnly()))) {
            return ownerDocument.getEventArgs(abstractC13901ga, abstractC13901ga2, abstractC13901ga3, str, str2, i);
        }
        throw new InvalidOperationException(C13968ri.m65818k4("This node is read-only. It cannot be modified."));
    }

    public AbstractC13901ga getFirstChild() {
        AbstractC14007wt lastNode = getLastNode();
        if (lastNode != null) {
            return lastNode.f47053x1;
        }
        return null;
    }

    public String getInnerText() {
        int nodeType;
        AbstractC13901ga firstChild = getFirstChild();
        if (firstChild == null) {
            return C14113y2.f47374k4;
        }
        if (firstChild.getNextSibling() == null && ((nodeType = firstChild.getNodeType()) == 3 || nodeType == 4 || nodeType == 13 || nodeType == 14)) {
            return firstChild.getValue();
        }
        C6765kp c6765kp = new C6765kp();
        m65352k4(c6765kp);
        return c6765kp.toString();
    }

    public String getInnerXml() {
        C3125bv c3125bv = new C3125bv(C11697x1.m55250kk());
        C14012x3 c14012x3 = new C14012x3(c3125bv);
        try {
            writeContentTo(c14012x3);
            c14012x3.mo21893du();
            return c3125bv.toString();
        } catch (Throwable th) {
            c14012x3.mo21893du();
            throw th;
        }
    }

    public AbstractC13901ga getLastChild() {
        return getLastNode();
    }

    public AbstractC14007wt getLastNode() {
        return null;
    }

    public abstract String getLocalName();

    public abstract String getName();

    public String getNamespaceOfPrefix(String str) {
        String namespaceOfPrefixStrict = getNamespaceOfPrefixStrict(str);
        return namespaceOfPrefixStrict != null ? namespaceOfPrefixStrict : C14113y2.f47374k4;
    }

    public final String getNamespaceOfPrefixStrict(String str) {
        String strMo65268x1;
        XmlDocument document = getDocument();
        if (document == null || (strMo65268x1 = document.getNameTable().mo65268x1(str)) == null) {
            return null;
        }
        AbstractC13901ga parentNode = this;
        while (parentNode != null) {
            if (parentNode.getNodeType() == 1) {
                C13981tl c13981tl = (C13981tl) parentNode;
                if (c13981tl.m65904jd()) {
                    C13857b1 attributes = c13981tl.getAttributes();
                    int i = 0;
                    if (strMo65268x1.length() == 0) {
                        while (i < attributes.m65634x1()) {
                            C13940my c13940myM65164k4 = attributes.m65164k4(i);
                            if (c13940myM65164k4.getPrefix().length() == 0 && C13851ai.m65152k4(c13940myM65164k4.getLocalName(), document.strXmlns)) {
                                return c13940myM65164k4.getValue();
                            }
                            i++;
                        }
                    } else {
                        while (i < attributes.m65634x1()) {
                            C13940my c13940myM65164k42 = attributes.m65164k4(i);
                            if (C13851ai.m65152k4(c13940myM65164k42.getPrefix(), document.strXmlns)) {
                                if (C13851ai.m65152k4(c13940myM65164k42.getLocalName(), strMo65268x1)) {
                                    return c13940myM65164k42.getValue();
                                }
                            } else if (C13851ai.m65152k4(c13940myM65164k42.getPrefix(), strMo65268x1)) {
                                return c13940myM65164k42.getNamespaceURI();
                            }
                            i++;
                        }
                    }
                }
                if (C13851ai.m65152k4(parentNode.getPrefix(), strMo65268x1)) {
                    return parentNode.getNamespaceURI();
                }
            } else if (parentNode.getNodeType() == 2) {
                parentNode = ((C13940my) parentNode).m65623h4();
            }
            parentNode = parentNode.getParentNode();
        }
        if (C13851ai.m65152k4(document.strXml, strMo65268x1)) {
            return document.strReservedXml;
        }
        if (C13851ai.m65152k4(document.strXmlns, strMo65268x1)) {
            return document.strReservedXmlns;
        }
        return null;
    }

    public String getNamespaceURI() {
        return C14113y2.f47374k4;
    }

    public AbstractC13901ga getNextSibling() {
        return null;
    }

    public abstract int getNodeType();

    public String getOuterXml() {
        C3125bv c3125bv = new C3125bv(C11697x1.m55250kk());
        C14012x3 c14012x3 = new C14012x3(c3125bv);
        try {
            writeTo(c14012x3);
            c14012x3.mo21893du();
            return c3125bv.toString();
        } catch (Throwable th) {
            c14012x3.mo21893du();
            throw th;
        }
    }

    public XmlDocument getOwnerDocument() {
        return this.parentNode.getNodeType() == 9 ? (XmlDocument) this.parentNode : this.parentNode.getOwnerDocument();
    }

    public AbstractC13901ga getParentNode() {
        if (this.parentNode.getNodeType() != 9) {
            return this.parentNode;
        }
        AbstractC14007wt abstractC14007wt = (AbstractC14007wt) C7019kk.m27452k4((Object) this.parentNode.getFirstChild(), AbstractC14007wt.class);
        if (abstractC14007wt == null) {
            return null;
        }
        AbstractC14007wt abstractC14007wt2 = abstractC14007wt;
        while (abstractC14007wt2 != this) {
            abstractC14007wt2 = abstractC14007wt2.f47053x1;
            if (abstractC14007wt2 == null || abstractC14007wt2 == abstractC14007wt) {
                return null;
            }
        }
        return this.parentNode;
    }

    public String getPrefix() {
        return C14113y2.f47374k4;
    }

    public String getPrefixOfNamespace(String str) {
        String prefixOfNamespaceStrict = getPrefixOfNamespaceStrict(str);
        return prefixOfNamespaceStrict != null ? prefixOfNamespaceStrict : C14113y2.f47374k4;
    }

    public final String getPrefixOfNamespaceStrict(String str) {
        XmlDocument document = getDocument();
        if (document == null) {
            return null;
        }
        String strMo65266k4 = document.getNameTable().mo65266k4(str);
        AbstractC13901ga parentNode = this;
        while (parentNode != null) {
            if (parentNode.getNodeType() == 1) {
                C13981tl c13981tl = (C13981tl) parentNode;
                if (c13981tl.m65904jd()) {
                    C13857b1 attributes = c13981tl.getAttributes();
                    for (int i = 0; i < attributes.m65634x1(); i++) {
                        C13940my c13940myM65164k4 = attributes.m65164k4(i);
                        if (c13940myM65164k4.getPrefix().length() == 0) {
                            if (C13851ai.m65152k4(c13940myM65164k4.getLocalName(), document.strXmlns) && C14113y2.m67363du(c13940myM65164k4.getValue(), strMo65266k4)) {
                                return C14113y2.f47374k4;
                            }
                        } else if (C13851ai.m65152k4(c13940myM65164k4.getPrefix(), document.strXmlns)) {
                            if (C14113y2.m67363du(c13940myM65164k4.getValue(), strMo65266k4)) {
                                return c13940myM65164k4.getLocalName();
                            }
                        } else if (C13851ai.m65152k4(c13940myM65164k4.getNamespaceURI(), strMo65266k4)) {
                            return c13940myM65164k4.getPrefix();
                        }
                    }
                }
                if (C13851ai.m65152k4(parentNode.getNamespaceURI(), strMo65266k4)) {
                    return parentNode.getPrefix();
                }
            } else if (parentNode.getNodeType() == 2) {
                parentNode = ((C13940my) parentNode).m65623h4();
            }
            parentNode = parentNode.getParentNode();
        }
        if (C13851ai.m65152k4(document.strReservedXml, strMo65266k4)) {
            return document.strXml;
        }
        if (C13851ai.m65152k4(document.strReservedXmlns, strMo65266k4)) {
            return document.strXmlns;
        }
        return null;
    }

    public AbstractC13901ga getPreviousSibling() {
        return null;
    }

    public AbstractC13901ga getPreviousText() {
        return null;
    }

    public InterfaceC13298y4 getSchemaInfo() {
        return XmlDocument.NotKnownSchemaInfo;
    }

    public String getValue() {
        return null;
    }

    public String getXPAttribute(String str, String str2) {
        return C14113y2.f47374k4;
    }

    public String getXPLocalName() {
        return C14113y2.f47374k4;
    }

    public int getXPNodeType() {
        return -1;
    }

    public String getXmlLang() {
        AbstractC13901ga parentNode = this;
        do {
            C13981tl c13981tl = (C13981tl) C7019kk.m27452k4((Object) parentNode, C13981tl.class);
            if (c13981tl != null && c13981tl.m65913to("xml:lang")) {
                return c13981tl.m65906k4("xml:lang");
            }
            parentNode = parentNode.getParentNode();
        } while (parentNode != null);
        return C14113y2.f47374k4;
    }

    public int getXmlSpace() {
        AbstractC13901ga parentNode = this;
        do {
            C13981tl c13981tl = (C13981tl) C7019kk.m27452k4((Object) parentNode, C13981tl.class);
            if (c13981tl != null && c13981tl.m65913to("xml:space")) {
                int iM27428k4 = f46521k4.m27428k4(C13850af.m65066ar(c13981tl.m65906k4("xml:space")));
                if (iM27428k4 == 0) {
                    return 1;
                }
                if (iM27428k4 == 1) {
                    return 2;
                }
            }
            parentNode = parentNode.getParentNode();
        } while (parentNode != null);
        return 0;
    }

    public C13981tl get_Item(String str) {
        for (AbstractC13901ga firstChild = getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            if (firstChild.getNodeType() == 1 && C14113y2.m67363du(firstChild.getName(), str)) {
                return (C13981tl) firstChild;
            }
        }
        return null;
    }

    public boolean hasChildNodes() {
        return getLastNode() != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC13901ga insertAfter(AbstractC13901ga abstractC13901ga, AbstractC13901ga abstractC13901ga2) {
        if (this == abstractC13901ga || ancestorNode(abstractC13901ga)) {
            throw new ArgumentException(C13968ri.m65818k4("Cannot insert a node or any ancestor of that node as a child of itself."));
        }
        if (abstractC13901ga2 == null) {
            return prependChild(abstractC13901ga);
        }
        if (!isContainer()) {
            throw new InvalidOperationException(C13968ri.m65818k4("The current node cannot contain other nodes."));
        }
        if (abstractC13901ga2.getParentNode() != this) {
            throw new ArgumentException(C13968ri.m65818k4("The reference node is not a child of this node."));
        }
        if (abstractC13901ga == abstractC13901ga2) {
            return abstractC13901ga;
        }
        XmlDocument ownerDocument = abstractC13901ga.getOwnerDocument();
        XmlDocument ownerDocument2 = getOwnerDocument();
        if (ownerDocument != null && ownerDocument != ownerDocument2 && ownerDocument != this) {
            throw new ArgumentException(C13968ri.m65818k4("The node to be inserted is from a different document context."));
        }
        if (!canInsertAfter(abstractC13901ga, abstractC13901ga2)) {
            throw new InvalidOperationException(C13968ri.m65818k4("Cannot insert the node in the specified location."));
        }
        if (abstractC13901ga.getParentNode() != null) {
            abstractC13901ga.getParentNode().removeChild(abstractC13901ga);
        }
        if (abstractC13901ga.getNodeType() == 11) {
            AbstractC13901ga firstChild = abstractC13901ga.getFirstChild();
            AbstractC13901ga abstractC13901ga3 = abstractC13901ga2;
            AbstractC13901ga abstractC13901ga4 = firstChild;
            while (abstractC13901ga4 != null) {
                AbstractC13901ga nextSibling = abstractC13901ga4.getNextSibling();
                abstractC13901ga.removeChild(abstractC13901ga4);
                insertAfter(abstractC13901ga4, abstractC13901ga3);
                abstractC13901ga3 = abstractC13901ga4;
                abstractC13901ga4 = nextSibling;
            }
            return firstChild;
        }
        if (!C7019kk.m27469x1(abstractC13901ga, AbstractC14007wt.class) || !isValidChildType(abstractC13901ga.getNodeType())) {
            throw new InvalidOperationException(C13968ri.m65818k4("The specified node cannot be inserted as the valid child of this node, because the specified node is the wrong type."));
        }
        AbstractC14007wt abstractC14007wt = (AbstractC14007wt) abstractC13901ga;
        AbstractC14007wt abstractC14007wt2 = (AbstractC14007wt) abstractC13901ga2;
        String value = abstractC13901ga.getValue();
        C13979sz eventArgs = getEventArgs(abstractC13901ga, abstractC13901ga.getParentNode(), this, value, value, 0);
        if (eventArgs != null) {
            beforeEvent(eventArgs);
        }
        if (abstractC14007wt2 == getLastNode()) {
            abstractC14007wt.f47053x1 = abstractC14007wt2.f47053x1;
            abstractC14007wt2.f47053x1 = abstractC14007wt;
            setLastNode(abstractC14007wt);
            abstractC14007wt.setParent(this);
            if (abstractC14007wt2.isText() && abstractC14007wt.isText()) {
                nestTextNodes(abstractC14007wt2, abstractC14007wt);
            }
        } else {
            AbstractC14007wt abstractC14007wt3 = abstractC14007wt2.f47053x1;
            abstractC14007wt.f47053x1 = abstractC14007wt3;
            abstractC14007wt2.f47053x1 = abstractC14007wt;
            abstractC14007wt.setParent(this);
            if (abstractC14007wt2.isText()) {
                if (abstractC14007wt.isText()) {
                    nestTextNodes(abstractC14007wt2, abstractC14007wt);
                    if (abstractC14007wt3.isText()) {
                        nestTextNodes(abstractC14007wt, abstractC14007wt3);
                    }
                } else if (abstractC14007wt3.isText()) {
                    unnestTextNodes(abstractC14007wt2, abstractC14007wt3);
                }
            } else if (abstractC14007wt.isText() && abstractC14007wt3.isText()) {
            }
        }
        if (eventArgs != null) {
            afterEvent(eventArgs);
        }
        return abstractC14007wt;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC13901ga insertBefore(AbstractC13901ga abstractC13901ga, AbstractC13901ga abstractC13901ga2) {
        if (this == abstractC13901ga || ancestorNode(abstractC13901ga)) {
            throw new ArgumentException(C13968ri.m65818k4("Cannot insert a node or any ancestor of that node as a child of itself."));
        }
        if (abstractC13901ga2 == null) {
            return appendChild(abstractC13901ga);
        }
        if (!isContainer()) {
            throw new InvalidOperationException(C13968ri.m65818k4("The current node cannot contain other nodes."));
        }
        if (abstractC13901ga2.getParentNode() != this) {
            throw new ArgumentException(C13968ri.m65818k4("The reference node is not a child of this node."));
        }
        if (abstractC13901ga == abstractC13901ga2) {
            return abstractC13901ga;
        }
        XmlDocument ownerDocument = abstractC13901ga.getOwnerDocument();
        XmlDocument ownerDocument2 = getOwnerDocument();
        if (ownerDocument != null && ownerDocument != ownerDocument2 && ownerDocument != this) {
            throw new ArgumentException(C13968ri.m65818k4("The node to be inserted is from a different document context."));
        }
        if (!canInsertBefore(abstractC13901ga, abstractC13901ga2)) {
            throw new InvalidOperationException(C13968ri.m65818k4("Cannot insert the node in the specified location."));
        }
        if (abstractC13901ga.getParentNode() != null) {
            abstractC13901ga.getParentNode().removeChild(abstractC13901ga);
        }
        if (abstractC13901ga.getNodeType() == 11) {
            AbstractC13901ga firstChild = abstractC13901ga.getFirstChild();
            if (firstChild != null) {
                abstractC13901ga.removeChild(firstChild);
                insertBefore(firstChild, abstractC13901ga2);
                insertAfter(abstractC13901ga, firstChild);
            }
            return firstChild;
        }
        if (!C7019kk.m27469x1(abstractC13901ga, AbstractC14007wt.class) || !isValidChildType(abstractC13901ga.getNodeType())) {
            throw new InvalidOperationException(C13968ri.m65818k4("The specified node cannot be inserted as the valid child of this node, because the specified node is the wrong type."));
        }
        AbstractC14007wt abstractC14007wt = (AbstractC14007wt) abstractC13901ga;
        AbstractC14007wt abstractC14007wt2 = (AbstractC14007wt) abstractC13901ga2;
        String value = abstractC13901ga.getValue();
        C13979sz eventArgs = getEventArgs(abstractC13901ga, abstractC13901ga.getParentNode(), this, value, value, 0);
        if (eventArgs != null) {
            beforeEvent(eventArgs);
        }
        if (abstractC14007wt2 == getFirstChild()) {
            abstractC14007wt.f47053x1 = abstractC14007wt2;
            getLastNode().f47053x1 = abstractC14007wt;
            abstractC14007wt.setParent(this);
            if (abstractC14007wt.isText() && abstractC14007wt2.isText()) {
                nestTextNodes(abstractC14007wt, abstractC14007wt2);
            }
        } else {
            AbstractC14007wt abstractC14007wt3 = (AbstractC14007wt) abstractC14007wt2.getPreviousSibling();
            abstractC14007wt.f47053x1 = abstractC14007wt2;
            abstractC14007wt3.f47053x1 = abstractC14007wt;
            abstractC14007wt.setParent(this);
            if (abstractC14007wt3.isText()) {
                if (abstractC14007wt.isText()) {
                    nestTextNodes(abstractC14007wt3, abstractC14007wt);
                    if (abstractC14007wt2.isText()) {
                    }
                } else if (abstractC14007wt2.isText()) {
                    unnestTextNodes(abstractC14007wt3, abstractC14007wt2);
                }
            } else if (abstractC14007wt.isText() && abstractC14007wt2.isText()) {
            }
        }
        if (eventArgs != null) {
            afterEvent(eventArgs);
        }
        return abstractC14007wt;
    }

    public final boolean isConnected() {
        AbstractC13901ga parentNode = getParentNode();
        while (parentNode != null && parentNode.getNodeType() != 9) {
            parentNode = parentNode.getParentNode();
        }
        return parentNode != null;
    }

    public boolean isContainer() {
        return false;
    }

    public boolean isReadOnly() {
        getOwnerDocument();
        return hasReadOnlyParent(this);
    }

    public boolean isText() {
        return false;
    }

    public boolean isValidChildType(int i) {
        return false;
    }

    @Override // java.lang.Iterable
    public final IEnumerator iterator() {
        return new C14002vt(this);
    }

    public final IEnumerator iterator_Rename_Namesake() {
        return new C14002vt(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void normalize() {
        C6765kp c6765kp = new C6765kp();
        AbstractC13901ga firstChild = getFirstChild();
        AbstractC13901ga abstractC13901ga = null;
        while (firstChild != null) {
            AbstractC13901ga nextSibling = firstChild.getNextSibling();
            int nodeType = firstChild.getNodeType();
            if (nodeType == 1) {
                firstChild.normalize();
                if (abstractC13901ga != null) {
                }
            } else if (nodeType == 3 || nodeType == 13 || nodeType == 14) {
                c6765kp.m26792k4(firstChild.getValue());
                if (m65351k4(abstractC13901ga, firstChild) == abstractC13901ga) {
                    removeChild(firstChild);
                    firstChild = nextSibling;
                } else {
                    if (abstractC13901ga != null) {
                        removeChild(abstractC13901ga);
                    }
                    abstractC13901ga = firstChild;
                    firstChild = nextSibling;
                }
            } else if (abstractC13901ga != null) {
                abstractC13901ga.setValue(c6765kp.toString());
                firstChild = null;
            } else {
                firstChild = abstractC13901ga;
            }
            c6765kp.m26809x1(0, c6765kp.m26807x1());
            abstractC13901ga = firstChild;
            firstChild = nextSibling;
        }
        if (abstractC13901ga == null || c6765kp.m26807x1() <= 0) {
            return;
        }
        abstractC13901ga.setValue(c6765kp.toString());
    }

    public AbstractC13901ga prependChild(AbstractC13901ga abstractC13901ga) {
        return insertBefore(abstractC13901ga, getFirstChild());
    }

    public void removeAll() {
        AbstractC13901ga firstChild = getFirstChild();
        while (firstChild != null) {
            AbstractC13901ga nextSibling = firstChild.getNextSibling();
            removeChild(firstChild);
            firstChild = nextSibling;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0045 A[PHI: r3 r4
      0x0045: PHI (r3v7 com.aspose.slides.ms.System.Xml.wt) = (r3v3 com.aspose.slides.ms.System.Xml.wt), (r3v1 com.aspose.slides.ms.System.Xml.wt) binds: [B:28:0x0077, B:17:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x0045: PHI (r4v5 com.aspose.slides.ms.System.Xml.wt) = (r4v2 com.aspose.slides.ms.System.Xml.wt), (r4v6 com.aspose.slides.ms.System.Xml.wt) binds: [B:28:0x0077, B:17:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC13901ga removeChild(AbstractC13901ga abstractC13901ga) {
        AbstractC14007wt abstractC14007wt;
        if (!isContainer()) {
            throw new InvalidOperationException(C13968ri.m65818k4("The current node cannot contain other nodes, so the node to be removed is not its child."));
        }
        if (abstractC13901ga.getParentNode() != this) {
            throw new ArgumentException(C13968ri.m65818k4("The node to be removed is not a child of this node."));
        }
        AbstractC14007wt abstractC14007wt2 = (AbstractC14007wt) abstractC13901ga;
        String value = abstractC14007wt2.getValue();
        C13979sz eventArgs = getEventArgs(abstractC14007wt2, this, null, value, value, 1);
        if (eventArgs != null) {
            beforeEvent(eventArgs);
        }
        AbstractC14007wt lastNode = getLastNode();
        if (abstractC14007wt2 == getFirstChild()) {
            if (abstractC14007wt2 == lastNode) {
                setLastNode(null);
            } else {
                abstractC14007wt = abstractC14007wt2.f47053x1;
                if (abstractC14007wt.isText() && abstractC14007wt2.isText()) {
                    unnestTextNodes(abstractC14007wt2, abstractC14007wt);
                }
                lastNode.f47053x1 = abstractC14007wt;
            }
        } else if (abstractC14007wt2 == lastNode) {
            AbstractC14007wt abstractC14007wt3 = (AbstractC14007wt) abstractC14007wt2.getPreviousSibling();
            abstractC14007wt3.f47053x1 = abstractC14007wt2.f47053x1;
            setLastNode(abstractC14007wt3);
        } else {
            lastNode = (AbstractC14007wt) abstractC14007wt2.getPreviousSibling();
            abstractC14007wt = abstractC14007wt2.f47053x1;
            if (abstractC14007wt.isText()) {
                if (lastNode.isText()) {
                    nestTextNodes(lastNode, abstractC14007wt);
                } else if (abstractC14007wt2.isText()) {
                }
            }
            lastNode.f47053x1 = abstractC14007wt;
        }
        abstractC14007wt2.f47053x1 = null;
        abstractC14007wt2.setParent(null);
        if (eventArgs != null) {
            afterEvent(eventArgs);
        }
        return abstractC13901ga;
    }

    public AbstractC13901ga replaceChild(AbstractC13901ga abstractC13901ga, AbstractC13901ga abstractC13901ga2) {
        AbstractC13901ga nextSibling = abstractC13901ga2.getNextSibling();
        removeChild(abstractC13901ga2);
        insertBefore(abstractC13901ga, nextSibling);
        return abstractC13901ga2;
    }

    public final AbstractC13911hq selectNodes(String str) {
        AbstractC10925du abstractC10925duCreateNavigator = createNavigator();
        if (abstractC10925duCreateNavigator == null) {
            return null;
        }
        return new C14026yg(abstractC10925duCreateNavigator.m52689h4(str));
    }

    public final AbstractC13901ga selectSingleNode(String str) {
        AbstractC13911hq abstractC13911hqSelectNodes = selectNodes(str);
        if (abstractC13911hqSelectNodes != null) {
            return abstractC13911hqSelectNodes.m65457kk(0);
        }
        return null;
    }

    public void setInnerText(String str) {
        AbstractC13901ga firstChild = getFirstChild();
        if (firstChild != null && firstChild.getNextSibling() == null && firstChild.getNodeType() == 3) {
            firstChild.setValue(str);
        } else {
            removeAll();
            appendChild(getOwnerDocument().createTextNode(str));
        }
    }

    public void setInnerXml(String str) {
        throw new InvalidOperationException(C13968ri.m65818k4("Cannot set the 'InnerXml' for the current node because it is either read-only or cannot have children."));
    }

    public void setLastNode(AbstractC14007wt abstractC14007wt) {
    }

    public void setParent(AbstractC13901ga abstractC13901ga) {
        if (abstractC13901ga == null) {
            this.parentNode = getOwnerDocument();
        } else {
            this.parentNode = abstractC13901ga;
        }
    }

    public void setParentForLoad(AbstractC13901ga abstractC13901ga) {
        this.parentNode = abstractC13901ga;
    }

    public void setPrefix(String str) {
    }

    public void setValue(String str) {
        throw new InvalidOperationException(C14113y2.m67391k4(C11697x1.m55250kk(), C13968ri.m65818k4("Cannot set a value on node type '{0}'."), C14042ak.m66410k4(C13929li.class, getNodeType())));
    }

    public boolean supports(String str, String str2) {
        if (C14113y2.m67360du("XML", str, (short) 5) == 0) {
            return str2 == null || "1.0".equals(str2) || "2.0".equals(str2);
        }
        return false;
    }

    public abstract void writeContentTo(AbstractC13958qb abstractC13958qb);

    public abstract void writeTo(AbstractC13958qb abstractC13958qb);

    public AbstractC13901ga(XmlDocument xmlDocument) {
        if (xmlDocument == null) {
            throw new ArgumentException(C13968ri.m65818k4("Cannot create a node without an owner document."));
        }
        this.parentNode = xmlDocument;
    }

    /* JADX INFO: renamed from: k4 */
    private void m65352k4(C6765kp c6765kp) {
        for (AbstractC13901ga firstChild = getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            if (firstChild.getFirstChild() != null) {
                firstChild.m65352k4(c6765kp);
            } else if (firstChild.getNodeType() == 3 || firstChild.getNodeType() == 4 || firstChild.getNodeType() == 13 || firstChild.getNodeType() == 14) {
                c6765kp.m26792k4(firstChild.getInnerText());
            }
        }
    }

    public C13981tl get_Item(String str, String str2) {
        for (AbstractC13901ga firstChild = getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            if (firstChild.getNodeType() == 1 && C14113y2.m67363du(firstChild.getLocalName(), str) && C14113y2.m67363du(firstChild.getNamespaceURI(), str2)) {
                return (C13981tl) firstChild;
            }
        }
        return null;
    }

    public final AbstractC13911hq selectNodes(String str, C13950o3 c13950o3) {
        AbstractC10925du abstractC10925duCreateNavigator = createNavigator();
        if (abstractC10925duCreateNavigator == null) {
            return null;
        }
        AbstractC10928kk abstractC10928kkM52688du = abstractC10925duCreateNavigator.m52688du(str);
        abstractC10928kkM52688du.mo23219k4(c13950o3);
        return new C14026yg(abstractC10925duCreateNavigator.m52691k4(abstractC10928kkM52688du));
    }

    public final AbstractC13901ga selectSingleNode(String str, C13950o3 c13950o3) {
        AbstractC10925du abstractC10925duCreateNavigator = createNavigator();
        if (abstractC10925duCreateNavigator == null) {
            return null;
        }
        AbstractC10928kk abstractC10928kkM52688du = abstractC10925duCreateNavigator.m52688du(str);
        abstractC10928kkM52688du.mo23219k4(c13950o3);
        return new C14026yg(abstractC10925duCreateNavigator.m52691k4(abstractC10928kkM52688du)).m65457kk(0);
    }
}
