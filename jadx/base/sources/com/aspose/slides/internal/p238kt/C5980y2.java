package com.aspose.slides.internal.p238kt;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.Queue;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p174hz.AbstractC4736my;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13901ga;
import com.aspose.slides.p559ms.System.Xml.AbstractC13911hq;
import com.aspose.slides.p559ms.System.Xml.C13950o3;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import com.aspose.slides.p559ms.System.Xml.C14010x0;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;
import com.huawei.hms.network.embedded.C18437z2;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.kt.y2 */
/* JADX INFO: loaded from: classes.dex */
public class C5980y2 extends AbstractC5920ca {

    /* JADX INFO: renamed from: x1 */
    private AbstractC14068j5[] f16883x1 = {C7019kk.m27443k4((Class<?>) AbstractC3150x6.class), C7019kk.m27443k4((Class<?>) XmlDocument.class)};

    /* JADX INFO: renamed from: kk */
    private AbstractC14068j5[] f16880kk = {C7019kk.m27443k4((Class<?>) XmlDocument.class)};

    /* JADX INFO: renamed from: to */
    private AbstractC13911hq f16882to = null;

    /* JADX INFO: renamed from: du */
    private ArrayList f16877du = null;

    /* JADX INFO: renamed from: h4 */
    private C5982yd f16879h4 = null;

    /* JADX INFO: renamed from: m9 */
    private XmlDocument f16881m9 = null;

    /* JADX INFO: renamed from: dy */
    private C13950o3 f16878dy = null;

    public C5980y2() {
        m23931x1("http://www.w3.org/2002/07/decrypt#XML");
    }

    /* JADX INFO: renamed from: k4 */
    private void m24146k4(AbstractC3150x6 abstractC3150x6) {
        XmlDocument xmlDocument = new XmlDocument();
        xmlDocument.setPreserveWhitespace(true);
        xmlDocument.load(C5934he.m23976k4(abstractC3150x6, m23913h4() ? this.f16742k4 : new C14010x0(), m23917k4()));
        this.f16881m9 = xmlDocument;
        C13950o3 c13950o3 = new C13950o3(this.f16881m9.getNameTable());
        this.f16878dy = c13950o3;
        c13950o3.mo65707k4("enc", "http://www.w3.org/2001/04/xmlenc#");
        this.f16882to = xmlDocument.selectNodes("//enc:EncryptedData", this.f16878dy);
    }

