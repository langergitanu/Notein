package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.exceptions.ArgumentException;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.mt */
/* JADX INFO: loaded from: classes5.dex */
public class C13939mt extends AbstractC14003vw {
    public C13939mt(String str, XmlDocument xmlDocument) {
        super(str, xmlDocument);
        if (!xmlDocument.isLoading() && !m66284x1(str)) {
            throw new ArgumentException(C13968ri.m65818k4("The string for white space contains an invalid character."));
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public AbstractC13901ga cloneNode(boolean z) {
        return getOwnerDocument().createWhitespace(m66283kk());
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getLocalName() {
        return getOwnerDocument().strNonSignificantWhitespaceName;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getName() {
        return getOwnerDocument().strNonSignificantWhitespaceName;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public int getNodeType() {
        return 13;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public AbstractC13901ga getParentNode() {
        int nodeType = this.parentNode.getNodeType();
        if (nodeType != 3 && nodeType != 4) {
            if (nodeType == 9) {
                return super.getParentNode();
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

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC14003vw, com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getValue() {
        return m66283kk();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public int getXPNodeType() {
        int[] iArr = {6};
        m66282k4(this, iArr);
        return iArr[0];
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public boolean isText() {
        return true;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC14003vw, com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void setValue(String str) {
        if (!m66284x1(str)) {
            throw new ArgumentException(C13968ri.m65818k4("The string for white space contains an invalid character."));
        }
        m66281k4(str);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void writeContentTo(AbstractC13958qb abstractC13958qb) {
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void writeTo(AbstractC13958qb abstractC13958qb) {
        abstractC13958qb.mo21913m9(m66283kk());
    }
}
