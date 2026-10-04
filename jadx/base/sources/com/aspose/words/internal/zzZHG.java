package com.aspose.words.internal;

import com.huawei.hms.network.embedded.C18115b5;
import com.orion.notein.richeditor.converter.tagsoup.Parser;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZHG {
    private static final ThreadLocal<XPathFactory> zzZGH = new ThreadLocal<XPathFactory>() { // from class: com.aspose.words.internal.zzZHG.1
        @Override // java.lang.ThreadLocal
        public final /* synthetic */ XPathFactory initialValue() {
            return XPathFactory.newInstance();
        }
    };
    private static volatile boolean zzZGI = false;

    static {
        zzc5();
    }

    public static String zzTI(String str) {
        if (str.length() == 0) {
            return str;
        }
        StringBuilder sb = null;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (!zzZD(cCharAt)) {
                if (sb == null) {
                    sb = new StringBuilder();
                    sb.append(str.substring(0, i));
                }
                sb.append(C18115b5.CONNECTOR);
            } else if (sb != null) {
                sb.append(cCharAt);
            }
        }
        return sb != null ? sb.toString() : str;
    }

    public static void zzZ(Node node, zzZOR zzzor) {
        try {
            TransformerFactory.newInstance().newTransformer().transform(new DOMSource(node), new StreamResult(new zzZK6(zzzor)));
        } catch (Exception e) {
            zzZHV.zzZ(e);
        }
    }

    private static boolean zzZD(char c) {
        if (c >= 'A' && c <= 'Z') {
            return true;
        }
        if ((c < 'a' || c > 'z') && c != '_') {
            return (c >= '0' && c <= '9') || c == '-' || c == '.' || c == ':';
        }
        return true;
    }

    private static void zzc5() {
        boolean z;
        if (zzZGI) {
            return;
        }
        try {
            Class.forName("com.sun.org.apache.xml.internal.dtm.ref.DTMManagerDefault");
            z = true;
        } catch (ClassNotFoundException e) {
            zzZHV.zzZ(e);
            z = false;
        }
        boolean z2 = System.getProperty("com.sun.org.apache.xml.internal.dtm.DTMManager") != null;
        if (z && !z2) {
            System.setProperty("com.sun.org.apache.xml.internal.dtm.DTMManager", "com.sun.org.apache.xml.internal.dtm.ref.DTMManagerDefault");
        }
        zzZGI = true;
    }

    public static XPathFactory zzc6() {
        return zzZGH.get();
    }

    public static zzZEO zzc7() {
        return zzZ(false, true, null);
    }

    public static DocumentBuilderFactory zzmt() throws ParserConfigurationException {
        DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
        try {
            try {
                documentBuilderFactoryNewInstance.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
            } catch (ParserConfigurationException unused) {
            }
            try {
                documentBuilderFactoryNewInstance.setFeature(Parser.externalGeneralEntitiesFeature, false);
                documentBuilderFactoryNewInstance.setFeature(Parser.externalParameterEntitiesFeature, false);
            } catch (ParserConfigurationException unused2) {
            }
            documentBuilderFactoryNewInstance.setXIncludeAware(false);
            documentBuilderFactoryNewInstance.setExpandEntityReferences(false);
        } catch (Throwable unused3) {
        }
        return documentBuilderFactoryNewInstance;
    }

    public static zzZEO zzZ(boolean z, boolean z2, zzZQT zzzqt) {
        zzZEO zzzeo = new zzZEO();
        zzzeo.zzXPj();
        zzzeo.zzXMb().zzPj(false);
        zzzeo.zzXMb().zzPr(false);
        zzzeo.zzXMb().zzPs(false);
        zzzeo.zzXMb().zzPt(!z);
        zzzeo.zzXMb().zzPu(true);
        if (z2) {
            zzzeo.zzXMb().zzY(new zzZHK());
        } else {
            zzzeo.zzXMb().zzPq(true);
        }
        if (zzzqt != null) {
            zzzeo.zzXMb().zzPs(true);
            zzzeo.zzXMb().zzPq(true);
            zzzeo.zzXMb().zzPr(false);
            zzzeo.zzXMb().zzY(zzzqt);
            zzzeo.zzXMb().zzX(new zzZHK());
        }
        zzzeo.zzXMb().zzXPl();
        zzzeo.zzXMb().zzh8(33554432);
        zzzeo.zzXMb().zzh7(2000);
        return zzzeo;
    }
}
