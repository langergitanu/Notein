package com.aspose.slides.internal.p238kt;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;

/* JADX INFO: renamed from: com.aspose.slides.internal.kt.wy */
/* JADX INFO: loaded from: classes.dex */
public final class C5974wy {

    /* JADX INFO: renamed from: k4 */
    private String f16863k4;

    /* JADX INFO: renamed from: kk */
    private C13981tl f16864kk;

    /* JADX INFO: renamed from: to */
    private C13981tl f16865to = null;

    /* JADX INFO: renamed from: x1 */
    private String f16866x1;

    /* JADX INFO: renamed from: k4 */
    public final C13981tl m24135k4(XmlDocument xmlDocument) {
        return (C13981tl) C7019kk.m27452k4((Object) xmlDocument.importNode(this.f16864kk, true), C13981tl.class);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24136k4(C13981tl c13981tl) {
        if (c13981tl == null) {
            throw new ArgumentNullException("value");
        }
        if (!"EncryptionProperty".equals(c13981tl.getLocalName()) || !"http://www.w3.org/2001/04/xmlenc#".equals(c13981tl.getNamespaceURI())) {
            throw new CryptographicException("Malformed encryption property element.");
        }
        this.f16865to = c13981tl;
        this.f16866x1 = C5934he.m23994kk(c13981tl, "Id", "http://www.w3.org/2001/04/xmlenc#");
        this.f16863k4 = C5934he.m23994kk(c13981tl, "Target", "http://www.w3.org/2001/04/xmlenc#");
        this.f16864kk = c13981tl;
    }
}
