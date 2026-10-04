package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.ze */
/* JADX INFO: loaded from: classes5.dex */
public class C14037ze extends AbstractC13901ga {

    /* JADX INFO: renamed from: k4 */
    private String f47156k4;

    /* JADX INFO: renamed from: kk */
    private String f47157kk;

    /* JADX INFO: renamed from: x1 */
    private String f47158x1;

    public C14037ze(String str, String str2, String str3, XmlDocument xmlDocument) {
        super(xmlDocument);
        this.f47157kk = xmlDocument.getNameTable().mo65266k4(str);
        this.f47156k4 = str2;
        this.f47158x1 = str3;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public AbstractC13901ga cloneNode(boolean z) {
        throw new InvalidOperationException(C13968ri.m65818k4("'Entity' and 'Notation' nodes cannot be cloned."));
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getInnerXml() {
        return C14113y2.f47374k4;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getLocalName() {
        return this.f47157kk;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getName() {
        return this.f47157kk;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public int getNodeType() {
        return 12;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getOuterXml() {
        return C14113y2.f47374k4;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public boolean isReadOnly() {
        return true;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void setInnerXml(String str) {
        throw new InvalidOperationException(C13968ri.m65818k4("Cannot set the 'InnerXml' for the current node because it is either read-only or cannot have children."));
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void writeContentTo(AbstractC13958qb abstractC13958qb) {
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void writeTo(AbstractC13958qb abstractC13958qb) {
    }
}
