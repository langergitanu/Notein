package com.aspose.words;

import com.aspose.slides.C22218Oooo;
import com.aspose.slides.PatternStyle;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes6.dex */
class zzZ5R {
    private static com.aspose.words.internal.zzIM<String> zzYeQ;
    private static com.aspose.words.internal.zzIM<String> zzYeR;
    com.aspose.words.internal.zzZO0 zzYeT = com.aspose.words.internal.zzZO0.zzhV();
    private static ArrayList<zzZ5P> zzYeS = new ArrayList<>();
    private static Object zzYeP = new Object();
    private static Object zzYeO = new Object();
    private static final String zzYeN = com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{121, 121, 121, 121, 77, 77, 100, 100});
    static long zzYeM = 0;
    private static long zzYeL = 7133812862090241280L;

    private static InputStream zzJq(String str) {
        StringBuilder sbOooO0OO = C22218Oooo.OooO0OO(str);
        sbOooO0OO.append(com.aspose.words.internal.zzZO0.zzhV().zzZn(new byte[]{PatternStyle.Divot, 82, 101, 97, 108, PatternStyle.Divot, 120, 109, 108}));
        return com.aspose.words.internal.zzZXR.zzV(sbOooO0OO.toString(), License.class);
    }

    private static String zzJr(String str) {
        return str;
    }

    private static boolean zzM(String str, String str2, int i) throws Exception {
        byte[] bArrZzVT;
        String strZz1;
        com.aspose.words.internal.zzZO0.zzhV().zzZn(new byte[]{80, 114, 111, 102, 101, 115, 115, 105, 111, 110, 97, 108});
        com.aspose.words.internal.zzZO0.zzhV().zzZn(new byte[]{80, 114, 111, 102, 101, 115, 115, 105, 111, 110, 97, 108});
        byte[] bytes = str.getBytes("UTF-16LE");
        try {
            bArrZzVT = com.aspose.words.internal.zzZQB.zzVT(str2);
        } catch (NumberFormatException unused) {
            bArrZzVT = new byte[0];
        }
        if (i == 0) {
            strZz1 = bArrZzVT.length == 128 ? zzYCS.zz1(zzYCR.zzYbW()) : zzYCS.zz1(zzYCR.zzYbU());
        } else {
            if (i != 1) {
                throw new IllegalStateException();
            }
            strZz1 = bArrZzVT.length == 128 ? zzYCS.zz1(zzYCR.zzYbV()) : zzYCS.zz1(zzYCR.zzYbT());
        }
        return zzZ(bytes, bArrZzVT, strZz1);
    }

    private static String zzP(org.w3c.dom.Node node) {
        StringBuilder sb = new StringBuilder();
        zzZ(sb, node);
        String string = sb.toString();
        return "<Data></Data>".equals(string) ? "<Data />" : string;
    }

    private static String zzQ(org.w3c.dom.Node node) {
        return node != null ? node.getFirstChild().getNodeValue() : "";
    }

    private static File zzR(String str, Class cls) throws Exception {
        return new File(zzl(cls), str);
    }

    private InputStream zzS(String str, Class cls) throws Exception {
        File file = new File(str);
        if (file.exists()) {
            return new com.aspose.words.internal.zzZKG(file);
        }
        File fileZzR = zzR(str, getClass());
        if (fileZzR.exists()) {
            return new com.aspose.words.internal.zzZKG(fileZzR);
        }
        File fileZzR2 = zzR(str, cls);
        if (fileZzR2.exists()) {
            return new com.aspose.words.internal.zzZKG(fileZzR2);
        }
        InputStream inputStreamZzV = zzV(cls, str);
        if (inputStreamZzV != null) {
            return inputStreamZzV;
        }
        throw new IllegalStateException(com.aspose.words.internal.zzZKN.format(zzYCS.zz1(zzYCR.zzYbX()), str));
    }

    public static void zzU(InputStream inputStream) throws Exception {
        if (inputStream == null) {
            throw new NullPointerException(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{116, 115, 101, 114, 109, 97}));
        }
        zzZ5Q zzz5qZzT = zzT(inputStream);
        zzZ(zzz5qZzT);
        if (zzz5qZzT.zzYRl()) {
            throw new IllegalStateException(com.aspose.words.internal.zzZKN.format(zzYCS.zz1(zzYCR.zzYbZ()), zzz5qZzT.zzYRh().zzY(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{100, 100, 77, 32, 77, 77, 121, 32, 121, 121, 121}), com.aspose.words.internal.zzZP1.zzj8()), zzZ5Q.zzYRj().zzY(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{100, 100, 77, 32, 77, 77, 121, 32, 121, 121, 121}), com.aspose.words.internal.zzZP1.zzj8())));
        }
        if (zzz5qZzT.zzYRk()) {
            throw new IllegalStateException(zzYCS.zz1(zzYCR.zzYbY()));
        }
        synchronized (zzYeO) {
            try {
                if (zzYeS.indexOf(zzz5qZzT) == -1) {
                    zzYeS.add(zzz5qZzT);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static InputStream zzV(Class cls, String str) {
        return com.aspose.words.internal.zzZXR.zzV(str, cls);
    }

    private static Element zzX(Element element, String str) {
        org.w3c.dom.NodeList elementsByTagName = element.getElementsByTagName(str);
        if (elementsByTagName.getLength() > 0) {
            return (Element) elementsByTagName.item(0);
        }
        return null;
    }

    public static void zzY(zzYZ8 zzyz8) {
        synchronized (zzYeO) {
            int i = 0;
            while (i < zzYeS.size()) {
                try {
                    zzYZ3 zzyz3 = (zzYZ3) zzYeS.get(i);
                    if (zzyz3 == null || zzyz3.zzYDv() != zzyz8) {
                        i++;
                    } else {
                        zzYeS.remove(i);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static byte[] zzYRo() {
        boolean z;
        boolean z2;
        boolean z3;
        com.aspose.words.internal.zzZO0.zzhV().zzZn(new byte[]{80, 114, 111, 102, 101, 115, 115, 105, 111, 110, 97, 108});
        com.aspose.words.internal.zzZO0.zzhV().zzZn(new byte[]{80, 114, 111, 102, 101, 115, 115, 105, 111, 110, 97, 108});
        synchronized (zzYeO) {
            try {
                z = false;
                z2 = false;
                z3 = false;
                for (zzZ5P zzz5p : zzYeS) {
                    if (zzz5p.zzYRn()) {
                        if (zzz5p.isMetered()) {
                            z2 = true;
                        } else if (zzY3F.zzXTR() != 4096) {
                            z = true;
                        }
                    }
                    if (zzz5p.zzYRm()) {
                        z3 = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        long j = zzYeM;
        if (j == 0) {
            zzYeM = j ^ zzYeL;
        }
        return z ? zzZ5O.zzYeC : (z2 && zzYZ8.zzYDJ() == zzYZ0.zzXZ1) ? zzZ5O.zzYeC : z3 ? zzZ5O.zzYeB : zzZ5O.zzYeD;
    }

    private static void zzZ(String str, zzZ5Q zzz5q) {
    }

    private static synchronized com.aspose.words.internal.zzIM<String> zzZB(String str, int i) throws Exception {
        com.aspose.words.internal.zzIM<String> zzim;
        InputStream inputStreamZzJq = zzJq(str);
        if (inputStreamZzJq == null) {
            throw new IllegalStateException(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{97, 67, 110, 110, 116, 111, 102, 32, 110, 105, 32, 100, 101, 114, 111, 115, 114, 117, 101, 99, 32, PatternStyle.Divot, 108, 80, 97, 101, 101, 115, 114, 32, 112, 101, 114, 111, 32, 116, 104, 116, 115, 105, 101, 32, 114, 114, 114, 111, 116, 32, 32, 111, 115, 65, 111, 112, 101, 115, PatternStyle.Divot}));
        }
        try {
            Element documentElement = com.aspose.words.internal.zzZSN.zzmt().newDocumentBuilder().parse(inputStreamZzJq).getDocumentElement();
            Element elementZzX = zzX(documentElement, com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{97, 68, 97, 116}));
            Element elementZzX2 = zzX(documentElement, com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{105, 83, 110, 103, 116, 97, 114, 117, 101}));
            if (elementZzX == null || elementZzX2 == null) {
                throw new IllegalStateException(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{97, 67, 110, 110, 116, 111, 102, 32, 110, 105, 32, 100, 101, 114, 111, 115, 114, 117, 101, 99, 100, 32, 116, 97, PatternStyle.Divot, 97, 80, 32, 101, 108, 115, 97, 32, 101, 101, 114, 111, 112, 116, 114, 116, 32, 105, 104, 32, 115, 114, 101, 111, 114, 32, 114, 111, 116, 65, 32, 112, 115, 115, 111, PatternStyle.Divot, 101}));
            }
            if (!zzM(zzP(elementZzX), zzQ(elementZzX2), i)) {
                com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{110, 73, 111, 99, 114, 114, 99, 101, 32, 116, 105, 115, 110, 103, 116, 97, 114, 117, PatternStyle.Divot, 101});
            }
            zzim = new com.aspose.words.internal.zzIM<>();
            org.w3c.dom.NodeList elementsByTagName = elementZzX.getElementsByTagName(com.aspose.words.internal.zzZO0.zzhV().zzZn(new byte[]{83, 78}));
            for (int i2 = 0; i2 < elementsByTagName.getLength(); i2++) {
                zzim.add(zzQ(elementsByTagName.item(i2)));
            }
            inputStreamZzJq.close();
        } catch (Throwable th) {
            inputStreamZzJq.close();
            throw th;
        }
        return zzim;
    }

    private static String zzl(Class cls) throws Exception {
        return com.aspose.words.internal.zzZHP.zzp(cls);
    }

    public static boolean zzxT(int i) {
        byte[] bArrZzYRo = zzYRo();
        if (bArrZzYRo == zzZ5O.zzYeD) {
            return false;
        }
        if (bArrZzYRo == zzZ5O.zzYeC) {
            return true;
        }
        if (bArrZzYRo != zzZ5O.zzYeB) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: " + com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{105, 108, 101, 99, 115, 110, 83, 101, 97, 116, 101, 116}));
        }
        synchronized (zzYeO) {
            try {
                Iterator<zzZ5P> it = zzYeS.iterator();
                while (it.hasNext()) {
                    if (it.next().zzxT(i)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void zzT(String str, Class cls) throws Exception {
        this.zzYeT.zzZn(new byte[]{80, 114, 111, 102, 101, 115, 115, 105, 111, 110, 97, 108});
        this.zzYeT.zzZn(new byte[]{80, 114, 111, 102, 101, 115, 115, 105, 111, 110, 97, 108});
        if ("".equals(str)) {
            synchronized (zzYeO) {
                zzYeS.clear();
            }
        } else {
            InputStream inputStreamZzS = zzS(str, cls);
            try {
                zzU(inputStreamZzS);
            } finally {
                if (inputStreamZzS != null) {
                    inputStreamZzS.close();
                }
            }
        }
    }

    public static void zzZ(zzYZ8 zzyz8) {
        if (zzYZ8.zzYDJ() == zzYZ0.zzXZ1) {
            synchronized (zzYeO) {
                zzYeS.add(new zzYZ3(zzyz8));
            }
        }
    }

    private static void zzZ(zzZ5Q zzz5q) throws Exception {
        synchronized (zzYeP) {
            try {
                if (zzYeR == null) {
                    zzYeR = zzZB(zzYCS.zz1(zzYCR.zzYc3()), 0);
                }
                if (zzYeQ == null) {
                    zzYeQ = zzZB(zzYCS.zz1(zzYCR.zzYc2()), 1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zzY3F.zzXTQ() <= 0) {
            if (zzYeR.contains(zzz5q.getSerialNumber()) || zzYeQ.contains(zzz5q.getSerialNumber())) {
                throw new IllegalStateException(zzYCS.zz1(zzYCR.zzYc1()));
            }
            return;
        }
        throw new IllegalStateException(zzYCS.zz1(zzYCR.zzYc4()));
    }

    private static String zzY(Element element, String str) {
        return zzQ(zzX(element, str));
    }

    private static zzZ5Q zzT(InputStream inputStream) throws Exception {
        Element documentElement = com.aspose.words.internal.zzZSN.zzmt().newDocumentBuilder().parse(inputStream).getDocumentElement();
        Element elementZzX = zzX(documentElement, com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{97, 68, 97, 116}));
        Element elementZzX2 = zzX(documentElement, com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{105, 83, 110, 103, 116, 97, 114, 117, 101}));
        if (elementZzX != null && elementZzX2 != null) {
            zzZ5Q zzz5qZzZ = zzZ(elementZzX, elementZzX2);
            if (zzz5qZzZ.zzYRg() != 0) {
                if (zzM(zzz5qZzZ.getData(), zzz5qZzZ.zzYRf(), zzz5qZzZ.zzYRi())) {
                    return zzz5qZzZ;
                }
                throw new IllegalStateException(zzYCS.zz1(zzYCR.zzYc4()));
            }
            throw new IllegalStateException(zzYCS.zz1(zzYCR.zzYc0()));
        }
        throw new IllegalStateException(zzYCS.zz1(zzYCR.zzYbO()));
    }

    private static zzZ5Q zzZ(Element element, Element element2) throws Exception {
        com.aspose.words.internal.zzZQ9 zzzq9ZzZ;
        com.aspose.words.internal.zzZQ9 zzzq9ZzZ2;
        zzZ5Q zzz5q = new zzZ5Q(zzP(element), zzQ(element2));
        org.w3c.dom.NodeList elementsByTagName = zzX(element, com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{114, 80, 100, 111, 99, 117, 115, 116})).getElementsByTagName(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{114, 80, 100, 111, 99, 117, 116}));
        for (int i = 0; i < elementsByTagName.getLength(); i++) {
            zzz5q.zzJp(zzJr(zzQ(elementsByTagName.item(i))));
        }
        zzz5q.zzJn(zzY(element, com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{101, 83, 105, 114, 108, 97, 117, 78, 98, 109, 114, 101})));
        String strZzY = zzY(element, com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{117, 83, 115, 98, 114, 99, 112, 105, 105, 116, 110, 111, 120, 69, 105, 112, 121, 114}));
        String strZzY2 = zzY(element, com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{105, 76, 101, 99, 115, 110, 69, 101, 112, 120, 114, 105, 121}));
        String strZzY3 = zzY(element, com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{109, 69, 105, 97, 84, 108, 111}));
        if (com.aspose.words.internal.zzZKN.zzU3(strZzY)) {
            zzzq9ZzZ = com.aspose.words.internal.zzZQ9.zz34;
        } else {
            zzzq9ZzZ = com.aspose.words.internal.zzZQ9.zzZ(strZzY, zzYeN, com.aspose.words.internal.zzZP1.zzj8());
        }
        zzz5q.zzc(zzzq9ZzZ);
        if (com.aspose.words.internal.zzZKN.zzU3(strZzY2)) {
            zzzq9ZzZ2 = com.aspose.words.internal.zzZQ9.zz34;
        } else {
            zzzq9ZzZ2 = com.aspose.words.internal.zzZQ9.zzZ(strZzY2, zzYeN, com.aspose.words.internal.zzZP1.zzj8());
        }
        zzz5q.zzb(zzzq9ZzZ2);
        if (strZzY3 != null) {
            zzZ(strZzY3, zzz5q);
        }
        return zzz5q;
    }

    private static boolean zzZ(byte[] bArr, byte[] bArr2, String str) throws Exception {
        return zzYI5.zzZ(com.aspose.words.internal.zzZQB.zzVT(str), com.aspose.words.internal.zzZQB.zzVT(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{81, 65, 66, 65})), bArr, bArr2);
    }

    private static void zzZ(StringBuilder sb, org.w3c.dom.Node node) {
        if (node.getNodeType() == 1) {
            sb.append('<');
            sb.append(node.getNodeName());
            sb.append('>');
            org.w3c.dom.NodeList childNodes = node.getChildNodes();
            if (zzZ(childNodes)) {
                sb.append(childNodes.item(0).getNodeValue().replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;"));
            } else {
                for (int i = 0; i < childNodes.getLength(); i++) {
                    zzZ(sb, childNodes.item(i));
                }
            }
            sb.append('<');
            sb.append(IOUtils.DIR_SEPARATOR_UNIX);
            sb.append(node.getNodeName());
            sb.append('>');
        }
    }

    private static boolean zzZ(org.w3c.dom.NodeList nodeList) {
        org.w3c.dom.Node nodeItem;
        return nodeList != null && nodeList.getLength() == 1 && (nodeItem = nodeList.item(0)) != null && nodeItem.getNodeType() == 3;
    }
}
