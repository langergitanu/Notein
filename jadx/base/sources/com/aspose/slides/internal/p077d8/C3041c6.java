package com.aspose.slides.internal.p077d8;

import OooOO0.OooO0OO;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.huawei.hms.network.embedded.C18385v2;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

/* JADX INFO: renamed from: com.aspose.slides.internal.d8.c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3041c6 {

    /* JADX INFO: renamed from: k4 */
    static C3041c6 f8935k4 = new C3041c6();

    /* JADX INFO: renamed from: du */
    private String f8938du;

    /* JADX INFO: renamed from: dy */
    private String f8939dy;

    /* JADX INFO: renamed from: h4 */
    private String f8940h4;

    /* JADX INFO: renamed from: kk */
    private String f8942kk;

    /* JADX INFO: renamed from: m9 */
    private String f8943m9;

    /* JADX INFO: renamed from: x1 */
    private String f8945x1;

    /* JADX INFO: renamed from: to */
    private int f8944to = 4096;

    /* JADX INFO: renamed from: c5 */
    private final long f8936c5 = C18385v2.f56338j;

    /* JADX INFO: renamed from: jd */
    private final int f8941jd = 10;

    /* JADX INFO: renamed from: ck */
    private final long f8937ck = C18385v2.f56338j;

    public C3041c6() {
        String strM13017k4;
        this.f8939dy = C3076nv.m13017k4(C3049em.f9046to);
        if (C3089ts.f9174k4) {
            this.f8938du = C3076nv.m13017k4(C3049em.f9006b3);
            this.f8940h4 = C3076nv.m13017k4(C3049em.f9059wy);
            strM13017k4 = C3076nv.m13017k4(C3049em.f9004ak);
        } else {
            this.f8938du = C3076nv.m13017k4(C3049em.f9014dq);
            this.f8940h4 = C3076nv.m13017k4(C3049em.f9062xk);
            strM13017k4 = C3076nv.m13017k4(C3049em.f9011c6);
        }
        this.f8943m9 = strM13017k4;
        if (C3089ts.f9175x1) {
            this.f8939dy = C3076nv.m13017k4(C3049em.f9048ts);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static C3041c6 m12809k4() {
        return f8935k4;
    }

    /* JADX INFO: renamed from: kk */
    private C3086t6 m12814kk(Node node) {
        C3086t6 c3086t6 = new C3086t6();
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node nodeItem = childNodes.item(i);
            if ("Id".equals(nodeItem.getNodeName())) {
                c3086t6.m13113k4(Long.valueOf(Long.parseLong(nodeItem.getTextContent())));
            } else if ("Name".equals(nodeItem.getNodeName())) {
                c3086t6.m13114k4(nodeItem.getTextContent());
            } else if ("ProductId".equals(nodeItem.getNodeName())) {
                c3086t6.m13112k4(Long.parseLong(nodeItem.getTextContent()));
            } else if ("ProductItemsList".equals(nodeItem.getNodeName())) {
                NodeList childNodes2 = nodeItem.getChildNodes();
                for (int i2 = 0; i2 < childNodes2.getLength(); i2++) {
                    Node nodeItem2 = childNodes2.item(i2);
                    C3097vj c3097vj = new C3097vj();
                    c3086t6.m13111k4().add(c3097vj);
                    NodeList childNodes3 = nodeItem2.getChildNodes();
                    for (int i3 = 0; i3 < childNodes3.getLength(); i3++) {
                        Node nodeItem3 = childNodes3.item(i3);
                        if ("Id".equals(nodeItem3.getNodeName())) {
                            c3097vj.m13163k4(Long.valueOf(Long.parseLong(nodeItem3.getTextContent())));
                        } else if ("Name".equals(nodeItem3.getNodeName())) {
                            c3097vj.m13164k4(nodeItem3.getTextContent());
                        }
                    }
                }
            }
        }
        return c3086t6;
    }

    /* JADX INFO: renamed from: x1 */
    private C3107xw m12817x1(Long l) throws C3045dq {
        C3106xk c3106xkM13209k4 = C3106xk.m13209k4((InterfaceC3078qm) new C3039bz(this.f8938du, this.f8940h4), this.f8943m9, false);
        String strReplaceAll = "/products/{id}".replace("{format}", "xml").replaceAll("\\*", "");
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (l != null) {
            strReplaceAll = strReplaceAll.replace("{id}", C3106xk.m13211k4(l));
        }
        String strM13216k4 = c3106xkM13209k4.m13216k4(strReplaceAll.replaceAll("\\{\\w*\\}", ""), "GET", map, null, map2);
        if (strM13216k4 == null || strM13216k4.length() == 0) {
            return null;
        }
        try {
            InputSource inputSource = new InputSource(new StringReader(strM13216k4));
            DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
            documentBuilderFactoryNewInstance.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
            Element documentElement = documentBuilderFactoryNewInstance.newDocumentBuilder().parse(inputSource).getDocumentElement();
            if (documentElement != null) {
                return m12818x1(documentElement);
            }
            return null;
        } catch (Exception e) {
            throw new C3045dq(1006, new String[]{strM13216k4}, OooO0OO.OooO0Oo(e, new StringBuilder("Error in converting response json value to java object : ")), e);
        }
    }

    /* JADX INFO: renamed from: du */
    public double m12822du() {
        String str;
        String str2 = this.f8945x1;
        if (str2 == null || (str = this.f8942kk) == null) {
            throw new IllegalStateException("You should set metered key firstly.");
        }
        try {
            List<C3109y9> listM12820x1 = m12820x1(str2, str);
            if (listM12820x1 == null || listM12820x1.size() <= 0) {
                throw new IllegalStateException("There is no subscription.");
            }
            List<C3053gf> listM12811k4 = m12811k4(listM12820x1.get(0).m13230k4());
            if (listM12811k4 == null || listM12811k4.size() <= 0) {
                return 0.0d;
            }
            for (C3053gf c3053gf : listM12811k4) {
                if ("Credits".equals(c3053gf.m12908du())) {
                    return c3053gf.m12918to().doubleValue();
                }
            }
            return 0.0d;
        } catch (Exception e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x025a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f2  */
    /* JADX INFO: renamed from: h4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m12823h4() {
        long j;
        long j2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        List<C3109y9> listM12820x1;
        if (this.f8945x1 == null || this.f8942kk == null) {
            return;
        }
        double dM12905x1 = C3048e0.m12897k4().m12905x1();
        long jM12904kk = C3048e0.m12897k4().m12904kk();
        if (dM12905x1 == 0.0d && jM12904kk == 0) {
            return;
        }
        try {
            listM12820x1 = m12820x1(this.f8945x1, this.f8942kk);
        } catch (C3045dq e) {
            e = e;
            j = C18385v2.f56338j;
            j2 = -1;
            z = true;
        } catch (Exception unused) {
            j = C18385v2.f56338j;
            j2 = -1;
            z = true;
        }
        if (!m12813k4(listM12820x1)) {
            f8935k4 = new C3041c6();
            return;
        }
        if (listM12820x1 != null && listM12820x1.size() > 0 && listM12820x1.get(0).m13233kk() != null && listM12820x1.get(0).m13233kk().size() > 0 && listM12820x1.get(0).m13233kk().get(0).m12947k4() != null) {
            C3086t6 c3086t6M12947k4 = listM12820x1.get(0).m13233kk().get(0).m12947k4();
            C3107xw c3107xwM12817x1 = m12817x1(Long.valueOf(c3086t6M12947k4.m13115kk()));
            if (c3107xwM12817x1 != null) {
                Iterator<C3086t6> it = c3107xwM12817x1.m13219k4().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C3086t6 next = it.next();
                    if (next.m13116x1().longValue() == c3086t6M12947k4.m13116x1().longValue()) {
                        c3086t6M12947k4 = next;
                        break;
                    }
                }
            }
            ArrayList<C3097vj> arrayList = new ArrayList();
            Iterator<C3097vj> it2 = c3086t6M12947k4.m13111k4().iterator();
            while (true) {
                boolean zHasNext = it2.hasNext();
                j = C18385v2.f56338j;
                if (!zHasNext) {
                    break;
                }
                try {
                    C3097vj next2 = it2.next();
                    if (dM12905x1 > 0.0d) {
                        z = true;
                        try {
                            if ("Processed Quantity".equals(next2.m13162k4())) {
                            }
                            arrayList.add(next2);
                        } catch (C3045dq e2) {
                            e = e2;
                            j2 = -1;
                            if (e.m12839k4() == 500) {
                                C3048e0.m12897k4().f8989du.lock();
                                try {
                                    if (C3048e0.m12897k4().f8998to == j2) {
                                        C3048e0.m12897k4().f8998to = System.currentTimeMillis();
                                    }
                                    boolean z5 = System.currentTimeMillis() - C3048e0.m12897k4().f8998to > j ? z : false;
                                    C3048e0.m12897k4().f8989du.unlock();
                                    z4 = z5;
                                } catch (Throwable th) {
                                    throw th;
                                }
                            } else {
                                z4 = z;
                            }
                            z2 = false;
                            z3 = z;
                            if (z3) {
                            }
                            C3048e0.m12897k4().f8994kk.lock();
                            if (z4) {
                            }
                            if (z2) {
                            }
                        } catch (Exception unused2) {
                            j2 = -1;
                            z2 = false;
                            z3 = z;
                            z4 = z3;
                            if (z3) {
                            }
                            C3048e0.m12897k4().f8994kk.lock();
                            if (z4) {
                            }
                            if (z2) {
                            }
                        }
                    }
                    if (jM12904kk > 0 && "Credits".equals(next2.m13162k4())) {
                        arrayList.add(next2);
                    }
                } catch (C3045dq e3) {
                    e = e3;
                    z = true;
                    j2 = -1;
                    if (e.m12839k4() == 500) {
                    }
                    z2 = false;
                    z3 = z;
                    if (z3) {
                    }
                    C3048e0.m12897k4().f8994kk.lock();
                    if (z4) {
                    }
                    if (z2) {
                    }
                } catch (Exception unused3) {
                    z = true;
                    j2 = -1;
                    z2 = false;
                    z3 = z;
                    z4 = z3;
                    if (z3) {
                    }
                    C3048e0.m12897k4().f8994kk.lock();
                    if (z4) {
                    }
                    if (z2) {
                    }
                }
            }
            z = true;
            j2 = (arrayList.size() <= 0 || (dM12905x1 <= 0.0d && jM12904kk <= 0)) ? -1L : -1L;
            ArrayList arrayList2 = new ArrayList();
            for (C3097vj c3097vj : arrayList) {
                if ("Processed Quantity".equals(c3097vj.m13162k4())) {
                    C3053gf c3053gf = new C3053gf();
                    c3053gf.m12920x1(c3097vj.m13165x1());
                    c3053gf.m12912k4(Double.valueOf(dM12905x1));
                    c3053gf.m12913k4(listM12820x1.get(0).m13230k4());
                    c3053gf.m12911k4(Boolean.TRUE);
                    arrayList2.add(c3053gf);
                } else if ("Credits".equals(c3097vj.m13162k4())) {
                    C3053gf c3053gf2 = new C3053gf();
                    c3053gf2.m12920x1(c3097vj.m13165x1());
                    j2 = -1;
                    try {
                        c3053gf2.m12912k4(Double.valueOf(jM12904kk));
                        c3053gf2.m12913k4(listM12820x1.get(0).m13230k4());
                        c3053gf2.m12911k4(Boolean.TRUE);
                        arrayList2.add(c3053gf2);
                    } catch (C3045dq e4) {
                        e = e4;
                        if (e.m12839k4() == 500) {
                        }
                        z2 = false;
                        z3 = z;
                        if (z3) {
                        }
                        C3048e0.m12897k4().f8994kk.lock();
                        if (z4) {
                        }
                        if (z2) {
                        }
                    } catch (Exception unused4) {
                        z2 = false;
                        z3 = z;
                        z4 = z3;
                        if (z3) {
                        }
                        C3048e0.m12897k4().f8994kk.lock();
                        if (z4) {
                        }
                        if (z2) {
                        }
                    }
                }
            }
            j2 = -1;
            try {
                m12812k4(listM12820x1.get(0).m13230k4(), arrayList2);
                z3 = false;
            } catch (Exception unused5) {
                z3 = true;
            }
            z4 = z3;
            z2 = z;
            if (z3) {
                C3048e0.m12897k4().m12901k4(dM12905x1, false);
                C3048e0.m12897k4().m12903k4(jM12904kk, false);
            }
            C3048e0.m12897k4().f8994kk.lock();
            if (z4) {
                try {
                    C3048e0.m12897k4().f8993k4 = j2;
                    C3048e0.m12897k4().f9000x1 = 0;
                } finally {
                    C3048e0.m12897k4().f8994kk.unlock();
                }
            } else {
                try {
                    if (C3048e0.m12897k4().f8993k4 == j2) {
                        C3048e0.m12897k4().f8993k4 = System.currentTimeMillis();
                    }
                    C3048e0.m12897k4().f9000x1++;
                    if (System.currentTimeMillis() - C3048e0.m12897k4().f8993k4 > j && C3048e0.m12897k4().f9000x1 > 10) {
                        f8935k4 = new C3041c6();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z2) {
                return;
            }
            C3048e0.m12897k4().f8989du.lock();
            try {
                C3048e0.m12897k4().f8998to = -1L;
                return;
            } finally {
                C3048e0.m12897k4().f8989du.unlock();
            }
        }
        j = C18385v2.f56338j;
        z = true;
        z4 = false;
        z3 = z;
        z2 = z;
        if (z3) {
        }
        C3048e0.m12897k4().f8994kk.lock();
        if (z4) {
        }
        if (z2) {
        }
    }

    /* JADX INFO: renamed from: to */
    public double m12825to() {
        String str;
        String str2 = this.f8945x1;
        if (str2 == null || (str = this.f8942kk) == null) {
            throw new IllegalStateException("You should set metered key firstly.");
        }
        try {
            List<C3109y9> listM12820x1 = m12820x1(str2, str);
            if (listM12820x1 == null || listM12820x1.size() <= 0) {
                throw new IllegalStateException("There is no subscription.");
            }
            List<C3053gf> listM12811k4 = m12811k4(listM12820x1.get(0).m13230k4());
            if (listM12811k4 == null || listM12811k4.size() <= 0) {
                return 0.0d;
            }
            for (C3053gf c3053gf : listM12811k4) {
                if ("Processed Quantity".equals(c3053gf.m12908du())) {
                    return c3053gf.m12918to().doubleValue();
                }
            }
            return 0.0d;
        } catch (Exception e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: k4 */
    private C3109y9 m12810k4(Node node) {
        C3109y9 c3109y9 = new C3109y9();
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node nodeItem = childNodes.item(i);
            if ("SubscriptionPricingPlans".equals(nodeItem.getNodeName())) {
                NodeList childNodes2 = nodeItem.getChildNodes();
                for (int i2 = 0; i2 < childNodes2.getLength(); i2++) {
                    Node nodeItem2 = childNodes2.item(i2);
                    C3058ig c3058ig = new C3058ig();
                    c3109y9.m13233kk().add(c3058ig);
                    NodeList childNodes3 = nodeItem2.getChildNodes();
                    for (int i3 = 0; i3 < childNodes3.getLength(); i3++) {
                        Node nodeItem3 = childNodes3.item(i3);
                        if ("Id".equals(nodeItem3.getNodeName())) {
                            c3058ig.m12949k4(Long.valueOf(Long.parseLong(nodeItem3.getTextContent())));
                        } else if ("ProductPricingPlan".equals(nodeItem3.getNodeName())) {
                            c3058ig.m12948k4(m12814kk(nodeItem3));
                        }
                    }
                }
            } else if ("Id".equals(nodeItem.getNodeName())) {
                c3109y9.m13231k4(Long.valueOf(Long.parseLong(nodeItem.getTextContent())));
            } else if ("FilteredStatus".equals(nodeItem.getNodeName())) {
                c3109y9.m13232k4(nodeItem.getTextContent());
            }
        }
        return c3109y9;
    }

    /* JADX INFO: renamed from: kk */
    public static void m12815kk() {
        f8935k4 = new C3041c6();
    }

    /* JADX INFO: renamed from: to */
    private List<C3053gf> m12816to(Node node) {
        ArrayList arrayList = new ArrayList();
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node nodeItem = childNodes.item(i);
            C3053gf c3053gf = new C3053gf();
            arrayList.add(c3053gf);
            NodeList childNodes2 = nodeItem.getChildNodes();
            for (int i2 = 0; i2 < childNodes2.getLength(); i2++) {
                Node nodeItem2 = childNodes2.item(i2);
                String nodeName = nodeItem2.getNodeName();
                String textContent = nodeItem2.getTextContent();
                if ("SubscriptionId".equals(nodeName)) {
                    c3053gf.m12913k4(Long.valueOf(Long.parseLong(textContent)));
                } else if ("ProductItemId".equals(nodeName)) {
                    c3053gf.m12920x1(Long.valueOf(Long.parseLong(textContent)));
                } else if ("Quantity".equals(nodeName)) {
                    c3053gf.m12912k4(Double.valueOf(Double.parseDouble(textContent)));
                } else if ("UpdateDescription".equals(nodeName)) {
                    c3053gf.m12916kk(textContent);
                } else if ("Name".equals(nodeName)) {
                    c3053gf.m12921x1(textContent);
                } else if ("UnitName".equals(nodeName)) {
                    c3053gf.m12914k4(textContent);
                } else if ("IsQuantityAccumulated".equals(nodeName)) {
                    c3053gf.m12911k4(Boolean.valueOf(Boolean.parseBoolean(textContent)));
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k4 */
    private List<C3053gf> m12811k4(Long l) throws C3045dq {
        C3106xk c3106xkM13209k4 = C3106xk.m13209k4((InterfaceC3078qm) new C3039bz(this.f8938du, this.f8940h4), this.f8943m9, false);
        String strReplaceAll = "/subscriptions/{id}/items".replace("{format}", "xml").replaceAll("\\*", "");
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (l != null) {
            strReplaceAll = strReplaceAll.replace("{id}", C3106xk.m13211k4(l));
        }
        String strM13216k4 = c3106xkM13209k4.m13216k4(strReplaceAll.replaceAll("\\{\\w*\\}", ""), "GET", map, null, map2);
        if (strM13216k4 == null || strM13216k4.length() == 0) {
            return null;
        }
        try {
            InputSource inputSource = new InputSource(new StringReader(strM13216k4));
            DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
            documentBuilderFactoryNewInstance.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
            Element documentElement = documentBuilderFactoryNewInstance.newDocumentBuilder().parse(inputSource).getDocumentElement();
            return documentElement != null ? m12816to(documentElement) : new ArrayList();
        } catch (Exception e) {
            throw new C3045dq(1006, new String[]{strM13216k4}, OooO0OO.OooO0Oo(e, new StringBuilder("Error in converting response json value to java object : ")), e);
        }
    }

    /* JADX INFO: renamed from: x1 */
    private C3107xw m12818x1(Node node) {
        C3107xw c3107xw = new C3107xw();
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node nodeItem = childNodes.item(i);
            if ("Id".equals(nodeItem.getNodeName())) {
                c3107xw.m13220k4(Long.valueOf(Long.parseLong(nodeItem.getTextContent())));
            } else if ("Name".equals(nodeItem.getNodeName())) {
                c3107xw.m13221k4(nodeItem.getTextContent());
            } else if ("PricingPlans".equals(nodeItem.getNodeName())) {
                NodeList childNodes2 = nodeItem.getChildNodes();
                for (int i2 = 0; i2 < childNodes2.getLength(); i2++) {
                    c3107xw.m13219k4().add(m12814kk(childNodes2.item(i2)));
                }
            }
        }
        return c3107xw;
    }

    /* JADX INFO: renamed from: x1 */
    private String m12819x1(List<C3053gf> list) {
        StringBuilder sb = new StringBuilder("<?xml version=\"1.0\" encoding=\"utf-8\"?><ArrayOfSubscriptionItem xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">");
        for (C3053gf c3053gf : list) {
            sb.append("<SubscriptionItem>");
            if (c3053gf.m12909h4() != null) {
                sb.append("<UpdateDescription>" + c3053gf.m12909h4() + "</UpdateDescription>");
            }
            sb.append("<IsQuantityAccumulated>" + String.valueOf(c3053gf.m12917m9()) + "</IsQuantityAccumulated>");
            if (c3053gf.m12908du() != null) {
                sb.append("<Name>" + c3053gf.m12908du() + "</Name>");
            }
            sb.append("<ProductItemId>" + String.valueOf(c3053gf.m12919x1()) + "</ProductItemId>");
            StringBuilder sb2 = new StringBuilder("<Quantity>");
            sb2.append(c3053gf.m12918to() == null ? CloudMetaExtra.DEFINE_NON_PARENT_ID : String.format(Locale.US, "%f", c3053gf.m12918to()));
            sb2.append("</Quantity>");
            sb.append(sb2.toString());
            sb.append("<SubscriptionId>" + String.valueOf(c3053gf.m12910k4()) + "</SubscriptionId>");
            if (c3053gf.m12915kk() != null) {
                sb.append("<UnitName>" + c3053gf.m12915kk() + "</UnitName>");
            }
            sb.append("<ChangesHistory /></SubscriptionItem>");
        }
        sb.append("</ArrayOfSubscriptionItem>");
        return sb.toString();
    }

    /* JADX INFO: renamed from: k4 */
    private void m12812k4(Long l, List<C3053gf> list) throws C3045dq {
        C3106xk c3106xkM13209k4 = C3106xk.m13209k4((InterfaceC3078qm) new C3039bz(this.f8938du, this.f8940h4), this.f8943m9, false);
        String strReplaceAll = "/subscriptions/{id}/items".replace("{format}", "json").replaceAll("\\*", "");
        c3106xkM13209k4.m13216k4(strReplaceAll.replace("{id}", C3106xk.m13211k4(l)).replaceAll("\\{\\w*\\}", ""), "PUT", new HashMap(), m12819x1(list), new HashMap());
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x003a A[PHI: r7
      0x003a: PHI (r7v5 java.lang.String) = (r7v0 java.lang.String), (r7v1 java.lang.String), (r7v2 java.lang.String), (r7v3 java.lang.String) binds: [B:3:0x0038, B:6:0x0042, B:9:0x004b, B:12:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private List<C3109y9> m12820x1(String str, String str2) {
        C3106xk c3106xkM13209k4 = C3106xk.m13209k4((InterfaceC3078qm) new C3039bz(this.f8938du, this.f8940h4), this.f8943m9, false);
        String strReplaceAll = "/subscriptions/site-{siteSubdomain}?status={status}&pageNumber={pageNumber}&pageSize={pageSize}&publicApiKey={publicApiKey}&privateApiKey={privateApiKey}".replace("{format}", "xml").replaceAll("\\*", "");
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        String str3 = this.f8939dy;
        String lowerCase = str.toLowerCase();
        String str4 = "asposeforcloud";
        if (lowerCase.startsWith("asposeforcloud")) {
            str3 = str4;
        } else {
            str4 = "groupdocsforcloud2";
            if (!lowerCase.startsWith("groupdocsforcloud2")) {
                str4 = "conholdateforcloud";
                if (!lowerCase.startsWith("conholdateforcloud")) {
                    str4 = "conholdate";
                    if (lowerCase.startsWith("conholdate")) {
                    }
                }
            }
        }
        String strM13216k4 = c3106xkM13209k4.m13216k4(strReplaceAll.replace("{siteSubdomain}", C3106xk.m13215x1(str3)).replace("{publicApiKey}", C3106xk.m13215x1(str)).replace("{privateApiKey}", C3106xk.m13215x1(str2)).replaceAll("\\{\\w*\\}", ""), "GET", map, null, map2);
        if (strM13216k4 == null || strM13216k4.length() == 0) {
            return null;
        }
        try {
            InputSource inputSource = new InputSource(new StringReader(strM13216k4));
            DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
            documentBuilderFactoryNewInstance.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
            Element documentElement = documentBuilderFactoryNewInstance.newDocumentBuilder().parse(inputSource).getDocumentElement();
            ArrayList arrayList = new ArrayList();
            if (documentElement != null) {
                NodeList childNodes = documentElement.getChildNodes();
                for (int i = 0; i < childNodes.getLength(); i++) {
                    arrayList.add(m12810k4(childNodes.item(i)));
                }
            }
            return arrayList;
        } catch (Exception e) {
            throw new C3045dq(1006, new String[]{strM13216k4}, OooO0OO.OooO0Oo(e, new StringBuilder("Error in converting response json value to java object : ")), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0091  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m12824k4(String str, String str2) {
        boolean zM12813k4;
        boolean z;
        boolean z2 = false;
        if (str == null || str2 == null) {
            zM12813k4 = false;
            z = zM12813k4;
        } else {
            z = true;
            try {
                if (str.length() != 0 && str2.length() != 0) {
                    List<C3109y9> listM12820x1 = m12820x1(str, str2);
                    if (listM12820x1 != null) {
                        listM12820x1.size();
                    }
                    zM12813k4 = m12813k4(listM12820x1);
                    if (zM12813k4) {
                        this.f8945x1 = str;
                        this.f8942kk = str2;
                        this.f8944to = 256;
                        f8935k4 = this;
                    }
                    z2 = true;
                }
                z = zM12813k4;
            } catch (C3045dq e) {
                if (e.m12839k4() == 500) {
                    C3048e0.m12897k4().f8989du.lock();
                    try {
                        if (C3048e0.m12897k4().f8998to == -1) {
                            C3048e0.m12897k4().f8998to = System.currentTimeMillis();
                        }
                        if (System.currentTimeMillis() - C3048e0.m12897k4().f8998to > C18385v2.f56338j) {
                            z = false;
                        } else {
                            this.f8945x1 = str;
                            this.f8942kk = str2;
                            this.f8944to = 256;
                            f8935k4 = this;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception unused) {
                z = false;
            }
        }
        if (z2) {
            C3048e0.m12897k4().f8989du.lock();
            try {
                C3048e0.m12897k4().f8998to = -1L;
            } finally {
                C3048e0.m12897k4().f8989du.unlock();
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m12813k4(List<C3109y9> list) {
        String strM13234x1;
        if (list != null && list.size() > 0 && (strM13234x1 = list.get(0).m13234x1()) != null) {
            String lowerCase = strM13234x1.toLowerCase();
            if (lowerCase.contains(AppMeasurementSdk.ConditionalUserProperty.ACTIVE) || lowerCase.contains("trialing") || lowerCase.contains("billnotpaidontimeretrying")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: x1 */
    public static int[] m12821x1() {
        C3041c6 c3041c6 = f8935k4;
        return (c3041c6 == null || c3041c6.f8944to != 256) ? C3052g8.f9069k4 : C3052g8.f9070x1;
    }
}
