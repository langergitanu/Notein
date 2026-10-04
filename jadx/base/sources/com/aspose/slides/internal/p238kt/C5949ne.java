package com.aspose.slides.internal.p238kt;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13901ga;
import com.aspose.slides.p559ms.System.Xml.C13950o3;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;

/* JADX INFO: renamed from: com.aspose.slides.internal.kt.ne */
/* JADX INFO: loaded from: classes.dex */
public final class C5949ne extends AbstractC5968v4 {

    /* JADX INFO: renamed from: x1 */
    private byte[] f16818x1;

    public C5949ne() {
        m24131x1("CipherReference");
    }

    /* JADX INFO: renamed from: k4 */
    public final C13981tl m24070k4(XmlDocument xmlDocument) {
        if (m24128to() == null) {
            throw new CryptographicException("The Reference type must be set in an EncryptedReference object.");
        }
        C13981tl c13981tlCreateElement = xmlDocument.createElement(m24128to(), "http://www.w3.org/2001/04/xmlenc#");
        if (!C14113y2.m67411k4(m24130x1())) {
            c13981tlCreateElement.m65910kk("URI", m24130x1());
        }
        if (m24127kk().m23886k4() > 0) {
            c13981tlCreateElement.appendChild(m24127kk().m23891k4(xmlDocument, "http://www.w3.org/2001/04/xmlenc#"));
        }
        return c13981tlCreateElement;
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5968v4
    /* JADX INFO: renamed from: k4 */
    public void mo24071k4(C13981tl c13981tl) {
        if (c13981tl == null) {
            throw new ArgumentNullException("value");
        }
        m24131x1(c13981tl.getLocalName());
        String strM23994kk = C5934he.m23994kk(c13981tl, "URI", "http://www.w3.org/2001/04/xmlenc#");
        if (strM23994kk == null) {
            throw new CryptographicException("A Uri attribute is required for a CipherReference element.");
        }
        m24126k4(strM23994kk);
        C13950o3 c13950o3 = new C13950o3(c13981tl.getOwnerDocument().getNameTable());
        c13950o3.mo65707k4("enc", "http://www.w3.org/2001/04/xmlenc#");
        AbstractC13901ga abstractC13901gaSelectSingleNode = c13981tl.selectSingleNode("enc:Transforms", c13950o3);
        if (abstractC13901gaSelectSingleNode != null) {
            m24127kk().m23893k4((C13981tl) C7019kk.m27452k4((Object) abstractC13901gaSelectSingleNode, C13981tl.class));
        }
        this.f16855k4 = c13981tl;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24072k4(byte[] bArr) {
        this.f16818x1 = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte[] m24073k4() {
        if (m24124du()) {
            return this.f16818x1;
        }
        return null;
    }
}
