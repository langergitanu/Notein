package com.aspose.slides.internal.p077d8;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: renamed from: com.aspose.slides.internal.d8.lr */
/* JADX INFO: loaded from: classes3.dex */
class C3069lr {
    /* JADX INFO: renamed from: k4 */
    public static String m12966k4(Node node) {
        StringBuilder sb = new StringBuilder();
        if (node.getNodeType() == 1) {
            sb.append("<");
            sb.append(node.getNodeName());
            sb.append(">");
            NodeList childNodes = node.getChildNodes();
            if (childNodes.getLength() == 1 && childNodes.item(0).getNodeType() == 3) {
                sb.append(childNodes.item(0).getNodeValue().replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;"));
            } else {
                for (int i = 0; i < childNodes.getLength(); i++) {
                    sb.append(m12966k4(childNodes.item(i)));
                }
            }
            sb.append("</");
            sb.append(node.getNodeName());
            sb.append(">");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: x1 */
    public static String m12968x1(Element element, String str) {
        Element elementM12967k4 = m12967k4(element, str);
        return elementM12967k4 != null ? elementM12967k4.getFirstChild().getNodeValue() : "";
    }

    /* JADX INFO: renamed from: k4 */
    public static Element m12967k4(Element element, String str) {
        NodeList elementsByTagName = element.getElementsByTagName(str);
        if (elementsByTagName.getLength() > 0) {
            return (Element) elementsByTagName.item(0);
        }
        return null;
    }
}
