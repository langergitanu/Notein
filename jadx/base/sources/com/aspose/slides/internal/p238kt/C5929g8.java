package com.aspose.slides.internal.p238kt;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;

/* JADX INFO: renamed from: com.aspose.slides.internal.kt.g8 */
/* JADX INFO: loaded from: classes.dex */
public class C5929g8 extends AbstractC5917bz {

    /* JADX INFO: renamed from: k4 */
    private String f16764k4;

    public C5929g8() {
        this(null);
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5917bz
    /* JADX INFO: renamed from: k4 */
    public C13981tl mo23902k4(XmlDocument xmlDocument) {
        C13981tl c13981tlCreateElement = xmlDocument.createElement("KeyName", "http://www.w3.org/2000/09/xmldsig#");
        c13981tlCreateElement.appendChild(xmlDocument.createTextNode(this.f16764k4));
        return c13981tlCreateElement;
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5917bz
    /* JADX INFO: renamed from: x1 */
    public C13981tl mo23904x1() {
        XmlDocument xmlDocument = new XmlDocument();
        xmlDocument.setPreserveWhitespace(true);
        return mo23902k4(xmlDocument);
    }

    public C5929g8(String str) {
        m23959k4(str);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m23958k4() {
        return this.f16764k4;
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5917bz
    /* JADX INFO: renamed from: k4 */
    public void mo23903k4(C13981tl c13981tl) {
        if (c13981tl == null) {
            throw new ArgumentNullException("value");
        }
        this.f16764k4 = C14113y2.m67440x1(c13981tl.getInnerText());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m23959k4(String str) {
        this.f16764k4 = str;
    }
}
