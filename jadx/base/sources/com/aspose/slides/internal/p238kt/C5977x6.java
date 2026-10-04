package com.aspose.slides.internal.p238kt;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.Xml.AbstractC13901ga;
import com.aspose.slides.p559ms.System.Xml.C13950o3;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;

/* JADX INFO: renamed from: com.aspose.slides.internal.kt.x6 */
/* JADX INFO: loaded from: classes.dex */
public final class C5977x6 {

    /* JADX INFO: renamed from: k4 */
    private C13981tl f16872k4 = null;

    /* JADX INFO: renamed from: x1 */
    private C5949ne f16874x1 = null;

    /* JADX INFO: renamed from: kk */
    private byte[] f16873kk = null;

    /* JADX INFO: renamed from: k4 */
    public final C5949ne m24138k4() {
        return this.f16874x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final byte[] m24141x1() {
        return this.f16873kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final C13981tl m24139k4(XmlDocument xmlDocument) {
        C13981tl c13981tlCreateElement = xmlDocument.createElement("CipherData", "http://www.w3.org/2001/04/xmlenc#");
        if (m24141x1() != null) {
            C13981tl c13981tlCreateElement2 = xmlDocument.createElement("CipherValue", "http://www.w3.org/2001/04/xmlenc#");
            c13981tlCreateElement2.appendChild(xmlDocument.createTextNode(C14080ne.m66952k4(m24141x1())));
            c13981tlCreateElement.appendChild(c13981tlCreateElement2);
            return c13981tlCreateElement;
        }
        if (m24138k4() == null) {
            throw new CryptographicException("A Cipher Data element should have either a CipherValue or a CipherReference element.");
        }
        c13981tlCreateElement.appendChild(m24138k4().m24070k4(xmlDocument));
        return c13981tlCreateElement;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24140k4(C13981tl c13981tl) {
        if (c13981tl == null) {
            throw new ArgumentNullException("value");
        }
        C13950o3 c13950o3 = new C13950o3(c13981tl.getOwnerDocument().getNameTable());
        c13950o3.mo65707k4("enc", "http://www.w3.org/2001/04/xmlenc#");
        AbstractC13901ga abstractC13901gaSelectSingleNode = c13981tl.selectSingleNode("enc:CipherValue", c13950o3);
        AbstractC13901ga abstractC13901gaSelectSingleNode2 = c13981tl.selectSingleNode("enc:CipherReference", c13950o3);
        if (abstractC13901gaSelectSingleNode != null) {
            if (abstractC13901gaSelectSingleNode2 != null) {
                throw new CryptographicException("A Cipher Data element should have either a CipherValue or a CipherReference element.");
            }
            this.f16873kk = C14080ne.m66934jd(C5934he.m23978k4(abstractC13901gaSelectSingleNode.getInnerText()));
        } else {
            if (abstractC13901gaSelectSingleNode2 == null) {
                throw new CryptographicException("A Cipher Data element should have either a CipherValue or a CipherReference element.");
            }
            C5949ne c5949ne = new C5949ne();
            this.f16874x1 = c5949ne;
            c5949ne.mo24071k4((C13981tl) abstractC13901gaSelectSingleNode2);
        }
        this.f16872k4 = c13981tl;
    }
}
