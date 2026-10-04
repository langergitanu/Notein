package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.ph */
/* JADX INFO: loaded from: classes5.dex */
public class C13954ph extends AbstractC14007wt {

    /* JADX INFO: renamed from: k4 */
    private String f46701k4;

    /* JADX INFO: renamed from: kk */
    private String f46702kk;

    public C13954ph(String str, String str2, XmlDocument xmlDocument) {
        super(xmlDocument);
        this.f46701k4 = str;
        this.f46702kk = str2;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public AbstractC13901ga cloneNode(boolean z) {
        return getOwnerDocument().createProcessingInstruction(this.f46701k4, this.f46702kk);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getInnerText() {
        return this.f46702kk;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getLocalName() {
        return getName();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getName() {
        String str = this.f46701k4;
        return str != null ? str : C14113y2.f47374k4;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public int getNodeType() {
        return 7;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getValue() {
        return this.f46702kk;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getXPLocalName() {
        return getName();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public int getXPNodeType() {
        return 7;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m65717k4(String str) {
        AbstractC13901ga parentNode = getParentNode();
        C13979sz eventArgs = getEventArgs(this, parentNode, parentNode, this.f46702kk, str, 2);
        if (eventArgs != null) {
            beforeEvent(eventArgs);
        }
        this.f46702kk = str;
        if (eventArgs != null) {
            afterEvent(eventArgs);
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void setInnerText(String str) {
        m65717k4(str);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void setValue(String str) {
        m65717k4(str);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void writeContentTo(AbstractC13958qb abstractC13958qb) {
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void writeTo(AbstractC13958qb abstractC13958qb) {
        abstractC13958qb.mo21907k4(this.f46701k4, this.f46702kk);
    }
}
