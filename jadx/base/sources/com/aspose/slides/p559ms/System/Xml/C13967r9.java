package com.aspose.slides.p559ms.System.Xml;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.r9 */
/* JADX INFO: loaded from: classes5.dex */
public class C13967r9 extends C13940my {

    /* JADX INFO: renamed from: k4 */
    private boolean f46802k4;

    public C13967r9(String str, String str2, String str3, XmlDocument xmlDocument) {
        super(str, str2, str3, xmlDocument);
        this.f46802k4 = false;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13940my, com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public AbstractC13901ga appendChild(AbstractC13901ga abstractC13901ga) {
        AbstractC13901ga abstractC13901gaAppendChild = super.appendChild(abstractC13901ga);
        this.f46802k4 = true;
        return abstractC13901gaAppendChild;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13940my, com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public AbstractC13901ga cloneNode(boolean z) {
        XmlDocument ownerDocument = getOwnerDocument();
        C13967r9 c13967r9 = (C13967r9) ownerDocument.createDefaultAttribute(getPrefix(), getLocalName(), getNamespaceURI());
        c13967r9.copyChildren(ownerDocument, this, true);
        c13967r9.f46802k4 = true;
        return c13967r9;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13940my
    /* JADX INFO: renamed from: du */
    public boolean mo65622du() {
        return this.f46802k4;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13940my, com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public AbstractC13901ga insertAfter(AbstractC13901ga abstractC13901ga, AbstractC13901ga abstractC13901ga2) {
        AbstractC13901ga abstractC13901gaInsertAfter = super.insertAfter(abstractC13901ga, abstractC13901ga2);
        this.f46802k4 = true;
        return abstractC13901gaInsertAfter;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13940my, com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public AbstractC13901ga insertBefore(AbstractC13901ga abstractC13901ga, AbstractC13901ga abstractC13901ga2) {
        AbstractC13901ga abstractC13901gaInsertBefore = super.insertBefore(abstractC13901ga, abstractC13901ga2);
        this.f46802k4 = true;
        return abstractC13901gaInsertBefore;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m65817k4(boolean z) {
        this.f46802k4 = z;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13940my, com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public AbstractC13901ga removeChild(AbstractC13901ga abstractC13901ga) {
        AbstractC13901ga abstractC13901gaRemoveChild = super.removeChild(abstractC13901ga);
        this.f46802k4 = true;
        return abstractC13901gaRemoveChild;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13940my, com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public AbstractC13901ga replaceChild(AbstractC13901ga abstractC13901ga, AbstractC13901ga abstractC13901ga2) {
        AbstractC13901ga abstractC13901gaReplaceChild = super.replaceChild(abstractC13901ga, abstractC13901ga2);
        this.f46802k4 = true;
        return abstractC13901gaReplaceChild;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13940my, com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void setInnerText(String str) {
        super.setInnerText(str);
        this.f46802k4 = true;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13940my, com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void writeTo(AbstractC13958qb abstractC13958qb) {
        if (this.f46802k4) {
            super.writeTo(abstractC13958qb);
        }
    }
}