    /* JADX INFO: renamed from: up */
    private ArrayList m24149up() {
        if (this.f16877du == null) {
            this.f16877du = new ArrayList();
        }
        return this.f16877du;
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5920ca
    /* JADX INFO: renamed from: c5 */
    public Object mo23909c5() {
        AbstractC13911hq abstractC13911hq = this.f16882to;
        if (abstractC13911hq != null) {
            m24151x1(abstractC13911hq);
        }
        C5934he.m23983k4(this.f16881m9.getDocumentElement(), m23910ck());
        return this.f16881m9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.internal.p238kt.AbstractC5920ca
    /* JADX INFO: renamed from: dy */
    public AbstractC13911hq mo23912dy() {
        if (m24149up().size() == 0) {
            return null;
        }
        XmlDocument xmlDocument = new XmlDocument();
        C13981tl c13981tlCreateElement = xmlDocument.createElement("Transform", "http://www.w3.org/2000/09/xmldsig#");
        if (!C14113y2.m67411k4(m23928to())) {
            c13981tlCreateElement.m65910kk("Algorithm", m23928to());
        }
        IEnumerator it = m24149up().iterator();
        while (it.hasNext()) {
            try {
                String str = (String) it.next();
                C13981tl c13981tlCreateElement2 = xmlDocument.createElement("Except", "http://www.w3.org/2002/07/decrypt#");
                c13981tlCreateElement2.m65910kk("URI", str);
                c13981tlCreateElement.appendChild(c13981tlCreateElement2);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
            }
        }
        return c13981tlCreateElement.getChildNodes();
    }

    /* JADX INFO: renamed from: fa */
    public final C5982yd m24152fa() {
        C5982yd c5982yd = this.f16879h4;
        if (c5982yd != null) {
            return c5982yd;
        }
        C5937j2 c5937j2M23926kk = m23926kk();
        C5984zj c5984zjM23929x1 = c5937j2M23926kk == null ? m23929x1() : c5937j2M23926kk.m24025m9();
        this.f16879h4 = (c5984zjM23929x1 == null || c5984zjM23929x1.m24203to() == null) ? new C5982yd(this.f16881m9) : c5984zjM23929x1.m24203to();
        return this.f16879h4;
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5920ca
    /* JADX INFO: renamed from: m9 */
    public AbstractC14068j5[] mo23927m9() {
        return this.f16883x1;
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5920ca
    /* JADX INFO: renamed from: x1 */
    public Object mo23930x1(AbstractC14068j5 abstractC14068j5) {
        if (abstractC14068j5 == C7019kk.m27443k4((Class<?>) XmlDocument.class)) {
            return (XmlDocument) mo23909c5();
        }
        throw new ArgumentException("The input type was invalid for this transform.", C18437z2.f56754h);
    }

    /* JADX INFO: renamed from: x1 */
    private void m24150x1(XmlDocument xmlDocument) {
        if (xmlDocument == null) {
            throw new ArgumentNullException("document");
        }
        this.f16881m9 = xmlDocument;
        C13950o3 c13950o3 = new C13950o3(xmlDocument.getNameTable());
        this.f16878dy = c13950o3;
        c13950o3.mo65707k4("enc", "http://www.w3.org/2001/04/xmlenc#");
        this.f16882to = xmlDocument.selectNodes("//enc:EncryptedData", this.f16878dy);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.internal.p238kt.AbstractC5920ca
    /* JADX INFO: renamed from: k4 */
    public void mo23920k4(AbstractC13911hq abstractC13911hq) {
        if (abstractC13911hq == null) {
            throw new CryptographicException("Unknown transform has been encountered.");
        }
        m24149up().clear();
        IEnumerator it = abstractC13911hq.iterator();
        while (it.hasNext()) {
            try {
                C13981tl c13981tl = (C13981tl) C7019kk.m27452k4(it.next(), C13981tl.class);
                if (c13981tl != null) {
                    if (!"Except".equals(c13981tl.getLocalName()) || !"http://www.w3.org/2002/07/decrypt#".equals(c13981tl.getNamespaceURI())) {
                        throw new CryptographicException("Unknown transform has been encountered.");
                    }
                    String strM23994kk = C5934he.m23994kk(c13981tl, "URI", "http://www.w3.org/2002/07/decrypt#");
                    if (strM23994kk == null || strM23994kk.length() == 0 || strM23994kk.charAt(0) != '#') {
                        throw new CryptographicException("A Uri attribute is required for a CipherReference element.");
                    }
                    if (!C5934he.m23989k4(c13981tl, "URI")) {
                        throw new CryptographicException("Unknown transform has been encountered.");
                    }
                    m24149up().addItem(C5934he.m24000x1(strM23994kk));
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

    /* JADX INFO: renamed from: k4 */
    private void m24147k4(C13981tl c13981tl, byte[] bArr) {
        AbstractC13901ga parentNode = c13981tl.getParentNode();
        if (parentNode.getNodeType() == 9) {
            parentNode.setInnerXml(m24152fa().m24168x1().m26681x1(bArr));
        } else {
            m24152fa().m24162k4(c13981tl, bArr);
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m24151x1(AbstractC13911hq abstractC13911hq) {
        if (abstractC13911hq == null || abstractC13911hq.mo23932k4() == 0) {
            return;
        }
        Queue queue = new Queue();
        IEnumerator it = abstractC13911hq.iterator();
        while (it.hasNext()) {
            try {
                queue.enqueue((AbstractC13901ga) it.next());
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it).dispose();
        }
        Object objDequeue = queue.dequeue();
        while (true) {
            AbstractC13901ga abstractC13901ga = (AbstractC13901ga) C7019kk.m27452k4(objDequeue, AbstractC13901ga.class);
            if (abstractC13901ga == null) {
                return;
            }
            C13981tl c13981tl = (C13981tl) C7019kk.m27452k4((Object) abstractC13901ga, C13981tl.class);
            if (c13981tl != null && "EncryptedData".equals(c13981tl.getLocalName()) && "http://www.w3.org/2001/04/xmlenc#".equals(c13981tl.getNamespaceURI())) {
                AbstractC13901ga nextSibling = c13981tl.getNextSibling();
                AbstractC13901ga parentNode = c13981tl.getParentNode();
                if (m24148k4(c13981tl)) {
                    AbstractC13901ga firstChild = parentNode.getFirstChild();
                    while (firstChild != null && firstChild.getNextSibling() != nextSibling) {
                        firstChild = firstChild.getNextSibling();
                    }
                    if (firstChild != null) {
                        AbstractC13911hq abstractC13911hqSelectNodes = firstChild.selectNodes("//enc:EncryptedData", this.f16878dy);
                        if (abstractC13911hqSelectNodes.mo23932k4() > 0) {
                            it = abstractC13911hqSelectNodes.iterator();
                            while (it.hasNext()) {
                                try {
                                    queue.enqueue((AbstractC13901ga) it.next());
                                } finally {
                                }
                            }
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                ((IDisposable) it).dispose();
                            }
                        }
                    }
                }
            }
            if (queue.size() == 0) {
                return;
            } else {
                objDequeue = queue.dequeue();
            }
        }
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5920ca
    /* JADX INFO: renamed from: k4 */
    public void mo23922k4(Object obj) {
        if (C7019kk.m27469x1(obj, AbstractC3150x6.class)) {
            m24146k4((AbstractC3150x6) obj);
        } else if (C7019kk.m27469x1(obj, XmlDocument.class)) {
            m24150x1((XmlDocument) obj);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m24148k4(C13981tl c13981tl) {
        if (m24149up().size() > 0) {
            for (int i = 0; i < m24149up().size(); i++) {
                if (m24153k4(c13981tl, (String) m24149up().get_Item(i))) {
                    return false;
                }
            }
        }
        C5965um c5965um = new C5965um();
        c5965um.m24121k4(c13981tl);
        AbstractC4736my abstractC4736myM24167x1 = m24152fa().m24167x1(c5965um, null);
        if (abstractC4736myM24167x1 == null) {
            throw new CryptographicException("Unable to retrieve the decryption key.");
        }
        m24147k4(c13981tl, m24152fa().m24164k4(c5965um, abstractC4736myM24167x1));
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m24153k4(C13981tl c13981tl, String str) {
        if (c13981tl == null) {
            return false;
        }
        return C14113y2.m67363du(c13981tl.m65906k4("Id"), str) || C14113y2.m67363du(c13981tl.m65906k4("id"), str) || C14113y2.m67363du(c13981tl.m65906k4("ID"), str);
    }
}
