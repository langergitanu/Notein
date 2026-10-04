package com.aspose.slides.internal.p238kt;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13901ga;
import com.aspose.slides.p559ms.System.Xml.C13950o3;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;

/* JADX INFO: renamed from: com.aspose.slides.internal.kt.v4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5968v4 {

    /* JADX INFO: renamed from: k4 */
    public C13981tl f16855k4;

    /* JADX INFO: renamed from: kk */
    private String f16856kk;

    /* JADX INFO: renamed from: to */
    private C5915bs f16857to;

    /* JADX INFO: renamed from: x1 */
    private String f16858x1;

    public AbstractC5968v4() {
        this(C14113y2.f47374k4, new C5915bs());
    }

    /* JADX INFO: renamed from: du */
    public final boolean m24124du() {
        return this.f16855k4 != null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24125k4(C5915bs c5915bs) {
        this.f16857to = c5915bs;
        this.f16855k4 = null;
    }

    /* JADX INFO: renamed from: kk */
    public final C5915bs m24127kk() {
        if (this.f16857to == null) {
            this.f16857to = new C5915bs();
        }
        return this.f16857to;
    }

    /* JADX INFO: renamed from: to */
    public final String m24128to() {
        return this.f16856kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C13981tl m24129x1(XmlDocument xmlDocument) {
        if (m24128to() == null) {
            throw new CryptographicException("The Reference type must be set in an EncryptedReference object.");
        }
        C13981tl c13981tlCreateElement = xmlDocument.createElement(m24128to(), "http://www.w3.org/2001/04/xmlenc#");
        if (!C14113y2.m67411k4(this.f16858x1)) {
            c13981tlCreateElement.m65910kk("URI", this.f16858x1);
        }
        if (m24127kk().m23886k4() > 0) {
            c13981tlCreateElement.appendChild(m24127kk().m23891k4(xmlDocument, "http://www.w3.org/2000/09/xmldsig#"));
        }
        return c13981tlCreateElement;
    }

    public AbstractC5968v4(String str, C5915bs c5915bs) {
        this.f16855k4 = null;
        m24125k4(c5915bs);
        m24126k4(str);
        this.f16855k4 = null;
    }

    /* JADX INFO: renamed from: k4 */
    public void mo24071k4(C13981tl c13981tl) {
        if (c13981tl == null) {
            throw new ArgumentNullException("value");
        }
        m24131x1(c13981tl.getLocalName());
        String strM23994kk = C5934he.m23994kk(c13981tl, "URI", "http://www.w3.org/2001/04/xmlenc#");
        if (strM23994kk == null) {
            throw new ArgumentNullException("A Uri attribute is required for a CipherReference element.");
        }
        m24126k4(strM23994kk);
        C13950o3 c13950o3 = new C13950o3(c13981tl.getOwnerDocument().getNameTable());
        c13950o3.mo65707k4("ds", "http://www.w3.org/2000/09/xmldsig#");
        AbstractC13901ga abstractC13901gaSelectSingleNode = c13981tl.selectSingleNode("ds:Transforms", c13950o3);
        if (abstractC13901gaSelectSingleNode != null) {
            m24127kk().m23893k4((C13981tl) C7019kk.m27452k4((Object) abstractC13901gaSelectSingleNode, C13981tl.class));
        }
        this.f16855k4 = c13981tl;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m24130x1() {
        return this.f16858x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24126k4(String str) {
        if (str == null) {
            throw new ArgumentNullException("A Uri attribute is required for a CipherReference element.");
        }
        this.f16858x1 = str;
        this.f16855k4 = null;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m24131x1(String str) {
        this.f16856kk = str;
        this.f16855k4 = null;
    }
}
