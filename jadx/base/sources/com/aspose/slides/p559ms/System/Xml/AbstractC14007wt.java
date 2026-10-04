package com.aspose.slides.p559ms.System.Xml;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.wt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14007wt extends AbstractC13901ga {

    /* JADX INFO: renamed from: x1 */
    public AbstractC14007wt f47053x1;

    public AbstractC14007wt() {
        this.f47053x1 = null;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public AbstractC13901ga getNextSibling() {
        AbstractC13901ga parentNode = getParentNode();
        if (parentNode == null || this.f47053x1 == parentNode.getFirstChild()) {
            return null;
        }
        return this.f47053x1;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public AbstractC13901ga getPreviousSibling() {
        AbstractC13901ga parentNode = getParentNode();
        if (parentNode == null) {
            return null;
        }
        AbstractC13901ga firstChild = parentNode.getFirstChild();
        while (firstChild != null) {
            AbstractC13901ga nextSibling = firstChild.getNextSibling();
            if (nextSibling == this) {
                break;
            }
            firstChild = nextSibling;
        }
        return firstChild;
    }

    public AbstractC14007wt(XmlDocument xmlDocument) {
        super(xmlDocument);
        this.f47053x1 = null;
    }
}
