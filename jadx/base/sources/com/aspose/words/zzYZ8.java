package com.aspose.words;

import com.aspose.slides.C22218Oooo;
import com.aspose.slides.PatternStyle;
import com.huawei.hms.network.embedded.C18385v2;
import java.io.StringReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;

/* JADX INFO: loaded from: classes6.dex */
final class zzYZ8 {
    private String zzXZD;
    private String zzXZE;
    private String zzXZN;
    private String zzXZw;
    private String zzXZx;
    private String zzXZy;
    static zzYZ8 zzXZF = new zzYZ8();
    private static final AtomicInteger zzXZn = new AtomicInteger(0);
    private static final byte[] zzXZm = zzXZF.zzXZs;
    private int zzXZC = 4096;
    private int zzXZB = 4096;
    private long zzXZA = 0;
    private long zzXZz = 0;
    private final long zzXZv = C18385v2.f56338j;
    private final int zzXZu = 10;
    private final long zzXZt = C18385v2.f56338j;
    private final byte[] zzXZs = {73, 110, 118, 97, 108, 105, 100, 32, 108, 105, 99, 101, 110, 115, 101, 32, 115, 105, 103, 110, 97, 116, 117, 114, 101, PatternStyle.Divot, 32, 80, 108, 101, 97, 115, 101, 32, 109, 97, 107, 101, 32, 115, 117, 114, 101, 32, 116, 104, 101, 32, 108, 105, 99, 101, 110, 115, 101, 32, 102, 105, 108, 101, 32, 119, 97, 115, 32, 110, 111, 116, 32, 109, 111, 100, 105, 102, 105, 101, 100, PatternStyle.Divot};
    private final long zzXZr = 29273535023874148L;
    private final long zzXZq = 7133812862090241280L;
    private final long zzXZp = 7163086397114115428L;
    private String zzXZo = null;

