package com.aspose.slides.internal.p238kt;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13911hq;
import com.aspose.slides.p559ms.System.Xml.C13950o3;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;
import com.huawei.hms.network.embedded.C18358t1;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.kt.em */
/* JADX INFO: loaded from: classes.dex */
public class C5926em implements ICollection {

    /* JADX INFO: renamed from: k4 */
    private String f16758k4;

    /* JADX INFO: renamed from: kk */
    private String f16759kk;

    /* JADX INFO: renamed from: to */
    private String f16761to;

    /* JADX INFO: renamed from: x1 */
    private String f16762x1;

    /* JADX INFO: renamed from: h4 */
    private C13981tl f16757h4 = null;

    /* JADX INFO: renamed from: m9 */
    private C5984zj f16760m9 = null;

    /* JADX INFO: renamed from: dy */
    private AbstractC5920ca f16756dy = null;

    /* JADX INFO: renamed from: du */
    private ArrayList f16755du = new ArrayList();

    @Override // com.aspose.slides.Collections.ICollection
    public final void copyTo(AbstractC14092to abstractC14092to, int i) {
        throw new NotSupportedException();
    }

    /* JADX INFO: renamed from: du */
    public final String m23944du() {
        return this.f16761to;
    }

    /* JADX INFO: renamed from: dy */
    public final C13981tl m23945dy() {
        if (m23954m9()) {
            return this.f16757h4;
        }
        XmlDocument xmlDocument = new XmlDocument();
        xmlDocument.setPreserveWhitespace(true);
        return m23948k4(xmlDocument);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final Object getSyncRoot() {
        throw new NotSupportedException();
    }

    /* JADX INFO: renamed from: h4 */
    public final ArrayList m23946h4() {
        return this.f16755du;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final boolean isSynchronized() {
        throw new NotSupportedException();
    }

    @Override // java.lang.Iterable
    public final IEnumerator iterator() {
        throw new NotSupportedException();
    }

    /* JADX INFO: renamed from: k4 */
    public final C5984zj m23947k4() {
        return this.f16760m9;
    }

    /* JADX INFO: renamed from: kk */
    public final AbstractC5920ca m23953kk() {
        if (this.f16756dy == null) {
            AbstractC5920ca abstractC5920ca = (AbstractC5920ca) C5936ix.m24008k4(AbstractC5920ca.class, m23956x1());
            this.f16756dy = abstractC5920ca;
            if (abstractC5920ca == null) {
                throw new CryptographicException(C14113y2.m67391k4(C11697x1.m55252to(), "Could not create the XML transformation identified by the URI {0}.", m23956x1()));
            }
            abstractC5920ca.m23919k4(m23947k4());
            this.f16756dy.m23918k4((C5937j2) null);
        }
        return this.f16756dy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m9 */
    public final boolean m23954m9() {
        if (this.f16757h4 == null) {
            return false;
        }
        IEnumerator it = m23946h4().iterator();
        while (it.hasNext()) {
            try {
                if (!((C5937j2) it.next()).m24013h4()) {
                    return false;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return true;
        }
        ((IDisposable) it).dispose();
        return true;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final int size() {
        throw new NotSupportedException();
    }

    /* JADX INFO: renamed from: to */
    public final String m23955to() {
        return this.f16759kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m23956x1() {
        String str = this.f16762x1;
        return str == null ? "http://www.w3.org/TR/2001/REC-xml-c14n-20010315" : str;
    }

    /* JADX INFO: renamed from: k4 */
    public final C13981tl m23948k4(XmlDocument xmlDocument) {
        C13981tl c13981tlCreateElement = xmlDocument.createElement("SignedInfo", "http://www.w3.org/2000/09/xmldsig#");
        if (!C14113y2.m67411k4(this.f16758k4)) {
            c13981tlCreateElement.m65910kk("Id", this.f16758k4);
        }
        c13981tlCreateElement.appendChild(m23953kk().m23916k4(xmlDocument, "CanonicalizationMethod"));
        if (C14113y2.m67411k4(this.f16759kk)) {
            throw new CryptographicException("A signature method is required.");
        }
        C13981tl c13981tlCreateElement2 = xmlDocument.createElement("SignatureMethod", "http://www.w3.org/2000/09/xmldsig#");
        c13981tlCreateElement2.m65910kk("Algorithm", this.f16759kk);
        if (this.f16761to != null) {
            C13981tl c13981tlCreateElement3 = xmlDocument.createElement(null, "HMACOutputLength", "http://www.w3.org/2000/09/xmldsig#");
            c13981tlCreateElement3.appendChild(xmlDocument.createTextNode(this.f16761to));
            c13981tlCreateElement2.appendChild(c13981tlCreateElement3);
        }
        c13981tlCreateElement.appendChild(c13981tlCreateElement2);
        if (this.f16755du.size() == 0) {
            throw new CryptographicException("At least one Reference element is required.");
        }
        for (int i = 0; i < this.f16755du.size(); i++) {
            c13981tlCreateElement.appendChild(((C5937j2) this.f16755du.get_Item(i)).m24014k4(xmlDocument));
        }
        return c13981tlCreateElement;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m23949k4(C5937j2 c5937j2) {
        if (c5937j2 == null) {
            throw new ArgumentNullException("reference");
        }
        c5937j2.m24018k4(m23947k4());
        this.f16755du.addItem(c5937j2);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m23950k4(C5984zj c5984zj) {
        this.f16760m9 = c5984zj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final void m23951k4(C13981tl c13981tl) {
        if (c13981tl == null) {
            throw new ArgumentNullException("value");
        }
        if (!C14113y2.m67363du(c13981tl.getLocalName(), "SignedInfo")) {
            throw new CryptographicException("Malformed element {0}.", "SignedInfo");
        }
        C13950o3 c13950o3 = new C13950o3(c13981tl.getOwnerDocument().getNameTable());
        c13950o3.mo65707k4("ds", "http://www.w3.org/2000/09/xmldsig#");
        this.f16758k4 = C5934he.m23994kk(c13981tl, "Id", "http://www.w3.org/2000/09/xmldsig#");
        if (!C5934he.m23989k4(c13981tl, "Id")) {
            throw new CryptographicException("Malformed element {0}.", "SignedInfo");
        }
        AbstractC13911hq abstractC13911hqSelectNodes = c13981tl.selectNodes("ds:CanonicalizationMethod", c13950o3);
        if (abstractC13911hqSelectNodes == null || abstractC13911hqSelectNodes.mo23932k4() == 0 || abstractC13911hqSelectNodes.mo23932k4() > 1) {
            throw new CryptographicException("Malformed element {0}.", "SignedInfo/CanonicalizationMethod");
        }
        C13981tl c13981tl2 = (C13981tl) C7019kk.m27452k4((Object) abstractC13911hqSelectNodes.mo23933k4(0), C13981tl.class);
        int iMo23932k4 = abstractC13911hqSelectNodes.mo23932k4();
        String strM23994kk = C5934he.m23994kk(c13981tl2, "Algorithm", "http://www.w3.org/2000/09/xmldsig#");
        this.f16762x1 = strM23994kk;
        if (strM23994kk == null || !C5934he.m23989k4(c13981tl2, "Algorithm")) {
            throw new CryptographicException("Malformed element {0}.", "SignedInfo/CanonicalizationMethod");
        }
        this.f16756dy = null;
        if (c13981tl2.getChildNodes().mo23932k4() > 0) {
            m23953kk().mo23920k4(c13981tl2.getChildNodes());
        }
        AbstractC13911hq abstractC13911hqSelectNodes2 = c13981tl.selectNodes("ds:SignatureMethod", c13950o3);
        if (abstractC13911hqSelectNodes2 == null || abstractC13911hqSelectNodes2.mo23932k4() == 0 || abstractC13911hqSelectNodes2.mo23932k4() > 1) {
            throw new CryptographicException("Malformed element {0}.", "SignedInfo/SignatureMethod");
        }
        C13981tl c13981tl3 = (C13981tl) C7019kk.m27452k4((Object) abstractC13911hqSelectNodes2.mo23933k4(0), C13981tl.class);
        int iMo23932k42 = abstractC13911hqSelectNodes2.mo23932k4() + iMo23932k4;
        String strM23994kk2 = C5934he.m23994kk(c13981tl3, "Algorithm", "http://www.w3.org/2000/09/xmldsig#");
        this.f16759kk = strM23994kk2;
        if (strM23994kk2 == null || !C5934he.m23989k4(c13981tl3, "Algorithm")) {
            throw new CryptographicException("Malformed element {0}.", "SignedInfo/SignatureMethod");
        }
        C13981tl c13981tl4 = (C13981tl) C7019kk.m27452k4((Object) c13981tl3.selectSingleNode("ds:HMACOutputLength", c13950o3), C13981tl.class);
        if (c13981tl4 != null) {
            this.f16761to = c13981tl4.getInnerXml();
        }
        this.f16755du.clear();
        AbstractC13911hq abstractC13911hqSelectNodes3 = c13981tl.selectNodes("ds:Reference", c13950o3);
        if (abstractC13911hqSelectNodes3 != null) {
            if (abstractC13911hqSelectNodes3.mo23932k4() > 100) {
                throw new CryptographicException("Malformed element {0}.", "SignedInfo/Reference");
            }
            IEnumerator it = abstractC13911hqSelectNodes3.iterator();
            while (it.hasNext()) {
                try {
                    C13981tl c13981tl5 = (C13981tl) C7019kk.m27452k4(it.next(), C13981tl.class);
                    C5937j2 c5937j2 = new C5937j2();
                    m23949k4(c5937j2);
                    c5937j2.m24020k4(c13981tl5);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        ((IDisposable) it).dispose();
                    }
                }
            }
            if (c13981tl.selectNodes(C18358t1.g.f56183c).mo23932k4() != abstractC13911hqSelectNodes3.mo23932k4() + iMo23932k42) {
                throw new CryptographicException("Malformed element {0}.", "SignedInfo");
            }
        }
        this.f16757h4 = c13981tl;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m23952k4(String str) {
        this.f16759kk = str;
        this.f16757h4 = null;
    }
}
