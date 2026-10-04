package com.aspose.slides.internal.p238kt;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13901ga;
import com.aspose.slides.p559ms.System.Xml.AbstractC13911hq;
import com.aspose.slides.p559ms.System.Xml.C13950o3;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.kt.bv */
/* JADX INFO: loaded from: classes.dex */
public final class C5916bv extends AbstractC5945lr {

    /* JADX INFO: renamed from: kk */
    private String f16735kk;

    /* JADX INFO: renamed from: to */
    private C5971w6 f16736to;

    /* JADX INFO: renamed from: x1 */
    private String f16737x1;

    /* JADX INFO: renamed from: k4 */
    public final C13981tl m23894k4(XmlDocument xmlDocument) {
        C13981tl c13981tlCreateElement = xmlDocument.createElement("EncryptedKey", "http://www.w3.org/2001/04/xmlenc#");
        if (!C14113y2.m67411k4(m24056h4())) {
            c13981tlCreateElement.m65910kk("Id", m24056h4());
        }
        if (!C14113y2.m67411k4(m24063m9())) {
            c13981tlCreateElement.m65910kk("Type", m24063m9());
        }
        if (!C14113y2.m67411k4(m24054dy())) {
            c13981tlCreateElement.m65910kk("MimeType", m24054dy());
        }
        if (!C14113y2.m67411k4(m24050c5())) {
            c13981tlCreateElement.m65910kk("Encoding", m24050c5());
        }
        if (!C14113y2.m67411k4(m23895k4())) {
            c13981tlCreateElement.m65910kk("Recipient", m23895k4());
        }
        if (m24051ck() != null) {
            c13981tlCreateElement.appendChild(m24051ck().m23882k4(xmlDocument));
        }
        if (m24058jd().m23940k4() > 0) {
            c13981tlCreateElement.appendChild(m24058jd().m23941k4(xmlDocument));
        }
        if (m24065up() == null) {
            throw new CryptographicException("Cipher data is not specified.");
        }
        c13981tlCreateElement.appendChild(m24065up().m24139k4(xmlDocument));
        if (m24055fa().size() > 0) {
            C13981tl c13981tlCreateElement2 = xmlDocument.createElement("EncryptionProperties", "http://www.w3.org/2001/04/xmlenc#");
            for (int i = 0; i < m24055fa().size(); i++) {
                c13981tlCreateElement2.appendChild(m24055fa().m23881k4(i).m24135k4(xmlDocument));
            }
            c13981tlCreateElement.appendChild(c13981tlCreateElement2);
        }
        if (m23898kk().size() > 0) {
            C13981tl c13981tlCreateElement3 = xmlDocument.createElement("ReferenceList", "http://www.w3.org/2001/04/xmlenc#");
            for (int i2 = 0; i2 < m23898kk().size(); i2++) {
                c13981tlCreateElement3.appendChild(m23898kk().m24133x1(i2).m24129x1(xmlDocument));
            }
            c13981tlCreateElement.appendChild(c13981tlCreateElement3);
        }
        if (m23900x1() != null) {
            C13981tl c13981tlCreateElement4 = xmlDocument.createElement("CarriedKeyName", "http://www.w3.org/2001/04/xmlenc#");
            c13981tlCreateElement4.appendChild(xmlDocument.createTextNode(m23900x1()));
            c13981tlCreateElement.appendChild(c13981tlCreateElement4);
        }
        return c13981tlCreateElement;
    }

    /* JADX INFO: renamed from: kk */
    public final C5971w6 m23898kk() {
        if (this.f16736to == null) {
            this.f16736to = new C5971w6();
        }
        return this.f16736to;
    }

    /* JADX INFO: renamed from: to */
    public C13981tl m23899to() {
        if (m24053du()) {
            return this.f16804k4;
        }
        XmlDocument xmlDocument = new XmlDocument();
        xmlDocument.setPreserveWhitespace(true);
        return m23894k4(xmlDocument);
    }

