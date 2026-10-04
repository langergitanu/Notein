package com.aspose.slides.internal.p238kt;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.internal.p174hz.AbstractC4723ix;
import com.aspose.slides.internal.p174hz.C4762wl;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13901ga;
import com.aspose.slides.p559ms.System.Xml.C13950o3;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;

/* JADX INFO: renamed from: com.aspose.slides.internal.kt.uz */
/* JADX INFO: loaded from: classes.dex */
public class C5967uz extends AbstractC5917bz {

    /* JADX INFO: renamed from: k4 */
    private AbstractC4723ix f16854k4 = AbstractC4723ix.m19628kk();

    /* JADX INFO: renamed from: k4 */
    public final AbstractC4723ix m24123k4() {
        return this.f16854k4;
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
        C4762wl c4762wlClone = this.f16854k4.mo19633x1(false).Clone();
        C13981tl c13981tlCreateElement = xmlDocument.createElement("KeyValue", "http://www.w3.org/2000/09/xmldsig#");
        C13981tl c13981tlCreateElement2 = xmlDocument.createElement("DSAKeyValue", "http://www.w3.org/2000/09/xmldsig#");
        C13981tl c13981tlCreateElement3 = xmlDocument.createElement("P", "http://www.w3.org/2000/09/xmldsig#");
        c13981tlCreateElement3.appendChild(xmlDocument.createTextNode(C14080ne.m66952k4(c4762wlClone.f13308to)));
        c13981tlCreateElement2.appendChild(c13981tlCreateElement3);
        C13981tl c13981tlCreateElement4 = xmlDocument.createElement("Q", "http://www.w3.org/2000/09/xmldsig#");
        c13981tlCreateElement4.appendChild(xmlDocument.createTextNode(C14080ne.m66952k4(c4762wlClone.f13302du)));
        c13981tlCreateElement2.appendChild(c13981tlCreateElement4);
        C13981tl c13981tlCreateElement5 = xmlDocument.createElement("G", "http://www.w3.org/2000/09/xmldsig#");
        c13981tlCreateElement5.appendChild(xmlDocument.createTextNode(C14080ne.m66952k4(c4762wlClone.f13309x1)));
        c13981tlCreateElement2.appendChild(c13981tlCreateElement5);
        C13981tl c13981tlCreateElement6 = xmlDocument.createElement("Y", "http://www.w3.org/2000/09/xmldsig#");
        c13981tlCreateElement6.appendChild(xmlDocument.createTextNode(C14080ne.m66952k4(c4762wlClone.f13303dy)));
        c13981tlCreateElement2.appendChild(c13981tlCreateElement6);
        if (c4762wlClone.f13306kk != null) {
            C13981tl c13981tlCreateElement7 = xmlDocument.createElement("J", "http://www.w3.org/2000/09/xmldsig#");
            c13981tlCreateElement7.appendChild(xmlDocument.createTextNode(C14080ne.m66952k4(c4762wlClone.f13306kk)));
            c13981tlCreateElement2.appendChild(c13981tlCreateElement7);
        }
        if (c4762wlClone.f13304h4 != null) {
            C13981tl c13981tlCreateElement8 = xmlDocument.createElement("Seed", "http://www.w3.org/2000/09/xmldsig#");
            c13981tlCreateElement8.appendChild(xmlDocument.createTextNode(C14080ne.m66952k4(c4762wlClone.f13304h4)));
            c13981tlCreateElement2.appendChild(c13981tlCreateElement8);
            C13981tl c13981tlCreateElement9 = xmlDocument.createElement("PgenCounter", "http://www.w3.org/2000/09/xmldsig#");
            c13981tlCreateElement9.appendChild(xmlDocument.createTextNode(C14080ne.m66952k4(C5934he.m23992k4(c4762wlClone.f13305k4))));
            c13981tlCreateElement2.appendChild(c13981tlCreateElement9);
        }
        c13981tlCreateElement.appendChild(c13981tlCreateElement2);
        return c13981tlCreateElement;
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5917bz
    /* JADX INFO: renamed from: k4 */
    public void mo23903k4(C13981tl c13981tl) {
        if (c13981tl == null) {
            throw new ArgumentNullException("value");
        }
        if (!"KeyValue".equals(c13981tl.getName()) || !"http://www.w3.org/2000/09/xmldsig#".equals(c13981tl.getNamespaceURI())) {
            throw new CryptographicException(C14113y2.m67402k4("Root element must be {0} element in namepsace {1}", "KeyValue", "http://www.w3.org/2000/09/xmldsig#"));
        }
        C13950o3 c13950o3 = new C13950o3(c13981tl.getOwnerDocument().getNameTable());
        c13950o3.mo65707k4("dsig", "http://www.w3.org/2000/09/xmldsig#");
        AbstractC13901ga abstractC13901gaSelectSingleNode = c13981tl.selectSingleNode(C14113y2.m67402k4("{0}:{1}", "dsig", "DSAKeyValue"), c13950o3);
        if (abstractC13901gaSelectSingleNode == null) {
            throw new CryptographicException(C14113y2.m67402k4("{0} must contain child element {1}", "KeyValue", "DSAKeyValue"));
        }
        AbstractC13901ga abstractC13901gaSelectSingleNode2 = abstractC13901gaSelectSingleNode.selectSingleNode(C14113y2.m67402k4("{0}:{1}", "dsig", "Y"), c13950o3);
        if (abstractC13901gaSelectSingleNode2 == null) {
            throw new CryptographicException(C14113y2.m67402k4("{0} is missing", "Y"));
        }
        AbstractC13901ga abstractC13901gaSelectSingleNode3 = abstractC13901gaSelectSingleNode.selectSingleNode(C14113y2.m67402k4("{0}:{1}", "dsig", "P"), c13950o3);
        AbstractC13901ga abstractC13901gaSelectSingleNode4 = abstractC13901gaSelectSingleNode.selectSingleNode(C14113y2.m67402k4("{0}:{1}", "dsig", "Q"), c13950o3);
        if ((abstractC13901gaSelectSingleNode3 == null && abstractC13901gaSelectSingleNode4 != null) || (abstractC13901gaSelectSingleNode3 != null && abstractC13901gaSelectSingleNode4 == null)) {
            throw new CryptographicException(C14113y2.m67402k4("{0} and {1} can only occour in combination", "P", "Q"));
        }
        AbstractC13901ga abstractC13901gaSelectSingleNode5 = abstractC13901gaSelectSingleNode.selectSingleNode(C14113y2.m67402k4("{0}:{1}", "dsig", "G"), c13950o3);
        AbstractC13901ga abstractC13901gaSelectSingleNode6 = abstractC13901gaSelectSingleNode.selectSingleNode(C14113y2.m67402k4("{0}:{1}", "dsig", "J"), c13950o3);
        AbstractC13901ga abstractC13901gaSelectSingleNode7 = abstractC13901gaSelectSingleNode.selectSingleNode(C14113y2.m67402k4("{0}:{1}", "dsig", "Seed"), c13950o3);
        AbstractC13901ga abstractC13901gaSelectSingleNode8 = abstractC13901gaSelectSingleNode.selectSingleNode(C14113y2.m67402k4("{0}:{1}", "dsig", "PgenCounter"), c13950o3);
        if ((abstractC13901gaSelectSingleNode7 == null && abstractC13901gaSelectSingleNode8 != null) || (abstractC13901gaSelectSingleNode7 != null && abstractC13901gaSelectSingleNode8 == null)) {
            throw new CryptographicException(C14113y2.m67402k4("{0} and {1} can only occur in combination", "Seed", "PgenCounter"));
        }
        try {
            C4762wl c4762wl = new C4762wl();
            c4762wl.f13308to = abstractC13901gaSelectSingleNode3 != null ? C14080ne.m66934jd(abstractC13901gaSelectSingleNode3.getInnerText()) : null;
            c4762wl.f13302du = abstractC13901gaSelectSingleNode4 != null ? C14080ne.m66934jd(abstractC13901gaSelectSingleNode4.getInnerText()) : null;
            c4762wl.f13309x1 = abstractC13901gaSelectSingleNode5 != null ? C14080ne.m66934jd(abstractC13901gaSelectSingleNode5.getInnerText()) : null;
            c4762wl.f13303dy = C14080ne.m66934jd(abstractC13901gaSelectSingleNode2.getInnerText());
            c4762wl.f13306kk = abstractC13901gaSelectSingleNode6 != null ? C14080ne.m66934jd(abstractC13901gaSelectSingleNode6.getInnerText()) : null;
            c4762wl.f13304h4 = abstractC13901gaSelectSingleNode7 != null ? C14080ne.m66934jd(abstractC13901gaSelectSingleNode7.getInnerText()) : null;
            c4762wl.f13305k4 = abstractC13901gaSelectSingleNode8 != null ? C5934he.m23964k4(C14080ne.m66934jd(abstractC13901gaSelectSingleNode8.getInnerText())) : 0;
            m24123k4().mo19634x1(c4762wl);
        } catch (RuntimeException e) {
            throw new CryptographicException("An error occurred parsing the key components", e);
        }
    }
}
