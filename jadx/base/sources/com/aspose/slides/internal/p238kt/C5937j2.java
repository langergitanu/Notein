package com.aspose.slides.internal.p238kt;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p174hz.AbstractC4705c6;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14052dq;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13901ga;
import com.aspose.slides.p559ms.System.Xml.AbstractC13911hq;
import com.aspose.slides.p559ms.System.Xml.AbstractC13943n5;
import com.aspose.slides.p559ms.System.Xml.C13950o3;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import com.aspose.slides.p559ms.System.Xml.C14010x0;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;
import com.huawei.hms.network.embedded.C18358t1;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.kt.j2 */
/* JADX INFO: loaded from: classes.dex */
public class C5937j2 {

    /* JADX INFO: renamed from: dy */
    private AbstractC4705c6 f16785dy;

    /* JADX INFO: renamed from: kk */
    private String f16790kk;

    /* JADX INFO: renamed from: m9 */
    private byte[] f16791m9;

    /* JADX INFO: renamed from: to */
    private String f16792to;

    /* JADX INFO: renamed from: x1 */
    private String f16793x1;

    /* JADX INFO: renamed from: fa */
    private C5984zj f16786fa = null;

    /* JADX INFO: renamed from: k4 */
    public C5921ck f16789k4 = null;

    /* JADX INFO: renamed from: du */
    private C5915bs f16784du = new C5915bs();

    /* JADX INFO: renamed from: c5 */
    private Object f16782c5 = null;

    /* JADX INFO: renamed from: jd */
    private int f16788jd = 2;

    /* JADX INFO: renamed from: ck */
    private C13981tl f16783ck = null;

    /* JADX INFO: renamed from: h4 */
    private String f16787h4 = "http://www.w3.org/2000/09/xmldsig#sha1";

    /* JADX INFO: renamed from: c5 */
    public final C13981tl m24010c5() {
        if (m24013h4()) {
            return this.f16783ck;
        }
        XmlDocument xmlDocument = new XmlDocument();
        xmlDocument.setPreserveWhitespace(true);
        return m24014k4(xmlDocument);
    }

    /* JADX INFO: renamed from: du */
    public final C5915bs m24011du() {
        if (this.f16784du == null) {
            this.f16784du = new C5915bs();
        }
        return this.f16784du;
    }

