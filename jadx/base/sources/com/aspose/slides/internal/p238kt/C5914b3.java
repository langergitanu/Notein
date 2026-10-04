package com.aspose.slides.internal.p238kt;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import com.aspose.slides.p559ms.System.Xml.AbstractC13901ga;
import com.aspose.slides.p559ms.System.Xml.C13950o3;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;

/* JADX INFO: renamed from: com.aspose.slides.internal.kt.b3 */
/* JADX INFO: loaded from: classes.dex */
public class C5914b3 {

    /* JADX INFO: renamed from: kk */
    private String f16732kk;

    /* JADX INFO: renamed from: x1 */
    private int f16733x1 = 0;

    /* JADX INFO: renamed from: k4 */
    private C13981tl f16731k4 = null;

    /* JADX INFO: renamed from: k4 */
    public final C13981tl m23882k4(XmlDocument xmlDocument) {
        C13981tl c13981tlCreateElement = xmlDocument.createElement("EncryptionMethod", "http://www.w3.org/2001/04/xmlenc#");
        if (!C14113y2.m67411k4(this.f16732kk)) {
            c13981tlCreateElement.m65910kk("Algorithm", this.f16732kk);
        }
        if (this.f16733x1 > 0) {
            C13981tl c13981tlCreateElement2 = xmlDocument.createElement("KeySize", "http://www.w3.org/2001/04/xmlenc#");
            c13981tlCreateElement2.appendChild(xmlDocument.createTextNode(C14057f9.m66588k4(this.f16733x1, (String) null, (InterfaceC14073kp) null)));
            c13981tlCreateElement.appendChild(c13981tlCreateElement2);
        }
        return c13981tlCreateElement;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m23883k4() {
        return this.f16732kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m23884k4(int i) {
        if (i <= 0) {
            throw new ArgumentOutOfRangeException("value", "The key size should be a non negative integer.");
        }
        this.f16733x1 = i;
        this.f16731k4 = null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m23885k4(C13981tl c13981tl) {
        if (c13981tl == null) {
            throw new ArgumentNullException("value");
        }
        C13950o3 c13950o3 = new C13950o3(c13981tl.getOwnerDocument().getNameTable());
        c13950o3.mo65707k4("enc", "http://www.w3.org/2001/04/xmlenc#");
        this.f16732kk = C5934he.m23994kk(c13981tl, "Algorithm", "http://www.w3.org/2001/04/xmlenc#");
        AbstractC13901ga abstractC13901gaSelectSingleNode = c13981tl.selectSingleNode("enc:KeySize", c13950o3);
        if (abstractC13901gaSelectSingleNode != null) {
            m23884k4(C14080ne.m67001m9(C5934he.m23978k4(abstractC13901gaSelectSingleNode.getInnerText()), (InterfaceC14073kp) null));
        }
        this.f16731k4 = c13981tl;
    }
}
