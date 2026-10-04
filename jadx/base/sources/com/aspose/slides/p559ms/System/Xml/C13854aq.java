package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.aq */
/* JADX INFO: loaded from: classes5.dex */
public class C13854aq extends AbstractC14003vw {
    public C13854aq(String str) {
        this(str, null);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public AbstractC13901ga cloneNode(boolean z) {
        return getOwnerDocument().createTextNode(m66283kk());
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getLocalName() {
        return getOwnerDocument().strTextName;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getName() {
        return getOwnerDocument().strTextName;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public int getNodeType() {
        return 3;
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

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC14003vw, com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getValue() {
        return m66283kk();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public int getXPNodeType() {
        return 4;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public boolean isText() {
        return true;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC14003vw, com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void setValue(String str) {
        C13967r9 c13967r9;
        m66281k4(str);
        AbstractC13901ga abstractC13901ga = this.parentNode;
        if (abstractC13901ga == null || abstractC13901ga.getNodeType() != 2 || (c13967r9 = (C13967r9) C7019kk.m27452k4((Object) abstractC13901ga, C13967r9.class)) == null || c13967r9.mo65622du()) {
            return;
        }
        c13967r9.m65817k4(true);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void writeContentTo(AbstractC13958qb abstractC13958qb) {
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void writeTo(AbstractC13958qb abstractC13958qb) {
        abstractC13958qb.mo21918x1(m66283kk());
    }

    public C13854aq(String str, XmlDocument xmlDocument) {
        super(str, xmlDocument);
    }
}