    /* JADX INFO: renamed from: dy */
    public final int m24012dy() {
        return this.f16788jd;
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m24013h4() {
        return this.f16783ck != null;
    }

    /* JADX INFO: renamed from: k4 */
    public final C13981tl m24014k4(XmlDocument xmlDocument) {
        C13981tl c13981tlCreateElement = xmlDocument.createElement("Reference", "http://www.w3.org/2000/09/xmldsig#");
        if (!C14113y2.m67411k4(this.f16793x1)) {
            c13981tlCreateElement.m65910kk("Id", this.f16793x1);
        }
        String str = this.f16790kk;
        if (str != null) {
            c13981tlCreateElement.m65910kk("URI", str);
        }
        if (!C14113y2.m67411k4(this.f16792to)) {
            c13981tlCreateElement.m65910kk("Type", this.f16792to);
        }
        if (m24011du().m23886k4() != 0) {
            c13981tlCreateElement.appendChild(m24011du().m23891k4(xmlDocument, "http://www.w3.org/2000/09/xmldsig#"));
        }
        if (C14113y2.m67411k4(this.f16787h4)) {
            throw new CryptographicException("A DigestMethod must be specified on a Reference prior to generating XML.");
        }
        C13981tl c13981tlCreateElement2 = xmlDocument.createElement("DigestMethod", "http://www.w3.org/2000/09/xmldsig#");
        c13981tlCreateElement2.m65910kk("Algorithm", this.f16787h4);
        c13981tlCreateElement.appendChild(c13981tlCreateElement2);
        if (m24026to() == null) {
            if (this.f16785dy.m19584fa() == null) {
                throw new CryptographicException("A Reference must contain a DigestValue.");
            }
            m24022k4(this.f16785dy.m19584fa());
        }
        C13981tl c13981tlCreateElement3 = xmlDocument.createElement("DigestValue", "http://www.w3.org/2000/09/xmldsig#");
        c13981tlCreateElement3.appendChild(xmlDocument.createTextNode(C14080ne.m66952k4(this.f16791m9)));
        c13981tlCreateElement.appendChild(c13981tlCreateElement3);
        return c13981tlCreateElement;
    }

    /* JADX INFO: renamed from: kk */
    public final String m24023kk() {
        return this.f16787h4;
    }

    /* JADX INFO: renamed from: m9 */
    public final C5984zj m24025m9() {
        return this.f16786fa;
    }

    /* JADX INFO: renamed from: to */
    public final byte[] m24026to() {
        return this.f16791m9;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m24027x1() {
        return this.f16790kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m24015k4() {
        return this.f16793x1;
    }

    /* JADX INFO: renamed from: kk */
    public final void m24024kk(String str) {
        this.f16787h4 = str;
        this.f16783ck = null;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m24028x1(String str) {
        this.f16792to = str;
        this.f16783ck = null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24016k4(C5915bs c5915bs) {
        this.f16784du = c5915bs;
        this.f16783ck = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x013f, code lost:
    
        r12 = r11.f16786fa.f16912kk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0143, code lost:
    
        if (r12 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0145, code lost:
    
        r11.f16789k4 = com.aspose.slides.internal.p238kt.C5934he.m23968k4(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x014e, code lost:
    
        r12 = r8;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] m24029x1(XmlDocument xmlDocument, C5921ck c5921ck) {
        AbstractC3150x6 abstractC3150x6M23887k4;
        XmlDocument xmlDocumentM23973k4;
        AbstractC13943n5 c14010x0;
        C5915bs c5915bsM24011du;
        AbstractC4705c6 abstractC4705c6 = (AbstractC4705c6) C5936ix.m24008k4(AbstractC4705c6.class, this.f16787h4);
        this.f16785dy = abstractC4705c6;
        if (abstractC4705c6 == null) {
            throw new CryptographicException("Could not create hash algorithm object.");
        }
        String strM67408k4 = xmlDocument == null ? C14113y2.m67408k4(C14052dq.m66565k4(), "\\") : xmlDocument.getBaseURI();
        AbstractC3150x6 abstractC3150x6 = null;
        try {
            int i = this.f16788jd;
            if (i == 0) {
                abstractC3150x6M23887k4 = m24011du().m23887k4((AbstractC3150x6) this.f16782c5, m24025m9().m24199k4() ? m24025m9().f16918x1 : new C14010x0(), strM67408k4);
            } else if (i == 1) {
                AbstractC13943n5 c14010x02 = m24025m9().m24199k4() ? m24025m9().f16918x1 : new C14010x0();
                abstractC3150x6M23887k4 = m24011du().m23888k4(C5934he.m23973k4((C13981tl) this.f16782c5, c14010x02, strM67408k4), c14010x02, strM67408k4);
            } else {
                if (i != 2) {
                    throw new CryptographicException("Unable to resolve Uri {0}.", this.f16790kk);
                }
                String str = this.f16790kk;
                if (str == null) {
                    abstractC3150x6M23887k4 = m24011du().m23887k4((AbstractC3150x6) null, m24025m9().m24199k4() ? m24025m9().f16918x1 : new C14010x0(), strM67408k4);
                } else {
                    if (str.length() == 0) {
                        if (xmlDocument == null) {
                            throw new CryptographicException(C14113y2.m67391k4(C11697x1.m55252to(), "An XmlDocument context is required to resolve the Reference Uri {0}.", this.f16790kk));
                        }
                        c14010x0 = m24025m9().m24199k4() ? m24025m9().f16918x1 : new C14010x0();
                        xmlDocumentM23973k4 = C5934he.m23970k4(C5934he.m23971k4(xmlDocument, c14010x0, strM67408k4));
                        c5915bsM24011du = m24011du();
                    } else {
                        if (this.f16790kk.charAt(0) != '#') {
                            throw new CryptographicException("Unable to resolve Uri {0}.", this.f16790kk);
                        }
                        boolean[] zArr = {true};
                        String strM23980k4 = C5934he.m23980k4(this.f16790kk, zArr);
                        boolean z = zArr[0];
                        if (!"xpointer(/)".equals(strM23980k4)) {
                            C13981tl c13981tlM24195k4 = m24025m9().m24195k4(xmlDocument, strM23980k4);
                            if (c13981tlM24195k4 != null) {
                                this.f16789k4 = C5934he.m23968k4((C13981tl) C7019kk.m27452k4((Object) c13981tlM24195k4.getParentNode(), C13981tl.class));
                            }
                            if (c13981tlM24195k4 == null && c5921ck != null) {
                                IEnumerator it = c5921ck.iterator();
                                while (true) {
                                    try {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        C13981tl c13981tl = (C13981tl) C7019kk.m27452k4(it.next(), C13981tl.class);
                                        if (c13981tl != null && C5934he.m23999to(c13981tl, "Id", "http://www.w3.org/2000/09/xmldsig#") && C14113y2.m67363du(C5934he.m23994kk(c13981tl, "Id", "http://www.w3.org/2000/09/xmldsig#"), strM23980k4)) {
                                            break;
                                        }
                                    } catch (Throwable th) {
                                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                            ((IDisposable) it).dispose();
                                        }
                                        throw th;
                                    }
                                }
                                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                    ((IDisposable) it).dispose();
                                }
                            }
                            if (c13981tlM24195k4 == null) {
                                throw new CryptographicException("Malformed reference element.");
                            }
                            xmlDocumentM23973k4 = C5934he.m23973k4(c13981tlM24195k4, (AbstractC13943n5) null, strM67408k4);
                            C5934he.m23984k4(xmlDocumentM23973k4.getDocumentElement(), this.f16789k4);
                            c14010x0 = m24025m9().m24199k4() ? m24025m9().f16918x1 : new C14010x0();
                            if (z) {
                                xmlDocumentM23973k4 = C5934he.m23970k4(xmlDocumentM23973k4);
                                c5915bsM24011du = m24011du();
                            } else {
                                c5915bsM24011du = m24011du();
                            }
                        } else {
                            if (xmlDocument == null) {
                                throw new CryptographicException(C14113y2.m67391k4(C11697x1.m55252to(), "An XmlDocument context is required to resolve the Reference Uri {0}.", this.f16790kk));
                            }
                            c14010x0 = m24025m9().m24199k4() ? m24025m9().f16918x1 : new C14010x0();
                            c5915bsM24011du = m24011du();
                            xmlDocumentM23973k4 = C5934he.m23971k4(xmlDocument, c14010x0, strM67408k4);
                        }
                    }
                    abstractC3150x6M23887k4 = c5915bsM24011du.m23888k4(xmlDocumentM23973k4, c14010x0, strM67408k4);
                }
            }
            AbstractC3150x6 abstractC3150x62 = abstractC3150x6M23887k4;
            byte[] bArrM19585k4 = this.f16785dy.m19585k4(abstractC3150x62);
            if (abstractC3150x62 != null) {
                abstractC3150x62.close();
            }
            return bArrM19585k4;
        } catch (Throwable th2) {
            if (0 != 0) {
                abstractC3150x6.close();
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24017k4(AbstractC5920ca abstractC5920ca) {
        if (abstractC5920ca == null) {
            throw new ArgumentNullException("transform");
        }
        abstractC5920ca.m23918k4(this);
        m24011du().m23892k4(abstractC5920ca);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24018k4(C5984zj c5984zj) {
        this.f16786fa = c5984zj;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24019k4(XmlDocument xmlDocument, C5921ck c5921ck) {
        m24022k4(m24029x1(xmlDocument, c5921ck));
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final void m24020k4(C13981tl c13981tl) {
        int i;
        int i2;
        if (c13981tl == null) {
            throw new ArgumentNullException("value");
        }
        this.f16793x1 = C5934he.m23994kk(c13981tl, "Id", "http://www.w3.org/2000/09/xmldsig#");
        this.f16790kk = C5934he.m23994kk(c13981tl, "URI", "http://www.w3.org/2000/09/xmldsig#");
        this.f16792to = C5934he.m23994kk(c13981tl, "Type", "http://www.w3.org/2000/09/xmldsig#");
        if (!C5934he.m23991k4(c13981tl, new String[]{"Id", "URI", "Type"})) {
            throw new CryptographicException("Malformed element {0}.", "Reference");
        }
        C13950o3 c13950o3 = new C13950o3(c13981tl.getOwnerDocument().getNameTable());
        c13950o3.mo65707k4("ds", "http://www.w3.org/2000/09/xmldsig#");
        m24016k4(new C5915bs());
        AbstractC13911hq abstractC13911hqSelectNodes = c13981tl.selectNodes("ds:Transforms", c13950o3);
        int i3 = 1;
        if (abstractC13911hqSelectNodes == null || abstractC13911hqSelectNodes.mo23932k4() == 0) {
            i = 1;
            i2 = 0;
        } else {
            if (abstractC13911hqSelectNodes.mo23932k4() > 1) {
                throw new CryptographicException("Malformed element {0}.", "Reference/Transforms");
            }
            C13981tl c13981tl2 = (C13981tl) C7019kk.m27452k4((Object) abstractC13911hqSelectNodes.m65457kk(0), C13981tl.class);
            if (!C5934he.m23991k4(c13981tl2, (String[]) C7019kk.m27458kk((Object) null, String[].class))) {
                throw new CryptographicException("Malformed element {0}.", "Reference/Transforms");
            }
            AbstractC13911hq abstractC13911hqSelectNodes2 = c13981tl2.selectNodes("ds:Transform", c13950o3);
            if (abstractC13911hqSelectNodes2 == null) {
                i = 1;
            } else {
                if (abstractC13911hqSelectNodes2.mo23932k4() != c13981tl2.selectNodes(C18358t1.g.f56183c).mo23932k4()) {
                    throw new CryptographicException("Malformed element {0}.", "Reference/Transforms");
                }
                if (abstractC13911hqSelectNodes2.mo23932k4() > 10) {
                    throw new CryptographicException("Malformed element {0}.", "Reference/Transforms");
                }
                IEnumerator it = abstractC13911hqSelectNodes2.iterator();
                while (it.hasNext()) {
                    try {
                        C13981tl c13981tl3 = (C13981tl) C7019kk.m27452k4(it.next(), C13981tl.class);
                        String strM23994kk = C5934he.m23994kk(c13981tl3, "Algorithm", "http://www.w3.org/2000/09/xmldsig#");
                        if (strM23994kk == null || !C5934he.m23989k4(c13981tl3, "Algorithm")) {
                            throw new CryptographicException("Unknown transform has been encountered.");
                        }
                        int i4 = i3;
                        AbstractC5920ca abstractC5920ca = (AbstractC5920ca) C5936ix.m24008k4(AbstractC5920ca.class, strM23994kk);
                        if (abstractC5920ca == null) {
                            throw new CryptographicException("Unknown transform has been encountered.");
                        }
                        m24017k4(abstractC5920ca);
                        abstractC5920ca.mo23920k4(c13981tl3.getChildNodes());
                        if (C7019kk.m27469x1(abstractC5920ca, C5950nv.class)) {
                            AbstractC13901ga abstractC13901gaSelectSingleNode = c13981tl3.selectSingleNode("ancestor::ds:Signature[1]", c13950o3);
                            AbstractC13911hq abstractC13911hqSelectNodes3 = c13981tl3.selectNodes("//ds:Signature", c13950o3);
                            if (abstractC13911hqSelectNodes3 != null) {
                                IEnumerator it2 = abstractC13911hqSelectNodes3.iterator();
                                int i5 = 0;
                                while (true) {
                                    try {
                                        if (!it2.hasNext()) {
                                            break;
                                        }
                                        AbstractC5920ca abstractC5920ca2 = abstractC5920ca;
                                        i5++;
                                        if (((AbstractC13901ga) it2.next()) == abstractC13901gaSelectSingleNode) {
                                            ((C5950nv) abstractC5920ca2).m24077k4(i5);
                                            break;
                                        }
                                        abstractC5920ca = abstractC5920ca2;
                                    } catch (Throwable th) {
                                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                                            ((IDisposable) it2).dispose();
                                        }
                                        throw th;
                                    }
                                }
                                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                                    ((IDisposable) it2).dispose();
                                }
                            } else {
                                continue;
                            }
                        }
                        i3 = i4;
                    } catch (Throwable th2) {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            ((IDisposable) it).dispose();
                        }
                        throw th2;
                    }
                }
                i = i3;
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
            }
            i2 = i;
        }
        AbstractC13911hq abstractC13911hqSelectNodes4 = c13981tl.selectNodes("ds:DigestMethod", c13950o3);
        if (abstractC13911hqSelectNodes4 == null || abstractC13911hqSelectNodes4.mo23932k4() == 0 || abstractC13911hqSelectNodes4.mo23932k4() > i) {
            throw new CryptographicException("Malformed element {0}.", "Reference/DigestMethod");
        }
        C13981tl c13981tl4 = (C13981tl) C7019kk.m27452k4((Object) abstractC13911hqSelectNodes4.m65457kk(0), C13981tl.class);
        String strM23994kk2 = C5934he.m23994kk(c13981tl4, "Algorithm", "http://www.w3.org/2000/09/xmldsig#");
        this.f16787h4 = strM23994kk2;
        if (strM23994kk2 == null || !C5934he.m23989k4(c13981tl4, "Algorithm")) {
            throw new CryptographicException("Malformed element {0}.", "Reference/DigestMethod");
        }
        AbstractC13911hq abstractC13911hqSelectNodes5 = c13981tl.selectNodes("ds:DigestValue", c13950o3);
        if (abstractC13911hqSelectNodes5 == null || abstractC13911hqSelectNodes5.mo23932k4() == 0 || abstractC13911hqSelectNodes5.mo23932k4() > 1) {
            throw new CryptographicException("Malformed element {0}.", "Reference/DigestValue");
        }
        C13981tl c13981tl5 = (C13981tl) C7019kk.m27452k4((Object) abstractC13911hqSelectNodes5.m65457kk(0), C13981tl.class);
        this.f16791m9 = C14080ne.m66934jd(C5934he.m23978k4(c13981tl5.getInnerText()));
        if (!C5934he.m23991k4(c13981tl5, (String[]) C7019kk.m27458kk((Object) null, String[].class))) {
            throw new CryptographicException("Malformed element {0}.", "Reference/DigestValue");
        }
        if (c13981tl.selectNodes(C18358t1.g.f56183c).mo23932k4() != (i2 != 0 ? 3 : 2)) {
            throw new CryptographicException("Malformed element {0}.", "Reference");
        }
        this.f16783ck = c13981tl;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24021k4(String str) {
        this.f16790kk = str;
        this.f16783ck = null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24022k4(byte[] bArr) {
        this.f16791m9 = bArr;
        this.f16783ck = null;
    }
}
