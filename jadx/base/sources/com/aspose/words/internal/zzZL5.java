package com.aspose.words.internal;

import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.UserDataHandler;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZL5 implements Node {
    private String zzAn;
    private String zzZPP;
    private String zzZPQ;

    public zzZL5() {
        this.zzZPQ = "yes";
    }

    @Override // org.w3c.dom.Node
    public final Node appendChild(Node node) throws DOMException {
        return null;
    }

    @Override // org.w3c.dom.Node
    public final Node cloneNode(boolean z) {
        return null;
    }

    @Override // org.w3c.dom.Node
    public final short compareDocumentPosition(Node node) throws DOMException {
        return (short) 0;
    }

    @Override // org.w3c.dom.Node
    public final NamedNodeMap getAttributes() {
        return null;
    }

    @Override // org.w3c.dom.Node
    public final String getBaseURI() {
        return null;
    }

    @Override // org.w3c.dom.Node
    public final NodeList getChildNodes() {
        return null;
    }

    public final String getEncoding() {
        return this.zzZPP;
    }

    @Override // org.w3c.dom.Node
    public final Object getFeature(String str, String str2) {
        return null;
    }

    @Override // org.w3c.dom.Node
    public final Node getFirstChild() {
        return null;
    }

    @Override // org.w3c.dom.Node
    public final Node getLastChild() {
        return null;
    }

    @Override // org.w3c.dom.Node
    public final String getLocalName() {
        return null;
    }

    @Override // org.w3c.dom.Node
    public final String getNamespaceURI() {
        return null;
    }

    @Override // org.w3c.dom.Node
    public final Node getNextSibling() {
        return null;
    }

    @Override // org.w3c.dom.Node
    public final String getNodeName() {
        return null;
    }

    @Override // org.w3c.dom.Node
    public final short getNodeType() {
        return (short) 0;
    }

    @Override // org.w3c.dom.Node
    public final String getNodeValue() throws DOMException {
        return null;
    }

    @Override // org.w3c.dom.Node
    public final Document getOwnerDocument() {
        return null;
    }

    @Override // org.w3c.dom.Node
    public final Node getParentNode() {
        return null;
    }

    @Override // org.w3c.dom.Node
    public final String getPrefix() {
        return null;
    }

    @Override // org.w3c.dom.Node
    public final Node getPreviousSibling() {
        return null;
    }

    @Override // org.w3c.dom.Node
    public final String getTextContent() throws DOMException {
        return null;
    }

    @Override // org.w3c.dom.Node
    public final Object getUserData(String str) {
        return null;
    }

    public final String getVersion() {
        return this.zzAn;
    }

    @Override // org.w3c.dom.Node
    public final boolean hasAttributes() {
        return false;
    }

    @Override // org.w3c.dom.Node
    public final boolean hasChildNodes() {
        return false;
    }

    @Override // org.w3c.dom.Node
    public final Node insertBefore(Node node, Node node2) throws DOMException {
        return null;
    }

    @Override // org.w3c.dom.Node
    public final boolean isDefaultNamespace(String str) {
        return false;
    }

    @Override // org.w3c.dom.Node
    public final boolean isEqualNode(Node node) {
        return false;
    }

    @Override // org.w3c.dom.Node
    public final boolean isSameNode(Node node) {
        return false;
    }

    @Override // org.w3c.dom.Node
    public final boolean isSupported(String str, String str2) {
        return false;
    }

    @Override // org.w3c.dom.Node
    public final String lookupNamespaceURI(String str) {
        return null;
    }

    @Override // org.w3c.dom.Node
    public final String lookupPrefix(String str) {
        return null;
    }

    @Override // org.w3c.dom.Node
    public final void normalize() {
    }

    @Override // org.w3c.dom.Node
    public final Node removeChild(Node node) throws DOMException {
        return null;
    }

    @Override // org.w3c.dom.Node
    public final Node replaceChild(Node node, Node node2) throws DOMException {
        return null;
    }

    @Override // org.w3c.dom.Node
    public final void setNodeValue(String str) throws DOMException {
    }

    @Override // org.w3c.dom.Node
    public final void setPrefix(String str) throws DOMException {
    }

    @Override // org.w3c.dom.Node
    public final void setTextContent(String str) throws DOMException {
    }

    @Override // org.w3c.dom.Node
    public final Object setUserData(String str, Object obj, UserDataHandler userDataHandler) {
        return null;
    }

    public final String zzfs() {
        return this.zzZPQ;
    }

    public zzZL5(String str, String str2, String str3) {
        this.zzAn = str;
        this.zzZPP = str2;
        this.zzZPQ = str3;
    }
}
