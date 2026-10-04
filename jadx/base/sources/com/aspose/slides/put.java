package com.aspose.slides;

import com.aspose.slides.p559ms.System.Xml.C13938ms;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import com.aspose.slides.p559ms.System.Xml.C14015xb;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;

/* JADX INFO: loaded from: classes3.dex */
class put {
    /* JADX INFO: renamed from: k4 */
    public static com.aspose.slides.internal.p332p7.rx0 m69256k4(String str) {
        new bjs(new gnb(null, InterruptionToken.getNone()), null);
        XmlDocument xmlDocument = new XmlDocument();
        xmlDocument.createElement("par");
        C13981tl c13981tlCreateElement = xmlDocument.createElement("par");
        c13981tlCreateElement.m65910kk("xmlns:p", "http://schemas.openxmlformats.org/presentationml/2006/main");
        c13981tlCreateElement.m65910kk("xmlns:a", "http://schemas.openxmlformats.org/drawingml/2006/main");
        c13981tlCreateElement.setInnerXml(str);
        C13938ms c13938ms = new C13938ms(c13981tlCreateElement.getOuterXml(), 1, (C14015xb) null);
        c13938ms.mo65026h4();
        return new com.aspose.slides.internal.p332p7.rx0(c13938ms);
    }
}
