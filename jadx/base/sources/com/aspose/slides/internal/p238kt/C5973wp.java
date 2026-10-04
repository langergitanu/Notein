package com.aspose.slides.internal.p238kt;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;

/* JADX INFO: renamed from: com.aspose.slides.internal.kt.wp */
/* JADX INFO: loaded from: classes.dex */
public class C5973wp extends AbstractC5917bz {

    /* JADX INFO: renamed from: k4 */
    private String f16861k4;

    /* JADX INFO: renamed from: x1 */
    private String f16862x1;

    @Override // com.aspose.slides.internal.p238kt.AbstractC5917bz
    /* JADX INFO: renamed from: k4 */
    public C13981tl mo23902k4(XmlDocument xmlDocument) {
        C13981tl c13981tlCreateElement = xmlDocument.createElement("RetrievalMethod", "http://www.w3.org/2000/09/xmldsig#");
        if (!C14113y2.m67411k4(this.f16861k4)) {
            c13981tlCreateElement.m65910kk("URI", this.f16861k4);
        }
        if (!C14113y2.m67411k4(this.f16862x1)) {
            c13981tlCreateElement.m65910kk("Type", this.f16862x1);
        }
        return c13981tlCreateElement;
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5917bz
    /* JADX INFO: renamed from: x1 */
    public C13981tl mo23904x1() {
        XmlDocument xmlDocument = new XmlDocument();
        xmlDocument.setPreserveWhitespace(true);
        return mo23902k4(xmlDocument);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m24134k4() {
        return this.f16861k4;
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5917bz
    /* JADX INFO: renamed from: k4 */
    public void mo23903k4(C13981tl c13981tl) {
        if (c13981tl == null) {
            throw new ArgumentNullException("value");
        }
        this.f16861k4 = C5934he.m23994kk(c13981tl, "URI", "http://www.w3.org/2000/09/xmldsig#");
        this.f16862x1 = C5934he.m23994kk(c13981tl, "Type", "http://www.w3.org/2000/09/xmldsig#");
    }
}