    /* JADX INFO: renamed from: x1 */
    public final String m23900x1() {
        return this.f16735kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m23895k4() {
        if (this.f16737x1 == null) {
            this.f16737x1 = C14113y2.f47374k4;
        }
        return this.f16737x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m23901x1(String str) {
        this.f16735kk = str;
        this.f16804k4 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public void m23896k4(C13981tl c13981tl) {
        IEnumerator it;
        AbstractC13911hq abstractC13911hqSelectNodes;
        if (c13981tl == null) {
            throw new ArgumentNullException("value");
        }
        C13950o3 c13950o3 = new C13950o3(c13981tl.getOwnerDocument().getNameTable());
        c13950o3.mo65707k4("enc", "http://www.w3.org/2001/04/xmlenc#");
        c13950o3.mo65707k4("ds", "http://www.w3.org/2000/09/xmldsig#");
        m24062kk(C5934he.m23994kk(c13981tl, "Id", "http://www.w3.org/2001/04/xmlenc#"));
        m24064to(C5934he.m23994kk(c13981tl, "Type", "http://www.w3.org/2001/04/xmlenc#"));
        m24052du(C5934he.m23994kk(c13981tl, "MimeType", "http://www.w3.org/2001/04/xmlenc#"));
        m24057h4(C5934he.m23994kk(c13981tl, "Encoding", "http://www.w3.org/2001/04/xmlenc#"));
        m23897k4(C5934he.m23994kk(c13981tl, "Recipient", "http://www.w3.org/2001/04/xmlenc#"));
        AbstractC13901ga abstractC13901gaSelectSingleNode = c13981tl.selectSingleNode("enc:EncryptionMethod", c13950o3);
        m24059k4(new C5914b3());
        if (abstractC13901gaSelectSingleNode != null) {
            m24051ck().m23885k4((C13981tl) C7019kk.m27452k4((Object) abstractC13901gaSelectSingleNode, C13981tl.class));
        }
        m24060k4(new C5925e0());
        AbstractC13901ga abstractC13901gaSelectSingleNode2 = c13981tl.selectSingleNode("ds:KeyInfo", c13950o3);
        if (abstractC13901gaSelectSingleNode2 != null) {
            m24058jd().m23943k4((C13981tl) C7019kk.m27452k4((Object) abstractC13901gaSelectSingleNode2, C13981tl.class));
        }
        AbstractC13901ga abstractC13901gaSelectSingleNode3 = c13981tl.selectSingleNode("enc:CipherData", c13950o3);
        if (abstractC13901gaSelectSingleNode3 == null) {
            throw new CryptographicException("Cipher data is not specified.");
        }
        m24061k4(new C5977x6());
        m24065up().m24140k4((C13981tl) C7019kk.m27452k4((Object) abstractC13901gaSelectSingleNode3, C13981tl.class));
        AbstractC13901ga abstractC13901gaSelectSingleNode4 = c13981tl.selectSingleNode("enc:EncryptionProperties", c13950o3);
        if (abstractC13901gaSelectSingleNode4 != null && (abstractC13911hqSelectNodes = abstractC13901gaSelectSingleNode4.selectNodes("enc:EncryptionProperty", c13950o3)) != null) {
            it = abstractC13911hqSelectNodes.iterator();
            while (it.hasNext()) {
                try {
                    AbstractC13901ga abstractC13901ga = (AbstractC13901ga) it.next();
                    C5974wy c5974wy = new C5974wy();
                    c5974wy.m24136k4((C13981tl) C7019kk.m27452k4((Object) abstractC13901ga, C13981tl.class));
                    m24055fa().m23880k4(c5974wy);
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                ((IDisposable) it).dispose();
            }
        }
        AbstractC13901ga abstractC13901gaSelectSingleNode5 = c13981tl.selectSingleNode("enc:CarriedKeyName", c13950o3);
        if (abstractC13901gaSelectSingleNode5 != null) {
            m23901x1(abstractC13901gaSelectSingleNode5.getInnerText());
        }
        AbstractC13901ga abstractC13901gaSelectSingleNode6 = c13981tl.selectSingleNode("enc:ReferenceList", c13950o3);
        if (abstractC13901gaSelectSingleNode6 != null) {
            AbstractC13911hq abstractC13911hqSelectNodes2 = abstractC13901gaSelectSingleNode6.selectNodes("enc:DataReference", c13950o3);
            if (abstractC13911hqSelectNodes2 != null) {
                it = abstractC13911hqSelectNodes2.iterator();
                while (it.hasNext()) {
                    try {
                        AbstractC13901ga abstractC13901ga2 = (AbstractC13901ga) it.next();
                        C5913ar c5913ar = new C5913ar();
                        c5913ar.mo24071k4((C13981tl) C7019kk.m27452k4((Object) abstractC13901ga2, C13981tl.class));
                        m23898kk().addItem(c5913ar);
                    } finally {
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
            }
            AbstractC13911hq abstractC13911hqSelectNodes3 = abstractC13901gaSelectSingleNode6.selectNodes("enc:KeyReference", c13950o3);
            if (abstractC13911hqSelectNodes3 != null) {
                IEnumerator it2 = abstractC13911hqSelectNodes3.iterator();
                while (it2.hasNext()) {
                    try {
                        AbstractC13901ga abstractC13901ga3 = (AbstractC13901ga) it2.next();
                        C5943kp c5943kp = new C5943kp();
                        c5943kp.mo24071k4((C13981tl) C7019kk.m27452k4((Object) abstractC13901ga3, C13981tl.class));
                        m23898kk().addItem(c5943kp);
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            ((IDisposable) it2).dispose();
                        }
                    }
                }
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it2).dispose();
                }
            }
        }
        this.f16804k4 = c13981tl;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m23897k4(String str) {
        this.f16737x1 = str;
        this.f16804k4 = null;
    }
}
