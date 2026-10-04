package com.aspose.slides.internal.p238kt;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;

/* JADX INFO: renamed from: com.aspose.slides.internal.kt.sv */
/* JADX INFO: loaded from: classes.dex */
public class C5959sv extends AbstractC5917bz {

    /* JADX INFO: renamed from: k4 */
    private C13981tl f16849k4;

    @Override // com.aspose.slides.internal.p238kt.AbstractC5917bz
    /* JADX INFO: renamed from: k4 */
    public C13981tl mo23902k4(XmlDocument xmlDocument) {
        return (C13981tl) C7019kk.m27452k4((Object) xmlDocument.importNode(this.f16849k4, true), C13981tl.class);
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
    public void mo23903k4(C13981tl c13981tl) {
        this.f16849k4 = c13981tl;
    }
}
