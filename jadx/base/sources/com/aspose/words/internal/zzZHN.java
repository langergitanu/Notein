package com.aspose.words.internal;

import android.os.Bundle;
import java.io.InputStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentType;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZHN {
    protected boolean zzZGY = false;

    public static final class zzZ {
        String zzZGX = null;
        String zzZGW = null;
        String zzZGV = null;

        public final String zzZD(String str, String str2) {
            if (zzZKN.equals(str2, this.zzZGW) && zzZKN.equals(str, this.zzZGX)) {
                return this.zzZGV;
            }
            this.zzZGW = str2;
            this.zzZGX = str;
            StringBuilder sb = new StringBuilder(str2.length() + str.length() + 1);
            sb.append(str);
            sb.append(':');
            sb.append(str2);
            String string = sb.toString();
            this.zzZGV = string;
            return string;
        }
    }

    public static void zzZ(Document document, zzZOP zzzop) {
        try {
            zzZEN zzzen = new zzZEN();
            zzzen.zzXPj();
            zzzen.setProperty("org.codehaus.stax2.automaticEmptyElements", Boolean.TRUE);
            zzZQQ zzzqqZzU = zzzen.zzU(new zzZK6(zzzop));
            new zzZHN().zzZ(document, zzzqqZzU);
            zzzqqZzU.close();
        } catch (zzZQS e) {
            throw new IllegalStateException("XMLStreamException: " + e.getMessage(), e);
        }
    }

    private static boolean zze(zzZQR zzzqr) throws zzZQS {
        Object property = zzzqr.getProperty("com.aspose.javax.xml.stream.isNamespaceAware");
        return !(property instanceof Boolean) || ((Boolean) property).booleanValue();
    }

    private Document zzZ(zzZQR zzzqr, DocumentBuilder documentBuilder) throws zzZQS {
        Document documentNewDocument = documentBuilder.newDocument();
        zzZ(zzzqr, documentNewDocument);
        return documentNewDocument;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00aa A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzZ(zzZQR zzzqr, Document document) throws zzZQS {
        Element elementCreateElement;
        Node nodeCreateProcessingInstruction;
        boolean z = zzzqr.getEventType() == 7;
        zzYFW zzyfwZz4 = zzYFQ.zz4(zzzqr);
        zzZ zzz = new zzZ();
        boolean zZze = zze(zzyfwZz4);
        int eventType = zzyfwZz4.getEventType();
        Node parentNode = document;
        while (true) {
            switch (eventType) {
                case 1:
                    String strZzTI = zzZHG.zzTI(zzyfwZz4.getLocalName());
                    if (zZze) {
                        elementCreateElement = document.createElementNS(zzyfwZz4.getNamespaceURI(), zzZHG.zzTI(zzyfwZz4.zzXMY()));
                    } else {
                        elementCreateElement = document.createElement(strZzTI);
                    }
                    zzZ(zzyfwZz4, zzz, zZze, elementCreateElement);
                    parentNode.appendChild(elementCreateElement);
                    parentNode = elementCreateElement;
                    eventType = zzyfwZz4.next();
                    break;
                case 2:
                    parentNode = parentNode.getParentNode();
                    if ((parentNode == null || parentNode == document) && !z) {
                        return;
                    } else {
                        eventType = zzyfwZz4.next();
                    }
                    break;
                case 3:
                    nodeCreateProcessingInstruction = document.createProcessingInstruction(zzyfwZz4.zzlg(), zzyfwZz4.zzlf());
                    if (nodeCreateProcessingInstruction == null) {
                        parentNode.appendChild(nodeCreateProcessingInstruction);
                    }
                    eventType = zzyfwZz4.next();
                    break;
                case 4:
                    nodeCreateProcessingInstruction = document.createTextNode(zzyfwZz4.getText());
                    if (nodeCreateProcessingInstruction == null) {
                    }
                    eventType = zzyfwZz4.next();
                    break;
                case 5:
                    nodeCreateProcessingInstruction = document.createComment(zzyfwZz4.getText());
                    if (nodeCreateProcessingInstruction == null) {
                    }
                    eventType = zzyfwZz4.next();
                    break;
                case 6:
                    if (this.zzZGY || parentNode == document) {
                        eventType = zzyfwZz4.next();
                    }
                    nodeCreateProcessingInstruction = document.createTextNode(zzyfwZz4.getText());
                    if (nodeCreateProcessingInstruction == null) {
                    }
                    eventType = zzyfwZz4.next();
                    break;
                case 7:
                case 11:
                case 14:
                case 15:
                    eventType = zzyfwZz4.next();
                    break;
                case 8:
                    return;
                case 9:
                    nodeCreateProcessingInstruction = document.createEntityReference(zzyfwZz4.getLocalName());
                    if (nodeCreateProcessingInstruction == null) {
                    }
                    eventType = zzyfwZz4.next();
                    break;
                case 10:
                case 13:
                default:
                    throw new zzZQS("Unrecognized iterator event type: " + zzyfwZz4.getEventType() + "; should not receive such types (broken stream reader?)");
                case 12:
                    nodeCreateProcessingInstruction = document.createCDATASection(zzyfwZz4.getText());
                    if (nodeCreateProcessingInstruction == null) {
                    }
                    eventType = zzyfwZz4.next();
                    break;
            }
        }
    }

    private void zzZ(Document document, zzZQQ zzzqq) throws zzZQS {
        zzYFV zzyfvZzZ = zzYFP.zzZ(zzzqq);
        for (Node firstChild = document.getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            zzZ(zzyfvZzZ, firstChild);
        }
        zzyfvZzZ.close();
    }

    private void zzZ(zzYFV zzyfv, Node node) throws zzZQS {
        short nodeType = node.getNodeType();
        if (nodeType == 1) {
            zzZ(zzyfv, (Element) node);
            return;
        }
        if (nodeType == 10) {
            zzyfv.zzVX(zzZ((DocumentType) node));
            return;
        }
        if (nodeType == 3) {
            zzyfv.zzVV(node.getNodeValue());
            return;
        }
        if (nodeType == 4) {
            zzyfv.zzVY(node.getNodeValue());
            return;
        }
        if (nodeType == 5) {
            zzyfv.zzVW(node.getNodeName());
            return;
        }
        if (nodeType != 7) {
            if (nodeType == 8) {
                zzyfv.zzU(node.getNodeValue());
                return;
            }
            throw new zzZQS("Unrecognized or unexpected node class: ".concat(node.getClass().getName()));
        }
        String nodeName = node.getNodeName();
        String nodeValue = node.getNodeValue();
        if (nodeValue != null && nodeValue.length() != 0) {
            zzyfv.zzW(nodeName, nodeValue);
        } else {
            zzyfv.zzVZ(nodeName);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String, java.lang.StringBuilder] */
    private static String zzZ(DocumentType documentType) {
        ?? sb = new StringBuilder("<!DOCTYPE ");
        sb.append(documentType.getName());
        String publicId = documentType.getPublicId();
        String systemId = documentType.getSystemId();
        if (publicId != null && publicId.length() != 0) {
            Bundle.putString(sb, "PUBLIC \"");
            sb.append('\"');
        } else if (systemId != null && systemId.length() > 0) {
            sb.append("SYSTEM \"");
            sb.append(systemId);
            sb.append('\"');
        }
        String internalSubset = documentType.getInternalSubset();
        if (internalSubset != null && internalSubset.length() > 0) {
            sb.append(" [");
            sb.append(internalSubset);
            sb.append(']');
        }
        sb.append('>');
        return sb.toString();
    }

    private void zzZ(zzYFV zzyfv, Element element) throws zzZQS {
        String prefix = element.getPrefix();
        if (prefix == null) {
            prefix = "";
        }
        String namespaceURI = element.getNamespaceURI();
        zzyfv.zzO(prefix, element.getLocalName() == null ? element.getNodeName() : element.getLocalName(), namespaceURI != null ? namespaceURI : "");
        NamedNodeMap attributes = element.getAttributes();
        int length = attributes.getLength();
        for (int i = 0; i < length; i++) {
            Attr attr = (Attr) attributes.item(i);
            String prefix2 = attr.getPrefix();
            String name = attr.getLocalName() == null ? attr.getName() : attr.getLocalName();
            String value = attr.getValue();
            if (prefix2 != null && prefix2.length() != 0) {
                if ("xmlns".equals(prefix2)) {
                    zzyfv.zzZZ(name, value);
                } else {
                    zzyfv.zzY(prefix2, attr.getNamespaceURI(), name, value);
                }
            } else if ("xmlns".equals(name)) {
                zzyfv.zzW0(value);
            } else {
                zzyfv.zz0(name, value);
            }
        }
        for (Node firstChild = element.getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            zzZ(zzyfv, firstChild);
        }
        zzyfv.zzle();
    }

    public final Document zzZ(Object obj, DocumentBuilder documentBuilder) throws Exception {
        zzZQR zzzqrZzZ;
        zzZEO zzzeoZzc7 = zzZHG.zzc7();
        if (obj instanceof String) {
            zzzqrZzZ = zzzeoZzc7.zzZ(new StringReader((String) obj));
        } else if (obj instanceof zzZOP) {
            zzzqrZzZ = zzzeoZzc7.zzZ(new zzZK7((zzZOP) obj));
        } else if (obj instanceof InputStream) {
            zzzqrZzZ = zzzeoZzc7.zzZ((InputStream) obj);
        } else {
            throw new IllegalArgumentException("xmlData can be String, Stream, InputStream");
        }
        return zzZ(zzzqrZzZ, documentBuilder);
    }

    private static void zzZ(zzYFW zzyfw, zzZ zzz, boolean z, Element element) {
        ArrayList<zzZHI> arrayList = new ArrayList();
        int iZzlh = zzyfw.zzlh();
        for (int i = 0; i < iZzlh; i++) {
            String namespacePrefix = zzyfw.getNamespacePrefix(i);
            String strZzZD = "xmlns";
            if (!zzZKN.zzU3(namespacePrefix)) {
                strZzZD = zzz.zzZD("xmlns", namespacePrefix);
            }
            arrayList.add(new zzZHI("http://www.w3.org/2000/xmlns/", strZzZD, zzyfw.getNamespaceURI(i)));
        }
        int attributeCount = zzyfw.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            String strZzRu = zzyfw.zzRu(i2);
            String attributeValue = zzyfw.getAttributeValue(i2);
            if (z) {
                String attributePrefix = zzyfw.getAttributePrefix(i2);
                if (!zzZKN.zzU3(attributePrefix)) {
                    strZzRu = zzz.zzZD(attributePrefix, strZzRu);
                }
                arrayList.add(new zzZHI(zzyfw.getAttributeNamespace(i2), strZzRu, attributeValue));
            } else {
                arrayList.add(new zzZHI(strZzRu, attributeValue));
            }
        }
        Collections.sort(arrayList, zzZHI.zzZGK);
        for (zzZHI zzzhi : arrayList) {
            if (zzzhi.zzc8()) {
                element.setAttributeNS(zzzhi.getNamespace(), zzzhi.getName(), zzzhi.getValue());
            } else {
                element.setAttribute(zzzhi.getName(), zzzhi.getValue());
            }
        }
    }
}
