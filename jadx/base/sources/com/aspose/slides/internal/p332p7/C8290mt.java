package com.aspose.slides.internal.p332p7;

import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13932ly;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.mt */
/* JADX INFO: loaded from: classes4.dex */
public class C8290mt extends C7259am {

    /* JADX INFO: renamed from: k4 */
    private XmlDocument f27020k4;

    public C8290mt() {
    }

    @Override // com.aspose.slides.internal.p332p7.C7259am
    /* JADX INFO: renamed from: k4 */
    public String mo28309k4() {
        super.mo28310k4(this.f27020k4.getOuterXml());
        return super.mo28309k4();
    }

    /* JADX INFO: renamed from: x1 */
    public final XmlDocument m37126x1() {
        return this.f27020k4;
    }

    public C8290mt(AbstractC13912i5 abstractC13912i5) {
        super(abstractC13912i5);
        XmlDocument xmlDocument = new XmlDocument();
        this.f27020k4 = xmlDocument;
        C13932ly c13932lyCreateDocumentFragment = xmlDocument.createDocumentFragment();
        c13932lyCreateDocumentFragment.setInnerXml(super.mo28309k4());
        this.f27020k4.appendChild(c13932lyCreateDocumentFragment);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m37125k4(XmlDocument xmlDocument) {
        this.f27020k4 = xmlDocument;
        super.mo28310k4(xmlDocument.getOuterXml());
    }

    @Override // com.aspose.slides.internal.p332p7.C7259am
    /* JADX INFO: renamed from: k4 */
    public void mo28310k4(String str) {
        XmlDocument xmlDocument = new XmlDocument();
        this.f27020k4 = xmlDocument;
        C13932ly c13932lyCreateDocumentFragment = xmlDocument.createDocumentFragment();
        c13932lyCreateDocumentFragment.setInnerXml(str);
        this.f27020k4.appendChild(c13932lyCreateDocumentFragment);
        super.mo28310k4(str);
    }
}
