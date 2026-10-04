package com.aspose.words.internal;

import org.w3c.dom.Element;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZKX {
    private static Element zzY(Node node, String str) {
        for (Node firstChild = node.getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            if (firstChild.getNodeType() == 1 && firstChild.getNodeName().equals(str)) {
                return (Element) firstChild;
            }
        }
        return null;
    }

    public static Element zzZ(Node node, String str, String str2) {
        if (str2 == null || "".equals(str2)) {
            return zzY(node, str);
        }
        for (Node firstChild = node.getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            if (firstChild.getNodeType() == 1 && firstChild.getNodeName().equals(str) && firstChild.getNamespaceURI() != null && firstChild.getNamespaceURI().equals(str2)) {
                return (Element) firstChild;
            }
        }
        return null;
    }
}
