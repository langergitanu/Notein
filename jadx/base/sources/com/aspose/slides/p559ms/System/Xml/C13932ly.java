package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.exceptions.ArgumentException;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.ly */
/* JADX INFO: loaded from: classes5.dex */
public class C13932ly extends AbstractC13901ga {

    /* JADX INFO: renamed from: k4 */
    private AbstractC14007wt f46643k4;

    public C13932ly(XmlDocument xmlDocument) {
        if (xmlDocument == null) {
            throw new ArgumentException(C13968ri.m65818k4("Cannot create a node without an owner document."));
        }
        this.parentNode = xmlDocument;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public boolean canInsertAfter(AbstractC13901ga abstractC13901ga, AbstractC13901ga abstractC13901ga2) {
        if (abstractC13901ga.getNodeType() == 17) {
            return abstractC13901ga2 == null && getLastNode() == null;
        }
        return true;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public boolean canInsertBefore(AbstractC13901ga abstractC13901ga, AbstractC13901ga abstractC13901ga2) {
        return abstractC13901ga.getNodeType() != 17 || abstractC13901ga2 == null || abstractC13901ga2 == getFirstChild();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public AbstractC13901ga cloneNode(boolean z) {
        XmlDocument ownerDocument = getOwnerDocument();
        C13932ly c13932lyCreateDocumentFragment = ownerDocument.createDocumentFragment();
        if (z) {
            c13932lyCreateDocumentFragment.copyChildren(ownerDocument, this, z);
        }
        return c13932lyCreateDocumentFragment;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getInnerXml() {
        return super.getInnerXml();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public AbstractC14007wt getLastNode() {
        return this.f46643k4;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getLocalName() {
        return getOwnerDocument().strDocumentFragmentName;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getName() {
        return getOwnerDocument().strDocumentFragmentName;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public int getNodeType() {
        return 11;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public XmlDocument getOwnerDocument() {
        return (XmlDocument) this.parentNode;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public AbstractC13901ga getParentNode() {
        return null;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public int getXPNodeType() {
        return 0;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public boolean isContainer() {
        return true;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public boolean isValidChildType(int i) {
        if (i != 1) {
            if (i == 17) {
                AbstractC13901ga firstChild = getFirstChild();
                if (firstChild != null && firstChild.getNodeType() == 17) {
                    return false;
                }
            } else if (i != 3 && i != 4 && i != 5 && i != 7 && i != 8 && i != 13 && i != 14) {
                return false;
            }
        }
        return true;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void setInnerXml(String str) {
        removeAll();
        new C13987tw().m66215k4(this, str, 1);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void setLastNode(AbstractC14007wt abstractC14007wt) {
        this.f46643k4 = abstractC14007wt;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void writeContentTo(AbstractC13958qb abstractC13958qb) {
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            ((AbstractC13901ga) it.next()).writeTo(abstractC13958qb);
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void writeTo(AbstractC13958qb abstractC13958qb) {
        writeContentTo(abstractC13958qb);
    }
}
