package com.aspose.slides.p559ms.System.Xml;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.qk */
/* JADX INFO: loaded from: classes5.dex */
public class C13959qk extends AbstractC14003vw {
    public C13959qk(String str, XmlDocument xmlDocument) {
        super(str, xmlDocument);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public AbstractC13901ga cloneNode(boolean z) {
        return getOwnerDocument().createComment(m66283kk());
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getLocalName() {
        return getOwnerDocument().strCommentName;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getName() {
        return getOwnerDocument().strCommentName;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public int getNodeType() {
        return 8;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public int getXPNodeType() {
        return 8;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void writeContentTo(AbstractC13958qb abstractC13958qb) {
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void writeTo(AbstractC13958qb abstractC13958qb) {
        abstractC13958qb.mo21897h4(m66283kk());
    }
}
