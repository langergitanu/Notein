package com.aspose.words.internal;

import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.ByteArrayInputStream;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.xml.namespace.NamespaceContext;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.InputSource;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZSN {
    private static ThreadLocal<DocumentBuilderFactory> zz65 = new ThreadLocal<DocumentBuilderFactory>() { // from class: com.aspose.words.internal.zzZSN.1
        private static DocumentBuilderFactory zzmr() {
            try {
                return zzZSN.zzZf(false);
            } catch (ParserConfigurationException e) {
                zzZHV.zzZ(e);
                return null;
            }
        }

        @Override // java.lang.ThreadLocal
        public final /* synthetic */ DocumentBuilderFactory initialValue() {
            return zzmr();
        }
    };
    private static ThreadLocal<DocumentBuilderFactory> zz64 = new ThreadLocal<DocumentBuilderFactory>() { // from class: com.aspose.words.internal.zzZSN.2
        private static DocumentBuilderFactory zzmr() {
            try {
                return zzZSN.zzZf(true);
            } catch (ParserConfigurationException e) {
                zzZHV.zzZ(e);
                return null;
            }
        }

        @Override // java.lang.ThreadLocal
        public final /* synthetic */ DocumentBuilderFactory initialValue() {
            return zzmr();
        }
    };
    private static zzZNR zz63 = new zzZNR("(\\[\\d+\\])", 0);
    private static zzZNR zz62 = new zzZNR("(ns\\d+:)", 0);

    public static class zzZ implements NamespaceContext {
        private Map<String, String> zz61;

        public zzZ(Map<String, String> map) {
            this.zz61 = map;
        }

        @Override // javax.xml.namespace.NamespaceContext
        public final String getNamespaceURI(String str) {
            return this.zz61.get(str);
        }

        @Override // javax.xml.namespace.NamespaceContext
        public final String getPrefix(String str) {
            for (Map.Entry<String, String> entry : this.zz61.entrySet()) {
                if (entry.getValue().equals(str)) {
                    return entry.getKey();
                }
            }
            return null;
        }

        @Override // javax.xml.namespace.NamespaceContext
        public final Iterator getPrefixes(String str) {
            return this.zz61.keySet().iterator();
        }
    }

    public static Document zzN(String str, boolean z) throws Exception {
        return new zzZHN().zzZ(str, zzZg(z).newDocumentBuilder());
    }

    private static String zzR(Node node) {
        Attr attr;
        if (node.getAttributes() == null || (attr = (Attr) node.getAttributes().getNamedItem("xmlns")) == null) {
            return null;
        }
        return attr.getNodeValue();
    }

    private static boolean zzS(Node node) {
        if (node instanceof Text) {
            return zzW9(((Text) node).getData());
        }
        return false;
    }

    public static String zzT(Node node) throws Exception {
        zzZOR zzzor = new zzZOR();
        zzZHG.zzZ(node, zzzor);
        return zzZO0.zzhV().zzR(zzzor.zziA(), 0, (int) zzzor.getLength());
    }

    public static String zzW8(String str) {
        if (str != null) {
            return str.replaceAll("\\[\\]", "");
        }
        return null;
    }

    private static boolean zzW9(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > ' ') {
                return false;
            }
        }
        return true;
    }

    public static String zzWa(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '&') {
                sb.append("&amp;");
            } else if (cCharAt == '<') {
                sb.append("&lt;");
            } else if (cCharAt == '>') {
                sb.append("&gt;");
            } else if (cCharAt != 160) {
                sb.append(cCharAt);
            } else {
                sb.append("&#xa0;");
            }
        }
        return sb.toString();
    }

    private static String zzWb(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\n') {
                sb.append("&#xA;");
            } else if (cCharAt == '\r') {
                sb.append("&#xD;");
            } else if (cCharAt == '\"') {
                sb.append("&quot;");
            } else if (cCharAt == '<') {
                sb.append("&lt;");
            } else if (cCharAt == '>') {
                sb.append("&gt;");
            } else if (cCharAt == '&') {
                sb.append("&amp;");
            } else if (cCharAt != '\'') {
                sb.append(cCharAt);
            } else {
                sb.append("&apos;");
            }
        }
        return sb.toString();
    }

    private static String zzWc(String str) {
        try {
            CharArrayWriter charArrayWriter = new CharArrayWriter();
            zzZHM zzzhm = new zzZHM(charArrayWriter, false);
            zzzhm.write(str);
            zzzhm.flush();
            return charArrayWriter.toString();
        } catch (IOException e) {
            zzZHV.zzZ(e);
            return str;
        }
    }

    public static Document zzX(zzZOP zzzop, boolean z) throws Exception {
        Document documentZzZ = new zzZHN().zzZ(zzzop, zzZg(z).newDocumentBuilder());
        if (zzzop instanceof zzZOR) {
            ((zzZOR) zzzop).zziB();
        }
        return documentZzZ;
    }

    public static void zzY(Node node, Node node2) {
        if (node == null || node2 == null) {
            return;
        }
        if (!(node2 instanceof zzZL5)) {
            node.appendChild(node2);
            return;
        }
        zzZL5 zzzl5 = (zzZL5) node2;
        if (!(node instanceof Document)) {
            throw new IllegalArgumentException("XmlDeclaration cannot be appended to node type " + ((int) node.getNodeType()));
        }
        Document document = (Document) node;
        document.setXmlStandalone("yes".equalsIgnoreCase(zzzl5.zzfs()));
        document.setXmlVersion(zzzl5.getVersion());
    }

    public static zzZL0 zzZ(zzZOP zzzop, zzZO0 zzzo0) throws Exception {
        return new zzZL0(zzzop, zzzo0);
    }

    public static zzZL1 zzZS(zzZOP zzzop) {
        return new zzZL1((Object) zzzop, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static DocumentBuilderFactory zzZf(boolean z) throws ParserConfigurationException {
        DocumentBuilderFactory documentBuilderFactoryZzmt = zzZHG.zzmt();
        documentBuilderFactoryZzmt.setNamespaceAware(true);
        documentBuilderFactoryZzmt.setIgnoringElementContentWhitespace(!z);
        return documentBuilderFactoryZzmt;
    }

    private static DocumentBuilderFactory zzZg(boolean z) {
        return z ? zz64.get() : zz65.get();
    }

    public static Document zzms() {
        try {
            return zzZg(false).newDocumentBuilder().newDocument();
        } catch (Throwable th) {
            zzZHV.zzZ(th);
            return null;
        }
    }

    public static DocumentBuilderFactory zzmt() throws ParserConfigurationException {
        return zzZHG.zzmt();
    }

    public static zzZL1 zzZ(zzZOP zzzop, zzZQT zzzqt) {
        return new zzZL1(zzzop, zzzqt);
    }

    public static zzZL1 zzZ(String str, Map<String, String> map) {
        return new zzZL1(str, map);
    }

    private static void zzZ(Node node, zzZOP zzzop) {
        try {
            TransformerFactory.newInstance().newTransformer().transform(new DOMSource(node), new StreamResult(new zzZK6(zzzop)));
            zzzop.flush();
        } catch (Exception e) {
            zzZHV.zzZ(e);
        }
    }

    public static void zzZ(Element element, zzZOP zzzop) {
        zzZ((Node) element, zzzop);
    }

    public static void zzZ(Document document, zzZOP zzzop) {
        zzZHN.zzZ(document, zzzop);
    }

    public static String zzZ(zzZL1 zzzl1, zzEY zzey, zzZSO zzzso) {
        if (zzzl1.getNodeType() != 1) {
            return "";
        }
        if (zzzso == null) {
            zzzso = new zzZSO(null);
        }
        StringBuilder sb = new StringBuilder();
        zzZ(zzzl1, sb, zzey, zzzso);
        zzzl1.zzfl();
        return sb.toString();
    }

    private static void zzZ(zzZL1 zzzl1, StringBuilder sb, zzEY zzey, zzZSO zzzso) {
        zzZ(zzzl1, sb, zzzso, zzey);
        if (zzzl1.zzc()) {
            zzzl1.read();
            return;
        }
        while (true) {
            zzzl1.read();
            int nodeType = zzzl1.getNodeType();
            if (nodeType == 1) {
                zzZ(zzzl1, sb, zzey, new zzZSO(zzzso));
            } else if (nodeType == 2) {
                sb.append("</");
                sb.append(zzzl1.getName());
                sb.append(">");
                return;
            } else if (nodeType == 4) {
                sb.append(zzWc(zzzl1.getValue()));
            } else if (nodeType == 5) {
                continue;
            } else {
                if (nodeType != 6) {
                    if (nodeType == 12) {
                        sb.append("<![CDATA[");
                        sb.append(zzzl1.getValue());
                        sb.append("]]>");
                    } else if (nodeType != 24) {
                        throw new IllegalStateException("Unexpected XML node type: " + zzZL3.toString(zzzl1.getNodeType()));
                    }
                }
                sb.append(zzzl1.getValue());
            }
        }
    }

    private static void zzZ(zzZL1 zzzl1, StringBuilder sb, zzZSO zzzso, zzEY zzey) {
        String value;
        sb.append("<");
        sb.append(zzzl1.getName());
        zzZQH<Map.Entry> zzzqh = new zzZQH();
        for (Map.Entry<String, String> entry : zzzl1.zzfi()) {
            if (!zzzso.zzmu().contains(entry.getKey())) {
                zzzso.zzmu().zzB(entry.getKey(), entry.getValue());
            }
        }
        String prefix = zzzl1.getPrefix();
        if (zzZHP.zzXk(prefix) && zzZHP.zzXk(zzzl1.getNamespaceURI()) && !zzzso.zzWd(prefix)) {
            zzzso.zzmu().zzB(prefix, zzzl1.getNamespaceURI());
        }
        if (zzzl1.zzfk()) {
            do {
                if ("xmlns".equals(zzzl1.getPrefix())) {
                    if (zzzl1.getLocalName() != null && !zzzso.zzWd(zzzl1.getLocalName())) {
                        zzzso.zzmu().zzB(zzzl1.getLocalName(), zzzl1.getValue());
                    }
                } else if ("xmlns".equals(zzzl1.getName()) && !zzzso.zzWd("")) {
                    zzzso.zzmu().zzB("", zzzl1.getValue());
                } else {
                    zzzqh.zzB(zzzl1.getName(), zzzl1.getValue());
                    if (zzZHP.zzXk(zzzl1.getPrefix()) && zzZHP.zzXk(zzzl1.getNamespaceURI()) && !zzzso.zzWd(zzzl1.getPrefix())) {
                        zzzso.zzmu().zzB(zzzl1.getPrefix(), zzzl1.getNamespaceURI());
                    }
                }
            } while (zzzl1.zzi());
        }
        if (zzzqh.getCount() > 0) {
            for (Map.Entry entry2 : zzzqh) {
                sb.append(" ");
                sb.append((String) entry2.getKey());
                sb.append("=\"");
                sb.append(zzWb((String) entry2.getValue()));
                sb.append("\"");
            }
        }
        if (zzzso.zzmu().getCount() > 0) {
            for (Map.Entry<String, String> entry3 : zzzso.zzmu()) {
                if (zzey != null) {
                    value = zzey.zzYM(entry3.getValue());
                } else {
                    value = entry3.getValue();
                }
                if (zzZHP.zzXk(entry3.getKey())) {
                    sb.append(" xmlns:");
                    sb.append(entry3.getKey());
                    sb.append("=\"");
                    sb.append(zzWb(value));
                    sb.append("\"");
                } else {
                    sb.append(" xmlns=\"");
                    sb.append(zzWb(value));
                    sb.append("\"");
                }
            }
        }
        zzzl1.zzj();
        if (zzzl1.zzc()) {
            sb.append(" />");
        } else {
            sb.append(">");
        }
    }

    public static ArrayList<Node> zzZ(Element element, String str, Map<String, String> map) {
        try {
            XPath xPathNewXPath = zzZHG.zzc6().newXPath();
            if (map == null) {
                map = zzZ(element, str);
            }
            String strZzZ = zzZ(map, str);
            xPathNewXPath.setNamespaceContext(new zzZ(map));
            NodeList nodeList = (NodeList) xPathNewXPath.compile(zzW8(strZzZ)).evaluate(element, XPathConstants.NODESET);
            ArrayList<Node> arrayList = new ArrayList<>();
            for (int i = 0; i < nodeList.getLength(); i++) {
                arrayList.add(nodeList.item(i));
            }
            if (arrayList.size() == 1 && !(arrayList.get(0) instanceof Node)) {
                throw new IllegalStateException("Jaxen XPath evaluated non-node-set. Throw to emulate .Net behaviour.");
            }
            return arrayList;
        } catch (XPathExpressionException e) {
            throw new IllegalStateException(e);
        }
    }

    private static String zzZ(Map map, String str) {
        if (str != null && map != null && !map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getValue();
                if (str2 != null && !str2.contains("://")) {
                    str = str.replaceAll("/" + entry.getKey() + ":([^|/\\[]+)", "/*[local-name()='$1']");
                }
            }
        }
        return str;
    }

    public static boolean zzZ(Node node, int i) {
        if (node == null) {
            return false;
        }
        short nodeType = node.getNodeType();
        switch (i) {
            case 1:
                if (nodeType == 1) {
                }
                break;
            case 3:
                if (nodeType == 7) {
                }
                break;
            case 4:
                if (nodeType != 3 || zzS(node)) {
                }
                break;
            case 5:
                if (nodeType == 8) {
                }
                break;
            case 7:
                if (nodeType == 9) {
                }
                break;
            case 9:
                if (nodeType == 5) {
                }
                break;
            case 10:
                if (nodeType == 2) {
                }
                break;
            case 11:
                if (nodeType == 10) {
                }
                break;
            case 12:
                if (nodeType == 4) {
                }
                break;
            case 14:
                if (nodeType == 12) {
                }
                break;
            case 15:
                if (nodeType == 6) {
                }
                break;
        }
        return false;
    }

    private static Map<String, String> zzZ(Element element, String str) {
        HashMap map = new HashMap();
        zzZ(map, element, 0);
        int i = 1;
        for (String str2 : zzZKN.zzY(zz63.zzZS(str, ""), new char[]{IOUtils.DIR_SEPARATOR_UNIX}, zzZOE.REMOVE_EMPTY_ENTRIES$77a9e2fd)) {
            String strZzZS = zz62.zzZS(str2, "");
            if (!zzZKN.equals(str2, strZzZS)) {
                NodeList elementsByTagName = element.getElementsByTagName(strZzZS);
                if (elementsByTagName.getLength() != 0) {
                    zzZ(map, elementsByTagName.item(0), i);
                    i++;
                }
            }
        }
        return map;
    }

    private static void zzZ(Map<String, String> map, Node node, int i) {
        String strZzR = zzR(node);
        if (zzZYD.zzXk(strZzR)) {
            map.put(zzZKN.format("ns{0}", Integer.valueOf(i)), strZzR);
        }
    }

    public static Document zzZ(zzZL5 zzzl5, Document document) {
        if (zzZKN.zzU3(zzzl5.getEncoding())) {
            return document;
        }
        try {
            StringBuilder sb = new StringBuilder("<?xml version=\"{0}\"");
            if (!zzZKN.zzU3(zzzl5.getEncoding())) {
                sb.append(" encoding=\"{1}\"");
            }
            if (!zzZKN.zzU3(zzzl5.zzfs())) {
                sb.append(" standalone=\"{2}\"");
            }
            sb.append("?><test></test>");
            byte[] bytes = (zzZKN.zzU3(zzzl5.getEncoding()) ? zzZO0.zzhV() : zzZO0.zzV3(zzzl5.getEncoding())).getBytes(zzZKN.format(sb.toString(), zzzl5.getVersion(), zzzl5.getEncoding(), zzzl5.zzfs()));
            DocumentBuilder documentBuilderNewDocumentBuilder = zzZg(false).newDocumentBuilder();
            InputSource inputSource = new InputSource(new ByteArrayInputStream(bytes));
            inputSource.setEncoding(zzzl5.getEncoding());
            Document document2 = documentBuilderNewDocumentBuilder.parse(inputSource);
            document2.removeChild(document2.getFirstChild());
            if (document != null && document.getDocumentElement() != null) {
                Element documentElement = document.getDocumentElement();
                document2.importNode(documentElement, true);
                document2.appendChild(documentElement);
            }
            return document2;
        } catch (Throwable th) {
            zzZHV.zzZ(th);
            return document;
        }
    }

    public static String zzZ(zzZL1 zzzl1) throws Exception {
        zzZL2 zzzl2Zzfj = zzzl1.zzfj();
        zzzl2Zzfj.read();
        return zzzl2Zzfj.zzfm();
    }
}
