package com.aspose.slides.p559ms.System.Xml;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.zm */
/* JADX INFO: loaded from: classes5.dex */
public class C14040zm extends AbstractC14003vw {
    public C14040zm(String str, XmlDocument xmlDocument) {
        super(str, xmlDocument);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public AbstractC13901ga cloneNode(boolean z) {
        return getOwnerDocument().createCDataSection(m66283kk());
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getLocalName() {
        return getOwnerDocument().strCDataSectionName;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getName() {
        return getOwnerDocument().strCDataSectionName;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public int getNodeType() {
        return 4;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public AbstractC13901ga getParentNode() {
        int nodeType = this.parentNode.getNodeType();
        if (nodeType != 3 && nodeType != 4) {
            if (nodeType == 9) {
                return null;
            }
            if (nodeType != 13 && nodeType != 14) {
                return this.parentNode;
            }
        }
        AbstractC13901ga abstractC13901ga = this.parentNode;
        do {
            abstractC13901ga = abstractC13901ga.parentNode;
        } while (abstractC13901ga.isText());
        return abstractC13901ga;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public AbstractC13901ga getPreviousText() {
        if (this.parentNode.isText()) {
            return this.parentNode;
        }
        return null;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public int getXPNodeType() {
        return 4;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public boolean isText() {
        return true;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void writeContentTo(AbstractC13958qb abstractC13958qb) {
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void writeTo(AbstractC13958qb abstractC13958qb) {
        abstractC13958qb.mo21894du(m66283kk());
    }
}
