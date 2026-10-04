package com.aspose.words.internal;

import org.w3c.dom.Attr;
import org.w3c.dom.CDATASection;
import org.w3c.dom.Comment;
import org.w3c.dom.DOMConfiguration;
import org.w3c.dom.DOMException;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentFragment;
import org.w3c.dom.DocumentType;
import org.w3c.dom.Element;
import org.w3c.dom.EntityReference;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.ProcessingInstruction;
import org.w3c.dom.Text;
import org.w3c.dom.TypeInfo;
import org.w3c.dom.UserDataHandler;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZHH<T> implements Document, Element {
    @Override // org.w3c.dom.Document
    public Node adoptNode(Node node) throws DOMException {
        throw new UnsupportedOperationException();
    }

    @Override // org.w3c.dom.Node
    public Node appendChild(Node node) throws DOMException {
        throw new UnsupportedOperationException();
    }

    @Override // org.w3c.dom.Node
    public short compareDocumentPosition(Node node) throws DOMException {
        throw new UnsupportedOperationException();
    }

    @Override // org.w3c.dom.Document
    public Attr createAttribute(String str) throws DOMException {
        throw new UnsupportedOperationException();
    }

    @Override // org.w3c.dom.Document
    public Attr createAttributeNS(String str, String str2) throws DOMException {
        throw new UnsupportedOperationException();
    }

    @Override // org.w3c.dom.Document
    public CDATASection createCDATASection(String str) throws DOMException {
        throw new UnsupportedOperationException();
    }

    @Override // org.w3c.dom.Document
    public Comment createComment(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.w3c.dom.Document
    public DocumentFragment createDocumentFragment() {
        throw new UnsupportedOperationException();
    }

    @Override // org.w3c.dom.Document
    public Element createElement(String str) throws DOMException {
        throw new UnsupportedOperationException();
    }

    @Override // org.w3c.dom.Document
    public Element createElementNS(String str, String str2) throws DOMException {
        throw new UnsupportedOperationException();
    }

    @Override // org.w3c.dom.Document
    public EntityReference createEntityReference(String str) throws DOMException {
        throw new UnsupportedOperationException();
    }

    @Override // org.w3c.dom.Document
    public ProcessingInstruction createProcessingInstruction(String str, String str2) throws DOMException {
        throw new UnsupportedOperationException();
    }

    @Override // org.w3c.dom.Document
    public Text createTextNode(String str) {
        throw new UnsupportedOperationException();
    }

    public abstract T get();

    @Override // org.w3c.dom.Element
    public String getAttribute(String str) {
        return null;
    }

    @Override // org.w3c.dom.Element
    public String getAttributeNS(String str, String str2) throws DOMException {
        return null;
    }

    @Override // org.w3c.dom.Element
    public Attr getAttributeNode(String str) {
        return null;
    }

    @Override // org.w3c.dom.Element
    public Attr getAttributeNodeNS(String str, String str2) throws DOMException {
        return null;
    }

    @Override // org.w3c.dom.Node
    public NamedNodeMap getAttributes() {
        return null;
    }

    @Override // org.w3c.dom.Document
    public DocumentType getDoctype() {
        return null;
    }

    @Override // org.w3c.dom.Document
    public String getDocumentURI() {
        return null;
    }

    @Override // org.w3c.dom.Document
    public DOMConfiguration getDomConfig() {
        return null;
    }

    @Override // org.w3c.dom.Document
    public Element getElementById(String str) {
        return null;
    }

    @Override // org.w3c.dom.Document, org.w3c.dom.Element
    public NodeList getElementsByTagName(String str) {
        return null;
    }

    @Override // org.w3c.dom.Document, org.w3c.dom.Element
    public NodeList getElementsByTagNameNS(String str, String str2) {
        return null;
    }

    @Override // org.w3c.dom.Node
    public Object getFeature(String str, String str2) {
        return null;
    }

    @Override // org.w3c.dom.Document
    public DOMImplementation getImplementation() {
        return null;
    }

    @Override // org.w3c.dom.Document
    public String getInputEncoding() {
        return null;
    }

    @Override // org.w3c.dom.Node
    public String getNamespaceURI() {
        return null;
    }

    @Override // org.w3c.dom.Node
    public String getPrefix() {
        return null;
    }

    @Override // org.w3c.dom.Element
    public TypeInfo getSchemaTypeInfo() {
        return null;
    }

    @Override // org.w3c.dom.Document
    public boolean getStrictErrorChecking() {
        return false;
    }

    @Override // org.w3c.dom.Node
    public Object getUserData(String str) {
        return null;
    }

    @Override // org.w3c.dom.Document
    public String getXmlEncoding() {
        return null;
    }

    @Override // org.w3c.dom.Document
    public boolean getXmlStandalone() {
        return false;
    }

    @Override // org.w3c.dom.Document
    public String getXmlVersion() {
        return null;
    }

    @Override // org.w3c.dom.Element
    public boolean hasAttribute(String str) {
        return false;
    }

    @Override // org.w3c.dom.Element
    public boolean hasAttributeNS(String str, String str2) throws DOMException {
        return false;
    }

    @Override // org.w3c.dom.Node
    public boolean hasAttributes() {
        return false;
    }

    @Override // org.w3c.dom.Document
    public Node importNode(Node node, boolean z) throws DOMException {
        throw new UnsupportedOperationException();
    }

    @Override // org.w3c.dom.Node
    public Node insertBefore(Node node, Node node2) throws DOMException {
        throw new UnsupportedOperationException();
    }

    @Override // org.w3c.dom.Node
    public boolean isDefaultNamespace(String str) {
        return false;
    }

    @Override // org.w3c.dom.Node
    public boolean isSupported(String str, String str2) {
        return false;
    }

    @Override // org.w3c.dom.Node
    public String lookupNamespaceURI(String str) {
        return null;
    }

    @Override // org.w3c.dom.Node
    public String lookupPrefix(String str) {
        return null;
    }

    @Override // org.w3c.dom.Node
    public void normalize() {
        throw new UnsupportedOperationException();
    }

    @Override // org.w3c.dom.Document
    public void normalizeDocument() {
        throw new UnsupportedOperationException();
    }

    @Override // org.w3c.dom.Element
    public void removeAttribute(String str) throws DOMException {
        throw new UnsupportedOperationException();
    }

    @Override // org.w3c.dom.Element
    public void removeAttributeNS(String str, String str2) throws DOMException {
        throw new UnsupportedOperationException();
    }

    @Override // org.w3c.dom.Element
    public Attr removeAttributeNode(Attr attr) throws DOMException {
        throw new UnsupportedOperationException();
    }

    @Override // org.w3c.dom.Node
    public Node removeChild(Node node) throws DOMException {
        throw new UnsupportedOperationException();
    }

    @Override // org.w3c.dom.Document
    public Node renameNode(Node node, String str, String str2) throws DOMException {
        throw new UnsupportedOperationException();
    }

    @Override // org.w3c.dom.Node
    public Node replaceChild(Node node, Node node2) throws DOMException {
        throw new UnsupportedOperationException();
    }

    @Override // org.w3c.dom.Element
    public void setAttribute(String str, String str2) throws DOMException {
        throw new UnsupportedOperationException();
    }

    @Override // org.w3c.dom.Element
    public void setAttributeNS(String str, String str2, String str3) throws DOMException {
        throw new UnsupportedOperationException();
    }

    @Override // org.w3c.dom.Element
    public Attr setAttributeNode(Attr attr) throws DOMException {
        throw new UnsupportedOperationException();
    }

    @Override // org.w3c.dom.Element
    public Attr setAttributeNodeNS(Attr attr) throws DOMException {
        throw new UnsupportedOperationException();
    }

    @Override // org.w3c.dom.Document
    public void setDocumentURI(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.w3c.dom.Element
    public void setIdAttribute(String str, boolean z) throws DOMException {
        throw new UnsupportedOperationException();
    }

    @Override // org.w3c.dom.Element
    public void setIdAttributeNS(String str, String str2, boolean z) throws DOMException {
        throw new UnsupportedOperationException();
    }

    @Override // org.w3c.dom.Element
    public void setIdAttributeNode(Attr attr, boolean z) throws DOMException {
        throw new UnsupportedOperationException();
    }

    @Override // org.w3c.dom.Node
    public void setNodeValue(String str) throws DOMException {
        throw new UnsupportedOperationException();
    }

    @Override // org.w3c.dom.Node
    public void setPrefix(String str) throws DOMException {
        throw new UnsupportedOperationException();
    }

    @Override // org.w3c.dom.Document
    public void setStrictErrorChecking(boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // org.w3c.dom.Node
    public void setTextContent(String str) throws DOMException {
        throw new UnsupportedOperationException();
    }

    @Override // org.w3c.dom.Node
    public Object setUserData(String str, Object obj, UserDataHandler userDataHandler) {
        throw new UnsupportedOperationException();
    }

    @Override // org.w3c.dom.Document
    public void setXmlStandalone(boolean z) throws DOMException {
        throw new UnsupportedOperationException();
    }

    @Override // org.w3c.dom.Document
    public void setXmlVersion(String str) throws DOMException {
        throw new UnsupportedOperationException();
    }
}
