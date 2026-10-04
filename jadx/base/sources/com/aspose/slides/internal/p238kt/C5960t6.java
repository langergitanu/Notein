package com.aspose.slides.internal.p238kt;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.internal.p174hz.AbstractC4751tq;
import com.aspose.slides.internal.p174hz.C4701bs;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13901ga;
import com.aspose.slides.p559ms.System.Xml.C13950o3;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;

/* JADX INFO: renamed from: com.aspose.slides.internal.kt.t6 */
/* JADX INFO: loaded from: classes.dex */
public class C5960t6 extends AbstractC5917bz {

    /* JADX INFO: renamed from: k4 */
    private AbstractC4751tq f16850k4 = AbstractC4751tq.m19738kk();

    /* JADX INFO: renamed from: k4 */
    public final AbstractC4751tq m24115k4() {
        return this.f16850k4;
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5917bz
    /* JADX INFO: renamed from: x1 */
    public C13981tl mo23904x1() {
        XmlDocument xmlDocument = new XmlDocument();
        xmlDocument.setPreserveWhitespace(true);
        return mo23902k4(xmlDocument);
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5917bz
    /* JADX INFO: renamed from: k4 */
    public C13981tl mo23902k4(XmlDocument xmlDocument) {
        C4701bs c4701bsClone = this.f16850k4.mo19642x1(false).Clone();
        C13981tl c13981tlCreateElement = xmlDocument.createElement("KeyValue", "http://www.w3.org/2000/09/xmldsig#");
        C13981tl c13981tlCreateElement2 = xmlDocument.createElement("RSAKeyValue", "http://www.w3.org/2000/09/xmldsig#");
        C13981tl c13981tlCreateElement3 = xmlDocument.createElement("Modulus", "http://www.w3.org/2000/09/xmldsig#");
        c13981tlCreateElement3.appendChild(xmlDocument.createTextNode(C14080ne.m66952k4(c4701bsClone.f13121m9)));
        c13981tlCreateElement2.appendChild(c13981tlCreateElement3);
        C13981tl c13981tlCreateElement4 = xmlDocument.createElement("Exponent", "http://www.w3.org/2000/09/xmldsig#");
        c13981tlCreateElement4.appendChild(xmlDocument.createTextNode(C14080ne.m66952k4(c4701bsClone.f13117dy)));
        c13981tlCreateElement2.appendChild(c13981tlCreateElement4);
        c13981tlCreateElement.appendChild(c13981tlCreateElement2);
        return c13981tlCreateElement;
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5917bz
    /* JADX INFO: renamed from: k4 */
    public void mo23903k4(C13981tl c13981tl) {
        if (c13981tl == null) {
            throw new ArgumentNullException("value");
        }
        if (!"KeyValue".equals(c13981tl.getLocalName()) || !"http://www.w3.org/2000/09/xmldsig#".equals(c13981tl.getNamespaceURI())) {
            throw new CryptographicException(C14113y2.m67402k4("Root element must be {0} element in namespace {1}", "KeyValue", "http://www.w3.org/2000/09/xmldsig#"));
        }
        C13950o3 c13950o3 = new C13950o3(c13981tl.getOwnerDocument().getNameTable());
        c13950o3.mo65707k4("dsig", "http://www.w3.org/2000/09/xmldsig#");
        AbstractC13901ga abstractC13901gaSelectSingleNode = c13981tl.selectSingleNode(C14113y2.m67402k4("{0}:{1}", "dsig", "RSAKeyValue"), c13950o3);
        if (abstractC13901gaSelectSingleNode == null) {
            throw new CryptographicException(C14113y2.m67402k4("{0} must contain child element {1}", "KeyValue", "RSAKeyValue"));
        }
        try {
            C4701bs c4701bs = new C4701bs();
            c4701bs.f13121m9 = C14080ne.m66934jd(abstractC13901gaSelectSingleNode.selectSingleNode(C14113y2.m67402k4("{0}:{1}", "dsig", "Modulus"), c13950o3).getInnerText());
            c4701bs.f13117dy = C14080ne.m66934jd(abstractC13901gaSelectSingleNode.selectSingleNode(C14113y2.m67402k4("{0}:{1}", "dsig", "Exponent"), c13950o3).getInnerText());
            m24115k4().mo19639k4(c4701bs);
        } catch (RuntimeException e) {
            throw new CryptographicException(C14113y2.m67402k4("An error occurred parsing the {0} and {1} elements", "Modulus", "Exponent"), e);
        }
    }
}