    public zzYZ8() {
        this.zzXZw = com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{115, 65, 111, 112, 101, 115});
        try {
            zzYDB();
            if (zzYZ7.zzrR()) {
                this.zzXZy = com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{57, PatternStyle.DiagonalCross, PatternStyle.DiagonalCross, 102, 98, 56, PatternStyle.DiagonalCross, 56, 57, 55, 97, 55, 98, PatternStyle.DownwardDiagonal, 100, PatternStyle.UpwardDiagonal, 101, 98, 99, 57});
                this.zzXZx = com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{100, PatternStyle.DiagonalCross, PatternStyle.Vertical, 98, PatternStyle.Vertical, PatternStyle.DownwardDiagonal, PatternStyle.UpwardDiagonal, 102, 56, PatternStyle.DiagonalCross, PatternStyle.Horizontal, PatternStyle.DownwardDiagonal, 101, PatternStyle.DownwardDiagonal, 56, 97, 57, 57, 97, 97});
                this.zzXZN = com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{116, 104, 112, 116, 58, 115, PatternStyle.Shingle, PatternStyle.Shingle, 117, 112, 99, 114, 97, 104, 101, 115, 97, PatternStyle.DottedGrid, 105, 112, 113, PatternStyle.DottedGrid, PatternStyle.Divot, 97, 121, 100, 97, 110, 105, 98, PatternStyle.Divot, 99, 111, 99, PatternStyle.Shingle, 109, PatternStyle.Horizontal, 118, PatternStyle.Vertical, PatternStyle.Divot});
            } else {
                this.zzXZy = com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{101, 98, 55, 100, 102, 98, 100, 97, PatternStyle.Cross, PatternStyle.Cross, PatternStyle.Horizontal, PatternStyle.Wave, 97, PatternStyle.DownwardDiagonal, PatternStyle.Wave, 97, 97, 110, PatternStyle.DiagonalCross, 100});
                this.zzXZx = com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{PatternStyle.Horizontal, 55, 97, 98, 98, PatternStyle.Cross, 100, PatternStyle.Cross, 97, 102, 97, 97, 99, 104, PatternStyle.Horizontal, 122, PatternStyle.Horizontal, 57, 98, 100});
                this.zzXZN = com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{116, 104, 112, 116, 58, 115, PatternStyle.Shingle, PatternStyle.Shingle, 117, 112, 99, 114, 97, 104, 101, 115, 97, PatternStyle.DottedGrid, 105, 112, 100, PatternStyle.Divot, 110, 121, 98, 97, 99, 105, 99, PatternStyle.Divot, 109, 111, 118, PatternStyle.Shingle, PatternStyle.Divot, PatternStyle.Horizontal, PatternStyle.Vertical});
            }
            if (zzYZ7.zzXZl) {
                this.zzXZw = com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{114, 71, 117, 111, 68, 112, 99, 111, 115});
            }
        } catch (Exception unused) {
            throw new IllegalStateException(com.aspose.words.internal.zzZO0.zzhV().zzZn(this.zzXZs));
        }
    }

    private String zzIc(String str) {
        if (str == null || str.isEmpty()) {
            return this.zzXZw;
        }
        int length = str.length() - 32;
        return length <= 0 ? this.zzXZw : str.substring(0, length);
    }

    private static java.util.List<zzY8A> zzL(org.w3c.dom.Node node) {
        ArrayList arrayList = new ArrayList();
        org.w3c.dom.NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            org.w3c.dom.Node nodeItem = childNodes.item(i);
            zzY8A zzy8a = new zzY8A();
            arrayList.add(zzy8a);
            org.w3c.dom.NodeList childNodes2 = nodeItem.getChildNodes();
            for (int i2 = 0; i2 < childNodes2.getLength(); i2++) {
                org.w3c.dom.Node nodeItem2 = childNodes2.item(i2);
                String nodeName = nodeItem2.getNodeName();
                String textContent = nodeItem2.getTextContent();
                if (com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{117, 83, 115, 98, 114, 99, 112, 105, 105, 116, 110, 111, 100, 73}).equals(nodeName)) {
                    zzy8a.zzXe(Long.parseLong(textContent));
                } else if (com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{114, 80, 100, 111, 99, 117, 73, 116, 101, 116, 73, 109, 100}).equals(nodeName)) {
                    zzy8a.zzXd(Long.parseLong(textContent));
                } else if (com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{117, 81, 110, 97, 105, 116, 121, 116}).equals(nodeName)) {
                    zzy8a.zzY(new BigDecimal(textContent));
                } else if (com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{112, 85, 97, 100, 101, 116, 101, 68, 99, 115, 105, 114, 116, 112, 111, 105, 110}).equals(nodeName)) {
                    zzy8a.zzAA(textContent);
                } else if (com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{97, 78, 101, 109}).equals(nodeName)) {
                    zzy8a.setName(textContent);
                } else if (com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{110, 85, 116, 105, 97, 78, 101, 109}).equals(nodeName)) {
                    zzy8a.zzAz(textContent);
                } else if (com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{115, 73, 117, 81, 110, 97, 105, 116, 121, 116, 99, 65, 117, 99, 117, 109, 97, 108, 101, 116, 100}).equals(nodeName)) {
                    zzy8a.zzPY(Boolean.parseBoolean(textContent));
                }
            }
        }
        return arrayList;
    }

    private static zzYKV zzM(org.w3c.dom.Node node) {
        zzYKV zzykv = new zzYKV();
        org.w3c.dom.NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            org.w3c.dom.Node nodeItem = childNodes.item(i);
            if (com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{100, 73}).equals(nodeItem.getNodeName())) {
                zzykv.zzXp(Long.parseLong(nodeItem.getTextContent()));
            } else if (com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{97, 78, 101, 109}).equals(nodeItem.getNodeName())) {
                zzykv.setName(nodeItem.getTextContent());
            } else if (com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{114, 80, 100, 111, 99, 117, 73, 116, 100}).equals(nodeItem.getNodeName())) {
                zzykv.zzXo(Long.parseLong(nodeItem.getTextContent()));
            } else if (com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{114, 80, 100, 111, 99, 117, 73, 116, 101, 116, 115, 109, 105, 76, 116, 115}).equals(nodeItem.getNodeName())) {
                org.w3c.dom.NodeList childNodes2 = nodeItem.getChildNodes();
                for (int i2 = 0; i2 < childNodes2.getLength(); i2++) {
                    org.w3c.dom.Node nodeItem2 = childNodes2.item(i2);
                    zzYKR zzykr = new zzYKR();
                    zzykv.zzYmw().add(zzykr);
                    org.w3c.dom.NodeList childNodes3 = nodeItem2.getChildNodes();
                    for (int i3 = 0; i3 < childNodes3.getLength(); i3++) {
                        org.w3c.dom.Node nodeItem3 = childNodes3.item(i3);
                        if (com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{100, 73}).equals(nodeItem3.getNodeName())) {
                            zzykr.zzXp(Long.parseLong(nodeItem3.getTextContent()));
                        } else if (com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{97, 78, 101, 109}).equals(nodeItem3.getNodeName())) {
                            zzykr.setName(nodeItem3.getTextContent());
                        }
                    }
                }
            }
        }
        return zzykv;
    }

    private static zzYKT zzN(org.w3c.dom.Node node) {
        zzYKT zzykt = new zzYKT();
        org.w3c.dom.NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            org.w3c.dom.Node nodeItem = childNodes.item(i);
            if (com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{100, 73}).equals(nodeItem.getNodeName())) {
                zzykt.zzXp(Long.parseLong(nodeItem.getTextContent()));
            } else if (com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{97, 78, 101, 109}).equals(nodeItem.getNodeName())) {
                zzykt.setName(nodeItem.getTextContent());
            } else if (com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{114, 80, 99, 105, 110, 105, 80, 103, 97, 108, 115, 110}).equals(nodeItem.getNodeName())) {
                org.w3c.dom.NodeList childNodes2 = nodeItem.getChildNodes();
                for (int i2 = 0; i2 < childNodes2.getLength(); i2++) {
                    zzykt.zzYmu().add(zzM(childNodes2.item(i2)));
                }
            }
        }
        return zzykt;
    }

    private static zzY8B zzO(org.w3c.dom.Node node) {
        zzY8B zzy8b = new zzY8B();
        org.w3c.dom.NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            org.w3c.dom.Node nodeItem = childNodes.item(i);
            if (com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{117, 83, 115, 98, 114, 99, 112, 105, 105, 116, 110, 111, 114, 80, 99, 105, 110, 105, 80, 103, 97, 108, 115, 110}).equals(nodeItem.getNodeName())) {
                org.w3c.dom.NodeList childNodes2 = nodeItem.getChildNodes();
                for (int i2 = 0; i2 < childNodes2.getLength(); i2++) {
                    org.w3c.dom.Node nodeItem2 = childNodes2.item(i2);
                    zzY89 zzy89 = new zzY89();
                    zzy8b.zzY1O().add(zzy89);
                    org.w3c.dom.NodeList childNodes3 = nodeItem2.getChildNodes();
                    for (int i3 = 0; i3 < childNodes3.getLength(); i3++) {
                        org.w3c.dom.Node nodeItem3 = childNodes3.item(i3);
                        if (com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{100, 73}).equals(nodeItem3.getNodeName())) {
                            zzy89.zzXp(Long.parseLong(nodeItem3.getTextContent()));
                        } else if (com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{114, 80, 100, 111, 99, 117, 80, 116, 105, 114, 105, 99, 103, 110, 108, 80, 110, 97}).equals(nodeItem3.getNodeName())) {
                            zzy89.zzZ(zzM(nodeItem3));
                        }
                    }
                }
            } else if (com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{100, 73}).equals(nodeItem.getNodeName())) {
                zzy8b.zzXp(Long.parseLong(nodeItem.getTextContent()));
            } else if (com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{105, 70, 116, 108, 114, 101, 100, 101, 116, 83, 116, 97, 115, 117}).equals(nodeItem.getNodeName())) {
                zzy8b.zzAB(nodeItem.getTextContent());
            }
        }
        return zzy8b;
    }

    private zzYKT zzW(Long l) throws zzYZA {
        zzYZ9 zzyz9ZzZ = zzYZ9.zzZ(new zzYZ4(this.zzXZy, this.zzXZx), this.zzXZN);
        String strReplaceAll = com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{112, PatternStyle.Shingle, 111, 114, 117, 100, 116, 99, PatternStyle.Shingle, 115, 105, 123, 125, 100}).replace(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{102, 123, 114, 111, 97, 109, 125, 116}), com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{109, 120, 108})).replaceAll(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{PatternStyle.Plaid, 92}), "");
        String strZzYP = com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{69, 71, 84});
        HashMap map = new HashMap();
        new HashMap();
        if (l != null) {
            strReplaceAll = strReplaceAll.replace("{id}", zzYZ9.zzY(l));
        }
        String strZzZ = zzyz9ZzZ.zzZ(strReplaceAll.replaceAll("\\{\\w*\\}", ""), strZzYP, map, null);
        if (strZzZ.length() == 0) {
            return null;
        }
        try {
            InputSource inputSource = new InputSource(new StringReader(strZzZ));
            DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
            documentBuilderFactoryNewInstance.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
            Element documentElement = documentBuilderFactoryNewInstance.newDocumentBuilder().parse(inputSource).getDocumentElement();
            if (documentElement != null) {
                return zzN(documentElement);
            }
            return null;
        } catch (Exception e) {
            StringBuilder sbOooO0OO = C22218Oooo.OooO0OO(strZzZ);
            sbOooO0OO.append(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{69, 32, 114, 114, 114, 111, 105, 32, 32, 110, 111, 99, 118, 110, 114, 101, 105, 116, 103, 110, 114, 32, 115, 101, 111, 112, 115, 110, 32, 101, 115, 106, 110, 111, 118, 32, 108, 97, 101, 117, 116, 32, 32, 111, 97, 106, 97, 118, 111, 32, 106, 98, 99, 101, 32, 116, 32, 58}));
            sbOooO0OO.append(e.getMessage());
            throw new zzYZA(1006, sbOooO0OO.toString());
        }
    }

    private void zzWM(double d) {
        long j = (long) d;
        long j2 = j ^ (j << 21);
        long j3 = j2 ^ (j2 >>> 35);
        this.zzXZz = j3 ^ (j3 << 4);
    }

    private static void zzX(zzYZ8 zzyz8) {
        zzXZF = zzyz8;
        if (zzyz8 != null) {
            zzZ5R.zzZ(zzyz8);
        }
    }

    private static boolean zzY(java.util.List<zzY8B> list) {
        String strZzY1N;
        if (list != null && list.size() > 0 && (strZzY1N = list.get(0).zzY1N()) != null) {
            String lowerCase = strZzY1N.toLowerCase();
            if (lowerCase.contains(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{99, 97, 105, 116, 101, 118})) || lowerCase.contains(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{114, 116, 97, 105, 105, 108, 103, 110})) || lowerCase.contains(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{105, 98, 108, 108, 111, 110, 112, 116, 105, 97, 111, 100, 116, 110, 109, 105, 114, 101, 116, 101, 121, 114, 110, 105, 103}))) {
                return true;
            }
        }
        return false;
    }

    private void zzYDA() {
        zzZ5R.zzYRo();
        if ((zzZ5R.zzYeM ^ 29273535023874148L) != 7163086397114115428L) {
            throw new IllegalStateException();
        }
        if (this.zzXZA == 0) {
            zzWM((Math.random() * 10.0d) + 1.0d);
        }
    }

    private void zzYDB() {
        try {
            zzYDA();
            zzYDz();
        } catch (Exception unused) {
            throw new IllegalStateException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0202 A[PHI: r16 r18
      0x0202: PHI (r16v5 long) = (r16v2 long), (r16v6 long), (r16v12 long) binds: [B:18:0x0046, B:89:0x020c, B:142:0x0202] A[DONT_GENERATE, DONT_INLINE]
      0x0202: PHI (r18v3 long) = (r18v0 long), (r18v4 long), (r18v10 long) binds: [B:18:0x0046, B:89:0x020c, B:142:0x0202] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x020e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzYDD() {
        long j;
        long j2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        java.util.List<zzY8B> listZzYH;
        if (this.zzXZE == null || this.zzXZD == null) {
            return;
        }
        BigDecimal bigDecimalZzYWc = zzYZ6.zzYDx().zzYWc();
        long jZzYWb = zzYZ6.zzYDx().zzYWb();
        if (bigDecimalZzYWc.compareTo(BigDecimal.ZERO) == 0 && jZzYWb == 0) {
            return;
        }
        try {
            listZzYH = zzYH(this.zzXZE, this.zzXZD);
        } catch (zzYZA e) {
            e = e;
            j = C18385v2.f56338j;
        } catch (Exception unused) {
            j = C18385v2.f56338j;
        }
        if (!zzY(listZzYH)) {
            zzYDH();
            return;
        }
        if (listZzYH != null && listZzYH.size() > 0 && listZzYH.get(0).zzY1O() != null && listZzYH.get(0).zzY1O().size() > 0 && listZzYH.get(0).zzY1O().get(0).zzY1G() != null) {
            zzYKV zzykvZzY1G = listZzYH.get(0).zzY1O().get(0).zzY1G();
            zzYKT zzyktZzW = zzW(Long.valueOf(zzykvZzY1G.zzYmv()));
            if (zzyktZzW != null) {
                Iterator<zzYKV> it = zzyktZzW.zzYmu().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    zzYKV next = it.next();
                    if (next.getId() == zzykvZzY1G.getId()) {
                        zzykvZzY1G = next;
                        break;
                    }
                }
            }
            ArrayList<zzYKR> arrayList = new ArrayList();
            for (zzYKR zzykr : zzykvZzY1G.zzYmw()) {
                j = C18385v2.f56338j;
                try {
                    if (bigDecimalZzYWc.compareTo(BigDecimal.ZERO) > 0 && com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{114, 80, 99, 111, 115, 101, 101, 115, 32, 100, 117, 81, 110, 97, 105, 116, 121, 116}).equals(zzykr.getName())) {
                        arrayList.add(zzykr);
                    } else if (jZzYWb > 0 && com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{114, 67, 100, 101, 116, 105, 115}).equals(zzykr.getName())) {
                        arrayList.add(zzykr);
                    }
                } catch (zzYZA e2) {
                    e = e2;
                    j2 = -1;
                    if (e.getCode() != 500) {
                        synchronized (zzYZ6.zzYDx().zzYWe()) {
                            try {
                                if (zzYZ6.zzYDx().zzYWg()[0] == j2) {
                                    zzYZ6.zzYDx().zzYWg()[0] = System.currentTimeMillis();
                                }
                                z4 = System.currentTimeMillis() - zzYZ6.zzYDx().zzYWg()[0] > j;
                            } finally {
                            }
                        }
                        z2 = z4;
                        z3 = true;
                    } else {
                        z3 = true;
                        z2 = true;
                    }
                    z = false;
                    if (z3) {
                    }
                    if (z2) {
                    }
                    if (z) {
                    }
                } catch (Exception unused2) {
                    j2 = -1;
                    z3 = true;
                    z2 = true;
                    z = false;
                    if (z3) {
                    }
                    if (z2) {
                    }
                    if (z) {
                    }
                }
            }
            j = C18385v2.f56338j;
            if (arrayList.size() > 0 && (bigDecimalZzYWc.compareTo(BigDecimal.ZERO) > 0 || jZzYWb > 0)) {
                ArrayList arrayList2 = new ArrayList();
                for (zzYKR zzykr2 : arrayList) {
                    if (com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{114, 80, 99, 111, 115, 101, 101, 115, 32, 100, 117, 81, 110, 97, 105, 116, 121, 116}).equals(zzykr2.getName())) {
                        zzY8A zzy8a = new zzY8A();
                        j2 = -1;
                        try {
                            zzy8a.zzXd(zzykr2.getId());
                            zzy8a.zzY(bigDecimalZzYWc);
                            zzy8a.zzXe(listZzYH.get(0).getId());
                            zzy8a.zzPY(true);
                            arrayList2.add(zzy8a);
                        } catch (zzYZA e3) {
                            e = e3;
                            if (e.getCode() != 500) {
                            }
                            z = false;
                            if (z3) {
                            }
                            if (z2) {
                            }
                            if (z) {
                            }
                        } catch (Exception unused3) {
                            z3 = true;
                            z2 = true;
                            z = false;
                            if (z3) {
                            }
                            if (z2) {
                            }
                            if (z) {
                            }
                        }
                    } else if (com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{114, 67, 100, 101, 116, 105, 115}).equals(zzykr2.getName())) {
                        zzY8A zzy8a2 = new zzY8A();
                        zzy8a2.zzXd(zzykr2.getId());
                        zzy8a2.zzY(BigDecimal.valueOf(jZzYWb));
                        zzy8a2.zzXe(listZzYH.get(0).getId());
                        zzy8a2.zzPY(true);
                        arrayList2.add(zzy8a2);
                    }
                }
                j2 = -1;
                try {
                    zzZ(Long.valueOf(listZzYH.get(0).getId()), arrayList2);
                    z3 = false;
                } catch (Exception unused4) {
                    z3 = true;
                }
                z2 = z3;
            }
            z = true;
            if (z3) {
                zzYZ6.zzYDx().zzZ(bigDecimalZzYWc, false);
                zzYZ6.zzYDx().zzQ(jZzYWb, false);
            }
            if (z2) {
                synchronized (zzYZ6.zzYDx().zzYWd()) {
                    zzYZ6.zzYDx().zzYWh()[0] = j2;
                    zzYZ6.zzYDx().zzYWf()[0] = 0;
                }
            } else {
                synchronized (zzYZ6.zzYDx().zzYWd()) {
                    try {
                        if (zzYZ6.zzYDx().zzYWh()[0] == j2) {
                            zzYZ6.zzYDx().zzYWh()[0] = System.currentTimeMillis();
                        }
                        int[] iArrZzYWf = zzYZ6.zzYDx().zzYWf();
                        iArrZzYWf[0] = iArrZzYWf[0] + 1;
                        if (System.currentTimeMillis() - zzYZ6.zzYDx().zzYWh()[0] > j && zzYZ6.zzYDx().zzYWf()[0] > 10) {
                            zzYDH();
                        }
                    } finally {
                    }
                }
            }
            if (z) {
                return;
            }
            synchronized (zzYZ6.zzYDx().zzYWe()) {
                zzYZ6.zzYDx().zzYWg()[0] = j2;
            }
            return;
        }
        j = C18385v2.f56338j;
        j2 = -1;
        z3 = true;
        z2 = false;
        z = true;
        if (z3) {
        }
        if (z2) {
        }
        if (z) {
        }
    }

    private static void zzYDH() {
        zzYZ8 zzyz8 = zzXZF;
        if (zzyz8 != null) {
            zzZ5R.zzY(zzyz8);
        }
        zzX(new zzYZ8());
    }

    public static byte[] zzYDI() {
        zzYZ8 zzyz8 = zzXZF;
        return (zzyz8 == null || zzyz8.zzXZB != 256) ? zzYZ0.zzYeD : zzYZ0.zzXZ1;
    }

    public static byte[] zzYDJ() {
        zzYZ8 zzyz8 = zzXZF;
        if (((zzyz8.zzXZA ^ 7536747) ^ zzyz8.zzXZz) == 1769172843) {
            return zzyz8.zzXZC != 256 ? zzYZ0.zzYeD : zzYZ0.zzXZ1;
        }
        throw new IllegalStateException(com.aspose.words.internal.zzZO0.zzhV().zzZn(zzXZm));
    }

    public static zzYZ8 zzYDK() {
        return zzXZF;
    }

    private void zzYDz() throws Exception {
        zzY0C.zzZN(null);
        if ((zzY0C.zzWTX ^ 7133812862090241280L) != 7163086397114115428L) {
            throw new IllegalStateException();
        }
        this.zzXZA = 1761636096 ^ this.zzXZz;
    }

    private java.util.List<zzY8B> zzYH(String str, String str2) {
        zzYZ9 zzyz9ZzZ = zzYZ9.zzZ(new zzYZ4(this.zzXZy, this.zzXZx), this.zzXZN);
        String strReplaceAll = com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{115, PatternStyle.Shingle, 98, 117, 99, 115, 105, 114, 116, 112, 111, 105, 115, 110, 115, PatternStyle.Shingle, 116, 105, PatternStyle.DottedGrid, 101, 115, 123, 116, 105, 83, 101, 98, 117, 111, 100, 97, 109, 110, 105, 63, 125, 116, 115, 116, 97, 115, 117, 123, 61, 116, 115, 116, 97, 115, 117, 38, 125, 97, 112, 101, 103, 117, 78, 98, 109, 114, 101, 123, 61, 97, 112, 101, 103, 117, 78, 98, 109, 114, 101, 38, 125, 97, 112, 101, 103, 105, 83, 101, 122, 123, 61, 97, 112, 101, 103, 105, 83, 101, 122, 38, 125, 117, 112, 108, 98, 99, 105, 112, 65, 75, 105, 121, 101, 123, 61, 117, 112, 108, 98, 99, 105, 112, 65, 75, 105, 121, 101, 38, 125, 114, 112, 118, 105, 116, 97, 65, 101, 105, 112, 101, 75, 61, 121, 112, 123, 105, 114, 97, 118, 101, 116, 112, 65, 75, 105, 121, 101, 125}).replace(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{102, 123, 114, 111, 97, 109, 125, 116}), com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{109, 120, 108})).replaceAll(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{PatternStyle.Plaid, 92}), "");
        String strZzYP = com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{69, 71, 84});
        HashMap map = new HashMap();
        new HashMap();
        String strZzZ = zzyz9ZzZ.zzZ(strReplaceAll.replace(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{115, 123, 116, 105, 83, 101, 98, 117, 111, 100, 97, 109, 110, 105, 125}), zzYZ9.zzId(zzIc(str.toLowerCase()))).replace(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{112, 123, 98, 117, 105, 108, 65, 99, 105, 112, 101, 75, 125, 121}), zzYZ9.zzId(str)).replace(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{112, 123, 105, 114, 97, 118, 101, 116, 112, 65, 75, 105, 121, 101, 125}), zzYZ9.zzId(str2)).replaceAll(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{123, 92, 119, 92, 92, PatternStyle.Plaid, 125}), ""), strZzYP, map, null);
        if (strZzZ.length() == 0) {
            return null;
        }
        try {
            InputSource inputSource = new InputSource(new StringReader(strZzZ));
            DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
            documentBuilderFactoryNewInstance.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
            Element documentElement = documentBuilderFactoryNewInstance.newDocumentBuilder().parse(inputSource).getDocumentElement();
            ArrayList arrayList = new ArrayList();
            if (documentElement != null) {
                org.w3c.dom.NodeList childNodes = documentElement.getChildNodes();
                for (int i = 0; i < childNodes.getLength(); i++) {
                    arrayList.add(zzO(childNodes.item(i)));
                }
            }
            return arrayList;
        } catch (Exception e) {
            StringBuilder sbOooO0OO = C22218Oooo.OooO0OO(strZzZ);
            sbOooO0OO.append(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{69, 32, 114, 114, 114, 111, 105, 32, 32, 110, 111, 99, 118, 110, 114, 101, 105, 116, 103, 110, 114, 32, 115, 101, 111, 112, 115, 110, 32, 101, 115, 106, 110, 111, 118, 32, 108, 97, 101, 117, 116, 32, 32, 111, 97, 106, 97, 118, 111, 32, 106, 98, 99, 101, 32, 116, 32, 58}));
            sbOooO0OO.append(e.getMessage());
            throw new zzYZA(1006, sbOooO0OO.toString());
        }
    }

    private void zzZ(Long l, java.util.List<zzY8A> list) throws zzYZA {
        zzYZ9 zzyz9ZzZ = zzYZ9.zzZ(new zzYZ4(this.zzXZy, this.zzXZx), this.zzXZN);
        String strReplaceAll = com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{115, PatternStyle.Shingle, 98, 117, 99, 115, 105, 114, 116, 112, 111, 105, 115, 110, 123, PatternStyle.Shingle, 100, 105, PatternStyle.Shingle, 125, 116, 105, 109, 101, 115}).replace(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{102, 123, 114, 111, 97, 109, 125, 116}), com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{115, 106, 110, 111})).replaceAll(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{PatternStyle.Plaid, 92}), "");
        String strZzYP = com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{85, 80, 84});
        HashMap map = new HashMap();
        new HashMap();
        zzyz9ZzZ.zzZ(strReplaceAll.replace("{id}", zzYZ9.zzY(l)).replaceAll("\\{\\w*\\}", ""), strZzYP, map, zzX(list));
    }

    public final String getProductName() {
        String name = "";
        if (zzYDJ() != zzYZ0.zzXZ1) {
            return "";
        }
        String str = this.zzXZo;
        if (str != null) {
            return str;
        }
        java.util.List<zzY8B> listZzYH = zzYH(this.zzXZE, this.zzXZD);
        if (!zzY(listZzYH)) {
            zzYDH();
        } else if (listZzYH != null && listZzYH.size() > 0 && listZzYH.get(0).zzY1O() != null) {
            for (zzY89 zzy89 : listZzYH.get(0).zzY1O()) {
                if (zzy89 != null && zzy89.zzY1G() != null) {
                    zzYKT zzyktZzW = zzW(Long.valueOf(zzy89.zzY1G().zzYmv()));
                    if (!zzyktZzW.getName().endsWith("Support")) {
                        name = zzyktZzW.getName();
                    }
                }
            }
        }
        this.zzXZo = name;
        return name;
    }

    public final zzYZ2 zzYDC() {
        String productName = getProductName();
        return new zzYZ2(productName, zzZ5M.zzJm(productName).length > 0);
    }

    public final void zzYDE() {
        AtomicInteger atomicInteger = zzXZn;
        atomicInteger.getAndIncrement();
        try {
            zzYDD();
            atomicInteger.getAndDecrement();
        } catch (Throwable th) {
            zzXZn.getAndDecrement();
            throw th;
        }
    }

    public final BigDecimal zzYDF() {
        String str;
        String str2 = this.zzXZE;
        if (str2 == null || (str = this.zzXZD) == null) {
            throw new IllegalStateException(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{111, 89, 32, 117, 104, 115, 117, 111, 100, 108, 115, 32, 116, 101, 109, 32, 116, 101, 114, 101, 100, 101, 107, 32, 121, 101, 102, 32, 114, 105, 116, 115, 121, 108, PatternStyle.Divot}));
        }
        BigDecimal bigDecimal = BigDecimal.ZERO;
        try {
            java.util.List<zzY8B> listZzYH = zzYH(str2, str);
            if (listZzYH == null || listZzYH.size() <= 0) {
                throw new IllegalStateException(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{104, 84, 114, 101, 32, 101, 115, 105, 110, 32, 32, 111, 117, 115, 115, 98, 114, 99, 112, 105, 105, 116, 110, 111, PatternStyle.Divot}));
            }
            java.util.List<zzY8A> listZzX = zzX(Long.valueOf(listZzYH.get(0).getId()));
            if (listZzX != null && listZzX.size() > 0) {
                for (zzY8A zzy8a : listZzX) {
                    if (com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{114, 67, 100, 101, 116, 105, 115}).equals(zzy8a.getName())) {
                        return zzy8a.zzY1K();
                    }
                }
            }
            return bigDecimal;
        } catch (Exception e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

    public final BigDecimal zzYDG() {
        String str;
        String str2 = this.zzXZE;
        if (str2 == null || (str = this.zzXZD) == null) {
            throw new IllegalStateException(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{111, 89, 32, 117, 104, 115, 117, 111, 100, 108, 115, 32, 116, 101, 109, 32, 116, 101, 114, 101, 100, 101, 107, 32, 121, 101, 102, 32, 114, 105, 116, 115, 121, 108, PatternStyle.Divot}));
        }
        BigDecimal bigDecimal = BigDecimal.ZERO;
        try {
            java.util.List<zzY8B> listZzYH = zzYH(str2, str);
            if (listZzYH == null || listZzYH.size() <= 0) {
                throw new IllegalStateException(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{104, 84, 114, 101, 32, 101, 115, 105, 110, 32, 32, 111, 117, 115, 115, 98, 114, 99, 112, 105, 105, 116, 110, 111, PatternStyle.Divot}));
            }
            java.util.List<zzY8A> listZzX = zzX(Long.valueOf(listZzYH.get(0).getId()));
            if (listZzX != null && listZzX.size() > 0) {
                for (zzY8A zzy8a : listZzX) {
                    if (com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{114, 80, 99, 111, 115, 101, 101, 115, 32, 100, 117, 81, 110, 97, 105, 116, 121, 116}).equals(zzy8a.getName())) {
                        return zzy8a.zzY1K();
                    }
                }
            }
            return bigDecimal;
        } catch (Exception e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzYI(String str, String str2) {
        boolean z;
        boolean zZzY;
        this.zzXZo = null;
        if (str == null || str2 == null) {
            z = false;
            zZzY = false;
        } else {
            z = true;
            try {
                if (str.length() != 0 && str2.length() != 0) {
                    java.util.List<zzY8B> listZzYH = zzYH(str, str2);
                    if (listZzYH != null) {
                        listZzYH.size();
                    }
                    zZzY = zzY(listZzYH);
                    if (zZzY) {
                        this.zzXZE = str;
                        this.zzXZD = str2;
                        this.zzXZC = 256;
                        this.zzXZB = 256;
                        zzX(this);
                    }
                }
            } catch (zzYZA e) {
                if (e.getCode() == 500) {
                    synchronized (zzYZ6.zzYDx().zzYWe()) {
                        try {
                            if (zzYZ6.zzYDx().zzYWg()[0] == -1) {
                                zzYZ6.zzYDx().zzYWg()[0] = System.currentTimeMillis();
                            }
                            if (System.currentTimeMillis() - zzYZ6.zzYDx().zzYWg()[0] > C18385v2.f56338j) {
                                z = false;
                            } else {
                                this.zzXZE = str;
                                this.zzXZD = str2;
                                this.zzXZC = 256;
                                this.zzXZB = 256;
                                zzX(this);
                            }
                            zZzY = z;
                            z = false;
                        } finally {
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        if (z) {
            synchronized (zzYZ6.zzYDx().zzYWe()) {
                zzYZ6.zzYDx().zzYWg()[0] = -1;
            }
        }
        return zZzY;
    }

    private java.util.List<zzY8A> zzX(Long l) throws zzYZA {
        zzYZ9 zzyz9ZzZ = zzYZ9.zzZ(new zzYZ4(this.zzXZy, this.zzXZx), this.zzXZN);
        String strReplaceAll = com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{115, PatternStyle.Shingle, 98, 117, 99, 115, 105, 114, 116, 112, 111, 105, 115, 110, 123, PatternStyle.Shingle, 100, 105, PatternStyle.Shingle, 125, 116, 105, 109, 101, 115}).replace(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{102, 123, 114, 111, 97, 109, 125, 116}), com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{109, 120, 108})).replaceAll(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{PatternStyle.Plaid, 92}), "");
        String strZzYP = com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{69, 71, 84});
        HashMap map = new HashMap();
        new HashMap();
        if (l != null) {
            strReplaceAll = strReplaceAll.replace("{id}", zzYZ9.zzY(l));
        }
        String strZzZ = zzyz9ZzZ.zzZ(strReplaceAll.replaceAll("\\{\\w*\\}", ""), strZzYP, map, null);
        if (strZzZ.length() == 0) {
            return null;
        }
        try {
            InputSource inputSource = new InputSource(new StringReader(strZzZ));
            DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
            documentBuilderFactoryNewInstance.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
            Element documentElement = documentBuilderFactoryNewInstance.newDocumentBuilder().parse(inputSource).getDocumentElement();
            if (documentElement != null) {
                return zzL(documentElement);
            }
            return new ArrayList();
        } catch (Exception e) {
            StringBuilder sbOooO0OO = C22218Oooo.OooO0OO(strZzZ);
            sbOooO0OO.append(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{69, 32, 114, 114, 114, 111, 105, 32, 32, 110, 111, 99, 118, 110, 114, 101, 105, 116, 103, 110, 114, 32, 115, 101, 111, 112, 115, 110, 32, 101, 115, 106, 110, 111, 118, 32, 108, 97, 101, 117, 116, 32, 32, 111, 97, 106, 97, 118, 111, 32, 106, 98, 99, 101, 32, 116, 32, 58}));
            sbOooO0OO.append(e.getMessage());
            throw new zzYZA(1006, sbOooO0OO.toString());
        }
    }

    private static String zzX(java.util.List<zzY8A> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{63, 60, 109, 120, 32, 108, 101, 118, 115, 114, 111, 105, 61, 110, PatternStyle.Horizontal, 34, PatternStyle.Wave, PatternStyle.Divot, 32, 34, 110, 101, 111, 99, 105, 100, 103, 110, 34, 61, 116, 117, PatternStyle.DottedGrid, 102, 34, 56, 62, 63}));
        sb.append(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{65, 60, 114, 114, 121, 97, 102, 79, 117, 83, 115, 98, 114, 99, 112, 105, 105, 116, 110, 111, 116, 73, 109, 101, 120, 32, 108, 109, 115, 110, 120, 58, 100, 115, 34, 61, 116, 104, 112, 116, PatternStyle.Shingle, 58, 119, PatternStyle.Shingle, 119, 119, 119, PatternStyle.Divot, PatternStyle.Divot, PatternStyle.Cross, 114, 111, PatternStyle.Shingle, 103, PatternStyle.Wave, PatternStyle.Vertical, PatternStyle.Horizontal, PatternStyle.Wave, 88, PatternStyle.Shingle, 76, 77, 99, 83, 101, 104, 97, 109, 32, 34, 109, 120, 110, 108, 58, 115, 115, 120, 61, 105, 104, 34, 116, 116, 58, 112, PatternStyle.Shingle, PatternStyle.Shingle, 119, 119, PatternStyle.Divot, 119, PatternStyle.Cross, 119, 111, PatternStyle.Divot, 103, 114, PatternStyle.Vertical, PatternStyle.Shingle, PatternStyle.Wave, PatternStyle.Wave, PatternStyle.Shingle, PatternStyle.Horizontal, 77, 88, 83, 76, 104, 99, 109, 101, PatternStyle.DottedGrid, 97, 110, 105, 116, 115, 110, 97, 101, 99, 62, 34}));
        for (zzY8A zzy8a : list) {
            sb.append(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{83, 60, 98, 117, 99, 115, 105, 114, 116, 112, 111, 105, 73, 110, 101, 116, 62, 109}));
            if (zzy8a.zzY1J() != null) {
                sb.append(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{85, 60, 100, 112, 116, 97, 68, 101, 115, 101, 114, 99, 112, 105, 105, 116, 110, 111, 62}) + zzy8a.zzY1J() + com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{PatternStyle.Shingle, 60, 112, 85, 97, 100, 101, 116, 101, 68, 99, 115, 105, 114, 116, 112, 111, 105, 62, 110}));
            }
            sb.append(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{73, 60, 81, 115, 97, 117, 116, 110, 116, 105, 65, 121, 99, 99, 109, 117, 108, 117, 116, 97, 100, 101, 62}) + String.valueOf(zzy8a.zzY1H()) + com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{PatternStyle.Shingle, 60, 115, 73, 117, 81, 110, 97, 105, 116, 121, 116, 99, 65, 117, 99, 117, 109, 97, 108, 101, 116, 62, 100}));
            if (zzy8a.getName() != null) {
                sb.append(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{78, 60, 109, 97, 62, 101}) + zzy8a.getName() + com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{PatternStyle.Shingle, 60, 97, 78, 101, 109, 62}));
            }
            sb.append(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{80, 60, 111, 114, 117, 100, 116, 99, 116, 73, 109, 101, 100, 73, 62}) + String.valueOf(zzy8a.zzY1L()) + com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{PatternStyle.Shingle, 60, 114, 80, 100, 111, 99, 117, 73, 116, 101, 116, 73, 109, 62, 100}));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{81, 60, 97, 117, 116, 110, 116, 105, 62, 121}));
            sb2.append(zzy8a.zzY1K() == null ? com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{117, 110, 108, 108}) : String.format(Locale.US, com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{102, 37}), zzy8a.zzY1K()));
            sb2.append(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{PatternStyle.Shingle, 60, 117, 81, 110, 97, 105, 116, 121, 116, 62}));
            sb.append(sb2.toString());
            sb.append(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{83, 60, 98, 117, 99, 115, 105, 114, 116, 112, 111, 105, 73, 110, 62, 100}) + String.valueOf(zzy8a.zzY1M()) + com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{PatternStyle.Shingle, 60, 117, 83, 115, 98, 114, 99, 112, 105, 105, 116, 110, 111, 100, 73, 62}));
            if (zzy8a.zzY1I() != null) {
                sb.append(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{85, 60, 105, 110, 78, 116, 109, 97, 62, 101}) + zzy8a.zzY1I() + com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{PatternStyle.Shingle, 60, 110, 85, 116, 105, 97, 78, 101, 109, 62}));
            }
            sb.append(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{67, 60, 97, 104, 103, 110, 115, 101, 105, 72, 116, 115, 114, 111, 32, 121, 62, PatternStyle.Shingle}));
            sb.append(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{PatternStyle.Shingle, 60, 117, 83, 115, 98, 114, 99, 112, 105, 105, 116, 110, 111, 116, 73, 109, 101, 62}));
        }
        sb.append(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{PatternStyle.Shingle, 60, 114, 65, 97, 114, 79, 121, 83, 102, 98, 117, 99, 115, 105, 114, 116, 112, 111, 105, 73, 110, 101, 116, 62, 109}));
        return sb.toString();
    }
}
